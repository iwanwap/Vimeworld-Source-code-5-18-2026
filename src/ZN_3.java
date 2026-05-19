/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JPa
 *  Ln
 *  Rc
 *  ZN
 *  lqa
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
public final class ZN_3
extends GeneratedMessageLite<ZN, Ln>
implements Rc {
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int COLOR_FIELD_NUMBER = 1;
    private int heightvalCase_ = uSa.E;
    private int bitField0_;
    private Object heightval_;
    private static final ZN DEFAULT_INSTANCE;
    private static volatile Parser<ZN> PARSER;
    private int color_;
    public static final int HEIGHTANIM_FIELD_NUMBER = 3;

    public static /* synthetic */ void J(ZN zN2, int n2) {
        int b2 = n2;
        ZN a2 = zN2;
        super.J(b2);
    }

    public static Parser<ZN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static ZN J(CodedInputStream a2) throws IOException {
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C() {
        ZN_3 a2;
        if (a2.heightvalCase_ == uqa.g) {
            ZN_3 zN_3 = a2;
            zN_3.heightvalCase_ = uSa.E;
            zN_3.heightval_ = null;
        }
    }

    public static /* synthetic */ ZN f() {
        return DEFAULT_INSTANCE;
    }

    public static ZN f(InputStream a2) throws IOException {
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        ZN_3 zN_3 = new ZN_3();
        DEFAULT_INSTANCE = zN_3;
        GeneratedMessageLite.registerDefaultInstance(ZN_3.class, zN_3);
    }

    public static ZN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ZN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ZN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ZN_3)ZN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l() {
        ZN_3 a2;
        if (a2.heightvalCase_ == yRa.d) {
            ZN_3 zN_3 = a2;
            zN_3.heightvalCase_ = uSa.E;
            zN_3.heightval_ = null;
        }
    }

    public static /* synthetic */ void C(ZN a2) {
        super.l();
    }

    public static /* synthetic */ void f(ZN zN2, float f2) {
        float b2 = f2;
        ZN a2 = zN2;
        super.J(b2);
    }

    public int getColor() {
        ZN_3 a2;
        return a2.color_;
    }

    private void f(float f2) {
        ZN_3 a2;
        float b2 = f2;
        ZN_3 zN_3 = a2 = this;
        zN_3.heightvalCase_ = uqa.g;
        zN_3.heightval_ = Float.valueOf(b2);
    }

    private void J(float f2) {
        ZN_3 a2;
        float b2 = f2;
        ZN_3 zN_3 = a2 = this;
        zN_3.heightvalCase_ = yRa.d;
        zN_3.heightval_ = Float.valueOf(b2);
    }

    public float getHeight() {
        ZN_3 a2;
        if (a2.heightvalCase_ == uqa.g) {
            return ((Float)a2.heightval_).floatValue();
        }
        return JPa.N;
    }

    public static ZN J(InputStream a2) throws IOException {
        return (ZN_3)ZN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(ZN a2) {
        super.J();
    }

    public boolean hasHeight() {
        ZN_3 a2;
        if (a2.heightvalCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ZN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.color_ = uSa.E;
    }

    public float getHeightAnim() {
        ZN_3 a2;
        if (a2.heightvalCase_ == yRa.d) {
            return ((Float)a2.heightval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void f(ZN a2) {
        super.f();
    }

    public static ZN J(byte[] a2) throws InvalidProtocolBufferException {
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasHeightAnim() {
        ZN_3 a2;
        if (a2.heightvalCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ZN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public boolean hasColor() {
        ZN_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public gN getHeightvalCase() {
        ZN_3 a2;
        return gN.forNumber(a2.heightvalCase_);
    }

    private void J() {
        ZN_3 a2;
        ZN_3 zN_3 = a2;
        zN_3.heightvalCase_ = uSa.E;
        zN_3.heightval_ = null;
    }

    public static Ln J() {
        return (Ln)DEFAULT_INSTANCE.createBuilder();
    }

    public static ZN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ZN J() {
        return DEFAULT_INSTANCE;
    }

    public static Ln J(ZN a2) {
        return (Ln)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(ZN zN2, float f2) {
        float b2 = f2;
        ZN a2 = zN2;
        super.f(b2);
    }

    public static ZN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        ZN_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.color_ = b2;
    }

    public static ZN J(ByteString a2) throws InvalidProtocolBufferException {
        return (ZN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(ZN a2) {
        super.C();
    }

    private ZN_3() {
        ZN_3 a2;
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
        ZN_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new ZN_3();
            }
            case 2: {
                return new Ln(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = STa.J;
                objectArray[vRa.d] = MTa.Ja;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = lQa.Ka;
                d2 = objectArray;
                Object b2 = Jpa.x;
                return ZN_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = ZN_3.class;
                synchronized (ZN_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<ZN>(DEFAULT_INSTANCE);
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
}

