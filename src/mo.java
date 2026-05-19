/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Fo
 *  lqa
 *  nb
 *  uQa
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
public final class mo
extends GeneratedMessageLite<mo, Fo>
implements nb {
    private int key_;
    private String id_ = Mqa.y;
    private static final mo DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<mo> PARSER;
    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 2;

    private void f() {
        a.key_ = uSa.E;
    }

    private mo() {
        mo a2;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        mo a2 = this;
        mo.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static mo f(InputStream a2) throws IOException {
        return mo.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static mo f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return mo.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        mo a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public static Parser<mo> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static mo J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getId() {
        mo a2;
        return a2.id_;
    }

    public int getKey() {
        mo a2;
        return a2.key_;
    }

    public static mo J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Fo J(mo a2) {
        return (Fo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static mo J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.id_ = mo.J().getId();
    }

    public static Fo J() {
        return (Fo)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void f(mo a2) {
        a2.J();
    }

    public static mo J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static mo J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(mo mo2, String string) {
        String b2 = string;
        mo a2 = mo2;
        a2.J(b2);
    }

    public static /* synthetic */ void J(mo mo2, ByteString byteString) {
        ByteString b2 = byteString;
        mo a2 = mo2;
        a2.J(b2);
    }

    public static /* synthetic */ mo f() {
        return DEFAULT_INSTANCE;
    }

    public static mo J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mo J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    static {
        mo mo2;
        DEFAULT_INSTANCE = mo2 = new mo();
        GeneratedMessageLite.registerDefaultInstance(mo.class, mo2);
    }

    public static mo J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasId() {
        mo a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static mo J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static mo J() {
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
        mo c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new mo();
            }
            case 2: {
                return new Fo(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = rSa.C;
                objectArray[uqa.g] = uQa.Aa;
                d2 = objectArray;
                Object b2 = Ura.L;
                return mo.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = mo.class;
                synchronized (mo.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<mo>(DEFAULT_INSTANCE);
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

    private void J(int n2) {
        int b2 = n2;
        mo a2 = this;
        a2.key_ = b2;
    }

    public ByteString getIdBytes() {
        mo a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static /* synthetic */ void J(mo a2) {
        a2.f();
    }

    public static /* synthetic */ void J(mo mo2, int n2) {
        int b2 = n2;
        mo a2 = mo2;
        a2.J(b2);
    }

    public static mo J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

