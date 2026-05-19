/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eS
 *  pda
 *  uKa
 */
package net.xtrafrancyz.mods.minidot.items.body;

import net.minecraft.client.model.ModelPlayer;
import net.xtrafrancyz.mods.minidot.items.BaseItem;

public abstract class BaseBody
extends BaseItem {
    public BaseBody(eS eS2) {
        BaseBody b2 = eS2;
        BaseBody a2 = this;
        super((eS)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(ModelPlayer modelPlayer, Sx sx2, float f2, jU jU2) {
        void a2;
        void b2;
        void d2;
        Sx e2 = sx2;
        BaseBody c2 = this;
        if (e2.J(uqa.g) != null) {
            return;
        }
        if (e2.J(pda.JACKET)) {
            uKa.J((double)rRa.l, (double)rRa.l, (double)rRa.l);
        }
        super.J((ModelPlayer)d2, e2, (float)b2, (jU)a2);
    }
}

