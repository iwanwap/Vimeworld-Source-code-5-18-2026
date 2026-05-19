/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cia
 *  EC
 *  VF
 *  XTa
 *  Ypa
 *  ZOa
 *  ac
 *  cra
 *  kqa
 *  l
 *  lqa
 *  nF
 *  pPa
 *  pua
 *  vRa
 *  wOa
 *  xf
 *  zf
 */
public final class oF_3
extends EC
implements l {
    private static Fha[] k;
    private Cia j;
    public String J;
    private EC A;
    private nF I;

    /*
     * WARNING - void declaration
     */
    public oF_3(EC eC2, Cia cia2) {
        void b2;
        oF_3 a2;
        oF_3 c2 = cia2;
        oF_3 oF_32 = a2 = this;
        oF_3 oF_33 = a2;
        a2.I = new nF((EC)a2);
        oF_32.A = b2;
        oF_32.j = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void c2;
        oF_3 b2;
        int d2 = n3;
        oF_3 oF_32 = b2 = this;
        oF_3 oF_33 = b2;
        b2.i();
        oF_3.J((String)oF_33.J, (int)(b2.A / uqa.g), (int)Ypa.A, (int)pua.o);
        super.J((int)c2, d2, (float)a2);
        oF_33.I.J((int)c2, d2, b2.E);
    }

    static {
        Fha[] fhaArray = new Fha[WOa.fa];
        fhaArray[uSa.E] = Fha.LAGOMETER;
        fhaArray[vRa.d] = Fha.PROFILER;
        fhaArray[uqa.g] = Fha.WEATHER;
        fhaArray[yRa.d] = Fha.TIME;
        fhaArray[AQa.P] = Fha.USE_FULLSCREEN;
        fhaArray[tTa.h] = Fha.FULLSCREEN_MODE;
        fhaArray[uua.p] = Fha.SHOW_FPS;
        fhaArray[XTa.W] = Fha.AUTOSAVE_TICKS;
        fhaArray[Yqa.i] = Fha.ANAGLYPH;
        k = fhaArray;
    }

    public void J(ac ac2) {
        EC b2 = ac2;
        oF_3 a2 = this;
        if (b2.J) {
            if (b2.C < ZOa.x && b2 instanceof zf) {
                a2.j.f(((zf)b2).f(), vRa.d);
                b2.i = a2.j.J(Fha.getEnumOptions(b2.C));
            }
            if (b2.C == ZOa.x) {
                oF_3 oF_32 = a2;
                oF_32.g.z.d();
                oF_32.g.J(a2.A);
            }
            if (b2.C == vTa.y) {
                a2.g.z.d();
                b2 = new Vma(a2, oha.J(Bsa.w, new Object[uSa.E]), Mqa.y, pta.r);
                a2.g.J(b2);
            }
        }
    }

    public void J(boolean bl2, int n2) {
        boolean c2 = bl2;
        oF_3 b2 = this;
        if (c2) {
            oF_3 oF_32 = b2;
            oF_32.g.z.l();
            oF_32.g.l();
        }
        b2.g.J((EC)b2);
    }

    public void A() {
        int n2;
        oF_3 oF_32 = this;
        oF_32.J = oha.J(XOa.k, new Object[uSa.E]);
        oF_32.E.clear();
        int n3 = n2 = uSa.E;
        while (n3 < k.length) {
            Fha a2 = k[n2];
            oF_3 oF_33 = oF_32;
            reference var3_3 = oF_33.A / uqa.g - BQa.Q + n2 % uqa.g * rRa.f;
            reference var4_4 = oF_33.I / uua.p + wOa.h * (n2 / uqa.g) - lqa.s;
            if (!a2.getEnumFloat()) {
                Object object = a2;
                oF_32.E.add(new VF(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, (Fha)((Object)object), oF_32.j.J((Fha)((Object)object))));
            } else {
                oF_32.E.add(new xf(a2.returnEnumOrdinal(), (int)var3_3, (int)var4_4, a2));
            }
            n3 = ++n2;
        }
        oF_32.E.add(new ac(vTa.y, (int)(oF_32.A / uqa.g - ySa.T), (int)(oF_32.I / uua.p + tua.i + pPa.f - Yqa.D), oha.J(kqa.w, new Object[uSa.E])));
        oF_32.E.add(new ac(ZOa.x, (int)(oF_32.A / uqa.g - ySa.T), (int)(oF_32.I / uua.p + tua.i + pPa.f), oha.J(cra.g, new Object[uSa.E])));
    }
}

