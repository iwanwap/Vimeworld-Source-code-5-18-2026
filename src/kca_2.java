/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Kpa
 *  WQa
 *  XTa
 *  jQa
 *  nBa
 *  wOa
 */
import java.util.concurrent.Callable;

public final class kca_2
implements Callable {
    public final /* synthetic */ nBa A;
    private static final String I = "CL_00001131";

    public String J() throws Exception {
        kca_2 kca_22 = this;
        Object a2 = jQa.J();
        if (!((String)a2).equals(WQa.h)) {
            return new StringBuilder().insert(2 & 5, xTa.B).append((String)a2).append(XTa.Z).toString();
        }
        a2 = kca_22.A.C();
        if (!((String)a2).equals(WQa.h)) {
            return new StringBuilder().insert(3 & 4, BRa.ga).append((String)a2).append(XTa.Z).toString();
        }
        if (Kpa.class.getSigners() == null) {
            return wOa.Q;
        }
        return WPa.U;
    }

    public kca_2(nBa nBa2) {
        kca_2 b2 = nBa2;
        kca_2 a2 = this;
        a2.A = b2;
    }
}

