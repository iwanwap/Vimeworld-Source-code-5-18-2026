/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Lz
 *  fsa
 *  hqa
 *  hra
 *  vL
 *  wra
 */
public final class RY {
    private XF k;
    public DZ j;
    public vL J;
    public AY A;
    public Lz I;

    public RY(vL vL2) {
        RY b2 = vL2;
        RY a2 = this;
        RY rY2 = b2;
        RY rY3 = b2;
        a2((vL)rY3, new Lz(((vL)rY3).la, ((vL)b2).Z, ((vL)b2).A));
    }

    /*
     * WARNING - void declaration
     */
    public RY(Lz lz2, DZ dZ) {
        void b2;
        Object c2 = dZ;
        RY a2 = this;
        a2(AY.BLOCK, (Lz)b2, (DZ)((Object)c2), XF.ORIGIN);
    }

    /*
     * WARNING - void declaration
     */
    public RY(AY aY2, Lz lz2, DZ dZ, XF xF) {
        void b2;
        void a2;
        void d2;
        RY c2;
        RY e2 = lz2;
        RY rY2 = c2 = this;
        c2.A = d2;
        rY2.k = a2;
        rY2.j = b2;
        RY rY3 = c2;
        rY2.I = new Lz(((Lz)e2).A, ((Lz)e2).j, ((Lz)e2).J);
    }

    /*
     * WARNING - void declaration
     */
    public RY(vL vL2, Lz lz2) {
        void b2;
        RY a2;
        RY c2 = lz2;
        RY rY2 = a2 = this;
        a2.A = AY.ENTITY;
        rY2.J = b2;
        rY2.I = c2;
    }

    public String toString() {
        RY a2;
        return new StringBuilder().insert(3 >> 2, fsa.q).append(a2.A).append(hra.r).append((Object)a2.k).append(Qra.d).append((Object)a2.j).append(wra.x).append(a2.I).append(hqa.P).append(a2.J).append((char)ySa.Z).toString();
    }

    public XF J() {
        RY a2;
        return a2.k;
    }

    /*
     * WARNING - void declaration
     */
    public RY(Lz lz2, DZ dZ, XF xF) {
        void b2;
        void c2;
        Object d2 = xF;
        RY a2 = this;
        a2(AY.BLOCK, (Lz)c2, (DZ)b2, (XF)((Object)d2));
    }
}

