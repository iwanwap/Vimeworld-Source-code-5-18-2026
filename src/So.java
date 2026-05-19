/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Kc
 *  Spa
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
public final class So
extends GeneratedMessageLite<So, om>
implements Kc {
    public static final int RECONNECTTO_FIELD_NUMBER = 1;
    private static final So DEFAULT_INSTANCE;
    private String reconnectTo_ = Mqa.y;
    private static volatile Parser<So> PARSER;

    public static So J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static So f(InputStream a2) throws IOException {
        return So.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ So f() {
        return DEFAULT_INSTANCE;
    }

    public static om J(So a2) {
        return (om)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        So a2 = this;
        Object object = b2;
        So.checkByteStringIsUtf8((ByteString)object);
        a2.reconnectTo_ = ((ByteString)object).toStringUtf8();
    }

    private So() {
        So a2;
    }

    public static om J() {
        return (om)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(So a2) {
        a2.J();
    }

    public static So f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return So.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static So J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getReconnectTo() {
        So a2;
        return a2.reconnectTo_;
    }

    public static So J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        So a2 = this;
        b2.getClass();
        a2.reconnectTo_ = b2;
    }

    public static So J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static So J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static So J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(So so, ByteString byteString) {
        ByteString b2 = byteString;
        So a2 = so;
        a2.J(b2);
    }

    static {
        So so;
        DEFAULT_INSTANCE = so = new So();
        GeneratedMessageLite.registerDefaultInstance(So.class, so);
    }

    public static So J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(So so, String string) {
        String b2 = string;
        So a2 = so;
        a2.J(b2);
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
        So c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new So();
            }
            case 2: {
                return new om(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = vua.J;
                d2 = objectArray;
                Object b2 = Spa.b;
                return So.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = So.class;
                synchronized (So.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<So>(DEFAULT_INSTANCE);
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

    public static So J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getReconnectToBytes() {
        So a2;
        return ByteString.copyFromUtf8(a2.reconnectTo_);
    }

    public static So J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static So J() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<So> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static So J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.reconnectTo_ = So.J().getReconnectTo();
    }
}

