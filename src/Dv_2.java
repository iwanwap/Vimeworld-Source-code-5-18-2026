/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  I
 *  Oz
 *  QFa
 *  aAa
 *  kta
 *  pua
 *  vL
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dv_2
extends Ex {
    private boolean k;
    private boolean j;
    private boolean J;
    private boolean A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public static int J(I i2, vL vL2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, boolean bl2, boolean bl3) {
        void f2;
        void i3;
        void var14_15;
        void j2;
        I i4 = i2;
        int n8 = uSa.E;
        XF xF2 = new XF((vL)j2);
        zz zz2 = new zz();
        void v0 = var14_15 = i3;
        while (v0 < i3 + f2) {
            void e2;
            void h2;
            void v1 = h2;
            while (v1 < h2 + e2) {
                void var15_16;
                void d2;
                void g2;
                void v2 = g2;
                while (v2 < g2 + d2) {
                    void var16_17;
                    block14: {
                        void b2;
                        void v3;
                        Block k2;
                        block18: {
                            block17: {
                                block15: {
                                    void c2;
                                    block16: {
                                        void a2;
                                        zz2.func_181079_c((int)var14_15, (int)var15_16, (int)var16_17);
                                        k2 = i4.J((XF)zz2).J();
                                        if (k2.J() == Material.air) break block14;
                                        if (k2 instanceof BlockTrapDoor) break block15;
                                        if (k2 == QFa.jd || k2 == QFa.sc) break block16;
                                        if (a2 == false && k2 instanceof BlockDoor && k2.J() == Material.wood) {
                                            return uSa.E;
                                        }
                                        break block17;
                                    }
                                    if (c2 != false) {
                                        return pua.o;
                                    }
                                    n8 = vRa.d;
                                    v3 = j2;
                                    break block18;
                                }
                                n8 = vRa.d;
                            }
                            v3 = j2;
                        }
                        if (v3.j.J((XF)zz2).J() instanceof BlockRailBase) {
                            if (!(j2.j.J(xF2).J() instanceof BlockRailBase) && !(j2.j.J(xF2.down()).J() instanceof BlockRailBase)) {
                                return ERa.Ka;
                            }
                        } else if (!(k2.J(i4, (XF)zz2) || b2 != false && k2 instanceof BlockDoor && k2.J() == Material.wood)) {
                            if (k2 instanceof BlockFence || k2 instanceof BlockFenceGate || BlockCustomWall.WALL_BLOCKS.contains(k2)) {
                                return ERa.Ka;
                            }
                            if (k2 instanceof BlockTrapDoor) {
                                return pta.a;
                            }
                            if (k2.J() != Material.lava) {
                                return uSa.E;
                            }
                            if (!j2.H()) {
                                return rQa.p;
                            }
                        }
                    }
                    v2 = ++var16_17;
                }
                v1 = ++var15_16;
            }
            v0 = ++var14_15;
        }
        if (n8 != 0) {
            return uqa.g;
        }
        return vRa.d;
    }

    public void C(boolean bl) {
        boolean b2 = bl;
        Dv_2 a2 = this;
        a2.I = b2;
    }

    public Dv_2() {
        Dv_2 a2;
    }

    public boolean l() {
        Dv_2 a2;
        return a2.k;
    }

    public boolean f() {
        Dv_2 a2;
        return a2.j;
    }

    public boolean J() {
        Dv_2 a2;
        return a2.I;
    }

    public void l(boolean bl) {
        boolean b2 = bl;
        Dv_2 a2 = this;
        a2.J = b2;
    }

    @Override
    public aAa J(vL vL2) {
        Dv_2 dv_2;
        int n2;
        Dv_2 b2 = vL2;
        Dv_2 a2 = this;
        if (a2.k && b2.L()) {
            Block block;
            n2 = (int)b2.J().j;
            zz zz2 = new zz(Oz.f((double)((vL)b2).la), n2, Oz.f((double)((vL)b2).A));
            Block block2 = block = a2.j.J((XF)zz2).J();
            while (block2 == QFa.jd || block == QFa.sc) {
                zz2.func_181079_c(Oz.f((double)((vL)b2).la), ++n2, Oz.f((double)((vL)b2).A));
                block = a2.j.J((XF)zz2).J();
                block2 = block;
            }
            dv_2 = a2;
            a2.j = uSa.E;
        } else {
            n2 = Oz.f((double)(b2.J().j + kTa.B));
            dv_2 = a2;
        }
        return dv_2.J(Oz.f((double)b2.J().J), n2, Oz.f((double)b2.J().I));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(I i2, vL vL2) {
        void b2;
        Dv_2 a2;
        Dv_2 c2 = vL2;
        Dv_2 dv_2 = a2 = this;
        super.J((I)b2, (vL)c2);
        dv_2.A = dv_2.j;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int J(aAa[] aAaArray, vL vL2, aAa aAa2, aAa aAa3, float f2) {
        void a2;
        void b2;
        aAa d2;
        Dv_2 f3 = aAa2;
        Dv_2 c2 = this;
        int n2 = uSa.E;
        int n3 = uSa.E;
        Dv_2 dv_2 = f3;
        if (c2.J((vL)d2, ((aAa)dv_2).I, ((aAa)dv_2).C + vRa.d, ((aAa)f3).k) == vRa.d) {
            n3 = vRa.d;
        }
        Dv_2 dv_22 = c2;
        Dv_2 dv_23 = f3;
        aAa aAa4 = dv_22.J((vL)d2, ((aAa)dv_23).I, ((aAa)dv_23).C, ((aAa)f3).k + vRa.d, n3);
        Dv_2 dv_24 = f3;
        aAa aAa5 = dv_22.J((vL)d2, ((aAa)f3).I - vRa.d, ((aAa)dv_24).C, ((aAa)dv_24).k, n3);
        Dv_2 dv_25 = f3;
        aAa aAa6 = dv_22.J((vL)d2, ((aAa)f3).I + vRa.d, ((aAa)dv_25).C, ((aAa)dv_25).k, n3);
        Dv_2 dv_26 = f3;
        d2 = dv_22.J((vL)d2, ((aAa)dv_26).I, ((aAa)dv_26).C, ((aAa)f3).k - vRa.d, n3);
        if (aAa4 != null && !aAa4.A && aAa4.J((aAa)b2) < a2) {
            e[n2++] = aAa4;
        }
        if (aAa5 != null && !aAa5.A && aAa5.J((aAa)b2) < a2) {
            e[n2++] = aAa5;
        }
        if (aAa6 != null && !aAa6.A && aAa6.J((aAa)b2) < a2) {
            e[n2++] = aAa6;
        }
        if (d2 != null && !d2.A && d2.J((aAa)b2) < a2) {
            e[n2++] = d2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public aAa J(vL vL2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Dv_2 e2 = vL2;
        Dv_2 d5 = this;
        return d5.J(Oz.f((double)(c2 - (double)(((vL)e2).F / kta.v))), Oz.f((double)b2), Oz.f((double)(a2 - (double)(((vL)e2).F / kta.v))));
    }

    @Override
    public void J() {
        Dv_2 a2;
        Dv_2 dv_2 = a2;
        super.J();
        dv_2.j = dv_2.A;
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Dv_2 a2 = this;
        a2.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    private aAa J(vL vL2, int n2, int n3, int n4, int n5) {
        int a2;
        void b2;
        void d2;
        void e2;
        int f2 = n3;
        Dv_2 c2 = this;
        aAa aAa2 = null;
        int n6 = c2.J((vL)e2, (int)d2, f2, (int)b2);
        if (n6 == uqa.g) {
            return c2.J((int)d2, f2, (int)b2);
        }
        if (n6 == vRa.d) {
            aAa2 = c2.J((int)d2, f2, (int)b2);
        }
        if (aAa2 == null && a2 > 0 && n6 != ERa.Ka && n6 != pta.a && c2.J((vL)e2, (int)d2, f2 + a2, (int)b2) == vRa.d) {
            aAa2 = c2.J((int)d2, f2 + a2, (int)b2);
            f2 += a2;
        }
        if (aAa2 != null) {
            int n7;
            block10: {
                a2 = uSa.E;
                n6 = uSa.E;
                int n8 = f2;
                while (n8 > 0) {
                    Dv_2 dv_2 = c2;
                    n6 = dv_2.J((vL)e2, (int)d2, f2 - vRa.d, (int)b2);
                    if (dv_2.j && n6 == pua.o) {
                        return null;
                    }
                    if (n6 != vRa.d) {
                        n7 = n6;
                        break block10;
                    }
                    if (a2++ >= e2.A()) {
                        return null;
                    }
                    if (--f2 <= 0) {
                        return null;
                    }
                    aAa2 = c2.J((int)d2, f2, (int)b2);
                    n8 = f2;
                }
                n7 = n6;
            }
            if (n7 == rQa.p) {
                return null;
            }
        }
        return aAa2;
    }

    /*
     * WARNING - void declaration
     */
    private int J(vL vL2, int n2, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        Dv_2 a2;
        int n5 = n4;
        Dv_2 dv_2 = a2 = this;
        Dv_2 dv_22 = a2;
        Dv_2 dv_23 = a2;
        return Dv_2.J((I)a2.j, (vL)d2, (int)c2, (int)b2, (int)e2, dv_2.k ? 1 : 0, dv_2.J ? 1 : 0, dv_22.I ? 1 : 0, dv_22.j, dv_23.J, dv_23.I);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Dv_2 a2 = this;
        a2.j = b2;
    }
}

