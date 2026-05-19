/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HA
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class YX
implements Predicate<vL> {
    public YX() {
        YX a2;
    }

    public boolean J(vL vL2) {
        YX b2 = vL2;
        YX a2 = this;
        if (b2 instanceof HA && b2.K()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

