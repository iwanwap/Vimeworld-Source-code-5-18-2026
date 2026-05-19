/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FLa
 *  IJa
 */
import java.util.concurrent.Callable;

public final class IJa_2
implements Callable {
    private static final IJa I = new IJa_2();

    private IJa_2() {
        IJa_2 a2;
    }

    public static Callable J() {
        return I;
    }

    public Object call() {
        return FLa.J();
    }
}

