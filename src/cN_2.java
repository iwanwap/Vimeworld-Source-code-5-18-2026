/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ata
 *  Bpa
 *  DQa
 *  ERa
 *  FTa
 *  Fpa
 *  Gua
 *  Hn
 *  ISa
 *  JPa
 *  JTa
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  QM
 *  QSa
 *  Qsa
 *  Qta
 *  Ssa
 *  TQa
 *  Tpa
 *  URa
 *  Uta
 *  Vua
 *  XTa
 *  Ypa
 *  aQa
 *  aqa
 *  bpa
 *  bqa
 *  cN
 *  cQa
 *  fpa
 *  ha
 *  hra
 *  isa
 *  kpa
 *  lqa
 *  pO
 *  pPa
 *  qta
 *  uOa
 *  uQa
 *  ura
 *  vRa
 *  wOa
 *  wra
 *  xOa
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
public final class cN_2
extends GeneratedMessageLite<cN, Qm>
implements ha {
    public static final int MOTIONZ_FIELD_NUMBER = 9;
    private String motionYExpr_;
    public static final int SPREADZ_FIELD_NUMBER = 6;
    private String motionZExpr_;
    public static final int SPREADMOTIONY_FIELD_NUMBER = 11;
    private QM attachment_;
    private int light_;
    private static volatile Parser<cN> PARSER;
    public static final int IMAGEPATH_FIELD_NUMBER = 28;
    private String offsetZExpr_;
    private float spreadZ_;
    private boolean dynamicLight_;
    public static final int FADE_FIELD_NUMBER = 34;
    private float scale_;
    public static final int SPREADSCALE_FIELD_NUMBER = 14;
    public static final int SCALE_FIELD_NUMBER = 13;
    public static final int AIRFRICTION_FIELD_NUMBER = 15;
    public static final int SPREADDELAY_FIELD_NUMBER = 22;
    private float spreadGifSpeed_;
    public static final int GIFSPEED_FIELD_NUMBER = 30;
    private int bitField1_;
    private float airFriction_;
    private float z_;
    private String offsetXExpr_;
    public static final int RESOURCE_FIELD_NUMBER = 29;
    private float spreadAirFriction_;
    private float spreadGravity_;
    public static final int GRAVITY_FIELD_NUMBER = 17;
    private int renderDistance_;
    private float gifSpeed_;
    private String delayExpr_;
    public static final int MOTIONYEXPR_FIELD_NUMBER = 40;
    public static final int MOTIONZEXPR_FIELD_NUMBER = 41;
    private int delay_;
    public static final int Z_FIELD_NUMBER = 3;
    private float spreadMotionZ_;
    private Object image_;
    private int fade_;
    public static final int SPREADDURATION_FIELD_NUMBER = 20;
    private float motionZ_;
    public static final int DURATION_FIELD_NUMBER = 19;
    public static final int OFFSETZEXPR_FIELD_NUMBER = 37;
    public static final int SPREADMOTIONZ_FIELD_NUMBER = 12;
    public static final int ATTACHMENT_FIELD_NUMBER = 33;
    public static final int SPREADGIFSPEED_FIELD_NUMBER = 31;
    private static final cN DEFAULT_INSTANCE;
    public static final int MOTIONXEXPR_FIELD_NUMBER = 39;
    private float spreadMotionY_;
    public static final int OFFSETYEXPR_FIELD_NUMBER = 36;
    private int bitField0_;
    public static final int RENDERDISTANCE_FIELD_NUMBER = 26;
    private int imageCase_ = uSa.E;
    private float x_;
    public static final int DELAYEXPR_FIELD_NUMBER = 38;
    private int color_;
    public static final int DYNAMICLIGHT_FIELD_NUMBER = 24;
    private String offsetYExpr_;
    private String motionXExpr_;
    private float motionX_;
    private float spreadY_;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int SPREADY_FIELD_NUMBER = 5;
    public static final int MOTIONY_FIELD_NUMBER = 8;
    public static final int SPREADGRAVITY_FIELD_NUMBER = 18;
    private float y_;
    public static final int DELAY_FIELD_NUMBER = 21;
    public static final int MOTIONX_FIELD_NUMBER = 7;
    public static final int LIGHT_FIELD_NUMBER = 23;
    public static final int SPREADMOTIONX_FIELD_NUMBER = 10;
    private int spreadDuration_;
    public static final int SPREADAIRFRICTION_FIELD_NUMBER = 16;
    private float spreadScale_;
    private int spreadDelay_;
    private int amount_;
    private float motionY_;
    private int randomMirror_;
    private float spreadX_;
    public static final int AMOUNT_FIELD_NUMBER = 32;
    private float spreadMotionX_;
    public static final int RANDOMMIRROR_FIELD_NUMBER = 27;
    public static final int OFFSETXEXPR_FIELD_NUMBER = 35;
    private float gravity_;
    private int duration_;
    public static final int SPREADX_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 25;

    private void S() {
        a.bitField0_ &= fta.fa;
        a.motionY_ = JPa.N;
    }

    public boolean hasMotionZ() {
        cN_2 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void L(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.I(b2);
    }

    private void G(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= MQa.Da;
        a2.spreadDelay_ = b2;
    }

    public boolean hasOffsetZExpr() {
        cN_2 a2;
        if ((a2.bitField0_ & ypa.L) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void i(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.J((String)b2);
    }

    public static /* synthetic */ void b(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.k(b2);
    }

    public static /* synthetic */ void S(cN a2) {
        super.z();
    }

    public boolean hasSpreadY() {
        cN_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void D(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= JPa.E;
        a2.light_ = b2;
    }

    public int getSpreadDelay() {
        cN_2 a2;
        return a2.spreadDelay_;
    }

    public static /* synthetic */ void i(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.C((ByteString)b2);
    }

    public static /* synthetic */ void n(cN a2) {
        super.L();
    }

    private void n() {
        a.bitField0_ &= Lqa.V;
        a.delay_ = uSa.E;
    }

    public static /* synthetic */ void a(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.l(b2);
    }

    public static /* synthetic */ void M(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.d((ByteString)b2);
    }

    private void A(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= APa.Aa;
        a2.color_ = b2;
    }

    public static /* synthetic */ void x(cN a2) {
        super.F();
    }

    public String getMotionXExpr() {
        cN_2 a2;
        return a2.motionXExpr_;
    }

    public static /* synthetic */ void H(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.i(b2);
    }

    public boolean hasDuration() {
        cN_2 a2;
        if ((a2.bitField0_ & opa.w) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void x() {
        a.bitField0_ &= Uta.Z;
        a.spreadMotionZ_ = JPa.N;
    }

    public static cN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void G(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.G(b2);
    }

    private void Q() {
        a.bitField0_ &= aqa.C;
        a.scale_ = JPa.N;
    }

    public static /* synthetic */ void Q(cN a2) {
        super.x();
    }

    private void Z() {
        a.bitField0_ &= vqa.F;
        a.offsetZExpr_ = cN_2.J().getOffsetZExpr();
    }

    public static cN J(CodedInputStream a2) throws IOException {
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void p() {
        a.bitField0_ &= rQa.p;
        a.amount_ = uSa.E;
    }

    public static /* synthetic */ void Z(cN a2) {
        super.i();
    }

    public boolean hasColor() {
        cN_2 a2;
        if ((a2.bitField0_ & APa.Aa) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasAirFriction() {
        cN_2 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasSpreadDuration() {
        cN_2 a2;
        if ((a2.bitField0_ & BPa.D) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void R() {
        a.bitField0_ &= uua.W;
        a.light_ = uSa.E;
    }

    private void i(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        cN_2 cN_22 = a2;
        cN_22.imageCase_ = EPa.O;
        cN_22.image_ = b2;
    }

    private void i(int n2) {
        cN_2 a2;
        int b2 = n2;
        cN_2 cN_22 = a2 = this;
        cN_22.imageCase_ = ITa.A;
        cN_22.image_ = b2;
    }

    public static /* synthetic */ void p(cN a2) {
        super.M();
    }

    public static /* synthetic */ void R(cN a2) {
        super.S();
    }

    public static /* synthetic */ void Y(cN a2) {
        super.K();
    }

    private void Y() {
        a.bitField0_ &= hra.ja;
        a.offsetXExpr_ = cN_2.J().getOffsetXExpr();
    }

    public boolean hasSpreadScale() {
        cN_2 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void U() {
        a.bitField1_ &= Jra.Fa;
        a.motionZExpr_ = cN_2.J().getMotionZExpr();
    }

    public boolean getDynamicLight() {
        cN_2 a2;
        return a2.dynamicLight_;
    }

    private void L(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.scale_ = b2;
    }

    public boolean hasSpreadDelay() {
        cN_2 a2;
        if ((a2.bitField0_ & MQa.Da) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getColor() {
        cN_2 a2;
        return a2.color_;
    }

    public static /* synthetic */ void U(cN a2) {
        super.a();
    }

    public static /* synthetic */ void e(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void P(cN a2) {
        super.Z();
    }

    private void P() {
        a.bitField0_ &= Jsa.la;
        a.fade_ = uSa.E;
    }

    private void M(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField1_ |= vRa.d;
        a2.delayExpr_ = b2;
    }

    private void b(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.z_ = b2;
    }

    private void e(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField1_ |= uqa.g;
        a2.motionXExpr_ = b2;
    }

    public boolean hasSpreadMotionX() {
        cN_2 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void s(cN a2) {
        super.s();
    }

    public int getAmount() {
        cN_2 a2;
        return a2.amount_;
    }

    public static /* synthetic */ void d(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.e((ByteString)b2);
    }

    public int getDuration() {
        cN_2 a2;
        return a2.duration_;
    }

    public boolean hasSpreadX() {
        cN_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void y(cN a2) {
        super.g();
    }

    public static /* synthetic */ void C(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.f((ByteString)b2);
    }

    public static /* synthetic */ void D(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.C(b2);
    }

    public String getImagePath() {
        cN_2 cN_22 = this;
        Object a2 = Mqa.y;
        if (cN_22.imageCase_ == EPa.O) {
            a2 = (String)cN_22.image_;
        }
        return a2;
    }

    private void s() {
        a.bitField0_ &= mPa.w;
        a.spreadGravity_ = JPa.N;
    }

    public float getSpreadX() {
        cN_2 a2;
        return a2.spreadX_;
    }

    public String getMotionZExpr() {
        cN_2 a2;
        return a2.motionZExpr_;
    }

    public ByteString getOffsetXExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.offsetXExpr_);
    }

    public boolean hasResource() {
        cN_2 a2;
        if (a2.imageCase_ == ITa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void M(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.i((String)b2);
    }

    private void y() {
        a.bitField1_ &= rQa.p;
        a.delayExpr_ = cN_2.J().getDelayExpr();
    }

    public static /* synthetic */ void l(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.l((ByteString)b2);
    }

    public static cN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cN_2)cN_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasDynamicLight() {
        cN_2 a2;
        if ((a2.bitField0_ & Bpa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void a(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= uOa.M;
        a2.spreadAirFriction_ = b2;
    }

    private void i(ByteString byteString) {
        cN_2 a2;
        ByteString b2 = byteString;
        cN_2 cN_22 = a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        cN_22.image_ = b2.toStringUtf8();
        cN_22.imageCase_ = EPa.O;
    }

    private void u() {
        a.attachment_ = null;
        a.bitField0_ &= Uta.V;
    }

    public static /* synthetic */ void u(cN a2) {
        super.q();
    }

    public boolean hasMotionX() {
        cN_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void A(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.d(b2);
    }

    private void H(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.spreadY_ = b2;
    }

    private void q() {
        a.bitField0_ &= yOa.Ha;
        a.spreadDuration_ = uSa.E;
    }

    private void M(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= Pua.d;
        a2.renderDistance_ = b2;
    }

    public static cN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void q(cN a2) {
        super.b();
    }

    private void e(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= kua.l;
        a2.fade_ = b2;
    }

    public boolean hasSpreadMotionZ() {
        cN_2 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getDelay() {
        cN_2 a2;
        return a2.delay_;
    }

    public static /* synthetic */ void z(cN a2) {
        super.E();
    }

    private void z() {
        cN_2 a2;
        if (a2.imageCase_ == EPa.O) {
            cN_2 cN_22 = a2;
            cN_22.imageCase_ = uSa.E;
            cN_22.image_ = null;
        }
    }

    public Hn getImageCase() {
        cN_2 a2;
        return Hn.forNumber((int)a2.imageCase_);
    }

    public float getSpreadMotionZ() {
        cN_2 a2;
        return a2.spreadMotionZ_;
    }

    public static /* synthetic */ void o(cN a2) {
        super.j();
    }

    private void o() {
        a.z_ = JPa.N;
    }

    private void M(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.offsetYExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= Qsa.X;
    }

    private void h() {
        a.bitField0_ &= MTa.c;
        a.spreadMotionY_ = JPa.N;
    }

    public static /* synthetic */ void e(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.e((String)b2);
    }

    private void J(jM jM2) {
        jM b2 = jM2;
        cN_2 a2 = this;
        a2.randomMirror_ = b2.getNumber();
        a2.bitField0_ |= pta.Ka;
    }

    public static /* synthetic */ void h(cN a2) {
        super.C();
    }

    public static cN J(byte[] a2) throws InvalidProtocolBufferException {
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getSpreadAirFriction() {
        cN_2 a2;
        return a2.spreadAirFriction_;
    }

    public static /* synthetic */ void i(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.M(b2);
    }

    public static cN J(ByteString a2) throws InvalidProtocolBufferException {
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasGifSpeed() {
        cN_2 a2;
        if ((a2.bitField0_ & MTa.x) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static cN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getSpreadGravity() {
        cN_2 a2;
        return a2.spreadGravity_;
    }

    private void d(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= BPa.D;
        a2.spreadDuration_ = b2;
    }

    public float getScale() {
        cN_2 a2;
        return a2.scale_;
    }

    public static /* synthetic */ void g(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.a(b2);
    }

    private void C(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= bqa.O;
        a2.delay_ = b2;
    }

    public boolean hasDelay() {
        cN_2 a2;
        if ((a2.bitField0_ & bqa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ cN f() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<cN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void e(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.offsetZExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= ypa.L;
    }

    public static /* synthetic */ void m(cN a2) {
        super.Y();
    }

    public boolean hasSpreadAirFriction() {
        cN_2 a2;
        if ((a2.bitField0_ & uOa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void I(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.C(b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        cN_2 a2 = this;
        a2.bitField0_ |= Bpa.M;
        a2.dynamicLight_ = b2;
    }

    private void d(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ypa.L;
        a2.offsetZExpr_ = b2;
    }

    public static /* synthetic */ void d(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.C((String)b2);
    }

    public static /* synthetic */ void j(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.b(b2);
    }

    public QM getAttachment() {
        cN_2 a2;
        if (a2.attachment_ == null) {
            return QM.f();
        }
        return a2.attachment_;
    }

    public float getGifSpeed() {
        cN_2 a2;
        return a2.gifSpeed_;
    }

    public static /* synthetic */ void E(cN a2) {
        super.m();
    }

    public static /* synthetic */ void K(cN a2) {
        super.D();
    }

    public boolean hasDelayExpr() {
        cN_2 a2;
        if ((a2.bitField1_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void d(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.offsetXExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= Wqa.Ja;
    }

    public boolean hasRenderDistance() {
        cN_2 a2;
        if ((a2.bitField0_ & Pua.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void c(cN a2) {
        super.h();
    }

    public float getX() {
        cN_2 a2;
        return a2.x_;
    }

    public static /* synthetic */ void M(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.i(b2);
    }

    private void g(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= mPa.H;
        a2.airFriction_ = b2;
    }

    public float getSpreadZ() {
        cN_2 a2;
        return a2.spreadZ_;
    }

    private void m() {
        a.bitField0_ &= VPa.A;
        a.motionZ_ = JPa.N;
    }

    public boolean hasSpreadMotionY() {
        cN_2 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasOffsetYExpr() {
        cN_2 a2;
        if ((a2.bitField0_ & Qsa.X) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void I(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= Vua.f;
        a2.spreadGifSpeed_ = b2;
    }

    public static /* synthetic */ void F(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.H(b2);
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
        cN_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new cN_2();
            }
            case 2: {
                return new Qm(null);
            }
            case 3: {
                Object[] objectArray = new Object[iSa.x];
                objectArray[uSa.E] = gQa.f;
                objectArray[vRa.d] = xOa.N;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = uSa.ja;
                objectArray[AQa.P] = LQa.k;
                objectArray[tTa.h] = isa.I;
                objectArray[uua.p] = DQa.Z;
                objectArray[XTa.W] = LRa.B;
                objectArray[Yqa.i] = EPa.v;
                objectArray[WOa.fa] = uQa.j;
                objectArray[NTa.C] = Qsa.z;
                objectArray[pPa.f] = WRa.F;
                objectArray[lqa.s] = JTa.C;
                objectArray[uua.s] = Gua.L;
                objectArray[hpa.Z] = QTa.ha;
                objectArray[Ypa.A] = sSa.ca;
                objectArray[ERa.C] = Ora.U;
                objectArray[yta.Ka] = Qta.H;
                objectArray[yOa.B] = bpa.N;
                objectArray[wOa.t] = wua.Ka;
                objectArray[kTa.j] = Nra.F;
                objectArray[wOa.h] = SPa.ga;
                objectArray[cQa.o] = Xpa.e;
                objectArray[AQa.ba] = kua.t;
                objectArray[osa.c] = WOa.x;
                objectArray[kTa.g] = UOa.w;
                objectArray[ITa.E] = Ssa.Z;
                objectArray[Lra.e] = MQa.v;
                objectArray[EPa.O] = lQa.Ka;
                objectArray[ITa.A] = URa.b;
                objectArray[Fsa.d] = Qra.C;
                objectArray[tua.U] = JPa.C;
                objectArray[fPa.i] = BPa.fa;
                objectArray[Zqa.G] = xua.K;
                objectArray[Tpa.z] = Hta.Q;
                objectArray[TQa.ca] = AQa.u;
                objectArray[Qsa.Ha] = Qsa.E;
                objectArray[LQa.c] = vqa.x;
                objectArray[ISa.E] = mPa.f;
                objectArray[CRa.L] = Fpa.I;
                objectArray[wra.P] = Bpa.J;
                objectArray[kra.U] = MQa.q;
                objectArray[cQa.i] = gQa.Y;
                d2 = objectArray;
                Object b2 = FTa.I;
                return cN_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = cN_2.class;
                synchronized (cN_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<cN>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void B(cN a2) {
        super.J();
    }

    private void E() {
        a.bitField0_ &= aQa.d;
        a.airFriction_ = JPa.N;
    }

    public static /* synthetic */ void L(cN a2) {
        super.I();
    }

    public static /* synthetic */ void k(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.G(b2);
    }

    public static /* synthetic */ void f(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.i((ByteString)b2);
    }

    private void K() {
        a.bitField0_ &= rSa.o;
        a.dynamicLight_ = uSa.E;
    }

    public boolean hasMotionY() {
        cN_2 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void b(cN a2) {
        super.U();
    }

    public static /* synthetic */ void G(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.M(b2);
    }

    public static /* synthetic */ void a(cN a2) {
        super.d();
    }

    public float getSpreadScale() {
        cN_2 a2;
        return a2.spreadScale_;
    }

    public static /* synthetic */ void H(cN a2) {
        super.B();
    }

    public static /* synthetic */ void J(cN cN2, boolean bl) {
        boolean b2 = bl;
        cN a2 = cN2;
        super.J(b2);
    }

    public float getZ() {
        cN_2 a2;
        return a2.z_;
    }

    public jM getRandomMirror() {
        cN_2 cN_22 = this;
        jM a2 = jM.forNumber(cN_22.randomMirror_);
        if (a2 == null) {
            return jM.UNRECOGNIZED;
        }
        return a2;
    }

    public float getSpreadMotionX() {
        cN_2 a2;
        return a2.spreadMotionX_;
    }

    public static /* synthetic */ void g(cN a2) {
        super.k();
    }

    public static /* synthetic */ void I(cN a2) {
        super.A();
    }

    public static /* synthetic */ void D(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.A(b2);
    }

    private void C(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField1_ |= AQa.P;
        a2.motionYExpr_ = b2;
    }

    public String getOffsetXExpr() {
        cN_2 a2;
        return a2.offsetXExpr_;
    }

    public boolean hasOffsetXExpr() {
        cN_2 a2;
        if ((a2.bitField0_ & Wqa.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= Qsa.X;
        a2.offsetYExpr_ = b2;
    }

    private void j(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.spreadMotionZ_ = b2;
    }

    private void F(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.y_ = b2;
    }

    public String getMotionYExpr() {
        cN_2 a2;
        return a2.motionYExpr_;
    }

    public boolean hasAttachment() {
        cN_2 a2;
        if ((a2.bitField0_ & wsa.v) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void c() {
        a.bitField0_ &= ppa.ca;
        a.spreadScale_ = JPa.N;
    }

    private void B() {
        a.x_ = JPa.N;
    }

    private void L() {
        a.bitField0_ &= Ata.ca;
        a.renderDistance_ = uSa.E;
    }

    public static cN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(cN cN2, jM jM2) {
        Object b2 = jM2;
        cN a2 = cN2;
        super.J((jM)b2);
    }

    private void f(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField1_ |= Yqa.i;
        a2.motionZExpr_ = b2;
    }

    private void k(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.motionZ_ = b2;
    }

    private void G(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= qQa.O;
        a2.gravity_ = b2;
    }

    private void D(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.spreadMotionY_ = b2;
    }

    static {
        cN_2 cN_22 = new cN_2();
        DEFAULT_INSTANCE = cN_22;
        GeneratedMessageLite.registerDefaultInstance(cN_2.class, cN_22);
    }

    public int getRenderDistance() {
        cN_2 a2;
        return a2.renderDistance_;
    }

    public static /* synthetic */ void j(cN a2) {
        super.c();
    }

    public String getOffsetYExpr() {
        cN_2 a2;
        return a2.offsetYExpr_;
    }

    public static /* synthetic */ void F(cN a2) {
        super.f();
    }

    public static /* synthetic */ void C(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.f((String)b2);
    }

    public static /* synthetic */ void e(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.A(b2);
    }

    public static /* synthetic */ void d(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.D(b2);
    }

    public static /* synthetic */ void A(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.D(b2);
    }

    public boolean hasMotionZExpr() {
        cN_2 a2;
        if ((a2.bitField1_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void b() {
        a.bitField1_ &= ERa.Ka;
        a.motionXExpr_ = cN_2.J().getMotionXExpr();
    }

    public float getY() {
        cN_2 a2;
        return a2.y_;
    }

    public static /* synthetic */ void i(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.f(b2);
    }

    private void A(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= CRa.Y;
        a2.spreadGravity_ = b2;
    }

    private void a() {
        a.bitField0_ &= qta.U;
        a.spreadGifSpeed_ = JPa.N;
    }

    public boolean hasMotionYExpr() {
        cN_2 a2;
        if ((a2.bitField1_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getMotionZ() {
        cN_2 a2;
        return a2.motionZ_;
    }

    public static cN f(InputStream a2) throws IOException {
        return (cN_2)cN_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void H() {
        a.bitField0_ &= XTa.T;
        a.spreadAirFriction_ = JPa.N;
    }

    private void g() {
        a.bitField0_ &= Jra.Fa;
        a.spreadZ_ = JPa.N;
    }

    public float getSpreadY() {
        cN_2 a2;
        return a2.spreadY_;
    }

    private void I() {
        a.bitField0_ &= Qsa.n;
        a.gravity_ = JPa.N;
    }

    public static /* synthetic */ void M(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.L(b2);
    }

    public static /* synthetic */ void k(cN a2) {
        super.e();
    }

    public float getGravity() {
        cN_2 a2;
        return a2.gravity_;
    }

    public boolean hasSpreadZ() {
        cN_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasImagePath() {
        cN_2 a2;
        if (a2.imageCase_ == EPa.O) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.e(b2);
    }

    public static /* synthetic */ void G(cN a2) {
        super.u();
    }

    public static cN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.motionXExpr_ = b2.toStringUtf8();
        a2.bitField1_ |= uqa.g;
    }

    public static /* synthetic */ void D(cN a2) {
        super.R();
    }

    public static /* synthetic */ void C(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.e(b2);
    }

    public ByteString getMotionXExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.motionXExpr_);
    }

    public static /* synthetic */ void f(cN cN2, QM qM2) {
        cN b2 = qM2;
        cN a2 = cN2;
        super.J((QM)b2);
    }

    public static /* synthetic */ void d(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.d(b2);
    }

    public int getFade() {
        cN_2 a2;
        return a2.fade_;
    }

    public boolean hasMotionXExpr() {
        cN_2 a2;
        if ((a2.bitField1_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.F(b2);
    }

    public ByteString getOffsetZExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.offsetZExpr_);
    }

    public static cN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void j() {
        a.bitField1_ &= kpa.w;
        a.motionYExpr_ = cN_2.J().getMotionYExpr();
    }

    private void i(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= QSa.ba;
        a2.spreadScale_ = b2;
    }

    public int getRandomMirrorValue() {
        cN_2 a2;
        return a2.randomMirror_;
    }

    private void F() {
        a.bitField0_ &= Tpa.y;
        a.gifSpeed_ = JPa.N;
    }

    public boolean hasLight() {
        cN_2 a2;
        if ((a2.bitField0_ & JPa.E) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasGravity() {
        cN_2 a2;
        if ((a2.bitField0_ & qQa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.M((String)b2);
    }

    public float getMotionY() {
        cN_2 a2;
        return a2.motionY_;
    }

    public ByteString getImagePathBytes() {
        cN_2 cN_22 = this;
        Object a2 = Mqa.y;
        if (cN_22.imageCase_ == EPa.O) {
            a2 = (String)cN_22.image_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void M(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.spreadMotionX_ = b2;
    }

    public static Qm J() {
        return (Qm)DEFAULT_INSTANCE.createBuilder();
    }

    public ByteString getMotionZExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.motionZExpr_);
    }

    public static /* synthetic */ void l(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.j(b2);
    }

    private void k() {
        a.bitField0_ &= kpa.w;
        a.spreadY_ = JPa.N;
    }

    private void G() {
        a.bitField0_ &= NQa.A;
        a.motionX_ = JPa.N;
    }

    public static /* synthetic */ void f(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.l((String)b2);
    }

    private void e(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.motionX_ = b2;
    }

    private void d(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.spreadX_ = b2;
    }

    public float getMotionX() {
        cN_2 a2;
        return a2.motionX_;
    }

    public float getAirFriction() {
        cN_2 a2;
        return a2.airFriction_;
    }

    private void D() {
        cN_2 a2;
        if (a2.imageCase_ == ITa.A) {
            cN_2 cN_22 = a2;
            cN_22.imageCase_ = uSa.E;
            cN_22.image_ = null;
        }
    }

    private void A() {
        a.bitField0_ &= pta.Z;
        a.duration_ = uSa.E;
    }

    public static /* synthetic */ void A(cN a2) {
        super.H();
    }

    public static /* synthetic */ void l(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.J(b2);
    }

    private void C(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.motionY_ = b2;
    }

    private void f(QM qM2) {
        cN_2 cN_22;
        cN_2 b2 = qM2;
        cN_2 a2 = this;
        b2.getClass();
        if (a2.attachment_ != null && a2.attachment_ != QM.f()) {
            a2.attachment_ = (QM)((pO)QM.J((QM)a2.attachment_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            cN_22 = a2;
        } else {
            cN_22 = a2;
            a2.attachment_ = b2;
        }
        cN_22.bitField0_ |= wsa.v;
    }

    public static cN J(InputStream a2) throws IOException {
        return (cN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getResource() {
        cN_2 a2;
        if (a2.imageCase_ == ITa.A) {
            return (Integer)a2.image_;
        }
        return uSa.E;
    }

    public static /* synthetic */ void f(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.l(b2);
    }

    private void l(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.spreadZ_ = b2;
    }

    private void i() {
        a.bitField0_ &= zua.l;
        a.offsetYExpr_ = cN_2.J().getOffsetYExpr();
    }

    public static /* synthetic */ void J(cN cN2, String string) {
        Object b2 = string;
        cN a2 = cN2;
        super.d((String)b2);
    }

    private void M() {
        a.bitField0_ &= pPa.W;
        a.randomMirror_ = uSa.E;
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.motionYExpr_ = b2.toStringUtf8();
        a2.bitField1_ |= AQa.P;
    }

    public static /* synthetic */ void i(cN a2) {
        super.n();
    }

    public static /* synthetic */ void M(cN a2) {
        super.p();
    }

    private void f(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.x_ = b2;
    }

    public static /* synthetic */ void e(cN a2) {
        super.o();
    }

    private void J(float f2) {
        float b2 = f2;
        cN_2 a2 = this;
        a2.bitField0_ |= MTa.x;
        a2.gifSpeed_ = b2;
    }

    public boolean hasScale() {
        cN_2 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getMotionYExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.motionYExpr_);
    }

    public boolean hasAmount() {
        cN_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= opa.w;
        a2.duration_ = b2;
    }

    public static /* synthetic */ void J(cN cN2, int n2) {
        int b2 = n2;
        cN a2 = cN2;
        super.f(b2);
    }

    public boolean hasSpreadGravity() {
        cN_2 a2;
        if ((a2.bitField0_ & CRa.Y) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(cN a2) {
        super.Q();
    }

    public float getSpreadMotionY() {
        cN_2 a2;
        return a2.spreadMotionY_;
    }

    private void J(String string) {
        String b2 = string;
        cN_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= Wqa.Ja;
        a2.offsetXExpr_ = b2;
    }

    public boolean hasFade() {
        cN_2 a2;
        if ((a2.bitField0_ & kua.l) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.J(b2);
    }

    private void e() {
        cN_2 a2;
        cN_2 cN_22 = a2;
        cN_22.imageCase_ = uSa.E;
        cN_22.image_ = null;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.delayExpr_ = b2.toStringUtf8();
        a2.bitField1_ |= vRa.d;
    }

    private void f(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= pta.Ka;
        a2.randomMirror_ = b2;
    }

    public String getDelayExpr() {
        cN_2 a2;
        return a2.delayExpr_;
    }

    private void d() {
        a.y_ = JPa.N;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        cN_2 a2 = this;
        cN_2.checkByteStringIsUtf8(b2);
        a2.motionZExpr_ = b2.toStringUtf8();
        a2.bitField1_ |= Yqa.i;
    }

    private void J(QM qM2) {
        cN_2 b2 = qM2;
        cN_2 a2 = this;
        b2.getClass();
        a2.attachment_ = b2;
        a2.bitField0_ |= wsa.v;
    }

    private void J(int n2) {
        int b2 = n2;
        cN_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.amount_ = b2;
    }

    public boolean hasRandomMirror() {
        cN_2 a2;
        if ((a2.bitField0_ & pta.Ka) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        a.bitField0_ &= fpa.x;
        a.spreadDelay_ = uSa.E;
    }

    private cN_2() {
        cN_2 a2;
        a2.offsetXExpr_ = Mqa.y;
        a2.offsetYExpr_ = Mqa.y;
        a2.offsetZExpr_ = Mqa.y;
        a2.delayExpr_ = Mqa.y;
        a2.motionXExpr_ = Mqa.y;
        a2.motionYExpr_ = Mqa.y;
        a2.motionZExpr_ = Mqa.y;
    }

    public boolean hasSpreadGifSpeed() {
        cN_2 a2;
        if ((a2.bitField0_ & Vua.f) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getOffsetZExpr() {
        cN_2 a2;
        return a2.offsetZExpr_;
    }

    public static /* synthetic */ void C(cN a2) {
        super.y();
    }

    public static /* synthetic */ void l(cN a2) {
        super.P();
    }

    public ByteString getDelayExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.delayExpr_);
    }

    public static /* synthetic */ void J(cN cN2, QM qM2) {
        cN b2 = qM2;
        cN a2 = cN2;
        super.f((QM)b2);
    }

    public static Qm J(cN a2) {
        return (Qm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(cN a2) {
        super.l();
    }

    public static /* synthetic */ void J(cN cN2, ByteString byteString) {
        Object b2 = byteString;
        cN a2 = cN2;
        super.M((ByteString)b2);
    }

    private void l() {
        a.bitField0_ &= ZSa.O;
        a.color_ = uSa.E;
    }

    private void f() {
        a.bitField0_ &= Bta.u;
        a.spreadMotionX_ = JPa.N;
    }

    public float getSpreadGifSpeed() {
        cN_2 a2;
        return a2.spreadGifSpeed_;
    }

    public static /* synthetic */ void J(cN a2) {
        super.G();
    }

    public ByteString getOffsetYExprBytes() {
        cN_2 a2;
        return ByteString.copyFromUtf8(a2.offsetYExpr_);
    }

    public int getSpreadDuration() {
        cN_2 a2;
        return a2.spreadDuration_;
    }

    public static /* synthetic */ void J(cN cN2, float f2) {
        float b2 = f2;
        cN a2 = cN2;
        super.g(b2);
    }

    public int getLight() {
        cN_2 a2;
        return a2.light_;
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.spreadX_ = JPa.N;
    }

    public static cN J() {
        return DEFAULT_INSTANCE;
    }
}

