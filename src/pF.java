/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
 *  ERa
 *  NPa
 *  NTa
 *  VF
 *  XTa
 *  Ypa
 *  ZOa
 *  ZRa
 *  ac
 *  cra
 *  lqa
 *  pPa
 *  pua
 *  sMa
 *  vRa
 *  wOa
 *  xf
 *  zf
 */
public final class pF
extends EC {
    public String j;
    private EC J;
    private Cia A;
    private static Fha[] I;

    public void J(ac ac2) {
        pF b2 = ac2;
        pF a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C < ZOa.x && b2 instanceof zf) {
                a2.A.f(((zf)b2).f(), vRa.d);
                ((ac)b2).i = a2.A.J(Fha.getEnumOptions(((ac)b2).C));
            }
            if (((ac)b2).C == ZOa.x) {
                pF pF2 = a2;
                pF2.g.z.d();
                pF2.g.J(a2.J);
            }
            if (((ac)b2).C == vTa.y) {
                a2.g.z.J(vRa.d != 0);
            }
            if (((ac)b2).C == qQa.J) {
                a2.g.z.J(uSa.E != 0);
            }
            b2 = new sMa(a2.g);
            pF pF3 = a2;
            pF3.f(pF3.g, b2.f(), b2.J());
        }
    }

    public void A() {
        int n2;
        pF pF2 = this;
        pF2.j = oha.J(ZRa.h, new Object[uSa.E]);
        pF2.E.clear();
        int n3 = n2 = uSa.E;
        while (n3 < I.length) {
            Fha a2 = I[n2];
            pF pF3 = pF2;
            reference var3_3 = pF3.A / uqa.g - BQa.Q + n2 % uqa.g * rRa.f;
            reference var4_4 = pF3.I / uua.p + wOa.h * (n2 / uqa.g) - lqa.s;
            if (!a2.getEnumFloat()) {
                Object object = a2;
                pF2.E.add(new VF(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, (Fha)((Object)object), pF2.A.J((Fha)((Object)object))));
            } else {
                pF2.E.add(new xf(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, a2));
            }
            n3 = ++n2;
        }
        pF pF4 = pF2;
        pF4.E.add(new ac(vTa.y, (int)(pF2.A / uqa.g - BQa.Q), (int)(pF2.I / uua.p + tua.i + pPa.f), NPa.e, kTa.j, Kg.J(Lsa.H)));
        pF2.E.add(new ac(qQa.J, (int)(pF2.A / uqa.g - BQa.Q + Fua.J), (int)(pF2.I / uua.p + tua.i + pPa.f), NPa.e, kTa.j, Kg.J(Qra.m)));
        pF4.E.add(new zf(ZOa.x, (int)(pF2.A / uqa.g + tTa.h), (int)(pF2.I / uua.p + tua.i + pPa.f), oha.J(cra.g, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public pF(EC eC2, Cia cia) {
        void b2;
        pF a2;
        pF c2 = cia;
        pF pF2 = a2 = this;
        pF2.J = b2;
        pF2.A = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        pF a2;
        float d2 = f2;
        pF pF2 = a2 = this;
        a2.i();
        pF.J((String)pF2.j, (int)(a2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, (int)b2, d2);
    }

    static {
        Fha[] fhaArray = new Fha[yOa.B];
        fhaArray[uSa.E] = Fha.ANIMATED_WATER;
        fhaArray[vRa.d] = Fha.ANIMATED_LAVA;
        fhaArray[uqa.g] = Fha.ANIMATED_FIRE;
        fhaArray[yRa.d] = Fha.ANIMATED_PORTAL;
        fhaArray[AQa.P] = Fha.ANIMATED_REDSTONE;
        fhaArray[tTa.h] = Fha.ANIMATED_EXPLOSION;
        fhaArray[uua.p] = Fha.ANIMATED_FLAME;
        fhaArray[XTa.W] = Fha.ANIMATED_SMOKE;
        fhaArray[Yqa.i] = Fha.VOID_PARTICLES;
        fhaArray[WOa.fa] = Fha.WATER_PARTICLES;
        fhaArray[NTa.C] = Fha.RAIN_SPLASH;
        fhaArray[pPa.f] = Fha.PORTAL_PARTICLES;
        fhaArray[lqa.s] = Fha.POTION_PARTICLES;
        fhaArray[uua.s] = Fha.DRIPPING_WATER_LAVA;
        fhaArray[hpa.Z] = Fha.ANIMATED_TERRAIN;
        fhaArray[Ypa.A] = Fha.ANIMATED_TEXTURES;
        fhaArray[ERa.C] = Fha.FIREWORK_PARTICLES;
        fhaArray[yta.Ka] = Fha.PARTICLES;
        I = fhaArray;
    }
}

