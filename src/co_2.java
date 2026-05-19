/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  NQa
 *  NTa
 *  QM
 *  QSa
 *  RPa
 *  URa
 *  Uta
 *  XTa
 *  Xsa
 *  Ypa
 *  aQa
 *  aSa
 *  aqa
 *  bm
 *  cQa
 *  co
 *  fTa
 *  hra
 *  isa
 *  jO
 *  ka
 *  kpa
 *  lPa
 *  lqa
 *  pO
 *  pPa
 *  pua
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
public final class co_2
extends GeneratedMessageLite<co, uM>
implements ka {
    public static final int COLOR_FIELD_NUMBER = 3;
    public static final int STACKS_FIELD_NUMBER = 6;
    private float angleRotationX_;
    private float angleRotationY_;
    private boolean culling_;
    private int stacks_;
    private float angleZ_;
    public static final int STYLE_FIELD_NUMBER = 8;
    private int color_;
    public static final int TEXTUREPATH_FIELD_NUMBER = 11;
    private float angleY_;
    public static final int SCALE_FIELD_NUMBER = 4;
    public static final int ATTACHMENT_FIELD_NUMBER = 9;
    private Object texture_;
    private float radius_;
    public static final int ANGLEZ_FIELD_NUMBER = 14;
    private int slices_;
    private float angleX_;
    private float angleRotationZ_;
    public static final int ANGLEROTATIONY_FIELD_NUMBER = 16;
    private int bitField0_;
    public static final int CULLING_FIELD_NUMBER = 5;
    public static final int ANGLEROTATIONX_FIELD_NUMBER = 15;
    private static volatile Parser<co> PARSER;
    private int style_;
    public static final int RADIUS_FIELD_NUMBER = 2;
    public static final int LOC_FIELD_NUMBER = 1;
    public static final int ANGLEY_FIELD_NUMBER = 13;
    private static final co DEFAULT_INSTANCE;
    public static final int SLICES_FIELD_NUMBER = 7;
    public static final int TEXTURERESOURCE_FIELD_NUMBER = 10;
    private int scaleMemoizedSerializedSize;
    private QM attachment_;
    public static final int ANGLEX_FIELD_NUMBER = 12;
    private Internal.FloatList scale_;
    public static final int ANGLEROTATIONZ_FIELD_NUMBER = 17;
    private int textureCase_ = uSa.E;
    private int locMemoizedSerializedSize = pua.o;
    private Internal.FloatList loc_;

    public static co f(InputStream a2) throws IOException {
        return (co_2)co_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void a(co a2) {
        super.j();
    }

    public float getAngleZ() {
        co_2 a2;
        return a2.angleZ_;
    }

    public static /* synthetic */ void f(co co2, Iterable iterable) {
        Object b2 = iterable;
        co a2 = co2;
        super.f((Iterable<? extends Float>)b2);
    }

    private void L() {
        a.bitField0_ &= fta.fa;
        a.style_ = uSa.E;
    }

    public static /* synthetic */ void J(co co2, boolean bl) {
        boolean b2 = bl;
        co a2 = co2;
        super.J(b2);
    }

    public boolean hasAngleRotationY() {
        co_2 a2;
        if ((a2.bitField0_ & QSa.ba) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(Iterable<? extends Float> iterable) {
        co_2 a2;
        Iterable<? extends Float> b2 = iterable;
        co_2 co_22 = a2 = this;
        co_22.i();
        AbstractMessageLite.addAll(b2, co_22.scale_);
    }

    public String getTexturePath() {
        co_2 co_22 = this;
        Object a2 = Mqa.y;
        if (co_22.textureCase_ == pPa.f) {
            a2 = (String)co_22.texture_;
        }
        return a2;
    }

    public static uM J() {
        return (uM)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void H(co a2) {
        super.D();
    }

    public float getScale(int n2) {
        int b2 = n2;
        co_2 a2 = this;
        return a2.scale_.getFloat(b2);
    }

    public static /* synthetic */ void g(co a2) {
        super.G();
    }

    private void b() {
        a.bitField0_ &= rQa.p;
        a.radius_ = JPa.N;
    }

    public static /* synthetic */ void I(co a2) {
        super.A();
    }

    public static /* synthetic */ void d(co co2, int n2) {
        int b2 = n2;
        co a2 = co2;
        super.l(b2);
    }

    public boolean hasTexturePath() {
        co_2 a2;
        if (a2.textureCase_ == pPa.f) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, float f2) {
        void b2;
        co_2 a2;
        float c2 = f2;
        co_2 co_22 = a2 = this;
        co_22.i();
        co_22.scale_.setFloat((int)b2, c2);
    }

    private void J(Iterable<? extends Float> iterable) {
        co_2 a2;
        Iterable<? extends Float> b2 = iterable;
        co_2 co_22 = a2 = this;
        co_22.k();
        AbstractMessageLite.addAll(b2, co_22.loc_);
    }

    private void J(jO jO2) {
        co_2 b2 = jO2;
        co_2 a2 = this;
        a2.style_ = b2.getNumber();
        a2.bitField0_ |= fPa.i;
    }

    private void a() {
        a.scale_ = co_2.emptyFloatList();
    }

    public static /* synthetic */ void J(co co2, Iterable iterable) {
        Object b2 = iterable;
        co a2 = co2;
        super.J((Iterable<? extends Float>)b2);
    }

    public boolean hasColor() {
        co_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ co f() {
        return DEFAULT_INSTANCE;
    }

    private void A(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= QSa.ba;
        a2.angleRotationY_ = b2;
    }

    private void i(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= mPa.H;
        a2.angleRotationZ_ = b2;
    }

    public static co f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(co co2, int n2) {
        int b2 = n2;
        co a2 = co2;
        super.f(b2);
    }

    private void H() {
        a.bitField0_ &= Bta.u;
        a.angleX_ = JPa.N;
    }

    private void d(int n2) {
        int b2 = n2;
        co_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.stacks_ = b2;
    }

    public boolean hasSlices() {
        co_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void g() {
        a.bitField0_ &= aQa.d;
        a.angleRotationZ_ = JPa.N;
    }

    public static /* synthetic */ void A(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.J(b2);
    }

    private void I() {
        a.bitField0_ &= aqa.C;
        a.angleRotationX_ = JPa.N;
    }

    public static /* synthetic */ void j(co a2) {
        super.F();
    }

    private void j() {
        a.bitField0_ &= MTa.c;
        a.angleY_ = JPa.N;
    }

    private void M(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.radius_ = b2;
    }

    public boolean hasRadius() {
        co_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void F(co a2) {
        super.f();
    }

    public boolean hasTextureResource() {
        co_2 a2;
        if (a2.textureCase_ == NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(co co2, jO jO2) {
        co b2 = jO2;
        co a2 = co2;
        super.J((jO)b2);
    }

    private void f(QM qM) {
        co_2 b2 = qM;
        co_2 a2 = this;
        b2.getClass();
        a2.attachment_ = b2;
        a2.bitField0_ |= ysa.s;
    }

    private void F() {
        a.bitField0_ &= Uta.Z;
        a.angleZ_ = JPa.N;
    }

    static {
        co_2 co_22 = new co_2();
        DEFAULT_INSTANCE = co_22;
        GeneratedMessageLite.registerDefaultInstance(co_2.class, co_22);
    }

    private void e(float f2) {
        co_2 a2;
        float b2 = f2;
        co_2 co_22 = a2 = this;
        co_22.k();
        co_22.loc_.addFloat(b2);
    }

    public static /* synthetic */ void k(co a2) {
        super.l();
    }

    public static /* synthetic */ void G(co a2) {
        super.g();
    }

    public int getColor() {
        co_2 a2;
        return a2.color_;
    }

    public static /* synthetic */ void J(co co2, String string) {
        Object b2 = string;
        co a2 = co2;
        super.J((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(co co2, int n2, float f2) {
        void b2;
        float c2 = f2;
        co a2 = co2;
        super.J((int)b2, c2);
    }

    private void k() {
        co_2 co_22 = this;
        Internal.FloatList a2 = co_22.loc_;
        if (!a2.isModifiable()) {
            co_22.loc_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void f(co co2, QM qM) {
        co b2 = qM;
        co a2 = co2;
        super.f((QM)b2);
    }

    private void G() {
        a.bitField0_ &= kpa.w;
        a.culling_ = uSa.E;
    }

    public float getAngleRotationX() {
        co_2 a2;
        return a2.angleRotationX_;
    }

    public static co J(ByteString a2) throws InvalidProtocolBufferException {
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void D() {
        a.loc_ = co_2.emptyFloatList();
    }

    public int getSlices() {
        co_2 a2;
        return a2.slices_;
    }

    public static co J(CodedInputStream a2) throws IOException {
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getScaleCount() {
        co_2 a2;
        return a2.scale_.size();
    }

    private co_2() {
        co_2 a2;
        a2.scaleMemoizedSerializedSize = pua.o;
        a2.loc_ = co_2.emptyFloatList();
        a2.scale_ = co_2.emptyFloatList();
    }

    public boolean hasAttachment() {
        co_2 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getAngleY() {
        co_2 a2;
        return a2.angleY_;
    }

    public static co J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasStyle() {
        co_2 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static co J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void D(co a2) {
        super.L();
    }

    private void A() {
        co_2 a2;
        if (a2.textureCase_ == NTa.C) {
            co_2 co_22 = a2;
            co_22.textureCase_ = uSa.E;
            co_22.texture_ = null;
        }
    }

    private void i() {
        co_2 co_22 = this;
        Internal.FloatList a2 = co_22.scale_;
        if (!a2.isModifiable()) {
            co_22.scale_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public boolean hasAngleY() {
        co_2 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void A(co a2) {
        super.d();
    }

    public float getAngleX() {
        co_2 a2;
        return a2.angleX_;
    }

    public static /* synthetic */ void i(co a2) {
        super.e();
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        co_2 a2;
        float c2 = f2;
        co_2 co_22 = a2 = this;
        co_22.k();
        co_22.loc_.setFloat((int)b2, c2);
    }

    public float getLoc(int n2) {
        int b2 = n2;
        co_2 a2 = this;
        return a2.loc_.getFloat(b2);
    }

    private void M() {
        a.bitField0_ &= ERa.Ka;
        a.color_ = uSa.E;
    }

    public static /* synthetic */ void M(co a2) {
        super.J();
    }

    private void d(float f2) {
        co_2 a2;
        float b2 = f2;
        co_2 co_22 = a2 = this;
        co_22.i();
        co_22.scale_.addFloat(b2);
    }

    public static co J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasAngleRotationX() {
        co_2 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(co co2, int n2) {
        int b2 = n2;
        co a2 = co2;
        super.C(b2);
    }

    public boolean hasAngleRotationZ() {
        co_2 a2;
        if ((a2.bitField0_ & mPa.H) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(co a2) {
        super.H();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(co co2, int n2, float f2) {
        void b2;
        float c2 = f2;
        co a2 = co2;
        super.f((int)b2, c2);
    }

    public int getLocCount() {
        co_2 a2;
        return a2.loc_.size();
    }

    private void C(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.angleY_ = b2;
    }

    private void l(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.angleZ_ = b2;
    }

    public static co J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void i(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.C(b2);
    }

    public static uM J(co a2) {
        return (uM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void e() {
        a.bitField0_ &= NQa.A;
        a.slices_ = uSa.E;
    }

    private void d() {
        co_2 a2;
        co_2 co_22 = a2;
        co_22.textureCase_ = uSa.E;
        co_22.texture_ = null;
    }

    private void C() {
        co_2 a2;
        if (a2.textureCase_ == pPa.f) {
            co_2 co_22 = a2;
            co_22.textureCase_ = uSa.E;
            co_22.texture_ = null;
        }
    }

    public static /* synthetic */ void d(co a2) {
        super.C();
    }

    public static /* synthetic */ void M(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.M(b2);
    }

    public int getStyleValue() {
        co_2 a2;
        return a2.style_;
    }

    public static /* synthetic */ void e(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.A(b2);
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
        co_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new co_2();
            }
            case 2: {
                return new uM(null);
            }
            case 3: {
                Object[] objectArray = new Object[yOa.B];
                objectArray[uSa.E] = aSa.j;
                objectArray[vRa.d] = isa.j;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = fTa.y;
                objectArray[AQa.P] = lPa.T;
                objectArray[tTa.h] = lQa.Ka;
                objectArray[uua.p] = Ora.U;
                objectArray[XTa.W] = ATa.Fa;
                objectArray[Yqa.i] = nua.y;
                objectArray[WOa.fa] = Xsa.n;
                objectArray[NTa.C] = URa.Ka;
                objectArray[pPa.f] = Hta.Q;
                objectArray[lqa.s] = wOa.N;
                objectArray[uua.s] = Fua.O;
                objectArray[hpa.Z] = cQa.H;
                objectArray[Ypa.A] = Tqa.b;
                objectArray[ERa.C] = Zra.R;
                objectArray[yta.Ka] = qQa.S;
                d2 = objectArray;
                Object b2 = RPa.M;
                return co_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = co_2.class;
                synchronized (co_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<co>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void d(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.f(b2);
    }

    public static /* synthetic */ void f(co co2, int n2) {
        int b2 = n2;
        co a2 = co2;
        super.d(b2);
    }

    public boolean hasCulling() {
        co_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l() {
        a.bitField0_ &= Jra.Fa;
        a.stacks_ = uSa.E;
    }

    public static Parser<co> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public bm getTextureCase() {
        co_2 a2;
        return bm.forNumber((int)a2.textureCase_);
    }

    public static /* synthetic */ void J(co co2, ByteString byteString) {
        Object b2 = byteString;
        co a2 = co2;
        super.J((ByteString)b2);
    }

    public float getAngleRotationY() {
        co_2 a2;
        return a2.angleRotationY_;
    }

    public int getStacks() {
        co_2 a2;
        return a2.stacks_;
    }

    public boolean hasAngleZ() {
        co_2 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C(int n2) {
        int b2 = n2;
        co_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.slices_ = b2;
    }

    private void f(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.angleRotationX_ = b2;
    }

    public boolean hasStacks() {
        co_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean getCulling() {
        co_2 a2;
        return a2.culling_;
    }

    public static co J(byte[] a2) throws InvalidProtocolBufferException {
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getAngleRotationZ() {
        co_2 a2;
        return a2.angleRotationZ_;
    }

    private void f() {
        a.attachment_ = null;
        a.bitField0_ &= VPa.A;
    }

    public jO getStyle() {
        co_2 co_22 = this;
        co_2 a2 = jO.forNumber((int)co_22.style_);
        if (a2 == null) {
            return jO.UNRECOGNIZED;
        }
        return a2;
    }

    private void l(int n2) {
        co_2 a2;
        int b2 = n2;
        co_2 co_22 = a2 = this;
        co_22.textureCase_ = NTa.C;
        co_22.texture_ = b2;
    }

    public static /* synthetic */ void C(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.l(b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        co_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.culling_ = b2;
    }

    public static co J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public List<Float> getLocList() {
        co_2 a2;
        return a2.loc_;
    }

    private void f(int n2) {
        int b2 = n2;
        co_2 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.style_ = b2;
    }

    public static /* synthetic */ void C(co a2) {
        super.I();
    }

    public static /* synthetic */ void J(co co2, int n2) {
        int b2 = n2;
        co a2 = co2;
        super.J(b2);
    }

    public static co J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void l(co a2) {
        super.a();
    }

    public static /* synthetic */ void f(co a2) {
        super.M();
    }

    public List<Float> getScaleList() {
        co_2 a2;
        return a2.scale_;
    }

    public static co J(InputStream a2) throws IOException {
        return (co_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public QM getAttachment() {
        co_2 a2;
        if (a2.attachment_ == null) {
            return QM.f();
        }
        return a2.attachment_;
    }

    public static /* synthetic */ void J(co co2, QM qM) {
        co b2 = qM;
        co a2 = co2;
        super.J((QM)b2);
    }

    private void J(String string) {
        String b2 = string;
        co_2 a2 = this;
        b2.getClass();
        co_2 co_22 = a2;
        co_22.textureCase_ = pPa.f;
        co_22.texture_ = b2;
    }

    public static /* synthetic */ void J(co a2) {
        super.b();
    }

    public int getTextureResource() {
        co_2 a2;
        if (a2.textureCase_ == NTa.C) {
            return (Integer)a2.texture_;
        }
        return uSa.E;
    }

    public static /* synthetic */ void l(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.e(b2);
    }

    public boolean hasAngleX() {
        co_2 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.i(b2);
    }

    public static /* synthetic */ void J(co co2, float f2) {
        float b2 = f2;
        co a2 = co2;
        super.d(b2);
    }

    private void J(float f2) {
        float b2 = f2;
        co_2 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.angleX_ = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        co_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.color_ = b2;
    }

    public static co J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (co_2)co_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getTexturePathBytes() {
        co_2 co_22 = this;
        Object a2 = Mqa.y;
        if (co_22.textureCase_ == pPa.f) {
            a2 = (String)co_22.texture_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void J(ByteString byteString) {
        co_2 a2;
        ByteString b2 = byteString;
        co_2 co_22 = a2 = this;
        co_2.checkByteStringIsUtf8(b2);
        co_22.texture_ = b2.toStringUtf8();
        co_22.textureCase_ = pPa.f;
    }

    private void J() {
        a.bitField0_ &= ppa.ca;
        a.angleRotationY_ = JPa.N;
    }

    public float getRadius() {
        co_2 a2;
        return a2.radius_;
    }

    private void J(QM qM) {
        co_2 co_22;
        co_2 b2 = qM;
        co_2 a2 = this;
        b2.getClass();
        if (a2.attachment_ != null && a2.attachment_ != QM.f()) {
            a2.attachment_ = (QM)((pO)QM.J((QM)a2.attachment_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            co_22 = a2;
        } else {
            co_22 = a2;
            a2.attachment_ = b2;
        }
        co_22.bitField0_ |= ysa.s;
    }
}

