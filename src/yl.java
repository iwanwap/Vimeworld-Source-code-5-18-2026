/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Kk
 *  Pl
 *  lqa
 *  nk
 *  vRa
 *  y
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
public final class yl
extends GeneratedMessageLite<yl, nk>
implements o {
    public static final int LAYER_FIELD_NUMBER = 2;
    private int bitField0_;
    public static final int ENTRIES_FIELD_NUMBER = 1;
    private static final yl DEFAULT_INSTANCE;
    private static volatile Parser<yl> PARSER;
    private Internal.ProtobufList<Kk> entries_ = yl.emptyProtobufList();
    private int layer_;

    public static /* synthetic */ void f(yl yl2, int n2) {
        int b2 = n2;
        yl a2 = yl2;
        a2.f(b2);
    }

    public static /* synthetic */ yl f() {
        return DEFAULT_INSTANCE;
    }

    private void J(Kk kk2) {
        yl b2 = kk2;
        yl a2 = this;
        b2.getClass();
        yl yl2 = a2;
        yl2.l();
        yl2.entries_.add((Kk)b2);
    }

    public static /* synthetic */ void f(yl a2) {
        a2.J();
    }

    public static /* synthetic */ void J(yl yl2, Iterable iterable) {
        Iterable b2 = iterable;
        yl a2 = yl2;
        a2.J(b2);
    }

    public static yl J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(yl yl2, int n2) {
        int b2 = n2;
        yl a2 = yl2;
        a2.J(b2);
    }

    public static nk J() {
        return (nk)DEFAULT_INSTANCE.createBuilder();
    }

    public static yl J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(yl yl2, Kk kk2) {
        yl b2 = kk2;
        yl a2 = yl2;
        a2.J((Kk)b2);
    }

    private void l() {
        yl yl2 = this;
        Internal.ProtobufList<Kk> a2 = yl2.entries_;
        if (!a2.isModifiable()) {
            yl2.entries_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static yl f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static yl f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        yl c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new yl();
            }
            case 2: {
                return new nk(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = Yua.d;
                objectArray[uqa.g] = Kk.class;
                objectArray[yRa.d] = lTa.P;
                d2 = objectArray;
                Object b2 = cPa.y;
                return yl.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = yl.class;
                synchronized (yl.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<yl>(DEFAULT_INSTANCE);
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

    public static yl J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(Iterable<? extends Kk> iterable) {
        yl a2;
        Iterable<? extends Kk> b2 = iterable;
        yl yl2 = a2 = this;
        yl2.l();
        AbstractMessageLite.addAll(b2, yl2.entries_);
    }

    @Override
    public Pl getLayer() {
        yl yl2 = this;
        yl a2 = Pl.forNumber((int)yl2.layer_);
        if (a2 == null) {
            return Pl.UNRECOGNIZED;
        }
        return a2;
    }

    @Override
    public int getEntriesCount() {
        yl a2;
        return a2.entries_.size();
    }

    public static yl J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return yl.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(yl yl2, int n2, Kk kk2) {
        void b2;
        yl c2 = kk2;
        yl a2 = yl2;
        a2.J((int)b2, (Kk)c2);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.layer_ = uSa.E;
    }

    @Override
    public int getLayerValue() {
        yl a2;
        return a2.layer_;
    }

    public static yl J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public List<? extends y> J() {
        yl a2;
        return a2.entries_;
    }

    public static yl J(InputStream a2) throws IOException {
        return yl.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(yl yl2, Pl pl2) {
        yl b2 = pl2;
        yl a2 = yl2;
        a2.J((Pl)b2);
    }

    private void J() {
        a.entries_ = yl.emptyProtobufList();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(yl yl2, int n2, Kk kk2) {
        void b2;
        yl c2 = kk2;
        yl a2 = yl2;
        a2.f((int)b2, (Kk)c2);
    }

    public static yl J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static yl J() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public Kk getEntries(int n2) {
        int b2 = n2;
        yl a2 = this;
        return (Kk)a2.entries_.get(b2);
    }

    @Override
    public boolean hasLayer() {
        yl a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(Pl pl2) {
        yl b2 = pl2;
        yl a2 = this;
        a2.layer_ = b2.getNumber();
        a2.bitField0_ |= vRa.d;
    }

    public static Parser<yl> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f(int n2) {
        yl a2;
        int b2 = n2;
        yl yl2 = a2 = this;
        yl2.l();
        yl2.entries_.remove(b2);
    }

    static {
        yl yl2;
        DEFAULT_INSTANCE = yl2 = new yl();
        GeneratedMessageLite.registerDefaultInstance(yl.class, yl2);
    }

    private void J(int n2) {
        int b2 = n2;
        yl a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.layer_ = b2;
    }

    public y J(int n2) {
        int b2 = n2;
        yl a2 = this;
        return (y)a2.entries_.get(b2);
    }

    @Override
    public List<Kk> getEntriesList() {
        yl a2;
        return a2.entries_;
    }

    public static yl J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static yl J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static yl J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, Kk kk2) {
        void b2;
        yl c2 = kk2;
        yl a2 = this;
        c2.getClass();
        yl yl2 = a2;
        yl2.l();
        yl2.entries_.set((int)b2, (Kk)c2);
    }

    public static nk J(yl a2) {
        return (nk)DEFAULT_INSTANCE.createBuilder(a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Kk kk2) {
        void b2;
        yl c2 = kk2;
        yl a2 = this;
        c2.getClass();
        yl yl2 = a2;
        yl2.l();
        yl2.entries_.add((int)b2, (Kk)c2);
    }

    public static /* synthetic */ void J(yl a2) {
        a2.f();
    }

    private yl() {
        yl a2;
    }
}

