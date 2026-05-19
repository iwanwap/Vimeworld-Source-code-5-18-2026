/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bsa
 *  In
 *  XM
 *  vRa
 *  wA
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
public final class in
extends GeneratedMessageLite<in, In>
implements wA {
    private Internal.ProtobufList<XM> element_ = in.emptyProtobufList();
    public static final int ELEMENT_FIELD_NUMBER = 1;
    private static final in DEFAULT_INSTANCE;
    private static volatile Parser<in> PARSER;

    private void J(XM xM) {
        in b2 = xM;
        in a2 = this;
        b2.getClass();
        in in2 = a2;
        in2.f();
        in2.element_.add((XM)b2);
    }

    public static /* synthetic */ void J(in in2, Iterable iterable) {
        Iterable b2 = iterable;
        in a2 = in2;
        a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, XM xM) {
        void b2;
        in c2 = xM;
        in a2 = this;
        c2.getClass();
        in in2 = a2;
        in2.f();
        in2.element_.set((int)b2, (XM)c2);
    }

    public static In J(in a2) {
        return (In)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        in in2;
        DEFAULT_INSTANCE = in2 = new in();
        GeneratedMessageLite.registerDefaultInstance(in.class, in2);
    }

    private void J(int n2) {
        in a2;
        int b2 = n2;
        in in2 = a2 = this;
        in2.f();
        in2.element_.remove(b2);
    }

    public static in J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static in J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(in in2, int n2) {
        int b2 = n2;
        in a2 = in2;
        a2.J(b2);
    }

    public List<? extends va> J() {
        in a2;
        return a2.element_;
    }

    public static in f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static in f(InputStream a2) throws IOException {
        return in.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static in J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static in J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static in J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(in in2, int n2, XM xM) {
        void b2;
        in c2 = xM;
        in a2 = in2;
        a2.f((int)b2, (XM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(in in2, int n2, XM xM) {
        void b2;
        in c2 = xM;
        in a2 = in2;
        a2.J((int)b2, (XM)c2);
    }

    public List<XM> getElementList() {
        in a2;
        return a2.element_;
    }

    private void f() {
        in in2 = this;
        Internal.ProtobufList<XM> a2 = in2.element_;
        if (!a2.isModifiable()) {
            in2.element_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static in J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<in> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static in J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return in.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.element_ = in.emptyProtobufList();
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
        in c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new in();
            }
            case 2: {
                return new In(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = tpa.S;
                objectArray[vRa.d] = XM.class;
                d2 = objectArray;
                Object b2 = Bsa.D;
                return in.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = in.class;
                synchronized (in.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<in>(DEFAULT_INSTANCE);
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

    public int getElementCount() {
        in a2;
        return a2.element_.size();
    }

    public static in J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static In J() {
        return (In)DEFAULT_INSTANCE.createBuilder();
    }

    public static in J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public va J(int n2) {
        int b2 = n2;
        in a2 = this;
        return (va)a2.element_.get(b2);
    }

    private void J(Iterable<? extends XM> iterable) {
        in a2;
        Iterable<? extends XM> b2 = iterable;
        in in2 = a2 = this;
        in2.f();
        AbstractMessageLite.addAll(b2, in2.element_);
    }

    public static in J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(in a2) {
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, XM xM) {
        void b2;
        in c2 = xM;
        in a2 = this;
        c2.getClass();
        in in2 = a2;
        in2.f();
        in2.element_.add((int)b2, (XM)c2);
    }

    public static /* synthetic */ in f() {
        return DEFAULT_INSTANCE;
    }

    public static in J() {
        return DEFAULT_INSTANCE;
    }

    public XM getElement(int n2) {
        int b2 = n2;
        in a2 = this;
        return (XM)a2.element_.get(b2);
    }

    public static /* synthetic */ void J(in in2, XM xM) {
        in b2 = xM;
        in a2 = in2;
        a2.J((XM)b2);
    }

    private in() {
        in a2;
    }
}

