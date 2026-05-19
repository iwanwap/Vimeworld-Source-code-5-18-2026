/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Pqa
 *  Vua
 *  Yfa
 *  oX
 */
public final class AZ_1
extends oX {
    public int J;
    public int A;
    public Class<? extends Yfa> I;

    /*
     * WARNING - void declaration
     */
    public AZ_1(Class<? extends Yfa> clazz, int n2, int n3, int n4) {
        void e2;
        void b2;
        void d2;
        void c2;
        AZ_1 a2;
        int n5 = n4;
        AZ_1 aZ_1 = a2 = this;
        super((int)c2);
        a2.I = d2;
        aZ_1.J = b2;
        aZ_1.A = e2;
    }

    public String toString() {
        AZ_1 a2;
        return new StringBuilder().insert(2 & 5, a2.I.getSimpleName()).append(Pua.J).append(a2.J).append(Vua.m).append(a2.A).append(Pqa.N).append(a2.itemWeight).toString();
    }
}

