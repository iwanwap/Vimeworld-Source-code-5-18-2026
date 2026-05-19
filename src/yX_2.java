/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ez
 *  OCa
 *  Tpa
 *  by
 *  ica
 *  ld
 *  psa
 *  vRa
 *  yX
 *  zsa
 */
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yX_2
extends by {
    private final String name;
    private String value;
    private final String objective;

    public yX J() {
        yX_2 yX_22;
        yX_2 yX_23;
        yX_2 yX_24 = yX_23 = this;
        yX_2 yX_25 = yX_22 = new yX_2(yX_24.name, yX_24.objective);
        yX_25.J(yX_23.value);
        yX_25.J(yX_23.J().J());
        Iterator a2 = yX_23.J().iterator();
        Iterator iterator = a2;
        while (iterator.hasNext()) {
            ld ld2 = (ld)a2.next();
            iterator = a2;
            yX_22.J(ld2.J());
        }
        return yX_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String J() {
        yX_2 yX_22;
        yX_2 yX_23 = this;
        yX_2 a2 = OCa.J();
        if (a2 != null && a2.k() && Ez.J((String)yX_23.value)) {
            ica ica2;
            if ((a2 = a2.J(uSa.E).J()).J(yX_23.name, ica2 = a2.J(yX_23.objective))) {
                a2 = a2.J(yX_23.name, ica2);
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = a2.J();
                yX_23.J(String.format(Tpa.t, objectArray));
                yX_22 = yX_23;
                return yX_22.value;
            }
            yX_23.value = Mqa.y;
        }
        yX_22 = yX_23;
        return yX_22.value;
    }

    /*
     * WARNING - void declaration
     */
    public yX_2(String string, String string2) {
        void b2;
        yX_2 a2;
        Object c2 = string2;
        yX_2 yX_22 = a2 = this;
        a2.value = Mqa.y;
        yX_22.name = b2;
        yX_22.objective = c2;
    }

    public boolean equals(Object object) {
        yX_2 a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof yX_2)) {
            return uSa.E != 0;
        }
        Object object2 = b2;
        if (a2.name.equals(object2.name) && a2.objective.equals(object2.objective) && super.equals(b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String d() {
        yX_2 a2;
        return a2.name;
    }

    public String toString() {
        yX_2 a2;
        return new StringBuilder().insert(3 & 4, opa.W).append(a2.name).append((char)CRa.L).append(tua.ca).append(a2.objective).append((char)CRa.L).append(zsa.s).append(a2.siblings).append(psa.b).append(a2.J()).append((char)ySa.Z).toString();
    }

    public String C() {
        yX_2 a2;
        return a2.objective;
    }

    public void J(String string) {
        Object b2 = string;
        yX_2 a2 = this;
        a2.value = b2;
    }
}

