/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HY
 *  ld
 *  ysa
 */
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class PCa {
    private final ld k;
    private final Daa j;
    private final GameProfile J;
    public final /* synthetic */ bda A;
    private final int I;

    public GameProfile J() {
        PCa a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public PCa(bda bda2, GameProfile gameProfile, int n2, Daa daa, ld ld2) {
        PCa f2;
        void b2;
        void c2;
        void d2;
        void e2;
        PCa a2;
        PCa pCa = pCa2;
        PCa pCa2 = ld2;
        PCa pCa3 = a2 = pCa;
        PCa pCa4 = a2;
        a2.A = e2;
        pCa4.J = d2;
        pCa4.I = c2;
        pCa3.j = b2;
        pCa3.k = f2;
    }

    public Daa J() {
        PCa a2;
        return a2.j;
    }

    public int J() {
        PCa a2;
        return a2.I;
    }

    public String toString() {
        PCa a2;
        return Objects.toStringHelper(a2).add(oQa.A, a2.I).add(ppa.E, (Object)a2.j).add(ysa.N, a2.J).add(Yqa.H, a2.k == null ? null : HY.J((ld)a2.k)).toString();
    }

    public ld J() {
        PCa a2;
        return a2.k;
    }
}

