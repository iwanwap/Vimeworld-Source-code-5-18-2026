/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  NTa
 *  VF
 *  XTa
 *  Ypa
 *  ZOa
 *  ac
 *  cra
 *  lqa
 *  nF
 *  pPa
 *  pua
 *  sMa
 *  vRa
 *  wOa
 *  xf
 *  ysa
 *  zf
 */
public final class zF
extends EC {
    private EC k;
    private static Fha[] j;
    private Cia J;
    public String A;
    private nF I;

    public void A() {
        int n2;
        zF zF2 = this;
        zF2.A = oha.J(ysa.V, new Object[uSa.E]);
        zF2.E.clear();
        int n3 = n2 = uSa.E;
        while (n3 < j.length) {
            Fha a2 = j[n2];
            zF zF3 = zF2;
            reference var3_3 = zF3.A / uqa.g - BQa.Q + n2 % uqa.g * rRa.f;
            reference var4_4 = zF3.I / uua.p + wOa.h * (n2 / uqa.g) - lqa.s;
            if (!a2.getEnumFloat()) {
                Object object = a2;
                zF2.E.add(new VF(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, (Fha)((Object)object), zF2.J.J((Fha)((Object)object))));
            } else {
                zF2.E.add(new xf(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, a2));
            }
            n3 = ++n2;
        }
        zF2.E.add(new ac(ZOa.x, (int)(zF2.A / uqa.g - ySa.T), (int)(zF2.I / uua.p + tua.i + pPa.f), oha.J(cra.g, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public zF(EC eC2, Cia cia) {
        void b2;
        zF a2;
        zF c2 = cia;
        zF zF2 = a2 = this;
        zF zF3 = a2;
        a2.I = new nF((EC)a2);
        zF2.k = b2;
        zF2.J = c2;
    }

    static {
        Fha[] fhaArray = new Fha[hpa.Z];
        fhaArray[uSa.E] = Fha.MIPMAP_LEVELS;
        fhaArray[vRa.d] = Fha.MIPMAP_TYPE;
        fhaArray[uqa.g] = Fha.CLEAR_WATER;
        fhaArray[yRa.d] = Fha.RANDOM_MOBS;
        fhaArray[AQa.P] = Fha.BETTER_GRASS;
        fhaArray[tTa.h] = Fha.BETTER_SNOW;
        fhaArray[uua.p] = Fha.CUSTOM_FONTS;
        fhaArray[XTa.W] = Fha.SWAMP_COLORS;
        fhaArray[Yqa.i] = Fha.SMOOTH_BIOMES;
        fhaArray[WOa.fa] = Fha.CONNECTED_TEXTURES;
        fhaArray[NTa.C] = Fha.NATURAL_TEXTURES;
        fhaArray[pPa.f] = Fha.CUSTOM_SKY;
        fhaArray[lqa.s] = Fha.CUSTOM_ITEMS;
        fhaArray[uua.s] = Fha.DYNAMIC_LIGHTS;
        j = fhaArray;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        zF b2;
        int d2 = n3;
        zF zF2 = b2 = this;
        zF zF3 = b2;
        b2.i();
        zF.J((String)zF3.A, (int)(b2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, d2, (float)a2);
        zF3.I.J((int)c2, d2, b2.E);
    }

    public void J(ac ac2) {
        zF b2 = ac2;
        zF a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C < ZOa.x && b2 instanceof zf) {
                a2.J.f(((zf)b2).f(), vRa.d);
                ((ac)b2).i = a2.J.J(Fha.getEnumOptions(((ac)b2).C));
            }
            if (((ac)b2).C == ZOa.x) {
                zF zF2 = a2;
                zF2.g.z.d();
                zF2.g.J(a2.k);
            }
            if (((ac)b2).C != Fha.AA_LEVEL.ordinal()) {
                b2 = new sMa(a2.g);
                zF zF3 = a2;
                zF3.f(zF3.g, b2.f(), b2.J());
            }
        }
    }
}

