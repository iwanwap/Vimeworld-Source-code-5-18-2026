/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Dc
 *  ERa
 *  Ega
 *  GY
 *  Gg
 *  JPa
 *  JSa
 *  Lra
 *  MQa
 *  Mda
 *  Qsa
 *  Rba
 *  Tma
 *  Uz
 *  Vua
 *  ac
 *  bSa
 *  kea
 *  ld
 *  nLa
 *  pPa
 *  pqa
 *  uKa
 *  vRa
 *  wOa
 *  wPa
 *  yEa
 */
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.Arrays;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class UNa_1
extends Ama {
    private Tma C;
    private static final ResourceLocation i;
    private static final Logger M;
    private int k;
    private Dc J;
    private ld A;
    private Tma I;

    public void J(int n2, int n3) {
        UNa_1 b2;
        int c22 = n2;
        UNa_1 uNa_1 = b2 = this;
        String c22 = uNa_1.A.f();
        UNa_1 uNa_12 = b2;
        uNa_1.L.J(c22, uNa_12.j / uqa.g - b2.L.J(c22) / uqa.g, uua.p, tpa.i);
        uNa_12.L.J(oha.J(wPa.Ja, new Object[uSa.E]), Yqa.i, b2.F - zua.m + uqa.g, tpa.i);
    }

    public void J(float f2, int n2, int n3) {
        float d32422 = f2;
        UNa_1 c2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        UNa_1 uNa_1 = c2;
        uNa_1.g.J().J(i);
        UNa_1 uNa_12 = c2;
        reference d32422 = (uNa_1.A - uNa_12.j) / uqa.g;
        Object b2 = (uNa_12.I - c2.F) / uqa.g;
        UNa_1 uNa_13 = c2;
        uNa_1.f((int)d32422, (int)b2, uSa.E, uSa.E, uNa_13.j, uNa_13.F);
        GY d32422 = uNa_1.J.J((Sx)c2.g.c);
        if (d32422 != null && !d32422.isEmpty()) {
            int n4 = c2.k;
            b2 = n4;
            if (n4 < 0 || b2 >= d32422.size()) {
                return;
            }
            if (((Uz)d32422.get((int)b2)).l()) {
                UNa_1 uNa_14 = c2;
                uNa_14.g.J().J(i);
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                uKa.L();
                UNa_1 uNa_15 = c2;
                uNa_15.f(uNa_14.e + pPa.ja, uNa_15.v + wOa.h, Jra.t, uSa.E, EPa.O, wOa.h);
                uNa_14.f(uNa_14.e + pPa.ja, c2.v + cPa.Q, Jra.t, uSa.E, EPa.O, wOa.h);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a22322;
        void c2;
        UNa_1 b2;
        int d2 = n3;
        UNa_1 uNa_1 = b2 = this;
        super.J((int)c2, d2, (float)a22322);
        GY a22322 = uNa_1.J.J((Sx)b2.g.c);
        if (a22322 != null && !a22322.isEmpty()) {
            UNa_1 uNa_12 = b2;
            UNa_1 uNa_13 = b2;
            reference a22322 = (uNa_12.A - uNa_13.j) / uqa.g;
            reference var4_8 = (uNa_12.I - b2.F) / uqa.g;
            Uz uz2 = (Uz)a22322.get(uNa_13.k);
            Mda mda2 = uz2.J();
            Mda mda3 = uz2.f();
            Mda mda4 = uz2.l();
            uKa.e();
            nLa.J();
            uKa.L();
            uKa.o();
            uKa.a();
            uKa.P();
            UNa_1 uNa_14 = b2;
            uNa_14.m.m = QTa.G;
            uNa_14.m.f(mda2, (int)(a22322 + Qsa.Ha), (int)(var4_8 + osa.c));
            uNa_14.m.J(b2.L, mda2, (int)(a22322 + Qsa.Ha), (int)(var4_8 + osa.c));
            if (mda3 != null) {
                UNa_1 uNa_15 = b2;
                uNa_15.m.f(mda3, (int)(a22322 + ITa.V), (int)(var4_8 + osa.c));
                uNa_15.m.J(b2.L, mda3, (int)(a22322 + ITa.V), (int)(var4_8 + osa.c));
            }
            UNa_1 uNa_16 = b2;
            uNa_16.m.f(mda4, (int)(a22322 + sOa.D), (int)(var4_8 + osa.c));
            uNa_16.m.J(b2.L, mda4, (int)(a22322 + sOa.D), (int)(var4_8 + osa.c));
            b2.m.m = JPa.N;
            uKa.L();
            if (uNa_16.J(Qsa.Ha, osa.c, ERa.C, ERa.C, (int)c2, d2) && mda2 != null) {
                b2.J(mda2, (int)c2, d2);
            } else if (mda3 != null && b2.J(ITa.V, osa.c, ERa.C, ERa.C, (int)c2, d2) && mda3 != null) {
                b2.J(mda3, (int)c2, d2);
            } else if (mda4 != null && b2.J(sOa.D, osa.c, ERa.C, ERa.C, (int)c2, d2) && mda4 != null) {
                b2.J(mda4, (int)c2, d2);
            } else if (uz2.l() && (b2.J(pPa.ja, wOa.h, EPa.O, wOa.h, (int)c2, d2) || b2.J(pPa.ja, cPa.Q, EPa.O, wOa.h, (int)c2, d2))) {
                if (uz2.f() == vqa.F) {
                    String[] stringArray = new String[yRa.d];
                    stringArray[uSa.E] = zpa.m;
                    stringArray[vRa.d] = KSa.i;
                    stringArray[uqa.g] = fqa.v;
                    b2.J(Arrays.asList(stringArray), (int)c2, d2);
                } else if (uz2.f() == MQa.Z) {
                    String[] stringArray = new String[uqa.g];
                    stringArray[uSa.E] = zpa.m;
                    stringArray[vRa.d] = bSa.s;
                    b2.J(Arrays.asList(stringArray), (int)c2, d2);
                } else {
                    b2.J(oha.J(JSa.Ja, new Object[uSa.E]), (int)c2, d2);
                }
            }
            uKa.D();
            uKa.P();
            uKa.J();
            nLa.f();
        }
    }

    public void A() {
        UNa_1 uNa_1;
        UNa_1 uNa_12 = uNa_1 = this;
        super.A();
        UNa_1 uNa_13 = uNa_1;
        reference var1_3 = (uNa_12.A - uNa_13.j) / uqa.g;
        reference a2 = (uNa_13.I - uNa_1.F) / uqa.g;
        uNa_1.I = new Tma(vRa.d, (int)(var1_3 + sOa.D + Lra.e), (int)(a2 + osa.c - vRa.d), vRa.d != 0);
        uNa_12.E.add(uNa_1.I);
        uNa_1.C = new Tma(uqa.g, (int)(var1_3 + Qsa.Ha - wOa.t), (int)(a2 + osa.c - vRa.d), uSa.E != 0);
        uNa_1.E.add(uNa_1.C);
        UNa_1 uNa_14 = uNa_1;
        uNa_14.I.J = uSa.E;
        uNa_14.C.J = uSa.E;
    }

    static {
        M = LogManager.getLogger();
        i = new ResourceLocation(wua.r);
    }

    /*
     * WARNING - void declaration
     */
    public UNa_1(kea kea2, Dc dc2, Gg gg2) {
        void a2;
        void c2;
        UNa_1 b2;
        UNa_1 d2 = dc2;
        UNa_1 uNa_1 = b2 = this;
        super((Ega)new yEa((kea)c2, (Dc)d2, (Gg)a2));
        uNa_1.J = d2;
        uNa_1.A = d2.J();
    }

    public void l() {
        UNa_1 uNa_1;
        UNa_1 uNa_12 = uNa_1 = this;
        super.l();
        UNa_1 a2 = uNa_12.J.J((Sx)uNa_1.g.c);
        if (a2 != null) {
            uNa_1.I.J = uNa_1.k < a2.size() - vRa.d ? vRa.d : uSa.E;
            uNa_1.C.J = uNa_1.k > 0 ? vRa.d : uSa.E;
        }
    }

    public static /* synthetic */ ResourceLocation J() {
        return i;
    }

    public Dc J() {
        UNa_1 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ac ac2) throws IOException {
        int n2;
        Object b2;
        void a2;
        UNa_1 uNa_1 = this;
        int n3 = uSa.E;
        if (a2 == uNa_1.I) {
            UNa_1 uNa_12 = uNa_1;
            uNa_12.k += vRa.d;
            b2 = uNa_12.J.J((Sx)uNa_1.g.c);
            if (b2 != null && uNa_1.k >= b2.size()) {
                uNa_1.k = b2.size() - vRa.d;
            }
            n2 = n3 = vRa.d;
        } else {
            if (a2 == uNa_1.C) {
                UNa_1 uNa_13 = uNa_1;
                uNa_13.k -= vRa.d;
                if (uNa_13.k < 0) {
                    uNa_1.k = uSa.E;
                }
                n3 = vRa.d;
            }
            n2 = n3;
        }
        if (n2 != 0) {
            ((yEa)uNa_1.I).J(uNa_1.k);
            b2 = new Lca(Unpooled.buffer());
            ((Lca)b2).writeInt(uNa_1.k);
            uNa_1.g.J().J((KC)new Rba(Vua.fa, (Lca)b2));
        }
    }
}

