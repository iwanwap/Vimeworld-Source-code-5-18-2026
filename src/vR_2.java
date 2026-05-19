/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  FTa
 *  Fu
 *  Hu
 *  KA
 *  Ke
 *  Kpa
 *  ZRa
 *  mra
 *  pqa
 *  uKa
 *  vB
 *  vR
 *  wra
 */
import net.minecraft.util.ResourceLocation;

public final class vR_2
extends vB {
    private final Hu k;
    public static final ResourceLocation j = new ResourceLocation(Cra.V, Hta.i);
    public static final ResourceLocation J = new ResourceLocation(Cra.V, Ora.Z);
    private final Fu A;
    private ResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        vR_2 a2 = this;
        if (a2.A.f() || e2 == false) {
            void b2;
            void c2;
            void d2;
            a2.A.J((int)d2, (int)c2, (int)b2, (boolean)e2);
        }
    }

    public void J(ResourceLocation resourceLocation) {
        Object b2 = resourceLocation;
        vR_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        vR_2 a2 = this;
        a2.J = (ResourceLocation)((double)(((mx)((Object)a2.I)).l() - Eqa.Ka - wra.P));
        if (a2.J <= ITa.a + ((mx)((Object)a2.I)).J().J()) {
            return;
        }
        vR_2 vR_22 = a2;
        super.f((int)b2, c2);
        vR_2 vR_23 = a2;
        Kpa.J().J().J(vR_23.I);
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        KA.J((int)((int)vR_22.I + AQa.P), (int)((int)a2.J), (float)ZRa.l, (float)mra.q, (int)wra.P, (int)EPa.O, (float)ZRa.l, (float)mra.q);
        vR_23.A.C((double)a2.I);
        vR_22.A.l((double)(((mx)((Object)a2.I)).l() - wra.P - wra.P));
        a2.A.J((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public vR_2(Ke ke, Hu hu) {
        void a2;
        vR_2 b2;
        vR_2 c2 = ke;
        vR_2 vR_22 = b2 = this;
        vR_2 vR_23 = b2;
        super(wra.P, uSa.E, (Ke)c2, null, null);
        vR_23.I = j;
        vR_22.k = a2;
        vR_23.k = (Hu)CRa.N;
        vR_22.j = (ResourceLocation)FTa.Q;
        vR_2 vR_24 = b2;
        vR_22.A = new Fu((Ke)c2, (vR)b2);
    }
}

