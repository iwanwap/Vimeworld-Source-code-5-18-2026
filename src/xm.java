/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Tb
 *  Tm
 *  aSa
 *  lqa
 *  nQa
 *  pQa
 *  vRa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xm
extends GeneratedMessageLite<xm, Tm>
implements Tb {
    private static volatile Parser<xm> PARSER;
    private int bitField0_;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final xm DEFAULT_INSTANCE;
    private String kind_ = Mqa.y;
    private ByteString data_ = ByteString.EMPTY;

    public static xm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static xm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private xm() {
        xm a2;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        xm a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.data_ = b2;
    }

    public static xm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public ByteString getKindBytes() {
        xm a2;
        return ByteString.copyFromUtf8(a2.kind_);
    }

    public static /* synthetic */ void f(xm a2) {
        a2.f();
    }

    public static xm f() {
        return DEFAULT_INSTANCE;
    }

    static {
        xm xm2;
        DEFAULT_INSTANCE = xm2 = new xm();
        GeneratedMessageLite.registerDefaultInstance(xm.class, xm2);
    }

    public static xm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getData() {
        xm a2;
        return a2.data_;
    }

    public static xm f(InputStream a2) throws IOException {
        return xm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static xm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(xm xm2, String string) {
        String b2 = string;
        xm a2 = xm2;
        a2.J(b2);
    }

    public static Tm J() {
        return (Tm)DEFAULT_INSTANCE.createBuilder();
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
        xm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new xm();
            }
            case 2: {
                return new Tm(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aSa.u;
                objectArray[uqa.g] = nQa.t;
                d2 = objectArray;
                Object b2 = pQa.Ja;
                return xm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = xm.class;
                synchronized (xm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<xm>(DEFAULT_INSTANCE);
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

    public static Parser<xm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Tm J(xm a2) {
        return (Tm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(xm xm2, ByteString byteString) {
        ByteString b2 = byteString;
        xm a2 = xm2;
        a2.J(b2);
    }

    public static /* synthetic */ void J(xm a2) {
        a2.J();
    }

    public static xm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static xm J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.kind_ = xm.f().getKind();
    }

    public String getKind() {
        xm a2;
        return a2.kind_;
    }

    public boolean hasData() {
        xm a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static xm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static xm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(xm xm2, ByteString byteString) {
        ByteString b2 = byteString;
        xm a2 = xm2;
        a2.f(b2);
    }

    private void J(String string) {
        String b2 = string;
        xm a2 = this;
        b2.getClass();
        a2.kind_ = b2;
    }

    public static /* synthetic */ xm J() {
        return DEFAULT_INSTANCE;
    }

    public static xm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return xm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static xm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        xm a2 = this;
        Object object = b2;
        xm.checkByteStringIsUtf8((ByteString)object);
        a2.kind_ = ((ByteString)object).toStringUtf8();
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.data_ = xm.f().getData();
    }
}

