/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  CB
 *  Cm
 *  ERa
 *  GN
 *  ISa
 *  JPa
 *  Kn
 *  LQa
 *  Lra
 *  NOa
 *  NQa
 *  NTa
 *  Nn
 *  OO
 *  QSa
 *  Qa
 *  Qqa
 *  Qsa
 *  Rua
 *  SO
 *  Spa
 *  TQa
 *  Tpa
 *  UM
 *  Uta
 *  VJ
 *  WN
 *  Wl
 *  XTa
 *  Yn
 *  Ypa
 *  Zn
 *  Zua
 *  aQa
 *  aqa
 *  cQa
 *  cRa
 *  eN
 *  fO
 *  hTa
 *  hm
 *  hra
 *  jsa
 *  kpa
 *  lqa
 *  oM
 *  pM
 *  pPa
 *  po
 *  pqa
 *  rN
 *  tn
 *  uOa
 *  uQa
 *  uj
 *  ura
 *  vRa
 *  wOa
 *  xM
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
public final class fO_1
extends GeneratedMessageLite<fO, Zn>
implements Qa {
    public static final int ETEXTTIMER_FIELD_NUMBER = 21;
    private int editDuration_;
    private Internal.ProtobufList<xM> animate_;
    public static final int ERADIALSLIDER_FIELD_NUMBER = 39;
    public static final int YEXPR_FIELD_NUMBER = 28;
    public static final int ANIMATE_FIELD_NUMBER = 4;
    private zN eButton_;
    private Wl eTextTimer_;
    private Internal.ProtobufList<String> tooltip_;
    private ByteString uuid_;
    public static final int XANIM_FIELD_NUMBER = 6;
    private int scaleyvalCase_;
    private int colorvalCase_;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int YEXPRANIM_FIELD_NUMBER = 35;
    public static final int EBUTTON_FIELD_NUMBER = 23;
    public static final int ROTATE_FIELD_NUMBER = 11;
    private int editEasing_;
    public static final int SCALEY_FIELD_NUMBER = 16;
    private int xvalCase_ = uSa.E;
    private Internal.ProtobufList<String> path_;
    public static final int X_FIELD_NUMBER = 5;
    public static final int COLOR_FIELD_NUMBER = 9;
    public static final int EDITEASING_FIELD_NUMBER = 3;
    private Object scalexval_;
    private int bitField0_;
    private Object scaleyval_;
    public static final int SCALEYEXPR_FIELD_NUMBER = 31;
    public static final int SCALEXEXPRANIM_FIELD_NUMBER = 37;
    public static final int PATH_FIELD_NUMBER = 33;
    public static final int HOVERABLE_FIELD_NUMBER = 26;
    private On eProgressBar_;
    private Object xval_;
    private Nn eRadialSlider_;
    public static final int ETABLE_FIELD_NUMBER = 25;
    public static final int EDITEASINGEXPR_FIELD_NUMBER = 32;
    private static volatile Parser<fO> PARSER;
    private int rotatevalCase_;
    public static final int EDITDURATION_FIELD_NUMBER = 2;
    public static final int ETEXT_FIELD_NUMBER = 20;
    public static final int XEXPRANIM_FIELD_NUMBER = 34;
    public static final int ECONTAINER_FIELD_NUMBER = 24;
    public static final int XEXPR_FIELD_NUMBER = 27;
    public static final int ERECTANGLE_FIELD_NUMBER = 19;
    public static final int ROTATEEXPR_FIELD_NUMBER = 29;
    private String editEasingExpr_;
    private Object colorval_;
    private int scalexvalCase_;
    private int yvalCase_ = uSa.E;
    public static final int EPROGRESSBAR_FIELD_NUMBER = 22;
    private uj eText_;
    private Kn eRectangle_;
    public static final int COLORANIM_FIELD_NUMBER = 10;
    public static final int TOOLTIP_FIELD_NUMBER = 18;
    public static final int ROTATEEXPRANIM_FIELD_NUMBER = 36;
    public static final int SCALEX_FIELD_NUMBER = 14;
    private Object yval_;
    private String id_;
    public static final int SCALEXEXPR_FIELD_NUMBER = 30;
    private eN eTable_;
    public static final int ROTATEANIM_FIELD_NUMBER = 12;
    public static final int ROTATEANIMSMART_FIELD_NUMBER = 13;
    public static final int SCALEXANIM_FIELD_NUMBER = 15;
    public static final int Y_FIELD_NUMBER = 7;
    private Object rotateval_;
    private static final fO DEFAULT_INSTANCE;
    private boolean hoverable_;
    public static final int SCALEYANIM_FIELD_NUMBER = 17;
    public static final int YANIM_FIELD_NUMBER = 8;
    public static final int UUID_FIELD_NUMBER = 40;
    public static final int SCALEYEXPRANIM_FIELD_NUMBER = 38;
    private hm eContainer_;

    public static /* synthetic */ void W(fO a2) {
        super.D();
    }

    public static /* synthetic */ void f(fO fO2, Wl wl2) {
        fO b2 = wl2;
        fO a2 = fO2;
        super.J((Wl)b2);
    }

    public static /* synthetic */ void f(fO fO2, uj uj2) {
        fO b2 = uj2;
        fO a2 = fO2;
        super.f((uj)b2);
    }

    public float getScaleY() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == ERa.C) {
            return ((Float)a2.scaleyval_).floatValue();
        }
        return JPa.N;
    }

    public boolean hasEditEasing() {
        fO_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void t(fO a2) {
        super.r();
    }

    public static /* synthetic */ void I(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.j((ByteString)b2);
    }

    public static /* synthetic */ void r(fO a2) {
        super.k();
    }

    private void X() {
        a.tooltip_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void G(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.M(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, xM xM2) {
        void b2;
        fO_1 c2 = xM2;
        fO_1 a2 = this;
        c2.getClass();
        fO_1 fO_12 = a2;
        fO_12.U();
        fO_12.animate_.set((int)b2, (xM)c2);
    }

    public String getRotateExprAnim() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.rotatevalCase_ == Qsa.Ha) {
            a2 = (String)fO_12.rotateval_;
        }
        return a2;
    }

    private void I(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.xval_ = b2.toStringUtf8();
        fO_12.xvalCase_ = Tpa.z;
    }

    public static /* synthetic */ void l(fO fO2, Iterable iterable) {
        Object b2 = iterable;
        fO a2 = fO2;
        super.J((Iterable<String>)b2);
    }

    public static /* synthetic */ void f(fO fO2, hm hm2) {
        fO b2 = hm2;
        fO a2 = fO2;
        super.f((hm)b2);
    }

    public static /* synthetic */ void w(fO a2) {
        super.V();
    }

    public ByteString getScaleXExprBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scalexvalCase_ == Fsa.d) {
            a2 = (String)fO_12.scalexval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public ByteString getScaleYExprAnimBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scaleyvalCase_ == ISa.E) {
            a2 = (String)fO_12.scaleyval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ void S(fO a2) {
        super.Z();
    }

    public static /* synthetic */ void j(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.J((String)b2);
    }

    public ByteString getEditEasingExprBytes() {
        fO_1 a2;
        return ByteString.copyFromUtf8(a2.editEasingExpr_);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, xM xM2) {
        void b2;
        fO_1 c2 = xM2;
        fO_1 a2 = this;
        c2.getClass();
        fO_1 fO_12 = a2;
        fO_12.U();
        fO_12.animate_.add((int)b2, (xM)c2);
    }

    private void J(xM xM2) {
        fO_1 b2 = xM2;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.U();
        fO_12.animate_.add((xM)b2);
    }

    public boolean hasYExprAnim() {
        fO_1 a2;
        if (a2.yvalCase_ == TQa.ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasScaleX() {
        fO_1 a2;
        if (a2.scalexvalCase_ == hpa.Z) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void V() {
        fO_1 a2;
        if (a2.colorvalCase_ == WOa.fa) {
            fO_1 fO_12 = a2;
            fO_12.colorvalCase_ = uSa.E;
            fO_12.colorval_ = null;
        }
    }

    public ByteString getYExprBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.yvalCase_ == EPa.O) {
            a2 = (String)fO_12.yval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ void D(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.D(b2);
    }

    private void N() {
        fO_1 a2;
        if (a2.rotatevalCase_ == ITa.A) {
            fO_1 fO_12 = a2;
            fO_12.rotatevalCase_ = uSa.E;
            fO_12.rotateval_ = null;
        }
    }

    public static /* synthetic */ void F(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.k((String)b2);
    }

    public List<String> getTooltipList() {
        fO_1 a2;
        return a2.tooltip_;
    }

    public float getXAnim() {
        fO_1 a2;
        if (a2.xvalCase_ == uua.p) {
            return ((Float)a2.xval_).floatValue();
        }
        return JPa.N;
    }

    public boolean hasRotateAnim() {
        fO_1 a2;
        if (a2.rotatevalCase_ == lqa.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getRotateExprBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.rotatevalCase_ == ITa.A) {
            a2 = (String)fO_12.rotateval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void f(Wl wl2) {
        fO_1 fO_12;
        fO_1 b2 = wl2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eTextTimer_ != null && a2.eTextTimer_ != Wl.J()) {
            a2.eTextTimer_ = (Wl)((lK)Wl.J((Wl)a2.eTextTimer_).mergeFrom(b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eTextTimer_ = b2;
        }
        fO_12.bitField0_ |= hra.Ja;
    }

    private void j(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.A();
        fO_12.tooltip_.add(b2.toStringUtf8());
    }

    public static fO f(InputStream a2) throws IOException {
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void W() {
        fO_1 a2;
        if (a2.xvalCase_ == uua.p) {
            fO_1 fO_12 = a2;
            fO_12.xvalCase_ = uSa.E;
            fO_12.xval_ = null;
        }
    }

    public static fO J(CodedInputStream a2) throws IOException {
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getRotate() {
        fO_1 a2;
        if (a2.rotatevalCase_ == pPa.f) {
            return ((Float)a2.rotateval_).floatValue();
        }
        return JPa.N;
    }

    private void t() {
        a.bitField0_ &= kpa.w;
        a.editDuration_ = uSa.E;
    }

    public static /* synthetic */ void n(fO a2) {
        super.Q();
    }

    public xM getAnimate(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        return (xM)a2.animate_.get(b2);
    }

    public static /* synthetic */ void x(fO a2) {
        super.l();
    }

    public static /* synthetic */ void J(fO fO2, WN wN2) {
        fO b2 = wN2;
        fO a2 = fO2;
        super.J((WN)b2);
    }

    public boolean hasHoverable() {
        fO_1 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void r() {
        a.eRectangle_ = null;
        a.bitField0_ &= VPa.A;
    }

    private void f(Nn nn2) {
        fO_1 b2 = nn2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eRadialSlider_ = b2;
        a2.bitField0_ |= uOa.M;
    }

    private void w() {
        fO_1 a2;
        fO_1 fO_12 = a2;
        fO_12.xvalCase_ = uSa.E;
        fO_12.xval_ = null;
    }

    private void f(uj uj2) {
        fO_1 fO_12;
        fO_1 b2 = uj2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eText_ != null && a2.eText_ != uj.f()) {
            a2.eText_ = (uj)((VJ)uj.J((uj)a2.eText_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eText_ = b2;
        }
        fO_12.bitField0_ |= XOa.h;
    }

    public static /* synthetic */ void Q(fO a2) {
        super.K();
    }

    public static fO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (fO_1)fO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void j(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.rotatevalCase_ = ITa.A;
        fO_12.rotateval_ = b2;
    }

    public static /* synthetic */ void Z(fO a2) {
        super.a();
    }

    public pM getXvalCase() {
        fO_1 a2;
        return pM.forNumber((int)a2.xvalCase_);
    }

    public String getScaleYExprAnim() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scaleyvalCase_ == ISa.E) {
            a2 = (String)fO_12.scaleyval_;
        }
        return a2;
    }

    public static /* synthetic */ void J(fO fO2, Wl wl2) {
        fO b2 = wl2;
        fO a2 = fO2;
        super.f((Wl)b2);
    }

    private void S() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == ISa.E) {
            fO_1 fO_12 = a2;
            fO_12.scaleyvalCase_ = uSa.E;
            fO_12.scaleyval_ = null;
        }
    }

    private void n() {
        fO_1 a2;
        if (a2.scalexvalCase_ == Ypa.A) {
            fO_1 fO_12 = a2;
            fO_12.scalexvalCase_ = uSa.E;
            fO_12.scalexval_ = null;
        }
    }

    private void F(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.scaleyval_ = b2.toStringUtf8();
        fO_12.scaleyvalCase_ = ISa.E;
    }

    private void x() {
        fO_1 a2;
        if (a2.rotatevalCase_ == uua.s) {
            fO_1 fO_12 = a2;
            fO_12.rotatevalCase_ = uSa.E;
            fO_12.rotateval_ = null;
        }
    }

    private void d(int n2) {
        fO_1 a2;
        int b2 = n2;
        fO_1 fO_12 = a2 = this;
        fO_12.colorvalCase_ = WOa.fa;
        fO_12.colorval_ = b2;
    }

    public static /* synthetic */ void p(fO a2) {
        super.c();
    }

    private void f(zN zN2) {
        GeneratedMessageLite b2 = zN2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eButton_ = b2;
        a2.bitField0_ |= ura.V;
    }

    public static fO f() {
        return DEFAULT_INSTANCE;
    }

    public int getEditDuration() {
        fO_1 a2;
        return a2.editDuration_;
    }

    public static /* synthetic */ void d(fO fO2, int n2) {
        int b2 = n2;
        fO a2 = fO2;
        super.l(b2);
    }

    private void G(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.rotatevalCase_ = pPa.f;
        fO_12.rotateval_ = Float.valueOf(b2);
    }

    public zN getEButton() {
        fO_1 a2;
        if (a2.eButton_ == null) {
            return zN.f();
        }
        return a2.eButton_;
    }

    public static fO J(ByteString a2) throws InvalidProtocolBufferException {
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Zn J(fO a2) {
        return (Zn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void Q() {
        fO_1 a2;
        fO_1 fO_12 = a2;
        fO_12.yvalCase_ = uSa.E;
        fO_12.yval_ = null;
    }

    public static fO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void D(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.rotatevalCase_ = lqa.s;
        fO_12.rotateval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void A(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.e(b2);
    }

    private void Z() {
        a.bitField0_ &= Jra.Fa;
        a.editEasing_ = uSa.E;
    }

    public static /* synthetic */ void J(fO fO2, hm hm2) {
        fO b2 = hm2;
        fO a2 = fO2;
        super.J((hm)b2);
    }

    public static /* synthetic */ void R(fO a2) {
        super.S();
    }

    public static /* synthetic */ void f(fO fO2, zN zN2) {
        Object b2 = zN2;
        fO a2 = fO2;
        super.f((zN)b2);
    }

    private void l(Iterable<String> iterable) {
        fO_1 a2;
        Iterable<String> b2 = iterable;
        fO_1 fO_12 = a2 = this;
        fO_12.B();
        AbstractMessageLite.addAll(b2, fO_12.path_);
    }

    public static /* synthetic */ void Y(fO a2) {
        super.b();
    }

    private void F(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.yvalCase_ = TQa.ca;
        fO_12.yval_ = b2;
    }

    public boolean hasXExprAnim() {
        fO_1 a2;
        if (a2.xvalCase_ == Tpa.z) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void k(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.yval_ = b2.toStringUtf8();
        fO_12.yvalCase_ = TQa.ca;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(fO fO2, int n2, String string) {
        void b2;
        Object c2 = string;
        fO a2 = fO2;
        super.f((int)b2, (String)c2);
    }

    public static /* synthetic */ void U(fO a2) {
        super.x();
    }

    public static /* synthetic */ void P(fO a2) {
        super.s();
    }

    public boolean hasX() {
        fO_1 a2;
        if (a2.xvalCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ fO J() {
        return DEFAULT_INSTANCE;
    }

    private void p() {
        fO_1 a2;
        if (a2.rotatevalCase_ == pPa.f) {
            fO_1 fO_12 = a2;
            fO_12.rotatevalCase_ = uSa.E;
            fO_12.rotateval_ = null;
        }
    }

    private void R() {
        fO_1 a2;
        if (a2.xvalCase_ == Lra.e) {
            fO_1 fO_12 = a2;
            fO_12.xvalCase_ = uSa.E;
            fO_12.xval_ = null;
        }
    }

    private void Y() {
        a.bitField0_ &= fta.fa;
        a.hoverable_ = uSa.E;
    }

    private void f(hm hm2) {
        fO_1 fO_12;
        fO_1 b2 = hm2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eContainer_ != null && a2.eContainer_ != hm.J()) {
            a2.eContainer_ = (hm)((rN)hm.J((hm)a2.eContainer_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eContainer_ = b2;
        }
        fO_12.bitField0_ |= QSa.ba;
    }

    private void f(Kn kn2) {
        fO_1 b2 = kn2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eRectangle_ = b2;
        a2.bitField0_ |= ysa.s;
    }

    private void U() {
        fO_1 fO_12 = this;
        Internal.ProtobufList<xM> a2 = fO_12.animate_;
        if (!a2.isModifiable()) {
            fO_12.animate_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void f(eN eN2) {
        fO_1 b2 = eN2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eTable_ = b2;
        a2.bitField0_ |= mPa.H;
    }

    private void P() {
        fO_1 a2;
        if (a2.scalexvalCase_ == Fsa.d) {
            fO_1 fO_12 = a2;
            fO_12.scalexvalCase_ = uSa.E;
            fO_12.scalexval_ = null;
        }
    }

    private void s() {
        a.eButton_ = null;
        a.bitField0_ &= aqa.C;
    }

    private void y() {
        fO_1 a2;
        if (a2.rotatevalCase_ == lqa.s) {
            fO_1 fO_12 = a2;
            fO_12.rotatevalCase_ = uSa.E;
            fO_12.rotateval_ = null;
        }
    }

    public static Parser<fO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(Kn kn2) {
        fO_1 fO_12;
        fO_1 b2 = kn2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eRectangle_ != null && a2.eRectangle_ != Kn.J()) {
            a2.eRectangle_ = (Kn)((OO)Kn.J((Kn)a2.eRectangle_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eRectangle_ = b2;
        }
        fO_12.bitField0_ |= ysa.s;
    }

    public static /* synthetic */ void s(fO a2) {
        super.M();
    }

    public static /* synthetic */ void y(fO a2) {
        super.W();
    }

    public boolean hasERadialSlider() {
        fO_1 a2;
        if ((a2.bitField0_ & uOa.M) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasScaleYExprAnim() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == ISa.E) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void j(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.i((ByteString)b2);
    }

    public static /* synthetic */ void u(fO a2) {
        super.f();
    }

    private void u() {
        a.bitField0_ &= rQa.p;
        a.id_ = fO_1.f().getId();
    }

    public ByteString getIdBytes() {
        fO_1 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static /* synthetic */ void f(fO fO2, Kn kn2) {
        fO b2 = kn2;
        fO a2 = fO2;
        super.f((Kn)b2);
    }

    public static /* synthetic */ void q(fO a2) {
        super.g();
    }

    public static fO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void G(ByteString byteString) {
        ByteString b2 = byteString;
        fO_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= uqa.g;
        a2.uuid_ = b2;
    }

    public static /* synthetic */ void f(fO fO2, Nn nn2) {
        fO b2 = nn2;
        fO a2 = fO2;
        super.f((Nn)b2);
    }

    public boolean hasEditDuration() {
        fO_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void F(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.A((ByteString)b2);
    }

    private void q() {
        fO_1 a2;
        if (a2.yvalCase_ == TQa.ca) {
            fO_1 fO_12 = a2;
            fO_12.yvalCase_ = uSa.E;
            fO_12.yval_ = null;
        }
    }

    private void A(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.yvalCase_ = XTa.W;
        fO_12.yval_ = Float.valueOf(b2);
    }

    private void D(ByteString byteString) {
        ByteString b2 = byteString;
        fO_1 a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        a2.editEasingExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= ERa.C;
    }

    public List<String> getPathList() {
        fO_1 a2;
        return a2.path_;
    }

    private void k(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.scalexvalCase_ = LQa.c;
        fO_12.scalexval_ = b2;
    }

    private void G(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.xvalCase_ = Tpa.z;
        fO_12.xval_ = b2;
    }

    public static /* synthetic */ void z(fO a2) {
        super.I();
    }

    private void C(int n2) {
        fO_1 a2;
        int b2 = n2;
        fO_1 fO_12 = a2 = this;
        fO_12.colorvalCase_ = NTa.C;
        fO_12.colorval_ = b2;
    }

    public static /* synthetic */ void o(fO a2) {
        super.q();
    }

    public static /* synthetic */ void k(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.C((String)b2);
    }

    public static /* synthetic */ void G(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.i((String)b2);
    }

    private void z() {
        fO_1 a2;
        if (a2.scalexvalCase_ == LQa.c) {
            fO_1 fO_12 = a2;
            fO_12.scalexvalCase_ = uSa.E;
            fO_12.scalexval_ = null;
        }
    }

    private void A(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.scalexval_ = b2.toStringUtf8();
        fO_12.scalexvalCase_ = Fsa.d;
    }

    public String getYExpr() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.yvalCase_ == EPa.O) {
            a2 = (String)fO_12.yval_;
        }
        return a2;
    }

    public boolean hasEText() {
        fO_1 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void o() {
        fO_1 a2;
        if (a2.scalexvalCase_ == hpa.Z) {
            fO_1 fO_12 = a2;
            fO_12.scalexvalCase_ = uSa.E;
            fO_12.scalexval_ = null;
        }
    }

    private void D(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.scaleyvalCase_ = tua.U;
        fO_12.scaleyval_ = b2;
    }

    public Wl getETextTimer() {
        fO_1 a2;
        if (a2.eTextTimer_ == null) {
            return Wl.J();
        }
        return a2.eTextTimer_;
    }

    public static /* synthetic */ void h(fO a2) {
        super.C();
    }

    public static /* synthetic */ void J(fO fO2, uj uj2) {
        fO b2 = uj2;
        fO a2 = fO2;
        super.J((uj)b2);
    }

    public static fO J(InputStream a2) throws IOException {
        return (fO_1)fO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(fO fO2, int n2, xM xM2) {
        void b2;
        fO c2 = xM2;
        fO a2 = fO2;
        super.J((int)b2, (xM)c2);
    }

    private void h() {
        a.path_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ void J(fO fO2, boolean bl) {
        boolean b2 = bl;
        fO a2 = fO2;
        super.J(b2);
    }

    public static /* synthetic */ void D(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.M((String)b2);
    }

    public boolean hasRotateExpr() {
        fO_1 a2;
        if (a2.rotatevalCase_ == ITa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void m(fO a2) {
        super.X();
    }

    public String getScaleXExprAnim() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scalexvalCase_ == LQa.c) {
            a2 = (String)fO_12.scalexval_;
        }
        return a2;
    }

    private void m() {
        fO_1 a2;
        if (a2.colorvalCase_ == NTa.C) {
            fO_1 fO_12 = a2;
            fO_12.colorvalCase_ = uSa.E;
            fO_12.colorval_ = null;
        }
    }

    public ByteString getXExprAnimBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.xvalCase_ == Tpa.z) {
            a2 = (String)fO_12.xval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public int getColorAnim() {
        fO_1 a2;
        if (a2.colorvalCase_ == NTa.C) {
            return (Integer)a2.colorval_;
        }
        return uSa.E;
    }

    private void E() {
        fO_1 a2;
        if (a2.yvalCase_ == XTa.W) {
            fO_1 fO_12 = a2;
            fO_12.yvalCase_ = uSa.E;
            fO_12.yval_ = null;
        }
    }

    public static /* synthetic */ void k(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.D((ByteString)b2);
    }

    private void K() {
        fO_1 a2;
        fO_1 fO_12 = a2;
        fO_12.scalexvalCase_ = uSa.E;
        fO_12.scalexval_ = null;
    }

    private void A(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.scaleyvalCase_ = ISa.E;
        fO_12.scaleyval_ = b2;
    }

    private void J(Wl wl2) {
        fO_1 b2 = wl2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eTextTimer_ = b2;
        a2.bitField0_ |= hra.Ja;
    }

    public static /* synthetic */ void i(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.d(b2);
    }

    private void c() {
        fO_1 a2;
        if (a2.yvalCase_ == EPa.O) {
            fO_1 fO_12 = a2;
            fO_12.yvalCase_ = uSa.E;
            fO_12.yval_ = null;
        }
    }

    public int getPathCount() {
        fO_1 a2;
        return a2.path_.size();
    }

    public float getScaleYAnim() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == yta.Ka) {
            return ((Float)a2.scaleyval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void M(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.J(b2);
    }

    public static /* synthetic */ void E(fO a2) {
        super.L();
    }

    public ByteString getTooltipBytes(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        return ByteString.copyFromUtf8((String)a2.tooltip_.get(b2));
    }

    public static /* synthetic */ void C(fO fO2, int n2) {
        int b2 = n2;
        fO a2 = fO2;
        super.J(b2);
    }

    public String getTooltip(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        return (String)a2.tooltip_.get(b2);
    }

    private void i(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.rotatevalCase_ = Qsa.Ha;
        fO_12.rotateval_ = b2;
    }

    public ByteString getUuid() {
        fO_1 a2;
        return a2.uuid_;
    }

    public static /* synthetic */ void G(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.I((ByteString)b2);
    }

    public boolean hasRotateExprAnim() {
        fO_1 a2;
        if (a2.rotatevalCase_ == Qsa.Ha) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public UM getScalexvalCase() {
        fO_1 a2;
        return UM.forNumber((int)a2.scalexvalCase_);
    }

    private void M(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.xvalCase_ = Lra.e;
        fO_12.xval_ = b2;
    }

    public boolean hasEButton() {
        fO_1 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void B() {
        fO_1 fO_12 = this;
        Internal.ProtobufList<String> a2 = fO_12.path_;
        if (!a2.isModifiable()) {
            fO_12.path_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public float getRotateAnimSmart() {
        fO_1 a2;
        if (a2.rotatevalCase_ == uua.s) {
            return ((Float)a2.rotateval_).floatValue();
        }
        return JPa.N;
    }

    public boolean hasXAnim() {
        fO_1 a2;
        if (a2.xvalCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void K(fO a2) {
        super.J();
    }

    public static /* synthetic */ void A(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.f((String)b2);
    }

    public boolean hasUuid() {
        fO_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.A(b2);
    }

    public static /* synthetic */ void c(fO a2) {
        super.t();
    }

    public static /* synthetic */ void D(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.C((ByteString)b2);
    }

    public static /* synthetic */ void d(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.i(b2);
    }

    private void i(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.scaleyval_ = b2.toStringUtf8();
        fO_12.scaleyvalCase_ = tua.U;
    }

    public Nn getERadialSlider() {
        fO_1 a2;
        if (a2.eRadialSlider_ == null) {
            return Nn.f();
        }
        return a2.eRadialSlider_;
    }

    private void e(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.scalexvalCase_ = Fsa.d;
        fO_12.scalexval_ = b2;
    }

    public static /* synthetic */ void f(fO fO2, eN eN2) {
        fO b2 = eN2;
        fO a2 = fO2;
        super.J((eN)b2);
    }

    public static /* synthetic */ void A(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.M((ByteString)b2);
    }

    public boolean hasColorAnim() {
        fO_1 a2;
        if (a2.colorvalCase_ == NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void L() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == tua.U) {
            fO_1 fO_12 = a2;
            fO_12.scaleyvalCase_ = uSa.E;
            fO_12.scaleyval_ = null;
        }
    }

    private void J(hm hm2) {
        fO_1 b2 = hm2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eContainer_ = b2;
        a2.bitField0_ |= QSa.ba;
    }

    public static /* synthetic */ void i(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.k((ByteString)b2);
    }

    public static /* synthetic */ void l(fO fO2, int n2) {
        int b2 = n2;
        fO a2 = fO2;
        super.C(b2);
    }

    public String getXExpr() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.xvalCase_ == Lra.e) {
            a2 = (String)fO_12.xval_;
        }
        return a2;
    }

    private void b() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == ERa.C) {
            fO_1 fO_12 = a2;
            fO_12.scaleyvalCase_ = uSa.E;
            fO_12.scaleyval_ = null;
        }
    }

    public static /* synthetic */ void B(fO a2) {
        super.P();
    }

    public static /* synthetic */ void L(fO a2) {
        super.o();
    }

    private void f(On on) {
        fO_1 fO_12;
        GeneratedMessageLite b2 = on;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eProgressBar_ != null && a2.eProgressBar_ != On.f()) {
            a2.eProgressBar_ = (On)((Yn)On.J(a2.eProgressBar_).mergeFrom(b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eProgressBar_ = b2;
        }
        fO_12.bitField0_ |= cQa.z;
    }

    private void M(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.xval_ = b2.toStringUtf8();
        fO_12.xvalCase_ = Lra.e;
    }

    public static /* synthetic */ void f(fO fO2, On on) {
        Object b2 = on;
        fO a2 = fO2;
        super.J((On)b2);
    }

    private void a() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == yta.Ka) {
            fO_1 fO_12 = a2;
            fO_12.scaleyvalCase_ = uSa.E;
            fO_12.scaleyval_ = null;
        }
    }

    public static /* synthetic */ void C(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.f(b2);
    }

    public static /* synthetic */ void l(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.G(b2);
    }

    public static /* synthetic */ void f(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.C(b2);
    }

    public static /* synthetic */ void b(fO a2) {
        super.d();
    }

    public float getRotateAnim() {
        fO_1 a2;
        if (a2.rotatevalCase_ == lqa.s) {
            return ((Float)a2.rotateval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void a(fO a2) {
        super.H();
    }

    public static /* synthetic */ void H(fO a2) {
        super.e();
    }

    public static /* synthetic */ void J(fO fO2, zN zN2) {
        Object b2 = zN2;
        fO a2 = fO2;
        super.J((zN)b2);
    }

    private void i(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.xvalCase_ = uua.p;
        fO_12.xval_ = Float.valueOf(b2);
    }

    private void l(int n2) {
        fO_1 a2;
        int b2 = n2;
        fO_1 fO_12 = a2 = this;
        fO_12.U();
        fO_12.animate_.remove(b2);
    }

    private void H() {
        a.eText_ = null;
        a.bitField0_ &= Bta.u;
    }

    public uj getEText() {
        fO_1 a2;
        if (a2.eText_ == null) {
            return uj.f();
        }
        return a2.eText_;
    }

    public WN getEditEasing() {
        fO_1 fO_12 = this;
        fO_1 a2 = WN.forNumber((int)fO_12.editEasing_);
        if (a2 == null) {
            return WN.UNRECOGNIZED;
        }
        return a2;
    }

    public static /* synthetic */ void f(fO fO2, int n2) {
        int b2 = n2;
        fO a2 = fO2;
        super.f(b2);
    }

    private void g() {
        fO_1 a2;
        fO_1 fO_12 = a2;
        fO_12.colorvalCase_ = uSa.E;
        fO_12.colorval_ = null;
    }

    private void J(zN zN2) {
        fO_1 fO_12;
        GeneratedMessageLite b2 = zN2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eButton_ != null && a2.eButton_ != zN.f()) {
            a2.eButton_ = (zN)((QN)zN.J(a2.eButton_).mergeFrom(b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eButton_ = b2;
        }
        fO_12.bitField0_ |= ura.V;
    }

    public GN getYvalCase() {
        fO_1 a2;
        return GN.forNumber((int)a2.yvalCase_);
    }

    public static /* synthetic */ void i(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.e((String)b2);
    }

    public static Zn J() {
        return (Zn)DEFAULT_INSTANCE.createBuilder();
    }

    private void e(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.scalexval_ = b2.toStringUtf8();
        fO_12.scalexvalCase_ = LQa.c;
    }

    public boolean hasETable() {
        fO_1 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(Iterable<? extends xM> iterable) {
        fO_1 a2;
        Iterable<? extends xM> b2 = iterable;
        fO_1 fO_12 = a2 = this;
        fO_12.U();
        AbstractMessageLite.addAll(b2, fO_12.animate_);
    }

    public static /* synthetic */ void g(fO a2) {
        super.n();
    }

    public static /* synthetic */ void J(fO fO2, Nn nn2) {
        fO b2 = nn2;
        fO a2 = fO2;
        super.J((Nn)b2);
    }

    private void I() {
        a.bitField0_ &= NQa.A;
        a.editEasingExpr_ = fO_1.f().getEditEasingExpr();
    }

    public boolean hasId() {
        fO_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void I(fO a2) {
        super.i();
    }

    private void M(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.scaleyvalCase_ = ERa.C;
        fO_12.scaleyval_ = Float.valueOf(b2);
    }

    public List<? extends CB> J() {
        fO_1 a2;
        return a2.animate_;
    }

    public boolean hasRotate() {
        fO_1 a2;
        if (a2.rotatevalCase_ == pPa.f) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(fO fO2, eN eN2) {
        fO b2 = eN2;
        fO a2 = fO2;
        super.f((eN)b2);
    }

    public static /* synthetic */ void j(fO a2) {
        super.w();
    }

    public static /* synthetic */ void J(fO fO2, xM xM2) {
        fO b2 = xM2;
        fO a2 = fO2;
        super.J((xM)b2);
    }

    public float getX() {
        fO_1 a2;
        if (a2.xvalCase_ == tTa.h) {
            return ((Float)a2.xval_).floatValue();
        }
        return JPa.N;
    }

    static {
        fO_1 fO_12 = new fO_1();
        DEFAULT_INSTANCE = fO_12;
        GeneratedMessageLite.registerDefaultInstance(fO_1.class, fO_12);
    }

    public float getScaleX() {
        fO_1 a2;
        if (a2.scalexvalCase_ == hpa.Z) {
            return ((Float)a2.scalexval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void F(fO a2) {
        super.z();
    }

    private void f(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.editEasing_ = b2;
    }

    public static /* synthetic */ void k(fO a2) {
        super.G();
    }

    public boolean hasEContainer() {
        fO_1 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static fO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void j() {
        a.eTextTimer_ = null;
        a.bitField0_ &= MTa.c;
    }

    private void J(Iterable<String> iterable) {
        fO_1 a2;
        Iterable<String> b2 = iterable;
        fO_1 fO_12 = a2 = this;
        fO_12.A();
        AbstractMessageLite.addAll(b2, fO_12.tooltip_);
    }

    public static /* synthetic */ void G(fO a2) {
        super.N();
    }

    private void F() {
        fO_1 a2;
        if (a2.yvalCase_ == Yqa.i) {
            fO_1 fO_12 = a2;
            fO_12.yvalCase_ = uSa.E;
            fO_12.yval_ = null;
        }
    }

    public boolean hasETextTimer() {
        fO_1 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasYAnim() {
        fO_1 a2;
        if (a2.yvalCase_ == Yqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void D(fO a2) {
        super.j();
    }

    public static /* synthetic */ void M(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.G((String)b2);
    }

    private void k() {
        a.eProgressBar_ = null;
        a.bitField0_ &= Uta.Z;
    }

    private void G() {
        a.eRadialSlider_ = null;
        a.bitField0_ &= XTa.T;
    }

    public String getYExprAnim() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.yvalCase_ == TQa.ca) {
            a2 = (String)fO_12.yval_;
        }
        return a2;
    }

    private fO_1() {
        fO_1 a2;
        a2.colorvalCase_ = uSa.E;
        a2.rotatevalCase_ = uSa.E;
        a2.scalexvalCase_ = uSa.E;
        a2.scaleyvalCase_ = uSa.E;
        a2.id_ = Mqa.y;
        a2.path_ = GeneratedMessageLite.emptyProtobufList();
        a2.uuid_ = ByteString.EMPTY;
        a2.editEasingExpr_ = Mqa.y;
        a2.animate_ = fO_1.emptyProtobufList();
        a2.tooltip_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void d(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.rotateval_ = b2.toStringUtf8();
        fO_12.rotatevalCase_ = ITa.A;
    }

    public static /* synthetic */ void e(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.F((String)b2);
    }

    public int getTooltipCount() {
        fO_1 a2;
        return a2.tooltip_.size();
    }

    public static fO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void d(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.D((String)b2);
    }

    public ByteString getPathBytes(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        return ByteString.copyFromUtf8((String)a2.path_.get(b2));
    }

    public static /* synthetic */ void M(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.G((ByteString)b2);
    }

    public boolean hasScaleY() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == ERa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void A(fO a2) {
        super.u();
    }

    public static /* synthetic */ void f(fO fO2, Iterable iterable) {
        Object b2 = iterable;
        fO a2 = fO2;
        super.l((Iterable<String>)b2);
    }

    public boolean hasRotateAnimSmart() {
        fO_1 a2;
        if (a2.rotatevalCase_ == uua.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getPath(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        return (String)a2.path_.get(b2);
    }

    public boolean hasERectangle() {
        fO_1 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasY() {
        fO_1 a2;
        if (a2.yvalCase_ == XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static fO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void i(fO a2) {
        super.Y();
    }

    public static /* synthetic */ void M(fO a2) {
        super.E();
    }

    private void J(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.editDuration_ = b2;
    }

    private void J(Nn nn2) {
        fO_1 fO_12;
        fO_1 b2 = nn2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eRadialSlider_ != null && a2.eRadialSlider_ != Nn.f()) {
            a2.eRadialSlider_ = (Nn)((SO)Nn.J((Nn)a2.eRadialSlider_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eRadialSlider_ = b2;
        }
        fO_12.bitField0_ |= uOa.M;
    }

    public Kn getERectangle() {
        fO_1 a2;
        if (a2.eRectangle_ == null) {
            return Kn.J();
        }
        return a2.eRectangle_;
    }

    private void D() {
        fO_1 a2;
        if (a2.rotatevalCase_ == Qsa.Ha) {
            fO_1 fO_12 = a2;
            fO_12.rotatevalCase_ = uSa.E;
            fO_12.rotateval_ = null;
        }
    }

    private void e(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.scalexvalCase_ = hpa.Z;
        fO_12.scalexval_ = Float.valueOf(b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        fO_1 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.hoverable_ = b2;
    }

    private void A() {
        fO_1 fO_12 = this;
        Internal.ProtobufList<String> a2 = fO_12.tooltip_;
        if (!a2.isModifiable()) {
            fO_12.tooltip_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public On getEProgressBar() {
        fO_1 a2;
        if (a2.eProgressBar_ == null) {
            return On.f();
        }
        return a2.eProgressBar_;
    }

    public boolean hasEProgressBar() {
        fO_1 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void i() {
        a.bitField0_ &= ERa.Ka;
        a.uuid_ = fO_1.f().getUuid();
    }

    public static /* synthetic */ void C(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.j((String)b2);
    }

    public static /* synthetic */ void J(fO fO2, float f2) {
        float b2 = f2;
        fO a2 = fO2;
        super.l(b2);
    }

    public boolean hasScaleYExpr() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == tua.U) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(fO fO2, On on) {
        Object b2 = on;
        fO a2 = fO2;
        super.f((On)b2);
    }

    private void d(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public boolean hasScaleYAnim() {
        fO_1 a2;
        if (a2.scaleyvalCase_ == yta.Ka) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getScaleYExprBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scaleyvalCase_ == tua.U) {
            a2 = (String)fO_12.scaleyval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public String getScaleYExpr() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scaleyvalCase_ == tua.U) {
            a2 = (String)fO_12.scaleyval_;
        }
        return a2;
    }

    private void M() {
        fO_1 a2;
        fO_1 fO_12 = a2;
        fO_12.scaleyvalCase_ = uSa.E;
        fO_12.scaleyval_ = null;
    }

    private void C(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.yval_ = b2.toStringUtf8();
        fO_12.yvalCase_ = EPa.O;
    }

    public static /* synthetic */ void J(fO fO2, Kn kn2) {
        fO b2 = kn2;
        fO a2 = fO2;
        super.J((Kn)b2);
    }

    public static /* synthetic */ void e(fO a2) {
        super.h();
    }

    private void C(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.B();
        fO_12.path_.add(b2);
    }

    public static /* synthetic */ void e(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.l((ByteString)b2);
    }

    public ByteString getXExprBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.xvalCase_ == Lra.e) {
            a2 = (String)fO_12.xval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void J(On on) {
        GeneratedMessageLite b2 = on;
        fO_1 a2 = this;
        b2.getClass();
        a2.eProgressBar_ = b2;
        a2.bitField0_ |= cQa.z;
    }

    public boolean hasEditEasingExpr() {
        fO_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(WN wN2) {
        fO_1 b2 = wN2;
        fO_1 a2 = this;
        a2.editEasing_ = b2.getNumber();
        a2.bitField0_ |= Yqa.i;
    }

    public static /* synthetic */ void d(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.f((ByteString)b2);
    }

    private void l(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.B();
        fO_12.path_.add(b2.toStringUtf8());
    }

    public static fO J(byte[] a2) throws InvalidProtocolBufferException {
        return (fO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getColor() {
        fO_1 a2;
        if (a2.colorvalCase_ == WOa.fa) {
            return (Integer)a2.colorval_;
        }
        return uSa.E;
    }

    public static /* synthetic */ void J(fO fO2, Iterable iterable) {
        Object b2 = iterable;
        fO a2 = fO2;
        super.f((Iterable<? extends xM>)b2);
    }

    public String getScaleXExpr() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scalexvalCase_ == Fsa.d) {
            a2 = (String)fO_12.scalexval_;
        }
        return a2;
    }

    private void d(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.scaleyvalCase_ = yta.Ka;
        fO_12.scaleyval_ = Float.valueOf(b2);
    }

    private void e() {
        fO_1 a2;
        fO_1 fO_12 = a2;
        fO_12.rotatevalCase_ = uSa.E;
        fO_12.rotateval_ = null;
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
        fO_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new fO_1();
            }
            case 2: {
                return new Zn(null);
            }
            case 3: {
                Object[] objectArray = new Object[tua.U];
                objectArray[uSa.E] = Bra.h;
                objectArray[vRa.d] = qQa.ha;
                objectArray[uqa.g] = NOa.Ga;
                objectArray[yRa.d] = gsa.A;
                objectArray[AQa.P] = Upa.L;
                objectArray[tTa.h] = cTa.r;
                objectArray[uua.p] = Rua.a;
                objectArray[XTa.W] = QTa.la;
                objectArray[Yqa.i] = Lsa.a;
                objectArray[WOa.fa] = iSa.p;
                objectArray[NTa.C] = Spa.o;
                objectArray[pPa.f] = jsa.i;
                objectArray[lqa.s] = lqa.E;
                objectArray[uua.s] = uQa.Aa;
                objectArray[hpa.Z] = rpa.u;
                objectArray[Ypa.A] = lQa.c;
                objectArray[ERa.C] = AQa.h;
                objectArray[yta.Ka] = xM.class;
                objectArray[yOa.B] = Npa.E;
                objectArray[wOa.t] = hpa.A;
                objectArray[kTa.j] = cRa.l;
                objectArray[wOa.h] = sSa.H;
                objectArray[cQa.o] = Zua.fa;
                objectArray[AQa.ba] = gQa.H;
                objectArray[osa.c] = LRa.M;
                objectArray[kTa.g] = Fsa.R;
                objectArray[ITa.E] = LRa.S;
                objectArray[Lra.e] = pqa.ca;
                objectArray[EPa.O] = ERa.h;
                objectArray[ITa.A] = Qqa.G;
                objectArray[Fsa.d] = hTa.u;
                d2 = objectArray;
                Object b2 = KSa.h;
                return fO_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = fO_1.class;
                synchronized (fO_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<fO>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void d(fO a2) {
        super.y();
    }

    public hm getEContainer() {
        fO_1 a2;
        if (a2.eContainer_ == null) {
            return hm.J();
        }
        return a2.eContainer_;
    }

    public boolean getHoverable() {
        fO_1 a2;
        return a2.hoverable_;
    }

    public Cm getRotatevalCase() {
        fO_1 a2;
        return Cm.forNumber((int)a2.rotatevalCase_);
    }

    public List<xM> getAnimateList() {
        fO_1 a2;
        return a2.animate_;
    }

    public ByteString getScaleXExprAnimBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.scalexvalCase_ == LQa.c) {
            a2 = (String)fO_12.scalexval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public boolean hasScaleXExprAnim() {
        fO_1 a2;
        if (a2.scalexvalCase_ == LQa.c) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasScaleXAnim() {
        fO_1 a2;
        if (a2.scalexvalCase_ == Ypa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.d((ByteString)b2);
    }

    private void J(eN eN2) {
        fO_1 fO_12;
        fO_1 b2 = eN2;
        fO_1 a2 = this;
        b2.getClass();
        if (a2.eTable_ != null && a2.eTable_ != eN.J()) {
            a2.eTable_ = (eN)((po)eN.J((eN)a2.eTable_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fO_12 = a2;
        } else {
            fO_12 = a2;
            a2.eTable_ = b2;
        }
        fO_12.bitField0_ |= mPa.H;
    }

    private void C(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.rotatevalCase_ = uua.s;
        fO_12.rotateval_ = Float.valueOf(b2);
    }

    public eN getETable() {
        fO_1 a2;
        if (a2.eTable_ == null) {
            return eN.J();
        }
        return a2.eTable_;
    }

    public float getYAnim() {
        fO_1 a2;
        if (a2.yvalCase_ == Yqa.i) {
            return ((Float)a2.yval_).floatValue();
        }
        return JPa.N;
    }

    private void d() {
        a.animate_ = fO_1.emptyProtobufList();
    }

    public static /* synthetic */ void C(fO a2) {
        super.R();
    }

    public int getEditEasingValue() {
        fO_1 a2;
        return a2.editEasing_;
    }

    private void l(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ERa.C;
        a2.editEasingExpr_ = b2;
    }

    public static /* synthetic */ void l(fO a2) {
        super.F();
    }

    public static /* synthetic */ void l(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.e((ByteString)b2);
    }

    public String getXExprAnim() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.xvalCase_ == Tpa.z) {
            a2 = (String)fO_12.xval_;
        }
        return a2;
    }

    public static /* synthetic */ void J(fO fO2, int n2) {
        int b2 = n2;
        fO a2 = fO2;
        super.d(b2);
    }

    private void C() {
        fO_1 a2;
        if (a2.xvalCase_ == tTa.h) {
            fO_1 fO_12 = a2;
            fO_12.xvalCase_ = uSa.E;
            fO_12.xval_ = null;
        }
    }

    public ByteString getRotateExprAnimBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.rotatevalCase_ == Qsa.Ha) {
            a2 = (String)fO_12.rotateval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void l(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.xvalCase_ = tTa.h;
        fO_12.xval_ = Float.valueOf(b2);
    }

    private void l() {
        a.eTable_ = null;
        a.bitField0_ &= aQa.d;
    }

    public int getAnimateCount() {
        fO_1 a2;
        return a2.animate_.size();
    }

    public ByteString getYExprAnimBytes() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.yvalCase_ == TQa.ca) {
            a2 = (String)fO_12.yval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public oM getColorvalCase() {
        fO_1 a2;
        return oM.forNumber((int)a2.colorvalCase_);
    }

    private void f() {
        a.eContainer_ = null;
        a.bitField0_ &= ppa.ca;
    }

    public static /* synthetic */ void l(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.A((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(fO fO2, int n2, xM xM2) {
        void b2;
        fO c2 = xM2;
        fO a2 = fO2;
        super.f((int)b2, (xM)c2);
    }

    public static /* synthetic */ void f(fO a2) {
        super.m();
    }

    private void f(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.scalexvalCase_ = Ypa.A;
        fO_12.scalexval_ = Float.valueOf(b2);
    }

    public String getId() {
        fO_1 a2;
        return a2.id_;
    }

    private void f(ByteString byteString) {
        fO_1 a2;
        ByteString b2 = byteString;
        fO_1 fO_12 = a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        fO_12.rotateval_ = b2.toStringUtf8();
        fO_12.rotatevalCase_ = Qsa.Ha;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, String string) {
        void b2;
        String c2 = string;
        fO_1 a2 = this;
        c2.getClass();
        fO_1 fO_12 = a2;
        fO_12.B();
        fO_12.path_.set((int)b2, c2);
    }

    public boolean hasColor() {
        fO_1 a2;
        if (a2.colorvalCase_ == WOa.fa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(uj uj2) {
        fO_1 b2 = uj2;
        fO_1 a2 = this;
        b2.getClass();
        a2.eText_ = b2;
        a2.bitField0_ |= XOa.h;
    }

    public float getScaleXAnim() {
        fO_1 a2;
        if (a2.scalexvalCase_ == Ypa.A) {
            return ((Float)a2.scalexval_).floatValue();
        }
        return JPa.N;
    }

    public boolean hasXExpr() {
        fO_1 a2;
        if (a2.xvalCase_ == Lra.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.A();
        fO_12.tooltip_.add(b2);
    }

    public static /* synthetic */ void f(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.F((ByteString)b2);
    }

    private void J(float f2) {
        fO_1 a2;
        float b2 = f2;
        fO_1 fO_12 = a2 = this;
        fO_12.yvalCase_ = Yqa.i;
        fO_12.yval_ = Float.valueOf(b2);
    }

    public String getEditEasingExpr() {
        fO_1 a2;
        return a2.editEasingExpr_;
    }

    public static /* synthetic */ void J(fO a2) {
        super.p();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, String string) {
        void b2;
        String c2 = string;
        fO_1 a2 = this;
        c2.getClass();
        fO_1 fO_12 = a2;
        fO_12.A();
        fO_12.tooltip_.set((int)b2, c2);
    }

    public String getRotateExpr() {
        fO_1 fO_12 = this;
        Object a2 = Mqa.y;
        if (fO_12.rotatevalCase_ == ITa.A) {
            a2 = (String)fO_12.rotateval_;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(fO fO2, int n2, String string) {
        void b2;
        Object c2 = string;
        fO a2 = fO2;
        super.J((int)b2, (String)c2);
    }

    public boolean hasYExpr() {
        fO_1 a2;
        if (a2.yvalCase_ == EPa.O) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasScaleXExpr() {
        fO_1 a2;
        if (a2.scalexvalCase_ == Fsa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        fO_1 a2 = this;
        fO_1.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void J(fO fO2, ByteString byteString) {
        Object b2 = byteString;
        fO a2 = fO2;
        super.J((ByteString)b2);
    }

    public tn getScaleyvalCase() {
        fO_1 a2;
        return tn.forNumber((int)a2.scaleyvalCase_);
    }

    public CB J(int n2) {
        int b2 = n2;
        fO_1 a2 = this;
        return (CB)a2.animate_.get(b2);
    }

    public static /* synthetic */ void f(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.l((String)b2);
    }

    private void J() {
        fO_1 a2;
        if (a2.xvalCase_ == Tpa.z) {
            fO_1 fO_12 = a2;
            fO_12.xvalCase_ = uSa.E;
            fO_12.xval_ = null;
        }
    }

    public float getY() {
        fO_1 a2;
        if (a2.yvalCase_ == XTa.W) {
            return ((Float)a2.yval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void J(fO fO2, String string) {
        Object b2 = string;
        fO a2 = fO2;
        super.d((String)b2);
    }

    private void J(String string) {
        String b2 = string;
        fO_1 a2 = this;
        b2.getClass();
        fO_1 fO_12 = a2;
        fO_12.yvalCase_ = EPa.O;
        fO_12.yval_ = b2;
    }
}

