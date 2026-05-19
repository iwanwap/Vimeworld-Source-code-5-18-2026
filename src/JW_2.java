/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  jW
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.material.Material;

public final class JW_2
extends jW {
    public JW_2() {
        JW_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        JW_2 jW_2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < kTa.j) {
            Object d22;
            void c2;
            void b2;
            void a2;
            XF xF3 = a2.add(b2.nextInt(AQa.P) - b2.nextInt(AQa.P), uSa.E, b2.nextInt(AQa.P) - b2.nextInt(AQa.P));
            if (c2.J(xF3) && (c2.J(((XF)((Object)(d22 = xF3.down()))).west()).J().J() == Material.water || c2.J(((XF)((Object)d22)).east()).J().J() == Material.water || c2.J(((XF)((Object)d22)).north()).J().J() == Material.water || c2.J(((XF)((Object)d22)).south()).J().J() == Material.water)) {
                void v1 = b2;
                int d22 = uqa.g + v1.nextInt(v1.nextInt(yRa.d) + vRa.d);
                int n4 = uSa.E;
                while (n4 < d22) {
                    int n5;
                    if (QFa.ka.l((Gg)c2, xF3)) {
                        c2.J(xF3.up(n5), QFa.ka.J(), uqa.g);
                    }
                    n4 = ++n5;
                }
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

