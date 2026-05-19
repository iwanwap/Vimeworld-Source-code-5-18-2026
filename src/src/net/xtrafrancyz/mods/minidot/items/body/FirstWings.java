/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  Cra
 *  ERa
 *  JPa
 *  Js
 *  Lqa
 *  Oz
 *  Spa
 *  Uqa
 *  aSa
 *  bSa
 *  dQa
 *  eS
 *  jsa
 *  lqa
 *  pqa
 *  pua
 *  ss
 *  uKa
 *  vQa
 *  vRa
 *  wOa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class FirstWings
extends BaseItem {
    private static Js Left3;
    private static Js Left2;
    private static Js Right4;
    private static Js Left4;
    private static Js Right5;
    private String color;
    private static Js Right1;
    private static Js Left1;
    private static final Map<String, ResourceLocation> colors;
    private boolean rainbow;
    private static Js Left5;
    private static Js Right2;
    private static Js Right3;

    @Override
    public void J(float f2) {
        float b2 = f2;
        FirstWings a2 = this;
        if (a2.rainbow) {
            float[] fArray = Qt.I[(int)(b2 * BRa.k) % uSa.i];
            uKa.f((float)fArray[uSa.E], (float)fArray[vRa.d], (float)fArray[uqa.g], (float)uKa.G.J);
        }
        double d2 = Jra.A;
        uKa.J((double)d2, (double)d2, (double)d2);
        uKa.f((double)aSa.V, (double)BRa.Y, (double)aSa.V);
        FirstWings firstWings = a2;
        super.J(b2);
        if (firstWings.rainbow) {
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)uKa.G.J);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx, float f2, jU jU2) {
        void a2;
        void c2;
        void d2;
        void b2;
        FirstWings firstWings = this;
        if (firstWings.rainbow) {
            float[] fArray = Qt.I[(int)(b2 * BRa.k) % uSa.i];
            Object e2 = fArray;
            uKa.f((float)fArray[uSa.E], (float)e2[vRa.d], (float)e2[uqa.g], (float)uKa.G.J);
        }
        FirstWings firstWings2 = firstWings;
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, (jU)a2);
        if (firstWings2.rainbow) {
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)uKa.G.J);
        }
    }

    /*
     * WARNING - void declaration
     */
    public FirstWings(String string) {
        void a2;
        FirstWings firstWings;
        FirstWings firstWings2 = firstWings = this;
        super(eS.BODY);
        firstWings.textureWidth = ysa.s;
        firstWings.textureHeight = fPa.i;
        firstWings2.color = a2;
        firstWings2.rainbow = a2.equals(pua.Ea);
        if (Left1 == null) {
            int b2;
            Left1 = new ss((ModelBase)firstWings, osa.c, uSa.E);
            Left1.J(vqa.T, JPa.N, dua.ca, vRa.d, yRa.d, uua.p);
            Left1.J(vQa.q, Lqa.C, BRa.k);
            Left2 = new ss((ModelBase)firstWings, uSa.E, uSa.E);
            Left2.J(vqa.T, Bpa.Ea, eua.C, vRa.d, ITa.A, vRa.d);
            Left2.J(vQa.q, Lqa.C, BRa.k);
            Left3 = new ss((ModelBase)firstWings, uua.p, uSa.E);
            Left3.J(vqa.T, hpa.j, vQa.q, vRa.d, osa.c, vRa.d);
            Left3.J(vQa.q, Lqa.C, BRa.k);
            Left4 = new ss((ModelBase)firstWings, lqa.s, uSa.E);
            Left4.J(vqa.T, vQa.q, pqa.r, vRa.d, wOa.t, vRa.d);
            Left4.J(vQa.q, Lqa.C, BRa.k);
            Left5 = new ss((ModelBase)firstWings, yOa.B, uSa.E);
            Left5.J(vqa.T, hpa.j, vqa.T, vRa.d, hpa.Z, vRa.d);
            Left5.J(vQa.q, Lqa.C, BRa.k);
            FirstWings firstWings3 = firstWings;
            firstWings3.J(Left1, dsa.o, fqa.U, JPa.N);
            firstWings3.J(Left2, Jra.Z, fqa.U, JPa.N);
            firstWings3.J(Left3, Uqa.f, fqa.U, JPa.N);
            firstWings3.J(Left4, dsa.o, fqa.U, JPa.N);
            firstWings3.J(Left5, fqa.U, fqa.U, JPa.N);
            Right1 = new ss((ModelBase)firstWings, osa.c, uSa.E);
            Right1.J(JPa.N, JPa.N, dua.ca, vRa.d, yRa.d, uua.p);
            Right1.J(TOa.p, Lqa.C, BRa.k);
            Right2 = new ss((ModelBase)firstWings, uSa.E, uSa.E);
            Right2.J(JPa.N, Bpa.Ea, eua.C, vRa.d, ITa.A, vRa.d);
            Right2.J(TOa.p, Lqa.C, BRa.k);
            Right3 = new ss((ModelBase)firstWings, uua.p, uSa.E);
            Right3.J(JPa.N, hpa.j, vQa.q, vRa.d, osa.c, vRa.d);
            Right3.J(TOa.p, Lqa.C, BRa.k);
            Right4 = new ss((ModelBase)firstWings, lqa.s, uSa.E);
            Right4.J(JPa.N, vQa.q, pqa.r, vRa.d, wOa.t, vRa.d);
            Right4.J(TOa.p, Lqa.C, BRa.k);
            Right5 = new ss((ModelBase)firstWings, yOa.B, uSa.E);
            Right5.J(JPa.N, hpa.j, vqa.T, vRa.d, hpa.Z, vRa.d);
            Right5.J(TOa.p, Lqa.C, BRa.k);
            FirstWings firstWings4 = firstWings;
            firstWings4.J(Right1, dsa.o, dQa.X, JPa.N);
            firstWings4.J(Right2, Jra.Z, dQa.X, JPa.N);
            firstWings4.J(Right3, Uqa.f, dQa.X, JPa.N);
            firstWings4.J(Right4, dsa.o, dQa.X, JPa.N);
            firstWings4.J(Right5, fqa.U, dQa.X, JPa.N);
            Js[] jsArray = firstWings4.l();
            int n2 = jsArray.length;
            int n3 = b2 = uSa.E;
            while (n3 < n2) {
                jsArray[b2++].J(vRa.d != 0);
                n3 = b2;
            }
            firstWings.J();
        }
        firstWings.J(colors.get(a2));
    }

    static {
        colors = new HashMap<String, ResourceLocation>();
        colors.put(rQa.a, new ResourceLocation(Cra.V, Spa.F));
        colors.put(bSa.q, new ResourceLocation(Cra.V, ERa.Z));
        colors.put(NSa.A, new ResourceLocation(Cra.V, lTa.S));
        colors.put(gQa.r, new ResourceLocation(Cra.V, yOa.g));
        colors.put(GPa.i, new ResourceLocation(Cra.V, jsa.I));
        colors.put(pua.Ea, colors.get(gQa.r));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx, float f2, jU jU2) {
        void a2;
        void b2;
        void c2;
        ModelBase e2 = modelPlayer;
        FirstWings d2 = this;
        super.f((ModelPlayer)e2, (Sx)c2, (float)b2, (jU)a2);
        FirstWings.Left1.rotationY = e2 = Oz.C((float)(b2 * Jta.w)) * iSa.fa - kTa.J;
        FirstWings.Left2.rotationY = e2;
        FirstWings.Left3.rotationY = e2;
        FirstWings.Left4.rotationY = e2;
        FirstWings.Left5.rotationY = e2;
        FirstWings.Right1.rotationY = -e2;
        FirstWings.Right2.rotationY = -e2;
        FirstWings.Right3.rotationY = -e2;
        FirstWings.Right4.rotationY = -e2;
        FirstWings.Right5.rotationY = -e2;
    }
}

