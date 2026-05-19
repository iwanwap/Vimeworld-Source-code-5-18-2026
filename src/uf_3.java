/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  CV
 *  ID
 *  JPa
 *  KH
 *  Kpa
 *  Lra
 *  NCa
 *  Waa
 *  YE
 *  YL
 *  YQ
 *  aSa
 *  eD
 *  kf
 *  kqa
 *  mf
 *  nLa
 *  pP
 *  pqa
 *  uf
 *  vL
 *  vRa
 *  wI
 *  yF
 *  zU
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uf_3 {
    private MiniDotEmote G;
    private int D;
    private final Sx f;
    private static final Map<Sx, Map<MiniDotEmote, uf>> F = new HashMap<Sx, Map<MiniDotEmote, uf>>();
    private double g;
    private eD L;
    private boolean E;
    private long m;
    private List<YQ> C;
    private boolean i;
    private double M;
    private double k;
    private int j;
    private boolean J;
    private kf A;
    private List<pP> I;

    private void l() {
        uf_3 a2;
        block6: {
            block7: {
                if (a2.G == null) break block6;
                uf_3 uf_32 = a2;
                double d2 = Math.abs(a2.f.la - uf_32.k) + Math.abs((double)(a2.f.Z - a2.g)) + Math.abs((double)(a2.f.A - a2.M));
                if (!uf_32.E && d2 > Jra.Da && a2.J) break block7;
                if (a2.G.l()) break block6;
                uf_3 uf_33 = a2;
                if (uf_33.D < uf_33.G.J()) break block6;
            }
            a2.J(null, null);
        }
        uf_3 uf_34 = a2;
        uf_34.k = uf_34.f.la;
        uf_34.g = uf_34.f.Z;
        uf_34.M = uf_34.f.A;
        if (uf_34.G != null && a2.A != null) {
            uf_3 uf_35 = a2;
            uf_3 uf_36 = a2;
            uf_35.G.J(uf_35.f, uf_36.L, (int)a2.A.J(CV.M));
            uf_36.D += vRa.d;
        }
        if (jD.I > a2.m) {
            a2.f();
            a2.m = jD.I;
        }
        if (a2.L != null) {
            a2.L.C();
        }
    }

    private void f() {
        Waa waa2;
        uf_3 uf_32 = this;
        XW xW2 = (XW)uf_32.f;
        XW xW3 = xW2;
        uf_32.L = new eD((Sx)xW3, xW3.l(), new Waa());
        uf_3 a2 = new Waa();
        Waa waa3 = waa2 = new Waa();
        a2.J(Eqa.Z, (NCa)waa3);
        waa3.J(aSa.f, xW2.J().toString());
        uf_32.L.J().J(zta.b, (NCa)a2);
        uf_32.L.f();
    }

    public static /* synthetic */ void J(uf uf2, YQ yQ2) {
        uf b2 = yQ2;
        uf a2 = uf2;
        uf uf3 = b2 = new pP(a2.f.M(), (YQ)b2);
        uf3.J(Lra.W, vRa.d != 0, pqa.r, vRa.d != 0);
        uf3.f();
        a2.I.add((pP)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(uf uf2, float f2, float f3, double d2, double d3, float f4, float f5, int n2, float f6, pP pP2) {
        void b2;
        void c2;
        void d4;
        void e2;
        void f7;
        void g2;
        void h2;
        void i2;
        uf j2;
        uf uf3 = uf2;
        uf2 = pP2;
        uf a2 = uf3;
        j2.J((vL)a2.f, (float)i2, (float)h2, (int)g2, (int)f7, (float)(-e2), (float)d4, (float)c2, (float)b2);
    }

    public void l(boolean bl2) {
        boolean b2 = bl2;
        uf_3 a2 = this;
        a2.i = b2;
    }

    public void J() {
        uf_3 a2;
        if (a2.G == null) {
            return;
        }
        uf_3 uf_32 = a2;
        uf_3 uf_33 = a2;
        uf_33.G.f(uf_33.L);
        a2.I.clear();
        uf_32.C = null;
        a2.i = uSa.E;
        uf_32.E = uSa.E;
    }

    public void J(int n2) {
        int b22 = n2;
        uf_3 a2 = this;
        if (a2.i) {
            return;
        }
        MiniDotItem b22 = (MiniDotItem)BS.ITEMS.get(b22);
        if (!(b22 instanceof MiniDotEmote)) {
            return;
        }
        a2.J((MiniDotEmote)b22, null);
    }

    public MiniDotEmote J() {
        uf_3 a2;
        return a2.G;
    }

    public void f(boolean bl2) {
        boolean b2 = bl2;
        uf_3 a2 = this;
        a2.E = b2;
    }

    /*
     * Unable to fully structure code
     */
    public void J(float var1_2, float var2_3, double var3_4, double var5_5, float var7_6, float var8_7, int var9_8, float var10_9, boolean var11_10) {
        var13_13 = this;
        if (var13_13.L == null) {
            var13_13.f();
        }
        if (Kpa.J().w.M.f() == vRa.d) {
            var13_13.J((boolean)a);
        }
        if (!(var13_13.f instanceof XW)) ** GOTO lbl21
        a = (XW)var13_13.f;
        var12_14 = a.l();
        if (!var12_14.equals(var13_13.L.J())) {
            v0 = var13_13;
            v0.L.J(var12_14);
            v0.L.J(null);
            v0.L.f();
        }
        ((sf)var13_13.L.J().f().get(Eqa.Z)).J(a.J());
        j = Ni.J((vL)var13_13.f);
        if (j != null && j.f()) {
            ((sf)var13_13.L.J().f().get(Eqa.Z)).J((Integer)j.J(null).I);
            v1 = var13_13;
        } else {
            ((sf)var13_13.L.J().f().get(Eqa.Z)).J((Integer)null);
lbl21:
            // 2 sources

            v1 = var13_13;
        }
        v1.L.J((float)i, (float)h, (int)g, (int)f, (float)(-e), (float)d, (float)c);
        v2 = var13_13;
        var13_13.I.forEach(yF.J((uf)v2, (float)i, (float)h, (double)g, (double)f, (float)e, (float)d, (int)c, (float)b));
        a = ((ID)v2.L.J().J().get(uSa.E)).f();
        var12_14 = Kpa.J();
        if (var13_13.G != null && var13_13.A != null && !var12_14.I()) {
            v3 = var13_13;
            j = (int)v3.A.J((float)b);
            v3.G.f(var13_13.f, a, var13_13.L, j, (float)b);
        }
        nLa.C();
        var13_13.J = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(MiniDotEmote miniDotEmote, List<YQ> list) {
        void a2;
        MiniDotEmote c2 = miniDotEmote;
        uf_3 b2 = this;
        if (b2.i) {
            return;
        }
        if (b2.f.j.e) {
            b2.J();
        }
        if (b2.G != null && c2 != null && Objects.equals(b2.G.f(), c2.f())) {
            return;
        }
        uf_3 uf_32 = b2;
        uf_32.G = c2;
        uf_32.D = uSa.E;
        uf_32.j = uSa.E;
        uf_32.k = uf_32.f.la;
        uf_32.g = uf_32.f.Z;
        b2.M = b2.f.A;
        b2.C = a2;
        if (b2.f.j.e) {
            b2.J(c2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(double var1_4, double var3_5, double var5_6, float var7_7) {
        var8_8 = this;
        if (var8_8.L == null) {
            var8_8.f();
        }
        v0 = e = var8_8.L != null && var8_8.G != null ? vRa.d : uSa.E;
        if (e == 0) {
            return (boolean)uSa.E;
        }
        if (!(var8_8.f instanceof XW)) ** GOTO lbl22
        e = (XW)var8_8.f;
        var9_9 = e.l();
        if (!var9_9.equals(var8_8.L.J())) {
            v1 = var8_8;
            v1.L.J(var9_9);
            v1.L.J(null);
            v1.L.f();
        }
        ((sf)var8_8.L.J().f().get(Eqa.Z)).J(e.J());
        var10_10 = Ni.J((vL)var8_8.f);
        if (var10_10 != null && var10_10.f()) {
            ((sf)var8_8.L.J().f().get(Eqa.Z)).J((Integer)var10_10.J(null).I);
            v2 = var8_8;
        } else {
            ((sf)var8_8.L.J().f().get(Eqa.Z)).J((Integer)null);
lbl22:
            // 2 sources

            v2 = var8_8;
        }
        v2.L.J(var8_8.G, (double)d, (double)c, (double)b, (float)a);
        e = ((ID)var8_8.L.J().J().get(uSa.E)).f();
        var9_9 = Kpa.J();
        if (var8_8.G != null && var8_8.A != null && !var9_9.I()) {
            v3 = var8_8;
            var10_11 = (int)v3.A.J((float)a);
            v3.G.f(var8_8.f, e, var8_8.L, var10_11, (float)a);
        }
        var8_8.J = vRa.d;
        var8_8.I.forEach(YE.J((uf)var8_8, (double)d, (double)c, (double)b, (float)a));
        return (boolean)vRa.d;
    }

    /*
     * Unable to fully structure code
     */
    public void J(boolean var1_3) {
        block6: {
            b = var1_3;
            a = this;
            if (a.G != null && b && (var2_5 = a.G.J().get(a.D)) != null) {
                v0 = var3_7 = new YL();
                var3_7.E = FRa.Ga;
                v1 = var3_7;
                v0.k = new KH(a.f.la, (double)a.f.Z, (double)a.f.A);
                v0.J = var2_5.I;
                v0.m = Mqa.y;
                OT.i.L.f(var3_7);
            }
            if (a.f.j.e) {
                a.l();
                return;
            }
            if (a.G == null) break block6;
            v2 = a;
            var2_6 = Math.abs(a.f.la - v2.k + (a.f.Z - a.g) + (a.f.A - a.M));
            if (!v2.E && var2_6 > Jra.Da && a.J) ** GOTO lbl-1000
            if (!a.G.l()) {
                v3 = a;
                ** if (v3.D < v3.G.J()) goto lbl-1000
            }
            ** GOTO lbl-1000
lbl-1000:
            // 2 sources

            {
                v4 = a;
                v5 = v4;
                v4.J(null, null);
                ** GOTO lbl37
            }
lbl-1000:
            // 2 sources

            {
                if (a.G.l() && (a.j += vRa.d) >= a.G.J()) {
                    a.j = uSa.E;
                    b = new wI();
                    b.put((Object)Wqa.fa, (Object)BQa.F);
                    b.put((Object)kqa.x, (Object)a.G.id);
                    zU.M.f(b);
                }
                v5 = a;
            }
lbl37:
            // 2 sources

            v5.D += vRa.d;
        }
        v6 = a;
        v6.k = v6.f.la;
        v6.g = v6.f.Z;
        v6.M = v6.f.A;
    }

    public uf_3(Sx sx2) {
        uf_3 a2;
        Object b2 = sx2;
        uf_3 uf_32 = a2 = this;
        a2.m = System.currentTimeMillis();
        a2.J = uSa.E;
        uf_3 uf_33 = a2;
        a2.I = new ArrayList<pP>();
        uf_32.i = uSa.E;
        uf_32.E = uSa.E;
        uf_32.f = b2;
    }

    private void J(MiniDotEmote miniDotEmote) {
        MiniDotEmote b2 = miniDotEmote;
        uf_3 a2 = this;
        if (a2.L == null) {
            a2.f();
        }
        if (b2 != null) {
            uf_3 uf_32 = a2;
            Object object = uf_32.L.J().J().J().J(new StringBuilder().insert(3 ^ 3, nOa.T).append(b2.f()).toString());
            uf_32.A = uf_32.L.J().J(null, (CE)object, b2.l());
            uf_32.L.J(a2.A);
            object = uf_32.C != null ? a2.C : b2.l();
            uf_3 uf_33 = a2;
            object.forEach(mf.J((uf)uf_33));
            b2.J(uf_33.L);
            return;
        }
        uf_3 uf_34 = a2;
        uf_34.G = null;
        uf_34.A = null;
        a2.L.J(null);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(uf uf2, double d2, double d3, double d4, float f2, pP pP2) {
        void b2;
        void c2;
        void d5;
        void e2;
        uf f3;
        uf uf3 = uf2;
        uf2 = pP2;
        uf a2 = uf3;
        f3.J((vL)a2.f, (double)e2, (double)d5, (double)c2, JPa.N, (float)b2);
    }
}

