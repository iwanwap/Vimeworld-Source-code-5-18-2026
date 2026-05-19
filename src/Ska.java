/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  GC
 *  JPa
 *  KTa
 *  Lra
 *  MQa
 *  Mda
 *  Oz
 *  QSa
 *  RA
 *  Xja
 *  cJ
 *  jFa
 *  jRa
 *  kpa
 *  kta
 *  pqa
 *  uKa
 *  vL
 *  vRa
 *  wOa
 *  xKa
 */
import java.util.Random;
import net.minecraft.util.ResourceLocation;

public final class Ska
extends GC<jFa> {
    private Random A;
    private final xKa I;

    /*
     * WARNING - void declaration
     */
    private int J(jFa jFa2, double d2, double d3, double d4, float f2, RA rA2) {
        void c2;
        void d5;
        void e2;
        float b2;
        void a22;
        void f32;
        Ska ska2 = this;
        Ska g22 = f32.J();
        if (g22.J() == null) {
            return uSa.E;
        }
        boolean a22 = a22.l();
        int g22 = ska2.J((Mda)g22);
        float f4 = Oz.d((float)(((float)f32.J() + b2) / FRa.Ga + f32.m)) * Nra.e + Nra.e;
        float f5 = a22.J().J((Xja)Xja.GROUND).scale.y;
        uKa.J((float)((float)e2), (float)((float)d5 + f4 + rta.o * f5), (float)((float)c2));
        if (a22 || ((oLa)((Object)ska2.A)).b != null) {
            f4 = (((float)f32.J() + b2) / eta.e + f32.m) * zpa.Z;
            uKa.J((float)f4, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        }
        if (!a22) {
            f4 = QTa.ga * (float)(g22 - vRa.d) * MQa.L;
            float f32 = QTa.ga * (float)(g22 - vRa.d) * MQa.L;
            b2 = KTa.Aa * (float)(g22 - vRa.d) * MQa.L;
            uKa.J((float)f4, (float)f32, (float)b2);
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        return g22;
    }

    /*
     * WARNING - void declaration
     */
    public void J(jFa jFa2, double d2, double d3, double d4, float f2, float f3) {
        void b2;
        int n2;
        void a2;
        void c2;
        void d5;
        void e2;
        void f4;
        Ska ska2 = this;
        Mda mda2 = f4.J();
        Ska ska3 = ska2;
        ska3.A.setSeed(WPa.u);
        int n3 = uSa.E;
        if (ska3.f((vL)f4)) {
            ((oLa)((Object)ska2.A)).J.J(ska2.J((jFa)f4)).J(uSa.E != 0, uSa.E != 0);
            n3 = vRa.d;
        }
        uKa.o();
        uKa.J((int)jRa.m, (float)Nra.e);
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.e();
        Ska ska4 = ska2;
        Ska g2 = ska4.I.J().J(mda2);
        int n4 = ska4.J((jFa)f4, (double)e2, (double)d5, (double)c2, (float)a2, (RA)g2);
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            float f5;
            float f6;
            float f7;
            if (g2.l()) {
                uKa.e();
                if (n2 > 0) {
                    Ska ska5 = ska2;
                    f7 = (ska5.A.nextFloat() * kta.v - pqa.r) * VPa.i;
                    f6 = (ska5.A.nextFloat() * kta.v - pqa.r) * VPa.i;
                    f5 = (ska5.A.nextFloat() * kta.v - pqa.r) * VPa.i;
                    uKa.J((float)f7, (float)f6, (float)f5);
                }
                uKa.l((float)MQa.L, (float)MQa.L, (float)MQa.L);
                g2.J().J(Xja.GROUND);
                ska2.I.J(mda2, (RA)g2);
                uKa.D();
            } else {
                uKa.e();
                Ska ska6 = g2;
                Ska ska7 = g2;
                ska7.J().J(Xja.GROUND);
                ska2.I.J(mda2, (RA)g2);
                uKa.D();
                f7 = ska6.J().ground.scale.x;
                f6 = ska7.J().ground.scale.y;
                f5 = ska6.J().ground.scale.z;
                uKa.J((float)(JPa.N * f7), (float)(JPa.N * f6), (float)(VPa.D * f5));
            }
            n5 = ++n2;
        }
        uKa.D();
        uKa.E();
        uKa.k();
        ska2.f((vL)f4);
        if (n3 != 0) {
            ((oLa)((Object)ska2.A)).J.J(ska2.J((jFa)f4)).J();
        }
        super.l((vL)f4, (double)e2, (double)d5, (double)c2, (float)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    private int J(Mda mda2) {
        void a2;
        Ska ska2 = this;
        int b2 = vRa.d;
        if (a2.E > QSa.p) {
            b2 = tTa.h;
            return b2;
        }
        if (a2.E > fPa.i) {
            b2 = AQa.P;
            return b2;
        }
        if (a2.E > ERa.C) {
            b2 = yRa.d;
            return b2;
        }
        if (a2.E > vRa.d) {
            b2 = uqa.g;
        }
        return b2;
    }

    public ResourceLocation J(jFa jFa2) {
        Object b2 = jFa2;
        Ska a2 = this;
        b2 = cJ.J((RA)a2.I.J().J(b2.J()));
        if (b2 != null) {
            return b2;
        }
        return WKa.C;
    }

    /*
     * WARNING - void declaration
     */
    public Ska(oLa oLa2, xKa xKa2) {
        void b2;
        Ska a2;
        Ska c2 = xKa2;
        Ska ska2 = a2 = this;
        Ska ska3 = a2;
        super((oLa)b2);
        Ska ska4 = a2;
        ska3.A = new Random();
        ska2.I = c2;
        ska3.I = (xKa)VPa.i;
        ska2.J = wOa.w;
    }
}

