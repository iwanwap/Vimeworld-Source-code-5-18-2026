/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  Mda
 *  NTa
 *  Oz
 *  Ypa
 *  gZ
 *  kGa
 *  lqa
 *  pPa
 *  sia
 *  vL
 *  vQa
 *  vRa
 *  wOa
 *  wga
 */
import net.minecraft.util.ResourceLocation;

public final class Iha_1
extends wga {
    private static final int[] k;
    public final int j;
    private static final String[] J;
    private static final int[] A;
    private static final int[] I;

    public boolean J(wga wga2) {
        Iha_1 b2 = wga2;
        Iha_1 a2 = this;
        if (b2 instanceof Iha_1) {
            Iha_1 iha_1 = b2;
            if (iha_1.j == a2.j) {
                return uSa.E != 0;
            }
            if (a2.j == uqa.g || iha_1.j == uqa.g) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return super.J((wga)b2);
    }

    static {
        String[] stringArray = new String[tTa.h];
        stringArray[uSa.E] = JSa.H;
        stringArray[vRa.d] = LRa.g;
        stringArray[uqa.g] = xra.E;
        stringArray[yRa.d] = sqa.N;
        stringArray[AQa.P] = zOa.h;
        J = stringArray;
        int[] nArray = new int[tTa.h];
        nArray[uSa.E] = vRa.d;
        nArray[vRa.d] = NTa.C;
        nArray[uqa.g] = tTa.h;
        nArray[yRa.d] = tTa.h;
        nArray[AQa.P] = yRa.d;
        A = nArray;
        int[] nArray2 = new int[tTa.h];
        nArray2[uSa.E] = pPa.f;
        nArray2[vRa.d] = Yqa.i;
        nArray2[uqa.g] = uua.p;
        nArray2[yRa.d] = Yqa.i;
        nArray2[AQa.P] = uua.p;
        k = nArray2;
        int[] nArray3 = new int[tTa.h];
        nArray3[uSa.E] = kTa.j;
        nArray3[vRa.d] = lqa.s;
        nArray3[uqa.g] = NTa.C;
        nArray3[yRa.d] = lqa.s;
        nArray3[AQa.P] = Ypa.A;
        I = nArray3;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2, gZ gZ2) {
        void a2;
        int c22 = n2;
        Iha_1 b2 = this;
        if (a2.A()) {
            return uSa.E;
        }
        int n3 = c22;
        float c22 = (float)(uua.p + n3 * n3) / vQa.q;
        if (b2.j == 0) {
            return Oz.J((float)(c22 * wOa.w));
        }
        if (b2.j == vRa.d && a2.M()) {
            return Oz.J((float)(c22 * oQa.z));
        }
        if (b2.j == uqa.g && a2 == gZ.B) {
            return Oz.J((float)(c22 * MTa.y));
        }
        if (b2.j == yRa.d && a2.l()) {
            return Oz.J((float)(c22 * Ira.d));
        }
        if (b2.j == AQa.P && a2.f()) {
            return Oz.J((float)(c22 * Ira.d));
        }
        return uSa.E;
    }

    public int f() {
        return AQa.P;
    }

    public static int J(vL vL2, int n2) {
        int b2 = n2;
        vL a2 = vL2;
        int n3 = kGa.J((int)wga.k.I, (Mda[])a2.J());
        if (n3 > 0) {
            int n4 = b2;
            b2 = n4 - Oz.J((float)((float)n4 * (float)n3 * VPa.i));
        }
        return b2;
    }

    public int J(int n2) {
        int b2 = n2;
        Iha_1 a2 = this;
        return A[a2.j] + (b2 - vRa.d) * k[a2.j];
    }

    public String J() {
        Iha_1 a2;
        return new StringBuilder().insert(5 >> 3, zta.c).append(J[a2.j]).toString();
    }

    /*
     * WARNING - void declaration
     */
    public Iha_1(int n2, ResourceLocation resourceLocation, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Iha_1 a2 = this;
        super((int)d2, (ResourceLocation)c2, (int)b2, sia.ARMOR);
        a2.j = e2;
        if (a2.j == uqa.g) {
            a2.e = sia.ARMOR_FEET;
        }
    }

    public int f(int n2) {
        int b2 = n2;
        Iha_1 a2 = this;
        return a2.J(b2) + I[a2.j];
    }

    /*
     * WARNING - void declaration
     */
    public static double J(vL vL2, double d2) {
        void a2;
        vL vL3 = vL2;
        int b2 = kGa.J((int)wga.x.I, (Mda[])vL3.J());
        if (b2 > 0) {
            void v0 = a2;
            a2 = v0 - (double)Oz.f((double)(v0 * (double)((float)b2 * VPa.i)));
        }
        return (double)a2;
    }
}

