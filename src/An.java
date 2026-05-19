/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Lm
 *  Vua
 *  s
 *  vRa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class An
extends GeneratedMessageLite<An, Lm>
implements s {
    private static volatile Parser<An> PARSER;
    private static final An DEFAULT_INSTANCE;
    private Internal.ProtobufList<String> values_ = GeneratedMessageLite.emptyProtobufList();
    public static final int VALUES_FIELD_NUMBER = 1;

    public static /* synthetic */ An f() {
        return DEFAULT_INSTANCE;
    }

    public static An J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static An J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(An an2, String string) {
        String b2 = string;
        An a2 = an2;
        a2.J(b2);
    }

    public int getValuesCount() {
        An a2;
        return a2.values_.size();
    }

    public static An f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Lm J(An a2) {
        return (Lm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(An an2, ByteString byteString) {
        ByteString b2 = byteString;
        An a2 = an2;
        a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, String string) {
        void b2;
        String c2 = string;
        An a2 = this;
        c2.getClass();
        An an2 = a2;
        an2.f();
        an2.values_.set((int)b2, c2);
    }

    private void J(String string) {
        String b2 = string;
        An a2 = this;
        b2.getClass();
        An an2 = a2;
        an2.f();
        an2.values_.add(b2);
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
        An c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new An();
            }
            case 2: {
                return new Lm(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Qpa.Y;
                d2 = objectArray;
                Object b2 = Vua.K;
                return An.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = An.class;
                synchronized (An.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<An>(DEFAULT_INSTANCE);
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

    public static An J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static An J() {
        return DEFAULT_INSTANCE;
    }

    public String getValues(int n2) {
        int b2 = n2;
        An a2 = this;
        return (String)a2.values_.get(b2);
    }

    public static An J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static An J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static An J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private An() {
        An a2;
    }

    public static /* synthetic */ void J(An a2) {
        a2.J();
    }

    public static An J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return An.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(An an2, Iterable iterable) {
        Iterable b2 = iterable;
        An a2 = an2;
        a2.J(b2);
    }

    public static Parser<An> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static An f(InputStream a2) throws IOException {
        return An.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        An an2 = this;
        Internal.ProtobufList<String> a2 = an2.values_;
        if (!a2.isModifiable()) {
            an2.values_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static An J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        An an2;
        DEFAULT_INSTANCE = an2 = new An();
        GeneratedMessageLite.registerDefaultInstance(An.class, an2);
    }

    private void J(Iterable<String> iterable) {
        An a2;
        Iterable<String> b2 = iterable;
        An an2 = a2 = this;
        an2.f();
        AbstractMessageLite.addAll(b2, an2.values_);
    }

    public static Lm J() {
        return (Lm)DEFAULT_INSTANCE.createBuilder();
    }

    public ByteString getValuesBytes(int n2) {
        int b2 = n2;
        An a2 = this;
        return ByteString.copyFromUtf8((String)a2.values_.get(b2));
    }

    private void J() {
        a.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    public List<String> getValuesList() {
        An a2;
        return a2.values_;
    }

    public static An J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static An J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(An an2, int n2, String string) {
        void b2;
        String c2 = string;
        An a2 = an2;
        a2.J((int)b2, c2);
    }

    private void J(ByteString byteString) {
        An a2;
        ByteString b2 = byteString;
        An an2 = a2 = this;
        An.checkByteStringIsUtf8(b2);
        an2.f();
        an2.values_.add(b2.toStringUtf8());
    }
}

