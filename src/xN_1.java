/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bsa
 *  ERa
 *  Fa
 *  JPa
 *  NQa
 *  NTa
 *  QSa
 *  Spa
 *  Uta
 *  XTa
 *  YM
 *  Ypa
 *  aQa
 *  aqa
 *  bua
 *  cQa
 *  hra
 *  jpa
 *  kpa
 *  lqa
 *  pPa
 *  uQa
 *  ura
 *  vRa
 *  xN
 *  yra
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
public final class xN_1
extends GeneratedMessageLite<xN, oo>
implements Fa {
    private float trackSize_;
    public static final int TRACKSIZE_FIELD_NUMBER = 10;
    public static final int CALLBACK_FIELD_NUMBER = 12;
    public static final int DISPLAYFORMAT_FIELD_NUMBER = 14;
    private String sizeExpr_;
    public static final int SIZE_FIELD_NUMBER = 6;
    private float trackWidth_;
    private String displayFormat_;
    private float max_;
    private int bitField0_;
    private float value_;
    public static final int DISPLAYID_FIELD_NUMBER = 5;
    private static volatile Parser<xN> PARSER;
    public static final int MAX_FIELD_NUMBER = 3;
    private ByteString callback_;
    public static final int TRACKCOLOR_FIELD_NUMBER = 9;
    public static final int SIZEEXPR_FIELD_NUMBER = 7;
    public static final int ARCCOLOR_FIELD_NUMBER = 11;
    private float size_;
    public static final int ARCCOLORS_FIELD_NUMBER = 13;
    private static final xN DEFAULT_INSTANCE;
    public static final int STEP_FIELD_NUMBER = 4;
    private float min_;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float step_;
    public static final int TRACKWIDTH_FIELD_NUMBER = 8;
    private int trackColor_;
    private String displayId_ = Mqa.y;
    private int arcColor_;
    private Internal.ProtobufList<YM> arcColors_;
    public static final int MIN_FIELD_NUMBER = 2;

    public static /* synthetic */ void j(xN a2) {
        super.f();
    }

    public List<YM> getArcColorsList() {
        xN_1 a2;
        return a2.arcColors_;
    }

    public String getDisplayFormat() {
        xN_1 a2;
        return a2.displayFormat_;
    }

    public static /* synthetic */ void F(xN a2) {
        super.i();
    }

    public String getDisplayId() {
        xN_1 a2;
        return a2.displayId_;
    }

    public boolean hasCallback() {
        xN_1 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C(ByteString byteString) {
        ByteString b2 = byteString;
        xN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= QSa.ba;
        a2.callback_ = b2;
    }

    private void I() {
        a.bitField0_ &= Bta.u;
        a.trackWidth_ = JPa.N;
    }

    private void J(YM yM2) {
        xN_1 b2 = yM2;
        xN_1 a2 = this;
        b2.getClass();
        xN_1 xN_12 = a2;
        xN_12.e();
        xN_12.arcColors_.add((YM)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(xN xN2, int n2, YM yM2) {
        void b2;
        xN c2 = yM2;
        xN a2 = xN2;
        super.f((int)b2, (YM)c2);
    }

    public boolean hasTrackWidth() {
        xN_1 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(xN xN2, ByteString byteString) {
        Object b2 = byteString;
        xN a2 = xN2;
        super.C((ByteString)b2);
    }

    private void J(Iterable<? extends YM> iterable) {
        xN_1 a2;
        Iterable<? extends YM> b2 = iterable;
        xN_1 xN_12 = a2 = this;
        xN_12.e();
        AbstractMessageLite.addAll(b2, xN_12.arcColors_);
    }

    public static /* synthetic */ void J(xN xN2, YM yM2) {
        xN b2 = yM2;
        xN a2 = xN2;
        super.J((YM)b2);
    }

    private void j() {
        a.bitField0_ &= Jra.Fa;
        a.step_ = JPa.N;
    }

    private void l(String string) {
        String b2 = string;
        xN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= mPa.H;
        a2.displayFormat_ = b2;
    }

    public static xN f(InputStream a2) throws IOException {
        return (xN_1)xN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        xN_1 a2 = this;
        xN_1.checkByteStringIsUtf8(b2);
        a2.displayId_ = b2.toStringUtf8();
        a2.bitField0_ |= ERa.C;
    }

    public static /* synthetic */ void l(xN xN2, int n2) {
        int b2 = n2;
        xN a2 = xN2;
        super.f(b2);
    }

    public static Parser<xN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasSizeExpr() {
        xN_1 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(xN xN2, int n2) {
        int b2 = n2;
        xN a2 = xN2;
        super.J(b2);
    }

    public int getArcColorsCount() {
        xN_1 a2;
        return a2.arcColors_.size();
    }

    public static /* synthetic */ void k(xN a2) {
        super.d();
    }

    public boolean hasMax() {
        xN_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(String string) {
        String b2 = string;
        xN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ysa.s;
        a2.sizeExpr_ = b2;
    }

    public static /* synthetic */ void G(xN a2) {
        super.I();
    }

    public static /* synthetic */ xN f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void D(xN a2) {
        super.A();
    }

    private void F() {
        a.bitField0_ &= kpa.w;
        a.max_ = JPa.N;
    }

    public String getSizeExpr() {
        xN_1 a2;
        return a2.sizeExpr_;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(xN xN2, int n2, YM yM2) {
        void b2;
        xN c2 = yM2;
        xN a2 = xN2;
        super.J((int)b2, (YM)c2);
    }

    public static /* synthetic */ void M(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.f(b2);
    }

    public static /* synthetic */ void A(xN a2) {
        super.F();
    }

    public static /* synthetic */ void l(xN xN2, ByteString byteString) {
        Object b2 = byteString;
        xN a2 = xN2;
        super.l((ByteString)b2);
    }

    public static xN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (xN_1)xN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void M(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.min_ = b2;
    }

    public ByteString getCallback() {
        xN_1 a2;
        return a2.callback_;
    }

    public static xN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void i(xN a2) {
        super.M();
    }

    public Ja J(int n2) {
        int b2 = n2;
        xN_1 a2 = this;
        return (Ja)a2.arcColors_.get(b2);
    }

    public boolean hasStep() {
        xN_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void e(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.trackSize_ = b2;
    }

    private void k() {
        a.bitField0_ &= ERa.Ka;
        a.min_ = JPa.N;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        xN_1 a2 = this;
        xN_1.checkByteStringIsUtf8(b2);
        a2.sizeExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= ysa.s;
    }

    private void G() {
        a.bitField0_ &= ppa.ca;
        a.callback_ = xN_1.J().getCallback();
    }

    public static /* synthetic */ void e(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.e(b2);
    }

    private void D() {
        a.bitField0_ &= Uta.Z;
        a.trackSize_ = JPa.N;
    }

    public ByteString getDisplayIdBytes() {
        xN_1 a2;
        return ByteString.copyFromUtf8(a2.displayId_);
    }

    public static /* synthetic */ void d(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.C(b2);
    }

    public static /* synthetic */ void C(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.l(b2);
    }

    public static /* synthetic */ void M(xN a2) {
        super.k();
    }

    public static /* synthetic */ void e(xN a2) {
        super.J();
    }

    public static /* synthetic */ void l(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.J(b2);
    }

    private void l(int n2) {
        int b2 = n2;
        xN_1 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.arcColor_ = b2;
    }

    private void d(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.size_ = b2;
    }

    private void C(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.step_ = b2;
    }

    public YM getArcColors(int n2) {
        int b2 = n2;
        xN_1 a2 = this;
        return (YM)a2.arcColors_.get(b2);
    }

    private void A() {
        a.bitField0_ &= aqa.C;
        a.arcColor_ = uSa.E;
    }

    public static /* synthetic */ void f(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.M(b2);
    }

    public static xN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.trackWidth_ = b2;
    }

    private void f(int n2) {
        int b2 = n2;
        xN_1 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.trackColor_ = b2;
    }

    public boolean hasArcColor() {
        xN_1 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void i() {
        a.bitField0_ &= VPa.A;
        a.sizeExpr_ = xN_1.J().getSizeExpr();
    }

    public static /* synthetic */ void d(xN a2) {
        super.C();
    }

    public static xN J(InputStream a2) throws IOException {
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void M() {
        a.bitField0_ &= aQa.d;
        a.displayFormat_ = xN_1.J().getDisplayFormat();
    }

    public boolean hasDisplayId() {
        xN_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(xN a2) {
        super.j();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        xN_1 a2 = this;
        xN_1.checkByteStringIsUtf8(b2);
        a2.displayFormat_ = b2.toStringUtf8();
        a2.bitField0_ |= mPa.H;
    }

    public ByteString getSizeExprBytes() {
        xN_1 a2;
        return ByteString.copyFromUtf8(a2.sizeExpr_);
    }

    public float getValue() {
        xN_1 a2;
        return a2.value_;
    }

    public boolean hasTrackSize() {
        xN_1 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getMin() {
        xN_1 a2;
        return a2.min_;
    }

    public float getSize() {
        xN_1 a2;
        return a2.size_;
    }

    private void J(int n2) {
        xN_1 a2;
        int b2 = n2;
        xN_1 xN_12 = a2 = this;
        xN_12.e();
        xN_12.arcColors_.remove(b2);
    }

    public ByteString getDisplayFormatBytes() {
        xN_1 a2;
        return ByteString.copyFromUtf8(a2.displayFormat_);
    }

    private void e() {
        xN_1 xN_12 = this;
        Internal.ProtobufList<YM> a2 = xN_12.arcColors_;
        if (!a2.isModifiable()) {
            xN_12.arcColors_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public int getTrackColor() {
        xN_1 a2;
        return a2.trackColor_;
    }

    public static /* synthetic */ void l(xN a2) {
        super.G();
    }

    public static xN J(CodedInputStream a2) throws IOException {
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.value_ = b2;
    }

    public static oo J(xN a2) {
        return (oo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(xN a2) {
        super.D();
    }

    public static xN J(ByteString a2) throws InvalidProtocolBufferException {
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(xN xN2, String string) {
        Object b2 = string;
        xN a2 = xN2;
        super.J((String)b2);
    }

    private void d() {
        a.bitField0_ &= MTa.c;
        a.trackColor_ = uSa.E;
    }

    public boolean hasValue() {
        xN_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getStep() {
        xN_1 a2;
        return a2.step_;
    }

    public int getArcColor() {
        xN_1 a2;
        return a2.arcColor_;
    }

    private xN_1() {
        xN_1 a2;
        a2.sizeExpr_ = Mqa.y;
        a2.callback_ = ByteString.EMPTY;
        a2.arcColors_ = xN_1.emptyProtobufList();
        a2.displayFormat_ = Mqa.y;
    }

    public static /* synthetic */ void f(xN xN2, String string) {
        Object b2 = string;
        xN a2 = xN2;
        super.f((String)b2);
    }

    private void J(String string) {
        String b2 = string;
        xN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ERa.C;
        a2.displayId_ = b2;
    }

    public boolean hasMin() {
        xN_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static xN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C() {
        a.bitField0_ &= fta.fa;
        a.size_ = JPa.N;
    }

    public static xN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l() {
        a.bitField0_ &= NQa.A;
        a.displayId_ = xN_1.J().getDisplayId();
    }

    public static xN J(byte[] a2) throws InvalidProtocolBufferException {
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.arcColors_ = xN_1.emptyProtobufList();
    }

    public float getMax() {
        xN_1 a2;
        return a2.max_;
    }

    public List<? extends Ja> J() {
        xN_1 a2;
        return a2.arcColors_;
    }

    public static /* synthetic */ void f(xN xN2, ByteString byteString) {
        Object b2 = byteString;
        xN a2 = xN2;
        super.J((ByteString)b2);
    }

    public static xN J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(xN xN2, String string) {
        Object b2 = string;
        xN a2 = xN2;
        super.l((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, YM yM2) {
        void b2;
        xN_1 c2 = yM2;
        xN_1 a2 = this;
        c2.getClass();
        xN_1 xN_12 = a2;
        xN_12.e();
        xN_12.arcColors_.add((int)b2, (YM)c2);
    }

    public static /* synthetic */ void J(xN xN2, float f2) {
        float b2 = f2;
        xN a2 = xN2;
        super.d(b2);
    }

    public static /* synthetic */ void J(xN xN2, ByteString byteString) {
        Object b2 = byteString;
        xN a2 = xN2;
        super.f((ByteString)b2);
    }

    public boolean hasSize() {
        xN_1 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static oo J() {
        return (oo)DEFAULT_INSTANCE.createBuilder();
    }

    public boolean hasTrackColor() {
        xN_1 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        xN_1 xN_12 = new xN_1();
        DEFAULT_INSTANCE = xN_12;
        GeneratedMessageLite.registerDefaultInstance(xN_1.class, xN_12);
    }

    public float getTrackWidth() {
        xN_1 a2;
        return a2.trackWidth_;
    }

    public static /* synthetic */ void J(xN xN2, Iterable iterable) {
        Object b2 = iterable;
        xN a2 = xN2;
        super.J((Iterable<? extends YM>)b2);
    }

    public boolean hasDisplayFormat() {
        xN_1 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(xN xN2, int n2) {
        int b2 = n2;
        xN a2 = xN2;
        super.l(b2);
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
        xN_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new xN_1();
            }
            case 2: {
                return new oo(null);
            }
            case 3: {
                Object[] objectArray = new Object[ERa.C];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = BQa.U;
                objectArray[uqa.g] = Spa.X;
                objectArray[yRa.d] = Bsa.Aa;
                objectArray[AQa.P] = Spa.ba;
                objectArray[tTa.h] = bua.n;
                objectArray[uua.p] = uQa.p;
                objectArray[XTa.W] = WPa.d;
                objectArray[Yqa.i] = pta.ga;
                objectArray[WOa.fa] = wua.D;
                objectArray[NTa.C] = yra.Z;
                objectArray[pPa.f] = STa.K;
                objectArray[lqa.s] = jpa.Aa;
                objectArray[uua.s] = ppa.k;
                objectArray[hpa.Z] = YM.class;
                objectArray[Ypa.A] = Spa.a;
                d2 = objectArray;
                Object b2 = DPa.Ha;
                return xN_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = xN_1.class;
                synchronized (xN_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<xN>(DEFAULT_INSTANCE);
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

    private void J() {
        a.bitField0_ &= rQa.p;
        a.value_ = JPa.N;
    }

    private void J(float f2) {
        float b2 = f2;
        xN_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.max_ = b2;
    }

    public float getTrackSize() {
        xN_1 a2;
        return a2.trackSize_;
    }

    public static xN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static xN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (xN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(xN a2) {
        super.l();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, YM yM2) {
        void b2;
        xN_1 c2 = yM2;
        xN_1 a2 = this;
        c2.getClass();
        xN_1 xN_12 = a2;
        xN_12.e();
        xN_12.arcColors_.set((int)b2, (YM)c2);
    }
}

