/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.util.StringTranslate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ey_2 {
    private static StringTranslate A;
    private static StringTranslate I;

    public static boolean J(String a2) {
        return I.J(a2);
    }

    public static String f(String a2) {
        return I.f(a2);
    }

    public static String J(String a2) {
        return A.f(a2);
    }

    public Ey_2() {
        Ey_2 a2;
    }

    public static long J() {
        return I.J();
    }

    public static String J(String string, Object ... objectArray) {
        Object[] b2 = objectArray;
        String a2 = string;
        return I.J(a2, b2);
    }

    static {
        I = StringTranslate.J();
        A = new StringTranslate();
    }
}

