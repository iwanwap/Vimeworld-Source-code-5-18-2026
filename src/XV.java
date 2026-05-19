/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  jW
 *  vRa
 *  ysa
 */
import java.util.Random;
import net.minecraft.block.BlockBush;

public final class XV
extends jW {
    private BlockBush I;

    public XV(BlockBush blockBush) {
        Object b2 = blockBush;
        XV a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        Random d2 = random;
        XV b2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < ysa.s) {
            void c2;
            void a2;
            XF xF2 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF2) && (!c2.F.f() || xF2.getY() < osa.Ja) && b2.I.J((Gg)c2, xF2, b2.I.J())) {
                c2.J(xF2, b2.I.J(), uqa.g);
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }
}

