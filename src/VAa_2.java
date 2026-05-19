/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hda
 *  ISa
 *  vPa
 *  vRa
 */
import net.minecraft.util.ResourceLocation;

public final class VAa_2
extends Hda {
    /*
     * WARNING - void declaration
     */
    public VAa_2(int n2, ResourceLocation resourceLocation, boolean bl, int n3) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n4 = n3;
        VAa_2 a2 = this;
        super((int)d2, (ResourceLocation)c2, (boolean)b2, (int)e2);
    }

    public double J(int n2, CEa cEa2) {
        int c2 = n2;
        VAa_2 b2 = this;
        if (b2.O == Hda.Q.O) {
            return vPa.b * (float)(c2 + vRa.d);
        }
        return ISa.ca * (double)(c2 + vRa.d);
    }
}

