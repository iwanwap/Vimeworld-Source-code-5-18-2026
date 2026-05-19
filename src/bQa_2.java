/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BA
 *  Cpa
 *  NPa
 *  NTa
 *  bQa
 *  eqa
 *  fC
 *  nQa
 *  rra
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
public final class bQa_2
extends GeneratedMessageLite<bQa, Cpa>
implements fC {
    private static final bQa DEFAULT_INSTANCE;
    private static volatile Parser<bQa> PARSER;
    private Internal.ProtobufList<eqa> data_ = bQa_2.emptyProtobufList();
    public static final int ROOM_STATE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private int roomState_;

    static {
        bQa_2 bQa_22 = new bQa_2();
        DEFAULT_INSTANCE = bQa_22;
        GeneratedMessageLite.registerDefaultInstance(bQa_2.class, bQa_22);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(bQa bQa2, int n2, eqa eqa2) {
        void b2;
        bQa c2 = eqa2;
        bQa a2 = bQa2;
        super.f((int)b2, (eqa)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, eqa eqa2) {
        void b2;
        bQa_2 c2 = eqa2;
        bQa_2 a2 = this;
        c2.getClass();
        bQa_2 bQa_22 = a2;
        bQa_22.f();
        bQa_22.data_.add((int)b2, (eqa)c2);
    }

    public int getDataCount() {
        bQa_2 a2;
        return a2.data_.size();
    }

    public static bQa f() {
        return DEFAULT_INSTANCE;
    }

    public static bQa J(ByteString a2) throws InvalidProtocolBufferException {
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, eqa eqa2) {
        void b2;
        bQa_2 c2 = eqa2;
        bQa_2 a2 = this;
        c2.getClass();
        bQa_2 bQa_22 = a2;
        bQa_22.f();
        bQa_22.data_.set((int)b2, (eqa)c2);
    }

    public static /* synthetic */ void f(bQa a2) {
        super.l();
    }

    public static /* synthetic */ void f(bQa bQa2, int n2) {
        int b2 = n2;
        bQa a2 = bQa2;
        super.f(b2);
    }

    public static bQa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static bQa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(bQa bQa2, eqa eqa2) {
        bQa b2 = eqa2;
        bQa a2 = bQa2;
        super.J((eqa)b2);
    }

    public static Parser<bQa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public eqa getData(int n2) {
        int b2 = n2;
        bQa_2 a2 = this;
        return (eqa)a2.data_.get(b2);
    }

    private void l() {
        a.roomState_ = uSa.E;
    }

    public static bQa f(InputStream a2) throws IOException {
        return (bQa_2)bQa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public int getRoomState() {
        bQa_2 a2;
        return a2.roomState_;
    }

    public static /* synthetic */ void J(bQa bQa2, Iterable iterable) {
        Object b2 = iterable;
        bQa a2 = bQa2;
        super.J((Iterable<? extends eqa>)b2);
    }

    public BA J(int n2) {
        int b2 = n2;
        bQa_2 a2 = this;
        return (BA)a2.data_.get(b2);
    }

    public static Cpa J(bQa a2) {
        return (Cpa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(bQa bQa2, int n2, eqa eqa2) {
        void b2;
        bQa c2 = eqa2;
        bQa a2 = bQa2;
        super.J((int)b2, (eqa)c2);
    }

    public static Cpa J() {
        return (Cpa)DEFAULT_INSTANCE.createBuilder();
    }

    private void f(int n2) {
        int b2 = n2;
        bQa_2 a2 = this;
        a2.roomState_ = b2;
    }

    public static /* synthetic */ void J(bQa bQa2, int n2) {
        int b2 = n2;
        bQa a2 = bQa2;
        super.J(b2);
    }

    private void f() {
        bQa_2 bQa_22 = this;
        Internal.ProtobufList<eqa> a2 = bQa_22.data_;
        if (!a2.isModifiable()) {
            bQa_22.data_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static bQa J(InputStream a2) throws IOException {
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static bQa J(byte[] a2) throws InvalidProtocolBufferException {
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static bQa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static bQa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J() {
        a.data_ = bQa_2.emptyProtobufList();
    }

    public List<eqa> getDataList() {
        bQa_2 a2;
        return a2.data_;
    }

    public static bQa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (bQa_2)bQa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(eqa eqa2) {
        bQa_2 b2 = eqa2;
        bQa_2 a2 = this;
        b2.getClass();
        bQa_2 bQa_22 = a2;
        bQa_22.f();
        bQa_22.data_.add((eqa)b2);
    }

    private void J(Iterable<? extends eqa> iterable) {
        bQa_2 a2;
        Iterable<? extends eqa> b2 = iterable;
        bQa_2 bQa_22 = a2 = this;
        bQa_22.f();
        AbstractMessageLite.addAll(b2, bQa_22.data_);
    }

    public static /* synthetic */ void J(bQa a2) {
        super.J();
    }

    private bQa_2() {
        bQa_2 a2;
    }

    public static /* synthetic */ bQa J() {
        return DEFAULT_INSTANCE;
    }

    private void J(int n2) {
        bQa_2 a2;
        int b2 = n2;
        bQa_2 bQa_22 = a2 = this;
        bQa_22.f();
        bQa_22.data_.remove(b2);
    }

    public static bQa J(CodedInputStream a2) throws IOException {
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public List<? extends BA> J() {
        bQa_2 a2;
        return a2.data_;
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
        bQa_2 c2 = this;
        switch (rra.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new bQa_2();
            }
            case 2: {
                return new Cpa(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = NTa.Fa;
                objectArray[vRa.d] = nQa.t;
                objectArray[uqa.g] = eqa.class;
                d2 = objectArray;
                Object b2 = NPa.J;
                return bQa_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = bQa_2.class;
                synchronized (bQa_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<bQa>(DEFAULT_INSTANCE);
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

    public static bQa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static bQa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (bQa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

