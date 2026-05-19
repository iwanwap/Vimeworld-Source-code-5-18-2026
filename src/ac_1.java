/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cma
 *  KA
 *  Kd
 *  Kpa
 *  LQa
 *  NTa
 *  PNa
 *  We
 *  ZOa
 *  cNa
 *  cRa
 *  if
 *  pqa
 *  psa
 *  uKa
 *  vRa
 *  wNa
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ac_1
extends KA {
    public static final ResourceLocation L = new ResourceLocation(LQa.aa);
    public int E;
    public int m;
    public int C;
    public String i;
    public boolean M;
    public boolean k;
    public int j;
    public boolean J;
    private static final Color A = Bc.Ba.transparent(psa.N);
    public int I;

    public void J(wNa wNa2) {
        ac_1 b2 = wNa2;
        ac_1 a2 = this;
        b2.J((X)PNa.J((ResourceLocation)new ResourceLocation(cRa.u), (float)pqa.r));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Kpa kpa2, int n2, int n3) {
        void b2;
        int d2 = n3;
        ac_1 a2 = this;
        if (a2.J && a2.k && b2 >= a2.m && d2 >= a2.I) {
            ac_1 ac_12 = a2;
            if (b2 < ac_12.m + ac_12.j) {
                ac_1 ac_13 = a2;
                if (d2 < ac_13.I + ac_13.E) {
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(boolean bl) {
        void a2;
        ac_1 ac_12 = this;
        int b2 = vRa.d;
        if (!ac_12.J) {
            b2 = uSa.E;
            return b2;
        }
        if (a2 != false) {
            b2 = uqa.g;
        }
        return b2;
    }

    public void f(int n2, int n3) {
        int c2 = n3;
        ac_1 ac_12 = this;
    }

    public int J() {
        ac_1 a2;
        return a2.j;
    }

    public void f(Kpa kpa2, int n2, int n3) {
        int d2 = n3;
        ac_1 ac_12 = this;
    }

    /*
     * WARNING - void declaration
     */
    public ac_1(int n2, int n3, int n4, int n5, int n6, String string) {
        Object g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        ac_1 a2;
        ac_1 ac_12 = object;
        Object object = string;
        ac_1 ac_13 = a2 = ac_12;
        ac_1 ac_14 = a2;
        ac_1 ac_15 = a2;
        a2.j = ZOa.x;
        a2.E = kTa.j;
        a2.J = vRa.d;
        a2.k = vRa.d;
        ac_15.C = f2;
        ac_15.m = e2;
        ac_14.I = d2;
        ac_14.j = c2;
        ac_13.E = b2;
        ac_13.i = g2;
    }

    /*
     * WARNING - void declaration
     */
    public ac_1(int n2, int n3, int n4, String string) {
        Object e2;
        void b2;
        void c2;
        void d2;
        ac_1 ac_12 = object;
        Object object = string;
        ac_1 a2 = ac_12;
        a2((int)d2, (int)c2, (int)b2, ZOa.x, kTa.j, (String)e2);
    }

    public boolean J() {
        ac_1 a2;
        return a2.M;
    }

    public void J(String string) {
        Object b2 = string;
        ac_1 a2 = this;
        a2.i = b2;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        ac_1 ac_12 = this;
    }

    /*
     * Unable to fully structure code
     */
    public void J(Kpa var1_2, int var2_3, int var3_4) {
        block4: {
            d = var1_2;
            c = this;
            if (!c.k) break block4;
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            if (b < c.m || a < c.I) ** GOTO lbl-1000
            v0 = c;
            if (b >= v0.m + v0.j) ** GOTO lbl-1000
            v1 = c;
            if (a < v1.I + v1.E) {
                v2 = vRa.d;
            } else lbl-1000:
            // 3 sources

            {
                v2 = (int)(c.M = uSa.E);
            }
            v3 = c.J ? (c.M ? Bc.Ja : Bc.Ea) : (var4_5 = Bc.c);
            v4 = c.J ? (c.M ? Bc.Ga : Bc.Ja) : (var5_6 = Bc.Ea);
            if (c instanceof cNa || c instanceof We || c instanceof Cma) {
                var4_5 = c.M != false ? Bc.Ea : Bc.c;
                var5_6 = c.M != false ? Bc.Ja : Bc.Ea;
            }
            v5 = c;
            if.J((double)v5.m, (double)(c.I + uqa.g), (double)c.j, (double)(c.E - uqa.g), (Color)var4_5, (Color)var5_6, (Kd)Kd.S);
            v5.f((Kpa)d, (int)b, (int)a);
            d = Bc.Ba.getRGB();
            if (!c.J) {
                d = ac_1.A.getRGB();
            }
            v6 = c;
            v7 = c;
            ac_1.J((String)v6.i, (int)(v6.m + c.j / uqa.g), (int)(v7.I + (v7.E - NTa.C) / uqa.g + vRa.d), (int)d);
        }
    }

    public void J(int n2) {
        int b2 = n2;
        ac_1 a2 = this;
        a2.j = b2;
    }
}

