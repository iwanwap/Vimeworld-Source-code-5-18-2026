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

public final class BedrockComponentExpireInBlocks
extends dL
implements IComponentParticleUpdate {
    /*
     * WARNING - void declaration
     */
    @Override
    public void f(nj nj2, vj vj2) {
        void a2;
        Object c2 = nj2;
        BedrockComponentExpireInBlocks b2 = this;
        if (a2.f || c2.J() == null) {
            return;
        }
        BedrockComponentExpireInBlocks bedrockComponentExpireInBlocks = b2;
        c2 = bedrockComponentExpireInBlocks.J((nj)c2, (vj)a2);
        Iterator iterator = bedrockComponentExpireInBlocks.blocks.iterator();
        while (iterator.hasNext()) {
            if ((Block)iterator.next() != c2) continue;
            a2.f = vRa.d;
            return;
        }
    }

    public BedrockComponentExpireInBlocks() {
        BedrockComponentExpireInBlocks a2;
    }
}

