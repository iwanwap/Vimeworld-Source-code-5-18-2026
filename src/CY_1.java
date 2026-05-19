/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  XTa
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
public final class CY_1
extends by {
    private String text;

    public String J() {
        CY_1 a2;
        return a2.text;
    }

    public String C() {
        CY_1 a2;
        return a2.text;
    }

    public CY_1(String string) {
        Object b2 = string;
        CY_1 a2 = this;
        a2.text = b2;
    }

    public void J(String string) {
        Object b2 = string;
        CY_1 a2 = this;
        a2.text = b2;
    }

    public CY J() {
        CY_1 cY_1 = this;
        CY_1 cY_12 = new CY_1(cY_1.text);
        cY_12.J(cY_1.J().J());
        Iterator a2 = cY_1.J().iterator();
        Iterator iterator = a2;
        while (iterator.hasNext()) {
            ld ld2 = (ld)a2.next();
            iterator = a2;
            cY_12.J(ld2.J());
        }
        return cY_12;
    }

    public String toString() {
        CY_1 a2;
        return new StringBuilder().insert(3 ^ 3, XTa.f).append(a2.text).append((char)CRa.L).append(zsa.s).append(a2.siblings).append(psa.b).append(a2.J()).append((char)ySa.Z).toString();
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (!(b2 instanceof CY_1)) {
            return uSa.E != 0;
        }
        Object object2 = b2;
        if (a2.text.equals(((CY_1)((Object)object2)).C()) && super.equals(b2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

