/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Gg
 *  Mda
 *  QFa
 *  Tz
 *  eAa
 *  qCa
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;

public final class lCa_2
extends qCa {
    public int J(Mda mda2, int n2) {
        lCa_2 c2 = mda2;
        lCa_2 b2 = this;
        return QFa.pB.J(QFa.pB.J(c2.J()));
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void c2;
        void a2;
        void b2;
        lCa_2 lCa_22 = this;
        Object d2 = lCa_22.J((Gg)b2, (Sx)a2, vRa.d != 0);
        if (d2 == null) {
            return c2;
        }
        if (((RY)d2).A == AY.BLOCK) {
            Object object = ((RY)d2).J();
            if (!b2.J((Sx)a2, object)) {
                return c2;
            }
            if (!a2.J(object.offset(((RY)d2).j), ((RY)d2).j, (Mda)c2)) {
                return c2;
            }
            d2 = object.up();
            if ((object = b2.J(object)).J().J() == Material.water && object.J(BlockLiquid.LEVEL) == 0 && b2.J((XF)((Object)d2))) {
                b2.J((XF)((Object)d2), QFa.pB.J());
                if (!a2.h.f()) {
                    c2.E -= vRa.d;
                }
                a2.J(Tz.H[eAa.J((eAa)lCa_22)]);
            }
        }
        return c2;
    }

    public lCa_2(Block block) {
        Object b2 = block;
        lCa_2 a2 = this;
        super((Block)b2, uSa.E != 0);
    }
}

