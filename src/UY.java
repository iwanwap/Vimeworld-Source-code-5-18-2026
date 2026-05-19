/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Uta
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public final class UY
extends MessageToByteEncoder<ByteBuf> {
    /*
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        Lca a2;
        void b2;
        ChannelHandlerContext d22 = channelHandlerContext;
        UY c2 = this;
        int d22 = b2.readableBytes();
        int n2 = Lca.getVarIntSize(d22);
        if (n2 > yRa.d) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, Uta.w).append(d22).append(mPa.b).append(yRa.d).toString());
        }
        a2 = new Lca(a2);
        a2.ensureWritable(n2 + d22);
        void v0 = b2;
        Lca lca = a2;
        lca.writeVarIntToBuffer(d22);
        lca.writeBytes((ByteBuf)v0, v0.readerIndex(), d22);
    }

    public UY() {
        UY a2;
    }
}

