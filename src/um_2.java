/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Spa
 *  aPa
 *  nM
 *  uB
 *  um
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
public final class um_2
extends GeneratedMessageLite<um, nM>
implements uB {
    private static volatile Parser<um> PARSER;
    private static final um DEFAULT_INSTANCE;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = Mqa.y;

    public static Parser<um> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static um f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getText() {
        um_2 a2;
        return a2.text_;
    }

    public static nM J(um a2) {
        return (nM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static um J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (um_2)um_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(um um2, ByteString byteString) {
        Object b2 = byteString;
        um a2 = um2;
        super.J((ByteString)b2);
    }

    private void J() {
        a.text_ = um_2.f().getText();
    }

    private um_2() {
        um_2 a2;
    }

    static {
        um_2 um_22 = new um_2();
        DEFAULT_INSTANCE = um_22;
        GeneratedMessageLite.registerDefaultInstance(um_2.class, um_22);
    }

    public static um J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getTextBytes() {
        um_2 a2;
        return ByteString.copyFromUtf8(a2.text_);
    }

    public static nM J() {
        return (nM)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        um_2 a2 = this;
        Object object = b2;
        um_2.checkByteStringIsUtf8((ByteString)object);
        a2.text_ = ((ByteString)object).toStringUtf8();
    }

    public static um f(InputStream a2) throws IOException {
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static um f() {
        return DEFAULT_INSTANCE;
    }

    public static um J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static um J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(um a2) {
        super.J();
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
        um_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new um_2();
            }
            case 2: {
                return new nM(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = aPa.O;
                d2 = objectArray;
                Object b2 = Spa.b;
                return um_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = um_2.class;
                synchronized (um_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<um>(DEFAULT_INSTANCE);
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

    public static um J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ um J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(um um2, String string) {
        Object b2 = string;
        um a2 = um2;
        super.J((String)b2);
    }

    public static um J(byte[] a2) throws InvalidProtocolBufferException {
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static um J(CodedInputStream a2) throws IOException {
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static um J(InputStream a2) throws IOException {
        return (um_2)um_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        um_2 a2 = this;
        b2.getClass();
        a2.text_ = b2;
    }

    public static um J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static um J(ByteString a2) throws InvalidProtocolBufferException {
        return (um_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

