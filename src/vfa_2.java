/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ac
 *  Bsa
 *  ERa
 *  Gg
 *  Gl
 *  UZ
 *  Vua
 *  Waa
 *  XTa
 *  Yaa
 *  bFa
 *  dQa
 *  fEa
 *  gZ
 *  kpa
 *  kta
 *  tY
 *  vRa
 *  vfa
 *  vpa
 */
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class vfa_2
extends fEa
implements Ac {
    public lga I;

    public Yaa J() {
        vfa_2 a2;
        vfa_2 vfa_22 = this;
        if (vfa_22.ba() && (a2 = vfa_22.d()) != null) {
            return a2.J();
        }
        return super.J();
    }

    /*
     * WARNING - void declaration
     */
    public void I(boolean bl2) {
        void a2;
        vfa_2 vfa_22 = this;
        byte b2 = vfa_22.aa.J(ERa.C);
        if (a2 != false) {
            vfa_22.aa.J(ERa.C, Byte.valueOf((byte)(b2 | vRa.d)));
            return;
        }
        vfa_22.aa.J(ERa.C, Byte.valueOf((byte)(b2 & rQa.p)));
    }

    public lga J() {
        vfa_2 a2;
        return a2.I;
    }

    public void j(boolean bl2) {
        int a2;
        vfa_2 vfa_22 = this;
        vfa_2 b2 = UZ.HEART;
        if (a2 == 0) {
            b2 = UZ.SMOKE_NORMAL;
        }
        int n2 = a2 = uSa.E;
        while (n2 < XTa.W) {
            vfa_2 vfa_23 = vfa_22;
            double d2 = vfa_23.R.nextGaussian() * GPa.g;
            double d3 = vfa_23.R.nextGaussian() * GPa.g;
            double d4 = vfa_23.R.nextGaussian() * GPa.g;
            int n3 = 3 & 5;
            vfa_23.j.J((UZ)b2, vfa_22.la + (double)(vfa_22.R.nextFloat() * vfa_22.F * kta.v) - (double)vfa_22.F, vfa_22.Z + kTa.B + (double)(vfa_22.R.nextFloat() * vfa_22.u), vfa_22.A + (double)(vfa_22.R.nextFloat() * vfa_22.F * kta.v) - (double)vfa_22.F, d2, d3, d4, new int[uSa.E]);
            n2 = ++a2;
        }
    }

    public void J() {
        vfa_2 a2;
        vfa_2 vfa_22 = a2;
        super.J();
        vfa_22.aa.f(ERa.C, (byte)uSa.E);
        vfa_22.aa.f(yta.Ka, Mqa.y);
    }

    public boolean f(Gl gl2) {
        vfa_2 b2 = gl2;
        vfa_2 a2 = this;
        if (b2 == a2.d()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String l() {
        vfa_2 a2;
        return a2.aa.J(yta.Ka);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gl gl2) {
        void a2;
        vfa_2 vfa_22 = this;
        if (vfa_22.ba()) {
            vfa_2 b2 = vfa_22.d();
            if (a2 == b2) {
                return vRa.d != 0;
            }
            if (b2 != null) {
                return b2.J((Gl)a2);
            }
        }
        return super.J((Gl)a2);
    }

    public Gl d() {
        Object a22;
        vfa_2 vfa_22;
        block3: {
            vfa_22 = this;
            try {
                a22 = UUID.fromString(vfa_22.l());
                if (a22 != null) break block3;
                return null;
            }
            catch (IllegalArgumentException a22) {
                return null;
            }
        }
        return vfa_22.j.J((UUID)a22);
    }

    /*
     * WARNING - void declaration
     */
    public void F(boolean bl2) {
        vfa_2 vfa_22;
        void a2;
        vfa_2 vfa_23 = this;
        byte b2 = vfa_23.aa.J(ERa.C);
        if (a2 != false) {
            vfa_2 vfa_24 = vfa_23;
            vfa_22 = vfa_24;
            vfa_24.aa.J(ERa.C, Byte.valueOf((byte)(b2 | AQa.P)));
        } else {
            vfa_2 vfa_25 = vfa_23;
            vfa_22 = vfa_25;
            vfa_25.aa.J(ERa.C, Byte.valueOf((byte)(b2 & kpa.w)));
        }
        vfa_22.X();
    }

    public boolean J(Gl gl2, Gl gl3) {
        vfa_2 c2 = gl3;
        vfa_2 a2 = this;
        return vRa.d != 0;
    }

    public void f(String string) {
        Object b2 = string;
        vfa_2 a2 = this;
        a2.aa.J(yta.Ka, b2);
    }

    public boolean ba() {
        vfa_2 a2;
        if ((a2.aa.J(ERa.C) & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(byte by2) {
        byte b2 = by2;
        vfa_2 a2 = this;
        if (b2 == XTa.W) {
            a2.j(vRa.d != 0);
            return;
        }
        if (b2 == uua.p) {
            a2.j(uSa.E != 0);
            return;
        }
        super.J(b2);
    }

    public vfa_2(Gg gg2) {
        vfa_2 b2 = gg2;
        vfa_2 a2 = this;
        super((Gg)b2);
        a2.I = new lga((vfa)a2);
        a2.X();
    }

    public boolean v() {
        vfa_2 a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void X() {
    }

    public void J(gZ gZ2) {
        vfa_2 b2 = gZ2;
        vfa_2 a2 = this;
        if (!a2.j.e && a2.j.J().f(Vua.C) && a2.J() && a2.d() instanceof bFa) {
            ((bFa)a2.d()).J(a2.J().J());
        }
        super.J((gZ)b2);
    }

    public void J(Waa waa2) {
        vfa_2 b2 = waa2;
        vfa_2 a2 = this;
        super.J((Waa)b2);
        String string = Mqa.y;
        if ((b2.J(vpa.s, Yqa.i) ? (string = b2.J(vpa.s)) : (string = tY.J((String)b2.J(dQa.l)))).length() > 0) {
            vfa_2 vfa_22 = a2;
            vfa_22.f(string);
            vfa_22.F(vRa.d != 0);
        }
        vfa_2 vfa_23 = a2;
        vfa_2 vfa_24 = b2;
        vfa_23.I.J(vfa_24.f(Bsa.Ka));
        vfa_23.I(vfa_24.f(Bsa.Ka));
    }

    public void f(Waa waa2) {
        vfa_2 vfa_22;
        vfa_2 a2;
        vfa_2 b2 = waa2;
        vfa_2 vfa_23 = a2 = this;
        super.f((Waa)b2);
        if (vfa_23.l() == null) {
            vfa_2 vfa_24 = b2;
            vfa_22 = vfa_24;
            vfa_24.J(vpa.s, Mqa.y);
        } else {
            vfa_2 vfa_25 = b2;
            vfa_22 = vfa_25;
            vfa_25.J(vpa.s, a2.l());
        }
        vfa_22.J(Bsa.Ka, a2.v());
    }
}

