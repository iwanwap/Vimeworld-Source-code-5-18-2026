/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bda
 *  CY
 *  CZ
 *  Dba
 *  IAa
 *  Ida
 *  KAa
 *  LQa
 *  PBa
 *  RCa
 *  SOa
 *  Sba
 *  Sqa
 *  XSa
 *  Xsa
 *  Zpa
 *  aA
 *  bW
 *  fsa
 *  ld
 *  mra
 *  oCa
 *  pua
 *  rd
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  sU
 *  vRa
 *  wAa
 *  wBa
 */
import com.google.common.collect.Queues;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uba
extends SimpleChannelInboundHandler<KC> {
    private ld d;
    private static final Logger a = LogManager.getLogger();
    public static final IAa<NioEventLoopGroup> b;
    public final Object l;
    public static final IAa<LocalEventLoopGroup> e;
    private final Queue<Dba> G;
    public static final Marker D;
    private final ReentrantReadWriteLock f;
    private Channel F;
    public static final Marker g;
    public static final AttributeKey<wBa> L;
    private boolean E;
    public long m;
    private final RCa C;
    private SocketAddress i;
    private String M;
    private aA k;
    private boolean j;
    public volatile long J;
    private boolean A;
    public static final IAa<EpollEventLoopGroup> I;

    /*
     * WARNING - void declaration
     */
    public static uba J(InetAddress inetAddress, int n2, boolean bl) {
        void b2;
        Object c2;
        Class clazz;
        void a2;
        InetAddress inetAddress2 = inetAddress;
        uba uba2 = new uba(RCa.CLIENTBOUND);
        if (Epoll.isAvailable() && a2 != false) {
            clazz = EpollSocketChannel.class;
            c2 = I;
        } else {
            clazz = NioSocketChannel.class;
            c2 = b;
        }
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)c2.J())).handler((ChannelHandler)new Bda(uba2))).channel(clazz)).connect(inetAddress2, (int)b2).syncUninterruptibly();
        return uba2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(KC kC2, GenericFutureListener<? extends Future<? super Void>>[] genericFutureListenerArray) {
        void a2;
        void b2;
        uba uba2 = this;
        uba c2 = wBa.getFromPacket((KC)b2);
        wBa wBa2 = uba2.F.attr(L).get();
        if (wBa2 != c2) {
            a.debug(nqa.Ja);
            uba2.F.config().setAutoRead(uSa.E != 0);
        }
        if (uba2.F.eventLoop().inEventLoop()) {
            if (c2 != wBa2) {
                uba2.J((wBa)c2);
            }
            ChannelFuture channelFuture = uba2.F.writeAndFlush(b2);
            if (a2 != null) {
                channelFuture.addListeners((GenericFutureListener<? extends Future<? super Void>>)a2);
            }
            channelFuture.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
            return;
        }
        uba2.F.eventLoop().execute((Runnable)new KAa(uba2, (wBa)c2, wBa2, (KC)b2, (GenericFutureListener[])a2));
    }

    public SocketAddress J() {
        uba a2;
        return a2.i;
    }

    public boolean d() {
        uba a2;
        if (a2.F instanceof LocalChannel || a2.F instanceof LocalServerChannel) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(KC kC2, GenericFutureListener<? extends Future<? super Void>> genericFutureListener, GenericFutureListener<? extends Future<? super Void>> ... genericFutureListenerArray) {
        void b2;
        void a2;
        KC d2 = kC2;
        Object c2 = this;
        if (((uba)c2).J()) {
            uba uba2 = c2;
            uba2.l();
            uba2.J(d2, (GenericFutureListener[])ArrayUtils.add(a2, uSa.E, b2));
            return;
        }
        ((uba)c2).f.writeLock().lock();
        try {
            ((uba)c2).G.add(new Dba(d2, (GenericFutureListener[])ArrayUtils.add(a2, uSa.E, b2)));
            return;
        }
        finally {
            ((uba)c2).f.writeLock().unlock();
        }
    }

    static {
        D = MarkerManager.getMarker(mra.R);
        g = MarkerManager.getMarker(QTa.g, D);
        L = AttributeKey.valueOf(Iqa.V);
        b = new rBa();
        I = new Uca();
        e = new wAa();
    }

    public static /* synthetic */ Channel J(uba a2) {
        return a2.F;
    }

    public void J(ChannelHandlerContext channelHandlerContext, KC kC2) throws Exception {
        KC c2 = kC2;
        uba a2 = this;
        if (a2.F.isOpen()) {
            try {
                a2.m = System.currentTimeMillis();
                c2.J(a2.k);
                return;
            }
            catch (Ida ida2) {}
        }
    }

    public boolean C() {
        uba a2;
        return a2.E;
    }

    public void C() {
        uba a2;
        uba uba2 = a2;
        uba2.l();
        if (uba2.k instanceof rd) {
            ((rd)a2.k).J();
        }
        a2.F.flush();
    }

    public boolean l() {
        uba a2;
        return a2.A;
    }

    public aA J() {
        uba a2;
        return a2.k;
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        uba uba2;
        CZ b2;
        Throwable c2 = throwable;
        uba a2 = this;
        if (c2 instanceof TimeoutException) {
            b2 = new CZ(BPa.s, new Object[uSa.E]);
            uba2 = a2;
        } else {
            a.error(Xsa.A, c2);
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = new StringBuilder().insert(5 >> 3, Bra.v).append(c2).toString();
            b2 = new CZ(fsa.x, objectArray);
            uba2 = a2;
        }
        uba2.J((ld)b2);
    }

    public void J(SecretKey secretKey) {
        SecretKey b2 = secretKey;
        uba a2 = this;
        a2.A = vRa.d;
        a2.F.pipeline().addBefore(PQa.ca, LQa.y, new hAa(az.J(uqa.g, b2)));
        a2.F.pipeline().addBefore(Nta.i, IPa.I, (ChannelHandler)new PBa(az.J(vRa.d, b2)));
    }

    public uba(RCa rCa2) {
        uba a2;
        uba b2 = rCa2;
        uba uba2 = a2 = this;
        a2.G = Queues.newConcurrentLinkedQueue();
        uba uba3 = a2;
        uba3.f = new ReentrantReadWriteLock();
        uba2.l = new Object();
        uba2.m = System.currentTimeMillis();
        uba2.C = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        uba a2 = this;
        if (b2 >= 0) {
            uba uba2;
            if (a2.F.pipeline().get(SOa.T) instanceof Sba) {
                ((Sba)a2.F.pipeline().get(SOa.T)).J(b2);
                uba2 = a2;
            } else {
                uba uba3 = a2;
                uba2 = uba3;
                uba3.F.pipeline().addBefore(pua.x, SOa.T, (ChannelHandler)new Sba(b2));
            }
            if (uba2.F.pipeline().get(cPa.T) instanceof yBa) {
                ((yBa)a2.F.pipeline().get(SOa.T)).J(b2);
                return;
            }
            a2.F.pipeline().addBefore(Sqa.A, cPa.T, new yBa(b2));
            return;
        }
        if (a2.F.pipeline().get(SOa.T) instanceof Sba) {
            a2.F.pipeline().remove(SOa.T);
        }
        if (a2.F.pipeline().get(cPa.T) instanceof yBa) {
            a2.F.pipeline().remove(cPa.T);
        }
    }

    public boolean f() {
        uba a2;
        if (a2.F == null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String J() {
        uba a2;
        return a2.M;
    }

    public boolean J() {
        uba a2;
        if (a2.F != null && a2.F.isOpen()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(aA aA2) {
        uba b2 = aA2;
        uba a2 = this;
        Validate.notNull(b2, Zra.v, new Object[uSa.E]);
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = a2;
        objectArray[vRa.d] = b2;
        a.debug(Zpa.t, objectArray);
        a2.k = b2;
    }

    private void l() {
        uba uba2 = this;
        if (uba2.F != null && uba2.F.isOpen()) {
            uba2.f.readLock().lock();
            try {
                while (!uba2.G.isEmpty()) {
                    uba a2 = uba2.G.poll();
                    uba2.J(Dba.J((Dba)a2), Dba.J((Dba)a2));
                }
                return;
            }
            finally {
                uba2.f.readLock().unlock();
            }
        }
    }

    public ld J() {
        uba a2;
        return a2.d;
    }

    @Override
    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        ChannelHandlerContext b2 = channelHandlerContext;
        Object a2 = this;
        ((uba)a2).J((ld)new CZ(vua.h, new Object[uSa.E]));
    }

    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        uba a2;
        ChannelHandlerContext b22 = channelHandlerContext;
        uba uba2 = a2 = this;
        uba uba3 = a2;
        super.channelActive(b22);
        uba2.F = b22.channel();
        uba2.i = uba3.F.remoteAddress();
        try {
            a2.J(wBa.HANDSHAKING);
            return;
        }
        catch (Throwable b22) {
            a.fatal(b22);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(long l2) {
        uba uba2 = this;
        uba2.A = vRa.d;
        Object b2 = uba2.l;
        synchronized (b2) {
            void a2;
            uba2.J = a2;
        }
        uba2.F.pipeline().addBefore(PQa.ca, LQa.y, (ChannelHandler)new bW(uba2));
        uba2.F.pipeline().addBefore(Nta.i, IPa.I, (ChannelHandler)new sU(uba2));
    }

    public void J(ld ld2) {
        uba b2 = ld2;
        uba a2 = this;
        if (a2.F.isOpen()) {
            a2.F.close().awaitUninterruptibly();
            a2.d = b2;
        }
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        uba a2 = this;
        a2.E = b2;
    }

    public void J(KC kC2) {
        KC b2 = kC2;
        Object a2 = this;
        if (((uba)a2).J()) {
            uba uba2 = a2;
            uba2.l();
            uba2.J(b2, (GenericFutureListener[])null);
            return;
        }
        ((uba)a2).f.writeLock().lock();
        try {
            ((uba)a2).G.add(new Dba(b2, (GenericFutureListener[])null));
            return;
        }
        finally {
            ((uba)a2).f.writeLock().unlock();
        }
    }

    public void f() {
        uba a2;
        a2.F.config().setAutoRead(uSa.E != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        uba uba2 = this;
        if (uba2.F != null && !uba2.F.isOpen()) {
            if (!uba2.j) {
                uba2.j = vRa.d;
                Object a2 = uba2.l;
                synchronized (a2) {
                    if (uba2.J != nqa.i) {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = vua.Z;
                        objectArray[vRa.d] = uba2.J;
                        NativeClassLoaderUtils.call((Object)objectArray);
                        uba2.J = nqa.i;
                    }
                }
                if (uba2.J() != null) {
                    uba2.J().J(uba2.J());
                    return;
                }
                if (uba2.J() != null) {
                    uba2.J().J((ld)new CY(XSa.P));
                    return;
                }
            } else {
                a.warn(MRa.x);
            }
        }
    }

    public static uba J(SocketAddress socketAddress) {
        SocketAddress socketAddress2 = socketAddress;
        uba a2 = new uba(RCa.CLIENTBOUND);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)e.J())).handler((ChannelHandler)new oCa(a2))).channel(LocalChannel.class)).connect(socketAddress2).syncUninterruptibly();
        return a2;
    }

    public void J(wBa wBa2) {
        uba a2;
        uba b2 = wBa2;
        uba uba2 = a2 = this;
        uba2.F.attr(L).set((wBa)b2);
        uba2.F.config().setAutoRead(vRa.d != 0);
        a.debug(Hra.ga);
    }

    public void J(String string) {
        String b2 = string;
        uba a2 = this;
        a2.M = b2;
    }
}

