/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  ld
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public final class lBa
implements GenericFutureListener<Future<? super Void>> {
    public final /* synthetic */ CY A;
    public final /* synthetic */ XBa I;

    /*
     * WARNING - void declaration
     */
    public lBa(XBa xBa2, CY object) {
        void a2;
        lBa b2 = object;
        object = this;
        object.I = a2;
        object.A = b2;
    }

    @Override
    public void operationComplete(Future<? super Void> future) throws Exception {
        Future<? super Void> b2 = future;
        lBa a2 = this;
        a2.I.i.J((ld)a2.A);
    }
}

