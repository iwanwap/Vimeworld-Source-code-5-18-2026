/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rx
 *  VQa
 *  XTa
 *  bqa
 */
public class Kw_1
extends RuntimeException {
    public String methodName;
    public String className;
    public Class[] types;

    @Override
    public String toString() {
        Kw_1 a2;
        return new StringBuilder().insert(3 & 4, bqa.U).append(a2.className).append(VQa.ja).append(a2.methodName).append(Rx.f((Class[])a2.types)).append(XTa.Z).toString();
    }

    @Override
    public String getMessage() {
        Kw_1 a2;
        return a2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public Kw_1(Class clazz, String string, Class[] classArray) {
        void c2;
        void b2;
        Class[] d2 = classArray;
        Class[] a2 = this;
        a2.methodName = b2;
        a2.className = c2.getName();
        a2.types = d2;
    }
}

