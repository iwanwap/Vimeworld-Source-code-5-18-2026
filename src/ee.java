/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cra
 *  DE
 *  DQa
 *  Ee
 *  FPa
 *  Kpa
 *  Le
 *  PF
 *  cI
 *  cRa
 *  if
 *  pqa
 *  psa
 *  uKa
 *  vB
 *  vQa
 *  vRa
 *  yPa
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

public final class ee
extends vB {
    private ResourceLocation k;
    private static final ResourceLocation j;
    private static final ResourceLocation J;
    private static final ResourceLocation A;
    private static final ResourceLocation I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        boolean bl2 = bl;
        ee a2 = this;
        if (b2 == false && e2 != false) {
            a2.f((!OT.i.B.enableNoiseSupression ? vRa.d : uSa.E) != 0);
        }
    }

    public void f(boolean bl) {
        int a2;
        ee ee2 = this;
        ee b2 = OT.i.l;
        if (a2 != 0) {
            yPa yPa2 = yPa.J();
            if (yPa2 == null) {
                a2 = uSa.E;
                WF.J().J().J(DE.NOISE_SUPRESSION_ERROR, uSa.E);
            } else if (b2 != null && b2.J() != null) {
                b2.J().J(yPa2);
            } else {
                yPa2.close();
            }
        } else if (b2 != null && b2.J() != null) {
            b2.J().J();
        }
        OT.i.B.enableNoiseSupression = a2;
        VoiceChatConfiguration.J();
        ee2.J();
    }

    public ee() {
        ee a2;
        ee ee2 = a2;
        super(uSa.E, uSa.E, tua.i, kTa.j, (Color)Bc.Ja, null);
        ee2.J();
    }

    public void f() {
        ee a2;
        a2.J();
    }

    private void J() {
        ee a2;
        a2.k = OT.i.B.enableNoiseSupression ? (a2.A != false ? I : J) : (a2.A != false ? j : A);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        ee a2;
        int c2 = n3;
        ee ee2 = a2 = this;
        ee ee3 = a2;
        if.C((double)ee2.I, (double)ee3.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja.transparent(WF.J()), (Color)Bc.Ga.transparent(WF.J()));
        cI.J((Runnable)Ee.J((ee)ee3));
        ee2.j = (ee2.A != false ? Bc.Ga : Bc.Ja).transparent(WF.J());
        super.J((int)b2, c2);
        uKa.B();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)WF.J());
        ee ee4 = a2;
        Kpa.J().J().J(ee4.k);
        if.J((double)(ee4.I + a2.k - hpa.y - vQa.c), (double)(a2.J + a2.j / KPa.y - DQa.S), (double)vQa.c, (double)Wqa.m);
        uKa.B();
        Le.J((PF)PF.VIME_ART, (int)yOa.B).J(vRa.G, (int)(a2.I + hpa.y), (int)(a2.J + FPa.T), (OT.i.B.enableNoiseSupression ? Bc.Ba : Bc.qa).transparent(WF.J()).getRGB(), uSa.E != 0);
        if.f((double)a2.I, (double)(a2.J + a2.j - oua.i), (double)a2.k, (double)oua.i, (Color)Bc.Ga.transparent(WF.J()));
        cI.J();
    }

    static {
        J = new ResourceLocation(Cra.V, fqa.fa);
        I = new ResourceLocation(Cra.V, cRa.B);
        A = new ResourceLocation(Cra.V, psa.V);
        j = new ResourceLocation(Cra.V, Wqa.e);
    }

    public static /* synthetic */ void J(ee a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Color.WHITE, uSa.E != 0);
    }
}

