/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Waa
 *  ld
 *  uY
 *  vRa
 *  xA
 *  zC
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class vX_1
extends uY
implements xA,
zC {
    private Iaa I = Iaa.A;

    public void f(Waa waa2) {
        vX_1 b2 = waa2;
        vX_1 a2 = this;
        super.f((Waa)b2);
        a2.I = Iaa.J((Waa)b2);
    }

    public Iaa J() {
        vX_1 a2;
        return a2.I;
    }

    public ld J() {
        vX_1 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public boolean l() {
        vX_1 a2;
        if (a2.I != null && !a2.I.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        vX_1 a2;
        vX_1 b2 = waa2;
        vX_1 vX_12 = a2 = this;
        super.J((Waa)b2);
        if (vX_12.I != null) {
            a2.I.J((Waa)b2);
        }
    }

    public void J(Iaa iaa) {
        Object b2 = iaa;
        vX_1 a2 = this;
        a2.I = b2;
    }

    public vX_1() {
        vX_1 a2;
    }
}

