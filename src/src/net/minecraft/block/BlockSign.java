/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  JPa
 *  MQa
 *  aaa
 *  eAa
 *  pqa
 *  uY
 *  vRa
 *  xy
 */
package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockSign
extends BlockContainer {
    /*
     * WARNING - void declaration
     */
    @Override
    public xy J(Gg gg2, XF xF2) {
        void b2;
        BlockSign a2;
        Object c2 = xF2;
        BlockSign blockSign = a2 = this;
        blockSign.J((I)b2, (XF)((Object)c2));
        return super.J((Gg)b2, (XF)((Object)c2));
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockSign a2 = this;
        return Gea.O;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockSign a2 = this;
        return new aaa();
    }

    public BlockSign() {
        BlockSign blockSign;
        BlockSign blockSign2 = blockSign = this;
        super(Material.wood);
        float a2 = rta.o;
        float f2 = pqa.r;
        blockSign2.J(MQa.L - a2, JPa.N, MQa.L - a2, MQa.L + a2, f2, MQa.L + a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        BlockSign i2 = gg2;
        BlockSign h2 = this;
        if (((Gg)i2).e) {
            return vRa.d != 0;
        }
        if ((i2 = i2.J((XF)g2)) instanceof aaa) {
            void e2;
            return ((aaa)i2).J((Sx)e2);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF2) {
        void b2;
        BlockSign a2 = this;
        Object c2 = xF2;
        if (!a2.l((Gg)b2, (XF)((Object)c2)) && super.J((Gg)b2, (XF)((Object)c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean l() {
        return uSa.E != 0;
    }

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockSign a2 = this;
        return Gea.O;
    }

    @Override
    public boolean f() {
        return vRa.d != 0;
    }

    @Override
    public xy J(Gg gg2, XF xF2, IBlockState iBlockState) {
        IBlockState d2 = iBlockState;
        BlockSign a2 = this;
        return null;
    }

    @Override
    public boolean J(I i2, XF xF2) {
        Object c2 = xF2;
        BlockSign a2 = this;
        return vRa.d != 0;
    }
}

