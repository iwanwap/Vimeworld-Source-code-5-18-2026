/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nu
 */
import java.util.function.Supplier;

public final class Nu_1
implements Supplier {
    private static final Nu instance = new Nu_1();

    private Nu_1() {
        Nu_1 a2;
    }

    public static Supplier J() {
        return instance;
    }

    public Object get() {
        return St.J();
    }
}

