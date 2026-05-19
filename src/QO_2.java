/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  QO
 *  Spa
 *  Ta
 *  tm
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
public final class QO_2
extends GeneratedMessageLite<QO, tm>
implements Ta {
    private static volatile Parser<QO> PARSER;
    public static final int ID_FIELD_NUMBER = 1;
    private String id_ = Mqa.y;
    private static final QO DEFAULT_INSTANCE;

    public static tm J(QO a2) {
        return (tm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static QO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(QO qO2, ByteString byteString) {
        Object b2 = byteString;
        QO a2 = qO2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void J(QO qO2, String string) {
        Object b2 = string;
        QO a2 = qO2;
        super.J((String)b2);
    }

    public ByteString getIdBytes() {
        QO_2 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static QO J(byte[] a2) throws InvalidProtocolBufferException {
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.id_ = QO_2.f().getId();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        QO_2 a2 = this;
        Object object = b2;
        QO_2.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    public static QO J(ByteString a2) throws InvalidProtocolBufferException {
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getId() {
        QO_2 a2;
        return a2.id_;
    }

    public static QO J(CodedInputStream a2) throws IOException {
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static QO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (QO_2)QO_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static QO f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ QO J() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<QO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static QO f(InputStream a2) throws IOException {
        return (QO_2)QO_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static QO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static QO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static QO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        QO_2 a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    public static tm J() {
        return (tm)DEFAULT_INSTANCE.createBuilder();
    }

    public static QO J(InputStream a2) throws IOException {
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        QO_2 qO_2 = new QO_2();
        DEFAULT_INSTANCE = qO_2;
        GeneratedMessageLite.registerDefaultInstance(QO_2.class, qO_2);
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
        QO_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new QO_2();
            }
            case 2: {
                return new tm(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = uQa.Aa;
                d2 = objectArray;
                Object b2 = Spa.b;
                return QO_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = QO_2.class;
                synchronized (QO_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<QO>(DEFAULT_INSTANCE);
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

    public static QO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static QO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (QO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private QO_2() {
        QO_2 a2;
    }

    public static /* synthetic */ void J(QO a2) {
        super.J();
    }
}

