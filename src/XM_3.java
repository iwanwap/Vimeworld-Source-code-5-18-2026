/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ata
 *  Bpa
 *  Dn
 *  ERa
 *  FM
 *  FPa
 *  Fm
 *  ISa
 *  JN
 *  JPa
 *  Jo
 *  Km
 *  LQa
 *  Lqa
 *  Lra
 *  MQa
 *  NQa
 *  NTa
 *  OL
 *  QSa
 *  Qqa
 *  Qsa
 *  Rn
 *  SOa
 *  TQa
 *  Tm
 *  To
 *  Tpa
 *  UN
 *  Uta
 *  Vo
 *  Vua
 *  WJ
 *  Wn
 *  XM
 *  XTa
 *  Yo
 *  Ypa
 *  Yra
 *  Zua
 *  aN
 *  aQa
 *  aSa
 *  an
 *  aqa
 *  bqa
 *  cQa
 *  cRa
 *  cm
 *  dl
 *  em
 *  fpa
 *  go
 *  hN
 *  hTa
 *  hra
 *  iPa
 *  isa
 *  kpa
 *  lqa
 *  nk
 *  oO
 *  pL
 *  pPa
 *  qK
 *  qO
 *  qta
 *  uOa
 *  uQa
 *  uRa
 *  un
 *  ura
 *  vRa
 *  wOa
 *  wn
 *  wra
 *  xN
 *  ysa
 *  zk
 *  zn
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
public final class XM_3
extends GeneratedMessageLite<XM, Jo>
implements va {
    private static final XM DEFAULT_INSTANCE;
    private float x_;
    public static final int SCALEYEXPR_FIELD_NUMBER = 38;
    private cm eMiniDot_;
    private long duration_;
    public static final int EPLAYER_FIELD_NUMBER = 45;
    public static final int ANIMATION_FIELD_NUMBER = 13;
    private int bitField0_;
    private xN eRadialSlider_;
    public static final int TOOLTIPDRAWVANILLABACKGROUND_FIELD_NUMBER = 43;
    private OL eTextTimer_;
    private Km eImage_;
    public static final int ETABLE_FIELD_NUMBER = 28;
    private xm behavior_;
    private boolean floatPosition_;
    public static final int ID_FIELD_NUMBER = 1;
    private boolean tooltipDrawVanillaBackground_;
    public static final int XEXPR_FIELD_NUMBER = 33;
    public static final int EIMAGE_FIELD_NUMBER = 24;
    public static final int ETEXTCLOCK_FIELD_NUMBER = 23;
    private float y_;
    private SJ eTextInput_;
    public static final int TOOLTIP_FIELD_NUMBER = 17;
    private int delay_;
    public static final int EBUTTON_FIELD_NUMBER = 29;
    public static final int BEHAVIOR_FIELD_NUMBER = 18;
    private int kind_;
    private Bm eProgressTimer_;
    public static final int EIMAGE9SLICE_FIELD_NUMBER = 36;
    public static final int FLOATPOSITION_FIELD_NUMBER = 16;
    public static final int VISIBILITY_FIELD_NUMBER = 31;
    public static final int UUID_FIELD_NUMBER = 44;
    public static final int COLOR_FIELD_NUMBER = 7;
    public static final int YEXPR_FIELD_NUMBER = 34;
    public static final int SCALEX_FIELD_NUMBER = 8;
    public static final int ROTATE_FIELD_NUMBER = 6;
    public static final int X_FIELD_NUMBER = 4;
    public static final int ETEXT_FIELD_NUMBER = 21;
    public static final int SCALEY_FIELD_NUMBER = 9;
    private Dn eButton_;
    private String hoverGroup_;
    private pL eText_;
    private int bitField1_;
    private int position_;
    private rm eContainer_;
    public static final int SCALEXEXPR_FIELD_NUMBER = 37;
    private Fm eRectangle_;
    private float scaleX_;
    private Internal.ProtobufList<String> tooltip_;
    public static final int EMINIDOT_FIELD_NUMBER = 41;
    public static final int SCALE_FIELD_NUMBER = 19;
    private String xExpr_;
    private static volatile Parser<XM> PARSER;
    private yl visibility_;
    public static final int ATTACHMENT_FIELD_NUMBER = 12;
    private em eImage9Slice_;
    private wn onClick_;
    private Wn eRadialProgressBar_;
    public static final int ONCLICK_FIELD_NUMBER = 14;
    private UN animation_;
    public static final int HOVERGROUP_FIELD_NUMBER = 39;
    private To eTable_;
    public static final int ETEXTTIMER_FIELD_NUMBER = 22;
    private String scaleYExpr_;
    private ByteString uuid_;
    public static final int ROTATEEXPR_FIELD_NUMBER = 35;
    private jn attachment_;
    private float scaleY_;
    public static final int DELAY_FIELD_NUMBER = 10;
    public static final int ERADIALPROGRESSBAR_FIELD_NUMBER = 27;
    private boolean hoverable_;
    public static final int EMODEL_FIELD_NUMBER = 42;
    private String scaleXExpr_;
    public static final int ECONTAINER_FIELD_NUMBER = 30;
    public static final int DURATION_FIELD_NUMBER = 3;
    private Hm ePlayer_;
    public static final int ERADIALSLIDER_FIELD_NUMBER = 40;
    private String rotateExpr_;
    public static final int Y_FIELD_NUMBER = 5;
    public static final int ETEXTINPUT_FIELD_NUMBER = 32;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int POSITION_FIELD_NUMBER = 11;
    private qO eProgressBar_;
    private aN eModel_;
    private int color_;
    private String yExpr_;
    private float rotate_;
    public static final int EPROGRESSTIMER_FIELD_NUMBER = 26;
    public static final int EPROGRESSBAR_FIELD_NUMBER = 25;
    private float scale_;
    public static final int HOVERABLE_FIELD_NUMBER = 15;
    public static final int ERECTANGLE_FIELD_NUMBER = 20;
    private dl eTextClock_;
    private String id_ = Mqa.y;

    private void i(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= fPa.i;
        a2.xExpr_ = b2;
    }

    private void W() {
        a.eProgressBar_ = null;
        a.bitField0_ &= vqa.F;
    }

    @Override
    public Wn getERadialProgressBar() {
        XM_3 a2;
        if (a2.eRadialProgressBar_ == null) {
            return Wn.J();
        }
        return a2.eRadialProgressBar_;
    }

    private void l(boolean bl2) {
        boolean b2 = bl2;
        XM_3 a2 = this;
        a2.bitField0_ |= Bpa.M;
        a2.floatPosition_ = b2;
    }

    private void t() {
        a.eButton_ = null;
        a.bitField1_ &= Jra.Fa;
    }

    @Override
    public xN getERadialSlider() {
        XM_3 a2;
        if (a2.eRadialSlider_ == null) {
            return xN.J();
        }
        return a2.eRadialSlider_;
    }

    public static /* synthetic */ void f(XM xM2, Wn wn2) {
        XM b2 = wn2;
        XM a2 = xM2;
        super.f((Wn)b2);
    }

    public static /* synthetic */ void t(XM a2) {
        super.c();
    }

    private void e(float f2) {
        float b2 = f2;
        XM_3 a2 = this;
        a2.bitField0_ |= mPa.H;
        a2.scaleY_ = b2;
    }

    public static /* synthetic */ void r(XM a2) {
        super.J();
    }

    public static /* synthetic */ void i(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.M((String)b2);
    }

    private void r() {
        a.bitField0_ &= ERa.Ka;
        a.uuid_ = XM_3.J().getUuid();
    }

    @Override
    public int getColor() {
        XM_3 a2;
        return a2.color_;
    }

    private void f(wn wn2) {
        XM_3 b2 = wn2;
        XM_3 a2 = this;
        b2.getClass();
        a2.onClick_ = b2;
        a2.bitField0_ |= MQa.Da;
    }

    private void f(em em2) {
        XM_3 xM_3;
        XM_3 b2 = em2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eImage9Slice_ != null && a2.eImage9Slice_ != em.f()) {
            a2.eImage9Slice_ = (em)((Vo)em.J((em)a2.eImage9Slice_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eImage9Slice_ = b2;
        }
        xM_3.bitField1_ |= ysa.s;
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
        XM_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new XM_3();
            }
            case 2: {
                return new Jo(null);
            }
            case 3: {
                Object[] objectArray = new Object[uOa.F];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uSa.ja;
                objectArray[uqa.g] = uQa.Aa;
                objectArray[yRa.d] = aSa.u;
                objectArray[AQa.P] = Xpa.e;
                objectArray[tTa.h] = LQa.k;
                objectArray[uua.p] = isa.I;
                objectArray[XTa.W] = uSa.Ga;
                objectArray[Yqa.i] = lQa.Ka;
                objectArray[WOa.fa] = kra.fa;
                objectArray[NTa.C] = Hta.fa;
                objectArray[pPa.f] = WOa.x;
                objectArray[lqa.s] = aQa.Da;
                objectArray[uua.s] = Hta.Q;
                objectArray[hpa.Z] = STa.W;
                objectArray[Ypa.A] = ISa.Z;
                objectArray[ERa.C] = LRa.S;
                objectArray[yta.Ka] = Qqa.Da;
                objectArray[yOa.B] = Npa.E;
                objectArray[wOa.t] = rSa.V;
                objectArray[kTa.j] = Ora.U;
                objectArray[wOa.h] = hpa.A;
                objectArray[cQa.o] = cRa.l;
                objectArray[AQa.ba] = sSa.H;
                objectArray[osa.c] = FPa.Ha;
                objectArray[kTa.g] = Iqa.r;
                objectArray[ITa.E] = Zua.fa;
                objectArray[Lra.e] = POa.K;
                objectArray[EPa.O] = SOa.Ha;
                objectArray[ITa.A] = Fsa.R;
                objectArray[Fsa.d] = gQa.H;
                objectArray[tua.U] = LRa.M;
                objectArray[fPa.i] = bsa.g;
                objectArray[Zqa.G] = xTa.n;
                objectArray[Tpa.z] = Yra.s;
                objectArray[TQa.ca] = kTa.K;
                objectArray[Qsa.Ha] = APa.n;
                objectArray[LQa.c] = iPa.M;
                objectArray[ISa.E] = Npa.H;
                objectArray[CRa.L] = Qsa.s;
                objectArray[wra.P] = aQa.l;
                objectArray[kra.U] = Qqa.G;
                objectArray[cQa.i] = uRa.e;
                objectArray[iSa.x] = XTa.A;
                objectArray[Yqa.D] = APa.ga;
                objectArray[wra.e] = hTa.u;
                objectArray[Bpa.Ha] = LQa.j;
                d2 = objectArray;
                Object b2 = hra.A;
                return XM_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = XM_3.class;
                synchronized (XM_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<XM>(DEFAULT_INSTANCE);
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

    @Override
    public ByteString getIdBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    private void M(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public static /* synthetic */ void f(XM xM2, pL pL2) {
        XM b2 = pL2;
        XM a2 = xM2;
        super.f((pL)b2);
    }

    public static /* synthetic */ void M(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.f((String)b2);
    }

    @Override
    public float getScaleX() {
        XM_3 a2;
        return a2.scaleX_;
    }

    private void w() {
        a.bitField0_ &= Uta.Z;
        a.color_ = uSa.E;
    }

    public static /* synthetic */ void f(XM xM2, qO qO2) {
        XM b2 = qO2;
        XM a2 = xM2;
        super.J((qO)b2);
    }

    private void f(xm xm2) {
        GeneratedMessageLite b2 = xm2;
        XM_3 a2 = this;
        b2.getClass();
        a2.behavior_ = b2;
        a2.bitField0_ |= Pua.d;
    }

    @Override
    public boolean hasETextTimer() {
        XM_3 a2;
        if ((a2.bitField0_ & kua.l) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(XM xM2, SJ sJ2) {
        Object b2 = sJ2;
        XM a2 = xM2;
        super.J((SJ)b2);
    }

    @Override
    public ByteString getScaleYExprBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.scaleYExpr_);
    }

    public static /* synthetic */ void A(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void f(XM xM2, Hm hm2) {
        Object b2 = hm2;
        XM a2 = xM2;
        super.f((Hm)b2);
    }

    private void f(pL pL2) {
        XM_3 xM_3;
        XM_3 b2 = pL2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eText_ != null && a2.eText_ != pL.J()) {
            a2.eText_ = (pL)((qK)pL.J((pL)a2.eText_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eText_ = b2;
        }
        xM_3.bitField0_ |= wsa.v;
    }

    @Override
    public boolean hasERadialProgressBar() {
        XM_3 a2;
        if ((a2.bitField1_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(XM xM2, wn wn2) {
        XM b2 = wn2;
        XM a2 = xM2;
        super.J((wn)b2);
    }

    public static /* synthetic */ void e(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.J((String)b2);
    }

    private void f(Dn dn2) {
        XM_3 b2 = dn2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eButton_ = b2;
        a2.bitField1_ |= Yqa.i;
    }

    public static /* synthetic */ void i(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.A((ByteString)b2);
    }

    private void f(Fm fm2) {
        XM_3 xM_3;
        XM_3 b2 = fm2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eRectangle_ != null && a2.eRectangle_ != Fm.f()) {
            a2.eRectangle_ = (Fm)((zn)Fm.J((Fm)a2.eRectangle_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eRectangle_ = b2;
        }
        xM_3.bitField0_ |= Vua.f;
    }

    @Override
    public boolean hasBehavior() {
        XM_3 a2;
        if ((a2.bitField0_ & Pua.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(qO qO2) {
        XM_3 b2 = qO2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eProgressBar_ = b2;
        a2.bitField0_ |= ypa.L;
    }

    @Override
    public boolean hasXExpr() {
        XM_3 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasDuration() {
        XM_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public dl getETextClock() {
        XM_3 a2;
        if (a2.eTextClock_ == null) {
            return dl.f();
        }
        return a2.eTextClock_;
    }

    public static XM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public boolean hasEMiniDot() {
        XM_3 a2;
        if ((a2.bitField1_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void w(XM a2) {
        super.Z();
    }

    private void A(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.yExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= ysa.s;
    }

    public static XM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasEImage9Slice() {
        XM_3 a2;
        if ((a2.bitField1_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void S(XM a2) {
        super.o();
    }

    private void S() {
        a.kind_ = uSa.E;
    }

    public static /* synthetic */ void e(XM xM2, float f2) {
        float b2 = f2;
        XM a2 = xM2;
        super.J(b2);
    }

    private void i(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.scaleXExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= uOa.M;
    }

    public static /* synthetic */ void n(XM a2) {
        super.b();
    }

    private void n() {
        a.bitField0_ &= pta.Z;
        a.position_ = uSa.E;
    }

    public static /* synthetic */ void J(XM xM2, an an2) {
        XM b2 = an2;
        XM a2 = xM2;
        super.J((an)b2);
    }

    public static /* synthetic */ void f(XM xM2, UN uN2) {
        XM b2 = uN2;
        XM a2 = xM2;
        super.f((UN)b2);
    }

    private void x() {
        XM_3 xM_3 = this;
        Internal.ProtobufList<String> a2 = xM_3.tooltip_;
        if (!a2.isModifiable()) {
            xM_3.tooltip_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public boolean getFloatPosition() {
        XM_3 a2;
        return a2.floatPosition_;
    }

    private void e(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= hra.Ja;
        a2.rotateExpr_ = b2;
    }

    @Override
    public boolean hasAttachment() {
        XM_3 a2;
        if ((a2.bitField0_ & BPa.D) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasEContainer() {
        XM_3 a2;
        if ((a2.bitField1_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasScale() {
        XM_3 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(Bm bm2) {
        GeneratedMessageLite b2 = bm2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eProgressTimer_ = b2;
        a2.bitField1_ |= vRa.d;
    }

    @Override
    public String getRotateExpr() {
        XM_3 a2;
        return a2.rotateExpr_;
    }

    @Override
    public boolean hasVisibility() {
        XM_3 a2;
        if ((a2.bitField0_ & pta.Ka) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(cm cm2) {
        XM_3 xM_3;
        XM_3 b2 = cm2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eMiniDot_ != null && a2.eMiniDot_ != cm.J()) {
            a2.eMiniDot_ = (cm)((Yo)cm.J((cm)a2.eMiniDot_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eMiniDot_ = b2;
        }
        xM_3.bitField1_ |= hra.Ja;
    }

    private void Q() {
        a.eContainer_ = null;
        a.bitField1_ &= NQa.A;
    }

    @Override
    public boolean hasEProgressTimer() {
        XM_3 a2;
        if ((a2.bitField1_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(XM xM2, xm xm2) {
        Object b2 = xm2;
        XM a2 = xM2;
        super.f((xm)b2);
    }

    private void f(rm rm2) {
        GeneratedMessageLite b2 = rm2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eContainer_ = b2;
        a2.bitField1_ |= ERa.C;
    }

    private void f(xN xN2) {
        XM_3 xM_3;
        XM_3 b2 = xN2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eRadialSlider_ != null && a2.eRadialSlider_ != xN.J()) {
            a2.eRadialSlider_ = (xN)((oo)xN.J((xN)a2.eRadialSlider_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eRadialSlider_ = b2;
        }
        xM_3.bitField1_ |= XOa.h;
    }

    @Override
    public boolean hasHoverable() {
        XM_3 a2;
        if ((a2.bitField0_ & JPa.E) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void d(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        XM_3 xM_3 = a2;
        xM_3.x();
        xM_3.tooltip_.add(b2);
    }

    @Override
    public float getRotate() {
        XM_3 a2;
        return a2.rotate_;
    }

    public static XM J(ByteString a2) throws InvalidProtocolBufferException {
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(XM xM2, yl yl2) {
        Object b2 = yl2;
        XM a2 = xM2;
        super.f((yl)b2);
    }

    private void f(UN uN2) {
        XM_3 xM_3;
        XM_3 b2 = uN2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.animation_ != null && a2.animation_ != UN.J()) {
            a2.animation_ = (UN)((eM)UN.J((UN)a2.animation_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.animation_ = b2;
        }
        xM_3.bitField0_ |= bqa.O;
    }

    @Override
    public boolean hasId() {
        XM_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void Z() {
        a.bitField0_ &= rQa.p;
        a.id_ = XM_3.J().getId();
    }

    @Override
    public boolean hasScaleY() {
        XM_3 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasRotateExpr() {
        XM_3 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void x(XM a2) {
        super.E();
    }

    private void d(float f2) {
        float b2 = f2;
        XM_3 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.x_ = b2;
    }

    public static /* synthetic */ void f(XM xM2, rm rm2) {
        Object b2 = rm2;
        XM a2 = xM2;
        super.J((rm)b2);
    }

    private void p() {
        a.bitField0_ &= ppa.ca;
        a.scaleX_ = JPa.N;
    }

    public static /* synthetic */ void Q(XM a2) {
        super.h();
    }

    public static /* synthetic */ void C(XM xM2, int n2) {
        int b2 = n2;
        XM a2 = xM2;
        super.C(b2);
    }

    private void C(int n2) {
        int b2 = n2;
        XM_3 a2 = this;
        a2.kind_ = b2;
    }

    @Override
    public boolean hasEText() {
        XM_3 a2;
        if ((a2.bitField0_ & wsa.v) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void R() {
        a.bitField0_ &= aQa.d;
        a.scaleY_ = JPa.N;
    }

    private void Y() {
        a.bitField0_ &= mPa.w;
        a.delay_ = uSa.E;
    }

    public static /* synthetic */ void Z(XM a2) {
        super.R();
    }

    private void C(float f2) {
        float b2 = f2;
        XM_3 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.y_ = b2;
    }

    private void f(dl dl2) {
        XM_3 xM_3;
        XM_3 b2 = dl2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eTextClock_ != null && a2.eTextClock_ != dl.f()) {
            a2.eTextClock_ = (dl)((QK)dl.J((dl)a2.eTextClock_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eTextClock_ = b2;
        }
        xM_3.bitField0_ |= Wqa.Ja;
    }

    public static /* synthetic */ void J(XM xM2, SJ sJ2) {
        Object b2 = sJ2;
        XM a2 = xM2;
        super.f((SJ)b2);
    }

    private void J(wn wn2) {
        XM_3 xM_3;
        XM_3 b2 = wn2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.onClick_ != null && a2.onClick_ != wn.f()) {
            a2.onClick_ = (wn)((go)wn.J((wn)a2.onClick_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.onClick_ = b2;
        }
        xM_3.bitField0_ |= MQa.Da;
    }

    public static /* synthetic */ void M(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.C((ByteString)b2);
    }

    private void M(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    @Override
    public boolean hasERectangle() {
        XM_3 a2;
        if ((a2.bitField0_ & Vua.f) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public List<String> getTooltipList() {
        XM_3 a2;
        return a2.tooltip_;
    }

    public static /* synthetic */ void d(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.C((String)b2);
    }

    @Override
    public qO getEProgressBar() {
        XM_3 a2;
        if (a2.eProgressBar_ == null) {
            return qO.f();
        }
        return a2.eProgressBar_;
    }

    private void f(Hm hm2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = hm2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.ePlayer_ != null && a2.ePlayer_ != Hm.f()) {
            a2.ePlayer_ = (Hm)((Bn)Hm.J(a2.ePlayer_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.ePlayer_ = b2;
        }
        xM_3.bitField1_ |= ura.V;
    }

    private void e(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.scaleYExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= qQa.O;
    }

    @Override
    public boolean getTooltipDrawVanillaBackground() {
        XM_3 a2;
        return a2.tooltipDrawVanillaBackground_;
    }

    @Override
    public em getEImage9Slice() {
        XM_3 a2;
        if (a2.eImage9Slice_ == null) {
            return em.f();
        }
        return a2.eImage9Slice_;
    }

    @Override
    public aN getEModel() {
        XM_3 a2;
        if (a2.eModel_ == null) {
            return aN.J();
        }
        return a2.eModel_;
    }

    @Override
    public wn getOnClick() {
        XM_3 a2;
        if (a2.onClick_ == null) {
            return wn.f();
        }
        return a2.onClick_;
    }

    private void U() {
        a.bitField0_ &= aqa.C;
        a.scale_ = JPa.N;
    }

    private void J(Hm hm2) {
        GeneratedMessageLite b2 = hm2;
        XM_3 a2 = this;
        b2.getClass();
        a2.ePlayer_ = b2;
        a2.bitField1_ |= ura.V;
    }

    public static /* synthetic */ void J(XM xM2, Iterable iterable) {
        Object b2 = iterable;
        XM a2 = xM2;
        super.J((Iterable<String>)b2);
    }

    private void l(int n2) {
        int b2 = n2;
        XM_3 a2 = this;
        a2.bitField0_ |= opa.w;
        a2.position_ = b2;
    }

    public static /* synthetic */ void p(XM a2) {
        super.j();
    }

    private void P() {
        a.behavior_ = null;
        a.bitField0_ &= Ata.ca;
    }

    private void d(ByteString byteString) {
        XM_3 a2;
        ByteString b2 = byteString;
        XM_3 xM_3 = a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        xM_3.x();
        xM_3.tooltip_.add(b2.toStringUtf8());
    }

    private void s() {
        a.eRadialSlider_ = null;
        a.bitField1_ &= Bta.u;
    }

    private void J(MM mM2) {
        MM b2 = mM2;
        XM_3 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    private void f(boolean bl2) {
        boolean b2 = bl2;
        XM_3 a2 = this;
        a2.bitField0_ |= APa.Aa;
        a2.tooltipDrawVanillaBackground_ = b2;
    }

    @Override
    public boolean hasHoverGroup() {
        XM_3 a2;
        if ((a2.bitField0_ & MTa.x) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void R(XM a2) {
        super.r();
    }

    public static /* synthetic */ void Y(XM a2) {
        super.n();
    }

    private void y() {
        a.tooltip_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void f(XM xM2, Fm fm2) {
        XM b2 = fm2;
        XM a2 = xM2;
        super.f((Fm)b2);
    }

    public static /* synthetic */ void f(XM xM2, cm cm2) {
        XM b2 = cm2;
        XM a2 = xM2;
        super.f((cm)b2);
    }

    @Override
    public float getScale() {
        XM_3 a2;
        return a2.scale_;
    }

    private void u() {
        a.bitField0_ &= kpa.w;
        a.duration_ = nqa.i;
    }

    private void J(xN xN2) {
        XM_3 b2 = xN2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eRadialSlider_ = b2;
        a2.bitField1_ |= XOa.h;
    }

    private void l(float f2) {
        float b2 = f2;
        XM_3 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.scale_ = b2;
    }

    public static XM J(CodedInputStream a2) throws IOException {
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void q() {
        a.bitField0_ &= MTa.c;
        a.rotateExpr_ = XM_3.J().getRotateExpr();
    }

    private void J(xm xm2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = xm2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.behavior_ != null && a2.behavior_ != xm.f()) {
            a2.behavior_ = (xm)((Tm)xm.J(a2.behavior_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.behavior_ = b2;
        }
        xM_3.bitField0_ |= Pua.d;
    }

    public static Parser<XM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(XM xM2, UN uN2) {
        XM b2 = uN2;
        XM a2 = xM2;
        super.J((UN)b2);
    }

    private void z() {
        a.visibility_ = null;
        a.bitField0_ &= pPa.W;
    }

    public static /* synthetic */ void f(XM xM2, To to2) {
        XM b2 = to2;
        XM a2 = xM2;
        super.f((To)b2);
    }

    private void o() {
        a.eTextClock_ = null;
        a.bitField0_ &= hra.ja;
    }

    public static /* synthetic */ void U(XM a2) {
        super.G();
    }

    @Override
    public boolean hasTooltipDrawVanillaBackground() {
        XM_3 a2;
        if ((a2.bitField0_ & APa.Aa) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void h() {
        a.bitField0_ &= Jra.Fa;
        a.x_ = JPa.N;
    }

    @Override
    public boolean hasEProgressBar() {
        XM_3 a2;
        if ((a2.bitField0_ & ypa.L) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.d((ByteString)b2);
    }

    public static /* synthetic */ void C(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.l((String)b2);
    }

    public static /* synthetic */ void J(XM xM2, yl yl2) {
        Object b2 = yl2;
        XM a2 = xM2;
        super.J((yl)b2);
    }

    private void m() {
        a.bitField0_ &= Tpa.y;
        a.hoverGroup_ = XM_3.J().getHoverGroup();
    }

    @Override
    public boolean hasAnimation() {
        XM_3 a2;
        if ((a2.bitField0_ & bqa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void P(XM a2) {
        super.A();
    }

    public static /* synthetic */ void d(XM xM2, float f2) {
        float b2 = f2;
        XM a2 = xM2;
        super.C(b2);
    }

    public static /* synthetic */ void s(XM a2) {
        super.D();
    }

    private void E() {
        a.bitField0_ &= Qsa.n;
        a.scaleYExpr_ = XM_3.J().getScaleYExpr();
    }

    @Override
    public boolean hasYExpr() {
        XM_3 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public Fm getERectangle() {
        XM_3 a2;
        if (a2.eRectangle_ == null) {
            return Fm.f();
        }
        return a2.eRectangle_;
    }

    private void K() {
        a.eText_ = null;
        a.bitField0_ &= Uta.V;
    }

    private void f(OL oL2) {
        XM_3 xM_3;
        XM_3 b2 = oL2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eTextTimer_ != null && a2.eTextTimer_ != OL.J()) {
            a2.eTextTimer_ = (OL)((zk)OL.J((OL)a2.eTextTimer_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eTextTimer_ = b2;
        }
        xM_3.bitField0_ |= kua.l;
    }

    private void c() {
        a.bitField0_ &= rSa.o;
        a.floatPosition_ = uSa.E;
    }

    public static /* synthetic */ void J(XM xM2, MM mM2) {
        Object b2 = mM2;
        XM a2 = xM2;
        super.J((MM)b2);
    }

    public static /* synthetic */ void y(XM a2) {
        super.Q();
    }

    private void f(yl yl2) {
        GeneratedMessageLite b2 = yl2;
        XM_3 a2 = this;
        b2.getClass();
        a2.visibility_ = b2;
        a2.bitField0_ |= pta.Ka;
    }

    private void J(UN uN2) {
        XM_3 b2 = uN2;
        XM_3 a2 = this;
        b2.getClass();
        a2.animation_ = b2;
        a2.bitField0_ |= bqa.O;
    }

    public static Jo J(XM a2) {
        return (Jo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(Fm fm2) {
        XM_3 b2 = fm2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eRectangle_ = b2;
        a2.bitField0_ |= Vua.f;
    }

    public static /* synthetic */ void J(XM xM2, To to2) {
        XM b2 = to2;
        XM a2 = xM2;
        super.J((To)b2);
    }

    @Override
    public ByteString getScaleXExprBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.scaleXExpr_);
    }

    private void J(Bm bm2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = bm2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eProgressTimer_ != null && a2.eProgressTimer_ != Bm.f()) {
            a2.eProgressTimer_ = (Bm)((tM)Bm.J(a2.eProgressTimer_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eProgressTimer_ = b2;
        }
        xM_3.bitField1_ |= vRa.d;
    }

    @Override
    public boolean hasEButton() {
        XM_3 a2;
        if ((a2.bitField1_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void B() {
        a.eMiniDot_ = null;
        a.bitField1_ &= MTa.c;
    }

    public static /* synthetic */ void J(XM xM2, Wn wn2) {
        XM b2 = wn2;
        XM a2 = xM2;
        super.J((Wn)b2);
    }

    public static /* synthetic */ void f(XM xM2, em em2) {
        XM b2 = em2;
        XM a2 = xM2;
        super.J((em)b2);
    }

    public static /* synthetic */ void C(XM xM2, float f2) {
        float b2 = f2;
        XM a2 = xM2;
        super.f(b2);
    }

    private void J(pL pL2) {
        XM_3 b2 = pL2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eText_ = b2;
        a2.bitField0_ |= wsa.v;
    }

    @Override
    public yl getVisibility() {
        XM_3 a2;
        if (a2.visibility_ == null) {
            return yl.J();
        }
        return a2.visibility_;
    }

    public static /* synthetic */ void u(XM a2) {
        super.Y();
    }

    public static /* synthetic */ void l(XM xM2, int n2) {
        int b2 = n2;
        XM a2 = xM2;
        super.J(b2);
    }

    @Override
    public boolean hasScaleXExpr() {
        XM_3 a2;
        if ((a2.bitField0_ & uOa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(SJ sJ2) {
        GeneratedMessageLite b2 = sJ2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eTextInput_ = b2;
        a2.bitField1_ |= fPa.i;
    }

    public static /* synthetic */ void q(XM a2) {
        super.C();
    }

    public static /* synthetic */ void l(XM xM2, float f2) {
        float b2 = f2;
        XM a2 = xM2;
        super.e(b2);
    }

    public static XM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(XM xM2, em em2) {
        XM b2 = em2;
        XM a2 = xM2;
        super.f((em)b2);
    }

    @Override
    public boolean hasPosition() {
        XM_3 a2;
        if ((a2.bitField0_ & opa.w) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public String getTooltip(int n2) {
        int b2 = n2;
        XM_3 a2 = this;
        return (String)a2.tooltip_.get(b2);
    }

    public static XM J(byte[] a2) throws InvalidProtocolBufferException {
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void L() {
        a.eImage_ = null;
        a.bitField0_ &= zua.l;
    }

    private void C(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ysa.s;
        a2.yExpr_ = b2;
    }

    private void b() {
        a.bitField0_ &= NQa.A;
        a.y_ = JPa.N;
    }

    @Override
    public String getHoverGroup() {
        XM_3 a2;
        return a2.hoverGroup_;
    }

    public static /* synthetic */ void l(XM xM2, boolean bl2) {
        boolean b2 = bl2;
        XM a2 = xM2;
        super.J(b2);
    }

    public static /* synthetic */ void z(XM a2) {
        super.y();
    }

    public static /* synthetic */ void o(XM a2) {
        super.P();
    }

    private void C(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.xExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= fPa.i;
    }

    public static /* synthetic */ void f(XM xM2, dl dl2) {
        XM b2 = dl2;
        XM a2 = xM2;
        super.f((dl)b2);
    }

    private void f(float f2) {
        float b2 = f2;
        XM_3 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.rotate_ = b2;
    }

    @Override
    public cm getEMiniDot() {
        XM_3 a2;
        if (a2.eMiniDot_ == null) {
            return cm.J();
        }
        return a2.eMiniDot_;
    }

    @Override
    public xm getBehavior() {
        XM_3 a2;
        if (a2.behavior_ == null) {
            return xm.f();
        }
        return a2.behavior_;
    }

    public static /* synthetic */ void f(XM xM2, Km km2) {
        XM b2 = km2;
        XM a2 = xM2;
        super.f((Km)b2);
    }

    @Override
    public boolean hasEModel() {
        XM_3 a2;
        if ((a2.bitField1_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public MM getKind() {
        XM_3 xM_3 = this;
        MM a2 = MM.forNumber(xM_3.kind_);
        if (a2 == null) {
            return MM.UNRECOGNIZED;
        }
        return a2;
    }

    public static /* synthetic */ void h(XM a2) {
        super.B();
    }

    private void a() {
        a.eImage9Slice_ = null;
        a.bitField1_ &= VPa.A;
    }

    @Override
    public jn getAttachment() {
        XM_3 a2;
        if (a2.attachment_ == null) {
            return jn.J();
        }
        return a2.attachment_;
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.hoverGroup_ = b2.toStringUtf8();
        a2.bitField0_ |= MTa.x;
    }

    private void f(Km km2) {
        XM_3 b2 = km2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eImage_ = b2;
        a2.bitField0_ |= Qsa.X;
    }

    public static /* synthetic */ void m(XM a2) {
        super.t();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, String string) {
        void b2;
        String c2 = string;
        XM_3 a2 = this;
        c2.getClass();
        XM_3 xM_3 = a2;
        xM_3.x();
        xM_3.tooltip_.set((int)b2, c2);
    }

    private void H() {
        a.bitField0_ &= Bta.u;
        a.rotate_ = JPa.N;
    }

    public static /* synthetic */ void E(XM a2) {
        super.f();
    }

    @Override
    public ByteString getHoverGroupBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.hoverGroup_);
    }

    @Override
    public boolean hasY() {
        XM_3 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void K(XM a2) {
        super.u();
    }

    private void g() {
        a.eTable_ = null;
        a.bitField1_ &= kpa.w;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(XM xM2, int n2, String string) {
        void b2;
        Object c2 = string;
        XM a2 = xM2;
        super.J((int)b2, (String)c2);
    }

    private void I() {
        a.eTextInput_ = null;
        a.bitField1_ &= fta.fa;
    }

    public static /* synthetic */ void d(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.f((ByteString)b2);
    }

    private void J(float f2) {
        float b2 = f2;
        XM_3 a2 = this;
        a2.bitField0_ |= QSa.ba;
        a2.scaleX_ = b2;
    }

    public static /* synthetic */ void J(XM b2, long a2) {
        super.J(a2);
    }

    private void J(boolean bl2) {
        boolean b2 = bl2;
        XM_3 a2 = this;
        a2.bitField0_ |= JPa.E;
        a2.hoverable_ = b2;
    }

    private void J(cm cm2) {
        XM_3 b2 = cm2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eMiniDot_ = b2;
        a2.bitField1_ |= hra.Ja;
    }

    public static /* synthetic */ void J(XM xM2, qO qO2) {
        XM b2 = qO2;
        XM a2 = xM2;
        super.f((qO)b2);
    }

    @Override
    public Bm getEProgressTimer() {
        XM_3 a2;
        if (a2.eProgressTimer_ == null) {
            return Bm.f();
        }
        return a2.eProgressTimer_;
    }

    private void j() {
        a.eProgressTimer_ = null;
        a.bitField1_ &= rQa.p;
    }

    private void F() {
        a.ePlayer_ = null;
        a.bitField1_ &= aqa.C;
    }

    private void J(an an2) {
        XM_3 b2 = an2;
        XM_3 a2 = this;
        a2.position_ = b2.getNumber();
        a2.bitField0_ |= opa.w;
    }

    private void J(Dn dn2) {
        XM_3 xM_3;
        XM_3 b2 = dn2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eButton_ != null && a2.eButton_ != Dn.J()) {
            a2.eButton_ = (Dn)((oO)Dn.J((Dn)a2.eButton_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eButton_ = b2;
        }
        xM_3.bitField1_ |= Yqa.i;
    }

    private void k() {
        a.animation_ = null;
        a.bitField0_ &= Lqa.V;
    }

    @Override
    public ByteString getTooltipBytes(int n2) {
        int b2 = n2;
        XM_3 a2 = this;
        return ByteString.copyFromUtf8((String)a2.tooltip_.get(b2));
    }

    @Override
    public ByteString getRotateExprBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.rotateExpr_);
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        XM_3.checkByteStringIsUtf8(b2);
        a2.rotateExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= hra.Ja;
    }

    private void G() {
        a.attachment_ = null;
        a.bitField0_ &= yOa.Ha;
    }

    public static /* synthetic */ void J(XM xM2, dl dl2) {
        XM b2 = dl2;
        XM a2 = xM2;
        super.J((dl)b2);
    }

    public static /* synthetic */ void f(XM xM2, aN aN2) {
        XM b2 = aN2;
        XM a2 = xM2;
        super.f((aN)b2);
    }

    @Override
    public int getDelay() {
        XM_3 a2;
        return a2.delay_;
    }

    private void D() {
        a.bitField0_ &= fta.fa;
        a.xExpr_ = XM_3.J().getXExpr();
    }

    @Override
    public an getPosition() {
        XM_3 xM_3 = this;
        XM_3 a2 = an.forNumber((int)xM_3.position_);
        if (a2 == null) {
            return an.UNRECOGNIZED;
        }
        return a2;
    }

    private void J(long a2) {
        b.bitField0_ |= AQa.P;
        b.duration_ = a2;
    }

    public static /* synthetic */ void c(XM a2) {
        super.g();
    }

    public static /* synthetic */ void B(XM a2) {
        super.z();
    }

    public static /* synthetic */ void L(XM a2) {
        super.U();
    }

    private void l(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= qQa.O;
        a2.scaleYExpr_ = b2;
    }

    public static /* synthetic */ void J(XM xM2, wn wn2) {
        XM b2 = wn2;
        XM a2 = xM2;
        super.f((wn)b2);
    }

    private void J(rm rm2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = rm2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eContainer_ != null && a2.eContainer_ != rm.J()) {
            a2.eContainer_ = (rm)((JN)rm.J(a2.eContainer_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eContainer_ = b2;
        }
        xM_3.bitField1_ |= ERa.C;
    }

    @Override
    public Hm getEPlayer() {
        XM_3 a2;
        if (a2.ePlayer_ == null) {
            return Hm.f();
        }
        return a2.ePlayer_;
    }

    public static /* synthetic */ void f(XM xM2, int n2) {
        int b2 = n2;
        XM a2 = xM2;
        super.f(b2);
    }

    public static /* synthetic */ void b(XM a2) {
        super.H();
    }

    public static /* synthetic */ void f(XM xM2, float f2) {
        float b2 = f2;
        XM a2 = xM2;
        super.l(b2);
    }

    public static XM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void a(XM a2) {
        super.w();
    }

    @Override
    public boolean hasX() {
        XM_3 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void H(XM a2) {
        super.I();
    }

    public static /* synthetic */ void f(XM xM2, xN xN2) {
        XM b2 = xN2;
        XM a2 = xM2;
        super.f((xN)b2);
    }

    public static /* synthetic */ void g(XM a2) {
        super.L();
    }

    private void J(OL oL2) {
        XM_3 b2 = oL2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eTextTimer_ = b2;
        a2.bitField0_ |= kua.l;
    }

    @Override
    public float getY() {
        XM_3 a2;
        return a2.y_;
    }

    private void f(jn jn2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = jn2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.attachment_ != null && a2.attachment_ != jn.J()) {
            a2.attachment_ = (jn)((FM)jn.J(a2.attachment_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.attachment_ = b2;
        }
        xM_3.bitField0_ |= BPa.D;
    }

    public static /* synthetic */ void J(XM xM2, float f2) {
        float b2 = f2;
        XM a2 = xM2;
        super.d(b2);
    }

    @Override
    public boolean getHoverable() {
        XM_3 a2;
        return a2.hoverable_;
    }

    public static /* synthetic */ void J(XM xM2, rm rm2) {
        Object b2 = rm2;
        XM a2 = xM2;
        super.f((rm)b2);
    }

    public static /* synthetic */ void C(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.i((ByteString)b2);
    }

    public static /* synthetic */ void l(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.e((ByteString)b2);
    }

    @Override
    public boolean hasDelay() {
        XM_3 a2;
        if ((a2.bitField0_ & CRa.Y) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void I(XM a2) {
        super.l();
    }

    public static /* synthetic */ void f(XM xM2, Dn dn2) {
        XM b2 = dn2;
        XM a2 = xM2;
        super.J((Dn)b2);
    }

    public static /* synthetic */ void f(XM xM2, Bm bm2) {
        Object b2 = bm2;
        XM a2 = xM2;
        super.f((Bm)b2);
    }

    public static /* synthetic */ void J(XM xM2, xN xN2) {
        XM b2 = xN2;
        XM a2 = xM2;
        super.J((xN)b2);
    }

    @Override
    public boolean hasERadialSlider() {
        XM_3 a2;
        if ((a2.bitField1_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(XM xM2, jn jn2) {
        Object b2 = jn2;
        XM a2 = xM2;
        super.f((jn)b2);
    }

    @Override
    public boolean hasFloatPosition() {
        XM_3 a2;
        if ((a2.bitField0_ & Bpa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public pL getEText() {
        XM_3 a2;
        if (a2.eText_ == null) {
            return pL.J();
        }
        return a2.eText_;
    }

    private void f(Wn wn2) {
        XM_3 xM_3;
        XM_3 b2 = wn2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eRadialProgressBar_ != null && a2.eRadialProgressBar_ != Wn.J()) {
            a2.eRadialProgressBar_ = (Wn)((un)Wn.J((Wn)a2.eRadialProgressBar_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eRadialProgressBar_ = b2;
        }
        xM_3.bitField1_ |= uqa.g;
    }

    private void A() {
        a.onClick_ = null;
        a.bitField0_ &= fpa.x;
    }

    public static /* synthetic */ void l(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.e((String)b2);
    }

    private void f(aN aN2) {
        XM_3 b2 = aN2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eModel_ = b2;
        a2.bitField1_ |= cQa.z;
    }

    @Override
    public ByteString getYExprBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.yExpr_);
    }

    public static /* synthetic */ void J(XM xM2, aN aN2) {
        XM b2 = aN2;
        XM a2 = xM2;
        super.J((aN)b2);
    }

    private void f(int n2) {
        int b2 = n2;
        XM_3 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.color_ = b2;
    }

    public static /* synthetic */ void J(XM xM2, xm xm2) {
        Object b2 = xm2;
        XM a2 = xM2;
        super.J((xm)b2);
    }

    private void i() {
        a.bitField0_ &= VPa.A;
        a.yExpr_ = XM_3.J().getYExpr();
    }

    public static /* synthetic */ void j(XM a2) {
        super.e();
    }

    private void f(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= MTa.x;
        a2.hoverGroup_ = b2;
    }

    @Override
    public String getScaleYExpr() {
        XM_3 a2;
        return a2.scaleYExpr_;
    }

    @Override
    public To getETable() {
        XM_3 a2;
        if (a2.eTable_ == null) {
            return To.J();
        }
        return a2.eTable_;
    }

    private void J(int n2) {
        int b2 = n2;
        XM_3 a2 = this;
        a2.bitField0_ |= CRa.Y;
        a2.delay_ = b2;
    }

    private void M() {
        a.bitField0_ &= ZSa.O;
        a.tooltipDrawVanillaBackground_ = uSa.E;
    }

    public static /* synthetic */ void f(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.i((String)b2);
    }

    private void e() {
        a.bitField0_ &= XTa.T;
        a.scaleXExpr_ = XM_3.J().getScaleXExpr();
    }

    @Override
    public String getXExpr() {
        XM_3 a2;
        return a2.xExpr_;
    }

    public static /* synthetic */ void J(XM xM2, int n2) {
        int b2 = n2;
        XM a2 = xM2;
        super.l(b2);
    }

    @Override
    public boolean hasScaleYExpr() {
        XM_3 a2;
        if ((a2.bitField0_ & qQa.O) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasOnClick() {
        XM_3 a2;
        if ((a2.bitField0_ & MQa.Da) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int getKindValue() {
        XM_3 a2;
        return a2.kind_;
    }

    public static /* synthetic */ void F(XM a2) {
        super.S();
    }

    public static /* synthetic */ void f(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.l((ByteString)b2);
    }

    private void J(aN aN2) {
        XM_3 xM_3;
        XM_3 b2 = aN2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eModel_ != null && a2.eModel_ != aN.J()) {
            a2.eModel_ = (aN)((Rn)aN.J((aN)a2.eModel_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eModel_ = b2;
        }
        xM_3.bitField1_ |= cQa.z;
    }

    public static /* synthetic */ void J(XM xM2, cm cm2) {
        XM b2 = cm2;
        XM a2 = xM2;
        super.J((cm)b2);
    }

    public static /* synthetic */ void k(XM a2) {
        super.a();
    }

    static {
        XM_3 xM_3 = new XM_3();
        DEFAULT_INSTANCE = xM_3;
        GeneratedMessageLite.registerDefaultInstance(XM_3.class, xM_3);
    }

    public static /* synthetic */ void G(XM a2) {
        super.m();
    }

    @Override
    public float getX() {
        XM_3 a2;
        return a2.x_;
    }

    public static /* synthetic */ void J(XM xM2, ByteString byteString) {
        Object b2 = byteString;
        XM a2 = xM2;
        super.M((ByteString)b2);
    }

    public static /* synthetic */ void f(XM xM2, boolean bl2) {
        boolean b2 = bl2;
        XM a2 = xM2;
        super.f(b2);
    }

    @Override
    public boolean hasETextInput() {
        XM_3 a2;
        if ((a2.bitField1_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public ByteString getUuid() {
        XM_3 a2;
        return a2.uuid_;
    }

    public static /* synthetic */ void f(XM xM2, OL oL2) {
        XM b2 = oL2;
        XM a2 = xM2;
        super.f((OL)b2);
    }

    private void J(dl dl2) {
        XM_3 b2 = dl2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eTextClock_ = b2;
        a2.bitField0_ |= Wqa.Ja;
    }

    @Override
    public boolean hasUuid() {
        XM_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public ByteString getXExprBytes() {
        XM_3 a2;
        return ByteString.copyFromUtf8(a2.xExpr_);
    }

    public static /* synthetic */ void J(XM xM2, Hm hm2) {
        Object b2 = hm2;
        XM a2 = xM2;
        super.J((Hm)b2);
    }

    public static /* synthetic */ void D(XM a2) {
        super.d();
    }

    @Override
    public boolean hasETable() {
        XM_3 a2;
        if ((a2.bitField1_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(To to2) {
        XM_3 xM_3;
        XM_3 b2 = to2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eTable_ != null && a2.eTable_ != To.J()) {
            a2.eTable_ = (To)((hN)To.J((To)a2.eTable_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eTable_ = b2;
        }
        xM_3.bitField1_ |= AQa.P;
    }

    @Override
    public String getId() {
        XM_3 a2;
        return a2.id_;
    }

    public static XM f(InputStream a2) throws IOException {
        return (XM_3)XM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static XM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(To to2) {
        XM_3 b2 = to2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eTable_ = b2;
        a2.bitField1_ |= AQa.P;
    }

    public static XM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void d() {
        a.eRectangle_ = null;
        a.bitField0_ &= qta.U;
    }

    public static /* synthetic */ void J(XM xM2, Km km2) {
        XM b2 = km2;
        XM a2 = xM2;
        super.J((Km)b2);
    }

    @Override
    public boolean hasETextClock() {
        XM_3 a2;
        if ((a2.bitField0_ & Wqa.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void A(XM a2) {
        super.W();
    }

    private void J(em em2) {
        XM_3 b2 = em2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eImage9Slice_ = b2;
        a2.bitField1_ |= ysa.s;
    }

    public static XM J(InputStream a2) throws IOException {
        return (XM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(qO qO2) {
        XM_3 xM_3;
        XM_3 b2 = qO2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eProgressBar_ != null && a2.eProgressBar_ != qO.f()) {
            a2.eProgressBar_ = (qO)((VM)qO.J((qO)a2.eProgressBar_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eProgressBar_ = b2;
        }
        xM_3.bitField0_ |= ypa.L;
    }

    @Override
    public UN getAnimation() {
        XM_3 a2;
        if (a2.animation_ == null) {
            return UN.J();
        }
        return a2.animation_;
    }

    public static /* synthetic */ void J(XM xM2, Bm bm2) {
        Object b2 = bm2;
        XM a2 = xM2;
        super.J((Bm)b2);
    }

    private void J(Wn wn2) {
        XM_3 b2 = wn2;
        XM_3 a2 = this;
        b2.getClass();
        a2.eRadialProgressBar_ = b2;
        a2.bitField1_ |= uqa.g;
    }

    @Override
    public Km getEImage() {
        XM_3 a2;
        if (a2.eImage_ == null) {
            return Km.f();
        }
        return a2.eImage_;
    }

    public static /* synthetic */ void J(XM xM2, String string) {
        Object b2 = string;
        XM a2 = xM2;
        super.d((String)b2);
    }

    @Override
    public rm getEContainer() {
        XM_3 a2;
        if (a2.eContainer_ == null) {
            return rm.J();
        }
        return a2.eContainer_;
    }

    private void J(SJ sJ2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = sJ2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eTextInput_ != null && a2.eTextInput_ != SJ.J()) {
            a2.eTextInput_ = (SJ)((WJ)SJ.J(a2.eTextInput_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eTextInput_ = b2;
        }
        xM_3.bitField1_ |= fPa.i;
    }

    private void J(Iterable<String> iterable) {
        XM_3 a2;
        Iterable<String> b2 = iterable;
        XM_3 xM_3 = a2 = this;
        xM_3.x();
        AbstractMessageLite.addAll(b2, xM_3.tooltip_);
    }

    private void C() {
        a.bitField0_ &= uua.W;
        a.hoverable_ = uSa.E;
    }

    public static /* synthetic */ void J(XM xM2, OL oL2) {
        XM b2 = oL2;
        XM a2 = xM2;
        super.J((OL)b2);
    }

    public static /* synthetic */ void J(XM xM2, pL pL2) {
        XM b2 = pL2;
        XM a2 = xM2;
        super.J((pL)b2);
    }

    public static /* synthetic */ void J(XM xM2, jn jn2) {
        Object b2 = jn2;
        XM a2 = xM2;
        super.J((jn)b2);
    }

    @Override
    public boolean hasEPlayer() {
        XM_3 a2;
        if ((a2.bitField1_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int getPositionValue() {
        XM_3 a2;
        return a2.position_;
    }

    public static Jo J() {
        return (Jo)DEFAULT_INSTANCE.createBuilder();
    }

    public static XM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (XM_3)XM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void i(XM a2) {
        super.M();
    }

    @Override
    public long getDuration() {
        XM_3 a2;
        return a2.duration_;
    }

    public static /* synthetic */ void J(XM xM2, boolean bl2) {
        boolean b2 = bl2;
        XM a2 = xM2;
        super.l(b2);
    }

    @Override
    public String getScaleXExpr() {
        XM_3 a2;
        return a2.scaleXExpr_;
    }

    public static /* synthetic */ void M(XM a2) {
        super.p();
    }

    @Override
    public boolean hasColor() {
        XM_3 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(XM xM2, Dn dn2) {
        XM b2 = dn2;
        XM a2 = xM2;
        super.f((Dn)b2);
    }

    @Override
    public float getScaleY() {
        XM_3 a2;
        return a2.scaleY_;
    }

    public static /* synthetic */ void e(XM a2) {
        super.k();
    }

    public static /* synthetic */ void d(XM a2) {
        super.i();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= uqa.g;
        a2.uuid_ = b2;
    }

    public static /* synthetic */ void C(XM a2) {
        super.F();
    }

    public static /* synthetic */ void l(XM a2) {
        super.s();
    }

    @Override
    public OL getETextTimer() {
        XM_3 a2;
        if (a2.eTextTimer_ == null) {
            return OL.J();
        }
        return a2.eTextTimer_;
    }

    @Override
    public boolean hasScaleX() {
        XM_3 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l() {
        a.eModel_ = null;
        a.bitField1_ &= Uta.Z;
    }

    @Override
    public boolean hasEImage() {
        XM_3 a2;
        if ((a2.bitField0_ & Qsa.X) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f() {
        a.eRadialProgressBar_ = null;
        a.bitField1_ &= ERa.Ka;
    }

    private void J(Km km2) {
        XM_3 xM_3;
        XM_3 b2 = km2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.eImage_ != null && a2.eImage_ != Km.f()) {
            a2.eImage_ = (Km)((Wm)Km.J((Km)a2.eImage_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.eImage_ = b2;
        }
        xM_3.bitField0_ |= Qsa.X;
    }

    @Override
    public Dn getEButton() {
        XM_3 a2;
        if (a2.eButton_ == null) {
            return Dn.J();
        }
        return a2.eButton_;
    }

    @Override
    public boolean hasRotate() {
        XM_3 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J() {
        a.eTextTimer_ = null;
        a.bitField0_ &= Jsa.la;
    }

    @Override
    public String getYExpr() {
        XM_3 a2;
        return a2.yExpr_;
    }

    private void J(String string) {
        String b2 = string;
        XM_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= uOa.M;
        a2.scaleXExpr_ = b2;
    }

    private XM_3() {
        XM_3 a2;
        a2.uuid_ = ByteString.EMPTY;
        a2.xExpr_ = Mqa.y;
        a2.yExpr_ = Mqa.y;
        a2.rotateExpr_ = Mqa.y;
        a2.scaleXExpr_ = Mqa.y;
        a2.scaleYExpr_ = Mqa.y;
        a2.tooltip_ = GeneratedMessageLite.emptyProtobufList();
        a2.hoverGroup_ = Mqa.y;
    }

    private void J(jn jn2) {
        GeneratedMessageLite b2 = jn2;
        XM_3 a2 = this;
        b2.getClass();
        a2.attachment_ = b2;
        a2.bitField0_ |= BPa.D;
    }

    public static /* synthetic */ void J(XM xM2, Fm fm2) {
        XM b2 = fm2;
        XM a2 = xM2;
        super.J((Fm)b2);
    }

    public static /* synthetic */ void f(XM a2) {
        super.q();
    }

    private void J(yl yl2) {
        XM_3 xM_3;
        GeneratedMessageLite b2 = yl2;
        XM_3 a2 = this;
        b2.getClass();
        if (a2.visibility_ != null && a2.visibility_ != yl.J()) {
            a2.visibility_ = (yl)((nk)yl.J(a2.visibility_).mergeFrom(b2)).buildPartial();
            xM_3 = a2;
        } else {
            xM_3 = a2;
            a2.visibility_ = b2;
        }
        xM_3.bitField0_ |= pta.Ka;
    }

    public static /* synthetic */ void J(XM a2) {
        super.K();
    }

    @Override
    public SJ getETextInput() {
        XM_3 a2;
        if (a2.eTextInput_ == null) {
            return SJ.J();
        }
        return a2.eTextInput_;
    }

    public static /* synthetic */ XM f() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public int getTooltipCount() {
        XM_3 a2;
        return a2.tooltip_.size();
    }

    public static XM J() {
        return DEFAULT_INSTANCE;
    }
}

