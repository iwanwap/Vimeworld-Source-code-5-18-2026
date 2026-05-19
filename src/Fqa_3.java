/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  WSa
 *  vRa
 */
import java.util.Objects;

public final class Fqa_3 {
    private boolean J;
    private boolean A;
    private boolean I;

    public void l(boolean bl2) {
        boolean b2 = bl2;
        Fqa_3 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public Fqa_3(boolean bl2, boolean bl3, boolean bl4) {
        void b2;
        void c2;
        Fqa_3 a2;
        boolean d2 = bl4;
        Fqa_3 fqa_3 = a2 = this;
        a2.A = c2;
        fqa_3.J = b2;
        fqa_3.I = d2;
    }

    public void f(boolean bl2) {
        boolean b2 = bl2;
        Fqa_3 a2 = this;
        a2.A = b2;
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        Fqa_3 a2 = this;
        a2.J = b2;
    }

    public boolean equals(Object object) {
        Object b2 = object;
        Fqa_3 a2 = this;
        if (b2 == null || a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (Fqa_3)b2;
        if (a2.A == ((Fqa_3)b2).A && a2.J == ((Fqa_3)b2).J && a2.I == ((Fqa_3)b2).I) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        Fqa_3 a2;
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = a2.A;
        objectArray[vRa.d] = a2.J;
        objectArray[uqa.g] = a2.I;
        return Objects.hash(objectArray);
    }

    public String toString() {
        Fqa_3 a2;
        return new StringBuilder().insert(3 ^ 3, Ata.ja).append(a2.A).append(WSa.d).append(a2.J).append(iSa.d).append(a2.I).append((char)ySa.Z).toString();
    }

    public boolean l() {
        Fqa_3 a2;
        return a2.I;
    }

    public boolean f() {
        Fqa_3 a2;
        return a2.J;
    }

    public boolean J() {
        Fqa_3 a2;
        return a2.A;
    }
}

