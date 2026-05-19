/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Bpa
 *  Cz
 *  EC
 *  Ega
 *  HA
 *  JPa
 *  Mda
 *  NPa
 *  NTa
 *  Nna
 *  RQa
 *  Rba
 *  Soa
 *  TPa
 *  ac
 *  cQa
 *  jpa
 *  kea
 *  nLa
 *  pQa
 *  pqa
 *  pua
 *  qta
 *  uKa
 *  uOa
 *  vRa
 */
import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rma
extends Ama {
    private static final ResourceLocation k;
    private HA j;
    private static final Logger J;
    private boolean A;
    private Nna I;

    /*
     * WARNING - void declaration
     */
    public rma(kea kea2, HA hA2) {
        void b2;
        rma a2;
        rma c2 = hA2;
        rma rma2 = a2 = this;
        rma rma3 = a2;
        super((Ega)new xda((HA)b2, (HA)c2));
        rma2.j = c2;
        a2.j = (HA)Fua.fa;
        rma2.F = yRa.T;
    }

    public void J(float f2, int n2, int n3) {
        Object d2 = n2;
        rma b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        rma rma2 = b2;
        rma2.g.J().J(k);
        rma rma3 = b2;
        int c2 = (rma2.A - rma3.j) / uqa.g;
        d2 = (rma3.I - b2.F) / uqa.g;
        rma rma4 = b2;
        rma2.f(c2, (int)d2, uSa.E, uSa.E, (int)rma4.j, rma4.F);
        rma2.m.m = QTa.G;
        rma2.m.f(new Mda(Gea.kc), c2 + cQa.i, d2 + rSa.i);
        rma2.m.f(new Mda(Gea.b), c2 + cQa.i + cQa.o, d2 + rSa.i);
        rma2.m.f(new Mda(Gea.Bb), c2 + cQa.i + Yqa.D, d2 + rSa.i);
        rma2.m.f(new Mda(Gea.GA), c2 + cQa.i + SPa.T, d2 + rSa.i);
        rma2.m.m = JPa.N;
    }

    public void A() {
        rma a2;
        rma rma2 = a2;
        super.A();
        rma rma3 = a2;
        a2.I = new Nna(a2, pua.o, a2.e + yOa.a, a2.v + jpa.E);
        rma2.E.add(a2.I);
        rma rma4 = a2;
        a2.E.add(new eOa(rma4, rQa.p, a2.e + Bpa.s, rma4.v + jpa.E));
        rma rma5 = a2;
        rma5.A = vRa.d;
        rma5.I.J = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ac ac2) throws IOException {
        void a2;
        rma rma2 = this;
        if (a2.C == rQa.p) {
            rma2.g.J((EC)null);
            return;
        }
        if (a2.C == pua.o) {
            String string = csa.Aa;
            Lca b2 = new Lca(Unpooled.buffer());
            rma rma3 = rma2;
            b2.writeInt(rma2.j.J(vRa.d));
            b2.writeInt(rma3.j.J(uqa.g));
            rma2.g.J().J((KC)new Rba(string, b2));
            rma3.g.J((EC)null);
            return;
        }
        if (a2 instanceof Soa) {
            rma rma4;
            if (((Soa)a2).f()) {
                return;
            }
            int n2 = a2.C;
            int b2 = n2 & osa.Ja;
            if (n2 >> Yqa.i < yRa.d) {
                rma rma5 = rma2;
                rma4 = rma5;
                rma5.j.J(vRa.d, b2);
            } else {
                rma rma6 = rma2;
                rma4 = rma6;
                rma6.j.J(uqa.g, b2);
            }
            rma4.E.clear();
            rma rma7 = rma2;
            rma7.A();
            rma7.l();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void l(rma rma2, String string, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        rma a2 = rma2;
        a2.J((String)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        rma rma2 = this;
        nLa.C();
        rma.J((String)oha.J(qta.r, new Object[uSa.E]), (int)ITa.V, (int)NTa.C, (int)pQa.P);
        rma.J((String)oha.J(gsa.U, new Object[uSa.E]), (int)SPa.l, (int)NTa.C, (int)pQa.P);
        for (ac ac2 : rma2.E) {
            void a2;
            void b2;
            if (!ac2.J()) continue;
            ac2.f((int)(b2 - rma2.e), (int)(a2 - rma2.v));
            break;
        }
        nLa.J();
    }

    /*
     * Unable to fully structure code
     */
    public void l() {
        v0 = var1_2 = this;
        super.l();
        var4_3 = v0.j.J(uSa.E);
        var7_4 = v0.j.J(vRa.d);
        var9_5 = v0.j.J(uqa.g);
        if (!v0.A || var4_3 < 0) ** GOTO lbl56
        var1_2.A = uSa.E;
        v1 = a = uSa.E;
        while (v1 <= uqa.g) {
            var5_9 = Cz.C[a].length;
            var6_10 = var5_9 * cQa.o + (var5_9 - vRa.d) * uqa.g;
            v2 = uSa.E;
            while (v2 < var5_9) {
                var8_11 = Cz.C[a][var2_6].O;
                v3 = var1_2;
                var3_8 = new Soa(v3, a << Yqa.i | var8_11, var1_2.e + NPa.i + var2_6 * osa.c - var6_10 / uqa.g, v3.v + cQa.o + a * kTa.g, var8_11, a);
                var1_2.E.add(var3_8);
                if (a >= var4_3) {
                    var3_8.J = uSa.E;
                } else if (var8_11 == var7_4) {
                    var3_8.J((boolean)vRa.d);
                }
                v2 = ++var2_6;
            }
            v1 = ++a;
        }
        a = yRa.d;
        var5_9 = Cz.C[a].length + vRa.d;
        var6_10 = var5_9 * cQa.o + (var5_9 - vRa.d) * uqa.g;
        v4 = var2_6 = uSa.E;
        while (v4 < var5_9 - vRa.d) {
            var8_11 = Cz.C[a][var2_6].O;
            v5 = var1_2;
            var3_8 = new Soa(v5, a << Yqa.i | var8_11, var1_2.e + TPa.Aa + var2_6 * osa.c - var6_10 / uqa.g, v5.v + uOa.F, var8_11, a);
            var1_2.E.add(var3_8);
            if (a >= var4_3) {
                var3_8.J = uSa.E;
            } else if (var8_11 == var9_5) {
                var3_8.J((boolean)vRa.d);
            }
            v4 = ++var2_6;
        }
        if (var7_4 <= 0) ** GOTO lbl56
        v6 = var1_2;
        var2_7 = new Soa(v6, a << Yqa.i | var7_4, var1_2.e + TPa.Aa + (var5_9 - vRa.d) * osa.c - var6_10 / uqa.g, v6.v + uOa.F, var7_4, a);
        var1_2.E.add(var2_7);
        if (a >= var4_3) {
            v7 = var1_2;
            var2_7.J = uSa.E;
        } else {
            if (var7_4 == var9_5) {
                var2_7.J((boolean)vRa.d);
            }
lbl56:
            // 5 sources

            v7 = var1_2;
        }
        v7.I.J = var1_2.j.J(uSa.E) != null && var7_4 > 0 ? vRa.d : uSa.E;
    }

    public static /* synthetic */ ResourceLocation J() {
        return k;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(rma rma2, String string, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        rma a2 = rma2;
        a2.J((String)c2, (int)b2, d2);
    }

    static {
        J = LogManager.getLogger();
        k = new ResourceLocation(RQa.A);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(rma rma2, String string, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        rma a2 = rma2;
        a2.J((String)c2, (int)b2, d2);
    }
}

