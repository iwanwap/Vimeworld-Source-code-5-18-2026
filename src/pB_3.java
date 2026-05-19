/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cra
 *  FPa
 *  Ke
 *  Kpa
 *  NTa
 *  if
 *  mra
 *  vB
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;

public final class pB_3
extends vB {
    private final String A;
    private final ResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public pB_3(String string, Ke ke2) {
        void b2;
        pB_3 c2 = ke2;
        pB_3 a2 = this;
        super(uSa.E, uSa.E, NTa.C, NTa.C, Color.WHITE, (Ke)c2);
        pB_3 pB_32 = a2;
        a2.I = new ResourceLocation(Cra.V, mra.d);
        a2.A = b2;
    }

    public void J(int n2, int n3) {
        pB_3 a2;
        int c2 = n3;
        pB_3 pB_32 = a2 = this;
        if.J((String)pB_32.A, (double)(pB_32.I + oua.i), (double)(a2.J + oua.i), (double)Wqa.m, (double)Wqa.m, (int)Bc.Ba.transparent(WF.J()).getRGB());
        if (Boolean.TRUE.equals(WF.L.get(a2.A))) {
            Kpa.J().J().J(a2.I);
            if.J((double)(a2.I - KPa.y), (double)(a2.J - KPa.y), (double)(a2.k + FPa.T), (double)(a2.j + FPa.T));
        }
    }
}

