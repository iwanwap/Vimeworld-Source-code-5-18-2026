/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KF
 *  ke
 */
import java.util.function.Consumer;

public final class ke_3
implements Consumer {
    private static final ke I = new ke_3();

    private ke_3() {
        ke_3 a2;
    }

    public static Consumer J() {
        return I;
    }

    public void accept(Object object) {
        Object b2 = object;
        ke_3 a2 = this;
        ((KF)b2).J();
    }
}

