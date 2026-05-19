/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bpa
 *  ERa
 *  JPa
 *  NQa
 *  NTa
 *  SRa
 *  XTa
 *  bpa
 *  fm
 *  kpa
 *  lqa
 *  pua
 *  vRa
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
public final class fm_1
extends GeneratedMessageLite<fm, xo>
implements hA {
    public static final int DRAG_FIELD_NUMBER = 4;
    private int bitField0_;
    private Internal.FloatList coords_;
    public static final int ANIMATIONTICKS_FIELD_NUMBER = 2;
    private int coordsMemoizedSerializedSize = pua.o;
    public static final int IMPELX_FIELD_NUMBER = 5;
    private static final fm DEFAULT_INSTANCE;
    private float impelX_;
    private boolean impelYOnTop_;
    public static final int IMPELYONTOP_FIELD_NUMBER = 8;
    private float impelZ_;
    private float impelY_;
    private static volatile Parser<fm> PARSER;
    private boolean impelXZOnSides_;
    public static final int IMPELXZONSIDES_FIELD_NUMBER = 9;
    private int impelType_;
    private boolean drag_;
    public static final int IMPELTYPE_FIELD_NUMBER = 10;
    public static final int IMPELY_FIELD_NUMBER = 6;
    public static final int COORDS_FIELD_NUMBER = 1;
    public static final int IMPELZ_FIELD_NUMBER = 7;
    private int animationTicks_;

    @Override
    public boolean getImpelXZOnSides() {
        fm_1 a2;
        return a2.impelXZOnSides_;
    }

    public static fm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (fm_1)fm_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C(float f2) {
        float b2 = f2;
        fm_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.impelY_ = b2;
    }

    public static Parser<fm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override
    public int getAnimationTicks() {
        fm_1 a2;
        return a2.animationTicks_;
    }

    private void D() {
        a.bitField0_ &= Jra.Fa;
        a.impelY_ = JPa.N;
    }

    private void f(int n2) {
        int b2 = n2;
        fm_1 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.impelType_ = b2;
    }

    public static fm J(ByteString a2) throws InvalidProtocolBufferException {
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getCoordsCount() {
        fm_1 a2;
        return a2.coords_.size();
    }

    @Override
    public boolean hasImpelYOnTop() {
        fm_1 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static xo J() {
        return (xo)DEFAULT_INSTANCE.createBuilder();
    }

    @Override
    public boolean hasImpelX() {
        fm_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasImpelType() {
        fm_1 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasImpelZ() {
        fm_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void A(fm a2) {
        super.D();
    }

    @Override
    public float getImpelZ() {
        fm_1 a2;
        return a2.impelZ_;
    }

    @Override
    public List<Float> getCoordsList() {
        fm_1 a2;
        return a2.coords_;
    }

    private void l(float f2) {
        float b2 = f2;
        fm_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.impelX_ = b2;
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
        fm_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new fm_1();
            }
            case 2: {
                return new xo(null);
            }
            case 3: {
                Object[] objectArray = new Object[NTa.C];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = Psa.v;
                objectArray[uqa.g] = Bpa.k;
                objectArray[yRa.d] = wta.e;
                objectArray[AQa.P] = SRa.T;
                objectArray[tTa.h] = opa.e;
                objectArray[uua.p] = UOa.a;
                objectArray[XTa.W] = Jpa.Da;
                objectArray[Yqa.i] = bpa.F;
                objectArray[WOa.fa] = Zqa.W;
                d2 = objectArray;
                Object b2 = rSa.m;
                return fm_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = fm_1.class;
                synchronized (fm_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<fm>(DEFAULT_INSTANCE);
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
    public int getImpelTypeValue() {
        fm_1 a2;
        return a2.impelType_;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(fm fm2, int n2, float f2) {
        void b2;
        float c2 = f2;
        fm a2 = fm2;
        super.J((int)b2, c2);
    }

    private void A() {
        a.bitField0_ &= fta.fa;
        a.impelYOnTop_ = uSa.E;
    }

    private void i() {
        a.coords_ = fm_1.emptyFloatList();
    }

    public static xo J(fm a2) {
        return (xo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void M() {
        a.bitField0_ &= ERa.Ka;
        a.drag_ = uSa.E;
    }

    private void e() {
        a.bitField0_ &= NQa.A;
        a.impelZ_ = JPa.N;
    }

    public static fm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public float getCoords(int n2) {
        int b2 = n2;
        fm_1 a2 = this;
        return a2.coords_.getFloat(b2);
    }

    public static /* synthetic */ void C(fm fm2, float f2) {
        float b2 = f2;
        fm a2 = fm2;
        super.f(b2);
    }

    public static /* synthetic */ void i(fm a2) {
        super.C();
    }

    public static fm J(byte[] a2) throws InvalidProtocolBufferException {
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void M(fm a2) {
        super.i();
    }

    private void f(float f2) {
        float b2 = f2;
        fm_1 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.impelZ_ = b2;
    }

    public static fm f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(fm fm2, int n2) {
        int b2 = n2;
        fm a2 = fm2;
        super.J(b2);
    }

    public static /* synthetic */ void J(fm fm2, int n2) {
        int b2 = n2;
        fm a2 = fm2;
        super.f(b2);
    }

    private void J(float f2) {
        fm_1 a2;
        float b2 = f2;
        fm_1 fm_12 = a2 = this;
        fm_12.d();
        fm_12.coords_.addFloat(b2);
    }

    private void d() {
        fm_1 fm_12 = this;
        Internal.FloatList a2 = fm_12.coords_;
        if (!a2.isModifiable()) {
            fm_12.coords_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.animationTicks_ = uSa.E;
    }

    public static /* synthetic */ void l(fm fm2, boolean bl) {
        boolean b2 = bl;
        fm a2 = fm2;
        super.f(b2);
    }

    @Override
    public Un getImpelType() {
        fm_1 fm_12 = this;
        Un a2 = Un.forNumber(fm_12.impelType_);
        if (a2 == null) {
            return Un.UNRECOGNIZED;
        }
        return a2;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        fm_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.drag_ = b2;
    }

    @Override
    public float getImpelY() {
        fm_1 a2;
        return a2.impelY_;
    }

    public static /* synthetic */ void l(fm fm2, float f2) {
        float b2 = f2;
        fm a2 = fm2;
        super.J(b2);
    }

    private void l() {
        a.bitField0_ &= Bta.u;
        a.impelType_ = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        fm_1 a2;
        float c2 = f2;
        fm_1 fm_12 = a2 = this;
        fm_12.d();
        fm_12.coords_.setFloat((int)b2, c2);
    }

    private void f() {
        a.bitField0_ &= VPa.A;
        a.impelXZOnSides_ = uSa.E;
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        fm_1 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.impelYOnTop_ = b2;
    }

    public static fm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J(Iterable<? extends Float> iterable) {
        fm_1 a2;
        Iterable<? extends Float> b2 = iterable;
        fm_1 fm_12 = a2 = this;
        fm_12.d();
        AbstractMessageLite.addAll(b2, fm_12.coords_);
    }

    public static /* synthetic */ void f(fm fm2, float f2) {
        float b2 = f2;
        fm a2 = fm2;
        super.l(b2);
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.impelX_ = JPa.N;
    }

    @Override
    public boolean getImpelYOnTop() {
        fm_1 a2;
        return a2.impelYOnTop_;
    }

    public static fm J(CodedInputStream a2) throws IOException {
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(Un un2) {
        Un b2 = un2;
        fm_1 a2 = this;
        a2.impelType_ = b2.getNumber();
        a2.bitField0_ |= XOa.h;
    }

    public static /* synthetic */ void e(fm a2) {
        super.l();
    }

    public static fm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static fm f(InputStream a2) throws IOException {
        return (fm_1)fm_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static fm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(fm fm2, boolean bl) {
        boolean b2 = bl;
        fm a2 = fm2;
        super.J(b2);
    }

    @Override
    public boolean hasAnimationTicks() {
        fm_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(fm a2) {
        super.A();
    }

    public static /* synthetic */ void J(fm fm2, boolean bl) {
        boolean b2 = bl;
        fm a2 = fm2;
        super.l(b2);
    }

    public static /* synthetic */ void C(fm a2) {
        super.e();
    }

    static {
        fm_1 fm_12 = new fm_1();
        DEFAULT_INSTANCE = fm_12;
        GeneratedMessageLite.registerDefaultInstance(fm_1.class, fm_12);
    }

    @Override
    public boolean hasImpelY() {
        fm_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasDrag() {
        fm_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(fm fm2, float f2) {
        float b2 = f2;
        fm a2 = fm2;
        super.C(b2);
    }

    @Override
    public boolean getDrag() {
        fm_1 a2;
        return a2.drag_;
    }

    public static fm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(fm fm2, Iterable iterable) {
        Object b2 = iterable;
        fm a2 = fm2;
        super.J((Iterable<? extends Float>)b2);
    }

    public static /* synthetic */ fm J() {
        return DEFAULT_INSTANCE;
    }

    public static fm J(InputStream a2) throws IOException {
        return (fm_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(fm a2) {
        super.f();
    }

    public static /* synthetic */ void f(fm a2) {
        super.J();
    }

    @Override
    public float getImpelX() {
        fm_1 a2;
        return a2.impelX_;
    }

    @Override
    public boolean hasImpelXZOnSides() {
        fm_1 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(int n2) {
        int b2 = n2;
        fm_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.animationTicks_ = b2;
    }

    private fm_1() {
        fm_1 a2;
        a2.coords_ = fm_1.emptyFloatList();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        fm_1 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.impelXZOnSides_ = b2;
    }

    public static /* synthetic */ void J(fm a2) {
        super.M();
    }

    public static /* synthetic */ void J(fm fm2, Un un2) {
        Object b2 = un2;
        fm a2 = fm2;
        super.J((Un)b2);
    }
}

