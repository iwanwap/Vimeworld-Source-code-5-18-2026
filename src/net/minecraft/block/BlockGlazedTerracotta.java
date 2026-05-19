/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  NPa
 *  eAa
 *  iea
 *  lqa
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public abstract class BlockGlazedTerracotta
extends Block {
    public static final PropertyDirection FACING = PropertyDirection.J(oua.ja, LX.HORIZONTAL);

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGlazedTerracotta a2 = this;
        return b2.J(a2.J()).getMapColor();
    }

    public abstract int d();

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        BlockGlazedTerracotta i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f5;
        void g2;
        void h2;
        BlockGlazedTerracotta blockGlazedTerracotta = blockGlazedTerracotta2;
        BlockGlazedTerracotta blockGlazedTerracotta2 = gl2;
        BlockGlazedTerracotta a2 = blockGlazedTerracotta;
        return super.J((Gg)h2, (XF)g2, (DZ)f5, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)i2).J(FACING, i2.J().getOpposite());
    }

    @Override
    public BlockState J() {
        BlockGlazedTerracotta a2;
        IProperty[] iPropertyArray = new IProperty[uqa.g];
        iPropertyArray[uSa.E] = a2.J();
        iPropertyArray[vRa.d] = FACING;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGlazedTerracotta a2 = this;
        return b2.J(a2.J()).getMetadata() - a2.d() | b2.J(FACING).getIndex() - uqa.g << uqa.g;
    }

    @Override
    public IBlockState J(int n2) {
        int b22 = n2;
        BlockGlazedTerracotta a2 = this;
        iea iea2 = iea.byMetadata((int)((b22 & yRa.d) + a2.d()));
        DZ b22 = DZ.getHorizontal(b22 & lqa.s);
        return a2.J().J(a2.J(), iea2).J(FACING, b22);
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockGlazedTerracotta a2 = this;
        return b2.J(a2.J()).getMetadata() - a2.d();
    }

    public BlockGlazedTerracotta() {
        BlockGlazedTerracotta a2;
        BlockGlazedTerracotta blockGlazedTerracotta = a2;
        super(Material.rock);
        blockGlazedTerracotta.J(soundTypeStone);
        a2.J(NPa.B);
        a2.f(osa.V);
        a2.J(yGa.a);
    }

    public abstract IProperty<iea> J();

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        yGa d2 = yGa2;
        BlockGlazedTerracotta b2 = this;
        int n2 = d2 = uSa.E;
        while (n2 < AQa.P) {
            void c2;
            void a2;
            a2.add(new Mda((eAa)c2, vRa.d, d2++));
            n2 = d2;
        }
    }
}

