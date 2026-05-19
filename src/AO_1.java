/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  AO
 *  pN
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
public final class AO_1
extends GeneratedMessageLite<AO, pN>
implements nC {
    private static volatile Parser<AO> PARSER;
    private static final AO DEFAULT_INSTANCE;

    public static AO f(InputStream a2) throws IOException {
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        AO_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new AO_1();
            }
            case 2: {
                return new pN(null);
            }
            case 3: {
                d2 = null;
                Object b2 = yRa.y;
                return AO_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = AO_1.class;
                synchronized (AO_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<AO>(DEFAULT_INSTANCE);
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

    public static pN J(AO a2) {
        return (pN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        AO_1 aO_1 = new AO_1();
        DEFAULT_INSTANCE = aO_1;
        GeneratedMessageLite.registerDefaultInstance(AO_1.class, aO_1);
    }

    public static Parser<AO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ AO f() {
        return DEFAULT_INSTANCE;
    }

    public static AO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static AO J(CodedInputStream a2) throws IOException {
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static AO J(InputStream a2) throws IOException {
        return (AO_1)AO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static AO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (AO_1)AO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static AO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static AO J(byte[] a2) throws InvalidProtocolBufferException {
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private AO_1() {
        AO_1 a2;
    }

    public static AO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static AO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static AO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static AO J(ByteString a2) throws InvalidProtocolBufferException {
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static AO J() {
        return DEFAULT_INSTANCE;
    }

    public static pN J() {
        return (pN)DEFAULT_INSTANCE.createBuilder();
    }

    public static AO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (AO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

