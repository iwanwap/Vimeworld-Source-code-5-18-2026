/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gaa
 *  by
 *  ld
 *  psa
 *  vRa
 *  zsa
 */
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Gaa_1
extends by {
    private final String selector;

    public Gaa_1(String string) {
        Object b2 = string;
        Gaa_1 a2 = this;
        a2.selector = b2;
    }

    public boolean equals(Object object) {
        Gaa_1 a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof Gaa_1)) {
            return uSa.E != 0;
        }
        Object object2 = b2;
        if (a2.selector.equals(object2.selector) && super.equals(b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Gaa J() {
        Gaa_1 gaa_1 = this;
        Gaa_1 gaa_12 = new Gaa_1(gaa_1.selector);
        gaa_12.J(gaa_1.J().J());
        Iterator a2 = gaa_1.J().iterator();
        Iterator iterator = a2;
        while (iterator.hasNext()) {
            ld ld2 = (ld)a2.next();
            iterator = a2;
            gaa_12.J(ld2.J());
        }
        return gaa_12;
    }

    public String J() {
        Gaa_1 a2;
        return a2.selector;
    }

    public String C() {
        Gaa_1 a2;
        return a2.selector;
    }

    public String toString() {
        Gaa_1 a2;
        return new StringBuilder().insert(3 & 4, rta.W).append(a2.selector).append((char)CRa.L).append(zsa.s).append(a2.siblings).append(psa.b).append(a2.J()).append((char)ySa.Z).toString();
    }
}

