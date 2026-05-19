/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Qo
 *  Qqa
 *  Ya
 *  kpa
 *  lqa
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
public final class Qo_1
extends GeneratedMessageLite<Qo, fN>
implements Ya {
    private ByteString value_ = ByteString.EMPTY;
    private static volatile Parser<Qo> PARSER;
    public static final int VALUE_FIELD_NUMBER = 2;
    private boolean remote_;
    public static final int REMOTE_FIELD_NUMBER = 4;
    private static final Qo DEFAULT_INSTANCE;
    private int id_;
    private int bitField0_;
    private boolean hasMore_;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int HASMORE_FIELD_NUMBER = 3;

    public static /* synthetic */ void f(Qo qo2, boolean bl) {
        boolean b2 = bl;
        Qo a2 = qo2;
        super.f(b2);
    }

    public static Qo J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Qo qo2, int n2) {
        int b2 = n2;
        Qo a2 = qo2;
        super.J(b2);
    }

    public int getId() {
        Qo_1 a2;
        return a2.id_;
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.value_ = Qo_1.f().getValue();
    }

    public boolean getHasMore() {
        Qo_1 a2;
        return a2.hasMore_;
    }

    public static /* synthetic */ void C(Qo a2) {
        super.J();
    }

    public static Qo J(ByteString a2) throws InvalidProtocolBufferException {
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Qo a2) {
        super.f();
    }

    private void l() {
        a.bitField0_ &= ERa.Ka;
        a.hasMore_ = uSa.E;
    }

    public static Qo f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(Qo qo2, boolean bl) {
        boolean b2 = bl;
        Qo a2 = qo2;
        super.J(b2);
    }

    public static Qo J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        Qo_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.remote_ = b2;
    }

    public boolean hasHasMore() {
        Qo_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Qo f(InputStream a2) throws IOException {
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Qo a2) {
        super.l();
    }

    private void f() {
        a.id_ = uSa.E;
    }

    static {
        Qo_1 qo_1 = new Qo_1();
        DEFAULT_INSTANCE = qo_1;
        GeneratedMessageLite.registerDefaultInstance(Qo_1.class, qo_1);
    }

    public static Qo J(InputStream a2) throws IOException {
        return (Qo_1)Qo_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qo J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(Qo qo2, ByteString byteString) {
        Object b2 = byteString;
        Qo a2 = qo2;
        super.J((ByteString)b2);
    }

    public static Qo f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static fN J(Qo a2) {
        return (fN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public boolean getRemote() {
        Qo_1 a2;
        return a2.remote_;
    }

    public static Qo J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static fN J() {
        return (fN)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ Qo J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.remote_ = uSa.E;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Qo_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.value_ = b2;
    }

    public static Parser<Qo> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Qo J(byte[] a2) throws InvalidProtocolBufferException {
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasValue() {
        Qo_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private Qo_1() {
        Qo_1 a2;
    }

    public static Qo J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Qo_1)Qo_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Qo a2) {
        super.C();
    }

    private void J(int n2) {
        int b2 = n2;
        Qo_1 a2 = this;
        a2.id_ = b2;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        Qo_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.hasMore_ = b2;
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
        Qo_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Qo_1();
            }
            case 2: {
                return new fN(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = BQa.U;
                objectArray[yRa.d] = Hta.T;
                objectArray[AQa.P] = Qqa.Y;
                d2 = objectArray;
                Object b2 = TOa.h;
                return Qo_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Qo_1.class;
                synchronized (Qo_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Qo>(DEFAULT_INSTANCE);
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

    public static Qo J(CodedInputStream a2) throws IOException {
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Qo J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Qo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasRemote() {
        Qo_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getValue() {
        Qo_1 a2;
        return a2.value_;
    }
}

