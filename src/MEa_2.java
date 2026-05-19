/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Gg
 *  Gl
 *  KZ
 *  MEa
 *  Mda
 *  RC
 *  Rua
 *  SQa
 *  Ssa
 *  Waa
 *  aSa
 *  bua
 *  cQa
 *  gFa
 *  gZ
 *  hra
 *  kta
 *  mra
 *  nda
 *  oA
 *  pqa
 *  psa
 *  rDa
 *  vL
 *  vRa
 *  wra
 */
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MEa_2
extends nda {
    private static final CEa C;
    private int i;
    private UUID M;
    private int k;
    private static final UUID I;

    private void A(vL vL2) {
        MEa_2 a2;
        MEa_2 b2 = vL2;
        MEa_2 mEa_2 = a2 = this;
        MEa_2 mEa_22 = a2;
        mEa_2.i = hra.i + mEa_22.R.nextInt(hra.i);
        mEa_2.k = mEa_22.R.nextInt(wra.P);
        if (b2 instanceof Gl) {
            a2.l((Gl)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ2, oA oA2) {
        void b2;
        MEa_2 c2 = oA2;
        MEa_2 a2 = this;
        MEa_2 mEa_2 = c2;
        super.J((KZ)b2, (oA)mEa_2);
        a2.I(uSa.E != 0);
        return mEa_2;
    }

    public MEa_2(Gg gg2) {
        MEa_2 b2 = gg2;
        MEa_2 a2 = this;
        super((Gg)b2);
        a2.z = vRa.d;
    }

    public void l(Gl gl2) {
        MEa_2 b2 = gl2;
        MEa_2 a2 = this;
        MEa_2 mEa_2 = b2;
        super.l((Gl)mEa_2);
        if (mEa_2 != null) {
            a2.M = b2.J();
        }
    }

    public void p() {
        MEa_2 a2;
        a2.J(Gea.Bb, vRa.d);
    }

    public boolean N() {
        MEa_2 a2;
        if (a2.j.J(a2.J(), (vL)a2)) {
            MEa_2 mEa_2 = a2;
            if (a2.j.J((vL)mEa_2, mEa_2.J()).isEmpty() && !a2.j.C(a2.J())) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void N() {
        MEa_2 a2;
        MEa_2 mEa_2 = a2;
        mEa_2.L.J(vRa.d, (gFa)new rDa((MEa)a2));
        mEa_2.L.J(uqa.g, (gFa)new MDa((MEa)a2));
    }

    public boolean ca() {
        MEa_2 a2;
        if (a2.i > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        Object b2 = waa2;
        MEa_2 a2 = this;
        MEa_2 mEa_2 = b2;
        super.J((Waa)b2);
        a2.i = mEa_2.J(SQa.l);
        b2 = mEa_2.J(bua.s);
        if (((String)b2).length() > 0) {
            a2.M = UUID.fromString((String)b2);
            MEa_2 mEa_22 = a2;
            b2 = a2.j.J(mEa_22.M);
            mEa_22.l((Gl)b2);
            if (b2 != null) {
                a2.y = b2;
                a2.Ka = a2.k();
            }
        }
    }

    public void s() {
        MEa_2 a2;
        MEa_2 mEa_2 = a2;
        super.s();
        mEa_2.J((RC)k).J(aSa.V);
        mEa_2.J(Kha.j).J(Qpa.o);
        mEa_2.J(Kha.A).J(DQa.S);
    }

    public boolean w() {
        MEa_2 a2;
        if (a2.j.J() != sZ.PEACEFUL) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String f() {
        return mra.i;
    }

    public void r() {
        MEa_2 mEa_2;
        MEa_2 mEa_22;
        MEa_2 mEa_23 = mEa_22 = this;
        Object a2 = mEa_23.J(Kha.j);
        if (mEa_23.ca()) {
            if (!mEa_22.Y() && !a2.J(C)) {
                a2.J(C);
            }
            MEa_2 mEa_24 = mEa_22;
            mEa_2 = mEa_24;
            mEa_24.i -= vRa.d;
        } else {
            if (a2.J(C)) {
                a2.f(C);
            }
            mEa_2 = mEa_22;
        }
        if (mEa_2.k > 0 && (mEa_22.k -= vRa.d) == 0) {
            MEa_2 mEa_25 = mEa_22;
            mEa_25.J(lTa.Fa, mEa_22.G() * kta.v, ((mEa_25.R.nextFloat() - mEa_22.R.nextFloat()) * psa.N + pqa.r) * Ssa.la);
        }
        if (mEa_22.i > 0 && mEa_22.M != null && mEa_22.f() == null) {
            MEa_2 mEa_26 = mEa_22;
            a2 = mEa_26.j.J(mEa_22.M);
            mEa_26.l((Gl)a2);
            mEa_22.y = a2;
            mEa_26.Ka = mEa_26.k();
        }
        super.r();
    }

    static {
        I = UUID.fromString(cQa.b);
        C = new CEa(I, Rua.j, fPa.ca, uSa.E).J(uSa.E != 0);
    }

    public String A() {
        return nua.N;
    }

    public void J(KZ kZ2) {
        MEa_2 b2 = kZ2;
        MEa_2 a2 = this;
        a2.f(uSa.E, new Mda(Gea.sa));
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl2, int n2) {
        int c2;
        void a2;
        MEa_2 mEa_2 = this;
        int b2 = mEa_2.R.nextInt(uqa.g + a2);
        int n3 = c2 = uSa.E;
        while (n3 < b2) {
            mEa_2.J(Gea.qa, vRa.d);
            n3 = ++c2;
        }
        b2 = mEa_2.R.nextInt(uqa.g + a2);
        int n4 = c2 = uSa.E;
        while (n4 < b2) {
            mEa_2.J(Gea.hc, vRa.d);
            n4 = ++c2;
        }
    }

    public void f(Waa waa2) {
        MEa_2 b2 = waa2;
        MEa_2 a2 = this;
        MEa_2 mEa_2 = b2;
        super.f((Waa)mEa_2);
        MEa_2 mEa_22 = a2;
        mEa_2.J(SQa.l, (short)mEa_22.i);
        if (mEa_22.M != null) {
            b2.J(bua.s, a2.M.toString());
            return;
        }
        b2.J(bua.s, Mqa.y);
    }

    public String i() {
        return APa.j;
    }

    public static /* synthetic */ void J(MEa mEa2, vL vL2) {
        MEa b2 = vL2;
        MEa a2 = mEa2;
        super.A((vL)b2);
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        MEa_2 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        MEa_2 b2 = this;
        MEa_2 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        vL vL2 = c2.f();
        if (vL2 instanceof Sx) {
            b2.A(vL2);
        }
        return super.J((gZ)c2, (float)a2);
    }

    public void d() {
        MEa_2 a2;
        super.d();
    }
}

