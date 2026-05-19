/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  HA
 *  JPa
 *  QFa
 *  Rda
 *  Sqa
 *  Vea
 *  Waa
 *  aSa
 *  eAa
 *  gZ
 *  jC
 *  jFa
 *  kea
 *  mra
 *  pua
 *  qX
 *  sda
 *  vL
 *  vRa
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Cfa_2
extends Vea
implements jC {
    private boolean j;
    private XF J;
    private int A;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void a2;
        void var1_3;
        void e2 = var1_3;
        Cfa_2 d2 = this;
        int n5 = e2 = a2 == false ? vRa.d : uSa.E;
        if (e2 != d2.U()) {
            d2.D(e2 != 0);
        }
    }

    public double f() {
        Cfa_2 a2;
        return a2.Z + kTa.B;
    }

    public void J(Waa waa2) {
        Cfa_2 b2 = waa2;
        Cfa_2 a2 = this;
        super.J((Waa)b2);
        a2.A = b2.J(Sqa.F);
    }

    public int k() {
        return vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public Cfa_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        Cfa_2 e2 = gg2;
        Cfa_2 d5 = this;
        super((Gg)e2, (double)c2, (double)b2, (double)a2);
        d5.j = vRa.d;
        d5.A = pua.o;
        d5.J = XF.ORIGIN;
    }

    public void D(int n2) {
        int b2 = n2;
        Cfa_2 a2 = this;
        a2.A = b2;
    }

    public double J() {
        Cfa_2 a2;
        return a2.A;
    }

    public void D(boolean bl) {
        boolean b2 = bl;
        Cfa_2 a2 = this;
        a2.j = b2;
    }

    public boolean U() {
        Cfa_2 a2;
        return a2.j;
    }

    public boolean l(Sx sx2) {
        Sx b2 = sx2;
        Cfa_2 a2 = this;
        if (!a2.j.e) {
            b2.J((HA)a2);
        }
        return vRa.d != 0;
    }

    public boolean P() {
        Object object = this;
        if (qX.J((jC)object)) {
            return vRa.d != 0;
        }
        List a2 = object.j.J(jFa.class, object.J().f(VPa.W, aSa.V, VPa.W), Kaa.j);
        if (a2.size() > 0) {
            qX.J((HA)object, (jFa)((jFa)a2.get(uSa.E)));
        }
        return uSa.E != 0;
    }

    public IBlockState f() {
        return QFa.la.J();
    }

    /*
     * WARNING - void declaration
     */
    public Ega J(kea kea2, Sx sx2) {
        void b2;
        Object c2 = sx2;
        Cfa_2 a2 = this;
        return new sda((kea)b2, (HA)a2, (Sx)((Object)c2));
    }

    public Gg f() {
        Cfa_2 a2;
        return a2.j;
    }

    public void d() {
        Cfa_2 a2;
        Cfa_2 cfa_2 = a2;
        super.d();
        if (!cfa_2.j.e && a2.K() && a2.U()) {
            Cfa_2 cfa_22;
            if (new XF((vL)a2).equals((Object)a2.J)) {
                Cfa_2 cfa_23 = a2;
                cfa_22 = cfa_23;
                cfa_23.A -= vRa.d;
            } else {
                Cfa_2 cfa_24 = a2;
                cfa_22 = cfa_24;
                cfa_24.D(uSa.E);
            }
            if (!cfa_22.s()) {
                Cfa_2 cfa_25 = a2;
                cfa_25.D(uSa.E);
                if (cfa_25.P()) {
                    Cfa_2 cfa_26 = a2;
                    cfa_26.D(AQa.P);
                    cfa_26.f();
                }
            }
        }
    }

    public Cfa_2(Gg gg2) {
        Cfa_2 b2 = gg2;
        Cfa_2 a2 = this;
        super((Gg)b2);
        a2.j = vRa.d;
        a2.A = pua.o;
        a2.J = XF.ORIGIN;
    }

    public String f() {
        return mra.Q;
    }

    public Rda J() {
        return Rda.HOPPER;
    }

    public void J(gZ gZ2) {
        Cfa_2 a2;
        Cfa_2 b2 = gZ2;
        Cfa_2 cfa_2 = a2 = this;
        super.J((gZ)b2);
        if (cfa_2.j.J().f(qQa.y)) {
            a2.J(eAa.J((Block)QFa.la), vRa.d, JPa.N);
        }
    }

    public int f() {
        return tTa.h;
    }

    public double l() {
        Cfa_2 a2;
        return a2.la;
    }

    public boolean s() {
        Cfa_2 a2;
        if (a2.A > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(Waa waa2) {
        Cfa_2 b2 = waa2;
        Cfa_2 a2 = this;
        Cfa_2 cfa_2 = b2;
        super.f((Waa)cfa_2);
        cfa_2.J(Sqa.F, a2.A);
    }
}

