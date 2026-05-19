/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  Mda
 *  YSa
 *  aSa
 *  eAa
 *  pqa
 *  vRa
 *  wda
 */
import com.google.common.collect.Multimap;
import java.util.Set;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Oba_2
extends eAa {
    private Set<Block> j;
    private float J;
    public float A;
    public wda I;

    public float J(Mda mda2, Block block) {
        Object c2 = block;
        Oba_2 a2 = this;
        if (a2.j.contains(c2)) {
            return a2.A;
        }
        return pqa.r;
    }

    public wda J() {
        Oba_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Gl gl2, Gl gl3) {
        void c2;
        Oba_2 d2 = gl3;
        Oba_2 a2 = this;
        c2.J(uqa.g, (Gl)d2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Mda mda3) {
        void b2;
        Oba_2 c2 = mda3;
        Oba_2 a2 = this;
        if (a2.I.getRepairItem() == c2.J()) {
            return vRa.d != 0;
        }
        return super.J((Mda)b2, (Mda)c2);
    }

    public Multimap<String, CEa> J() {
        Oba_2 a2;
        Multimap multimap = super.J();
        multimap.put(Kha.A.J(), new CEa(L, yRa.e, a2.J, uSa.E));
        return multimap;
    }

    public boolean i() {
        return vRa.d != 0;
    }

    public String f() {
        Oba_2 a2;
        return a2.I.toString();
    }

    public int J() {
        Oba_2 a2;
        return a2.I.getEnchantability();
    }

    /*
     * WARNING - void declaration
     */
    public Oba_2(float f2, wda wda2, Set<Block> set) {
        void c2;
        void a2;
        Oba_2 d2 = wda2;
        Oba_2 b2 = this;
        b2.A = YSa.G;
        b2.I = d2;
        b2.j = a2;
        b2.i = vRa.d;
        b2.f(d2.getMaxUses());
        b2.A = d2.getEfficiencyOnProperMaterial();
        b2.J = c2 + d2.getDamageVsEntity();
        b2.J(yGa.J);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Gg gg2, Block block, XF xF, Gl gl2) {
        void b2;
        void d2;
        void c2;
        Oba_2 oba_2 = oba_22;
        Oba_2 oba_22 = gl2;
        Oba_2 a2 = oba_2;
        if ((double)c2.J((Gg)d2, (XF)b2) != aSa.V) {
            Oba_2 f2;
            void e2;
            e2.J(vRa.d, (Gl)f2);
        }
        return vRa.d != 0;
    }
}

