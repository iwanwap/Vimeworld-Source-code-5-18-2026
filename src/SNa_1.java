/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CC
 *  JPa
 *  Lz
 *  XTa
 *  aKa
 *  mka
 *  pKa
 *  tNa
 *  vRa
 */
import optifine.Config;

public final class SNa_1 {
    private boolean j;
    public int J;
    public tNa[] A;
    private static final String I = "CL_00000850";

    /*
     * WARNING - void declaration
     */
    public void J(aKa aKa2, float f2) {
        int n2;
        void b2;
        SNa_1 sNa_1;
        SNa_1 sNa_12 = sNa_1 = this;
        SNa_1 sNa_13 = sNa_1;
        Lz lz2 = sNa_12.A[vRa.d].I.f(sNa_13.A[uSa.E].I);
        Lz lz3 = sNa_12.A[vRa.d].I.f(sNa_1.A[uqa.g].I).C(lz2).J();
        float f3 = (float)lz3.A;
        float f4 = (float)lz3.j;
        float f5 = (float)lz3.J;
        if (sNa_13.j) {
            f3 = -f3;
            f4 = -f4;
            f5 = -f5;
        }
        if (Config.h()) {
            b2.J(XTa.W, CC.J);
        } else {
            b2.J(XTa.W, mka.m);
        }
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            void a2;
            SNa_1 c2 = sNa_1.A[n2];
            b2.J(((tNa)c2).I.A * (double)a2, ((tNa)c2).I.j * (double)a2, ((tNa)c2).I.J * (double)a2).J((double)((tNa)c2).J, (double)((tNa)c2).A).J(f3, f4, f5).M();
            n3 = ++n2;
        }
        pKa.J().J();
    }

    public void J() {
        int a2;
        SNa_1 sNa_1 = this;
        tNa[] tNaArray = new tNa[sNa_1.A.length];
        int n2 = a2 = uSa.E;
        while (n2 < sNa_1.A.length) {
            int n3 = a2;
            SNa_1 sNa_12 = sNa_1;
            tNa tNa2 = sNa_12.A[sNa_12.A.length - a2 - vRa.d];
            tNaArray[n3] = tNa2;
            n2 = ++a2;
        }
        sNa_1.A = tNaArray;
    }

    public SNa_1(tNa[] tNaArray) {
        tNa[] b2 = tNaArray;
        tNa[] a2 = this;
        a2.A = b2;
        a2.J = b2.length;
    }

    /*
     * WARNING - void declaration
     */
    public SNa_1(tNa[] tNaArray, int n2, int n3, int n4, int n5, float f2, float f3) {
        void c2;
        void f4;
        void e2;
        void d2;
        void a2;
        void b2;
        tNa[] h2 = tNaArray;
        tNa[] g2 = this;
        super(h2);
        float f5 = JPa.N / b2;
        float f6 = JPa.N / a2;
        tNa[] tNaArray2 = h2;
        tNaArray2[uSa.E] = h2[uSa.E].J((float)d2 / b2 - f5, (float)e2 / a2 + f6);
        h2[vRa.d] = h2[vRa.d].J((float)f4 / b2 + f5, (float)e2 / a2 + f6);
        tNaArray2[uqa.g] = h2[uqa.g].J((float)f4 / b2 + f5, (float)c2 / a2 - f6);
        tNaArray2[yRa.d] = h2[yRa.d].J((float)d2 / b2 - f5, (float)c2 / a2 - f6);
    }
}

