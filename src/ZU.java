/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NPa
 *  Nx
 *  QSa
 *  cW
 */
import java.util.List;
import java.util.Random;

public final class ZU
extends Nx {
    /*
     * WARNING - void declaration
     */
    public ZU(Gg gg2, Random random, int n2, int n3) {
        void d2;
        void c2;
        void e22;
        void b22;
        ZU a2;
        int n4 = n3;
        ZU zU2 = a2 = this;
        super((int)b22, (int)e22);
        cW b22 = new cW((Random)c2, (int)((b22 << AQa.P) + uqa.g), (int)((e22 << AQa.P) + uqa.g));
        zU2.components.add(b22);
        cW cW2 = b22;
        cW2.J((uU)cW2, (List)a2.components, (Random)c2);
        List e22 = cW2.field_74967_d;
        List list = e22;
        while (!list.isEmpty()) {
            List list2 = e22;
            ((uU)list2.remove(c2.nextInt(list2.size()))).J((uU)b22, a2.components, (Random)c2);
            list = e22;
        }
        a2.J();
        a2.J((Gg)d2, (Random)c2, QSa.p, NPa.e);
    }

    public ZU() {
        ZU a2;
    }
}

