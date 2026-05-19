/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ONa
 *  Sna
 *  dOa
 *  dma
 *  lma
 *  vRa
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

public final class ONa_2
extends ChannelInitializer<Channel> {
    public final /* synthetic */ Sna J;
    public final /* synthetic */ lma A;
    public final /* synthetic */ dOa I;

    @Override
    public void initChannel(Channel channel) throws Exception {
        Channel channel2;
        Channel b2 = channel;
        ONa_2 a2 = this;
        try {
            b2.config().setOption(ChannelOption.TCP_NODELAY, vRa.d != 0);
            channel2 = b2;
        }
        catch (ChannelException channelException) {
            channel2 = b2;
        }
        ChannelHandler[] channelHandlerArray = new ChannelHandler[vRa.d];
        channelHandlerArray[uSa.E] = new dma((ONa)a2);
        channel2.pipeline().addLast(channelHandlerArray);
    }

    /*
     * WARNING - void declaration
     */
    public ONa_2(dOa dOa2, Sna sna, lma object) {
        void a2;
        ONa_2 b2 = object;
        object = this;
        object.I = a2;
        object.J = sna;
        object.A = b2;
    }
}

