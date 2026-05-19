/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Em
 *  Qn
 *  SC
 *  Spa
 *  uQa
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
public final class Qn_1
extends GeneratedMessageLite<Qn, Em>
implements SC {
    private static final Qn DEFAULT_INSTANCE;
    private String id_ = Mqa.y;
    private static volatile Parser<Qn> PARSER;
    public static final int ID_FIELD_NUMBER = 1;

    public static /* synthetic */ Qn f() {
        return DEFAULT_INSTANCE;
    }

    public static Qn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Qn_1)Qn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Qn qn2, ByteString byteString) {
        Object b2 = byteString;
        Qn a2 = qn2;
        super.J((ByteString)b2);
    }

    public static Qn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Em J() {
        return (Em)DEFAULT_INSTANCE.createBuilder();
    }

    public static Qn f(InputStream a2) throws IOException {
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qn J(byte[] a2) throws InvalidProtocolBufferException {
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getIdBytes() {
        Qn_1 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    private void J() {
        a.id_ = Qn_1.J().getId();
    }

    private void J(String string) {
        String b2 = string;
        Qn_1 a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    public static Parser<Qn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Qn_1 a2 = this;
        Object object = b2;
        Qn_1.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    public static Qn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Qn a2) {
        super.J();
    }

    private Qn_1() {
        Qn_1 a2;
    }

    public String getId() {
        Qn_1 a2;
        return a2.id_;
    }

    public static Qn J(ByteString a2) throws InvalidProtocolBufferException {
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qn J() {
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
        Qn_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Qn_1();
            }
            case 2: {
                return new Em(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = uQa.Aa;
                d2 = objectArray;
                Object b2 = Spa.b;
                return Qn_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Qn_1.class;
                synchronized (Qn_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Qn>(DEFAULT_INSTANCE);
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

    public static Em J(Qn a2) {
        return (Em)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Qn J(InputStream a2) throws IOException {
        return (Qn_1)Qn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qn J(CodedInputStream a2) throws IOException {
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Qn qn2, String string) {
        Object b2 = string;
        Qn a2 = qn2;
        super.J((String)b2);
    }

    public static Qn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    static {
        Qn_1 qn_1 = new Qn_1();
        DEFAULT_INSTANCE = qn_1;
        GeneratedMessageLite.registerDefaultInstance(Qn_1.class, qn_1);
    }

    public static Qn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Qn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

