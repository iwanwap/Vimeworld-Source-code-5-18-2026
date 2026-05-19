/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Pa
 *  Spa
 *  hM
 *  uQa
 *  vRa
 *  wM
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
public final class wM_3
extends GeneratedMessageLite<wM, hM>
implements Pa {
    private String id_ = Mqa.y;
    private static volatile Parser<wM> PARSER;
    private static final wM DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;

    public static wM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<wM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static wM f(InputStream a2) throws IOException {
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        wM_3 wM_32 = new wM_3();
        DEFAULT_INSTANCE = wM_32;
        GeneratedMessageLite.registerDefaultInstance(wM_3.class, wM_32);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        wM_3 a2 = this;
        Object object = b2;
        wM_3.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    public static wM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public String getId() {
        wM_3 a2;
        return a2.id_;
    }

    private void J() {
        a.id_ = wM_3.f().getId();
    }

    public static wM J(byte[] a2) throws InvalidProtocolBufferException {
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static wM J(CodedInputStream a2) throws IOException {
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(wM a2) {
        super.J();
    }

    public static wM f() {
        return DEFAULT_INSTANCE;
    }

    public static hM J() {
        return (hM)DEFAULT_INSTANCE.createBuilder();
    }

    private wM_3() {
        wM_3 a2;
    }

    public static wM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(wM wM2, ByteString byteString) {
        Object b2 = byteString;
        wM a2 = wM2;
        super.J((ByteString)b2);
    }

    public ByteString getIdBytes() {
        wM_3 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static wM J(InputStream a2) throws IOException {
        return (wM_3)wM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        wM_3 a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    public static /* synthetic */ void J(wM wM2, String string) {
        Object b2 = string;
        wM a2 = wM2;
        super.J((String)b2);
    }

    public static wM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        wM_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new wM_3();
            }
            case 2: {
                return new hM(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = uQa.Aa;
                d2 = objectArray;
                Object b2 = Spa.b;
                return wM_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = wM_3.class;
                synchronized (wM_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<wM>(DEFAULT_INSTANCE);
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

    public static wM J(ByteString a2) throws InvalidProtocolBufferException {
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ wM J() {
        return DEFAULT_INSTANCE;
    }

    public static wM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static wM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (wM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static wM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (wM_3)wM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static hM J(wM a2) {
        return (hM)DEFAULT_INSTANCE.createBuilder(a2);
    }
}

