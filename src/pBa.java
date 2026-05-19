/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Hba
 *  Oz
 *  Yfa
 *  vL
 *  vRa
 *  yCa
 */
public final class pBa
extends Hba {
    private XF I;

    public yCa J(XF xF) {
        Object b2 = xF;
        pBa a2 = this;
        a2.I = b2;
        return super.J((XF)((Object)b2));
    }

    public void l() {
        block4: {
            block5: {
                pBa a2;
                block6: {
                    if (!a2.f()) {
                        super.l();
                        return;
                    }
                    if (a2.I == null) break block4;
                    pBa pBa2 = a2;
                    double d2 = a2.k.F * pBa2.k.F;
                    if (!(pBa2.k.f(a2.I) >= d2)) break block5;
                    if (a2.k.Z <= (double)a2.I.getY()) break block6;
                    XF xF = new XF(a2.I.getX(), Oz.f((double)a2.k.Z), a2.I.getZ());
                    if (!(a2.k.f(xF) >= d2)) break block5;
                }
                a2.k.J().J((double)a2.I.getX(), (double)a2.I.getY(), (double)a2.I.getZ(), a2.i);
                return;
            }
            a2.I = null;
        }
    }

    public yCa J(vL vL2) {
        pBa a2;
        pBa b2 = vL2;
        pBa pBa2 = a2 = this;
        a2.I = new XF((vL)b2);
        return super.J((vL)b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2, double d2) {
        void a2;
        void b2;
        pBa pBa2 = this;
        pBa c2 = pBa2.J((vL)b2);
        if (c2 != null) {
            return pBa2.J((yCa)c2, (double)a2);
        }
        pBa2.I = new XF((vL)b2);
        pBa2.i = a2;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public pBa(Yfa yfa, Gg gg2) {
        void b2;
        pBa c2 = gg2;
        pBa a2 = this;
        super((Yfa)b2, (Gg)c2);
    }
}

