/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  Mda
 *  Tf
 *  WTa
 *  bFa
 *  pqa
 *  pua
 *  uY
 *  vRa
 *  wba
 *  zC
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class QY_2 {
    private Daa L;
    private XF E;
    private XF m;
    public Gg C;
    private int i;
    private boolean M;
    private int k;
    private int j;
    public bFa J;
    private boolean A;
    private int I;

    /*
     * WARNING - void declaration
     */
    private boolean f(XF xF) {
        void a2;
        QY_2 qY_2 = this;
        IBlockState b2 = qY_2.C.J((XF)a2);
        QY_2 qY_22 = qY_2;
        b2.J().J(qY_22.C, (XF)a2, b2, (Sx)qY_2.J);
        boolean bl = qY_22.C.G((XF)a2);
        if (bl) {
            b2.J().J(qY_2.C, (XF)a2, b2);
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF, DZ dZ2) {
        void a22;
        QY_2 b2;
        Object c2 = xF;
        QY_2 qY_2 = b2 = this;
        WTa.J((Sx)b2.J, (cua)cua.LEFT_CLICK_BLOCK, (Gg)qY_2.C, (XF)((Object)c2), (DZ)a22);
        if (qY_2.f()) {
            if (!b2.C.J((Sx)null, (XF)((Object)c2), (DZ)a22)) {
                b2.J((XF)((Object)c2));
                return;
            }
        } else {
            QY_2 qY_22 = b2;
            Block block = qY_22.C.J((XF)((Object)c2)).J();
            if (qY_22.L.isAdventure()) {
                if (b2.L == Daa.SPECTATOR) {
                    return;
                }
                if (!b2.J.w()) {
                    Mda mda2 = b2.J.f();
                    if (mda2 == null) {
                        return;
                    }
                    if (!mda2.J(block)) {
                        return;
                    }
                }
            }
            b2.C.J((Sx)null, (XF)((Object)c2), (DZ)a22);
            b2.I = b2.j;
            float f2 = pqa.r;
            if (block.J() != Material.air) {
                Block block2 = block;
                block2.J(b2.C, (XF)((Object)c2), (Sx)b2.J);
                f2 = block2.J((Sx)b2.J, b2.J.j, (XF)((Object)c2));
            }
            if (block.J() != Material.air && f2 >= pqa.r) {
                b2.J((XF)((Object)c2));
                return;
            }
            b2.M = vRa.d;
            b2.m = c2;
            int a22 = (int)(f2 * FRa.Ga);
            b2.C.J(b2.J.M(), (XF)((Object)c2), a22);
            b2.k = a22;
        }
    }

    public QY_2(Gg gg2) {
        QY_2 a2;
        QY_2 b2 = gg2;
        QY_2 qY_2 = a2 = this;
        a2.L = Daa.NOT_SET;
        a2.m = XF.ORIGIN;
        qY_2.E = XF.ORIGIN;
        qY_2.k = pua.o;
        qY_2.C = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gg gg2, Mda mda2) {
        void c2;
        void a2;
        QY_2 qY_2 = this;
        if (qY_2.L == Daa.SPECTATOR) {
            return uSa.E != 0;
        }
        void v0 = a2;
        int b2 = v0.E;
        int n2 = v0.J();
        QY_2 d2 = a2.f((Gg)b2, (Sx)c2);
        if (d2 != a2 || d2 != null && (((Mda)d2).E != b2 || d2.C() > 0 || d2.J() != n2)) {
            c2.K.j[c2.K.J] = d2;
            if (qY_2.f()) {
                ((Mda)d2).E = b2;
                if (d2.d()) {
                    d2.J(n2);
                }
            }
            if (((Mda)d2).E == 0) {
                c2.K.j[c2.K.J] = null;
            }
            if (!c2.V()) {
                ((bFa)c2).J(c2.x);
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        QY_2 qY_2;
        QY_2 qY_22 = qY_2 = this;
        qY_22.j += vRa.d;
        if (qY_22.A) {
            QY_2 qY_23 = qY_2;
            int n2 = qY_2.j - qY_23.i;
            Block block = qY_23.C.J(qY_2.E).J();
            if (block.J() == Material.air) {
                qY_2.A = uSa.E;
                return;
            }
            QY_2 qY_24 = qY_2;
            float f2 = block.J((Sx)qY_24.J, qY_24.J.j, qY_2.E) * (float)(n2 + vRa.d);
            int a2 = (int)(f2 * FRa.Ga);
            if (a2 != qY_2.k) {
                qY_2.C.J(qY_2.J.M(), qY_2.E, a2);
                qY_2.k = a2;
            }
            if (f2 >= pqa.r) {
                QY_2 qY_25 = qY_2;
                qY_25.A = uSa.E;
                qY_25.J(qY_25.E);
                return;
            }
        } else if (qY_2.M) {
            QY_2 qY_26 = qY_2;
            Block block = qY_26.C.J(qY_26.m).J();
            if (block.J() == Material.air) {
                qY_2.C.J(qY_2.J.M(), qY_2.m, pua.o);
                qY_2.k = pua.o;
                qY_2.M = uSa.E;
                return;
            }
            QY_2 qY_27 = qY_2;
            int n3 = qY_27.j - qY_27.I;
            QY_2 qY_28 = qY_2;
            float f3 = block.J((Sx)qY_28.J, qY_28.J.j, qY_2.E) * (float)(n3 + vRa.d);
            int a2 = (int)(f3 * FRa.Ga);
            if (a2 != qY_2.k) {
                qY_2.C.J(qY_2.J.M(), qY_2.m, a2);
                qY_2.k = a2;
            }
        }
    }

    public void f(Daa daa) {
        QY_2 a2;
        Daa b2 = daa;
        QY_2 qY_2 = a2 = this;
        a2.L = b2;
        b2.configurePlayerCapabilities(qY_2.J.h);
        qY_2.J.S();
        bFa[] bFaArray = new bFa[vRa.d];
        bFaArray[uSa.E] = a2.J;
        qY_2.J.l.J().J(new bda(gba.UPDATE_GAME_MODE, bFaArray));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF) {
        void a2;
        QY_2 qY_2 = this;
        if (qY_2.L.isCreative() && qY_2.J.J() != null && qY_2.J.J().J() instanceof xCa) {
            return uSa.E != 0;
        }
        QY_2 qY_22 = qY_2;
        IBlockState b2 = qY_22.C.J((XF)a2);
        uY uY2 = qY_22.C.J((XF)a2);
        if (qY_22.L.isAdventure()) {
            if (qY_2.L == Daa.SPECTATOR) {
                return uSa.E != 0;
            }
            if (!qY_2.J.w()) {
                Mda mda2 = qY_2.J.f();
                if (mda2 == null) {
                    return uSa.E != 0;
                }
                if (!mda2.J(b2.J())) {
                    return uSa.E != 0;
                }
            }
        }
        QY_2 qY_23 = qY_2;
        qY_2.C.J((Sx)qY_23.J, zta.Z, (XF)a2, Block.l(b2));
        boolean bl = qY_23.f((XF)a2);
        QY_2 qY_24 = qY_2;
        if (qY_2.f()) {
            qY_24.J.I.J((KC)new wba(qY_2.C, (XF)a2));
            return bl;
        }
        Mda mda3 = qY_24.J.f();
        boolean bl2 = qY_2.J.J(b2.J());
        if (mda3 != null) {
            Mda mda4 = mda3;
            mda4.J(qY_2.C, b2.J(), (XF)a2, (Sx)qY_2.J);
            if (mda4.E == 0) {
                qY_2.J.x();
            }
        }
        if (bl && bl2) {
            QY_2 qY_25 = qY_2;
            b2.J().J(qY_25.C, (Sx)qY_25.J, (XF)a2, b2, uY2);
        }
        return bl;
    }

    public boolean f() {
        QY_2 a2;
        return a2.L.isCreative();
    }

    public void J(Tf tf) {
        QY_2 b2 = tf;
        QY_2 a2 = this;
        a2.C = b2;
    }

    public void J() {
        QY_2 a2;
        a2.M = uSa.E;
        a2.C.J(a2.J.M(), a2.m, pua.o);
    }

    public Daa J() {
        QY_2 a2;
        return a2.L;
    }

    public void J(Daa daa) {
        Object b2 = daa;
        QY_2 a2 = this;
        if (a2.L == Daa.NOT_SET) {
            a2.L = b2;
        }
        QY_2 qY_2 = a2;
        qY_2.f(qY_2.L);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gg gg2, Mda mda2, XF xF, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void a2;
        void b2;
        void c2;
        void d2;
        void h2;
        Object i22;
        void e2;
        void g2;
        QY_2 qY_2 = this;
        if (qY_2.L == Daa.SPECTATOR) {
            i22 = g2.J((XF)e2);
            if (i22 instanceof zC) {
                Block block = g2.J((XF)e2).J();
                zC zC2 = (zC)i22;
                if (zC2 instanceof Fz && block instanceof BlockChest) {
                    zC2 = ((BlockChest)block).J((Gg)g2, (XF)e2);
                }
                if (zC2 != null) {
                    h2.J((HA)zC2);
                    return vRa.d != 0;
                }
            } else if (i22 instanceof HA) {
                h2.J((HA)i22);
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        void v0 = h2;
        WTa.J((Sx)v0, (cua)cua.RIGHT_CLICK_BLOCK, (Gg)g2, (XF)e2, (DZ)d2);
        if ((!v0.q() || h2.J() == null) && (i22 = g2.J((XF)e2)).J().J((Gg)g2, (XF)e2, (IBlockState)i22, (Sx)h2, (DZ)d2, (float)c2, (float)b2, (float)a2)) {
            return vRa.d != 0;
        }
        if (f5 == null) {
            return uSa.E != 0;
        }
        if (qY_2.f()) {
            void v1 = f5;
            int i22 = f5.J();
            int n2 = v1.E;
            boolean bl = f5.J((Sx)h2, (Gg)g2, (XF)e2, (DZ)d2, (float)c2, (float)b2, (float)a2);
            v1.J(i22);
            f5.E = n2;
            return bl;
        }
        return f5.J((Sx)h2, (Gg)g2, (XF)e2, (DZ)d2, (float)c2, (float)b2, (float)a2);
    }

    public void J(XF xF) {
        Object b2 = xF;
        QY_2 a2 = this;
        if (b2.equals((Object)a2.m)) {
            QY_2 qY_2 = a2;
            int n2 = a2.j - qY_2.I;
            Block block = qY_2.C.J((XF)((Object)b2)).J();
            if (block.J() != Material.air) {
                QY_2 qY_22 = a2;
                if (block.J((Sx)qY_22.J, qY_22.J.j, (XF)((Object)b2)) * (float)(n2 + vRa.d) >= ZSa.q) {
                    QY_2 qY_23 = a2;
                    qY_23.M = uSa.E;
                    qY_23.C.J(a2.J.M(), (XF)((Object)b2), pua.o);
                    qY_23.J((XF)((Object)b2));
                    return;
                }
                if (!a2.A) {
                    QY_2 qY_24 = a2;
                    a2.M = uSa.E;
                    a2.A = vRa.d;
                    qY_24.E = b2;
                    qY_24.i = a2.I;
                }
            }
        }
    }

    public boolean J() {
        QY_2 a2;
        return a2.L.isSurvivalOrAdventure();
    }
}

