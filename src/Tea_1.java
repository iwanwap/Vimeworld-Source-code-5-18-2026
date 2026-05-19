/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 *  Wda
 *  Yca
 *  aSa
 *  fsa
 *  vL
 *  vRa
 */
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.material.Material;

public final class Tea_1
extends Yca {
    private final Yca I;

    public Tea_1() {
        Tea_1 a2;
        Tea_1 tea_1 = a2;
        tea_1.I = new Yca();
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        double d2;
        Wda b2;
        Tea_1 tea_1 = this;
        void v0 = b2;
        Object c2 = BlockDispenser.J(v0.J());
        Object t2 = v0.J();
        double d3 = v0.l() + (double)((float)((DZ)((Object)c2)).getFrontOffsetX() * fsa.L);
        double d4 = v0.J() + (double)((float)((DZ)((Object)c2)).getFrontOffsetY() * fsa.L);
        double d5 = v0.f() + (double)((float)((DZ)((Object)c2)).getFrontOffsetZ() * fsa.L);
        c2 = v0.J().offset((DZ)((Object)c2));
        Material material = t2.J((XF)((Object)c2)).J().J();
        if (Material.water.equals(material)) {
            d2 = oua.i;
        } else {
            if (!Material.air.equals(material) || !Material.water.equals(t2.J(((XF)((Object)c2)).down()).J().J())) {
                return tea_1.I.J((dc)b2, (Mda)a2);
            }
            d2 = aSa.V;
        }
        b2 = new Wda(t2, d3, d4 + d2, d5);
        void v1 = a2;
        t2.f((vL)b2);
        v1.J(vRa.d);
        return v1;
    }

    public void J(dc dc2) {
        dc b2 = dc2;
        Tea_1 a2 = this;
        b2.J().f(PRa.U, b2.J(), uSa.E);
    }
}

