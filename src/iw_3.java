/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  jW
 *  vRa
 *  ysa
 */
import java.util.Random;
import net.minecraft.block.BlockPumpkin;

public final class iw_3
extends jW {
    public iw_3() {
        iw_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF2) {
        int n2;
        Random d2 = random;
        iw_3 b2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ysa.s) {
            void c2;
            void a2;
            XF xF3 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF3) && c2.J(xF3.down()).J() == QFa.lf && QFa.s.J((Gg)c2, xF3)) {
                c2.J(xF3, QFa.s.J().J(BlockPumpkin.FACING, LX.HORIZONTAL.random(d2)), uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

