/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  QFa
 *  TQa
 *  XTa
 *  ZRa
 *  bAa
 *  bSa
 *  eAa
 *  pQa
 *  uQa
 *  vRa
 */
public final class Fca_3 {
    private String[][] A;
    private Object[][] I;

    public Fca_3() {
        Fca_3 a2;
        String[][] stringArrayArray = new String[vRa.d][];
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = DPa.ba;
        stringArray[vRa.d] = DPa.ba;
        stringArray[uqa.g] = uQa.Y;
        stringArrayArray[uSa.E] = stringArray;
        a2.A = stringArrayArray;
        Object[][] objectArrayArray = new Object[uqa.g][];
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = QFa.L;
        objectArray[vRa.d] = QFa.yB;
        objectArray[uqa.g] = Gea.GA;
        objectArray[yRa.d] = Gea.b;
        objectArray[AQa.P] = Gea.Bb;
        objectArrayArray[uSa.E] = objectArray;
        Object[] objectArray2 = new Object[tTa.h];
        objectArray2[uSa.E] = Gea.gc;
        objectArray2[vRa.d] = Gea.jb;
        objectArray2[uqa.g] = Gea.LA;
        objectArray2[yRa.d] = Gea.Ga;
        objectArray2[AQa.P] = Gea.sa;
        objectArrayArray[vRa.d] = objectArray2;
        a2.I = objectArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    public void J(bAa bAa2) {
        void a2;
        int n2;
        Fca_3 fca_3 = this;
        int n3 = n2 = uSa.E;
        while (n3 < fca_3.I[uSa.E].length) {
            Object object = fca_3.I[uSa.E][n2];
            int n4 = uSa.E;
            while (n4 < fca_3.I.length - vRa.d) {
                int b2;
                eAa eAa2 = (eAa)fca_3.I[b2 + vRa.d][n2];
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = fca_3.A[b2];
                objectArray[vRa.d] = Character.valueOf((char)TQa.ca);
                objectArray[uqa.g] = Gea.t;
                objectArray[yRa.d] = Character.valueOf((char)ZRa.D);
                objectArray[AQa.P] = object;
                a2.J(new Mda(eAa2), objectArray);
                n4 = ++b2;
            }
            n3 = ++n2;
        }
        Object[] objectArray = new Object[XTa.W];
        objectArray[uSa.E] = pQa.Z;
        objectArray[vRa.d] = Era.e;
        objectArray[uqa.g] = pQa.Z;
        objectArray[yRa.d] = Character.valueOf((char)ZRa.D);
        objectArray[AQa.P] = Gea.gd;
        objectArray[tTa.h] = Character.valueOf((char)TQa.ca);
        objectArray[uua.p] = Gea.t;
        a2.J(new Mda((eAa)Gea.cd, vRa.d), objectArray);
        Object[] objectArray2 = new Object[WOa.fa];
        objectArray2[uSa.E] = DPa.ba;
        objectArray2[vRa.d] = uQa.Y;
        objectArray2[uqa.g] = wua.q;
        objectArray2[yRa.d] = Character.valueOf((char)bSa.Da);
        objectArray2[AQa.P] = Gea.ia;
        objectArray2[tTa.h] = Character.valueOf((char)ZRa.D);
        objectArray2[uua.p] = Gea.M;
        objectArray2[XTa.W] = Character.valueOf((char)TQa.ca);
        objectArray2[Yqa.i] = Gea.t;
        a2.J(new Mda(Gea.Ma, AQa.P), objectArray2);
    }
}

