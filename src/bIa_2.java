/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aX
 *  bFa
 *  dia
 *  gY
 *  vRa
 */
import com.google.common.base.Predicate;

public final class bIa_2
implements Predicate<gY> {
    public final /* synthetic */ dia J;
    public final /* synthetic */ bFa A;
    public final /* synthetic */ aX I;

    /*
     * WARNING - void declaration
     */
    public bIa_2(dia dia2, bFa bFa2, aX object) {
        void a2;
        bIa_2 b2 = object;
        object = this;
        object.J = a2;
        object.A = bFa2;
        object.I = b2;
    }

    public boolean J(gY gY2) {
        bIa_2 b2 = gY2;
        bIa_2 a2 = this;
        if (a2.A.J().f((gY)b2) && b2 != a2.I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

