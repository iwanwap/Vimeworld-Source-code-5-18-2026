/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rea
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class yfa_1
implements Predicate<vL> {
    public yfa_1() {
        yfa_1 a2;
    }

    public boolean J(vL vL2) {
        yfa_1 b2 = vL2;
        yfa_1 a2 = this;
        if (b2 instanceof Rea && ((Rea)b2).Ka()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

