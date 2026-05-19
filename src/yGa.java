/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AHa
 *  EHa
 *  EQa
 *  FHa
 *  HGa
 *  Lha
 *  Mda
 *  NTa
 *  Ppa
 *  Sqa
 *  Uqa
 *  WQa
 *  XTa
 *  ZOa
 *  asa
 *  eAa
 *  fpa
 *  hGa
 *  lHa
 *  lqa
 *  pPa
 *  sia
 *  uHa
 *  uIa
 *  uQa
 *  vRa
 *  wga
 */
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class yGa {
    public static final yGa a;
    private boolean b;
    private Mda l;
    private final int e;
    private final String G;
    private boolean D;
    public static final yGa f;
    public static final yGa F;
    public static final yGa g;
    public static final yGa L;
    public static final yGa E;
    public static final yGa m;
    public static final yGa C;
    public static final yGa i;
    private String M;
    public static final yGa[] k;
    private sia[] j;
    public static final yGa J;
    public static final yGa A;
    public static final yGa I;

    public yGa J(sia ... siaArray) {
        sia[] b2 = siaArray;
        sia[] a2 = this;
        a2.j = b2;
        return a2;
    }

    public yGa f() {
        yGa a2;
        a2.D = uSa.E;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(List<Mda> list) {
        void a2;
        yGa yGa2 = this;
        for (yGa b2 : eAa.C) {
            if (b2 == null || b2.J() != yGa2) continue;
            yGa yGa3 = b2;
            yGa3.J((eAa)yGa3, yGa2, (List)a2);
        }
        if (yGa2.J() != null) {
            yGa yGa4 = yGa2;
            yGa4.J((List<Mda>)a2, yGa4.J());
        }
    }

    public String l() {
        yGa a2;
        return new StringBuilder().insert(3 ^ 3, xSa.fa).append(a2.f()).toString();
    }

    public yGa J(String string) {
        String b2 = string;
        yGa a2 = this;
        a2.M = b2;
        return a2;
    }

    public Mda J() {
        yGa a2;
        if (a2.l == null) {
            yGa yGa2 = a2;
            a2.l = new Mda(a2.J(), vRa.d, a2.f());
        }
        return a2.l;
    }

    /*
     * WARNING - void declaration
     */
    public void J(List<Mda> list, sia ... siaArray) {
        int n2;
        yGa yGa2 = this;
        wga[] wgaArray = wga.J;
        int n3 = wga.J.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            yGa c2 = wgaArray[n2];
            if (c2 != null && ((wga)c2).e != null) {
                void a2;
                int n5 = uSa.E;
                int n6 = uSa.E;
                while (n6 < ((void)a2).length && n5 == 0) {
                    int n7;
                    if (((wga)c2).e == a2[n7]) {
                        n5 = vRa.d;
                    }
                    n6 = ++n7;
                }
                if (n5 != 0) {
                    void b2;
                    yGa yGa3 = c2;
                    b2.add(Gea.ha.J(new HGa((wga)yGa3, yGa3.f())));
                }
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public yGa(int n2, String string) {
        void a2;
        yGa b2;
        int c2 = n2;
        yGa yGa2 = b2 = this;
        b2.M = uQa.g;
        b2.D = vRa.d;
        b2.b = vRa.d;
        yGa2.e = c2;
        yGa2.G = a2;
        yGa.k[c2] = b2;
    }

    public boolean l() {
        yGa a2;
        return a2.D;
    }

    static {
        k = new yGa[lqa.s];
        A = new FHa(uSa.E, kTa.V);
        a = new uIa(vRa.d, Uqa.Ca);
        I = new MGa(uqa.g, ATa.U);
        f = new uha(yRa.d, Ppa.b);
        sia[] siaArray = new sia[vRa.d];
        siaArray[uSa.E] = sia.ALL;
        g = new DHa(AQa.P, fpa.Ea).J(siaArray);
        F = new uHa(tTa.h, EQa.a).J(hpa.u);
        i = new UGa(uua.p, ySa.L);
        sia[] siaArray2 = new sia[yRa.d];
        siaArray2[uSa.E] = sia.DIGGER;
        siaArray2[vRa.d] = sia.FISHING_ROD;
        siaArray2[uqa.g] = sia.BREAKABLE;
        J = new lHa(XTa.W, ATa.K).J(siaArray2);
        sia[] siaArray3 = new sia[XTa.W];
        siaArray3[uSa.E] = sia.ARMOR;
        siaArray3[vRa.d] = sia.ARMOR_FEET;
        siaArray3[uqa.g] = sia.ARMOR_HEAD;
        siaArray3[yRa.d] = sia.ARMOR_LEGS;
        siaArray3[AQa.P] = sia.ARMOR_TORSO;
        siaArray3[tTa.h] = sia.BOW;
        siaArray3[uua.p] = sia.WEAPON;
        m = new hGa(Yqa.i, Sqa.l).J(siaArray3);
        C = new Lha(WOa.fa, asa.ja);
        E = new AHa(NTa.C, WQa.z);
        L = new EHa(pPa.f, ZOa.F).J(vTa.R).f().J();
    }

    public abstract eAa J();

    public int l() {
        yGa a2;
        return a2.e;
    }

    public int f() {
        return uSa.E;
    }

    public String f() {
        yGa a2;
        return a2.G;
    }

    public int J() {
        yGa a2;
        return a2.e % uua.p;
    }

    public boolean f() {
        yGa a2;
        return a2.b;
    }

    public String J() {
        yGa a2;
        return a2.M;
    }

    public sia[] J() {
        yGa a2;
        return a2.j;
    }

    public yGa J() {
        yGa a2;
        a2.b = uSa.E;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(sia sia2) {
        int b2;
        yGa yGa2 = this;
        if (yGa2.j == null) {
            return uSa.E != 0;
        }
        sia[] siaArray = yGa2.j;
        int n2 = yGa2.j.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void a2;
            if (siaArray[b2] == a2) {
                return vRa.d != 0;
            }
            n3 = ++b2;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        yGa a2;
        if (a2.e < uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

