/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  SZ
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ty_2
extends SZ {
    public final /* synthetic */ Caa I;

    public void J(int n2) {
        int b2 = n2;
        ty_2 a2 = this;
        a2.I.worldObj.f(a2.I.pos, QFa.P, b2, uSa.E);
    }

    public ty_2(Caa caa2) {
        Object b2 = caa2;
        ty_2 a2 = this;
        a2.I = b2;
    }

    public XF J() {
        ty_2 a2;
        return a2.I.pos;
    }

    public void J(Jz jz2) {
        ty_2 a2;
        Object b2 = jz2;
        ty_2 ty_22 = a2 = this;
        super.J((Jz)((Object)b2));
        if (ty_22.J() != null) {
            a2.J().C(a2.I.pos);
        }
    }

    public Gg J() {
        ty_2 a2;
        return a2.I.worldObj;
    }
}

