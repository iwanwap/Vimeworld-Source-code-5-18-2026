/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  VQa
 *  pca
 *  vRa
 */
import com.google.common.base.Function;
import net.minecraft.block.Block;

public class ffa_3
extends kda {
    public final Block A;
    public final Function<Mda, String> I;

    /*
     * WARNING - void declaration
     */
    public ffa_3(Block block, Block block2, Function<Mda, String> function) {
        void b2;
        void c2;
        Object d2 = function;
        ffa_3 a2 = this;
        super((Block)c2);
        a2.A = b2;
        a2.I = d2;
        a2.f(uSa.E);
        a2.J(vRa.d != 0);
    }

    @Override
    public String C(Mda mda2) {
        ffa_3 b2 = mda2;
        ffa_3 a2 = this;
        return new StringBuilder().insert(3 >> 2, super.J()).append(VQa.ja).append(a2.I.apply((Mda)b2)).toString();
    }

    public int J(int n2) {
        int b2 = n2;
        ffa_3 a2 = this;
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public ffa_3(Block block, Block block2, String[] stringArray) {
        void b2;
        void c2;
        String[] d2 = stringArray;
        String[] a2 = this;
        super((Block)c2, (Block)b2, (Function<Mda, String>)new pca(d2));
    }
}

