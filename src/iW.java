/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dpa
 *  hra
 *  jRa
 *  mra
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iW {
    private static List<int[]> k;
    private static List<int[]> j;
    private static int J;
    private static List<int[]> A;
    private static List<int[]> I;

    public static synchronized void J() {
        if (!k.isEmpty()) {
            k.remove(k.size() - vRa.d);
        }
        if (!I.isEmpty()) {
            I.remove(I.size() - vRa.d);
        }
        k.addAll(A);
        I.addAll(j);
        A.clear();
        j.clear();
    }

    public iW() {
        iW a2;
    }

    public static synchronized String J() {
        return new StringBuilder().insert(5 >> 3, dpa.s).append(k.size()).append(jRa.Ha).append(I.size()).append(mra.S).append(A.size()).append(Asa.k).append(j.size()).toString();
    }

    public static synchronized int[] J(int n2) {
        int n3 = n2;
        if (n3 <= hra.Ja) {
            if (I.isEmpty()) {
                int[] a2 = new int[hra.Ja];
                j.add(a2);
                return a2;
            }
            int[] a2 = I.remove(I.size() - vRa.d);
            j.add(a2);
            return a2;
        }
        if (n3 > J) {
            J = n3;
            k.clear();
            A.clear();
            int[] a2 = new int[J];
            A.add(a2);
            return a2;
        }
        if (k.isEmpty()) {
            int[] a2 = new int[J];
            A.add(a2);
            return a2;
        }
        int[] a2 = k.remove(k.size() - vRa.d);
        A.add(a2);
        return a2;
    }

    static {
        J = hra.Ja;
        I = Lists.newArrayList();
        j = Lists.newArrayList();
        k = Lists.newArrayList();
        A = Lists.newArrayList();
    }
}

