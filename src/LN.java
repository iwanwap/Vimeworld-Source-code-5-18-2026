/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  KN
 *  LQa
 *  kta
 *  pua
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
public final class LN
extends GeneratedMessageLite<LN, KN>
implements wa {
    private int remoteIdsMemoizedSerializedSize;
    public static final int REMOTEIDS_FIELD_NUMBER = 4;
    public static final int LOCALIDS_FIELD_NUMBER = 2;
    public static final int REMOTERESOURCES_FIELD_NUMBER = 3;
    private Internal.IntList localIds_;
    private ByteString remoteResources_;
    private int localIdsMemoizedSerializedSize = pua.o;
    private static final LN DEFAULT_INSTANCE;
    private static volatile Parser<LN> PARSER;
    private Internal.IntList remoteIds_;
    private ByteString localResources_;
    public static final int LOCALRESOURCES_FIELD_NUMBER = 1;

    private void e() {
        a.remoteIds_ = LN.emptyIntList();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(LN lN, int n2, int n3) {
        void b2;
        int c2 = n3;
        LN a2 = lN;
        a2.J((int)b2, c2);
    }

    public static LN J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void d() {
        LN lN = this;
        Internal.IntList a2 = lN.remoteIds_;
        if (!a2.isModifiable()) {
            lN.remoteIds_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void f(LN lN, int n2) {
        int b2 = n2;
        LN a2 = lN;
        a2.f(b2);
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
        LN c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new LN();
            }
            case 2: {
                return new KN(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = csa.Y;
                objectArray[vRa.d] = kta.Ga;
                objectArray[uqa.g] = yOa.b;
                objectArray[yRa.d] = LQa.f;
                d2 = objectArray;
                Object b2 = AQa.s;
                return LN.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = LN.class;
                synchronized (LN.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<LN>(DEFAULT_INSTANCE);
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

    private void f(Iterable<? extends Integer> iterable) {
        LN a2;
        Iterable<? extends Integer> b2 = iterable;
        LN lN = a2 = this;
        lN.d();
        AbstractMessageLite.addAll(b2, lN.remoteIds_);
    }

    private void J(Iterable<? extends Integer> iterable) {
        LN a2;
        Iterable<? extends Integer> b2 = iterable;
        LN lN = a2 = this;
        lN.l();
        AbstractMessageLite.addAll(b2, lN.localIds_);
    }

    private void C() {
        a.remoteResources_ = LN.J().getRemoteResources();
    }

    public static LN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(LN lN, ByteString byteString) {
        ByteString b2 = byteString;
        LN a2 = lN;
        a2.f(b2);
    }

    public static LN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return LN.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l() {
        LN lN = this;
        Internal.IntList a2 = lN.localIds_;
        if (!a2.isModifiable()) {
            lN.localIds_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static LN J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(LN lN, ByteString byteString) {
        ByteString b2 = byteString;
        LN a2 = lN;
        a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(LN lN, int n2, int n3) {
        void b2;
        int c2 = n3;
        LN a2 = lN;
        a2.f((int)b2, c2);
    }

    public static KN J(LN a2) {
        return (KN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        LN lN;
        DEFAULT_INSTANCE = lN = new LN();
        GeneratedMessageLite.registerDefaultInstance(LN.class, lN);
    }

    public static LN f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private LN() {
        LN a2;
        a2.remoteIdsMemoizedSerializedSize = pua.o;
        a2.localResources_ = ByteString.EMPTY;
        a2.localIds_ = LN.emptyIntList();
        a2.remoteResources_ = ByteString.EMPTY;
        a2.remoteIds_ = LN.emptyIntList();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        LN a2 = this;
        b2.getClass();
        a2.remoteResources_ = b2;
    }

    private void f() {
        a.localIds_ = LN.emptyIntList();
    }

    public static /* synthetic */ void J(LN lN, int n2) {
        int b2 = n2;
        LN a2 = lN;
        a2.J(b2);
    }

    @Override
    public List<Integer> getLocalIdsList() {
        LN a2;
        return a2.localIds_;
    }

    @Override
    public ByteString getLocalResources() {
        LN a2;
        return a2.localResources_;
    }

    @Override
    public List<Integer> getRemoteIdsList() {
        LN a2;
        return a2.remoteIds_;
    }

    @Override
    public int getLocalIdsCount() {
        LN a2;
        return a2.localIds_.size();
    }

    public static /* synthetic */ void C(LN a2) {
        a2.J();
    }

    public static /* synthetic */ void l(LN a2) {
        a2.C();
    }

    public static /* synthetic */ void f(LN lN, Iterable iterable) {
        Iterable b2 = iterable;
        LN a2 = lN;
        a2.J(b2);
    }

    private void J() {
        a.localResources_ = LN.J().getLocalResources();
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3) {
        void b2;
        LN a2;
        int c2 = n3;
        LN lN = a2 = this;
        lN.l();
        lN.localIds_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void f(LN a2) {
        a2.e();
    }

    public static LN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void f(int n2) {
        LN a2;
        int b2 = n2;
        LN lN = a2 = this;
        lN.d();
        lN.remoteIds_.addInt(b2);
    }

    public static LN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(LN a2) {
        a2.f();
    }

    @Override
    public int getRemoteIds(int n2) {
        int b2 = n2;
        LN a2 = this;
        return a2.remoteIds_.getInt(b2);
    }

    public static /* synthetic */ LN f() {
        return DEFAULT_INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        LN a2;
        int c2 = n3;
        LN lN = a2 = this;
        lN.d();
        lN.remoteIds_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void J(LN lN, Iterable iterable) {
        Iterable b2 = iterable;
        LN a2 = lN;
        a2.f(b2);
    }

    @Override
    public ByteString getRemoteResources() {
        LN a2;
        return a2.remoteResources_;
    }

    public static LN J(InputStream a2) throws IOException {
        return LN.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static LN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static LN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public int getLocalIds(int n2) {
        int b2 = n2;
        LN a2 = this;
        return a2.localIds_.getInt(b2);
    }

    public static KN J() {
        return (KN)DEFAULT_INSTANCE.createBuilder();
    }

    @Override
    public int getRemoteIdsCount() {
        LN a2;
        return a2.remoteIds_.size();
    }

    private void J(int n2) {
        LN a2;
        int b2 = n2;
        LN lN = a2 = this;
        lN.l();
        lN.localIds_.addInt(b2);
    }

    public static Parser<LN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        LN a2 = this;
        b2.getClass();
        a2.localResources_ = b2;
    }

    public static LN J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static LN J() {
        return DEFAULT_INSTANCE;
    }

    public static LN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

