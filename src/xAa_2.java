/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  QFa
 *  eAa
 *  qta
 *  vRa
 */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class xAa_2
extends eAa {
    /*
     * WARNING - void declaration
     */
    public float J(Mda mda2, Block block) {
        Block c2 = block;
        xAa_2 a2 = this;
        if (c2 != QFa.A && c2.J() != Material.leaves) {
            void b2;
            if (c2 == QFa.cd) {
                return eua.C;
            }
            return super.J((Mda)b2, c2);
        }
        return qta.D;
    }

    public boolean J(Block block) {
        Object b2 = block;
        xAa_2 a2 = this;
        if (b2 == QFa.A || b2 == QFa.pa || b2 == QFa.Qa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Gg gg2, Block block, XF xF2, Gl gl2) {
        void a2;
        void e2;
        Block f2 = block;
        xAa_2 c2 = this;
        if (f2.J() != Material.leaves && f2 != QFa.A && f2 != QFa.y && f2 != QFa.vC && f2 != QFa.Qa && f2 != QFa.cd) {
            void b2;
            void d2;
            return super.J((Mda)e2, (Gg)d2, f2, (XF)b2, (Gl)a2);
        }
        e2.J(vRa.d, (Gl)a2);
        return vRa.d != 0;
    }

    public xAa_2() {
        xAa_2 a2;
        xAa_2 xAa_22 = a2;
        xAa_22.J(vRa.d);
        a2.f(Mqa.ja);
        a2.J(yGa.J);
    }
}

