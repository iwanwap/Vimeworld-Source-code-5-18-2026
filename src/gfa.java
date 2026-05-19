/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HEa
 *  Hda
 *  JPa
 *  Mda
 *  VQa
 *  eAa
 *  kba
 *  uOa
 *  vRa
 *  vpa
 */
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gfa
extends YCa {
    private final boolean I;

    public gfa(boolean bl) {
        boolean b2 = bl;
        gfa a2 = this;
        super(uSa.E, JPa.N, uSa.E != 0);
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Mda mda2, Gg gg2, Sx sx2) {
        void b2;
        void c2;
        Object d2 = sx2;
        gfa a2 = this;
        if (HEa.byItemStack((Mda)c2) == HEa.PUFFERFISH) {
            Object object = d2;
            object.J(new kba(Hda.c.O, PRa.ga, yRa.d));
            d2.J(new kba(Hda.L.O, vpa.Ja, uqa.g));
            object.J(new kba(Hda.D.O, vpa.Ja, vRa.d));
        }
        super.f((Mda)c2, (Gg)b2, (Sx)((Object)d2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int n2;
        gfa gfa2 = this;
        HEa[] c2 = HEa.values();
        int b2 = c2.length;
        int n3 = n2 = uSa.E;
        while (n3 < b2) {
            gfa d2 = c2[n2];
            if (!gfa2.I || d2.canCook()) {
                void a2;
                a2.add(new Mda((eAa)gfa2, vRa.d, d2.getMetadata()));
            }
            n3 = ++n2;
        }
    }

    @Override
    public int f(Mda mda2) {
        gfa b2 = mda2;
        gfa a2 = this;
        b2 = HEa.byItemStack((Mda)b2);
        if (a2.I && b2.canCook()) {
            return b2.getCookedHealAmount();
        }
        return b2.getUncookedHealAmount();
    }

    @Override
    public float J(Mda mda2) {
        gfa b2 = mda2;
        gfa a2 = this;
        b2 = HEa.byItemStack((Mda)b2);
        if (a2.I && b2.canCook()) {
            return b2.getCookedSaturationModifier();
        }
        return b2.getUncookedSaturationModifier();
    }

    public String J(Mda mda2) {
        gfa b2 = mda2;
        gfa a2 = this;
        if (HEa.byItemStack((Mda)b2) == HEa.PUFFERFISH) {
            return nqa.c;
        }
        return null;
    }

    public String C(Mda mda2) {
        gfa b2 = mda2;
        gfa a2 = this;
        b2 = HEa.byItemStack((Mda)b2);
        return new StringBuilder().insert(2 & 5, a2.J()).append(VQa.ja).append(b2.getUnlocalizedName()).append(VQa.ja).append(a2.I && b2.canCook() ? uOa.G : LPa.T).toString();
    }
}

