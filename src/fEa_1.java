/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  LA
 *  MQa
 *  Mda
 *  NTa
 *  Oz
 *  QFa
 *  UZ
 *  Waa
 *  XTa
 *  fEa
 *  gZ
 *  kta
 *  vL
 *  vRa
 *  wEa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class fEa_1
extends wEa
implements LA {
    private Sx C;
    public Block i;
    private int M;

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        fEa_1 b2 = this;
        fEa_1 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        b2.M = uSa.E;
        return super.J((gZ)c2, (float)a2);
    }

    public fEa_1(Gg gg2) {
        fEa_1 b2 = gg2;
        fEa_1 a2 = this;
        super((Gg)b2);
        a2.i = QFa.lf;
    }

    public boolean w() {
        int n2;
        int n3;
        fEa_1 fEa_12;
        fEa_1 fEa_13 = fEa_12 = this;
        int a22 = Oz.f((double)fEa_13.la);
        XF a22 = new XF(a22, n3 = Oz.f((double)fEa_13.J().j), n2 = Oz.f((double)fEa_13.A));
        if (fEa_13.j.J(a22.down()).J() == fEa_12.i && fEa_12.j.f(a22) > Yqa.i && super.w()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J(Sx sx2) {
        Object b2 = sx2;
        fEa_1 a2 = this;
        return vRa.d + a2.j.v.nextInt(yRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public void J(byte by2) {
        void a2;
        fEa_1 fEa_12 = this;
        if (a2 == yOa.B) {
            int b2;
            int n2 = b2 = uSa.E;
            while (n2 < XTa.W) {
                fEa_1 fEa_13 = fEa_12;
                double d2 = fEa_13.R.nextGaussian() * GPa.g;
                double d3 = fEa_13.R.nextGaussian() * GPa.g;
                double d4 = fEa_13.R.nextGaussian() * GPa.g;
                int n3 = 5 >> 2;
                fEa_13.j.J(UZ.HEART, fEa_12.la + (double)(fEa_12.R.nextFloat() * fEa_12.F * kta.v) - (double)fEa_12.F, fEa_12.Z + kTa.B + (double)(fEa_12.R.nextFloat() * fEa_12.u), fEa_12.A + (double)(fEa_12.R.nextFloat() * fEa_12.F * kta.v) - (double)fEa_12.F, d2, d3, d4, new int[uSa.E]);
                n2 = ++b2;
            }
        } else {
            super.J((byte)a2);
        }
    }

    public void V() {
        a.M = uSa.E;
    }

    public int j() {
        return sOa.D;
    }

    public void J(Sx sx2) {
        Object b2 = sx2;
        fEa_1 a2 = this;
        a2.M = Jpa.z;
        a2.C = b2;
        a2.j.J((vL)a2, (byte)yOa.B);
    }

    public boolean f(Mda mda2) {
        fEa_1 b2 = mda2;
        fEa_1 a2 = this;
        if (b2 == null) {
            return uSa.E != 0;
        }
        if (b2.J() == Gea.DC) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Sx sx2, Mda mda2) {
        Object c2 = sx2;
        fEa_1 b2 = this;
        if (!((Sx)((Object)c2)).h.f()) {
            void a2;
            void v0 = a2;
            v0.E -= vRa.d;
            if (v0.E <= 0) {
                Object object = c2;
                ((Sx)((Object)object)).K.J(((Sx)((Object)object)).K.J, (Mda)null);
            }
        }
    }

    public void y() {
        fEa_1 a2;
        fEa_1 fEa_12 = a2;
        super.y();
        if (fEa_12.I() != 0) {
            a2.M = uSa.E;
        }
        if (a2.M > 0) {
            fEa_1 fEa_13 = a2;
            fEa_13.M -= vRa.d;
            if (fEa_13.M % NTa.C == 0) {
                fEa_1 fEa_14 = a2;
                double d2 = fEa_14.R.nextGaussian() * GPa.g;
                double d3 = fEa_14.R.nextGaussian() * GPa.g;
                double d4 = fEa_14.R.nextGaussian() * GPa.g;
                fEa_14.j.J(UZ.HEART, a2.la + (double)(a2.R.nextFloat() * a2.F * kta.v) - (double)a2.F, a2.Z + kTa.B + (double)(a2.R.nextFloat() * a2.u), a2.A + (double)(a2.R.nextFloat() * a2.F * kta.v) - (double)a2.F, d2, d3, d4, new int[uSa.E]);
            }
        }
    }

    public void f(Waa waa2) {
        fEa_1 b2 = waa2;
        fEa_1 a2 = this;
        fEa_1 fEa_12 = b2;
        super.f((Waa)fEa_12);
        fEa_12.J(dua.ga, a2.M);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2) {
        void a2;
        fEa_1 fEa_12 = this;
        fEa_1 b2 = a2.K.f();
        if (b2 != null) {
            if (fEa_12.f((Mda)b2) && fEa_12.I() == 0 && fEa_12.M <= 0) {
                fEa_1 fEa_13 = fEa_12;
                fEa_13.J((Sx)a2, (Mda)b2);
                fEa_13.J((Sx)a2);
                return vRa.d != 0;
            }
            if (fEa_12.Y() && fEa_12.f((Mda)b2)) {
                fEa_1 fEa_14 = fEa_12;
                fEa_14.J((Sx)a2, (Mda)b2);
                fEa_14.f((int)((float)(-fEa_14.I() / kTa.j) * Nra.e), vRa.d != 0);
                return vRa.d != 0;
            }
        }
        return super.J((Sx)a2);
    }

    public void r() {
        fEa_1 a2;
        if (a2.I() != 0) {
            a2.M = uSa.E;
        }
        super.r();
    }

    public boolean J(fEa fEa2) {
        fEa_1 b2 = fEa2;
        fEa_1 a2 = this;
        if (b2 == a2) {
            return uSa.E != 0;
        }
        if (((Object)((Object)b2)).getClass() != ((Object)((Object)a2)).getClass()) {
            return uSa.E != 0;
        }
        if (a2.O() && b2.O()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean O() {
        fEa_1 a2;
        if (a2.M > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Sx J() {
        fEa_1 a2;
        return a2.C;
    }

    public void J(Waa waa2) {
        fEa_1 b2 = waa2;
        fEa_1 a2 = this;
        super.J((Waa)b2);
        a2.M = b2.J(dua.ga);
    }

    public boolean n() {
        return uSa.E != 0;
    }

    public float J(XF xF) {
        XF b2 = xF;
        fEa_1 a2 = this;
        if (a2.j.J(b2.down()).J() == QFa.lf) {
            return FRa.Ga;
        }
        return a2.j.J(b2) - MQa.L;
    }
}

