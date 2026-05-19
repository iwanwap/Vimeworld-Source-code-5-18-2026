/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bba
 *  NBa
 *  RCa
 *  Sqa
 *  aA
 *  my
 *  nX
 *  pua
 *  qZ
 *  uQa
 *  vRa
 *  ysa
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

public final class BBa_2
extends ChannelInitializer<Channel> {
    public final /* synthetic */ NBa I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initChannel(Channel channel) throws Exception {
        void v0;
        void a2;
        BBa_2 bBa_2 = this;
        try {
            a2.config().setOption(ChannelOption.TCP_NODELAY, vRa.d != 0);
            v0 = a2;
        }
        catch (ChannelException b2) {
            v0 = a2;
        }
        v0.pipeline().addLast(ysa.w, (ChannelHandler)new ReadTimeoutHandler(Fsa.d)).addLast(dqa.i, (ChannelHandler)new Bba(bBa_2.I)).addLast(PQa.ca, (ChannelHandler)new my()).addLast(pua.x, (ChannelHandler)new nX(RCa.SERVERBOUND)).addLast(Nta.i, (ChannelHandler)new UY()).addLast(Sqa.A, (ChannelHandler)new qZ(RCa.CLIENTBOUND));
        ChannelInboundHandlerAdapter b2 = new uba(RCa.SERVERBOUND);
        NBa.J((NBa)bBa_2.I).add(b2);
        a2.pipeline().addLast(uQa.v, (ChannelHandler)b2);
        ((uba)b2).J((aA)new Hy(NBa.J((NBa)bBa_2.I), (uba)b2));
    }

    public BBa_2(NBa nBa2) {
        BBa_2 b2 = nBa2;
        BBa_2 a2 = this;
        a2.I = b2;
    }
}

