/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IAa
 *  mra
 *  vRa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.epoll.EpollEventLoopGroup;

public final class Kca_1
extends IAa<EpollEventLoopGroup> {
    public Kca_1() {
        Kca_1 a2;
    }

    public EpollEventLoopGroup J() {
        return new EpollEventLoopGroup(uSa.E, new ThreadFactoryBuilder().setNameFormat(mra.x).setDaemon(vRa.d != 0).build());
    }
}

