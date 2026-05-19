/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  I
 *  JX
 *  QFa
 *  eAa
 *  ez
 *  kX
 *  vRa
 *  wi
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDirt$DirtType;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockFlower$EnumFlowerType;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTallGrass$EnumType;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockGrass
extends Block
implements IGrowable {
    public static final PropertyBool SNOWY = PropertyBool.J(sra.c);

    @Override
    public boolean J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        BlockGrass blockGrass = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        BlockGrass a2 = blockGrass;
        return vRa.d != 0;
    }

    @Override
    public BlockState J() {
        BlockGrass a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = SNOWY;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        void b2;
        int d2 = n2;
        BlockGrass a2 = this;
        return QFa.Bc.J(QFa.Bc.J().J(BlockDirt.VARIANT, BlockDirt$DirtType.DIRT), (Random)b2, d2);
    }

    @Override
    public int J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGrass a2 = this;
        return a2.J();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, Random random, XF xF2, IBlockState iBlockState) {
        int a2;
        XF b2;
        BlockGrass blockGrass = this;
        b2 = b2.up();
        int n2 = a2 = uSa.E;
        while (n2 < XOa.h) {
            Object e2 = b2;
            int n3 = uSa.E;
            while (true) {
                int n4;
                void c2;
                void d2;
                if (n3 >= a2 / ERa.C) {
                    Object object;
                    if (d2.J((XF)((Object)e2)).J().blockMaterial != Material.air) break;
                    if (c2.nextInt(Yqa.i) == 0) {
                        object = d2.J((XF)((Object)e2)).J((Random)c2, (XF)((Object)e2));
                        Object object2 = ((BlockFlower$EnumFlowerType)((Object)object)).getBlockType().getBlock();
                        BlockFlower blockFlower = object2;
                        if (!blockFlower.J((Gg)d2, (XF)((Object)e2), (IBlockState)(object2 = ((Block)object2).J().J(blockFlower.J(), object)))) break;
                        d2.J((XF)((Object)e2), (IBlockState)object2, yRa.d);
                        break;
                    }
                    object = QFa.y.J().J(BlockTallGrass.TYPE, BlockTallGrass$EnumType.GRASS);
                    if (!QFa.y.J((Gg)d2, (XF)((Object)e2), (IBlockState)object)) break;
                    d2.J((XF)((Object)e2), object, yRa.d);
                    break;
                }
                if (d2.J(((XF)((Object)(e2 = ((XF)((Object)e2)).add(c2.nextInt(yRa.d) - vRa.d, (c2.nextInt(yRa.d) - vRa.d) * c2.nextInt(yRa.d) / uqa.g, c2.nextInt(yRa.d) - vRa.d)))).down()).J() != QFa.lf || d2.J((XF)((Object)e2)).J().A()) break;
                n3 = ++n4;
            }
            n2 = ++a2;
        }
    }

    public BlockGrass() {
        BlockGrass a2;
        BlockGrass blockGrass = a2;
        super(Material.grass);
        blockGrass.J(blockGrass.blockState.J().J(SNOWY, uSa.E != 0));
        blockGrass.J(vRa.d != 0);
        a2.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, int n2) {
        void c2;
        Object d2 = xF2;
        BlockGrass b2 = this;
        return wi.J((int)kX.J((I)c2, (XF)((Object)d2)));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockGrass e2 = gg2;
        BlockGrass d2 = this;
        if (!((Gg)e2).e) {
            void c2;
            if (e2.C(c2.up()) < AQa.P && e2.J(c2.up()).J().C() > uqa.g) {
                e2.J((XF)c2, QFa.Bc.J());
                return;
            }
            if (e2.C(c2.up()) >= WOa.fa) {
                int b2;
                int n2 = b2 = uSa.E;
                while (n2 < AQa.P) {
                    void a2;
                    XF xF3 = c2.add(a2.nextInt(yRa.d) - vRa.d, a2.nextInt(tTa.h) - yRa.d, a2.nextInt(yRa.d) - vRa.d);
                    BlockGrass blockGrass = e2;
                    Block block = blockGrass.J(xF3.up()).J();
                    IBlockState iBlockState2 = blockGrass.J(xF3);
                    if (iBlockState2.J() == QFa.Bc && iBlockState2.J(BlockDirt.VARIANT) == BlockDirt$DirtType.DIRT && e2.C(xF3.up()) >= AQa.P && block.C() <= uqa.g) {
                        e2.J(xF3, QFa.lf.J());
                    }
                    n2 = ++b2;
                }
            }
        }
    }

    @Override
    public int J() {
        return wi.J((int)JX.J((double)kTa.B, (double)oua.i));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(IBlockState iBlockState, I i2, XF xF2) {
        void a2;
        void c2;
        Block d2 = i2;
        BlockGrass b2 = this;
        return c2.J(SNOWY, ((d2 = d2.J(a2.up()).J()) == QFa.mb || d2 == QFa.gC ? vRa.d : uSa.E) != 0);
    }

    @Override
    public ez J() {
        return ez.CUTOUT_MIPPED;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGrass a2 = this;
        return uSa.E;
    }

    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, boolean bl) {
        boolean bl2 = bl;
        BlockGrass a2 = this;
        return vRa.d != 0;
    }
}

