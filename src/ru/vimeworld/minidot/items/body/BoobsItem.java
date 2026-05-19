/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Js
 *  Sqa
 *  eS
 *  fsa
 *  jpa
 *  pPa
 *  pqa
 *  uKa
 *  vRa
 *  wOa
 */
package ru.vimeworld.minidot.items.body;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public final class BoobsItem
extends BaseItem {
    private float scale;
    private final Js rightBooba;
    private final Js leftBooba;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        jU e2;
        void b2;
        void c2;
        void d2;
        BoobsItem boobsItem = jU3;
        jU jU3 = jU2;
        BoobsItem a2 = boobsItem;
        uKa.h();
        super.J((ModelPlayer)d2, (Sx)c2, (float)b2, e2);
    }

    public void f(float f2) {
        float b2 = f2;
        BoobsItem a2 = this;
        a2.scale = Math.min(Jsa.Z, wOa.w + b2 / QTa.G);
    }

    public float J() {
        BoobsItem a2;
        return a2.scale;
    }

    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        Object e2 = sx2;
        BoobsItem c2 = this;
        if (!(e2 instanceof XW)) {
            return;
        }
        ResourceLocation d2 = ((XW)((Object)e2)).J();
        c2.J(d2);
        uKa.l((float)pta.d, (float)pta.d, (float)Ora.D);
        c2.leftBooba.scaleZ = Math.min(fsa.Ia, c2.scale);
        c2.rightBooba.scaleZ = Math.min(fsa.Ia, c2.scale);
        c2.leftBooba.scaleY = c2.scale;
        c2.rightBooba.scaleY = c2.scale;
    }

    public BoobsItem() {
        BoobsItem boobsItem;
        BoobsItem boobsItem2 = boobsItem = this;
        super(eS.BODY_FRONT_TOP);
        boobsItem2.scale = pqa.r;
        BoobsItem boobsItem3 = boobsItem;
        boobsItem.leftBooba = new Js((ModelBase)boobsItem, osa.c, fPa.i);
        float a2 = jpa.f - Ora.D;
        boobsItem2.leftBooba.textureWidth = Sqa.Ja;
        boobsItem2.leftBooba.textureHeight = Sqa.Ja;
        boobsItem2.leftBooba.J(JPa.N, JPa.N, JPa.N);
        boobsItem2.leftBooba.J(NSa.b, nOa.a, tua.N, uua.p, uua.p, uua.p);
        BoobsItem boobsItem4 = boobsItem;
        boobsItem4.J(boobsItem4.leftBooba, a2, JPa.N, JPa.N);
        boobsItem4.leftBooba.scaleX = wOa.x;
        boobsItem4.leftBooba.scaleY = pPa.c;
        boobsItem4.leftBooba.J(vRa.d != 0);
        boobsItem4.rightBooba = new Js((ModelBase)boobsItem, Fsa.d, fPa.i);
        boobsItem4.rightBooba.textureWidth = Sqa.Ja;
        boobsItem4.rightBooba.textureHeight = Sqa.Ja;
        boobsItem4.rightBooba.J(JPa.N, JPa.N, JPa.N);
        boobsItem4.rightBooba.J(JPa.N, nOa.a, tua.N, uua.p, uua.p, uua.p);
        BoobsItem boobsItem5 = boobsItem;
        boobsItem5.rightBooba.scaleY = pPa.c;
        boobsItem5.rightBooba.scaleX = wOa.x;
        boobsItem5.J(boobsItem5.rightBooba, a2, JPa.N, JPa.N);
        boobsItem5.rightBooba.J(vRa.d != 0);
    }
}

