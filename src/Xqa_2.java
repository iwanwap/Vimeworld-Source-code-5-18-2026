/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ara
 *  Xqa
 *  mc
 *  rqa
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

public final class Xqa_2
extends GeneratedMessageLite<Xqa, Ara>
implements mc {
    private static final Xqa DEFAULT_INSTANCE;
    private static volatile Parser<Xqa> PARSER;

    public static Xqa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Xqa f(InputStream a2) throws IOException {
        return (Xqa_2)Xqa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xqa J(byte[] a2) throws InvalidProtocolBufferException {
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xqa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Ara J() {
        return (Ara)DEFAULT_INSTANCE.createBuilder();
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
        Xqa_2 c2 = this;
        switch (rqa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Xqa_2();
            }
            case 2: {
                return new Ara(null);
            }
            case 3: {
                d2 = null;
                Object b2 = yRa.y;
                return Xqa_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Xqa_2.class;
                synchronized (Xqa_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Xqa>(DEFAULT_INSTANCE);
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

    public static Xqa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Xqa_2 xqa_2 = new Xqa_2();
        DEFAULT_INSTANCE = xqa_2;
        GeneratedMessageLite.registerDefaultInstance(Xqa_2.class, xqa_2);
    }

    public static Xqa J(CodedInputStream a2) throws IOException {
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xqa f() {
        return DEFAULT_INSTANCE;
    }

    public static Xqa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Xqa J(InputStream a2) throws IOException {
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Ara J(Xqa a2) {
        return (Ara)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ Xqa J() {
        return DEFAULT_INSTANCE;
    }

    public static Xqa J(ByteString a2) throws InvalidProtocolBufferException {
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xqa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Xqa_2)Xqa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Xqa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private Xqa_2() {
        Xqa_2 a2;
    }

    public static Xqa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Xqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Parser<Xqa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

