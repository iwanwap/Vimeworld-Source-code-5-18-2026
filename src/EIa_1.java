/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Yfa
 *  dFa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class EIa_1
implements Predicate<Gl> {
    public final /* synthetic */ JGa I;

    public boolean J(Gl gl2) {
        EIa_1 b2 = gl2;
        EIa_1 a2 = this;
        double d2 = a2.I.J();
        if (b2.q()) {
            d2 *= GPa.fa;
        }
        if (b2.C()) {
            return uSa.E != 0;
        }
        if ((double)b2.J((vL)JGa.J(a2.I)) > d2) {
            return uSa.E != 0;
        }
        return dFa.J((Yfa)JGa.J(a2.I), (Gl)b2, uSa.E != 0, vRa.d != 0);
    }

    public EIa_1(JGa jGa2) {
        Object b2 = jGa2;
        EIa_1 a2 = this;
        a2.I = b2;
    }
}

