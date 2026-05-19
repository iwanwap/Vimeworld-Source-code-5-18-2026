/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  CAa
 *  Eoa
 *  Gba
 *  Gda
 *  Gg
 *  JPa
 *  Kpa
 *  Lba
 *  Lz
 *  MQa
 *  Mda
 *  PNa
 *  Qsa
 *  Rea
 *  SF
 *  Vca
 *  WBa
 *  YSa
 *  iMa
 *  mAa
 *  pqa
 *  pua
 *  tBa
 *  vL
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SF_3 {
    private XF g;
    private final Kpa L;
    private int E;
    private float m;
    private boolean C;
    public float i;
    private final iMa M;
    private Daa k;
    private Mda j;
    private final List<KC> J;
    public int A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3, int n4, int n5, Sx sx2) {
        void e2;
        void b2;
        void c2;
        void d2;
        Object f2;
        SF_3 sF_3 = object;
        Object object = sx2;
        SF_3 a2 = sF_3;
        Object object2 = f2;
        short s2 = ((Sx)((Object)f2)).G.J(((Sx)((Object)object2)).K);
        f2 = ((Sx)((Object)object2)).G.J((int)d2, (int)c2, (int)b2, (Sx)((Object)f2));
        a2.M.J((KC)new tBa((int)e2, (int)d2, (int)c2, (int)b2, (Mda)f2, s2));
        return f2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(ANa aNa2, Eoa eoa2, Mda mda2, XF xF2, DZ dZ2, Lz lz2) {
        void d2;
        int n2;
        void b2;
        void f2;
        void e2;
        Object g2;
        void a232;
        Object object;
        SF_3 sF_3 = object;
        object = xF2;
        SF_3 c2 = sF_3;
        void v1 = a232;
        SF_3 sF_32 = c2;
        sF_32.J();
        float a232 = (float)(a232.A - (double)g2.getX());
        float f3 = (float)(v1.j - (double)g2.getY());
        float f4 = (float)(v1.J - (double)g2.getZ());
        int bl2 = uSa.E;
        if (!sF_32.L.Ta.J().J((XF)((Object)g2))) {
            return uSa.E != 0;
        }
        if (c2.k != Daa.SPECTATOR) {
            kda kda2;
            IBlockState iBlockState = e2.J((XF)((Object)g2));
            if ((!f2.q() || f2.J() == null) && iBlockState.J().J((Gg)e2, (XF)((Object)g2), iBlockState, (Sx)f2, (DZ)b2, a232, f3, f4)) {
                n2 = vRa.d;
            }
            if (n2 == 0 && d2 != null && d2.J() instanceof kda && !(kda2 = (kda)d2.J()).J((Gg)e2, (XF)((Object)g2), (DZ)b2, (Sx)f2, (Mda)d2)) {
                return uSa.E != 0;
            }
        }
        c2.M.J((KC)new CAa((XF)((Object)g2), b2.getIndex(), f2.K.f(), a232, f3, f4));
        if (n2 == 0 && c2.k != Daa.SPECTATOR) {
            if (d2 == null) {
                return uSa.E != 0;
            }
            if (c2.k.isCreative()) {
                void v3 = d2;
                int n3 = d2.J();
                int n4 = v3.E;
                boolean bl3 = d2.J((Sx)f2, (Gg)e2, (XF)((Object)g2), (DZ)b2, a232, f3, f4);
                v3.J(n3);
                d2.E = n4;
                return bl3;
            }
            return d2.J((Sx)f2, (Gg)e2, (XF)((Object)g2), (DZ)b2, a232, f3, f4);
        }
        return vRa.d != 0;
    }

    public void J(Daa daa2) {
        Object b2 = daa2;
        SF_3 a2 = this;
        a2.k = b2;
        a2.k.configurePlayerCapabilities(a2.L.c.h);
    }

    public boolean A() {
        SF_3 a2;
        return a2.k.isCreative();
    }

    public boolean i() {
        SF_3 a2;
        if (!a2.k.isCreative()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean M() {
        SF_3 a2;
        return a2.k.isCreative();
    }

    /*
     * WARNING - void declaration
     */
    public ANa J(Gg gg2, Laa laa2) {
        void b2;
        Laa c2 = laa2;
        SF_3 a2 = this;
        return new ANa(a2.L, (Gg)b2, a2.M, c2);
    }

    public void C() {
        Object a2;
        SF_3 sF_3 = this;
        Object object = a2 = sF_3.J.iterator();
        while (object.hasNext()) {
            KC kC2 = (KC)a2.next();
            object = a2;
            sF_3.M.J(kC2);
        }
        sF_3.J.clear();
    }

    public boolean e() {
        SF_3 a2;
        return a2.k.isSurvivalOrAdventure();
    }

    public void l() {
        SF_3 a2;
        SF_3 sF_3 = a2;
        sF_3.J();
        if (sF_3.M.J().J()) {
            a2.M.J().C();
            return;
        }
        a2.M.J().J();
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(XF xF2) {
        void a2;
        int n2;
        SF_3 sF_3;
        SF_3 sF_32 = sF_3 = this;
        SF_3 b2 = sF_32.L.c.J();
        int n3 = n2 = sF_32.j == null && b2 == null ? vRa.d : uSa.E;
        if (sF_3.j != null && b2 != null) {
            int n4 = n2 = b2.J() == sF_3.j.J() && Mda.f((Mda)b2, (Mda)sF_3.j) && (b2.d() || b2.J() == sF_3.j.J()) ? vRa.d : uSa.E;
        }
        if (a2.equals((Object)sF_3.g) && n2 != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l(Sx sx2) {
        Object b2 = sx2;
        SF_3 a2 = this;
        ((Sx)((Object)b2)).X = (int)xua.V;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Kpa kpa2, SF sF2, XF xF2, DZ dZ2) {
        void b2;
        Kpa a2;
        Object d2 = dZ2;
        Kpa kpa3 = a2 = kpa2;
        if (!kpa3.Ta.J((Sx)kpa3.c, (XF)b2, (DZ)((Object)d2))) {
            void c2;
            c2.f((XF)b2, (DZ)((Object)d2));
        }
    }

    public boolean d() {
        SF_3 a2;
        return a2.k.isSurvivalOrAdventure();
    }

    public void f() {
        SF_3 a2;
        if (a2.I) {
            SF_3 sF_3 = a2;
            sF_3.M.J((KC)new mAa(Gda.ABORT_DESTROY_BLOCK, a2.g, DZ.DOWN));
            sF_3.I = uSa.E;
            sF_3.i = JPa.N;
            sF_3.L.Ta.J(a2.L.c.M(), a2.g, pua.o);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, Gg gg2, Mda mda2) {
        SF_3 sF_3;
        void c2;
        void a2;
        SF_3 sF_32 = this;
        if (sF_32.k == Daa.SPECTATOR) {
            return uSa.E != 0;
        }
        sF_32.J();
        void v0 = a2;
        int b2 = v0.E;
        SF_3 d2 = v0.f((Gg)b2, (Sx)c2);
        CAa cAa2 = new CAa(c2.K.f());
        if ((v0.J() == Gea.eb || a2.J() == Gea.Ba) && d2 != null && d2.J() == Gea.Ca && c2.Ea > pqa.q) {
            sF_3 = d2;
            sF_32.J.add((KC)cAa2);
        } else {
            sF_32.M.J((KC)cAa2);
            sF_3 = d2;
        }
        if (sF_3 != a2 || d2 != null && ((Mda)d2).E != b2) {
            c2.K.j[c2.K.J] = d2;
            if (((Mda)d2).E == 0) {
                c2.K.j[c2.K.J] = null;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean l(XF xF2, DZ dZ2) {
        void a2;
        Block block;
        Object c2 = xF2;
        SF_3 b2 = this;
        if (b2.k.isAdventure()) {
            if (b2.k == Daa.SPECTATOR) {
                return uSa.E != 0;
            }
            if (!b2.L.c.w()) {
                SF_3 sF_3 = b2;
                block = sF_3.L.Ta.J((XF)((Object)c2)).J();
                Mda mda2 = sF_3.L.c.f();
                if (mda2 == null) {
                    return uSa.E != 0;
                }
                if (!mda2.J(block)) {
                    return uSa.E != 0;
                }
            }
        }
        if (!b2.L.Ta.J().J((XF)((Object)c2))) {
            return uSa.E != 0;
        }
        SF_3 sF_3 = b2;
        if (b2.k.isCreative()) {
            sF_3.M.J((KC)new mAa(Gda.START_DESTROY_BLOCK, (XF)((Object)c2), (DZ)a2));
            SF_3.J(b2.L, (SF)b2, (XF)((Object)c2), (DZ)a2);
            b2.A = tTa.h;
        } else if (!sF_3.I || !b2.J((XF)((Object)c2))) {
            int n2;
            if (b2.I) {
                b2.M.J((KC)new mAa(Gda.ABORT_DESTROY_BLOCK, b2.g, (DZ)a2));
            }
            int n3 = (block = b2.L.Ta.J((XF)((Object)c2)).J()).J() != Material.air ? vRa.d : uSa.E;
            float f2 = JPa.N;
            if (n3 != 0) {
                f2 = block.J((Sx)b2.L.c, b2.L.c.j, (XF)((Object)c2));
            }
            mAa mAa2 = new mAa(Gda.START_DESTROY_BLOCK, (XF)((Object)c2), (DZ)a2);
            if (b2.L.c.ha && !b2.L.c.m && f2 >= pqa.r) {
                n2 = n3;
                b2.J.add((KC)mAa2);
            } else {
                b2.M.J((KC)mAa2);
                n2 = n3;
            }
            if (n2 != 0 && b2.i == JPa.N) {
                block.J((Gg)b2.L.Ta, (XF)((Object)c2), (Sx)b2.L.c);
            }
            if (n3 != 0 && f2 >= pqa.r) {
                b2.f((XF)((Object)c2), (DZ)a2);
            } else {
                b2.C = vRa.d;
                b2.I = vRa.d;
                b2.g = c2;
                b2.j = b2.L.c.J();
                b2.i = JPa.N;
                b2.m = JPa.N;
                SF_3 sF_32 = b2;
                b2.L.Ta.J(b2.L.c.M(), sF_32.g, (int)(sF_32.i * FRa.Ga) - vRa.d);
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(XF xF2, DZ dZ2) {
        Object c2;
        Object a2;
        void b2;
        SF_3 sF_3 = this;
        if (sF_3.k.isAdventure()) {
            if (sF_3.k == Daa.SPECTATOR) {
                return uSa.E != 0;
            }
            if (!sF_3.L.c.w()) {
                SF_3 sF_32 = sF_3;
                a2 = sF_32.L.Ta.J((XF)b2).J();
                c2 = sF_32.L.c.f();
                if (c2 == null) {
                    return uSa.E != 0;
                }
                if (!c2.J((Block)a2)) {
                    return uSa.E != 0;
                }
            }
        }
        if (sF_3.k.isCreative() && sF_3.L.c.J() != null && sF_3.L.c.J().J() instanceof xCa) {
            return uSa.E != 0;
        }
        a2 = sF_3.L.Ta;
        c2 = a2.J((XF)b2);
        Block block = c2.J();
        if (block.J() == Material.air) {
            return uSa.E != 0;
        }
        Object object = a2;
        void v2 = b2;
        object.f(zta.Z, (XF)v2, Block.l((IBlockState)c2));
        boolean bl2 = object.G((XF)v2);
        if (bl2) {
            block.J((Gg)a2, (XF)b2, (IBlockState)c2);
        }
        sF_3.g = new XF(sF_3.g.getX(), pua.o, sF_3.g.getZ());
        if (!sF_3.k.isCreative() && (c2 = sF_3.L.c.f()) != null) {
            Object object2 = c2;
            object2.J((Gg)a2, block, (XF)b2, (Sx)sF_3.L.c);
            if (((Mda)object2).E == 0) {
                sF_3.L.c.x();
            }
        }
        return bl2;
    }

    public void f(Sx sx2) {
        SF_3 a2;
        Sx b2 = sx2;
        SF_3 sF_3 = a2 = this;
        sF_3.J();
        sF_3.M.J((KC)new mAa(Gda.RELEASE_USE_ITEM, XF.ORIGIN, DZ.DOWN));
        b2.w();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, DZ dZ2) {
        void a2;
        SF_3 b2;
        Object c2 = xF2;
        SF_3 sF_3 = b2 = this;
        sF_3.J();
        if (sF_3.A > 0) {
            b2.A -= vRa.d;
            return vRa.d != 0;
        }
        if (b2.k.isCreative() && b2.L.Ta.J().J((XF)((Object)c2))) {
            SF_3 sF_32 = b2;
            sF_32.A = tTa.h;
            sF_32.M.J((KC)new mAa(Gda.START_DESTROY_BLOCK, (XF)((Object)c2), (DZ)a2));
            SF_3.J(sF_32.L, (SF)b2, (XF)((Object)c2), (DZ)a2);
            return vRa.d != 0;
        }
        if (b2.J((XF)((Object)c2))) {
            Block block = b2.L.Ta.J((XF)((Object)c2)).J();
            if (block.J() == Material.air) {
                b2.I = uSa.E;
                return uSa.E != 0;
            }
            SF_3 sF_33 = b2;
            sF_33.i += block.J((Sx)b2.L.c, b2.L.c.j, (XF)((Object)c2));
            if (sF_33.m % YSa.G == JPa.N) {
                b2.L.J().J((X)new PNa(new ResourceLocation(block.stepSound.J()), (block.stepSound.f() + pqa.r) / Qsa.k, block.stepSound.J() * MQa.L, (float)c2.getX() + MQa.L, (float)c2.getY() + MQa.L, (float)c2.getZ() + MQa.L));
            }
            SF_3 sF_34 = b2;
            sF_34.m += pqa.r;
            if (sF_34.i >= pqa.r) {
                SF_3 sF_35 = b2;
                b2.I = uSa.E;
                sF_35.M.J((KC)new mAa(Gda.STOP_DESTROY_BLOCK, (XF)((Object)c2), (DZ)a2));
                sF_35.f((XF)((Object)c2), (DZ)a2);
                SF_3 sF_36 = b2;
                sF_36.i = JPa.N;
                sF_36.m = JPa.N;
                sF_36.A = tTa.h;
            }
            SF_3 sF_37 = b2;
            b2.L.Ta.J(b2.L.c.M(), sF_37.g, (int)(sF_37.i * FRa.Ga) - vRa.d);
            return vRa.d != 0;
        }
        b2.C = uSa.E;
        boolean bl2 = b2.l((XF)((Object)c2), (DZ)a2);
        if (b2.C) {
            b2.J((XF)((Object)c2), (DZ)a2);
        }
        return bl2;
    }

    public void J(Mda mda2) {
        SF_3 b2 = mda2;
        SF_3 a2 = this;
        if (a2.k.isCreative() && b2 != null) {
            a2.M.J((KC)new Gba(pua.o, (Mda)b2));
        }
    }

    public Daa J() {
        SF_3 a2;
        return a2.k;
    }

    private void J() {
        SF_3 sF_3 = this;
        int a2 = sF_3.L.c.K.J;
        if (a2 != sF_3.E) {
            sF_3.E = a2;
            sF_3.M.J((KC)new WBa(sF_3.E));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        SF_3 a2 = this;
        a2.M.J((KC)new fca((int)b2, c2));
    }

    public void J(Sx sx2) {
        Object b2 = sx2;
        SF_3 a2 = this;
        a2.k.configurePlayerCapabilities(((Sx)((Object)b2)).h);
    }

    public boolean C() {
        SF_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, vL vL2) {
        SF_3 c2 = vL2;
        SF_3 a2 = this;
        if (a2.L.R.T > KSa.F && !a2.A()) {
            return;
        }
        SF_3 sF_3 = a2;
        sF_3.J();
        sF_3.M.J((KC)new Lba((vL)c2, Vca.ATTACK));
        if (sF_3.k != Daa.SPECTATOR) {
            void b2;
            b2.A((vL)c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, vL vL2, RY rY2) {
        void c2;
        void b2;
        SF_3 a2;
        Object d2 = rY2;
        SF_3 sF_3 = a2 = this;
        sF_3.J();
        d2 = new Lz(((RY)d2).I.A - b2.la, ((RY)d2).I.j - b2.Z, ((RY)d2).I.J - b2.A);
        sF_3.M.J((KC)new Lba((vL)b2, (Lz)d2));
        if (sF_3.k != Daa.SPECTATOR && b2.J((Sx)c2, (Lz)d2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, vL vL2) {
        void b2;
        SF_3 a2;
        SF_3 c2 = vL2;
        SF_3 sF_3 = a2 = this;
        sF_3.J();
        sF_3.M.J((KC)new Lba((vL)c2, Vca.INTERACT));
        if (sF_3.k != Daa.SPECTATOR && b2.d((vL)c2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, int n2) {
        int c2 = n2;
        SF_3 a2 = this;
        if (a2.k.isCreative()) {
            void b2;
            a2.M.J((KC)new Gba(c2, (Mda)b2));
        }
    }

    public boolean l() {
        SF_3 a2;
        if (a2.k == Daa.SPECTATOR) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean f() {
        SF_3 a2;
        if (a2.k == Daa.SPECTATOR) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J() {
        SF_3 a2;
        if (a2.k.isCreative()) {
            return eua.C;
        }
        return Jta.r;
    }

    /*
     * WARNING - void declaration
     */
    public SF_3(Kpa kpa2, iMa iMa2) {
        void b2;
        SF_3 a2;
        SF_3 c2 = iMa2;
        SF_3 sF_3 = a2 = this;
        SF_3 sF_32 = a2;
        a2.g = new XF(pua.o, pua.o, pua.o);
        sF_32.k = Daa.SURVIVAL;
        a2.J = new ArrayList<KC>();
        a2.C = uSa.E;
        sF_3.L = b2;
        sF_3.M = c2;
    }

    public boolean J() {
        SF_3 a2;
        if (a2.L.c.B() && a2.L.c.ja instanceof Rea) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

