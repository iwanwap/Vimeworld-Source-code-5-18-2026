/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  isa
 */
public final class Oia_1 {
    private final String A;
    private final String I;

    public Oia_1(String string, Object object) {
        Throwable b2;
        Object c2 = object;
        Oia_1 a2 = this;
        a2.A = b2;
        if (c2 == null) {
            a2.I = isa.g;
            return;
        }
        if (c2 instanceof Throwable) {
            b2 = (Throwable)c2;
            Oia_1 oia_1 = a2;
            oia_1.I = STa.Ka + b2.getClass().getSimpleName() + Xpa.E + b2.getMessage();
            return;
        }
        a2.I = c2.toString();
    }

    public String f() {
        Oia_1 a2;
        return a2.I;
    }

    public String J() {
        Oia_1 a2;
        return a2.A;
    }
}

