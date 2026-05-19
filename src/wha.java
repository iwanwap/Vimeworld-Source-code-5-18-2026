/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  vPa
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class wha {
    public double A;
    public double I;

    public float J() {
        wha a2;
        return Oz.J((double)(a2.A * a2.A + a2.I * a2.I));
    }

    public void J(wha wha2) {
        wha a2;
        wha b2 = wha2;
        wha wha3 = a2 = this;
        wha3.A -= b2.A;
        wha3.I -= b2.I;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Gg gg2) {
        wha wha2 = this;
        Object b2 = new XF(wha2.A, ZSa.o, wha2.I);
        while (b2.getY() > 0) {
            void a2;
            if (a2.J((XF)((Object)(b2 = ((XF)((Object)b2)).down()))).J().J() == Material.air) continue;
            return b2.getY() + vRa.d;
        }
        return vPa.S;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(double d2, double d3, double d4, double d5) {
        void a2;
        void c2;
        wha wha2;
        void d6;
        wha wha3 = this;
        int e2 = uSa.E;
        if (wha3.A < d6) {
            wha2 = wha3;
            wha3.A = d6;
            e2 = vRa.d;
        } else {
            void b2;
            if (wha3.A > b2) {
                wha3.A = b2;
                e2 = vRa.d;
            }
            wha2 = wha3;
        }
        if (wha2.I < c2) {
            wha3.I = c2;
            e2 = vRa.d;
            return e2 != 0;
        }
        if (wha3.I > a2) {
            wha3.I = a2;
            e2 = vRa.d;
        }
        return e2 != 0;
    }

    public wha(double b2, double a2) {
        wha c2;
        wha wha2 = c2;
        wha2.A = b2;
        wha2.I = a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Random random, double d2, double d3, double d4, double d5) {
        void a2;
        void c2;
        void b2;
        void d6;
        Random f2 = random;
        wha e2 = this;
        e2.A = Oz.J((Random)f2, (double)d6, (double)b2);
        e2.I = Oz.J((Random)f2, (double)c2, (double)a2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2) {
        wha wha2 = this;
        Object b2 = new XF(wha2.A, ZSa.o, wha2.I);
        while (b2.getY() > 0) {
            void a2;
            Material material = a2.J((XF)((Object)(b2 = ((XF)((Object)b2)).down()))).J().J();
            if (material == Material.air) continue;
            if (!material.l() && material != Material.fire) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public double J(wha wha2) {
        wha a2;
        wha b2 = wha2;
        wha wha3 = a2 = this;
        double d2 = wha3.A - b2.A;
        double d3 = wha3.I - b2.I;
        double d4 = d2;
        double d5 = d3;
        return Math.sqrt(d4 * d4 + d5 * d5);
    }

    public void J() {
        wha a2;
        wha wha2 = a2;
        double d2 = wha2.J();
        wha2.A /= d2;
        wha2.I /= d2;
    }

    public wha() {
        wha a2;
    }
}

