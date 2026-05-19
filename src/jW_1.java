/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 */
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public abstract class jW_1 {
    private final boolean I;

    public abstract boolean J(Gg var1, Random var2, XF var3);

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        jW_1 a2 = this;
        if (a2.I) {
            c2.J((XF)b2, d2, yRa.d);
            return;
        }
        c2.J((XF)b2, d2, uqa.g);
    }

    public jW_1(boolean bl) {
        boolean b2 = bl;
        jW_1 a2 = this;
        a2.I = b2;
    }

    public jW_1() {
        a2(uSa.E != 0);
        jW_1 a2;
    }

    public void J() {
    }
}

