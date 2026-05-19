/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NQa
 *  Oz
 */
import java.awt.Color;
import java.awt.color.ColorSpace;

public final class rc
extends Color {
    public rc(int n2) {
        int b2 = n2;
        rc a2 = this;
        super(b2);
    }

    /*
     * WARNING - void declaration
     */
    public rc lerp(rc rc2, double d2) {
        void a2;
        rc b2;
        rc c22 = rc2;
        rc rc3 = b2 = this;
        int n2 = (int)((double)rc3.getRed() + (double)(c22.getRed() - b2.getRed()) * a2);
        int n3 = (int)((double)rc3.getGreen() + (double)(c22.getGreen() - b2.getGreen()) * a2);
        int n4 = (int)((double)rc3.getBlue() + (double)(c22.getBlue() - b2.getBlue()) * a2);
        int c22 = (int)((double)rc3.getAlpha() + (double)(c22.getAlpha() - b2.getAlpha()) * a2);
        return new rc(rc.clamp(n2), rc.clamp(n3), rc.clamp(n4), rc.clamp(c22));
    }

    /*
     * WARNING - void declaration
     */
    public rc(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        rc a2 = this;
        super((float)c2, (float)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public rc(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f6 = f5;
        rc a2 = this;
        super((float)d2, (float)c2, (float)b2, (float)e2);
    }

    private static int clamp(int a2) {
        return Oz.f((int)a2, (int)uSa.E, (int)osa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    public rc(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        rc a2 = this;
        super(rc.clamp((int)c2), rc.clamp((int)b2), rc.clamp(d2), osa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    public rc(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n6 = n5;
        rc a2 = this;
        super(rc.clamp((int)d2), rc.clamp((int)c2), rc.clamp((int)b2), rc.clamp((int)e2));
    }

    /*
     * WARNING - void declaration
     */
    public rc(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        rc a2 = this;
        super((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public rc(ColorSpace colorSpace, float[] fArray, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        rc a2 = this;
        super((ColorSpace)c2, (float[])b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public rc transparent(float f2) {
        void a2;
        rc rc2 = this;
        int b2 = (int)a2 * osa.Ja;
        if (rc2.getAlpha() - b2 <= tTa.h) {
            return rc2;
        }
        return new rc(rc2.getRed(), rc2.getGreen(), rc2.getBlue(), (int)(a2 * NQa.Y));
    }
}

