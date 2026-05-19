/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BHa
 *  CHa
 *  EGa
 *  ERa
 *  Epa
 *  Ey
 *  FTa
 *  Fpa
 *  Gl
 *  Iha
 *  JPa
 *  KHa
 *  LGa
 *  Lqa
 *  Mda
 *  NTa
 *  OHa
 *  QSa
 *  SOa
 *  TQa
 *  Tia
 *  Tpa
 *  Uia
 *  Usa
 *  XTa
 *  YHa
 *  Yra
 *  Zpa
 *  Zta
 *  gZ
 *  hra
 *  jRa
 *  oIa
 *  qia
 *  sia
 *  vL
 *  vQa
 *  vRa
 *  vga
 *  vpa
 *  wOa
 *  wga
 *  zIa
 *  zha
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class wga_2 {
    public static final wga w;
    public static final wga W;
    public static final wga q;
    public static final wga x;
    public static final wga v;
    public static final wga o;
    public static final wga h;
    public static final wga K;
    public static final wga H;
    public static final wga c;
    public static final wga B;
    private static final wga[] d;
    public static final wga a;
    private static final Map<ResourceLocation, wga> b;
    public static final wga l;
    public sia e;
    public static final wga G;
    public static final wga D;
    public String f;
    public static final wga F;
    public static final wga g;
    public static final wga L;
    private final int E;
    public static final wga m;
    public static final wga C;
    public static final wga i;
    public static final wga M;
    public static final wga k;
    public static final wga j;
    public static final wga[] J;
    public static final wga A;
    public final int I;

    public void f(Gl gl2, vL vL2, int n2) {
        int d2 = n2;
        wga_2 wga_22 = this;
    }

    public int f(int n2) {
        int b2 = n2;
        wga_2 a2 = this;
        return a2.J(b2) + tTa.h;
    }

    public static wga f(String a2) {
        return (wga_2)b.get(new ResourceLocation(a2));
    }

    public int l() {
        return vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public wga_2(int n2, ResourceLocation resourceLocation, int n3, sia sia2) {
        void c2;
        void a2;
        void b2;
        wga_2 d2;
        int e2 = n2;
        wga_2 wga_22 = d2 = this;
        d2.I = e2;
        wga_22.E = b2;
        wga_22.e = a2;
        if (d[e2] != null) {
            throw new IllegalArgumentException(Asa.b);
        }
        wga_2.d[e2] = d2;
        b.put((ResourceLocation)c2, (wga)d2);
    }

    /*
     * WARNING - void declaration
     */
    public String J(int n2) {
        void a2;
        wga_2 wga_22 = this;
        String b2 = Ey.f((String)wga_22.J());
        return new StringBuilder().insert(3 >> 2, b2).append(Tpa.E).append(Ey.f((String)new StringBuilder().insert(3 & 4, Yra.P).append((int)a2).toString())).toString();
    }

    public int f() {
        return vRa.d;
    }

    static {
        int n2;
        d = new wga_2[hra.Ja];
        b = Maps.newHashMap();
        v = new Iha(uSa.E, new ResourceLocation(wsa.g), NTa.C, uSa.E);
        k = new Iha(vRa.d, new ResourceLocation(ppa.N), tTa.h, vRa.d);
        h = new Iha(uqa.g, new ResourceLocation(Zta.N), tTa.h, uqa.g);
        x = new Iha(yRa.d, new ResourceLocation(UOa.V), uqa.g, yRa.d);
        D = new Iha(AQa.P, new ResourceLocation(Iqa.Ka), tTa.h, AQa.P);
        B = new yIa(tTa.h, new ResourceLocation(Jra.q), uqa.g);
        m = new Tia(uua.p, new ResourceLocation(zOa.J), uqa.g);
        A = new KHa(XTa.W, new ResourceLocation(yta.ja), vRa.d);
        a = new OHa(Yqa.i, new ResourceLocation(SOa.U), uqa.g);
        C = new vga(ERa.C, new ResourceLocation(Fpa.u), NTa.C, uSa.E);
        o = new vga(yta.Ka, new ResourceLocation(FTa.ca), tTa.h, vRa.d);
        w = new vga(yOa.B, new ResourceLocation(uqa.V), tTa.h, uqa.g);
        q = new YHa(wOa.t, new ResourceLocation(Iqa.ja), tTa.h);
        F = new jha(kTa.j, new ResourceLocation(sOa.m), uqa.g);
        K = new CHa(wOa.h, new ResourceLocation(Usa.Ga), uqa.g, sia.WEAPON);
        H = new zha(fPa.i, new ResourceLocation(Lqa.N), NTa.C);
        W = new zIa(Zqa.G, new ResourceLocation(FRa.v), vRa.d);
        l = new BHa(Tpa.z, new ResourceLocation(PRa.x), tTa.h);
        g = new CHa(TQa.ca, new ResourceLocation(Mqa.A), uqa.g, sia.DIGGER);
        M = new Uia(QSa.p, new ResourceLocation(APa.S), NTa.C);
        i = new EGa(jRa.q, new ResourceLocation(Ira.V), uqa.g);
        j = new OGa(vpa.o, new ResourceLocation(Lqa.j), uqa.g);
        L = new oIa(cPa.Q, new ResourceLocation(Zpa.y), vRa.d);
        c = new CHa(tua.w, new ResourceLocation(zpa.Ga), uqa.g, sia.FISHING_ROD);
        G = new qia(ITa.V, new ResourceLocation(vQa.H), uqa.g, sia.FISHING_ROD);
        ArrayList<wga> arrayList = Lists.newArrayList();
        wga[] wgaArray = d;
        int n3 = d.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            wga wga2 = wgaArray[n2];
            if (wga2 != null) {
                arrayList.add(wga2);
            }
            n4 = ++n2;
        }
        ArrayList<wga> arrayList2 = arrayList;
        J = (wga[])arrayList2.toArray(new wga_2[arrayList2.size()]);
    }

    public String J() {
        wga_2 a2;
        return new StringBuilder().insert(3 >> 2, Epa.M).append(a2.f).toString();
    }

    public wga J(String string) {
        String b2 = string;
        wga_2 a2 = this;
        a2.f = b2;
        return a2;
    }

    public boolean J(wga wga2) {
        wga_2 a2 = this;
        wga_2 b2 = wga2;
        if (a2 != b2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Gl gl2, vL vL2, int n2) {
        int d2 = n2;
        wga_2 wga_22 = this;
    }

    public float J(int n2, LGa lGa) {
        wga_2 c2 = lGa;
        wga_2 a2 = this;
        return JPa.N;
    }

    public boolean J(Mda mda2) {
        wga_2 b2 = mda2;
        wga_2 a2 = this;
        return a2.e.canEnchantItem(b2.J());
    }

    public int J() {
        wga_2 a2;
        return a2.E;
    }

    public int J(int n2, gZ gZ2) {
        wga_2 c2 = gZ2;
        wga_2 a2 = this;
        return uSa.E;
    }

    public int J(int n2) {
        int b2 = n2;
        wga_2 a2 = this;
        return vRa.d + b2 * NTa.C;
    }

    public static wga J(int a2) {
        if (a2 >= 0 && a2 < d.length) {
            return d[a2];
        }
        return null;
    }

    public static Set<ResourceLocation> J() {
        return b.keySet();
    }
}

