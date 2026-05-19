/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Cn
 *  ERa
 *  hTa
 *  ln
 *  lqa
 *  pqa
 *  ra
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
public final class ln_1
extends GeneratedMessageLite<ln, Cn>
implements ra {
    private static final ln DEFAULT_INSTANCE;
    public static final int UUID_FIELD_NUMBER = 4;
    private static volatile Parser<ln> PARSER;
    public static final int ENTITYID_FIELD_NUMBER = 3;
    private int bitField0_;
    public static final int PATH_FIELD_NUMBER = 1;
    private int entityId_;
    public static final int RESOURCE_FIELD_NUMBER = 2;
    private int resource_;
    private ByteString uuid_;
    private String path_ = Mqa.y;

    public static /* synthetic */ void f(ln ln2, int n2) {
        int b2 = n2;
        ln a2 = ln2;
        super.J(b2);
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.path_ = ln_1.f().getPath();
    }

    public String getPath() {
        ln_1 a2;
        return a2.path_;
    }

    public static ln J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ln f(InputStream a2) throws IOException {
        return (ln_1)ln_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void l() {
        a.entityId_ = uSa.E;
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
        ln_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new ln_1();
            }
            case 2: {
                return new Cn(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = ERa.h;
                objectArray[uqa.g] = kra.v;
                objectArray[yRa.d] = VPa.o;
                objectArray[AQa.P] = hTa.u;
                d2 = objectArray;
                Object b2 = pqa.a;
                return ln_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = ln_1.class;
                synchronized (ln_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<ln>(DEFAULT_INSTANCE);
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

    public static Cn J(ln a2) {
        return (Cn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.resource_ = uSa.E;
    }

    private ln_1() {
        ln_1 a2;
        a2.uuid_ = ByteString.EMPTY;
    }

    public static /* synthetic */ void J(ln ln2, int n2) {
        int b2 = n2;
        ln a2 = ln2;
        super.f(b2);
    }

    public static /* synthetic */ void f(ln ln2, ByteString byteString) {
        Object b2 = byteString;
        ln a2 = ln2;
        super.f((ByteString)b2);
    }

    public boolean hasPath() {
        ln_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ln J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Cn J() {
        return (Cn)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(String string) {
        String b2 = string;
        ln_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.path_ = b2;
    }

    public int getResource() {
        ln_1 a2;
        return a2.resource_;
    }

    public boolean hasResource() {
        ln_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        ln_1 a2 = this;
        b2.getClass();
        a2.uuid_ = b2;
    }

    public static /* synthetic */ void C(ln a2) {
        super.l();
    }

    public static /* synthetic */ void l(ln a2) {
        super.f();
    }

    public static ln f() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        a.uuid_ = ln_1.f().getUuid();
    }

    public ByteString getPathBytes() {
        ln_1 a2;
        return ByteString.copyFromUtf8(a2.path_);
    }

    public static ln J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public int getEntityId() {
        ln_1 a2;
        return a2.entityId_;
    }

    public static ln f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<ln> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ln J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ln_1)ln_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ ln J() {
        return DEFAULT_INSTANCE;
    }

    public static ln J(byte[] a2) throws InvalidProtocolBufferException {
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(ln ln2, ByteString byteString) {
        Object b2 = byteString;
        ln a2 = ln2;
        super.J((ByteString)b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        ln_1 a2 = this;
        ln_1.checkByteStringIsUtf8(b2);
        a2.path_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    private void f(int n2) {
        int b2 = n2;
        ln_1 a2 = this;
        a2.entityId_ = b2;
    }

    public static /* synthetic */ void J(ln ln2, String string) {
        Object b2 = string;
        ln a2 = ln2;
        super.J((String)b2);
    }

    public static ln J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(ln a2) {
        super.C();
    }

    public ByteString getUuid() {
        ln_1 a2;
        return a2.uuid_;
    }

    public static ln J(CodedInputStream a2) throws IOException {
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ln J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        ln_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.resource_ = b2;
    }

    public static ln J(InputStream a2) throws IOException {
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(ln a2) {
        super.J();
    }

    static {
        ln_1 ln_12 = new ln_1();
        DEFAULT_INSTANCE = ln_12;
        GeneratedMessageLite.registerDefaultInstance(ln_1.class, ln_12);
    }

    public static ln J(ByteString a2) throws InvalidProtocolBufferException {
        return (ln_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

