/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DL
 *  EJ
 *  ERa
 *  JPa
 *  KJ
 *  NOa
 *  NTa
 *  OJ
 *  Qj
 *  Qsa
 *  TJ
 *  WSa
 *  XTa
 *  Ypa
 *  Ysa
 *  cQa
 *  cra
 *  iL
 *  iPa
 *  lqa
 *  oJ
 *  pPa
 *  vQa
 *  vRa
 *  wK
 *  wOa
 *  yra
 *  ysa
 *  zTa
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
public final class KJ_1
extends GeneratedMessageLite<KJ, Qj>
implements S {
    private Internal.ProtobufList<CL> actions_;
    public static final int SCALEY_FIELD_NUMBER = 21;
    public static final int SCALEZ_FIELD_NUMBER = 23;
    public static final int SCALEYANIM_FIELD_NUMBER = 22;
    private int yvalCase_;
    public static final int ANGLEX_FIELD_NUMBER = 8;
    public static final int XANIM_FIELD_NUMBER = 2;
    private int scaleZvalCase_;
    public static final int Z_FIELD_NUMBER = 5;
    private int scalevalCase_;
    public static final int SCALEX_FIELD_NUMBER = 19;
    private int angleYvalCase_;
    private Object scaleval_;
    public static final int ANGLEXANIM_FIELD_NUMBER = 9;
    public static final int Y_FIELD_NUMBER = 3;
    private Object scaleXval_;
    public static final int ANGLEXANIMSMART_FIELD_NUMBER = 10;
    private Object xval_;
    public static final int ANGLEY_FIELD_NUMBER = 11;
    private int zvalCase_;
    public static final int YANIM_FIELD_NUMBER = 4;
    private int angleXvalCase_;
    public static final int SCALEZANIM_FIELD_NUMBER = 24;
    public static final int ACTIONS_FIELD_NUMBER = 7;
    private int xvalCase_ = uSa.E;
    private Object scaleZval_;
    public static final int SCALEANIM_FIELD_NUMBER = 18;
    public static final int ANGLEYANIM_FIELD_NUMBER = 12;
    private int scaleYvalCase_;
    private Object zval_;
    public static final int ANGLEZ_FIELD_NUMBER = 14;
    private Object angleXval_;
    private int scaleXvalCase_;
    private Object yval_;
    private Object angleYval_;
    private int angleZvalCase_;
    public static final int SCALE_FIELD_NUMBER = 17;
    private static final KJ DEFAULT_INSTANCE;
    private Object scaleYval_;
    private static volatile Parser<KJ> PARSER;
    public static final int ANGLEYANIMSMART_FIELD_NUMBER = 13;
    public static final int X_FIELD_NUMBER = 1;
    public static final int SCALEXANIM_FIELD_NUMBER = 20;
    public static final int ZANIM_FIELD_NUMBER = 6;
    private Object angleZval_;
    public static final int ANGLEZANIM_FIELD_NUMBER = 15;
    public static final int ANGLEZANIMSMART_FIELD_NUMBER = 16;

    public static Qj J() {
        return (Qj)DEFAULT_INSTANCE.createBuilder();
    }

    private void K(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.yvalCase_ = yRa.d;
        kJ_1.yval_ = Float.valueOf(b2);
    }

    private void Y() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.zvalCase_ = uSa.E;
        kJ_1.zval_ = null;
    }

    private void c(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.zvalCase_ = tTa.h;
        kJ_1.zval_ = Float.valueOf(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, CL cL2) {
        void b2;
        GeneratedMessageLite c2 = cL2;
        KJ_1 a2 = this;
        c2.getClass();
        KJ_1 kJ_1 = a2;
        kJ_1.J();
        kJ_1.actions_.set((int)b2, (CL)c2);
    }

    @Override
    public float getScaleY() {
        KJ_1 a2;
        if (a2.scaleYvalCase_ == wOa.h) {
            return ((Float)a2.scaleYval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void U(KJ a2) {
        super.j();
    }

    public static /* synthetic */ void K(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.i(b2);
    }

    private void U() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == WOa.fa) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleXvalCase_ = uSa.E;
            kJ_1.angleXval_ = null;
        }
    }

    public static KJ J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static KJ J(ByteString a2) throws InvalidProtocolBufferException {
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasAngleX() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == Yqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static KJ f(InputStream a2) throws IOException {
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public float getXAnim() {
        KJ_1 a2;
        if (a2.xvalCase_ == uqa.g) {
            return ((Float)a2.xval_).floatValue();
        }
        return JPa.N;
    }

    private void P() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == uua.s) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleYvalCase_ = uSa.E;
            kJ_1.angleYval_ = null;
        }
    }

    @Override
    public boolean hasXAnim() {
        KJ_1 a2;
        if (a2.xvalCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasX() {
        KJ_1 a2;
        if (a2.xvalCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void P(KJ a2) {
        super.d();
    }

    @Override
    public wK getAngleZvalCase() {
        KJ_1 a2;
        return wK.forNumber((int)a2.angleZvalCase_);
    }

    @Override
    public boolean hasScaleYAnim() {
        KJ_1 a2;
        if (a2.scaleYvalCase_ == cQa.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public float getZAnim() {
        KJ_1 a2;
        if (a2.zvalCase_ == uua.p) {
            return ((Float)a2.zval_).floatValue();
        }
        return JPa.N;
    }

    private void B(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleZvalCase_ = ERa.C;
        kJ_1.angleZval_ = Float.valueOf(b2);
    }

    private void L(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleZvalCase_ = Ypa.A;
        kJ_1.angleZval_ = Float.valueOf(b2);
    }

    private void s() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == pPa.f) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleYvalCase_ = uSa.E;
            kJ_1.angleYval_ = null;
        }
    }

    @Override
    public boolean hasAngleY() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == pPa.f) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void b(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.xvalCase_ = vRa.d;
        kJ_1.xval_ = Float.valueOf(b2);
    }

    private void a(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleYvalCase_ = pPa.f;
        kJ_1.angleYval_ = Float.valueOf(b2);
    }

    public R J(int n2) {
        int b2 = n2;
        KJ_1 a2 = this;
        return (R)a2.actions_.get(b2);
    }

    public static /* synthetic */ void s(KJ a2) {
        super.P();
    }

    @Override
    public boolean hasScaleZAnim() {
        KJ_1 a2;
        if (a2.scaleZvalCase_ == osa.c) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void y(KJ a2) {
        super.b();
    }

    public static /* synthetic */ void u(KJ a2) {
        super.k();
    }

    private void y() {
        KJ_1 a2;
        if (a2.yvalCase_ == yRa.d) {
            KJ_1 kJ_1 = a2;
            kJ_1.yvalCase_ = uSa.E;
            kJ_1.yval_ = null;
        }
    }

    private void H(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleXvalCase_ = NTa.C;
        kJ_1.angleXval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void c(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.I(b2);
    }

    @Override
    public boolean hasScaleAnim() {
        KJ_1 a2;
        if (a2.scalevalCase_ == yOa.B) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void B(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.B(b2);
    }

    public static Qj J(KJ a2) {
        return (Qj)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void u() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.angleXvalCase_ = uSa.E;
        kJ_1.angleXval_ = null;
    }

    private void q() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.scaleXvalCase_ = uSa.E;
        kJ_1.scaleXval_ = null;
    }

    private void z() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.xvalCase_ = uSa.E;
        kJ_1.xval_ = null;
    }

    private void o() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == Yqa.i) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleXvalCase_ = uSa.E;
            kJ_1.angleXval_ = null;
        }
    }

    public static /* synthetic */ void q(KJ a2) {
        super.I();
    }

    public static /* synthetic */ void z(KJ a2) {
        super.m();
    }

    @Override
    public float getScaleXAnim() {
        KJ_1 a2;
        if (a2.scaleXvalCase_ == kTa.j) {
            return ((Float)a2.scaleXval_).floatValue();
        }
        return JPa.N;
    }

    public static KJ J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void o(KJ a2) {
        super.K();
    }

    public static /* synthetic */ void L(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.G(b2);
    }

    @Override
    public TJ getScalevalCase() {
        KJ_1 a2;
        return TJ.forNumber((int)a2.scalevalCase_);
    }

    public static /* synthetic */ void b(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.b(b2);
    }

    @Override
    public float getAngleZ() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == hpa.Z) {
            return ((Float)a2.angleZval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public iL getScaleZvalCase() {
        KJ_1 a2;
        return iL.forNumber((int)a2.scaleZvalCase_);
    }

    private void h() {
        a.actions_ = KJ_1.emptyProtobufList();
    }

    @Override
    public boolean hasZ() {
        KJ_1 a2;
        if (a2.zvalCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void h(KJ a2) {
        super.o();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(KJ kJ2, int n2, CL cL2) {
        void b2;
        Object c2 = cL2;
        KJ a2 = kJ2;
        super.f((int)b2, (CL)c2);
    }

    private void m() {
        KJ_1 a2;
        if (a2.xvalCase_ == vRa.d) {
            KJ_1 kJ_1 = a2;
            kJ_1.xvalCase_ = uSa.E;
            kJ_1.xval_ = null;
        }
    }

    @Override
    public float getAngleY() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == pPa.f) {
            return ((Float)a2.angleYval_).floatValue();
        }
        return JPa.N;
    }

    private void E() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.scaleYvalCase_ = uSa.E;
        kJ_1.scaleYval_ = null;
    }

    public static /* synthetic */ void a(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.j(b2);
    }

    private void g(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scaleYvalCase_ = wOa.h;
        kJ_1.scaleYval_ = Float.valueOf(b2);
    }

    private void K() {
        KJ_1 a2;
        if (a2.yvalCase_ == AQa.P) {
            KJ_1 kJ_1 = a2;
            kJ_1.yvalCase_ = uSa.E;
            kJ_1.yval_ = null;
        }
    }

    public static /* synthetic */ void m(KJ a2) {
        super.D();
    }

    @Override
    public float getYAnim() {
        KJ_1 a2;
        if (a2.yvalCase_ == AQa.P) {
            return ((Float)a2.yval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public float getAngleYAnim() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == lqa.s) {
            return ((Float)a2.angleYval_).floatValue();
        }
        return JPa.N;
    }

    private void c() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == NTa.C) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleXvalCase_ = uSa.E;
            kJ_1.angleXval_ = null;
        }
    }

    @Override
    public boolean hasAngleYAnimSmart() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == uua.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void H(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.e(b2);
    }

    public static /* synthetic */ void E(KJ a2) {
        super.L();
    }

    private void I(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.yvalCase_ = AQa.P;
        kJ_1.yval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void K(KJ a2) {
        super.y();
    }

    private void j(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleYvalCase_ = lqa.s;
        kJ_1.angleYval_ = Float.valueOf(b2);
    }

    private void B() {
        KJ_1 a2;
        if (a2.zvalCase_ == uua.p) {
            KJ_1 kJ_1 = a2;
            kJ_1.zvalCase_ = uSa.E;
            kJ_1.zval_ = null;
        }
    }

    @Override
    public float getScale() {
        KJ_1 a2;
        if (a2.scalevalCase_ == yta.Ka) {
            return ((Float)a2.scaleval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void c(KJ a2) {
        super.F();
    }

    private void L() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == Ypa.A) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleZvalCase_ = uSa.E;
            kJ_1.angleZval_ = null;
        }
    }

    @Override
    public float getScaleZAnim() {
        KJ_1 a2;
        if (a2.scaleZvalCase_ == osa.c) {
            return ((Float)a2.scaleZval_).floatValue();
        }
        return JPa.N;
    }

    private void b() {
        KJ_1 a2;
        if (a2.scaleZvalCase_ == AQa.ba) {
            KJ_1 kJ_1 = a2;
            kJ_1.scaleZvalCase_ = uSa.E;
            kJ_1.scaleZval_ = null;
        }
    }

    private void a() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.scalevalCase_ = uSa.E;
        kJ_1.scaleval_ = null;
    }

    private void J(int n2) {
        KJ_1 a2;
        int b2 = n2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.J();
        kJ_1.actions_.remove(b2);
    }

    public static /* synthetic */ void B(KJ a2) {
        super.l();
    }

    public static /* synthetic */ void L(KJ a2) {
        super.c();
    }

    @Override
    public boolean hasY() {
        KJ_1 a2;
        if (a2.yvalCase_ == yRa.d) {
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
        KJ_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new KJ_1();
            }
            case 2: {
                return new Qj(null);
            }
            case 3: {
                Object[] objectArray = new Object[cQa.o];
                objectArray[uSa.E] = Bra.h;
                objectArray[vRa.d] = qQa.ha;
                objectArray[uqa.g] = NOa.Ga;
                objectArray[yRa.d] = gsa.A;
                objectArray[AQa.P] = yra.j;
                objectArray[tTa.h] = XTa.Ja;
                objectArray[uua.p] = ysa.Da;
                objectArray[XTa.W] = iPa.A;
                objectArray[Yqa.i] = POa.a;
                objectArray[WOa.fa] = Nta.Fa;
                objectArray[NTa.C] = Qsa.x;
                objectArray[pPa.f] = WPa.J;
                objectArray[lqa.s] = mPa.E;
                objectArray[uua.s] = gQa.Fa;
                objectArray[hpa.Z] = zTa.L;
                objectArray[Ypa.A] = vQa.Q;
                objectArray[ERa.C] = Ysa.U;
                objectArray[yta.Ka] = IPa.ca;
                objectArray[yOa.B] = WSa.L;
                objectArray[wOa.t] = zta.t;
                objectArray[kTa.j] = cra.m;
                objectArray[wOa.h] = CL.class;
                d2 = objectArray;
                Object b2 = zua.f;
                return KJ_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = KJ_1.class;
                synchronized (KJ_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<KJ>(DEFAULT_INSTANCE);
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
    public float getScaleAnim() {
        KJ_1 a2;
        if (a2.scalevalCase_ == yOa.B) {
            return ((Float)a2.scaleval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public float getAngleXAnim() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == WOa.fa) {
            return ((Float)a2.angleXval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void b(KJ a2) {
        super.z();
    }

    public static /* synthetic */ void a(KJ a2) {
        super.g();
    }

    @Override
    public float getX() {
        KJ_1 a2;
        if (a2.xvalCase_ == vRa.d) {
            return ((Float)a2.xval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public boolean hasZAnim() {
        KJ_1 a2;
        if (a2.zvalCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void H(KJ a2) {
        super.M();
    }

    static {
        KJ_1 kJ_1 = new KJ_1();
        DEFAULT_INSTANCE = kJ_1;
        GeneratedMessageLite.registerDefaultInstance(KJ_1.class, kJ_1);
    }

    public static /* synthetic */ void g(KJ a2) {
        super.A();
    }

    public static /* synthetic */ void g(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.f(b2);
    }

    private void F(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scaleZvalCase_ = osa.c;
        kJ_1.scaleZval_ = Float.valueOf(b2);
    }

    @Override
    public boolean hasAngleXAnimSmart() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public float getY() {
        KJ_1 a2;
        if (a2.yvalCase_ == yRa.d) {
            return ((Float)a2.yval_).floatValue();
        }
        return JPa.N;
    }

    private void k(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleYvalCase_ = uua.s;
        kJ_1.angleYval_ = Float.valueOf(b2);
    }

    private void H() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == lqa.s) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleYvalCase_ = uSa.E;
            kJ_1.angleYval_ = null;
        }
    }

    private void g() {
        KJ_1 a2;
        if (a2.scaleXvalCase_ == wOa.t) {
            KJ_1 kJ_1 = a2;
            kJ_1.scaleXvalCase_ = uSa.E;
            kJ_1.scaleXval_ = null;
        }
    }

    @Override
    public boolean hasScaleZ() {
        KJ_1 a2;
        if (a2.scaleZvalCase_ == AQa.ba) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void I(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.J(b2);
    }

    public static /* synthetic */ void J(KJ kJ2, CL cL2) {
        Object b2 = cL2;
        KJ a2 = kJ2;
        super.J((CL)b2);
    }

    public static /* synthetic */ void J(KJ kJ2, Iterable iterable) {
        Object b2 = iterable;
        KJ a2 = kJ2;
        super.J((Iterable<? extends CL>)b2);
    }

    private KJ_1() {
        KJ_1 a2;
        a2.yvalCase_ = uSa.E;
        a2.zvalCase_ = uSa.E;
        a2.angleXvalCase_ = uSa.E;
        a2.angleYvalCase_ = uSa.E;
        a2.angleZvalCase_ = uSa.E;
        a2.scalevalCase_ = uSa.E;
        a2.scaleXvalCase_ = uSa.E;
        a2.scaleYvalCase_ = uSa.E;
        a2.scaleZvalCase_ = uSa.E;
        a2.actions_ = KJ_1.emptyProtobufList();
    }

    public static /* synthetic */ void I(KJ a2) {
        super.H();
    }

    public static KJ J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void I() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.angleYvalCase_ = uSa.E;
        kJ_1.angleYval_ = null;
    }

    public static /* synthetic */ void j(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.l(b2);
    }

    public static KJ J(byte[] a2) throws InvalidProtocolBufferException {
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void F(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.k(b2);
    }

    @Override
    public float getScaleYAnim() {
        KJ_1 a2;
        if (a2.scaleYvalCase_ == cQa.o) {
            return ((Float)a2.scaleYval_).floatValue();
        }
        return JPa.N;
    }

    private void j() {
        KJ_1 a2;
        if (a2.scaleZvalCase_ == osa.c) {
            KJ_1 kJ_1 = a2;
            kJ_1.scaleZvalCase_ = uSa.E;
            kJ_1.scaleZval_ = null;
        }
    }

    public static /* synthetic */ void k(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.A(b2);
    }

    private void F() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == ERa.C) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleZvalCase_ = uSa.E;
            kJ_1.angleZval_ = null;
        }
    }

    public static /* synthetic */ void j(KJ a2) {
        super.f();
    }

    private void k() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.scaleZvalCase_ = uSa.E;
        kJ_1.scaleZval_ = null;
    }

    public static /* synthetic */ void F(KJ a2) {
        super.h();
    }

    private void G() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.angleZvalCase_ = uSa.E;
        kJ_1.angleZval_ = null;
    }

    private void D() {
        KJ_1 a2;
        if (a2.scalevalCase_ == yta.Ka) {
            KJ_1 kJ_1 = a2;
            kJ_1.scalevalCase_ = uSa.E;
            kJ_1.scaleval_ = null;
        }
    }

    @Override
    public boolean hasAngleZAnim() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == Ypa.A) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void G(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scalevalCase_ = yOa.B;
        kJ_1.scaleval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void G(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.g(b2);
    }

    @Override
    public boolean hasScaleY() {
        KJ_1 a2;
        if (a2.scaleYvalCase_ == wOa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public oJ getScaleXvalCase() {
        KJ_1 a2;
        return oJ.forNumber((int)a2.scaleXvalCase_);
    }

    private void D(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.zvalCase_ = uua.p;
        kJ_1.zval_ = Float.valueOf(b2);
    }

    public static KJ J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void D(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.D(b2);
    }

    @Override
    public hJ getXvalCase() {
        KJ_1 a2;
        return hJ.forNumber(a2.xvalCase_);
    }

    @Override
    public hk getAngleXvalCase() {
        KJ_1 a2;
        return hk.forNumber(a2.angleXvalCase_);
    }

    @Override
    public boolean hasScaleXAnim() {
        KJ_1 a2;
        if (a2.scaleXvalCase_ == kTa.j) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void A() {
        KJ_1 a2;
        if (a2.scalevalCase_ == yOa.B) {
            KJ_1 kJ_1 = a2;
            kJ_1.scalevalCase_ = uSa.E;
            kJ_1.scaleval_ = null;
        }
    }

    public static /* synthetic */ void A(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.c(b2);
    }

    private void A(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleXvalCase_ = WOa.fa;
        kJ_1.angleXval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void i(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.C(b2);
    }

    @Override
    public float getAngleX() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == Yqa.i) {
            return ((Float)a2.angleXval_).floatValue();
        }
        return JPa.N;
    }

    private void i() {
        KJ_1 a2;
        if (a2.zvalCase_ == tTa.h) {
            KJ_1 kJ_1 = a2;
            kJ_1.zvalCase_ = uSa.E;
            kJ_1.zval_ = null;
        }
    }

    public static /* synthetic */ void k(KJ a2) {
        super.G();
    }

    private void M() {
        KJ_1 a2;
        if (a2.xvalCase_ == uqa.g) {
            KJ_1 kJ_1 = a2;
            kJ_1.xvalCase_ = uSa.E;
            kJ_1.xval_ = null;
        }
    }

    @Override
    public float getAngleZAnim() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == Ypa.A) {
            return ((Float)a2.angleZval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public OJ getYvalCase() {
        KJ_1 a2;
        return OJ.forNumber((int)a2.yvalCase_);
    }

    public static /* synthetic */ void M(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.F(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(KJ kJ2, int n2, CL cL2) {
        void b2;
        Object c2 = cL2;
        KJ a2 = kJ2;
        super.J((int)b2, (CL)c2);
    }

    private void e() {
        KJ_1 a2;
        if (a2.scaleYvalCase_ == cQa.o) {
            KJ_1 kJ_1 = a2;
            kJ_1.scaleYvalCase_ = uSa.E;
            kJ_1.scaleYval_ = null;
        }
    }

    @Override
    public boolean hasAngleZ() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == hpa.Z) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void i(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.xvalCase_ = uqa.g;
        kJ_1.xval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ KJ f() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public boolean hasYAnim() {
        KJ_1 a2;
        if (a2.yvalCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasAngleZAnimSmart() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == ERa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void M(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scaleZvalCase_ = AQa.ba;
        kJ_1.scaleZval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void G(KJ a2) {
        super.s();
    }

    public static /* synthetic */ void D(KJ a2) {
        super.E();
    }

    public static KJ J(CodedInputStream a2) throws IOException {
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void e(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scaleXvalCase_ = wOa.t;
        kJ_1.scaleXval_ = Float.valueOf(b2);
    }

    @Override
    public wJ getScaleYvalCase() {
        KJ_1 a2;
        return wJ.forNumber(a2.scaleYvalCase_);
    }

    @Override
    public float getScaleZ() {
        KJ_1 a2;
        if (a2.scaleZvalCase_ == AQa.ba) {
            return ((Float)a2.scaleZval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void A(KJ a2) {
        super.u();
    }

    @Override
    public float getAngleZAnimSmart() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == ERa.C) {
            return ((Float)a2.angleZval_).floatValue();
        }
        return JPa.N;
    }

    private void d(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleZvalCase_ = hpa.Z;
        kJ_1.angleZval_ = Float.valueOf(b2);
    }

    private void C(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scaleYvalCase_ = cQa.o;
        kJ_1.scaleYval_ = Float.valueOf(b2);
    }

    @Override
    public boolean hasAngleXAnim() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == WOa.fa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.K(b2);
    }

    public static /* synthetic */ void i(KJ a2) {
        super.B();
    }

    private void d() {
        KJ_1 a2;
        if (a2.angleZvalCase_ == hpa.Z) {
            KJ_1 kJ_1 = a2;
            kJ_1.angleZvalCase_ = uSa.E;
            kJ_1.angleZval_ = null;
        }
    }

    @Override
    public float getScaleX() {
        KJ_1 a2;
        if (a2.scaleXvalCase_ == wOa.t) {
            return ((Float)a2.scaleXval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public boolean hasAngleYAnim() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == lqa.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public float getAngleYAnimSmart() {
        KJ_1 a2;
        if (a2.angleYvalCase_ == uua.s) {
            return ((Float)a2.angleYval_).floatValue();
        }
        return JPa.N;
    }

    public static KJ f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, CL cL2) {
        void b2;
        GeneratedMessageLite c2 = cL2;
        KJ_1 a2 = this;
        c2.getClass();
        KJ_1 kJ_1 = a2;
        kJ_1.J();
        kJ_1.actions_.add((int)b2, (CL)c2);
    }

    @Override
    public int getActionsCount() {
        KJ_1 a2;
        return a2.actions_.size();
    }

    public static /* synthetic */ void M(KJ a2) {
        super.U();
    }

    public static /* synthetic */ void J(KJ kJ2, int n2) {
        int b2 = n2;
        KJ a2 = kJ2;
        super.J(b2);
    }

    @Override
    public List<CL> getActionsList() {
        KJ_1 a2;
        return a2.actions_;
    }

    private void C() {
        KJ_1 a2;
        KJ_1 kJ_1 = a2;
        kJ_1.yvalCase_ = uSa.E;
        kJ_1.yval_ = null;
    }

    public static /* synthetic */ void d(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.M(b2);
    }

    public static /* synthetic */ void C(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.L(b2);
    }

    public static /* synthetic */ void l(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.d(b2);
    }

    private void l() {
        KJ_1 a2;
        if (a2.scaleYvalCase_ == wOa.h) {
            KJ_1 kJ_1 = a2;
            kJ_1.scaleYvalCase_ = uSa.E;
            kJ_1.scaleYval_ = null;
        }
    }

    @Override
    public float getAngleXAnimSmart() {
        KJ_1 a2;
        if (a2.angleXvalCase_ == NTa.C) {
            return ((Float)a2.angleXval_).floatValue();
        }
        return JPa.N;
    }

    public List<? extends R> J() {
        KJ_1 a2;
        return a2.actions_;
    }

    public static KJ J(InputStream a2) throws IOException {
        return (KJ_1)KJ_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.a(b2);
    }

    @Override
    public boolean hasScale() {
        KJ_1 a2;
        if (a2.scalevalCase_ == yta.Ka) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(KJ a2) {
        super.e();
    }

    @Override
    public DL getZvalCase() {
        KJ_1 a2;
        return DL.forNumber((int)a2.zvalCase_);
    }

    public static /* synthetic */ void d(KJ a2) {
        super.q();
    }

    private void f() {
        KJ_1 a2;
        if (a2.scaleXvalCase_ == kTa.j) {
            KJ_1 kJ_1 = a2;
            kJ_1.scaleXvalCase_ = uSa.E;
            kJ_1.scaleXval_ = null;
        }
    }

    public static KJ J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void C(KJ a2) {
        super.Y();
    }

    private void J() {
        KJ_1 kJ_1 = this;
        Internal.ProtobufList<CL> a2 = kJ_1.actions_;
        if (!a2.isModifiable()) {
            kJ_1.actions_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public EJ getAngleYvalCase() {
        KJ_1 a2;
        return EJ.forNumber((int)a2.angleYvalCase_);
    }

    public static /* synthetic */ void J(KJ kJ2, float f2) {
        float b2 = f2;
        KJ a2 = kJ2;
        super.H(b2);
    }

    private void l(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scalevalCase_ = yta.Ka;
        kJ_1.scaleval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void l(KJ a2) {
        super.i();
    }

    public static KJ J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (KJ_1)KJ_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public float getZ() {
        KJ_1 a2;
        if (a2.zvalCase_ == tTa.h) {
            return ((Float)a2.zval_).floatValue();
        }
        return JPa.N;
    }

    private void f(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.scaleXvalCase_ = kTa.j;
        kJ_1.scaleXval_ = Float.valueOf(b2);
    }

    private void J(float f2) {
        KJ_1 a2;
        float b2 = f2;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.angleXvalCase_ = Yqa.i;
        kJ_1.angleXval_ = Float.valueOf(b2);
    }

    public static KJ J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (KJ_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(KJ a2) {
        super.a();
    }

    public static Parser<KJ> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(Iterable<? extends CL> iterable) {
        KJ_1 a2;
        Iterable<? extends CL> b2 = iterable;
        KJ_1 kJ_1 = a2 = this;
        kJ_1.J();
        AbstractMessageLite.addAll(b2, kJ_1.actions_);
    }

    private void J(CL cL2) {
        GeneratedMessageLite b2 = cL2;
        KJ_1 a2 = this;
        b2.getClass();
        KJ_1 kJ_1 = a2;
        kJ_1.J();
        kJ_1.actions_.add((CL)b2);
    }

    @Override
    public CL getActions(int n2) {
        int b2 = n2;
        KJ_1 a2 = this;
        return (CL)a2.actions_.get(b2);
    }

    public static /* synthetic */ void J(KJ a2) {
        super.C();
    }

    @Override
    public boolean hasScaleX() {
        KJ_1 a2;
        if (a2.scaleXvalCase_ == wOa.t) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

