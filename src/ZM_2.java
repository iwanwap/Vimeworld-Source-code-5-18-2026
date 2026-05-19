/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  BRa
 *  ERa
 *  Eb
 *  ZM
 *  kpa
 *  lqa
 *  vRa
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
public final class ZM_2
extends GeneratedMessageLite<ZM, dm>
implements Eb {
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int RESOURCE_FIELD_NUMBER = 2;
    public static final int DURATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private long duration_;
    private String path_ = Mqa.y;
    private static final ZM DEFAULT_INSTANCE;
    private int resource_;
    private static volatile Parser<ZM> PARSER;

    public boolean hasPath() {
        ZM_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ZM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static dm J() {
        return (dm)DEFAULT_INSTANCE.createBuilder();
    }

    public long getDuration() {
        ZM_2 a2;
        return a2.duration_;
    }

    public int getResource() {
        ZM_2 a2;
        return a2.resource_;
    }

    public String getPath() {
        ZM_2 a2;
        return a2.path_;
    }

    public static ZM f() {
        return DEFAULT_INSTANCE;
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.path_ = ZM_2.f().getPath();
    }

    public static /* synthetic */ void l(ZM a2) {
        super.J();
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.resource_ = uSa.E;
    }

    public static Parser<ZM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ZM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getPathBytes() {
        ZM_2 a2;
        return ByteString.copyFromUtf8(a2.path_);
    }

    public static /* synthetic */ void f(ZM a2) {
        super.l();
    }

    public static ZM f(InputStream a2) throws IOException {
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        ZM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.path_ = b2;
    }

    public static /* synthetic */ void J(ZM a2) {
        super.f();
    }

    public static /* synthetic */ void J(ZM zM, ByteString byteString) {
        Object b2 = byteString;
        ZM a2 = zM;
        super.J((ByteString)b2);
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
        ZM_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new ZM_2();
            }
            case 2: {
                return new dm(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = ERa.h;
                objectArray[uqa.g] = kra.v;
                objectArray[yRa.d] = Xpa.e;
                d2 = objectArray;
                Object b2 = BRa.C;
                return ZM_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = ZM_2.class;
                synchronized (ZM_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<ZM>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ ZM J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(ZM zM, int n2) {
        int b2 = n2;
        ZM a2 = zM;
        super.J(b2);
    }

    public static ZM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasDuration() {
        ZM_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private ZM_2() {
        ZM_2 a2;
    }

    private void J(long a2) {
        b.bitField0_ |= AQa.P;
        b.duration_ = a2;
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.duration_ = nqa.i;
    }

    public static dm J(ZM a2) {
        return (dm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static ZM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ZM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static ZM J(CodedInputStream a2) throws IOException {
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasResource() {
        ZM_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ZM J(InputStream a2) throws IOException {
        return (ZM_2)ZM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        ZM_2 a2 = this;
        ZM_2.checkByteStringIsUtf8(b2);
        a2.path_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static ZM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ZM_2)ZM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(ZM b2, long a2) {
        super.J(a2);
    }

    private void J(int n2) {
        int b2 = n2;
        ZM_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.resource_ = b2;
    }

    public static ZM J(ByteString a2) throws InvalidProtocolBufferException {
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ZM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(ZM zM, String string) {
        Object b2 = string;
        ZM a2 = zM;
        super.J((String)b2);
    }

    static {
        ZM_2 zM_2 = new ZM_2();
        DEFAULT_INSTANCE = zM_2;
        GeneratedMessageLite.registerDefaultInstance(ZM_2.class, zM_2);
    }

    public static ZM J(byte[] a2) throws InvalidProtocolBufferException {
        return (ZM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

