/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  QFa
 *  TQa
 *  ZRa
 *  bAa
 *  eAa
 *  uQa
 *  vPa
 *  vRa
 *  wOa
 */
public final class BCa_1 {
    private Object[][] A;
    private String[][] I;

    /*
     * WARNING - void declaration
     */
    public void J(bAa bAa2) {
        void a2;
        int n2;
        BCa_1 bCa_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < bCa_1.A[uSa.E].length) {
            Object object = bCa_1.A[uSa.E][n2];
            int n4 = uSa.E;
            while (n4 < bCa_1.A.length - vRa.d) {
                int b2;
                eAa eAa2 = (eAa)bCa_1.A[b2 + vRa.d][n2];
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = bCa_1.I[b2];
                objectArray[vRa.d] = Character.valueOf((char)TQa.ca);
                objectArray[uqa.g] = Gea.t;
                objectArray[yRa.d] = Character.valueOf((char)ZRa.D);
                objectArray[AQa.P] = object;
                a2.J(new Mda(eAa2), objectArray);
                n4 = ++b2;
            }
            n3 = ++n2;
        }
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = Qra.Ka;
        objectArray[vRa.d] = DPa.k;
        objectArray[uqa.g] = Character.valueOf((char)TQa.ca);
        objectArray[yRa.d] = Gea.GA;
        a2.J(new Mda((eAa)Gea.ja), objectArray);
    }

    public BCa_1() {
        BCa_1 a2;
        String[][] stringArrayArray = new String[AQa.P][];
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Upa.R;
        stringArray[vRa.d] = ZSa.A;
        stringArray[uqa.g] = ZSa.A;
        stringArrayArray[uSa.E] = stringArray;
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = DPa.ba;
        stringArray2[vRa.d] = uQa.Y;
        stringArray2[uqa.g] = uQa.Y;
        stringArrayArray[vRa.d] = stringArray2;
        String[] stringArray3 = new String[yRa.d];
        stringArray3[uSa.E] = vPa.R;
        stringArray3[vRa.d] = wOa.X;
        stringArray3[uqa.g] = Qra.Ka;
        stringArrayArray[uqa.g] = stringArray3;
        String[] stringArray4 = new String[yRa.d];
        stringArray4[uSa.E] = vPa.R;
        stringArray4[vRa.d] = Qra.Ka;
        stringArray4[uqa.g] = Qra.Ka;
        stringArrayArray[yRa.d] = stringArray4;
        a2.I = stringArrayArray;
        Object[][] objectArrayArray = new Object[tTa.h][];
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = QFa.L;
        objectArray[vRa.d] = QFa.yB;
        objectArray[uqa.g] = Gea.GA;
        objectArray[yRa.d] = Gea.b;
        objectArray[AQa.P] = Gea.Bb;
        objectArrayArray[uSa.E] = objectArray;
        Object[] objectArray2 = new Object[tTa.h];
        objectArray2[uSa.E] = Gea.kB;
        objectArray2[vRa.d] = Gea.P;
        objectArray2[uqa.g] = Gea.gB;
        objectArray2[yRa.d] = Gea.zb;
        objectArray2[AQa.P] = Gea.l;
        objectArrayArray[vRa.d] = objectArray2;
        Object[] objectArray3 = new Object[tTa.h];
        objectArray3[uSa.E] = Gea.aC;
        objectArray3[vRa.d] = Gea.Ea;
        objectArray3[uqa.g] = Gea.NB;
        objectArray3[yRa.d] = Gea.uc;
        objectArray3[AQa.P] = Gea.yb;
        objectArrayArray[uqa.g] = objectArray3;
        Object[] objectArray4 = new Object[tTa.h];
        objectArray4[uSa.E] = Gea.qb;
        objectArray4[vRa.d] = Gea.Wc;
        objectArray4[uqa.g] = Gea.ra;
        objectArray4[yRa.d] = Gea.Z;
        objectArray4[AQa.P] = Gea.td;
        objectArrayArray[yRa.d] = objectArray4;
        Object[] objectArray5 = new Object[tTa.h];
        objectArray5[uSa.E] = Gea.n;
        objectArray5[vRa.d] = Gea.Fa;
        objectArray5[uqa.g] = Gea.Sd;
        objectArray5[yRa.d] = Gea.Ic;
        objectArray5[AQa.P] = Gea.ga;
        objectArrayArray[AQa.P] = objectArray5;
        a2.A = objectArrayArray;
    }
}

