/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uQa
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;

public final class oCa_2
extends ChannelInitializer<Channel> {
    public final /* synthetic */ uba I;

    @Override
    public void initChannel(Channel channel) throws Exception {
        Channel b2 = channel;
        oCa_2 a2 = this;
        b2.pipeline().addLast(uQa.v, (ChannelHandler)a2.I);
    }

    public oCa_2(uba channelInboundHandlerAdapter) {
        ChannelInboundHandlerAdapter a2 = channelInboundHandlerAdapter;
        channelInboundHandlerAdapter = this;
        ((oCa_2)channelInboundHandlerAdapter).I = a2;
    }
}

