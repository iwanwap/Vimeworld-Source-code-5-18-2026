/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kNa
 *  wC
 */
import com.google.common.base.Objects;
import java.util.List;

public final class Yna_3 {
    private final List<PB> J;
    private final wC A;
    private final int I;

    public int J() {
        Yna_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Yna_3(wC wC2, List<PB> list, int n2) {
        void b2;
        void c2;
        Yna_3 a2;
        int d2 = n2;
        Yna_3 yna_3 = a2 = this;
        a2.A = c2;
        yna_3.J = b2;
        yna_3.I = d2;
    }

    public PB J(int n2) {
        int b2 = n2;
        Yna_3 a2 = this;
        if (b2 >= 0 && b2 < a2.J.size()) {
            return Objects.firstNonNull(a2.J.get(b2), kNa.i);
        }
        return kNa.i;
    }
}

