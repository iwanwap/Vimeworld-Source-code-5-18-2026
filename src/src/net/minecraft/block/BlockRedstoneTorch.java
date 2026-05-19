/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  LQa
 *  MQa
 *  QFa
 *  RQa
 *  UZ
 *  Ypa
 *  Zpa
 *  aSa
 *  bRa
 *  eAa
 *  vRa
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch$Toggle;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockRedstoneTorch
extends BlockTorch {
    private final boolean isOn;
    private static Map<Gg, List<BlockRedstoneTorch$Toggle>> toggles = Maps.newHashMap();

    /*
     * WARNING - void declaration
     */
    @Override
    public int f(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Object e2;
        BlockRedstoneTorch blockRedstoneTorch = object;
        Object object = dZ2;
        BlockRedstoneTorch a2 = blockRedstoneTorch;
        if (e2 == DZ.DOWN) {
            void b2;
            void c2;
            void d2;
            return a2.J((I)d2, (XF)c2, (IBlockState)b2, (DZ)((Object)e2));
        }
        return uSa.E;
    }

    @Override
    public eAa J(IBlockState iBlockState, Random random, int n2) {
        int d2 = n2;
        BlockRedstoneTorch a2 = this;
        return eAa.J((Block)QFa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState) {
        BlockRedstoneTorch blockRedstoneTorch = this;
        if (blockRedstoneTorch.isOn) {
            int d2;
            DZ[] a2 = DZ.values();
            int n2 = a2.length;
            int n3 = d2 = uSa.E;
            while (n3 < n2) {
                void b2;
                void c2;
                DZ dZ2 = a2[d2];
                c2.f(b2.offset(dZ2), (Block)blockRedstoneTorch);
                n3 = ++d2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(I i2, XF xF2, IBlockState iBlockState, DZ dZ2) {
        Object e2;
        void b2;
        BlockRedstoneTorch blockRedstoneTorch = object;
        Object object = dZ2;
        BlockRedstoneTorch a2 = blockRedstoneTorch;
        if (a2.isOn && b2.J(FACING) != e2) {
            return Ypa.A;
        }
        return uSa.E;
    }

    public BlockRedstoneTorch(boolean bl2) {
        BlockRedstoneTorch a2;
        boolean b2 = bl2;
        BlockRedstoneTorch blockRedstoneTorch = a2 = this;
        blockRedstoneTorch.isOn = b2;
        blockRedstoneTorch.J(vRa.d != 0);
        blockRedstoneTorch.J((yGa)null);
    }

    @Override
    public boolean C() {
        return vRa.d != 0;
    }

    @Override
    public boolean J(Block block) {
        Block b2 = block;
        BlockRedstoneTorch a2 = this;
        if (b2 == QFa.AC || b2 == QFa.Ja) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        Object e2 = xF2;
        BlockRedstoneTorch c2 = this;
        if (c2.isOn) {
            void d2;
            void b2;
            void a2;
            Object object = e2;
            double d3 = (double)object.getX() + kTa.B + (a2.nextDouble() - kTa.B) * iSa.P;
            double d4 = (double)object.getY() + LQa.E + (a2.nextDouble() - kTa.B) * iSa.P;
            double d5 = (double)object.getZ() + kTa.B + (a2.nextDouble() - kTa.B) * iSa.P;
            e2 = b2.J(FACING);
            if (((DZ)((Object)e2)).getAxis().isHorizontal()) {
                e2 = ((DZ)((Object)e2)).getOpposite();
                d3 += aSa.Z * (double)((DZ)((Object)e2)).getFrontOffsetX();
                d4 += Ora.z;
                d5 += aSa.Z * (double)((DZ)((Object)e2)).getFrontOffsetZ();
            }
            d2.J(UZ.REDSTONE, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gg gg2, XF xF2, boolean bl2) {
        void b2;
        int a2;
        BlockRedstoneTorch d22 = gg2;
        BlockRedstoneTorch c2 = this;
        if (!toggles.containsKey(d22)) {
            toggles.put((Gg)d22, Lists.newArrayList());
        }
        List<BlockRedstoneTorch$Toggle> list = toggles.get(d22);
        if (a2 != 0) {
            list.add(new BlockRedstoneTorch$Toggle((XF)b2, d22.l()));
        }
        int d22 = uSa.E;
        int n2 = a2 = uSa.E;
        while (n2 < list.size()) {
            if (list.get((int)a2).pos.equals(b2) && ++d22 >= Yqa.i) {
                return vRa.d != 0;
            }
            n2 = ++a2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        List<BlockRedstoneTorch$Toggle> list;
        void b2;
        void c2;
        BlockRedstoneTorch e2 = gg2;
        BlockRedstoneTorch d2 = this;
        boolean bl2 = d2.l((Gg)e2, (XF)c2, (IBlockState)b2);
        List<BlockRedstoneTorch$Toggle> list2 = list = toggles.get(e2);
        while (list2 != null && !list.isEmpty() && e2.l() - list.get((int)uSa.E).time > RQa.N) {
            List<BlockRedstoneTorch$Toggle> list3 = list;
            list2 = list3;
            list3.remove(uSa.E);
        }
        if (d2.isOn) {
            if (bl2) {
                BlockRedstoneTorch blockRedstoneTorch = e2;
                blockRedstoneTorch.J((XF)c2, QFa.AC.J().J(FACING, b2.J(FACING)), yRa.d);
                if (d2.J((Gg)blockRedstoneTorch, (XF)c2, vRa.d != 0)) {
                    int n2;
                    e2.J((float)c2.getX() + MQa.L, (float)c2.getY() + MQa.L, (float)c2.getZ() + MQa.L, bRa.T, MQa.L, Zpa.o + (((Gg)e2).v.nextFloat() - ((Gg)e2).v.nextFloat()) * xSa.la);
                    int n3 = n2 = uSa.E;
                    while (n3 < tTa.h) {
                        void a2;
                        void v4 = c2;
                        double d3 = (double)v4.getX() + a2.nextDouble() * oQa.fa + iSa.P;
                        double d4 = (double)v4.getY() + a2.nextDouble() * oQa.fa + iSa.P;
                        double d5 = (double)v4.getZ() + a2.nextDouble() * oQa.fa + iSa.P;
                        int n4 = 4 ^ 5;
                        e2.J(UZ.SMOKE_NORMAL, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                        n3 = ++n2;
                    }
                    BlockRedstoneTorch blockRedstoneTorch2 = e2;
                    void v7 = c2;
                    blockRedstoneTorch2.J((XF)v7, blockRedstoneTorch2.J((XF)v7).J(), rRa.f);
                    return;
                }
            }
        } else if (!bl2 && !d2.J((Gg)e2, (XF)c2, uSa.E != 0)) {
            e2.J((XF)c2, QFa.Ja.J().J(FACING, b2.J(FACING)), yRa.d);
        }
    }

    @Override
    public eAa J(Gg gg2, XF xF2) {
        Object c2 = xF2;
        BlockRedstoneTorch a2 = this;
        return eAa.J((Block)QFa.Ja);
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object d2 = iBlockState;
        BlockRedstoneTorch a2 = this;
        d2 = d2.J(FACING).getOpposite();
        return c2.J(b2.offset((DZ)((Object)d2)), (DZ)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        BlockRedstoneTorch blockRedstoneTorch = this;
        if (blockRedstoneTorch.isOn) {
            int d2;
            DZ[] a2 = DZ.values();
            int n2 = a2.length;
            int n3 = d2 = uSa.E;
            while (n3 < n2) {
                void b2;
                void c2;
                DZ dZ2 = a2[d2];
                c2.f(b2.offset(dZ2), (Block)blockRedstoneTorch);
                n3 = ++d2;
            }
        }
    }

    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        BlockRedstoneTorch blockRedstoneTorch = random2;
        Random random2 = random;
        BlockRedstoneTorch a2 = blockRedstoneTorch;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void b2;
        void c2;
        BlockRedstoneTorch d2 = this;
        BlockRedstoneTorch e2 = gg2;
        if (!d2.f((Gg)e2, (XF)c2, (IBlockState)b2) && d2.isOn == d2.l((Gg)e2, (XF)c2, (IBlockState)b2)) {
            BlockRedstoneTorch blockRedstoneTorch = d2;
            e2.J((XF)c2, blockRedstoneTorch, blockRedstoneTorch.J((Gg)e2));
        }
    }

    @Override
    public int J(Gg gg2) {
        BlockRedstoneTorch b2 = gg2;
        BlockRedstoneTorch a2 = this;
        return uqa.g;
    }
}

