/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  Kpa
 *  Oz
 *  aqa
 *  kPa
 *  uw
 *  vRa
 */
import org.apache.commons.lang3.ArrayUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class VS_2 {
    public static float C;
    public static float i;
    private static final String M = "\u041f\u0435\u0440\u0441\u043f\u0435\u043a\u0442\u0438\u0432\u0430";
    public static float k;
    public static float j;
    public static int J;
    public static boolean A;
    public static mIa I;

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3) {
        void a2;
        float f4 = f2;
        float f5 = i;
        float b2 = k;
        k = (float)((double)k + (double)f4 * uSa.W);
        i = (float)((double)i - (double)a2 * uSa.W);
        i = Oz.J((float)i, (float)kPa.Ha, (float)ISa.a);
        j += i - f5;
        C += k - b2;
    }

    public static mIa[] J(mIa[] a2) {
        mIa[] mIaArray = new mIa[vRa.d];
        mIaArray[uSa.E] = I;
        return ArrayUtils.addAll(a2, mIaArray);
    }

    public static void f() {
        if (uw.a) {
            VS_2.J(uSa.E != 0);
            return;
        }
        if (!I.isKeyDown()) {
            VS_2.J(vRa.d != 0);
            return;
        }
        Kpa kpa2 = Kpa.J();
        if (kpa2.c == null) {
            VS_2.J(vRa.d != 0);
            return;
        }
        if (A && kpa2.z.ld != vRa.d) {
            VS_2.J(uSa.E != 0);
            return;
        }
        VS_2.J();
    }

    public VS_2() {
        VS_2 a2;
    }

    public static void J(boolean bl) {
        boolean bl2 = bl;
        if (!A) {
            return;
        }
        A = uSa.E;
        if (J == vRa.d) {
            return;
        }
        Kpa a2 = Kpa.J();
        if (bl2) {
            a2.z.ld = J;
            if (J == 0) {
                a2.R.J(a2.J());
            }
        }
    }

    public static boolean J() {
        return A;
    }

    public static void J() {
        if (A) {
            return;
        }
        A = vRa.d;
        Kpa kpa2 = Kpa.J();
        i = kpa2.c.d;
        k = kpa2.c.X;
        C = kpa2.c.s;
        j = kpa2.c.o;
        J = kpa2.z.ld;
        kpa2.z.ld = vRa.d;
    }

    static {
        I = new mIa(Tqa.E, uSa.E, aqa.m);
    }
}

