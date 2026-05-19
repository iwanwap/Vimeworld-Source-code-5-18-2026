/*
 * Decompiled with CFR 0.152.
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public final class DAa_1 {
    private byte[] J;
    private byte[] A;
    private final Cipher I;

    public DAa_1(Cipher cipher) {
        DAa_1 a2;
        Cipher b2 = cipher;
        DAa_1 dAa_1 = a2 = this;
        dAa_1.J = new byte[uSa.E];
        dAa_1.A = new byte[uSa.E];
        dAa_1.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    private byte[] J(ByteBuf byteBuf) {
        void a2;
        DAa_1 dAa_1 = this;
        int b2 = a2.readableBytes();
        if (dAa_1.J.length < b2) {
            dAa_1.J = new byte[b2];
        }
        a2.readBytes(dAa_1.J, uSa.E, b2);
        return dAa_1.J;
    }

    public ByteBuf J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws ShortBufferException {
        ByteBuf b2;
        Object c2 = byteBuf;
        DAa_1 a2 = this;
        int n2 = ((ByteBuf)c2).readableBytes();
        c2 = a2.J((ByteBuf)c2);
        b2 = b2.alloc().heapBuffer(a2.I.getOutputSize(n2));
        b2.writerIndex(a2.I.update((byte[])c2, uSa.E, n2, b2.array(), b2.arrayOffset()));
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException {
        void a2;
        Object c2 = byteBuf;
        DAa_1 b2 = this;
        int n2 = ((ByteBuf)c2).readableBytes();
        DAa_1 dAa_1 = b2;
        c2 = dAa_1.J((ByteBuf)c2);
        int n3 = dAa_1.I.getOutputSize(n2);
        if (dAa_1.A.length < n3) {
            b2.A = new byte[n3];
        }
        a2.writeBytes(b2.A, uSa.E, b2.I.update((byte[])c2, uSa.E, n2, b2.A));
    }
}

