/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eq
 *  vRa
 *  zp
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class VO_3 {
    private final zp A;
    private final List<Eq> I;

    public VO_3(zp zp2) {
        VO_3 b2 = zp2;
        VO_3 a2 = this;
        VO_3 vO_3 = a2;
        a2.I = new ArrayList<Eq>(yRa.d);
        a2.A = b2;
    }

    public int hashCode() {
        VO_3 a2;
        if (a2.A != null) {
            return a2.A.hashCode();
        }
        return uSa.E;
    }

    public zp J() {
        VO_3 a2;
        return a2.A;
    }

    public Collection<Eq> J() {
        VO_3 a2;
        return a2.I;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 == null || a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (VO_3)b2;
        return Objects.equals(((VO_3)a2).A, ((VO_3)b2).A);
    }

    public void J(Eq eq2) {
        VO_3 b2 = eq2;
        VO_3 a2 = this;
        a2.I.add((Eq)b2);
    }
}

