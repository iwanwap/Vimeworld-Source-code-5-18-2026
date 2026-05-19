/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DAa
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public final class hAa
extends MessageToMessageDecoder<ByteBuf> {
    private final DAa I;

    public hAa(Cipher cipher) {
        Cipher b2 = cipher;
        hAa a2 = this;
        hAa hAa2 = a2;
        hAa2.I = new DAa(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws ShortBufferException, Exception {
        void b2;
        void c2;
        List<Object> d2 = list;
        hAa a2 = this;
        d2.add(a2.I.J((ChannelHandlerContext)c2, (ByteBuf)b2));
    }
}

