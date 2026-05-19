/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AM
 *  AN
 *  JPa
 *  JQa
 *  Mm
 *  NTa
 *  PM
 *  XTa
 *  cRa
 *  dQa
 *  ea
 *  fTa
 *  gM
 *  pPa
 *  psa
 *  pua
 *  vRa
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
public final class PM_1
extends GeneratedMessageLite<PM, gM>
implements ea {
    public static final int ANGLE_FIELD_NUMBER = 9;
    public static final int ANGLEANIMSMART_FIELD_NUMBER = 11;
    public static final int COLOR_FIELD_NUMBER = 3;
    private int angleAnimSmartMemoizedSerializedSize;
    private int angleMemoizedSerializedSize;
    private Internal.FloatList scale_;
    public static final int LOCANIM_FIELD_NUMBER = 2;
    private static volatile Parser<PM> PARSER;
    public static final int LOC_FIELD_NUMBER = 1;
    private Internal.FloatList angleAnim_;
    public static final int RADIUSANIM_FIELD_NUMBER = 6;
    public static final int SCALEANIM_FIELD_NUMBER = 8;
    private static final PM DEFAULT_INSTANCE;
    private Internal.FloatList angleAnimSmart_;
    public static final int COLORANIM_FIELD_NUMBER = 4;
    private int locMemoizedSerializedSize;
    private Internal.FloatList loc_;
    private Internal.FloatList scaleAnim_;
    private Internal.FloatList angle_;
    private int scaleAnimMemoizedSerializedSize;
    private int scaleMemoizedSerializedSize;
    public static final int SCALE_FIELD_NUMBER = 7;
    private Internal.FloatList locAnim_;
    private Object radiusval_;
    private int colorvalCase_ = uSa.E;
    public static final int RADIUS_FIELD_NUMBER = 5;
    private int angleAnimMemoizedSerializedSize;
    private Object colorval_;
    private int radiusvalCase_ = uSa.E;
    private int locAnimMemoizedSerializedSize;
    public static final int ANGLEANIM_FIELD_NUMBER = 10;

    /*
     * WARNING - void declaration
     */
    private void M(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.F();
        pM_1.angleAnimSmart_.setFloat((int)b2, c2);
    }

    public static /* synthetic */ void F(PM a2) {
        super.g();
    }

    private void M(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.H();
        AbstractMessageLite.addAll(b2, pM_1.angle_);
    }

    /*
     * WARNING - void declaration
     */
    private void e(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.I();
        pM_1.locAnim_.setFloat((int)b2, c2);
    }

    private void e(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.I();
        AbstractMessageLite.addAll(b2, pM_1.locAnim_);
    }

    public static /* synthetic */ void k(PM a2) {
        super.d();
    }

    public boolean hasRadiusAnim() {
        PM_1 a2;
        if (a2.radiusvalCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void L() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.angleAnim_;
        if (!a2.isModifiable()) {
            pM_1.angleAnim_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void A(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.d(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void d(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.k();
        pM_1.loc_.setFloat((int)b2, c2);
    }

    public int getAngleAnimCount() {
        PM_1 a2;
        return a2.angleAnim_.size();
    }

    public static PM f() {
        return DEFAULT_INSTANCE;
    }

    public float getScale(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.scale_.getFloat(b2);
    }

    public static /* synthetic */ void i(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.e(b2);
    }

    private void A(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.F();
        pM_1.angleAnimSmart_.addFloat(b2);
    }

    public static /* synthetic */ void M(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.M(b2);
    }

    public boolean hasColor() {
        PM_1 a2;
        if (a2.colorvalCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(int n2) {
        PM_1 a2;
        int b2 = n2;
        PM_1 pM_1 = a2 = this;
        pM_1.colorvalCase_ = AQa.P;
        pM_1.colorval_ = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.C();
        pM_1.scale_.setFloat((int)b2, c2);
    }

    public boolean hasRadius() {
        PM_1 a2;
        if (a2.radiusvalCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getLoc(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.loc_.getFloat(b2);
    }

    public static /* synthetic */ void G(PM a2) {
        super.b();
    }

    /*
     * WARNING - void declaration
     */
    private void l(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.L();
        pM_1.angleAnim_.setFloat((int)b2, c2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void M(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.f((int)b2, c2);
    }

    private void d(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.A();
        AbstractMessageLite.addAll(b2, pM_1.scaleAnim_);
    }

    private void b() {
        PM_1 a2;
        if (a2.colorvalCase_ == yRa.d) {
            PM_1 pM_1 = a2;
            pM_1.colorvalCase_ = uSa.E;
            pM_1.colorval_ = null;
        }
    }

    public static PM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static PM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void e(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.M((int)b2, c2);
    }

    public float getScaleAnim(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.scaleAnim_.getFloat(b2);
    }

    private void C(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.C();
        AbstractMessageLite.addAll(b2, pM_1.scale_);
    }

    public List<Float> getScaleAnimList() {
        PM_1 a2;
        return a2.scaleAnim_;
    }

    public float getRadius() {
        PM_1 a2;
        if (a2.radiusvalCase_ == tTa.h) {
            return ((Float)a2.radiusval_).floatValue();
        }
        return JPa.N;
    }

    public boolean hasColorAnim() {
        PM_1 a2;
        if (a2.colorvalCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<Float> getAngleList() {
        PM_1 a2;
        return a2.angle_;
    }

    private void l(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.k();
        AbstractMessageLite.addAll(b2, pM_1.loc_);
    }

    private void i(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.radiusvalCase_ = tTa.h;
        pM_1.radiusval_ = Float.valueOf(b2);
    }

    private void a() {
        a.scaleAnim_ = PM_1.emptyFloatList();
    }

    public static PM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void D(PM a2) {
        super.i();
    }

    public static /* synthetic */ void A(PM a2) {
        super.l();
    }

    public AM getRadiusvalCase() {
        PM_1 a2;
        return AM.forNumber((int)a2.radiusvalCase_);
    }

    public static PM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void i(PM a2) {
        super.D();
    }

    public float getLocAnim(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.locAnim_.getFloat(b2);
    }

    public List<Float> getScaleList() {
        PM_1 a2;
        return a2.scale_;
    }

    public static /* synthetic */ void M(PM a2) {
        super.a();
    }

    public static /* synthetic */ void M(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.e((Iterable<? extends Float>)b2);
    }

    public static PM f(InputStream a2) throws IOException {
        return (PM_1)PM_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.L();
        AbstractMessageLite.addAll(b2, pM_1.angleAnim_);
    }

    public static /* synthetic */ void e(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.C(b2);
    }

    public static PM J(InputStream a2) throws IOException {
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static PM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getLocCount() {
        PM_1 a2;
        return a2.loc_.size();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void d(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.J((int)b2, c2);
    }

    private void M(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.I();
        pM_1.locAnim_.addFloat(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void C(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.C((int)b2, c2);
    }

    public List<Float> getLocList() {
        PM_1 a2;
        return a2.loc_;
    }

    private void H() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.angle_;
        if (!a2.isModifiable()) {
            pM_1.angle_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static gM J(PM a2) {
        return (gM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void l(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.e((int)b2, c2);
    }

    public static /* synthetic */ void d(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.l(b2);
    }

    public int getAngleCount() {
        PM_1 a2;
        return a2.angle_.size();
    }

    private void J(Iterable<? extends Float> iterable) {
        PM_1 a2;
        Iterable<? extends Float> b2 = iterable;
        PM_1 pM_1 = a2 = this;
        pM_1.F();
        AbstractMessageLite.addAll(b2, pM_1.angleAnimSmart_);
    }

    private void g() {
        a.angle_ = PM_1.emptyFloatList();
    }

    public int getColorAnim() {
        PM_1 a2;
        if (a2.colorvalCase_ == AQa.P) {
            return (Integer)a2.colorval_;
        }
        return uSa.E;
    }

    public float getAngleAnimSmart(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.angleAnimSmart_.getFloat(b2);
    }

    private void I() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.locAnim_;
        if (!a2.isModifiable()) {
            pM_1.locAnim_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void J(int n2) {
        PM_1 a2;
        int b2 = n2;
        PM_1 pM_1 = a2 = this;
        pM_1.colorvalCase_ = yRa.d;
        pM_1.colorval_ = b2;
    }

    private void j() {
        a.angleAnimSmart_ = PM_1.emptyFloatList();
    }

    public static /* synthetic */ PM J() {
        return DEFAULT_INSTANCE;
    }

    public List<Float> getAngleAnimSmartList() {
        PM_1 a2;
        return a2.angleAnimSmart_;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.A();
        pM_1.scaleAnim_.setFloat((int)b2, c2);
    }

    public static PM J(byte[] a2) throws InvalidProtocolBufferException {
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static PM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void F() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.angleAnimSmart_;
        if (!a2.isModifiable()) {
            pM_1.angleAnimSmart_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        PM_1 a2;
        float c2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.H();
        pM_1.angle_.setFloat((int)b2, c2);
    }

    public static /* synthetic */ void e(PM a2) {
        super.j();
    }

    public float getRadiusAnim() {
        PM_1 a2;
        if (a2.radiusvalCase_ == uua.p) {
            return ((Float)a2.radiusval_).floatValue();
        }
        return JPa.N;
    }

    public static PM J(ByteString a2) throws InvalidProtocolBufferException {
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void k() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.loc_;
        if (!a2.isModifiable()) {
            pM_1.loc_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void e(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.k();
        pM_1.loc_.addFloat(b2);
    }

    public static /* synthetic */ void C(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.f(b2);
    }

    public Mm getColorvalCase() {
        PM_1 a2;
        return Mm.forNumber((int)a2.colorvalCase_);
    }

    public int getColor() {
        PM_1 a2;
        if (a2.colorvalCase_ == yRa.d) {
            return (Integer)a2.colorval_;
        }
        return uSa.E;
    }

    private void d(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.H();
        pM_1.angle_.addFloat(b2);
    }

    public static /* synthetic */ void d(PM a2) {
        super.J();
    }

    private void C(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.radiusvalCase_ = uua.p;
        pM_1.radiusval_ = Float.valueOf(b2);
    }

    private void G() {
        PM_1 a2;
        PM_1 pM_1 = a2;
        pM_1.colorvalCase_ = uSa.E;
        pM_1.colorval_ = null;
    }

    private PM_1() {
        PM_1 a2;
        a2.locMemoizedSerializedSize = pua.o;
        a2.locAnimMemoizedSerializedSize = pua.o;
        a2.scaleMemoizedSerializedSize = pua.o;
        a2.scaleAnimMemoizedSerializedSize = pua.o;
        a2.angleMemoizedSerializedSize = pua.o;
        a2.angleAnimMemoizedSerializedSize = pua.o;
        a2.angleAnimSmartMemoizedSerializedSize = pua.o;
        a2.loc_ = PM_1.emptyFloatList();
        a2.locAnim_ = PM_1.emptyFloatList();
        a2.scale_ = PM_1.emptyFloatList();
        a2.scaleAnim_ = PM_1.emptyFloatList();
        a2.angle_ = PM_1.emptyFloatList();
        a2.angleAnim_ = PM_1.emptyFloatList();
        a2.angleAnimSmart_ = PM_1.emptyFloatList();
    }

    public static /* synthetic */ void l(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.J(b2);
    }

    public static gM J() {
        return (gM)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void f(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.A(b2);
    }

    public static /* synthetic */ void C(PM a2) {
        super.e();
    }

    public static /* synthetic */ void e(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.M((Iterable<? extends Float>)b2);
    }

    private void D() {
        PM_1 a2;
        PM_1 pM_1 = a2;
        pM_1.radiusvalCase_ = uSa.E;
        pM_1.radiusval_ = null;
    }

    private void A() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.scaleAnim_;
        if (!a2.isModifiable()) {
            pM_1.scaleAnim_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void l(PM a2) {
        super.G();
    }

    public static /* synthetic */ void J(PM pM, float f2) {
        float b2 = f2;
        PM a2 = pM;
        super.i(b2);
    }

    public List<Float> getLocAnimList() {
        PM_1 a2;
        return a2.locAnim_;
    }

    public static PM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (PM_1)PM_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getLocAnimCount() {
        PM_1 a2;
        return a2.locAnim_.size();
    }

    public static Parser<PM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void i() {
        PM_1 a2;
        if (a2.radiusvalCase_ == tTa.h) {
            PM_1 pM_1 = a2;
            pM_1.radiusvalCase_ = uSa.E;
            pM_1.radiusval_ = null;
        }
    }

    private void l(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.L();
        pM_1.angleAnim_.addFloat(b2);
    }

    private void M() {
        PM_1 a2;
        if (a2.radiusvalCase_ == uua.p) {
            PM_1 pM_1 = a2;
            pM_1.radiusvalCase_ = uSa.E;
            pM_1.radiusval_ = null;
        }
    }

    public static /* synthetic */ void d(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.f((Iterable<? extends Float>)b2);
    }

    private void e() {
        a.locAnim_ = PM_1.emptyFloatList();
    }

    private void d() {
        a.loc_ = PM_1.emptyFloatList();
    }

    private void f(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.C();
        pM_1.scale_.addFloat(b2);
    }

    public int getAngleAnimSmartCount() {
        PM_1 a2;
        return a2.angleAnimSmart_.size();
    }

    public int getScaleCount() {
        PM_1 a2;
        return a2.scale_.size();
    }

    public static /* synthetic */ void C(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.C((Iterable<? extends Float>)b2);
    }

    private void C() {
        PM_1 pM_1 = this;
        Internal.FloatList a2 = pM_1.scale_;
        if (!a2.isModifiable()) {
            pM_1.scale_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.d((int)b2, c2);
    }

    public static /* synthetic */ void f(PM a2) {
        super.f();
    }

    public static /* synthetic */ void f(PM pM, int n2) {
        int b2 = n2;
        PM a2 = pM;
        super.J(b2);
    }

    public static /* synthetic */ void J(PM pM, int n2) {
        int b2 = n2;
        PM a2 = pM;
        super.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(PM pM, int n2, float f2) {
        void b2;
        float c2 = f2;
        PM a2 = pM;
        super.l((int)b2, c2);
    }

    public float getAngleAnim(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.angleAnim_.getFloat(b2);
    }

    public static /* synthetic */ void l(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.d((Iterable<? extends Float>)b2);
    }

    private void l() {
        a.angleAnim_ = PM_1.emptyFloatList();
    }

    public static /* synthetic */ void J(PM a2) {
        super.M();
    }

    public List<Float> getAngleAnimList() {
        PM_1 a2;
        return a2.angleAnim_;
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
        PM_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new PM_1();
            }
            case 2: {
                return new gM(null);
            }
            case 3: {
                Object[] objectArray = new Object[pPa.f];
                objectArray[uSa.E] = Upa.L;
                objectArray[vRa.d] = cTa.r;
                objectArray[uqa.g] = cRa.w;
                objectArray[yRa.d] = sqa.Ka;
                objectArray[AQa.P] = fTa.y;
                objectArray[tTa.h] = zta.H;
                objectArray[uua.p] = Ora.U;
                objectArray[XTa.W] = JQa.o;
                objectArray[Yqa.i] = dQa.ga;
                objectArray[WOa.fa] = Xpa.H;
                objectArray[NTa.C] = Fsa.u;
                d2 = objectArray;
                Object b2 = psa.v;
                return PM_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = PM_1.class;
                synchronized (PM_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<PM>(DEFAULT_INSTANCE);
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

    private void f() {
        PM_1 a2;
        if (a2.colorvalCase_ == AQa.P) {
            PM_1 pM_1 = a2;
            pM_1.colorvalCase_ = uSa.E;
            pM_1.colorval_ = null;
        }
    }

    public int getScaleAnimCount() {
        PM_1 a2;
        return a2.scaleAnim_.size();
    }

    public static /* synthetic */ void f(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.J((Iterable<? extends Float>)b2);
    }

    private void J(float f2) {
        PM_1 a2;
        float b2 = f2;
        PM_1 pM_1 = a2 = this;
        pM_1.A();
        pM_1.scaleAnim_.addFloat(b2);
    }

    static {
        PM_1 pM_1 = new PM_1();
        DEFAULT_INSTANCE = pM_1;
        GeneratedMessageLite.registerDefaultInstance(PM_1.class, pM_1);
    }

    public float getAngle(int n2) {
        int b2 = n2;
        PM_1 a2 = this;
        return a2.angle_.getFloat(b2);
    }

    private void J() {
        a.scale_ = PM_1.emptyFloatList();
    }

    public static PM J(CodedInputStream a2) throws IOException {
        return (PM_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(PM pM, Iterable iterable) {
        Object b2 = iterable;
        PM a2 = pM;
        super.l((Iterable<? extends Float>)b2);
    }
}

