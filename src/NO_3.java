/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  HO
 *  Lb
 *  NO
 *  Spa
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
public final class NO_3
extends GeneratedMessageLite<NO, HO>
implements Lb {
    private static final NO DEFAULT_INSTANCE;
    public static final int URL_FIELD_NUMBER = 1;
    private static volatile Parser<NO> PARSER;
    private String url_ = Mqa.y;

    public static NO J(ByteString a2) throws InvalidProtocolBufferException {
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static NO f(InputStream a2) throws IOException {
        return (NO_3)NO_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public String getUrl() {
        NO_3 a2;
        return a2.url_;
    }

    public static NO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        NO_3 a2 = this;
        Object object = b2;
        NO_3.checkByteStringIsUtf8((ByteString)object);
        a2.url_ = ((ByteString)object).toStringUtf8();
    }

    public static NO J(CodedInputStream a2) throws IOException {
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.url_ = NO_3.J().getUrl();
    }

    public static NO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (NO_3)NO_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(NO nO2, String string) {
        Object b2 = string;
        NO a2 = nO2;
        super.J((String)b2);
    }

    private void J(String string) {
        String b2 = string;
        NO_3 a2 = this;
        b2.getClass();
        a2.url_ = b2;
    }

    public static NO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static HO J() {
        return (HO)DEFAULT_INSTANCE.createBuilder();
    }

    static {
        NO_3 nO_3 = new NO_3();
        DEFAULT_INSTANCE = nO_3;
        GeneratedMessageLite.registerDefaultInstance(NO_3.class, nO_3);
    }

    public static /* synthetic */ void J(NO nO2, ByteString byteString) {
        Object b2 = byteString;
        NO a2 = nO2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void J(NO a2) {
        super.J();
    }

    private NO_3() {
        NO_3 a2;
    }

    public static NO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ NO f() {
        return DEFAULT_INSTANCE;
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
        NO_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new NO_3();
            }
            case 2: {
                return new HO(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = dqa.y;
                d2 = objectArray;
                Object b2 = Spa.b;
                return NO_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = NO_3.class;
                synchronized (NO_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<NO>(DEFAULT_INSTANCE);
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

    public static HO J(NO a2) {
        return (HO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static NO J(InputStream a2) throws IOException {
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static NO J(byte[] a2) throws InvalidProtocolBufferException {
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<NO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static NO J() {
        return DEFAULT_INSTANCE;
    }

    public ByteString getUrlBytes() {
        NO_3 a2;
        return ByteString.copyFromUtf8(a2.url_);
    }

    public static NO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (NO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }
}

