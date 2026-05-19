/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ata
 *  FTa
 *  JPa
 *  bN
 *  cra
 *  hm
 *  na
 *  rN
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
public final class hm_3
extends GeneratedMessageLite<hm, rN>
implements Xa {
    private Object scrollOffsetVal_;
    public static final int SCROLLOFFSETANIM_FIELD_NUMBER = 3;
    private static volatile Parser<hm> PARSER;
    private int scrollOffsetValCase_ = uSa.E;
    public static final int ACTIONS_FIELD_NUMBER = 1;
    public static final int SCROLLOFFSET_FIELD_NUMBER = 2;
    private static final hm DEFAULT_INSTANCE;
    private Internal.ProtobufList<bN> actions_ = hm_3.emptyProtobufList();

    public static hm f(InputStream a2) throws IOException {
        return (hm_3)hm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(hm hm2, int n2, bN bN2) {
        void b2;
        hm c2 = bN2;
        hm a2 = hm2;
        super.J((int)b2, (bN)c2);
    }

    private void J(bN bN2) {
        hm_3 b2 = bN2;
        hm_3 a2 = this;
        b2.getClass();
        hm_3 hm_32 = a2;
        hm_32.d();
        hm_32.actions_.add((bN)b2);
    }

    public static hm J(CodedInputStream a2) throws IOException {
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(hm a2) {
        super.l();
    }

    public static hm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static hm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        hm_3 a2;
        int b2 = n2;
        hm_3 hm_32 = a2 = this;
        hm_32.d();
        hm_32.actions_.remove(b2);
    }

    public static Parser<hm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        hm_3 hm_32 = new hm_3();
        DEFAULT_INSTANCE = hm_32;
        GeneratedMessageLite.registerDefaultInstance(hm_3.class, hm_32);
    }

    @Override
    public float getScrollOffset() {
        hm_3 a2;
        if (a2.scrollOffsetValCase_ == uqa.g) {
            return ((Float)a2.scrollOffsetVal_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void l(hm a2) {
        super.C();
    }

    public static /* synthetic */ void f(hm hm2, float f2) {
        float b2 = f2;
        hm a2 = hm2;
        super.J(b2);
    }

    public static /* synthetic */ hm f() {
        return DEFAULT_INSTANCE;
    }

    private void d() {
        hm_3 hm_32 = this;
        Internal.ProtobufList<bN> a2 = hm_32.actions_;
        if (!a2.isModifiable()) {
            hm_32.actions_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void J(hm hm2, float f2) {
        float b2 = f2;
        hm a2 = hm2;
        super.f(b2);
    }

    @Override
    public qo getScrollOffsetValCase() {
        hm_3 a2;
        return qo.forNumber(a2.scrollOffsetValCase_);
    }

    public static /* synthetic */ void J(hm hm2, Iterable iterable) {
        Object b2 = iterable;
        hm a2 = hm2;
        super.J((Iterable<? extends bN>)b2);
    }

    public static hm J(ByteString a2) throws InvalidProtocolBufferException {
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasScrollOffsetAnim() {
        hm_3 a2;
        if (a2.scrollOffsetValCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static hm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private hm_3() {
        hm_3 a2;
    }

    private void C() {
        hm_3 a2;
        if (a2.scrollOffsetValCase_ == uqa.g) {
            hm_3 hm_32 = a2;
            hm_32.scrollOffsetValCase_ = uSa.E;
            hm_32.scrollOffsetVal_ = null;
        }
    }

    public static /* synthetic */ void J(hm hm2, bN bN2) {
        hm b2 = bN2;
        hm a2 = hm2;
        super.J((bN)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, bN bN2) {
        void b2;
        hm_3 c2 = bN2;
        hm_3 a2 = this;
        c2.getClass();
        hm_3 hm_32 = a2;
        hm_32.d();
        hm_32.actions_.set((int)b2, (bN)c2);
    }

    public static /* synthetic */ void f(hm a2) {
        super.f();
    }

    public List<? extends na> J() {
        hm_3 a2;
        return a2.actions_;
    }

    private void l() {
        hm_3 a2;
        hm_3 hm_32 = a2;
        hm_32.scrollOffsetValCase_ = uSa.E;
        hm_32.scrollOffsetVal_ = null;
    }

    public na J(int n2) {
        int b2 = n2;
        hm_3 a2 = this;
        return (na)a2.actions_.get(b2);
    }

    private void f(float f2) {
        hm_3 a2;
        float b2 = f2;
        hm_3 hm_32 = a2 = this;
        hm_32.scrollOffsetValCase_ = yRa.d;
        hm_32.scrollOffsetVal_ = Float.valueOf(b2);
    }

    public static hm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, bN bN2) {
        void b2;
        hm_3 c2 = bN2;
        hm_3 a2 = this;
        c2.getClass();
        hm_3 hm_32 = a2;
        hm_32.d();
        hm_32.actions_.add((int)b2, (bN)c2);
    }

    public static hm J() {
        return DEFAULT_INSTANCE;
    }

    private void J(float f2) {
        hm_3 a2;
        float b2 = f2;
        hm_3 hm_32 = a2 = this;
        hm_32.scrollOffsetValCase_ = uqa.g;
        hm_32.scrollOffsetVal_ = Float.valueOf(b2);
    }

    public static hm J(byte[] a2) throws InvalidProtocolBufferException {
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static hm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public bN getActions(int n2) {
        int b2 = n2;
        hm_3 a2 = this;
        return (bN)a2.actions_.get(b2);
    }

    private void J(Iterable<? extends bN> iterable) {
        hm_3 a2;
        Iterable<? extends bN> b2 = iterable;
        hm_3 hm_32 = a2 = this;
        hm_32.d();
        AbstractMessageLite.addAll(b2, hm_32.actions_);
    }

    public static hm J(InputStream a2) throws IOException {
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static hm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (hm_3)hm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        hm_3 a2;
        if (a2.scrollOffsetValCase_ == yRa.d) {
            hm_3 hm_32 = a2;
            hm_32.scrollOffsetValCase_ = uSa.E;
            hm_32.scrollOffsetVal_ = null;
        }
    }

    @Override
    public float getScrollOffsetAnim() {
        hm_3 a2;
        if (a2.scrollOffsetValCase_ == yRa.d) {
            return ((Float)a2.scrollOffsetVal_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public int getActionsCount() {
        hm_3 a2;
        return a2.actions_.size();
    }

    public static hm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (hm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.actions_ = hm_3.emptyProtobufList();
    }

    public static rN J() {
        return (rN)DEFAULT_INSTANCE.createBuilder();
    }

    @Override
    public boolean hasScrollOffset() {
        hm_3 a2;
        if (a2.scrollOffsetValCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static rN J(hm a2) {
        return (rN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public List<bN> getActionsList() {
        hm_3 a2;
        return a2.actions_;
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
        hm_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new hm_3();
            }
            case 2: {
                return new rN(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = Ata.J;
                objectArray[vRa.d] = kTa.D;
                objectArray[uqa.g] = cra.m;
                objectArray[yRa.d] = bN.class;
                d2 = objectArray;
                Object b2 = FTa.s;
                return hm_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = hm_3.class;
                synchronized (hm_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<hm>(DEFAULT_INSTANCE);
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

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(hm hm2, int n2, bN bN2) {
        void b2;
        hm c2 = bN2;
        hm a2 = hm2;
        super.f((int)b2, (bN)c2);
    }

    public static /* synthetic */ void J(hm hm2, int n2) {
        int b2 = n2;
        hm a2 = hm2;
        super.J(b2);
    }

    public static /* synthetic */ void J(hm a2) {
        super.J();
    }
}

