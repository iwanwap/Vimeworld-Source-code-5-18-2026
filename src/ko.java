/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Ia
 *  NQa
 *  NTa
 *  SN
 *  Tm
 *  Ua
 *  Uqa
 *  Vm
 *  XM
 *  XTa
 *  kpa
 *  lqa
 *  nQa
 *  pPa
 *  pqa
 *  uQa
 *  vRa
 *  ysa
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
public final class ko
extends GeneratedMessageLite<ko, Vm>
implements Ua {
    public static final int DEFAULTSTARTANIMATIONDURATION_FIELD_NUMBER = 3;
    private String id_ = Mqa.y;
    private ByteString closeCallback_;
    private int bitField0_;
    public static final int CLOSEONINVENTORYKEY_FIELD_NUMBER = 8;
    public static final int BEHAVIOR_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private int defaultStartAnimationDuration_;
    public static final int KEYBINDINGS_FIELD_NUMBER = 10;
    private boolean closeOnEsc_;
    public static final int ELEMENTS_FIELD_NUMBER = 2;
    public static final int DEFAULTBACKGROUND_FIELD_NUMBER = 6;
    private static volatile Parser<ko> PARSER;
    private Internal.ProtobufList<XM> elements_ = ko.emptyProtobufList();
    private xm behavior_;
    private boolean closeOnInventoryKey_;
    private static final ko DEFAULT_INSTANCE;
    public static final int DEFAULTFINISHANIMATIONDURATION_FIELD_NUMBER = 4;
    private Internal.ProtobufList<SN> keyBindings_;
    public static final int CLOSEONESC_FIELD_NUMBER = 7;
    private int defaultFinishAnimationDuration_;
    private boolean defaultBackground_;
    public static final int CLOSECALLBACK_FIELD_NUMBER = 9;

    public static /* synthetic */ void f(ko ko2, Iterable iterable) {
        Iterable b2 = iterable;
        ko a2 = ko2;
        a2.f(b2);
    }

    public static ko J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(ko ko2, boolean bl) {
        boolean b2 = bl;
        ko a2 = ko2;
        a2.l(b2);
    }

    public static Vm J(ko a2) {
        return (Vm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void k() {
        a.bitField0_ &= fta.fa;
        a.closeOnInventoryKey_ = uSa.E;
    }

    private void G() {
        a.elements_ = ko.emptyProtobufList();
    }

    private void C(int n2) {
        ko a2;
        int b2 = n2;
        ko ko2 = a2 = this;
        ko2.e();
        ko2.keyBindings_.remove(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(ko ko2, int n2, SN sN2) {
        void b2;
        ko c2 = sN2;
        ko a2 = ko2;
        a2.J((int)b2, (SN)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(ko ko2, int n2, XM xM) {
        void b2;
        ko c2 = xM;
        ko a2 = ko2;
        a2.J((int)b2, (XM)c2);
    }

    public static Vm J() {
        return (Vm)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void D(ko a2) {
        a2.M();
    }

    private ko() {
        ko a2;
        a2.closeCallback_ = ByteString.EMPTY;
        a2.keyBindings_ = ko.emptyProtobufList();
    }

    public static ko J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public boolean hasDefaultFinishAnimationDuration() {
        ko a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(xm xm2) {
        ko ko2;
        GeneratedMessageLite b2 = xm2;
        ko a2 = this;
        b2.getClass();
        if (a2.behavior_ != null && a2.behavior_ != xm.f()) {
            a2.behavior_ = (xm)((Tm)xm.J(a2.behavior_).mergeFrom(b2)).buildPartial();
            ko2 = a2;
        } else {
            ko2 = a2;
            a2.behavior_ = b2;
        }
        ko2.bitField0_ |= AQa.P;
    }

    public static /* synthetic */ void f(ko ko2, boolean bl) {
        boolean b2 = bl;
        ko a2 = ko2;
        a2.J(b2);
    }

    private void l(int n2) {
        int b2 = n2;
        ko a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.defaultFinishAnimationDuration_ = b2;
    }

    public static /* synthetic */ void A(ko a2) {
        a2.A();
    }

    public static /* synthetic */ void i(ko a2) {
        a2.f();
    }

    public static /* synthetic */ void f(ko ko2, xm xm2) {
        GeneratedMessageLite b2 = xm2;
        ko a2 = ko2;
        a2.J((xm)b2);
    }

    public static /* synthetic */ void J(ko ko2, SN sN2) {
        ko b2 = sN2;
        ko a2 = ko2;
        a2.J((SN)b2);
    }

    public boolean getDefaultBackground() {
        ko a2;
        return a2.defaultBackground_;
    }

    public static ko f(InputStream a2) throws IOException {
        return ko.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static ko f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public Ia J(int n2) {
        int b2 = n2;
        ko a2 = this;
        return (Ia)a2.keyBindings_.get(b2);
    }

    public static /* synthetic */ void J(ko ko2, boolean bl) {
        boolean b2 = bl;
        ko a2 = ko2;
        a2.f(b2);
    }

    private void D() {
        a.id_ = ko.J().getId();
    }

    public boolean hasBehavior() {
        ko a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        ko a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.closeOnInventoryKey_ = b2;
    }

    public static /* synthetic */ void M(ko a2) {
        a2.G();
    }

    private void A() {
        a.bitField0_ &= rQa.p;
        a.defaultStartAnimationDuration_ = uSa.E;
    }

    public boolean hasCloseCallback() {
        ko a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
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
        ko c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new ko();
            }
            case 2: {
                return new Vm(null);
            }
            case 3: {
                Object[] objectArray = new Object[uua.s];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = nQa.i;
                objectArray[yRa.d] = XM.class;
                objectArray[AQa.P] = Uqa.k;
                objectArray[tTa.h] = vTa.w;
                objectArray[uua.p] = rSa.V;
                objectArray[XTa.W] = TOa.w;
                objectArray[Yqa.i] = pqa.t;
                objectArray[WOa.fa] = rSa.s;
                objectArray[NTa.C] = nOa.o;
                objectArray[pPa.f] = xSa.U;
                objectArray[lqa.s] = SN.class;
                d2 = objectArray;
                Object b2 = fqa.Ja;
                return ko.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = ko.class;
                synchronized (ko.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<ko>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ ko f() {
        return DEFAULT_INSTANCE;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        ko a2 = this;
        b2.getClass();
        a2.bitField0_ |= ysa.s;
        a2.closeCallback_ = b2;
    }

    public static /* synthetic */ void J(ko ko2, Iterable iterable) {
        Iterable b2 = iterable;
        ko a2 = ko2;
        a2.J(b2);
    }

    public static /* synthetic */ void e(ko a2) {
        a2.C();
    }

    public static ko J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getCloseCallback() {
        ko a2;
        return a2.closeCallback_;
    }

    private void J(XM xM) {
        ko b2 = xM;
        ko a2 = this;
        b2.getClass();
        ko ko2 = a2;
        ko2.i();
        ko2.elements_.add((XM)b2);
    }

    public static /* synthetic */ void J(ko ko2, xm xm2) {
        GeneratedMessageLite b2 = xm2;
        ko a2 = ko2;
        a2.f((xm)b2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        ko a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.defaultBackground_ = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, SN sN2) {
        void b2;
        ko c2 = sN2;
        ko a2 = this;
        c2.getClass();
        ko ko2 = a2;
        ko2.e();
        ko2.keyBindings_.set((int)b2, (SN)c2);
    }

    public static /* synthetic */ void C(ko ko2, int n2) {
        int b2 = n2;
        ko a2 = ko2;
        a2.l(b2);
    }

    public xm getBehavior() {
        ko a2;
        if (a2.behavior_ == null) {
            return xm.f();
        }
        return a2.behavior_;
    }

    public List<? extends va> f() {
        ko a2;
        return a2.elements_;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        ko a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.closeOnEsc_ = b2;
    }

    public static /* synthetic */ void J(ko ko2, String string) {
        String b2 = string;
        ko a2 = ko2;
        a2.J(b2);
    }

    public static /* synthetic */ void d(ko a2) {
        a2.d();
    }

    public ByteString getIdBytes() {
        ko a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static ko J() {
        return DEFAULT_INSTANCE;
    }

    public va J(int n2) {
        int b2 = n2;
        ko a2 = this;
        return (va)a2.elements_.get(b2);
    }

    public int getDefaultFinishAnimationDuration() {
        ko a2;
        return a2.defaultFinishAnimationDuration_;
    }

    private void f(int n2) {
        int b2 = n2;
        ko a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.defaultStartAnimationDuration_ = b2;
    }

    public static ko J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return ko.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getElementsCount() {
        ko a2;
        return a2.elements_.size();
    }

    public int getDefaultStartAnimationDuration() {
        ko a2;
        return a2.defaultStartAnimationDuration_;
    }

    public String getId() {
        ko a2;
        return a2.id_;
    }

    public boolean hasDefaultBackground() {
        ko a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void i() {
        ko ko2 = this;
        Internal.ProtobufList<XM> a2 = ko2.elements_;
        if (!a2.isModifiable()) {
            ko2.elements_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        ko a2 = this;
        Object object = b2;
        ko.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    public List<? extends Ia> J() {
        ko a2;
        return a2.keyBindings_;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, XM xM) {
        void b2;
        ko c2 = xM;
        ko a2 = this;
        c2.getClass();
        ko ko2 = a2;
        ko2.i();
        ko2.elements_.set((int)b2, (XM)c2);
    }

    public SN getKeyBindings(int n2) {
        int b2 = n2;
        ko a2 = this;
        return (SN)a2.keyBindings_.get(b2);
    }

    private void M() {
        a.bitField0_ &= VPa.A;
        a.closeCallback_ = ko.J().getCloseCallback();
    }

    public static /* synthetic */ void l(ko ko2, int n2) {
        int b2 = n2;
        ko a2 = ko2;
        a2.C(b2);
    }

    private void J(SN sN2) {
        ko b2 = sN2;
        ko a2 = this;
        b2.getClass();
        ko ko2 = a2;
        ko2.e();
        ko2.keyBindings_.add((SN)b2);
    }

    private void J(xm xm2) {
        GeneratedMessageLite b2 = xm2;
        ko a2 = this;
        b2.getClass();
        a2.behavior_ = b2;
        a2.bitField0_ |= AQa.P;
    }

    public static /* synthetic */ void f(ko ko2, ByteString byteString) {
        ByteString b2 = byteString;
        ko a2 = ko2;
        a2.f(b2);
    }

    public XM getElements(int n2) {
        int b2 = n2;
        ko a2 = this;
        return (XM)a2.elements_.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, XM xM) {
        void b2;
        ko c2 = xM;
        ko a2 = this;
        c2.getClass();
        ko ko2 = a2;
        ko2.i();
        ko2.elements_.add((int)b2, (XM)c2);
    }

    public static Parser<ko> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void e() {
        ko ko2 = this;
        Internal.ProtobufList<SN> a2 = ko2.keyBindings_;
        if (!a2.isModifiable()) {
            ko2.keyBindings_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void d() {
        a.bitField0_ &= NQa.A;
        a.closeOnEsc_ = uSa.E;
    }

    public static ko J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(ko a2) {
        a2.J();
    }

    private void J(int n2) {
        ko a2;
        int b2 = n2;
        ko ko2 = a2 = this;
        ko2.i();
        ko2.elements_.remove(b2);
    }

    static {
        ko ko2;
        DEFAULT_INSTANCE = ko2 = new ko();
        GeneratedMessageLite.registerDefaultInstance(ko.class, ko2);
    }

    public static /* synthetic */ void l(ko a2) {
        a2.k();
    }

    public boolean hasCloseOnEsc() {
        ko a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(ko ko2, ByteString byteString) {
        ByteString b2 = byteString;
        ko a2 = ko2;
        a2.J(b2);
    }

    public static ko J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ko J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(ko ko2, XM xM) {
        ko b2 = xM;
        ko a2 = ko2;
        a2.J((XM)b2);
    }

    public List<SN> getKeyBindingsList() {
        ko a2;
        return a2.keyBindings_;
    }

    public boolean hasCloseOnInventoryKey() {
        ko a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        a.behavior_ = null;
        a.bitField0_ &= kpa.w;
    }

    public static /* synthetic */ void f(ko a2) {
        a2.D();
    }

    private void f(Iterable<? extends SN> iterable) {
        ko a2;
        Iterable<? extends SN> b2 = iterable;
        ko ko2 = a2 = this;
        ko2.e();
        AbstractMessageLite.addAll(b2, ko2.keyBindings_);
    }

    public static /* synthetic */ void f(ko ko2, int n2) {
        int b2 = n2;
        ko a2 = ko2;
        a2.f(b2);
    }

    public static /* synthetic */ void J(ko ko2, int n2) {
        int b2 = n2;
        ko a2 = ko2;
        a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, SN sN2) {
        void b2;
        ko c2 = sN2;
        ko a2 = this;
        c2.getClass();
        ko ko2 = a2;
        ko2.e();
        ko2.keyBindings_.add((int)b2, (SN)c2);
    }

    private void J(Iterable<? extends XM> iterable) {
        ko a2;
        Iterable<? extends XM> b2 = iterable;
        ko ko2 = a2 = this;
        ko2.i();
        AbstractMessageLite.addAll(b2, ko2.elements_);
    }

    public boolean getCloseOnEsc() {
        ko a2;
        return a2.closeOnEsc_;
    }

    private void l() {
        a.keyBindings_ = ko.emptyProtobufList();
    }

    public static ko J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.bitField0_ &= Jra.Fa;
        a.defaultBackground_ = uSa.E;
    }

    public static /* synthetic */ void J(ko a2) {
        a2.l();
    }

    private void J(String string) {
        String b2 = string;
        ko a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    public boolean hasDefaultStartAnimationDuration() {
        ko a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean getCloseOnInventoryKey() {
        ko a2;
        return a2.closeOnInventoryKey_;
    }

    public static ko J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(ko ko2, int n2, SN sN2) {
        void b2;
        ko c2 = sN2;
        ko a2 = ko2;
        a2.f((int)b2, (SN)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(ko ko2, int n2, XM xM) {
        void b2;
        ko c2 = xM;
        ko a2 = ko2;
        a2.f((int)b2, (XM)c2);
    }

    public List<XM> getElementsList() {
        ko a2;
        return a2.elements_;
    }

    public int getKeyBindingsCount() {
        ko a2;
        return a2.keyBindings_.size();
    }

    public static ko J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.defaultFinishAnimationDuration_ = uSa.E;
    }
}

