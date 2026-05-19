/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  ERa
 *  Gg
 *  JPa
 *  MQa
 *  Waa
 *  aSa
 *  cra
 *  gZ
 *  hqa
 *  vL
 *  vRa
 *  wPa
 *  xy
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneDiode;
import org.apache.commons.lang3.Validate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class YDa_1
extends vL {
    public DZ j;
    public XF J;
    private int A;

    private void f() {
        YDa_1 yDa_1 = this;
        if (yDa_1.j != null) {
            double d2;
            YDa_1 yDa_12 = yDa_1;
            double d3 = (double)yDa_12.J.getX() + kTa.B;
            double d4 = (double)yDa_12.J.getY() + kTa.B;
            double d5 = (double)yDa_12.J.getZ() + kTa.B;
            double d6 = yDa_12.J(yDa_12.f());
            double d7 = yDa_12.J(yDa_12.J());
            d3 -= (double)yDa_1.j.getFrontOffsetX() * Npa.Ka;
            d5 -= (double)yDa_1.j.getFrontOffsetZ() * Npa.Ka;
            DZ a2 = yDa_12.j.rotateYCCW();
            yDa_12.la = d3 += d6 * (double)a2.getFrontOffsetX();
            yDa_12.Z = d4 += d7;
            yDa_12.A = (int)(d5 += d6 * (double)a2.getFrontOffsetZ());
            d6 = yDa_12.f();
            d7 = yDa_12.J();
            double d8 = yDa_12.f();
            if (yDa_12.j.getAxis() == RX.Z) {
                d8 = oua.i;
                d2 = d6;
            } else {
                d2 = d6 = oua.i;
            }
            d6 = d2 / hqa.ha;
            yDa_1.J(new xy(d3 - d6, d4 - (d7 /= hqa.ha), d5 - (d8 /= hqa.ha), d3 + d6, d4 + d7, d5 + d8));
        }
    }

    public boolean f(vL vL2) {
        YDa_1 b2 = vL2;
        YDa_1 a2 = this;
        if (b2 instanceof Sx) {
            return a2.J(gZ.J((Sx)((Sx)((Object)b2))), JPa.N);
        }
        return uSa.E != 0;
    }

    public void d() {
        YDa_1 a2;
        YDa_1 yDa_1 = a2;
        yDa_1.c = yDa_1.la;
        yDa_1.ba = yDa_1.Z;
        yDa_1.r = yDa_1.A;
        int n2 = yDa_1.A;
        yDa_1.A = n2 + vRa.d;
        if (n2 == ySa.T && !((Gg)a2.j).e) {
            a2.A = uSa.E;
            if (a2.J == false && !a2.l()) {
                YDa_1 yDa_12 = a2;
                yDa_12.k();
                yDa_12.e(null);
            }
        }
    }

    public boolean m() {
        return uSa.E != 0;
    }

    public void J() {
    }

    public void J(Waa waa2) {
        YDa_1 yDa_1;
        DZ dZ2;
        YDa_1 a2;
        YDa_1 b2 = waa2;
        YDa_1 yDa_12 = a2 = this;
        yDa_12.J = new XF(b2.J(cra.Q), b2.J(wPa.f), b2.J(APa.y));
        if (b2.J(EQa.Ka, zOa.v)) {
            dZ2 = DZ.getHorizontal(b2.J(EQa.Ka));
            YDa_1 yDa_13 = a2;
            yDa_1 = yDa_13;
            yDa_13.J = yDa_13.J.offset(dZ2);
        } else if (b2.J(STa.Q, zOa.v)) {
            dZ2 = DZ.getHorizontal(b2.J(STa.Q));
            yDa_1 = a2;
        } else {
            dZ2 = DZ.getHorizontal(b2.J(ySa.I));
            yDa_1 = a2;
        }
        yDa_1.J(dZ2);
    }

    public boolean E() {
        return vRa.d != 0;
    }

    public void f(double c2, double b2, double a2) {
        YDa_1 d2;
        if (!((Gg)d2.j).e && d2.J == false) {
            double d3 = c2;
            double d4 = b2;
            double d5 = a2;
            if (d3 * d3 + d4 * d4 + d5 * d5 > aSa.V) {
                YDa_1 yDa_1 = d2;
                yDa_1.k();
                yDa_1.e(null);
            }
        }
    }

    public abstract int f();

    public abstract int J();

    /*
     * WARNING - void declaration
     */
    public void l(double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        YDa_1 yDa_1;
        YDa_1 yDa_12 = yDa_1 = this;
        YDa_1 yDa_13 = yDa_1;
        yDa_1.la = c2;
        yDa_13.Z = b2;
        yDa_13.A = a2;
        Object d5 = yDa_12.J;
        YDa_1 yDa_14 = yDa_1;
        yDa_14.J = new XF((double)c2, (double)b2, (double)a2);
        if (!yDa_12.J.equals(d5)) {
            yDa_1.f();
            yDa_1.t = vRa.d;
        }
    }

    private double J(int n2) {
        int b2 = n2;
        YDa_1 a2 = this;
        if (b2 % fPa.i == 0) {
            return kTa.B;
        }
        return aSa.V;
    }

    public boolean l() {
        int a2;
        YDa_1 yDa_1;
        YDa_1 yDa_12 = yDa_1 = this;
        if (!yDa_1.j.J(yDa_12, yDa_12.J()).isEmpty()) {
            return uSa.E != 0;
        }
        int n2 = Math.max(vRa.d, yDa_1.f() / ERa.C);
        int n3 = Math.max(vRa.d, yDa_1.J() / ERa.C);
        YDa_1 yDa_13 = yDa_1;
        XF xF2 = yDa_1.J.offset(yDa_13.j.getOpposite());
        DZ dZ2 = yDa_13.j.rotateYCCW();
        int n4 = a2 = uSa.E;
        while (n4 < n2) {
            int n5 = uSa.E;
            while (n5 < n3) {
                int n6;
                Object object = xF2.offset(dZ2, a2).up(n6);
                if (!((Block)(object = yDa_1.j.J((XF)((Object)object)).J())).J().i() && !BlockRedstoneDiode.f((Block)object)) {
                    return uSa.E != 0;
                }
                n5 = ++n6;
            }
            n4 = ++a2;
        }
        YDa_1 yDa_14 = yDa_1;
        for (vL vL2 : yDa_1.j.f(yDa_14, yDa_14.J())) {
            if (!(vL2 instanceof YDa_1)) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public abstract void e(vL var1);

    public XF f() {
        YDa_1 a2;
        return a2.J;
    }

    public void f(Waa waa2) {
        YDa_1 b2 = waa2;
        YDa_1 a2 = this;
        YDa_1 yDa_1 = b2;
        yDa_1.J(STa.Q, (byte)a2.j.getHorizontalIndex());
        yDa_1.J(cra.Q, a2.f().getX());
        yDa_1.J(wPa.f, a2.f().getY());
        yDa_1.J(APa.y, a2.f().getZ());
    }

    public boolean J(gZ gZ2, float f2) {
        YDa_1 b2 = this;
        YDa_1 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (b2.J == false && !((Gg)b2.j).e) {
            YDa_1 yDa_1 = b2;
            yDa_1.k();
            yDa_1.i();
            yDa_1.e(c2.f());
        }
        return vRa.d != 0;
    }

    public YDa_1(Gg gg2) {
        YDa_1 a2;
        YDa_1 b2 = gg2;
        YDa_1 yDa_1 = a2 = this;
        super((Gg)b2);
        yDa_1.l(MQa.L, MQa.L);
    }

    public void J(double c2, double b2, double a2) {
        YDa_1 d2;
        if (!((Gg)d2.j).e && d2.J == false) {
            double d3 = c2;
            double d4 = b2;
            double d5 = a2;
            if (d3 * d3 + d4 * d4 + d5 * d5 > aSa.V) {
                YDa_1 yDa_1 = d2;
                yDa_1.k();
                yDa_1.e(null);
            }
        }
    }

    public void J(DZ dZ2) {
        YDa_1 a2;
        DZ b2 = dZ2;
        YDa_1 yDa_1 = a2 = this;
        Validate.notNull(b2);
        DZ dZ3 = b2;
        Validate.isTrue(dZ3.getAxis().isHorizontal());
        yDa_1.j = dZ3;
        yDa_1.s = yDa_1.X = (float)(a2.j.getHorizontalIndex() * Jsa.ha);
        a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public YDa_1(Gg gg2, XF xF2) {
        void b2;
        Object c2 = xF2;
        YDa_1 a2 = this;
        a2((Gg)b2);
        a2.J = c2;
    }

    public DZ J() {
        YDa_1 a2;
        return a2.j;
    }
}

