/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qx
 *  vRa
 */
import java.util.Objects;

public final class qx_2 {
    private boolean j;
    private int J;
    private Object A;
    private String I;

    public int hashCode() {
        qx_2 a2;
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = a2.A;
        objectArray[vRa.d] = a2.J;
        objectArray[uqa.g] = a2.j;
        objectArray[yRa.d] = a2.I;
        return Objects.hash(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public qx_2(Object object, int n2, boolean bl2, String string) {
        String e2;
        void b2;
        void c2;
        void d2;
        qx_2 a2;
        qx_2 qx_22 = string2;
        String string2 = string;
        qx_2 qx_23 = a2 = qx_22;
        qx_23.J(d2, (int)c2, (boolean)b2, e2);
    }

    public boolean equals(Object object) {
        Object b2 = object;
        qx_2 a2 = this;
        b2 = (qx_2)b2;
        if (a2.A == ((qx_2)b2).A && a2.J == ((qx_2)b2).J && a2.j == ((qx_2)b2).j && Objects.equals(a2.I, ((qx_2)b2).I)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public qx J(Object object, int n2, boolean bl2, String string) {
        String e2;
        void b2;
        void c2;
        void d2;
        qx_2 a2;
        qx_2 qx_22 = string2;
        String string2 = string;
        qx_2 qx_23 = a2 = qx_22;
        qx_23.A = d2;
        qx_23.J = c2;
        a2.j = b2;
        a2.I = e2;
        return a2;
    }
}

