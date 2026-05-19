/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QF
 *  mA
 */
public final class Pu
implements mA {
    private final QF I;

    private Pu(QF qF2) {
        Pu b2 = qF2;
        Pu a2 = this;
        a2.I = b2;
    }

    public static mA J(QF a2) {
        return new Pu(a2);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Pu a2 = this;
        a2.I.J(b2);
    }
}

