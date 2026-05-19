/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  Fpa
 *  Gua
 *  NTa
 *  Uta
 *  VF
 *  XTa
 *  Xsa
 *  Ypa
 *  ZOa
 *  ac
 *  bqa
 *  cra
 *  hTa
 *  kpa
 *  lD
 *  lqa
 *  mra
 *  nF
 *  nQa
 *  oF
 *  pPa
 *  pua
 *  sMa
 *  uOa
 *  vRa
 *  wOa
 *  xf
 *  zf
 */
import java.io.IOException;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zna_1
extends EC {
    public String M;
    private static Fha[] k;
    private EC j;
    private static final String J = "CL_00000718";
    private nF A;
    private Cia I;

    public static int f(ac a2) {
        return a2.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        zna_1 b2;
        int d2 = n3;
        zna_1 zna_12 = b2 = this;
        zna_1 zna_13 = b2;
        b2.i();
        zna_1.J((String)zna_13.M, (int)(b2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, d2, (float)a2);
        zna_13.A.J((int)c2, d2, b2.E);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(EC eC2, int n2, int n3, int n4, int n5, int n6, int n7) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        int n8 = n7;
        EC a2 = eC2;
        a2.J((int)f2, (int)e2, (int)d2, (int)c2, (int)b2, (int)g2);
    }

    /*
     * WARNING - void declaration
     */
    public zna_1(EC eC2, Cia cia) {
        void b2;
        zna_1 a2;
        zna_1 c2 = cia;
        zna_1 zna_12 = a2 = this;
        a2.M = Xsa.ga;
        zna_1 zna_13 = a2;
        a2.A = new nF((EC)a2);
        zna_12.j = b2;
        zna_12.I = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ac ac2) throws IOException {
        void a2;
        zna_1 zna_12 = this;
        if (a2.J) {
            int b22 = zna_12.I.F;
            if (a2.C < ZOa.x && a2 instanceof zf) {
                zna_12.I.f(((zf)a2).f(), vRa.d);
                a2.i = zna_12.I.J(Fha.getEnumOptions(a2.C));
            }
            if (a2.C == ZOa.x) {
                zna_1 zna_13 = zna_12;
                zna_13.g.z.d();
                zna_13.g.J(zna_12.j);
            }
            if (zna_12.I.F != b22) {
                sMa sMa2 = b22 = new sMa(zna_12.g);
                int n2 = sMa2.f();
                int n3 = sMa2.J();
                zna_12.f(zna_12.g, n2, n3);
            }
            if (a2.C == Tqa.K) {
                zna_12.g.z.d();
                zna_1 zna_14 = zna_12;
                Re b22 = new Re(zna_14, zna_12.I);
                zna_14.g.J((EC)b22);
            }
            if (a2.C == bqa.P) {
                zna_12.g.z.d();
                zna_1 zna_15 = zna_12;
                zF b22 = new zF(zna_15, zna_12.I);
                zna_15.g.J((EC)b22);
            }
            if (a2.C == qQa.J) {
                zna_12.g.z.d();
                zna_1 zna_16 = zna_12;
                pF b22 = new pF(zna_16, zna_12.I);
                zna_16.g.J((EC)b22);
            }
            if (a2.C == Jra.t) {
                zna_12.g.z.d();
                zna_1 zna_17 = zna_12;
                lD b22 = new lD((EC)zna_17, zna_12.I);
                zna_17.g.J((EC)b22);
            }
            if (a2.C == Gua.F) {
                zna_12.g.z.d();
                zna_1 zna_18 = zna_12;
                oF b22 = new oF((EC)zna_18, zna_12.I);
                zna_18.g.J((EC)b22);
            }
            if (a2.C == rQa.Da) {
                if (Config.ka() || Config.Ha()) {
                    Config.J(Kg.J(kpa.M), Kg.J(xra.n));
                    return;
                }
                if (Config.m()) {
                    Config.J(Kg.J(rpa.n), Kg.J(pta.e));
                    return;
                }
                if (Config.ha()) {
                    Config.J(Kg.J(mra.X), Kg.J(sqa.f));
                    return;
                }
                zna_1 zna_19 = zna_12;
                zna_19.g.z.d();
                zna_1 zna_110 = zna_12;
                xC b22 = new xC(zna_110, zna_110.I);
                zna_19.g.J((EC)b22);
            }
        }
    }

    public static int J(ac a2) {
        return a2.j;
    }

    static {
        Fha[] fhaArray = new Fha[lqa.s];
        fhaArray[uSa.E] = Fha.GRAPHICS;
        fhaArray[vRa.d] = Fha.RENDER_DISTANCE;
        fhaArray[uqa.g] = Fha.AMBIENT_OCCLUSION;
        fhaArray[yRa.d] = Fha.FRAMERATE_LIMIT;
        fhaArray[AQa.P] = Fha.AO_LEVEL;
        fhaArray[tTa.h] = Fha.VIEW_BOBBING;
        fhaArray[uua.p] = Fha.GUI_SCALE;
        fhaArray[XTa.W] = Fha.USE_VBO;
        fhaArray[Yqa.i] = Fha.GAMMA;
        fhaArray[WOa.fa] = Fha.BLOCK_ALTERNATIVES;
        fhaArray[NTa.C] = Fha.FOG_FANCY;
        fhaArray[pPa.f] = Fha.FOG_START;
        k = fhaArray;
    }

    public void A() {
        Object object;
        zna_1 zna_12 = this;
        zna_12.M = oha.J(ROa.L, new Object[uSa.E]);
        zna_12.E.clear();
        int n2 = object = uSa.E;
        while (n2 < k.length) {
            Object a2 = k[object];
            if (a2 != null) {
                zna_1 zna_13 = zna_12;
                reference var3_4 = zna_13.A / uqa.g - BQa.Q + object % uqa.g * rRa.f;
                reference var4_5 = zna_13.I / uua.p + wOa.h * (object / uqa.g) - lqa.s;
                if (((Fha)((Object)a2)).getEnumFloat()) {
                    zna_12.E.add(new xf(((Fha)((Object)a2)).returnEnumOrdinal(), (int)var3_4, (int)var4_5, (Fha)((Object)a2)));
                } else {
                    zna_1 zna_14 = a2;
                    zna_12.E.add(new VF(((Fha)((Object)a2)).returnEnumOrdinal(), (int)var3_4, (int)var4_5, (Fha)((Object)zna_14), zna_12.I.J((Fha)((Object)zna_14))));
                }
            }
            n2 = ++object;
        }
        object = zna_12.I / uua.p + wOa.h * (k.length / uqa.g) - lqa.s;
        Object a2 = uSa.E;
        zna_1 zna_15 = zna_12;
        a2 = zna_15.A / uqa.g - BQa.Q + uSa.E;
        zna_1 zna_16 = zna_12;
        zna_15.E.add(new zf(rQa.Da, a2, object, Kg.J(uOa.la)));
        a2 = zna_16.A / uqa.g - BQa.Q + rRa.f;
        zna_16.E.add(new zf(bqa.P, a2, object, Kg.J(Uta.i)));
        zna_1 zna_17 = zna_12;
        a2 = zna_17.A / uqa.g - BQa.Q + uSa.E;
        zna_17.E.add(new zf(Tqa.K, a2, object += wOa.h, Kg.J(hTa.q)));
        zna_1 zna_18 = zna_12;
        a2 = zna_18.A / uqa.g - BQa.Q + rRa.f;
        zna_18.E.add(new zf(Jra.t, a2, object, Kg.J(nQa.q)));
        zna_1 zna_19 = zna_12;
        a2 = zna_19.A / uqa.g - BQa.Q + uSa.E;
        zna_19.E.add(new zf(qQa.J, a2, object += wOa.h, Kg.J(Fpa.F)));
        zna_1 zna_110 = zna_12;
        a2 = zna_110.A / uqa.g - BQa.Q + rRa.f;
        zna_110.E.add(new zf(Gua.F, a2, object, Kg.J(MRa.D)));
        object += wOa.h;
        zna_16.E.add(new ac(ZOa.x, (int)(zna_12.A / uqa.g - ySa.T), (int)(zna_12.I / uua.p + tua.i + pPa.f), oha.J(cra.g, new Object[uSa.E])));
    }
}

