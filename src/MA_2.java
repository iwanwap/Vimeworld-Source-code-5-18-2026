/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  JPa
 *  Kpa
 *  MA
 *  vRa
 */
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;

public final class MA_2
extends ic<Gl> {
    private static MA I;

    /*
     * WARNING - void declaration
     */
    public MA_2(oLa oLa2, ModelBase modelBase, float f2) {
        void b2;
        void c2;
        float d2 = f2;
        MA_2 a2 = this;
        super((oLa)c2, (ModelBase)b2, d2);
    }

    public static boolean f(Gl gl2, float f2) {
        float b2 = f2;
        Gl a2 = gl2;
        return MA_2.J().J(a2, b2, vRa.d != 0);
    }

    public static boolean l(Gl a2) {
        return MA_2.J().f(a2);
    }

    public static MA J() {
        if (I == null) {
            I = new MA_2(Kpa.J().J(), null, JPa.N);
        }
        return I;
    }

    public ResourceLocation J(Gl gl2) {
        MA_2 b2 = gl2;
        MA_2 a2 = this;
        return null;
    }

    public static void C() {
        MA_2.J().J();
    }

    public int J(Gl gl2, float f2, float f3) {
        float d2 = f3;
        MA_2 a2 = this;
        return uSa.E;
    }
}

