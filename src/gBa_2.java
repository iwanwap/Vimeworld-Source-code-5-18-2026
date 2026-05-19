/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

public final class gBa_2
implements Callable<String> {
    public final /* synthetic */ KC A;
    public final /* synthetic */ XBa I;

    /*
     * WARNING - void declaration
     */
    public gBa_2(XBa xBa2, KC object) {
        void a2;
        Object b2 = object;
        object = this;
        ((gBa_2)object).I = a2;
        ((gBa_2)object).A = b2;
        object();
    }

    public String J() throws Exception {
        gBa_2 a2;
        return a2.A.getClass().getCanonicalName();
    }
}

