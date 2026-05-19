/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IAa
 *  SRa
 *  vRa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.epoll.EpollEventLoopGroup;

public final class Uca
extends IAa<EpollEventLoopGroup> {
    public Uca() {
        Uca a2;
    }

    public EpollEventLoopGroup J() {
        return new EpollEventLoopGroup(uSa.E, new ThreadFactoryBuilder().setNameFormat(SRa.I).setDaemon(vRa.d != 0).build());
    }
}

