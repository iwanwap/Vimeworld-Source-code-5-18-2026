/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xr_1 {
    public static final Random I = new Random();

    public static float J(float f2, float f3) {
        float b2 = f3;
        float a2 = f2;
        float f4 = Math.min(a2, b2);
        b2 = Math.max(a2, b2);
        return Xr_1.J() * (b2 - f4) + f4;
    }

    public static int J(int a2) {
        return I.nextInt(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3) {
        void a2;
        int b2;
        int n4 = n2;
        int n5 = b2 = Math.min(n4, (int)a2);
        return n5 + Xr_1.J(Math.max(n4, (int)a2) - n5 + vRa.d);
    }

    public static float J() {
        return I.nextFloat();
    }

    public static boolean J() {
        return I.nextBoolean();
    }

    public static <T> T J(List<T> a2) {
        List<T> list = a2;
        return list.get(Xr_1.J(list.size()));
    }

    public static <T> T J(Collection<T> collection) {
        int n2;
        Collection<T> collection2 = collection;
        if (collection2 instanceof List) {
            return Xr_1.J((List)collection2);
        }
        Collection<T> collection3 = collection2;
        int n3 = Xr_1.J(collection3.size());
        Iterator<T> a2 = collection3.iterator();
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            a2.next();
            n4 = ++n2;
        }
        return (T)a2.next();
    }

    @SafeVarargs
    public static <T> T J(T ... a2) {
        return a2[Xr_1.J(a2.length)];
    }

    public static double J() {
        return I.nextDouble();
    }

    private Xr_1() {
        Xr_1 a2;
    }

    public static double J(double b2, double a2) {
        double d2 = Math.min(b2, a2);
        a2 = Math.max(b2, a2);
        return Xr_1.J() * (a2 - d2) + d2;
    }
}

