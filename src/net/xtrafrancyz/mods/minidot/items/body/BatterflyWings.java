/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  MQa
 *  Oz
 *  Tpa
 *  eS
 *  lqa
 *  uKa
 *  vRa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class BatterflyWings
extends BaseItem {
    private final Js Right;
    private final Js Left;

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void b2;
        void c2;
        ModelBase e22 = modelPlayer;
        BatterflyWings d2 = this;
        super.f((ModelPlayer)e22, (Sx)c2, (float)b2, (jU)a2);
        float e22 = Oz.C((float)(b2 * Yqa.C)) * iSa.fa;
        d2.Left.rotationY = -e22;
        d2.Right.rotationY = e22;
        uKa.l((float)pta.d, (float)pta.d, (float)Ora.D);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        BatterflyWings a2 = this;
        uKa.J((float)JPa.N, (float)kTa.J, (float)Qra.j);
        uKa.l((float)vTa.N, (float)MQa.L, (float)JPa.c);
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        BatterflyWings batterflyWings = jU3;
        jU jU3 = jU2;
        BatterflyWings a2 = batterflyWings;
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
        uKa.m();
    }

    public BatterflyWings() {
        BatterflyWings a2;
        BatterflyWings batterflyWings = a2;
        super(eS.BODY);
        batterflyWings.textureWidth = ysa.s;
        batterflyWings.textureHeight = fPa.i;
        BatterflyWings batterflyWings2 = a2;
        batterflyWings.Left = new Js((ModelBase)a2, uSa.E, SPa.S);
        batterflyWings.Left.J(JPa.N, JPa.N, dua.ca);
        batterflyWings.Left.J(Ira.d, Cra.fa, lqa.ga, uSa.E, fPa.i, Fsa.d);
        BatterflyWings batterflyWings3 = a2;
        batterflyWings3.J(batterflyWings3.Left, JPa.N, Xpa.R, JPa.N);
        batterflyWings3.Left.J(vRa.d != 0);
        batterflyWings3.Right = new Js((ModelBase)a2, uSa.E, SPa.S);
        batterflyWings3.Right.J(JPa.N, JPa.N, dua.ca);
        batterflyWings3.Right.J(FRa.ca, Cra.fa, lqa.ga, uSa.E, fPa.i, Fsa.d);
        BatterflyWings batterflyWings4 = a2;
        batterflyWings4.J(batterflyWings4.Right, JPa.N, Tpa.S, JPa.N);
        batterflyWings4.Right.J(vRa.d != 0);
        batterflyWings4.J(new ResourceLocation(Cra.V, Fsa.Da));
    }
}

