/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AOa
 *  Vna
 *  mca
 *  vRa
 */
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public final class NNa_3
implements Comparator<Vna> {
    private NNa_3() {
        NNa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Vna vna2, Vna vna3) {
        NNa_3 nNa_3;
        String string;
        void v2;
        boolean bl;
        void a2;
        void b2;
        NNa_3 nNa_32 = this;
        mca mca2 = b2.J();
        NNa_3 c2 = a2.J();
        ComparisonChain comparisonChain = ComparisonChain.start();
        if (b2.J() != Daa.SPECTATOR) {
            bl = vRa.d;
            v2 = a2;
        } else {
            bl = uSa.E;
            v2 = a2;
        }
        ComparisonChain comparisonChain2 = comparisonChain.compareTrueFirst(bl, (v2.J() != Daa.SPECTATOR ? vRa.d : uSa.E) != 0);
        if (mca2 != null) {
            string = mca2.J();
            nNa_3 = c2;
        } else {
            string = Mqa.y;
            nNa_3 = c2;
        }
        return comparisonChain2.compare((Comparable<?>)((Object)string), (Comparable<?>)((Object)(nNa_3 != null ? c2.J() : Mqa.y))).compare((Comparable<?>)((Object)b2.J().getName()), (Comparable<?>)((Object)a2.J().getName())).result();
    }

    public /* synthetic */ NNa_3(AOa aOa2) {
        NNa_3 b2 = aOa2;
        NNa_3 a2 = this;
        a2();
    }
}

