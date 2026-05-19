/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  C
 *  Kpa
 *  Ks
 *  Mda
 *  Qqa
 *  Rd
 *  VEa
 *  VQa
 *  WQa
 *  WSa
 *  aJa
 *  eAa
 *  pua
 *  vRa
 *  ysa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class sDa
extends eAa {
    private static ResourceLocation J(Mda mda2) {
        Mda mda3 = mda2;
        Object a2 = sDa.d(mda3);
        if (a2 == null) {
            return null;
        }
        if (((String)a2).startsWith(WQa.o)) {
            a2 = ((String)a2).substring(yRa.d);
        }
        if (((String)a2).startsWith(WSa.f)) {
            a2 = ((String)a2).substring(vRa.d);
        }
        return new ResourceLocation(wua.A, new StringBuilder().insert(3 >> 2, Qqa.N).append((String)a2).toString());
    }

    public String C(Mda mda2) {
        Object b2 = mda2;
        sDa a2 = this;
        String string = sDa.e((Mda)b2);
        b2 = super.C((Mda)b2);
        if (string != null) {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(VQa.ja).append(string).toString();
        }
        return b2;
    }

    public sDa() {
        sDa a2;
        sDa sDa2 = a2;
        sDa2.J(ysa.s);
        a2.J(vRa.d != 0);
        a2.f(uSa.E);
        a2.f(Fsa.v);
    }

    public static String e(Mda a2) {
        if (a2.M() && a2.J().J(xra.d, Yqa.i)) {
            return a2.J().J(xra.d);
        }
        return null;
    }

    private static Rd J(Mda mda2) {
        Mda mda3 = mda2;
        ResourceLocation resourceLocation = sDa.J(mda3);
        if (resourceLocation == null) {
            return null;
        }
        aJa aJa2 = Kpa.J().J();
        Object a2 = aJa2.J(resourceLocation);
        if (a2 == null) {
            Ks ks2 = new Ks(resourceLocation);
            a2 = ks2;
            aJa2.J(resourceLocation, (H)a2);
            if (ks2.J()) {
                aJa2.J((C)ks2);
            }
        }
        return (Rd)a2;
    }

    private static String d(Mda mda2) {
        Mda mda3 = mda2;
        if (!mda3.M()) {
            return null;
        }
        if (!(mda3.J() instanceof VEa)) {
            return null;
        }
        int n2 = ((VEa)mda3.J()).J() == uEa.LEGS ? uqa.g : vRa.d;
        Mda a2 = mda3.J();
        if (!a2.J(aua.G + n2, Yqa.i)) {
            return null;
        }
        return a2.J(new StringBuilder().insert(3 & 4, aua.G).append(n2).toString());
    }

    public static int f(Mda mda2) {
        Mda mda3 = mda2;
        Mda a2 = sDa.J(mda3);
        if (a2 == null) {
            return pua.o;
        }
        return a2.J();
    }
}

