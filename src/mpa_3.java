/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CA
 *  Wpa
 *  apa
 *  mpa
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
public final class mpa_3
extends GeneratedMessageLite<mpa, apa>
implements CA {
    private static final mpa DEFAULT_INSTANCE;
    private static volatile Parser<mpa> PARSER;

    static {
        mpa_3 mpa_32 = new mpa_3();
        DEFAULT_INSTANCE = mpa_32;
        GeneratedMessageLite.registerDefaultInstance(mpa_3.class, mpa_32);
    }

    public static mpa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mpa f(InputStream a2) throws IOException {
        return (mpa_3)mpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static mpa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mpa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<mpa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ mpa f() {
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
        mpa_3 c2 = this;
        switch (Wpa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new mpa_3();
            }
            case 2: {
                return new apa(null);
            }
            case 3: {
                d2 = null;
                Object b2 = yRa.y;
                return mpa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = mpa_3.class;
                synchronized (mpa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<mpa>(DEFAULT_INSTANCE);
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

    public static mpa J() {
        return DEFAULT_INSTANCE;
    }

    public static apa J() {
        return (apa)DEFAULT_INSTANCE.createBuilder();
    }

    public static mpa J(CodedInputStream a2) throws IOException {
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static mpa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static mpa J(byte[] a2) throws InvalidProtocolBufferException {
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private mpa_3() {
        mpa_3 a2;
    }

    public static mpa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static apa J(mpa a2) {
        return (apa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static mpa J(InputStream a2) throws IOException {
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static mpa J(ByteString a2) throws InvalidProtocolBufferException {
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static mpa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (mpa_3)mpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mpa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (mpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

