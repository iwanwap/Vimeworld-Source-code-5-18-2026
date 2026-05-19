/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  URa
 *  ZRa
 *  bAa
 *  eAa
 *  vRa
 */
public final class pCa_2 {
    private String[][] A;
    private eAa[][] I;

    /*
     * WARNING - void declaration
     */
    public void J(bAa bAa2) {
        int n2;
        pCa_2 pCa_22 = this;
        int n3 = n2 = uSa.E;
        while (n3 < pCa_22.I[uSa.E].length) {
            eAa eAa2 = pCa_22.I[uSa.E][n2];
            int n4 = uSa.E;
            while (n4 < pCa_22.I.length - vRa.d) {
                void a2;
                int b2;
                eAa eAa3 = pCa_22.I[b2 + vRa.d][n2];
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = pCa_22.A[b2];
                objectArray[vRa.d] = Character.valueOf((char)ZRa.D);
                objectArray[uqa.g] = eAa2;
                a2.J(new Mda(eAa3), objectArray);
                n4 = ++b2;
            }
            n3 = ++n2;
        }
    }

    public pCa_2() {
        pCa_2 a2;
        String[][] stringArrayArray = new String[AQa.P][];
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = Upa.R;
        stringArray[vRa.d] = URa.m;
        stringArrayArray[uSa.E] = stringArray;
        String[] stringArray2 = new String[yRa.d];
        stringArray2[uSa.E] = URa.m;
        stringArray2[vRa.d] = Upa.R;
        stringArray2[uqa.g] = Upa.R;
        stringArrayArray[vRa.d] = stringArray2;
        String[] stringArray3 = new String[yRa.d];
        stringArray3[uSa.E] = Upa.R;
        stringArray3[vRa.d] = URa.m;
        stringArray3[uqa.g] = URa.m;
        stringArrayArray[uqa.g] = stringArray3;
        String[] stringArray4 = new String[uqa.g];
        stringArray4[uSa.E] = URa.m;
        stringArray4[vRa.d] = URa.m;
        stringArrayArray[yRa.d] = stringArray4;
        a2.A = stringArrayArray;
        eAa[][] eAaArrayArray = new eAa[tTa.h][];
        eAa[] eAaArray = new eAa[AQa.P];
        eAaArray[uSa.E] = Gea.Xb;
        eAaArray[vRa.d] = Gea.GA;
        eAaArray[uqa.g] = Gea.b;
        eAaArray[yRa.d] = Gea.Bb;
        eAaArrayArray[uSa.E] = eAaArray;
        eAa[] eAaArray2 = new eAa[AQa.P];
        eAaArray2[uSa.E] = Gea.h;
        eAaArray2[vRa.d] = Gea.G;
        eAaArray2[uqa.g] = Gea.ma;
        eAaArray2[yRa.d] = Gea.g;
        eAaArrayArray[vRa.d] = eAaArray2;
        eAa[] eAaArray3 = new eAa[AQa.P];
        eAaArray3[uSa.E] = Gea.r;
        eAaArray3[vRa.d] = Gea.x;
        eAaArray3[uqa.g] = Gea.X;
        eAaArray3[yRa.d] = Gea.K;
        eAaArrayArray[uqa.g] = eAaArray3;
        eAa[] eAaArray4 = new eAa[AQa.P];
        eAaArray4[uSa.E] = Gea.W;
        eAaArray4[vRa.d] = Gea.H;
        eAaArray4[uqa.g] = Gea.la;
        eAaArray4[yRa.d] = Gea.a;
        eAaArrayArray[yRa.d] = eAaArray4;
        eAa[] eAaArray5 = new eAa[AQa.P];
        eAaArray5[uSa.E] = Gea.ib;
        eAaArray5[vRa.d] = Gea.XC;
        eAaArray5[uqa.g] = Gea.Pa;
        eAaArray5[yRa.d] = Gea.ab;
        eAaArrayArray[AQa.P] = eAaArray5;
        a2.I = eAaArrayArray;
    }
}

