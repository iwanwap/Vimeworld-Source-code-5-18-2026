/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  Gl
 *  Hba
 *  Iia
 *  JPa
 *  KZ
 *  Mda
 *  NTa
 *  ODa
 *  OIa
 *  PTa
 *  QFa
 *  QSa
 *  Qga
 *  Uta
 *  Waa
 *  XTa
 *  Yfa
 *  Yra
 *  ZOa
 *  bpa
 *  eAa
 *  fEa
 *  gFa
 *  gZ
 *  kpa
 *  lFa
 *  nHa
 *  oA
 *  oHa
 *  pPa
 *  rGa
 *  ria
 *  vL
 *  vQa
 *  vRa
 *  vfa
 *  wEa
 *  wPa
 */
import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ODa_3
extends vfa {
    private lFa<Sx> A;
    private OIa I;

    public String i() {
        return PTa.i;
    }

    public boolean J(Sx sx2) {
        ODa_3 oDa_3;
        Object b2;
        block8: {
            ODa_3 a2;
            block7: {
                Mda mda2;
                block6: {
                    b2 = sx2;
                    a2 = this;
                    mda2 = ((Sx)((Object)b2)).K.f();
                    if (!a2.ba()) break block6;
                    if (!a2.f((Gl)b2) || a2.j.e || a2.f(mda2)) break block7;
                    a2.I.J((!a2.v() ? vRa.d : uSa.E) != 0);
                    oDa_3 = a2;
                    break block8;
                }
                if (a2.I.C() && mda2 != null && mda2.J() == Gea.E && b2.J((vL)a2) < KSa.F) {
                    if (!((Sx)((Object)b2)).h.f()) {
                        mda2.E -= vRa.d;
                    }
                    if (mda2.E <= 0) {
                        Object object = b2;
                        ((Sx)((Object)object)).K.J(((Sx)((Object)object)).K.J, (Mda)null);
                    }
                    if (!a2.j.e) {
                        ODa_3 oDa_32 = a2;
                        if (a2.R.nextInt(yRa.d) == 0) {
                            oDa_32.F(vRa.d != 0);
                            ODa_3 oDa_33 = a2;
                            ODa_3 oDa_34 = a2;
                            oDa_34.k(vRa.d + a2.j.v.nextInt(yRa.d));
                            oDa_33.f(b2.J().toString());
                            oDa_34.j(vRa.d != 0);
                            oDa_33.I.J(vRa.d != 0);
                            oDa_33.j.J((vL)a2, (byte)XTa.W);
                        } else {
                            oDa_32.j(uSa.E != 0);
                            a2.j.J((vL)a2, (byte)uua.p);
                        }
                    }
                    return vRa.d != 0;
                }
            }
            oDa_3 = a2;
        }
        return super.J((Sx)((Object)b2));
    }

    public boolean w() {
        ODa_3 a2;
        if (a2.j.v.nextInt(yRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void F(boolean bl) {
        boolean b2 = bl;
        ODa_3 a2 = this;
        super.F(b2);
    }

    public eAa J() {
        return Gea.Xb;
    }

    public ODa J(wEa wEa2) {
        ODa_3 b2 = wEa2;
        ODa_3 a2 = this;
        b2 = new ODa_3(a2.j);
        if (a2.ba()) {
            ODa_3 oDa_3 = b2;
            oDa_3.f(a2.l());
            oDa_3.F(vRa.d != 0);
            oDa_3.k(a2.g());
        }
        return b2;
    }

    public void r() {
        ODa_3 a2;
        if (a2.J().J()) {
            double d2 = a2.J().C();
            if (d2 == oQa.fa) {
                ODa_3 oDa_3 = a2;
                oDa_3.i(vRa.d != 0);
                oDa_3.l(uSa.E != 0);
                return;
            }
            if (d2 == ZOa.n) {
                ODa_3 oDa_3 = a2;
                oDa_3.i(uSa.E != 0);
                oDa_3.l(vRa.d != 0);
                return;
            }
            ODa_3 oDa_3 = a2;
            oDa_3.i(uSa.E != 0);
            oDa_3.l(uSa.E != 0);
            return;
        }
        ODa_3 oDa_3 = a2;
        oDa_3.i(uSa.E != 0);
        oDa_3.l(uSa.E != 0);
    }

    public void k(int n2) {
        int b2 = n2;
        ODa_3 a2 = this;
        a2.aa.J(yOa.B, Byte.valueOf((byte)b2));
    }

    public void X() {
        ODa_3 a2;
        if (a2.A == null) {
            ODa_3 oDa_3 = a2;
            a2.A = new lFa((bga)((Object)a2), Sx.class, Yra.i, Jra.A, ZOa.n);
        }
        ODa_3 oDa_3 = a2;
        oDa_3.D.J(oDa_3.A);
        if (!oDa_3.ba()) {
            a2.D.J(AQa.P, a2.A);
        }
    }

    public void s() {
        ODa_3 a2;
        ODa_3 oDa_3 = a2;
        super.s();
        oDa_3.J(Kha.M).J(Wqa.m);
        oDa_3.J(Kha.j).J(osa.b);
    }

    public boolean J(fEa fEa2) {
        ODa_3 b2 = fEa2;
        ODa_3 a2 = this;
        if (b2 == a2) {
            return uSa.E != 0;
        }
        if (!a2.ba()) {
            return uSa.E != 0;
        }
        if (!(b2 instanceof ODa_3)) {
            return uSa.E != 0;
        }
        if (!b2.ba()) {
            return uSa.E != 0;
        }
        if (a2.O() && b2.O()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        ODa_3 a2;
        if (a2.J()) {
            return a2.e();
        }
        if (a2.ba()) {
            return Ey.f((String)kpa.y);
        }
        return super.J();
    }

    public int g() {
        ODa_3 a2;
        return a2.aa.J(yOa.B);
    }

    public void f(Waa waa2) {
        ODa_3 b2 = waa2;
        ODa_3 a2 = this;
        ODa_3 oDa_3 = b2;
        super.f((Waa)oDa_3);
        oDa_3.J(wPa.Y, a2.g());
    }

    public float G() {
        return Xpa.R;
    }

    public String f() {
        return PTa.i;
    }

    public String A() {
        ODa_3 a2;
        if (a2.ba()) {
            if (a2.O()) {
                return wsa.p;
            }
            if (a2.R.nextInt(AQa.P) == 0) {
                return ITa.k;
            }
            return Iqa.b;
        }
        return Mqa.y;
    }

    public void J() {
        ODa_3 a2;
        ODa_3 oDa_3 = a2;
        super.J();
        oDa_3.aa.f(yOa.B, (byte)uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ2, oA oA2) {
        void b2;
        ODa_3 a2;
        ODa_3 c2 = oA2;
        ODa_3 oDa_3 = a2 = this;
        c2 = super.J((KZ)b2, (oA)c2);
        if (oDa_3.j.v.nextInt(XTa.W) == 0) {
            int n2 = b2 = uSa.E;
            while (n2 < uqa.g) {
                ODa_3 oDa_32 = new ODa_3(a2.j);
                ODa_3 oDa_33 = a2;
                oDa_32.f(oDa_33.la, a2.Z, (double)a2.A, a2.X, JPa.N);
                oDa_32.D(QSa.e);
                oDa_33.j.f((vL)oDa_32);
                n2 = ++b2;
            }
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        ODa_3 b2 = this;
        ODa_3 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        b2.I.J(uSa.E != 0);
        return super.J((gZ)c2, (float)a2);
    }

    public boolean f(Mda mda2) {
        ODa_3 b2 = mda2;
        ODa_3 a2 = this;
        if (b2 != null && b2.J() == Gea.E) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ODa_3(Gg gg2) {
        ODa_3 a2;
        ODa_3 b2 = gg2;
        ODa_3 oDa_3 = a2 = this;
        super((Gg)b2);
        oDa_3.l(Ora.D, ZSa.q);
        ((Hba)oDa_3.J()).J(vRa.d != 0);
        ODa_3 oDa_32 = a2;
        oDa_32.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        ODa_3 oDa_33 = a2;
        oDa_32.D.J(uqa.g, (gFa)oDa_33.I);
        ODa_3 oDa_34 = a2;
        a2.I = new OIa((bga)((Object)a2), oQa.fa, Gea.E, vRa.d != 0);
        oDa_33.D.J(yRa.d, (gFa)a2.I);
        ODa_3 oDa_35 = a2;
        oDa_35.D.J(tTa.h, (gFa)new rGa((vfa)a2, oua.i, FRa.Ga, eua.C));
        oDa_35.D.J(uua.p, (gFa)new Iia((ODa)a2, Jra.A));
        oDa_35.D.J(XTa.W, (gFa)new Qga((Yfa)a2, bpa.K));
        oDa_35.D.J(Yqa.i, (gFa)new QGa((Yfa)a2));
        oDa_35.D.J(WOa.fa, (gFa)new Pia((fEa)a2, Jra.A));
        oDa_35.D.J(NTa.C, (gFa)new HDa((bga)((Object)a2), Jra.A));
        oDa_35.D.J(pPa.f, (gFa)new nHa((Yfa)a2, Sx.class, FRa.Ga));
        oDa_35.L.J(vRa.d, (gFa)new ria((vfa)a2, aEa.class, uSa.E != 0, (Predicate)null));
    }

    public void J(Waa waa2) {
        ODa_3 a2;
        ODa_3 b2 = waa2;
        ODa_3 oDa_3 = a2 = this;
        super.J((Waa)b2);
        oDa_3.k(b2.J(wPa.Y));
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        ODa_3 oDa_3 = this;
    }

    public boolean n() {
        ODa_3 a2;
        if (!a2.ba() && a2.g > Uta.F) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean C(vL vL2) {
        ODa_3 b2 = vL2;
        ODa_3 a2 = this;
        return b2.J(gZ.J((Gl)a2), vQa.q);
    }

    public boolean N() {
        Object object = this;
        if (object.j.J(object.J(), (vL)object)) {
            ODa_3 oDa_3 = object;
            if (object.j.J((vL)oDa_3, oDa_3.J()).isEmpty() && !object.j.C(object.J())) {
                Object a2 = new XF(object.la, object.J().j, (double)object.A);
                if (a2.getY() < object.j.M()) {
                    return uSa.E != 0;
                }
                if ((a2 = object.j.J(((XF)((Object)a2)).down()).J()) == QFa.lf || ((Block)a2).J() == Material.leaves) {
                    return vRa.d != 0;
                }
            }
        }
        return uSa.E != 0;
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        ODa_3 oDa_3 = this;
    }
}

