/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DAa
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public final class PBa_2
extends MessageToByteEncoder<ByteBuf> {
    private final DAa I;

    /*
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException, Exception {
        void b2;
        ByteBuf d2 = byteBuf2;
        PBa_2 a2 = this;
        a2.I.J((ByteBuf)b2, d2);
    }

    public PBa_2(Cipher cipher) {
        Cipher b2 = cipher;
        PBa_2 a2 = this;
        PBa_2 pBa_2 = a2;
        pBa_2.I = new DAa(b2);
    }
}

