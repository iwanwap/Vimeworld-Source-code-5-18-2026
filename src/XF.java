/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IX
 *  Lz
 *  MD
 *  Oz
 *  RPa
 *  aSa
 *  dQa
 *  qY
 *  vL
 *  vRa
 *  ysa
 */
public class XF
extends MD {
    private static final long Y_MASK;
    private static final int NUM_X_BITS;
    private static final int X_SHIFT;
    private static final int Y_SHIFT;
    private static final long Z_MASK;
    private static final long X_MASK;
    private static final int NUM_Z_BITS;
    private static final int NUM_Y_BITS;
    public static final XF ORIGIN;

    public XF(double c2, double b2, double a2) {
        super(c2, b2, a2);
        XF d2;
    }

    public static Iterable<XF> getAllInBox(XF xF, XF xF2) {
        XF b2 = xF2;
        XF a2 = xF;
        XF xF3 = new XF(Math.min(a2.getX(), b2.getX()), Math.min(a2.getY(), b2.getY()), Math.min(a2.getZ(), b2.getZ()));
        b2 = new XF(Math.max(a2.getX(), b2.getX()), Math.max(a2.getY(), b2.getY()), Math.max(a2.getZ(), b2.getZ()));
        return new qY(xF3, b2);
    }

    public XF add(MD mD) {
        XF b2 = mD;
        XF a2 = this;
        if (b2.getX() == 0 && b2.getY() == 0 && b2.getZ() == 0) {
            return a2;
        }
        return new XF(a2.getX() + b2.getX(), a2.getY() + b2.getY(), a2.getZ() + b2.getZ());
    }

    public XF east() {
        XF a2;
        return a2.east(vRa.d);
    }

    public XF up(int n2) {
        int b2 = n2;
        XF a2 = this;
        return a2.offset(DZ.UP, b2);
    }

    public XF down(int n2) {
        int b2 = n2;
        XF a2 = this;
        return a2.offset(DZ.DOWN, b2);
    }

    public XF add(double c2, double b2, double a2) {
        XF d2;
        if (c2 == aSa.V && b2 == aSa.V && a2 == aSa.V) {
            return d2;
        }
        return new XF((double)d2.getX() + c2, (double)d2.getY() + b2, (double)d2.getZ() + a2);
    }

    public XF south() {
        XF a2;
        return a2.south(vRa.d);
    }

    public static Iterable<zz> getAllInBoxMutable(XF xF, XF xF2) {
        XF b2 = xF2;
        XF a2 = xF;
        XF xF3 = new XF(Math.min(a2.getX(), b2.getX()), Math.min(a2.getY(), b2.getY()), Math.min(a2.getZ(), b2.getZ()));
        b2 = new XF(Math.max(a2.getX(), b2.getX()), Math.max(a2.getY(), b2.getY()), Math.max(a2.getZ(), b2.getZ()));
        return new IX(xF3, b2);
    }

    /*
     * WARNING - void declaration
     */
    public XF offset(DZ dZ2, int n2) {
        void b2;
        int c2 = n2;
        XF a2 = this;
        if (c2 == 0) {
            return a2;
        }
        return new XF(a2.getX() + b2.getFrontOffsetX() * c2, a2.getY() + b2.getFrontOffsetY() * c2, a2.getZ() + b2.getFrontOffsetZ() * c2);
    }

    public XF north() {
        XF a2;
        return a2.north(vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public XF add(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        XF a2 = this;
        if (c2 == false && b2 == false && d2 == 0) {
            return a2;
        }
        return new XF(a2.getX() + c2, a2.getY() + b2, a2.getZ() + d2);
    }

    static {
        ORIGIN = new XF(uSa.E, uSa.E, uSa.E);
        NUM_Z_BITS = NUM_X_BITS = vRa.d + Oz.J((int)Oz.C((int)RPa.Da));
        NUM_Y_BITS = ysa.s - NUM_X_BITS - NUM_Z_BITS;
        Y_SHIFT = uSa.E + NUM_Z_BITS;
        X_SHIFT = Y_SHIFT + NUM_Y_BITS;
        X_MASK = (dQa.Ga << NUM_X_BITS) - dQa.Ga;
        Y_MASK = (dQa.Ga << NUM_Y_BITS) - dQa.Ga;
        Z_MASK = (dQa.Ga << NUM_Z_BITS) - dQa.Ga;
    }

    public XF north(int n2) {
        int b2 = n2;
        XF a2 = this;
        return a2.offset(DZ.NORTH, b2);
    }

    public XF crossProduct(MD mD) {
        XF b2 = mD;
        XF a2 = this;
        return new XF(a2.getY() * b2.getZ() - a2.getZ() * b2.getY(), a2.getZ() * b2.getX() - a2.getX() * b2.getZ(), a2.getX() * b2.getY() - a2.getY() * b2.getX());
    }

    public XF offset(DZ dZ2) {
        Object b2 = dZ2;
        XF a2 = this;
        return a2.offset((DZ)((Object)b2), vRa.d);
    }

    public XF(vL vL2) {
        XF b2 = vL2;
        XF a2 = this;
        a2(((vL)b2).la, ((vL)b2).Z, ((vL)b2).A);
    }

    public XF down() {
        XF a2;
        return a2.down(vRa.d);
    }

    public long toLong() {
        XF a2;
        return ((long)a2.getX() & X_MASK) << X_SHIFT | ((long)a2.getY() & Y_MASK) << Y_SHIFT | ((long)a2.getZ() & Z_MASK) << uSa.E;
    }

    public XF south(int n2) {
        int b2 = n2;
        XF a2 = this;
        return a2.offset(DZ.SOUTH, b2);
    }

    public XF west() {
        XF a2;
        return a2.west(vRa.d);
    }

    public XF up() {
        XF a2;
        return a2.up(vRa.d);
    }

    public XF subtract(MD mD) {
        XF b2 = mD;
        XF a2 = this;
        if (b2.getX() == 0 && b2.getY() == 0 && b2.getZ() == 0) {
            return a2;
        }
        return new XF(a2.getX() - b2.getX(), a2.getY() - b2.getY(), a2.getZ() - b2.getZ());
    }

    public XF(MD mD) {
        XF b2 = mD;
        XF a2 = this;
        a2(b2.getX(), b2.getY(), b2.getZ());
    }

    public static XF fromLong(long a2) {
        int n2 = (int)(a2 << ysa.s - X_SHIFT - NUM_X_BITS >> ysa.s - NUM_X_BITS);
        int n3 = (int)(a2 << ysa.s - Y_SHIFT - NUM_Y_BITS >> ysa.s - NUM_Y_BITS);
        int n4 = (int)(a2 << ysa.s - NUM_Z_BITS >> ysa.s - NUM_Z_BITS);
        return new XF(n2, n3, n4);
    }

    public XF(Lz lz2) {
        XF b2 = lz2;
        XF a2 = this;
        a2(((Lz)b2).A, ((Lz)b2).j, ((Lz)b2).J);
    }

    /*
     * WARNING - void declaration
     */
    public XF(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        XF a2 = this;
        super((int)c2, (int)b2, d2);
    }

    public XF east(int n2) {
        int b2 = n2;
        XF a2 = this;
        return a2.offset(DZ.EAST, b2);
    }

    public XF west(int n2) {
        int b2 = n2;
        XF a2 = this;
        return a2.offset(DZ.WEST, b2);
    }
}

