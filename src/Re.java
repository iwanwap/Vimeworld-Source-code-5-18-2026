/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  NTa
 *  VF
 *  Vua
 *  XTa
 *  Ypa
 *  ZOa
 *  ac
 *  cra
 *  lqa
 *  nF
 *  pPa
 *  pua
 *  vRa
 *  wOa
 *  xf
 *  zf
 */
public final class Re
extends EC {
    private nF k;
    private Cia j;
    public String J;
    private static Fha[] A;
    private EC I;

    /*
     * WARNING - void declaration
     */
    public Re(EC eC2, Cia cia) {
        void b2;
        Re a2;
        Re c2 = cia;
        Re re2 = a2 = this;
        Re re3 = a2;
        a2.k = new nF((EC)a2);
        re2.I = b2;
        re2.j = c2;
    }

    static {
        Fha[] fhaArray = new Fha[hpa.Z];
        fhaArray[uSa.E] = Fha.CLOUDS;
        fhaArray[vRa.d] = Fha.CLOUD_HEIGHT;
        fhaArray[uqa.g] = Fha.TREES;
        fhaArray[yRa.d] = Fha.RAIN;
        fhaArray[AQa.P] = Fha.SKY;
        fhaArray[tTa.h] = Fha.STARS;
        fhaArray[uua.p] = Fha.SUN_MOON;
        fhaArray[XTa.W] = Fha.SHOW_CAPES;
        fhaArray[Yqa.i] = Fha.TRANSLUCENT_BLOCKS;
        fhaArray[WOa.fa] = Fha.HELD_ITEM_TOOLTIPS;
        fhaArray[NTa.C] = Fha.DROPPED_ITEMS;
        fhaArray[pPa.f] = Fha.ENTITY_SHADOWS;
        fhaArray[lqa.s] = Fha.VIGNETTE;
        fhaArray[uua.s] = Fha.DYNAMIC_FOV;
        A = fhaArray;
    }

    public void J(ac ac2) {
        Re b2 = ac2;
        Re a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C < ZOa.x && b2 instanceof zf) {
                a2.j.f(((zf)b2).f(), vRa.d);
                ((ac)b2).i = a2.j.J(Fha.getEnumOptions(((ac)b2).C));
            }
            if (((ac)b2).C == ZOa.x) {
                Re re2 = a2;
                re2.g.z.d();
                re2.g.J(a2.I);
            }
        }
    }

    public void A() {
        int n2;
        Re re2 = this;
        re2.J = oha.J(Vua.k, new Object[uSa.E]);
        re2.E.clear();
        int n3 = n2 = uSa.E;
        while (n3 < A.length) {
            Fha a2 = A[n2];
            Re re3 = re2;
            reference var3_3 = re3.A / uqa.g - BQa.Q + n2 % uqa.g * rRa.f;
            reference var4_4 = re3.I / uua.p + wOa.h * (n2 / uqa.g) - lqa.s;
            if (!a2.getEnumFloat()) {
                Object object = a2;
                re2.E.add(new VF(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, (Fha)((Object)object), re2.j.J((Fha)((Object)object))));
            } else {
                re2.E.add(new xf(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, a2));
            }
            n3 = ++n2;
        }
        re2.E.add(new ac(ZOa.x, (int)(re2.A / uqa.g - ySa.T), (int)(re2.I / uua.p + tua.i + pPa.f), oha.J(cra.g, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        Re b2;
        int d2 = n3;
        Re re2 = b2 = this;
        Re re3 = b2;
        b2.i();
        Re.J((String)re3.J, (int)(b2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, d2, (float)a2);
        re3.k.J((int)c2, d2, b2.E);
    }
}

