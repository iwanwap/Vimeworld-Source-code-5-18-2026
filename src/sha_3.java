/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class sha_3
implements Predicate<vL> {
    public final /* synthetic */ int k;
    public final /* synthetic */ XF j;
    public final /* synthetic */ int J;
    public final /* synthetic */ int A;
    public final /* synthetic */ int I;

    public boolean J(vL vL2) {
        sha_3 a2;
        sha_3 b22 = vL2;
        sha_3 sha_32 = a2 = this;
        int b22 = (int)b22.f(sha_32.j);
        if (!(sha_32.k >= 0 && b22 < a2.A || a2.I >= 0 && b22 > a2.J)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public sha_3(XF xF2, int n2, int n3, int n4, int n5) {
        void a2;
        sha_3 sha_32;
        int n6 = n5;
        sha_3 sha_33 = sha_32 = this;
        sha_32.j = xF2;
        sha_33.k = n2;
        sha_33.A = n3;
        sha_32.I = n4;
        sha_32.J = a2;
    }
}

