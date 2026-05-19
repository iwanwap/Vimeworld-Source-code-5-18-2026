/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  QFa
 *  eAa
 *  iea
 *  vRa
 */
package net.minecraft.block;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockConcretePowder
extends BlockFalling {
    public static final PropertyEnum<iea> COLOR = PropertyEnum.J(Zra.L, iea.class);

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockConcretePowder a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        Object b2 = this;
        IBlockState e2 = iBlockState;
        if (!((BlockConcretePowder)b2).J((Gg)d2, (XF)c2, e2)) {
            void a2;
            super.J((Gg)d2, (XF)c2, e2, (Block)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, IBlockState iBlockState) {
        int n2;
        BlockConcretePowder blockConcretePowder = this;
        DZ[] dZArray = DZ.VALUES;
        int n3 = DZ.VALUES.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            void b2;
            void c2;
            Object d2 = dZArray[n2];
            if (d2 != DZ.DOWN && ((d2 = c2.J(b2.offset((DZ)((Object)d2))).J()) == QFa.sc || d2 == QFa.jd)) {
                void a2;
                c2.J((XF)b2, QFa.fB.J().J(BlockColored.COLOR, a2.J(COLOR)), yRa.d);
                return vRa.d != 0;
            }
            n4 = ++n2;
        }
        return uSa.E != 0;
    }

    @Override
    public MapColor J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockConcretePowder a2 = this;
        return b2.J(COLOR).getMapColor();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object a2 = this;
        IBlockState d2 = iBlockState;
        if (!((BlockConcretePowder)a2).J((Gg)c2, (XF)b2, d2)) {
            super.f((Gg)c2, (XF)b2, d2);
        }
    }

    public BlockConcretePowder() {
        BlockConcretePowder a2;
        BlockConcretePowder blockConcretePowder = a2;
        blockConcretePowder.J(blockConcretePowder.blockState.J().J(COLOR, iea.WHITE));
        blockConcretePowder.J(yGa.A);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        BlockConcretePowder a2 = this;
        super.l((Gg)b2, (XF)((Object)c2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int d2;
        BlockConcretePowder blockConcretePowder = this;
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
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockConcretePowder a2 = this;
        return b2.J(COLOR).getMetadata();
    }

    @Override
    public BlockState J() {
        BlockConcretePowder a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = COLOR;
        return new BlockState(a2, iPropertyArray);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockConcretePowder a2 = this;
        return a2.J().J(COLOR, iea.byMetadata((int)b2));
    }
}

