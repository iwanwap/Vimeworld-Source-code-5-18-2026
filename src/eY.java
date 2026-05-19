/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Gg
 *  Lz
 *  Rha
 *  aaa
 *  ld
 *  vL
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class eY
implements u {
    public final /* synthetic */ aaa I;

    @Override
    public void J(ld object) {
        eY b2 = object;
        object = this;
    }

    @Override
    public boolean J(int n2, String string) {
        String c2 = string;
        eY a2 = this;
        return vRa.d != 0;
    }

    @Override
    public void J(Rha rha, int n2) {
        int c2 = n2;
        eY eY2 = this;
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }

    @Override
    public ld J() {
        eY a2;
        return new CY(a2.J());
    }

    @Override
    public String J() {
        return zpa.s;
    }

    @Override
    public XF J() {
        eY a2;
        return a2.I.pos;
    }

    @Override
    public Lz J() {
        eY a2;
        return new Lz((double)a2.I.pos.getX() + kTa.B, (double)a2.I.pos.getY() + kTa.B, (double)a2.I.pos.getZ() + kTa.B);
    }

    @Override
    public Gg J() {
        eY a2;
        return a2.I.worldObj;
    }

    public eY(aaa aaa2) {
        eY b2 = aaa2;
        eY a2 = this;
        a2.I = b2;
    }

    @Override
    public vL J() {
        return null;
    }
}

