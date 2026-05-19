/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  AO
 *  Co
 *  DO
 *  EO
 *  ERa
 *  Em
 *  Fo
 *  HO
 *  IM
 *  In
 *  KN
 *  Lo
 *  Lra
 *  Mo
 *  NM
 *  NO
 *  NTa
 *  ON
 *  QB
 *  QO
 *  Qn
 *  Qsa
 *  RM
 *  Rm
 *  TN
 *  TQa
 *  Tpa
 *  Uo
 *  Uta
 *  XN
 *  XTa
 *  Xm
 *  Ypa
 *  am
 *  cQa
 *  dO
 *  fn
 *  hM
 *  hO
 *  iO
 *  jm
 *  kM
 *  kn
 *  lqa
 *  mm
 *  nM
 *  oN
 *  pN
 *  pPa
 *  qM
 *  rn
 *  so
 *  tm
 *  um
 *  uo
 *  vRa
 *  vm
 *  wM
 *  wOa
 *  xn
 *  ym
 *  yn
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
public final class iO_2
extends GeneratedMessageLite<iO, am>
implements QB {
    public static final int PARTICLES_FIELD_NUMBER = 9;
    public static final int REMOVE3D_FIELD_NUMBER = 12;
    public static final int PLAYANIMATION_FIELD_NUMBER = 29;
    public static final int ENTITYOPTION_FIELD_NUMBER = 26;
    public static final int REMOVEBB_FIELD_NUMBER = 15;
    public static final int CLEAR2D_FIELD_NUMBER = 5;
    public static final int RESET_FIELD_NUMBER = 1;
    public static final int EDIT3D_FIELD_NUMBER = 11;
    public static final int SNOWSTORMPARTICLES_FIELD_NUMBER = 32;
    public static final int ADDBB_FIELD_NUMBER = 14;
    public static final int ADD2DGROUP_FIELD_NUMBER = 3;
    public static final int CLEAR3D_FIELD_NUMBER = 13;
    public static final int ENTITYACTION_FIELD_NUMBER = 27;
    public static final int COPYTOCLIPBOARD_FIELD_NUMBER = 33;
    public static final int KEYBOARDUNBIND_FIELD_NUMBER = 19;
    private int actionCase_ = uSa.E;
    public static final int RESOURCESAVE_FIELD_NUMBER = 25;
    public static final int SOUNDPLAY_FIELD_NUMBER = 21;
    public static final int ISOMETRICENABLE_FIELD_NUMBER = 35;
    public static final int PROMOACTIVATERESULT_FIELD_NUMBER = 34;
    private static volatile Parser<iO> PARSER;
    public static final int ISOMETRICDISABLE_FIELD_NUMBER = 36;
    public static final int EDITBB_FIELD_NUMBER = 16;
    public static final int EDIT2D_FIELD_NUMBER = 6;
    public static final int SOUNDSTOP_FIELD_NUMBER = 22;
    public static final int CLEARKEYBOARD_FIELD_NUMBER = 20;
    public static final int OPENGUI_FIELD_NUMBER = 8;
    private static final iO DEFAULT_INSTANCE;
    public static final int REMOVE2D_FIELD_NUMBER = 4;
    private Object action_;
    public static final int KEYBOARDBIND_FIELD_NUMBER = 18;
    public static final int OPTIONSET_FIELD_NUMBER = 7;
    public static final int OPENURL_FIELD_NUMBER = 17;
    public static final int JOINVOICECHAT_FIELD_NUMBER = 30;
    public static final int RESOURCECHECK_FIELD_NUMBER = 24;
    public static final int RECONNECTDATA_FIELD_NUMBER = 31;
    public static final int ADD2D_FIELD_NUMBER = 2;
    public static final int ADD3D_FIELD_NUMBER = 10;
    public static final int REGISTERDYNAMICITEM_FIELD_NUMBER = 28;

    public Rm getIsometricEnable() {
        iO_2 a2;
        if (a2.actionCase_ == TQa.ca) {
            return (Rm)a2.action_;
        }
        return Rm.J();
    }

    private void R() {
        iO_2 a2;
        iO_2 iO_22 = a2;
        iO_22.actionCase_ = uSa.E;
        iO_22.action_ = null;
    }

    private void f(EO eO2) {
        iO_2 iO_22;
        iO_2 b2 = eO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Lra.e && a2.action_ != EO.J()) {
            a2.action_ = ((zo)EO.J((EO)((EO)a2.action_)).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Lra.e;
    }

    private void f(so so2) {
        iO_2 b2 = so2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Fsa.d;
    }

    public static /* synthetic */ void R(iO a2) {
        super.B();
    }

    public static /* synthetic */ void f(iO iO2, vN vN2) {
        Object b2 = vN2;
        iO a2 = iO2;
        super.J((vN)b2);
    }

    public static /* synthetic */ void f(iO iO2, EO eO2) {
        iO b2 = eO2;
        iO a2 = iO2;
        super.f((EO)b2);
    }

    public EO getEntityAction() {
        iO_2 a2;
        if (a2.actionCase_ == Lra.e) {
            return (EO)a2.action_;
        }
        return EO.J();
    }

    public static /* synthetic */ void C(iO iO2, boolean bl) {
        boolean b2 = bl;
        iO a2 = iO2;
        super.C(b2);
    }

    private void f(Rm rm2) {
        iO_2 b2 = rm2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = TQa.ca;
    }

    private void Y() {
        iO_2 a2;
        if (a2.actionCase_ == Lra.e) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean getClear2D() {
        iO_2 a2;
        if (a2.actionCase_ == tTa.h) {
            return (Boolean)a2.action_;
        }
        return uSa.E != 0;
    }

    public boolean getReset() {
        iO_2 a2;
        if (a2.actionCase_ == vRa.d) {
            return (Boolean)a2.action_;
        }
        return uSa.E != 0;
    }

    public boolean hasEntityAction() {
        iO_2 a2;
        if (a2.actionCase_ == Lra.e) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void U() {
        iO_2 a2;
        if (a2.actionCase_ == vRa.d) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void Y(iO a2) {
        super.J();
    }

    public boolean hasRemoveBB() {
        iO_2 a2;
        if (a2.actionCase_ == Ypa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void U(iO a2) {
        super.M();
    }

    public static /* synthetic */ void P(iO a2) {
        super.L();
    }

    private void f(Qn qn2) {
        iO_2 iO_22;
        iO_2 b2 = qn2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == lqa.s && a2.action_ != Qn.J()) {
            a2.action_ = ((Em)Qn.J((Qn)((Qn)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = lqa.s;
    }

    public in getAdd2D() {
        iO_2 a2;
        if (a2.actionCase_ == uqa.g) {
            return (in)a2.action_;
        }
        return in.J();
    }

    private void C(boolean bl) {
        iO_2 a2;
        boolean b2 = bl;
        iO_2 iO_22 = a2 = this;
        iO_22.actionCase_ = kTa.j;
        iO_22.action_ = b2;
    }

    private void f(wM wM2) {
        iO_2 b2 = wM2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Ypa.A;
    }

    public static /* synthetic */ void f(iO iO2, ON oN2) {
        iO b2 = oN2;
        iO a2 = iO2;
        super.J((ON)b2);
    }

    public static /* synthetic */ void f(iO iO2, mm mm2) {
        iO b2 = mm2;
        iO a2 = iO2;
        super.f((mm)b2);
    }

    public static /* synthetic */ void f(iO iO2, dO dO2) {
        iO b2 = dO2;
        iO a2 = iO2;
        super.J((dO)b2);
    }

    private void f(hO hO2) {
        iO_2 iO_22;
        iO_2 b2 = hO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == fPa.i && a2.action_ != hO.J()) {
            a2.action_ = ((DO)hO.J((hO)((hO)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = fPa.i;
    }

    private iO_2() {
        iO_2 a2;
    }

    public boolean hasSoundPlay() {
        iO_2 a2;
        if (a2.actionCase_ == wOa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(rn rn2) {
        iO_2 iO_22;
        iO_2 b2 = rn2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == wOa.h && a2.action_ != rn.f()) {
            a2.action_ = ((Xm)rn.J((rn)((rn)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = wOa.h;
    }

    public static /* synthetic */ void s(iO a2) {
        super.d();
    }

    private void P() {
        iO_2 a2;
        if (a2.actionCase_ == Tpa.z) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void f(AO aO2) {
        iO_2 b2 = aO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Qsa.Ha;
    }

    public boolean hasJoinVoiceChat() {
        iO_2 a2;
        if (a2.actionCase_ == Fsa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(vN vN2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = vN2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == EPa.O && a2.action_ != vN.f()) {
            a2.action_ = ((Lo)vN.J((vN)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = EPa.O;
    }

    public static iO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(iO iO2, sN sN2) {
        Object b2 = sN2;
        iO a2 = iO2;
        super.f((sN)b2);
    }

    private void f(So so2) {
        GeneratedMessageLite b2 = so2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = tua.U;
    }

    private void s() {
        iO_2 a2;
        if (a2.actionCase_ == cQa.o) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void f(iO iO2, Mo mo2) {
        iO b2 = mo2;
        iO a2 = iO2;
        super.J((Mo)b2);
    }

    private void f(En en2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = en2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Yqa.i && a2.action_ != En.f()) {
            a2.action_ = ((uo)En.J((En)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Yqa.i;
    }

    private void y() {
        iO_2 a2;
        if (a2.actionCase_ == wOa.h) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void y(iO a2) {
        super.K();
    }

    public static /* synthetic */ void f(iO iO2, IO iO3) {
        Object b2 = iO3;
        iO a2 = iO2;
        super.J((IO)b2);
    }

    public static /* synthetic */ void u(iO a2) {
        super.Y();
    }

    public static /* synthetic */ void f(iO iO2, NM nM) {
        iO b2 = nM;
        iO a2 = iO2;
        super.J((NM)b2);
    }

    private void J(EO eO2) {
        iO_2 b2 = eO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Lra.e;
    }

    public boolean getClearKeyboard() {
        iO_2 a2;
        if (a2.actionCase_ == kTa.j) {
            return (Boolean)a2.action_;
        }
        return uSa.E != 0;
    }

    public boolean hasReset() {
        iO_2 a2;
        if (a2.actionCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(iO iO2, nm nm2) {
        Object b2 = nm2;
        iO a2 = iO2;
        super.J((nm)b2);
    }

    private void f(aO aO2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = aO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == ITa.E && a2.action_ != aO.f()) {
            a2.action_ = ((oN)aO.J((aO)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = ITa.E;
    }

    public boolean hasAddBB() {
        iO_2 a2;
        if (a2.actionCase_ == hpa.Z) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(dO dO2) {
        iO_2 b2 = dO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = NTa.C;
    }

    public boolean hasPlayAnimation() {
        iO_2 a2;
        if (a2.actionCase_ == ITa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void q(iO a2) {
        super.G();
    }

    public static /* synthetic */ void z(iO a2) {
        super.C();
    }

    public static /* synthetic */ void o(iO a2) {
        super.H();
    }

    private void f(XN xN2) {
        iO_2 iO_22;
        iO_2 b2 = xN2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == uua.p && a2.action_ != XN.f()) {
            a2.action_ = ((Eo)XN.J((XN)((XN)a2.action_)).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = uua.p;
    }

    private void f(jm jm2) {
        iO_2 b2 = jm2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = WOa.fa;
    }

    public NM getEditBB() {
        iO_2 a2;
        if (a2.actionCase_ == ERa.C) {
            return (NM)a2.action_;
        }
        return NM.J();
    }

    private void u() {
        iO_2 a2;
        if (a2.actionCase_ == kTa.j) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void f(iO iO2, Qn qn2) {
        iO b2 = qn2;
        iO a2 = iO2;
        super.J((Qn)b2);
    }

    public NO getOpenUrl() {
        iO_2 a2;
        if (a2.actionCase_ == yta.Ka) {
            return (NO)a2.action_;
        }
        return NO.J();
    }

    private void f(Mo mo2) {
        iO_2 iO_22;
        iO_2 b2 = mo2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Tpa.z && a2.action_ != Mo.J()) {
            a2.action_ = ((IM)Mo.J((Mo)((Mo)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Tpa.z;
    }

    private void f(QO qO2) {
        iO_2 b2 = qO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = cQa.o;
    }

    public static iO f(InputStream a2) throws IOException {
        return (iO_2)iO_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(um um2) {
        iO_2 b2 = um2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Zqa.G;
    }

    public static /* synthetic */ void h(iO a2) {
        super.U();
    }

    private void q() {
        iO_2 a2;
        if (a2.actionCase_ == ITa.E) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void f(LN lN2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = lN2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == osa.c && a2.action_ != LN.J()) {
            a2.action_ = ((KN)LN.J((LN)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = osa.c;
    }

    public mm getPlayAnimation() {
        iO_2 a2;
        if (a2.actionCase_ == ITa.A) {
            return (mm)a2.action_;
        }
        return mm.f();
    }

    public dO getAdd3D() {
        iO_2 a2;
        if (a2.actionCase_ == NTa.C) {
            return (dO)a2.action_;
        }
        return dO.f();
    }

    private void f(IO iO2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = iO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == XTa.W && a2.action_ != IO.f()) {
            a2.action_ = ((ym)IO.J((IO)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = XTa.W;
    }

    private void J(hO hO2) {
        iO_2 b2 = hO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = fPa.i;
    }

    private void f(ON oN2) {
        iO_2 iO_22;
        iO_2 b2 = oN2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == yRa.d && a2.action_ != ON.f()) {
            a2.action_ = ((cO)ON.J((ON)((ON)a2.action_)).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = yRa.d;
    }

    public static /* synthetic */ void f(iO iO2, rn rn2) {
        iO b2 = rn2;
        iO a2 = iO2;
        super.J((rn)b2);
    }

    public static iO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (iO_2)iO_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasEdit2D() {
        iO_2 a2;
        if (a2.actionCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(En en2) {
        GeneratedMessageLite b2 = en2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Yqa.i;
    }

    static {
        iO_2 iO_22 = new iO_2();
        DEFAULT_INSTANCE = iO_22;
        GeneratedMessageLite.registerDefaultInstance(iO_2.class, iO_22);
    }

    public so getJoinVoiceChat() {
        iO_2 a2;
        if (a2.actionCase_ == Fsa.d) {
            return (so)a2.action_;
        }
        return so.J();
    }

    private void f(sm sm2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = sm2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == kTa.g && a2.action_ != sm.J()) {
            a2.action_ = ((fn)sm.J((sm)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = kTa.g;
    }

    public boolean hasPromoActivateResult() {
        iO_2 a2;
        if (a2.actionCase_ == Tpa.z) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void z() {
        iO_2 a2;
        if (a2.actionCase_ == yRa.d) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean hasParticles() {
        iO_2 a2;
        if (a2.actionCase_ == WOa.fa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(boolean bl) {
        iO_2 a2;
        boolean b2 = bl;
        iO_2 iO_22 = a2 = this;
        iO_22.actionCase_ = vRa.d;
        iO_22.action_ = b2;
    }

    public static /* synthetic */ void f(iO iO2, mo mo2) {
        Object b2 = mo2;
        iO a2 = iO2;
        super.f((mo)b2);
    }

    public static /* synthetic */ void f(iO iO2, hO hO2) {
        iO b2 = hO2;
        iO a2 = iO2;
        super.f((hO)b2);
    }

    public static /* synthetic */ void f(iO iO2, um um2) {
        iO b2 = um2;
        iO a2 = iO2;
        super.f((um)b2);
    }

    public static /* synthetic */ void J(iO iO2, IO iO3) {
        Object b2 = iO3;
        iO a2 = iO2;
        super.f((IO)b2);
    }

    public static /* synthetic */ void J(iO iO2, mo mo2) {
        Object b2 = mo2;
        iO a2 = iO2;
        super.J((mo)b2);
    }

    public static iO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void o() {
        iO_2 a2;
        if (a2.actionCase_ == TQa.ca) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void J(um um2) {
        iO_2 iO_22;
        iO_2 b2 = um2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Zqa.G && a2.action_ != um.f()) {
            a2.action_ = ((nM)um.J((um)((um)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Zqa.G;
    }

    private void f(nm nm2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = nm2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == AQa.P && a2.action_ != nm.J()) {
            a2.action_ = ((qM)nm.J((nm)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = AQa.P;
    }

    private void h() {
        iO_2 a2;
        if (a2.actionCase_ == uqa.g) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void J(iO iO2, Mo mo2) {
        iO b2 = mo2;
        iO a2 = iO2;
        super.f((Mo)b2);
    }

    public static /* synthetic */ void J(iO iO2, ON oN2) {
        iO b2 = oN2;
        iO a2 = iO2;
        super.f((ON)b2);
    }

    public static /* synthetic */ void m(iO a2) {
        super.j();
    }

    private void J(aO aO2) {
        GeneratedMessageLite b2 = aO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = ITa.E;
    }

    public static am J() {
        return (am)DEFAULT_INSTANCE.createBuilder();
    }

    private void m() {
        iO_2 a2;
        if (a2.actionCase_ == Yqa.i) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void E(iO a2) {
        super.I();
    }

    public RM getActionCase() {
        iO_2 a2;
        return RM.forNumber((int)a2.actionCase_);
    }

    public wM getRemoveBB() {
        iO_2 a2;
        if (a2.actionCase_ == Ypa.A) {
            return (wM)a2.action_;
        }
        return wM.f();
    }

    public static /* synthetic */ void J(iO iO2, EO eO2) {
        iO b2 = eO2;
        iO a2 = iO2;
        super.J((EO)b2);
    }

    public static /* synthetic */ void f(iO iO2, sm sm2) {
        Object b2 = sm2;
        iO a2 = iO2;
        super.f((sm)b2);
    }

    public static /* synthetic */ void J(iO iO2, nm nm2) {
        Object b2 = nm2;
        iO a2 = iO2;
        super.f((nm)b2);
    }

    public static /* synthetic */ void K(iO a2) {
        super.a();
    }

    private void E() {
        iO_2 a2;
        if (a2.actionCase_ == osa.c) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void f(iO iO2, jm jm2) {
        iO b2 = jm2;
        iO a2 = iO2;
        super.J((jm)b2);
    }

    private void K() {
        iO_2 a2;
        if (a2.actionCase_ == XTa.W) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void f(iO iO2, aO aO2) {
        Object b2 = aO2;
        iO a2 = iO2;
        super.J((aO)b2);
    }

    public um getCopyToClipboard() {
        iO_2 a2;
        if (a2.actionCase_ == Zqa.G) {
            return (um)a2.action_;
        }
        return um.f();
    }

    public static iO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void c() {
        iO_2 a2;
        if (a2.actionCase_ == WOa.fa) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void f(mm mm2) {
        iO_2 b2 = mm2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = ITa.A;
    }

    public static /* synthetic */ void c(iO a2) {
        super.q();
    }

    private void B() {
        iO_2 a2;
        if (a2.actionCase_ == fPa.i) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean hasEdit3D() {
        iO_2 a2;
        if (a2.actionCase_ == pPa.f) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void B(iO a2) {
        super.c();
    }

    public static iO J(ByteString a2) throws InvalidProtocolBufferException {
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static am J(iO a2) {
        return (am)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(iO iO2, wM wM2) {
        iO b2 = wM2;
        iO a2 = iO2;
        super.J((wM)b2);
    }

    private void L() {
        iO_2 a2;
        if (a2.actionCase_ == hpa.Z) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void f(iO iO2, So so2) {
        Object b2 = so2;
        iO a2 = iO2;
        super.J((So)b2);
    }

    private void b() {
        iO_2 a2;
        if (a2.actionCase_ == EPa.O) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean hasRegisterDynamicItem() {
        iO_2 a2;
        if (a2.actionCase_ == EPa.O) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public LN getResourceCheck() {
        iO_2 a2;
        if (a2.actionCase_ == osa.c) {
            return (LN)a2.action_;
        }
        return LN.J();
    }

    public aO getEntityOption() {
        iO_2 a2;
        if (a2.actionCase_ == ITa.E) {
            return (aO)a2.action_;
        }
        return aO.f();
    }

    public boolean hasOpenUrl() {
        iO_2 a2;
        if (a2.actionCase_ == yta.Ka) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasRemove3D() {
        iO_2 a2;
        if (a2.actionCase_ == lqa.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(iO iO2, Rm rm2) {
        iO b2 = rm2;
        iO a2 = iO2;
        super.J((Rm)b2);
    }

    public static iO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public boolean hasOptionSet() {
        iO_2 a2;
        if (a2.actionCase_ == XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(iO iO2, so so2) {
        iO b2 = so2;
        iO a2 = iO2;
        super.J((so)b2);
    }

    public boolean getClear3D() {
        iO_2 a2;
        if (a2.actionCase_ == uua.s) {
            return (Boolean)a2.action_;
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
        iO_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new iO_2();
            }
            case 2: {
                return new am(null);
            }
            case 3: {
                Object[] objectArray = new Object[Zqa.G];
                objectArray[uSa.E] = Hta.m;
                objectArray[vRa.d] = Uta.J;
                objectArray[uqa.g] = in.class;
                objectArray[yRa.d] = ON.class;
                objectArray[AQa.P] = nm.class;
                objectArray[tTa.h] = XN.class;
                objectArray[uua.p] = IO.class;
                objectArray[XTa.W] = En.class;
                objectArray[Yqa.i] = jm.class;
                objectArray[WOa.fa] = dO.class;
                objectArray[NTa.C] = sN.class;
                objectArray[pPa.f] = Qn.class;
                objectArray[lqa.s] = JO.class;
                objectArray[uua.s] = wM.class;
                objectArray[hpa.Z] = NM.class;
                objectArray[Ypa.A] = NO.class;
                objectArray[ERa.C] = vm.class;
                objectArray[yta.Ka] = mo.class;
                objectArray[yOa.B] = rn.class;
                objectArray[wOa.t] = QO.class;
                objectArray[kTa.j] = LN.class;
                objectArray[wOa.h] = sm.class;
                objectArray[cQa.o] = aO.class;
                objectArray[AQa.ba] = EO.class;
                objectArray[osa.c] = vN.class;
                objectArray[kTa.g] = mm.class;
                objectArray[ITa.E] = so.class;
                objectArray[Lra.e] = So.class;
                objectArray[EPa.O] = hO.class;
                objectArray[ITa.A] = um.class;
                objectArray[Fsa.d] = Mo.class;
                objectArray[tua.U] = Rm.class;
                objectArray[fPa.i] = AO.class;
                d2 = objectArray;
                Object b2 = lqa.e;
                return iO_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = iO_2.class;
                synchronized (iO_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<iO>(DEFAULT_INSTANCE);
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

    private void a() {
        iO_2 a2;
        if (a2.actionCase_ == kTa.g) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean hasCopyToClipboard() {
        iO_2 a2;
        if (a2.actionCase_ == Zqa.G) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(NM nM2) {
        iO_2 iO_22;
        iO_2 b2 = nM2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == ERa.C && a2.action_ != NM.J()) {
            a2.action_ = ((yn)NM.J((NM)((NM)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = ERa.C;
    }

    public static /* synthetic */ void f(iO iO2, LN lN2) {
        Object b2 = lN2;
        iO a2 = iO2;
        super.J((LN)b2);
    }

    public static /* synthetic */ void L(iO a2) {
        super.P();
    }

    public boolean hasOpenGui() {
        iO_2 a2;
        if (a2.actionCase_ == Yqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasKeyboardUnbind() {
        iO_2 a2;
        if (a2.actionCase_ == wOa.t) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(iO iO2, QO qO2) {
        iO b2 = qO2;
        iO a2 = iO2;
        super.f((QO)b2);
    }

    public static /* synthetic */ void b(iO a2) {
        super.g();
    }

    private void J(jm jm2) {
        iO_2 iO_22;
        iO_2 b2 = jm2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == WOa.fa && a2.action_ != jm.J()) {
            a2.action_ = ((TN)jm.J((jm)((jm)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = WOa.fa;
    }

    public static /* synthetic */ void J(iO iO2, sN sN2) {
        Object b2 = sN2;
        iO a2 = iO2;
        super.J((sN)b2);
    }

    public boolean hasRemove2D() {
        iO_2 a2;
        if (a2.actionCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(iO iO2, Qn qn2) {
        iO b2 = qn2;
        iO a2 = iO2;
        super.f((Qn)b2);
    }

    private void f(NO nO2) {
        iO_2 iO_22;
        iO_2 b2 = nO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == yta.Ka && a2.action_ != NO.J()) {
            a2.action_ = ((HO)NO.J((NO)((NO)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = yta.Ka;
    }

    public boolean hasResourceCheck() {
        iO_2 a2;
        if (a2.actionCase_ == osa.c) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(So so2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = so2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == tua.U && a2.action_ != So.J()) {
            a2.action_ = ((om)So.J((So)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = tua.U;
    }

    private void J(XN xN2) {
        iO_2 b2 = xN2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = uua.p;
    }

    private void f(vm vm2) {
        iO_2 iO_22;
        iO_2 b2 = vm2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == yOa.B && a2.action_ != vm.f()) {
            a2.action_ = ((CN)vm.J((vm)((vm)a2.action_)).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = yOa.B;
    }

    public Qn getRemove3D() {
        iO_2 a2;
        if (a2.actionCase_ == lqa.s) {
            return (Qn)a2.action_;
        }
        return Qn.J();
    }

    public boolean hasIsometricDisable() {
        iO_2 a2;
        if (a2.actionCase_ == Qsa.Ha) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void H() {
        iO_2 a2;
        if (a2.actionCase_ == uua.s) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void J(so so2) {
        iO_2 iO_22;
        iO_2 b2 = so2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Fsa.d && a2.action_ != so.J()) {
            a2.action_ = ((xn)so.J((so)((so)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Fsa.d;
    }

    public boolean hasKeyboardBind() {
        iO_2 a2;
        if (a2.actionCase_ == yOa.B) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(iO iO2, AO aO2) {
        iO b2 = aO2;
        iO a2 = iO2;
        super.J((AO)b2);
    }

    public hO getSnowstormParticles() {
        iO_2 a2;
        if (a2.actionCase_ == fPa.i) {
            return (hO)a2.action_;
        }
        return hO.J();
    }

    public static /* synthetic */ void a(iO a2) {
        super.E();
    }

    public static /* synthetic */ void f(iO iO2, XN xN2) {
        iO b2 = xN2;
        iO a2 = iO2;
        super.J((XN)b2);
    }

    private void f(JO jO2) {
        GeneratedMessageLite b2 = jO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = hpa.Z;
    }

    private void g() {
        iO_2 a2;
        if (a2.actionCase_ == yta.Ka) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static iO J(CodedInputStream a2) throws IOException {
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static iO J(byte[] a2) throws InvalidProtocolBufferException {
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<iO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(iO iO2, jm jm2) {
        iO b2 = jm2;
        iO a2 = iO2;
        super.f((jm)b2);
    }

    public static /* synthetic */ void H(iO a2) {
        super.f();
    }

    public static /* synthetic */ void g(iO a2) {
        super.i();
    }

    public static /* synthetic */ void f(iO iO2, En en2) {
        Object b2 = en2;
        iO a2 = iO2;
        super.f((En)b2);
    }

    public static iO f() {
        return DEFAULT_INSTANCE;
    }

    private void J(QO qO2) {
        iO_2 iO_22;
        iO_2 b2 = qO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == cQa.o && a2.action_ != QO.f()) {
            a2.action_ = ((tm)QO.J((QO)((QO)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = cQa.o;
    }

    private void I() {
        iO_2 a2;
        if (a2.actionCase_ == Zqa.G) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void j() {
        iO_2 a2;
        if (a2.actionCase_ == lqa.s) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void F() {
        iO_2 a2;
        if (a2.actionCase_ == tua.U) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void J(iO iO2, so so2) {
        iO b2 = so2;
        iO a2 = iO2;
        super.f((so)b2);
    }

    public AO getIsometricDisable() {
        iO_2 a2;
        if (a2.actionCase_ == Qsa.Ha) {
            return (AO)a2.action_;
        }
        return AO.J();
    }

    public XN getEdit2D() {
        iO_2 a2;
        if (a2.actionCase_ == uua.p) {
            return (XN)a2.action_;
        }
        return XN.f();
    }

    public static /* synthetic */ void I(iO a2) {
        super.k();
    }

    public jm getParticles() {
        iO_2 a2;
        if (a2.actionCase_ == WOa.fa) {
            return (jm)a2.action_;
        }
        return jm.J();
    }

    public static /* synthetic */ void j(iO a2) {
        super.h();
    }

    public static /* synthetic */ void F(iO a2) {
        super.s();
    }

    private void J(dO dO2) {
        iO_2 iO_22;
        iO_2 b2 = dO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == NTa.C && a2.action_ != dO.f()) {
            a2.action_ = ((Uo)dO.J((dO)((dO)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = NTa.C;
    }

    public static /* synthetic */ void J(iO iO2, AO aO2) {
        iO b2 = aO2;
        iO a2 = iO2;
        super.f((AO)b2);
    }

    public static /* synthetic */ void k(iO a2) {
        super.b();
    }

    public static /* synthetic */ void J(iO iO2, sm sm2) {
        Object b2 = sm2;
        iO a2 = iO2;
        super.J((sm)b2);
    }

    public vm getKeyboardBind() {
        iO_2 a2;
        if (a2.actionCase_ == yOa.B) {
            return (vm)a2.action_;
        }
        return vm.f();
    }

    public static /* synthetic */ void J(iO iO2, LN lN2) {
        Object b2 = lN2;
        iO a2 = iO2;
        super.f((LN)b2);
    }

    private void k() {
        iO_2 a2;
        if (a2.actionCase_ == ITa.A) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean hasClear3D() {
        iO_2 a2;
        if (a2.actionCase_ == uua.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public IO getOptionSet() {
        iO_2 a2;
        if (a2.actionCase_ == XTa.W) {
            return (IO)a2.action_;
        }
        return IO.f();
    }

    private void J(rn rn2) {
        iO_2 b2 = rn2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = wOa.h;
    }

    private void J(mm mm2) {
        iO_2 iO_22;
        iO_2 b2 = mm2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == ITa.A && a2.action_ != mm.f()) {
            a2.action_ = ((Co)mm.J((mm)((mm)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = ITa.A;
    }

    public static /* synthetic */ void J(iO iO2, QO qO2) {
        iO b2 = qO2;
        iO a2 = iO2;
        super.J((QO)b2);
    }

    public static /* synthetic */ void G(iO a2) {
        super.F();
    }

    public static /* synthetic */ void f(iO iO2, vm vm2) {
        iO b2 = vm2;
        iO a2 = iO2;
        super.f((vm)b2);
    }

    public static /* synthetic */ void f(iO iO2, NO nO2) {
        iO b2 = nO2;
        iO a2 = iO2;
        super.J((NO)b2);
    }

    private void G() {
        iO_2 a2;
        if (a2.actionCase_ == tTa.h) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void J(iO iO2, hO hO2) {
        iO b2 = hO2;
        iO a2 = iO2;
        super.J((hO)b2);
    }

    public static /* synthetic */ void D(iO a2) {
        super.e();
    }

    private void J(Qn qn2) {
        iO_2 b2 = qn2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = lqa.s;
    }

    public En getOpenGui() {
        iO_2 a2;
        if (a2.actionCase_ == Yqa.i) {
            return (En)a2.action_;
        }
        return En.f();
    }

    public mo getKeyboardUnbind() {
        iO_2 a2;
        if (a2.actionCase_ == wOa.t) {
            return (mo)a2.action_;
        }
        return mo.J();
    }

    public boolean hasEditBB() {
        iO_2 a2;
        if (a2.actionCase_ == ERa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(NM nM2) {
        iO_2 b2 = nM2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = ERa.C;
    }

    private void f(mo mo2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = mo2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == wOa.t && a2.action_ != mo.J()) {
            a2.action_ = ((Fo)mo.J((mo)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = wOa.t;
    }

    public boolean hasReconnectData() {
        iO_2 a2;
        if (a2.actionCase_ == tua.U) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasClearKeyboard() {
        iO_2 a2;
        if (a2.actionCase_ == kTa.j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasResourceSave() {
        iO_2 a2;
        if (a2.actionCase_ == kTa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(iO iO2, in in2) {
        Object b2 = in2;
        iO a2 = iO2;
        super.f((in)b2);
    }

    public static /* synthetic */ void J(iO iO2, So so2) {
        Object b2 = so2;
        iO a2 = iO2;
        super.f((So)b2);
    }

    public static /* synthetic */ iO J() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasAdd2Dgroup() {
        iO_2 a2;
        if (a2.actionCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(iO iO2, boolean bl) {
        boolean b2 = bl;
        iO a2 = iO2;
        super.f(b2);
    }

    public sN getEdit3D() {
        iO_2 a2;
        if (a2.actionCase_ == pPa.f) {
            return (sN)a2.action_;
        }
        return sN.f();
    }

    private void f(in in2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = in2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == uqa.g && a2.action_ != in.J()) {
            a2.action_ = ((In)in.J((in)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = uqa.g;
    }

    private void J(IO iO2) {
        GeneratedMessageLite b2 = iO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = XTa.W;
    }

    public boolean hasSnowstormParticles() {
        iO_2 a2;
        if (a2.actionCase_ == fPa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public JO getAddBB() {
        iO_2 a2;
        if (a2.actionCase_ == hpa.Z) {
            return (JO)a2.action_;
        }
        return JO.J();
    }

    public static /* synthetic */ void f(iO iO2, JO jO2) {
        Object b2 = jO2;
        iO a2 = iO2;
        super.f((JO)b2);
    }

    public ON getAdd2Dgroup() {
        iO_2 a2;
        if (a2.actionCase_ == yRa.d) {
            return (ON)a2.action_;
        }
        return ON.f();
    }

    public rn getSoundPlay() {
        iO_2 a2;
        if (a2.actionCase_ == wOa.h) {
            return (rn)a2.action_;
        }
        return rn.f();
    }

    public static /* synthetic */ void A(iO a2) {
        super.u();
    }

    public static /* synthetic */ void J(iO iO2, vN vN2) {
        Object b2 = vN2;
        iO a2 = iO2;
        super.f((vN)b2);
    }

    private void D() {
        iO_2 a2;
        if (a2.actionCase_ == uua.p) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public boolean hasAdd3D() {
        iO_2 a2;
        if (a2.actionCase_ == NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static iO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public QO getSoundStop() {
        iO_2 a2;
        if (a2.actionCase_ == cQa.o) {
            return (QO)a2.action_;
        }
        return QO.f();
    }

    public static /* synthetic */ void J(iO iO2, XN xN2) {
        iO b2 = xN2;
        iO a2 = iO2;
        super.f((XN)b2);
    }

    private void J(Mo mo2) {
        iO_2 b2 = mo2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = Tpa.z;
    }

    private void J(vm vm2) {
        iO_2 b2 = vm2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = yOa.B;
    }

    public vN getRegisterDynamicItem() {
        iO_2 a2;
        if (a2.actionCase_ == EPa.O) {
            return (vN)a2.action_;
        }
        return vN.f();
    }

    public static /* synthetic */ void J(iO iO2, NO nO2) {
        iO b2 = nO2;
        iO a2 = iO2;
        super.f((NO)b2);
    }

    public static /* synthetic */ void f(iO iO2, boolean bl) {
        boolean b2 = bl;
        iO a2 = iO2;
        super.l(b2);
    }

    private void A() {
        iO_2 a2;
        if (a2.actionCase_ == Ypa.A) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void i(iO a2) {
        super.D();
    }

    public Mo getPromoActivateResult() {
        iO_2 a2;
        if (a2.actionCase_ == Tpa.z) {
            return (Mo)a2.action_;
        }
        return Mo.J();
    }

    private void J(nm nm2) {
        GeneratedMessageLite b2 = nm2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = AQa.P;
    }

    public sm getResourceSave() {
        iO_2 a2;
        if (a2.actionCase_ == kTa.g) {
            return (sm)a2.action_;
        }
        return sm.J();
    }

    public static iO J(InputStream a2) throws IOException {
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void i() {
        iO_2 a2;
        if (a2.actionCase_ == yOa.B) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void J(iO iO2, NM nM) {
        iO b2 = nM;
        iO a2 = iO2;
        super.f((NM)b2);
    }

    public boolean hasIsometricEnable() {
        iO_2 a2;
        if (a2.actionCase_ == TQa.ca) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasAdd2D() {
        iO_2 a2;
        if (a2.actionCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(sN sN2) {
        GeneratedMessageLite b2 = sN2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = pPa.f;
    }

    private void J(sm sm2) {
        GeneratedMessageLite b2 = sm2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = kTa.g;
    }

    private void J(ON oN2) {
        iO_2 b2 = oN2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = yRa.d;
    }

    private void J(NO nO2) {
        iO_2 b2 = nO2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = yta.Ka;
    }

    public static /* synthetic */ void M(iO a2) {
        super.A();
    }

    public static /* synthetic */ void J(iO iO2, wM wM2) {
        iO b2 = wM2;
        iO a2 = iO2;
        super.f((wM)b2);
    }

    public static /* synthetic */ void e(iO a2) {
        super.m();
    }

    public static /* synthetic */ void J(iO iO2, um um2) {
        iO b2 = um2;
        iO a2 = iO2;
        super.J((um)b2);
    }

    private void J(vN vN2) {
        GeneratedMessageLite b2 = vN2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = EPa.O;
    }

    public boolean hasEntityOption() {
        iO_2 a2;
        if (a2.actionCase_ == ITa.E) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(mo mo2) {
        GeneratedMessageLite b2 = mo2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = wOa.t;
    }

    public boolean hasClear2D() {
        iO_2 a2;
        if (a2.actionCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(iO a2) {
        super.y();
    }

    private void M() {
        iO_2 a2;
        if (a2.actionCase_ == pPa.f) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void e() {
        iO_2 a2;
        if (a2.actionCase_ == ERa.C) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void J(Rm rm2) {
        iO_2 iO_22;
        iO_2 b2 = rm2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == TQa.ca && a2.action_ != Rm.J()) {
            a2.action_ = ((km)Rm.J((Rm)((Rm)a2.action_)).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = TQa.ca;
    }

    private void J(JO jO2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = jO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == hpa.Z && a2.action_ != JO.J()) {
            a2.action_ = ((kM)JO.J((JO)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = hpa.Z;
    }

    private void d() {
        iO_2 a2;
        if (a2.actionCase_ == Fsa.d) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void J(iO iO2, vm vm2) {
        iO b2 = vm2;
        iO a2 = iO2;
        super.J((vm)b2);
    }

    public static /* synthetic */ void J(iO iO2, En en2) {
        Object b2 = en2;
        iO a2 = iO2;
        super.J((En)b2);
    }

    public static /* synthetic */ void J(iO iO2, Rm rm2) {
        iO b2 = rm2;
        iO a2 = iO2;
        super.f((Rm)b2);
    }

    public static /* synthetic */ void J(iO iO2, aO aO2) {
        Object b2 = aO2;
        iO a2 = iO2;
        super.f((aO)b2);
    }

    public static /* synthetic */ void J(iO iO2, rn rn2) {
        iO b2 = rn2;
        iO a2 = iO2;
        super.f((rn)b2);
    }

    private void J(AO aO2) {
        iO_2 iO_22;
        iO_2 b2 = aO2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Qsa.Ha && a2.action_ != AO.J()) {
            a2.action_ = ((pN)AO.J((AO)((AO)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Qsa.Ha;
    }

    public static /* synthetic */ void J(iO iO2, in in2) {
        Object b2 = in2;
        iO a2 = iO2;
        super.J((in)b2);
    }

    public static /* synthetic */ void C(iO a2) {
        super.o();
    }

    public nm getRemove2D() {
        iO_2 a2;
        if (a2.actionCase_ == AQa.P) {
            return (nm)a2.action_;
        }
        return nm.J();
    }

    private void C() {
        iO_2 a2;
        if (a2.actionCase_ == Qsa.Ha) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void l(iO a2) {
        super.R();
    }

    private void J(wM wM2) {
        iO_2 iO_22;
        iO_2 b2 = wM2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == Ypa.A && a2.action_ != wM.f()) {
            a2.action_ = ((hM)wM.J((wM)((wM)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = Ypa.A;
    }

    public static /* synthetic */ void f(iO a2) {
        super.l();
    }

    private void J(in in2) {
        GeneratedMessageLite b2 = in2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = uqa.g;
    }

    public static /* synthetic */ void J(iO iO2, dO dO2) {
        iO b2 = dO2;
        iO a2 = iO2;
        super.f((dO)b2);
    }

    public static /* synthetic */ void J(iO a2) {
        super.z();
    }

    private void l() {
        iO_2 a2;
        if (a2.actionCase_ == NTa.C) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    public static /* synthetic */ void J(iO iO2, boolean bl) {
        boolean b2 = bl;
        iO a2 = iO2;
        super.J(b2);
    }

    private void f(boolean bl) {
        iO_2 a2;
        boolean b2 = bl;
        iO_2 iO_22 = a2 = this;
        iO_22.actionCase_ = uua.s;
        iO_22.action_ = b2;
    }

    public boolean hasSoundStop() {
        iO_2 a2;
        if (a2.actionCase_ == cQa.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(boolean bl) {
        iO_2 a2;
        boolean b2 = bl;
        iO_2 iO_22 = a2 = this;
        iO_22.actionCase_ = tTa.h;
        iO_22.action_ = b2;
    }

    private void f() {
        iO_2 a2;
        if (a2.actionCase_ == wOa.t) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void J(LN lN2) {
        GeneratedMessageLite b2 = lN2;
        iO_2 a2 = this;
        b2.getClass();
        iO_2 iO_22 = a2;
        iO_22.action_ = b2;
        iO_22.actionCase_ = osa.c;
    }

    public static /* synthetic */ void J(iO iO2, JO jO2) {
        Object b2 = jO2;
        iO a2 = iO2;
        super.J((JO)b2);
    }

    public static iO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (iO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(iO iO2, mm mm2) {
        iO b2 = mm2;
        iO a2 = iO2;
        super.J((mm)b2);
    }

    public So getReconnectData() {
        iO_2 a2;
        if (a2.actionCase_ == tua.U) {
            return (So)a2.action_;
        }
        return So.J();
    }

    private void J() {
        iO_2 a2;
        if (a2.actionCase_ == AQa.P) {
            iO_2 iO_22 = a2;
            iO_22.actionCase_ = uSa.E;
            iO_22.action_ = null;
        }
    }

    private void J(sN sN2) {
        iO_2 iO_22;
        GeneratedMessageLite b2 = sN2;
        iO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == pPa.f && a2.action_ != sN.f()) {
            a2.action_ = ((kn)sN.J((sN)a2.action_).mergeFrom(b2)).buildPartial();
            iO_22 = a2;
        } else {
            iO_22 = a2;
            a2.action_ = b2;
        }
        iO_22.actionCase_ = pPa.f;
    }
}

