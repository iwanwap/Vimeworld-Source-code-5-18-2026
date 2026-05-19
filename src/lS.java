/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Gua
 *  JPa
 *  Kd
 *  Le
 *  PF
 *  QF
 *  Rua
 *  Zta
 *  bt
 *  if
 *  lPa
 *  pqa
 *  tS
 *  vRa
 */
import java.awt.Color;
import java.util.Locale;
import org.lwjgl.input.Mouse;

public final class lS
extends QF {
    private final int C;
    private final String i;
    private final String M;
    private final float k;
    private boolean j;
    private final float J;
    private final tS A;
    private final float I;

    private float J() {
        lS lS2 = this;
        lS a2 = lS2.A.J().J();
        if (Gua.x.equals(lS2.i)) {
            return ((bt)a2).translate[lS2.C];
        }
        if (Rua.C.equals(lS2.i)) {
            return ((bt)a2).scale[lS2.C];
        }
        return ((bt)a2).rotate[lS2.C];
    }

    /*
     * WARNING - void declaration
     */
    public lS(tS tS2, String string, int n2, String string2, float f2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        lS g2;
        lS h2 = tS2;
        lS lS2 = g2 = this;
        lS lS3 = g2;
        lS lS4 = g2;
        super(uSa.E, uSa.E, (int)h2.l(), yOa.B, (Color)Bc.Ja, null, (Color)Bc.Za);
        g2.A = h2;
        lS4.i = f5;
        lS4.C = e2;
        lS3.M = d2;
        lS3.J = c2;
        lS2.k = b2;
        lS2.I = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a22;
        lS b2;
        int c322 = n2;
        lS lS2 = b2 = this;
        lS2.k = (float)lS2.A.l();
        lS2.f(c322, (int)a22);
        if (!Mouse.isButtonDown(uSa.E)) {
            b2.j = uSa.E;
        }
        if (b2.j) {
            b2.J(c322);
        }
        lS lS3 = b2;
        lS lS4 = b2;
        lS lS5 = b2;
        if.J((double)lS3.I, (double)lS4.J, (double)b2.k, (double)b2.j, (Color)lS5.j, (Color)lS5.I, (Kd)Kd.XXS_X2);
        float c322 = lS4.J();
        lS lS6 = b2;
        double d2 = (double)((c322 - b2.J) / (lS6.k - lS6.J)) * b2.k;
        if.J((double)Math.min((double)(lS3.I + b2.k - DPa.Aa), Math.max((double)(b2.I + oua.i), (double)(b2.I + d2 - Wqa.Z))), (double)(b2.J + oua.i), (double)Zta.ba, (double)Zta.ba, (Color)Bc.sb, (Color)Bc.Da, (Kd)Kd.XXS_X2);
        Ii a22 = Le.J((PF)PF.VIME_ART, (int)yOa.B);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = b2.M;
        objectArray[vRa.d] = Float.valueOf(c322);
        String c322 = String.format(Locale.US, wua.u, objectArray);
        a22.J(c322, (int)(b2.I + lPa.K), (int)(b2.J + b2.j / KPa.y - (double)(a22.J(c322) / uqa.g)), Bc.Ba.getRGB(), uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void d2;
        void e2;
        boolean bl2 = bl;
        lS a2 = this;
        if (e2 == false) {
            return;
        }
        a2.j = vRa.d;
        a2.J((int)d2);
    }

    private void J(int n2) {
        int b22 = n2;
        lS a2 = this;
        float b22 = Math.max(JPa.N, Math.min(pqa.r, (float)(((double)b22 - a2.I) / a2.k)));
        lS lS2 = a2;
        lS lS3 = a2;
        b22 = lS2.J + (lS3.k - a2.J) * b22;
        b22 = (float)Math.round(b22 / a2.I) * a2.I;
        lS lS4 = a2;
        lS2.A.J().J(lS4.i, lS4.C, b22);
        lS3.A.J().f(uSa.E != 0);
    }
}

