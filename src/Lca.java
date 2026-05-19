/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  HY
 *  Mda
 *  NTa
 *  Ssa
 *  VQa
 *  Waa
 *  XTa
 *  YSa
 *  aSa
 *  cRa
 *  eAa
 *  ld
 *  mra
 *  oqa
 *  pua
 *  tCa
 *  uca
 *  vRa
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

public final class Lca
extends ByteBuf {
    private final ByteBuf buf;

    @Override
    public ByteBuf markReaderIndex() {
        Lca a2;
        return a2.buf.markReaderIndex();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setInt(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setInt((int)b2, c2);
    }

    public byte[] readByteArray() {
        Lca lca;
        Lca lca2 = lca = this;
        byte[] byArray = new byte[lca2.readVarIntFromBuffer()];
        Object a2 = byArray;
        lca2.readBytes(byArray);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Lca a2 = this;
        return a2.buf.setBytes((int)d2, (ByteBuf)c2, (int)b2, (int)e2);
    }

    @Override
    public float readFloat() {
        Lca a2;
        return a2.buf.readFloat();
    }

    @Override
    public ByteBuf ensureWritable(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.ensureWritable(b2);
    }

    @Override
    public boolean release(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.release(b2);
    }

    @Override
    public ByteBuf resetWriterIndex() {
        Lca a2;
        return a2.buf.resetWriterIndex();
    }

    @Override
    public int readInt() {
        Lca a2;
        return a2.buf.readInt();
    }

    public void writeNBTTagCompoundToBuffer(Waa waa2) {
        Lca b22 = waa2;
        Lca a2 = this;
        if (b22 == null) {
            a2.writeByte(uSa.E);
            return;
        }
        try {
            tCa.J((Waa)b22, (DataOutput)new ByteBufOutputStream(a2));
            return;
        }
        catch (IOException b22) {
            throw new EncoderException(b22);
        }
    }

    @Override
    public int readUnsignedMedium() {
        Lca a2;
        return a2.buf.readUnsignedMedium();
    }

    @Override
    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        Comparable<ByteBuf> b2 = byteBuffer;
        Lca a2 = this;
        return a2.buf.writeBytes((ByteBuffer)b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBytes(int n2, ByteBuffer byteBuffer) {
        void b2;
        Comparable<ByteBuf> c2 = byteBuffer;
        Lca a2 = this;
        return a2.buf.setBytes((int)b2, (ByteBuffer)c2);
    }

    @Override
    public int writerIndex() {
        Lca a2;
        return a2.buf.writerIndex();
    }

    @Override
    public ByteBuf writeBytes(byte[] byArray) {
        Object b2 = byArray;
        Lca a2 = this;
        return a2.buf.writeBytes((byte[])b2);
    }

    public XF readBlockPos() {
        Lca a2;
        return XF.fromLong(a2.readLong());
    }

    @Override
    public ByteBuf writeMedium(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writeMedium(b2);
    }

    @Override
    public int getInt(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getInt(b2);
    }

    @Override
    public byte getByte(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getByte(b2);
    }

    public void writeByteArray(byte[] byArray) {
        Object b2 = byArray;
        Lca a2 = this;
        a2.writeVarIntToBuffer(((Object)b2).length);
        a2.writeBytes((byte[])b2);
    }

    @Override
    public int maxCapacity() {
        Lca a2;
        return a2.buf.maxCapacity();
    }

    @Override
    public int refCnt() {
        Lca a2;
        return a2.buf.refCnt();
    }

    @Override
    public int hashCode() {
        Lca a2;
        return a2.buf.hashCode();
    }

    public void writeUuid(UUID uUID) {
        Comparable<ByteBuf> b2 = uUID;
        Lca a2 = this;
        a2.writeLong(((UUID)b2).getMostSignificantBits());
        a2.writeLong(((UUID)b2).getLeastSignificantBits());
    }

    @Override
    public ByteBuf duplicate() {
        Lca a2;
        return a2.buf.duplicate();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setByte(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setByte((int)b2, c2);
    }

    @Override
    public int compareTo(ByteBuf byteBuf) {
        ByteBuf b2 = byteBuf;
        Lca a2 = this;
        return a2.buf.compareTo(b2);
    }

    @Override
    public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
        ByteBufProcessor b2 = byteBufProcessor;
        Lca a2 = this;
        return a2.buf.forEachByteDesc(b2);
    }

    @Override
    public ByteBuf unwrap() {
        Lca a2;
        return a2.buf.unwrap();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf readBytes(ByteBuf byteBuf, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.readBytes((ByteBuf)c2, (int)b2, d2);
    }

    public void writeVarLong(long a2) {
        Lca b2;
        long l2 = a2;
        while ((l2 & VQa.i) != nqa.i) {
            b2.writeByte((int)(a2 & ITa.Ia) | XOa.h);
            l2 = a2 >>>= XTa.W;
        }
        b2.writeByte((int)a2);
    }

    @Override
    public int writableBytes() {
        Lca a2;
        return a2.buf.writableBytes();
    }

    @Override
    public ByteBuf markWriterIndex() {
        Lca a2;
        return a2.buf.markWriterIndex();
    }

    @Override
    public ByteBuf writeLong(long a2) {
        Lca b2;
        return b2.buf.writeLong(a2);
    }

    public ld readChatComponent() throws IOException {
        Lca a2;
        return HY.J((String)a2.readStringFromBuffer(BQa.h));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, byte[] byArray) {
        void b2;
        Object c2 = byArray;
        Lca a2 = this;
        return a2.buf.getBytes((int)b2, (byte[])c2);
    }

    @Override
    public int readerIndex() {
        Lca a2;
        return a2.buf.readerIndex();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int writeBytes(InputStream inputStream, int n2) throws IOException {
        void b2;
        int c2 = n2;
        Lca a2 = this;
        return a2.buf.writeBytes((InputStream)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer[] nioBuffers(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.nioBuffers((int)b2, c2);
    }

    @Override
    public char getChar(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getChar(b2);
    }

    @Override
    public ByteBuf writeShort(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writeShort(b2);
    }

    @Override
    public ByteBuf resetReaderIndex() {
        Lca a2;
        return a2.buf.resetReaderIndex();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setChar(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setChar((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf writeBytes(byte[] byArray, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.writeBytes((byte[])c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setShort(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setShort((int)b2, c2);
    }

    @Override
    public ByteBuf readerIndex(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.readerIndex(b2);
    }

    @Override
    public long readLong() {
        Lca a2;
        return a2.buf.readLong();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int getBytes(int n2, GatheringByteChannel gatheringByteChannel, int n3) throws IOException {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.getBytes((int)c2, (GatheringByteChannel)b2, d2);
    }

    @Override
    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        Comparable<ByteBuf> b2 = byteBuffer;
        Lca a2 = this;
        return a2.buf.readBytes((ByteBuffer)b2);
    }

    @Override
    public ByteBuf clear() {
        Lca a2;
        return a2.buf.clear();
    }

    @Override
    public boolean isWritable() {
        Lca a2;
        return a2.buf.isWritable();
    }

    public void writeBlockPos(XF xF) {
        XF b2 = xF;
        Lca a2 = this;
        a2.writeLong(b2.toLong());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.getBytes((int)c2, (ByteBuf)b2, d2);
    }

    @Override
    public ByteBuf writeByte(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writeByte(b2);
    }

    @Override
    public float getFloat(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getFloat(b2);
    }

    @Override
    public ByteBuf writeChar(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writeChar(b2);
    }

    @Override
    public ByteOrder order() {
        Lca a2;
        return a2.buf.order();
    }

    public void writeItemStackToBuffer(Mda mda2) {
        Lca b2 = mda2;
        Lca a2 = this;
        if (b2 == null) {
            a2.writeShort(pua.o);
            return;
        }
        a2.writeShort(eAa.J((eAa)b2.J()));
        a2.writeByte(((Mda)b2).E);
        a2.writeShort(b2.J());
        Waa waa2 = null;
        if (b2.J().C() || b2.J().J()) {
            waa2 = b2.J();
        }
        a2.writeNBTTagCompoundToBuffer(waa2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf writeBytes(ByteBuf byteBuf, int n2) {
        void b2;
        int c2 = n2;
        Lca a2 = this;
        return a2.buf.writeBytes((ByteBuf)b2, c2);
    }

    @Override
    public boolean isReadable() {
        Lca a2;
        return a2.buf.isReadable();
    }

    public <T extends Enum<T>> T readEnumValue(Class<T> clazz) {
        Class<T> b2 = clazz;
        Lca a2 = this;
        return (T)((Enum[])b2.getEnumConstants())[a2.readVarIntFromBuffer()];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBoolean(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        Lca a2 = this;
        return a2.buf.setBoolean((int)b2, c2);
    }

    public void writeChatComponent(ld ld2) throws IOException {
        Lca b2 = ld2;
        Lca a2 = this;
        a2.writeString(HY.J((ld)b2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer nioBuffer(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.nioBuffer((int)b2, c2);
    }

    @Override
    public ByteBuf writeDouble(double a2) {
        Lca b2;
        return b2.buf.writeDouble(a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int indexOf(int n2, int n3, byte by) {
        void b2;
        void c2;
        byte d2 = by;
        Lca a2 = this;
        return a2.buf.indexOf((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setIndex(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setIndex((int)b2, c2);
    }

    @Override
    public ByteBuf retain() {
        Lca a2;
        return a2.buf.retain();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBytes(int n2, byte[] byArray) {
        void b2;
        Object c2 = byArray;
        Lca a2 = this;
        return a2.buf.setBytes((int)b2, (byte[])c2);
    }

    public long readVarLong() {
        byte a2;
        Lca lca = this;
        long l2 = nqa.i;
        int n2 = uSa.E;
        do {
            a2 = lca.readByte();
            long l3 = (long)(a2 & cRa.h) << n2 * XTa.W;
            l2 |= l3;
            if (++n2 <= NTa.C) continue;
            throw new RuntimeException(bsa.G);
        } while ((a2 & XOa.h) == XOa.h);
        return l2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBytes(int n2, ByteBuf byteBuf) {
        void b2;
        ByteBuf c2 = byteBuf;
        Lca a2 = this;
        return a2.buf.setBytes((int)b2, c2);
    }

    @Override
    public boolean isWritable(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.isWritable(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Lca a2 = this;
        return a2.buf.getBytes((int)d2, (ByteBuf)c2, (int)b2, (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int readBytes(GatheringByteChannel gatheringByteChannel, int n2) throws IOException {
        void b2;
        int c2 = n2;
        Lca a2 = this;
        return a2.buf.readBytes((GatheringByteChannel)b2, c2);
    }

    @Override
    public long readUnsignedInt() {
        Lca a2;
        return a2.buf.readUnsignedInt();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf copy(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.copy((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuffer internalNioBuffer(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.internalNioBuffer((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf readBytes(OutputStream outputStream, int n2) throws IOException {
        void b2;
        int c2 = n2;
        Lca a2 = this;
        return a2.buf.readBytes((OutputStream)b2, c2);
    }

    @Override
    public boolean equals(Object object) {
        Object b2 = object;
        Lca a2 = this;
        return a2.buf.equals(b2);
    }

    @Override
    public ByteBuf retain(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.retain(b2);
    }

    @Override
    public int readMedium() {
        Lca a2;
        return a2.buf.readMedium();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setDouble(int n2, double d2) {
        void a2;
        int c2 = n2;
        Lca b2 = this;
        return b2.buf.setDouble(c2, (double)a2);
    }

    @Override
    public double readDouble() {
        Lca a2;
        return a2.buf.readDouble();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setLong(int n2, long l2) {
        void a2;
        int c2 = n2;
        Lca b2 = this;
        return b2.buf.setLong(c2, (long)a2);
    }

    @Override
    public char readChar() {
        Lca a2;
        return a2.buf.readChar();
    }

    @Override
    public String toString() {
        Lca a2;
        return a2.buf.toString();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBytes(int n2, byte[] byArray, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Lca a2 = this;
        return a2.buf.setBytes((int)d2, (byte[])c2, (int)b2, (int)e2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.setBytes((int)c2, (ByteBuf)b2, d2);
    }

    @Override
    public boolean hasMemoryAddress() {
        Lca a2;
        return a2.buf.hasMemoryAddress();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf readBytes(byte[] byArray, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.readBytes((byte[])c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int ensureWritable(int n2, boolean bl) {
        void b2;
        boolean c2 = bl;
        Lca a2 = this;
        return a2.buf.ensureWritable((int)b2, c2);
    }

    @Override
    public ByteBuf writerIndex(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writerIndex(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, OutputStream outputStream, int n3) throws IOException {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.getBytes((int)c2, (OutputStream)b2, d2);
    }

    @Override
    public double getDouble(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getDouble(b2);
    }

    /*
     * WARNING - void declaration
     */
    public String readStringFromBuffer(int n2) {
        void a2;
        Lca lca = this;
        int b2 = lca.readVarIntFromBuffer();
        if (b2 > a2 * AQa.P) {
            throw new DecoderException(new StringBuilder().insert(3 & 4, YSa.E).append(b2).append(mra.e).append((int)(a2 * AQa.P)).append(hpa.b).toString());
        }
        if (b2 < 0) {
            throw new DecoderException(aSa.D);
        }
        String string = new String(lca.readBytes(b2).array(), Charsets.UTF_8);
        if (string.length() > a2) {
            throw new DecoderException(new StringBuilder().insert(3 & 4, IPa.t).append(b2).append(mra.e).append((int)a2).append(hpa.b).toString());
        }
        return string;
    }

    @Override
    public ByteBuf writeZero(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writeZero(b2);
    }

    @Override
    public int bytesBefore(byte by) {
        byte b2 = by;
        Lca a2 = this;
        return a2.buf.bytesBefore(b2);
    }

    @Override
    public int forEachByte(ByteBufProcessor byteBufProcessor) {
        ByteBufProcessor b2 = byteBufProcessor;
        Lca a2 = this;
        return a2.buf.forEachByte(b2);
    }

    @Override
    public ByteBuf slice() {
        Lca a2;
        return a2.buf.slice();
    }

    @Override
    public boolean hasArray() {
        Lca a2;
        return a2.buf.hasArray();
    }

    @Override
    public ByteBuf copy() {
        Lca a2;
        return a2.buf.copy();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setFloat(int n2, float f2) {
        void b2;
        float c2 = f2;
        Lca a2 = this;
        return a2.buf.setFloat((int)b2, c2);
    }

    public static int getVarIntSize(int n2) {
        int a2;
        int n3 = n2;
        int n4 = a2 = vRa.d;
        while (n4 < tTa.h) {
            if ((n3 & pua.o << a2 * XTa.W) == 0) {
                return a2;
            }
            n4 = ++a2;
        }
        return tTa.h;
    }

    @Override
    public int arrayOffset() {
        Lca a2;
        return a2.buf.arrayOffset();
    }

    @Override
    public ByteBuf writeFloat(float f2) {
        float b2 = f2;
        Lca a2 = this;
        return a2.buf.writeFloat(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int forEachByteDesc(int n2, int n3, ByteBufProcessor byteBufProcessor) {
        void b2;
        void c2;
        ByteBufProcessor d2 = byteBufProcessor;
        Lca a2 = this;
        return a2.buf.forEachByteDesc((int)c2, (int)b2, d2);
    }

    @Override
    public ByteBuffer nioBuffer() {
        Lca a2;
        return a2.buf.nioBuffer();
    }

    @Override
    public int nioBufferCount() {
        Lca a2;
        return a2.buf.nioBufferCount();
    }

    @Override
    public int maxWritableBytes() {
        Lca a2;
        return a2.buf.maxWritableBytes();
    }

    @Override
    public ByteBuf skipBytes(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.skipBytes(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n2) throws IOException {
        void b2;
        int c2 = n2;
        Lca a2 = this;
        return a2.buf.writeBytes((ScatteringByteChannel)b2, c2);
    }

    public void writeVarIntToBuffer(int n2) {
        int b2 = n2;
        Lca a2 = this;
        int n3 = b2;
        while ((n3 & oqa.n) != 0) {
            a2.writeByte(b2 & cRa.h | XOa.h);
            n3 = b2 >>>= XTa.W;
        }
        a2.writeByte(b2);
    }

    @Override
    public short readUnsignedByte() {
        Lca a2;
        return a2.buf.readUnsignedByte();
    }

    @Override
    public ByteBufAllocator alloc() {
        Lca a2;
        return a2.buf.alloc();
    }

    @Override
    public int capacity() {
        Lca a2;
        return a2.buf.capacity();
    }

    @Override
    public ByteBuf writeBytes(ByteBuf byteBuf) {
        ByteBuf b2 = byteBuf;
        Lca a2 = this;
        return a2.buf.writeBytes(b2);
    }

    @Override
    public boolean release() {
        Lca a2;
        return a2.buf.release();
    }

    @Override
    public boolean isDirect() {
        Lca a2;
        return a2.buf.isDirect();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf readBytes(ByteBuf byteBuf, int n2) {
        void b2;
        int c2 = n2;
        Lca a2 = this;
        return a2.buf.readBytes((ByteBuf)b2, c2);
    }

    @Override
    public short readShort() {
        Lca a2;
        return a2.buf.readShort();
    }

    public int readVarIntFromBuffer() {
        byte by;
        Lca lca = this;
        int a2 = uSa.E;
        int n2 = uSa.E;
        do {
            by = lca.readByte();
            int n3 = (by & cRa.h) << n2 * XTa.W;
            a2 |= n3;
            if (++n2 <= tTa.h) continue;
            throw new RuntimeException(Bpa.fa);
        } while ((by & XOa.h) == XOa.h);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setMedium(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setMedium((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int bytesBefore(int n2, byte by) {
        void b2;
        byte c2 = by;
        Lca a2 = this;
        return a2.buf.bytesBefore((int)b2, c2);
    }

    @Override
    public boolean getBoolean(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getBoolean(b2);
    }

    @Override
    public long memoryAddress() {
        Lca a2;
        return a2.buf.memoryAddress();
    }

    @Override
    public ByteBuf writeBoolean(boolean bl) {
        boolean b2 = bl;
        Lca a2 = this;
        return a2.buf.writeBoolean(b2);
    }

    @Override
    public int getUnsignedMedium(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getUnsignedMedium(b2);
    }

    public void writeEnumValue(Enum<?> enum_) {
        Enum<?> b2 = enum_;
        Lca a2 = this;
        a2.writeVarIntToBuffer(b2.ordinal());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int bytesBefore(int n2, int n3, byte by) {
        void b2;
        void c2;
        byte d2 = by;
        Lca a2 = this;
        return a2.buf.bytesBefore((int)c2, (int)b2, d2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int setBytes(int n2, InputStream inputStream, int n3) throws IOException {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.setBytes((int)c2, (InputStream)b2, d2);
    }

    @Override
    public ByteBuf readSlice(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.readSlice(b2);
    }

    public UUID readUuid() {
        Lca a2;
        return new UUID(a2.readLong(), a2.readLong());
    }

    public Lca(ByteBuf byteBuf) {
        ByteBuf b2 = byteBuf;
        Lca a2 = this;
        a2.buf = b2;
    }

    public Mda readItemStackFromBuffer() throws IOException {
        Lca lca = this;
        Lca a2 = null;
        short s = lca.readShort();
        if (s >= 0) {
            Lca lca2 = lca;
            int n2 = lca2.readByte() & osa.Ja;
            short s2 = lca2.readShort();
            a2 = new Mda(eAa.l((int)s), n2, (int)s2);
            a2.J(lca.readNBTTagCompoundFromBuffer());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int forEachByte(int n2, int n3, ByteBufProcessor byteBufProcessor) {
        void b2;
        void c2;
        ByteBufProcessor d2 = byteBufProcessor;
        Lca a2 = this;
        return a2.buf.forEachByte((int)c2, (int)b2, d2);
    }

    @Override
    public byte readByte() {
        Lca a2;
        return a2.buf.readByte();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int setBytes(int n2, ScatteringByteChannel scatteringByteChannel, int n3) throws IOException {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.setBytes((int)c2, (ScatteringByteChannel)b2, d2);
    }

    @Override
    public short getUnsignedByte(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getUnsignedByte(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String toString(int n2, int n3, Charset charset) {
        void b2;
        void c2;
        Comparable<ByteBuf> d2 = charset;
        Lca a2 = this;
        return a2.buf.toString((int)c2, (int)b2, (Charset)d2);
    }

    @Override
    public short getShort(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getShort(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, byte[] byArray, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n5 = n4;
        Lca a2 = this;
        return a2.buf.getBytes((int)d2, (byte[])c2, (int)b2, (int)e2);
    }

    @Override
    public ByteBuf readBytes(ByteBuf byteBuf) {
        ByteBuf b2 = byteBuf;
        Lca a2 = this;
        return a2.buf.readBytes(b2);
    }

    @Override
    public int getUnsignedShort(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getUnsignedShort(b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf setZero(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.setZero((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, ByteBuffer byteBuffer) {
        void b2;
        Comparable<ByteBuf> c2 = byteBuffer;
        Lca a2 = this;
        return a2.buf.getBytes((int)b2, (ByteBuffer)c2);
    }

    @Override
    public String toString(Charset charset) {
        Comparable<ByteBuf> b2 = charset;
        Lca a2 = this;
        return a2.buf.toString((Charset)b2);
    }

    public Waa readNBTTagCompoundFromBuffer() throws IOException {
        Lca lca;
        Lca lca2 = lca = this;
        int a2 = lca2.readerIndex();
        if (lca2.readByte() == 0) {
            return null;
        }
        lca.readerIndex(a2);
        return tCa.J((DataInput)new ByteBufInputStream(lca), (uca)new uca(Ssa.Ia));
    }

    @Override
    public int readableBytes() {
        Lca a2;
        return a2.buf.readableBytes();
    }

    @Override
    public ByteBuf capacity(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.capacity(b2);
    }

    @Override
    public ByteBuf readBytes(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.readBytes(b2);
    }

    @Override
    public byte[] array() {
        Lca a2;
        return a2.buf.array();
    }

    @Override
    public boolean readBoolean() {
        Lca a2;
        return a2.buf.readBoolean();
    }

    @Override
    public ByteBuf discardReadBytes() {
        Lca a2;
        return a2.buf.discardReadBytes();
    }

    @Override
    public ByteBuf readBytes(byte[] byArray) {
        Object b2 = byArray;
        Lca a2 = this;
        return a2.buf.readBytes((byte[])b2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf writeBytes(ByteBuf byteBuf, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        Lca a2 = this;
        return a2.buf.writeBytes((ByteBuf)c2, (int)b2, d2);
    }

    @Override
    public int readUnsignedShort() {
        Lca a2;
        return a2.buf.readUnsignedShort();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf slice(int n2, int n3) {
        void b2;
        int c2 = n3;
        Lca a2 = this;
        return a2.buf.slice((int)b2, c2);
    }

    @Override
    public int getMedium(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getMedium(b2);
    }

    @Override
    public boolean isReadable(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.isReadable(b2);
    }

    /*
     * WARNING - void declaration
     */
    public Lca writeString(String string) {
        void a2;
        Lca lca = this;
        byte[] byArray = a2.getBytes(Charsets.UTF_8);
        Object b2 = byArray;
        if (byArray.length > BQa.h) {
            throw new EncoderException(new StringBuilder().insert(3 & 4, Npa.q).append(a2.length()).append(Eqa.R).append(BQa.h).append(hpa.b).toString());
        }
        lca.writeVarIntToBuffer(((Object)b2).length);
        Lca lca2 = lca;
        lca2.writeBytes((byte[])b2);
        return lca2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ByteBuf getBytes(int n2, ByteBuf byteBuf) {
        void b2;
        ByteBuf c2 = byteBuf;
        Lca a2 = this;
        return a2.buf.getBytes((int)b2, c2);
    }

    @Override
    public ByteBuffer[] nioBuffers() {
        Lca a2;
        return a2.buf.nioBuffers();
    }

    @Override
    public long getLong(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getLong(b2);
    }

    @Override
    public ByteBuf writeInt(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.writeInt(b2);
    }

    @Override
    public long getUnsignedInt(int n2) {
        int b2 = n2;
        Lca a2 = this;
        return a2.buf.getUnsignedInt(b2);
    }

    @Override
    public ByteBuf order(ByteOrder byteOrder) {
        ByteOrder b2 = byteOrder;
        Lca a2 = this;
        return a2.buf.order(b2);
    }

    @Override
    public ByteBuf discardSomeReadBytes() {
        Lca a2;
        return a2.buf.discardSomeReadBytes();
    }
}

