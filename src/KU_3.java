/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  hd
 */
import java.util.Random;

public class KU_3 {
    public Gg worldObj;
    public Random rand;
    public int range = Yqa.i;

    public KU_3() {
        KU_3 a2;
        KU_3 kU_3 = a2;
        kU_3.rand = new Random();
    }

    /*
     * WARNING - void declaration
     */
    public void J(hd hd2, Gg gg2, int n2, int n3, oz oz2) {
        void c2;
        void var10_9;
        void d2;
        KU_3 e2;
        KU_3 f22 = hd2;
        KU_3 kU_3 = e2 = this;
        KU_3 kU_32 = e2;
        int f22 = kU_32.range;
        kU_3.worldObj = d2;
        kU_32.rand.setSeed(d2.J());
        long l2 = kU_3.rand.nextLong();
        long l3 = kU_3.rand.nextLong();
        void v2 = var10_9 = c2 - f22;
        while (v2 <= c2 + f22) {
            void b2;
            void v3 = b2 - f22;
            while (v3 <= b2 + f22) {
                void a2;
                void var11_10;
                long l4 = (long)var10_9 * l2;
                long l5 = (long)var11_10 * l3;
                KU_3 kU_33 = e2;
                kU_33.rand.setSeed(l4 ^ l5 ^ d2.J());
                kU_33.J((Gg)d2, (int)var10_9, (int)var11_10++, (int)c2, (int)b2, (oz)a2);
                v3 = var11_10;
            }
            v2 = ++var10_9;
        }
    }

    public void J(Gg gg2, int n2, int n3, int n4, int n5, oz oz2) {
        KU_3 kU_3 = oz3;
        oz oz3 = oz2;
        KU_3 a2 = kU_3;
    }
}

