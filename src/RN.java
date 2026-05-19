/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  KJ
 *  Ln
 *  NQa
 *  Om
 *  PM
 *  Qj
 *  WN
 *  XTa
 *  ZN
 *  ZRa
 *  gM
 *  kpa
 *  kta
 *  lqa
 *  mN
 *  pqa
 *  vRa
 *  ysa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class RN
extends GeneratedMessageLite<RN, Om>
implements sa {
    private KJ eWorldGroup_;
    private String editEasingExpr_ = Mqa.y;
    public static final int ELINE_FIELD_NUMBER = 5;
    private int bitField0_;
    public static final int ESPHERE_FIELD_NUMBER = 6;
    private PM eSphere_;
    private int editDuration_;
    private Xn eLine_;
    public static final int EBEAM_FIELD_NUMBER = 4;
    private static final RN DEFAULT_INSTANCE;
    private int editEasing_;
    private static volatile Parser<RN> PARSER;
    public static final int EWORLDGROUP_FIELD_NUMBER = 3;
    public static final int EDITEASINGEXPR_FIELD_NUMBER = 7;
    public static final int EDITDURATION_FIELD_NUMBER = 2;
    private ZN eBeam_;
    public static final int EDITEASING_FIELD_NUMBER = 1;

    public static /* synthetic */ RN f() {
        return DEFAULT_INSTANCE;
    }

    private void M() {
        a.eBeam_ = null;
        a.bitField0_ &= NQa.A;
    }

    public static /* synthetic */ void M(RN a2) {
        a2.e();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        RN a2 = this;
        RN.checkByteStringIsUtf8(b2);
        a2.editEasingExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= uqa.g;
    }

    public static /* synthetic */ void e(RN a2) {
        a2.d();
    }

    public static RN J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void e() {
        a.eLine_ = null;
        a.bitField0_ &= fta.fa;
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
        RN c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new RN();
            }
            case 2: {
                return new Om(null);
            }
            case 3: {
                Object[] objectArray = new Object[Yqa.i];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = lQa.c;
                objectArray[uqa.g] = rpa.u;
                objectArray[yRa.d] = ZRa.t;
                objectArray[AQa.P] = vsa.T;
                objectArray[tTa.h] = Fsa.L;
                objectArray[uua.p] = uSa.Da;
                objectArray[XTa.W] = pqa.ca;
                d2 = objectArray;
                Object b2 = kta.M;
                return RN.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = RN.class;
                synchronized (RN.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<RN>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(RN rN, PM pM) {
        RN b2 = pM;
        RN a2 = rN;
        a2.J((PM)b2);
    }

    @Override
    public KJ getEWorldGroup() {
        RN a2;
        if (a2.eWorldGroup_ == null) {
            return KJ.J();
        }
        return a2.eWorldGroup_;
    }

    private void d() {
        a.eSphere_ = null;
        a.bitField0_ &= VPa.A;
    }

    @Override
    public ZN getEBeam() {
        RN a2;
        if (a2.eBeam_ == null) {
            return ZN.J();
        }
        return a2.eBeam_;
    }

    public static RN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        RN rN;
        DEFAULT_INSTANCE = rN = new RN();
        GeneratedMessageLite.registerDefaultInstance(RN.class, rN);
    }

    public static RN f(InputStream a2) throws IOException {
        return RN.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getEditDuration() {
        RN a2;
        return a2.editDuration_;
    }

    @Override
    public boolean hasESphere() {
        RN a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(PM pM) {
        RN rN;
        RN b2 = pM;
        RN a2 = this;
        b2.getClass();
        if (a2.eSphere_ != null && a2.eSphere_ != PM.f()) {
            a2.eSphere_ = (PM)((gM)PM.J((PM)a2.eSphere_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            rN = a2;
        } else {
            rN = a2;
            a2.eSphere_ = b2;
        }
        rN.bitField0_ |= ysa.s;
    }

    public static RN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static RN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public boolean hasEditDuration() {
        RN a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.editEasing_ = uSa.E;
    }

    public static /* synthetic */ void J(RN rN, PM pM) {
        RN b2 = pM;
        RN a2 = rN;
        a2.f((PM)b2);
    }

    private void f(int n2) {
        int b2 = n2;
        RN a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.editDuration_ = b2;
    }

    public static RN J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(RN rN, WN wN2) {
        RN b2 = wN2;
        RN a2 = rN;
        a2.J((WN)b2);
    }

    @Override
    public boolean hasEWorldGroup() {
        RN a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static RN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getEditEasingValue() {
        RN a2;
        return a2.editEasing_;
    }

    public static /* synthetic */ void J(RN rN, ByteString byteString) {
        ByteString b2 = byteString;
        RN a2 = rN;
        a2.J(b2);
    }

    private void f(ZN zN2) {
        RN rN;
        RN b2 = zN2;
        RN a2 = this;
        b2.getClass();
        if (a2.eBeam_ != null && a2.eBeam_ != ZN.J()) {
            a2.eBeam_ = (ZN)((Ln)ZN.J((ZN)a2.eBeam_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            rN = a2;
        } else {
            rN = a2;
            a2.eBeam_ = b2;
        }
        rN.bitField0_ |= ERa.C;
    }

    @Override
    public String getEditEasingExpr() {
        RN a2;
        return a2.editEasingExpr_;
    }

    private void J(PM pM) {
        RN b2 = pM;
        RN a2 = this;
        b2.getClass();
        a2.eSphere_ = b2;
        a2.bitField0_ |= ysa.s;
    }

    public static /* synthetic */ void f(RN rN, ZN zN2) {
        RN b2 = zN2;
        RN a2 = rN;
        a2.J((ZN)b2);
    }

    public static /* synthetic */ void f(RN rN, KJ kJ2) {
        RN b2 = kJ2;
        RN a2 = rN;
        a2.J((KJ)b2);
    }

    @Override
    public Xn getELine() {
        RN a2;
        if (a2.eLine_ == null) {
            return Xn.f();
        }
        return a2.eLine_;
    }

    private void f(KJ kJ2) {
        RN b2 = kJ2;
        RN a2 = this;
        b2.getClass();
        a2.eWorldGroup_ = b2;
        a2.bitField0_ |= Yqa.i;
    }

    private void f(Xn xn) {
        GeneratedMessageLite b2 = xn;
        RN a2 = this;
        b2.getClass();
        a2.eLine_ = b2;
        a2.bitField0_ |= fPa.i;
    }

    public static /* synthetic */ void d(RN a2) {
        a2.M();
    }

    @Override
    public PM getESphere() {
        RN a2;
        if (a2.eSphere_ == null) {
            return PM.f();
        }
        return a2.eSphere_;
    }

    public static Parser<RN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private RN() {
        RN a2;
    }

    public static RN J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static RN J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public WN getEditEasing() {
        RN rN = this;
        RN a2 = WN.forNumber((int)rN.editEasing_);
        if (a2 == null) {
            return WN.UNRECOGNIZED;
        }
        return a2;
    }

    private void l() {
        a.bitField0_ &= ERa.Ka;
        a.editEasingExpr_ = RN.J().getEditEasingExpr();
    }

    public static RN J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasEBeam() {
        RN a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(WN wN2) {
        RN b2 = wN2;
        RN a2 = this;
        a2.editEasing_ = b2.getNumber();
        a2.bitField0_ |= vRa.d;
    }

    public static RN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return RN.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(KJ kJ2) {
        RN rN;
        RN b2 = kJ2;
        RN a2 = this;
        b2.getClass();
        if (a2.eWorldGroup_ != null && a2.eWorldGroup_ != KJ.J()) {
            a2.eWorldGroup_ = (KJ)((Qj)KJ.J((KJ)a2.eWorldGroup_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            rN = a2;
        } else {
            rN = a2;
            a2.eWorldGroup_ = b2;
        }
        rN.bitField0_ |= Yqa.i;
    }

    @Override
    public boolean hasELine() {
        RN a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(RN rN, int n2) {
        int b2 = n2;
        RN a2 = rN;
        a2.J(b2);
    }

    public static RN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(RN rN, Xn xn) {
        GeneratedMessageLite b2 = xn;
        RN a2 = rN;
        a2.f((Xn)b2);
    }

    public static /* synthetic */ void J(RN rN, Xn xn) {
        GeneratedMessageLite b2 = xn;
        RN a2 = rN;
        a2.J((Xn)b2);
    }

    public static Om J() {
        return (Om)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(ZN zN2) {
        RN b2 = zN2;
        RN a2 = this;
        b2.getClass();
        a2.eBeam_ = b2;
        a2.bitField0_ |= ERa.C;
    }

    private void J(String string) {
        String b2 = string;
        RN a2 = this;
        b2.getClass();
        a2.bitField0_ |= uqa.g;
        a2.editEasingExpr_ = b2;
    }

    public static /* synthetic */ void J(RN rN, KJ kJ2) {
        RN b2 = kJ2;
        RN a2 = rN;
        a2.f((KJ)b2);
    }

    @Override
    public boolean hasEditEasingExpr() {
        RN a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(RN a2) {
        a2.l();
    }

    private void J(Xn xn) {
        RN rN;
        GeneratedMessageLite b2 = xn;
        RN a2 = this;
        b2.getClass();
        if (a2.eLine_ != null && a2.eLine_ != Xn.f()) {
            a2.eLine_ = (Xn)((mN)Xn.J(a2.eLine_).mergeFrom(b2)).buildPartial();
            rN = a2;
        } else {
            rN = a2;
            a2.eLine_ = b2;
        }
        rN.bitField0_ |= fPa.i;
    }

    private void J(int n2) {
        int b2 = n2;
        RN a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.editEasing_ = b2;
    }

    public static /* synthetic */ void J(RN rN, int n2) {
        int b2 = n2;
        RN a2 = rN;
        a2.f(b2);
    }

    public static /* synthetic */ void l(RN a2) {
        a2.C();
    }

    public static /* synthetic */ void J(RN rN, ZN zN2) {
        RN b2 = zN2;
        RN a2 = rN;
        a2.f((ZN)b2);
    }

    private void f() {
        a.eWorldGroup_ = null;
        a.bitField0_ &= Jra.Fa;
    }

    @Override
    public ByteString getEditEasingExprBytes() {
        RN a2;
        return ByteString.copyFromUtf8(a2.editEasingExpr_);
    }

    public static /* synthetic */ void J(RN rN, String string) {
        String b2 = string;
        RN a2 = rN;
        a2.J(b2);
    }

    public static /* synthetic */ void f(RN a2) {
        a2.J();
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.editDuration_ = uSa.E;
    }

    public static Om J(RN a2) {
        return (Om)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static RN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(RN a2) {
        a2.f();
    }

    @Override
    public boolean hasEditEasing() {
        RN a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

