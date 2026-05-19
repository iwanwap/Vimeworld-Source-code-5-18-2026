/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BOa
 *  Baa
 *  CY
 *  Cf
 *  DNa
 *  Dha
 *  EOa
 *  ERa
 *  Eoa
 *  Faa
 *  Gg
 *  Kpa
 *  Lra
 *  MQa
 *  Mda
 *  NTa
 *  PNa
 *  PTa
 *  QFa
 *  RIa
 *  SF
 *  UZ
 *  VMa
 *  WW
 *  Waa
 *  XB
 *  Yea
 *  Ypa
 *  aPa
 *  aSa
 *  bqa
 *  dQa
 *  eE
 *  gda
 *  hNa
 *  hd
 *  hra
 *  iMa
 *  ld
 *  mZ
 *  oMa
 *  qca
 *  ska
 *  vL
 *  vQa
 *  vRa
 *  vU
 *  vf
 *  ysa
 */
import com.google.common.collect.Sets;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Eoa_3
extends Gg {
    private boolean E;
    private final Set C;
    private final Set i;
    private Cf M;
    private iMa k;
    private static final String j = "CL_00000882";
    private final Set J;
    private oMa A;
    private final Kpa I;

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, String string, float f2, float f3, boolean bl) {
        void a2;
        void b2;
        void c2;
        Object h2;
        void e2;
        void f4;
        double g2;
        Eoa_3 eoa_3 = object;
        Object object = string;
        Eoa_3 d5 = eoa_3;
        double d6 = d5.I.J().f(g2, (double)f4, (double)e2);
        h2 = new PNa(new ResourceLocation((String)h2), (float)c2, (float)b2, (float)g2, (float)f4, (float)e2);
        if (a2 != false && d6 > fqa.W) {
            g2 = Math.sqrt(d6) / ITa.a;
            d5.I.J().J((X)h2, (int)(g2 * vQa.c));
            return;
        }
        d5.I.J().J((X)h2);
    }

    public void e() {
        int n2;
        Eoa_3 eoa_3;
        Eoa_3 eoa_32 = eoa_3 = this;
        super.e();
        eoa_32.J(eoa_32.l() + dQa.Ga);
        if (eoa_32.J().f(PTa.Ka)) {
            Eoa_3 eoa_33 = eoa_3;
            eoa_33.f(eoa_33.f() + dQa.Ga);
        }
        eoa_3.H.J(gQa.j);
        int n3 = n2 = uSa.E;
        while (n3 < NTa.C && !eoa_3.J.isEmpty()) {
            Eoa_3 a2 = (vL)eoa_3.J.iterator().next();
            Eoa_3 eoa_34 = eoa_3;
            eoa_34.J.remove((Object)a2);
            if (!eoa_34.Q.contains((Object)a2)) {
                eoa_3.f((vL)a2);
            }
            n3 = ++n2;
        }
        Eoa_3 eoa_35 = eoa_3;
        eoa_35.H.f(Lra.Aa);
        eoa_35.A.J();
        Eoa_3 eoa_36 = eoa_3;
        eoa_36.H.f(lTa.A);
        eoa_36.l();
        eoa_36.H.f();
    }

    public boolean f(vL vL2) {
        Eoa_3 a2;
        Eoa_3 b2 = vL2;
        Eoa_3 eoa_3 = a2 = this;
        boolean bl = super.f((vL)b2);
        eoa_3.i.add(b2);
        if (!bl) {
            a2.J.add(b2);
            return bl;
        }
        if (b2 instanceof Yea) {
            a2.I.J().J((X)new hNa((Yea)b2));
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, IBlockState iBlockState, int n2) {
        void a2;
        void b2;
        Object d22 = xF2;
        Eoa_3 c2 = this;
        c2.E = c2.M();
        boolean d22 = super.J((XF)((Object)d22), (IBlockState)b2, (int)a2);
        c2.E = uSa.E;
        return d22;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, int n2) {
        void b2;
        int c2 = n2;
        Eoa_3 a2 = this;
        c2 = super.J((XF)b2, c2);
        if (Config.J()) {
            c2 = vf.J((XF)b2, (int)c2);
        }
        return c2;
    }

    public int e() {
        Eoa_3 a2;
        return a2.I.z.kc;
    }

    public void D() {
        Eoa_3 a2;
        a2.k.J().J((ld)new CY(opa.k));
    }

    public void C(vL vL2) {
        Eoa_3 a2;
        Eoa_3 b2 = vL2;
        Eoa_3 eoa_3 = a2 = this;
        super.C((vL)b2);
        eoa_3.i.remove((Object)b2);
    }

    public static /* synthetic */ Set f(Eoa a2) {
        return a2.i;
    }

    public Dha J(RIa rIa2) {
        Eoa_3 b2 = rIa2;
        Eoa_3 a2 = this;
        Dha dha = super.J((RIa)b2);
        dha.J(WPa.la, (Callable)new EOa((Eoa)a2));
        dha.J(aPa.W, (Callable)new LOa((Eoa)a2));
        dha.J(bqa.m, (Callable)new VMa((Eoa)a2));
        dha.J(nua.O, (Callable)new BOa((Eoa)a2));
        return dha;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(XF xF2, IBlockState iBlockState) {
        void a2;
        void b2;
        Eoa_3 eoa_3 = this;
        void v0 = b2;
        int n2 = v0.getX();
        int c2 = v0.getY();
        int n3 = v0.getZ();
        Eoa_3 eoa_32 = eoa_3;
        int n4 = n2;
        eoa_32.f(n4, c2, n3, n4, c2, n3);
        return super.J((XF)b2, (IBlockState)a2, yRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public Eoa_3(iMa iMa2, mZ mZ2, int n2, sZ sZ2, gda gda2) {
        void b2;
        void a2;
        void c2;
        void d2;
        Eoa_3 e2;
        Eoa_3 f2 = iMa2;
        Eoa_3 eoa_3 = e2 = this;
        Eoa_3 eoa_32 = e2;
        super((XB)new qW(), new vU((mZ)d2, SPa.Y), Ty.J((int)c2), (gda)a2, vRa.d != 0);
        eoa_32.i = Sets.newHashSet();
        e2.J = Sets.newHashSet();
        e2.I = Kpa.J();
        e2.C = Sets.newHashSet();
        e2.M = new Cf(uSa.E, uSa.E, uSa.E, yRa.d);
        e2.E = uSa.E;
        eoa_3.k = f2;
        e2.J().J((sZ)b2);
        eoa_3.F.J(e2);
        eoa_3.J(new XF(Yqa.i, ysa.s, Yqa.i));
        eoa_3.p = eoa_3.J();
        eoa_3.i = new WW();
        eoa_3.J();
        eoa_3.A();
        if (eoa_3.I.L != null && e2.I.L.getClass() == SF.class) {
            e2.I.L = new eE(e2.I, (iMa)f2);
        }
    }

    public void f(long a2) {
        Eoa_3 eoa_3;
        Eoa_3 b2;
        if (a2 < nqa.i) {
            a2 = -a2;
            Eoa_3 eoa_32 = b2;
            eoa_3 = eoa_32;
            eoa_32.J().J(PTa.Ka, MRa.E);
        } else {
            Eoa_3 eoa_33 = b2;
            eoa_3 = eoa_33;
            eoa_33.J().J(PTa.Ka, oQa.l);
        }
        super.f(a2);
    }

    public void J(vL vL2) {
        Eoa_3 a2;
        Eoa_3 b2 = vL2;
        Eoa_3 eoa_3 = a2 = this;
        super.J((vL)b2);
        if (eoa_3.J.contains((Object)b2)) {
            a2.J.remove((Object)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, String string, float f2, float f3, boolean bl) {
        void a2;
        void b2;
        void c2;
        void d2;
        Object f4 = xF2;
        Eoa_3 e2 = this;
        e2.J((double)f4.getX() + kTa.B, (double)f4.getY() + kTa.B, (double)f4.getZ() + kTa.B, (String)d2, (float)c2, (float)b2, (boolean)a2);
    }

    private boolean M() {
        Eoa_3 a2;
        if (a2.I.L instanceof eE) {
            return ((eE)a2.I.L).D();
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ Kpa J(Eoa a2) {
        return a2.I;
    }

    public void f() {
    }

    public void l() {
        Eoa_3 eoa_3;
        Eoa_3 eoa_32 = eoa_3 = this;
        super.l();
        Eoa_3 eoa_33 = eoa_3;
        eoa_32.C.retainAll(eoa_33.b);
        if (eoa_33.C.size() == eoa_3.b.size()) {
            eoa_3.C.clear();
        }
        int n2 = uSa.E;
        for (Eoa_3 a2 : eoa_3.b) {
            if (eoa_3.C.contains((Object)a2)) continue;
            Eoa_3 eoa_34 = a2;
            int n3 = ((Baa)eoa_34).j * ERa.C;
            int n4 = ((Baa)eoa_34).A * ERa.C;
            Eoa_3 eoa_35 = eoa_3;
            eoa_3.H.J(rua.Q);
            Faa faa2 = eoa_35.J(((Baa)a2).j, ((Baa)a2).A);
            eoa_35.J(n3, n4, faa2);
            eoa_35.H.f();
            eoa_35.C.add(a2);
            if (++n2 < NTa.C) continue;
            return;
        }
    }

    public void f(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7;
        Eoa_3 a2 = this;
    }

    public vL f(int n2) {
        int b22 = n2;
        Eoa_3 a2 = this;
        vL b22 = (vL)a2.f.f(b22);
        if (b22 != null) {
            a2.i.remove(b22);
            a2.C(b22);
        }
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) {
        int n5;
        Eoa_3 eoa_3 = this;
        int d2 = ERa.C;
        Random random = new Random();
        Eoa_3 eoa_32 = eoa_3;
        Mda mda2 = eoa_32.I.c.J();
        int n6 = eoa_32.I.L.J() == Daa.CREATIVE && mda2 != null && Block.J(mda2.J()) == QFa.fE ? vRa.d : uSa.E;
        mda2 = eoa_3.M;
        int n7 = n5 = uSa.E;
        while (n7 < PRa.U) {
            void a2;
            void b2;
            void c2;
            void var9_10 = c2 + eoa_3.v.nextInt(d2) - eoa_3.v.nextInt(d2);
            void var10_11 = b2 + eoa_3.v.nextInt(d2) - eoa_3.v.nextInt(d2);
            void var11_12 = a2 + eoa_3.v.nextInt(d2) - eoa_3.v.nextInt(d2);
            Mda mda3 = mda2;
            mda3.setXyz((int)var9_10, (int)var10_11, (int)var11_12);
            IBlockState iBlockState = eoa_3.J((XF)mda3);
            iBlockState.J().l(eoa_3, (XF)mda2, iBlockState, random);
            if (n6 != 0 && iBlockState.J() == QFa.fE) {
                eoa_3.J(UZ.BARRIER, (float)var9_10 + MQa.L, (float)var10_11 + MQa.L, (float)var11_12 + MQa.L, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
            }
            n7 = ++n5;
        }
    }

    public static /* synthetic */ Set J(Eoa a2) {
        return a2.J;
    }

    public vL J(int n2) {
        int b2 = n2;
        Eoa_3 a2 = this;
        if (b2 == a2.I.c.M()) {
            return a2.I.c;
        }
        return super.J(b2);
    }

    public void d(vL vL2) {
        Eoa_3 a2;
        Eoa_3 b2 = vL2;
        Eoa_3 eoa_3 = a2 = this;
        super.d((vL)b2);
        if (eoa_3.i.contains((Object)b2)) {
            if (b2.K()) {
                a2.J.add(b2);
                return;
            }
            a2.i.remove((Object)b2);
        }
    }

    public void J(qca qca2) {
        Eoa_3 b2 = qca2;
        Eoa_3 a2 = this;
        a2.x = b2;
    }

    public void k() {
        int n2;
        int n3;
        Eoa_3 a2;
        Eoa_3 eoa_3;
        Eoa_3 eoa_32 = eoa_3 = this;
        eoa_32.Q.removeAll(eoa_32.t);
        int n4 = uSa.E;
        int n5 = n4;
        while (n5 < eoa_3.t.size()) {
            a2 = (vL)eoa_3.t.get(n4);
            n3 = ((vL)a2).N;
            n2 = ((vL)a2).L;
            if (((vL)a2).T && eoa_3.J(n3, n2, vRa.d != 0)) {
                eoa_3.J(n3, n2).J((vL)a2);
            }
            n5 = ++n4;
        }
        int n6 = n4 = uSa.E;
        while (n6 < eoa_3.t.size()) {
            Eoa_3 eoa_33 = eoa_3;
            eoa_33.d((vL)eoa_33.t.get(n4++));
            n6 = n4;
        }
        eoa_3.t.clear();
        int n7 = n4 = uSa.E;
        while (n7 < eoa_3.Q.size()) {
            block10: {
                block9: {
                    a2 = (vL)eoa_3.Q.get(n4);
                    if (((vL)a2).ja == null) break block9;
                    if (!((vL)a2).ja.J && ((vL)a2).ja.Aa == a2) break block10;
                    ((vL)a2).ja.Aa = null;
                    ((vL)a2).ja = null;
                }
                if (((vL)a2).J) {
                    Eoa_3 eoa_34 = a2;
                    n3 = ((vL)eoa_34).N;
                    n2 = ((vL)eoa_34).L;
                    if (((vL)eoa_34).T && eoa_3.J(n3, n2, vRa.d != 0)) {
                        eoa_3.J(n3, n2).J((vL)a2);
                    }
                    eoa_3.Q.remove(n4);
                    --n4;
                    eoa_3.d((vL)a2);
                }
            }
            n7 = ++n4;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, vL vL2) {
        void b2;
        Eoa_3 c2 = vL2;
        Eoa_3 a2 = this;
        vL vL3 = a2.J((int)b2);
        if (vL3 != null) {
            a2.C(vL3);
        }
        Eoa_3 eoa_3 = a2;
        Eoa_3 eoa_32 = c2;
        eoa_3.i.add(c2);
        eoa_32.l((int)b2);
        if (!eoa_3.f((vL)eoa_32)) {
            a2.J.add(c2);
        }
        Eoa_3 eoa_33 = a2;
        eoa_33.f.J((int)b2, c2);
        if (eoa_33.I.Ta == a2) {
            OT.i.f.J((int)b2);
        }
    }

    public hd J() {
        Eoa_3 a2;
        a2.A = new oMa((Gg)a2);
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, boolean bl) {
        void c2;
        void v0;
        void a2;
        int d2 = n3;
        Eoa_3 b2 = this;
        if (a2 != false) {
            v0 = a2;
            b2.A.f((int)c2, d2);
        } else {
            b2.A.J((int)c2, d2);
            v0 = a2;
        }
        if (v0 == false) {
            b2.J((int)(c2 * ERa.C), uSa.E, d2 * ERa.C, (int)(c2 * ERa.C + Ypa.A), hra.Ja, d2 * ERa.C + Ypa.A);
        }
    }

    public boolean J() {
        Eoa_3 a2;
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, double d5, double d6, double d7, Waa waa2) {
        Eoa_3 h2;
        void b2;
        void c2;
        void d8;
        void e2;
        void f2;
        void g2;
        Eoa_3 eoa_3 = eoa_32;
        Eoa_3 eoa_32 = waa2;
        Eoa_3 a2 = eoa_3;
        a2.I.f.J((ska)new DNa((Gg)a2, (double)g2, (double)f2, (double)e2, (double)d8, (double)c2, (double)b2, a2.I.f, (Waa)h2));
    }
}

