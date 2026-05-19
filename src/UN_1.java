/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  CB
 *  ERa
 *  NTa
 *  SOa
 *  UN
 *  URa
 *  Usa
 *  WN
 *  XSa
 *  XTa
 *  Ypa
 *  Zua
 *  aPa
 *  aqa
 *  cQa
 *  kpa
 *  lqa
 *  pPa
 *  pqa
 *  vRa
 *  wOa
 *  xM
 *  zA
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
public final class UN_1
extends GeneratedMessageLite<UN, eM>
implements zA {
    private Internal.ProtobufList<xM> hover_;
    private int editEasing_;
    public static final int EDITDURATION_FIELD_NUMBER = 3;
    private Internal.ProtobufList<xM> visibleStart_;
    public static final int VISIBLEFINISH_FIELD_NUMBER = 7;
    public static final int VISIBLESTART_FIELD_NUMBER = 6;
    public static final int EDITEASINGEXPR_FIELD_NUMBER = 12;
    public static final int BOTH_FIELD_NUMBER = 11;
    private static volatile Parser<UN> PARSER;
    private Internal.ProtobufList<xM> start_ = UN_1.emptyProtobufList();
    private static final UN DEFAULT_INSTANCE;
    private Internal.ProtobufList<xM> both_;
    private Internal.ProtobufList<xM> hoverFinish_;
    private String editEasingExpr_;
    public static final int VISIBLE_FIELD_NUMBER = 5;
    public static final int HOVERSTART_FIELD_NUMBER = 9;
    private Internal.ProtobufList<xM> hoverStart_;
    public static final int EDITEASING_FIELD_NUMBER = 4;
    public static final int HOVERFINISH_FIELD_NUMBER = 10;
    private Internal.ProtobufList<xM> visible_;
    private int bitField0_;
    public static final int FINISH_FIELD_NUMBER = 2;
    private Internal.ProtobufList<xM> visibleFinish_;
    private int editDuration_;
    public static final int HOVER_FIELD_NUMBER = 8;
    private Internal.ProtobufList<xM> finish_ = UN_1.emptyProtobufList();
    public static final int START_FIELD_NUMBER = 1;

    private void B() {
        a.visible_ = UN_1.emptyProtobufList();
    }

    public xM getHover(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.hover_.get(b2);
    }

    public int getBothCount() {
        UN_1 a2;
        return a2.both_.size();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void a(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.M((int)b2, (xM)c2);
    }

    public static UN J(ByteString a2) throws InvalidProtocolBufferException {
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void A(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.d();
        AbstractMessageLite.addAll(b2, uN_1.hoverStart_);
    }

    private void L() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.hover_;
        if (!a2.isModifiable()) {
            uN_1.hover_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void A(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.C((Iterable<? extends xM>)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.g();
        uN_1.finish_.set((int)b2, (xM)c2);
    }

    public int getVisibleStartCount() {
        UN_1 a2;
        return a2.visibleStart_.size();
    }

    public xM getStart(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.start_.get(b2);
    }

    public List<xM> getVisibleStartList() {
        UN_1 a2;
        return a2.visibleStart_;
    }

    public static Parser<UN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /*
     * WARNING - void declaration
     */
    private void H(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.M();
        uN_1.hoverFinish_.set((int)b2, (xM)c2);
    }

    public static /* synthetic */ void k(UN a2) {
        super.F();
    }

    /*
     * WARNING - void declaration
     */
    private void g(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.b();
        uN_1.visibleStart_.set((int)b2, (xM)c2);
    }

    public List<xM> getStartList() {
        UN_1 a2;
        return a2.start_;
    }

    private void i(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.b();
        AbstractMessageLite.addAll(b2, uN_1.visibleStart_);
    }

    public ByteString getEditEasingExprBytes() {
        UN_1 a2;
        return ByteString.copyFromUtf8(a2.editEasingExpr_);
    }

    private void b() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.visibleStart_;
        if (!a2.isModifiable()) {
            uN_1.visibleStart_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void A(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.f((xM)b2);
    }

    public static /* synthetic */ UN f() {
        return DEFAULT_INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private void I(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.A();
        uN_1.visible_.set((int)b2, (xM)c2);
    }

    public static /* synthetic */ void G(UN a2) {
        super.f();
    }

    public int getVisibleFinishCount() {
        UN_1 a2;
        return a2.visibleFinish_.size();
    }

    public static /* synthetic */ void G(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.A(b2);
    }

    public static UN J(byte[] a2) throws InvalidProtocolBufferException {
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void i(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.i((xM)b2);
    }

    public CB A(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.finish_.get(b2);
    }

    private void A(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.I();
        uN_1.start_.add((xM)b2);
    }

    public xM getHoverStart(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.hoverStart_.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void j(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.A();
        uN_1.visible_.add((int)b2, (xM)c2);
    }

    public static UN J(CodedInputStream a2) throws IOException {
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public List<? extends CB> A() {
        UN_1 a2;
        return a2.hover_;
    }

    private void J(WN wN2) {
        UN_1 b2 = wN2;
        UN_1 a2 = this;
        a2.editEasing_ = b2.getNumber();
        a2.bitField0_ |= uqa.g;
    }

    /*
     * WARNING - void declaration
     */
    private void F(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.d();
        uN_1.hoverStart_.set((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void H(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.a((int)b2, (xM)c2);
    }

    private void i(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.H();
        uN_1.visibleFinish_.add((xM)b2);
    }

    public static /* synthetic */ void M(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.A((xM)b2);
    }

    private void M(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.M();
        uN_1.hoverFinish_.add((xM)b2);
    }

    public static /* synthetic */ void D(UN a2) {
        super.k();
    }

    public static /* synthetic */ void i(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.A((Iterable<? extends xM>)b2);
    }

    private void M(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.J();
        AbstractMessageLite.addAll(b2, uN_1.both_);
    }

    public List<? extends CB> i() {
        UN_1 a2;
        return a2.hoverFinish_;
    }

    private void G(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.b();
        uN_1.visibleStart_.remove(b2);
    }

    public static UN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getVisibleCount() {
        UN_1 a2;
        return a2.visible_.size();
    }

    private void e(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.L();
        AbstractMessageLite.addAll(b2, uN_1.hover_);
    }

    public static UN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public CB i(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.hover_.get(b2);
    }

    public CB M(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.hoverFinish_.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void g(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.H((int)b2, (xM)c2);
    }

    private void a() {
        a.hover_ = UN_1.emptyProtobufList();
    }

    private void D(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.editDuration_ = b2;
    }

    public static /* synthetic */ void e(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.l((xM)b2);
    }

    public static /* synthetic */ void D(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.M(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void I(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.D((int)b2, (xM)c2);
    }

    public static /* synthetic */ void A(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.l(b2);
    }

    private void H() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.visibleFinish_;
        if (!a2.isModifiable()) {
            uN_1.visibleFinish_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void A(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.I();
        uN_1.start_.remove(b2);
    }

    private void d(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.A();
        AbstractMessageLite.addAll(b2, uN_1.visible_);
    }

    public static /* synthetic */ void i(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.i(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void k(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.H();
        uN_1.visibleFinish_.add((int)b2, (xM)c2);
    }

    private void g() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.finish_;
        if (!a2.isModifiable()) {
            uN_1.finish_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public xM getBoth(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.both_.get(b2);
    }

    public static /* synthetic */ void d(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.J((xM)b2);
    }

    public String getEditEasingExpr() {
        UN_1 a2;
        return a2.editEasingExpr_;
    }

    public static /* synthetic */ void A(UN a2) {
        super.G();
    }

    private void I() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.start_;
        if (!a2.isModifiable()) {
            uN_1.start_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public boolean hasEditEasingExpr() {
        UN_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static UN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void i(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.editEasing_ = b2;
    }

    private void e(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.b();
        uN_1.visibleStart_.add((xM)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void G(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.L();
        uN_1.hover_.set((int)b2, (xM)c2);
    }

    private void j() {
        a.start_ = UN_1.emptyProtobufList();
    }

    public List<xM> getHoverStartList() {
        UN_1 a2;
        return a2.hoverStart_;
    }

    public List<xM> getHoverList() {
        UN_1 a2;
        return a2.hover_;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void j(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.F((int)b2, (xM)c2);
    }

    public List<xM> getFinishList() {
        UN_1 a2;
        return a2.finish_;
    }

    public int getEditDuration() {
        UN_1 a2;
        return a2.editDuration_;
    }

    public static /* synthetic */ void C(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.e((xM)b2);
    }

    public static UN J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void i(UN a2) {
        super.e();
    }

    public List<? extends CB> M() {
        UN_1 a2;
        return a2.visibleFinish_;
    }

    private void F() {
        a.visibleStart_ = UN_1.emptyProtobufList();
    }

    public int getFinishCount() {
        UN_1 a2;
        return a2.finish_.size();
    }

    public List<? extends CB> e() {
        UN_1 a2;
        return a2.visibleStart_;
    }

    public static /* synthetic */ void M(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.f(b2);
    }

    public List<? extends CB> d() {
        UN_1 a2;
        return a2.both_;
    }

    public List<xM> getHoverFinishList() {
        UN_1 a2;
        return a2.hoverFinish_;
    }

    public static /* synthetic */ void l(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.d((xM)b2);
    }

    public xM getHoverFinish(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.hoverFinish_.get(b2);
    }

    private void d(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.A();
        uN_1.visible_.add((xM)b2);
    }

    private void k() {
        a.finish_ = UN_1.emptyProtobufList();
    }

    public boolean hasEditEasing() {
        UN_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.e(b2);
    }

    public List<? extends CB> C() {
        UN_1 a2;
        return a2.hoverStart_;
    }

    private void G() {
        a.hoverStart_ = UN_1.emptyProtobufList();
    }

    public xM getVisible(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.visible_.get(b2);
    }

    public CB e(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.hoverStart_.get(b2);
    }

    private void D() {
        a.bitField0_ &= rQa.p;
        a.editDuration_ = uSa.E;
    }

    public static UN f(InputStream a2) throws IOException {
        return (UN_1)UN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void F(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.e((int)b2, (xM)c2);
    }

    public CB d(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.visible_.get(b2);
    }

    public int getStartCount() {
        UN_1 a2;
        return a2.start_.size();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void k(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.G((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void G(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.J((int)b2, (xM)c2);
    }

    public List<xM> getVisibleFinishList() {
        UN_1 a2;
        return a2.visibleFinish_;
    }

    public static /* synthetic */ void J(UN uN, ByteString byteString) {
        Object b2 = byteString;
        UN a2 = uN;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void M(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.M((Iterable<? extends xM>)b2);
    }

    private void A() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.visible_;
        if (!a2.isModifiable()) {
            uN_1.visible_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void i() {
        a.bitField0_ &= ERa.Ka;
        a.editEasing_ = uSa.E;
    }

    public static /* synthetic */ void e(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.l((Iterable<? extends xM>)b2);
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
        UN_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new UN_1();
            }
            case 2: {
                return new eM(null);
            }
            case 3: {
                Object[] objectArray = new Object[cQa.o];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = URa.G;
                objectArray[uqa.g] = xM.class;
                objectArray[yRa.d] = XSa.M;
                objectArray[AQa.P] = xM.class;
                objectArray[tTa.h] = rpa.u;
                objectArray[uua.p] = lQa.c;
                objectArray[XTa.W] = ZSa.Ia;
                objectArray[Yqa.i] = xM.class;
                objectArray[WOa.fa] = zua.y;
                objectArray[NTa.C] = xM.class;
                objectArray[pPa.f] = aPa.c;
                objectArray[lqa.s] = xM.class;
                objectArray[uua.s] = tpa.g;
                objectArray[hpa.Z] = xM.class;
                objectArray[Ypa.A] = Zua.Ha;
                objectArray[ERa.C] = xM.class;
                objectArray[yta.Ka] = aqa.n;
                objectArray[yOa.B] = xM.class;
                objectArray[wOa.t] = Usa.v;
                objectArray[kTa.j] = xM.class;
                objectArray[wOa.h] = pqa.ca;
                d2 = objectArray;
                Object b2 = SOa.Ka;
                return UN_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = UN_1.class;
                synchronized (UN_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<UN>(DEFAULT_INSTANCE);
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
    public static /* synthetic */ void D(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.A((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void A(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.f((int)b2, (xM)c2);
    }

    private void M() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.hoverFinish_;
        if (!a2.isModifiable()) {
            uN_1.hoverFinish_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        UN_1 a2 = this;
        UN_1.checkByteStringIsUtf8(b2);
        a2.editEasingExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= AQa.P;
    }

    public static UN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (UN_1)UN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void D(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.I();
        uN_1.start_.set((int)b2, (xM)c2);
    }

    public static UN J(InputStream a2) throws IOException {
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasEditDuration() {
        UN_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void e() {
        a.visibleFinish_ = UN_1.emptyProtobufList();
    }

    private void C(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.L();
        uN_1.hover_.add((xM)b2);
    }

    private void d() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.hoverStart_;
        if (!a2.isModifiable()) {
            uN_1.hoverStart_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void J(String string) {
        String b2 = string;
        UN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= AQa.P;
        a2.editEasingExpr_ = b2;
    }

    public static /* synthetic */ void M(UN a2) {
        super.C();
    }

    public List<? extends CB> l() {
        UN_1 a2;
        return a2.finish_;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void i(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.I((int)b2, (xM)c2);
    }

    public static /* synthetic */ void d(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.i((Iterable<? extends xM>)b2);
    }

    private void M(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.J();
        uN_1.both_.remove(b2);
    }

    public static /* synthetic */ void C(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.J((Iterable<? extends xM>)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void M(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.l((int)b2, (xM)c2);
    }

    private void C(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.M();
        AbstractMessageLite.addAll(b2, uN_1.hoverFinish_);
    }

    public CB C(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.visibleStart_.get(b2);
    }

    public xM getVisibleFinish(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.visibleFinish_.get(b2);
    }

    public xM getFinish(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.finish_.get(b2);
    }

    private void C() {
        a.hoverFinish_ = UN_1.emptyProtobufList();
    }

    public static /* synthetic */ void e(UN a2) {
        super.a();
    }

    public int getEditEasingValue() {
        UN_1 a2;
        return a2.editEasing_;
    }

    public List<? extends CB> f() {
        UN_1 a2;
        return a2.visible_;
    }

    public int getHoverCount() {
        UN_1 a2;
        return a2.hover_.size();
    }

    private void e(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.H();
        uN_1.visibleFinish_.remove(b2);
    }

    private UN_1() {
        UN_1 a2;
        a2.both_ = UN_1.emptyProtobufList();
        a2.editEasingExpr_ = Mqa.y;
        a2.visible_ = UN_1.emptyProtobufList();
        a2.visibleStart_ = UN_1.emptyProtobufList();
        a2.visibleFinish_ = UN_1.emptyProtobufList();
        a2.hover_ = UN_1.emptyProtobufList();
        a2.hoverStart_ = UN_1.emptyProtobufList();
        a2.hoverFinish_ = UN_1.emptyProtobufList();
    }

    static {
        UN_1 uN_1 = new UN_1();
        DEFAULT_INSTANCE = uN_1;
        GeneratedMessageLite.registerDefaultInstance(UN_1.class, uN_1);
    }

    private void l() {
        a.bitField0_ &= kpa.w;
        a.editEasingExpr_ = UN_1.J().getEditEasingExpr();
    }

    public static /* synthetic */ void d(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void A(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.I();
        uN_1.start_.add((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void i(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.M();
        uN_1.hoverFinish_.add((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void M(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.b();
        uN_1.visibleStart_.add((int)b2, (xM)c2);
    }

    private void l(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.H();
        AbstractMessageLite.addAll(b2, uN_1.visibleFinish_);
    }

    public static /* synthetic */ void C(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.d(b2);
    }

    public static /* synthetic */ void l(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.D(b2);
    }

    public static /* synthetic */ void d(UN a2) {
        super.l();
    }

    public static /* synthetic */ void f(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.M((xM)b2);
    }

    public static /* synthetic */ void J(UN uN, xM xM2) {
        UN b2 = xM2;
        UN a2 = uN;
        super.C((xM)b2);
    }

    public static /* synthetic */ void f(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.G(b2);
    }

    public xM getVisibleStart(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (xM)a2.visibleStart_.get(b2);
    }

    public static /* synthetic */ void J(UN uN, WN wN2) {
        UN b2 = wN2;
        UN a2 = uN;
        super.J((WN)b2);
    }

    public static /* synthetic */ void C(UN a2) {
        super.B();
    }

    /*
     * WARNING - void declaration
     */
    private void e(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.H();
        uN_1.visibleFinish_.set((int)b2, (xM)c2);
    }

    private void d(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.g();
        uN_1.finish_.remove(b2);
    }

    public int getHoverFinishCount() {
        UN_1 a2;
        return a2.hoverFinish_.size();
    }

    public static /* synthetic */ void l(UN a2) {
        super.j();
    }

    public static eM J(UN a2) {
        return (eM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void C(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.M();
        uN_1.hoverFinish_.remove(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void d(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.d();
        uN_1.hoverStart_.add((int)b2, (xM)c2);
    }

    public List<xM> getVisibleList() {
        UN_1 a2;
        return a2.visible_;
    }

    private void f(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.I();
        AbstractMessageLite.addAll(b2, uN_1.start_);
    }

    public static /* synthetic */ void l(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.e((Iterable<? extends xM>)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.J();
        uN_1.both_.set((int)b2, (xM)c2);
    }

    public WN getEditEasing() {
        UN_1 uN_1 = this;
        UN_1 a2 = WN.forNumber((int)uN_1.editEasing_);
        if (a2 == null) {
            return WN.UNRECOGNIZED;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private void l(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.g();
        uN_1.finish_.add((int)b2, (xM)c2);
    }

    public int getHoverStartCount() {
        UN_1 a2;
        return a2.hoverStart_.size();
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.J();
        uN_1.both_.add((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void e(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.d((int)b2, (xM)c2);
    }

    public CB l(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.visibleFinish_.get(b2);
    }

    public static /* synthetic */ void J(UN uN, int n2) {
        int b2 = n2;
        UN a2 = uN;
        super.C(b2);
    }

    public static UN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public CB f(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.start_.get(b2);
    }

    public static /* synthetic */ void f(UN a2) {
        super.D();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void d(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.g((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void C(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.C((int)b2, (xM)c2);
    }

    private void f() {
        a.both_ = UN_1.emptyProtobufList();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void l(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.j((int)b2, (xM)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, xM xM2) {
        void b2;
        UN_1 c2 = xM2;
        UN_1 a2 = this;
        c2.getClass();
        UN_1 uN_1 = a2;
        uN_1.L();
        uN_1.hover_.add((int)b2, (xM)c2);
    }

    private void J() {
        UN_1 uN_1 = this;
        Internal.ProtobufList<xM> a2 = uN_1.both_;
        if (!a2.isModifiable()) {
            uN_1.both_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void l(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.d();
        uN_1.hoverStart_.remove(b2);
    }

    private void f(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.A();
        uN_1.visible_.remove(b2);
    }

    public static /* synthetic */ void f(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.d((Iterable<? extends xM>)b2);
    }

    public CB J(int n2) {
        int b2 = n2;
        UN_1 a2 = this;
        return (CB)a2.both_.get(b2);
    }

    public static /* synthetic */ void J(UN uN, Iterable iterable) {
        Object b2 = iterable;
        UN a2 = uN;
        super.f((Iterable<? extends xM>)b2);
    }

    public static eM J() {
        return (eM)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(int n2) {
        UN_1 a2;
        int b2 = n2;
        UN_1 uN_1 = a2 = this;
        uN_1.L();
        uN_1.hover_.remove(b2);
    }

    private void l(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.d();
        uN_1.hoverStart_.add((xM)b2);
    }

    public List<xM> getBothList() {
        UN_1 a2;
        return a2.both_;
    }

    public static /* synthetic */ void J(UN a2) {
        super.i();
    }

    private void f(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.g();
        uN_1.finish_.add((xM)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.k((int)b2, (xM)c2);
    }

    public static UN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(xM xM2) {
        UN_1 b2 = xM2;
        UN_1 a2 = this;
        b2.getClass();
        UN_1 uN_1 = a2;
        uN_1.J();
        uN_1.both_.add((xM)b2);
    }

    public List<? extends CB> J() {
        UN_1 a2;
        return a2.start_;
    }

    private void J(Iterable<? extends xM> iterable) {
        UN_1 a2;
        Iterable<? extends xM> b2 = iterable;
        UN_1 uN_1 = a2 = this;
        uN_1.g();
        AbstractMessageLite.addAll(b2, uN_1.finish_);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(UN uN, int n2, xM xM2) {
        void b2;
        UN c2 = xM2;
        UN a2 = uN;
        super.i((int)b2, (xM)c2);
    }

    public static UN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (UN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(UN uN, String string) {
        Object b2 = string;
        UN a2 = uN;
        super.J((String)b2);
    }
}

