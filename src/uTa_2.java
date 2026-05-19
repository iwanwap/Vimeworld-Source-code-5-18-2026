/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RTa
 *  Vta
 *  YTa
 *  Yta
 *  bSa
 *  ksa
 *  uTa
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class uTa_2 {
    public static HashMap<String, uTa> M = new HashMap();
    public static ksa k;
    public static Yta j;
    public static RTa J;
    public static Vta A;
    public boolean I = uSa.E;

    public abstract void J(ArrayList<YTa> var1);

    static {
        J = new RTa();
        j = new Yta();
        k = new ksa();
        A = new Vta();
    }

    public static String[] J() {
        Iterator<String> iterator;
        String[] stringArray = new String[M.size()];
        int n2 = uSa.E;
        Iterator<String> iterator2 = iterator = M.keySet().iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            iterator2 = iterator;
            stringArray[n2++] = string;
        }
        return stringArray;
    }

    public static uTa J(String a2) {
        return (uTa_2)M.get(a2);
    }

    public static void J(String string, uTa uTa2) {
        String b2 = uTa2;
        String a2 = string;
        M.put(a2, (uTa)b2);
    }

    public static void J() {
        uTa_2.J(bSa.u, (uTa)J);
        uTa_2.J(nqa.h, (uTa)k);
        uTa_2.J(IPa.M, (uTa)A);
        uTa_2.J(PRa.Ga, (uTa)j);
    }

    public abstract YTa J(YTa var1, YTa var2, double var3, double var5);

    public uTa_2() {
        uTa_2 a2;
    }
}

