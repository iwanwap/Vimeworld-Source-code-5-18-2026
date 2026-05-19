/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  Ko
 *  NQa
 *  NTa
 *  Spa
 *  TPa
 *  VN
 *  Vn
 *  XTa
 *  Zta
 *  aSa
 *  gm
 *  isa
 *  kpa
 *  lqa
 *  pPa
 *  pua
 *  vRa
 *  yN
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
public final class VN_3
extends GeneratedMessageLite<VN, gm>
implements Na {
    public static final int HEIGHT_FIELD_NUMBER = 8;
    private float width_;
    private int modelCase_;
    public static final int MODELOFFSET_FIELD_NUMBER = 11;
    private static volatile Parser<VN> PARSER;
    private Internal.IntList allowedPerspectives_;
    public static final int DISABLERENDER_FIELD_NUMBER = 13;
    private Object model_;
    public static final int MODELPATH_FIELD_NUMBER = 5;
    public static final int TEXTURERESOURCE_FIELD_NUMBER = 4;
    private int color_;
    public static final int ALWAYSRENDER_FIELD_NUMBER = 10;
    private float scale_;
    private boolean hurtDeathAnimationDisabled_;
    public static final int SCALE_FIELD_NUMBER = 2;
    private Object texture_;
    public static final int COLOR_FIELD_NUMBER = 1;
    public static final int MODELRESOURCE_FIELD_NUMBER = 6;
    private float height_;
    public static final int ALLOWEDPERSPECTIVES_FIELD_NUMBER = 12;
    private boolean disableRender_;
    public static final int HURTDEATHANIMATIONDISABLED_FIELD_NUMBER = 9;
    private static final VN DEFAULT_INSTANCE;
    private int textureCase_ = uSa.E;
    private int bitField0_;
    public static final int TEXTUREPATH_FIELD_NUMBER = 3;
    private do modelOffset_;
    private boolean alwaysRender_;
    private int allowedPerspectivesMemoizedSerializedSize;
    public static final int WIDTH_FIELD_NUMBER = 7;

    public static /* synthetic */ void I(VN a2) {
        super.A();
    }

    private void C(int n2) {
        VN_3 a2;
        int b2 = n2;
        VN_3 vN_3 = a2 = this;
        vN_3.modelCase_ = uua.p;
        vN_3.model_ = b2;
    }

    private void g() {
        VN_3 a2;
        VN_3 vN_3 = a2;
        vN_3.textureCase_ = uSa.E;
        vN_3.texture_ = null;
    }

    @Override
    public boolean hasModelPath() {
        VN_3 a2;
        if (a2.modelCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasDisableRender() {
        VN_3 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static gm J(VN a2) {
        return (gm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void I() {
        a.bitField0_ &= Bta.u;
        a.disableRender_ = uSa.E;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        VN_3 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.hurtDeathAnimationDisabled_ = b2;
    }

    private void l(int n2) {
        VN_3 a2;
        int b2 = n2;
        VN_3 vN_3 = a2 = this;
        vN_3.textureCase_ = AQa.P;
        vN_3.texture_ = b2;
    }

    public static /* synthetic */ void j(VN a2) {
        super.I();
    }

    public static /* synthetic */ void l(VN vN2, float f2) {
        float b2 = f2;
        VN a2 = vN2;
        super.f(b2);
    }

    public static /* synthetic */ void f(VN vN2, String string) {
        Object b2 = string;
        VN a2 = vN2;
        super.f((String)b2);
    }

    public static /* synthetic */ void F(VN a2) {
        super.G();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(VN vN2, int n2, int n3) {
        void b2;
        int c2 = n3;
        VN a2 = vN2;
        super.J((int)b2, c2);
    }

    public static /* synthetic */ void J(VN vN2, String string) {
        Object b2 = string;
        VN a2 = vN2;
        super.J((String)b2);
    }

    private void j() {
        a.modelOffset_ = null;
        a.bitField0_ &= VPa.A;
    }

    private void l(float f2) {
        float b2 = f2;
        VN_3 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.width_ = b2;
    }

    @Override
    public ByteString getTexturePathBytes() {
        VN_3 vN_3 = this;
        Object a2 = Mqa.y;
        if (vN_3.textureCase_ == yRa.d) {
            a2 = (String)vN_3.texture_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    @Override
    public int getColor() {
        VN_3 a2;
        return a2.color_;
    }

    private void f(ByteString byteString) {
        VN_3 a2;
        ByteString b2 = byteString;
        VN_3 vN_3 = a2 = this;
        VN_3.checkByteStringIsUtf8(b2);
        vN_3.model_ = b2.toStringUtf8();
        vN_3.modelCase_ = tTa.h;
    }

    public static VN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(VN vN2, ByteString byteString) {
        Object b2 = byteString;
        VN a2 = vN2;
        super.J((ByteString)b2);
    }

    @Override
    public int getAllowedPerspectives(int n2) {
        int b2 = n2;
        VN_3 a2 = this;
        return a2.allowedPerspectives_.getInt(b2);
    }

    public static /* synthetic */ void k(VN a2) {
        super.e();
    }

    public static /* synthetic */ void G(VN a2) {
        super.D();
    }

    @Override
    public boolean hasModelOffset() {
        VN_3 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(Iterable<? extends Integer> iterable) {
        VN_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        VN_3 vN_3 = a2 = this;
        vN_3.J();
        AbstractMessageLite.addAll(b2, vN_3.allowedPerspectives_);
    }

    public static /* synthetic */ void f(VN vN2, float f2) {
        float b2 = f2;
        VN a2 = vN2;
        super.J(b2);
    }

    public static /* synthetic */ void f(VN vN2, do do_) {
        Object b2 = do_;
        VN a2 = vN2;
        super.J((do)b2);
    }

    private void F() {
        a.bitField0_ &= Jra.Fa;
        a.height_ = JPa.N;
    }

    private void k() {
        VN_3 a2;
        if (a2.textureCase_ == yRa.d) {
            VN_3 vN_3 = a2;
            vN_3.textureCase_ = uSa.E;
            vN_3.texture_ = null;
        }
    }

    private void G() {
        a.bitField0_ &= rQa.p;
        a.color_ = uSa.E;
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        VN_3 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.disableRender_ = b2;
    }

    public static VN f(InputStream a2) throws IOException {
        return (VN_3)VN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasWidth() {
        VN_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public Ko getModelCase() {
        VN_3 a2;
        return Ko.forNumber((int)a2.modelCase_);
    }

    @Override
    public int getAllowedPerspectivesCount() {
        VN_3 a2;
        return a2.allowedPerspectives_.size();
    }

    public static /* synthetic */ void D(VN a2) {
        super.C();
    }

    private void f(float f2) {
        float b2 = f2;
        VN_3 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.height_ = b2;
    }

    public static /* synthetic */ void J(VN vN2, float f2) {
        float b2 = f2;
        VN a2 = vN2;
        super.l(b2);
    }

    public static VN f() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public yN getTextureCase() {
        VN_3 a2;
        return yN.forNumber((int)a2.textureCase_);
    }

    public static /* synthetic */ void A(VN a2) {
        super.F();
    }

    private void D() {
        VN_3 a2;
        VN_3 vN_3 = a2;
        vN_3.modelCase_ = uSa.E;
        vN_3.model_ = null;
    }

    @Override
    public boolean hasHeight() {
        VN_3 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void A() {
        VN_3 a2;
        if (a2.textureCase_ == AQa.P) {
            VN_3 vN_3 = a2;
            vN_3.textureCase_ = uSa.E;
            vN_3.texture_ = null;
        }
    }

    public static /* synthetic */ void i(VN a2) {
        super.d();
    }

    public static /* synthetic */ VN J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void M(VN a2) {
        super.f();
    }

    public static VN J(InputStream a2) throws IOException {
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static VN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (VN_3)VN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(do do_) {
        GeneratedMessageLite b2 = do_;
        VN_3 a2 = this;
        b2.getClass();
        a2.modelOffset_ = b2;
        a2.bitField0_ |= ysa.s;
    }

    private void i() {
        a.bitField0_ &= ERa.Ka;
        a.scale_ = JPa.N;
    }

    public static VN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasTextureResource() {
        VN_3 a2;
        if (a2.textureCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(String string) {
        String b2 = string;
        VN_3 a2 = this;
        b2.getClass();
        VN_3 vN_3 = a2;
        vN_3.textureCase_ = yRa.d;
        vN_3.texture_ = b2;
    }

    public static /* synthetic */ void l(VN vN2, boolean bl) {
        boolean b2 = bl;
        VN a2 = vN2;
        super.l(b2);
    }

    private void J(float f2) {
        float b2 = f2;
        VN_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.scale_ = b2;
    }

    private void J(do do_) {
        VN_3 vN_3;
        GeneratedMessageLite b2 = do_;
        VN_3 a2 = this;
        b2.getClass();
        if (a2.modelOffset_ != null && a2.modelOffset_ != do.f()) {
            a2.modelOffset_ = (do)((Vn)do.J(a2.modelOffset_).mergeFrom(b2)).buildPartial();
            vN_3 = a2;
        } else {
            vN_3 = a2;
            a2.modelOffset_ = b2;
        }
        vN_3.bitField0_ |= ysa.s;
    }

    private void M() {
        a.bitField0_ &= kpa.w;
        a.width_ = JPa.N;
    }

    @Override
    public boolean hasScale() {
        VN_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(VN vN2, ByteString byteString) {
        Object b2 = byteString;
        VN a2 = vN2;
        super.f((ByteString)b2);
    }

    public static /* synthetic */ void C(VN vN2, int n2) {
        int b2 = n2;
        VN a2 = vN2;
        super.f(b2);
    }

    @Override
    public boolean hasAlwaysRender() {
        VN_3 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static gm J() {
        return (gm)DEFAULT_INSTANCE.createBuilder();
    }

    @Override
    public List<Integer> getAllowedPerspectivesList() {
        VN_3 a2;
        return a2.allowedPerspectives_;
    }

    @Override
    public float getHeight() {
        VN_3 a2;
        return a2.height_;
    }

    public static /* synthetic */ void l(VN vN2, int n2) {
        int b2 = n2;
        VN a2 = vN2;
        super.l(b2);
    }

    private void e() {
        VN_3 a2;
        if (a2.modelCase_ == uua.p) {
            VN_3 vN_3 = a2;
            vN_3.modelCase_ = uSa.E;
            vN_3.model_ = null;
        }
    }

    public static VN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void f(VN vN2, int n2) {
        int b2 = n2;
        VN a2 = vN2;
        super.C(b2);
    }

    public static /* synthetic */ void J(VN vN2, int n2) {
        int b2 = n2;
        VN a2 = vN2;
        super.J(b2);
    }

    @Override
    public boolean getDisableRender() {
        VN_3 a2;
        return a2.disableRender_;
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
        VN_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new VN_3();
            }
            case 2: {
                return new gm(null);
            }
            case 3: {
                Object[] objectArray = new Object[hpa.Z];
                objectArray[uSa.E] = aSa.j;
                objectArray[vRa.d] = isa.j;
                objectArray[uqa.g] = ypa.q;
                objectArray[yRa.d] = wua.g;
                objectArray[AQa.P] = lqa.E;
                objectArray[tTa.h] = lQa.Ka;
                objectArray[uua.p] = Ora.U;
                objectArray[XTa.W] = LPa.a;
                objectArray[Yqa.i] = fqa.i;
                objectArray[WOa.fa] = fPa.G;
                objectArray[NTa.C] = TPa.j;
                objectArray[pPa.f] = GPa.n;
                objectArray[lqa.s] = EPa.N;
                objectArray[uua.s] = Zta.r;
                d2 = objectArray;
                Object b2 = Spa.Ia;
                return VN_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = VN_3.class;
                synchronized (VN_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<VN>(DEFAULT_INSTANCE);
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
    public float getWidth() {
        VN_3 a2;
        return a2.width_;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        VN_3 a2;
        int c2 = n3;
        VN_3 vN_3 = a2 = this;
        vN_3.J();
        vN_3.allowedPerspectives_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void e(VN a2) {
        super.k();
    }

    @Override
    public float getScale() {
        VN_3 a2;
        return a2.scale_;
    }

    @Override
    public int getModelResource() {
        VN_3 a2;
        if (a2.modelCase_ == uua.p) {
            return (Integer)a2.model_;
        }
        return uSa.E;
    }

    private void f(int n2) {
        int b2 = n2;
        VN_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.color_ = b2;
    }

    @Override
    public ByteString getModelPathBytes() {
        VN_3 vN_3 = this;
        Object a2 = Mqa.y;
        if (vN_3.modelCase_ == tTa.h) {
            a2 = (String)vN_3.model_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void J(String string) {
        String b2 = string;
        VN_3 a2 = this;
        b2.getClass();
        VN_3 vN_3 = a2;
        vN_3.modelCase_ = tTa.h;
        vN_3.model_ = b2;
    }

    @Override
    public boolean getHurtDeathAnimationDisabled() {
        VN_3 a2;
        return a2.hurtDeathAnimationDisabled_;
    }

    @Override
    public boolean hasTexturePath() {
        VN_3 a2;
        if (a2.textureCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(VN a2) {
        super.g();
    }

    @Override
    public String getModelPath() {
        VN_3 vN_3 = this;
        Object a2 = Mqa.y;
        if (vN_3.modelCase_ == tTa.h) {
            a2 = (String)vN_3.model_;
        }
        return a2;
    }

    public static /* synthetic */ void f(VN vN2, boolean bl) {
        boolean b2 = bl;
        VN a2 = vN2;
        super.f(b2);
    }

    public static Parser<VN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(VN vN2, boolean bl) {
        boolean b2 = bl;
        VN a2 = vN2;
        super.J(b2);
    }

    @Override
    public String getTexturePath() {
        VN_3 vN_3 = this;
        Object a2 = Mqa.y;
        if (vN_3.textureCase_ == yRa.d) {
            a2 = (String)vN_3.texture_;
        }
        return a2;
    }

    @Override
    public boolean hasModelResource() {
        VN_3 a2;
        if (a2.modelCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static VN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public do getModelOffset() {
        VN_3 a2;
        if (a2.modelOffset_ == null) {
            return do.f();
        }
        return a2.modelOffset_;
    }

    public static VN J(byte[] a2) throws InvalidProtocolBufferException {
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static VN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        VN_3 a2;
        int b2 = n2;
        VN_3 vN_3 = a2 = this;
        vN_3.J();
        vN_3.allowedPerspectives_.addInt(b2);
    }

    public static /* synthetic */ void C(VN a2) {
        super.i();
    }

    public static VN J(ByteString a2) throws InvalidProtocolBufferException {
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasColor() {
        VN_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasHurtDeathAnimationDisabled() {
        VN_3 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void d() {
        a.allowedPerspectives_ = VN_3.emptyIntList();
    }

    public static /* synthetic */ void J(VN vN2, do do_) {
        Object b2 = do_;
        VN a2 = vN2;
        super.f((do)b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        VN_3 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.alwaysRender_ = b2;
    }

    public static /* synthetic */ void J(VN vN2, Iterable iterable) {
        Object b2 = iterable;
        VN a2 = vN2;
        super.J((Iterable<? extends Integer>)b2);
    }

    public static /* synthetic */ void l(VN a2) {
        super.M();
    }

    private void C() {
        VN_3 a2;
        if (a2.modelCase_ == tTa.h) {
            VN_3 vN_3 = a2;
            vN_3.modelCase_ = uSa.E;
            vN_3.model_ = null;
        }
    }

    private VN_3() {
        VN_3 a2;
        a2.modelCase_ = uSa.E;
        a2.allowedPerspectivesMemoizedSerializedSize = pua.o;
        a2.allowedPerspectives_ = VN_3.emptyIntList();
    }

    public static VN J(CodedInputStream a2) throws IOException {
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l() {
        a.bitField0_ &= NQa.A;
        a.hurtDeathAnimationDisabled_ = uSa.E;
    }

    @Override
    public boolean getAlwaysRender() {
        VN_3 a2;
        return a2.alwaysRender_;
    }

    @Override
    public int getTextureResource() {
        VN_3 a2;
        if (a2.textureCase_ == AQa.P) {
            return (Integer)a2.texture_;
        }
        return uSa.E;
    }

    static {
        VN_3 vN_3 = new VN_3();
        DEFAULT_INSTANCE = vN_3;
        GeneratedMessageLite.registerDefaultInstance(VN_3.class, vN_3);
    }

    private void f() {
        a.bitField0_ &= fta.fa;
        a.alwaysRender_ = uSa.E;
    }

    public static /* synthetic */ void f(VN a2) {
        super.l();
    }

    public static /* synthetic */ void J(VN a2) {
        super.j();
    }

    public static VN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (VN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        VN_3 vN_3 = this;
        Internal.IntList a2 = vN_3.allowedPerspectives_;
        if (!a2.isModifiable()) {
            vN_3.allowedPerspectives_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void J(ByteString byteString) {
        VN_3 a2;
        ByteString b2 = byteString;
        VN_3 vN_3 = a2 = this;
        VN_3.checkByteStringIsUtf8(b2);
        vN_3.texture_ = b2.toStringUtf8();
        vN_3.textureCase_ = yRa.d;
    }
}

