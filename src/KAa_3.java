/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  wBa
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;

public final class KAa_3
implements Runnable {
    public final /* synthetic */ wBa k;
    public final /* synthetic */ KC j;
    public final /* synthetic */ uba J;
    public final /* synthetic */ GenericFutureListener[] A;
    public final /* synthetic */ wBa I;

    /*
     * WARNING - void declaration
     */
    public KAa_3(uba uba2, wBa wBa2, wBa wBa3, KC kC2, GenericFutureListener[] genericFutureListenerArray) {
        GenericFutureListener[] b2;
        void a2;
        GenericFutureListener[] genericFutureListenerArray2 = genericFutureListenerArray3;
        GenericFutureListener[] genericFutureListenerArray3 = genericFutureListenerArray;
        genericFutureListenerArray = genericFutureListenerArray2;
        genericFutureListenerArray.J = a2;
        genericFutureListenerArray.I = wBa2;
        genericFutureListenerArray.k = wBa3;
        genericFutureListenerArray.j = kC2;
        genericFutureListenerArray.A = b2;
    }

    @Override
    public void run() {
        KAa_3 kAa_3;
        KAa_3 kAa_32 = kAa_3 = this;
        if (kAa_32.I != kAa_32.k) {
            KAa_3 kAa_33 = kAa_3;
            kAa_33.J.J(kAa_33.I);
        }
        KAa_3 kAa_34 = kAa_3;
        ChannelFuture a2 = uba.J(kAa_34.J).writeAndFlush(kAa_3.j);
        if (kAa_34.A != null) {
            a2.addListeners(kAa_3.A);
        }
        a2.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
    }
}

