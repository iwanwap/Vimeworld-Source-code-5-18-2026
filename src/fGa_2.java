/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Bsa
 *  Lra
 *  Maa
 *  Qqa
 *  TQa
 *  Uta
 *  Vua
 *  Ypa
 *  Zpa
 *  aPa
 *  bRa
 *  fGa
 *  fpa
 *  kpa
 *  pua
 *  uKa
 *  vPa
 *  vRa
 */
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL14;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fGa_2 {
    private static fGa C = null;
    private final boolean i;
    private final boolean M;
    private final int k;
    private final int j;
    private final int J;
    private final int A;
    private final int I;

    private static int f(String string) {
        String string2 = string;
        String a2 = string2.trim().toLowerCase();
        if (a2.equals(Qra.U)) {
            return zOa.e;
        }
        if (a2.equals(yOa.u)) {
            return FRa.ga;
        }
        if (a2.equals(Bta.g)) {
            return Qqa.Ia;
        }
        if (a2.equals(AQa.o)) {
            return Qqa.Ia;
        }
        if (a2.equals(Bua.r)) {
            return Ypa.ja;
        }
        if (a2.equals(fpa.s)) {
            return BRa.b;
        }
        return zOa.e;
    }

    public boolean J() {
        fGa_2 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    private fGa_2(boolean bl, boolean bl2, int n2, int n3, int n4, int n5, int n6) {
        void h2;
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        fGa_2 a2;
        int n7 = n6;
        fGa_2 fGa_22 = a2 = this;
        fGa_2 fGa_23 = a2;
        fGa_2 fGa_24 = a2;
        a2.i = g2;
        fGa_24.J = e2;
        fGa_24.I = d2;
        fGa_23.j = c2;
        fGa_23.A = b2;
        fGa_22.M = f2;
        fGa_22.k = h2;
    }

    private static int J(String string) {
        String string2 = string;
        String a2 = string2.trim().toLowerCase();
        a2 = a2.replaceAll(IPa.W, Mqa.y);
        a2 = a2.replaceAll(VPa.R, TQa.h);
        a2 = a2.replaceAll(vPa.v, GPa.J);
        if ((a2 = a2.replaceAll(wsa.T, Vua.m)).equals(GPa.J)) {
            return uSa.E;
        }
        if (a2.equals(TQa.h)) {
            return vRa.d;
        }
        if (a2.equals(IPa.y)) {
            return tua.C;
        }
        if (a2.equals(qQa.Ja)) {
            return Wqa.w;
        }
        if (a2.equals(bRa.J)) {
            return Qpa.Q;
        }
        if (a2.equals(Bsa.J)) {
            return qQa.C;
        }
        if (a2.equals(Jra.ia)) {
            return Lra.k;
        }
        if (a2.equals(Uta.r)) {
            return kpa.J;
        }
        if (a2.equals(Bpa.Ia)) {
            return Nra.c;
        }
        if (a2.equals(Zpa.F)) {
            return Yqa.r;
        }
        return pua.o;
    }

    public void J() {
        fGa_2 a2;
        if (!a2.equals(C)) {
            if (C == null || a2.M != C.J()) {
                C = a2;
                if (fGa_2.C.M) {
                    uKa.k();
                    return;
                }
                uKa.B();
            }
            fGa_2 fGa_22 = a2;
            GL14.glBlendEquation(fGa_22.k);
            if (fGa_22.i) {
                fGa_2 fGa_23 = a2;
                fGa_2 fGa_24 = a2;
                uKa.J((int)fGa_23.J, (int)fGa_23.I, (int)fGa_24.j, (int)fGa_24.A);
                return;
            }
            fGa_2 fGa_25 = a2;
            uKa.f((int)fGa_25.J, (int)fGa_25.I);
        }
    }

    public fGa_2() {
        a2(uSa.E != 0, vRa.d != 0, vRa.d, uSa.E, vRa.d, uSa.E, zOa.e);
        fGa_2 a2;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof fGa_2)) {
            return uSa.E != 0;
        }
        b2 = (fGa_2)b2;
        if (((fGa_2)a2).k != ((fGa_2)b2).k) {
            return uSa.E != 0;
        }
        if (((fGa_2)a2).A != ((fGa_2)b2).A) {
            return uSa.E != 0;
        }
        if (((fGa_2)a2).I != ((fGa_2)b2).I) {
            return uSa.E != 0;
        }
        if (((fGa_2)a2).M != ((fGa_2)b2).M) {
            return uSa.E != 0;
        }
        if (((fGa_2)a2).i != ((fGa_2)b2).i) {
            return uSa.E != 0;
        }
        if (((fGa_2)a2).j != ((fGa_2)b2).j) {
            return uSa.E != 0;
        }
        if (((fGa_2)a2).J == ((fGa_2)b2).J) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        fGa_2 fGa_22 = this;
        int a2 = fGa_22.J;
        a2 = tua.U * a2 + fGa_22.j;
        a2 = tua.U * a2 + fGa_22.I;
        a2 = tua.U * a2 + fGa_22.A;
        a2 = tua.U * a2 + fGa_22.k;
        a2 = tua.U * a2 + (fGa_22.i ? vRa.d : uSa.E);
        a2 = tua.U * a2 + (fGa_22.M ? vRa.d : uSa.E);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public fGa_2(int n2, int n3, int n4, int n5, int n6) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        int n7 = n6;
        fGa_2 a2 = this;
        a2(vRa.d != 0, uSa.E != 0, (int)e2, (int)d2, (int)c2, (int)b2, (int)f2);
    }

    /*
     * WARNING - void declaration
     */
    public fGa_2(int n2, int n3, int n4) {
        void a2;
        void c2;
        int d2 = n3;
        fGa_2 b2 = this;
        void v0 = c2;
        b2(uSa.E != 0, uSa.E != 0, (int)v0, d2, (int)v0, d2, (int)a2);
    }

    public static fGa J(JsonObject jsonObject) {
        fGa_2 fGa_22;
        JsonObject jsonObject2 = jsonObject;
        if (jsonObject2 == null) {
            return new fGa_2();
        }
        int n2 = zOa.e;
        int n3 = vRa.d;
        int n4 = uSa.E;
        int n5 = vRa.d;
        int n6 = uSa.E;
        int a2 = vRa.d;
        int n7 = uSa.E;
        if (Maa.l((JsonObject)jsonObject2, (String)nua.v) && (n2 = fGa_2.f(jsonObject2.get(nua.v).getAsString())) != zOa.e) {
            a2 = uSa.E;
        }
        if (Maa.l((JsonObject)jsonObject2, (String)Lra.A) && (n3 = fGa_2.J(jsonObject2.get(Lra.A).getAsString())) != vRa.d) {
            a2 = uSa.E;
        }
        if (Maa.l((JsonObject)jsonObject2, (String)aPa.D) && (n4 = fGa_2.J(jsonObject2.get(aPa.D).getAsString())) != 0) {
            a2 = uSa.E;
        }
        if (Maa.l((JsonObject)jsonObject2, (String)Jra.ia)) {
            n5 = fGa_2.J(jsonObject2.get(Jra.ia).getAsString());
            if (n5 != vRa.d) {
                a2 = uSa.E;
            }
            n7 = vRa.d;
        }
        if (Maa.l((JsonObject)jsonObject2, (String)Bpa.Ia)) {
            n6 = fGa_2.J(jsonObject2.get(Bpa.Ia).getAsString());
            if (n6 != 0) {
                a2 = uSa.E;
            }
            n7 = vRa.d;
        }
        if (a2 != 0) {
            return new fGa_2();
        }
        if (n7 != 0) {
            fGa_22 = new fGa_2(n3, n4, n5, n6, n2);
            return fGa_22;
        }
        fGa_22 = new fGa_2(n3, n4, n2);
        return fGa_22;
    }
}

