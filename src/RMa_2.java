/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lra
 *  SMa
 *  vRa
 */
import java.util.concurrent.Callable;

public final class RMa_2
implements Callable {
    public final /* synthetic */ SMa J;
    public final /* synthetic */ int A;
    private static final String I = "CL_00000919";

    /*
     * WARNING - void declaration
     */
    public RMa_2(SMa sMa2, int n2) {
        void a2;
        int b2 = n2;
        RMa_2 rMa_2 = this;
        rMa_2.J = a2;
        rMa_2.A = b2;
    }

    public String J() throws Exception {
        RMa_2 a2;
        if (a2.A == 0) {
            return DPa.z;
        }
        if (a2.A == vRa.d) {
            return Lra.T;
        }
        if (a2.A == yRa.d) {
            return Vra.q;
        }
        return new StringBuilder().insert(3 & 4, rpa.c).append(a2.A).toString();
    }
}

