/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ama
 *  Ega
 *  HA
 *  fFa
 *  kea
 *  kta
 *  pqa
 *  uKa
 */
import net.minecraft.util.ResourceLocation;

public final class YMa_1
extends Ama {
    private final kea M;
    private static final ResourceLocation k = new ResourceLocation(kta.J);
    public HA I;

    /*
     * WARNING - void declaration
     */
    public YMa_1(kea kea2, HA hA2) {
        void b2;
        YMa_1 a2;
        YMa_1 c2 = hA2;
        YMa_1 yMa_1 = a2 = this;
        super((Ega)new fFa((HA)b2, (HA)c2));
        yMa_1.M = b2;
        yMa_1.I = c2;
    }

    public void J(float f2, int n2, int n3) {
        Object d2 = n2;
        YMa_1 b2 = this;
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        YMa_1 yMa_1 = b2;
        yMa_1.g.J().J(k);
        YMa_1 yMa_12 = b2;
        int c2 = (yMa_1.A - yMa_12.j) / uqa.g;
        d2 = (yMa_12.I - b2.F) / uqa.g;
        YMa_1 yMa_13 = b2;
        yMa_1.f(c2, (int)d2, uSa.E, uSa.E, yMa_13.j, yMa_13.F);
    }

    public void J(int n2, int n3) {
        YMa_1 b2;
        int c2 = n2;
        YMa_1 yMa_1 = b2 = this;
        String string = c2 = yMa_1.I.J().f();
        yMa_1.L.J(string, b2.j / uqa.g - b2.L.J(string) / uqa.g, uua.p, tpa.i);
        YMa_1 yMa_12 = b2;
        yMa_12.L.J(yMa_12.M.J().f(), Yqa.i, b2.F - zua.m + uqa.g, tpa.i);
    }
}

