/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FEa
 *  Gg
 *  Mda
 *  WFa
 *  YDa
 *  eAa
 *  vL
 *  vRa
 */
public final class vda_3
extends eAa {
    private final Class<? extends YDa> I;

    /*
     * WARNING - void declaration
     */
    private YDa J(Gg gg2, XF xF2, DZ dZ2) {
        void b2;
        void c2;
        Object d2 = dZ2;
        vda_3 a2 = this;
        if (a2.I == WFa.class) {
            return new WFa((Gg)c2, (XF)b2, (DZ)((Object)d2));
        }
        if (a2.I == FEa.class) {
            return new FEa((Gg)c2, (XF)b2, (DZ)((Object)d2));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        void h2;
        XF e2;
        YDa g2;
        Object i2;
        vda_3 vda_32 = object;
        Object object = dZ2;
        vda_3 d2 = vda_32;
        if (i2 == DZ.DOWN) {
            return uSa.E != 0;
        }
        if (i2 == DZ.UP) {
            return uSa.E != 0;
        }
        if (!g2.J(e2 = e2.offset((DZ)((Object)i2)), (DZ)((Object)i2), (Mda)h2)) {
            return uSa.E != 0;
        }
        g2 = d2.J((Gg)f5, e2, (DZ)((Object)i2));
        if (g2 != null && g2.l()) {
            if (!f5.e) {
                f5.f((vL)g2);
            }
            h2.E -= vRa.d;
        }
        return vRa.d != 0;
    }

    public vda_3(Class<? extends YDa> clazz) {
        vda_3 a2;
        Object b2 = clazz;
        vda_3 vda_32 = a2 = this;
        vda_32.I = b2;
        vda_32.J(yGa.a);
    }
}

