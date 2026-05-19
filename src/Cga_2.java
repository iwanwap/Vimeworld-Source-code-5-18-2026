/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  FPa
 *  Gg
 *  JPa
 *  Mda
 *  NTa
 *  QFa
 *  Rda
 *  UZ
 *  Waa
 *  Yea
 *  aSa
 *  gZ
 *  jea
 *  pqa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  wOa
 *  yra
 */
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cga_2
extends Yea {
    private int A;

    public boolean l() {
        Cga_2 a2;
        if (a2.A > pua.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f() {
        Cga_2 a2;
        a2.A = Fua.J;
        if (!a2.j.e) {
            Cga_2 cga_2 = a2;
            a2.j.J((vL)cga_2, (byte)NTa.C);
            if (!cga_2.c()) {
                a2.j.J((vL)a2, Jpa.m, pqa.r, pqa.r);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        void b2;
        Cga_2 cga_2 = this;
        Cga_2 c2 = b2.J();
        if (c2 instanceof jea && (c2 = (jea)c2).o()) {
            cga_2.C(((jea)c2).i * ((jea)c2).i + ((jea)c2).Ea * ((jea)c2).Ea + ((jea)c2).f * ((jea)c2).f);
        }
        return super.J((gZ)b2, (float)a2);
    }

    public int J() {
        Cga_2 a2;
        return a2.A;
    }

    public void J(byte by2) {
        byte b2 = by2;
        Cga_2 a2 = this;
        if (b2 == NTa.C) {
            a2.f();
            return;
        }
        super.J(b2);
    }

    public Cga_2(Gg gg2) {
        Cga_2 b2 = gg2;
        Cga_2 a2 = this;
        super((Gg)b2);
        a2.A = pua.o;
    }

    public void f(Waa waa2) {
        Cga_2 b2 = waa2;
        Cga_2 a2 = this;
        Cga_2 cga_2 = b2;
        super.f((Waa)cga_2);
        cga_2.J(wOa.U, a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public float J(NZ nZ2, Gg gg2, XF xF2, IBlockState iBlockState) {
        void b2;
        void c2;
        Object e2;
        Cga_2 cga_2 = object;
        Object object = iBlockState;
        Cga_2 a2 = cga_2;
        if (!a2.l() || !BlockRailBase.J((IBlockState)e2) && !BlockRailBase.l((Gg)c2, b2.up())) {
            void d2;
            return super.J((NZ)d2, (Gg)c2, (XF)b2, (IBlockState)e2);
        }
        return JPa.N;
    }

    public void C(double a2) {
        Cga_2 b2;
        if (!b2.j.e) {
            double d2;
            a2 = Math.sqrt(a2);
            if (d2 > DQa.S) {
                a2 = DQa.S;
            }
            Cga_2 cga_2 = b2;
            Cga_2 cga_22 = b2;
            cga_2.j.J((vL)cga_22, cga_2.la, cga_22.Z, (double)b2.A, (float)(FPa.T + b2.R.nextDouble() * Bta.c * a2), vRa.d != 0);
            b2.k();
        }
    }

    public Rda J() {
        return Rda.TNT;
    }

    public IBlockState f() {
        return QFa.Lc.J();
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2, float f3) {
        void a2;
        float c2 = f2;
        Cga_2 b2 = this;
        if (c2 >= vQa.q) {
            float f4;
            float f5 = f4 = c2 / FRa.Ga;
            b2.C(f5 * f5);
        }
        super.f(c2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    public Cga_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Cga_2 e2 = gg2;
        Cga_2 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
        d5.A = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(NZ nZ2, Gg gg2, XF xF2, IBlockState iBlockState, float f2) {
        void c2;
        void d2;
        Object f3;
        Cga_2 cga_2 = object;
        Object object = iBlockState;
        Cga_2 b2 = cga_2;
        if (!b2.l() || !BlockRailBase.J((IBlockState)f3) && !BlockRailBase.l((Gg)d2, c2.up())) {
            void a2;
            void e2;
            return super.J((NZ)e2, (Gg)d2, (XF)c2, (IBlockState)f3, (float)a2);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        Cga_2 a2 = this;
        if (e2 != false && a2.A < 0) {
            a2.f();
        }
    }

    public void J(gZ gZ2) {
        Cga_2 a2;
        Cga_2 b2 = gZ2;
        Cga_2 cga_2 = a2 = this;
        Cga_2 cga_22 = b2;
        super.J((gZ)cga_22);
        double d2 = cga_2.i * a2.i + a2.f * a2.f;
        if (!cga_22.l() && a2.j.J().f(qQa.y)) {
            a2.J(new Mda(QFa.Lc, vRa.d), JPa.N);
        }
        if (b2.M() || b2.l() || d2 >= yra.d) {
            a2.C(d2);
        }
    }

    public void J(Waa waa2) {
        Cga_2 b2 = waa2;
        Cga_2 a2 = this;
        Cga_2 cga_2 = b2;
        super.J((Waa)cga_2);
        if (cga_2.J(wOa.U, zOa.v)) {
            a2.A = b2.J(wOa.U);
        }
    }

    public void d() {
        Cga_2 cga_2;
        Cga_2 a2;
        Cga_2 cga_22 = a2;
        super.d();
        if (cga_22.A > 0) {
            Cga_2 cga_23 = a2;
            cga_23.A -= vRa.d;
            Cga_2 cga_24 = a2;
            cga_2 = cga_24;
            cga_23.j.J(UZ.SMOKE_NORMAL, cga_24.la, a2.Z + kTa.B, (double)a2.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
        } else {
            if (a2.A == 0) {
                Cga_2 cga_25 = a2;
                cga_25.C(a2.i * cga_25.i + a2.f * a2.f);
            }
            cga_2 = a2;
        }
        if (cga_2.ca) {
            double d2;
            double d3 = a2.i * a2.i + a2.f * a2.f;
            if (d2 >= yra.d) {
                a2.C(d3);
            }
        }
    }
}

