/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aX
 *  eAa
 *  ld
 */
public final class lX_2
extends aX {
    private final eAa field_150960_a;

    /*
     * WARNING - void declaration
     */
    public lX_2(String string, String string2, ld ld2, eAa eAa2) {
        void a2;
        void b2;
        void d2;
        Object e22 = string2;
        lX_2 c2 = this;
        super((String)d2 + (String)e22, (ld)b2);
        c2.field_150960_a = a2;
        int e22 = eAa.J((eAa)c2.field_150960_a);
        if (e22 != 0) {
            lb.A.put(new StringBuilder().insert(3 ^ 3, (String)d2).append(e22).toString(), c2.J());
        }
    }

    public eAa J() {
        lX_2 a2;
        return a2.field_150960_a;
    }
}

