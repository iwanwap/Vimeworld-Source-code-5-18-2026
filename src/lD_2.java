/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cia
 *  EC
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
 *  vRa
 *  wOa
 *  xf
 *  zf
 */
public final class lD_2
extends EC {
    public String k;
    private nF j;
    private EC J;
    private static Fha[] A;
    private Cia I;

    static {
        Fha[] fhaArray = new Fha[XTa.W];
        fhaArray[uSa.E] = Fha.SMOOTH_FPS;
        fhaArray[vRa.d] = Fha.SMOOTH_WORLD;
        fhaArray[uqa.g] = Fha.FAST_RENDER;
        fhaArray[yRa.d] = Fha.FAST_MATH;
        fhaArray[AQa.P] = Fha.CHUNK_UPDATES;
        fhaArray[tTa.h] = Fha.CHUNK_UPDATES_DYNAMIC;
        fhaArray[uua.p] = Fha.LAZY_CHUNK_LOADING;
        A = fhaArray;
    }

    public void J(ac ac2) {
        lD_2 b2 = ac2;
        lD_2 a2 = this;
        if (((ac)b2).J) {
            if (((ac)b2).C < ZOa.x && b2 instanceof zf) {
                a2.I.f(((zf)b2).f(), vRa.d);
                ((ac)b2).i = a2.I.J(Fha.getEnumOptions(((ac)b2).C));
            }
            if (((ac)b2).C == ZOa.x) {
                lD_2 lD_22 = a2;
                lD_22.g.z.d();
                lD_22.g.J(a2.J);
            }
        }
    }

    public void A() {
        int n2;
        lD_2 lD_22 = this;
        lD_22.k = oha.J(Zqa.f, new Object[uSa.E]);
        lD_22.E.clear();
        int n3 = n2 = uSa.E;
        while (n3 < A.length) {
            Fha a2 = A[n2];
            lD_2 lD_23 = lD_22;
            reference var3_3 = lD_23.A / uqa.g - BQa.Q + n2 % uqa.g * rRa.f;
            reference var4_4 = lD_23.I / uua.p + wOa.h * (n2 / uqa.g) - lqa.s;
            if (!a2.getEnumFloat()) {
                Object object = a2;
                lD_22.E.add(new VF(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, (Fha)((Object)object), lD_22.I.J((Fha)((Object)object))));
            } else {
                lD_22.E.add(new xf(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, a2));
            }
            n3 = ++n2;
        }
        lD_22.E.add(new ac(ZOa.x, (int)(lD_22.A / uqa.g - ySa.T), (int)(lD_22.I / uua.p + tua.i + pPa.f), oha.J(cra.g, new Object[uSa.E])));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        lD_2 b2;
        int d2 = n3;
        lD_2 lD_22 = b2 = this;
        lD_2 lD_23 = b2;
        b2.i();
        lD_2.J((String)lD_23.k, (int)(b2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, d2, (float)a2);
        lD_23.j.J((int)c2, d2, b2.E);
    }

    /*
     * WARNING - void declaration
     */
    public lD_2(EC eC2, Cia cia) {
        void b2;
        lD_2 a2;
        lD_2 c2 = cia;
        lD_2 lD_22 = a2 = this;
        lD_2 lD_23 = a2;
        a2.j = new nF((EC)a2);
        lD_22.J = b2;
        lD_22.I = c2;
    }
}

