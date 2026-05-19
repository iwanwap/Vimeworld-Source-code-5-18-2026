/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Tpa
 *  dl
 *  lqa
 *  vRa
 *  x
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dl_2
extends GeneratedMessageLite<dl, QK>
implements x {
    private int bitField0_;
    public static final int TIMEZONE_FIELD_NUMBER = 1;
    private static volatile Parser<dl> PARSER;
    public static final int STARTAT_FIELD_NUMBER = 2;
    private static final dl DEFAULT_INSTANCE;
    private String timezone_ = Mqa.y;
    private long startAt_;

    public static dl J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static dl f(InputStream a2) throws IOException {
        return (dl_2)dl_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.timezone_ = dl_2.f().getTimezone();
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.startAt_ = nqa.i;
    }

    public static /* synthetic */ void J(dl dl2, String string) {
        Object b2 = string;
        dl a2 = dl2;
        super.J((String)b2);
    }

    private void J(long a2) {
        b.bitField0_ |= uqa.g;
        b.startAt_ = a2;
    }

    public static /* synthetic */ void J(dl dl2, ByteString byteString) {
        Object b2 = byteString;
        dl a2 = dl2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void f(dl a2) {
        super.f();
    }

    public static dl J(ByteString a2) throws InvalidProtocolBufferException {
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(dl a2) {
        super.J();
    }

    public static dl f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static dl J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static dl J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getTimezone() {
        dl_2 a2;
        return a2.timezone_;
    }

    public static dl J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public boolean hasStartAt() {
        dl_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static dl J(CodedInputStream a2) throws IOException {
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public long getStartAt() {
        dl_2 a2;
        return a2.startAt_;
    }

    public static dl J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (dl_2)dl_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private dl_2() {
        dl_2 a2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        Object d2 = methodToInvoke;
        dl_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new dl_2();
            }
            case 2: {
                return new QK(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = vsa.E;
                objectArray[uqa.g] = ITa.e;
                d2 = objectArray;
                Object b2 = Tpa.a;
                return dl_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = dl_2.class;
                synchronized (dl_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<dl>(DEFAULT_INSTANCE);
                        PARSER = d2;
                    }
                    // ** MonitorExit[b] (shouldn't be in output)
                    return d2;
                }
            }
            case 6: {
                return (byte)vRa.d;
            }
            case 7: {
                return null;
            }
        }
        throw new UnsupportedOperationException();
    }

    public static dl J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        dl_2 a2 = this;
        dl_2.checkByteStringIsUtf8(b2);
        a2.timezone_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static QK J(dl a2) {
        return (QK)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(String string) {
        String b2 = string;
        dl_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.timezone_ = b2;
    }

    public static /* synthetic */ void J(dl b2, long a2) {
        super.J(a2);
    }

    public static QK J() {
        return (QK)DEFAULT_INSTANCE.createBuilder();
    }

    public static dl J(InputStream a2) throws IOException {
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static dl f() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<dl> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasTimezone() {
        dl_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ dl J() {
        return DEFAULT_INSTANCE;
    }

    public static dl J(byte[] a2) throws InvalidProtocolBufferException {
        return (dl_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getTimezoneBytes() {
        dl_2 a2;
        return ByteString.copyFromUtf8(a2.timezone_);
    }

    static {
        dl_2 dl_22 = new dl_2();
        DEFAULT_INSTANCE = dl_22;
        GeneratedMessageLite.registerDefaultInstance(dl_2.class, dl_22);
    }
}

