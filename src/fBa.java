/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IAa
 *  vRa
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.channel.local.LocalEventLoopGroup;

public final class fBa
extends IAa<LocalEventLoopGroup> {
    public fBa() {
        fBa a2;
    }

    public LocalEventLoopGroup J() {
        return new LocalEventLoopGroup(uSa.E, new ThreadFactoryBuilder().setNameFormat(nOa.p).setDaemon(vRa.d != 0).build());
    }
}

