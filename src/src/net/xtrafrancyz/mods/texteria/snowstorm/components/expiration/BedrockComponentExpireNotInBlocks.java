/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dL
 *  nj
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.expiration;

import java.util.Iterator;
import net.minecraft.block.Block;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;

public final class BedrockComponentExpireNotInBlocks
extends dL
implements IComponentParticleUpdate {
    /*
     * WARNING - void declaration
     */
    @Override
    public void f(nj nj2, vj vj2) {
        void a2;
        Object c2 = nj2;
        BedrockComponentExpireNotInBlocks b2 = this;
        if (a2.f || c2.J() == null) {
            return;
        }
        BedrockComponentExpireNotInBlocks bedrockComponentExpireNotInBlocks = b2;
        c2 = bedrockComponentExpireNotInBlocks.J((nj)c2, (vj)a2);
        Iterator iterator = bedrockComponentExpireNotInBlocks.blocks.iterator();
        while (iterator.hasNext()) {
            if ((Block)iterator.next() != c2) continue;
            return;
        }
        a2.f = vRa.d;
    }

    public BedrockComponentExpireNotInBlocks() {
        BedrockComponentExpireNotInBlocks a2;
    }
}

