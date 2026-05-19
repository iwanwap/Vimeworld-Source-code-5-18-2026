/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  Gg
 *  Gl
 *  Lz
 *  NTa
 *  Tpa
 *  Yda
 *  gFa
 *  kta
 *  pqa
 *  vL
 *  vRa
 *  xDa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mfa
extends gFa {
    public int A;
    private Yda I;

    public void f() {
        double d2;
        mfa mfa2 = this;
        mfa a2 = mfa2.I.C();
        double d3 = d2 = ypa.X;
        if (a2.J((vL)mfa2.I) < d3 * d3 && mfa2.I.l((vL)a2)) {
            mfa mfa3 = mfa2;
            Gg gg2 = mfa3.I.j;
            mfa3.A += vRa.d;
            if (mfa3.A == NTa.C) {
                gg2.J((Sx)null, kta.Ja, new XF((vL)mfa2.I), uSa.E);
            }
            if (mfa2.A == kTa.j) {
                d2 = FPa.T;
                Lz lz2 = mfa2.I.J(pqa.r);
                mfa mfa4 = a2;
                double d4 = ((Gl)mfa4).la - (mfa2.I.la + lz2.A * d2);
                mfa mfa5 = a2;
                double d5 = mfa4.J().j + (double)(((Gl)mfa5).u / kta.v) - (kTa.B + mfa2.I.Z + (double)(mfa2.I.u / kta.v));
                double d6 = ((Gl)mfa5).A - (mfa2.I.A + lz2.J * d2);
                gg2.J((Sx)null, Tpa.e, new XF((vL)mfa2.I), uSa.E);
                a2 = new xDa(gg2, (Gl)mfa2.I, d4, d5, d6);
                mfa mfa6 = mfa2;
                ((xDa)a2).A = mfa2.I.I();
                ((xDa)a2).la = mfa6.I.la + lz2.A * d2;
                ((xDa)a2).Z = mfa6.I.Z + (double)(mfa2.I.u / kta.v) + kTa.B;
                ((xDa)a2).A = mfa2.I.A + lz2.J * d2;
                gg2.f((vL)a2);
                mfa2.A = pta.x;
            }
        } else if (mfa2.A > 0) {
            mfa2.A -= vRa.d;
        }
        mfa mfa7 = mfa2;
        mfa7.I.k((mfa7.A > NTa.C ? vRa.d : uSa.E) != 0);
    }

    public void l() {
        a.A = uSa.E;
    }

    public boolean f() {
        mfa a2;
        if (a2.I.C() != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        mfa a2;
        a2.I.k(uSa.E != 0);
    }

    public mfa(Yda yda2) {
        mfa b2 = yda2;
        mfa a2 = this;
        a2.I = b2;
    }
}

