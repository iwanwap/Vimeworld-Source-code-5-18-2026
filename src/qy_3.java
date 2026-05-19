/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  qy
 *  vRa
 */
import java.util.Objects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qy_3 {
    private final int j;
    private final int J;
    private final int A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public qy_3(int n2, int n3) {
        void a2;
        int c2 = n2;
        qy_3 b2 = this;
        b2(c2 >> ERa.C, c2 >> Yqa.i & osa.Ja, c2 & osa.Ja, (int)a2);
    }

    public int d() {
        qy_3 a2;
        return a2.A;
    }

    public int C() {
        qy_3 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    public qy_3(int n2, int n3, int n4, int n5) {
        void e2;
        void b2;
        void c2;
        void d2;
        qy_3 a2;
        int n6 = n5;
        qy_3 qy_32 = a2 = this;
        qy_3 qy_33 = a2;
        qy_33.J = d2;
        qy_33.j = c2;
        qy_32.A = b2;
        qy_32.I = e2;
    }

    public int hashCode() {
        qy_3 a2;
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = a2.J;
        objectArray[vRa.d] = a2.j;
        objectArray[uqa.g] = a2.A;
        objectArray[yRa.d] = a2.I;
        return Objects.hash(objectArray);
    }

    public String J() {
        qy_3 a2;
        return Integer.toHexString(a2.l());
    }

    public boolean equals(Object object) {
        Object b2 = object;
        qy_3 a2 = this;
        if (!(b2 instanceof qy_3)) {
            return uSa.E != 0;
        }
        b2 = (qy_3)b2;
        if (a2.J == ((qy_3)b2).J && a2.j == ((qy_3)b2).j && a2.A == ((qy_3)b2).A && a2.I == ((qy_3)b2).I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int l() {
        qy_3 a2;
        return gsa.X | a2.J << ERa.C | a2.j << Yqa.i | a2.A;
    }

    public int f() {
        qy_3 a2;
        return a2.I;
    }

    public int J() {
        qy_3 a2;
        return a2.J;
    }

    public qy J(int n2) {
        int b2 = n2;
        qy_3 a2 = this;
        return new qy_3(Math.max(uSa.E, a2.J - b2), Math.max(uSa.E, a2.j - b2), Math.max(uSa.E, a2.A - b2), a2.I);
    }
}

