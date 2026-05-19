/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kE
implements D {
    private final int offsetX;
    private final int offsetY;
    private final boolean sampling;
    private final int charHeight;
    private final int charWidth;

    public int C() {
        kE a2;
        return a2.charHeight;
    }

    /*
     * WARNING - void declaration
     */
    public kE(int n2, int n3, int n4, int n5, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        kE a2;
        boolean bl2 = bl;
        kE kE2 = a2 = this;
        kE kE3 = a2;
        a2.offsetX = e2;
        kE3.offsetY = d2;
        kE3.charWidth = c2;
        kE2.charHeight = b2;
        kE2.sampling = f2;
    }

    public int l() {
        kE a2;
        return a2.offsetX;
    }

    public boolean J() {
        kE a2;
        return a2.sampling;
    }

    public int f() {
        kE a2;
        return a2.charWidth;
    }

    public int J() {
        kE a2;
        return a2.offsetY;
    }
}

