/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Mda
 *  Oea
 *  Yfa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class ry_3
implements Predicate<vL> {
    private final Mda I;

    public ry_3(Mda mda2) {
        ry_3 b2 = mda2;
        ry_3 a2 = this;
        a2.I = b2;
    }

    public boolean J(vL vL2) {
        ry_3 b2 = vL2;
        ry_3 a2 = this;
        if (!b2.K()) {
            return uSa.E != 0;
        }
        if (!(b2 instanceof Gl)) {
            return uSa.E != 0;
        }
        if ((b2 = (Gl)b2).f(Yfa.J((Mda)a2.I)) != null) {
            return uSa.E != 0;
        }
        ry_3 ry_32 = b2;
        if (b2 instanceof Yfa) {
            return ((Yfa)ry_32).W();
        }
        if (ry_32 instanceof Oea) {
            return vRa.d != 0;
        }
        return b2 instanceof Sx;
    }
}

