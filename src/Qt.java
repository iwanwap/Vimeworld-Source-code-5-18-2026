/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NQa
 *  Wsa
 *  cQa
 *  hra
 *  pqa
 *  ura
 *  vRa
 */
public final class Qt {
    public static final int A = 1536;
    public static final float[][] I;

    public Qt() {
        Qt a2;
    }

    public static int J(int a2) {
        return a2 >> osa.c & osa.Ja;
    }

    public static int J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return (a2 & Wsa.K) + (b2 << osa.c);
    }

    static {
        int n2;
        I = new float[uSa.i][yRa.d];
        int n3 = uSa.E;
        int n4 = n2 = uSa.E;
        while (n4 < hra.Ja) {
            Qt.I[n3][uSa.E] = pqa.r;
            Qt.I[n3][vRa.d] = (float)n2 / NQa.Y;
            float[] fArray = I[n3];
            ++n3;
            fArray[uqa.g] = JPa.N;
            n4 = ++n2;
        }
        n3 = hra.Ja;
        int n5 = n2 = uSa.E;
        while (n5 < hra.Ja) {
            Qt.I[n3][uSa.E] = pqa.r - (float)n2 / NQa.Y;
            Qt.I[n3][vRa.d] = pqa.r;
            float[] fArray = I[n3];
            ++n3;
            fArray[uqa.g] = JPa.N;
            n5 = ++n2;
        }
        n3 = cQa.z;
        int n6 = n2 = uSa.E;
        while (n6 < hra.Ja) {
            Qt.I[n3][uSa.E] = JPa.N;
            Qt.I[n3][vRa.d] = pqa.r;
            float[] fArray = I[n3];
            ++n3;
            fArray[uqa.g] = (float)n2 / NQa.Y;
            n6 = ++n2;
        }
        n3 = tua.C;
        int n7 = n2 = uSa.E;
        while (n7 < hra.Ja) {
            Qt.I[n3][uSa.E] = JPa.N;
            Qt.I[n3][vRa.d] = pqa.r - (float)n2 / NQa.Y;
            float[] fArray = I[n3];
            ++n3;
            fArray[uqa.g] = pqa.r;
            n7 = ++n2;
        }
        n3 = ura.V;
        int n8 = n2 = uSa.E;
        while (n8 < hra.Ja) {
            Qt.I[n3][uSa.E] = (float)n2 / NQa.Y;
            Qt.I[n3][vRa.d] = JPa.N;
            float[] fArray = I[n3];
            ++n3;
            fArray[uqa.g] = pqa.r;
            n8 = ++n2;
        }
        n3 = JPa.W;
        int n9 = n2 = uSa.E;
        while (n9 < hra.Ja) {
            Qt.I[n3][uSa.E] = pqa.r;
            Qt.I[n3][vRa.d] = JPa.N;
            float[] fArray = I[n3];
            ++n3;
            fArray[uqa.g] = pqa.r - (float)n2 / NQa.Y;
            n9 = ++n2;
        }
    }
}

