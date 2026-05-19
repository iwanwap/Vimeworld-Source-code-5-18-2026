/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  QSa
 *  Qsa
 *  Wsa
 *  bd
 *  lqa
 *  vRa
 *  wra
 *  ysa
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gla_2
implements bd {
    private int[] j;
    private int J;
    private static final String A = "CL_00000956";
    private int I;

    public gla_2() {
        gla_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        gla_2 d2 = this;
        int e2 = n2;
        if (!d2.J(e2, (int)c2, (int)b2, (int)a2)) {
            int n6 = e2 = e2;
            while (n6 < b2) {
                void v1 = c2;
                while (v1 < a2) {
                    void var5_7;
                    int n7 = e2 + var5_7 * d2.J;
                    d2.j[n7] = d2.j[n7] & Wsa.K;
                    v1 = ++var5_7;
                }
                n6 = ++e2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public BufferedImage J(BufferedImage bufferedImage) {
        void a2;
        gla_2 gla_22 = this;
        if (a2 == null) {
            return null;
        }
        gla_2 gla_23 = gla_22;
        void v1 = a2;
        gla_2 gla_24 = gla_22;
        gla_24.J = ysa.s;
        gla_24.I = ysa.s;
        int n2 = v1.getWidth();
        int n3 = v1.getHeight();
        int b2 = vRa.d;
        while (gla_23.J < n2 || gla_22.I < n3) {
            gla_23 = gla_22;
            gla_2 gla_25 = gla_22;
            gla_25.J *= uqa.g;
            gla_25.I *= uqa.g;
            b2 *= uqa.g;
        }
        gla_2 gla_26 = gla_22;
        BufferedImage bufferedImage2 = new BufferedImage(gla_26.J, gla_26.I, uqa.g);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage((Image)a2, uSa.E, uSa.E, null);
        if (a2.getHeight() == fPa.i * b2) {
            graphics.drawImage(bufferedImage2, osa.c * b2, QSa.p * b2, kTa.j * b2, FPa.F * b2, AQa.P * b2, ERa.C * b2, Yqa.i * b2, kTa.j * b2, null);
            graphics.drawImage(bufferedImage2, EPa.O * b2, QSa.p * b2, osa.c * b2, FPa.F * b2, Yqa.i * b2, ERa.C * b2, lqa.s * b2, kTa.j * b2, null);
            graphics.drawImage(bufferedImage2, kTa.j * b2, FPa.F * b2, ERa.C * b2, ysa.s * b2, Yqa.i * b2, kTa.j * b2, lqa.s * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, osa.c * b2, FPa.F * b2, kTa.j * b2, ysa.s * b2, AQa.P * b2, kTa.j * b2, Yqa.i * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, EPa.O * b2, FPa.F * b2, osa.c * b2, ysa.s * b2, uSa.E * b2, kTa.j * b2, AQa.P * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, fPa.i * b2, FPa.F * b2, EPa.O * b2, ysa.s * b2, lqa.s * b2, kTa.j * b2, ERa.C * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, wra.P * b2, QSa.p * b2, Qsa.Ha * b2, FPa.F * b2, Yqa.D * b2, ERa.C * b2, QSa.p * b2, kTa.j * b2, null);
            graphics.drawImage(bufferedImage2, Yqa.D * b2, QSa.p * b2, wra.P * b2, FPa.F * b2, QSa.p * b2, ERa.C * b2, FPa.F * b2, kTa.j * b2, null);
            graphics.drawImage(bufferedImage2, Qsa.Ha * b2, FPa.F * b2, fPa.i * b2, ysa.s * b2, QSa.p * b2, kTa.j * b2, FPa.F * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, wra.P * b2, FPa.F * b2, Qsa.Ha * b2, ysa.s * b2, Yqa.D * b2, kTa.j * b2, QSa.p * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, Yqa.D * b2, FPa.F * b2, wra.P * b2, ysa.s * b2, wra.P * b2, kTa.j * b2, Yqa.D * b2, fPa.i * b2, null);
            graphics.drawImage(bufferedImage2, QSa.p * b2, FPa.F * b2, Yqa.D * b2, ysa.s * b2, FPa.F * b2, kTa.j * b2, Upa.D * b2, fPa.i * b2, null);
        }
        graphics.dispose();
        gla_22.j = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
        gla_2 gla_27 = gla_22;
        gla_27.J(uSa.E, uSa.E, fPa.i * b2, ERa.C * b2);
        gla_27.f(fPa.i * b2, uSa.E, ysa.s * b2, fPa.i * b2);
        gla_27.J(uSa.E, ERa.C * b2, ysa.s * b2, fPa.i * b2);
        gla_27.f(uSa.E, fPa.i * b2, ERa.C * b2, QSa.p * b2);
        gla_27.f(ERa.C * b2, fPa.i * b2, wra.P * b2, QSa.p * b2);
        gla_27.f(wra.P * b2, fPa.i * b2, Upa.D * b2, QSa.p * b2);
        gla_27.f(uSa.E, QSa.p * b2, ERa.C * b2, ysa.s * b2);
        gla_27.J(ERa.C * b2, QSa.p * b2, QSa.p * b2, ysa.s * b2);
        gla_27.f(QSa.p * b2, QSa.p * b2, ysa.s * b2, ysa.s * b2);
        return bufferedImage2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int n2, int n3, int n4, int n5) {
        void b2;
        int e2 = n2;
        gla_2 d2 = this;
        int n6 = e2 = e2;
        while (n6 < b2) {
            void a2;
            void c2;
            void v1 = c2;
            while (v1 < a2) {
                void var5_7;
                if ((d2.j[e2 + var5_7 * d2.J] >> osa.c & osa.Ja) < XOa.h) {
                    return vRa.d != 0;
                }
                v1 = ++var5_7;
            }
            n6 = ++e2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, int n4, int n5) {
        void b2;
        int e2 = n2;
        gla_2 d2 = this;
        int n6 = e2 = e2;
        while (n6 < b2) {
            void a2;
            void c2;
            void v1 = c2;
            while (v1 < a2) {
                void var5_7;
                int n7 = e2 + var5_7 * d2.J;
                d2.j[n7] = d2.j[n7] | gsa.X;
                v1 = ++var5_7;
            }
            n6 = ++e2;
        }
    }

    public void J() {
    }
}

