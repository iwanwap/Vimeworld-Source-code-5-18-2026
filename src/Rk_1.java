/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Al
 *  Bsa
 *  O
 *  Rk
 *  ZK
 *  vRa
 *  z
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
public final class Rk_1
extends GeneratedMessageLite<Rk, Al>
implements O {
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ZK> entries_ = Rk_1.emptyProtobufList();
    private static volatile Parser<Rk> PARSER;
    private static final Rk DEFAULT_INSTANCE;

    public static Rk J(ByteString a2) throws InvalidProtocolBufferException {
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(Rk rk, int n2, ZK zK2) {
        void b2;
        Rk c2 = zK2;
        Rk a2 = rk;
        super.f((int)b2, (ZK)c2);
    }

    public static /* synthetic */ void J(Rk rk, Iterable iterable) {
        Object b2 = iterable;
        Rk a2 = rk;
        super.J((Iterable<? extends ZK>)b2);
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
        Rk_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Rk_1();
            }
            case 2: {
                return new Al(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = Yua.d;
                objectArray[vRa.d] = ZK.class;
                d2 = objectArray;
                Object b2 = Bsa.D;
                return Rk_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Rk_1.class;
                synchronized (Rk_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Rk>(DEFAULT_INSTANCE);
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

    public static Rk J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public List<ZK> getEntriesList() {
        Rk_1 a2;
        return a2.entries_;
    }

    private void J(Iterable<? extends ZK> iterable) {
        Rk_1 a2;
        Iterable<? extends ZK> b2 = iterable;
        Rk_1 rk_1 = a2 = this;
        rk_1.J();
        AbstractMessageLite.addAll(b2, rk_1.entries_);
    }

    public static /* synthetic */ void J(Rk a2) {
        super.f();
    }

    public static Al J() {
        return (Al)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(Rk rk, int n2) {
        int b2 = n2;
        Rk a2 = rk;
        super.J(b2);
    }

    public static Rk f(InputStream a2) throws IOException {
        return (Rk_1)Rk_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ Rk f() {
        return DEFAULT_INSTANCE;
    }

    private void J(int n2) {
        Rk_1 a2;
        int b2 = n2;
        Rk_1 rk_1 = a2 = this;
        rk_1.J();
        rk_1.entries_.remove(b2);
    }

    private Rk_1() {
        Rk_1 a2;
    }

    public static Parser<Rk> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f() {
        a.entries_ = Rk_1.emptyProtobufList();
    }

    public static /* synthetic */ void J(Rk rk, ZK zK2) {
        Rk b2 = zK2;
        Rk a2 = rk;
        super.J((ZK)b2);
    }

    public static Rk J(InputStream a2) throws IOException {
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rk f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Rk J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Rk rk, int n2, ZK zK2) {
        void b2;
        Rk c2 = zK2;
        Rk a2 = rk;
        super.J((int)b2, (ZK)c2);
    }

    public static Rk J(byte[] a2) throws InvalidProtocolBufferException {
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, ZK zK2) {
        void b2;
        Rk_1 c2 = zK2;
        Rk_1 a2 = this;
        c2.getClass();
        Rk_1 rk_1 = a2;
        rk_1.J();
        rk_1.entries_.set((int)b2, (ZK)c2);
    }

    public static Rk J(CodedInputStream a2) throws IOException {
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public List<? extends z> J() {
        Rk_1 a2;
        return a2.entries_;
    }

    public static Rk J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rk_1)Rk_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, ZK zK2) {
        void b2;
        Rk_1 c2 = zK2;
        Rk_1 a2 = this;
        c2.getClass();
        Rk_1 rk_1 = a2;
        rk_1.J();
        rk_1.entries_.add((int)b2, (ZK)c2);
    }

    private void J() {
        Rk_1 rk_1 = this;
        Internal.ProtobufList<ZK> a2 = rk_1.entries_;
        if (!a2.isModifiable()) {
            rk_1.entries_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static Rk J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Rk_1 rk_1 = new Rk_1();
        DEFAULT_INSTANCE = rk_1;
        GeneratedMessageLite.registerDefaultInstance(Rk_1.class, rk_1);
    }

    public static Al J(Rk a2) {
        return (Al)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public z J(int n2) {
        int b2 = n2;
        Rk_1 a2 = this;
        return (z)a2.entries_.get(b2);
    }

    public int getEntriesCount() {
        Rk_1 a2;
        return a2.entries_.size();
    }

    public static Rk J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rk J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Rk_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ZK zK2) {
        Rk_1 b2 = zK2;
        Rk_1 a2 = this;
        b2.getClass();
        Rk_1 rk_1 = a2;
        rk_1.J();
        rk_1.entries_.add((ZK)b2);
    }

    public ZK getEntries(int n2) {
        int b2 = n2;
        Rk_1 a2 = this;
        return (ZK)a2.entries_.get(b2);
    }

    public static Rk J() {
        return DEFAULT_INSTANCE;
    }
}

