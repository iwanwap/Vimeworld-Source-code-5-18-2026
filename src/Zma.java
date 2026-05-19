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

public final class Zma
implements Comparator<lX> {
    public final /* synthetic */ DMa A;
    public final /* synthetic */ cna I;

    /*
     * WARNING - void declaration
     */
    public Zma(DMa dMa, cna object) {
        void a2;
        Object b2 = object;
        object = this;
        ((Zma)object).A = a2;
        ((Zma)object).I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(lX lX2, lX lX3) {
        Zma zma;
        void a22;
        void b22;
        Zma zma2 = this;
        int b22 = eAa.J((eAa)b22.J());
        int a22 = eAa.J((eAa)a22.J());
        Zma c22 = null;
        aX aX2 = null;
        if (zma2.A.f == uqa.g) {
            c22 = Tz.a[b22];
            aX2 = Tz.a[a22];
            zma = c22;
        } else if (zma2.A.f == 0) {
            c22 = Tz.c[b22];
            aX2 = Tz.c[a22];
            zma = c22;
        } else {
            if (zma2.A.f == vRa.d) {
                c22 = Tz.H[b22];
                aX2 = Tz.H[a22];
            }
            zma = c22;
        }
        if (zma != null || aX2 != null) {
            int n2;
            if (c22 == null) {
                return vRa.d;
            }
            if (aX2 == null) {
                return pua.o;
            }
            Zma zma3 = zma2;
            int c22 = cna.J(zma3.A.C).J((aX)c22);
            if (c22 != (n2 = cna.J(zma3.A.C).J(aX2))) {
                return (c22 - n2) * zma2.A.i;
            }
        }
        return b22 - a22;
    }
}

