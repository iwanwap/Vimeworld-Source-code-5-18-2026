/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JPa
 *  Kn
 *  NOa
 *  No
 *  OO
 *  TPa
 *  XTa
 *  cRa
 *  jsa
 *  lqa
 *  pPa
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
public final class Kn_2
extends GeneratedMessageLite<Kn, OO>
implements aa {
    public static final int GRADIENT_FIELD_NUMBER = 9;
    public static final int WIDTHEXPRANIM_FIELD_NUMBER = 11;
    private int widthvalCase_ = uSa.E;
    private int radiusvalCase_;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private int gradientMemoizedSerializedSize;
    private Internal.IntList gradient_;
    private Internal.IntList gradientAnim_;
    public static final int RADIUSANIM_FIELD_NUMBER = 6;
    public static final int WIDTHANIM_FIELD_NUMBER = 2;
    public static final int RADIUS_FIELD_NUMBER = 5;
    public static final int HEIGHTEXPRANIM_FIELD_NUMBER = 12;
    private Object widthval_;
    public static final int GRADIENTANIM_FIELD_NUMBER = 10;
    private static final Kn DEFAULT_INSTANCE;
    private static volatile Parser<Kn> PARSER;
    private int heightvalCase_ = uSa.E;
    public static final int HEIGHTANIM_FIELD_NUMBER = 4;
    public static final int WIDTHEXPR_FIELD_NUMBER = 7;
    private Object radiusval_;
    public static final int WIDTH_FIELD_NUMBER = 1;
    public static final int HEIGHTEXPR_FIELD_NUMBER = 8;
    private Object heightval_;
    private int gradientAnimMemoizedSerializedSize;

    private void C(int n2) {
        Kn_2 a2;
        int b2 = n2;
        Kn_2 kn_2 = a2 = this;
        kn_2.D();
        kn_2.gradientAnim_.addInt(b2);
    }

    private void C(ByteString byteString) {
        Kn_2 a2;
        ByteString b2 = byteString;
        Kn_2 kn_2 = a2 = this;
        Kn_2.checkByteStringIsUtf8(b2);
        kn_2.widthval_ = b2.toStringUtf8();
        kn_2.widthvalCase_ = pPa.f;
    }

    @Override
    public float getWidth() {
        Kn_2 a2;
        if (a2.widthvalCase_ == vRa.d) {
            return ((Float)a2.widthval_).floatValue();
        }
        return JPa.N;
    }

    public static Kn f(InputStream a2) throws IOException {
        return (Kn_2)Kn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void C(String string) {
        String b2 = string;
        Kn_2 a2 = this;
        b2.getClass();
        Kn_2 kn_2 = a2;
        kn_2.heightvalCase_ = Yqa.i;
        kn_2.heightval_ = b2;
    }

    private void l(int n2) {
        Kn_2 a2;
        int b2 = n2;
        Kn_2 kn_2 = a2 = this;
        kn_2.radiusvalCase_ = uua.p;
        kn_2.radiusval_ = b2;
    }

    public static /* synthetic */ void I(Kn a2) {
        super.g();
    }

    public static Kn J(byte[] a2) throws InvalidProtocolBufferException {
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(Kn kn2, int n2) {
        int b2 = n2;
        Kn a2 = kn2;
        super.C(b2);
    }

    public static Kn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void j(Kn a2) {
        super.k();
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
        Kn_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Kn_2();
            }
            case 2: {
                return new OO(null);
            }
            case 3: {
                Object[] objectArray = new Object[Yqa.i];
                objectArray[uSa.E] = Iqa.B;
                objectArray[vRa.d] = NOa.a;
                objectArray[uqa.g] = STa.J;
                objectArray[yRa.d] = MTa.Ja;
                objectArray[AQa.P] = cRa.w;
                objectArray[tTa.h] = sqa.Ka;
                objectArray[uua.p] = TPa.A;
                objectArray[XTa.W] = jsa.Y;
                d2 = objectArray;
                Object b2 = dsa.j;
                return Kn_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Kn_2.class;
                synchronized (Kn_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Kn>(DEFAULT_INSTANCE);
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

    private void H() {
        Kn_2 a2;
        Kn_2 kn_2 = a2;
        kn_2.heightvalCase_ = uSa.E;
        kn_2.heightval_ = null;
    }

    public static /* synthetic */ void F(Kn a2) {
        super.H();
    }

    @Override
    public boolean hasWidth() {
        Kn_2 a2;
        if (a2.widthvalCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void g() {
        a.gradient_ = Kn_2.emptyIntList();
    }

    public static /* synthetic */ void k(Kn a2) {
        super.e();
    }

    @Override
    public float getHeightAnim() {
        Kn_2 a2;
        if (a2.heightvalCase_ == AQa.P) {
            return ((Float)a2.heightval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void C(Kn kn2, ByteString byteString) {
        Object b2 = byteString;
        Kn a2 = kn2;
        super.l((ByteString)b2);
    }

    public static Kn J(ByteString a2) throws InvalidProtocolBufferException {
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getGradientAnimCount() {
        Kn_2 a2;
        return a2.gradientAnim_.size();
    }

    private void C(float f2) {
        Kn_2 a2;
        float b2 = f2;
        Kn_2 kn_2 = a2 = this;
        kn_2.heightvalCase_ = AQa.P;
        kn_2.heightval_ = Float.valueOf(b2);
    }

    @Override
    public int getRadius() {
        Kn_2 a2;
        if (a2.radiusvalCase_ == tTa.h) {
            return (Integer)a2.radiusval_;
        }
        return uSa.E;
    }

    @Override
    public int getRadiusAnim() {
        Kn_2 a2;
        if (a2.radiusvalCase_ == uua.p) {
            return (Integer)a2.radiusval_;
        }
        return uSa.E;
    }

    public static Kn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Kn kn2, int n2) {
        int b2 = n2;
        Kn a2 = kn2;
        super.f(b2);
    }

    @Override
    public boolean hasWidthAnim() {
        Kn_2 a2;
        if (a2.widthvalCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(ByteString byteString) {
        Kn_2 a2;
        ByteString b2 = byteString;
        Kn_2 kn_2 = a2 = this;
        Kn_2.checkByteStringIsUtf8(b2);
        kn_2.heightval_ = b2.toStringUtf8();
        kn_2.heightvalCase_ = lqa.s;
    }

    public static /* synthetic */ void G(Kn a2) {
        super.f();
    }

    public static /* synthetic */ void D(Kn a2) {
        super.J();
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3) {
        void b2;
        Kn_2 a2;
        int c2 = n3;
        Kn_2 kn_2 = a2 = this;
        kn_2.D();
        kn_2.gradientAnim_.setInt((int)b2, c2);
    }

    @Override
    public ByteString getWidthExprAnimBytes() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.widthvalCase_ == pPa.f) {
            a2 = (String)kn_2.widthval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void f(int n2) {
        Kn_2 a2;
        int b2 = n2;
        Kn_2 kn_2 = a2 = this;
        kn_2.G();
        kn_2.gradient_.addInt(b2);
    }

    public static /* synthetic */ void A(Kn a2) {
        super.F();
    }

    private void f(Iterable<? extends Integer> iterable) {
        Kn_2 a2;
        Iterable<? extends Integer> b2 = iterable;
        Kn_2 kn_2 = a2 = this;
        kn_2.G();
        AbstractMessageLite.addAll(b2, kn_2.gradient_);
    }

    public static /* synthetic */ void C(Kn kn2, float f2) {
        float b2 = f2;
        Kn a2 = kn2;
        super.l(b2);
    }

    public static /* synthetic */ void i(Kn a2) {
        super.l();
    }

    private void I() {
        Kn_2 a2;
        if (a2.radiusvalCase_ == uua.p) {
            Kn_2 kn_2 = a2;
            kn_2.radiusvalCase_ = uSa.E;
            kn_2.radiusval_ = null;
        }
    }

    private void j() {
        Kn_2 a2;
        if (a2.heightvalCase_ == AQa.P) {
            Kn_2 kn_2 = a2;
            kn_2.heightvalCase_ = uSa.E;
            kn_2.heightval_ = null;
        }
    }

    private void J(int n2) {
        Kn_2 a2;
        int b2 = n2;
        Kn_2 kn_2 = a2 = this;
        kn_2.radiusvalCase_ = tTa.h;
        kn_2.radiusval_ = b2;
    }

    public static /* synthetic */ void C(Kn kn2, String string) {
        Object b2 = string;
        Kn a2 = kn2;
        super.f((String)b2);
    }

    public static /* synthetic */ void M(Kn a2) {
        super.I();
    }

    public static /* synthetic */ void e(Kn a2) {
        super.j();
    }

    private void l(float f2) {
        Kn_2 a2;
        float b2 = f2;
        Kn_2 kn_2 = a2 = this;
        kn_2.heightvalCase_ = yRa.d;
        kn_2.heightval_ = Float.valueOf(b2);
    }

    @Override
    public YN getWidthvalCase() {
        Kn_2 a2;
        return YN.forNumber(a2.widthvalCase_);
    }

    private void F() {
        Kn_2 a2;
        if (a2.radiusvalCase_ == tTa.h) {
            Kn_2 kn_2 = a2;
            kn_2.radiusvalCase_ = uSa.E;
            kn_2.radiusval_ = null;
        }
    }

    private void k() {
        Kn_2 a2;
        if (a2.widthvalCase_ == uqa.g) {
            Kn_2 kn_2 = a2;
            kn_2.widthvalCase_ = uSa.E;
            kn_2.widthval_ = null;
        }
    }

    @Override
    public String getHeightExpr() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.heightvalCase_ == Yqa.i) {
            a2 = (String)kn_2.heightval_;
        }
        return a2;
    }

    @Override
    public int getGradientCount() {
        Kn_2 a2;
        return a2.gradient_.size();
    }

    public static /* synthetic */ void d(Kn a2) {
        super.C();
    }

    @Override
    public ByteString getHeightExprAnimBytes() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.heightvalCase_ == lqa.s) {
            a2 = (String)kn_2.heightval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static OO J() {
        return (OO)DEFAULT_INSTANCE.createBuilder();
    }

    private void G() {
        Kn_2 kn_2 = this;
        Internal.IntList a2 = kn_2.gradient_;
        if (!a2.isModifiable()) {
            kn_2.gradient_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public List<Integer> getGradientList() {
        Kn_2 a2;
        return a2.gradient_;
    }

    @Override
    public ByteString getHeightExprBytes() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.heightvalCase_ == Yqa.i) {
            a2 = (String)kn_2.heightval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ void l(Kn kn2, ByteString byteString) {
        Object b2 = byteString;
        Kn a2 = kn2;
        super.f((ByteString)b2);
    }

    @Override
    public float getWidthAnim() {
        Kn_2 a2;
        if (a2.widthvalCase_ == uqa.g) {
            return ((Float)a2.widthval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public String getHeightExprAnim() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.heightvalCase_ == lqa.s) {
            a2 = (String)kn_2.heightval_;
        }
        return a2;
    }

    public static /* synthetic */ void C(Kn a2) {
        super.A();
    }

    @Override
    public LO getRadiusvalCase() {
        Kn_2 a2;
        return LO.forNumber(a2.radiusvalCase_);
    }

    public static /* synthetic */ void f(Kn kn2, Iterable iterable) {
        Object b2 = iterable;
        Kn a2 = kn2;
        super.J((Iterable<? extends Integer>)b2);
    }

    private void D() {
        Kn_2 kn_2 = this;
        Internal.IntList a2 = kn_2.gradientAnim_;
        if (!a2.isModifiable()) {
            kn_2.gradientAnim_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public ByteString getWidthExprBytes() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.widthvalCase_ == XTa.W) {
            a2 = (String)kn_2.widthval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void A() {
        a.gradientAnim_ = Kn_2.emptyIntList();
    }

    public static /* synthetic */ void f(Kn kn2, ByteString byteString) {
        Object b2 = byteString;
        Kn a2 = kn2;
        super.C((ByteString)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(Kn kn2, int n2, int n3) {
        void b2;
        int c2 = n3;
        Kn a2 = kn2;
        super.f((int)b2, c2);
    }

    public static /* synthetic */ Kn f() {
        return DEFAULT_INSTANCE;
    }

    private void i() {
        Kn_2 a2;
        Kn_2 kn_2 = a2;
        kn_2.radiusvalCase_ = uSa.E;
        kn_2.radiusval_ = null;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Kn kn2, int n2, int n3) {
        void b2;
        int c2 = n3;
        Kn a2 = kn2;
        super.J((int)b2, c2);
    }

    public static Parser<Kn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override
    public boolean hasRadius() {
        Kn_2 a2;
        if (a2.radiusvalCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Kn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Kn_2 kn_2 = new Kn_2();
        DEFAULT_INSTANCE = kn_2;
        GeneratedMessageLite.registerDefaultInstance(Kn_2.class, kn_2);
    }

    @Override
    public boolean hasWidthExprAnim() {
        Kn_2 a2;
        if (a2.widthvalCase_ == pPa.f) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(Iterable<? extends Integer> iterable) {
        Kn_2 a2;
        Iterable<? extends Integer> b2 = iterable;
        Kn_2 kn_2 = a2 = this;
        kn_2.D();
        AbstractMessageLite.addAll(b2, kn_2.gradientAnim_);
    }

    private void f(ByteString byteString) {
        Kn_2 a2;
        ByteString b2 = byteString;
        Kn_2 kn_2 = a2 = this;
        Kn_2.checkByteStringIsUtf8(b2);
        kn_2.widthval_ = b2.toStringUtf8();
        kn_2.widthvalCase_ = XTa.W;
    }

    public static Kn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Kn_2)Kn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(Kn kn2, int n2) {
        int b2 = n2;
        Kn a2 = kn2;
        super.l(b2);
    }

    public static OO J(Kn a2) {
        return (OO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public String getWidthExprAnim() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.widthvalCase_ == pPa.f) {
            a2 = (String)kn_2.widthval_;
        }
        return a2;
    }

    public static Kn J(CodedInputStream a2) throws IOException {
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Kn kn2, float f2) {
        float b2 = f2;
        Kn a2 = kn2;
        super.C(b2);
    }

    private void M() {
        Kn_2 a2;
        if (a2.widthvalCase_ == pPa.f) {
            Kn_2 kn_2 = a2;
            kn_2.widthvalCase_ = uSa.E;
            kn_2.widthval_ = null;
        }
    }

    private void e() {
        Kn_2 a2;
        if (a2.widthvalCase_ == XTa.W) {
            Kn_2 kn_2 = a2;
            kn_2.widthvalCase_ = uSa.E;
            kn_2.widthval_ = null;
        }
    }

    public static /* synthetic */ void l(Kn a2) {
        super.d();
    }

    private void f(float f2) {
        Kn_2 a2;
        float b2 = f2;
        Kn_2 kn_2 = a2 = this;
        kn_2.widthvalCase_ = vRa.d;
        kn_2.widthval_ = Float.valueOf(b2);
    }

    private void d() {
        Kn_2 a2;
        if (a2.heightvalCase_ == Yqa.i) {
            Kn_2 kn_2 = a2;
            kn_2.heightvalCase_ = uSa.E;
            kn_2.heightval_ = null;
        }
    }

    @Override
    public boolean hasHeightAnim() {
        Kn_2 a2;
        if (a2.heightvalCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(Kn kn2, Iterable iterable) {
        Object b2 = iterable;
        Kn a2 = kn2;
        super.f((Iterable<? extends Integer>)b2);
    }

    public static /* synthetic */ void f(Kn a2) {
        super.i();
    }

    @Override
    public String getWidthExpr() {
        Kn_2 kn_2 = this;
        Object a2 = Mqa.y;
        if (kn_2.widthvalCase_ == XTa.W) {
            a2 = (String)kn_2.widthval_;
        }
        return a2;
    }

    public static /* synthetic */ void J(Kn a2) {
        super.M();
    }

    public static Kn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l(String string) {
        String b2 = string;
        Kn_2 a2 = this;
        b2.getClass();
        Kn_2 kn_2 = a2;
        kn_2.heightvalCase_ = lqa.s;
        kn_2.heightval_ = b2;
    }

    private void J(float f2) {
        Kn_2 a2;
        float b2 = f2;
        Kn_2 kn_2 = a2 = this;
        kn_2.widthvalCase_ = uqa.g;
        kn_2.widthval_ = Float.valueOf(b2);
    }

    private void f(String string) {
        String b2 = string;
        Kn_2 a2 = this;
        b2.getClass();
        Kn_2 kn_2 = a2;
        kn_2.widthvalCase_ = XTa.W;
        kn_2.widthval_ = b2;
    }

    public static Kn J(InputStream a2) throws IOException {
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Kn kn2, String string) {
        Object b2 = string;
        Kn a2 = kn2;
        super.l((String)b2);
    }

    @Override
    public List<Integer> getGradientAnimList() {
        Kn_2 a2;
        return a2.gradientAnim_;
    }

    private void C() {
        Kn_2 a2;
        if (a2.heightvalCase_ == yRa.d) {
            Kn_2 kn_2 = a2;
            kn_2.heightvalCase_ = uSa.E;
            kn_2.heightval_ = null;
        }
    }

    @Override
    public boolean hasRadiusAnim() {
        Kn_2 a2;
        if (a2.radiusvalCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(Kn kn2, int n2) {
        int b2 = n2;
        Kn a2 = kn2;
        super.J(b2);
    }

    @Override
    public boolean hasWidthExpr() {
        Kn_2 a2;
        if (a2.widthvalCase_ == XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int getGradientAnim(int n2) {
        int b2 = n2;
        Kn_2 a2 = this;
        return a2.gradientAnim_.getInt(b2);
    }

    @Override
    public int getGradient(int n2) {
        int b2 = n2;
        Kn_2 a2 = this;
        return a2.gradient_.getInt(b2);
    }

    private Kn_2() {
        Kn_2 a2;
        a2.radiusvalCase_ = uSa.E;
        a2.gradientMemoizedSerializedSize = pua.o;
        a2.gradientAnimMemoizedSerializedSize = pua.o;
        a2.gradient_ = Kn_2.emptyIntList();
        a2.gradientAnim_ = Kn_2.emptyIntList();
    }

    private void J(String string) {
        String b2 = string;
        Kn_2 a2 = this;
        b2.getClass();
        Kn_2 kn_2 = a2;
        kn_2.widthvalCase_ = pPa.f;
        kn_2.widthval_ = b2;
    }

    public static /* synthetic */ void f(Kn kn2, String string) {
        Object b2 = string;
        Kn a2 = kn2;
        super.J((String)b2);
    }

    public static /* synthetic */ void J(Kn kn2, String string) {
        Object b2 = string;
        Kn a2 = kn2;
        super.C((String)b2);
    }

    @Override
    public boolean hasHeightExpr() {
        Kn_2 a2;
        if (a2.heightvalCase_ == Yqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        Kn_2 a2;
        int c2 = n3;
        Kn_2 kn_2 = a2 = this;
        kn_2.G();
        kn_2.gradient_.setInt((int)b2, c2);
    }

    @Override
    public No getHeightvalCase() {
        Kn_2 a2;
        return No.forNumber((int)a2.heightvalCase_);
    }

    private void J(ByteString byteString) {
        Kn_2 a2;
        ByteString b2 = byteString;
        Kn_2 kn_2 = a2 = this;
        Kn_2.checkByteStringIsUtf8(b2);
        kn_2.heightval_ = b2.toStringUtf8();
        kn_2.heightvalCase_ = Yqa.i;
    }

    public static Kn J() {
        return DEFAULT_INSTANCE;
    }

    public static Kn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(Kn kn2, float f2) {
        float b2 = f2;
        Kn a2 = kn2;
        super.J(b2);
    }

    public static /* synthetic */ void J(Kn kn2, ByteString byteString) {
        Object b2 = byteString;
        Kn a2 = kn2;
        super.J((ByteString)b2);
    }

    private void l() {
        Kn_2 a2;
        if (a2.widthvalCase_ == vRa.d) {
            Kn_2 kn_2 = a2;
            kn_2.widthvalCase_ = uSa.E;
            kn_2.widthval_ = null;
        }
    }

    @Override
    public float getHeight() {
        Kn_2 a2;
        if (a2.heightvalCase_ == yRa.d) {
            return ((Float)a2.heightval_).floatValue();
        }
        return JPa.N;
    }

    @Override
    public boolean hasHeight() {
        Kn_2 a2;
        if (a2.heightvalCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasHeightExprAnim() {
        Kn_2 a2;
        if (a2.heightvalCase_ == lqa.s) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Kn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Kn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Kn kn2, float f2) {
        float b2 = f2;
        Kn a2 = kn2;
        super.f(b2);
    }

    private void f() {
        Kn_2 a2;
        if (a2.heightvalCase_ == lqa.s) {
            Kn_2 kn_2 = a2;
            kn_2.heightvalCase_ = uSa.E;
            kn_2.heightval_ = null;
        }
    }

    private void J() {
        Kn_2 a2;
        Kn_2 kn_2 = a2;
        kn_2.widthvalCase_ = uSa.E;
        kn_2.widthval_ = null;
    }
}

