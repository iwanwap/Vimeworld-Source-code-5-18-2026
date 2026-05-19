/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Ypa
 *  kta
 *  vRa
 */
package net.minecraft.block;

import java.util.Iterator;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLog$EnumAxis;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;

public abstract class BlockLog
extends BlockRotatedPillar {
    public static final PropertyEnum<BlockLog$EnumAxis> LOG_AXIS = PropertyEnum.J(Ypa.V, BlockLog$EnumAxis.class);

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        Iterator<XF> b2;
        void c2;
        int d22;
        BlockLog blockLog = this;
        int a22 = AQa.P;
        int n2 = d22 = a22 + vRa.d;
        if (c2.J(((XF)((Object)b2)).add(-d22, -d22, -d22), ((XF)((Object)b2)).add(n2, n2, n2))) {
            int n3 = a22;
            for (XF a22 : XF.getAllInBox(((XF)((Object)b2)).add(-a22, -a22, -a22), ((XF)((Object)b2)).add(n3, n3, n3))) {
                IBlockState d22 = c2.J(a22);
                if (d22.J().J() != Material.leaves || d22.J(BlockLeaves.CHECK_DECAY).booleanValue()) continue;
                c2.J(a22, d22.J(BlockLeaves.CHECK_DECAY, vRa.d != 0), AQa.P);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public IBlockState J(Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4, int n2, Gl gl2) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void h2;
        DZ i2 = dZ2;
        BlockLog f5 = this;
        return super.J((Gg)h2, (XF)g2, i2, (float)e2, (float)d2, (float)c2, (int)b2, (Gl)a2).J(LOG_AXIS, BlockLog$EnumAxis.fromFacingAxis(i2.getAxis()));
    }

    public BlockLog() {
        BlockLog a2;
        BlockLog blockLog = a2;
        super(Material.wood);
        blockLog.J(yGa.A);
        a2.J(kta.v);
        a2.J(soundTypeWood);
    }
}

