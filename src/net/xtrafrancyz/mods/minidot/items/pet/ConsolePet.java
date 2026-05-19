/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  Js
 *  NPa
 *  NQa
 *  Oz
 *  YSa
 *  uKa
 *  vPa
 *  ysa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.util.ResourceLocation;
import net.xtrafrancyz.mods.minidot.items.pet.BasePet;

public final class ConsolePet
extends BasePet {
    private final Js Shape1;
    private static final ResourceLocation tex1;
    private static final ResourceLocation tex;

    static {
        tex = new ResourceLocation(Cra.V, YSa.ca);
        tex1 = new ResourceLocation(Cra.V, xua.Q);
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        ConsolePet a2 = this;
        uKa.J((float)JPa.N, (float)ATa.x, (float)JPa.N);
        uKa.l((float)NPa.B, (float)NPa.B, (float)NPa.B);
        super.J(b2);
    }

    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        ConsolePet a2 = this;
        float c2 = Oz.d((float)(d2 * TOa.r)) * WRa.e;
        uKa.J((float)Ora.D, (float)(vPa.b + c2), (float)Xpa.R);
        if (d2 % eta.e > FRa.Ga) {
            a2.J(tex);
            return;
        }
        a2.J(tex1);
    }

    public ConsolePet() {
        ConsolePet a2;
        ConsolePet consolePet = a2;
        consolePet.textureWidth = ysa.s;
        consolePet.textureHeight = fPa.i;
        ConsolePet consolePet2 = a2;
        consolePet.Shape1 = new Js((ModelBase)a2, uSa.E, uSa.E);
        consolePet.Shape1.J(JPa.N, JPa.N, JPa.N, Yqa.i, Yqa.i, Yqa.i);
        ConsolePet consolePet3 = a2;
        consolePet3.Shape1.J(NQa.m, JPa.N, NQa.m);
        consolePet3.J(tex);
    }
}

