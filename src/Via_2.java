/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class Via_2
implements Predicate<vL> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String I;

    public Via_2(String string, boolean bl) {
        boolean a2 = bl;
        Via_2 via_2 = this;
        via_2.I = string;
        via_2.A = a2;
    }

    public boolean J(vL vL2) {
        Via_2 b2 = vL2;
        Via_2 a2 = this;
        if (b2.J().equals(a2.I) != a2.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

