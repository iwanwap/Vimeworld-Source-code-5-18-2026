/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Tf
 *  vRa
 */
import com.google.common.base.Predicate;

public final class OY
implements Predicate<Gl> {
    public final /* synthetic */ Tf I;

    public OY(Tf tf) {
        OY b2 = tf;
        OY a2 = this;
        a2.I = b2;
    }

    public boolean J(Gl gl2) {
        OY b2 = gl2;
        OY a2 = this;
        if (b2 != null && b2.K() && a2.I.j(b2.J())) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

