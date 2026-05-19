/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NOa
 *  Waa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Iaa {
    public static final Iaa A = new Iaa(Mqa.y);
    private final String I;

    public void J(Waa waa2) {
        Iaa b2 = waa2;
        Iaa a2 = this;
        b2.J(NOa.s, a2.I);
    }

    public static Iaa J(Waa waa2) {
        Waa waa3 = waa2;
        if (waa3.J(NOa.s, Yqa.i)) {
            Object a2 = waa3.J(NOa.s);
            return new Iaa((String)a2);
        }
        return A;
    }

    public boolean J() {
        Iaa a2;
        if (a2.I == null || a2.I.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        Iaa a2;
        return a2.I;
    }

    public Iaa(String string) {
        String b2 = string;
        Iaa a2 = this;
        a2.I = b2;
    }
}

