/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CS
 *  JPa
 *  Kh
 *  TQa
 *  VJa
 *  gT
 *  pqa
 *  sT
 *  uKa
 *  vRa
 */
import java.awt.Color;
import java.awt.image.BufferedImage;

public final class Ws_1
extends gT {
    public final /* synthetic */ CS k;
    private VJa I;

    private void l() {
        int n2;
        Ws_1 ws_1 = this;
        BufferedImage a2 = new BufferedImage(ws_1.j - uqa.g, ws_1.E - uqa.g, uqa.g);
        int n3 = n2 = uSa.E;
        while (n3 < a2.getWidth()) {
            int n4 = Color.HSBtoRGB((float)n2 / ((float)a2.getWidth() * pqa.r), pqa.r, pqa.r);
            int n5 = uSa.E;
            while (n5 < a2.getHeight()) {
                int n6;
                a2.setRGB(n2, n6++, n4);
                n5 = n6;
            }
            n3 = ++n2;
        }
        ws_1.I = new VJa(a2);
    }

    /*
     * WARNING - void declaration
     */
    public Ws_1(CS object, sT sT2, int n2, int n3, int n4, int n5, int n6, String string, float f2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f3;
        void g2;
        void h2;
        Ws_1 i2 = object;
        Object object2 = object = this;
        ((Ws_1)((Object)object2)).k = i2;
        super((CS)i2, (sT)h2, (int)g2, (int)f3, (int)e2, (int)d2, (int)c2, (String)b2, (float)a2);
        super.l();
    }

    public void J() {
        Ws_1 a2;
        Ws_1 ws_1 = a2;
        uKa.C((int)ws_1.I.J());
        Kh.J((int)(ws_1.m + vRa.d), (int)(a2.I + vRa.d), (float)JPa.N, (float)JPa.N, (float)(a2.j - uqa.g), (float)(a2.E - uqa.g), (float)(a2.j - uqa.g), (float)(a2.E - uqa.g));
    }

    public void f() {
        Ws_1 a2;
        Ws_1 ws_1 = a2;
        a2.i = a2.A + Xpa.E + (int)(a2.J * CRa.ja) + TQa.L;
    }
}

