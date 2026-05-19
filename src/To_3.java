/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  JQa
 *  Ma
 *  NQa
 *  NTa
 *  To
 *  WM
 *  XTa
 *  dQa
 *  eO
 *  hN
 *  hra
 *  kpa
 *  lPa
 *  lqa
 *  pPa
 *  pn
 *  qta
 *  s
 *  vQa
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
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class To_3
extends GeneratedMessageLite<To, hN>
implements Ma {
    public static final int MAXROWS_FIELD_NUMBER = 9;
    public static final int DRAWBACK_FIELD_NUMBER = 4;
    private int maxRows_;
    private String title_ = Mqa.y;
    public static final int FONT_FIELD_NUMBER = 10;
    public static final int ROWS_FIELD_NUMBER = 8;
    private int headingColor_;
    private int bitField0_;
    private Internal.ProtobufList<An> rows_;
    private boolean drawBack_;
    private static volatile Parser<To> PARSER;
    public static final int HEADINGCOLOR_FIELD_NUMBER = 3;
    public static final int ROWHOVERCOLOR_FIELD_NUMBER = 6;
    private int scrollbarColor_;
    public static final int SCROLLBARCOLOR_FIELD_NUMBER = 5;
    private int titleColor_;
    public static final int TITLECOLOR_FIELD_NUMBER = 2;
    private static final To DEFAULT_INSTANCE;
    public static final int TITLE_FIELD_NUMBER = 1;
    private pn font_;
    public static final int RADIUS_FIELD_NUMBER = 11;
    private int rowHoverColor_;
    private int radius_;
    private Internal.ProtobufList<WM> columns_ = To_3.emptyProtobufList();
    public static final int COLUMNS_FIELD_NUMBER = 7;

    public static /* synthetic */ void i(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.J(b2);
    }

    private void F() {
        a.bitField0_ &= Jra.Fa;
        a.drawBack_ = uSa.E;
    }

    public static /* synthetic */ void J(To to2, An an2) {
        Object b2 = an2;
        To a2 = to2;
        super.J((An)b2);
    }

    public int getMaxRows() {
        To_3 a2;
        return a2.maxRows_;
    }

    public static /* synthetic */ void G(To a2) {
        super.k();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(To to2, int n2, An an2) {
        void b2;
        Object c2 = an2;
        To a2 = to2;
        super.J((int)b2, (An)c2);
    }

    public int getRadius() {
        To_3 a2;
        return a2.radius_;
    }

    public static To J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void k() {
        a.bitField0_ &= ERa.Ka;
        a.titleColor_ = uSa.E;
    }

    public boolean hasTitleColor() {
        To_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void D(To a2) {
        super.i();
    }

    public pn getFont() {
        To_3 a2;
        if (a2.font_ == null) {
            return pn.J();
        }
        return a2.font_;
    }

    public static /* synthetic */ void M(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.d(b2);
    }

    public static /* synthetic */ void e(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.C(b2);
    }

    public Z J(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        return (Z)a2.columns_.get(b2);
    }

    private void G() {
        To_3 to_3 = this;
        Internal.ProtobufList<WM> a2 = to_3.columns_;
        if (!a2.isModifiable()) {
            to_3.columns_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public int getColumnsCount() {
        To_3 a2;
        return a2.columns_.size();
    }

    static {
        To_3 to_3 = new To_3();
        DEFAULT_INSTANCE = to_3;
        GeneratedMessageLite.registerDefaultInstance(To_3.class, to_3);
    }

    public List<? extends s> f() {
        To_3 a2;
        return a2.rows_;
    }

    private void D() {
        a.font_ = null;
        a.bitField0_ &= Bta.u;
    }

    public List<? extends Z> J() {
        To_3 a2;
        return a2.columns_;
    }

    public static /* synthetic */ void A(To a2) {
        super.f();
    }

    private void J(WM wM2) {
        To_3 b2 = wM2;
        To_3 a2 = this;
        b2.getClass();
        To_3 to_3 = a2;
        to_3.G();
        to_3.columns_.add((WM)b2);
    }

    private void i(int n2) {
        To_3 a2;
        int b2 = n2;
        To_3 to_3 = a2 = this;
        to_3.G();
        to_3.columns_.remove(b2);
    }

    public static To J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void f(To to2, pn pn2) {
        To b2 = pn2;
        To a2 = to2;
        super.J((pn)b2);
    }

    private void M(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.scrollbarColor_ = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, An an2) {
        void b2;
        GeneratedMessageLite c2 = an2;
        To_3 a2 = this;
        c2.getClass();
        To_3 to_3 = a2;
        to_3.e();
        to_3.rows_.add((int)b2, (An)c2);
    }

    public List<An> getRowsList() {
        To_3 a2;
        return a2.rows_;
    }

    private void A() {
        a.bitField0_ &= VPa.A;
        a.maxRows_ = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(To to2, int n2, WM wM2) {
        void b2;
        To c2 = wM2;
        To a2 = to2;
        super.f((int)b2, (WM)c2);
    }

    public static /* synthetic */ void f(To to2, Iterable iterable) {
        Object b2 = iterable;
        To a2 = to2;
        super.J((Iterable<? extends WM>)b2);
    }

    private void i() {
        a.bitField0_ &= MTa.c;
        a.radius_ = uSa.E;
    }

    public static To f(InputStream a2) throws IOException {
        return (To_3)To_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void M() {
        a.bitField0_ &= fta.fa;
        a.rowHoverColor_ = uSa.E;
    }

    private void e() {
        To_3 to_3 = this;
        Internal.ProtobufList<An> a2 = to_3.rows_;
        if (!a2.isModifiable()) {
            to_3.rows_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static To J(byte[] a2) throws InvalidProtocolBufferException {
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void i(To a2) {
        super.M();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        To_3 a2 = this;
        To_3.checkByteStringIsUtf8(b2);
        a2.title_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static To f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (To_3)To_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void e(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.rowHoverColor_ = b2;
    }

    public boolean hasRadius() {
        To_3 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasMaxRows() {
        To_3 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.M(b2);
    }

    private void J(String string) {
        String b2 = string;
        To_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.title_ = b2;
    }

    public boolean hasScrollbarColor() {
        To_3 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
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
        To_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new To_3();
            }
            case 2: {
                return new hN(null);
            }
            case 3: {
                Object[] objectArray = new Object[hpa.Z];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = eua.V;
                objectArray[uqa.g] = POa.X;
                objectArray[yRa.d] = rQa.J;
                objectArray[AQa.P] = Lsa.r;
                objectArray[tTa.h] = yOa.p;
                objectArray[uua.p] = Jta.m;
                objectArray[XTa.W] = JQa.M;
                objectArray[Yqa.i] = WM.class;
                objectArray[WOa.fa] = vQa.K;
                objectArray[NTa.C] = An.class;
                objectArray[pPa.f] = dQa.O;
                objectArray[lqa.s] = JPa.V;
                objectArray[uua.s] = lPa.T;
                d2 = objectArray;
                Object b2 = qta.a;
                return To_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = To_3.class;
                synchronized (To_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<To>(DEFAULT_INSTANCE);
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

    public int getRowHoverColor() {
        To_3 a2;
        return a2.rowHoverColor_;
    }

    private void f(pn pn2) {
        To_3 to_3;
        To_3 b2 = pn2;
        To_3 a2 = this;
        b2.getClass();
        if (a2.font_ != null && a2.font_ != pn.J()) {
            a2.font_ = (pn)((eO)pn.J((pn)a2.font_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            to_3 = a2;
        } else {
            to_3 = a2;
            a2.font_ = b2;
        }
        to_3.bitField0_ |= XOa.h;
    }

    public static /* synthetic */ void M(To a2) {
        super.C();
    }

    public static /* synthetic */ void J(To to2, ByteString byteString) {
        Object b2 = byteString;
        To a2 = to2;
        super.J((ByteString)b2);
    }

    private void J(boolean bl2) {
        boolean b2 = bl2;
        To_3 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.drawBack_ = b2;
    }

    private void d() {
        a.bitField0_ &= kpa.w;
        a.headingColor_ = uSa.E;
    }

    public An getRows(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        return (An)a2.rows_.get(b2);
    }

    public static To J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static To J(InputStream a2) throws IOException {
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(Iterable<? extends An> iterable) {
        To_3 a2;
        Iterable<? extends An> b2 = iterable;
        To_3 to_3 = a2 = this;
        to_3.e();
        AbstractMessageLite.addAll(b2, to_3.rows_);
    }

    public static /* synthetic */ void e(To a2) {
        super.D();
    }

    public static /* synthetic */ void J(To to2, String string) {
        Object b2 = string;
        To a2 = to2;
        super.J((String)b2);
    }

    private void d(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.titleColor_ = b2;
    }

    public boolean hasRowHoverColor() {
        To_3 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.l(b2);
    }

    private void C() {
        a.bitField0_ &= NQa.A;
        a.scrollbarColor_ = uSa.E;
    }

    private void C(int n2) {
        To_3 a2;
        int b2 = n2;
        To_3 to_3 = a2 = this;
        to_3.e();
        to_3.rows_.remove(b2);
    }

    public static To J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(To to2, int n2, An an2) {
        void b2;
        Object c2 = an2;
        To a2 = to2;
        super.f((int)b2, (An)c2);
    }

    public boolean hasFont() {
        To_3 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getRowsCount() {
        To_3 a2;
        return a2.rows_.size();
    }

    public static /* synthetic */ void d(To a2) {
        super.A();
    }

    public static /* synthetic */ void l(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.e(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, WM wM2) {
        void b2;
        To_3 c2 = wM2;
        To_3 a2 = this;
        c2.getClass();
        To_3 to_3 = a2;
        to_3.G();
        to_3.columns_.set((int)b2, (WM)c2);
    }

    public boolean getDrawBack() {
        To_3 a2;
        return a2.drawBack_;
    }

    public static /* synthetic */ void C(To a2) {
        super.F();
    }

    public s J(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        return (s)a2.rows_.get(b2);
    }

    public static /* synthetic */ void J(To to2, pn pn2) {
        To b2 = pn2;
        To a2 = to2;
        super.f((pn)b2);
    }

    private To_3() {
        To_3 a2;
        a2.rows_ = To_3.emptyProtobufList();
    }

    private void l() {
        a.columns_ = To_3.emptyProtobufList();
    }

    public List<WM> getColumnsList() {
        To_3 a2;
        return a2.columns_;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, An an2) {
        void b2;
        GeneratedMessageLite c2 = an2;
        To_3 a2 = this;
        c2.getClass();
        To_3 to_3 = a2;
        to_3.e();
        to_3.rows_.set((int)b2, (An)c2);
    }

    public static To J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.i(b2);
    }

    public static To J(CodedInputStream a2) throws IOException {
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, WM wM2) {
        void b2;
        To_3 c2 = wM2;
        To_3 a2 = this;
        c2.getClass();
        To_3 to_3 = a2;
        to_3.G();
        to_3.columns_.add((int)b2, (WM)c2);
    }

    public static /* synthetic */ void l(To a2) {
        super.d();
    }

    public static /* synthetic */ void f(To a2) {
        super.l();
    }

    public WM getColumns(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        return (WM)a2.columns_.get(b2);
    }

    private void J(Iterable<? extends WM> iterable) {
        To_3 a2;
        Iterable<? extends WM> b2 = iterable;
        To_3 to_3 = a2 = this;
        to_3.G();
        AbstractMessageLite.addAll(b2, to_3.columns_);
    }

    public static /* synthetic */ void J(To to2, Iterable iterable) {
        Object b2 = iterable;
        To a2 = to2;
        super.f((Iterable<? extends An>)b2);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.title_ = To_3.J().getTitle();
    }

    public static /* synthetic */ To f() {
        return DEFAULT_INSTANCE;
    }

    public static To J() {
        return DEFAULT_INSTANCE;
    }

    public ByteString getTitleBytes() {
        To_3 a2;
        return ByteString.copyFromUtf8(a2.title_);
    }

    public String getTitle() {
        To_3 a2;
        return a2.title_;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(To to2, int n2, WM wM2) {
        void b2;
        To c2 = wM2;
        To a2 = to2;
        super.J((int)b2, (WM)c2);
    }

    public int getTitleColor() {
        To_3 a2;
        return a2.titleColor_;
    }

    private void J(pn pn2) {
        To_3 b2 = pn2;
        To_3 a2 = this;
        b2.getClass();
        a2.font_ = b2;
        a2.bitField0_ |= XOa.h;
    }

    private void l(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.headingColor_ = b2;
    }

    public static hN J(To a2) {
        return (hN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static To J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static To J(ByteString a2) throws InvalidProtocolBufferException {
        return (To_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(To to2, int n2) {
        int b2 = n2;
        To a2 = to2;
        super.f(b2);
    }

    public boolean hasDrawBack() {
        To_3 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static hN J() {
        return (hN)DEFAULT_INSTANCE.createBuilder();
    }

    public int getHeadingColor() {
        To_3 a2;
        return a2.headingColor_;
    }

    public static Parser<To> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(An an2) {
        GeneratedMessageLite b2 = an2;
        To_3 a2 = this;
        b2.getClass();
        To_3 to_3 = a2;
        to_3.e();
        to_3.rows_.add((An)b2);
    }

    public boolean hasHeadingColor() {
        To_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(To to2, boolean bl2) {
        boolean b2 = bl2;
        To a2 = to2;
        super.J(b2);
    }

    private void f(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.maxRows_ = b2;
    }

    public boolean hasTitle() {
        To_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(To a2) {
        super.J();
    }

    public int getScrollbarColor() {
        To_3 a2;
        return a2.scrollbarColor_;
    }

    public static /* synthetic */ void J(To to2, WM wM2) {
        To b2 = wM2;
        To a2 = to2;
        super.J((WM)b2);
    }

    private void J() {
        a.rows_ = To_3.emptyProtobufList();
    }

    private void J(int n2) {
        int b2 = n2;
        To_3 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.radius_ = b2;
    }
}

