/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.BoxedValueInt;
import io.github.jaredmdobson.concentus.CeltMode;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;

class Rate {
    private static final byte[] LOG2_FRAC_TABLE = new byte[]{0, 8, 13, 16, 19, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 32, 33, 34, 34, 35, 36, 36, 37, 37};
    private static final int ALLOC_STEPS = 6;

    Rate() {
    }

    static int get_pulses(int i2) {
        return i2 < 8 ? i2 : 8 + (i2 & 7) << (i2 >> 3) - 1;
    }

    static int bits2pulses(CeltMode m2, int band, int LM2, int bits) {
        short[] cache = m2.cache.bits;
        short cache_ptr = m2.cache.index[++LM2 * m2.nbEBands + band];
        int lo2 = 0;
        int hi2 = cache[cache_ptr];
        --bits;
        for (int i2 = 0; i2 < 6; ++i2) {
            int mid = lo2 + hi2 + 1 >> 1;
            if (cache[cache_ptr + mid] >= bits) {
                hi2 = mid;
                continue;
            }
            lo2 = mid;
        }
        if (bits - (lo2 == 0 ? -1 : cache[cache_ptr + lo2]) <= cache[cache_ptr + hi2] - bits) {
            return lo2;
        }
        return hi2;
    }

    static int pulses2bits(CeltMode m2, int band, int LM2, int pulses) {
        return pulses == 0 ? 0 : m2.cache.bits[m2.cache.index[++LM2 * m2.nbEBands + band] + pulses] + 1;
    }

