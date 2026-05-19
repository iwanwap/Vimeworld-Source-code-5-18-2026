/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  ISa
 *  JPa
 *  NQa
 *  NTa
 *  Nj
 *  Qqa
 *  Usa
 *  Uta
 *  V
 *  XTa
 *  ZRa
 *  aPa
 *  aqa
 *  cQa
 *  eO
 *  hra
 *  isa
 *  jk
 *  kpa
 *  lqa
 *  pL
 *  pPa
 *  pn
 *  qK
 *  ura
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
public final class pL_2
extends GeneratedMessageLite<pL, qK>
implements V {
    private pn font_;
    private Internal.ProtobufList<String> text_ = GeneratedMessageLite.emptyProtobufList();
    public static final int WIDTHEXPR_FIELD_NUMBER = 9;
    public static final int LINEHEIGHT_FIELD_NUMBER = 11;
    private int hoverBackground_;
    public static final int OVERFLOW_FIELD_NUMBER = 10;
    public static final int LIVEPRINTINGDELAY_FIELD_NUMBER = 12;
    private int lineHeight_;
    private String widthExpr_ = Mqa.y;
    private int wordWrap_;
    private static volatile Parser<pL> PARSER;
    private static final pL DEFAULT_INSTANCE;
    private int livePrintingDelay_;
    private int align_;
    public static final int HOVERBACKGROUND_FIELD_NUMBER = 7;
    public static final int FONT_FIELD_NUMBER = 8;
    private int overflow_;
    public static final int SHADOW_FIELD_NUMBER = 5;
    private int bitField0_;
    public static final int WORDWRAP_FIELD_NUMBER = 4;
    public static final int BACKGROUND_FIELD_NUMBER = 6;
    private boolean shadow_;
    private int width_;
    private int background_;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int ALIGN_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 2;

    public static pL J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void F() {
        a.bitField0_ &= VPa.A;
        a.hoverBackground_ = uSa.E;
    }

    private void f(pn pn2) {
        pL_2 b2 = pn2;
        pL_2 a2 = this;
        b2.getClass();
        a2.font_ = b2;
        a2.bitField0_ |= XOa.h;
    }

    private void k() {
        a.bitField0_ &= Jra.Fa;
        a.wordWrap_ = uSa.E;
    }

    public ZL getOverflow() {
        pL_2 pL_22 = this;
        ZL a2 = ZL.forNumber(pL_22.overflow_);
        if (a2 == null) {
            return ZL.UNRECOGNIZED;
        }
        return a2;
    }

    private void i(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.hoverBackground_ = b2;
    }

    public static pL J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getHoverBackground() {
        pL_2 a2;
        return a2.hoverBackground_;
    }

    public static /* synthetic */ void J(pL pL2, ZL zL2) {
        Object b2 = zL2;
        pL a2 = pL2;
        super.J((ZL)b2);
    }

    public int getTextCount() {
        pL_2 a2;
        return a2.text_.size();
    }

    public ByteString getTextBytes(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        return ByteString.copyFromUtf8((String)a2.text_.get(b2));
    }

    private void M(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.overflow_ = b2;
    }

    public static /* synthetic */ void k(pL a2) {
        super.J();
    }

    public int getWidth() {
        pL_2 a2;
        return a2.width_;
    }

    public static /* synthetic */ void G(pL a2) {
        super.M();
    }

    private void e(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.width_ = b2;
    }

    private pL_2() {
        pL_2 a2;
    }

    public jk getAlign() {
        pL_2 pL_22 = this;
        pL_2 a2 = jk.forNumber((int)pL_22.align_);
        if (a2 == null) {
            return jk.UNRECOGNIZED;
        }
        return a2;
    }

    public static /* synthetic */ void D(pL a2) {
        super.G();
    }

    public static pL f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, String string) {
        void b2;
        String c2 = string;
        pL_2 a2 = this;
        c2.getClass();
        pL_2 pL_22 = a2;
        pL_22.i();
        pL_22.text_.set((int)b2, c2);
    }

    public boolean getShadow() {
        pL_2 a2;
        return a2.shadow_;
    }

    public boolean hasWidth() {
        pL_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(pL pL2, boolean bl) {
        boolean b2 = bl;
        pL a2 = pL2;
        super.J(b2);
    }

    public static /* synthetic */ void f(pL pL2, String string) {
        Object b2 = string;
        pL a2 = pL2;
        super.J((String)b2);
    }

    public static /* synthetic */ void J(pL pL2, Iterable iterable) {
        Object b2 = iterable;
        pL a2 = pL2;
        super.J((Iterable<String>)b2);
    }

    private void G() {
        a.font_ = null;
        a.bitField0_ &= Bta.u;
    }

    public boolean hasShadow() {
        pL_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(pL pL2, jk jk2) {
        pL b2 = jk2;
        pL a2 = pL2;
        super.J((jk)b2);
    }

    private void D() {
        a.text_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void J(ZL zL2) {
        ZL b2 = zL2;
        pL_2 a2 = this;
        a2.overflow_ = b2.getNumber();
        a2.bitField0_ |= hra.Ja;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        pL_2 a2 = this;
        pL_2.checkByteStringIsUtf8(b2);
        a2.widthExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= uqa.g;
    }

    private void d(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.align_ = b2;
    }

    public static Parser<pL> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasOverflow() {
        pL_2 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void A() {
        a.bitField0_ &= fta.fa;
        a.background_ = uSa.E;
    }

    public static qK J(pL a2) {
        return (qK)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public int getLivePrintingDelay() {
        pL_2 a2;
        return a2.livePrintingDelay_;
    }

    private void J(jk jk2) {
        pL_2 b2 = jk2;
        pL_2 a2 = this;
        a2.align_ = b2.getNumber();
        a2.bitField0_ |= AQa.P;
    }

    private void i() {
        pL_2 pL_22 = this;
        Internal.ProtobufList<String> a2 = pL_22.text_;
        if (!a2.isModifiable()) {
            pL_22.text_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void J(Iterable<String> iterable) {
        pL_2 a2;
        Iterable<String> b2 = iterable;
        pL_2 pL_22 = a2 = this;
        pL_22.i();
        AbstractMessageLite.addAll(b2, pL_22.text_);
    }

    public static pL f(InputStream a2) throws IOException {
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void i(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.l(b2);
    }

    public int getAlignValue() {
        pL_2 a2;
        return a2.align_;
    }

    public static /* synthetic */ void M(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.d(b2);
    }

    public static /* synthetic */ void f(pL pL2, ByteString byteString) {
        Object b2 = byteString;
        pL a2 = pL2;
        super.f((ByteString)b2);
    }

    public static pL J(byte[] a2) throws InvalidProtocolBufferException {
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getOverflowValue() {
        pL_2 a2;
        return a2.overflow_;
    }

    public static pL J(CodedInputStream a2) throws IOException {
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(Nj nj2) {
        pL_2 b2 = nj2;
        pL_2 a2 = this;
        a2.wordWrap_ = b2.getNumber();
        a2.bitField0_ |= Yqa.i;
    }

    static {
        pL_2 pL_22 = new pL_2();
        DEFAULT_INSTANCE = pL_22;
        GeneratedMessageLite.registerDefaultInstance(pL_2.class, pL_22);
    }

    public static /* synthetic */ void A(pL a2) {
        super.k();
    }

    public static /* synthetic */ void i(pL a2) {
        super.d();
    }

    public static /* synthetic */ pL f() {
        return DEFAULT_INSTANCE;
    }

    private void M() {
        a.bitField0_ &= aqa.C;
        a.livePrintingDelay_ = uSa.E;
    }

    public static pL J(InputStream a2) throws IOException {
        return (pL_2)pL_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(pL pL2, ByteString byteString) {
        Object b2 = byteString;
        pL a2 = pL2;
        super.J((ByteString)b2);
    }

    public String getText(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        return (String)a2.text_.get(b2);
    }

    public static /* synthetic */ void M(pL a2) {
        super.A();
    }

    public static /* synthetic */ void J(pL pL2, Nj nj2) {
        pL b2 = nj2;
        pL a2 = pL2;
        super.J((Nj)b2);
    }

    public static /* synthetic */ void e(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.e(b2);
    }

    public static /* synthetic */ void e(pL a2) {
        super.e();
    }

    private void J(pn pn2) {
        pL_2 pL_22;
        pL_2 b2 = pn2;
        pL_2 a2 = this;
        b2.getClass();
        if (a2.font_ != null && a2.font_ != pn.J()) {
            a2.font_ = (pn)((eO)pn.J((pn)a2.font_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            pL_22 = a2;
        } else {
            pL_22 = a2;
            a2.font_ = b2;
        }
        pL_22.bitField0_ |= XOa.h;
    }

    public boolean hasAlign() {
        pL_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void e() {
        a.bitField0_ &= kpa.w;
        a.align_ = uSa.E;
    }

    private void f(String string) {
        String b2 = string;
        pL_2 a2 = this;
        b2.getClass();
        pL_2 pL_22 = a2;
        pL_22.i();
        pL_22.text_.add(b2);
    }

    public static /* synthetic */ void J(pL pL2, String string) {
        Object b2 = string;
        pL a2 = pL2;
        super.f((String)b2);
    }

    private void d() {
        a.bitField0_ &= rQa.p;
        a.width_ = uSa.E;
    }

    public static /* synthetic */ void d(pL a2) {
        super.D();
    }

    public boolean hasBackground() {
        pL_2 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static pL J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasLineHeight() {
        pL_2 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getWidthExprBytes() {
        pL_2 a2;
        return ByteString.copyFromUtf8(a2.widthExpr_);
    }

    public int getBackground() {
        pL_2 a2;
        return a2.background_;
    }

    public pn getFont() {
        pL_2 a2;
        if (a2.font_ == null) {
            return pn.J();
        }
        return a2.font_;
    }

    private void C(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.wordWrap_ = b2;
    }

    public Nj getWordWrap() {
        pL_2 pL_22 = this;
        pL_2 a2 = Nj.forNumber((int)pL_22.wordWrap_);
        if (a2 == null) {
            return Nj.UNRECOGNIZED;
        }
        return a2;
    }

    public String getWidthExpr() {
        pL_2 a2;
        return a2.widthExpr_;
    }

    private void l(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.lineHeight_ = b2;
    }

    public static /* synthetic */ void C(pL a2) {
        super.l();
    }

    public boolean hasHoverBackground() {
        pL_2 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(pL pL2, int n2, String string) {
        void b2;
        Object c2 = string;
        pL a2 = pL2;
        super.J((int)b2, (String)c2);
    }

    private void C() {
        a.bitField0_ &= ERa.Ka;
        a.widthExpr_ = pL_2.J().getWidthExpr();
    }

    public static /* synthetic */ void l(pL a2) {
        super.C();
    }

    public static /* synthetic */ void f(pL pL2, pn pn2) {
        pL b2 = pn2;
        pL a2 = pL2;
        super.J((pn)b2);
    }

    public static /* synthetic */ void d(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.J(b2);
    }

    public static pL J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pL J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pL_2)pL_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(pL a2) {
        super.f();
    }

    public static /* synthetic */ void C(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.f(b2);
    }

    public static pL J(ByteString a2) throws InvalidProtocolBufferException {
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l() {
        a.bitField0_ &= Uta.Z;
        a.lineHeight_ = uSa.E;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        pL_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.shadow_ = b2;
    }

    public static /* synthetic */ void J(pL pL2, pn pn2) {
        pL b2 = pn2;
        pL a2 = pL2;
        super.f((pn)b2);
    }

    public static /* synthetic */ void l(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.M(b2);
    }

    private void f(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.livePrintingDelay_ = b2;
    }

    public static /* synthetic */ void f(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.C(b2);
    }

    public static qK J() {
        return (qK)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(String string) {
        String b2 = string;
        pL_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= uqa.g;
        a2.widthExpr_ = b2;
    }

    public boolean hasWordWrap() {
        pL_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(int n2) {
        int b2 = n2;
        pL_2 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.background_ = b2;
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
        pL_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new pL_2();
            }
            case 2: {
                return new qK(null);
            }
            case 3: {
                Object[] objectArray = new Object[uua.s];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aPa.O;
                objectArray[uqa.g] = LPa.a;
                objectArray[yRa.d] = isa.k;
                objectArray[AQa.P] = ZRa.y;
                objectArray[tTa.h] = dqa.D;
                objectArray[uua.p] = Usa.y;
                objectArray[XTa.W] = vQa.t;
                objectArray[Yqa.i] = JPa.V;
                objectArray[WOa.fa] = BPa.B;
                objectArray[NTa.C] = vQa.x;
                objectArray[pPa.f] = rpa.r;
                objectArray[lqa.s] = Qqa.C;
                d2 = objectArray;
                Object b2 = ISa.R;
                return pL_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = pL_2.class;
                synchronized (pL_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<pL>(DEFAULT_INSTANCE);
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

    public int getWordWrapValue() {
        pL_2 a2;
        return a2.wordWrap_;
    }

    public static /* synthetic */ void J(pL pL2, int n2) {
        int b2 = n2;
        pL a2 = pL2;
        super.i(b2);
    }

    public List<String> getTextList() {
        pL_2 a2;
        return a2.text_;
    }

    public boolean hasFont() {
        pL_2 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasWidthExpr() {
        pL_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ByteString byteString) {
        pL_2 a2;
        ByteString b2 = byteString;
        pL_2 pL_22 = a2 = this;
        pL_2.checkByteStringIsUtf8(b2);
        pL_22.i();
        pL_22.text_.add(b2.toStringUtf8());
    }

    public int getLineHeight() {
        pL_2 a2;
        return a2.lineHeight_;
    }

    public boolean hasLivePrintingDelay() {
        pL_2 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f() {
        a.bitField0_ &= MTa.c;
        a.overflow_ = uSa.E;
    }

    private void J() {
        a.bitField0_ &= NQa.A;
        a.shadow_ = uSa.E;
    }

    public static /* synthetic */ void J(pL a2) {
        super.F();
    }

    public static pL J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (pL_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static pL J() {
        return DEFAULT_INSTANCE;
    }
}

