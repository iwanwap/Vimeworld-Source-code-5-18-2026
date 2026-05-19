/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OQa
 *  gRa
 *  kd
 *  vRa
 *  zPa
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

public final class OQa_2
extends GeneratedMessageLite<OQa, gRa>
implements kd {
    private static final OQa DEFAULT_INSTANCE;
    private static volatile Parser<OQa> PARSER;

    public static OQa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OQa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OQa J(byte[] a2) throws InvalidProtocolBufferException {
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OQa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OQa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OQa f() {
        return DEFAULT_INSTANCE;
    }

    public static OQa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OQa_2)OQa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<OQa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        OQa_2 oQa_2 = new OQa_2();
        DEFAULT_INSTANCE = oQa_2;
        GeneratedMessageLite.registerDefaultInstance(OQa_2.class, oQa_2);
    }

    public static OQa f(InputStream a2) throws IOException {
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static gRa J(OQa a2) {
        return (gRa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static OQa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static OQa J(ByteString a2) throws InvalidProtocolBufferException {
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ OQa J() {
        return DEFAULT_INSTANCE;
    }

    public static OQa J(CodedInputStream a2) throws IOException {
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OQa J(InputStream a2) throws IOException {
        return (OQa_2)OQa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static gRa J() {
        return (gRa)DEFAULT_INSTANCE.createBuilder();
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
        OQa_2 c2 = this;
        switch (zPa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new OQa_2();
            }
            case 2: {
                return new gRa(null);
            }
            case 3: {
                d2 = null;
                Object b2 = yRa.y;
                return OQa_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = OQa_2.class;
                synchronized (OQa_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<OQa>(DEFAULT_INSTANCE);
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

    public static OQa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (OQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private OQa_2() {
        OQa_2 a2;
    }
}

