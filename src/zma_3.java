/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Joa
 *  KA
 *  Kpa
 *  Uta
 *  lPa
 *  vB
 *  wI
 *  zU
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;

public final class zma_3
extends vB {
    private final ResourceLocation J;
    private int A;
    private final Joa I;

    public void f() {
        zma_3 a2;
        a2.A = a2.A != 0 ? (int)a2.d() : uSa.E;
    }

    public static void J() {
        wI wI2 = new wI();
        wI2.put((Object)Wqa.fa, (Object)Uta.Aa);
        zU.M.f(wI2);
    }

    public zma_3(Joa joa) {
        zma_3 a2;
        zma_3 b2 = joa;
        zma_3 zma_32 = a2 = this;
        super(uSa.E, uSa.E, WPa.L, yOa.B, new Color(uSa.E), null);
        zma_3 zma_33 = a2;
        zma_32.J = new ResourceLocation(rpa.Y);
        zma_32.A = uSa.E;
        zma_32.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        zma_3 a2 = this;
        if (e2 == false || b2 != false) {
            return;
        }
        if (Kpa.J().d()) {
            return;
        }
        zma_3.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        zma_3 a2;
        int c2 = n3;
        zma_3 zma_32 = a2 = this;
        a2.I = (Joa)((double)(a2.I.e + zma_32.I.j) - a2.k);
        a2.J = (ResourceLocation)((double)(zma_32.I.v - yOa.B));
        if (Kpa.J().d()) {
            return;
        }
        zma_3 zma_33 = a2;
        zma_33.f((int)b2, c2);
        Kpa.J().J().J(a2.J);
        KA.J((int)((int)zma_33.I), (int)((int)a2.J), (float)((int)a2.k), (float)a2.A, (int)((int)a2.k), (int)((int)a2.d()), (float)((int)a2.k), (float)((int)(a2.d() * KPa.y)));
    }

    private double d() {
        zma_3 a2;
        return a2.j + lPa.K;
    }
}

