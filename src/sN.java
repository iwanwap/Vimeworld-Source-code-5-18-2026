/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Om
 *  QA
 *  YSa
 *  kn
 *  lqa
 *  uQa
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
public final class sN
extends GeneratedMessageLite<sN, kn>
implements QA {
    private RN edit_;
    private String id_ = Mqa.y;
    private int bitField0_;
    public static final int EDIT_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<sN> PARSER;
    private static final sN DEFAULT_INSTANCE;

    public static sN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static sN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static sN f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.edit_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static /* synthetic */ void f(sN sN2, RN rN) {
        GeneratedMessageLite b2 = rN;
        sN a2 = sN2;
        a2.J((RN)b2);
    }

    public static sN f() {
        return DEFAULT_INSTANCE;
    }

    public String getId() {
        sN a2;
        return a2.id_;
    }

    private void f(RN rN) {
        GeneratedMessageLite b2 = rN;
        sN a2 = this;
        b2.getClass();
        a2.edit_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static kn J() {
        return (kn)DEFAULT_INSTANCE.createBuilder();
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
        sN c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new sN();
            }
            case 2: {
                return new kn(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = tTa.Ha;
                d2 = objectArray;
                Object b2 = YSa.ga;
                return sN.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = sN.class;
                synchronized (sN.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<sN>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ sN J() {
        return DEFAULT_INSTANCE;
    }

    public static sN J(InputStream a2) throws IOException {
        return sN.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasEdit() {
        sN a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private sN() {
        sN a2;
    }

    private void J(RN rN) {
        sN sN2;
        GeneratedMessageLite b2 = rN;
        sN a2 = this;
        b2.getClass();
        if (a2.edit_ != null && a2.edit_ != RN.J()) {
            a2.edit_ = (RN)((Om)RN.J(a2.edit_).mergeFrom(b2)).buildPartial();
            sN2 = a2;
        } else {
            sN2 = a2;
            a2.edit_ = b2;
        }
        sN2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void f(sN a2) {
        a2.f();
    }

    public static kn J(sN a2) {
        return (kn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static sN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return sN.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(sN a2) {
        a2.J();
    }

    public static sN J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(sN sN2, RN rN) {
        GeneratedMessageLite b2 = rN;
        sN a2 = sN2;
        a2.f((RN)b2);
    }

    public ByteString getIdBytes() {
        sN a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static sN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        sN a2 = this;
        Object object = b2;
        sN.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    public RN getEdit() {
        sN a2;
        if (a2.edit_ == null) {
            return RN.J();
        }
        return a2.edit_;
    }

    public static /* synthetic */ void J(sN sN2, String string) {
        String b2 = string;
        sN a2 = sN2;
        a2.J(b2);
    }

    public static sN J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(sN sN2, ByteString byteString) {
        ByteString b2 = byteString;
        sN a2 = sN2;
        a2.J(b2);
    }

    public static sN J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        sN a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    public static sN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static sN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.id_ = sN.f().getId();
    }

    static {
        sN sN2;
        DEFAULT_INSTANCE = sN2 = new sN();
        GeneratedMessageLite.registerDefaultInstance(sN.class, sN2);
    }

    public static Parser<sN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static sN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

