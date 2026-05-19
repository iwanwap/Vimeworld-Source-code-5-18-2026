/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Ha
 *  JPa
 *  NQa
 *  XSa
 *  XTa
 *  Yo
 *  cm
 *  kpa
 *  lqa
 *  uQa
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
public final class cm_2
extends GeneratedMessageLite<cm, Yo>
implements Ha {
    public static final int OFFSETX_FIELD_NUMBER = 4;
    private ByteString options_ = ByteString.EMPTY;
    public static final int OFFSETY_FIELD_NUMBER = 5;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    public static final int SCALE_FIELD_NUMBER = 3;
    private float offsetZ_;
    private int id_;
    private float offsetX_;
    private static volatile Parser<cm> PARSER;
    public static final int ID_FIELD_NUMBER = 1;
    private float offsetY_;
    private float scale_;
    public static final int OFFSETZ_FIELD_NUMBER = 6;
    private int bitField0_;
    private static final cm DEFAULT_INSTANCE;

    public float getScale() {
        cm_2 a2;
        return a2.scale_;
    }

    public static cm J(CodedInputStream a2) throws IOException {
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getOffsetY() {
        cm_2 a2;
        return a2.offsetY_;
    }

    public static cm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ cm f() {
        return DEFAULT_INSTANCE;
    }

    public static cm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cm_2)cm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static cm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void e() {
        a.bitField0_ &= Jra.Fa;
        a.offsetY_ = JPa.N;
    }

    public static cm f(InputStream a2) throws IOException {
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getOffsetX() {
        cm_2 a2;
        return a2.offsetX_;
    }

    private void d() {
        a.bitField0_ &= ERa.Ka;
        a.scale_ = JPa.N;
    }

    public static Parser<cm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasOffsetZ() {
        cm_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(int n2) {
        int b2 = n2;
        cm_2 a2 = this;
        a2.id_ = b2;
    }

    public int getId() {
        cm_2 a2;
        return a2.id_;
    }

    public static /* synthetic */ void C(cm cm2, float f2) {
        float b2 = f2;
        cm a2 = cm2;
        super.C(b2);
    }

    public static cm J(ByteString a2) throws InvalidProtocolBufferException {
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        cm_2 cm_22 = new cm_2();
        DEFAULT_INSTANCE = cm_22;
        GeneratedMessageLite.registerDefaultInstance(cm_2.class, cm_22);
    }

    public static /* synthetic */ void e(cm a2) {
        super.f();
    }

    public ByteString getOptions() {
        cm_2 a2;
        return a2.options_;
    }

    public static /* synthetic */ void J(cm cm2, int n2) {
        int b2 = n2;
        cm a2 = cm2;
        super.J(b2);
    }

    public boolean hasOptions() {
        cm_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static cm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static cm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void C() {
        a.id_ = uSa.E;
    }

    private void C(float f2) {
        float b2 = f2;
        cm_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.offsetX_ = b2;
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.options_ = cm_2.J().getOptions();
    }

    public static /* synthetic */ void l(cm cm2, float f2) {
        float b2 = f2;
        cm a2 = cm2;
        super.J(b2);
    }

    private void f() {
        a.bitField0_ &= NQa.A;
        a.offsetZ_ = JPa.N;
    }

    private void l(float f2) {
        float b2 = f2;
        cm_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.offsetY_ = b2;
    }

    public static cm J(byte[] a2) throws InvalidProtocolBufferException {
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasOffsetX() {
        cm_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(cm cm2, ByteString byteString) {
        Object b2 = byteString;
        cm a2 = cm2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void d(cm a2) {
        super.e();
    }

    public static Yo J(cm a2) {
        return (Yo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void C(cm a2) {
        super.C();
    }

    private cm_2() {
        cm_2 a2;
    }

    public static Yo J() {
        return (Yo)DEFAULT_INSTANCE.createBuilder();
    }

    public static cm J() {
        return DEFAULT_INSTANCE;
    }

    public static cm J(InputStream a2) throws IOException {
        return (cm_2)cm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static cm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(cm a2) {
        super.l();
    }

    public static /* synthetic */ void f(cm a2) {
        super.J();
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.offsetX_ = JPa.N;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        cm_2 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.options_ = b2;
    }

    public static /* synthetic */ void f(cm cm2, float f2) {
        float b2 = f2;
        cm a2 = cm2;
        super.l(b2);
    }

    public float getOffsetZ() {
        cm_2 a2;
        return a2.offsetZ_;
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
        cm_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new cm_2();
            }
            case 2: {
                return new Yo(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = lqa.Ha;
                objectArray[yRa.d] = Ora.U;
                objectArray[AQa.P] = lQa.Ja;
                objectArray[tTa.h] = dqa.f;
                objectArray[uua.p] = XSa.i;
                d2 = objectArray;
                Object b2 = Mqa.l;
                return cm_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = cm_2.class;
                synchronized (cm_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<cm>(DEFAULT_INSTANCE);
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

    private void f(float f2) {
        float b2 = f2;
        cm_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.offsetZ_ = b2;
    }

    public static cm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (cm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(cm cm2, float f2) {
        float b2 = f2;
        cm a2 = cm2;
        super.f(b2);
    }

    public static /* synthetic */ void J(cm a2) {
        super.d();
    }

    private void J(float f2) {
        float b2 = f2;
        cm_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.scale_ = b2;
    }

    public boolean hasScale() {
        cm_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasOffsetY() {
        cm_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

