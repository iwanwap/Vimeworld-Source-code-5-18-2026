/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DQa
 *  ERa
 *  Ho
 *  JPa
 *  LQa
 *  NQa
 *  NTa
 *  QM
 *  QSa
 *  Uta
 *  XM
 *  XTa
 *  Xl
 *  Ypa
 *  aQa
 *  aqa
 *  cQa
 *  hra
 *  isa
 *  kj
 *  kpa
 *  lqa
 *  nQa
 *  pO
 *  pPa
 *  ura
 *  vRa
 *  wOa
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
public final class kj_2
extends GeneratedMessageLite<kj, Xl>
implements n {
    private boolean centered_;
    private Pm animation_;
    private float scaleZ_;
    public static final int SCALEX_FIELD_NUMBER = 4;
    public static final int CULLING_FIELD_NUMBER = 10;
    public static final int ANGLEZ_FIELD_NUMBER = 9;
    private float angleZ_;
    private float angleX_;
    public static final int DEPTHMASK_FIELD_NUMBER = 13;
    public static final int SCALEY_FIELD_NUMBER = 5;
    public static final int SCALEZ_FIELD_NUMBER = 6;
    private static final kj DEFAULT_INSTANCE;
    public static final int SCALE_FIELD_NUMBER = 17;
    private boolean culling_;
    public static final int X_FIELD_NUMBER = 1;
    public static final int ELEMENTS_FIELD_NUMBER = 15;
    private boolean depthMask_;
    public static final int ADJUSTABLEANGLE_FIELD_NUMBER = 11;
    public static final int ANGLEY_FIELD_NUMBER = 8;
    private float angleY_;
    public static final int Z_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int ATTACHMENT_FIELD_NUMBER = 16;
    private float x_;
    private float y_;
    private Internal.ProtobufList<XM> elements_ = kj_2.emptyProtobufList();
    private float scaleX_;
    private static volatile Parser<kj> PARSER;
    public static final int ANIMATION_FIELD_NUMBER = 14;
    private float z_;
    private boolean adjustableAngle_;
    private float scale_;
    public static final int CENTERED_FIELD_NUMBER = 12;
    private int bitField0_;
    public static final int ANGLEX_FIELD_NUMBER = 7;
    private QM attachment_;
    private float scaleY_;

    @Override
    public float getScale() {
        kj_2 a2;
        return a2.scale_;
    }

    public static /* synthetic */ void H(kj a2) {
        super.I();
    }

    public static /* synthetic */ void g(kj a2) {
        super.J();
    }

    private void a() {
        a.bitField0_ &= Jra.Fa;
        a.scaleZ_ = JPa.N;
    }

    public static Parser<kj> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static kj J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private kj_2() {
        kj_2 a2;
    }

    @Override
    public boolean getCulling() {
        kj_2 a2;
        return a2.culling_;
    }

    public static kj J(ByteString a2) throws InvalidProtocolBufferException {
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void I(kj a2) {
        super.a();
    }

    @Override
    public float getZ() {
        kj_2 a2;
        return a2.z_;
    }

    public static /* synthetic */ void D(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.J(b2);
    }

    public static /* synthetic */ void j(kj a2) {
        super.M();
    }

    private void H() {
        a.bitField0_ &= rQa.p;
        a.scale_ = JPa.N;
    }

    public static /* synthetic */ void F(kj a2) {
        super.d();
    }

    private void D(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.scale_ = b2;
    }

    static {
        kj_2 kj_22 = new kj_2();
        DEFAULT_INSTANCE = kj_22;
        GeneratedMessageLite.registerDefaultInstance(kj_2.class, kj_22);
    }

    @Override
    public boolean getDepthMask() {
        kj_2 a2;
        return a2.depthMask_;
    }

    private void g() {
        kj_2 kj_22 = this;
        Internal.ProtobufList<XM> a2 = kj_22.elements_;
        if (!a2.isModifiable()) {
            kj_22.elements_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public int getElementsCount() {
        kj_2 a2;
        return a2.elements_.size();
    }

    @Override
    public QM getAttachment() {
        kj_2 a2;
        if (a2.attachment_ == null) {
            return QM.f();
        }
        return a2.attachment_;
    }

    @Override
    public boolean hasAngleY() {
        kj_2 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasScaleZ() {
        kj_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void A(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.x_ = b2;
    }

    public static /* synthetic */ void k(kj a2) {
        super.l();
    }

    private void i(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.z_ = b2;
    }

    private void M(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.scaleX_ = b2;
    }

    public List<? extends va> J() {
        kj_2 a2;
        return a2.elements_;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, XM xM2) {
        void b2;
        kj_2 c2 = xM2;
        kj_2 a2 = this;
        c2.getClass();
        kj_2 kj_22 = a2;
        kj_22.g();
        kj_22.elements_.set((int)b2, (XM)c2);
    }

    private void e(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.scaleY_ = b2;
    }

    public static /* synthetic */ void G(kj a2) {
        super.A();
    }

    public static kj f(InputStream a2) throws IOException {
        return (kj_2)kj_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void A(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.i(b2);
    }

    @Override
    public float getScaleY() {
        kj_2 a2;
        return a2.scaleY_;
    }

    public static Xl J(kj a2) {
        return (Xl)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void C(kj kj2, boolean bl) {
        boolean b2 = bl;
        kj a2 = kj2;
        super.f(b2);
    }

    private void d(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.angleZ_ = b2;
    }

    @Override
    public float getY() {
        kj_2 a2;
        return a2.y_;
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
        kj_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new kj_2();
            }
            case 2: {
                return new Xl(null);
            }
            case 3: {
                Object[] objectArray = new Object[wOa.t];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = LQa.k;
                objectArray[uqa.g] = isa.I;
                objectArray[yRa.d] = DQa.Z;
                objectArray[AQa.P] = kra.fa;
                objectArray[tTa.h] = Hta.fa;
                objectArray[uua.p] = XTa.i;
                objectArray[XTa.W] = wOa.N;
                objectArray[Yqa.i] = Fua.O;
                objectArray[WOa.fa] = cQa.H;
                objectArray[NTa.C] = ATa.Fa;
                objectArray[pPa.f] = LRa.t;
                objectArray[lqa.s] = wOa.R;
                objectArray[uua.s] = fta.m;
                objectArray[hpa.Z] = STa.W;
                objectArray[Ypa.A] = nQa.i;
                objectArray[ERa.C] = XM.class;
                objectArray[yta.Ka] = Hta.Q;
                objectArray[yOa.B] = Ora.U;
                d2 = objectArray;
                Object b2 = Fsa.w;
                return kj_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = kj_2.class;
                synchronized (kj_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<kj>(DEFAULT_INSTANCE);
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

    private void C(boolean bl) {
        boolean b2 = bl;
        kj_2 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.depthMask_ = b2;
    }

    public static /* synthetic */ void J(kj kj2, Iterable iterable) {
        Object b2 = iterable;
        kj a2 = kj2;
        super.J((Iterable<? extends XM>)b2);
    }

    private void C(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.scaleZ_ = b2;
    }

    public static /* synthetic */ void l(kj kj2, boolean bl) {
        boolean b2 = bl;
        kj a2 = kj2;
        super.l(b2);
    }

    private void I() {
        a.bitField0_ &= kpa.w;
        a.scaleY_ = JPa.N;
    }

    private void l(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.angleY_ = b2;
    }

    @Override
    public float getScaleZ() {
        kj_2 a2;
        return a2.scaleZ_;
    }

    public static /* synthetic */ void D(kj a2) {
        super.D();
    }

    public static /* synthetic */ void i(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.d(b2);
    }

    public static /* synthetic */ void M(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.M(b2);
    }

    private void f(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.y_ = b2;
    }

    public static kj J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void A(kj a2) {
        super.e();
    }

    @Override
    public List<XM> getElementsList() {
        kj_2 a2;
        return a2.elements_;
    }

    public static /* synthetic */ void f(kj kj2, Pm pm2) {
        Object b2 = pm2;
        kj a2 = kj2;
        super.f((Pm)b2);
    }

    @Override
    public boolean getAdjustableAngle() {
        kj_2 a2;
        return a2.adjustableAngle_;
    }

    public static /* synthetic */ kj f() {
        return DEFAULT_INSTANCE;
    }

    public static kj f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (kj_2)kj_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void j() {
        a.bitField0_ &= aqa.C;
        a.depthMask_ = uSa.E;
    }

    public static /* synthetic */ void e(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.l(b2);
    }

    private void F() {
        a.bitField0_ &= Bta.u;
        a.culling_ = uSa.E;
    }

    public static kj J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(Pm pm2) {
        kj_2 kj_22;
        GeneratedMessageLite b2 = pm2;
        kj_2 a2 = this;
        b2.getClass();
        if (a2.animation_ != null && a2.animation_ != Pm.J()) {
            a2.animation_ = (Pm)((Ho)Pm.J(a2.animation_).mergeFrom(b2)).buildPartial();
            kj_22 = a2;
        } else {
            kj_22 = a2;
            a2.animation_ = b2;
        }
        kj_22.bitField0_ |= QSa.ba;
    }

    private void J(Pm pm2) {
        GeneratedMessageLite b2 = pm2;
        kj_2 a2 = this;
        b2.getClass();
        a2.animation_ = b2;
        a2.bitField0_ |= QSa.ba;
    }

    public static /* synthetic */ void i(kj a2) {
        super.i();
    }

    public static kj J(CodedInputStream a2) throws IOException {
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void M(kj a2) {
        super.j();
    }

    @Override
    public boolean hasAngleX() {
        kj_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void k() {
        a.elements_ = kj_2.emptyProtobufList();
    }

    public static /* synthetic */ void e(kj a2) {
        super.k();
    }

    public static kj J(InputStream a2) throws IOException {
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void G() {
        a.z_ = JPa.N;
    }

    public static /* synthetic */ void J(kj kj2, Pm pm2) {
        Object b2 = pm2;
        kj a2 = kj2;
        super.J((Pm)b2);
    }

    public static /* synthetic */ void d(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.C(b2);
    }

    @Override
    public float getAngleX() {
        kj_2 a2;
        return a2.angleX_;
    }

    @Override
    public boolean hasScaleY() {
        kj_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(kj a2) {
        super.F();
    }

    public static /* synthetic */ void C(kj a2) {
        super.G();
    }

    @Override
    public boolean hasScale() {
        kj_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasScaleX() {
        kj_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public XM getElements(int n2) {
        int b2 = n2;
        kj_2 a2 = this;
        return (XM)a2.elements_.get(b2);
    }

    public static /* synthetic */ void l(kj a2) {
        super.f();
    }

    private void D() {
        a.bitField0_ &= VPa.A;
        a.angleZ_ = JPa.N;
    }

    public static kj J() {
        return DEFAULT_INSTANCE;
    }

    private void A() {
        a.x_ = JPa.N;
    }

    public static /* synthetic */ void f(kj kj2, QM qM) {
        kj b2 = qM;
        kj a2 = kj2;
        super.f((QM)b2);
    }

    public static /* synthetic */ void f(kj kj2, boolean bl) {
        boolean b2 = bl;
        kj a2 = kj2;
        super.J(b2);
    }

    @Override
    public boolean getCentered() {
        kj_2 a2;
        return a2.centered_;
    }

    @Override
    public boolean hasCentered() {
        kj_2 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        kj_2 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.adjustableAngle_ = b2;
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        kj_2 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.centered_ = b2;
    }

    @Override
    public boolean hasAnimation() {
        kj_2 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasAdjustableAngle() {
        kj_2 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(kj kj2, XM xM2) {
        kj b2 = xM2;
        kj a2 = kj2;
        super.J((XM)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, XM xM2) {
        void b2;
        kj_2 c2 = xM2;
        kj_2 a2 = this;
        c2.getClass();
        kj_2 kj_22 = a2;
        kj_22.g();
        kj_22.elements_.add((int)b2, (XM)c2);
    }

    public static /* synthetic */ void C(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.A(b2);
    }

    private void J(Iterable<? extends XM> iterable) {
        kj_2 a2;
        Iterable<? extends XM> b2 = iterable;
        kj_2 kj_22 = a2 = this;
        kj_22.g();
        AbstractMessageLite.addAll(b2, kj_22.elements_);
    }

    private void J(int n2) {
        kj_2 a2;
        int b2 = n2;
        kj_2 kj_22 = a2 = this;
        kj_22.g();
        kj_22.elements_.remove(b2);
    }

    public static /* synthetic */ void J(kj kj2, QM qM) {
        kj b2 = qM;
        kj a2 = kj2;
        super.J((QM)b2);
    }

    public static kj J(byte[] a2) throws InvalidProtocolBufferException {
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(kj a2) {
        super.C();
    }

    public static kj J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void i() {
        a.animation_ = null;
        a.bitField0_ &= ppa.ca;
    }

    private void M() {
        a.bitField0_ &= MTa.c;
        a.adjustableAngle_ = uSa.E;
    }

    public static kj J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(QM qM) {
        kj_2 kj_22;
        kj_2 b2 = qM;
        kj_2 a2 = this;
        b2.getClass();
        if (a2.attachment_ != null && a2.attachment_ != QM.f()) {
            a2.attachment_ = (QM)((pO)QM.J((QM)a2.attachment_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            kj_22 = a2;
        } else {
            kj_22 = a2;
            a2.attachment_ = b2;
        }
        kj_22.bitField0_ |= mPa.H;
    }

    @Override
    public float getAngleZ() {
        kj_2 a2;
        return a2.angleZ_;
    }

    private void e() {
        a.bitField0_ &= ERa.Ka;
        a.scaleX_ = JPa.N;
    }

    private void d() {
        a.bitField0_ &= NQa.A;
        a.angleX_ = JPa.N;
    }

    private void C() {
        a.bitField0_ &= Uta.Z;
        a.centered_ = uSa.E;
    }

    public static /* synthetic */ void J(kj kj2, boolean bl) {
        boolean b2 = bl;
        kj a2 = kj2;
        super.C(b2);
    }

    public static /* synthetic */ void l(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.D(b2);
    }

    public va J(int n2) {
        int b2 = n2;
        kj_2 a2 = this;
        return (va)a2.elements_.get(b2);
    }

    @Override
    public Pm getAnimation() {
        kj_2 a2;
        if (a2.animation_ == null) {
            return Pm.J();
        }
        return a2.animation_;
    }

    public static /* synthetic */ void J(kj kj2, int n2) {
        int b2 = n2;
        kj a2 = kj2;
        super.J(b2);
    }

    @Override
    public float getAngleY() {
        kj_2 a2;
        return a2.angleY_;
    }

    public static /* synthetic */ void f(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.e(b2);
    }

    @Override
    public boolean hasDepthMask() {
        kj_2 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l() {
        a.attachment_ = null;
        a.bitField0_ &= aQa.d;
    }

    private void f() {
        a.bitField0_ &= fta.fa;
        a.angleY_ = JPa.N;
    }

    @Override
    public boolean hasCulling() {
        kj_2 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(kj a2) {
        super.H();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        kj_2 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.culling_ = b2;
    }

    @Override
    public boolean hasAttachment() {
        kj_2 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(float f2) {
        float b2 = f2;
        kj_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.angleX_ = b2;
    }

    @Override
    public boolean hasAngleZ() {
        kj_2 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Xl J() {
        return (Xl)DEFAULT_INSTANCE.createBuilder();
    }

    @Override
    public float getX() {
        kj_2 a2;
        return a2.x_;
    }

    @Override
    public float getScaleX() {
        kj_2 a2;
        return a2.scaleX_;
    }

    public static /* synthetic */ void J(kj kj2, float f2) {
        float b2 = f2;
        kj a2 = kj2;
        super.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(kj kj2, int n2, XM xM2) {
        void b2;
        kj c2 = xM2;
        kj a2 = kj2;
        super.f((int)b2, (XM)c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(kj kj2, int n2, XM xM2) {
        void b2;
        kj c2 = xM2;
        kj a2 = kj2;
        super.J((int)b2, (XM)c2);
    }

    public static kj J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (kj_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.y_ = JPa.N;
    }

    private void J(QM qM) {
        kj_2 b2 = qM;
        kj_2 a2 = this;
        b2.getClass();
        a2.attachment_ = b2;
        a2.bitField0_ |= mPa.H;
    }

    private void J(XM xM2) {
        kj_2 b2 = xM2;
        kj_2 a2 = this;
        b2.getClass();
        kj_2 kj_22 = a2;
        kj_22.g();
        kj_22.elements_.add((XM)b2);
    }
}

