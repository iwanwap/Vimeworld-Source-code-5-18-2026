/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ON
 *  XM
 *  isa
 *  lqa
 *  nQa
 *  nk
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
public final class ON_1
extends GeneratedMessageLite<ON, cO>
implements Ib {
    public static final int ELEMENTS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<XM> elements_ = ON_1.emptyProtobufList();
    private static final ON DEFAULT_INSTANCE;
    private static volatile Parser<ON> PARSER;
    private int bitField0_;
    public static final int VISIBILITY_FIELD_NUMBER = 2;
    private yl visibility_;

    public static ON J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public XM getElements(int n2) {
        int b2 = n2;
        ON_1 a2 = this;
        return (XM)a2.elements_.get(b2);
    }

    private void J(XM xM) {
        ON_1 b2 = xM;
        ON_1 a2 = this;
        b2.getClass();
        ON_1 oN_1 = a2;
        oN_1.J();
        oN_1.elements_.add((XM)b2);
    }

    private void l() {
        a.elements_ = ON_1.emptyProtobufList();
    }

    private void f(yl yl2) {
        GeneratedMessageLite b2 = yl2;
        ON_1 a2 = this;
        b2.getClass();
        a2.visibility_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static ON J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(ON oN2, int n2, XM xM) {
        void b2;
        ON c2 = xM;
        ON a2 = oN2;
        super.J((int)b2, (XM)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, XM xM) {
        void b2;
        ON_1 c2 = xM;
        ON_1 a2 = this;
        c2.getClass();
        ON_1 oN_1 = a2;
        oN_1.J();
        oN_1.elements_.add((int)b2, (XM)c2);
    }

    private void f() {
        a.visibility_ = null;
        a.bitField0_ &= rQa.p;
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
        ON_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new ON_1();
            }
            case 2: {
                return new cO(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = nQa.i;
                objectArray[uqa.g] = XM.class;
                objectArray[yRa.d] = bsa.g;
                d2 = objectArray;
                Object b2 = isa.H;
                return ON_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = ON_1.class;
                synchronized (ON_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<ON>(DEFAULT_INSTANCE);
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

    public static ON f(InputStream a2) throws IOException {
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ON J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ON J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(ON oN2, Iterable iterable) {
        Object b2 = iterable;
        ON a2 = oN2;
        super.J((Iterable<? extends XM>)b2);
    }

    public static cO J(ON a2) {
        return (cO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(yl yl2) {
        ON_1 oN_1;
        GeneratedMessageLite b2 = yl2;
        ON_1 a2 = this;
        b2.getClass();
        if (a2.visibility_ != null && a2.visibility_ != yl.J()) {
            a2.visibility_ = (yl)((nk)yl.J(a2.visibility_).mergeFrom(b2)).buildPartial();
            oN_1 = a2;
        } else {
            oN_1 = a2;
            a2.visibility_ = b2;
        }
        oN_1.bitField0_ |= vRa.d;
    }

    public static Parser<ON> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        ON_1 oN_1 = new ON_1();
        DEFAULT_INSTANCE = oN_1;
        GeneratedMessageLite.registerDefaultInstance(ON_1.class, oN_1);
    }

    public static /* synthetic */ void f(ON a2) {
        super.l();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(ON oN2, int n2, XM xM) {
        void b2;
        ON c2 = xM;
        ON a2 = oN2;
        super.f((int)b2, (XM)c2);
    }

    public static ON J(ByteString a2) throws InvalidProtocolBufferException {
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(ON oN2, yl yl2) {
        Object b2 = yl2;
        ON a2 = oN2;
        super.f((yl)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, XM xM) {
        void b2;
        ON_1 c2 = xM;
        ON_1 a2 = this;
        c2.getClass();
        ON_1 oN_1 = a2;
        oN_1.J();
        oN_1.elements_.set((int)b2, (XM)c2);
    }

    public va J(int n2) {
        int b2 = n2;
        ON_1 a2 = this;
        return (va)a2.elements_.get(b2);
    }

    @Override
    public List<XM> getElementsList() {
        ON_1 a2;
        return a2.elements_;
    }

    private void J() {
        ON_1 oN_1 = this;
        Internal.ProtobufList<XM> a2 = oN_1.elements_;
        if (!a2.isModifiable()) {
            oN_1.elements_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void J(ON oN2, int n2) {
        int b2 = n2;
        ON a2 = oN2;
        super.J(b2);
    }

    private void J(Iterable<? extends XM> iterable) {
        ON_1 a2;
        Iterable<? extends XM> b2 = iterable;
        ON_1 oN_1 = a2 = this;
        oN_1.J();
        AbstractMessageLite.addAll(b2, oN_1.elements_);
    }

    private void J(int n2) {
        ON_1 a2;
        int b2 = n2;
        ON_1 oN_1 = a2 = this;
        oN_1.J();
        oN_1.elements_.remove(b2);
    }

    public static /* synthetic */ void J(ON oN2, XM xM) {
        ON b2 = xM;
        ON a2 = oN2;
        super.J((XM)b2);
    }

    public static ON J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public yl getVisibility() {
        ON_1 a2;
        if (a2.visibility_ == null) {
            return yl.J();
        }
        return a2.visibility_;
    }

    public static ON f() {
        return DEFAULT_INSTANCE;
    }

    public List<? extends va> J() {
        ON_1 a2;
        return a2.elements_;
    }

    public static /* synthetic */ ON J() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public boolean hasVisibility() {
        ON_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(ON a2) {
        super.f();
    }

    public static ON J(byte[] a2) throws InvalidProtocolBufferException {
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ON f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ON_1)ON_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ON J(CodedInputStream a2) throws IOException {
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getElementsCount() {
        ON_1 a2;
        return a2.elements_.size();
    }

    private ON_1() {
        ON_1 a2;
    }

    public static ON J(InputStream a2) throws IOException {
        return (ON_1)ON_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static cO J() {
        return (cO)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(ON oN2, yl yl2) {
        Object b2 = yl2;
        ON a2 = oN2;
        super.J((yl)b2);
    }

    public static ON J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ON_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

