/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  JPa
 *  Kpa
 *  Lra
 *  MJa
 *  MQa
 *  Ola
 *  RQa
 *  SOa
 *  SQa
 *  Usa
 *  Uta
 *  XTa
 *  aKa
 *  aLa
 *  dQa
 *  kpa
 *  kta
 *  mka
 *  pKa
 *  pqa
 *  uKa
 *  vPa
 *  vRa
 *  wOa
 *  xJa
 */
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.util.ResourceLocation;

public final class HLa_2
extends Ola<jY> {
    private static final ResourceLocation j = new ResourceLocation(Uta.N);
    public FloatBuffer J = xJa.J((int)ERa.C);
    private static final ResourceLocation A = new ResourceLocation(Cra.t);
    private static final Random I = new Random(tSa.u);

    public HLa_2() {
        HLa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(jY jY2, double d2, double d3, double d4, float f2, int n2) {
        int n3;
        HLa_2 hLa_2;
        HLa_2 hLa_22 = hLa_2 = this;
        float f3 = (float)((RKa)((Object)hLa_22.I)).I;
        float b2 = (float)((RKa)((Object)hLa_22.I)).j;
        float a2 = (float)((RKa)((Object)hLa_22.I)).M;
        uKa.L();
        I.setSeed(tSa.u);
        float f4 = wOa.w;
        int n4 = n3 = uSa.E;
        while (n4 < ERa.C) {
            void c2;
            void e2;
            void d5;
            uKa.e();
            float f5 = ERa.C - n3;
            float f6 = rRa.T;
            float f7 = pqa.r / (f5 + pqa.r);
            if (n3 == 0) {
                hLa_2.J(j);
                f7 = Nra.e;
                f5 = vRa.Q;
                f6 = Mqa.N;
                uKa.B();
                uKa.f((int)Lra.k, (int)kpa.J);
            }
            if (n3 >= vRa.d) {
                hLa_2.J(A);
            }
            if (n3 == vRa.d) {
                uKa.B();
                uKa.f((int)vRa.d, (int)vRa.d);
                f6 = MQa.L;
            }
            float f8 = (float)(-(d5 + (double)f4));
            float f9 = f8 + (float)aLa.J().j;
            float g2 = f8 + f5 + (float)aLa.J().j;
            g2 = f9 / g2;
            g2 = (float)(d5 + (double)f4) + g2;
            uKa.J((float)f3, (float)g2, (float)a2);
            uKa.J((MJa)MJa.S, (int)lTa.e);
            uKa.J((MJa)MJa.T, (int)lTa.e);
            uKa.J((MJa)MJa.R, (int)lTa.e);
            uKa.J((MJa)MJa.Q, (int)lQa.x);
            uKa.J((MJa)MJa.S, (int)Usa.t, (FloatBuffer)hLa_2.J(pqa.r, JPa.N, JPa.N, JPa.N));
            uKa.J((MJa)MJa.T, (int)Usa.t, (FloatBuffer)hLa_2.J(JPa.N, JPa.N, pqa.r, JPa.N));
            uKa.J((MJa)MJa.R, (int)Usa.t, (FloatBuffer)hLa_2.J(JPa.N, JPa.N, JPa.N, pqa.r));
            uKa.J((MJa)MJa.Q, (int)qsa.Ga, (FloatBuffer)hLa_2.J(JPa.N, pqa.r, JPa.N, JPa.N));
            uKa.f((MJa)MJa.S);
            uKa.f((MJa)MJa.T);
            uKa.f((MJa)MJa.R);
            uKa.f((MJa)MJa.Q);
            uKa.D();
            uKa.G((int)RQa.j);
            uKa.e();
            uKa.y();
            uKa.J((float)JPa.N, (float)((float)(Kpa.J() % sqa.F) / SOa.Ja), (float)JPa.N);
            float f10 = f6;
            uKa.l((float)f10, (float)f10, (float)f10);
            uKa.J((float)MQa.L, (float)MQa.L, (float)JPa.N);
            int n5 = n3;
            uKa.J((float)((float)(n5 * n5 * dQa.ja + n3 * WOa.fa) * kta.v), (float)JPa.N, (float)JPa.N, (float)pqa.r);
            uKa.J((float)vPa.b, (float)vPa.b, (float)JPa.N);
            uKa.J((float)(-f3), (float)(-a2), (float)(-b2));
            f9 = f8 + (float)aLa.J().j;
            uKa.J((float)((float)aLa.J().A * f5 / f9), (float)((float)aLa.J().J * f5 / f9), (float)(-b2));
            pKa pKa2 = pKa.J();
            aKa aKa2 = pKa2.J();
            aKa2.J(XTa.W, mka.I);
            f8 = (I.nextFloat() * MQa.L + Nra.e) * f7;
            f9 = (I.nextFloat() * MQa.L + Xpa.R) * f7;
            g2 = (I.nextFloat() * MQa.L + MQa.L) * f7;
            if (n3 == 0) {
                f9 = g2 = pqa.r * f7;
                f8 = g2;
            }
            aKa aKa3 = aKa2;
            void v5 = e2;
            aKa aKa4 = aKa2;
            aKa4.J((double)e2, (double)(d5 + (double)f4), (double)c2).J(f8, f9, g2, pqa.r).M();
            aKa4.J((double)e2, (double)(d5 + (double)f4), (double)(c2 + oua.i)).J(f8, f9, g2, pqa.r).M();
            aKa3.J((double)(v5 + oua.i), (double)(d5 + (double)f4), (double)(c2 + oua.i)).J(f8, f9, g2, pqa.r).M();
            aKa3.J((double)(v5 + oua.i), (double)(d5 + (double)f4), (double)c2).J(f8, f9, g2, pqa.r).M();
            pKa2.J();
            uKa.D();
            uKa.G((int)SQa.ca);
            hLa_2.J(j);
            n4 = ++n3;
        }
        uKa.k();
        uKa.J((MJa)MJa.S);
        uKa.J((MJa)MJa.T);
        uKa.J((MJa)MJa.R);
        uKa.J((MJa)MJa.Q);
        uKa.P();
    }

    /*
     * WARNING - void declaration
     */
    private FloatBuffer J(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f6 = f5;
        HLa_2 a2 = this;
        Buffer buffer = a2.J.clear();
        HLa_2 hLa_2 = a2;
        a2.J.put((float)d2).put((float)c2).put((float)b2).put((float)e2);
        hLa_2.J.flip();
        return hLa_2.J;
    }
}

