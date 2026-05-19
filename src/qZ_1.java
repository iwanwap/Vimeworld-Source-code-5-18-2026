/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  RCa
 *  vRa
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public final class qZ_1
extends MessageToByteEncoder<KC> {
    private static final Logger J = LogManager.getLogger();
    private static final Marker A = MarkerManager.getMarker(ySa.k, uba.g);
    private final RCa I;

    /*
     * WARNING - void declaration
     */
    public void J(ChannelHandlerContext channelHandlerContext, KC kC2, ByteBuf byteBuf) throws IOException, Exception {
        void a2;
        void b2;
        Object d22 = channelHandlerContext;
        qZ_1 c2 = this;
        Integer n2 = d22.channel().attr(uba.L).get().getPacketId(c2.I, (KC)b2);
        if (J.isDebugEnabled()) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = d22.channel().attr(uba.L).get();
            objectArray[vRa.d] = n2;
            objectArray[uqa.g] = b2.getClass().getName();
            J.debug(A, JPa.fa, objectArray);
        }
        if (n2 == null) {
            throw new IOException(Asa.a);
        }
        d22 = new Lca((ByteBuf)a2);
        ((Lca)d22).writeVarIntToBuffer(n2);
        try {
            b2.f((Lca)d22);
            return;
        }
        catch (Throwable d22) {
            J.error(d22);
            return;
        }
    }

    public qZ_1(RCa rCa2) {
        qZ_1 b2 = rCa2;
        qZ_1 a2 = this;
        a2.I = b2;
    }
}

