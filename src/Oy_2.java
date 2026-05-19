/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Oy
 *  dQa
 *  pua
 *  vRa
 */
import net.minecraft.block.Block;

public final class Oy_2
implements Comparable<Oy> {
    public int priority;
    public long scheduledTime;
    private final Block block;
    public final XF position;
    private static long nextTickEntryID;
    private long tickEntryID;

    public int hashCode() {
        Oy_2 a2;
        return a2.position.hashCode();
    }

    public String toString() {
        Oy_2 a2;
        return Block.J(a2.block) + Xpa.E + (Object)((Object)a2.position) + TOa.n + a2.scheduledTime + TOa.n + a2.priority + TOa.n + a2.tickEntryID;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        Oy_2 a2 = this;
        if (!(b2 instanceof Oy_2)) {
            return uSa.E != 0;
        }
        b2 = (Oy_2)b2;
        if (a2.position.equals((Object)((Oy_2)b2).position) && Block.J(a2.block, ((Oy_2)b2).block)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Oy_2(XF xF2, Block block) {
        void b2;
        Oy_2 a2;
        Block c2 = block;
        Oy_2 oy_2 = a2 = this;
        long l2 = nextTickEntryID;
        nextTickEntryID = l2 + dQa.Ga;
        a2.tickEntryID = l2;
        oy_2.position = b2;
        oy_2.block = c2;
    }

    public void setPriority(int n2) {
        int b2 = n2;
        Oy_2 a2 = this;
        a2.priority = b2;
    }

    public Block getBlock() {
        Oy_2 a2;
        return a2.block;
    }

    public Oy setScheduledTime(long a2) {
        Oy_2 b2;
        b2.scheduledTime = a2;
        return b2;
    }

    @Override
    public int compareTo(Oy oy) {
        Oy_2 b2 = oy;
        Oy_2 a2 = this;
        if (a2.scheduledTime < b2.scheduledTime) {
            return pua.o;
        }
        if (a2.scheduledTime > b2.scheduledTime) {
            return vRa.d;
        }
        if (a2.priority != b2.priority) {
            return a2.priority - b2.priority;
        }
        if (a2.tickEntryID < b2.tickEntryID) {
            return pua.o;
        }
        if (a2.tickEntryID > b2.tickEntryID) {
            return vRa.d;
        }
        return uSa.E;
    }
}

