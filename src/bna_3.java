/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Joa
 *  KA
 *  Kpa
 *  fpa
 *  jpa
 *  lPa
 *  vB
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;

public final class bna_3
extends vB {
    private int J;
    private final ResourceLocation A;
    private final Joa I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        bna_3 a2;
        int c2 = n3;
        bna_3 bna_32 = a2 = this;
        bna_3 bna_33 = a2;
        bna_33.I = (Joa)((double)bna_33.I.e);
        bna_32.J = (int)((double)(bna_33.I.v - yOa.B));
        bna_32.f((int)b2, c2);
        Kpa.J().J().J(a2.A);
        KA.J((int)((int)bna_32.I), (int)a2.J, (float)((int)a2.k), (float)a2.J, (int)((int)a2.k), (int)((int)a2.d()), (float)((int)a2.k), (float)((int)(a2.d() * KPa.y)));
    }

    public bna_3(Joa joa2) {
        bna_3 a2;
        bna_3 b2 = joa2;
        bna_3 bna_32 = a2 = this;
        super(uSa.E, uSa.E, jpa.E, yOa.B, new Color(uSa.E), null);
        bna_3 bna_33 = a2;
        bna_32.A = new ResourceLocation(fpa.c);
        bna_32.J = uSa.E;
        bna_32.I = b2;
    }

    private double d() {
        bna_3 a2;
        return a2.j + lPa.K;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void b2;
        void e2;
        boolean bl3 = bl2;
        bna_3 a2 = this;
        if (e2 == false || b2 != false) {
            return;
        }
        Kpa.J().J((EC)mx.J());
    }

    public void f() {
        bna_3 a2;
        a2.J = a2.A != false ? (int)a2.d() : uSa.E;
    }
}

