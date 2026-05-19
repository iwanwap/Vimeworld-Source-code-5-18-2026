/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QFa
 *  lqa
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

public final class oz {
    private final IBlockState A;
    private final short[] I = new short[opa.w];

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, IBlockState iBlockState) {
        void a2;
        void c2;
        void b2;
        int e2 = n2;
        oz d2 = this;
        e2 = e2 << lqa.s | b2 << Yqa.i | c2;
        d2.J(e2, (IBlockState)a2);
    }

    public IBlockState J(int n2) {
        int b22 = n2;
        oz a2 = this;
        if (b22 >= 0 && b22 < a2.I.length) {
            IBlockState b22 = (IBlockState)Block.BLOCK_STATE_IDS.J((int)a2.I[b22]);
            if (b22 != null) {
                return b22;
            }
            return a2.A;
        }
        throw new IndexOutOfBoundsException(uSa.y);
    }

    public oz() {
        oz a2;
        a2.A = QFa.HF.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, IBlockState iBlockState) {
        int c2 = n2;
        oz b2 = this;
        if (c2 >= 0 && c2 < b2.I.length) {
            void a2;
            b2.I[c2] = (short)Block.BLOCK_STATE_IDS.J((Object)a2);
            return;
        }
        throw new IndexOutOfBoundsException(uSa.y);
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(int n2, int n3, int n4) {
        void b2;
        void a2;
        int d2 = n2;
        oz c2 = this;
        d2 = d2 << lqa.s | a2 << Yqa.i | b2;
        return c2.J(d2);
    }
}

