/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mA
 */
public final class PS
implements mA {
    private final CT I;

    private PS(CT cT2) {
        Object b2 = cT2;
        PS a2 = this;
        a2.I = b2;
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        PS a2 = this;
        CT.f(a2.I, b2);
    }

    public static mA J(CT a2) {
        return new PS(a2);
    }
}

