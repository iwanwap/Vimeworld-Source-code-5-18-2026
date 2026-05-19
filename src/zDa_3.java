/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GDa
 *  bFa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;

public final class zDa_3
implements Predicate<bFa> {
    public final /* synthetic */ GDa I;

    public boolean J(bFa bFa2) {
        zDa_3 b2 = bFa2;
        zDa_3 a2 = this;
        if (a2.I.J((vL)b2) < Npa.f && ((bFa)b2).s.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public zDa_3(GDa gDa2) {
        zDa_3 b2 = gDa2;
        zDa_3 a2 = this;
        a2.I = b2;
    }
}

