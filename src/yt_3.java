/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Bsa
 *  ERa
 *  FPa
 *  Kd
 *  LQa
 *  QF
 *  XTa
 *  Zta
 *  aSa
 *  hqa
 *  iS
 *  if
 *  rt
 *  vRa
 *  zU
 */
import java.awt.Color;
import org.lwjgl.input.Mouse;

public final class yt_3
extends QF {
    private final lu j;
    private final double[] J;
    private final nu A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        boolean bl3 = bl2;
        yt_3 a2 = this;
        if (e2 == false) {
            return;
        }
        a2.I = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        int c222;
        void b2;
        int c222 = n3;
        yt_3 a2 = this;
        a2.f((int)b2, c222);
        if (!Mouse.isButtonDown(uSa.E) && a2.I) {
            a2.I = uSa.E;
        }
        if (a2.I) {
            double d2 = JC.J(Math.max(aSa.V, Math.min(oua.i, ((double)b2 - a2.I) / a2.k)), a2.J) * a2.j.f();
            a2.j.J((Double)d2);
            jU c222 = zU.M.J();
            cw cw2 = c222.J(nu.J(a2.A).J());
            if (cw2 == null) {
                c222 = zU.M.J(iS.MINIDOT_GUI);
                cw2 = c222.J(nu.J(a2.A).J());
            }
            if (cw2 != null) {
                rt rt2 = cw2.A;
                rt2.J(a2.j.f()).J((Object)d2);
                c222.J(cw2.J, cw2.I, rt2, vRa.d != 0);
            }
        }
        yt_3 yt_32 = a2;
        yt_32.k = yt_32.A.l() - Zta.ba;
        yt_3 yt_33 = a2;
        if.J((double)yt_32.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)((Object)yt_33.j), (Color)yt_33.I, (Kd)Kd.XXS_X2);
        double[] dArray = yt_32.J;
        int n4 = yt_32.J.length;
        int n5 = c222 = uSa.E;
        while (n5 < n4) {
            double d3 = dArray[c222];
            if (d3 != aSa.V && d3 != oua.i) {
                if.f((double)(a2.I + d3 * a2.k), (double)(a2.J + KPa.y), (double)KPa.y, (double)(a2.j - FPa.T), (Color)Bc.Ga);
            }
            n5 = ++c222;
        }
        yt_3 yt_34 = a2;
        double d4 = (Double)yt_34.j.J() / a2.j.f() * a2.k;
        if.J((double)Math.min((double)(yt_34.I + a2.k - rua.g), Math.max((double)(a2.I + KPa.y), (double)(a2.I + d4 - hQa.x))), (double)(a2.J + a2.j / KPa.y - hQa.x), (double)zOa.y, (double)zOa.y, (Color)Bc.sb, (Color)Bc.Da, (Kd)Kd.XS_X2);
    }

    /*
     * WARNING - void declaration
     */
    public yt_3(nu nu2, lu lu2) {
        void a2;
        yt_3 b2;
        QF c2 = nu2;
        yt_3 yt_32 = b2 = this;
        super(uSa.E, uSa.E, (int)(c2.l() - Zta.ba), ERa.C, (Color)Bc.Ja, null, (Color)Bc.Za);
        b2.I = uSa.E;
        double[] dArray = new double[WOa.fa];
        dArray[uSa.E] = aSa.V;
        dArray[vRa.d] = fqa.ca;
        dArray[uqa.g] = VPa.W;
        dArray[yRa.d] = ERa.y;
        dArray[AQa.P] = kTa.B;
        dArray[tTa.h] = LQa.b;
        dArray[uua.p] = Bsa.x;
        dArray[XTa.W] = hqa.Ka;
        dArray[Yqa.i] = oua.i;
        b2.J = dArray;
        yt_32.A = c2;
        yt_32.j = a2;
    }
}

