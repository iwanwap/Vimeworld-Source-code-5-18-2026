/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Efa
 *  Fpa
 *  Gg
 *  Gw
 *  MD
 *  MQa
 *  QFa
 *  Waa
 *  Xv
 *  Zta
 *  dz
 *  kta
 *  pua
 *  uY
 *  vRa
 *  ww
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class uU {
    public int componentType;
    public Xv boundingBox;
    public DZ coordBaseMode;

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, boolean bl) {
        void var16_18;
        void f2;
        void c2;
        void g2;
        void d2;
        void h2;
        void e2;
        uU uU2 = this;
        float f3 = (float)(e2 - h2 + vRa.d);
        float f4 = (float)(d2 - g2 + vRa.d);
        float f5 = (float)(c2 - f2 + vRa.d);
        float f6 = (float)h2 + f3 / kta.v;
        float f7 = (float)f2 + f5 / kta.v;
        void v0 = var16_18 = g2;
        while (v0 <= d2) {
            float f8 = (float)(var16_18 - g2) / f4;
            void v1 = h2;
            while (v1 <= e2) {
                void var18_20;
                float f9 = ((float)var18_20 - f6) / (f3 * MQa.L);
                void v2 = f2;
                while (v2 <= c2) {
                    void i2;
                    void j2;
                    void a2;
                    void k2;
                    float f10 = ((float)k2 - f7) / (f5 * MQa.L);
                    if (a2 == false || uU2.J((Gg)j2, (int)var18_20, (int)var16_18, (int)k2, (Xv)i2).J().J() != Material.air) {
                        float f11 = f9;
                        float f12 = f8;
                        float f13 = f10;
                        if (f11 * f11 + f12 * f12 + f13 * f13 <= xSa.D) {
                            void b2;
                            uU2.f((Gg)j2, (IBlockState)b2, (int)var18_20, (int)var16_18, (int)k2, (Xv)i2);
                        }
                    }
                    v2 = ++k2;
                }
                v1 = ++var18_20;
            }
            v0 = ++var16_18;
        }
    }

    public uU() {
        uU a2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(Gg gg2, IBlockState iBlockState, int n2, int n3, int n4, Xv xv2) {
        void a2;
        void c2;
        void b2;
        uU d2 = this;
        int g22 = n2;
        XF g22 = new XF(d2.J(g22, (int)b2), d2.J((int)c2), d2.f(g22, (int)b2));
        if (a2.J((MD)g22)) {
            void e2;
            void f2;
            f2.J(g22, (IBlockState)e2, uqa.g);
        }
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(Gg gg2, int n2, int n3, int n4, Xv xv2) {
        void e2;
        void a2;
        int c2;
        void b2;
        uU d2;
        int f22 = n2;
        uU uU2 = d2 = this;
        int n5 = uU2.J(f22, (int)b2);
        XF f22 = new XF(n5, c2 = uU2.J(c2), f22 = uU2.f(f22, (int)b2));
        if (!a2.J((MD)f22)) {
            return QFa.HF.J();
        }
        return e2.J(f22);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int f(int n2, int n3) {
        int c2 = n3;
        uU a2 = this;
        if (a2.coordBaseMode == null) {
            return c2;
        }
        switch (Gw.$SwitchMap$net$minecraft$util$EnumFacing[a2.coordBaseMode.ordinal()]) {
            case 1: {
                return a2.boundingBox.maxZ - c2;
            }
            case 2: {
                return a2.boundingBox.minZ + c2;
            }
            case 3: 
            case 4: {
                void b2;
                return a2.boundingBox.minZ + b2;
            }
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int J(int n2, int n3) {
        int c2 = n2;
        uU b2 = this;
        if (b2.coordBaseMode == null) {
            return c2;
        }
        switch (Gw.$SwitchMap$net$minecraft$util$EnumFacing[b2.coordBaseMode.ordinal()]) {
            case 1: 
            case 2: {
                return b2.boundingBox.minX + c2;
            }
            case 3: {
                void a2;
                return b2.boundingBox.maxX - a2;
            }
            case 4: {
                void a2;
                return b2.boundingBox.minX + a2;
            }
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, Random random, float f2, int n2, int n3, int n4, IBlockState iBlockState) {
        void e2;
        void f3;
        uU uU2 = iBlockState2;
        IBlockState iBlockState2 = iBlockState;
        uU a2 = uU2;
        if (f3.nextFloat() < e2) {
            void g2;
            void b2;
            void c2;
            void d2;
            IBlockState i2;
            void h2;
            a2.f((Gg)h2, i2, (int)d2, (int)c2, (int)b2, (Xv)g2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, Random random, int n2, int n3, int n4, DZ dZ2) {
        void f2;
        void c2;
        void b2;
        void d2;
        Object h2 = random;
        Object e2 = this;
        h2 = new XF(e2.J((int)d2, (int)b2), e2.J((int)c2), e2.f((int)d2, (int)b2));
        if (f2.J((MD)h2)) {
            void a2;
            void g2;
            Efa.J((Gg)g2, (XF)((Object)h2), (DZ)a2.rotateYCCW(), (Block)QFa.UB);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, Random random, ww ww2) {
        void e2;
        void h2;
        void var12_14;
        uU uU2 = this;
        void v0 = var12_14 = h2;
        while (v0 <= e2) {
            void f2;
            void i2;
            void v1 = i2;
            while (v1 <= f2) {
                void var13_15;
                void d2;
                void g2;
                void v2 = g2;
                while (v2 <= d2) {
                    void j2;
                    void l2;
                    void k2;
                    void c2;
                    if (c2 == false || uU2.J((Gg)k2, (int)var13_15, (int)var12_14, (int)l2, (Xv)j2).J().J() != Material.air) {
                        void b2;
                        void a2;
                        void v3 = var12_14;
                        a2.J((Random)b2, (int)var13_15, (int)v3, (int)l2, (v3 == h2 || var12_14 == e2 || var13_15 == i2 || var13_15 == f2 || l2 == g2 || l2 == d2 ? vRa.d : uSa.E) != 0);
                        uU2.f((Gg)k2, a2.J(), (int)var13_15, (int)var12_14, (int)l2, (Xv)j2);
                    }
                    v2 = ++l2;
                }
                v1 = ++var13_15;
            }
            v0 = ++var12_14;
        }
    }

    public void J(Gg gg2, Waa waa2) {
        int b2;
        uU c2 = waa2;
        uU a2 = this;
        if (c2.J(Fpa.e)) {
            uU uU2 = a2;
            uU2.boundingBox = new Xv(c2.J(Fpa.e));
        }
        a2.coordBaseMode = (b2 = c2.J(zOa.p)) == pua.o ? null : DZ.getHorizontal(b2);
        a2.componentType = c2.J(Zta.Ia);
        a2.J((Waa)c2);
    }

    public abstract void f(Waa var1);

    public int J() {
        uU a2;
        return a2.componentType;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Xv xv2, Random random, int n2, int n3, int n4, int n5, List<baa> list, int n6) {
        uY i2;
        void h2;
        void e2;
        void d2;
        void j22;
        int n7 = n2;
        uU f2 = this;
        XF j22 = new XF(f2.J((int)j22, (int)d2), f2.J((int)e2), f2.f((int)j22, (int)d2));
        if (h2.J((MD)j22) && i2.J(j22).J() != QFa.EA) {
            void c2;
            i2.J(j22, QFa.EA.J(f2.J(QFa.EA, (int)c2)), uqa.g);
            i2 = i2.J(j22);
            if (i2 instanceof dz) {
                void a2;
                void b2;
                void g2;
                baa.J((Random)g2, (List<baa>)b2, (dz)i2, (int)a2);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Waa J() {
        uU uU2 = this;
        uU a2 = new Waa();
        a2.J(QTa.O, uv.J(uU2));
        a2.J(Fpa.e, uU2.boundingBox.J());
        a2.J(zOa.p, uU2.coordBaseMode == null ? pua.o : uU2.coordBaseMode.getHorizontalIndex());
        uU uU3 = a2;
        uU3.J(Zta.Ia, uU2.componentType);
        uU2.f((Waa)uU3);
        return uU3;
    }

    public int J(Block block, int n2) {
        DZ b2;
        int c2 = n2;
        uU a2 = this;
        if (b2 == QFa.SA) {
            if (a2.coordBaseMode == DZ.WEST || a2.coordBaseMode == DZ.EAST) {
                if (c2 == vRa.d) {
                    return uSa.E;
                }
                return vRa.d;
            }
        } else if (b2 instanceof BlockDoor) {
            if (a2.coordBaseMode == DZ.SOUTH) {
                if (c2 == 0) {
                    return uqa.g;
                }
                if (c2 == uqa.g) {
                    return uSa.E;
                }
            } else {
                if (a2.coordBaseMode == DZ.WEST) {
                    return c2 + vRa.d & yRa.d;
                }
                if (a2.coordBaseMode == DZ.EAST) {
                    return c2 + yRa.d & yRa.d;
                }
            }
        } else if (b2 != QFa.We && b2 != QFa.WA && b2 != QFa.qB && b2 != QFa.E && b2 != QFa.oa) {
            if (b2 == QFa.z) {
                if (a2.coordBaseMode == DZ.SOUTH) {
                    if (c2 == DZ.NORTH.getIndex()) {
                        return DZ.SOUTH.getIndex();
                    }
                    if (c2 == DZ.SOUTH.getIndex()) {
                        return DZ.NORTH.getIndex();
                    }
                } else if (a2.coordBaseMode == DZ.WEST) {
                    if (c2 == DZ.NORTH.getIndex()) {
                        return DZ.WEST.getIndex();
                    }
                    if (c2 == DZ.SOUTH.getIndex()) {
                        return DZ.EAST.getIndex();
                    }
                    if (c2 == DZ.WEST.getIndex()) {
                        return DZ.NORTH.getIndex();
                    }
                    if (c2 == DZ.EAST.getIndex()) {
                        return DZ.SOUTH.getIndex();
                    }
                } else if (a2.coordBaseMode == DZ.EAST) {
                    if (c2 == DZ.NORTH.getIndex()) {
                        return DZ.EAST.getIndex();
                    }
                    if (c2 == DZ.SOUTH.getIndex()) {
                        return DZ.WEST.getIndex();
                    }
                    if (c2 == DZ.WEST.getIndex()) {
                        return DZ.NORTH.getIndex();
                    }
                    if (c2 == DZ.EAST.getIndex()) {
                        return DZ.SOUTH.getIndex();
                    }
                }
            } else if (b2 == QFa.Hd) {
                if (a2.coordBaseMode == DZ.SOUTH) {
                    if (c2 == yRa.d) {
                        return AQa.P;
                    }
                    if (c2 == AQa.P) {
                        return yRa.d;
                    }
                } else if (a2.coordBaseMode == DZ.WEST) {
                    if (c2 == yRa.d) {
                        return vRa.d;
                    }
                    if (c2 == AQa.P) {
                        return uqa.g;
                    }
                    if (c2 == uqa.g) {
                        return yRa.d;
                    }
                    if (c2 == vRa.d) {
                        return AQa.P;
                    }
                } else if (a2.coordBaseMode == DZ.EAST) {
                    if (c2 == yRa.d) {
                        return uqa.g;
                    }
                    if (c2 == AQa.P) {
                        return vRa.d;
                    }
                    if (c2 == uqa.g) {
                        return yRa.d;
                    }
                    if (c2 == vRa.d) {
                        return AQa.P;
                    }
                }
            } else if (b2 != QFa.r && !(b2 instanceof BlockDirectional)) {
                if (b2 == QFa.Nc || b2 == QFa.bF || b2 == QFa.ib || b2 == QFa.EA) {
                    if (a2.coordBaseMode == DZ.SOUTH) {
                        if (c2 == DZ.NORTH.getIndex() || c2 == DZ.SOUTH.getIndex()) {
                            return DZ.getFront(c2).getOpposite().getIndex();
                        }
                    } else if (a2.coordBaseMode == DZ.WEST) {
                        if (c2 == DZ.NORTH.getIndex()) {
                            return DZ.WEST.getIndex();
                        }
                        if (c2 == DZ.SOUTH.getIndex()) {
                            return DZ.EAST.getIndex();
                        }
                        if (c2 == DZ.WEST.getIndex()) {
                            return DZ.NORTH.getIndex();
                        }
                        if (c2 == DZ.EAST.getIndex()) {
                            return DZ.SOUTH.getIndex();
                        }
                    } else if (a2.coordBaseMode == DZ.EAST) {
                        if (c2 == DZ.NORTH.getIndex()) {
                            return DZ.EAST.getIndex();
                        }
                        if (c2 == DZ.SOUTH.getIndex()) {
                            return DZ.WEST.getIndex();
                        }
                        if (c2 == DZ.WEST.getIndex()) {
                            return DZ.NORTH.getIndex();
                        }
                        if (c2 == DZ.EAST.getIndex()) {
                            return DZ.SOUTH.getIndex();
                        }
                    }
                }
            } else {
                b2 = DZ.getHorizontal(c2);
                if (a2.coordBaseMode == DZ.SOUTH) {
                    if (b2 == DZ.SOUTH || b2 == DZ.NORTH) {
                        return b2.getOpposite().getHorizontalIndex();
                    }
                } else if (a2.coordBaseMode == DZ.WEST) {
                    if (b2 == DZ.NORTH) {
                        return DZ.WEST.getHorizontalIndex();
                    }
                    if (b2 == DZ.SOUTH) {
                        return DZ.EAST.getHorizontalIndex();
                    }
                    if (b2 == DZ.WEST) {
                        return DZ.NORTH.getHorizontalIndex();
                    }
                    if (b2 == DZ.EAST) {
                        return DZ.SOUTH.getHorizontalIndex();
                    }
                } else if (a2.coordBaseMode == DZ.EAST) {
                    if (b2 == DZ.NORTH) {
                        return DZ.EAST.getHorizontalIndex();
                    }
                    if (b2 == DZ.SOUTH) {
                        return DZ.WEST.getHorizontalIndex();
                    }
                    if (b2 == DZ.WEST) {
                        return DZ.NORTH.getHorizontalIndex();
                    }
                    if (b2 == DZ.EAST) {
                        return DZ.SOUTH.getHorizontalIndex();
                    }
                }
            }
        } else if (a2.coordBaseMode == DZ.SOUTH) {
            if (c2 == uqa.g) {
                return yRa.d;
            }
            if (c2 == yRa.d) {
                return uqa.g;
            }
        } else if (a2.coordBaseMode == DZ.WEST) {
            if (c2 == 0) {
                return uqa.g;
            }
            if (c2 == vRa.d) {
                return yRa.d;
            }
            if (c2 == uqa.g) {
                return uSa.E;
            }
            if (c2 == yRa.d) {
                return vRa.d;
            }
        } else if (a2.coordBaseMode == DZ.EAST) {
            if (c2 == 0) {
                return uqa.g;
            }
            if (c2 == vRa.d) {
                return yRa.d;
            }
            if (c2 == uqa.g) {
                return vRa.d;
            }
            if (c2 == yRa.d) {
                return uSa.E;
            }
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public static uU J(List<uU> list, Xv xv2) {
        List<uU> list2 = list;
        for (uU b2 : list2) {
            void a2;
            if (b2.J() == null || !b2.J().J((Xv)a2)) continue;
            return b2;
        }
        return null;
    }

    public abstract boolean J(Gg var1, Random var2, Xv var3);

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, Random random, float f2, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, IBlockState iBlockState2, boolean bl) {
        void e2;
        void h2;
        void var14_16;
        uU uU2 = this;
        void v0 = var14_16 = h2;
        while (v0 <= e2) {
            void f3;
            void i2;
            void v1 = i2;
            while (v1 <= f3) {
                void var15_17;
                void d2;
                void g2;
                void v2 = g2;
                while (v2 <= d2) {
                    void l2;
                    void n8;
                    void m2;
                    void a2;
                    void j2;
                    void k2;
                    if (k2.nextFloat() <= j2 && (a2 == false || uU2.J((Gg)m2, (int)var15_17, (int)var14_16, (int)n8, (Xv)l2).J().J() != Material.air)) {
                        if (var14_16 != h2 && var14_16 != e2 && var15_17 != i2 && var15_17 != f3 && n8 != g2 && n8 != d2) {
                            void b2;
                            uU2.f((Gg)m2, (IBlockState)b2, (int)var15_17, (int)var14_16, (int)n8, (Xv)l2);
                        } else {
                            void c2;
                            uU2.f((Gg)m2, (IBlockState)c2, (int)var15_17, (int)var14_16, (int)n8, (Xv)l2);
                        }
                    }
                    v2 = ++n8;
                }
                v1 = ++var15_17;
            }
            v0 = ++var14_16;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void b2;
        void i2;
        int n8 = n3;
        uU e2 = this;
        void v0 = i2 = i2;
        while (v0 <= b2) {
            void c2;
            void f2;
            void v1 = f2;
            while (v1 <= c2) {
                void var9_11;
                void a2;
                void d2;
                void v2 = d2;
                while (v2 <= a2) {
                    void g2;
                    void var10_12;
                    void h2;
                    e2.f((Gg)h2, QFa.HF.J(), (int)var9_11, (int)i2, (int)var10_12++, (Xv)g2);
                    v2 = var10_12;
                }
                v1 = ++var9_11;
            }
            v0 = ++i2;
        }
    }

    public Xv J() {
        uU a2;
        return a2.boundingBox;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Xv xv2, Random random, int n2, int n3, int n4, List<baa> list, int n5) {
        uY h2;
        IBlockState g2;
        void d2;
        void c2;
        void i22;
        int n6 = n2;
        uU e2 = this;
        XF i22 = new XF(e2.J((int)i22, (int)c2), e2.J((int)d2), e2.f((int)i22, (int)c2));
        if (g2.J(i22) && h2.J(i22).J() != QFa.dC) {
            g2 = QFa.dC.J();
            void v0 = h2;
            v0.J(i22, QFa.dC.J((Gg)v0, i22, g2), uqa.g);
            h2 = h2.J(i22);
            if (h2 instanceof Fz) {
                void a2;
                void b2;
                void f2;
                baa.J((Random)f2, (List<baa>)b2, (Fz)h2, (int)a2);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public XF J() {
        uU a2;
        return new XF(a2.boundingBox.f());
    }

    public uU(int n2) {
        int b2 = n2;
        uU a2 = this;
        a2.componentType = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, Xv xv2, int n2, int n3, int n4, int n5, int n6, int n7, IBlockState iBlockState, IBlockState iBlockState2, boolean bl) {
        void e2;
        void h2;
        void var12_14;
        uU uU2 = this;
        void v0 = var12_14 = h2;
        while (v0 <= e2) {
            void f2;
            void i2;
            void v1 = i2;
            while (v1 <= f2) {
                void var13_15;
                void d2;
                void g2;
                void v2 = g2;
                while (v2 <= d2) {
                    void j2;
                    void l2;
                    void k2;
                    void a2;
                    if (a2 == false || uU2.J((Gg)k2, (int)var13_15, (int)var12_14, (int)l2, (Xv)j2).J().J() != Material.air) {
                        if (var12_14 != h2 && var12_14 != e2 && var13_15 != i2 && var13_15 != f2 && l2 != g2 && l2 != d2) {
                            void b2;
                            uU2.f((Gg)k2, (IBlockState)b2, (int)var13_15, (int)var12_14, (int)l2, (Xv)j2);
                        } else {
                            void c2;
                            uU2.f((Gg)k2, (IBlockState)c2, (int)var13_15, (int)var12_14, (int)l2, (Xv)j2);
                        }
                    }
                    v2 = ++l2;
                }
                v1 = ++var13_15;
            }
            v0 = ++var12_14;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        uU a2 = this;
        a2.boundingBox.J((int)c2, (int)b2, d2);
    }

    public void J(uU uU2, List<uU> list, Random object) {
        Object d2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, int n2, int n3, int n4, Xv xv2) {
        void a2;
        void c2;
        void b2;
        uU d2 = this;
        int f22 = n2;
        XF f22 = new XF(d2.J(f22, (int)b2), d2.J((int)c2), d2.f(f22, (int)b2));
        if (a2.J((MD)f22)) {
            void e2;
            void v0 = e2;
            while (!v0.J(f22) && f22.getY() < osa.Ja) {
                void v1 = e2;
                v0 = v1;
                v1.J(f22, QFa.HF.J(), uqa.g);
                f22 = f22.up();
            }
        }
    }

    public abstract void J(Waa var1);

    public int J(int n2) {
        int b2 = n2;
        uU a2 = this;
        if (a2.coordBaseMode == null) {
            return b2;
        }
        return b2 + a2.boundingBox.minY;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, IBlockState iBlockState, int n2, int n3, int n4, Xv xv2) {
        int g2;
        void a2;
        void b2;
        int d2;
        uU c2;
        int n5 = n3;
        uU uU2 = c2 = this;
        int n6 = uU2.J(d2, (int)b2);
        d2 = uU2.f(d2, (int)b2);
        if (a2.J((MD)new XF(n6, g2, d2))) {
            void f2;
            void v1 = f2;
            for (g2 = (v396130).J(g2); (v1.J(new XF(n6, g2, d2)) || f2.J(new XF(n6, g2, d2)).J().J().l()) && g2 > vRa.d; --g2) {
                void e2;
                void v2 = f2;
                v1 = v2;
                XF xF = new XF(n6, g2, d2);
                v2.J(xF, (IBlockState)e2, uqa.g);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Xv xv2) {
        int n2;
        void b2;
        int c2;
        void a22;
        uU uU2;
        uU uU3 = uU2 = this;
        int n3 = Math.max(uU3.boundingBox.minX - vRa.d, a22.minX);
        int n4 = Math.max(uU3.boundingBox.minY - vRa.d, a22.minY);
        int n5 = Math.max(uU3.boundingBox.minZ - vRa.d, a22.minZ);
        int n6 = Math.min(uU3.boundingBox.maxX + vRa.d, a22.maxX);
        int n7 = Math.min(uU3.boundingBox.maxY + vRa.d, a22.maxY);
        int a22 = Math.min(uU3.boundingBox.maxZ + vRa.d, a22.maxZ);
        zz zz2 = new zz();
        int n8 = c2 = n3;
        while (n8 <= n6) {
            int n9 = n5;
            while (n9 <= a22) {
                if (b2.J((XF)zz2.func_181079_c(c2, n4, n2)).J().J().l()) {
                    return vRa.d != 0;
                }
                if (b2.J((XF)zz2.func_181079_c(c2, n7, n2)).J().J().l()) {
                    return vRa.d != 0;
                }
                n9 = ++n2;
            }
            n8 = ++c2;
        }
        int n10 = c2 = n3;
        while (n10 <= n6) {
            int n11 = n4;
            while (n11 <= n7) {
                if (b2.J((XF)zz2.func_181079_c(c2, n2, n5)).J().J().l()) {
                    return vRa.d != 0;
                }
                if (b2.J((XF)zz2.func_181079_c(c2, n2, a22)).J().J().l()) {
                    return vRa.d != 0;
                }
                n11 = ++n2;
            }
            n10 = ++c2;
        }
        int n12 = c2 = n5;
        while (n12 <= a22) {
            int n13 = n4;
            while (n13 <= n7) {
                if (b2.J((XF)zz2.func_181079_c(n3, n2, c2)).J().J().l()) {
                    return vRa.d != 0;
                }
                if (b2.J((XF)zz2.func_181079_c(n6, n2, c2)).J().J().l()) {
                    return vRa.d != 0;
                }
                n13 = ++n2;
            }
            n12 = ++c2;
        }
        return uSa.E != 0;
    }
}

