/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AQ
 *  CC
 *  JPa
 *  Lz
 *  Qr
 *  XTa
 *  mka
 *  rP
 *  vRa
 */
import optifine.Config;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class ap_2 {
    public Qr[] I;

    public void J() {
        int a2;
        ap_2 ap_22 = this;
        Qr[] qrArray = new Qr[ap_22.I.length];
        int n2 = a2 = uSa.E;
        while (n2 < ap_22.I.length) {
            int n3 = a2;
            ap_2 ap_23 = ap_22;
            Qr qr = ap_23.I[ap_23.I.length - a2 - vRa.d];
            qrArray[n3] = qr;
            n2 = ++a2;
        }
        ap_22.I = qrArray;
    }

    public ap_2(Qr[] qrArray) {
        Qr[] b2 = qrArray;
        Qr[] a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public ap_2(Qr[] qrArray, float f2, float f3, float f4, float f5, float f6, float f7) {
        void c2;
        void f8;
        void e2;
        void d2;
        void a2;
        void b2;
        Qr[] h2 = qrArray;
        Qr[] g2 = this;
        super(h2);
        float f9 = JPa.N / b2;
        float f10 = JPa.N / a2;
        Qr[] qrArray2 = h2;
        qrArray2[uSa.E] = h2[uSa.E].J((float)(d2 / b2 - f9), (float)(e2 / a2 + f10));
        h2[vRa.d] = h2[vRa.d].J((float)(f8 / b2 + f9), (float)(e2 / a2 + f10));
        qrArray2[uqa.g] = h2[uqa.g].J((float)(f8 / b2 + f9), (float)(c2 / a2 - f10));
        qrArray2[yRa.d] = h2[yRa.d].J((float)(d2 / b2 - f9), (float)(c2 / a2 - f10));
    }

    /*
     * WARNING - void declaration
     */
    public void J(mr mr2, AQ aQ2) {
        int n2;
        void a2;
        void v0;
        Matrix4f b2;
        ap_2 ap_22 = this;
        if (Config.h()) {
            v0 = b2;
            a2.J(XTa.W, CC.J);
        } else {
            a2.J(XTa.W, mka.g);
            v0 = b2;
        }
        rP rP2 = v0.J();
        b2 = rP2.J();
        Vector3f vector3f = new Vector3f();
        Vector3f vector3f2 = ap_2.J(ap_22.I[uSa.E], ap_22.I[vRa.d], ap_22.I[uqa.g]);
        vector3f2 = rP2.J((Vector3fc)vector3f2, vector3f2);
        Qr[] qrArray = ap_22.I;
        int n3 = ap_22.I.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            ap_2 c2 = qrArray[n2];
            vector3f = b2.transformPosition((float)((Qr)c2).I.A, (float)((Qr)c2).I.j, (float)((Qr)c2).I.J, vector3f);
            Vector3f vector3f3 = vector3f2;
            a2.J((double)vector3f.x, (double)vector3f.y, (double)vector3f.z).J((double)((Qr)c2).J, (double)((Qr)c2).A).J(vector3f3.x, vector3f3.y, vector3f2.z).M();
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Vector3f J(Qr qr, Qr qr2, Qr qr3) {
        void a2;
        Qr c2 = qr2;
        Qr b2 = qr;
        Qr qr4 = c2;
        c2 = qr4.I.f(b2.I);
        c2 = qr4.I.f(a2.I).C((Lz)c2).J();
        return new Vector3f((float)c2.A, (float)c2.j, (float)c2.J);
    }

    /*
     * WARNING - void declaration
     */
    public ap_2(Qr[] qrArray, int n2, int n3, int n4, int n5, float f2, float f3) {
        void h2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f4;
        void g2;
        float f5 = f3;
        ap_2 a2 = this;
        a2((Qr[])g2, (float)f4, (float)e2, (float)d2, (float)c2, (float)b2, (float)h2);
    }
}

