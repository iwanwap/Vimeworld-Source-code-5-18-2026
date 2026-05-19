/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  ac
 *  vRa
 *  zna
 */
import java.io.IOException;
import java.util.List;

public class HB_1
extends EC {
    public HB_1() {
        HB_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static ac J(List<ac> list, int n2, int n3) {
        int n4;
        List<ac> list2 = list;
        int n5 = n4 = uSa.E;
        while (n5 < list2.size()) {
            ac c2 = list2.get(n4);
            if (c2.k) {
                void a2;
                void b2;
                ac ac2 = c2;
                int n6 = zna.J((ac)ac2);
                int n7 = zna.f((ac)ac2);
                if (b2 >= c2.m && a2 >= c2.I && b2 < c2.m + n6 && a2 < c2.I + n7) {
                    return c2;
                }
            }
            n5 = ++n4;
        }
        return null;
    }

    public void f(ac object) throws IOException {
        HB_1 b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void a2;
        void b2;
        int d2 = n2;
        HB_1 c2 = this;
        super.J(d2, (int)b2, (int)a2);
        if (a2 == vRa.d && (d2 = HB_1.J(c2.E, d2, (int)b2)) != null && d2.J) {
            ac ac2 = d2;
            HB_1 hB_1 = c2;
            ac2.J(hB_1.g.J());
            hB_1.f(ac2);
        }
    }
}

