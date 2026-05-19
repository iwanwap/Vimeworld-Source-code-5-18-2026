/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kh
 *  Kpa
 *  Qsa
 *  UG
 *  Yra
 *  aJa
 *  rh
 *  rr
 *  ui
 *  wOa
 */
import net.minecraft.util.ResourceLocation;

public final class PH_3
extends UG {
    private final ResourceLocation A;
    private final boolean I;

    public void J(rr rr2) {
        PH_3 b2 = rr2;
        PH_3 a2 = this;
        Kpa.J().J().J(a2.A);
        float f2 = ((rr)b2).I.f();
        Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)Mqa.N, (float)Mqa.N, (float)rta.o, (float)rta.o, (float)f2);
        if (a2.I) {
            Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)Jpa.y, (float)Mqa.N, (float)wOa.w, (float)rta.o, (float)f2);
        }
    }

    public int f() {
        return Yqa.i;
    }

    public int J() {
        return Yqa.i;
    }

    public ui J(PG pG2) {
        PH_3 pH_3 = this;
        float a2 = EPa.r;
        float b2 = EPa.r;
        aJa aJa2 = Kpa.J().J();
        new ui().I = aJa2.J(pH_3.A).J();
        new ui().A = Qsa.k / a2;
        new ui().j = Qsa.k / b2;
        new ui().k = Yra.i / a2;
        new ui().J = Yra.i / b2;
        return new ui();
    }

    /*
     * WARNING - void declaration
     */
    public PH_3(String string, boolean bl) {
        void a2;
        Object c2 = string;
        PH_3 b2 = this;
        b2.A = XW.J((String)c2);
        b2.I = a2;
        XW.J(b2.A, (String)c2);
        b2.I = rh.READY;
    }
}

