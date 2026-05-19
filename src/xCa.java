/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  QFa
 *  YSa
 *  aSa
 *  eAa
 *  pqa
 *  psa
 *  qta
 *  vRa
 *  wda
 */
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xCa
extends eAa {
    private float A;
    private final wda I;

    public xCa(wda wda2) {
        xCa b2 = wda2;
        xCa a2 = this;
        a2.I = b2;
        a2.i = vRa.d;
        a2.f(b2.getMaxUses());
        a2.J(yGa.m);
        a2.A = YSa.G + b2.getDamageVsEntity();
    }

    public int J(Mda mda2) {
        xCa b2 = mda2;
        xCa a2 = this;
        return Tqa.c;
    }

    public Multimap<String, CEa> J() {
        xCa a2;
        Multimap multimap = super.J();
        multimap.put(Kha.A.J(), new CEa(L, psa.p, a2.A, uSa.E));
        return multimap;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Gg gg2, Block block, XF xF, Gl gl2) {
        void b2;
        void d2;
        void c2;
        xCa xCa2 = xCa3;
        xCa xCa3 = gl2;
        xCa a2 = xCa2;
        if ((double)c2.J((Gg)d2, (XF)b2) != aSa.V) {
            xCa f2;
            void e2;
            e2.J(uqa.g, (Gl)f2);
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public float J(Mda mda2, Block block) {
        void a2;
        Object c2 = mda2;
        xCa b2 = this;
        if (a2 == QFa.A) {
            return qta.D;
        }
        c2 = a2.J();
        if (c2 != Material.plants && c2 != Material.vine && c2 != Material.coral && c2 != Material.leaves && c2 != Material.gourd) {
            return pqa.r;
        }
        return Ira.d;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Mda mda3) {
        void b2;
        xCa c2 = mda3;
        xCa a2 = this;
        if (a2.I.getRepairItem() == c2.J()) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2, (Mda)c2);
    }

    public boolean i() {
        return vRa.d != 0;
    }

    public String f() {
        xCa a2;
        return a2.I.toString();
    }

    public YFa J(Mda mda2) {
        xCa b2 = mda2;
        xCa a2 = this;
        return YFa.BLOCK;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(Mda mda2, Gg gg2, Sx sx2) {
        void a2;
        xCa d2 = mda2;
        xCa c2 = this;
        xCa xCa2 = d2;
        a2.f((Mda)xCa2, c2.J((Mda)d2));
        return xCa2;
    }

    public float J() {
        xCa a2;
        return a2.I.getDamageVsEntity();
    }

    public int J() {
        xCa a2;
        return a2.I.getEnchantability();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Gl gl2, Gl gl3) {
        void c2;
        xCa d2 = gl3;
        xCa a2 = this;
        c2.J(vRa.d, (Gl)d2);
        return vRa.d != 0;
    }

    public boolean J(Block block) {
        Object b2 = block;
        xCa a2 = this;
        if (b2 == QFa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

