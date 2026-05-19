/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Gg
 *  MQa
 *  QFa
 *  jW
 *  vRa
 */
import java.util.Random;
import net.minecraft.block.Block;

public final class Hw
extends jW {
    private final Block A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public Hw(Block block, int n2) {
        void b2;
        Hw a2;
        int c2 = n2;
        Hw hw2 = a2 = this;
        super(uSa.E != 0);
        hw2.A = b2;
        hw2.I = c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        void b2;
        void c2;
        XF a2;
        Hw hw2 = this;
        XF xF2 = a2;
        while (xF2.getY() > yRa.d) {
            XF xF3;
            if (c2.J(a2.down())) {
                xF3 = a2;
            } else {
                Block d2 = c2.J(a2.down()).J();
                if (d2 == QFa.lf || d2 == QFa.Bc || d2 == QFa.Gd) break;
                xF3 = a2;
            }
            xF2 = xF3.down();
        }
        if (a2.getY() <= yRa.d) {
            return uSa.E != 0;
        }
        int d2 = hw2.I;
        int n2 = d2;
        for (int i2 = uSa.E; n2 >= 0 && i2 < yRa.d; ++i2, a2 = a2.add(-(d2 + vRa.d) + b2.nextInt(uqa.g + d2 * uqa.g), uSa.E - b2.nextInt(uqa.g), -(d2 + vRa.d) + b2.nextInt(uqa.g + d2 * uqa.g))) {
            int n3 = d2 + b2.nextInt(uqa.g);
            int n4 = d2 + b2.nextInt(uqa.g);
            int n5 = d2 + b2.nextInt(uqa.g);
            float f2 = (float)(n3 + n4 + n5) * Bsa.u + MQa.L;
            for (XF xF4 : XF.getAllInBox(a2.add(-n3, -n4, -n5), a2.add(n3, n4, n5))) {
                XF xF5;
                float f3 = f2;
                if (!(xF5.distanceSq(a2) <= (double)(f3 * f3))) continue;
                c2.J(xF4, hw2.A.J(), AQa.P);
            }
            n2 = d2;
        }
        return vRa.d != 0;
    }
}

