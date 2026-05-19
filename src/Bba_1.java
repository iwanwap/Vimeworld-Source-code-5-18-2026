/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NBa
 *  QSa
 *  VQa
 *  Zta
 *  bSa
 *  cRa
 *  vRa
 *  yQa
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.net.InetSocketAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Bba_1
extends ChannelInboundHandlerAdapter {
    private static final Logger A = LogManager.getLogger();
    private NBa I;

    /*
     * WARNING - void declaration
     */
    private void J(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        void b2;
        ByteBuf c2 = byteBuf;
        Bba_1 a2 = this;
        b2.pipeline().firstContext().writeAndFlush(c2).addListener(ChannelFutureListener.CLOSE);
    }

    private ByteBuf J(String string) {
        int n2;
        Object b2 = string;
        Bba_1 a2 = this;
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeByte(osa.Ja);
        b2 = ((String)b2).toCharArray();
        byteBuf.writeShort(((Object)b2).length);
        int n3 = ((Object)b2).length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            byteBuf.writeChar((int)b2[n2++]);
            n4 = n2;
        }
        return byteBuf;
    }

    public Bba_1(NBa nBa2) {
        Bba_1 b2 = nBa2;
        Bba_1 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        void b2;
        void a2;
        Bba_1 bba_1 = this;
        ByteBuf c2 = (ByteBuf)a2;
        c2.markReaderIndex();
        int n2 = vRa.d;
        try {
            if (c2.readUnsignedByte() == bSa.a) {
                ByteBuf byteBuf;
                InetSocketAddress inetSocketAddress = (InetSocketAddress)b2.channel().remoteAddress();
                Object object2 = bba_1.I.J();
                switch (c2.readableBytes()) {
                    case 0: {
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = inetSocketAddress.getAddress();
                        objectArray[vRa.d] = inetSocketAddress.getPort();
                        A.debug(dua.J, objectArray);
                        Object[] objectArray2 = new Object[yRa.d];
                        objectArray2[uSa.E] = object2.i();
                        objectArray2[vRa.d] = object2.M();
                        objectArray2[uqa.g] = object2.l();
                        String string = String.format(uua.ca, objectArray2);
                        byteBuf = c2;
                        Bba_1 bba_12 = bba_1;
                        bba_12.J((ChannelHandlerContext)b2, bba_12.J(string));
                        break;
                    }
                    case 1: {
                        if (c2.readUnsignedByte() != vRa.d) {
                            return;
                        }
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = inetSocketAddress.getAddress();
                        objectArray[vRa.d] = inetSocketAddress.getPort();
                        A.debug(QSa.Fa, objectArray);
                        Object[] objectArray3 = new Object[tTa.h];
                        objectArray3[uSa.E] = cRa.h;
                        objectArray3[vRa.d] = object2.f();
                        objectArray3[uqa.g] = object2.i();
                        objectArray3[yRa.d] = object2.M();
                        objectArray3[AQa.P] = object2.l();
                        String string = String.format(dua.x, objectArray3);
                        byteBuf = c2;
                        Bba_1 bba_13 = bba_1;
                        bba_13.J((ChannelHandlerContext)b2, bba_13.J(string));
                        break;
                    }
                    default: {
                        int n3 = c2.readUnsignedByte() == vRa.d ? vRa.d : uSa.E;
                        n3 &= c2.readUnsignedByte() == Zta.w ? vRa.d : uSa.E;
                        ByteBuf byteBuf2 = c2;
                        n3 &= Upa.e.equals(new String(byteBuf2.readBytes(byteBuf2.readShort() * uqa.g).array(), Charsets.UTF_16BE));
                        int n4 = c2.readUnsignedShort();
                        n3 &= c2.readUnsignedByte() >= Pua.Ka ? vRa.d : uSa.E;
                        ByteBuf byteBuf3 = c2;
                        n3 &= yRa.d + byteBuf3.readBytes(byteBuf3.readShort() * uqa.g).array().length + AQa.P == n4 ? vRa.d : uSa.E;
                        n3 &= c2.readInt() <= yQa.j ? vRa.d : uSa.E;
                        if ((n3 &= c2.readableBytes() == 0 ? vRa.d : uSa.E) == 0) {
                            return;
                        }
                        Object[] objectArray = new Object[uqa.g];
                        objectArray[uSa.E] = inetSocketAddress.getAddress();
                        objectArray[vRa.d] = inetSocketAddress.getPort();
                        A.debug(VQa.w, objectArray);
                        Object[] objectArray4 = new Object[tTa.h];
                        objectArray4[uSa.E] = cRa.h;
                        objectArray4[vRa.d] = object2.f();
                        objectArray4[uqa.g] = object2.i();
                        objectArray4[yRa.d] = object2.M();
                        objectArray4[AQa.P] = object2.l();
                        object2 = String.format(dua.x, objectArray4);
                        object2 = bba_1.J((String)object2);
                        try {
                            bba_1.J((ChannelHandlerContext)b2, (ByteBuf)object2);
                            byteBuf = c2;
                            break;
                        }
                        finally {
                            object2.release();
                        }
                    }
                }
                byteBuf.release();
                n2 = uSa.E;
                return;
            }
            if (n2 == 0) return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        c2.resetReaderIndex();
        b2.channel().pipeline().remove(dqa.i);
        b2.fireChannelRead(a2);
        return;
    }
}

