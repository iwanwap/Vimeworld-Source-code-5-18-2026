/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  NBa
 *  ld
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public final class Zca_2
implements GenericFutureListener<Future<? super Void>> {
    public final /* synthetic */ uba J;
    public final /* synthetic */ CY A;
    public final /* synthetic */ NBa I;

    @Override
    public void operationComplete(Future<? super Void> future) throws Exception {
        Zca_2 a2;
        Future<? super Void> b2 = future;
        Zca_2 zca_2 = a2 = this;
        zca_2.J.J((ld)zca_2.A);
    }

    /*
     * WARNING - void declaration
     */
    public Zca_2(NBa nBa2, uba uba2, CY object) {
        void a2;
        Zca_2 b2 = object;
        object = this;
        object.I = a2;
        object.J = uba2;
        object.A = b2;
    }
}

