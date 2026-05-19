/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NBa
 *  RCa
 *  aA
 *  uQa
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;

public final class iAa_3
extends ChannelInitializer<Channel> {
    public final /* synthetic */ NBa I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initChannel(Channel channel) throws Exception {
        void a2;
        iAa_3 iAa_32 = this;
        ChannelInboundHandlerAdapter b2 = new uba(RCa.SERVERBOUND);
        ((uba)b2).J((aA)new qNa(NBa.J((NBa)iAa_32.I), (uba)b2));
        NBa.J((NBa)iAa_32.I).add(b2);
        a2.pipeline().addLast(uQa.v, (ChannelHandler)b2);
    }

    public iAa_3(NBa nBa2) {
        iAa_3 b2 = nBa2;
        iAa_3 a2 = this;
        a2.I = b2;
    }
}

