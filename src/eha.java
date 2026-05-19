/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Yfa
 *  dFa
 *  uga
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class eha
implements Predicate<vL> {
    public final /* synthetic */ uga I;

    public eha(uga uga2) {
        eha b2 = uga2;
        eha a2 = this;
        a2.I = b2;
    }

    public boolean J(vL vL2) {
        eha b2 = vL2;
        eha a2 = this;
        if (!(b2 instanceof Sx)) {
            return uSa.E != 0;
        }
        if (((Sx)((Object)b2)).h.M) {
            return uSa.E != 0;
        }
        double d2 = a2.I.J();
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
        if ((double)b2.J((vL)uga.J((uga)a2.I)) > d2) {
            return uSa.E != 0;
        }
        return dFa.J((Yfa)uga.J((uga)a2.I), (Gl)((Gl)b2), uSa.E != 0, vRa.d != 0);
    }
}

