/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  I
 *  QFa
 *  jW
 *  vRa
 */
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class WV
extends jW {
    private final List<baa> A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public WV(List<baa> list, int n2) {
        void b2;
        WV a2;
        int c2 = n2;
        WV wV = a2 = this;
        wV.A = b2;
        wV.I = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        XF a2;
        Block block;
        WV d2 = gg2;
        WV c2 = this;
        WV wV = d2;
        while (((block = wV.J(a2).J()).J() == Material.air || block.J() == Material.leaves) && a2.getY() > vRa.d) {
            a2 = a2.down();
            wV = d2;
        }
        if (a2.getY() < vRa.d) {
            return uSa.E != 0;
        }
        a2 = a2.up();
        int n3 = n2 = uSa.E;
        while (n3 < AQa.P) {
            void b2;
            XF xF2 = a2.add(b2.nextInt(AQa.P) - b2.nextInt(AQa.P), b2.nextInt(yRa.d) - b2.nextInt(yRa.d), b2.nextInt(AQa.P) - b2.nextInt(AQa.P));
            if (d2.J(xF2) && Gg.J((I)d2, (XF)xF2.down())) {
                d2.J(xF2, QFa.dC.J(), uqa.g);
                Object object = d2.J(xF2);
                if (object instanceof Fz) {
                    baa.J((Random)b2, c2.A, (Fz)((Object)object), c2.I);
                }
                XF xF3 = xF2;
                xF2 = xF3.east();
                object = xF3.west();
                XF xF4 = xF3.north();
                XF xF5 = xF3.south();
                if (d2.J((XF)((Object)object)) && Gg.J((I)d2, (XF)((XF)((Object)object)).down())) {
                    d2.J((XF)((Object)object), QFa.FB.J(), uqa.g);
                }
                if (d2.J(xF2) && Gg.J((I)d2, (XF)xF2.down())) {
                    d2.J(xF2, QFa.FB.J(), uqa.g);
                }
                if (d2.J(xF4) && Gg.J((I)d2, (XF)xF4.down())) {
                    d2.J(xF4, QFa.FB.J(), uqa.g);
                }
                if (d2.J(xF5) && Gg.J((I)d2, (XF)xF5.down())) {
                    d2.J(xF5, QFa.FB.J(), uqa.g);
                }
                return vRa.d != 0;
            }
            n3 = ++n2;
        }
        return uSa.E != 0;
    }
}

