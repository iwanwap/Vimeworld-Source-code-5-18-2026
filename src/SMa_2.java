/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Bna
 *  CNa
 *  COa
 *  DOa
 *  Dha
 *  Dma
 *  Gg
 *  I
 *  JLa
 *  JQa
 *  LMa
 *  Lra
 *  MZ
 *  Mna
 *  Noa
 *  Ona
 *  Oz
 *  Ppa
 *  Qna
 *  Qsa
 *  RIa
 *  RMa
 *  SMa
 *  TMa
 *  UJa
 *  ULa
 *  UZ
 *  Uoa
 *  VS
 *  WLa
 *  Wna
 *  XTa
 *  Xna
 *  Yoa
 *  aJa
 *  aKa
 *  aLa
 *  aSa
 *  bla
 *  eoa
 *  hoa
 *  hy
 *  iA
 *  ioa
 *  jRa
 *  kPa
 *  kka
 *  kpa
 *  kta
 *  lNa
 *  mka
 *  ola
 *  oma
 *  pKa
 *  pqa
 *  psa
 *  qLa
 *  ska
 *  soa
 *  uKa
 *  uMa
 *  uRa
 *  vL
 *  vMa
 *  vRa
 *  vma
 *  wna
 *  xma
 *  yLa
 *  zKa
 *  zLa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SMa_2 {
    private Random C;
    private static final ResourceLocation i = new ResourceLocation(PRa.T);
    private static final String M = "CL_00000915";
    private aJa k;
    private List[][] j;
    private List J;
    private Map A;
    public Gg I;

    /*
     * WARNING - void declaration
     */
    private void J(int n2) {
        int b2;
        SMa_2 sMa_2 = this;
        int n3 = b2 = uSa.E;
        while (n3 < uqa.g) {
            void a2;
            SMa_2 sMa_22 = sMa_2;
            sMa_22.J(sMa_22.j[a2][b2++]);
            n3 = b2;
        }
    }

    public void C(ska ska2) {
        SMa_2 b2 = ska2;
        SMa_2 a2 = this;
        a2.J((ska)b2, vRa.d, uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    private void J(ska ska2, int n2, int n3) {
        int d2;
        SMa_2 sMa_2 = this;
        int n4 = d2 = uSa.E;
        while (n4 < AQa.P) {
            void c2;
            void b2;
            if (sMa_2.j[d2][b2].contains(c2)) {
                void a2;
                sMa_2.j[d2][b2].remove(c2);
                sMa_2.j[d2][a2].add(c2);
            }
            n4 = ++d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(ska ska2, List<ska> list) {
        Iterator a2;
        SMa_2 sMa_2 = this;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            void b2;
            SMa_2 c2 = (ska)a2.next();
            if (!(c2 instanceof COa) || b2.la != ((ska)c2).la || b2.Z != ((ska)c2).Z || b2.A != ((ska)c2).A) continue;
            ((ska)c2).D = uSa.E;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        int n2;
        SMa_2 sMa_2 = this;
        int a2 = uSa.E;
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            int n4 = uSa.E;
            while (n4 < uqa.g) {
                int n5;
                List list = sMa_2.j[n2][n5];
                a2 += list.size();
                n4 = ++n5;
            }
            n3 = ++n2;
        }
        return new StringBuilder().insert(3 >> 2, Mqa.y).append(a2).toString();
    }

    public void l(ska ska2) {
        SMa_2 b2 = ska2;
        SMa_2 a2 = this;
        a2.J((ska)b2, uSa.E, vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, UZ uZ) {
        void b2;
        SMa_2 c2 = uZ;
        SMa_2 a2 = this;
        a2.J.add(new ULa(a2.I, (vL)b2, (UZ)c2));
    }

    /*
     * WARNING - void declaration
     */
    private void f(ska ska2) {
        void a2;
        SMa_2 sMa_2 = this;
        try {
            a2.d();
            return;
        }
        catch (Throwable b22) {
            RIa b22 = RIa.J((Throwable)b22, (String)Npa.t);
            Dha dha = b22.J(uRa.u);
            int n2 = a2.J();
            dha.J(JQa.C, (Callable)new Wna((SMa)sMa_2, (ska)a2));
            dha.J(Ppa.D, (Callable)new uMa((SMa)sMa_2, n2));
            throw new MZ(b22);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, RY rY2) {
        Object c2 = xF2;
        SMa_2 b2 = this;
        if (b2.I.J((XF)((Object)c2)).J() != null) {
            void a2;
            b2.J((XF)((Object)c2), a2.j);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, DZ dZ2) {
        void b2;
        SMa_2 sMa_2 = this;
        IBlockState iBlockState = sMa_2.I.J((XF)b2);
        Block c2 = iBlockState.J();
        if (c2.J() != hy.INVISIBLE) {
            void a2;
            void v0 = b2;
            int n2 = v0.getX();
            int n3 = v0.getY();
            int n4 = v0.getZ();
            float f2 = Nra.e;
            double d2 = (double)n2 + sMa_2.C.nextDouble() * (c2.J() - c2.f() - (double)(f2 * kta.v)) + (double)f2 + c2.f();
            double d3 = (double)n3 + sMa_2.C.nextDouble() * (c2.C() - c2.l() - (double)(f2 * kta.v)) + (double)f2 + c2.l();
            double d4 = (double)n4 + sMa_2.C.nextDouble() * (c2.e() - c2.d() - (double)(f2 * kta.v)) + (double)f2 + c2.d();
            if (a2 == DZ.DOWN) {
                d3 = (double)n3 + c2.l() - (double)f2;
            }
            if (a2 == DZ.UP) {
                d3 = (double)n3 + c2.C() + (double)f2;
            }
            if (a2 == DZ.NORTH) {
                d4 = (double)n4 + c2.d() - (double)f2;
            }
            if (a2 == DZ.SOUTH) {
                d4 = (double)n4 + c2.e() + (double)f2;
            }
            if (a2 == DZ.WEST) {
                d2 = (double)n2 + c2.f() - (double)f2;
            }
            if (a2 == DZ.EAST) {
                d2 = (double)n2 + c2.J() + (double)f2;
            }
            sMa_2.J(new lNa(sMa_2.I, d2, d3, d4, aSa.V, aSa.V, aSa.V, iBlockState).J((XF)b2).f(psa.N).J(Ora.D));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2, float f2) {
        int n2;
        void b2;
        SMa_2 sMa_2 = this;
        int c22 = VS.J() && b2 instanceof ANa ? vRa.d : uSa.E;
        float f3 = Oz.C((float)((c22 != 0 ? VS.k : b2.X) * Bua.ga));
        float f4 = Oz.d((float)((c22 != 0 ? VS.k : b2.X) * Bua.ga));
        float f5 = -f4 * Oz.d((float)((c22 != 0 ? VS.i : b2.d) * Bua.ga));
        float f6 = f3 * Oz.d((float)((c22 != 0 ? VS.i : b2.d) * Bua.ga));
        float c22 = Oz.C((float)((c22 != 0 ? VS.i : b2.d) * Bua.ga));
        int n3 = n2 = uSa.E;
        while (n3 < uqa.g) {
            List list = sMa_2.j[yRa.d][n2];
            if (!list.isEmpty()) {
                aKa aKa2 = pKa.J().J();
                int n4 = uSa.E;
                while (n4 < list.size()) {
                    void a2;
                    int n5;
                    ska ska2 = (ska)list.get(n5);
                    ska2.J(aKa2, (vL)b2, (float)a2, f3, c22, f4, f5, f6);
                    n4 = ++n5;
                }
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, IBlockState iBlockState) {
        IBlockState a2;
        int c2;
        SMa_2 sMa_2 = this;
        int n2 = c2 = a2.J().J() != Material.air ? vRa.d : uSa.E;
        if (c2 != 0) {
            int n3;
            void b2;
            a2 = a2.J().J(a2, (I)sMa_2.I, (XF)b2);
            c2 = AQa.P;
            int n4 = n3 = uSa.E;
            while (n4 < c2) {
                int n5 = uSa.E;
                while (n5 < c2) {
                    int n6;
                    int n7 = uSa.E;
                    while (n7 < c2) {
                        int n8;
                        void v4 = b2;
                        double d2 = (double)v4.getX() + ((double)n3 + kTa.B) / (double)c2;
                        double d3 = (double)v4.getY() + ((double)n6 + kTa.B) / (double)c2;
                        double d4 = (double)v4.getZ() + ((double)n8 + kTa.B) / (double)c2;
                        SMa_2 sMa_22 = sMa_2;
                        SMa_2 sMa_23 = sMa_2;
                        sMa_23.J((ska)new lNa(sMa_23.I, d2, d3, d4, d2 - (double)b2.getX() - kTa.B, d3 - (double)b2.getY() - kTa.B, d4 - (double)b2.getZ() - kTa.B, a2).J((XF)b2));
                        n7 = ++n8;
                    }
                    n5 = ++n6;
                }
                n4 = ++n3;
            }
        }
    }

    public void J(Gg gg2) {
        SMa_2 b2 = gg2;
        SMa_2 a2 = this;
        a2.I = b2;
        int n2 = b2 = uSa.E;
        while (n2 < AQa.P) {
            int n3 = uSa.E;
            while (n3 < uqa.g) {
                int n4;
                a2.j[b2][n4++].clear();
                n3 = n4;
            }
            n2 = ++b2;
        }
        a2.J.clear();
    }

    /*
     * WARNING - void declaration
     */
    private void J(List list) {
        void a2;
        int n2;
        SMa_2 sMa_2 = this;
        HashSet<SMa_2> hashSet = new HashSet<SMa_2>();
        int n3 = n2 = uSa.E;
        while (n3 < a2.size()) {
            SMa_2 b2;
            SMa_2 sMa_22 = b2 = (ska)a2.get(n2);
            sMa_2.f((ska)sMa_22);
            if (((ska)sMa_22).J) {
                hashSet.add(b2);
            }
            n3 = ++n2;
        }
        a2.removeAll(hashSet);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(vL vL2, float f2) {
        int n2;
        void a2;
        SMa_2 c2 = vL2;
        SMa_2 b2 = this;
        float f3 = aLa.C();
        float f4 = aLa.J();
        float f5 = aLa.d();
        float f6 = aLa.f();
        float f7 = aLa.l();
        SMa_2 sMa_2 = c2;
        ska.C = ((vL)sMa_2).V + (((vL)c2).la - ((vL)c2).V) * (double)a2;
        SMa_2 sMa_22 = c2;
        ska.k = ((vL)sMa_2).Ga + (((vL)sMa_22).Z - ((vL)c2).Ga) * (double)a2;
        ska.j = ((vL)sMa_22).Ca + (((vL)c2).A - ((vL)c2).Ca) * (double)a2;
        uKa.B();
        uKa.f((int)Lra.k, (int)kpa.J);
        uKa.J((int)jRa.m, (float)Qsa.V);
        int n3 = n2 = uSa.E;
        block9: while (true) {
            if (n3 >= yRa.d) {
                OT.i.H.J((float)a2);
                uKa.J(vRa.d != 0);
                uKa.k();
                uKa.J((int)jRa.m, (float)Nra.e);
                OT.i.J((float)a2);
                return;
            }
            int n4 = n2;
            int n5 = uSa.E;
            while (true) {
                int n6;
                block14: {
                    int n7;
                    aKa aKa2;
                    pKa pKa2;
                    block15: {
                        block13: {
                            int n8;
                            if (n5 >= uqa.g) break block13;
                            if (b2.j[n4][n6].isEmpty()) break block14;
                            switch (n6) {
                                case 0: {
                                    uKa.J(uSa.E != 0);
                                    n8 = n4;
                                    break;
                                }
                                case 1: {
                                    uKa.J(vRa.d != 0);
                                }
                                default: {
                                    n8 = n4;
                                }
                            }
                            switch (n8) {
                                default: {
                                    b2.k.J(i);
                                    break;
                                }
                                case 1: {
                                    b2.k.J(WKa.C);
                                }
                            }
                            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                            pKa2 = pKa.J();
                            aKa2 = pKa2.J();
                            aKa2.J(XTa.W, mka.F);
                            n7 = uSa.E;
                            break block15;
                        }
                        n3 = ++n2;
                        continue block9;
                    }
                    while (n7 < b2.j[n4][n6].size()) {
                        int n9;
                        ska ska2 = (ska)b2.j[n4][n6].get(n9);
                        try {
                            ska2.J(aKa2, (vL)c2, (float)a2, f3, f7, f4, f5, f6);
                        }
                        catch (Throwable throwable) {
                            RIa rIa2 = RIa.J((Throwable)throwable, (String)kPa.z);
                            Dha dha = rIa2.J(LRa.E);
                            dha.J(JQa.C, (Callable)new hoa((SMa)b2, ska2));
                            dha.J(Ppa.D, (Callable)new RMa((SMa)b2, n4));
                            throw new MZ(rIa2);
                        }
                        n7 = ++n9;
                    }
                    pKa2.J();
                }
                n5 = ++n6;
            }
            break;
        }
    }

    public void J(ska ska2) {
        block4: {
            int n2;
            int n3;
            SMa_2 a2;
            SMa_2 b2;
            block5: {
                b2 = ska2;
                a2 = this;
                if (b2 == null || b2 instanceof yLa && !Config.Ea()) break block4;
                SMa_2 sMa_2 = b2;
                n3 = sMa_2.J();
                int n4 = n2 = sMa_2.i() != pqa.r ? uSa.E : vRa.d;
                if (a2.j[n3][n2].size() >= rSa.B) {
                    a2.j[n3][n2].remove(uSa.E);
                }
                if (!(b2 instanceof COa)) break block5;
                SMa_2 sMa_22 = a2;
                if (sMa_22.J((ska)b2, sMa_22.j[n3][n2])) break block4;
            }
            a2.j[n3][n2].add(b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public ska J(int n2, double d2, double d3, double d4, double d5, double d6, double d7, int ... nArray) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        int i2 = n2;
        SMa_2 h2 = this;
        iA iA2 = (iA)h2.A.get(i2);
        if (iA2 != null && (i2 = iA2.J(i2, h2.I, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (int[])a2)) != null) {
            ska ska2 = i2;
            h2.J(ska2);
            return ska2;
        }
        return null;
    }

    private void f() {
        SMa_2 a2;
        SMa_2 sMa_2 = a2;
        sMa_2.J(UZ.EXPLOSION_NORMAL.getParticleID(), (iA)new eoa());
        sMa_2.J(UZ.WATER_BUBBLE.getParticleID(), new PMa());
        sMa_2.J(UZ.WATER_SPLASH.getParticleID(), (iA)new JLa());
        sMa_2.J(UZ.WATER_WAKE.getParticleID(), (iA)new soa());
        sMa_2.J(UZ.WATER_DROP.getParticleID(), (iA)new xma());
        sMa_2.J(UZ.SUSPENDED.getParticleID(), (iA)new kka());
        sMa_2.J(UZ.SUSPENDED_DEPTH.getParticleID(), new cOa());
        sMa_2.J(UZ.CRIT.getParticleID(), (iA)new TMa());
        sMa_2.J(UZ.CRIT_MAGIC.getParticleID(), new jOa());
        sMa_2.J(UZ.SMOKE_NORMAL.getParticleID(), (iA)new Dma());
        sMa_2.J(UZ.SMOKE_LARGE.getParticleID(), (iA)new Xna());
        sMa_2.J(UZ.SPELL.getParticleID(), (iA)new UJa());
        sMa_2.J(UZ.SPELL_INSTANT.getParticleID(), (iA)new bla());
        sMa_2.J(UZ.SPELL_MOB.getParticleID(), (iA)new zKa());
        sMa_2.J(UZ.SPELL_MOB_AMBIENT.getParticleID(), (iA)new ola());
        sMa_2.J(UZ.SPELL_WITCH.getParticleID(), new tKa());
        sMa_2.J(UZ.DRIP_WATER.getParticleID(), (iA)new Noa());
        sMa_2.J(UZ.DRIP_LAVA.getParticleID(), new ZNa());
        sMa_2.J(UZ.VILLAGER_ANGRY.getParticleID(), (iA)new Mna());
        sMa_2.J(UZ.VILLAGER_HAPPY.getParticleID(), new VNa());
        sMa_2.J(UZ.TOWN_AURA.getParticleID(), new cOa());
        sMa_2.J(UZ.NOTE.getParticleID(), (iA)new wna());
        sMa_2.J(UZ.PORTAL.getParticleID(), (iA)new Qna());
        sMa_2.J(UZ.ENCHANTMENT_TABLE.getParticleID(), new Uma());
        sMa_2.J(UZ.FLAME.getParticleID(), (iA)new Yoa());
        sMa_2.J(UZ.LAVA.getParticleID(), (iA)new vMa());
        sMa_2.J(UZ.FOOTSTEP.getParticleID(), new Dna());
        sMa_2.J(UZ.CLOUD.getParticleID(), (iA)new Uoa());
        sMa_2.J(UZ.REDSTONE.getParticleID(), (iA)new Bna());
        sMa_2.J(UZ.SNOWBALL.getParticleID(), (iA)new DOa());
        sMa_2.J(UZ.SNOW_SHOVEL.getParticleID(), new uJa());
        sMa_2.J(UZ.SLIME.getParticleID(), (iA)new CNa());
        sMa_2.J(UZ.HEART.getParticleID(), (iA)new Ona());
        sMa_2.J(UZ.BARRIER.getParticleID(), (iA)new LMa());
        sMa_2.J(UZ.ITEM_CRACK.getParticleID(), (iA)new vma());
        sMa_2.J(UZ.BLOCK_CRACK.getParticleID(), (iA)new oma());
        sMa_2.J(UZ.BLOCK_DUST.getParticleID(), (iA)new zLa());
        sMa_2.J(UZ.EXPLOSION_HUGE.getParticleID(), new TNa());
        sMa_2.J(UZ.EXPLOSION_LARGE.getParticleID(), (iA)new WLa());
        sMa_2.J(UZ.FIREWORKS_SPARK.getParticleID(), (iA)new ioa());
        sMa_2.J(UZ.MOB_APPEARANCE.getParticleID(), (iA)new qLa());
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, iA iA2) {
        void b2;
        SMa_2 c2 = iA2;
        SMa_2 a2 = this;
        a2.A.put((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public SMa_2(Gg gg2, aJa aJa2) {
        void a2;
        SMa_2 c2 = gg2;
        SMa_2 b2 = this;
        b2.j = new List[AQa.P][];
        SMa_2 sMa_2 = b2;
        SMa_2 sMa_22 = b2;
        sMa_22.J = Lists.newArrayList();
        SMa_2 sMa_23 = b2;
        sMa_22.C = new Random();
        sMa_23.A = Maps.newHashMap();
        sMa_2.I = c2;
        sMa_2.k = a2;
        int n2 = c2 = uSa.E;
        while (n2 < AQa.P) {
            b2.j[c2] = new List[uqa.g];
            int n3 = uSa.E;
            while (n3 < uqa.g) {
                b2.j[c2][a2++] = Lists.newArrayList();
                n3 = a2;
            }
            n2 = ++c2;
        }
        b2.f();
    }

    public void J() {
        int a22;
        SMa_2 sMa_2 = this;
        int n2 = a22 = uSa.E;
        while (n2 < AQa.P) {
            sMa_2.J(a22++);
            n2 = a22;
        }
        ArrayList<ULa> a22 = Lists.newArrayList();
        for (ULa uLa2 : sMa_2.J) {
            uLa2.d();
            if (!uLa2.J) continue;
            a22.add(uLa2);
        }
        sMa_2.J.removeAll(a22);
    }
}

