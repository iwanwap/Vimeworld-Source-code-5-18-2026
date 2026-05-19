/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  Lz
 *  Qsa
 *  RPa
 *  aSa
 *  aqa
 *  cra
 *  dpa
 *  fpa
 *  kpa
 *  lqa
 *  pqa
 *  uKa
 *  vRa
 *  xJa
 */
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public final class nLa_2 {
    private static FloatBuffer J = xJa.J((int)ERa.C);
    private static final Lz A;
    private static final Lz I;

    static {
        I = new Lz(Bua.Ia, oua.i, aqa.O).J();
        A = new Lz(kpa.u, oua.i, dpa.X).J();
    }

    public static void C() {
        uKa.L();
        uKa.d((int)uSa.E);
        uKa.d((int)vRa.d);
        uKa.C();
    }

    public static void l() {
        nLa_2.f();
    }

    public nLa_2() {
        nLa_2 a2;
    }

    public static void f() {
        uKa.P();
        uKa.j((int)uSa.E);
        uKa.j((int)vRa.d);
        uKa.a();
        uKa.J((int)lqa.Ja, (int)Era.G);
        float f2 = Xpa.R;
        float f3 = Ora.D;
        float f4 = JPa.N;
        GL11.glLight(qQa.O, rua.Ia, nLa_2.J(nLa_2.I.A, nLa_2.I.j, nLa_2.I.J, aSa.V));
        float f5 = f3;
        GL11.glLight(qQa.O, fpa.t, nLa_2.J(f5, f5, f5, pqa.r));
        GL11.glLight(qQa.O, RPa.Ma, nLa_2.J(JPa.N, JPa.N, JPa.N, pqa.r));
        float f6 = f4;
        GL11.glLight(qQa.O, fPa.Ga, nLa_2.J(f6, f6, f6, pqa.r));
        GL11.glLight(cra.Aa, rua.Ia, nLa_2.J(nLa_2.A.A, nLa_2.A.j, nLa_2.A.J, aSa.V));
        float f7 = f3;
        GL11.glLight(cra.Aa, fpa.t, nLa_2.J(f7, f7, f7, pqa.r));
        GL11.glLight(cra.Aa, RPa.Ma, nLa_2.J(JPa.N, JPa.N, JPa.N, pqa.r));
        float f8 = f4;
        GL11.glLight(cra.Aa, fPa.Ga, nLa_2.J(f8, f8, f8, pqa.r));
        uKa.F((int)Zra.f);
        float f9 = f2;
        GL11.glLightModel(aua.d, nLa_2.J(f9, f9, f9, pqa.r));
    }

    private static FloatBuffer J(double d2, double c2, double b2, double a2) {
        return nLa_2.J((float)d2, (float)c2, (float)b2, (float)a2);
    }

    public static void J() {
        uKa.e();
        uKa.J((float)TOa.R, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)Qsa.B, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        nLa_2.f();
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    private static FloatBuffer J(float f2, float f3, float f4, float f5) {
        void b2;
        void c2;
        float d2 = f5;
        float a2 = f2;
        J.clear();
        J.put(a2).put((float)c2).put((float)b2).put(d2);
        J.flip();
        return J;
    }
}

