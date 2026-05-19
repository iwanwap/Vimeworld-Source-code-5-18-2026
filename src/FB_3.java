/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cra
 *  DQa
 *  FPa
 *  Kpa
 *  Le
 *  PF
 *  cRa
 *  if
 *  ob
 *  pqa
 *  psa
 *  uKa
 *  vB
 *  vQa
 *  vRa
 *  wOa
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

public final class FB_3
extends vB {
    private static final ResourceLocation M;
    private static final ResourceLocation k;
    private static final ResourceLocation j;
    private ResourceLocation J;
    private final ob A;
    private static final ResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        FB_3 a2 = this;
        a2.j = (a2.A != false ? Bc.Ga : Bc.Ja).transparent(WF.J());
        super.J((int)b2, c2);
        uKa.B();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)WF.J());
        FB_3 fB_3 = a2;
        Kpa.J().J().J(fB_3.J);
        if.J((double)(fB_3.I + a2.k - hpa.y - vQa.c), (double)(a2.J + a2.j / KPa.y - DQa.S), (double)vQa.c, (double)Wqa.m);
        uKa.B();
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(wOa.e, (int)(a2.I + hpa.y), (int)(a2.J + FPa.T), (OT.i.B.voiceChatKeyBindToggle ? Bc.Ba : Bc.qa).transparent(WF.J()).getRGB(), uSa.E != 0);
        if.f((double)a2.I, (double)(a2.J + a2.j - oua.i), (double)a2.k, (double)oua.i, (Color)Bc.Ga.transparent(WF.J()));
    }

    static {
        k = new ResourceLocation(Cra.V, fqa.fa);
        j = new ResourceLocation(Cra.V, cRa.B);
        M = new ResourceLocation(Cra.V, psa.V);
        I = new ResourceLocation(Cra.V, Wqa.e);
    }

    public void f(boolean bl2) {
        boolean b2 = bl2;
        FB_3 a2 = this;
        OT.i.B.voiceChatKeyBindToggle = b2;
        VoiceChatConfiguration.J();
        a2.J();
        if (b2) {
            a2.A.M();
            return;
        }
        a2.A.J();
    }

    public FB_3(ob ob2) {
        FB_3 b2 = ob2;
        FB_3 a2 = this;
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Ja, null);
        a2.J = M;
        a2.A = b2;
        a2.J();
    }

    public void f() {
        FB_3 a2;
        a2.J();
    }

    private void J() {
        FB_3 a2;
        a2.J = OT.i.B.voiceChatKeyBindToggle ? (a2.A != false ? j : k) : (a2.A != false ? I : M);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl2) {
        void e2;
        void b2;
        boolean bl3 = bl2;
        FB_3 a2 = this;
        if (b2 == false && e2 != false) {
            a2.f((!OT.i.B.voiceChatKeyBindToggle ? vRa.d : uSa.E) != 0);
        }
    }
}

