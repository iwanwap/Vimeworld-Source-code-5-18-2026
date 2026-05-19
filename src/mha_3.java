/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bFa
 *  pua
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class mha_3
implements Predicate<vL> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int I;

    public mha_3(int n2, int n3) {
        int a2 = n3;
        mha_3 mha_32 = this;
        mha_32.I = n2;
        mha_32.A = a2;
    }

    public boolean J(vL vL2) {
        mha_3 b2 = vL2;
        mha_3 a2 = this;
        if (!(b2 instanceof bFa)) {
            return uSa.E != 0;
        }
        b2 = (bFa)b2;
        if (!(a2.I > pua.o && ((bFa)b2).j < a2.I || a2.A > pua.o && ((bFa)b2).j > a2.A)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

