/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  coa
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public final class vNa_3
implements GenericFutureListener<Future<? super Void>> {
    public final /* synthetic */ long A;
    public final /* synthetic */ coa I;

    @Override
    public void operationComplete(Future<? super Void> future) throws Exception {
        Future<? super Void> b2 = future;
        vNa_3 a2 = this;
        coa.J((coa)a2.I).J(a2.A);
    }

    public vNa_3(coa coa2, long l2) {
        vNa_3 b2 = coa2;
        vNa_3 a2 = this;
        a2.I = b2;
        a2.A = l2;
    }
}

