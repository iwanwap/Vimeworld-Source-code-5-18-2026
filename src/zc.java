/*
 * Decompiled with CFR 0.152.
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class zc {
    private static final String A = "[Shaders] ";
    private static final Logger I = LogManager.getLogger();

    public static void C(String a2) {
        I.warn(new StringBuilder().insert(3 & 4, zua.D).append(a2).toString());
    }

    public static void l(String a2) {
        I.debug(new StringBuilder().insert(2 & 5, zua.D).append(a2).toString());
    }

    public static void f(String a2) {
        I.error(new StringBuilder().insert(2 & 5, zua.D).append(a2).toString());
    }

    public static void C(String string, Object ... objectArray) {
        Object b2 = objectArray;
        String a2 = string;
        b2 = String.format(a2, b2);
        I.error(new StringBuilder().insert(3 ^ 3, zua.D).append((String)b2).toString());
    }

    public static void l(String string, Object ... objectArray) {
        Object b2 = objectArray;
        String a2 = string;
        b2 = String.format(a2, b2);
        I.debug(new StringBuilder().insert(3 ^ 3, zua.D).append((String)b2).toString());
    }

    public static void f(String string, Object ... objectArray) {
        Object b2 = objectArray;
        String a2 = string;
        b2 = String.format(a2, b2);
        I.warn(new StringBuilder().insert(2 & 5, zua.D).append((String)b2).toString());
    }

    public zc() {
        zc a2;
    }

    public static void J(String a2) {
        I.info(new StringBuilder().insert(2 & 5, zua.D).append(a2).toString());
    }

    public static void J(String string, Object ... objectArray) {
        Object b2 = objectArray;
        String a2 = string;
        b2 = String.format(a2, b2);
        I.info(new StringBuilder().insert(3 & 4, zua.D).append((String)b2).toString());
    }
}

