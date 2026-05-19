/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Cta
 *  ERa
 *  JN
 *  JPa
 *  Jo
 *  NPa
 *  NQa
 *  NTa
 *  XM
 *  XTa
 *  Za
 *  Zo
 *  kpa
 *  lqa
 *  nQa
 *  pPa
 *  pua
 *  vQa
 *  vRa
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
public final class rm
extends GeneratedMessageLite<rm, JN>
implements Za {
    public static final int SCROLLBARCOLOR_FIELD_NUMBER = 3;
    private int scrollbar_;
    public static final int MASKIMAGEPATH_FIELD_NUMBER = 6;
    public static final int SCROLLBARBACKGROUND_FIELD_NUMBER = 4;
    private int scrollbarBackground_;
    private float scrollSpeedMultiplier_;
    public static final int FIXITERATEHOVER_FIELD_NUMBER = 10;
    private static final rm DEFAULT_INSTANCE;
    public static final int SCROLLSPEEDMULTIPLIER_FIELD_NUMBER = 8;
    public static final int MASKELEMENT_FIELD_NUMBER = 9;
    private int scrollbarColor_;
    public static final int OVERFLOW_FIELD_NUMBER = 5;
    private boolean overflow_;
    private int bitField0_;
    public static final int MASKIMAGERESOURCE_FIELD_NUMBER = 7;
    private boolean fixIterateHover_;
    private Object maskImage_;
    public static final int SCROLLBAR_FIELD_NUMBER = 2;
    private static volatile Parser<rm> PARSER;
    public static final int ELEMENTS_FIELD_NUMBER = 1;
    private int maskImageCase_ = uSa.E;
    private Internal.ProtobufList<XM> elements_ = rm.emptyProtobufList();

    public float getScrollSpeedMultiplier() {
        rm a2;
        return a2.scrollSpeedMultiplier_;
    }

    public static /* synthetic */ void G(rm a2) {
        a2.A();
    }

    private void k() {
        a.elements_ = rm.emptyProtobufList();
    }

    public static /* synthetic */ rm f() {
        return DEFAULT_INSTANCE;
    }

    private void l(XM xM) {
        rm b2 = xM;
        rm a2 = this;
        b2.getClass();
        rm rm2 = a2;
        rm2.G();
        rm2.elements_.add((XM)b2);
    }

    public static /* synthetic */ void d(rm rm2, int n2) {
        int b2 = n2;
        rm a2 = rm2;
        a2.f(b2);
    }

    public static /* synthetic */ void D(rm a2) {
        a2.J();
    }

    public int getElementsCount() {
        rm a2;
        return a2.elements_.size();
    }

    private void d(int n2) {
        int b2 = n2;
        rm a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.scrollbarBackground_ = b2;
    }

    private void G() {
        rm rm2 = this;
        Internal.ProtobufList<XM> a2 = rm2.elements_;
        if (!a2.isModifiable()) {
            rm2.elements_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void D() {
        a.bitField0_ &= ERa.Ka;
        a.scrollbarColor_ = uSa.E;
    }

    public static Parser<rm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasOverflow() {
        rm a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasFixIterateHover() {
        rm a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(rm rm2, int n2, XM xM) {
        void b2;
        rm c2 = xM;
        rm a2 = rm2;
        a2.J((int)b2, (XM)c2);
    }

    public XM getElements(int n2) {
        int b2 = n2;
        rm a2 = this;
        return (XM)a2.elements_.get(b2);
    }

    private void A() {
        a.bitField0_ &= Jra.Fa;
        a.overflow_ = uSa.E;
    }

    private void C(int n2) {
        rm a2;
        int b2 = n2;
        rm rm2 = a2 = this;
        rm2.G();
        rm2.elements_.remove(b2);
    }

    public String getMaskImagePath() {
        rm rm2 = this;
        Object a2 = Mqa.y;
        if (rm2.maskImageCase_ == uua.p) {
            a2 = (String)rm2.maskImage_;
        }
        return a2;
    }

    public static /* synthetic */ void C(rm rm2, int n2) {
        int b2 = n2;
        rm a2 = rm2;
        a2.J(b2);
    }

    public boolean hasMaskImageResource() {
        rm a2;
        if (a2.maskImageCase_ == XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(rm rm2, float f2) {
        float b2 = f2;
        rm a2 = rm2;
        a2.J(b2);
    }

    public static /* synthetic */ void l(rm rm2, int n2) {
        int b2 = n2;
        rm a2 = rm2;
        a2.d(b2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        rm a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.overflow_ = b2;
    }

    public static /* synthetic */ void J(rm rm2, Zo zo2) {
        rm b2 = zo2;
        rm a2 = rm2;
        a2.J((Zo)b2);
    }

    private void i() {
        rm a2;
        if (a2.maskImageCase_ == XTa.W) {
            rm rm2 = a2;
            rm2.maskImageCase_ = uSa.E;
            rm2.maskImage_ = null;
        }
    }

    public static rm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static rm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(rm rm2, ByteString byteString) {
        ByteString b2 = byteString;
        rm a2 = rm2;
        a2.J(b2);
    }

    private void M() {
        rm a2;
        rm rm2 = a2;
        rm2.maskImageCase_ = uSa.E;
        rm2.maskImage_ = null;
    }

    public int getScrollbarValue() {
        rm a2;
        return a2.scrollbar_;
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
        rm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new rm();
            }
            case 2: {
                return new JN(null);
            }
            case 3: {
                Object[] objectArray = new Object[lqa.s];
                objectArray[uSa.E] = KSa.K;
                objectArray[vRa.d] = XOa.w;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = nQa.i;
                objectArray[AQa.P] = XM.class;
                objectArray[tTa.h] = Cta.t;
                objectArray[uua.p] = yOa.p;
                objectArray[XTa.W] = tua.c;
                objectArray[Yqa.i] = vQa.x;
                objectArray[WOa.fa] = sqa.C;
                objectArray[NTa.C] = XM.class;
                objectArray[pPa.f] = pua.Ga;
                d2 = objectArray;
                Object b2 = NPa.t;
                return rm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = rm.class;
                synchronized (rm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<rm>(DEFAULT_INSTANCE);
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

    public static rm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public List<? extends va> J() {
        rm a2;
        return a2.elements_;
    }

    public boolean hasScrollbarBackground() {
        rm a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(rm rm2, int n2, XM xM) {
        void b2;
        rm c2 = xM;
        rm a2 = rm2;
        a2.f((int)b2, (XM)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, XM xM) {
        void b2;
        rm c2 = xM;
        rm a2 = this;
        c2.getClass();
        rm rm2 = a2;
        rm2.G();
        rm2.elements_.add((int)b2, (XM)c2);
    }

    public static rm J() {
        return DEFAULT_INSTANCE;
    }

    private void l(int n2) {
        int b2 = n2;
        rm a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.scrollbar_ = b2;
    }

    public int getMaskImageResource() {
        rm a2;
        if (a2.maskImageCase_ == XTa.W) {
            return (Integer)a2.maskImage_;
        }
        return uSa.E;
    }

    public boolean hasScrollbar() {
        rm a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasMaskImagePath() {
        rm a2;
        if (a2.maskImageCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static rm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(XM xM) {
        rm b2 = xM;
        rm a2 = this;
        b2.getClass();
        rm rm2 = a2;
        rm2.maskImage_ = b2;
        rm2.maskImageCase_ = WOa.fa;
    }

    public boolean getOverflow() {
        rm a2;
        return a2.overflow_;
    }

    public static /* synthetic */ void f(rm rm2, boolean bl) {
        boolean b2 = bl;
        rm a2 = rm2;
        a2.f(b2);
    }

    public static /* synthetic */ void J(rm rm2, boolean bl) {
        boolean b2 = bl;
        rm a2 = rm2;
        a2.J(b2);
    }

    private void J(ByteString byteString) {
        rm a2;
        ByteString b2 = byteString;
        rm rm2 = a2 = this;
        rm.checkByteStringIsUtf8(b2);
        rm2.maskImage_ = b2.toStringUtf8();
        rm2.maskImageCase_ = uua.p;
    }

    public static /* synthetic */ void f(rm rm2, int n2) {
        int b2 = n2;
        rm a2 = rm2;
        a2.l(b2);
    }

    private void J(float f2) {
        float b2 = f2;
        rm a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.scrollSpeedMultiplier_ = b2;
    }

    private void J(Iterable<? extends XM> iterable) {
        rm a2;
        Iterable<? extends XM> b2 = iterable;
        rm rm2 = a2 = this;
        rm2.G();
        AbstractMessageLite.addAll(b2, rm2.elements_);
    }

    private void J(String string) {
        String b2 = string;
        rm a2 = this;
        b2.getClass();
        rm rm2 = a2;
        rm2.maskImageCase_ = uua.p;
        rm2.maskImage_ = b2;
    }

    static {
        rm rm2;
        DEFAULT_INSTANCE = rm2 = new rm();
        GeneratedMessageLite.registerDefaultInstance(rm.class, rm2);
    }

    public int getScrollbarBackground() {
        rm a2;
        return a2.scrollbarBackground_;
    }

    public static /* synthetic */ void J(rm rm2, String string) {
        String b2 = string;
        rm a2 = rm2;
        a2.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, XM xM) {
        void b2;
        rm c2 = xM;
        rm a2 = this;
        c2.getClass();
        rm rm2 = a2;
        rm2.G();
        rm2.elements_.set((int)b2, (XM)c2);
    }

    public static rm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(rm rm2, XM xM) {
        rm b2 = xM;
        rm a2 = rm2;
        a2.l((XM)b2);
    }

    public boolean hasMaskElement() {
        rm a2;
        if (a2.maskImageCase_ == WOa.fa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static rm f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static JN J(rm a2) {
        return (JN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void A(rm a2) {
        a2.f();
    }

    public XM getMaskElement() {
        rm a2;
        if (a2.maskImageCase_ == WOa.fa) {
            return (XM)a2.maskImage_;
        }
        return XM.J();
    }

    private void e() {
        a.bitField0_ &= kpa.w;
        a.scrollbarBackground_ = uSa.E;
    }

    public static /* synthetic */ void i(rm a2) {
        a2.M();
    }

    public static /* synthetic */ void M(rm a2) {
        a2.C();
    }

    public static /* synthetic */ void e(rm a2) {
        a2.k();
    }

    public static /* synthetic */ void d(rm a2) {
        a2.e();
    }

    private rm() {
        rm a2;
    }

    public static rm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public PO getMaskImageCase() {
        rm a2;
        return PO.forNumber(a2.maskImageCase_);
    }

    public static JN J() {
        return (JN)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        rm a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.fixIterateHover_ = b2;
    }

    public static rm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(rm a2) {
        a2.d();
    }

    public Zo getScrollbar() {
        rm rm2 = this;
        rm a2 = Zo.forNumber((int)rm2.scrollbar_);
        if (a2 == null) {
            return Zo.UNRECOGNIZED;
        }
        return a2;
    }

    private void f(int n2) {
        int b2 = n2;
        rm a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.scrollbarColor_ = b2;
    }

    public static /* synthetic */ void l(rm a2) {
        a2.i();
    }

    private void d() {
        a.bitField0_ &= fta.fa;
        a.fixIterateHover_ = uSa.E;
    }

    public boolean hasScrollSpeedMultiplier() {
        rm a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(XM xM) {
        rm rm2;
        rm b2 = xM;
        rm a2 = this;
        b2.getClass();
        if (a2.maskImageCase_ == WOa.fa && a2.maskImage_ != XM.J()) {
            a2.maskImage_ = ((Jo)XM.J((XM)((XM)a2.maskImage_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            rm2 = a2;
        } else {
            rm2 = a2;
            a2.maskImage_ = b2;
        }
        rm2.maskImageCase_ = WOa.fa;
    }

    public boolean hasScrollbarColor() {
        rm a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getScrollbarColor() {
        rm a2;
        return a2.scrollbarColor_;
    }

    public static /* synthetic */ void J(rm rm2, Iterable iterable) {
        Iterable b2 = iterable;
        rm a2 = rm2;
        a2.J(b2);
    }

    public List<XM> getElementsList() {
        rm a2;
        return a2.elements_;
    }

    public static /* synthetic */ void f(rm rm2, XM xM) {
        rm b2 = xM;
        rm a2 = rm2;
        a2.J((XM)b2);
    }

    public static /* synthetic */ void J(rm rm2, int n2) {
        int b2 = n2;
        rm a2 = rm2;
        a2.C(b2);
    }

    public static /* synthetic */ void J(rm rm2, XM xM) {
        rm b2 = xM;
        rm a2 = rm2;
        a2.f((XM)b2);
    }

    public va J(int n2) {
        int b2 = n2;
        rm a2 = this;
        return (va)a2.elements_.get(b2);
    }

    private void C() {
        rm a2;
        if (a2.maskImageCase_ == WOa.fa) {
            rm rm2 = a2;
            rm2.maskImageCase_ = uSa.E;
            rm2.maskImage_ = null;
        }
    }

    public ByteString getMaskImagePathBytes() {
        rm rm2 = this;
        Object a2 = Mqa.y;
        if (rm2.maskImageCase_ == uua.p) {
            a2 = (String)rm2.maskImage_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.scrollbar_ = uSa.E;
    }

    public static /* synthetic */ void f(rm a2) {
        a2.D();
    }

    public static /* synthetic */ void J(rm a2) {
        a2.l();
    }

    public static rm J(InputStream a2) throws IOException {
        return rm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        rm a2;
        int b2 = n2;
        rm rm2 = a2 = this;
        rm2.maskImageCase_ = XTa.W;
        rm2.maskImage_ = b2;
    }

    public static rm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void f() {
        rm a2;
        if (a2.maskImageCase_ == uua.p) {
            rm rm2 = a2;
            rm2.maskImageCase_ = uSa.E;
            rm2.maskImage_ = null;
        }
    }

    private void J() {
        a.bitField0_ &= NQa.A;
        a.scrollSpeedMultiplier_ = JPa.N;
    }

    public static rm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean getFixIterateHover() {
        rm a2;
        return a2.fixIterateHover_;
    }

    public static rm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return rm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(Zo zo2) {
        rm b2 = zo2;
        rm a2 = this;
        a2.scrollbar_ = b2.getNumber();
        a2.bitField0_ |= vRa.d;
    }
}

