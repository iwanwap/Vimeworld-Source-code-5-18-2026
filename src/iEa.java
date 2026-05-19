/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Oda
 *  vL
 *  zfa
 */
import com.google.common.base.Predicate;

public final class iEa
implements Predicate<T> {
    public final /* synthetic */ bga J;
    public final /* synthetic */ Predicate A;
    public final /* synthetic */ Oda I;

    public boolean J(T t2) {
        iEa b2 = t2;
        iEa a2 = this;
        if (a2.A != null && !a2.A.apply(b2)) {
            return uSa.E != 0;
        }
        if (b2 instanceof zfa) {
            return uSa.E != 0;
        }
        if (b2 instanceof Sx) {
            double d2 = Oda.J((Oda)a2.I);
            if (b2.q()) {
                d2 *= GPa.fa;
            }
            if (b2.C()) {
                float f2;
                float f3 = ((Sx)((Object)b2)).k();
                if (f2 < Nra.e) {
                    f3 = Nra.e;
                }
                d2 *= (double)(ZSa.q * f3);
            }
            if ((double)b2.J((vL)a2.J) > d2) {
                return uSa.E != 0;
            }
        }
        return Oda.J((Oda)a2.I, (Gl)b2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public iEa(Oda oda2, Predicate predicate, bga object) {
        void a2;
        Object b2 = object;
        object = this;
        ((iEa)object).I = a2;
        ((iEa)object).A = predicate;
        ((iEa)object).J = b2;
    }
}

