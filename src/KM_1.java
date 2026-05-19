/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  KM
 *  Wa
 *  hqa
 *  lqa
 *  nQa
 *  pua
 *  sM
 *  vRa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KM_1
extends GeneratedMessageLite<KM, sM>
implements Wa {
    private boolean culling_;
    public static final int CULLING_FIELD_NUMBER = 4;
    private int bitField0_;
    private int vertexFormatMemoizedSerializedSize = pua.o;
    private ByteString data_;
    private static volatile Parser<KM> PARSER;
    public static final int DATA_FIELD_NUMBER = 2;
    public static final int VERTEXFORMAT_FIELD_NUMBER = 1;
    private int mode_;
    private static final KM DEFAULT_INSTANCE;
    private Internal.IntList vertexFormat_ = KM_1.emptyIntList();
    public static final int MODE_FIELD_NUMBER = 3;

    public static KM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (KM_1)KM_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private KM_1() {
        KM_1 a2;
        a2.data_ = ByteString.EMPTY;
    }

    public static /* synthetic */ void C(KM a2) {
        super.l();
    }

    public static KM J(byte[] a2) throws InvalidProtocolBufferException {
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasCulling() {
        KM_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static KM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(KM a2) {
        super.f();
    }

    public int getMode() {
        KM_1 a2;
        return a2.mode_;
    }

    public static KM J(ByteString a2) throws InvalidProtocolBufferException {
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void d() {
        a.vertexFormat_ = KM_1.emptyIntList();
    }

    public static KM J(CodedInputStream a2) throws IOException {
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getData() {
        KM_1 a2;
        return a2.data_;
    }

    public static KM f() {
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
        KM_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new KM_1();
            }
            case 2: {
                return new sM(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = dqa.T;
                objectArray[uqa.g] = nQa.t;
                objectArray[yRa.d] = sra.p;
                objectArray[AQa.P] = ATa.Fa;
                d2 = objectArray;
                Object b2 = hqa.ba;
                return KM_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = KM_1.class;
                synchronized (KM_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<KM>(DEFAULT_INSTANCE);
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

    public static KM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(KM a2) {
        super.d();
    }

    public static /* synthetic */ void f(KM kM, int n2) {
        int b2 = n2;
        KM a2 = kM;
        super.f(b2);
    }

    private void C() {
        a.data_ = KM_1.f().getData();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        KM_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.culling_ = b2;
    }

    private void f(int n2) {
        int b2 = n2;
        KM_1 a2 = this;
        a2.mode_ = b2;
    }

    public static sM J(KM a2) {
        return (sM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static KM f(InputStream a2) throws IOException {
        return (KM_1)KM_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public int getVertexFormat(int n2) {
        int b2 = n2;
        KM_1 a2 = this;
        return a2.vertexFormat_.getInt(b2);
    }

    public static /* synthetic */ KM J() {
        return DEFAULT_INSTANCE;
    }

    static {
        KM_1 kM_1 = new KM_1();
        DEFAULT_INSTANCE = kM_1;
        GeneratedMessageLite.registerDefaultInstance(KM_1.class, kM_1);
    }

    public boolean getCulling() {
        KM_1 a2;
        return a2.culling_;
    }

    private void J(int n2) {
        KM_1 a2;
        int b2 = n2;
        KM_1 kM_1 = a2 = this;
        kM_1.J();
        kM_1.vertexFormat_.addInt(b2);
    }

    public static Parser<KM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(KM kM, ByteString byteString) {
        Object b2 = byteString;
        KM a2 = kM;
        super.J((ByteString)b2);
    }

    private void J(Iterable<? extends Integer> iterable) {
        KM_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        KM_1 kM_1 = a2 = this;
        kM_1.J();
        AbstractMessageLite.addAll(b2, kM_1.vertexFormat_);
    }

    public int getVertexFormatCount() {
        KM_1 a2;
        return a2.vertexFormat_.size();
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.culling_ = uSa.E;
    }

    public static KM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static KM J(InputStream a2) throws IOException {
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(KM kM, boolean bl) {
        boolean b2 = bl;
        KM a2 = kM;
        super.J(b2);
    }

    public static /* synthetic */ void J(KM kM, Iterable iterable) {
        Object b2 = iterable;
        KM a2 = kM;
        super.J((Iterable<? extends Integer>)b2);
    }

    public static KM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        KM_1 a2;
        int c2 = n3;
        KM_1 kM_1 = a2 = this;
        kM_1.J();
        kM_1.vertexFormat_.setInt((int)b2, c2);
    }

    public static KM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.mode_ = uSa.E;
    }

    public static /* synthetic */ void J(KM a2) {
        super.C();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        KM_1 a2 = this;
        b2.getClass();
        a2.data_ = b2;
    }

    public List<Integer> getVertexFormatList() {
        KM_1 a2;
        return a2.vertexFormat_;
    }

    public static /* synthetic */ void J(KM kM, int n2) {
        int b2 = n2;
        KM a2 = kM;
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(KM kM, int n2, int n3) {
        void b2;
        int c2 = n3;
        KM a2 = kM;
        super.J((int)b2, c2);
    }

    public static KM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (KM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        KM_1 kM_1 = this;
        Internal.IntList a2 = kM_1.vertexFormat_;
        if (!a2.isModifiable()) {
            kM_1.vertexFormat_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static sM J() {
        return (sM)DEFAULT_INSTANCE.createBuilder();
    }
}

