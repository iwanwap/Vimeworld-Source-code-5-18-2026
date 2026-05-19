/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tz
 *  aX
 *  eAa
 *  lX
 *  pua
 *  vRa
 */
import java.util.Comparator;

public final class voa_1
implements Comparator<lX> {
    public final /* synthetic */ Ima A;
    public final /* synthetic */ cna I;

    /*
     * WARNING - void declaration
     */
    public int J(lX lX2, lX lX3) {
        voa_1 voa_12;
        void a22;
        void b22;
        voa_1 voa_13 = this;
        int b22 = eAa.J((eAa)b22.J());
        int a22 = eAa.J((eAa)a22.J());
        voa_1 c22 = null;
        aX aX2 = null;
        if (voa_13.A.f == 0) {
            c22 = Tz.l[b22];
            aX2 = Tz.l[a22];
            voa_12 = c22;
        } else if (voa_13.A.f == vRa.d) {
            c22 = Tz.c[b22];
            aX2 = Tz.c[a22];
            voa_12 = c22;
        } else {
            if (voa_13.A.f == uqa.g) {
                c22 = Tz.H[b22];
                aX2 = Tz.H[a22];
            }
            voa_12 = c22;
        }
        if (voa_12 != null || aX2 != null) {
            int n2;
            if (c22 == null) {
                return vRa.d;
            }
            if (aX2 == null) {
                return pua.o;
            }
            voa_1 voa_14 = voa_13;
            int c22 = cna.J(voa_14.A.C).J((aX)c22);
            if (c22 != (n2 = cna.J(voa_14.A.C).J(aX2))) {
                return (c22 - n2) * voa_13.A.i;
            }
        }
        return b22 - a22;
    }

    /*
     * WARNING - void declaration
     */
    public voa_1(Ima ima, cna object) {
        void a2;
        Object b2 = object;
        object = this;
        ((voa_1)object).A = a2;
        ((voa_1)object).I = b2;
    }
}

