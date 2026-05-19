/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JNa
 *  JPa
 *  PNa
 *  YSa
 *  lMa
 *  pqa
 */
import net.minecraft.util.ResourceLocation;

public final class PNa_1
extends JNa {
    /*
     * WARNING - void declaration
     */
    public PNa_1(ResourceLocation resourceLocation, float f2, float f3, float f4, float f5, float f6) {
        void g2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f7;
        float f8 = f6;
        PNa_1 a2 = this;
        a2((ResourceLocation)f7, (float)e2, (float)d2, uSa.E != 0, uSa.E, lMa.LINEAR, (float)c2, (float)b2, (float)g2);
    }

    public static PNa J(ResourceLocation resourceLocation, float f2) {
        float b2 = f2;
        ResourceLocation a2 = resourceLocation;
        return new PNa_1(a2, rta.o, b2, uSa.E != 0, uSa.E, lMa.NONE, JPa.N, JPa.N, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    private PNa_1(ResourceLocation resourceLocation, float f2, float f3, boolean bl, int n2, lMa lMa2, float f4, float f5, float f6) {
        void d2;
        void e2;
        void f7;
        void j2;
        void b2;
        void c2;
        void g2;
        void h2;
        void i2;
        PNa_1 a2;
        float f8 = f6;
        PNa_1 pNa_1 = a2 = this;
        PNa_1 pNa_12 = a2;
        PNa_1 pNa_13 = a2;
        PNa_1 pNa_14 = a2;
        super((ResourceLocation)i2);
        pNa_14.C = h2;
        pNa_14.A = g2;
        pNa_13.I = c2;
        pNa_13.k = b2;
        pNa_12.j = j2;
        pNa_12.M = f7;
        pNa_1.J = e2;
        pNa_1.i = d2;
    }

    public static PNa J(ResourceLocation a2) {
        return new PNa_1(a2, pqa.r, pqa.r, uSa.E != 0, uSa.E, lMa.NONE, JPa.N, JPa.N, JPa.N);
    }

    /*
     * WARNING - void declaration
     */
    public static PNa J(ResourceLocation resourceLocation, float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        ResourceLocation a2 = resourceLocation;
        return new PNa_1(a2, YSa.G, pqa.r, uSa.E != 0, uSa.E, lMa.LINEAR, (float)c2, (float)b2, d2);
    }
}

