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
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;

public final class Bx
extends jW {
    public Bx() {
        Bx a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        XF a2;
        Bx bx = this;
        XF xF2 = a2;
        while (xF2.getY() < XOa.h) {
            void c2;
            if (c2.J(a2)) {
                DZ[] dZArray = LX.HORIZONTAL.facings();
                int n2 = dZArray.length;
                int n3 = uSa.E;
                while (n3 < n2) {
                    int n4;
                    Object d2 = dZArray[n4];
                    if (QFa.vC.J((Gg)c2, a2, (DZ)((Object)d2))) {
                        d2 = QFa.vC.J().J(BlockVine.NORTH, (d2 == DZ.NORTH ? vRa.d : uSa.E) != 0).J(BlockVine.EAST, (d2 == DZ.EAST ? vRa.d : uSa.E) != 0).J(BlockVine.SOUTH, (d2 == DZ.SOUTH ? vRa.d : uSa.E) != 0).J(BlockVine.WEST, (d2 == DZ.WEST ? vRa.d : uSa.E) != 0);
                        c2.J(a2, (IBlockState)d2, uqa.g);
                        break;
                    }
                    n3 = ++n4;
                }
            } else {
                void b2;
                a2 = a2.add(b2.nextInt(AQa.P) - b2.nextInt(AQa.P), uSa.E, b2.nextInt(AQa.P) - b2.nextInt(AQa.P));
            }
            xF2 = a2.up();
        }
        return vRa.d != 0;
    }
}

