/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jy
 *  Naa
 *  SOa
 *  YY
 *  hw
 *  vRa
 */
public final class JU_2
extends hw {
    private Jy[] k;
    private Jy[] j;
    private Jy[] J;
    private final Naa A;
    private Jy[] I;

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2, int n3, int n4, int n5) {
        int n6;
        void a2;
        void b2;
        void c2;
        void d2;
        JU_2 jU_2 = this;
        int[] nArray = jU_2.A.J((int)d2, (int)c2, (int)b2, (int)a2);
        int[] nArray2 = iW.J((int)(b2 * a2));
        int n7 = n6 = uSa.E;
        while (n7 < a2) {
            int n8 = uSa.E;
            while (n8 < b2) {
                int e2;
                JU_2 jU_22 = jU_2;
                jU_22.J(e2 + d2, n6 + c2);
                int n9 = nArray[e2 + n6 * b2];
                int n10 = (n9 & Yua.fa) >> Yqa.i;
                n9 &= SOa.O;
                if (jU_22.A != null && jU_2.A.fixedBiome >= 0) {
                    nArray2[e2 + n6 * b2] = jU_2.A.fixedBiome;
                } else if (JU_2.J((int)n9)) {
                    nArray2[e2 + n6 * b2] = n9;
                } else if (n9 == Jy.P.Ka) {
                    nArray2[e2 + n6 * b2] = n9;
                } else if (n9 == vRa.d) {
                    if (n10 > 0) {
                        nArray2[e2 + n6 * b2] = jU_2.J(yRa.d) == 0 ? Jy.S.Ka : Jy.w.Ka;
                    } else {
                        JU_2 jU_23 = jU_2;
                        nArray2[e2 + n6 * b2] = jU_2.J[jU_23.J((int)jU_23.J.length)].Ka;
                    }
                } else if (n9 == uqa.g) {
                    int[] nArray3 = nArray2;
                    if (n10 > 0) {
                        nArray3[e2 + n6 * b2] = Jy.Fa.Ka;
                    } else {
                        JU_2 jU_24 = jU_2;
                        nArray3[e2 + n6 * b2] = jU_2.k[jU_24.J((int)jU_24.k.length)].Ka;
                    }
                } else if (n9 == yRa.d) {
                    int[] nArray4 = nArray2;
                    if (n10 > 0) {
                        nArray4[e2 + n6 * b2] = Jy.qa.Ka;
                    } else {
                        JU_2 jU_25 = jU_2;
                        nArray4[e2 + n6 * b2] = jU_2.j[jU_25.J((int)jU_25.j.length)].Ka;
                    }
                } else if (n9 == AQa.P) {
                    JU_2 jU_26 = jU_2;
                    nArray2[e2 + n6 * b2] = jU_2.I[jU_26.J((int)jU_26.I.length)].Ka;
                } else {
                    nArray2[e2 + n6 * b2] = Jy.P.Ka;
                }
                n8 = ++e2;
            }
            n7 = ++n6;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public JU_2(long l2, hw hw2, Fy fy2, String string) {
        Object e2;
        void c2;
        void d2;
        JU_2 jU_2 = object;
        Object object = fy2;
        JU_2 b2 = jU_2;
        super((long)d2);
        Jy[] jyArray = new Jy[uua.p];
        jyArray[uSa.E] = Jy.ea;
        jyArray[vRa.d] = Jy.ea;
        jyArray[uqa.g] = Jy.ea;
        jyArray[yRa.d] = Jy.r;
        jyArray[AQa.P] = Jy.r;
        jyArray[tTa.h] = Jy.Z;
        b2.J = jyArray;
        Jy[] jyArray2 = new Jy[uua.p];
        jyArray2[uSa.E] = Jy.Y;
        jyArray2[vRa.d] = Jy.O;
        jyArray2[uqa.g] = Jy.U;
        jyArray2[yRa.d] = Jy.Z;
        jyArray2[AQa.P] = Jy.Sa;
        jyArray2[tTa.h] = Jy.g;
        b2.k = jyArray2;
        Jy[] jyArray3 = new Jy[AQa.P];
        jyArray3[uSa.E] = Jy.Y;
        jyArray3[vRa.d] = Jy.U;
        jyArray3[uqa.g] = Jy.I;
        jyArray3[yRa.d] = Jy.Z;
        b2.j = jyArray3;
        Jy[] jyArray4 = new Jy[AQa.P];
        jyArray4[uSa.E] = Jy.C;
        jyArray4[vRa.d] = Jy.C;
        jyArray4[uqa.g] = Jy.C;
        jyArray4[yRa.d] = Jy.Ta;
        b2.I = jyArray4;
        b2.A = c2;
        if (e2 == Fy.E) {
            Jy[] jyArray5 = new Jy[uua.p];
            jyArray5[uSa.E] = Jy.ea;
            jyArray5[vRa.d] = Jy.Y;
            jyArray5[uqa.g] = Jy.U;
            jyArray5[yRa.d] = Jy.g;
            jyArray5[AQa.P] = Jy.Z;
            jyArray5[tTa.h] = Jy.I;
            b2.J = jyArray5;
            b2.A = null;
            return;
        }
        if (e2 == Fy.m) {
            void a2;
            b2.A = YY.J((String)a2).J();
            return;
        }
        b2.A = null;
    }
}

