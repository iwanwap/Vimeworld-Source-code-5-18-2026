/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bqa
 *  Opa
 *  PPa
 *  jA
 *  nQa
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
public final class Opa_2
extends GeneratedMessageLite<Opa, PPa>
implements jA {
    private static final Opa DEFAULT_INSTANCE;
    private long time_;
    public static final int TIME_FIELD_NUMBER = 1;
    private static volatile Parser<Opa> PARSER;

    public static /* synthetic */ void J(Opa a2) {
        super.J();
    }

    public static PPa J() {
        return (PPa)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ Opa f() {
        return DEFAULT_INSTANCE;
    }

    public static Opa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Opa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private Opa_2() {
        Opa_2 a2;
    }

    public static Opa J(ByteString a2) throws InvalidProtocolBufferException {
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Opa J(CodedInputStream a2) throws IOException {
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Opa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Opa J() {
        return DEFAULT_INSTANCE;
    }

    static {
        Opa_2 opa_2 = new Opa_2();
        DEFAULT_INSTANCE = opa_2;
        GeneratedMessageLite.registerDefaultInstance(Opa_2.class, opa_2);
    }

    public static Parser<Opa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Opa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Opa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Opa_2)Opa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public long getTime() {
        Opa_2 a2;
        return a2.time_;
    }

    public static Opa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(long a2) {
        b.time_ = a2;
    }

    public static Opa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Opa f(InputStream a2) throws IOException {
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Opa J(byte[] a2) throws InvalidProtocolBufferException {
        return (Opa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Opa J(InputStream a2) throws IOException {
        return (Opa_2)Opa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.time_ = nqa.i;
    }

    public static PPa J(Opa a2) {
        return (PPa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(Opa b2, long a2) {
        super.J(a2);
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
        Opa_2 c2 = this;
        switch (Bqa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Opa_2();
            }
            case 2: {
                return new PPa(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Asa.T;
                d2 = objectArray;
                Object b2 = nQa.O;
                return Opa_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Opa_2.class;
                synchronized (Opa_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Opa>(DEFAULT_INSTANCE);
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
}

