/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  ZOa
 *  ffa
 *  vRa
 */
import net.minecraft.block.Block;

public final class Xfa_2
extends ffa {
    public Xfa_2(Block block) {
        Object b2 = block;
        Xfa_2 a2 = this;
        Object object = b2;
        String[] stringArray = new String[yRa.d];
        stringArray[uSa.E] = Lra.y;
        stringArray[vRa.d] = ZOa.m;
        stringArray[uqa.g] = cTa.P;
        super((Block)object, (Block)object, stringArray);
    }

    public int J(int n2) {
        int b2 = n2;
        Xfa_2 a2 = this;
        return b2 << uqa.g;
    }
}

