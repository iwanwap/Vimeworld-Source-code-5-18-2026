/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dba
 */
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public final class Dba_2 {
    private final GenericFutureListener<? extends Future<? super Void>>[] A;
    private final KC I;

    public static /* synthetic */ GenericFutureListener[] J(Dba a2) {
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public Dba_2(KC kC2, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        void b2;
        GenericFutureListener<? extends Future<? super Void>>[] c2 = genericFutureListenerArray;
        GenericFutureListener<? extends Future<? super Void>>[] a2 = this;
        a2.I = b2;
        a2.A = c2;
    }

    public static /* synthetic */ KC J(Dba a2) {
        return a2.I;
    }
}

