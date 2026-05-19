/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 */
package net.minecraft.block;

import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import optifine.Config;

public class BlockLeavesBase
extends Block {
    public boolean fancyGraphics;
    private static final String __OBFID = "CL_00000326";
    private static Map mapOriginalOpacity = new IdentityHashMap();

    @Override
    public boolean g() {
        return uSa.E != 0;
    }

    public static void J(Block block) {
        Block block2 = block;
        if (mapOriginalOpacity.containsKey(block2)) {
            int a2 = (Integer)mapOriginalOpacity.get(block2);
            BlockLeavesBase.J(block2, a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public BlockLeavesBase(Material material, boolean bl) {
        void b2;
        boolean c2 = bl;
        BlockLeavesBase a2 = this;
        super((Material)b2);
        a2.fancyGraphics = c2;
    }

    public static void J(Block block, int n2) {
        int b2 = n2;
        Block a2 = block;
        if (!mapOriginalOpacity.containsKey(a2)) {
            Block block2 = a2;
            mapOriginalOpacity.put(block2, block2.C());
        }
        a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(I i2, XF xF, DZ dZ2) {
        void a2;
        void c2;
        Object d2 = xF;
        BlockLeavesBase b2 = this;
        if (Config.c() && c2.J((XF)((Object)d2)).J() == b2) {
            return uSa.E != 0;
        }
        return super.J((I)c2, (XF)((Object)d2), (DZ)a2);
    }
}

