/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CQa
 */
import java.nio.ByteBuffer;
import java.util.function.Consumer;

public final class sPa_3
implements Consumer {
    private final CQa A;
    private final Consumer I;

    public void accept(Object object) {
        sPa_3 a2;
        Object b2 = object;
        sPa_3 sPa_32 = a2 = this;
        CQa.J((CQa)sPa_32.A, (Consumer)sPa_32.I, (ByteBuffer)((ByteBuffer)b2));
    }

    /*
     * WARNING - void declaration
     */
    private sPa_3(CQa cQa2, Consumer consumer) {
        void b2;
        sPa_3 a2;
        Consumer c2 = consumer;
        sPa_3 sPa_32 = a2 = this;
        sPa_32.A = b2;
        sPa_32.I = c2;
    }

    public static Consumer J(CQa cQa2, Consumer consumer) {
        Object b2 = consumer;
        CQa a2 = cQa2;
        return new sPa_3(a2, (Consumer)b2);
    }
}

