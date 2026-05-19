/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  bSa
 *  vRa
 */
import java.util.BitSet;
import java.util.Set;

public final class KKa_1 {
    private static final int A = DZ.values().length;
    private final BitSet I;

    /*
     * WARNING - void declaration
     */
    public void J(DZ dZ2, DZ dZ3, boolean bl) {
        void b2;
        void c2;
        KKa_1 a2;
        boolean d2 = bl;
        KKa_1 kKa_1 = a2 = this;
        kKa_1.I.set(c2.ordinal() + b2.ordinal() * A, d2);
        kKa_1.I.set(b2.ordinal() + c2.ordinal() * A, d2);
    }

    public KKa_1() {
        KKa_1 a2;
        KKa_1 kKa_1 = a2;
        kKa_1.I = new BitSet(A * A);
    }

    public String toString() {
        DZ dZ2;
        int n2;
        KKa_1 kKa_1 = this;
        StringBuilder a2 = new StringBuilder();
        a2.append((char)fPa.i);
        DZ[] dZArray = DZ.values();
        int n3 = dZArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            dZ2 = dZArray[n2];
            a2.append((char)fPa.i).append(dZ2.toString().toUpperCase().charAt(uSa.E));
            n4 = ++n2;
        }
        a2.append((char)NTa.C);
        dZArray = DZ.values();
        n3 = dZArray.length;
        int n5 = n2 = uSa.E;
        while (n5 < n3) {
            dZ2 = dZArray[n2];
            a2.append(dZ2.toString().toUpperCase().charAt(uSa.E));
            DZ[] dZArray2 = DZ.values();
            int n6 = dZArray2.length;
            int n7 = uSa.E;
            while (n7 < n6) {
                int n8;
                DZ dZ3 = dZArray2[n8];
                if (dZ2 == dZ3) {
                    a2.append(Hta.V);
                } else {
                    boolean bl = kKa_1.J(dZ2, dZ3);
                    a2.append((char)fPa.i).append((char)(bl ? bSa.Da : Iqa.M));
                }
                n7 = ++n8;
            }
            a2.append((char)NTa.C);
            n5 = ++n2;
        }
        return a2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Set<DZ> set) {
        void a2;
        KKa_1 kKa_1 = this;
        for (DZ dZ2 : a2) {
            Object object = a2.iterator();
            while (object.hasNext()) {
                Object b2;
                DZ dZ3 = (DZ)((Object)b2.next());
                object = b2;
                kKa_1.J(dZ2, dZ3, vRa.d != 0);
            }
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        KKa_1 a2 = this;
        a2.I.set(uSa.E, a2.I.size(), b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(DZ dZ2, DZ dZ3) {
        void b2;
        DZ c2 = dZ3;
        KKa_1 a2 = this;
        return a2.I.get(b2.ordinal() + c2.ordinal() * A);
    }
}

