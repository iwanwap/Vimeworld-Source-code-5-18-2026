/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GDa
 *  Gl
 *  ISa
 *  gFa
 *  gZ
 *  kta
 *  pqa
 *  vL
 *  vRa
 *  wOa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XDa_2
extends gFa {
    private int A;
    private GDa I;

    public boolean l() {
        block2: {
            block3: {
                XDa_2 a2;
                if (!super.l()) break block2;
                if (a2.I.Fa()) break block3;
                XDa_2 xDa_2 = a2;
                if (!(xDa_2.I.J((vL)xDa_2.I.C()) > KSa.F)) break block2;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        XDa_2 xDa_2;
        XDa_2 xDa_22;
        XDa_2 xDa_23 = xDa_22 = this;
        Gl gl2 = xDa_23.I.C();
        xDa_23.I.J().f();
        xDa_23.I.J().J((vL)gl2, ISa.a, ISa.a);
        if (!xDa_23.I.l((vL)gl2)) {
            xDa_22.I.C((Gl)null);
            return;
        }
        XDa_2 xDa_24 = xDa_22;
        xDa_24.A += vRa.d;
        if (xDa_24.A == 0) {
            XDa_2 xDa_25 = xDa_22;
            XDa_2 xDa_26 = xDa_22;
            xDa_2 = xDa_26;
            GDa.J((GDa)xDa_25.I, (int)xDa_26.I.C().M());
            xDa_25.I.j.J((vL)xDa_22.I, (byte)wOa.h);
        } else {
            XDa_2 xDa_27 = xDa_22;
            if (xDa_27.A >= xDa_27.I.I()) {
                float a2 = pqa.r;
                if (xDa_22.I.j.J() == sZ.HARD) {
                    a2 += kta.v;
                }
                if (xDa_22.I.Fa()) {
                    a2 += kta.v;
                }
                XDa_2 xDa_28 = xDa_22;
                gl2.J(gZ.f((vL)xDa_28.I, (vL)xDa_28.I), a2);
                gl2.J(gZ.J((Gl)xDa_22.I), (float)xDa_22.I.J(Kha.A).f());
                xDa_22.I.C((Gl)null);
                xDa_2 = xDa_22;
            } else {
                if (xDa_22.A < Psa.M || xDa_22.A % kTa.j == 0) {
                    // empty if block
                }
                xDa_2 = xDa_22;
            }
        }
        super.f();
    }

    public XDa_2(GDa gDa2) {
        XDa_2 a2;
        XDa_2 b2 = gDa2;
        XDa_2 xDa_2 = a2 = this;
        xDa_2.I = b2;
        xDa_2.J(yRa.d);
    }

    public boolean f() {
        XDa_2 xDa_2 = this;
        XDa_2 a2 = xDa_2.I.C();
        if (a2 != null && a2.K()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        XDa_2 a2;
        XDa_2 xDa_2 = a2;
        xDa_2.A = ypa.y;
        xDa_2.I.J().f();
        xDa_2.I.J().J((vL)a2.I.C(), ISa.a, ISa.a);
        xDa_2.I.t = vRa.d;
    }

    public void J() {
        XDa_2 a2;
        XDa_2 xDa_2 = a2;
        GDa.J((GDa)xDa_2.I, (int)uSa.E);
        xDa_2.I.C((Gl)null);
        GDa.J((GDa)a2.I).C();
    }
}

