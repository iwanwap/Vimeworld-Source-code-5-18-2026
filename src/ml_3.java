/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
public final class ml_3 {
    public yG j;
    public yG J;
    public String A;
    public boolean I;

    public ml_3(jn jn2) {
        Object object;
        jn b2 = jn2;
        ml_3 a2 = this;
        Object object2 = b2;
        a2.I = vRa.d;
        a2.A = b2.getTarget();
        a2.J = yG.fromProto(((jn)object2).getLocation(), yG.RIGHT);
        if (((jn)object2).hasOrientation()) {
            Object object3 = b2;
            object = object3;
            a2.j = yG.fromProto(((jn)object3).getOrientation(), yG.RIGHT);
        } else {
            a2.j = a2.J;
            object = b2;
        }
        if (((jn)object).hasRemoveWhenParentRemove()) {
            a2.I = b2.getRemoveWhenParentRemove();
        }
    }

    /*
     * WARNING - void declaration
     */
    public ml_3(String string, yG yG2) {
        void b2;
        ml_3 a2;
        Object c2 = yG2;
        ml_3 ml_32 = a2 = this;
        a2.I = vRa.d;
        a2.A = b2;
        ml_32.J = c2;
        ml_32.j = c2;
    }
}

