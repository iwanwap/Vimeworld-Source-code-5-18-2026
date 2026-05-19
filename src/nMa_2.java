/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  iPa
 *  pqa
 *  psa
 *  ska
 *  vL
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class nMa_2
extends ska {
    /*
     * WARNING - void declaration
     */
    public nMa_2(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        nMa_2 g2;
        nMa_2 h2 = gg2;
        nMa_2 nMa_22 = g2 = this;
        nMa_2 nMa_23 = g2;
        nMa_2 nMa_24 = g2;
        super((Gg)h2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, (double)a2);
        nMa_24.l = pqa.r;
        nMa_24.a = pqa.r;
        nMa_24.J = pqa.r;
        nMa_24.M(fPa.i);
        nMa_24.l(WRa.e, WRa.e);
        nMa_23.f *= g2.R.nextFloat() * Ora.D + psa.N;
        nMa_23.f((double)(c2 * Bua.Ia + (Math.random() * KPa.y - oua.i) * lQa.l));
        nMa_22.J((double)(b2 * Bua.Ia + (Math.random() * KPa.y - oua.i) * lQa.l));
        nMa_22.l((double)(a2 * Bua.Ia + (Math.random() * KPa.y - oua.i) * lQa.l));
        nMa_22.A = (int)(Wqa.Z / (Math.random() * Jra.A + iSa.P));
    }

    public void d() {
        nMa_2 a2;
        nMa_2 nMa_22 = a2;
        nMa_22.c = nMa_22.la;
        nMa_22.ba = nMa_22.Z;
        nMa_22.r = nMa_22.A;
        nMa_22.J(nMa_22.Ea + iPa.c);
        nMa_22.J(nMa_22.i, a2.Ea, a2.f);
        nMa_22.f(nMa_22.i * cTa.J);
        nMa_22.J(nMa_22.Ea * cTa.J);
        nMa_22.l(nMa_22.f * cTa.J);
        if (nMa_22.j.J(new XF((vL)a2)).J().J() != Material.water) {
            a2.k();
        }
        int n2 = a2.A;
        a2.A = n2 - vRa.d;
        if (n2 <= 0) {
            a2.k();
        }
    }
}

