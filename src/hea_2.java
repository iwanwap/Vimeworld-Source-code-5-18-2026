/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZFa
 *  cfa
 *  vL
 *  vRa
 *  xfa
 */
import com.google.common.base.Predicate;

public final class hea_2
implements Predicate<vL> {
    public final /* synthetic */ xfa I;

    public boolean J(vL vL2) {
        hea_2 b2 = vL2;
        hea_2 a2 = this;
        if (b2 instanceof ZFa || b2 instanceof cfa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public hea_2(xfa xfa2) {
        hea_2 b2 = xfa2;
        hea_2 a2 = this;
        a2.I = b2;
    }
}

