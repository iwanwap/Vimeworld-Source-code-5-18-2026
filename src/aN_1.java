/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Ga
 *  JPa
 *  NQa
 *  Rn
 *  XSa
 *  XTa
 *  aN
 *  kpa
 *  lqa
 *  ura
 *  vRa
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
public final class aN_1
extends GeneratedMessageLite<aN, Rn>
implements Ga {
    private float offsetZ_;
    private float scale_;
    public static final int OFFSETY_FIELD_NUMBER = 4;
    private static volatile Parser<aN> PARSER;
    private float offsetX_;
    private float offsetY_;
    public static final int ANIMATIONID_FIELD_NUMBER = 6;
    public static final int OFFSETX_FIELD_NUMBER = 3;
    private int resource_;
    public static final int SCALE_FIELD_NUMBER = 2;
    private String animationId_ = Mqa.y;
    private static final aN DEFAULT_INSTANCE;
    public static final int OFFSETZ_FIELD_NUMBER = 5;
    private int bitField0_;
    public static final int RESOURCE_FIELD_NUMBER = 1;

    public static Rn J() {
        return (Rn)DEFAULT_INSTANCE.createBuilder();
    }

    public static aN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static aN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C(float f2) {
        float b2 = f2;
        aN_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.offsetX_ = b2;
    }

    public static aN f(InputStream a2) throws IOException {
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static aN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public int getResource() {
        aN_1 a2;
        return a2.resource_;
    }

    public boolean hasOffsetX() {
        aN_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static aN J(CodedInputStream a2) throws IOException {
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void e(aN a2) {
        super.J();
    }

    public static /* synthetic */ void C(aN aN2, float f2) {
        float b2 = f2;
        aN a2 = aN2;
        super.C(b2);
    }

    public static aN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(aN aN2, float f2) {
        float b2 = f2;
        aN a2 = aN2;
        super.J(b2);
    }

    public static /* synthetic */ void d(aN a2) {
        super.l();
    }

    public float getOffsetZ() {
        aN_1 a2;
        return a2.offsetZ_;
    }

    public static Rn J(aN a2) {
        return (Rn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(aN aN2, int n2) {
        int b2 = n2;
        aN a2 = aN2;
        super.J(b2);
    }

    public static aN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static aN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l(float f2) {
        float b2 = f2;
        aN_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.offsetZ_ = b2;
    }

    public static /* synthetic */ void f(aN aN2, float f2) {
        float b2 = f2;
        aN a2 = aN2;
        super.f(b2);
    }

    public boolean hasOffsetY() {
        aN_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getAnimationId() {
        aN_1 a2;
        return a2.animationId_;
    }

    public boolean hasAnimationId() {
        aN_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static aN J(byte[] a2) throws InvalidProtocolBufferException {
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ aN f() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<aN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasOffsetZ() {
        aN_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static aN J(ByteString a2) throws InvalidProtocolBufferException {
        return (aN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(aN aN2, ByteString byteString) {
        Object b2 = byteString;
        aN a2 = aN2;
        super.J((ByteString)b2);
    }

    public ByteString getAnimationIdBytes() {
        aN_1 a2;
        return ByteString.copyFromUtf8(a2.animationId_);
    }

    public static /* synthetic */ void C(aN a2) {
        super.e();
    }

    private void e() {
        a.resource_ = uSa.E;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        aN_1 a2 = this;
        aN_1.checkByteStringIsUtf8(b2);
        a2.animationId_ = b2.toStringUtf8();
        a2.bitField0_ |= ERa.C;
    }

    public static /* synthetic */ void l(aN a2) {
        super.C();
    }

    public static /* synthetic */ void J(aN aN2, String string) {
        Object b2 = string;
        aN a2 = aN2;
        super.J((String)b2);
    }

    private void J(String string) {
        String b2 = string;
        aN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= ERa.C;
        a2.animationId_ = b2;
    }

    public static /* synthetic */ void J(aN aN2, float f2) {
        float b2 = f2;
        aN a2 = aN2;
        super.l(b2);
    }

    private void d() {
        a.bitField0_ &= NQa.A;
        a.animationId_ = aN_1.J().getAnimationId();
    }

    public float getOffsetX() {
        aN_1 a2;
        return a2.offsetX_;
    }

    private aN_1() {
        aN_1 a2;
    }

    public static aN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (aN_1)aN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getScale() {
        aN_1 a2;
        return a2.scale_;
    }

    private void C() {
        a.bitField0_ &= Jra.Fa;
        a.offsetZ_ = JPa.N;
    }

    private void J(int n2) {
        int b2 = n2;
        aN_1 a2 = this;
        a2.resource_ = b2;
    }

    static {
        aN_1 aN_12 = new aN_1();
        DEFAULT_INSTANCE = aN_12;
        GeneratedMessageLite.registerDefaultInstance(aN_1.class, aN_12);
    }

    private void l() {
        a.bitField0_ &= kpa.w;
        a.offsetY_ = JPa.N;
    }

    public boolean hasScale() {
        aN_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(aN a2) {
        super.d();
    }

    private void f(float f2) {
        float b2 = f2;
        aN_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.scale_ = b2;
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.scale_ = JPa.N;
    }

    public static aN J() {
        return DEFAULT_INSTANCE;
    }

    private void J(float f2) {
        float b2 = f2;
        aN_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.offsetY_ = b2;
    }

    public static aN J(InputStream a2) throws IOException {
        return (aN_1)aN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(aN a2) {
        super.f();
    }

    public float getOffsetY() {
        aN_1 a2;
        return a2.offsetY_;
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
        aN_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new aN_1();
            }
            case 2: {
                return new Rn(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = kra.v;
                objectArray[uqa.g] = Ora.U;
                objectArray[yRa.d] = lQa.Ja;
                objectArray[AQa.P] = dqa.f;
                objectArray[tTa.h] = XSa.i;
                objectArray[uua.p] = Npa.b;
                d2 = objectArray;
                Object b2 = ura.E;
                return aN_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = aN_1.class;
                synchronized (aN_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<aN>(DEFAULT_INSTANCE);
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

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.offsetX_ = JPa.N;
    }
}

