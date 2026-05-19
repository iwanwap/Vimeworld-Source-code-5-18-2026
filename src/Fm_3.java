/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Fm
 *  JPa
 *  NQa
 *  TPa
 *  XTa
 *  kpa
 *  lPa
 *  lqa
 *  pua
 *  vRa
 *  vpa
 *  zn
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
public final class Fm_3
extends GeneratedMessageLite<Fm, zn>
implements Ka {
    private int gradientMemoizedSerializedSize = pua.o;
    private float height_;
    private int radius_;
    public static final int WIDTHEXPR_FIELD_NUMBER = 4;
    public static final int GRADIENT_FIELD_NUMBER = 6;
    public static final int HEIGHTEXPR_FIELD_NUMBER = 5;
    private String widthExpr_ = Mqa.y;
    private int bitField0_;
    private static final Fm DEFAULT_INSTANCE;
    public static final int RADIUS_FIELD_NUMBER = 3;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private float width_;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private Internal.IntList gradient_;
    private static volatile Parser<Fm> PARSER;
    private String heightExpr_ = Mqa.y;

    private void f(int n2) {
        Fm_3 a2;
        int b2 = n2;
        Fm_3 fm_3 = a2 = this;
        fm_3.M();
        fm_3.gradient_.addInt(b2);
    }

    private void M() {
        Fm_3 fm_3 = this;
        Internal.IntList a2 = fm_3.gradient_;
        if (!a2.isModifiable()) {
            fm_3.gradient_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public float getHeight() {
        Fm_3 a2;
        return a2.height_;
    }

    public static /* synthetic */ void f(Fm fm2, float f2) {
        float b2 = f2;
        Fm a2 = fm2;
        super.J(b2);
    }

    public static /* synthetic */ void f(Fm fm2, ByteString byteString) {
        Object b2 = byteString;
        Fm a2 = fm2;
        super.f((ByteString)b2);
    }

    @Override
    public ByteString getHeightExprBytes() {
        Fm_3 a2;
        return ByteString.copyFromUtf8(a2.heightExpr_);
    }

    @Override
    public String getHeightExpr() {
        Fm_3 a2;
        return a2.heightExpr_;
    }

    public static Fm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(float f2) {
        float b2 = f2;
        Fm_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.height_ = b2;
    }

    public static /* synthetic */ void e(Fm a2) {
        super.l();
    }

    private void e() {
        a.bitField0_ &= rQa.p;
        a.width_ = JPa.N;
    }

    @Override
    public int getGradientCount() {
        Fm_3 a2;
        return a2.gradient_.size();
    }

    public static Fm f(InputStream a2) throws IOException {
        return (Fm_3)Fm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static zn J() {
        return (zn)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(Fm fm2, ByteString byteString) {
        Object b2 = byteString;
        Fm a2 = fm2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void d(Fm a2) {
        super.e();
    }

    @Override
    public boolean hasHeightExpr() {
        Fm_3 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(String string) {
        String b2 = string;
        Fm_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= AQa.P;
        a2.widthExpr_ = b2;
    }

    public static /* synthetic */ void C(Fm a2) {
        super.J();
    }

    public static Fm f() {
        return DEFAULT_INSTANCE;
    }

    private void d() {
        a.bitField0_ &= ERa.Ka;
        a.height_ = JPa.N;
    }

    private void J(Iterable<? extends Integer> iterable) {
        Fm_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        Fm_3 fm_3 = a2 = this;
        fm_3.M();
        AbstractMessageLite.addAll(b2, fm_3.gradient_);
    }

    public static /* synthetic */ void J(Fm fm2, float f2) {
        float b2 = f2;
        Fm a2 = fm2;
        super.f(b2);
    }

    private void C() {
        a.bitField0_ &= Jra.Fa;
        a.heightExpr_ = Fm_3.f().getHeightExpr();
    }

    public static Fm J(CodedInputStream a2) throws IOException {
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private Fm_3() {
        Fm_3 a2;
        a2.gradient_ = Fm_3.emptyIntList();
    }

    @Override
    public List<Integer> getGradientList() {
        Fm_3 a2;
        return a2.gradient_;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        Fm_3 a2;
        int c2 = n3;
        Fm_3 fm_3 = a2 = this;
        fm_3.M();
        fm_3.gradient_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void l(Fm a2) {
        super.C();
    }

    private void l() {
        a.bitField0_ &= NQa.A;
        a.radius_ = uSa.E;
    }

    @Override
    public int getGradient(int n2) {
        int b2 = n2;
        Fm_3 a2 = this;
        return a2.gradient_.getInt(b2);
    }

    @Override
    public boolean hasRadius() {
        Fm_3 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Fm J(byte[] a2) throws InvalidProtocolBufferException {
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Fm a2) {
        super.d();
    }

    public static Fm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Fm_3 fm_3 = new Fm_3();
        DEFAULT_INSTANCE = fm_3;
        GeneratedMessageLite.registerDefaultInstance(Fm_3.class, fm_3);
    }

    @Override
    public String getWidthExpr() {
        Fm_3 a2;
        return a2.widthExpr_;
    }

    public static Fm J(InputStream a2) throws IOException {
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<Fm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ Fm J() {
        return DEFAULT_INSTANCE;
    }

    private void J(float f2) {
        float b2 = f2;
        Fm_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.width_ = b2;
    }

    @Override
    public boolean hasWidth() {
        Fm_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(Fm fm2, int n2) {
        int b2 = n2;
        Fm a2 = fm2;
        super.f(b2);
    }

    private void J(int n2) {
        int b2 = n2;
        Fm_3 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.radius_ = b2;
    }

    public static /* synthetic */ void J(Fm a2) {
        super.f();
    }

    public static Fm J(ByteString a2) throws InvalidProtocolBufferException {
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        Fm_3 a2 = this;
        Fm_3.checkByteStringIsUtf8(b2);
        a2.widthExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= AQa.P;
    }

    public static /* synthetic */ void f(Fm fm2, String string) {
        Object b2 = string;
        Fm a2 = fm2;
        super.f((String)b2);
    }

    public static /* synthetic */ void J(Fm fm2, int n2) {
        int b2 = n2;
        Fm a2 = fm2;
        super.J(b2);
    }

    @Override
    public boolean hasHeight() {
        Fm_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static zn J(Fm a2) {
        return (zn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(String string) {
        String b2 = string;
        Fm_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= Yqa.i;
        a2.heightExpr_ = b2;
    }

    @Override
    public int getRadius() {
        Fm_3 a2;
        return a2.radius_;
    }

    public static Fm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public ByteString getWidthExprBytes() {
        Fm_3 a2;
        return ByteString.copyFromUtf8(a2.widthExpr_);
    }

    public static Fm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Fm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Fm_3)Fm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
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
        Fm_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Fm_3();
            }
            case 2: {
                return new zn(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = LPa.a;
                objectArray[uqa.g] = fqa.i;
                objectArray[yRa.d] = lPa.T;
                objectArray[AQa.P] = BPa.B;
                objectArray[tTa.h] = vpa.t;
                objectArray[uua.p] = TPa.A;
                d2 = objectArray;
                Object b2 = cPa.S;
                return Fm_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Fm_3.class;
                synchronized (Fm_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Fm>(DEFAULT_INSTANCE);
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
        Fm_3 a2;
        return a2.width_;
    }

    public static /* synthetic */ void J(Fm fm2, String string) {
        Object b2 = string;
        Fm a2 = fm2;
        super.J((String)b2);
    }

    public static Fm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void f() {
        a.bitField0_ &= kpa.w;
        a.widthExpr_ = Fm_3.f().getWidthExpr();
    }

    public static /* synthetic */ void J(Fm fm2, Iterable iterable) {
        Object b2 = iterable;
        Fm a2 = fm2;
        super.J((Iterable<? extends Integer>)b2);
    }

    @Override
    public boolean hasWidthExpr() {
        Fm_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Fm_3 a2 = this;
        Fm_3.checkByteStringIsUtf8(b2);
        a2.heightExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= Yqa.i;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Fm fm2, int n2, int n3) {
        void b2;
        int c2 = n3;
        Fm a2 = fm2;
        super.J((int)b2, c2);
    }

    private void J() {
        a.gradient_ = Fm_3.emptyIntList();
    }

    public static Fm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Fm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

