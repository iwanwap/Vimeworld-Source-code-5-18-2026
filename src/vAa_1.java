/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IAa
 *  vPa
 *  vRa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.nio.NioEventLoopGroup;

public final class vAa_1
extends IAa<NioEventLoopGroup> {
    public NioEventLoopGroup J() {
        return new NioEventLoopGroup(uSa.E, new ThreadFactoryBuilder().setNameFormat(vPa.Y).setDaemon(vRa.d != 0).build());
    }

    public vAa_1() {
        vAa_1 a2;
    }
}

