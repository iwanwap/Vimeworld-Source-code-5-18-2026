/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RCa
 *  Sqa
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

public final class Bda_2
extends ChannelInitializer<Channel> {
    public final /* synthetic */ uba I;

    public Bda_2(uba channelInboundHandlerAdapter) {
        ChannelInboundHandlerAdapter a2 = channelInboundHandlerAdapter;
        channelInboundHandlerAdapter = this;
        ((Bda_2)channelInboundHandlerAdapter).I = a2;
    }

    @Override
    public void initChannel(Channel channel) throws Exception {
        Channel channel2;
        Channel b2 = channel;
        Bda_2 a2 = this;
        try {
            b2.config().setOption(ChannelOption.TCP_NODELAY, vRa.d != 0);
            channel2 = b2;
        }
        catch (ChannelException channelException) {
            channel2 = b2;
        }
        channel2.pipeline().addLast(ysa.w, (ChannelHandler)new ReadTimeoutHandler(Fsa.d)).addLast(PQa.ca, (ChannelHandler)new my()).addLast(pua.x, (ChannelHandler)new nX(RCa.CLIENTBOUND)).addLast(Nta.i, (ChannelHandler)new UY()).addLast(Sqa.A, (ChannelHandler)new qZ(RCa.SERVERBOUND)).addLast(uQa.v, (ChannelHandler)a2.I);
    }
}