    static int interp_bits2pulses(CeltMode m2, int start, int end, int skip_start, int[] bits1, int[] bits2, int[] thresh, int[] cap, int total, BoxedValueInt _balance, int skip_rsv, BoxedValueInt intensity, int intensity_rsv, BoxedValueInt dual_stereo, int dual_stereo_rsv, int[] bits, int[] ebits, int[] fine_priority, int C2, int LM2, EntropyCoder ec2, int encode, int prev, int signalBandwidth) {
        int percoeff;
        int left;
        int tmp;
        int j2;
        boolean done;
        int psum;
        int codedBands = -1;
        int alloc_floor = C2 << 3;
        int stereo = C2 > 1 ? 1 : 0;
        int logM = LM2 << 3;
        int lo2 = 0;
        int hi2 = 64;
        for (int i2 = 0; i2 < 6; ++i2) {
            int mid = lo2 + hi2 >> 1;
            psum = 0;
            done = false;
            j2 = end;
            while (j2-- > start) {
                int tmp2 = bits1[j2] + (mid * bits2[j2] >> 6);
                if (tmp2 >= thresh[j2] || done) {
                    done = true;
                    psum += Inlines.IMIN(tmp2, cap[j2]);
                    continue;
                }
                if (tmp2 < alloc_floor) continue;
                psum += alloc_floor;
            }
            if (psum > total) {
                hi2 = mid;
                continue;
            }
            lo2 = mid;
        }
        psum = 0;
        done = false;
        j2 = end;
        while (j2-- > start) {
            tmp = bits1[j2] + (lo2 * bits2[j2] >> 6);
            if (tmp < thresh[j2] && !done) {
                tmp = tmp >= alloc_floor ? alloc_floor : 0;
            } else {
                done = true;
            }
            bits[j2] = tmp = Inlines.IMIN(tmp, cap[j2]);
            psum += tmp;
        }
        codedBands = end;
        while (true) {
            int rem;
            int band_width;
            if ((j2 = codedBands - 1) <= skip_start) {
                total += skip_rsv;
                break;
            }
            left = total - psum;
            percoeff = Inlines.celt_udiv(left, m2.eBands[codedBands] - m2.eBands[start]);
            int band_bits = bits[j2] + percoeff * (band_width = m2.eBands[codedBands] - m2.eBands[j2]) + (rem = Inlines.IMAX((left -= (m2.eBands[codedBands] - m2.eBands[start]) * percoeff) - (m2.eBands[j2] - m2.eBands[start]), 0));
            if (band_bits >= Inlines.IMAX(thresh[j2], alloc_floor + 8)) {
                if (encode != 0) {
                    if (codedBands <= start + 2 || band_bits > (j2 < prev ? 7 : 9) * band_width << LM2 << 3 >> 4 && j2 <= signalBandwidth) {
                        ec2.enc_bit_logp(1, 1);
                        break;
                    }
                    ec2.enc_bit_logp(0, 1);
                } else if (ec2.dec_bit_logp(1L) != 0) break;
                psum += 8;
                band_bits -= 8;
            }
            psum -= bits[j2] + intensity_rsv;
            if (intensity_rsv > 0) {
                intensity_rsv = LOG2_FRAC_TABLE[j2 - start];
            }
            psum += intensity_rsv;
            if (band_bits >= alloc_floor) {
                psum += alloc_floor;
                bits[j2] = alloc_floor;
            } else {
                bits[j2] = 0;
            }
            --codedBands;
        }
        Inlines.OpusAssert(codedBands > start);
        if (intensity_rsv > 0) {
            if (encode != 0) {
                intensity.Val = Inlines.IMIN(intensity.Val, codedBands);
                ec2.enc_uint(intensity.Val - start, codedBands + 1 - start);
            } else {
                intensity.Val = start + (int)ec2.dec_uint(codedBands + 1 - start);
            }
        } else {
            intensity.Val = 0;
        }
        if (intensity.Val <= start) {
            total += dual_stereo_rsv;
            dual_stereo_rsv = 0;
        }
        if (dual_stereo_rsv > 0) {
            if (encode != 0) {
                ec2.enc_bit_logp(dual_stereo.Val, 1);
            } else {
                dual_stereo.Val = ec2.dec_bit_logp(1L);
            }
        } else {
            dual_stereo.Val = 0;
        }
        left = total - psum;
        percoeff = Inlines.celt_udiv(left, m2.eBands[codedBands] - m2.eBands[start]);
        left -= (m2.eBands[codedBands] - m2.eBands[start]) * percoeff;
        for (j2 = start; j2 < codedBands; ++j2) {
            int n2 = j2;
            bits[n2] = bits[n2] + percoeff * (m2.eBands[j2 + 1] - m2.eBands[j2]);
        }
        j2 = start;
        while (j2 < codedBands) {
            tmp = Inlines.IMIN(left, m2.eBands[j2 + 1] - m2.eBands[j2]);
            int n3 = j2++;
            bits[n3] = bits[n3] + tmp;
            left -= tmp;
        }
        int balance = 0;
        for (j2 = start; j2 < codedBands; ++j2) {
            int excess;
            Inlines.OpusAssert(bits[j2] >= 0);
            int N0 = m2.eBands[j2 + 1] - m2.eBands[j2];
            int N2 = N0 << LM2;
            int bit = bits[j2] + balance;
            if (N2 > 1) {
                excess = Inlines.MAX32(bit - cap[j2], 0);
                bits[j2] = bit - excess;
                int den = C2 * N2 + (C2 == 2 && N2 > 2 && dual_stereo.Val == 0 && j2 < intensity.Val ? 1 : 0);
                int NClogN = den * (m2.logN[j2] + logM);
                int offset = (NClogN >> 1) - den * 21;
                if (N2 == 2) {
                    offset += den << 3 >> 2;
                }
                if (bits[j2] + offset < den * 2 << 3) {
                    offset += NClogN >> 2;
                } else if (bits[j2] + offset < den * 3 << 3) {
                    offset += NClogN >> 3;
                }
                ebits[j2] = Inlines.IMAX(0, bits[j2] + offset + (den << 2));
                ebits[j2] = Inlines.celt_udiv(ebits[j2], den) >> 3;
                if (C2 * ebits[j2] > bits[j2] >> 3) {
                    ebits[j2] = bits[j2] >> stereo >> 3;
                }
                ebits[j2] = Inlines.IMIN(ebits[j2], 8);
                fine_priority[j2] = ebits[j2] * (den << 3) >= bits[j2] + offset ? 1 : 0;
                int n4 = j2;
                bits[n4] = bits[n4] - (C2 * ebits[j2] << 3);
            } else {
                excess = Inlines.MAX32(0, bit - (C2 << 3));
                bits[j2] = bit - excess;
                ebits[j2] = 0;
                fine_priority[j2] = 1;
            }
            if (excess > 0) {
                int extra_fine = Inlines.IMIN(excess >> stereo + 3, 8 - ebits[j2]);
                int n5 = j2;
                ebits[n5] = ebits[n5] + extra_fine;
                int extra_bits = extra_fine * C2 << 3;
                fine_priority[j2] = extra_bits >= excess - balance ? 1 : 0;
                excess -= extra_bits;
            }
            balance = excess;
            Inlines.OpusAssert(bits[j2] >= 0);
            Inlines.OpusAssert(ebits[j2] >= 0);
        }
        _balance.Val = balance;
        while (j2 < end) {
            ebits[j2] = bits[j2] >> stereo >> 3;
            Inlines.OpusAssert(C2 * ebits[j2] << 3 == bits[j2]);
            bits[j2] = 0;
            fine_priority[j2] = ebits[j2] < 1 ? 1 : 0;
            ++j2;
        }
        return codedBands;
    }

