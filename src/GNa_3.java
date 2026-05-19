/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  FPa
 *  GNa
 *  JSa
 *  Jy
 *  NPa
 *  NTa
 *  QFa
 *  RPa
 *  SOa
 *  Woa
 *  XTa
 *  aQa
 *  ac
 *  bpa
 *  bua
 *  eAa
 *  fsa
 *  jNa
 *  lPa
 *  pqa
 *  pua
 *  tMa
 *  uQa
 *  uV
 *  vLa
 *  vRa
 *  vpa
 *  wPa
 *  wra
 *  xx
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTallGrass$EnumType;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class GNa_3
extends EC {
    private static final List<jNa> m = Lists.newArrayList();
    private Woa i;
    private String M;
    private tMa k;
    private String j;
    private final vLa J;
    private ac A;
    private String I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        GNa_3 a2;
        int d2 = n4;
        GNa_3 gNa_3 = a2 = this;
        gNa_3.i.J((int)c2, (int)b2, d2);
        super.J((int)c2, (int)b2, d2);
    }

    public static /* synthetic */ tMa J(GNa a2) {
        return a2.k;
    }

    public static /* synthetic */ List J() {
        return m;
    }

    static {
        String[] stringArray = new String[vRa.d];
        stringArray[uSa.E] = bpa.p;
        xx[] xxArray = new xx[yRa.d];
        xxArray[uSa.E] = new xx(vRa.d, (Block)QFa.lf);
        xxArray[vRa.d] = new xx(uqa.g, QFa.Bc);
        xxArray[uqa.g] = new xx(vRa.d, QFa.bg);
        GNa_3.J(fsa.ca, eAa.J((Block)QFa.lf), Jy.Z, Arrays.asList(stringArray), xxArray);
        String[] stringArray2 = new String[tTa.h];
        stringArray2[uSa.E] = JSa.Aa;
        stringArray2[vRa.d] = Jta.e;
        stringArray2[uqa.g] = APa.i;
        stringArray2[yRa.d] = uQa.i;
        stringArray2[AQa.P] = LRa.z;
        xx[] xxArray2 = new xx[AQa.P];
        xxArray2[uSa.E] = new xx(vRa.d, (Block)QFa.lf);
        xxArray2[vRa.d] = new xx(tTa.h, QFa.Bc);
        xxArray2[uqa.g] = new xx(Fua.fa, QFa.Gd);
        xxArray2[yRa.d] = new xx(vRa.d, QFa.bg);
        GNa_3.J(WOa.t, eAa.J((Block)QFa.Gd), Jy.U, Arrays.asList(stringArray2), xxArray2);
        String[] stringArray3 = new String[uqa.g];
        stringArray3[uSa.E] = JSa.Aa;
        stringArray3[vRa.d] = RPa.N;
        xx[] xxArray3 = new xx[tTa.h];
        xxArray3[uSa.E] = new xx(Jsa.ha, (Block)QFa.sc);
        xxArray3[vRa.d] = new xx(tTa.h, (Block)QFa.R);
        xxArray3[uqa.g] = new xx(tTa.h, QFa.Bc);
        xxArray3[yRa.d] = new xx(tTa.h, QFa.Gd);
        xxArray3[AQa.P] = new xx(vRa.d, QFa.bg);
        GNa_3.J(rQa.Ga, Gea.Ba, Jy.L, Arrays.asList(stringArray3), xxArray3);
        String[] stringArray4 = new String[Yqa.i];
        stringArray4[uSa.E] = bpa.p;
        stringArray4[vRa.d] = JSa.Aa;
        stringArray4[uqa.g] = APa.i;
        stringArray4[yRa.d] = uQa.i;
        stringArray4[AQa.P] = LRa.z;
        stringArray4[tTa.h] = Jta.e;
        stringArray4[uua.p] = cPa.k;
        stringArray4[XTa.W] = LRa.Da;
        xx[] xxArray4 = new xx[AQa.P];
        xxArray4[uSa.E] = new xx(vRa.d, (Block)QFa.lf);
        xxArray4[vRa.d] = new xx(yRa.d, QFa.Bc);
        xxArray4[uqa.g] = new xx(lPa.p, QFa.Gd);
        xxArray4[yRa.d] = new xx(vRa.d, QFa.bg);
        GNa_3.J(Npa.N, eAa.J((Block)QFa.y), BlockTallGrass$EnumType.GRASS.getMeta(), Jy.Z, Arrays.asList(stringArray4), xxArray4);
        String[] stringArray5 = new String[uqa.g];
        stringArray5[uSa.E] = bpa.p;
        stringArray5[vRa.d] = JSa.Aa;
        xx[] xxArray5 = new xx[tTa.h];
        xxArray5[uSa.E] = new xx(vRa.d, QFa.gC);
        xxArray5[vRa.d] = new xx(vRa.d, (Block)QFa.lf);
        xxArray5[uqa.g] = new xx(yRa.d, QFa.Bc);
        xxArray5[yRa.d] = new xx(lPa.p, QFa.Gd);
        xxArray5[AQa.P] = new xx(vRa.d, QFa.bg);
        GNa_3.J(NTa.F, eAa.J((Block)QFa.gC), Jy.C, Arrays.asList(stringArray5), xxArray5);
        String[] stringArray6 = new String[uqa.g];
        stringArray6[uSa.E] = bpa.p;
        stringArray6[vRa.d] = JSa.Aa;
        xx[] xxArray6 = new xx[yRa.d];
        xxArray6[uSa.E] = new xx(vRa.d, (Block)QFa.lf);
        xxArray6[vRa.d] = new xx(yRa.d, QFa.Bc);
        xxArray6[uqa.g] = new xx(uqa.g, QFa.yB);
        GNa_3.J(bua.S, Gea.ia, Jy.Z, Arrays.asList(stringArray6), xxArray6);
        String[] stringArray7 = new String[uua.p];
        stringArray7[uSa.E] = bpa.p;
        stringArray7[vRa.d] = JSa.Aa;
        stringArray7[uqa.g] = APa.i;
        stringArray7[yRa.d] = uQa.i;
        stringArray7[AQa.P] = LRa.z;
        stringArray7[tTa.h] = Jta.e;
        xx[] xxArray7 = new xx[AQa.P];
        xxArray7[uSa.E] = new xx(Yqa.i, (Block)QFa.R);
        xxArray7[vRa.d] = new xx(FPa.F, QFa.qC);
        xxArray7[uqa.g] = new xx(yRa.d, QFa.Gd);
        xxArray7[yRa.d] = new xx(vRa.d, QFa.bg);
        GNa_3.J(pqa.V, eAa.J((Block)QFa.R), Jy.ea, Arrays.asList(stringArray7), xxArray7);
        xx[] xxArray8 = new xx[yRa.d];
        xxArray8[uSa.E] = new xx(FPa.F, QFa.qC);
        xxArray8[vRa.d] = new xx(yRa.d, QFa.Gd);
        xxArray8[uqa.g] = new xx(vRa.d, QFa.bg);
        GNa_3.J(wPa.ja, Gea.zc, Jy.ea, xxArray8);
    }

    public GNa_3(vLa vLa2) {
        GNa_3 b2 = vLa2;
        GNa_3 a2 = this;
        a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String string, eAa eAa2, Jy jy2, xx ... xxArray) {
        void b2;
        void c2;
        xx[] d2 = xxArray;
        String a2 = string;
        GNa_3.J(a2, (eAa)c2, uSa.E, (Jy)b2, (List<String>)null, d2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        GNa_3 a2 = this;
        if (!a2.i.J((char)b2, c3)) {
            super.J((char)b2, c3);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String xxArray, eAa eAa2, Jy jy2, List<String> list, xx ... xxArray2) {
        String e2;
        void b2;
        void c2;
        void d2;
        xx[] xxArray3 = xxArray;
        xxArray = xxArray2;
        xx[] a2 = xxArray3;
        GNa_3.J((String)a2, (eAa)d2, uSa.E, (Jy)c2, (List<String>)b2, (xx[])e2);
    }

    private boolean d() {
        GNa_3 a2;
        if (a2.k.I > pua.o && a2.k.I < m.size() || a2.i.f().length() > vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    public void A() {
        GNa_3 a2;
        a2.E.clear();
        Keyboard.enableRepeatEvents(vRa.d != 0);
        a2.j = oha.J(nua.J, new Object[uSa.E]);
        a2.I = oha.J(aQa.X, new Object[uSa.E]);
        a2.M = oha.J(tSa.U, new Object[uSa.E]);
        GNa_3 gNa_3 = a2;
        GNa_3 gNa_32 = a2;
        gNa_3.i = new Woa(uqa.g, a2.L, vpa.o, wra.P, (int)(a2.A - ySa.T), kTa.j);
        gNa_32.k = new tMa((GNa)a2);
        gNa_3.i.M(dua.U);
        gNa_3.i.f(a2.J.f());
        a2.A = new ac(uSa.E, (int)(a2.A / uqa.g - BQa.Q), (int)(a2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(sOa.Ia, new Object[uSa.E]));
        gNa_3.E.add(a2.A);
        a2.E.add(new ac(vRa.d, (int)(a2.A / uqa.g + tTa.h), (int)(a2.I - EPa.O), Jpa.Ha, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        a2.J();
    }

    public void J() {
        boolean a2;
        GNa_3 gNa_3 = this;
        gNa_3.A.J = a2 = gNa_3.d();
    }

    public void d() throws IOException {
        GNa_3 a2;
        GNa_3 gNa_3 = a2;
        super.d();
        gNa_3.k.f();
    }

    public void l() {
        GNa_3 a2;
        GNa_3 gNa_3 = a2;
        gNa_3.i.C();
        super.l();
    }

    public void J(ac ac2) throws IOException {
        GNa_3 b2 = ac2;
        GNa_3 a2 = this;
        if (((ac)b2).C == 0 && a2.d()) {
            GNa_3 gNa_3 = a2;
            a2.J.J(gNa_3.i.f());
            gNa_3.g.J((EC)a2.J);
            return;
        }
        if (((ac)b2).C == vRa.d) {
            GNa_3 gNa_3 = a2;
            gNa_3.g.J((EC)gNa_3.J);
        }
    }

    public static /* synthetic */ Woa J(GNa a2) {
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String string, eAa eAa2, int n2, Jy jy2, List<String> list, xx ... xxArray) {
        void d2;
        void e2;
        void b2;
        String c2;
        void a2;
        int f2;
        String string2 = string;
        uV uV2 = new uV();
        int n3 = f2 = ((void)a2).length - vRa.d;
        while (n3 >= 0) {
            uV2.J().add(a2[f2--]);
            n3 = f2;
        }
        uV uV3 = uV2;
        uV3.J(((Jy)c2).Ka);
        uV3.J();
        if (b2 != null) {
            Iterator iterator = f2 = b2.iterator();
            while (iterator.hasNext()) {
                c2 = (String)f2.next();
                iterator = f2;
                uV2.J().put(c2, Maps.newHashMap());
            }
        }
        m.add(new jNa((eAa)e2, (int)d2, string2, uV2.toString()));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        GNa_3 a2;
        float d2 = f2;
        GNa_3 gNa_3 = a2 = this;
        GNa_3 gNa_32 = a2;
        gNa_32.i();
        gNa_32.k.J((int)c2, (int)b2, d2);
        GNa_3.J((String)gNa_32.j, (int)(a2.A / uqa.g), (int)Yqa.i, (int)pua.o);
        GNa_3.f((String)gNa_32.I, (int)vpa.o, (int)Fsa.d, (int)xra.R);
        GNa_3.f((String)gNa_32.M, (int)vpa.o, (int)NPa.e, (int)xra.R);
        a2.i.J();
        super.J((int)c2, (int)b2, d2);
    }
}

