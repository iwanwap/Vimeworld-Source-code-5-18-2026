/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  ERa
 *  Gg
 *  JPa
 *  Oz
 *  UZ
 *  WSa
 *  XSa
 *  YSa
 *  Yra
 *  aSa
 *  bpa
 *  dpa
 *  pqa
 *  psa
 *  ska
 *  vL
 *  vPa
 *  vRa
 *  wra
 */
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nma_1
extends ska {
    private int J;
    private Material I;

    public float J(float f2) {
        float b2 = f2;
        nma_1 a2 = this;
        if (a2.I == Material.water) {
            return super.J(b2);
        }
        return pqa.r;
    }

    /*
     * WARNING - void declaration
     */
    public nma_1(Gg gg2, double d2, double d3, double d4, Material material) {
        nma_1 nma_12;
        Object f2;
        void b2;
        void c2;
        void d5;
        void e2;
        nma_1 a2;
        nma_1 nma_13 = object;
        Object object = material;
        nma_1 nma_14 = a2 = nma_13;
        super((Gg)e2, (double)d5, (double)c2, (double)b2, aSa.V, aSa.V, aSa.V);
        nma_14.f(aSa.V);
        nma_14.J(aSa.V);
        nma_14.l(aSa.V);
        if (f2 == Material.water) {
            nma_12 = a2;
            a2.l = JPa.N;
            a2.a = JPa.N;
            a2.J = (int)pqa.r;
        } else {
            nma_12 = a2;
            a2.l = pqa.r;
            a2.a = JPa.N;
            a2.J = (int)JPa.N;
        }
        nma_12.M(XSa.C);
        nma_1 nma_15 = a2;
        nma_1 nma_16 = a2;
        a2.l(Jpa.B, Jpa.B);
        nma_16.m = iSa.fa;
        nma_15.I = f2;
        nma_16.J = wra.P;
        nma_15.A = (int)(ypa.X / (Math.random() * Jra.A + iSa.P));
        nma_15.f(aSa.V);
        nma_15.J(aSa.V);
        nma_15.l(aSa.V);
    }

    public void d() {
        nma_1 nma_12;
        nma_1 nma_13;
        nma_1 nma_14;
        nma_1 nma_15 = nma_14 = this;
        nma_15.c = nma_15.la;
        nma_15.ba = nma_15.Z;
        nma_15.r = nma_15.A;
        if (nma_15.I == Material.water) {
            nma_13 = nma_14;
            nma_14.l = psa.N;
            nma_14.a = bpa.K;
            nma_14.J = (int)pqa.r;
        } else {
            nma_13 = nma_14;
            nma_14.l = pqa.r;
            nma_14.a = Yra.i / (float)(wra.P - nma_14.J + ERa.C);
            nma_14.J = (int)(YSa.G / (float)(wra.P - nma_14.J + Yqa.i));
        }
        nma_13.J(nma_14.Ea - (double)nma_14.m);
        int n2 = nma_14.J;
        nma_14.J = n2 - vRa.d;
        if (n2 > 0) {
            nma_1 nma_16 = nma_14;
            nma_12 = nma_16;
            nma_16.f(nma_16.i * GPa.g);
            nma_16.J(nma_16.Ea * GPa.g);
            nma_16.l(nma_16.f * GPa.g);
            nma_16.M(XSa.C);
        } else {
            nma_1 nma_17 = nma_14;
            nma_12 = nma_17;
            nma_17.M(BRa.E);
        }
        nma_12.J(nma_14.i, nma_14.Ea, nma_14.f);
        nma_1 nma_18 = nma_14;
        nma_18.f(nma_18.i * uua.G);
        nma_18.J(nma_18.Ea * uua.G);
        nma_18.l(nma_18.f * uua.G);
        int n3 = nma_18.A;
        nma_18.A = n3 - vRa.d;
        if (n3 <= 0) {
            nma_14.k();
        }
        if (nma_14.ha) {
            nma_1 nma_19;
            if (nma_14.I == Material.water) {
                nma_1 nma_110 = nma_14;
                nma_110.k();
                nma_1 nma_111 = nma_14;
                nma_19 = nma_111;
                nma_110.j.J(UZ.WATER_SPLASH, nma_111.la, nma_14.Z, nma_14.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            } else {
                nma_1 nma_112 = nma_14;
                nma_19 = nma_112;
                nma_112.M(WSa.o);
            }
            nma_19.f(nma_14.i * dpa.X);
            nma_1 nma_113 = nma_14;
            nma_113.l(nma_113.f * dpa.X);
        }
        Object a2 = new XF((vL)nma_14);
        Material material = (a2 = nma_14.j.J((XF)((Object)a2))).J().J();
        if (material.l() || material.i()) {
            double d2 = aSa.V;
            if (a2.J() instanceof BlockLiquid) {
                d2 = BlockLiquid.J(a2.J(BlockLiquid.LEVEL));
            }
            nma_1 nma_114 = nma_14;
            d2 = (double)(Oz.f((double)nma_114.Z) + vRa.d) - d2;
            if (nma_114.Z < d2) {
                nma_14.k();
            }
        }
    }

    public int J(float f2) {
        float b2 = f2;
        nma_1 a2 = this;
        if (a2.I == Material.water) {
            return super.J(b2);
        }
        return vPa.S;
    }
}

