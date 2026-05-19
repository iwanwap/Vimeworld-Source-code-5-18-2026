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
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockStainedGlassPane
extends BlockPane {
    public static final PropertyEnum<iea> COLOR = PropertyEnum.J(Zra.L, iea.class);

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStainedGlassPane a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    @Override
    public ez J() {
        return ez.TRANSLUCENT;
    }

    @Override
    public BlockState J() {
        BlockStainedGlassPane a2;
        IProperty[] iPropertyArray = new IProperty[tTa.h];
        iPropertyArray[uSa.E] = NORTH;
        iPropertyArray[vRa.d] = EAST;
        iPropertyArray[uqa.g] = WEST;
        iPropertyArray[yRa.d] = SOUTH;
        iPropertyArray[AQa.P] = COLOR;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        BlockStainedGlassPane d2 = gg2;
        BlockStainedGlassPane c2 = this;
        if (!((Gg)d2).e) {
            void b2;
            BlockBeacon.f((Gg)d2, (XF)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        yGa d2 = yGa2;
        BlockStainedGlassPane b2 = this;
        int n2 = d2 = uSa.E;
        while (n2 < iea.values().length) {
            void c2;
            void a2;
            a2.add(new Mda((eAa)c2, vRa.d, d2++));
            n2 = d2;
        }
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStainedGlassPane a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockStainedGlassPane a2 = this;
        return a2.J().J(COLOR, iea.byMetadata((int)b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        BlockStainedGlassPane d2 = gg2;
        BlockStainedGlassPane c2 = this;
        if (!((Gg)d2).e) {
            void b2;
            BlockBeacon.f((Gg)d2, (XF)b2);
        }
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockStainedGlassPane a2 = this;
        return b2.J(COLOR).getMapColor();
    }

    public BlockStainedGlassPane() {
        BlockStainedGlassPane a2;
        BlockStainedGlassPane blockStainedGlassPane = a2;
        super(Material.glass, uSa.E != 0);
        blockStainedGlassPane.J(blockStainedGlassPane.blockState.J().J(NORTH, uSa.E != 0).J(EAST, uSa.E != 0).J(SOUTH, uSa.E != 0).J(WEST, uSa.E != 0).J(COLOR, iea.WHITE));
        blockStainedGlassPane.J(yGa.a);
    }
}

