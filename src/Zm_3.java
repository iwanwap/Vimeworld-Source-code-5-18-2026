/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Zm
 *  lqa
 *  oa
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
public final class Zm_3
extends GeneratedMessageLite<Zm, lm>
implements oa {
    private int key_;
    public static final int ID_FIELD_NUMBER = 2;
    private static final Zm DEFAULT_INSTANCE;
    private int bitField0_;
    private String id_ = Mqa.y;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<Zm> PARSER;

    public static /* synthetic */ Zm f() {
        return DEFAULT_INSTANCE;
    }

    public String getId() {
        Zm_3 a2;
        return a2.id_;
    }

    private void J(String string) {
        String b2 = string;
        Zm_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public static Zm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Zm_3)Zm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(Zm a2) {
        super.J();
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.id_ = Zm_3.J().getId();
    }

    public static Zm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Zm_3 zm_3 = new Zm_3();
        DEFAULT_INSTANCE = zm_3;
        GeneratedMessageLite.registerDefaultInstance(Zm_3.class, zm_3);
    }

    public static Zm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Zm zm2, String string) {
        Object b2 = string;
        Zm a2 = zm2;
        super.J((String)b2);
    }

    public static Zm f(InputStream a2) throws IOException {
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Zm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Zm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Zm J(ByteString a2) throws InvalidProtocolBufferException {
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Zm a2) {
        super.f();
    }

    private void J(int n2) {
        int b2 = n2;
        Zm_3 a2 = this;
        a2.key_ = b2;
    }

    public static Zm J(InputStream a2) throws IOException {
        return (Zm_3)Zm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Zm J() {
        return DEFAULT_INSTANCE;
    }

    public int getKey() {
        Zm_3 a2;
        return a2.key_;
    }

    public static /* synthetic */ void J(Zm zm2, int n2) {
        int b2 = n2;
        Zm a2 = zm2;
        super.J(b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Zm_3 a2 = this;
        Zm_3.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static Zm J(CodedInputStream a2) throws IOException {
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getIdBytes() {
        Zm_3 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static Parser<Zm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Zm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasId() {
        Zm_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static lm J() {
        return (lm)DEFAULT_INSTANCE.createBuilder();
    }

    private Zm_3() {
        Zm_3 a2;
    }

    public static /* synthetic */ void J(Zm zm2, ByteString byteString) {
        Object b2 = byteString;
        Zm a2 = zm2;
        super.J((ByteString)b2);
    }

    private void J() {
        a.key_ = uSa.E;
    }

    public static Zm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        Zm_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Zm_3();
            }
            case 2: {
                return new lm(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = rSa.C;
                objectArray[uqa.g] = uQa.Aa;
                d2 = objectArray;
                Object b2 = Ura.L;
                return Zm_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Zm_3.class;
                synchronized (Zm_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Zm>(DEFAULT_INSTANCE);
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

    public static Zm J(byte[] a2) throws InvalidProtocolBufferException {
        return (Zm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static lm J(Zm a2) {
        return (lm)DEFAULT_INSTANCE.createBuilder(a2);
    }
}

