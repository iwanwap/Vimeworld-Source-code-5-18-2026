/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cia
 *  JPa
 *  KA
 *  Kpa
 *  LQa
 *  Lra
 *  NQa
 *  Oz
 *  TQa
 *  Yna
 *  cQa
 *  kNa
 *  kPa
 *  kpa
 *  lqa
 *  nLa
 *  pqa
 *  pua
 *  sMa
 *  uKa
 *  vQa
 *  vRa
 *  wOa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mna
extends KA
implements KB {
    private static final ResourceLocation M = new ResourceLocation(LQa.aa);
    public static final ResourceLocation k = new ResourceLocation(Bua.Ga);
    private kNa J;
    private final Kpa A;
    private long I;

    public void f(int n2) {
        int b2 = n2;
        mna a2 = this;
        a2.I = Kpa.J();
        if (a2.J != null) {
            a2.J.J(b2);
            return;
        }
        a2.J = new kNa((KB)a2);
    }

    @Override
    public void J(kNa kNa2) {
        mna a2;
        mna b2 = kNa2;
        mna mna2 = a2 = this;
        mna2.J = null;
        mna2.I = nqa.i;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3, float f2, float f3, PB pB) {
        void a2;
        mna mna2 = this;
        mna2.A.J().J(k);
        if (a2 != kNa.i) {
            void e22;
            float f4;
            void c2;
            void d2;
            void b2;
            int f5 = (int)(b2 * NQa.Y);
            uKa.e();
            uKa.J((float)((float)d2), (float)c2, (float)JPa.N);
            float f6 = f4 = a2.J() ? pqa.r : rta.o;
            uKa.f((float)f6, (float)f6, (float)f6, (float)b2);
            a2.J(f4, f5);
            uKa.D();
            String e22 = String.valueOf(Cia.J((int)mna2.A.z.Ga[e22].getKeyCode()));
            if (f5 > yRa.d && a2.J()) {
                String string = e22;
                mna2.A.Ea.J(string, (float)(d2 + wOa.t - uqa.g - mna2.A.Ea.J(string)), (float)(c2 + lqa.ga + vQa.q), pua.o + (f5 << osa.c));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(sMa sMa2, float f2) {
        float c2 = f2;
        mna a2 = this;
        if (a2.J != null) {
            void b2;
            float f3;
            c2 = a2.J();
            if (f3 <= JPa.N) {
                a2.J.J();
                return;
            }
            int n2 = b2.f() / uqa.g;
            long l2 = a2.I;
            a2.I = (long)kPa.Ha;
            float f4 = (float)b2.J() - Tqa.V * c2;
            mna mna2 = a2;
            Yna yna = mna2.J.J();
            mna2.J((sMa)b2, c2, n2, f4, yna);
            mna2.I = l2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        int b2;
        mna mna2 = this;
        int n3 = b2 = mna2.J.J() + a2;
        while (!(n3 < 0 || b2 > Yqa.i || mna2.J.J(b2) != kNa.i && mna2.J.J(b2).J())) {
            n3 = b2 + a2;
        }
        if (b2 >= 0 && b2 <= Yqa.i) {
            mna2.J.J(b2);
            mna2.I = Kpa.J();
        }
    }

    public mna(Kpa kpa2) {
        mna b2 = kpa2;
        mna a2 = this;
        a2.A = b2;
    }

    private float J() {
        mna a2;
        return Oz.J((float)((float)(a2.I - Kpa.J() + vua.Fa) / xqa.O), (float)JPa.N, (float)pqa.r);
    }

    public boolean J() {
        mna a2;
        if (a2.J != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        mna mna2 = this;
        mna2.I = Kpa.J();
        if (mna2.J()) {
            int a2 = mna2.J.J();
            if (a2 != pua.o) {
                mna2.J.J(a2);
                return;
            }
        } else {
            mna2.J = new kNa((KB)mna2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(sMa sMa2, float f2, int n2, float f3, Yna yna) {
        void a2;
        void b2;
        void d2;
        int f4 = n2;
        mna c2 = this;
        uKa.o();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)d2);
        mna mna2 = c2;
        mna2.A.J().J(M);
        mna2.J(f4 - rRa.R, (float)b2, uSa.E, uSa.E, Bsa.H, cQa.o);
        if (a2.J() >= 0) {
            c2.J(f4 - rRa.R - vRa.d + a2.J() * kTa.j, (float)(b2 - pqa.r), uSa.E, cQa.o, osa.c, cQa.o);
        }
        nLa.J();
        int n3 = f4 = uSa.E;
        while (n3 < WOa.fa) {
            void e2;
            int n4 = f4;
            c2.J(n4, e2.f() / uqa.g - Jsa.ha + n4 * kTa.j + uqa.g, (float)(b2 + vQa.q), (float)d2, a2.J(f4++));
            n3 = f4;
        }
        nLa.C();
        uKa.E();
        uKa.k();
    }

    /*
     * WARNING - void declaration
     */
    public void J(sMa sMa2) {
        Object object = this;
        int n2 = (int)(((mna)object).J() * NQa.Y);
        if (n2 > yRa.d && ((mna)object).J != null) {
            String string;
            PB b22 = ((mna)object).J.J();
            String string2 = string = b22 != kNa.i ? b22.J().l() : ((mna)object).J.J().f().l();
            if (string != null) {
                void a22;
                void v1 = a22;
                mna mna2 = object;
                int a22 = (v1.f() - mna2.A.Ea.J(string)) / uqa.g;
                int b22 = v1.J() - TQa.ca;
                uKa.e();
                uKa.B();
                uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
                mna2.A.Ea.J(string, (float)a22, (float)b22, pua.o + (n2 << osa.c));
                uKa.k();
                uKa.D();
            }
        }
    }
}

