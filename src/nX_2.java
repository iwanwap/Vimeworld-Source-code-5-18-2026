/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RCa
 *  WSa
 *  isa
 *  nQa
 *  uRa
 *  vRa
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public final class nX_2
extends ByteToMessageDecoder {
    private static final Marker J;
    private final RCa A;
    private static final Logger I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws IOException, InstantiationException, IllegalAccessException, Exception {
        Object d2 = byteBuf;
        nX_2 b2 = this;
        if (((ByteBuf)d2).readableBytes() != 0) {
            void a2;
            void c2;
            d2 = new Lca((ByteBuf)d2);
            int n2 = ((Lca)d2).readVarIntFromBuffer();
            KC kC2 = c2.channel().attr(uba.L).get().getPacket(b2.A, n2);
            if (kC2 == null) {
                throw new IOException(new StringBuilder().insert(5 >> 3, Hta.ca).append(n2).toString());
            }
            kC2.J((Lca)d2);
            if (((Lca)d2).readableBytes() > 0) {
                throw new IOException(new StringBuilder().insert(5 >> 3, nqa.Ga).append(c2.channel().attr(uba.L).get().getId()).append(WSa.f).append(n2).append(nQa.T).append(kC2.getClass().getSimpleName()).append(uRa.g).append(((Lca)d2).readableBytes()).append(isa.A).append(n2).toString());
            }
            a2.add(kC2);
            if (I.isDebugEnabled()) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = c2.channel().attr(uba.L).get();
                objectArray[vRa.d] = n2;
                objectArray[uqa.g] = kC2.getClass().getName();
                I.debug(J, Eqa.P, objectArray);
            }
        }
    }

    public nX_2(RCa rCa2) {
        nX_2 b2 = rCa2;
        nX_2 a2 = this;
        a2.A = b2;
    }

    static {
        I = LogManager.getLogger();
        J = MarkerManager.getMarker(yOa.i, uba.g);
    }
}

