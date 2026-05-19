/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  Ssa
 *  Wc
 *  Ypa
 *  qma
 *  qna
 */
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public final class qma_2
extends qMa {
    private final qna J;
    private final Kpa B;
    private final Wc[] A;
    private int I;

    public static /* synthetic */ Kpa J(qma a2) {
        return a2.B;
    }

    public int M() {
        qma_2 a2;
        return super.M() + Ypa.A;
    }

    @Override
    public Wc J(int n2) {
        int b2 = n2;
        qma_2 a2 = this;
        return a2.A[b2];
    }

    public int e() {
        qma_2 a2;
        return a2.A.length;
    }

    public int l() {
        qma_2 a2;
        return super.l() + fPa.i;
    }

    /*
     * WARNING - void declaration
     */
    public qma_2(qna qna2, Kpa kpa2) {
        int n2;
        void a2;
        mIa[] c2 = qna2;
        mIa[] b2 = this;
        super((Kpa)a2, c2.A, c2.I, Ssa.u, c2.I - fPa.i, kTa.j);
        b2.I = uSa.E;
        b2.J = c2;
        b2.B = a2;
        c2 = ArrayUtils.clone(b2.B.z.ja);
        b2.A = new Wc[c2.length + mIa.getKeybinds().size()];
        Arrays.sort(c2);
        int n3 = uSa.E;
        String string = null;
        int n4 = c2.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            int n6;
            mIa mIa2 = c2[n2];
            String string2 = mIa2.getKeyCategory();
            if (!string2.equals(string)) {
                string = string2;
                b2.A[n3++] = new tma((qma)b2, string2);
            }
            if ((n6 = a2.Ea.J(oha.J(mIa2.getKeyDescription(), new Object[uSa.E]))) > b2.I) {
                b2.I = n6;
            }
            b2.A[n3++] = new yMa((qma)b2, mIa2, null);
            n5 = ++n2;
        }
    }

    public static /* synthetic */ qna J(qma a2) {
        return a2.J;
    }

    public static /* synthetic */ int J(qma a2) {
        return a2.I;
    }
}

