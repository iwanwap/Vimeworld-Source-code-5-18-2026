/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  FPa
 *  Gg
 *  ISa
 *  MQa
 *  NTa
 *  Oz
 *  Waa
 *  XTa
 *  ZOa
 *  Zpa
 *  aPa
 *  aSa
 *  dpa
 *  fsa
 *  gZ
 *  kta
 *  lPa
 *  pPa
 *  pea
 *  uQa
 *  vL
 *  vRa
 *  wra
 */
import java.util.Calendar;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mEa_3
extends pea {
    private XF k;

    public void J(double d2, boolean bl2, Block block, XF xF2) {
        mEa_3 mEa_32 = object;
        Object object = xF2;
        mEa_3 a2 = mEa_32;
    }

    private boolean J(Calendar calendar) {
        Calendar b2 = calendar;
        mEa_3 a2 = this;
        if (b2.get(uqa.g) + vRa.d == NTa.C && b2.get(tTa.h) >= kTa.j || b2.get(uqa.g) + vRa.d == pPa.f && b2.get(tTa.h) <= yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Waa waa2) {
        mEa_3 a2;
        mEa_3 b2 = waa2;
        mEa_3 mEa_32 = a2 = this;
        super.J((Waa)b2);
        mEa_32.aa.J(ERa.C, Byte.valueOf(b2.J(ROa.t)));
    }

    public boolean g() {
        return vRa.d != 0;
    }

    public void r() {
        block11: {
            XF xF2;
            mEa_3 mEa_32;
            block13: {
                block12: {
                    block10: {
                        mEa_32 = this;
                        super.r();
                        mEa_3 mEa_33 = mEa_32;
                        Object a2 = new XF((vL)mEa_33);
                        xF2 = ((XF)((Object)a2)).up();
                        if (!mEa_33.V()) break block10;
                        if (!mEa_32.j.J(xF2).J().A()) {
                            mEa_3 mEa_34 = mEa_32;
                            mEa_34.k(uSa.E != 0);
                            mEa_34.j.J((Sx)null, wra.W, (XF)((Object)a2), uSa.E);
                            return;
                        }
                        if (mEa_32.R.nextInt(ZOa.x) == 0) {
                            mEa_32.t = mEa_32.R.nextInt(aPa.Y);
                        }
                        if (mEa_32.j.J((vL)mEa_32, FPa.T) != null) {
                            mEa_3 mEa_35 = mEa_32;
                            mEa_35.k(uSa.E != 0);
                            mEa_35.j.J((Sx)null, wra.W, (XF)((Object)a2), uSa.E);
                            return;
                        }
                        break block11;
                    }
                    if (mEa_32.k != null) {
                        mEa_3 mEa_36 = mEa_32;
                        if (!mEa_36.j.J(mEa_36.k) || mEa_32.k.getY() < vRa.d) {
                            mEa_32.k = null;
                        }
                    }
                    if (mEa_32.k == null || mEa_32.R.nextInt(Fsa.d) == 0) break block12;
                    mEa_3 mEa_37 = mEa_32;
                    if (!(mEa_37.k.distanceSq((int)mEa_37.la, (int)mEa_32.Z, (int)mEa_32.A) < FPa.T)) break block13;
                }
                mEa_32.k = new XF((int)mEa_32.la + mEa_32.R.nextInt(XTa.W) - mEa_32.R.nextInt(XTa.W), (int)mEa_32.Z + mEa_32.R.nextInt(uua.p) - uqa.g, (int)mEa_32.A + mEa_32.R.nextInt(XTa.W) - mEa_32.R.nextInt(XTa.W));
            }
            mEa_3 mEa_38 = mEa_32;
            double d2 = (double)mEa_38.k.getX() + kTa.B - mEa_32.la;
            mEa_3 mEa_39 = mEa_32;
            double d3 = (double)mEa_38.k.getY() + tpa.k - mEa_39.Z;
            double d4 = (double)mEa_39.k.getZ() + kTa.B - mEa_32.A;
            mEa_38.f(mEa_38.i + (Math.signum(d2) * kTa.B - mEa_32.i) * Tqa.Ia);
            mEa_38.J(mEa_38.Ea + (Math.signum(d3) * dpa.X - mEa_32.Ea) * Tqa.Ia);
            mEa_38.l(mEa_38.f + (Math.signum(d4) * kTa.B - mEa_32.f) * Tqa.Ia);
            float a2 = Oz.f((float)((float)(Oz.f((double)mEa_38.f, (double)mEa_32.i) * kta.Da / lQa.f) - ISa.a - mEa_32.X));
            mEa_38.M(MQa.L);
            mEa_38.X += a2;
            if (mEa_38.R.nextInt(ySa.T) == 0 && mEa_32.j.J(xF2).J().A()) {
                mEa_32.k(vRa.d != 0);
            }
        }
    }

    public boolean z() {
        return uSa.E != 0;
    }

    public float G() {
        return Nra.e;
    }

    public void J() {
        mEa_3 a2;
        mEa_3 mEa_32 = a2;
        super.J();
        mEa_32.aa.f(ERa.C, new Byte((byte)uSa.E));
    }

    public mEa_3(Gg gg2) {
        mEa_3 a2;
        mEa_3 b2 = gg2;
        mEa_3 mEa_32 = a2 = this;
        super((Gg)b2);
        mEa_32.l(MQa.L, ATa.r);
        mEa_32.k(vRa.d != 0);
    }

    public String i() {
        return Eqa.o;
    }

    public float l() {
        mEa_3 a2;
        return a2.u / kta.v;
    }

    public boolean V() {
        mEa_3 a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void s() {
        mEa_3 a2;
        mEa_3 mEa_32 = a2;
        super.s();
        mEa_32.J(Kha.M).J(lPa.K);
    }

    public void f(Waa waa2) {
        mEa_3 b2 = waa2;
        mEa_3 a2 = this;
        mEa_3 mEa_32 = b2;
        super.f((Waa)mEa_32);
        mEa_32.J(ROa.t, a2.aa.J(ERa.C));
    }

    public void d() {
        mEa_3 a2;
        mEa_3 mEa_32 = a2;
        super.d();
        if (mEa_32.V()) {
            mEa_3 mEa_33 = a2;
            mEa_33.f(aSa.V);
            mEa_33.J(aSa.V);
            mEa_33.l(aSa.V);
            mEa_33.Z = (double)Oz.f((double)mEa_33.Z) + oua.i - (double)a2.u;
            return;
        }
        mEa_3 mEa_34 = a2;
        mEa_34.J(mEa_34.Ea * Zpa.ca);
    }

    public String f() {
        return rua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void k(boolean bl2) {
        void a2;
        mEa_3 mEa_32 = this;
        byte b2 = mEa_32.aa.J(ERa.C);
        if (a2 != false) {
            mEa_32.aa.J(ERa.C, Byte.valueOf((byte)(b2 | vRa.d)));
            return;
        }
        mEa_32.aa.J(ERa.C, Byte.valueOf((byte)(b2 & rQa.p)));
    }

    public void f() {
    }

    public float M() {
        mEa_3 a2;
        return super.M() * fsa.Ia;
    }

    public String A() {
        mEa_3 a2;
        if (a2.V() && a2.R.nextInt(AQa.P) != 0) {
            return null;
        }
        return uQa.J;
    }

    public void e(vL object) {
        mEa_3 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        mEa_3 b2 = this;
        mEa_3 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (!b2.j.e && b2.V()) {
            b2.k(uSa.E != 0);
        }
        return super.J((gZ)c2, (float)a2);
    }

    public boolean w() {
        int n2;
        mEa_3 mEa_32 = this;
        Object a22 = new XF(mEa_32.la, mEa_32.J().j, mEa_32.A);
        if (a22.getY() >= mEa_32.j.M()) {
            return uSa.E != 0;
        }
        mEa_3 mEa_33 = mEa_32;
        int a22 = mEa_33.j.C((XF)((Object)a22));
        int n3 = AQa.P;
        if (mEa_33.J(mEa_33.j.J())) {
            n3 = XTa.W;
            n2 = a22;
        } else {
            if (mEa_32.R.nextBoolean()) {
                return uSa.E != 0;
            }
            n2 = a22;
        }
        if (n2 > mEa_32.R.nextInt(n3)) {
            return uSa.E != 0;
        }
        return super.w();
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public void f(float f2, float f3) {
        float c2 = f3;
        mEa_3 mEa_32 = this;
    }
}

