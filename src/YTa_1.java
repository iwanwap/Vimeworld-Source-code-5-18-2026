/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  Epa
 *  Kpa
 *  Lz
 *  NPa
 *  Oz
 *  WTa
 *  YTa
 *  aSa
 *  fpa
 *  hTa
 *  kta
 *  mTa
 *  uRa
 */
public final class YTa_1
implements D {
    public double x;
    public double rotationPitch;
    public static Kpa mc = Kpa.J();
    public double z;
    public double roll;
    public double rotationYaw;
    public double y;
    public double zoom;

    public String toString() {
        YTa_1 a2;
        return new StringBuilder().insert(3 & 4, Eqa.Q).append(a2.x).append(hTa.g).append(a2.y).append(NPa.h).append(a2.z).append(rSa.T).append(a2.rotationYaw).append(Epa.G).append(a2.rotationPitch).append(uRa.a).append(a2.roll).append(DPa.g).append(a2.zoom).toString();
    }

    /*
     * WARNING - void declaration
     */
    public YTa J(YTa yTa, double d2) {
        void a2;
        YTa_1 c2 = yTa;
        YTa_1 b2 = this;
        return new YTa_1(b2.x + (c2.x - b2.x) * a2, b2.y + (c2.y - b2.y) * a2, b2.z + (c2.z - b2.z) * a2, b2.rotationYaw + (c2.rotationYaw - b2.rotationYaw) * a2, b2.rotationPitch + (c2.rotationPitch - b2.rotationPitch) * a2, b2.roll + (c2.roll - b2.roll) * a2, b2.zoom + (c2.zoom - b2.zoom) * a2);
    }

    public YTa_1() {
        YTa_1 a2;
        a2.x = YTa_1.mc.c.la;
        a2.y = YTa_1.mc.c.Z;
        a2.z = YTa_1.mc.c.A;
        a2.rotationYaw = YTa_1.mc.c.t;
        a2.rotationPitch = YTa_1.mc.c.d;
        a2.roll = mTa.j;
        a2.zoom = WTa.m;
    }

    public YTa J() {
        YTa_1 a2;
        return new YTa_1(a2.x, a2.y, a2.z, a2.rotationYaw, a2.rotationPitch, a2.roll, a2.zoom);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Lz lz2, float f2, float f3, double d2) {
        void c2;
        void a2;
        void d3;
        float e2 = f3;
        YTa_1 b2 = this;
        void v0 = d3;
        double d4 = v0.A - b2.x;
        double d5 = v0.J - b2.z;
        double d6 = v0.j - b2.y;
        double d7 = d4;
        double d8 = d5;
        double d9 = Math.sqrt(d7 * d7 + d8 * d8);
        d4 = Math.atan2(d5, d4) * kta.Da / lQa.f - fpa.ba;
        d5 = -(Math.atan2(d6, d9) * kta.Da / lQa.f);
        YTa_1 yTa_1 = b2;
        yTa_1.rotationPitch = yTa_1.J(yTa_1.rotationPitch, d5, (double)e2, (double)a2);
        b2.rotationYaw = yTa_1.J(yTa_1.rotationYaw, d4, (double)c2, (double)a2);
    }

    private double J(double d2, double c2, double b2, double a2) {
        double d3;
        double d4;
        c2 = Oz.J((double)(c2 - d2));
        if (d4 > aSa.V) {
            c2 = Math.min(Math.abs(c2 * a2), c2);
            d3 = d2;
        } else {
            c2 = Math.max(-Math.abs(c2 * a2), c2);
            d3 = d2;
        }
        return d3 + c2;
    }

    public YTa_1(double g, double f2, double e2, double d2, double c2, double b2, double a2) {
        YTa_1 h;
        YTa_1 yTa_1 = h;
        YTa_1 yTa_12 = h;
        YTa_1 yTa_13 = h;
        h.x = g;
        yTa_13.y = f2;
        yTa_13.z = e2;
        yTa_12.rotationYaw = d2;
        yTa_12.rotationPitch = c2;
        yTa_1.roll = b2;
        yTa_1.zoom = a2;
    }
}

