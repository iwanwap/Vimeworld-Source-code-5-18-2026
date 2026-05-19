/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AJa
 *  Cf
 *  Cla
 */
import java.util.Iterator;

public final class lc
implements Iterator<Cla> {
    private Cf J;
    private cB A;
    private AJa I;

    @Override
    public void remove() {
        throw new RuntimeException(ppa.Z);
    }

    public Cla J() {
        lc lc2;
        lc lc3 = lc2 = this;
        Object a2 = lc3.A.J();
        lc3.J.setXyz(a2.getX() << AQa.P, a2.getY() << AQa.P, a2.getZ() << AQa.P);
        return lc3.I.J((XF)lc2.J);
    }

    /*
     * WARNING - void declaration
     */
    public lc(AJa aJa2, XF xF, XF xF2, int n2, int n3) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        lc a2;
        int n4 = n3;
        lc lc2 = a2 = this;
        lc lc3 = a2;
        lc2.J = new Cf(uSa.E, uSa.E, uSa.E);
        lc2.I = e2;
        lc2.A = new cB((XF)d2, (XF)c2, (int)b2, (int)f2);
    }

    @Override
    public boolean hasNext() {
        lc a2;
        return a2.A.hasNext();
    }
}

