/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eca
 *  Pd
 */
import java.io.IOException;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Eca_2
implements KC<Pd> {
    private int j;
    private int J;
    private XF A;
    private Block I;

    public int f() {
        Eca_2 a2;
        return a2.j;
    }

    public Eca_2() {
        Eca_2 a2;
    }

    public XF J() {
        Eca_2 a2;
        return a2.A;
    }

    public Block J() {
        Eca_2 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        Eca_2 a2 = this;
        Object object = b2;
        ((Lca)object).writeBlockPos(a2.A);
        ((Lca)object).writeByte(a2.J);
        b2.writeByte(a2.j);
        b2.writeVarIntToBuffer(Block.J(a2.I) & qQa.Fa);
    }

    @Override
    public void J(Lca lca) throws IOException {
        Eca_2 a2;
        Lca b2 = lca;
        Eca_2 eca_2 = a2 = this;
        Object object = b2;
        a2.A = b2.readBlockPos();
        a2.J = ((Lca)object).readUnsignedByte();
        eca_2.j = ((Lca)object).readUnsignedByte();
        eca_2.I = Block.f(b2.readVarIntFromBuffer() & qQa.Fa);
    }

    @Override
    public void J(Pd pd2) {
        Eca_2 b2 = pd2;
        Eca_2 a2 = this;
        b2.J((Eca)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Eca_2(XF xF2, Block block, int n2, int n3) {
        void c2;
        void e2;
        void b2;
        void d2;
        Eca_2 a2;
        int n4 = n3;
        Eca_2 eca_2 = a2 = this;
        Eca_2 eca_22 = a2;
        eca_22.A = d2;
        eca_22.J = b2;
        eca_2.j = e2;
        eca_2.I = c2;
    }

    public int J() {
        Eca_2 a2;
        return a2.J;
    }
}

