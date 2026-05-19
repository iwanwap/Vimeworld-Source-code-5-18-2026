/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lqa
 *  NTa
 *  PD
 *  RD
 *  XSa
 *  XTa
 *  eg
 *  vRa
 *  ve
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public final class hF {
    private static final Map<Character, IntFunction<Integer>> I = new HashMap<Character, IntFunction<Integer>>();

    public static /* synthetic */ Integer M(int a2) {
        return a2 * Psa.M * PRa.U;
    }

    public static /* synthetic */ Integer e(int a2) {
        return a2 * Psa.M * Psa.M * osa.c * PRa.U;
    }

    public static /* synthetic */ Integer d(int a2) {
        return a2 * PRa.U;
    }

    static {
        I.put(Character.valueOf((char)XSa.C), Eg.J());
        I.put(Character.valueOf((char)pta.ba), PD.J());
        I.put(Character.valueOf((char)rSa.i), ve.J());
        I.put(Character.valueOf((char)Lqa.h), RD.J());
        I.put(Character.valueOf((char)ySa.T), le.J());
        I.put(Character.valueOf((char)yta.g), eg.J());
        I.put(Character.valueOf((char)APa.J), WD.J());
    }

    public static /* synthetic */ Integer C(int a2) {
        return a2 * Psa.M * Psa.M * osa.c * Gta.Z * PRa.U;
    }

    public static /* synthetic */ Integer l(int a2) {
        return a2 * Psa.M * Psa.M * osa.c * XTa.W * PRa.U;
    }

    public static int J(String string) throws IllegalArgumentException {
        int n2;
        String string2 = string;
        if ((string2 = string2.trim()).isEmpty()) {
            return uSa.E;
        }
        int n3 = uSa.E;
        int a2 = uSa.E;
        int n4 = uSa.E;
        char[] cArray = string2.toCharArray();
        int n5 = cArray.length;
        int n6 = n2 = uSa.E;
        while (n6 < n5) {
            char c2 = cArray[n2];
            if (Character.isDigit(c2)) {
                if (n4 != 0) {
                    a2 *= NTa.C;
                }
                n4 = vRa.d;
                a2 += Character.getNumericValue(c2);
            } else {
                IntFunction<Integer> intFunction = I.get(Character.valueOf(c2));
                if (n4 == 0) {
                    throw new IllegalArgumentException(XTa.N);
                }
                if (intFunction == null) {
                    throw new IllegalArgumentException(new StringBuilder().insert(5 >> 3, qQa.ba).append(c2).append(XTa.Z).toString());
                }
                n3 += intFunction.apply(a2).intValue();
                a2 = uSa.E;
                n4 = uSa.E;
            }
            n6 = ++n2;
        }
        return n3 += a2;
    }

    public static /* synthetic */ Integer f(int a2) {
        return a2;
    }

    public hF() {
        hF a2;
    }

    public static /* synthetic */ Integer J(int a2) {
        return a2 * Psa.M * Psa.M * PRa.U;
    }
}

