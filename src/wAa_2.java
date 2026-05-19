/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IAa
 *  psa
 *  vRa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;

public final class wAa_2
extends IAa<LocalEventLoopGroup> {
    public LocalEventLoopGroup J() {
        return new LocalEventLoopGroup(uSa.E, new ThreadFactoryBuilder().setNameFormat(psa.Da).setDaemon(vRa.d != 0).build());
    }

    public wAa_2() {
        wAa_2 a2;
    }
}

