/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  Mf
 *  Oz
 *  vRa
 */
public final class Cf_1
extends XF {
    private Cf[] facings;
    private int mz;
    private int mx;
    private int level;
    private boolean needsUpdate;
    private int my;

    public int getX() {
        Cf_1 a2;
        return a2.mx;
    }

    /*
     * WARNING - void declaration
     */
    public void setXyz(int n2, int n3, int n4) {
        void b2;
        void c2;
        Cf_1 a2;
        int d2 = n4;
        Cf_1 cf_1 = a2 = this;
        a2.mx = c2;
        cf_1.my = b2;
        cf_1.mz = d2;
        cf_1.needsUpdate = vRa.d;
    }

    public void setXyz(double c2, double b2, double a2) {
        Cf_1 d2;
        d2.setXyz(Oz.f((double)c2), Oz.f((double)b2), Oz.f((double)a2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public XF offset(DZ dZ2, int n2) {
        void b2;
        int c2 = n2;
        Cf_1 a2 = this;
        if (c2 == vRa.d) {
            return a2.offset((DZ)b2);
        }
        return super.offset((DZ)b2, c2);
    }

    public int getY() {
        Cf_1 a2;
        return a2.my;
    }

    /*
     * WARNING - void declaration
     */
    public Cf_1(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        Cf_1 a2;
        int n6 = n5;
        Cf_1 cf_1 = a2 = this;
        Cf_1 cf_12 = a2;
        super(uSa.E, uSa.E, uSa.E);
        cf_12.mx = d2;
        cf_12.my = c2;
        cf_1.mz = b2;
        cf_1.level = e2;
    }

    @Override
    public XF offset(DZ dZ2) {
        int n2;
        Object object;
        DZ b22 = dZ2;
        Cf_1 a2 = this;
        if (a2.level <= 0) {
            return super.offset(b22, vRa.d);
        }
        if (a2.facings == null) {
            a2.facings = new Cf_1[DZ.VALUES.length];
        }
        if (a2.needsUpdate) {
            a2.update();
        }
        if ((object = a2.facings[n2 = b22.getIndex()]) == null) {
            Cf_1 cf_1 = a2;
            int n3 = cf_1.mx + b22.getFrontOffsetX();
            int n4 = cf_1.my + b22.getFrontOffsetY();
            int b22 = cf_1.mz + b22.getFrontOffsetZ();
            cf_1.facings[n2] = object = new Cf_1(n3, n4, b22, a2.level - vRa.d);
        }
        return object;
    }

    private void update() {
        int n2;
        Cf_1 cf_1 = this;
        int n3 = n2 = uSa.E;
        while (n3 < uua.p) {
            Cf cf2 = cf_1.facings[n2];
            if (cf2 != null) {
                DZ a22 = DZ.VALUES[n2];
                Cf_1 cf_12 = cf_1;
                int n4 = cf_12.mx + a22.getFrontOffsetX();
                int n5 = cf_12.my + a22.getFrontOffsetY();
                int a22 = cf_12.mz + a22.getFrontOffsetZ();
                cf2.setXyz(n4, n5, a22);
            }
            n3 = ++n2;
        }
        cf_1.needsUpdate = uSa.E;
    }

    public static Iterable getAllInBoxMutable(XF xF2, XF xF3) {
        XF b2 = xF3;
        XF a2 = xF2;
        XF xF4 = new XF(Math.min(a2.getX(), b2.getX()), Math.min(a2.getY(), b2.getY()), Math.min(a2.getZ(), b2.getZ()));
        b2 = new XF(Math.max(a2.getX(), b2.getX()), Math.max(a2.getY(), b2.getY()), Math.max(a2.getZ(), b2.getZ()));
        return new Mf(xF4, b2);
    }

    public XF getImmutable() {
        Cf_1 a2;
        return new XF(a2.getX(), a2.getY(), a2.getZ());
    }

    public int getZ() {
        Cf_1 a2;
        return a2.mz;
    }

    public Cf_1(double c2, double b2, double a2) {
        d2(Oz.f((double)c2), Oz.f((double)b2), Oz.f((double)a2));
        Cf_1 d2;
    }

    /*
     * WARNING - void declaration
     */
    public Cf_1(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Cf_1 a2 = this;
        a2((int)c2, (int)b2, d2, uSa.E);
    }
}

