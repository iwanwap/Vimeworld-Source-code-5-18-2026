/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lPa
 *  vRa
 *  yra
 */
package net.minecraft.block;

import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BlockEventData {
    private int eventParameter;
    private int eventID;
    private XF position;
    private Block blockType;

    public int f() {
        BlockEventData a2;
        return a2.eventParameter;
    }

    public int J() {
        BlockEventData a2;
        return a2.eventID;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        BlockEventData a2 = this;
        if (!(b2 instanceof BlockEventData)) {
            return uSa.E != 0;
        }
        b2 = (BlockEventData)b2;
        if (a2.position.equals((Object)((BlockEventData)b2).position) && a2.eventID == ((BlockEventData)b2).eventID && a2.eventParameter == ((BlockEventData)b2).eventParameter && a2.blockType == ((BlockEventData)b2).blockType) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public XF J() {
        BlockEventData a2;
        return a2.position;
    }

    public Block J() {
        BlockEventData a2;
        return a2.blockType;
    }

    /*
     * WARNING - void declaration
     */
    public BlockEventData(XF xF, Block block, int n2, int n3) {
        void c2;
        void e2;
        void b2;
        void d2;
        BlockEventData a2;
        int n4 = n3;
        BlockEventData blockEventData = a2 = this;
        BlockEventData blockEventData2 = a2;
        blockEventData2.position = d2;
        blockEventData2.eventID = b2;
        blockEventData.eventParameter = e2;
        blockEventData.blockType = c2;
    }

    public String toString() {
        BlockEventData a2;
        return new StringBuilder().insert(3 >> 2, hQa.S).append((Object)a2.position).append(lPa.Aa).append(a2.eventID).append(yra.t).append(a2.eventParameter).append(yra.t).append(a2.blockType).toString();
    }
}

