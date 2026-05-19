/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  Eoa
 *  Kpa
 *  Oz
 *  ST
 *  aSa
 *  oT
 *  pqa
 *  uw
 *  vL
 *  yra
 */
import com.google.common.base.Predicates;
import java.util.Iterator;

public final class Lt_1 {
    public static void J() {
        Eoa eoa;
        ANa aNa2;
        if (uw.j > 0) {
            aNa2 = Kpa.J().c;
            eoa = Kpa.J().Ta;
            if (eoa != null) {
                Iterator iterator;
                ANa aNa3 = aNa2;
                Iterator iterator2 = iterator = eoa.J((vL)aNa3, aNa3.J(), Predicates.and(Kaa.A, ST.J())).iterator();
                while (iterator2.hasNext()) {
                    vL vL2 = (vL)iterator.next();
                    iterator2 = iterator;
                    ANa aNa4 = aNa2;
                    gh.J((vL)aNa4, aNa4.J(vL2));
                }
            }
        }
        if (uw.Q == uqa.g) {
            aNa2 = Kpa.J().c;
            eoa = Kpa.J().Ta;
            if (eoa != null) {
                ANa aNa5 = aNa2;
                for (vL vL2 : eoa.J((vL)aNa5, aNa5.J().f(fPa.ca, aSa.V, fPa.ca), Predicates.and(Kaa.A, oT.J()))) {
                    double d2;
                    double d3;
                    double d4 = vL2.la - aNa2.la;
                    double d5 = vL2.A - aNa2.A;
                    double d6 = Oz.J((double)d4, (double)d5);
                    if (!(d3 >= yra.d)) continue;
                    d6 = Oz.J((double)d6);
                    d4 /= d6;
                    d5 /= d6;
                    d6 = oua.i / d6;
                    if (d2 > oua.i) {
                        d6 = oua.i;
                    }
                    d4 *= d6;
                    d5 *= d6;
                    d4 *= vua.Ha;
                    d5 *= vua.Ha;
                    d4 *= (double)(pqa.r - aNa2.Da);
                    d5 *= (double)(pqa.r - aNa2.Da);
                    if (aNa2.Aa == null) {
                        aNa2.f(-d4, iSa.P, -d5);
                    }
                    if (vL2.Aa != null) continue;
                    vL2.f(d4, iSa.P, d5);
                }
            }
        }
    }

    public static /* synthetic */ boolean f(vL a2) {
        return a2 instanceof Hna;
    }

    public static /* synthetic */ boolean J(vL a2) {
        return a2 instanceof Hna;
    }

    public Lt_1() {
        Lt_1 a2;
    }
}

