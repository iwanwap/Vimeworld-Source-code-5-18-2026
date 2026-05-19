/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DEa
 *  vRa
 */
import java.util.Random;

public final class Sea_2
extends DEa<Integer, Integer> {
    /*
     * WARNING - void declaration
     */
    public Sea_2(int n2, int n3) {
        void b2;
        int c2 = n3;
        Sea_2 a2 = this;
        super((Object)((int)b2), (Object)c2);
    }

    public int J(Random random) {
        Random b2 = random;
        Object a2 = this;
        if ((Integer)a2.J() >= (Integer)a2.f()) {
            return (Integer)a2.J();
        }
        return (Integer)a2.J() + b2.nextInt((Integer)a2.f() - (Integer)a2.J() + vRa.d);
    }
}

