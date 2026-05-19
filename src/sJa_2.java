/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Zta
 *  aSa
 *  psa
 *  ska
 *  vL
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class sJa_2
extends ska {
    /*
     * WARNING - void declaration
     */
    public sJa_2(Gg gg2, double d2, double d3, double d4, double d5, double d6, double d7) {
        void a2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        sJa_2 g2;
        sJa_2 h2 = gg2;
        sJa_2 sJa_22 = g2 = this;
        sJa_2 sJa_23 = g2;
        sJa_2 sJa_24 = g2;
        super((Gg)h2, (double)f2, (double)(e2 - fqa.ca), (double)d8, (double)c2, (double)b2, (double)a2);
        sJa_24.l = Xpa.R;
        sJa_24.a = Xpa.R;
        sJa_24.J = ZSa.q;
        sJa_24.M(uSa.E);
        sJa_24.l(Jpa.B, Jpa.B);
        sJa_23.f *= g2.R.nextFloat() * Ora.D + psa.N;
        sJa_23.f((double)(c2 * aSa.V));
        sJa_22.J((double)(b2 * aSa.V));
        sJa_22.l((double)(a2 * aSa.V));
        sJa_22.A = (int)(Zta.ba / (Math.random() * Jra.A + iSa.P));
    }

    public void d() {
        sJa_2 a2;
        sJa_2 sJa_22 = a2;
        sJa_22.c = sJa_22.la;
        sJa_22.ba = sJa_22.Z;
        sJa_22.r = sJa_22.A;
        sJa_22.J(sJa_22.i, a2.Ea, a2.f);
        if (sJa_22.j.J(new XF((vL)a2)).J().J() != Material.water) {
            a2.k();
        }
        int n2 = a2.A;
        a2.A = n2 - vRa.d;
        if (n2 <= 0) {
            a2.k();
        }
    }
}

