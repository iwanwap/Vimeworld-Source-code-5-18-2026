/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 *  vRa
 *  xy
 */
import com.google.common.base.Predicate;

public final class cia_2
implements Predicate<vL> {
    public final /* synthetic */ xy I;

    public boolean J(vL vL2) {
        cia_2 b2 = vL2;
        cia_2 a2 = this;
        if (((vL)b2).la >= a2.I.J && ((vL)b2).Z >= a2.I.j && ((vL)b2).A >= a2.I.I) {
            if (((vL)b2).la < a2.I.A && ((vL)b2).Z < a2.I.M && ((vL)b2).A < a2.I.k) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public cia_2(xy object) {
        cia_2 a2 = object;
        object = this;
        object.I = a2;
    }
}

