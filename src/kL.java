/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  fi
 *  pqa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class kL {
    public long i;
    private static final b M;
    private float k;
    private K j;
    private b J;
    private b A;
    private static final b I;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float f() {
        kL kL2;
        kL kL3 = this;
        if (kL3.i != nqa.i) {
            float f2;
            float a2 = pqa.r - (float)(kL3.i - OT.e) / kL3.k;
            if (!(f2 >= pqa.r)) return kL.J(kL3.J.J(), kL3.A.J(), kL3.j.J(a2));
            kL2 = kL3;
            kL kL4 = kL3;
            kL3.J = kL3.A;
            kL4.A = null;
            kL3.j = null;
            kL4.i = nqa.i;
            return kL2.J.J();
        } else {
            kL2 = kL3;
        }
        return kL2.J.J();
    }

    public void J(b b2) {
        kL a2;
        b b3 = b2;
        kL kL2 = a2 = this;
        a2.i = nqa.i;
        kL2.A = null;
        kL2.J = b3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(b b2, int n2, K k2) {
        void b3;
        void c2;
        K d2 = k2;
        kL a2 = this;
        a2.J((b)c2, (int)b3, d2, OT.e);
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, K k2) {
        void b2;
        void c2;
        K d2 = k2;
        kL a2 = this;
        a2.J((b)fi.J((float)c2), (int)b2, d2, OT.e);
    }

    public void J(float f2) {
        float b2 = f2;
        kL a2 = this;
        a2.J((b)fi.J((float)b2));
    }

    static {
        I = new fi(JPa.N);
        M = new fi(pqa.r);
    }

    public static kL f() {
        return new kL(M);
    }

    public boolean J() {
        kL a2;
        if (a2.i != nqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4) {
        void b2;
        float c2 = f4;
        float a2 = f2;
        return a2 * (pqa.r - c2) + b2 * c2;
    }

    public float J() {
        kL a2;
        if (a2.i != nqa.i) {
            return a2.A.J();
        }
        return a2.J.J();
    }

    public b J() {
        kL a2;
        if (a2.i != nqa.i) {
            return a2.A;
        }
        return a2.J;
    }

    public kL(b b2) {
        b b3 = b2;
        kL a2 = this;
        a2.J = b3;
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, int n2, K k2, long l2) {
        void a2;
        void c2;
        void d2;
        K e2 = k2;
        kL b2 = this;
        b2.J((b)fi.J((float)d2), (int)c2, e2, (long)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(b b2, int n2, K k2, long l2) {
        void b3;
        void d2;
        void a2;
        int e2 = n2;
        kL c2 = this;
        if (c2.i != nqa.i) {
            c2.J = fi.J((float)c2.f());
        }
        kL kL2 = c2;
        c2.i = a2 + (long)e2;
        kL2.k = e2;
        kL2.A = d2;
        c2.j = b3;
    }

    public static kL J() {
        return new kL(I);
    }

    public kL(float f2) {
        float b2 = f2;
        kL a2 = this;
        a2.J = fi.J((float)b2);
    }
}

