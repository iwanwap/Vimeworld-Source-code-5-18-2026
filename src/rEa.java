/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  Rda
 *  SZ
 *  Waa
 *  Yea
 */
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rEa
extends Yea {
    private final SZ I;

    public void J(Waa waa2) {
        rEa a2;
        rEa b2 = waa2;
        rEa rEa2 = a2 = this;
        super.J((Waa)b2);
        rEa2.I.f((Waa)b2);
    }

    public rEa(Gg gg2) {
        rEa b2 = gg2;
        rEa a2 = this;
        super((Gg)b2);
        rEa rEa2 = a2;
        a2.I = new LFa(a2);
    }

    public SZ J() {
        rEa a2;
        return a2.I;
    }

    public void d() {
        rEa a2;
        rEa rEa2 = a2;
        super.d();
        rEa2.I.J();
    }

    public void f(Waa waa2) {
        rEa a2;
        rEa b2 = waa2;
        rEa rEa2 = a2 = this;
        super.f((Waa)b2);
        rEa2.I.J((Waa)b2);
    }

    public Rda J() {
        return Rda.SPAWNER;
    }

    public IBlockState f() {
        return QFa.P.J();
    }

    /*
     * WARNING - void declaration
     */
    public rEa(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        rEa e2 = gg2;
        rEa d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
        rEa rEa2 = d5;
        d5.I = new LFa(d5);
    }

    public void J(byte by2) {
        byte b2 = by2;
        rEa a2 = this;
        a2.I.J((int)b2);
    }
}

