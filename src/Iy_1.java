/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  rd
 *  uY
 */
import net.minecraft.block.BlockDaylightDetector;

public final class Iy_1
extends uY
implements rd {
    public Iy_1() {
        Iy_1 a2;
    }

    public void J() {
        Iy_1 a2;
        if (a2.worldObj != null && !a2.worldObj.e && a2.worldObj.l() % fta.d == nqa.i) {
            Iy_1 iy_1 = a2;
            iy_1.blockType = iy_1.J();
            if (iy_1.blockType instanceof BlockDaylightDetector) {
                Iy_1 iy_12 = a2;
                ((BlockDaylightDetector)a2.blockType).f(iy_12.worldObj, iy_12.pos);
            }
        }
    }
}

