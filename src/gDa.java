/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  MQa
 *  Mda
 *  QFa
 *  Yca
 *  bb
 *  hTa
 *  rea
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockMud;

public final class gDa
implements bb {
    private final Yca I;

    public gDa() {
        gDa a2;
        gDa gDa2 = a2;
        gDa2.I = new Yca();
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(dc dc2, Mda mda2) {
        void b2;
        gDa c2 = mda2;
        gDa a2 = this;
        if (c2.J() == 0) {
            XF xF = b2.J();
            void v0 = b2;
            XF xF2 = xF.add(BlockDispenser.J(v0.J()).getDirectionVec());
            Object t2 = v0.J();
            if (BlockMud.J(t2.J(xF2))) {
                Object t3 = t2;
                t3.J((double)xF.getX() + kTa.B, (double)xF.getY() + kTa.B, (double)xF.getZ() + kTa.B, hTa.i, MQa.L, Xpa.R / (((Gg)t2).v.nextFloat() * Xpa.R + xSa.la));
                t3.J(xF2, QFa.q.J());
                return new Mda(Gea.J);
            }
        }
        if (eca.f(c2.J())) {
            return new rea(a2, (Mda)c2).J((dc)b2, (Mda)c2);
        }
        return a2.I.J((dc)b2, (Mda)c2);
    }
}

