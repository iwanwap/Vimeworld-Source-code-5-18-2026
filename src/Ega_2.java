/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bb
 *  Ega
 *  HA
 *  JPa
 *  JQa
 *  Mda
 *  Oz
 *  eAa
 *  kea
 *  pua
 *  uY
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Ega_2 {
    private final Set<sEa> m;
    public List<Mda> C = Lists.newArrayList();
    private int i;
    private short M;
    public int k;
    private Set<Sx> j;
    private int J;
    public List<sEa> A = Lists.newArrayList();
    public List<Bb> I;

    /*
     * Unable to fully structure code
     */
    public boolean J(Mda var1_1, int var2_2, int var3_3, boolean var4_4) {
        block10: {
            block11: {
                block9: {
                    e = var1_1;
                    d = this;
                    var5_5 = uSa.E;
                    var6_6 = c;
                    if (a != false) {
                        var6_6 = b - vRa.d;
                    }
                    if (!e.D()) break block9;
                    while (e.E > 0 && (a == false && var6_6 < b || a != false && var6_6 >= c)) {
                        var7_7 = d.A.get((int)var6_6);
                        var8_8 = var7_7.J();
                        if (var8_8 == null || var8_8.J() != e.J() || e.i() && e.J() != var8_8.J() || !Mda.f((Mda)e, (Mda)var8_8)) ** GOTO lbl26
                        var9_9 = var8_8.E + e.E;
                        if (var9_9 <= e.e()) {
                            e.E = uSa.E;
                            var8_8.E = var9_9;
                            var7_7.J();
                            var5_5 = vRa.d;
                            v0 = a;
                        } else {
                            if (var8_8.E < e.e()) {
                                v1 = e;
                                e.E -= v1.e() - var8_8.E;
                                var8_8.E = v1.e();
                                var7_7.J();
                                var5_5 = vRa.d;
                            }
lbl26:
                            // 4 sources

                            v0 = a;
                        }
                        if (v0 != false) {
                            --var6_6;
                            continue;
                        }
                        ++var6_6;
                    }
                }
                if (e.E <= 0) break block10;
                if (a == false) break block11;
                var6_6 = b - vRa.d;
                v2 = a;
                ** GOTO lbl42
            }
            var6_6 = c;
            while (true) {
                v2 = a;
lbl42:
                // 2 sources

                if ((v2 != false || var6_6 >= b) && (a == false || var6_6 < c)) break;
                var7_7 = d.A.get((int)var6_6);
                var8_8 = var7_7.J();
                if (var8_8 == null) {
                    v3 = var7_7;
                    v3.J(e.J());
                    v3.J();
                    e.E = uSa.E;
                    var5_5 = vRa.d;
                    return (boolean)var5_5;
                }
                if (a != false) {
                    --var6_6;
                    continue;
                }
                ++var6_6;
            }
        }
        return (boolean)var5_5;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(sEa sEa2, Mda mda2, boolean bl2) {
        int n2;
        sEa c2 = mda2;
        sEa b2 = sEa2;
        int n3 = n2 = b2 == null || !b2.J() ? vRa.d : uSa.E;
        if (b2 != null && b2.J() && c2 != null && c2.l(b2.J()) && Mda.f((Mda)b2.J(), (Mda)c2)) {
            void a2;
            n2 |= b2.J().E + (a2 != false ? uSa.E : ((Mda)c2).E) <= c2.e() ? vRa.d : uSa.E;
        }
        return n2 != 0;
    }

    public boolean J(sEa sEa2) {
        sEa b2 = sEa2;
        Ega_2 a2 = this;
        return vRa.d != 0;
    }

    public sEa J(sEa sEa2) {
        Ega_2 a2;
        sEa b2 = sEa2;
        Ega_2 ega_2 = a2 = this;
        b2.I = ega_2.A.size();
        ega_2.A.add(b2);
        ega_2.C.add(null);
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Sx sx2, int n2) {
        void a2;
        Object c2 = sx2;
        Ega_2 b2 = this;
        c2 = b2.A.get((int)a2);
        if (c2 != null) {
            return ((sEa)c2).J();
        }
        return null;
    }

    public boolean f(Sx sx2) {
        Object b2 = sx2;
        Ega_2 a2 = this;
        if (!a2.j.contains(b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public short J(kea kea2) {
        Ega_2 a2;
        Ega_2 b2 = kea2;
        Ega_2 ega_2 = a2 = this;
        ega_2.M = (short)(ega_2.M + vRa.d);
        return ega_2.M;
    }

    public void f(Bb bb2) {
        Ega_2 b2 = bb2;
        Ega_2 a2 = this;
        if (a2.I.contains(b2)) {
            throw new IllegalArgumentException(JQa.ja);
        }
        a2.I.add((Bb)b2);
        Ega_2 ega_2 = a2;
        b2.J((Ega)ega_2, ega_2.J());
        ega_2.J();
    }

    public abstract boolean J(Sx var1);

    public void f() {
        Ega_2 a2;
        a2.J = uSa.E;
        a2.m.clear();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2) {
        void a2;
        Ega_2 ega_2 = this;
        Ega_2 b2 = a2.K;
        if (b2.J() != null) {
            Ega_2 ega_22 = b2;
            a2.J(ega_22.J(), uSa.E != 0);
            ega_22.J((Mda)null);
        }
    }

    public void J() {
        int n2;
        Ega_2 ega_2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ega_2.A.size()) {
            Ega_2 a22 = ega_2.A.get(n2).J();
            Mda mda2 = ega_2.C.get(n2);
            if (!Mda.J((Mda)mda2, (Mda)a22)) {
                mda2 = a22 == null ? null : a22.J();
                ega_2.C.set(n2, mda2);
                int a22 = uSa.E;
                int n4 = a22;
                while (n4 < ega_2.I.size()) {
                    ega_2.I.get(++a22).J((Ega)ega_2, n2, mda2);
                    n4 = a22;
                }
            }
            n3 = ++n2;
        }
    }

    public void J(Bb bb2) {
        Ega_2 b2 = bb2;
        Ega_2 a2 = this;
        a2.I.remove(b2);
    }

    public static int f(int a2) {
        return a2 & yRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Set<sEa> set, int n2, Mda mda2, int n3) {
        void a2;
        void c2;
        Mda d2 = mda2;
        Set<sEa> b2 = set;
        switch (c2) {
            case 0: {
                Mda mda3 = d2;
                while (false) {
                }
                Mda mda4 = mda3;
                mda3.E = Oz.J((float)((float)mda3.E / (float)b2.size()));
                break;
            }
            case 1: {
                Mda mda4 = d2;
                d2.E = vRa.d;
                break;
            }
            case 2: {
                d2.E = d2.J().f();
            }
            default: {
                Mda mda4 = d2;
            }
        }
        mda4.E += a2;
    }

    public static boolean J(int n2, Sx sx2) {
        Sx b2 = sx2;
        int a2 = n2;
        if (a2 == 0) {
            return vRa.d != 0;
        }
        if (a2 == vRa.d) {
            return vRa.d != 0;
        }
        if (a2 == uqa.g && b2.h.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(Sx sx2, int n2) {
        int c2 = n2;
        Ega_2 a2 = this;
        return uSa.E != 0;
    }

    public void J(HA hA2) {
        Ega_2 b2 = hA2;
        Ega_2 a2 = this;
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda[] mdaArray) {
        void a2;
        int b2;
        Ega_2 ega_2 = this;
        int n2 = b2 = uSa.E;
        while (n2 < ((void)a2).length) {
            ega_2.J(b2).J((Mda)a2[b2++]);
            n2 = b2;
        }
    }

    public Ega_2() {
        Ega_2 a2;
        a2.i = pua.o;
        a2.m = Sets.newHashSet();
        a2.I = Lists.newArrayList();
        a2.j = Sets.newHashSet();
    }

    public boolean J(Mda mda2, sEa sEa2) {
        sEa c2 = sEa2;
        Ega_2 a2 = this;
        return vRa.d != 0;
    }

    public List<Mda> J() {
        int a2;
        Ega_2 ega_2 = this;
        ArrayList<Mda> arrayList = Lists.newArrayList();
        int n2 = a2 = uSa.E;
        while (n2 < ega_2.A.size()) {
            sEa sEa2 = ega_2.A.get(a2);
            arrayList.add(sEa2.J());
            n2 = ++a2;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        void b2;
        Ega_2 c2 = mda2;
        Ega_2 a2 = this;
        a2.J((int)b2).J((Mda)c2);
    }

    public static int J(uY a2) {
        if (a2 instanceof HA) {
            return Ega_2.J((HA)a2);
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public sEa J(HA hA2, int n2) {
        int c2;
        Ega_2 ega_2 = this;
        int n3 = c2 = uSa.E;
        while (n3 < ega_2.A.size()) {
            void a2;
            void b2;
            sEa sEa2 = ega_2.A.get(c2);
            if (sEa2.J((HA)b2, (int)a2)) {
                return sEa2;
            }
            n3 = ++c2;
        }
        return null;
    }

    public static int J(HA hA2) {
        int n2;
        HA hA3 = hA2;
        if (hA3 == null) {
            return uSa.E;
        }
        int n3 = uSa.E;
        float a2 = JPa.N;
        int n4 = n2 = uSa.E;
        while (n4 < hA3.f()) {
            Mda mda2 = hA3.J(n2);
            if (mda2 != null) {
                ++n3;
                a2 += (float)mda2.E / (float)Math.min(hA3.l(), mda2.e());
            }
            n4 = ++n2;
        }
        return Oz.J((float)((a2 /= (float)hA3.f()) * bsa.la)) + (n3 > 0 ? vRa.d : uSa.E);
    }

    public sEa J(int n2) {
        int b2 = n2;
        Ega_2 a2 = this;
        return a2.A.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, boolean bl2) {
        void a2;
        Object c2 = sx2;
        Ega_2 b2 = this;
        if (a2 != false) {
            b2.j.remove(c2);
            return;
        }
        b2.j.add((Sx)((Object)c2));
    }

    public static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return a2 & yRa.d | (b2 & yRa.d) << uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, boolean bl2, Sx sx2) {
        Object e2;
        void c2;
        void d2;
        Ega_2 ega_2 = object;
        Object object = sx2;
        Ega_2 a2 = ega_2;
        a2.J((int)d2, (int)c2, vRa.d, (Sx)((Object)e2));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3, int n4, Sx sx2) {
        Mda mda2;
        block61: {
            Object e2;
            int d2;
            void c22;
            void b2;
            kea kea2;
            void a2;
            Ega_2 ega_2;
            block62: {
                sEa sEa2;
                block68: {
                    sEa sEa3;
                    block66: {
                        int n5;
                        Mda mda3;
                        block69: {
                            block70: {
                                int n6;
                                block67: {
                                    block65: {
                                        block64: {
                                            block63: {
                                                block60: {
                                                    ega_2 = this;
                                                    mda2 = null;
                                                    kea2 = a2.K;
                                                    if (b2 != tTa.h) break block60;
                                                    int n7 = ega_2.J;
                                                    ega_2.J = Ega_2.f((int)c22);
                                                    if ((n7 != vRa.d || ega_2.J != uqa.g) && n7 != ega_2.J) {
                                                        ega_2.f();
                                                    } else if (kea2.J() == null) {
                                                        ega_2.f();
                                                    } else if (ega_2.J == 0) {
                                                        ega_2.i = Ega_2.J((int)c22);
                                                        if (Ega_2.J(ega_2.i, (Sx)a2)) {
                                                            ega_2.J = vRa.d;
                                                            ega_2.m.clear();
                                                        } else {
                                                            ega_2.f();
                                                        }
                                                    } else if (ega_2.J == vRa.d) {
                                                        e2 = ega_2.A.get(d2);
                                                        if (e2 != null && Ega_2.J((sEa)e2, kea2.J(), vRa.d != 0) && ((sEa)e2).J(kea2.J()) && kea2.J().E > ega_2.m.size() && ega_2.J((sEa)e2)) {
                                                            ega_2.m.add((sEa)e2);
                                                        }
                                                    } else if (ega_2.J == uqa.g) {
                                                        if (!ega_2.m.isEmpty()) {
                                                            kea kea3 = kea2;
                                                            e2 = kea3.J().J();
                                                            int n8 = kea3.J().E;
                                                            for (sEa sEa4 : ega_2.m) {
                                                                if (sEa4 == null || !Ega_2.J(sEa4, kea2.J(), vRa.d != 0) || !sEa4.J(kea2.J()) || kea2.J().E < ega_2.m.size() || !ega_2.J(sEa4)) continue;
                                                                Mda mda4 = e2.J();
                                                                int n9 = sEa4.J() ? sEa4.J().E : uSa.E;
                                                                Ega_2 ega_22 = ega_2;
                                                                Mda mda5 = mda4;
                                                                Ega_2.J(ega_22.m, ega_22.i, mda5, n9);
                                                                if (mda5.E > mda4.e()) {
                                                                    mda4.E = mda4.e();
                                                                }
                                                                if (mda4.E > sEa4.J(mda4)) {
                                                                    mda4.E = sEa4.J(mda4);
                                                                }
                                                                n8 -= mda4.E - n9;
                                                                sEa4.J(mda4);
                                                            }
                                                            ((Mda)e2).E = n8;
                                                            if (((Mda)e2).E <= 0) {
                                                                e2 = null;
                                                            }
                                                            kea2.J((Mda)e2);
                                                        }
                                                        ega_2.f();
                                                    } else {
                                                        ega_2.f();
                                                    }
                                                    break block61;
                                                }
                                                if (ega_2.J != 0) {
                                                    ega_2.f();
                                                    return mda2;
                                                }
                                                if (b2 != false && b2 != vRa.d || c22 != false && c22 != vRa.d) break block62;
                                                if (d2 != rta.n) break block63;
                                                if (kea2.J() != null) {
                                                    if (c22 == false) {
                                                        kea kea4 = kea2;
                                                        a2.J(kea4.J(), vRa.d != 0);
                                                        kea4.J((Mda)null);
                                                    }
                                                    if (c22 == vRa.d) {
                                                        kea kea5 = kea2;
                                                        a2.J(kea5.J().J(vRa.d), vRa.d != 0);
                                                        if (kea5.J().E == 0) {
                                                            kea2.J((Mda)null);
                                                            return mda2;
                                                        }
                                                    }
                                                }
                                                break block61;
                                            }
                                            if (b2 != vRa.d) break block64;
                                            if (d2 < 0) {
                                                return null;
                                            }
                                            sEa sEa5 = ega_2.A.get(d2);
                                            if (sEa5 != null && sEa5.J((Sx)a2) && (e2 = ega_2.J((Sx)a2, d2)) != null) {
                                                Object object = e2;
                                                eAa eAa2 = object.J();
                                                mda2 = object.J();
                                                if (sEa5.J() != null && sEa5.J().J() == eAa2) {
                                                    ega_2.J(d2, (int)c22, vRa.d != 0, (Sx)a2);
                                                }
                                            }
                                            break block61;
                                        }
                                        if (d2 < 0) {
                                            return null;
                                        }
                                        sEa3 = ega_2.A.get(d2);
                                        if (sEa3 == null) break block61;
                                        e2 = sEa3.J();
                                        mda3 = kea2.J();
                                        if (e2 != null) {
                                            mda2 = e2.J();
                                        }
                                        if (e2 != null) break block65;
                                        if (mda3 != null && sEa3.J(mda3)) {
                                            int n10;
                                            int n11 = n10 = c22 == false ? mda3.E : vRa.d;
                                            if (n10 > sEa3.J(mda3)) {
                                                n10 = sEa3.J(mda3);
                                            }
                                            if (mda3.E >= n10) {
                                                sEa3.J(mda3.J(n10));
                                            }
                                            if (mda3.E == 0) {
                                                kea2.J((Mda)null);
                                            }
                                        }
                                        break block66;
                                    }
                                    if (!sEa3.J((Sx)a2)) break block66;
                                    if (mda3 != null) break block67;
                                    Object object = e2;
                                    int n12 = c22 == false ? ((Mda)object).E : (((Mda)object).E + vRa.d) / uqa.g;
                                    Mda mda6 = sEa3.J(n12);
                                    kea2.J(mda6);
                                    if (((Mda)e2).E == 0) {
                                        sEa3.J((Mda)null);
                                    }
                                    sEa sEa6 = sEa3;
                                    sEa2 = sEa6;
                                    sEa6.J((Sx)a2, kea2.J());
                                    break block68;
                                }
                                if (!sEa3.J(mda3)) break block69;
                                if (e2.J() != mda3.J() || e2.J() != mda3.J() || !Mda.f((Mda)e2, (Mda)mda3)) break block70;
                                int n13 = n6 = c22 == false ? mda3.E : vRa.d;
                                if (n6 > sEa3.J(mda3) - ((Mda)e2).E) {
                                    n6 = sEa3.J(mda3) - ((Mda)e2).E;
                                }
                                if (n6 > mda3.e() - ((Mda)e2).E) {
                                    n6 = mda3.e() - ((Mda)e2).E;
                                }
                                Mda mda7 = mda3;
                                mda7.J(n6);
                                if (mda7.E == 0) {
                                    kea2.J((Mda)null);
                                }
                                ((Mda)e2).E += n6;
                                sEa2 = sEa3;
                                break block68;
                            }
                            if (mda3.E > sEa3.J(mda3)) break block66;
                            sEa sEa7 = sEa3;
                            sEa2 = sEa7;
                            sEa7.J(mda3);
                            kea2.J((Mda)e2);
                            break block68;
                        }
                        if (e2.J() == mda3.J() && mda3.e() > vRa.d && (!e2.i() || e2.J() == mda3.J()) && Mda.f((Mda)e2, (Mda)mda3) && (n5 = ((Mda)e2).E) > 0 && n5 + mda3.E <= mda3.e()) {
                            int n14 = n5;
                            mda3.E += n14;
                            e2 = sEa3.J(n14);
                            if (((Mda)e2).E == 0) {
                                sEa3.J((Mda)null);
                            }
                            sEa3.J((Sx)a2, kea2.J());
                        }
                    }
                    sEa2 = sEa3;
                }
                sEa2.J();
                break block61;
            }
            if (b2 == uqa.g && c22 >= 0 && c22 < WOa.fa) {
                sEa sEa8 = ega_2.A.get(d2);
                if (sEa8.J((Sx)a2)) {
                    e2 = kea2.J((int)c22);
                    int n15 = e2 == null || sEa8.J == kea2 && sEa8.J((Mda)e2) ? vRa.d : uSa.E;
                    int n16 = pua.o;
                    if (n15 == 0) {
                        n16 = kea2.e();
                        n15 |= n16 > pua.o ? vRa.d : uSa.E;
                    }
                    if (sEa8.J() && n15 != 0) {
                        sEa sEa9 = sEa8;
                        Mda mda8 = sEa9.J();
                        kea2.J((int)c22, mda8.J());
                        if (!(sEa9.J == kea2 && sEa8.J((Mda)e2) || e2 == null)) {
                            if (n16 > pua.o) {
                                sEa sEa10 = sEa8;
                                kea2.f((Mda)e2);
                                sEa10.J(mda8.E);
                                sEa10.J((Mda)null);
                                sEa8.J((Sx)a2, mda8);
                            }
                        } else {
                            sEa8.J(mda8.E);
                            sEa sEa11 = sEa8;
                            sEa11.J((Mda)e2);
                            sEa11.J((Sx)a2, mda8);
                        }
                    } else if (!sEa8.J() && e2 != null && sEa8.J((Mda)e2)) {
                        kea2.J((int)c22, (Mda)null);
                        sEa8.J((Mda)e2);
                    }
                }
            } else if (b2 == yRa.d && a2.h.f() && kea2.J() == null && d2 >= 0) {
                sEa sEa12 = ega_2.A.get(d2);
                if (sEa12 != null && sEa12.J()) {
                    Object object = e2 = sEa12.J().J();
                    ((Mda)object).E = object.e();
                    kea2.J((Mda)object);
                }
            } else if (b2 == AQa.P && kea2.J() == null && d2 >= 0) {
                sEa sEa13 = ega_2.A.get(d2);
                if (sEa13 != null && sEa13.J() && sEa13.J((Sx)a2)) {
                    e2 = sEa13.J(c22 == false ? vRa.d : sEa13.J().E);
                    void v18 = a2;
                    sEa13.J((Sx)v18, (Mda)e2);
                    v18.J((Mda)e2, vRa.d != 0);
                }
            } else if (b2 == uua.p && d2 >= 0) {
                sEa sEa14 = ega_2.A.get(d2);
                e2 = kea2.J();
                if (!(e2 == null || sEa14 != null && sEa14.J() && sEa14.J((Sx)a2))) {
                    int n17;
                    int n18 = c22 == false ? uSa.E : ega_2.A.size() - vRa.d;
                    int n19 = c22 == false ? vRa.d : pua.o;
                    int n20 = n17 = uSa.E;
                    while (n20 < uqa.g) {
                        int n21;
                        int n22 = n18;
                        while (n22 >= 0 && n21 < ega_2.A.size() && ((Mda)e2).E < e2.e()) {
                            sEa sEa15 = ega_2.A.get(n21);
                            if (sEa15.J() && Ega_2.J(sEa15, (Mda)e2, vRa.d != 0) && sEa15.J((Sx)a2) && ega_2.J((Mda)e2, sEa15) && (n17 != 0 || sEa15.J().E != sEa15.J().e())) {
                                Object object = e2;
                                sEa sEa16 = sEa15;
                                d2 = Math.min(object.e() - ((Mda)e2).E, sEa16.J().E);
                                Mda c22 = sEa16.J(d2);
                                ((Mda)object).E += d2;
                                if (c22.E <= 0) {
                                    sEa15.J((Mda)null);
                                }
                                sEa15.J((Sx)a2, c22);
                            }
                            n22 = n21 + n19;
                        }
                        n20 = ++n17;
                    }
                }
                ega_2.J();
            }
        }
        return mda2;
    }

    public static int J(int a2) {
        return a2 >> uqa.g & yRa.d;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        Ega_2 ega_2 = this;
    }
}

