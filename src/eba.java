/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Baa
 *  Faa
 *  Pd
 *  SAa
 */
import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class eba
implements KC<Pd> {
    private Baa A;
    private SAa[] I;

    @Override
    public void J(Pd pd2) {
        eba b2 = pd2;
        eba a2 = this;
        b2.J(a2);
    }

    public SAa[] J() {
        eba a2;
        return a2.I;
    }

    public static /* synthetic */ Baa J(eba a2) {
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public eba(int n2, short[] sArray, Faa faa2) {
        void a2;
        int d2 = n2;
        eba c2 = this;
        eba eba2 = c2;
        void v1 = a2;
        c2.A = new Baa(v1.I, v1.G);
        c2.I = new SAa[d2];
        int n3 = d2 = uSa.E;
        while (n3 < c2.I.length) {
            void b2;
            int n4 = d2;
            SAa sAa2 = new SAa(c2, (short)b2[d2], (Faa)a2);
            c2.I[n4] = sAa2;
            n3 = ++d2;
        }
    }

    public eba() {
        eba a2;
    }

    @Override
    public void f(Lca lca) throws IOException {
        int n2;
        eba a2;
        Lca b2 = lca;
        eba eba2 = a2 = this;
        Object object = b2;
        b2.writeInt(eba2.A.j);
        ((Lca)object).writeInt(a2.A.A);
        ((Lca)object).writeVarIntToBuffer(eba2.I.length);
        SAa[] sAaArray = a2.I;
        int n3 = a2.I.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            SAa sAa2 = sAaArray[n2];
            b2.writeShort(sAa2.J());
            b2.writeVarIntToBuffer(Block.BLOCK_STATE_IDS.J((Object)sAa2.J()));
            n4 = ++n2;
        }
    }

    @Override
    public void J(Lca lca) throws IOException {
        int n2;
        eba a2;
        Lca b2 = lca;
        eba eba2 = a2 = this;
        eba eba3 = a2;
        eba2.A = new Baa(b2.readInt(), b2.readInt());
        eba2.I = new SAa[b2.readVarIntFromBuffer()];
        int n3 = n2 = uSa.E;
        while (n3 < a2.I.length) {
            a2.I[n2++] = new SAa(a2, b2.readShort(), (IBlockState)Block.BLOCK_STATE_IDS.J(b2.readVarIntFromBuffer()));
            n3 = n2;
        }
    }
}

