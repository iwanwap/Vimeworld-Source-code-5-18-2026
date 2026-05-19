/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  eAa
 *  hy
 *  jFa
 *  pqa
 *  uY
 *  vL
 *  vRa
 */
package net.minecraft.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockJukebox$TileEntityJukebox;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockJukebox
extends BlockContainer {
    public static final PropertyBool HAS_RECORD = PropertyBool.J(bsa.b);

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        BlockJukebox a2;
        IBlockState d2 = iBlockState;
        BlockJukebox blockJukebox = a2 = this;
        blockJukebox.C((Gg)c2, (XF)b2, d2);
        super.l((Gg)c2, (XF)b2, d2);
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockJukebox a2 = this;
        return a2.J().J(HAS_RECORD, (b2 > 0 ? vRa.d : uSa.E) != 0);
    }

    @Override
    public boolean F() {
        return vRa.d != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockJukebox a2 = this;
        if (b2.J(HAS_RECORD).booleanValue()) {
            return vRa.d;
        }
        return uSa.E;
    }

    @Override
    public BlockState J() {
        BlockJukebox a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = HAS_RECORD;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Mda mda2) {
        void c2;
        uY uY2;
        BlockJukebox e2 = gg2;
        BlockJukebox d2 = this;
        if (!((Gg)e2).e && (uY2 = e2.J((XF)c2)) instanceof BlockJukebox$TileEntityJukebox) {
            void b2;
            void a2;
            ((BlockJukebox$TileEntityJukebox)uY2).J(new Mda(a2.J(), vRa.d, a2.J()));
            e2.J((XF)c2, b2.J(HAS_RECORD, vRa.d != 0), uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, float f2, int n2) {
        BlockJukebox f3 = gg2;
        BlockJukebox e2 = this;
        if (!((Gg)f3).e) {
            void b2;
            void c2;
            void d2;
            super.J((Gg)f3, (XF)d2, (IBlockState)c2, (float)b2, uSa.E);
        }
    }

    public BlockJukebox() {
        BlockJukebox a2;
        BlockJukebox blockJukebox = a2;
        super(Material.wood, MapColor.dirtColor);
        blockJukebox.J(blockJukebox.blockState.J().J(HAS_RECORD, uSa.E != 0));
        blockJukebox.J(yGa.a);
    }

    /*
     * WARNING - void declaration
     */
    private void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        Mda mda2;
        void b2;
        void c2;
        Object d222 = iBlockState;
        BlockJukebox a2 = this;
        if (!c2.e && (d222 = c2.J((XF)b2)) instanceof BlockJukebox$TileEntityJukebox && (mda2 = ((BlockJukebox$TileEntityJukebox)((Object)(d222 = (BlockJukebox$TileEntityJukebox)((Object)d222)))).J()) != null) {
            void v0 = c2;
            v0.f(CRa.r, (XF)b2, uSa.E);
            v0.J((XF)b2, (String)null);
            ((BlockJukebox$TileEntityJukebox)((Object)d222)).J((Mda)null);
            float d222 = ZSa.q;
            void v1 = c2;
            double d3 = (double)(c2.v.nextFloat() * d222) + (double)(pqa.r - d222) * kTa.B;
            double d4 = (double)(v1.v.nextFloat() * d222) + (double)(pqa.r - d222) * iSa.P + oQa.fa;
            double d5 = (double)(v1.v.nextFloat() * d222) + (double)(pqa.r - d222) * kTa.B;
            Mda d222 = mda2.J();
            jFa jFa2 = new jFa((Gg)c2, (double)b2.getX() + d3, (double)b2.getY() + d4, (double)b2.getZ() + d5, d222);
            jFa2.l();
            v1.f((vL)jFa2);
        }
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockJukebox a2 = this;
        return new BlockJukebox$TileEntityJukebox();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        Object i2 = iBlockState;
        BlockJukebox f5 = this;
        if (i2.J(HAS_RECORD).booleanValue()) {
            void g2;
            void h2;
            f5.C((Gg)h2, (XF)g2, (IBlockState)i2);
            i2 = i2.J(HAS_RECORD, uSa.E != 0);
            h2.J((XF)g2, (IBlockState)i2, uqa.g);
            return vRa.d != 0;
        }
        return uSa.E != 0;
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
        BlockJukebox c2 = gg2;
        BlockJukebox b2 = this;
        if ((c2 = c2.J((XF)a2)) instanceof BlockJukebox$TileEntityJukebox && (c2 = ((BlockJukebox$TileEntityJukebox)((Object)c2)).J()) != null) {
            return eAa.J((eAa)c2.J()) + vRa.d - eAa.J((eAa)Gea.Va);
        }
        return uSa.E;
    }
}

