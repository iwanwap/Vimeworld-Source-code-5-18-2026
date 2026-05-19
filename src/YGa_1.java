/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fia
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class YGa_1
implements Predicate<vL> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int I;

    public boolean J(vL vL2) {
        YGa_1 b22 = vL2;
        YGa_1 a2 = this;
        int b22 = fia.J((int)((int)Math.floor(((vL)b22).X)));
        if (a2.A > a2.I) {
            if (b22 >= a2.A || b22 <= a2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (b22 >= a2.A && b22 <= a2.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public YGa_1(int n2, int n3) {
        int a2 = n3;
        YGa_1 yGa_1 = this;
        yGa_1.A = n2;
        yGa_1.I = a2;
    }
}

