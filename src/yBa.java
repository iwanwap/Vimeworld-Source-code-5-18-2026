/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  uOa
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public final class yBa
extends MessageToByteEncoder<ByteBuf> {
    private int J;
    private final byte[] A;
    private final Deflater I;

    public yBa(int n2) {
        yBa a2;
        int b2 = n2;
        yBa yBa2 = a2 = this;
        yBa2.A = new byte[uOa.M];
        yBa2.J = b2;
        yBa yBa3 = a2;
        yBa2.I = new Deflater();
    }

    /*
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        Lca a2;
        void b2;
        ChannelHandlerContext d22 = channelHandlerContext;
        yBa c2 = this;
        int d22 = b2.readableBytes();
        a2 = new Lca(a2);
        if (d22 < c2.J) {
            Lca lca = a2;
            lca.writeVarIntToBuffer(uSa.E);
            lca.writeBytes((ByteBuf)b2);
            return;
        }
        byte[] byArray = new byte[d22];
        b2.readBytes(byArray);
        a2.writeVarIntToBuffer(byArray.length);
        yBa yBa2 = c2;
        yBa yBa3 = yBa2;
        yBa2.I.setInput(byArray, uSa.E, d22);
        yBa2.I.finish();
        while (!yBa3.I.finished()) {
            yBa yBa4 = c2;
            d22 = yBa4.I.deflate(yBa4.A);
            a2.writeBytes(c2.A, uSa.E, d22);
            yBa3 = c2;
        }
        c2.I.reset();
    }

    public void J(int n2) {
        int b2 = n2;
        yBa a2 = this;
        a2.J = b2;
    }
}

