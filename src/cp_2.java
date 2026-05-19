/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  k
 *  vRa
 */
import java.util.Collections;
import java.util.List;

public final class cp_2
implements k {
    private Bp J;
    private boolean A;
    private boolean I;

    public cp_2() {
        cp_2 a2;
    }

    public void J(Bp bp2) {
        Bp b2 = bp2;
        cp_2 a2 = this;
        a2.J = b2;
    }

    public float f() {
        cp_2 cp_22 = this;
        if (cp_22.A) {
            return JPa.N;
        }
        cp_22.A = vRa.d;
        float a2 = cp_22.J.l();
        cp_22.A = uSa.E;
        return a2;
    }

    public Bp J(String string) {
        String b2 = string;
        cp_2 a2 = this;
        if (a2.J.I.equals(b2)) {
            return a2.J;
        }
        return null;
    }

    public List<Bp> J() {
        cp_2 a2;
        return Collections.singletonList(a2.J);
    }

    public float J() {
        cp_2 cp_22 = this;
        if (cp_22.I) {
            return JPa.N;
        }
        cp_22.I = vRa.d;
        float a2 = cp_22.J.C();
        cp_22.I = uSa.E;
        return a2;
    }
}

