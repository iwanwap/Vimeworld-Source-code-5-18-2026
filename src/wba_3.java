/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Pd
 *  wba
 */
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wba_3
implements KC<Pd> {
    private XF A;
    private IBlockState I;

    public IBlockState J() {
        wba_3 a2;
        return a2.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        wba_3 a2 = this;
        Object object = b2;
        ((Lca)object).writeBlockPos(a2.A);
        ((Lca)object).writeVarIntToBuffer(Block.BLOCK_STATE_IDS.J((Object)a2.I));
    }

    @Override
    public void J(Pd pd2) {
        wba_3 b2 = pd2;
        wba_3 a2 = this;
        b2.J((wba)a2);
    }

    public wba_3() {
        wba_3 a2;
    }

    public XF J() {
        wba_3 a2;
        return a2.A;
    }

    @Override
    public void J(Lca lca) throws IOException {
        wba_3 a2;
        Lca b2 = lca;
        wba_3 wba_32 = a2 = this;
        wba_32.A = b2.readBlockPos();
        wba_32.I = (IBlockState)Block.BLOCK_STATE_IDS.J(b2.readVarIntFromBuffer());
    }

    /*
     * WARNING - void declaration
     */
    public wba_3(Gg gg2, XF xF2) {
        void b2;
        wba_3 a2;
        Object c2 = xF2;
        wba_3 wba_32 = a2 = this;
        wba_32.A = c2;
        wba_32.I = b2.J((XF)((Object)c2));
    }
}

