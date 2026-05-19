/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Fpa
 *  wra
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class Sba_2
extends ByteToMessageDecoder {
    private int A;
    private final Inflater I;

    public Sba_2(int n2) {
        int b2 = n2;
        Sba_2 a2 = this;
        a2.A = b2;
        Sba_2 sba_2 = a2;
        a2.I = new Inflater();
    }

    public void J(int n2) {
        int b2 = n2;
        Sba_2 a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws DataFormatException, Exception {
        ByteBuf d22 = byteBuf;
        Sba_2 b2 = this;
        if (d22.readableBytes() != 0) {
            void a2;
            Object c2 = new Lca(d22);
            int d22 = ((Lca)c2).readVarIntFromBuffer();
            if (d22 == 0) {
                Lca lca = c2;
                a2.add(lca.readBytes(lca.readableBytes()));
                return;
            }
            if (d22 < b2.A) {
                throw new DecoderException(new StringBuilder().insert(3 ^ 3, Fpa.m).append(d22).append(wra.T).append(b2.A).toString());
            }
            if (d22 > Bpa.M) {
                throw new DecoderException(new StringBuilder().insert(3 >> 2, Fpa.m).append(d22).append(GPa.y).append(Bpa.M).toString());
            }
            Lca lca = c2;
            byte[] byArray = new byte[lca.readableBytes()];
            c2 = byArray;
            lca.readBytes(byArray);
            Sba_2 sba_2 = b2;
            sba_2.I.setInput((byte[])c2);
            c2 = new byte[d22];
            sba_2.I.inflate((byte[])c2);
            a2.add(Unpooled.wrappedBuffer((byte[])c2));
            b2.I.reset();
        }
    }
}