    static int compute_allocation(CeltMode m2, int start, int end, int[] offsets, int[] cap, int alloc_trim, BoxedValueInt intensity, BoxedValueInt dual_stereo, int total, BoxedValueInt balance, int[] pulses, int[] ebits, int[] fine_priority, int C2, int LM2, EntropyCoder ec2, int encode, int prev, int signalBandwidth) {
        int j2;
        total = Inlines.IMAX(total, 0);
        int len = m2.nbEBands;
        int skip_start = start;
        int skip_rsv = total >= 8 ? 8 : 0;
        total -= skip_rsv;
        int dual_stereo_rsv = 0;
        int intensity_rsv = 0;
        if (C2 == 2) {
            intensity_rsv = LOG2_FRAC_TABLE[end - start];
            if (intensity_rsv > total) {
                intensity_rsv = 0;
            } else {
                dual_stereo_rsv = (total -= intensity_rsv) >= 8 ? 8 : 0;
                total -= dual_stereo_rsv;
            }
        }
        int[] bits1 = new int[len];
        int[] bits2 = new int[len];
        int[] thresh = new int[len];
        int[] trim_offset = new int[len];
        for (j2 = start; j2 < end; ++j2) {
            thresh[j2] = Inlines.IMAX(C2 << 3, 3 * (m2.eBands[j2 + 1] - m2.eBands[j2]) << LM2 << 3 >> 4);
            trim_offset[j2] = C2 * (m2.eBands[j2 + 1] - m2.eBands[j2]) * (alloc_trim - 5 - LM2) * (end - j2 - 1) * (1 << LM2 + 3) >> 6;
            if (m2.eBands[j2 + 1] - m2.eBands[j2] << LM2 != 1) continue;
            int n2 = j2;
            trim_offset[n2] = trim_offset[n2] - (C2 << 3);
        }
        int lo2 = 1;
        int hi2 = m2.nbAllocVectors - 1;
        do {
            boolean done = false;
            int psum = 0;
            int mid = lo2 + hi2 >> 1;
            j2 = end;
            while (j2-- > start) {
                int N2 = m2.eBands[j2 + 1] - m2.eBands[j2];
                int bitsj = C2 * N2 * m2.allocVectors[mid * len + j2] << LM2 >> 2;
                if (bitsj > 0) {
                    bitsj = Inlines.IMAX(0, bitsj + trim_offset[j2]);
                }
                if ((bitsj += offsets[j2]) >= thresh[j2] || done) {
                    done = true;
                    psum += Inlines.IMIN(bitsj, cap[j2]);
                    continue;
                }
                if (bitsj < C2 << 3) continue;
                psum += C2 << 3;
            }
            if (psum > total) {
                hi2 = mid - 1;
                continue;
            }
            lo2 = mid + 1;
        } while (lo2 <= hi2);
        hi2 = lo2--;
        for (j2 = start; j2 < end; ++j2) {
            int bits2j;
            int N3 = m2.eBands[j2 + 1] - m2.eBands[j2];
            int bits1j = C2 * N3 * m2.allocVectors[lo2 * len + j2] << LM2 >> 2;
            int n3 = bits2j = hi2 >= m2.nbAllocVectors ? cap[j2] : C2 * N3 * m2.allocVectors[hi2 * len + j2] << LM2 >> 2;
            if (bits1j > 0) {
                bits1j = Inlines.IMAX(0, bits1j + trim_offset[j2]);
            }
            if (bits2j > 0) {
                bits2j = Inlines.IMAX(0, bits2j + trim_offset[j2]);
            }
            if (lo2 > 0) {
                bits1j += offsets[j2];
            }
            bits2j += offsets[j2];
            if (offsets[j2] > 0) {
                skip_start = j2;
            }
            bits2j = Inlines.IMAX(0, bits2j - bits1j);
            bits1[j2] = bits1j;
            bits2[j2] = bits2j;
        }
        int codedBands = Rate.interp_bits2pulses(m2, start, end, skip_start, bits1, bits2, thresh, cap, total, balance, skip_rsv, intensity, intensity_rsv, dual_stereo, dual_stereo_rsv, pulses, ebits, fine_priority, C2, LM2, ec2, encode, prev, signalBandwidth);
        return codedBands;
    }
}

