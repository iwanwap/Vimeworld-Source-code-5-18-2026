/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hs
 *  dT
 */
public final class ou_1
extends Hs {
    private final String sneakName;
    private final String idleName;
    private xB walk;
    private xB idle;
    private final String walkName;
    private xB sneak;

    /*
     * WARNING - void declaration
     */
    public ou_1(String string, String string2, String string3) {
        void b2;
        void c2;
        ou_1 a2;
        Object d2 = string3;
        ou_1 ou_12 = a2 = this;
        a2.idleName = c2;
        ou_12.walkName = b2;
        ou_12.sneakName = d2;
    }

    /*
     * WARNING - void declaration
     */
    public void f(dT dT2) {
        void a2;
        ou_1 ou_12 = this;
        ou_1 b2 = ou_12.model.J((dT)a2);
        if (a2.J() > Nra.e) {
            b2.J(ou_12.walk);
            return;
        }
        if (a2.f()) {
            b2.J(ou_12.sneak);
            return;
        }
        b2.J(ou_12.idle);
    }

    public void J() {
        ou_1 a2;
        a2.idle = a2.model.J().get(a2.idleName);
        a2.walk = a2.model.J().get(a2.walkName);
        a2.sneak = a2.model.J().get(a2.sneakName);
    }
}

