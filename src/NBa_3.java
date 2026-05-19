/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BBa
 *  IAa
 *  JSa
 *  Kca
 *  NBa
 *  OCa
 *  Qta
 *  fTa
 *  iAa
 *  vAa
 *  vRa
 */
import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class NBa_3 {
    private static final Logger C = LogManager.getLogger();
    public static final IAa<LocalEventLoopGroup> i;
    public volatile boolean M;
    public static final IAa<NioEventLoopGroup> k;
    private final List<ChannelFuture> j;
    public static final IAa<EpollEventLoopGroup> J;
    private final OCa A;
    private final List<uba> I;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress J() {
        ChannelFuture a2;
        NBa_3 nBa_3 = this;
        List<ChannelFuture> list = nBa_3.j;
        synchronized (list) {
            a2 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new iAa((NBa)nBa_3)).group((EventLoopGroup)k.J()).localAddress(LocalAddress.ANY)).bind().syncUninterruptibly();
            nBa_3.j.add(a2);
        }
        return a2.channel().localAddress();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(InetAddress inetAddress, int n2) throws IOException {
        NBa_3 nBa_3 = this;
        List<ChannelFuture> list = nBa_3.j;
        synchronized (list) {
            void a2;
            void b2;
            void c22;
            void var4_10;
            NBa_3 nBa_32;
            if (Epoll.isAvailable() && nBa_3.A.M()) {
                Class<EpollServerSocketChannel> clazz = EpollServerSocketChannel.class;
                IAa<EpollEventLoopGroup> c22 = J;
                C.info(JSa.o);
                nBa_32 = nBa_3;
            } else {
                Class<NioServerSocketChannel> clazz = NioServerSocketChannel.class;
                IAa<NioEventLoopGroup> c22 = k;
                C.info(fTa.h);
                nBa_32 = nBa_3;
            }
            nBa_32.j.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var4_10)).childHandler((ChannelHandler)new BBa((NBa)nBa_3)).group((EventLoopGroup)c22.J()).localAddress((InetAddress)b2, (int)a2)).bind().syncUninterruptibly());
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        NBa_3 nBa_3 = this;
        List<uba> list = nBa_3.I;
        synchronized (list) {
            Iterator<uba> iterator = nBa_3.I.iterator();
            while (iterator.hasNext()) {
                uba a2 = iterator.next();
                if (a2.f()) continue;
                if (!a2.J()) {
                    iterator.remove();
                    a2.J();
                    continue;
                }
                a2.C();
            }
            return;
        }
    }

    public void J() {
        NBa_3 nBa_3 = this;
        nBa_3.M = uSa.E;
        for (ChannelFuture channelFuture : nBa_3.j) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException interruptedException) {
                C.error(Qta.g);
            }
        }
    }

    public OCa J() {
        NBa_3 a2;
        return a2.A;
    }

    public static /* synthetic */ List J(NBa a2) {
        return a2.I;
    }

    public static /* synthetic */ OCa J(NBa a2) {
        return a2.A;
    }

    public NBa_3(OCa oCa2) {
        NBa_3 a2;
        NBa_3 b2 = oCa2;
        NBa_3 nBa_3 = a2 = this;
        a2.j = Collections.synchronizedList(Lists.newArrayList());
        nBa_3.I = Collections.synchronizedList(Lists.newArrayList());
        nBa_3.A = b2;
        nBa_3.M = vRa.d;
    }

    static {
        k = new vAa();
        J = new Kca();
        i = new fBa();
    }
}

