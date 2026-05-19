/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  QSa
 *  hy
 *  uY
 *  vRa
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockCommandBlock
extends BlockContainer {
    public static final PropertyBool TRIGGERED = PropertyBool.J(QSa.Ma);

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockCommandBlock i2 = gg2;
        BlockCommandBlock h2 = this;
        if ((i2 = i2.J((XF)g2)) instanceof kz) {
            void e2;
            return ((kz)((Object)i2)).J().J((Sx)e2);
        }
        return uSa.E != 0;
    }

    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockCommandBlock blockCommandBlock = blockCommandBlock2;
        BlockCommandBlock blockCommandBlock2 = gl2;
        BlockCommandBlock a2 = blockCommandBlock;
        return a2.J().J(TRIGGERED, uSa.E != 0);
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(Gg gg2, XF xF2) {
        void a2;
        BlockCommandBlock c2 = gg2;
        BlockCommandBlock b2 = this;
        if ((c2 = c2.J((XF)a2)) instanceof kz) {
            return ((kz)((Object)c2)).J().f();
        }
        return uSa.E;
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    public BlockCommandBlock() {
        BlockCommandBlock a2;
        BlockCommandBlock blockCommandBlock = a2;
        super(Material.iron, MapColor.adobeColor);
        blockCommandBlock.J(blockCommandBlock.blockState.J().J(TRIGGERED, uSa.E != 0));
    }

    @Override
    public int J(Gg gg2) {
        BlockCommandBlock b2 = gg2;
        BlockCommandBlock a2 = this;
        return vRa.d;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockCommandBlock a2 = this;
        return new kz();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        BlockCommandBlock e2 = gg2;
        BlockCommandBlock d2 = this;
        uY b2 = e2.J((XF)c2);
        if (b2 instanceof kz) {
            ((kz)b2).J().J((Gg)e2);
            e2.J((XF)c2, (Block)d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(IBlockState iBlockState) {
        void a2;
        BlockCommandBlock blockCommandBlock = this;
        int b2 = uSa.E;
        if (a2.J(TRIGGERED).booleanValue()) {
            b2 |= vRa.d;
        }
        return b2;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockCommandBlock a2 = this;
        return uSa.E;
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockCommandBlock a2 = this;
        return a2.J().J(TRIGGERED, ((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        BlockCommandBlock e2 = gg2;
        BlockCommandBlock d2 = this;
        if (!((Gg)e2).e) {
            void b2;
            void c2;
            boolean a2 = e2.k((XF)c2);
            boolean bl2 = b2.J(TRIGGERED);
            if (a2 && !bl2) {
                e2.J((XF)c2, b2.J(TRIGGERED, vRa.d != 0), AQa.P);
                BlockCommandBlock blockCommandBlock = d2;
                e2.J((XF)c2, blockCommandBlock, blockCommandBlock.J((Gg)e2));
                return;
            }
            if (!a2 && bl2) {
                e2.J((XF)c2, b2.J(TRIGGERED, uSa.E != 0), AQa.P);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Gl gl2, Mda mda2) {
        void e2;
        Object f2 = xF2;
        BlockCommandBlock d2 = this;
        if ((f2 = e2.J((XF)((Object)f2))) instanceof kz) {
            void a2;
            f2 = ((kz)((Object)f2)).J();
            if (a2.l()) {
                f2.f(a2.J());
            }
            if (!e2.e) {
                f2.J(e2.J().f(Ura.Q));
            }
        }
    }

    @Override
    public BlockState J() {
        BlockCommandBlock a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = TRIGGERED;
        return new BlockState(a2, iPropertyArray);
    }
}

