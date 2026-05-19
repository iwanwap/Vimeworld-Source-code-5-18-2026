/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  NEa
 *  vL
 */
import com.google.common.base.Predicate;

public final class yha_3
implements Predicate<T> {
    public final /* synthetic */ NEa A;
    public final /* synthetic */ Predicate I;

    public boolean J(T t2) {
        yha_3 b2 = t2;
        yha_3 a2 = this;
        if (a2.I != null && !a2.I.apply(b2)) {
            return uSa.E != 0;
        }
        if (b2 instanceof Sx) {
            double d2 = a2.A.J();
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
            if ((double)b2.J((vL)a2.A.j) > d2) {
                return uSa.E != 0;
            }
        }
        return a2.A.J((Gl)b2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public yha_3(NEa nEa2, Predicate predicate) {
        void a2;
        Predicate b2 = predicate;
        predicate = this;
        ((yha_3)predicate).A = a2;
        ((yha_3)predicate).I = b2;
    }
}

