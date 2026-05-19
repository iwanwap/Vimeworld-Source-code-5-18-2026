/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JSa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xx_2 {
    private int j;
    private final int J;
    private IBlockState A;
    private int I;

    public int l() {
        xx_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public xx_2(int n2, int n3, Block block, int n4) {
        void a2;
        void c2;
        void d2;
        Block e2 = block;
        xx_2 b2 = this;
        b2((int)d2, (int)c2, e2);
        b2.A = e2.J((int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public xx_2(int n2, Block block) {
        void b2;
        Block c2 = block;
        xx_2 a2 = this;
        a2(yRa.d, (int)b2, c2);
    }

    public String toString() {
        int n2;
        Object a2;
        xx_2 xx_22 = this;
        if (xx_22.J >= yRa.d) {
            ResourceLocation resourceLocation = (ResourceLocation)Block.blockRegistry.f(xx_22.J());
            Object object = a2 = resourceLocation == null ? SPa.V : resourceLocation.toString();
            if (xx_22.j > vRa.d) {
                a2 = xx_22.j + JSa.a + (String)a2;
            }
        } else {
            xx_2 xx_23 = xx_22;
            a2 = Integer.toString(Block.J(xx_23.J()));
            if (xx_23.j > vRa.d) {
                a2 = xx_22.j + rRa.X + (String)a2;
            }
        }
        if ((n2 = xx_22.J()) > 0) {
            a2 = new StringBuilder().insert(5 >> 3, (String)a2).append(Era.Aa).append(n2).toString();
        }
        return a2;
    }

    public int f() {
        xx_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public xx_2(int n2, int n3, Block block) {
        void b2;
        void c2;
        xx_2 a2;
        Block d2 = block;
        xx_2 xx_22 = a2 = this;
        a2.j = vRa.d;
        a2.J = c2;
        xx_22.j = b2;
        xx_22.A = d2.J();
    }

    private int J() {
        xx_2 a2;
        return a2.A.J().f(a2.A);
    }

    public void J(int n2) {
        int b2 = n2;
        xx_2 a2 = this;
        a2.I = b2;
    }

    private Block J() {
        xx_2 a2;
        return a2.A.J();
    }

    public IBlockState J() {
        xx_2 a2;
        return a2.A;
    }
}

