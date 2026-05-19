/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cRa
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  vRa
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

public final class bW_2
extends MessageToMessageDecoder<ByteBuf> {
    private final uba I;

    public bW_2(uba uba2) {
        ChannelInboundHandlerAdapter b2 = uba2;
        bW_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        void a2;
        Object d2 = byteBuf;
        bW_2 b2 = this;
        Object object = d2;
        byte[] c2 = new byte[((ByteBuf)object).readableBytes()];
        ((ByteBuf)object).readBytes(c2);
        d2 = c2;
        Object object2 = b2.I.l;
        synchronized (object2) {
            if (b2.I.J != nqa.i) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = cRa.b;
                objectArray[vRa.d] = b2.I.J;
                objectArray[uqa.g] = c2;
                d2 = (byte[])NativeClassLoaderUtils.call((Object)objectArray);
            }
        }
        a2.add(Unpooled.wrappedBuffer((byte[])d2));
    }
}

