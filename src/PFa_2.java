/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Gg
 *  Mda
 *  Tz
 *  eAa
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class PFa_2
extends eAa {
    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        void b2;
        PFa_2 a2 = this;
        Object d2 = sx2;
        RY rY2 = a2.J((Gg)b2, (Sx)((Object)d2), vRa.d != 0);
        if (rY2 == null) {
            return c2;
        }
        if (rY2.A == AY.BLOCK) {
            XF xF2 = rY2.J();
            if (!b2.J((Sx)((Object)d2), xF2)) {
                return c2;
            }
            if (!((Sx)((Object)d2)).J(xF2.offset(rY2.j), rY2.j, (Mda)c2)) {
                return c2;
            }
            if (b2.J(xF2).J().J() == Material.water) {
                void v0 = c2;
                v0.E -= vRa.d;
                ((Sx)((Object)d2)).J(Tz.H[eAa.J((eAa)a2)]);
                if (v0.E <= 0) {
                    return new Mda((eAa)Gea.aa);
                }
                if (!((Sx)((Object)d2)).K.f(new Mda((eAa)Gea.aa))) {
                    ((Sx)((Object)d2)).J(new Mda((eAa)Gea.aa, vRa.d, uSa.E), uSa.E != 0);
                }
            }
        }
        return c2;
    }

    public PFa_2() {
        PFa_2 a2;
        PFa_2 pFa_2 = a2;
        pFa_2.J(yGa.C);
    }
}

