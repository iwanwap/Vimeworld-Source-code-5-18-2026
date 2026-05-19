/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DEa
 *  Ey
 *  Gg
 *  I
 *  Mda
 *  QFa
 *  UZ
 *  aSa
 *  eAa
 *  vRa
 *  ysa
 */
package net.minecraft.block;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;

public final class BlockSponge
extends Block {
    public static final PropertyBool WET = PropertyBool.J(kra.g);

    /*
     * WARNING - void declaration
     */
    @Override
    public void l(Gg gg2, XF xF2, IBlockState iBlockState, Random random) {
        void c2;
        void d2;
        void a2;
        Object e2 = iBlockState;
        BlockSponge b2 = this;
        if (e2.J(WET).booleanValue() && (e2 = DZ.random((Random)a2)) != DZ.UP && !Gg.J((I)d2, (XF)c2.offset((DZ)((Object)e2)))) {
            void v1;
            void v0 = c2;
            double d3 = v0.getX();
            double d4 = v0.getY();
            double d5 = v0.getZ();
            if (e2 == DZ.DOWN) {
                d4 -= fPa.ca;
                d3 += a2.nextDouble();
                d5 += a2.nextDouble();
                v1 = d2;
            } else {
                d4 += a2.nextDouble() * Jra.A;
                if (((DZ)((Object)e2)).getAxis() == RX.X) {
                    d5 += a2.nextDouble();
                    if (e2 == DZ.EAST) {
                        d3 += oua.i;
                        v1 = d2;
                    } else {
                        d3 += fPa.ca;
                        v1 = d2;
                    }
                } else {
                    d3 += a2.nextDouble();
                    if (e2 == DZ.SOUTH) {
                        d5 += oua.i;
                        v1 = d2;
                    } else {
                        d5 += fPa.ca;
                        v1 = d2;
                    }
                }
            }
            v1.J(UZ.DRIP_WATER, d3, d4, d5, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        }
    }

    @Override
    public int C(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSponge a2 = this;
        if (b2.J(WET).booleanValue()) {
            return vRa.d;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void C(Gg gg2, XF xF2, IBlockState iBlockState) {
        void c2;
        void a2;
        Object d2 = xF2;
        BlockSponge b2 = this;
        if (!a2.J(WET).booleanValue() && b2.l((Gg)c2, (XF)((Object)d2))) {
            c2.J((XF)((Object)d2), a2.J(WET, vRa.d != 0), uqa.g);
            c2.f(zta.Z, (XF)((Object)d2), Block.J(QFa.sc));
        }
    }

    @Override
    public IBlockState J(int n2) {
        int b2 = n2;
        BlockSponge a2 = this;
        return a2.J().J(WET, ((b2 & vRa.d) == vRa.d ? vRa.d : uSa.E) != 0);
    }

    @Override
    public BlockState J() {
        BlockSponge a2;
        IProperty[] iPropertyArray = new IProperty[vRa.d];
        iPropertyArray[uSa.E] = WET;
        return new BlockState(a2, iPropertyArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        IBlockState d2 = iBlockState;
        BlockSponge a2 = this;
        a2.C((Gg)c2, (XF)b2, d2);
    }

    public BlockSponge() {
        BlockSponge a2;
        BlockSponge blockSponge = a2;
        super(Material.sponge);
        blockSponge.J(blockSponge.blockState.J().J(WET, uSa.E != 0));
        blockSponge.J(yGa.A);
    }

    @Override
    public String f() {
        BlockSponge a2;
        return Ey.f((String)new StringBuilder().insert(2 & 5, a2.J()).append(PQa.K).toString());
    }

    /*
     * WARNING - void declaration
     */
    private boolean l(Gg gg2, XF xF2) {
        ArrayList<BlockSponge> arrayList;
        void b2;
        XF xF3;
        DEa dEa2;
        int a22;
        block6: {
            void a22;
            BlockSponge blockSponge = this;
            LinkedList<DEa> linkedList = Lists.newLinkedList();
            ArrayList<BlockSponge> arrayList2 = Lists.newArrayList();
            linkedList.add(new DEa((Object)a22, (Object)uSa.E));
            a22 = uSa.E;
            while (!linkedList.isEmpty()) {
                dEa2 = (DEa)linkedList.poll();
                xF3 = (XF)((Object)dEa2.J());
                int n2 = (Integer)dEa2.f();
                DZ[] dZArray = DZ.values();
                int n3 = dZArray.length;
                int n4 = uSa.E;
                while (n4 < n3) {
                    int n5;
                    Object c2 = dZArray[n5];
                    if (b2.J((XF)((Object)(c2 = xF3.offset((DZ)((Object)c2))))).J().J() == Material.water) {
                        b2.J((XF)((Object)c2), QFa.HF.J(), uqa.g);
                        ++a22;
                        arrayList2.add((BlockSponge)c2);
                        if (n2 < uua.p) {
                            linkedList.add(new DEa(c2, (Object)(n2 + vRa.d)));
                        }
                    }
                    n4 = ++n5;
                }
                if (a22 <= ysa.s) continue;
                arrayList = arrayList2;
                break block6;
            }
            arrayList = arrayList2;
        }
        DEa dEa3 = dEa2 = arrayList.iterator();
        while (dEa3.hasNext()) {
            xF3 = (XF)((Object)dEa2.next());
            dEa3 = dEa2;
            b2.f(xF3, QFa.HF);
        }
        if (a22 > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int f(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        BlockSponge a2 = this;
        if (b2.J(WET).booleanValue()) {
            return vRa.d;
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Gg gg2, XF xF2, IBlockState iBlockState, Block block) {
        void a2;
        void c2;
        void d2;
        BlockSponge b2;
        IBlockState e2 = iBlockState;
        BlockSponge blockSponge = b2 = this;
        blockSponge.C((Gg)d2, (XF)c2, e2);
        super.J((Gg)d2, (XF)c2, e2, (Block)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        void c2;
        List<Mda> d2 = list;
        BlockSponge a2 = this;
        d2.add(new Mda((eAa)c2, vRa.d, uSa.E));
        d2.add(new Mda((eAa)c2, vRa.d, vRa.d));
    }
}

