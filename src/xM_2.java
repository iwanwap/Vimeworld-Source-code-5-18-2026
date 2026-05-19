/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ata
 *  Bpa
 *  CB
 *  ERa
 *  JPa
 *  LQa
 *  Lqa
 *  MQa
 *  NQa
 *  NTa
 *  Ppa
 *  QSa
 *  Qsa
 *  Qta
 *  Uta
 *  WN
 *  XTa
 *  Ypa
 *  Yra
 *  aPa
 *  aQa
 *  aqa
 *  bqa
 *  cQa
 *  fpa
 *  hqa
 *  hra
 *  isa
 *  kpa
 *  lqa
 *  mn
 *  pPa
 *  uOa
 *  ura
 *  vRa
 *  wOa
 *  xM
 *  ysa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xM_2
extends GeneratedMessageLite<xM, mn>
implements CB {
    public static final int SCALEXEXPR_FIELD_NUMBER = 24;
    private boolean cyclic_;
    public static final int EASINGEXPR_FIELD_NUMBER = 11;
    private String scaleXExpr_;
    private int y_;
    private String xExpr_;
    private float scaleX_;
    public static final int SCALEY_FIELD_NUMBER = 8;
    public static final int SCALEYEXPR_FIELD_NUMBER = 25;
    public static final int ROTATEEXPR_FIELD_NUMBER = 22;
    private String scaleExpr_;
    private int duration_;
    private float scaleY_;
    private static final xM DEFAULT_INSTANCE;
    private String rotateExpr_;
    private String yExpr_;
    private xM next_;
    public static final int YEXACT_FIELD_NUMBER = 14;
    public static final int SCALEEXACT_FIELD_NUMBER = 16;
    public static final int CYCLIC_FIELD_NUMBER = 10;
    private float xExact_;
    public static final int NEXT_FIELD_NUMBER = 9;
    public static final int YEXPR_FIELD_NUMBER = 21;
    private int easing_;
    private int bitField0_;
    private int color_;
    public static final int XEXACT_FIELD_NUMBER = 13;
    private String scaleYExpr_;
    public static final int SCALEX_FIELD_NUMBER = 7;
    private float scaleYExact_;
    private float rotateExact_;
    public static final int ROTATE_FIELD_NUMBER = 5;
    private float scale_;
    public static final int SCALE_FIELD_NUMBER = 19;
    public static final int ROTATEEXACT_FIELD_NUMBER = 15;
    public static final int X_FIELD_NUMBER = 1;
    private float rotate_;
    public static final int Y_FIELD_NUMBER = 2;
    private float scaleXExact_;
    public static final int SCALEXEXACT_FIELD_NUMBER = 17;
    private int nextDelay_;
    public static final int EASING_FIELD_NUMBER = 6;
    public static final int COLOR_FIELD_NUMBER = 4;
    private float scaleExact_;
    public static final int SCALEYEXACT_FIELD_NUMBER = 18;
    private String easingExpr_ = Mqa.y;
    private int x_;
    public static final int XEXPR_FIELD_NUMBER = 20;
    public static final int NEXTDELAY_FIELD_NUMBER = 12;
    private static volatile Parser<xM> PARSER;
    public static final int DURATION_FIELD_NUMBER = 3;
    private float yExact_;
    public static final int SCALEEXPR_FIELD_NUMBER = 23;

    public static /* synthetic */ void e(xM xM2, int n2) {
        int b2 = n2;
        xM a2 = xM2;
        super.d(b2);
    }

    public static xM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void m() {
        a.bitField0_ &= mPa.w;
        a.scaleExact_ = JPa.N;
    }

    private void D(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.scaleX_ = b2;
    }

    public static /* synthetic */ void M(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ xM f() {
        return DEFAULT_INSTANCE;
    }

    private void E() {
        a.bitField0_ &= fpa.x;
        a.xExpr_ = xM_2.J().getXExpr();
    }

    private void K() {
        a.next_ = null;
        a.bitField0_ &= Uta.Z;
    }

    private void c() {
        a.bitField0_ &= Qsa.n;
        a.rotateExact_ = JPa.N;
    }

    private void B() {
        a.bitField0_ &= NQa.A;
        a.rotate_ = JPa.N;
    }

    static {
        xM_2 xM_22 = new xM_2();
        DEFAULT_INSTANCE = xM_22;
        GeneratedMessageLite.registerDefaultInstance(xM_2.class, xM_22);
    }

    public static /* synthetic */ void J(xM xM2, WN wN2) {
        xM b2 = wN2;
        xM a2 = xM2;
        super.J((WN)b2);
    }

    private void A(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= BPa.D;
        a2.scaleYExact_ = b2;
    }

    private void e(int n2) {
        int b2 = n2;
        xM_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.duration_ = b2;
    }

    public static xM J(byte[] a2) throws InvalidProtocolBufferException {
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void D(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.e(b2);
    }

    public String getXExpr() {
        xM_2 a2;
        return a2.xExpr_;
    }

    private void L() {
        a.bitField0_ &= Lqa.V;
        a.scale_ = JPa.N;
    }

    private void d(int n2) {
        int b2 = n2;
        xM_2 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.easing_ = b2;
    }

    public int getColor() {
        xM_2 a2;
        return a2.color_;
    }

    public static /* synthetic */ void A(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.J(b2);
    }

    public boolean hasDuration() {
        xM_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void M(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= pta.Ka;
        a2.scaleYExpr_ = b2;
    }

    public boolean hasScaleExact() {
        xM_2 a2;
        if ((a2.bitField0_ & CRa.Y) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasYExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & JPa.E) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getScaleExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.scaleExpr_);
    }

    public static /* synthetic */ void e(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.d((ByteString)b2);
    }

    public float getXExact() {
        xM_2 a2;
        return a2.xExact_;
    }

    public static /* synthetic */ void o(xM a2) {
        super.c();
    }

    private void e(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= Bpa.M;
        a2.rotateExpr_ = b2;
    }

    public float getYExact() {
        xM_2 a2;
        return a2.yExact_;
    }

    public static /* synthetic */ void i(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.C(b2);
    }

    public static /* synthetic */ void M(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.C((String)b2);
    }

    private void b() {
        a.bitField0_ &= ERa.Ka;
        a.y_ = uSa.E;
    }

    public static /* synthetic */ void d(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.M((ByteString)b2);
    }

    private void i(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.rotate_ = b2;
    }

    public static /* synthetic */ void M(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.f(b2);
    }

    public boolean hasScaleX() {
        xM_2 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getXExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.xExpr_);
    }

    public float getRotateExact() {
        xM_2 a2;
        return a2.rotateExact_;
    }

    public static /* synthetic */ void h(xM a2) {
        super.a();
    }

    private void M(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.xExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= MQa.Da;
    }

    public static /* synthetic */ void m(xM a2) {
        super.E();
    }

    private void a() {
        a.bitField0_ &= rQa.p;
        a.x_ = uSa.E;
    }

    private void H() {
        a.bitField0_ &= ppa.ca;
        a.nextDelay_ = uSa.E;
    }

    private void E(xM xM2) {
        xM_2 b2 = xM2;
        xM_2 a2 = this;
        b2.getClass();
        a2.next_ = b2;
        a2.bitField0_ |= cQa.z;
    }

    public boolean hasRotateExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & Bpa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.M(b2);
    }

    public static /* synthetic */ void e(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.f((String)b2);
    }

    public static /* synthetic */ void d(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.M((String)b2);
    }

    private void M(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= CRa.Y;
        a2.scaleExact_ = b2;
    }

    private void d(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= Pua.d;
        a2.scaleXExpr_ = b2;
    }

    @Deprecated
    public xM getNext() {
        xM_2 a2;
        if (a2.next_ == null) {
            return xM_2.J();
        }
        return a2.next_;
    }

    public static /* synthetic */ void J(xM xM2, boolean bl) {
        boolean b2 = bl;
        xM a2 = xM2;
        super.J(b2);
    }

    public static /* synthetic */ void C(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.C((ByteString)b2);
    }

    public static /* synthetic */ void l(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.l((ByteString)b2);
    }

    private void e(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= bqa.O;
        a2.scale_ = b2;
    }

    public String getEasingExpr() {
        xM_2 a2;
        return a2.easingExpr_;
    }

    public String getRotateExpr() {
        xM_2 a2;
        return a2.rotateExpr_;
    }

    public boolean hasY() {
        xM_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void K(xM a2) {
        super.m();
    }

    private void c(xM xM2) {
        xM_2 xM_22;
        xM_2 b2 = xM2;
        xM_2 a2 = this;
        b2.getClass();
        if (a2.next_ != null && a2.next_ != xM_2.J()) {
            a2.next_ = (xM_2)((mn)xM_2.J(a2.next_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_22 = a2;
        } else {
            xM_22 = a2;
            a2.next_ = b2;
        }
        xM_22.bitField0_ |= cQa.z;
    }

    private void g() {
        a.bitField0_ &= rSa.o;
        a.rotateExpr_ = xM_2.J().getRotateExpr();
    }

    public float getScaleXExact() {
        xM_2 a2;
        return a2.scaleXExact_;
    }

    public static /* synthetic */ void C(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.l((String)b2);
    }

    public boolean hasScaleXExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & Pua.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void B(xM a2) {
        super.e();
    }

    public static /* synthetic */ void L(xM a2) {
        super.l();
    }

    private void I() {
        a.bitField0_ &= pta.Z;
        a.scaleXExact_ = JPa.N;
    }

    private void J(WN wN2) {
        xM_2 b2 = wN2;
        xM_2 a2 = this;
        a2.easing_ = b2.getNumber();
        a2.bitField0_ |= fPa.i;
    }

    public boolean hasScaleY() {
        xM_2 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getY() {
        xM_2 a2;
        return a2.y_;
    }

    public static /* synthetic */ void d(xM xM2, int n2) {
        int b2 = n2;
        xM a2 = xM2;
        super.J(b2);
    }

    private void j() {
        a.bitField0_ &= Bta.u;
        a.scaleX_ = JPa.N;
    }

    private void F() {
        a.bitField0_ &= MTa.c;
        a.scaleY_ = JPa.N;
    }

    public boolean hasEasingExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static xM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getEasingExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.easingExpr_);
    }

    public static /* synthetic */ void b(xM a2) {
        super.A();
    }

    public static /* synthetic */ void a(xM a2) {
        super.M();
    }

    private void k() {
        a.bitField0_ &= XTa.T;
        a.yExact_ = JPa.N;
    }

    public static /* synthetic */ void l(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.e((String)b2);
    }

    public boolean hasScaleYExact() {
        xM_2 a2;
        if ((a2.bitField0_ & BPa.D) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Deprecated
    public boolean hasNext() {
        xM_2 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void G() {
        a.bitField0_ &= aQa.d;
        a.xExact_ = JPa.N;
    }

    public int getX() {
        xM_2 a2;
        return a2.x_;
    }

    public String getYExpr() {
        xM_2 a2;
        return a2.yExpr_;
    }

    public boolean hasXExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & MQa.Da) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void D() {
        a.bitField0_ &= fta.fa;
        a.easing_ = uSa.E;
    }

    private void C(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ysa.s;
        a2.easingExpr_ = b2;
    }

    public static /* synthetic */ void C(xM xM2, int n2) {
        int b2 = n2;
        xM a2 = xM2;
        super.l(b2);
    }

    public static /* synthetic */ void H(xM a2) {
        super.D();
    }

    private void d(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= qQa.O;
        a2.rotateExact_ = b2;
    }

    public static /* synthetic */ void f(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.J((String)b2);
    }

    public static /* synthetic */ void g(xM a2) {
        super.b();
    }

    public boolean hasScale() {
        xM_2 a2;
        if ((a2.bitField0_ & bqa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static xM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (xM_2)xM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(xM xM2, int n2) {
        int b2 = n2;
        xM a2 = xM2;
        super.e(b2);
    }

    public float getScaleYExact() {
        xM_2 a2;
        return a2.scaleYExact_;
    }

    public ByteString getScaleXExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.scaleXExpr_);
    }

    public int getNextDelay() {
        xM_2 a2;
        return a2.nextDelay_;
    }

    private void e(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.rotateExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= Bpa.M;
    }

    public static xM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public float getScaleY() {
        xM_2 a2;
        return a2.scaleY_;
    }

    public ByteString getRotateExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.rotateExpr_);
    }

    public String getScaleXExpr() {
        xM_2 a2;
        return a2.scaleXExpr_;
    }

    private void C(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.scaleY_ = b2;
    }

    public boolean getCyclic() {
        xM_2 a2;
        return a2.cyclic_;
    }

    public static /* synthetic */ void I(xM a2) {
        super.J();
    }

    public static xM f(InputStream a2) throws IOException {
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getEasingValue() {
        xM_2 a2;
        return a2.easing_;
    }

    public boolean hasRotate() {
        xM_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(xM xM2, int n2) {
        int b2 = n2;
        xM a2 = xM2;
        super.C(b2);
    }

    public boolean hasRotateExact() {
        xM_2 a2;
        if ((a2.bitField0_ & qQa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void d(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.scaleExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= APa.Aa;
    }

    public static /* synthetic */ void f(xM xM2, xM xM3) {
        xM b2 = xM3;
        xM a2 = xM2;
        super.c(b2);
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
        xM_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new xM_2();
            }
            case 2: {
                return new mn(null);
            }
            case 3: {
                Object[] objectArray = new Object[ITa.E];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = LQa.k;
                objectArray[uqa.g] = isa.I;
                objectArray[yRa.d] = Xpa.e;
                objectArray[AQa.P] = lQa.Ka;
                objectArray[tTa.h] = uSa.Ga;
                objectArray[uua.p] = Jqa.F;
                objectArray[XTa.W] = kra.fa;
                objectArray[Yqa.i] = Hta.fa;
                objectArray[WOa.fa] = Vra.X;
                objectArray[NTa.C] = rpa.o;
                objectArray[pPa.f] = lqa.a;
                objectArray[lqa.s] = aPa.e;
                objectArray[uua.s] = Ppa.Ga;
                objectArray[hpa.Z] = zpa.w;
                objectArray[Ypa.A] = cTa.W;
                objectArray[ERa.C] = sqa.i;
                objectArray[yta.Ka] = hqa.m;
                objectArray[yOa.B] = Ppa.Z;
                objectArray[wOa.t] = Ora.U;
                objectArray[kTa.j] = Yra.s;
                objectArray[wOa.h] = kTa.K;
                objectArray[cQa.o] = APa.n;
                objectArray[AQa.ba] = Qta.t;
                objectArray[osa.c] = Npa.H;
                objectArray[kTa.g] = Qsa.s;
                d2 = objectArray;
                Object b2 = APa.M;
                return xM_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = xM_2.class;
                synchronized (xM_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<xM>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void d(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.D(b2);
    }

    public int getDuration() {
        xM_2 a2;
        return a2.duration_;
    }

    private void A() {
        a.bitField0_ &= VPa.A;
        a.easingExpr_ = xM_2.J().getEasingExpr();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        xM_2 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.cyclic_ = b2;
    }

    public static /* synthetic */ void C(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.d(b2);
    }

    public String getScaleExpr() {
        xM_2 a2;
        return a2.scaleExpr_;
    }

    private void C(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.scaleYExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= pta.Ka;
    }

    private void C(int n2) {
        int b2 = n2;
        xM_2 a2 = this;
        a2.bitField0_ |= QSa.ba;
        a2.nextDelay_ = b2;
    }

    private xM_2() {
        xM_2 a2;
        a2.xExpr_ = Mqa.y;
        a2.yExpr_ = Mqa.y;
        a2.rotateExpr_ = Mqa.y;
        a2.scaleExpr_ = Mqa.y;
        a2.scaleXExpr_ = Mqa.y;
        a2.scaleYExpr_ = Mqa.y;
    }

    public static xM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.f((ByteString)b2);
    }

    public String getScaleYExpr() {
        xM_2 a2;
        return a2.scaleYExpr_;
    }

    public static mn J(xM a2) {
        return (mn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void j(xM a2) {
        super.K();
    }

    public boolean hasNextDelay() {
        xM_2 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void F(xM a2) {
        super.k();
    }

    private void l(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= uOa.M;
        a2.yExact_ = b2;
    }

    public float getScale() {
        xM_2 a2;
        return a2.scale_;
    }

    public static /* synthetic */ void k(xM a2) {
        super.j();
    }

    public float getRotate() {
        xM_2 a2;
        return a2.rotate_;
    }

    public static Parser<xM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.yExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= JPa.E;
    }

    private void f(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= opa.w;
        a2.scaleXExact_ = b2;
    }

    public static /* synthetic */ void J(xM xM2, ByteString byteString) {
        Object b2 = byteString;
        xM a2 = xM2;
        super.e((ByteString)b2);
    }

    private void i() {
        a.bitField0_ &= ZSa.O;
        a.scaleExpr_ = xM_2.J().getScaleExpr();
    }

    public static /* synthetic */ void G(xM a2) {
        super.L();
    }

    public boolean hasCyclic() {
        xM_2 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(int n2) {
        int b2 = n2;
        xM_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.x_ = b2;
    }

    public static mn J() {
        return (mn)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void l(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.l(b2);
    }

    public static xM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(int n2) {
        int b2 = n2;
        xM_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.color_ = b2;
    }

    private void l(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= APa.Aa;
        a2.scaleExpr_ = b2;
    }

    private void M() {
        a.bitField0_ &= kpa.w;
        a.duration_ = uSa.E;
    }

    private void e() {
        a.bitField0_ &= uua.W;
        a.yExpr_ = xM_2.J().getYExpr();
    }

    public boolean hasXExact() {
        xM_2 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasScaleXExact() {
        xM_2 a2;
        if ((a2.bitField0_ & opa.w) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasScaleYExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & pta.Ka) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void D(xM a2) {
        super.d();
    }

    public float getScaleExact() {
        xM_2 a2;
        return a2.scaleExact_;
    }

    public static /* synthetic */ void f(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.i(b2);
    }

    public static xM J(InputStream a2) throws IOException {
        return (xM_2)xM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasScaleExpr() {
        xM_2 a2;
        if ((a2.bitField0_ & APa.Aa) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void A(xM a2) {
        super.f();
    }

    public boolean hasX() {
        xM_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public WN getEasing() {
        xM_2 xM_22 = this;
        xM_2 a2 = WN.forNumber((int)xM_22.easing_);
        if (a2 == null) {
            return WN.UNRECOGNIZED;
        }
        return a2;
    }

    public float getScaleX() {
        xM_2 a2;
        return a2.scaleX_;
    }

    public static xM J(ByteString a2) throws InvalidProtocolBufferException {
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static xM J() {
        return DEFAULT_INSTANCE;
    }

    private void J(int n2) {
        int b2 = n2;
        xM_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.y_ = b2;
    }

    public ByteString getYExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.yExpr_);
    }

    public static /* synthetic */ void i(xM a2) {
        super.g();
    }

    public static xM J(CodedInputStream a2) throws IOException {
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void M(xM a2) {
        super.G();
    }

    private void d() {
        a.bitField0_ &= Ata.ca;
        a.scaleXExpr_ = xM_2.J().getScaleXExpr();
    }

    public static /* synthetic */ void J(xM xM2, xM xM3) {
        xM b2 = xM3;
        xM a2 = xM2;
        super.E(b2);
    }

    public static /* synthetic */ void e(xM a2) {
        super.I();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.easingExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= ysa.s;
    }

    public static /* synthetic */ void d(xM a2) {
        super.i();
    }

    public boolean hasYExact() {
        xM_2 a2;
        if ((a2.bitField0_ & uOa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static xM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (xM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C() {
        a.bitField0_ &= aqa.C;
        a.cyclic_ = uSa.E;
    }

    public static /* synthetic */ void C(xM a2) {
        super.F();
    }

    public static /* synthetic */ void l(xM a2) {
        super.C();
    }

    public static /* synthetic */ void J(xM xM2, int n2) {
        int b2 = n2;
        xM a2 = xM2;
        super.f(b2);
    }

    private void l() {
        a.bitField0_ &= pPa.W;
        a.scaleYExpr_ = xM_2.J().getScaleYExpr();
    }

    private void f() {
        a.bitField0_ &= Jra.Fa;
        a.color_ = uSa.E;
    }

    public boolean hasEasing() {
        xM_2 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(xM xM2, String string) {
        Object b2 = string;
        xM a2 = xM2;
        super.d((String)b2);
    }

    private void f(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= MQa.Da;
        a2.xExpr_ = b2;
    }

    private void J(String string) {
        String b2 = string;
        xM_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= JPa.E;
        a2.yExpr_ = b2;
    }

    public static /* synthetic */ void f(xM a2) {
        super.B();
    }

    public static /* synthetic */ void J(xM xM2, float f2) {
        float b2 = f2;
        xM a2 = xM2;
        super.A(b2);
    }

    public static /* synthetic */ void J(xM a2) {
        super.H();
    }

    public ByteString getScaleYExprBytes() {
        xM_2 a2;
        return ByteString.copyFromUtf8(a2.scaleYExpr_);
    }

    public boolean hasColor() {
        xM_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        xM_2 a2 = this;
        xM_2.checkByteStringIsUtf8(b2);
        a2.scaleXExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= Pua.d;
    }

    private void J() {
        a.bitField0_ &= yOa.Ha;
        a.scaleYExact_ = JPa.N;
    }

    private void J(float f2) {
        float b2 = f2;
        xM_2 a2 = this;
        a2.bitField0_ |= mPa.H;
        a2.xExact_ = b2;
    }
}

