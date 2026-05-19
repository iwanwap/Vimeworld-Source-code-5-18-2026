/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  vRa
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

public final class sU_3
extends MessageToByteEncoder<ByteBuf> {
    private final uba I;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        void a2;
        Object d2 = byteBuf;
        sU_3 b2 = this;
        Object object = d2;
        byte[] c2 = new byte[((ByteBuf)object).readableBytes()];
        ((ByteBuf)object).readBytes(c2);
        d2 = c2;
        Object object2 = b2.I.l;
        synchronized (object2) {
            if (b2.I.J != nqa.i) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = WOa.J;
                objectArray[vRa.d] = b2.I.J;
                objectArray[uqa.g] = c2;
                d2 = (byte[])NativeClassLoaderUtils.call((Object)objectArray);
            }
        }
        a2.writeBytes((byte[])d2);
    }

    public sU_3(uba uba2) {
        ChannelHandlerAdapter b2 = uba2;
        sU_3 a2 = this;
        a2.I = b2;
    }
}

