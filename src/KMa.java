/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gna
 *  jba
 *  uQa
 *  vRa
 */
import com.google.common.base.Predicate;

public final class KMa
implements Predicate<jba> {
    public final /* synthetic */ gna I;

    public KMa(gna gna2) {
        KMa b2 = gna2;
        KMa a2 = this;
        a2.I = b2;
    }

    public boolean J(jba jba2) {
        KMa b2 = jba2;
        KMa a2 = this;
        if (b2.J() != null && !b2.J().startsWith(uQa.Y)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

