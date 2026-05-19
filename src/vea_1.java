/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ADa
 *  ERa
 *  Ffa
 *  Gg
 *  Lz
 *  MQa
 *  Mda
 *  NEa
 *  NTa
 *  QFa
 *  Qqa
 *  Qsa
 *  Rua
 *  SIa
 *  UZ
 *  WQa
 *  Waa
 *  XTa
 *  Yfa
 *  Zta
 *  bFa
 *  eAa
 *  gFa
 *  gZ
 *  gz
 *  hEa
 *  kPa
 *  kta
 *  nHa
 *  oHa
 *  pPa
 *  pQa
 *  pqa
 *  psa
 *  qDa
 *  uda
 *  vL
 *  vRa
 *  vea
 *  yQa
 *  yra
 *  ysa
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vea_1
extends hFa {
    private static final CEa j;
    private static final Set<Block> J;
    private static final UUID A;
    private boolean I;

    public void J(Waa waa2) {
        vea_1 vea_12;
        IBlockState iBlockState;
        vea_1 b2 = waa2;
        vea_1 a2 = this;
        vea_1 vea_13 = b2;
        super.J((Waa)vea_13);
        if (vea_13.J(yra.z, Yqa.i)) {
            iBlockState = Block.J(b2.J(yra.z)).J(b2.J(Qqa.A) & yQa.j);
            vea_12 = a2;
        } else {
            iBlockState = Block.f(b2.J(yra.z)).J(b2.J(Qqa.A) & yQa.j);
            vea_12 = a2;
        }
        vea_12.J(iBlockState);
    }

    public vea_1(Gg gg2) {
        vea_1 a2;
        vea_1 b2 = gg2;
        vea_1 vea_12 = a2 = this;
        super((Gg)b2);
        vea_12.l(Ora.D, hpa.j);
        vea_12.Ka = pqa.r;
        vea_12.D.J(uSa.E, (gFa)new oHa((Yfa)a2));
        vea_12.D.J(uqa.g, (gFa)new ADa((bga)a2, oua.i, uSa.E != 0));
        vea_12.D.J(XTa.W, (gFa)new HDa(a2, oua.i));
        vea_12.D.J(Yqa.i, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        vea_12.D.J(Yqa.i, (gFa)new SIa((Yfa)a2));
        vea_12.D.J(NTa.C, (gFa)new qDa((vea)a2));
        vea_12.D.J(pPa.f, (gFa)new Ffa((vea)a2));
        vea_12.L.J(vRa.d, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
        vea_1 vea_13 = a2;
        vea_13.L.J(uqa.g, (gFa)new FDa((vea)a2));
        vea_13.L.J(yRa.d, (gFa)new NEa((bga)a2, uda.class, NTa.C, vRa.d != 0, uSa.E != 0, (Predicate)new hEa((vea)a2)));
    }

    public eAa J() {
        return Gea.Uc;
    }

    static {
        A = UUID.fromString(Yua.i);
        j = new CEa(A, Rua.j, WQa.fa, uSa.E).J(uSa.E != 0);
        J = Sets.newIdentityHashSet();
        J.add(QFa.lf);
        J.add(QFa.Bc);
        J.add(QFa.R);
        J.add(QFa.Q);
        J.add(QFa.zc);
        J.add(QFa.l);
        J.add(QFa.vc);
        J.add(QFa.TC);
        J.add(QFa.Lc);
        J.add(QFa.dd);
        J.add(QFa.pd);
        J.add(QFa.s);
        J.add(QFa.HC);
        J.add(QFa.uB);
    }

    public float l() {
        return pQa.u;
    }

    public void r() {
        vea_1 vea_12 = this;
        if (vea_12.M()) {
            vea_12.J(gZ.f, pqa.r);
        }
        if (vea_12.ba() && !vea_12.I && vea_12.R.nextInt(ySa.T) == 0) {
            vea_12.k(uSa.E != 0);
        }
        if (vea_12.j.e()) {
            float f2;
            float a2 = vea_12.J(pqa.r);
            if (f2 > MQa.L && vea_12.j.j(new XF((vL)vea_12)) && vea_12.R.nextFloat() * NSa.B < (a2 - Xpa.R) * kta.v) {
                vea_12.C(null);
                vea_1 vea_13 = vea_12;
                vea_13.k(uSa.E != 0);
                vea_13.I = uSa.E;
                vea_13.v();
            }
        }
        super.r();
    }

    public void J(IBlockState iBlockState) {
        IBlockState b2 = iBlockState;
        vea_1 a2 = this;
        a2.aa.J(ERa.C, Short.valueOf((short)(Block.l(b2) & yQa.j)));
    }

    @Override
    public void y() {
        vea_1 vea_12 = this;
        if (((Gg)vea_12.j).e) {
            int a2;
            int n2 = a2 = uSa.E;
            while (n2 < uqa.g) {
                int n3 = 5 >> 2;
                vea_12.j.J(UZ.PORTAL, vea_12.la + (vea_12.R.nextDouble() - kTa.B) * (double)vea_12.F, vea_12.Z + vea_12.R.nextDouble() * (double)vea_12.u - VPa.W, (double)(vea_12.A + (vea_12.R.nextDouble() - kTa.B) * (double)vea_12.F), (vea_12.R.nextDouble() - kTa.B) * KPa.y, -vea_12.R.nextDouble(), (vea_12.R.nextDouble() - kTa.B) * KPa.y, new int[uSa.E]);
                n2 = ++a2;
            }
        }
        vea_12.ja = uSa.E;
        super.y();
    }

    /*
     * WARNING - void declaration
     */
    public void f(Waa waa2) {
        void a2;
        vea_1 vea_12;
        vea_1 vea_13 = vea_12 = this;
        super.f((Waa)a2);
        IBlockState b2 = vea_13.J();
        void v1 = a2;
        v1.J(yra.z, (short)Block.J(b2.J()));
        v1.J(Qqa.A, (short)b2.J().f(b2));
    }

    @Override
    public String f() {
        return oQa.u;
    }

    public IBlockState J() {
        vea_1 a2;
        return Block.f(a2.aa.J(ERa.C) & yQa.j);
    }

    public boolean ba() {
        vea_1 a2;
        if (a2.aa.J(yOa.B) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String A() {
        vea_1 a2;
        if (a2.ba()) {
            return WPa.v;
        }
        return kPa.H;
    }

    @Override
    public void s() {
        vea_1 a2;
        vea_1 vea_12 = a2;
        super.s();
        vea_12.J(Kha.M).J(ITa.a);
        vea_12.J(Kha.j).J(osa.b);
        vea_12.J(Kha.A).J(hpa.y);
        vea_12.J(Kha.I).J(ypa.X);
    }

    public boolean d(vL vL2) {
        vea_1 b2 = vL2;
        vea_1 a2 = this;
        b2 = new Lz(a2.la - ((vL)b2).la, a2.J().j + (double)(a2.u / kta.v) - ((vL)b2).Z + (double)b2.l(), (double)(a2.A - ((vL)b2).A));
        b2 = b2.J();
        Object object = Zta.ba;
        vea_1 vea_12 = a2;
        double d2 = vea_12.la + (a2.R.nextDouble() - kTa.B) * Wqa.Z - ((Lz)b2).A * object;
        vea_1 vea_13 = a2;
        double d3 = vea_12.Z + (double)(vea_13.R.nextInt(ERa.C) - Yqa.i) - ((Lz)b2).j * object;
        object = vea_13.A + (a2.R.nextDouble() - kTa.B) * Wqa.Z - ((Lz)b2).J * object;
        return vea_12.C(d2, d3, (double)object);
    }

    public static /* synthetic */ CEa J() {
        return j;
    }

    private boolean C(Sx sx2) {
        Sx b2 = sx2;
        vea_1 a2 = this;
        Mda mda2 = b2.K.A[yRa.d];
        if (mda2 != null && mda2.J() == eAa.J((Block)QFa.s)) {
            return uSa.E != 0;
        }
        mda2 = b2.J(pqa.r).J();
        Lz lz2 = new Lz(a2.la - b2.la, a2.J().j + (double)(a2.u / kta.v) - (b2.Z + (double)b2.l()), (double)(a2.A - b2.A));
        double d2 = lz2.J();
        if (mda2.f(lz2 = lz2.J()) > oua.i - psa.k / d2) {
            return b2.l((vL)a2);
        }
        return uSa.E != 0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean J(gZ var1_1, float var2_2) {
        block8: {
            b = this;
            c = var1_1;
            if (b.J((gZ)c)) {
                return (boolean)uSa.E;
            }
            if (c.f() != null && c.f() instanceof uda) break block8;
            if (!b.j.e) {
                b.k((boolean)vRa.d);
            }
            if (!(c instanceof GX) || !(c.f() instanceof Sx)) ** GOTO lbl14
            if (c.f() instanceof bFa && ((bFa)c.f()).s.f()) {
                v0 = c;
                b.k((boolean)uSa.E);
            } else {
                b.I = vRa.d;
lbl14:
                // 2 sources

                v0 = c;
            }
            if (v0 instanceof gz) {
                b.I = uSa.E;
                v1 = var3_3 = uSa.E;
                while (v1 < ysa.s) {
                    if (b.v()) {
                        return (boolean)vRa.d;
                    }
                    v1 = ++var3_3;
                }
                return (boolean)uSa.E;
            }
        }
        var3_4 = super.J((gZ)c, (float)a);
        if (c.d() && b.R.nextInt(NTa.C) != 0) {
            b.v();
        }
        return var3_4;
    }

    public void J(boolean bl, int n2) {
        int c2 = n2;
        vea_1 a2 = this;
        eAa b2 = a2.J();
        if (b2 != null) {
            int n3;
            c2 = a2.R.nextInt(uqa.g + c2);
            int n4 = n3 = uSa.E;
            while (n4 < c2) {
                a2.J(b2, vRa.d);
                n4 = ++n3;
            }
        }
    }

    public void k(boolean bl) {
        boolean b2 = bl;
        vea_1 a2 = this;
        a2.aa.J(yOa.B, Byte.valueOf((byte)(b2 ? vRa.d : uSa.E)));
    }

    public static /* synthetic */ boolean J(vea vea2, boolean bl) {
        boolean b2 = bl;
        vea a2 = vea2;
        a2.I = b2;
        return a2.I;
    }

    public void J() {
        vea_1 a2;
        vea_1 vea_12 = a2;
        super.J();
        vea_12.aa.f(ERa.C, new Short((short)uSa.E));
        vea_12.aa.f(yta.Ka, new Byte((byte)uSa.E));
        vea_12.aa.f(yOa.B, new Byte((byte)uSa.E));
    }

    public boolean C(double d2, double d3, double d4) {
        int n2;
        double a2;
        double b2;
        double c222;
        vea_1 vea_12;
        vea_1 vea_13 = vea_12 = this;
        double d5 = vea_13.la;
        double d6 = vea_13.Z;
        UUID uUID = vea_13.A;
        vea_13.la = c222;
        vea_13.Z = b2;
        vea_13.A = a2;
        int n3 = uSa.E;
        XF xF = new XF(vea_12.la, vea_12.Z, (double)vea_12.A);
        if (vea_13.j.F(xF)) {
            int d7 = uSa.E;
            while (d7 == 0 && xF.getY() > 0) {
                XF xF2 = xF.down();
                Block c222 = vea_12.j.J(xF2).J();
                if (c222.J().f()) {
                    d7 = vRa.d;
                    continue;
                }
                vea_12.Z -= oua.i;
                xF = xF2;
            }
            if (d7 != 0) {
                vea_1 vea_14 = vea_12;
                vea_1 vea_15 = vea_12;
                super.C(vea_14.la, vea_15.Z, (double)vea_12.A);
                vea_1 vea_16 = vea_12;
                if (vea_14.j.J((vL)vea_16, vea_16.J()).isEmpty() && !vea_12.j.C(vea_12.J())) {
                    n3 = vRa.d;
                }
            }
        }
        if (n3 == 0) {
            vea_12.l(d5, d6, (double)uUID);
            return uSa.E != 0;
        }
        int d7 = XOa.h;
        int n4 = n2 = uSa.E;
        while (n4 < d7) {
            c222 = (double)n2 / ((double)d7 - oua.i);
            vea_1 vea_17 = vea_12;
            float f2 = (vea_17.R.nextFloat() - MQa.L) * psa.N;
            float f3 = (vea_17.R.nextFloat() - MQa.L) * psa.N;
            float f4 = (vea_17.R.nextFloat() - MQa.L) * psa.N;
            double d8 = d5;
            b2 = d8 + (vea_12.la - d8) * c222 + (vea_12.R.nextDouble() - kTa.B) * (double)vea_12.F * KPa.y;
            double d9 = d6;
            a2 = d9 + (vea_12.Z - d9) * c222 + vea_12.R.nextDouble() * (double)vea_12.u;
            UUID uUID2 = uUID;
            reference var18_18 = uUID2 + (vea_12.A - uUID2) * c222 + (vea_12.R.nextDouble() - kTa.B) * (double)vea_12.F * KPa.y;
            int n5 = 3 >> 1;
            vea_17.j.J(UZ.PORTAL, b2, a2, (double)var18_18, f2, f3, f4, new int[uSa.E]);
            n4 = ++n2;
        }
        vea_1 vea_18 = vea_12;
        vea_18.j.J(d5, d6, (double)uUID, SPa.W, pqa.r, pqa.r);
        vea_18.J(SPa.W, pqa.r, pqa.r);
        return vRa.d != 0;
    }

    public static /* synthetic */ Set J() {
        return J;
    }

    @Override
    public String i() {
        return tTa.q;
    }

    public boolean v() {
        vea_1 a2;
        vea_1 vea_12 = a2;
        double d2 = vea_12.la + (a2.R.nextDouble() - kTa.B) * ypa.X;
        vea_1 vea_13 = a2;
        double d3 = vea_12.Z + (double)(vea_13.R.nextInt(ysa.s) - fPa.i);
        reference var5_3 = vea_13.A + (a2.R.nextDouble() - kTa.B) * ypa.X;
        return vea_12.C(d2, d3, (double)var5_3);
    }

    public static /* synthetic */ boolean J(vea vea2, Sx sx2) {
        Object b2 = sx2;
        vea a2 = vea2;
        return super.C((Sx)((Object)b2));
    }
}

