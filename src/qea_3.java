/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GDa
 *  Gl
 *  HFa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class qea_3
implements Predicate<Gl> {
    private GDa I;

    public qea_3(GDa gDa2) {
        qea_3 b2 = gDa2;
        qea_3 a2 = this;
        a2.I = b2;
    }

    public boolean J(Gl gl2) {
        qea_3 b2 = gl2;
        qea_3 a2 = this;
        if ((b2 instanceof Sx || b2 instanceof HFa) && b2.J((vL)a2.I) > KSa.F) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

