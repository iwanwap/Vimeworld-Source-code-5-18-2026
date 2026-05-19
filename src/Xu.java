/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QF
 *  mA
 */
public final class Xu
implements mA {
    private final QF I;

    private Xu(QF qF2) {
        Xu b2 = qF2;
        Xu a2 = this;
        a2.I = b2;
    }

    public static mA J(QF a2) {
        return new Xu(a2);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Xu a2 = this;
        a2.I.J(b2);
    }
}

