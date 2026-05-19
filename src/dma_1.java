/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  ONa
 *  Oz
 *  WSa
 *  XTa
 *  Zta
 *  bSa
 *  cRa
 *  dOa
 *  pY
 *  pua
 *  vRa
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public final class dma_1
extends SimpleChannelInboundHandler<ByteBuf> {
    public final /* synthetic */ ONa I;

    @Override
    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        ChannelHandlerContext c2 = channelHandlerContext;
        dma_1 b2 = this;
        c2.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        void a2;
        dma_1 dma_12 = this;
        super.channelActive((ChannelHandlerContext)a2);
        ByteBuf b2 = Unpooled.buffer();
        try {
            int n2;
            Object object = b2;
            ((ByteBuf)object).writeByte(bSa.a);
            b2.writeByte(vRa.d);
            b2.writeByte(Zta.w);
            char[] cArray = Upa.e.toCharArray();
            ((ByteBuf)object).writeShort(cArray.length);
            char[] cArray2 = cArray;
            int n3 = cArray2.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                char c2 = cArray2[n2];
                b2.writeChar(c2);
                n4 = ++n2;
            }
            Object object2 = b2;
            ((ByteBuf)object2).writeShort(XTa.W + uqa.g * dma_12.I.J.J().length());
            b2.writeByte(cRa.h);
            cArray = dma_12.I.J.J().toCharArray();
            ((ByteBuf)object2).writeShort(cArray.length);
            cArray2 = cArray;
            n3 = cArray2.length;
            int n5 = n2 = uSa.E;
            while (n5 < n3) {
                char c3 = cArray2[n2];
                b2.writeChar(c3);
                n5 = ++n2;
            }
            b2.writeInt(dma_12.I.J.J());
            a2.channel().writeAndFlush(b2).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
            return;
        }
        finally {
            b2.release();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        void b2;
        Object c2 = byteBuf;
        dma_1 a2 = this;
        if (c2.readUnsignedByte() == osa.Ja) {
            c2 = new String(c2.readBytes(c2.readShort() * uqa.g).array(), Charsets.UTF_16BE);
            c2 = Iterables.toArray(dOa.J().split((CharSequence)c2), String.class);
            if (MQa.x.equals(c2[uSa.E])) {
                String[] stringArray = c2;
                Oz.J((String)stringArray[vRa.d], (int)uSa.E);
                c2 = c2[uqa.g];
                String string = stringArray[yRa.d];
                int n2 = Oz.J((String)c2[AQa.P], (int)pua.o);
                int n3 = Oz.J((String)stringArray[tTa.h], (int)pua.o);
                dma_1 dma_12 = a2;
                dma_12.I.A.version = pua.o;
                dma_12.I.A.gameVersion = c2;
                dma_12.I.A.serverMOTD = string;
                dma_12.I.A.populationInfo = pY.GRAY + Mqa.y + n2 + Mqa.y + pY.DARK_GRAY + WSa.f + pY.GRAY + n3;
            }
        }
        b2.close();
    }

    public dma_1(ONa oNa2) {
        dma_1 b2 = oNa2;
        dma_1 a2 = this;
        a2.I = b2;
    }
}

