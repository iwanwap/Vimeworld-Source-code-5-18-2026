/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JPa
 *  JQa
 *  Tz
 *  UZ
 *  aSa
 *  hy
 *  lqa
 *  uOa
 *  uY
 *  vQa
 *  vRa
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public final class BlockNote
extends BlockContainer {
    private static final List<String> INSTRUMENTS;

    public BlockNote() {
        BlockNote a2;
        BlockNote blockNote = a2;
        super(Material.wood);
        blockNote.J(yGa.I);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, Sx sx2) {
        void b2;
        uY uY2;
        BlockNote d2 = gg2;
        BlockNote c2 = this;
        if (!((Gg)d2).e && (uY2 = d2.J((XF)b2)) instanceof Gz) {
            void a2;
            ((Gz)uY2).J((Gg)d2, (XF)b2);
            a2.J(Tz.r);
        }
    }

    static {
        String[] stringArray = new String[tTa.h];
        stringArray[uSa.E] = Jta.v;
        stringArray[vRa.d] = uOa.g;
        stringArray[uqa.g] = JQa.a;
        stringArray[yRa.d] = BQa.e;
        stringArray[AQa.P] = QTa.B;
        INSTRUMENTS = Lists.newArrayList(stringArray);
    }

    private String J(int n2) {
        int b2 = n2;
        BlockNote a2 = this;
        if (b2 < 0 || b2 >= INSTRUMENTS.size()) {
            b2 = uSa.E;
        }
        return INSTRUMENTS.get(b2);
    }

    @Override
    public hy J() {
        return hy.MODEL;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, int n2, int n3) {
        void b2;
        void e2;
        void a2;
        Object f2 = xF;
        BlockNote d2 = this;
        float c2 = (float)Math.pow(KPa.y, (double)(a2 - lqa.s) / hQa.x);
        void v0 = e2;
        v0.J((double)f2.getX() + kTa.B, (double)f2.getY() + kTa.B, (double)f2.getZ() + kTa.B, new StringBuilder().insert(5 >> 3, Npa.O).append(d2.J((int)b2)).toString(), vQa.q, c2);
        v0.J(UZ.NOTE, (double)f2.getX() + kTa.B, (double)f2.getY() + JPa.ja, (double)f2.getZ() + kTa.B, (double)a2 / zOa.y, aSa.V, aSa.V, new int[uSa.E]);
        return vRa.d != 0;
    }

    @Override
    public uY J(Gg gg2, int n2) {
        int c2 = n2;
        BlockNote a2 = this;
        return new Gz();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Gg gg2, XF xF, IBlockState iBlockState, Sx sx2, DZ dZ2, float f2, float f3, float f4) {
        void g2;
        void h2;
        Object i2 = iBlockState;
        BlockNote f5 = this;
        if (h2.e) {
            return vRa.d != 0;
        }
        i2 = h2.J((XF)g2);
        if (i2 instanceof Gz) {
            void e2;
            Object object = i2 = (Gz)((Object)i2);
            ((Gz)((Object)object)).J();
            ((Gz)((Object)object)).J((Gg)h2, (XF)g2);
            e2.J(Tz.X);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF, IBlockState iBlockState, Block block) {
        void c2;
        void d2;
        BlockNote blockNote = block2;
        Block block2 = block;
        BlockNote a2 = blockNote;
        void v1 = d2;
        boolean b2 = v1.k((XF)c2);
        Block e2 = v1.J((XF)c2);
        if (e2 instanceof Gz) {
            e2 = (Gz)((Object)e2);
            if (((Gz)((Object)e2)).I != b2) {
                if (b2) {
                    ((Gz)((Object)e2)).J((Gg)d2, (XF)c2);
                }
                ((Gz)((Object)e2)).I = b2;
            }
        }
    }
}

