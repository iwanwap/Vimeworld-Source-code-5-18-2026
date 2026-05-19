/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  yga
 */
import java.util.Map;

public final class oha {
    private static yga A;
    private static final String I = "CL_00001094";

    public static String J(String string, Object ... objectArray) {
        Object[] b2 = objectArray;
        String a2 = string;
        return A.J(a2, b2);
    }

    public oha() {
        oha a2;
    }

    public static void J(yga a2) {
        A = a2;
    }

    public static Map J() {
        return oha.A.A;
    }
}

