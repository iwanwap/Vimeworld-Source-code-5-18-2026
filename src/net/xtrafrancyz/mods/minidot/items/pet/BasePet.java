/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  YSa
 *  eS
 *  uKa
 */
package net.xtrafrancyz.mods.minidot.items.pet;

import net.minecraft.client.model.ModelPlayer;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public abstract class BasePet
extends BaseItem {
    /*
     * WARNING - void declaration
     */
    @Override
    public void f(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void c2;
        void d2;
        float e2 = f2;
        BasePet b2 = this;
        b2.J((ModelPlayer)d2, (Sx)c2, e2);
        uKa.l((float)YSa.d, (float)YSa.d, (float)YSa.d);
    }

    public void J(ModelPlayer modelPlayer, Sx sx2, float f2) {
        float d2 = f2;
        BasePet basePet = this;
    }

    public BasePet() {
        super(eS.PET);
        BasePet a2;
    }

    @Override
    public void J(float f2) {
        float b2 = f2;
        BasePet a2 = this;
        uKa.l((float)YSa.d, (float)YSa.d, (float)YSa.d);
        super.J(b2);
    }
}

