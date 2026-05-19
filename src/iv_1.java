/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Nx
 *  Uw
 *  Waa
 *  pW
 *  vRa
 */
import java.util.List;
import java.util.Random;

public final class iv_1
extends Nx {
    private boolean hasMoreThanTwoComponents;

    /*
     * WARNING - void declaration
     */
    public iv_1(Gg gg2, Random random, int n2, int n3, int n4) {
        Uw e2;
        int a2;
        void d2;
        void b22;
        void c22;
        iv_1 iv_12;
        iv_1 iv_13 = iv_12 = this;
        super((int)c22, (int)b22);
        Object f2 = pw.J((Random)d2, a2);
        e2 = new Uw(e2.J(), uSa.E, (Random)d2, (int)((c22 << AQa.P) + uqa.g), (int)((b22 << AQa.P) + uqa.g), (List)f2, a2);
        iv_13.components.add(e2);
        Uw uw2 = e2;
        uw2.J((uU)uw2, (List)iv_12.components, (Random)d2);
        List c22 = uw2.field_74930_j;
        List b22 = uw2.field_74932_i;
        List list = c22;
        while (!list.isEmpty() || !b22.isEmpty()) {
            if (c22.isEmpty()) {
                List list2 = b22;
                a2 = d2.nextInt(list2.size());
                f2 = (uU)list2.remove(a2);
                list = c22;
                ((uU)f2).J((uU)e2, iv_12.components, (Random)d2);
                continue;
            }
            a2 = d2.nextInt(c22.size());
            f2 = (uU)c22.remove(a2);
            list = c22;
            ((uU)f2).J((uU)e2, iv_12.components, (Random)d2);
        }
        iv_1 iv_14 = iv_12;
        iv_14.J();
        a2 = uSa.E;
        f2 = iv_14.components.iterator();
        while (f2.hasNext()) {
            if ((uU)f2.next() instanceof pW) continue;
            ++a2;
        }
        iv_12.hasMoreThanTwoComponents = a2 > uqa.g ? vRa.d : uSa.E;
    }

    public iv_1() {
        iv_1 a2;
    }

    public void f(Waa waa2) {
        iv_1 b2 = waa2;
        iv_1 a2 = this;
        super.f((Waa)b2);
        a2.hasMoreThanTwoComponents = b2.f(LRa.Ha);
    }

    public void J(Waa waa2) {
        iv_1 b2 = waa2;
        iv_1 a2 = this;
        iv_1 iv_12 = b2;
        super.J((Waa)iv_12);
        iv_12.J(LRa.Ha, a2.hasMoreThanTwoComponents);
    }

    public boolean J() {
        iv_1 a2;
        return a2.hasMoreThanTwoComponents;
    }
}

