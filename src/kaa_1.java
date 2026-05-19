/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
public final class kaa_1
implements u {
    public final /* synthetic */ aaa A;
    public final /* synthetic */ Sx I;

    /*
     * WARNING - void declaration
     */
    public kaa_1(aaa aaa2, Sx object) {
        void a2;
        Object b2 = object;
        object = this;
        ((kaa_1)object).A = a2;
        ((kaa_1)object).I = b2;
    }

    @Override
    public ld J() {
        kaa_1 a2;
        return a2.I.J();
    }

    @Override
    public vL J() {
        kaa_1 a2;
        return a2.I;
    }

    @Override
    public boolean J(int n2, String string) {
        int c2 = n2;
        kaa_1 b2 = this;
        if (c2 <= uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public void J(ld object) {
        kaa_1 b2 = object;
        object = this;
    }

    @Override
    public Lz J() {
        kaa_1 a2;
        return new Lz((double)a2.A.pos.getX() + kTa.B, (double)a2.A.pos.getY() + kTa.B, (double)a2.A.pos.getZ() + kTa.B);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Rha rha, int n2) {
        void b2;
        int c2 = n2;
        kaa_1 a2 = this;
        aaa.J((aaa)a2.A).J((u)a2, (Rha)b2, c2);
    }

    @Override
    public Gg J() {
        kaa_1 a2;
        return a2.I.J();
    }

    @Override
    public XF J() {
        kaa_1 a2;
        return a2.A.pos;
    }

    @Override
    public String J() {
        kaa_1 a2;
        return a2.I.J();
    }

    @Override
    public boolean f() {
        return uSa.E != 0;
    }
}

