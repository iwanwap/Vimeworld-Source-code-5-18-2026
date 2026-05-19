/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  eAa
 *  ez
 *  iea
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockStainedGlass
extends BlockBreakable {
    public static final PropertyEnum<iea> COLOR = PropertyEnum.J(Zra.L, iea.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF, IBlockState iBlockState) {
        BlockStainedGlass d2 = gg2;
        BlockStainedGlass c2 = this;
        if (!((Gg)d2).e) {
            void b2;
            BlockBeacon.f((Gg)d2, (XF)b2);
        }
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public int J(Random random) {
        Random b2 = random;
        BlockStainedGlass a2 = this;
        return uSa.E;
    }

    public BlockStainedGlass(Material material) {
        BlockStainedGlass a2;
        Material b2 = material;
        BlockStainedGlass blockStainedGlass = a2 = this;
        super(b2, uSa.E != 0);
        blockStainedGlass.J(blockStainedGlass.blockState.J().J(COLOR, iea.WHITE));
        blockStainedGlass.J(yGa.A);
    }

    @Override
    public BlockState J() {
        BlockStainedGlass a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = COLOR;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public ez J() {
        return ez.TRANSLUCENT;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStainedGlass a2 = this;
        return b2.J(COLOR).getMapColor();
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStainedGlass a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF, IBlockState iBlockState) {
        BlockStainedGlass d2 = gg2;
        BlockStainedGlass c2 = this;
        if (!((Gg)d2).e) {
            void b2;
            BlockBeacon.f((Gg)d2, (XF)b2);
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStainedGlass a2 = this;
        return a2.J().J(COLOR, iea.byMetadata((int)b2));
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStainedGlass a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockStainedGlass blockStainedGlass = this;
        iea[] b2 = iea.values();
        int n2 = b2.length;
        int n3 = d2 = uSa.E;
        while (n3 < n2) {
            void c2;
            void a2;
            iea iea2 = b2[d2];
            a2.add(new Mda((eAa)c2, vRa.d, iea2.getMetadata()));
            n3 = ++d2;
        }
    }

    @Override
    public boolean G() {
        return vRa.d != 0;
    }
}

