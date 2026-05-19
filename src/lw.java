/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SRa
 *  XTa
 */
public final class lw
extends RuntimeException {
    private String fieldName;
    private String className;

    @Override
    public String toString() {
        lw a2;
        return new StringBuilder().insert(5 >> 3, SRa.m).append(a2.fieldName).append(rua.V).append(a2.className).append(XTa.Z).toString();
    }

    /*
     * WARNING - void declaration
     */
    public lw(Class clazz, String string) {
        void b2;
        lw a2;
        String c2 = string;
        lw lw2 = a2 = this;
        lw2.fieldName = c2;
        lw2.className = b2.getName();
    }

    @Override
    public String getMessage() {
        lw a2;
        return a2.toString();
    }
}

