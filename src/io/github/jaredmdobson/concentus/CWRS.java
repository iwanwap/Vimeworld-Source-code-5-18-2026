/*
 * Decompiled with CFR 0.152.
 */
package io.github.jaredmdobson.concentus;

import io.github.jaredmdobson.concentus.CeltTables;
import io.github.jaredmdobson.concentus.EntropyCoder;
import io.github.jaredmdobson.concentus.Inlines;

class CWRS {
    static final int[] CELT_PVQ_U_ROW = new int[]{0, 176, 351, 525, 698, 870, 1041, 1131, 1178, 1207, 1226, 1240, 1248, 1254, 1257};

    CWRS() {
    }

    private static long CELT_PVQ_U(int _n, int _k) {
        return CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[Inlines.IMIN(_n, _k)] + Inlines.IMAX(_n, _k)];
    }

    private static long CELT_PVQ_V(int _n, int _k) {
        return CWRS.CELT_PVQ_U(_n, _k) + CWRS.CELT_PVQ_U(_n, _k + 1);
    }

    static long icwrs(int _n, int[] _y) {
        Inlines.OpusAssert(_n >= 2);
        int j2 = _n - 1;
        long i2 = _y[j2] < 0 ? 1L : 0L;
        int k2 = Inlines.abs(_y[j2]);
        do {
            i2 += CWRS.CELT_PVQ_U(_n - --j2, k2);
            k2 += Inlines.abs(_y[j2]);
            if (_y[j2] >= 0) continue;
            i2 += CWRS.CELT_PVQ_U(_n - j2, k2 + 1);
        } while (j2 > 0);
        return i2;
    }

    static void encode_pulses(int[] _y, int _n, int _k, EntropyCoder _enc) {
        Inlines.OpusAssert(_k > 0);
        _enc.enc_uint(CWRS.icwrs(_n, _y), CWRS.CELT_PVQ_V(_n, _k));
    }

    static int cwrsi(int _n, int _k, long _i, int[] _y) {
        short val;
        int k0;
        int s2;
        long p2;
        int yy2 = 0;
        int y_ptr = 0;
        Inlines.OpusAssert(_k > 0);
        Inlines.OpusAssert(_n > 1);
        while (_n > 2) {
            long q2;
            if (_k >= _n) {
                int row = CELT_PVQ_U_ROW[_n];
                p2 = CeltTables.CELT_PVQ_U_DATA[row + _k + 1];
                s2 = 0 - (_i >= p2 ? 1 : 0);
                k0 = _k;
                q2 = CeltTables.CELT_PVQ_U_DATA[row + _n];
                if (q2 > (_i -= Inlines.CapToUInt32(p2 & (long)s2))) {
                    Inlines.OpusAssert(p2 > q2);
                    _k = _n;
                    while ((p2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[--_k] + _n]) > _i) {
                    }
                } else {
                    p2 = CeltTables.CELT_PVQ_U_DATA[row + _k];
                    while (p2 > _i) {
                        p2 = CeltTables.CELT_PVQ_U_DATA[row + --_k];
                    }
                }
                _i -= p2;
                val = (short)(k0 - _k + s2 ^ s2);
                _y[y_ptr++] = val;
                yy2 = Inlines.MAC16_16(yy2, val, val);
            } else {
                p2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[_k] + _n];
                q2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[_k + 1] + _n];
                if (p2 <= _i && _i < q2) {
                    _i -= p2;
                    _y[y_ptr++] = 0;
                } else {
                    s2 = 0 - (_i >= q2 ? 1 : 0);
                    _i -= Inlines.CapToUInt32(q2 & (long)s2);
                    k0 = _k;
                    while ((p2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[--_k] + _n]) > _i) {
                    }
                    _i -= p2;
                    val = (short)(k0 - _k + s2 ^ s2);
                    _y[y_ptr++] = val;
                    yy2 = Inlines.MAC16_16(yy2, val, val);
                }
            }
            --_n;
        }
        p2 = 2L * (long)_k + 1L;
        s2 = 0 - (_i >= p2 ? 1 : 0);
        k0 = _k;
        _k = (int)((_i -= Inlines.CapToUInt32(p2 & (long)s2)) + 1L >> 1);
        if (_k != 0) {
            _i -= 2L * (long)_k - 1L;
        }
        val = (short)(k0 - _k + s2 ^ s2);
        _y[y_ptr++] = val;
        yy2 = Inlines.MAC16_16(yy2, val, val);
        s2 = -((int)_i);
        val = (short)(_k + s2 ^ s2);
        _y[y_ptr] = val;
        yy2 = Inlines.MAC16_16(yy2, val, val);
        return yy2;
    }

    static int decode_pulses(int[] _y, int _n, int _k, EntropyCoder _dec) {
        return CWRS.cwrsi(_n, _k, _dec.dec_uint(CWRS.CELT_PVQ_V(_n, _k)), _y);
    }
}

