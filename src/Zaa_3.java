/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  Waa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Zaa_3
implements UB {
    private boolean k;
    private final int j;
    private final Mda[] J;
    private final Mda A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public Zaa_3(int n2, int n3, Mda[] mdaArray, Mda mda2) {
        Zaa_3 e2;
        void b2;
        void c2;
        void d2;
        Zaa_3 a2;
        Zaa_3 zaa_3 = zaa_32;
        Zaa_3 zaa_32 = mda2;
        Zaa_3 zaa_33 = a2 = zaa_3;
        Zaa_3 zaa_34 = a2;
        zaa_34.j = d2;
        zaa_34.I = c2;
        zaa_33.J = b2;
        zaa_33.A = e2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda J(xFa xFa2) {
        Zaa_3 zaa_3;
        Zaa_3 zaa_32 = zaa_3 = this;
        Mda mda2 = zaa_32.J().J();
        if (zaa_32.k) {
            void a2;
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < a2.f()) {
                Zaa_3 b2 = a2.J(n2);
                if (b2 != null && b2.M()) {
                    mda2.J((Waa)b2.J().J());
                }
                n3 = ++n2;
            }
        }
        return mda2;
    }

    /*
     * Unable to fully structure code
     */
    private boolean J(xFa var1_2, int var2_3, int var3_4, boolean var4_5) {
        var7_6 = this;
        v0 = var5_7 = uSa.E;
        while (v0 < yRa.d) {
            v1 = uSa.E;
            while (v1 < yRa.d) {
                e = var5_7 - c;
                var8_9 = var6_8 - b;
                var9_10 = null;
                if (e < 0 || var8_9 < 0 || e >= var7_6.j || var8_9 >= var7_6.I) ** GOTO lbl16
                if (a != false) {
                    v2 = var7_6;
                    var9_10 = v2.J[v2.j - e - vRa.d + var8_9 * var7_6.j];
                    v3 = d;
                } else {
                    var9_10 = var7_6.J[e + var8_9 * var7_6.j];
lbl16:
                    // 2 sources

                    v3 = d;
                }
                e = v3.f(var5_7, var6_8);
                if (e != null || var9_10 != null) {
                    if (e == null && var9_10 != null || e != null && var9_10 == null) {
                        return (boolean)uSa.E;
                    }
                    if (var9_10.J() != e.J()) {
                        return (boolean)uSa.E;
                    }
                    if (var9_10.J() != BQa.h && var9_10.J() != e.J()) {
                        return (boolean)uSa.E;
                    }
                }
                v1 = ++var6_8;
            }
            v0 = ++var5_7;
        }
        return (boolean)vRa.d;
    }

    @Override
    public int J() {
        Zaa_3 a2;
        Zaa_3 zaa_3 = a2;
        return zaa_3.j * zaa_3.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        Zaa_3 zaa_3 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J().f()) {
                mdaArray[b2] = new Mda(mda2.J().f());
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        int a2;
        Zaa_3 zaa_3 = this;
        int n2 = a2 = uSa.E;
        while (n2 <= yRa.d - zaa_3.j) {
            int n3 = uSa.E;
            while (n3 <= yRa.d - zaa_3.I) {
                int c2;
                void b2;
                if (zaa_3.J((xFa)b2, a2, c2, vRa.d != 0)) {
                    return vRa.d != 0;
                }
                if (zaa_3.J((xFa)b2, a2, c2, uSa.E != 0)) {
                    return vRa.d != 0;
                }
                n3 = ++c2;
            }
            n2 = ++a2;
        }
        return uSa.E != 0;
    }

    @Override
    public Mda J() {
        Zaa_3 a2;
        return a2.A;
    }
}

