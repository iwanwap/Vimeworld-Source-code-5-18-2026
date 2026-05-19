/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bFa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class cHa
implements Predicate<vL> {
    public final /* synthetic */ int I;

    public cHa(int n2) {
        int a2 = n2;
        cHa cHa2 = this;
        cHa2.I = a2;
    }

    public boolean J(vL vL2) {
        cHa b2 = vL2;
        cHa a2 = this;
        if (!(b2 instanceof bFa)) {
            return uSa.E != 0;
        }
        if (((bFa)b2).s.J().getID() == a2.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

