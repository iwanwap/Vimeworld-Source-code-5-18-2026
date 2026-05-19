/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  NTa
 *  WQa
 *  XTa
 *  jQa
 *  wOa
 */
import java.util.concurrent.Callable;

public final class eQa_3
implements Callable<String> {
    public final /* synthetic */ Kpa I;

    public eQa_3(Kpa kpa2) {
        eQa_3 b2 = kpa2;
        eQa_3 a2 = this;
        a2.I = b2;
    }

    public String J() throws Exception {
        eQa_3 eQa_32 = this;
        String a2 = jQa.J();
        if (!a2.equals(WQa.h)) {
            return new StringBuilder().insert(5 >> 3, xTa.B).append(a2).append(XTa.Z).toString();
        }
        if (Kpa.class.getSigners() == null) {
            return wOa.Q;
        }
        return NTa.M;
    }
}

