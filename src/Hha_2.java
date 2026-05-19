/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  PIa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class Hha_2
implements Predicate<vL> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String I;

    public Hha_2(String string, boolean bl) {
        boolean a2 = bl;
        Hha_2 hha_2 = this;
        hha_2.I = string;
        hha_2.A = a2;
    }

    public boolean J(vL vL2) {
        Hha_2 b2 = vL2;
        Hha_2 a2 = this;
        if (PIa.J((vL)b2, (String)a2.I) != a2.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

