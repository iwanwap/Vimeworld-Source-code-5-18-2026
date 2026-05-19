/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.ListenableFuture;

public final class dja
implements Runnable {
    public final /* synthetic */ ListenableFuture A;
    public final /* synthetic */ mja I;

    @Override
    public void run() {
        dja a2;
        a2.A.cancel(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public dja(mja mja2, ListenableFuture object) {
        void a2;
        Object b2 = object;
        object = this;
        ((dja)object).I = a2;
        ((dja)object).A = b2;
        object();
    }
}

