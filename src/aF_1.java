/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KF
 *  qf
 */
import java.util.function.Consumer;

public final class aF_1
implements Consumer {
    private final String I;

    public static Consumer J(String a2) {
        return new aF_1(a2);
    }

    public void accept(Object object) {
        Object b2 = object;
        aF_1 a2 = this;
        qf.J((String)a2.I, (KF)((KF)b2));
    }

    private aF_1(String string) {
        String b2 = string;
        aF_1 a2 = this;
        a2.I = b2;
    }
}

