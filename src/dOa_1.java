/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  FAa
 *  MAa
 *  ONa
 *  Sna
 *  XNa
 *  YSa
 *  aA
 *  dOa
 *  ld
 *  lma
 *  uOa
 *  wBa
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class dOa_1 {
    private static final Splitter J = Splitter.on((char)uSa.E).limit(uua.p);
    private static final Logger A = LogManager.getLogger();
    private final List<uba> I = Collections.synchronizedList(Lists.newArrayList());

    public dOa_1() {
        dOa_1 a2;
    }

    public static /* synthetic */ Logger J() {
        return A;
    }

    public static /* synthetic */ void J(dOa dOa2, lma lma2) {
        dOa b2 = lma2;
        dOa a2 = dOa2;
        super.J((lma)b2);
    }

    public static /* synthetic */ Splitter J() {
        return J;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f() {
        dOa_1 dOa_12 = this;
        List<uba> list = dOa_12.I;
        synchronized (list) {
            Iterator<uba> a2 = dOa_12.I.iterator();
            while (a2.hasNext()) {
                uba uba2 = (uba)a2.next();
                if (uba2.J()) {
                    uba2.C();
                    continue;
                }
                a2.remove();
                uba2.J();
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J() {
        dOa_1 dOa_12 = this;
        List<uba> list = dOa_12.I;
        synchronized (list) {
            Iterator<uba> a2 = dOa_12.I.iterator();
            while (a2.hasNext()) {
                uba uba2 = (uba)a2.next();
                if (!uba2.J()) continue;
                a2.remove();
                uba2.J((ld)new CY(YSa.a));
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(lma lma2) throws UnknownHostException {
        void a22;
        dOa_1 dOa_12 = this;
        Sna sna = Sna.J((String)a22.serverIP);
        uba b2 = uba.J(InetAddress.getByName(sna.J()), sna.J(), uSa.E != 0);
        dOa_12.I.add(b2);
        void v0 = a22;
        v0.serverMOTD = Ira.G;
        v0.pingToServer = fqa.Da;
        v0.playerList = null;
        b2.J((aA)new XNa((dOa)dOa_12, b2, (lma)a22));
        try {
            Object object = b2;
            ((uba)object).J((KC)new MAa(uOa.F, sna.J(), sna.J(), wBa.STATUS));
            ((uba)object).J((KC)new FAa());
            return;
        }
        catch (Throwable a22) {
            A.error(a22);
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(lma lma2) {
        void a2;
        dOa_1 dOa_12 = this;
        dOa_1 b2 = Sna.J((String)a2.serverIP);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)uba.b.J())).handler((ChannelHandler)new ONa((dOa)dOa_12, (Sna)b2, (lma)a2))).channel(NioSocketChannel.class)).connect(b2.J(), b2.J());
    }
}

