/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IAa
 *  vRa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.nio.NioEventLoopGroup;

public final class rBa
extends IAa<NioEventLoopGroup> {
    public NioEventLoopGroup J() {
        return new NioEventLoopGroup(uSa.E, new ThreadFactoryBuilder().setNameFormat(ZSa.Q).setDaemon(vRa.d != 0).build());
    }

    public rBa() {
        rBa a2;
    }
}

