/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cra
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public final class my_2
extends ByteToMessageDecoder {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        ByteBuf d2 = byteBuf;
        my_2 b2 = this;
        d2.markReaderIndex();
        byte[] c2 = new byte[yRa.d];
        int n2 = uSa.E;
        int n3 = n2;
        while (n3 < c2.length) {
            if (!d2.isReadable()) {
                d2.resetReaderIndex();
                return;
            }
            int n4 = n2++;
            c2[n4] = d2.readByte();
            if (c2[n4] >= 0) {
                Lca lca = new Lca(Unpooled.wrappedBuffer(c2));
                try {
                    int n5 = lca.readVarIntFromBuffer();
                    if (d2.readableBytes() >= n5) {
                        void a2;
                        a2.add(d2.readBytes(n5));
                        return;
                    }
                    d2.resetReaderIndex();
                    return;
                }
                finally {
                    lca.release();
                }
            }
            n3 = n2;
        }
        throw new CorruptedFrameException(cra.F);
    }

    public my_2() {
        my_2 a2;
    }
}

