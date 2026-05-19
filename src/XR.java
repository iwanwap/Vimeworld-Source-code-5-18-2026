/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  CV
 *  Cra
 *  ERa
 *  FPa
 *  Fpa
 *  JPa
 *  Kd
 *  Ke
 *  Kh
 *  Kpa
 *  Mda
 *  Oqa
 *  Qsa
 *  TU
 *  UG
 *  XS
 *  Xr
 *  Xt
 *  aPa
 *  aSa
 *  ad
 *  asa
 *  cI
 *  cka
 *  eAa
 *  eS
 *  iS
 *  if
 *  jsa
 *  kta
 *  lqa
 *  pqa
 *  qta
 *  rt
 *  sB
 *  su
 *  uKa
 *  uf
 *  ui
 *  ura
 *  vB
 *  vQa
 *  vRa
 *  yu
 *  zU
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import net.xtrafrancyz.mods.minidot.items.impl.ImageArrowTrail;
import org.lwjgl.input.Mouse;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XR
extends vB {
    private final jU l;
    private int e;
    private MiniDotItem G;
    private static final int D = 5;
    private final DT f;
    private int F;
    private int g;
    private final vC L;
    private int E;
    private final List<lt> m;
    private static final MDConfiguration C;
    private MiniDotEmote i;
    private final eF M;
    private uf k;
    public static final List<Mda[]> j;
    private boolean J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public XR(Ke ke) {
        int b2;
        void a2;
        XR xR2;
        XR xR3 = xR2 = this;
        XR xR4 = xR2;
        super(uSa.E, uSa.E, ERa.o, PRa.U, (Ke)a2, null, null);
        XR xR5 = xR2;
        xR2.L = new vC();
        xR5.M = new eF(uSa.E, uSa.E, Oqa.ROW, lqa.s, uSa.E != 0);
        xR2.g = uSa.E;
        xR2.e = uSa.E;
        xR2.E = uSa.E;
        xR2.F = uSa.E;
        xR2.I = uSa.E;
        xR2.A = uSa.E;
        xR4.J = uSa.E;
        xR3.i = null;
        xR4.m = new ArrayList<lt>();
        xR3.l = zU.M.J(iS.MINIDOT_GUI);
        int n2 = b2 = uSa.E;
        while (n2 < tTa.h) {
            xR2.M.f((ad)new Xt(b2++, (Ke)a2, xR2));
            n2 = b2;
        }
        xR2.L.e(jsa.Ka);
        xR2.L.J(jsa.Ka);
        xR2.f = new DT(xR2, (Ke)a2);
    }

    public int J() {
        return C.J();
    }

    public void J(int n2) {
        int b22 = n2;
        XR a2 = this;
        if (a2.J() == b22) {
            return;
        }
        Xt xt = (Xt)a2.M.f().get(a2.J());
        if (xt != null) {
            xt.f(uSa.E != 0);
        }
        C.J(b22);
        Xt b22 = (Xt)a2.M.f().get(b22);
        if (b22 != null) {
            b22.f(vRa.d != 0);
        }
        if (mx.J() == null) {
            return;
        }
        if (mx.J().J() == null) {
            return;
        }
        mx.J().J().f().stream().filter(su.J()).forEach(XS.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        XR a2 = this;
        if (a2.M.f()) {
            a2.M.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        if (a2.f.f()) {
            a2.f.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        a2.J = e2;
        if (e2 != false) {
            XR xR2 = a2;
            XR xR3 = a2;
            xR3.E = xR3.g;
            xR3.F = xR3.e;
            xR2.I = d2;
            xR2.A = c2 / uqa.g;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        XR a2 = this;
        if (a2.k <= aSa.V || a2.j <= aSa.V) {
            return;
        }
        if (a2.k == null) {
            XR xR2 = a2;
            xR2.k = new uf((Sx)Kpa.J().c);
        }
        XR xR3 = a2;
        super.f((int)b2, c2);
        TU tU = ((mx)xR3.I).J();
        if (tU == TU.ARROWS) {
            a2.C((int)b2, c2);
            return;
        }
        if (tU == TU.ARMOR) {
            Kpa.J().c.K.A = j.get((int)(OT.e / asa.fa % (long)j.size()));
        }
        a2.l((int)b2, c2);
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        XR a2 = this;
        a2.J = b2;
    }

    public MiniDotEmote J() {
        XR a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(XR xR2, int n2, int n3, int n4) {
        void a2;
        void c2;
        int d2 = n3;
        XR b2 = xR2;
        if (b2.i == null) {
            XR xR3 = b2;
            vb.J(xR3.g, xR3.e, Math.max(aPa.o, (int)c2), Math.max(d2, (int)a2), d2, qta.D, APa.D);
            return;
        }
        if (b2.k.J() != b2.i) {
            XR xR4 = b2;
            xR4.k.J(xR4.i, null);
        }
        XR xR5 = b2;
        xR5.k.J((float)xR5.g, (float)b2.e, (double)Math.max(aPa.o, (int)c2), (double)Math.max(d2, (int)a2), qta.D, APa.D, d2, JPa.N, vRa.d != 0);
    }

    public static /* synthetic */ boolean J(ad a2) {
        return a2 instanceof vS;
    }

    public static /* synthetic */ void J(XR a2) {
        if.C((double)a2.I, (double)((int)(a2.J ? 1 : 0) + Fpa.ca), (double)((int)(a2.k - (a2.k >= sra.Ga ? a2.M.l() + Wqa.m : aSa.V))), (double)((int)a2.j), (Color)Bc.Ba, (Kd)Kd.XL_X2);
    }

    private void C(int n2, int n3) {
        int n4;
        XR xR2;
        XR xR3 = xR2 = this;
        xR2.L.J();
        float b2 = xR3.I + xR2.k / KPa.y;
        float a2 = xR3.J + xR2.j / FPa.T;
        if (xR3.f() && (n4 = Mouse.getDWheel()) != 0 && ((mx)xR2.I).J() == null) {
            double d2 = xR2.L.d() + (double)(n4 > 0 ? FRa.Ga : Cra.fa);
            xR2.L.f(Math.max(rua.y, Math.min(sra.M, d2)), tpa.k, sB.x);
        }
        uKa.K();
        XR xR4 = xR2;
        float f2 = xR4.L.J() / vua.ha * vQa.q;
        MiniDotItem miniDotItem = xR4.l.J(eS.ARROW);
        if (miniDotItem != null) {
            Iterator<lt> iterator;
            if (miniDotItem != xR2.G) {
                xR2.m.clear();
                xR2.G = miniDotItem;
            }
            UG uG = ((ImageArrowTrail)miniDotItem.model).J();
            float f3 = CV.M;
            Iterator<lt> iterator2 = iterator = xR2.m.iterator();
            while (iterator2.hasNext()) {
                Object c22 = iterator.next();
                ui ui2 = uG.J(((lt)c22).C);
                iterator2 = iterator;
                uKa.C((int)ui2.I);
                Object object = c22;
                float f4 = ((lt)c22).M + (((lt)c22).j - ((lt)object).M) * f3;
                Object object2 = c22;
                float c22 = ((lt)object).i + (((lt)object2).J - ((lt)object2).i) * f3;
                ui ui3 = ui2;
                ui ui4 = ui2;
                Kh.J((float)(b2 + (f4 *= QTa.G)), (float)(a2 + (c22 *= QTa.G) - SPa.b * f2 / kta.v), (float)(SPa.b * f2), (float)(SPa.b * f2), (float)ui3.A, (float)ui3.j, (float)ui4.k, (float)ui4.J);
            }
        }
        Kpa.J().J().J(cka.I);
        uKa.e();
        uKa.J((float)(b2 + vRa.Q), (float)(a2 + eta.e), (float)FRa.Ga);
        uKa.J((float)Qsa.U, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        Kh.J((float)(f2 * Lsa.X), (float)JPa.N, (float)(QTa.G * f2), (float)(eta.e * f2), (float)JPa.N, (float)JPa.N, (float)pqa.r, (float)kua.Fa);
        uKa.D();
    }

    public static /* synthetic */ void J(ad a2) {
        ((vS)a2).f(uSa.E != 0);
        ((vS)a2).J(new rt(((vS)a2).J().options));
    }

    public void J() {
        XR xR2 = this;
        if (((mx)xR2.I).J() == TU.ARROWS) {
            Iterator<lt> iterator;
            if (Xr.J()) {
                xR2.m.add(new lt());
            }
            Iterator<lt> iterator2 = iterator = xR2.m.iterator();
            while (iterator2.hasNext()) {
                Object a2 = iterator.next();
                if (OT.e > ((lt)a2).I) {
                    Iterator<lt> iterator3 = iterator;
                    iterator2 = iterator3;
                    iterator3.remove();
                    continue;
                }
                Object object = a2;
                ((lt)object).A += lTa.la;
                ((lt)object).k *= IPa.fa;
                ((lt)object).A *= IPa.fa;
                ((lt)object).M = ((lt)object).j;
                ((lt)object).i = ((lt)object).J;
                ((lt)object).j += ((lt)a2).k;
                ((lt)object).J += ((lt)a2).A;
                iterator2 = iterator;
            }
        } else {
            xR2.G = null;
            xR2.m.clear();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void l(int n2, int n3) {
        void a2;
        void b2;
        int n4;
        XR xR2;
        XR xR3 = xR2 = this;
        xR3.L.J();
        if (xR3.f() && (n4 = Mouse.getDWheel()) != 0 && ((mx)xR2.I).J() == null) {
            double d2 = xR2.L.d() + (double)(n4 > 0 ? FRa.Ga : Cra.fa);
            xR2.L.f(Math.max(rua.y, Math.min(sra.M, d2)), tpa.k, sB.x);
        }
        if (xR2.J) {
            xR2.g = b2 - (xR2.I - xR2.E);
            XR xR4 = xR2;
            xR2.e = Math.max(ura.C, Math.min(Psa.M, (int)(a2 / uqa.g - (xR4.A - xR4.F))));
        }
        XR xR5 = xR2;
        XR xR6 = xR2;
        xR5.M.C(xR6.I + xR2.k - ERa.t);
        xR5.M.l((double)xR2.J);
        jU jU2 = zU.M.J();
        zU.M.J(xR2.l);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        int n5 = (int)xR6.L.l();
        cI.J((Runnable)xS.J(xR5));
        int n6 = xR5.I + xR2.k / KPa.y - vQa.c;
        int c2 = xR5.J + xR2.j / KPa.y + (double)n5;
        if (mx.J().J() == TU.ARMOR) {
            if (xR2.i == null) {
                XR xR7 = xR2;
                vb.J(xR7.g, xR7.e, Math.max(aPa.o, n6), Math.max(n5, c2), n5, qta.D, APa.D);
            } else {
                if (xR2.k.J() != xR2.i) {
                    XR xR8 = xR2;
                    xR8.k.J(xR8.i, null);
                }
                XR xR9 = xR2;
                xR9.k.J((float)xR9.g, (float)xR2.e, (double)Math.max(aPa.o, n6), (double)Math.max(n5, c2), qta.D, APa.D, n5, JPa.N, vRa.d != 0);
            }
        } else {
            vb.J(yu.J((XR)xR2, (int)n6, (int)n5, (int)c2));
        }
        cI.J();
        zU.M.J(jU2);
        if (xR2.k >= sra.Ga) {
            XR xR10 = xR2;
            xR10.M.l(Math.max(ITa.a, (double)(xR2.j / KPa.y - xR2.M.J() / KPa.y)));
            xR10.M.J((int)b2, (int)a2);
            xR10.f.J((int)b2, (int)a2);
        }
    }

    static {
        Mda[][] mdaArrayArray = new Mda[AQa.P][];
        Mda[] mdaArray = new Mda[AQa.P];
        mdaArray[uSa.E] = new Mda((eAa)Gea.G);
        mdaArray[vRa.d] = new Mda((eAa)Gea.x);
        mdaArray[uqa.g] = new Mda((eAa)Gea.H);
        mdaArray[yRa.d] = new Mda((eAa)Gea.XC);
        mdaArrayArray[uSa.E] = mdaArray;
        Mda[] mdaArray2 = new Mda[AQa.P];
        mdaArray2[uSa.E] = new Mda((eAa)Gea.ma);
        mdaArray2[vRa.d] = new Mda((eAa)Gea.X);
        mdaArray2[uqa.g] = new Mda((eAa)Gea.la);
        mdaArray2[yRa.d] = new Mda((eAa)Gea.Pa);
        mdaArrayArray[vRa.d] = mdaArray2;
        Mda[] mdaArray3 = new Mda[AQa.P];
        mdaArray3[uSa.E] = new Mda((eAa)Gea.g);
        mdaArray3[vRa.d] = new Mda((eAa)Gea.K);
        mdaArray3[uqa.g] = new Mda((eAa)Gea.a);
        mdaArray3[yRa.d] = new Mda((eAa)Gea.ab);
        mdaArrayArray[uqa.g] = mdaArray3;
        Mda[] mdaArray4 = new Mda[AQa.P];
        mdaArray4[uSa.E] = new Mda((eAa)Gea.AA);
        mdaArray4[vRa.d] = new Mda((eAa)Gea.Mc);
        mdaArray4[uqa.g] = new Mda((eAa)Gea.TC);
        mdaArray4[yRa.d] = new Mda((eAa)Gea.ta);
        mdaArrayArray[yRa.d] = mdaArray4;
        j = Arrays.asList(mdaArrayArray);
        C = ConfigurationService.J(MDConfiguration.class);
    }

    public void J(MiniDotEmote miniDotEmote) {
        Object b2 = miniDotEmote;
        XR a2 = this;
        a2.i = b2;
    }
}

