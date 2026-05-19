/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  Lz
 *  NTa
 *  Ob
 *  aSa
 *  pua
 *  vRa
 *  wra
 */
import java.util.Iterator;

public final class cB
implements Iterator<XF> {
    private static final int m = 0;
    private int C;
    private Ob i;
    private Cf M;
    private static final int k = 1;
    private int j;
    private int J;
    private static final int A = 2;
    private int I;

    @Override
    public boolean hasNext() {
        cB a2;
        return a2.i.hasNext();
    }

    @Override
    public void remove() {
        throw new RuntimeException(sOa.ga);
    }

    public static void main(String[] stringArray) {
        String[] stringArray2 = stringArray;
        Object object = new XF(NTa.C, kTa.j, Fsa.d);
        Object a2 = new XF(Fsa.d, wra.P, kTa.j);
        object = new cB((XF)((Object)object), (XF)((Object)a2), vRa.d, vRa.d);
        Object object2 = object;
        while (object2.hasNext()) {
            Object object3 = object;
            object2 = object3;
            a2 = ((cB)object3).J();
            System.out.println(new StringBuilder().insert(3 & 4, Mqa.y).append(a2).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public cB(XF xF, XF xF2, int n2, int n3) {
        void a2;
        void b2;
        double d2;
        XF c2;
        Object e2 = xF;
        cB d3 = this;
        cB cB2 = d3;
        d3.M = new Cf(uSa.E, uSa.E, uSa.E);
        cB2.I = uSa.E;
        int n4 = e2.getX() > c2.getX() ? vRa.d : uSa.E;
        int n5 = e2.getY() > c2.getY() ? vRa.d : uSa.E;
        int n6 = e2.getZ() > c2.getZ() ? vRa.d : uSa.E;
        cB cB3 = d3;
        e2 = cB3.J((XF)((Object)e2), n4 != 0, n5 != 0, n6 != 0);
        c2 = cB3.J(c2, n4 != 0, n5 != 0, n6 != 0);
        cB3.j = n4 != 0 ? pua.o : vRa.d;
        d3.J = n5 != 0 ? pua.o : vRa.d;
        d3.C = n6 != 0 ? pua.o : vRa.d;
        Object object = new Lz((double)(c2.getX() - e2.getX()), (double)(c2.getY() - e2.getY()), (double)(c2.getZ() - e2.getZ())).J();
        Object object2 = new Lz(oua.i, aSa.V, aSa.V);
        Lz lz2 = object;
        double d4 = Math.abs(lz2.f(object2));
        double d5 = Math.abs(lz2.f(new Lz(aSa.V, oua.i, aSa.V)));
        double d6 = Math.abs(lz2.f(new Lz(aSa.V, aSa.V, oua.i)));
        if (d2 >= d5 && d6 >= d4) {
            cB cB4 = d3;
            cB4.I = uqa.g;
            object = new XF(e2.getZ(), e2.getY() - b2, e2.getX() - a2);
            object2 = new XF(c2.getZ(), e2.getY() + b2 + vRa.d, e2.getX() + a2 + vRa.d);
            XF xF3 = c2;
            n6 = xF3.getZ() - e2.getZ();
            double d7 = (double)(xF3.getY() - e2.getY()) / (oua.i * (double)n6);
            double d8 = (double)(xF3.getX() - e2.getX()) / (oua.i * (double)n6);
            cB4.i = new Ob((XF)((Object)object), (XF)((Object)object2), d7, d8);
            return;
        }
        if (d5 >= d4 && d5 >= d6) {
            cB cB5 = d3;
            cB5.I = vRa.d;
            object = new XF(e2.getY(), e2.getX() - b2, e2.getZ() - a2);
            object2 = new XF(c2.getY(), e2.getX() + b2 + vRa.d, e2.getZ() + a2 + vRa.d);
            XF xF4 = c2;
            n6 = xF4.getY() - e2.getY();
            double d9 = (double)(xF4.getX() - e2.getX()) / (oua.i * (double)n6);
            double d10 = (double)(xF4.getZ() - e2.getZ()) / (oua.i * (double)n6);
            cB5.i = new Ob((XF)((Object)object), (XF)((Object)object2), d9, d10);
            return;
        }
        cB cB6 = d3;
        cB6.I = uSa.E;
        object = new XF(e2.getX(), e2.getY() - b2, e2.getZ() - a2);
        object2 = new XF(c2.getX(), e2.getY() + b2 + vRa.d, e2.getZ() + a2 + vRa.d);
        XF xF5 = c2;
        n6 = xF5.getX() - e2.getX();
        double d11 = (double)(xF5.getY() - e2.getY()) / (oua.i * (double)n6);
        double d12 = (double)(xF5.getZ() - e2.getZ()) / (oua.i * (double)n6);
        cB6.i = new Ob((XF)((Object)object), (XF)((Object)object2), d11, d12);
    }

    /*
     * WARNING - void declaration
     */
    private XF J(XF xF, boolean bl, boolean bl2, boolean bl3) {
        void a2;
        void b2;
        void c2;
        Object e2 = xF;
        cB d2 = this;
        if (c2 != false) {
            e2 = new XF(-e2.getX(), e2.getY(), e2.getZ());
        }
        if (b2 != false) {
            e2 = new XF(e2.getX(), -e2.getY(), e2.getZ());
        }
        if (a2 != false) {
            e2 = new XF(e2.getX(), e2.getY(), -e2.getZ());
        }
        return e2;
    }

    public XF J() {
        cB cB2;
        cB cB3 = cB2 = this;
        Object a2 = cB3.i.J();
        switch (cB3.I) {
            case 0: {
                cB cB4 = cB2;
                while (false) {
                }
                cB4.M.setXyz(a2.getX() * cB2.j, a2.getY() * cB2.J, a2.getZ() * cB2.C);
                return cB4.M;
            }
            case 1: {
                cB cB5 = cB2;
                cB5.M.setXyz(a2.getY() * cB2.j, a2.getX() * cB2.J, a2.getZ() * cB2.C);
                return cB5.M;
            }
            case 2: {
                cB cB6 = cB2;
                cB6.M.setXyz(a2.getZ() * cB2.j, a2.getY() * cB2.J, a2.getX() * cB2.C);
                return cB6.M;
            }
        }
        cB cB7 = cB2;
        cB7.M.setXyz(a2.getX() * cB2.j, a2.getY() * cB2.J, a2.getZ() * cB2.C);
        return cB7.M;
    }
}

