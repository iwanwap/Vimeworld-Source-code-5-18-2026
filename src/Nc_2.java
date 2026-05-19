/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  RB
 *  fpa
 *  lB
 *  vRa
 */
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Nc_2
extends RB {
    private static final String j = "<custom>";
    private static final String J = "<profile>";
    private lB[] A;
    private RB[] I;

    private static String[] J(lB[] lBArray) {
        int a22;
        lB[] lBArray2 = lBArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = a22 = uSa.E;
        while (n2 < lBArray2.length) {
            lB lB2 = lBArray2[a22];
            arrayList.add(lB2.J());
            n2 = ++a22;
        }
        ArrayList<String> arrayList2 = arrayList;
        arrayList2.add(MQa.m);
        String[] a22 = arrayList2.toArray(new String[arrayList2.size()]);
        return a22;
    }

    public String f(String string) {
        String b2 = string;
        Nc_2 a2 = this;
        if (b2.equals(MQa.m)) {
            return ROa.M;
        }
        return fpa.da;
    }

    public void d() {
        Nc_2 nc_2;
        Nc_2 nc_22 = nc_2 = this;
        Nc_2 a2 = nc_22.J(nc_22.d());
        if (a2 == null || !tc.J((lB)a2, nc_2.I, uSa.E != 0)) {
            Nc_2 nc_23 = nc_2;
            nc_23.C(Nc_2.J(nc_23.A, nc_23.I));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static String J(lB[] lBArray, RB[] rBArray, boolean bl) {
        void a2;
        lB c2 = rBArray;
        lB[] b2 = lBArray;
        if ((c2 = tc.J(b2, (RB[])c2, (boolean)a2)) == null) {
            return MQa.m;
        }
        return c2.J();
    }

    private static String J(lB[] lBArray, RB[] rBArray) {
        lB[] b2 = rBArray;
        lB[] a2 = lBArray;
        return Nc_2.J(a2, (RB[])b2, uSa.E != 0);
    }

    private void C() {
        Nc_2 nc_2;
        Nc_2 nc_22 = nc_2 = this;
        lB lB2 = nc_22.J(nc_22.d());
        if (lB2 != null) {
            int n2;
            String[] stringArray = lB2.J();
            int n3 = n2 = uSa.E;
            while (n3 < stringArray.length) {
                Object a2 = stringArray[n2];
                RB rB2 = nc_2.J((String)a2);
                if (rB2 != null) {
                    a2 = lB2.J((String)a2);
                    rB2.C((String)a2);
                }
                n3 = ++n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private RB J(String string) {
        int b2;
        Nc_2 nc_2 = this;
        int n2 = b2 = uSa.E;
        while (n2 < nc_2.I.length) {
            void a2;
            RB rB2 = nc_2.I[b2];
            if (rB2.e().equals(a2)) {
                return rB2;
            }
            n2 = ++b2;
        }
        return null;
    }

    public String l() {
        return Kg.J(WRa.Ha);
    }

    public String J(String string) {
        String b2 = string;
        Nc_2 a2 = this;
        if (b2.equals(MQa.m)) {
            return Kg.J(PRa.i, MQa.m);
        }
        return pA.J(new StringBuilder().insert(5 >> 3, vsa.l).append(b2).toString(), b2);
    }

    public void J() {
        Nc_2 a2;
        Nc_2 nc_2 = a2;
        super.J();
        if (nc_2.d().equals(MQa.m)) {
            super.J();
        }
        a2.C();
    }

    /*
     * WARNING - void declaration
     */
    private lB J(String string) {
        int b2;
        Nc_2 nc_2 = this;
        int n2 = b2 = uSa.E;
        while (n2 < nc_2.A.length) {
            void a2;
            lB lB2 = nc_2.A[b2];
            if (lB2.J().equals(a2)) {
                return lB2;
            }
            n2 = ++b2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Nc_2(lB[] lBArray, RB[] rBArray) {
        void a2;
        lB[] c2 = lBArray;
        lB[] b2 = this;
        super(sSa.V, Mqa.y, Nc_2.J(c2, (RB[])a2), Nc_2.J(c2), Nc_2.J(c2, (RB[])a2, vRa.d != 0), (String)null);
        b2.A = null;
        b2.I = null;
        b2.A = c2;
        b2.I = a2;
    }
}

