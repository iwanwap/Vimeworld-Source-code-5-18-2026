/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DQa
 *  ERa
 *  JPa
 *  LQa
 *  NN
 *  NQa
 *  NTa
 *  Uta
 *  XTa
 *  cQa
 *  gb
 *  hra
 *  isa
 *  kpa
 *  lqa
 *  pPa
 *  qn
 *  vRa
 *  wOa
 *  ysa
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
public final class NN_1
extends GeneratedMessageLite<NN, qn>
implements gb {
    public static final int Z_FIELD_NUMBER = 3;
    private float angleX_;
    private float angleZ_;
    public static final int ANGLEX_FIELD_NUMBER = 7;
    private float scaleZ_;
    private float scaleX_;
    private float scaleY_;
    private float y_;
    private static volatile Parser<NN> PARSER;
    public static final int ANGLEY_FIELD_NUMBER = 8;
    private float z_;
    private int bitField0_;
    private static final NN DEFAULT_INSTANCE;
    public static final int Y_FIELD_NUMBER = 2;
    private float scale_;
    public static final int SCALEY_FIELD_NUMBER = 5;
    private float angleY_;
    public static final int SCALEX_FIELD_NUMBER = 4;
    public static final int SCALEZ_FIELD_NUMBER = 6;
    public static final int X_FIELD_NUMBER = 1;
    public static final int ANGLEZ_FIELD_NUMBER = 9;
    private float x_;
    public static final int SCALE_FIELD_NUMBER = 10;

    public static NN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (NN_1)NN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void D() {
        a.bitField0_ &= Bta.u;
        a.angleX_ = JPa.N;
    }

    public float getZ() {
        NN_1 a2;
        return a2.z_;
    }

    private void A() {
        a.bitField0_ &= NQa.A;
        a.scaleX_ = JPa.N;
    }

    public boolean hasScaleX() {
        NN_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasY() {
        NN_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static NN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void D(NN a2) {
        super.A();
    }

    public static /* synthetic */ void D(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.e(b2);
    }

    public static NN J(CodedInputStream a2) throws IOException {
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void A(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.A(b2);
    }

    private void i() {
        a.bitField0_ &= fta.fa;
        a.scaleY_ = JPa.N;
    }

    private void D(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.angleY_ = b2;
    }

    private void M() {
        a.bitField0_ &= MTa.c;
        a.angleY_ = JPa.N;
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
        NN_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new NN_1();
            }
            case 2: {
                return new qn(null);
            }
            case 3: {
                Object[] objectArray = new Object[pPa.f];
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
                objectArray[NTa.C] = Ora.U;
                d2 = objectArray;
                Object b2 = SPa.u;
                return NN_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = NN_1.class;
                synchronized (NN_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<NN>(DEFAULT_INSTANCE);
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

    public float getAngleY() {
        NN_1 a2;
        return a2.angleY_;
    }

    private void A(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.scaleY_ = b2;
    }

    private void i(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.angleZ_ = b2;
    }

    public boolean hasAngleX() {
        NN_1 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void e() {
        a.bitField0_ &= rQa.p;
        a.x_ = JPa.N;
    }

    private NN_1() {
        NN_1 a2;
    }

    public float getAngleZ() {
        NN_1 a2;
        return a2.angleZ_;
    }

    private void d() {
        a.bitField0_ &= ERa.Ka;
        a.y_ = JPa.N;
    }

    public static NN f(InputStream a2) throws IOException {
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getScaleY() {
        NN_1 a2;
        return a2.scaleY_;
    }

    public static /* synthetic */ void A(NN a2) {
        super.e();
    }

    private void M(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.scaleX_ = b2;
    }

    private void e(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.scale_ = b2;
    }

    public static /* synthetic */ void i(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.l(b2);
    }

    private void C() {
        a.bitField0_ &= Jra.Fa;
        a.scale_ = JPa.N;
    }

    public float getScaleX() {
        NN_1 a2;
        return a2.scaleX_;
    }

    public static /* synthetic */ void i(NN a2) {
        super.d();
    }

    public static /* synthetic */ void M(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.i(b2);
    }

    public static /* synthetic */ void M(NN a2) {
        super.f();
    }

    private void l() {
        a.bitField0_ &= VPa.A;
        a.scaleZ_ = JPa.N;
    }

    public static /* synthetic */ void e(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.C(b2);
    }

    public static /* synthetic */ void e(NN a2) {
        super.i();
    }

    public boolean hasAngleZ() {
        NN_1 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void d(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.d(b2);
    }

    public static /* synthetic */ void C(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.D(b2);
    }

    public static /* synthetic */ void d(NN a2) {
        super.l();
    }

    public float getX() {
        NN_1 a2;
        return a2.x_;
    }

    public static NN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(NN a2) {
        super.D();
    }

    public static /* synthetic */ void l(NN a2) {
        super.M();
    }

    public float getScale() {
        NN_1 a2;
        return a2.scale_;
    }

    private void d(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.scaleZ_ = b2;
    }

    public static NN J(ByteString a2) throws InvalidProtocolBufferException {
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.z_ = b2;
    }

    public float getAngleX() {
        NN_1 a2;
        return a2.angleX_;
    }

    static {
        NN_1 nN_1 = new NN_1();
        DEFAULT_INSTANCE = nN_1;
        GeneratedMessageLite.registerDefaultInstance(NN_1.class, nN_1);
    }

    public static NN J(InputStream a2) throws IOException {
        return (NN_1)NN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void l(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.y_ = b2;
    }

    public static /* synthetic */ void f(NN a2) {
        super.C();
    }

    public boolean hasScale() {
        NN_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasZ() {
        NN_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static NN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasAngleY() {
        NN_1 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Parser<NN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ NN f() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        a.bitField0_ &= Uta.Z;
        a.angleZ_ = JPa.N;
    }

    public boolean hasX() {
        NN_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.f(b2);
    }

    public static qn J() {
        return (qn)DEFAULT_INSTANCE.createBuilder();
    }

    public static NN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getScaleZ() {
        NN_1 a2;
        return a2.scaleZ_;
    }

    public static NN J(byte[] a2) throws InvalidProtocolBufferException {
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(NN a2) {
        super.J();
    }

    private void f(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.angleX_ = b2;
    }

    public static NN J() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasScaleZ() {
        NN_1 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getY() {
        NN_1 a2;
        return a2.y_;
    }

    public static /* synthetic */ void f(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.J(b2);
    }

    public static NN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (NN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(float f2) {
        float b2 = f2;
        NN_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.x_ = b2;
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.z_ = JPa.N;
    }

    public static qn J(NN a2) {
        return (qn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(NN nN, float f2) {
        float b2 = f2;
        NN a2 = nN;
        super.M(b2);
    }

    public boolean hasScaleY() {
        NN_1 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

