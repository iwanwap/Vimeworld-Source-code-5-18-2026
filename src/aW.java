/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  QFa
 *  bSa
 *  jW
 *  vRa
 *  ysa
 */
import java.util.Random;
import net.minecraft.block.BlockDoublePlant$EnumPlantType;

public final class aW
extends jW {
    private BlockDoublePlant$EnumPlantType I;

    public void J(BlockDoublePlant$EnumPlantType blockDoublePlant$EnumPlantType) {
        Object b2 = blockDoublePlant$EnumPlantType;
        aW a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Gg gg2, Random random, XF xF) {
        int n2;
        Random d2 = random;
        aW b2 = this;
        int n3 = uSa.E;
        int n4 = n2 = uSa.E;
        while (n4 < ysa.s) {
            void c2;
            void a2;
            XF xF2 = a2.add(d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i), d2.nextInt(AQa.P) - d2.nextInt(AQa.P), d2.nextInt(Yqa.i) - d2.nextInt(Yqa.i));
            if (c2.J(xF2) && (!c2.F.f() || xF2.getY() < bSa.a) && QFa.Ia.J((Gg)c2, xF2)) {
                QFa.Ia.J((Gg)c2, xF2, b2.I, uqa.g);
                n3 = vRa.d;
            }
            n4 = ++n2;
        }
        return n3 != 0;
    }

    public aW() {
        aW a2;
    }
}

