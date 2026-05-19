/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DA
 *  Spa
 *  qM
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
public final class nm
extends GeneratedMessageLite<nm, qM>
implements DA {
    private static volatile Parser<nm> PARSER;
    private String id_ = Mqa.y;
    public static final int ID_FIELD_NUMBER = 1;
    private static final nm DEFAULT_INSTANCE;

    public String getId() {
        nm a2;
        return a2.id_;
    }

    public static nm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
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
        nm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new nm();
            }
            case 2: {
                return new qM(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = uQa.Aa;
                d2 = objectArray;
                Object b2 = Spa.b;
                return nm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = nm.class;
                synchronized (nm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<nm>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(nm nm2, String string) {
        String b2 = string;
        nm a2 = nm2;
        a2.J(b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        nm a2 = this;
        Object object = b2;
        nm.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    public static /* synthetic */ void J(nm a2) {
        a2.J();
    }

    public static /* synthetic */ void J(nm nm2, ByteString byteString) {
        ByteString b2 = byteString;
        nm a2 = nm2;
        a2.J(b2);
    }

    private void J(String string) {
        String b2 = string;
        nm a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    private nm() {
        nm a2;
    }

    public static nm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return nm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static qM J() {
        return (qM)DEFAULT_INSTANCE.createBuilder();
    }

    public static nm f(InputStream a2) throws IOException {
        return nm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static nm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static nm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getIdBytes() {
        nm a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static Parser<nm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static nm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static nm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ nm f() {
        return DEFAULT_INSTANCE;
    }

    public static nm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static nm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static qM J(nm a2) {
        return (qM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        nm nm2;
        DEFAULT_INSTANCE = nm2 = new nm();
        GeneratedMessageLite.registerDefaultInstance(nm.class, nm2);
    }

    private void J() {
        a.id_ = nm.J().getId();
    }

    public static nm J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static nm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static nm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static nm J() {
        return DEFAULT_INSTANCE;
    }
}

