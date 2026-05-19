/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  NTa
 *  Nx
 *  lW
 */
import java.util.List;
import java.util.Random;

public final class tx_2
extends Nx {
    /*
     * WARNING - void declaration
     */
    public tx_2(Gg gg2, Random random, int n2, int n3) {
        void d2;
        void c2;
        void e22;
        void b22;
        tx_2 a2;
        int n4 = n3;
        tx_2 tx_22 = a2 = this;
        super((int)b22, (int)e22);
        LV.f();
        lW b22 = new lW(uSa.E, (Random)c2, (int)((b22 << AQa.P) + uqa.g), (int)((e22 << AQa.P) + uqa.g));
        tx_22.components.add(b22);
        lW lW2 = b22;
        lW2.J((uU)lW2, (List)a2.components, (Random)c2);
        List e22 = lW2.field_75026_c;
        List list = e22;
        while (!list.isEmpty()) {
            List list2 = e22;
            ((uU)list2.remove(c2.nextInt(list2.size()))).J((uU)b22, a2.components, (Random)c2);
            list = e22;
        }
        a2.J();
        a2.J((Gg)d2, (Random)c2, NTa.C);
    }

    public tx_2() {
        tx_2 a2;
    }
}

