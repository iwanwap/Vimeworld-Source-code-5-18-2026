/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pd
 *  bCa
 */
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bCa_3
implements KC<Pd> {
    private int j;
    private boolean J;
    private int A;
    private XF I;

    @Override
    public void f(Lca lca2) throws IOException {
        Lca b2 = lca2;
        bCa_3 a2 = this;
        b2.writeInt(a2.A);
        Object object = b2;
        ((Lca)object).writeBlockPos(a2.I);
        ((Lca)object).writeInt(a2.j);
        b2.writeBoolean(a2.J);
    }

    @Override
    public void J(Lca lca2) throws IOException {
        bCa_3 a2;
        Lca b2 = lca2;
        bCa_3 bCa_32 = a2 = this;
        Object object = b2;
        a2.A = b2.readInt();
        a2.I = ((Lca)object).readBlockPos();
        bCa_32.j = ((Lca)object).readInt();
        bCa_32.J = b2.readBoolean();
    }

    public bCa_3() {
        bCa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public bCa_3(int n2, XF xF2, int n3, boolean bl2) {
        void e2;
        void b2;
        void c2;
        void d2;
        bCa_3 a2;
        boolean bl3 = bl2;
        bCa_3 bCa_32 = a2 = this;
        bCa_3 bCa_33 = a2;
        bCa_33.A = d2;
        bCa_33.I = c2;
        bCa_32.j = b2;
        bCa_32.J = e2;
    }

    public XF J() {
        bCa_3 a2;
        return a2.I;
    }

    public int f() {
        bCa_3 a2;
        return a2.A;
    }

    @Override
    public void J(Pd pd2) {
        bCa_3 b2 = pd2;
        bCa_3 a2 = this;
        b2.J((bCa)a2);
    }

    public boolean J() {
        bCa_3 a2;
        return a2.J;
    }

    public int J() {
        bCa_3 a2;
        return a2.j;
    }
}

