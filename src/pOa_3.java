/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Sd
 *  jra
 *  nQa
 *  pOa
 *  qqa
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
public final class pOa_3
extends GeneratedMessageLite<pOa, qqa>
implements dB {
    private static final pOa DEFAULT_INSTANCE;
    private static volatile Parser<pOa> PARSER;
    private Internal.ProtobufList<Dra> data_ = pOa_3.emptyProtobufList();
    public static final int DATA_FIELD_NUMBER = 1;

    private void f() {
        pOa_3 pOa_32 = this;
        Internal.ProtobufList<Dra> a2 = pOa_32.data_;
        if (!a2.isModifiable()) {
            pOa_32.data_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void J(pOa pOa2, Dra dra) {
        Object b2 = dra;
        pOa a2 = pOa2;
        super.J((Dra)b2);
    }

    public static /* synthetic */ void J(pOa pOa2, int n2) {
        int b2 = n2;
        pOa a2 = pOa2;
        super.J(b2);
    }

    static {
        pOa_3 pOa_32 = new pOa_3();
        DEFAULT_INSTANCE = pOa_32;
        GeneratedMessageLite.registerDefaultInstance(pOa_3.class, pOa_32);
    }

    public static pOa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pOa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pOa_3)pOa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pOa J(CodedInputStream a2) throws IOException {
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public Sd J(int n2) {
        int b2 = n2;
        pOa_3 a2 = this;
        return (Sd)a2.data_.get(b2);
    }

    @Override
    public List<Dra> getDataList() {
        pOa_3 a2;
        return a2.data_;
    }

    public static /* synthetic */ pOa f() {
        return DEFAULT_INSTANCE;
    }

    public static qqa J() {
        return (qqa)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(Iterable<? extends Dra> iterable) {
        pOa_3 a2;
        Iterable<? extends Dra> b2 = iterable;
        pOa_3 pOa_32 = a2 = this;
        pOa_32.f();
        AbstractMessageLite.addAll(b2, pOa_32.data_);
    }

    @Override
    public Dra getData(int n2) {
        int b2 = n2;
        pOa_3 a2 = this;
        return (Dra)a2.data_.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(pOa pOa2, int n2, Dra dra) {
        void b2;
        Object c2 = dra;
        pOa a2 = pOa2;
        super.f((int)b2, (Dra)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, Dra dra) {
        void b2;
        GeneratedMessageLite c2 = dra;
        pOa_3 a2 = this;
        c2.getClass();
        pOa_3 pOa_32 = a2;
        pOa_32.f();
        pOa_32.data_.set((int)b2, (Dra)c2);
    }

    @Override
    public int getDataCount() {
        pOa_3 a2;
        return a2.data_.size();
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
        pOa_3 c2 = this;
        switch (jra.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new pOa_3();
            }
            case 2: {
                return new qqa(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Dra.class;
                d2 = objectArray;
                Object b2 = Bsa.D;
                return pOa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = pOa_3.class;
                synchronized (pOa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<pOa>(DEFAULT_INSTANCE);
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

    public static pOa f(InputStream a2) throws IOException {
        return (pOa_3)pOa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(pOa pOa2, int n2, Dra dra) {
        void b2;
        Object c2 = dra;
        pOa a2 = pOa2;
        super.J((int)b2, (Dra)c2);
    }

    private void J(Dra dra) {
        GeneratedMessageLite b2 = dra;
        pOa_3 a2 = this;
        b2.getClass();
        pOa_3 pOa_32 = a2;
        pOa_32.f();
        pOa_32.data_.add((Dra)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Dra dra) {
        void b2;
        GeneratedMessageLite c2 = dra;
        pOa_3 a2 = this;
        c2.getClass();
        pOa_3 pOa_32 = a2;
        pOa_32.f();
        pOa_32.data_.add((int)b2, (Dra)c2);
    }

    public List<? extends Sd> J() {
        pOa_3 a2;
        return a2.data_;
    }

    private void J(int n2) {
        pOa_3 a2;
        int b2 = n2;
        pOa_3 pOa_32 = a2 = this;
        pOa_32.f();
        pOa_32.data_.remove(b2);
    }

    public static pOa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pOa J(ByteString a2) throws InvalidProtocolBufferException {
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static pOa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pOa J(InputStream a2) throws IOException {
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.data_ = pOa_3.emptyProtobufList();
    }

    private pOa_3() {
        pOa_3 a2;
    }

    public static pOa J(byte[] a2) throws InvalidProtocolBufferException {
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<pOa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static qqa J(pOa a2) {
        return (qqa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static pOa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static pOa J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(pOa pOa2, Iterable iterable) {
        Object b2 = iterable;
        pOa a2 = pOa2;
        super.J((Iterable<? extends Dra>)b2);
    }

    public static /* synthetic */ void J(pOa a2) {
        super.J();
    }

    public static pOa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static pOa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (pOa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

