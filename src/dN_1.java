/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Al
 *  ERa
 *  KM
 *  LM
 *  Lqa
 *  NQa
 *  NTa
 *  QSa
 *  Qsa
 *  Rk
 *  SOa
 *  URa
 *  Uta
 *  Vua
 *  WN
 *  XTa
 *  Xl
 *  Ypa
 *  ZRa
 *  aQa
 *  aSa
 *  aqa
 *  bqa
 *  cQa
 *  co
 *  dN
 *  eo
 *  hra
 *  jo
 *  kj
 *  kpa
 *  lO
 *  lo
 *  lqa
 *  mO
 *  pPa
 *  pqa
 *  sM
 *  uOa
 *  uQa
 *  ura
 *  vRa
 *  wOa
 *  ya
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
public final class dN_1
extends GeneratedMessageLite<dN, lO>
implements ya {
    private int startFade_;
    private jo eLine_;
    public static final int DURATION_FIELD_NUMBER = 3;
    private String editEasingExpr_;
    public static final int FRUSTUM_FIELD_NUMBER = 9;
    public static final int EDIRECTDRAW_FIELD_NUMBER = 16;
    private boolean depthTest_;
    public static final int EDITEASING_FIELD_NUMBER = 12;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int ELINE_FIELD_NUMBER = 15;
    private int editDuration_;
    public static final int DEPTHTEST_FIELD_NUMBER = 18;
    private static final dN DEFAULT_INSTANCE;
    public static final int EDITDURATION_FIELD_NUMBER = 11;
    private int renderDistance_;
    private int kind_;
    private String id_ = Mqa.y;
    private boolean hoverable_;
    private int finishFade_;
    public static final int STARTFADE_FIELD_NUMBER = 4;
    public static final int HOVERRANGE_FIELD_NUMBER = 8;
    private Rk visibility_;
    public static final int VISIBILITY_FIELD_NUMBER = 10;
    private int bitField0_;
    public static final int FOGTEST_FIELD_NUMBER = 19;
    public static final int KIND_FIELD_NUMBER = 1;
    private boolean fogTest_;
    public static final int ESPHERE_FIELD_NUMBER = 17;
    private eo eBeamPartial_;
    private boolean frustum_;
    public static final int EBEAMPARTIAL_FIELD_NUMBER = 14;
    public static final int FINISHFADE_FIELD_NUMBER = 5;
    public static final int EDITEASINGEXPR_FIELD_NUMBER = 20;
    private long duration_;
    public static final int EWORLDGROUP_FIELD_NUMBER = 13;
    private kj eWorldGroup_;
    private KM eDirectDraw_;
    public static final int HOVERABLE_FIELD_NUMBER = 7;
    private int hoverRange_;
    private int editEasing_;
    public static final int RENDERDISTANCE_FIELD_NUMBER = 6;
    private co eSphere_;
    private static volatile Parser<dN> PARSER;

    public static /* synthetic */ void f(dN dN2, Rk rk2) {
        dN b2 = rk2;
        dN a2 = dN2;
        super.f((Rk)b2);
    }

    public static dN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasHoverable() {
        dN_1 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void L(dN a2) {
        super.d();
    }

    public static /* synthetic */ void b(dN a2) {
        super.A();
    }

    public static /* synthetic */ void M(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.J(b2);
    }

    public static /* synthetic */ void J(dN dN2, lo lo2) {
        dN b2 = lo2;
        dN a2 = dN2;
        super.J((lo)b2);
    }

    private void f(eo eo2) {
        dN_1 b2 = eo2;
        dN_1 a2 = this;
        b2.getClass();
        a2.eBeamPartial_ = b2;
        a2.bitField0_ |= CRa.Y;
    }

    public boolean hasFrustum() {
        dN_1 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void a(dN a2) {
        super.j();
    }

    public static /* synthetic */ void e(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.C(b2);
    }

    private void M(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.startFade_ = b2;
    }

    public boolean hasDepthTest() {
        dN_1 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getEditEasingExprBytes() {
        dN_1 a2;
        return ByteString.copyFromUtf8(a2.editEasingExpr_);
    }

    public static /* synthetic */ void H(dN a2) {
        super.H();
    }

    public boolean hasEBeamPartial() {
        dN_1 a2;
        if ((a2.bitField0_ & CRa.Y) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean getHoverable() {
        dN_1 a2;
        return a2.hoverable_;
    }

    private void e(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.finishFade_ = b2;
    }

    public ByteString getIdBytes() {
        dN_1 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    private void J(WN wN2) {
        dN_1 b2 = wN2;
        dN_1 a2 = this;
        a2.editEasing_ = b2.getNumber();
        a2.bitField0_ |= ura.V;
    }

    public static /* synthetic */ void g(dN a2) {
        super.l();
    }

    public int getFinishFade() {
        dN_1 a2;
        return a2.finishFade_;
    }

    public int getKindValue() {
        dN_1 a2;
        return a2.kind_;
    }

    public static /* synthetic */ void I(dN a2) {
        super.i();
    }

    private void L() {
        a.bitField0_ &= Uta.Z;
        a.editDuration_ = uSa.E;
    }

    public static /* synthetic */ void f(dN dN2, eo eo2) {
        dN b2 = eo2;
        dN a2 = dN2;
        super.f((eo)b2);
    }

    public static /* synthetic */ void f(dN dN2, jo jo2) {
        dN b2 = jo2;
        dN a2 = dN2;
        super.J((jo)b2);
    }

    private void b() {
        a.bitField0_ &= Jra.Fa;
        a.finishFade_ = uSa.E;
    }

    public static /* synthetic */ void j(dN a2) {
        super.M();
    }

    private void f(KM kM2) {
        dN_1 b2 = kM2;
        dN_1 a2 = this;
        b2.getClass();
        a2.eDirectDraw_ = b2;
        a2.bitField0_ |= BPa.D;
    }

    public static /* synthetic */ void f(dN dN2, kj kj2) {
        dN b2 = kj2;
        dN a2 = dN2;
        super.f((kj)b2);
    }

    private void a() {
        a.bitField0_ &= aqa.C;
        a.editEasing_ = uSa.E;
    }

    public static /* synthetic */ void f(dN dN2, KM kM2) {
        dN b2 = kM2;
        dN a2 = dN2;
        super.f((KM)b2);
    }

    private void d(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.renderDistance_ = b2;
    }

    private void H() {
        a.eWorldGroup_ = null;
        a.bitField0_ &= Qsa.n;
    }

    public Rk getVisibility() {
        dN_1 a2;
        if (a2.visibility_ == null) {
            return Rk.J();
        }
        return a2.visibility_;
    }

    private void g() {
        a.bitField0_ &= XTa.T;
        a.fogTest_ = uSa.E;
    }

    public int getHoverRange() {
        dN_1 a2;
        return a2.hoverRange_;
    }

    public boolean getFrustum() {
        dN_1 a2;
        return a2.frustum_;
    }

    private void C(boolean bl) {
        boolean b2 = bl;
        dN_1 a2 = this;
        a2.bitField0_ |= mPa.H;
        a2.depthTest_ = b2;
    }

    public int getStartFade() {
        dN_1 a2;
        return a2.startFade_;
    }

    public boolean hasEditDuration() {
        dN_1 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasELine() {
        dN_1 a2;
        if ((a2.bitField0_ & opa.w) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(Rk rk2) {
        dN_1 b2 = rk2;
        dN_1 a2 = this;
        b2.getClass();
        a2.visibility_ = b2;
        a2.bitField0_ |= hra.Ja;
    }

    public static /* synthetic */ void F(dN a2) {
        super.e();
    }

    public static /* synthetic */ void J(dN dN2, kj kj2) {
        dN b2 = kj2;
        dN a2 = dN2;
        super.J((kj)b2);
    }

    public static /* synthetic */ void d(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.e(b2);
    }

    public static /* synthetic */ void k(dN a2) {
        super.L();
    }

    public static dN J(CodedInputStream a2) throws IOException {
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(String string) {
        String b2 = string;
        dN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public static /* synthetic */ void C(dN dN2, boolean bl) {
        boolean b2 = bl;
        dN a2 = dN2;
        super.C(b2);
    }

    public boolean hasStartFade() {
        dN_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void G(dN a2) {
        super.J();
    }

    private void C(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.editEasing_ = b2;
    }

    public int getEditEasingValue() {
        dN_1 a2;
        return a2.editEasing_;
    }

    public static /* synthetic */ void D(dN a2) {
        super.f();
    }

    public static /* synthetic */ void f(dN dN2, String string) {
        Object b2 = string;
        dN a2 = dN2;
        super.J((String)b2);
    }

    public boolean hasRenderDistance() {
        dN_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasDuration() {
        dN_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void I() {
        a.eBeamPartial_ = null;
        a.bitField0_ &= mPa.w;
    }

    private void j() {
        a.bitField0_ &= aQa.d;
        a.depthTest_ = uSa.E;
    }

    public static /* synthetic */ void A(dN a2) {
        super.C();
    }

    private void f(kj kj2) {
        dN_1 dN_12;
        dN_1 b2 = kj2;
        dN_1 a2 = this;
        b2.getClass();
        if (a2.eWorldGroup_ != null && a2.eWorldGroup_ != kj.J()) {
            a2.eWorldGroup_ = (kj)((Xl)kj.J((kj)a2.eWorldGroup_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            dN_12 = a2;
        } else {
            dN_12 = a2;
            a2.eWorldGroup_ = b2;
        }
        dN_12.bitField0_ |= qQa.O;
    }

    public boolean hasEDirectDraw() {
        dN_1 a2;
        if ((a2.bitField0_ & BPa.D) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(co co2) {
        dN_1 b2 = co2;
        dN_1 a2 = this;
        b2.getClass();
        a2.eSphere_ = b2;
        a2.bitField0_ |= bqa.O;
    }

    public co getESphere() {
        dN_1 a2;
        if (a2.eSphere_ == null) {
            return co.J();
        }
        return a2.eSphere_;
    }

    public static /* synthetic */ void i(dN a2) {
        super.F();
    }

    public static dN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public jo getELine() {
        dN_1 a2;
        if (a2.eLine_ == null) {
            return jo.J();
        }
        return a2.eLine_;
    }

    public eo getEBeamPartial() {
        dN_1 a2;
        if (a2.eBeamPartial_ == null) {
            return eo.f();
        }
        return a2.eBeamPartial_;
    }

    public static /* synthetic */ void f(dN dN2, co co2) {
        dN b2 = co2;
        dN a2 = dN2;
        super.f((co)b2);
    }

    public static dN f(InputStream a2) throws IOException {
        return (dN_1)dN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        dN_1 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.hoverable_ = b2;
    }

    private dN_1() {
        dN_1 a2;
        a2.editEasingExpr_ = Mqa.y;
    }

    public static /* synthetic */ void M(dN a2) {
        super.G();
    }

    private void F() {
        a.bitField0_ &= ppa.ca;
        a.editEasingExpr_ = dN_1.f().getEditEasingExpr();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        dN_1 a2 = this;
        dN_1.checkByteStringIsUtf8(b2);
        a2.editEasingExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= QSa.ba;
    }

    public static /* synthetic */ void e(dN a2) {
        super.I();
    }

    private void k() {
        a.bitField0_ &= VPa.A;
        a.hoverRange_ = uSa.E;
    }

    public static /* synthetic */ void J(dN dN2, co co2) {
        dN b2 = co2;
        dN a2 = dN2;
        super.J((co)b2);
    }

    public static lO J(dN a2) {
        return (lO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public boolean hasFinishFade() {
        dN_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public lo getKind() {
        dN_1 dN_12 = this;
        dN_1 a2 = lo.forNumber((int)dN_12.kind_);
        if (a2 == null) {
            return lo.UNRECOGNIZED;
        }
        return a2;
    }

    public boolean hasId() {
        dN_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static dN f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void C(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.l(b2);
    }

    public static dN J(InputStream a2) throws IOException {
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static dN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.d(b2);
    }

    public static /* synthetic */ void l(dN dN2, boolean bl) {
        boolean b2 = bl;
        dN a2 = dN2;
        super.J(b2);
    }

    static {
        dN_1 dN_12 = new dN_1();
        DEFAULT_INSTANCE = dN_12;
        GeneratedMessageLite.registerDefaultInstance(dN_1.class, dN_12);
    }

    private void J(lo lo2) {
        dN_1 b2 = lo2;
        dN_1 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    public boolean hasEditEasingExpr() {
        dN_1 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void G() {
        a.kind_ = uSa.E;
    }

    private void J(String string) {
        String b2 = string;
        dN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= QSa.ba;
        a2.editEasingExpr_ = b2;
    }

    private void D() {
        a.bitField0_ &= fta.fa;
        a.hoverable_ = uSa.E;
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        dN_1 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.frustum_ = b2;
    }

    public static /* synthetic */ void f(dN dN2, ByteString byteString) {
        Object b2 = byteString;
        dN a2 = dN2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void J(dN dN2, KM kM2) {
        dN b2 = kM2;
        dN a2 = dN2;
        super.J((KM)b2);
    }

    public static /* synthetic */ void J(dN dN2, jo jo2) {
        dN b2 = jo2;
        dN a2 = dN2;
        super.f((jo)b2);
    }

    private void A() {
        a.eLine_ = null;
        a.bitField0_ &= pta.Z;
    }

    public boolean hasVisibility() {
        dN_1 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static dN J(byte[] a2) throws InvalidProtocolBufferException {
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(jo jo2) {
        dN_1 dN_12;
        dN_1 b2 = jo2;
        dN_1 a2 = this;
        b2.getClass();
        if (a2.eLine_ != null && a2.eLine_ != jo.J()) {
            a2.eLine_ = (jo)((LM)jo.J((jo)a2.eLine_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            dN_12 = a2;
        } else {
            dN_12 = a2;
            a2.eLine_ = b2;
        }
        dN_12.bitField0_ |= opa.w;
    }

    public KM getEDirectDraw() {
        dN_1 a2;
        if (a2.eDirectDraw_ == null) {
            return KM.f();
        }
        return a2.eDirectDraw_;
    }

    private void J(long a2) {
        b.bitField0_ |= uqa.g;
        b.duration_ = a2;
    }

    public static /* synthetic */ void d(dN a2) {
        super.D();
    }

    public boolean hasESphere() {
        dN_1 a2;
        if ((a2.bitField0_ & bqa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(dN dN2, String string) {
        Object b2 = string;
        dN a2 = dN2;
        super.f((String)b2);
    }

    private void l(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.editDuration_ = b2;
    }

    private void i() {
        a.bitField0_ &= ERa.Ka;
        a.duration_ = nqa.i;
    }

    private void M() {
        a.eSphere_ = null;
        a.bitField0_ &= Lqa.V;
    }

    public static dN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public long getDuration() {
        dN_1 a2;
        return a2.duration_;
    }

    private void J(co co2) {
        dN_1 dN_12;
        dN_1 b2 = co2;
        dN_1 a2 = this;
        b2.getClass();
        if (a2.eSphere_ != null && a2.eSphere_ != co.J()) {
            a2.eSphere_ = (co)((uM)co.J((co)a2.eSphere_).mergeFrom(b2)).buildPartial();
            dN_12 = a2;
        } else {
            dN_12 = a2;
            a2.eSphere_ = b2;
        }
        dN_12.bitField0_ |= bqa.O;
    }

    private void e() {
        a.visibility_ = null;
        a.bitField0_ &= MTa.c;
    }

    public static dN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(dN dN2, ByteString byteString) {
        Object b2 = byteString;
        dN a2 = dN2;
        super.f((ByteString)b2);
    }

    public boolean hasEWorldGroup() {
        dN_1 a2;
        if ((a2.bitField0_ & qQa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.hoverRange_ = b2;
    }

    public kj getEWorldGroup() {
        dN_1 a2;
        if (a2.eWorldGroup_ == null) {
            return kj.J();
        }
        return a2.eWorldGroup_;
    }

    private void J(jo jo2) {
        dN_1 b2 = jo2;
        dN_1 a2 = this;
        b2.getClass();
        a2.eLine_ = b2;
        a2.bitField0_ |= opa.w;
    }

    private void d() {
        a.bitField0_ &= rQa.p;
        a.id_ = dN_1.f().getId();
    }

    public static /* synthetic */ void J(dN b2, long a2) {
        super.J(a2);
    }

    private void J(kj kj2) {
        dN_1 b2 = kj2;
        dN_1 a2 = this;
        b2.getClass();
        a2.eWorldGroup_ = b2;
        a2.bitField0_ |= qQa.O;
    }

    private void J(KM kM2) {
        dN_1 dN_12;
        dN_1 b2 = kM2;
        dN_1 a2 = this;
        b2.getClass();
        if (a2.eDirectDraw_ != null && a2.eDirectDraw_ != KM.f()) {
            a2.eDirectDraw_ = (KM)((sM)KM.J((KM)a2.eDirectDraw_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            dN_12 = a2;
        } else {
            dN_12 = a2;
            a2.eDirectDraw_ = b2;
        }
        dN_12.bitField0_ |= BPa.D;
    }

    public static /* synthetic */ void J(dN dN2, eo eo2) {
        dN b2 = eo2;
        dN a2 = dN2;
        super.J((eo)b2);
    }

    private void J(Rk rk2) {
        dN_1 dN_12;
        dN_1 b2 = rk2;
        dN_1 a2 = this;
        b2.getClass();
        if (a2.visibility_ != null && a2.visibility_ != Rk.J()) {
            a2.visibility_ = (Rk)((Al)Rk.J((Rk)a2.visibility_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            dN_12 = a2;
        } else {
            dN_12 = a2;
            a2.visibility_ = b2;
        }
        dN_12.bitField0_ |= hra.Ja;
    }

    private void C() {
        a.bitField0_ &= NQa.A;
        a.renderDistance_ = uSa.E;
    }

    private void l() {
        a.bitField0_ &= kpa.w;
        a.startFade_ = uSa.E;
    }

    private void f() {
        a.eDirectDraw_ = null;
        a.bitField0_ &= yOa.Ha;
    }

    public int getEditDuration() {
        dN_1 a2;
        return a2.editDuration_;
    }

    public boolean hasEditEasing() {
        dN_1 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.M(b2);
    }

    public static /* synthetic */ void J(dN dN2, Rk rk2) {
        dN b2 = rk2;
        dN a2 = dN2;
        super.J((Rk)b2);
    }

    public boolean hasHoverRange() {
        dN_1 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(dN a2) {
        super.a();
    }

    public static /* synthetic */ void f(dN dN2, boolean bl) {
        boolean b2 = bl;
        dN a2 = dN2;
        super.l(b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        dN_1 a2 = this;
        a2.bitField0_ |= uOa.M;
        a2.fogTest_ = b2;
    }

    public static /* synthetic */ void l(dN a2) {
        super.b();
    }

    public static dN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (dN_1)dN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(dN dN2, boolean bl) {
        boolean b2 = bl;
        dN a2 = dN2;
        super.f(b2);
    }

    public String getEditEasingExpr() {
        dN_1 a2;
        return a2.editEasingExpr_;
    }

    public int getRenderDistance() {
        dN_1 a2;
        return a2.renderDistance_;
    }

    private void J(int n2) {
        int b2 = n2;
        dN_1 a2 = this;
        a2.kind_ = b2;
    }

    public boolean hasFogTest() {
        dN_1 a2;
        if ((a2.bitField0_ & uOa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(dN dN2, WN wN2) {
        dN b2 = wN2;
        dN a2 = dN2;
        super.J((WN)b2);
    }

    public static dN J(ByteString a2) throws InvalidProtocolBufferException {
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public WN getEditEasing() {
        dN_1 dN_12 = this;
        dN_1 a2 = WN.forNumber((int)dN_12.editEasing_);
        if (a2 == null) {
            return WN.UNRECOGNIZED;
        }
        return a2;
    }

    private void J(eo eo2) {
        dN_1 dN_12;
        dN_1 b2 = eo2;
        dN_1 a2 = this;
        b2.getClass();
        if (a2.eBeamPartial_ != null && a2.eBeamPartial_ != eo.f()) {
            a2.eBeamPartial_ = (eo)((mO)eo.J((eo)a2.eBeamPartial_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            dN_12 = a2;
        } else {
            dN_12 = a2;
            a2.eBeamPartial_ = b2;
        }
        dN_12.bitField0_ |= CRa.Y;
    }

    public boolean getFogTest() {
        dN_1 a2;
        return a2.fogTest_;
    }

    public static Parser<dN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public String getId() {
        dN_1 a2;
        return a2.id_;
    }

    public static /* synthetic */ dN J() {
        return DEFAULT_INSTANCE;
    }

    public static dN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (dN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(dN a2) {
        super.k();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        dN_1 a2 = this;
        dN_1.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void J(dN a2) {
        super.g();
    }

    public static /* synthetic */ void J(dN dN2, int n2) {
        int b2 = n2;
        dN a2 = dN2;
        super.f(b2);
    }

    private void J() {
        a.bitField0_ &= Bta.u;
        a.frustum_ = uSa.E;
    }

    public boolean getDepthTest() {
        dN_1 a2;
        return a2.depthTest_;
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
        dN_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new dN_1();
            }
            case 2: {
                return new lO(null);
            }
            case 3: {
                Object[] objectArray = new Object[wOa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aSa.u;
                objectArray[uqa.g] = uQa.Aa;
                objectArray[yRa.d] = Xpa.e;
                objectArray[AQa.P] = aua.h;
                objectArray[tTa.h] = Hta.s;
                objectArray[uua.p] = URa.b;
                objectArray[XTa.W] = LRa.S;
                objectArray[Yqa.i] = xqa.H;
                objectArray[WOa.fa] = lTa.R;
                objectArray[NTa.C] = bsa.g;
                objectArray[pPa.f] = rpa.u;
                objectArray[lqa.s] = lQa.c;
                objectArray[uua.s] = ZRa.t;
                objectArray[hpa.Z] = tSa.d;
                objectArray[Ypa.A] = Fsa.L;
                objectArray[ERa.C] = SOa.ja;
                objectArray[yta.Ka] = uSa.Da;
                objectArray[yOa.B] = Vua.b;
                objectArray[wOa.t] = tSa.R;
                objectArray[kTa.j] = pqa.ca;
                d2 = objectArray;
                Object b2 = BPa.e;
                return dN_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = dN_1.class;
                synchronized (dN_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<dN>(DEFAULT_INSTANCE);
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

    public static lO J() {
        return (lO)DEFAULT_INSTANCE.createBuilder();
    }
}

