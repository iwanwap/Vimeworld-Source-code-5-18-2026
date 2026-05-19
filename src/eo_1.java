/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JPa
 *  Pc
 *  XSa
 *  eo
 *  lqa
 *  mO
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
public final class eo_1
extends GeneratedMessageLite<eo, mO>
implements Pc {
    public static final int HEIGHT_FIELD_NUMBER = 2;
    private static final eo DEFAULT_INSTANCE;
    private float height_;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static volatile Parser<eo> PARSER;
    private int color_;
    private int bitField0_;

    public static eo J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        eo_1 eo_12 = new eo_1();
        DEFAULT_INSTANCE = eo_12;
        GeneratedMessageLite.registerDefaultInstance(eo_1.class, eo_12);
    }

    public static eo f(InputStream a2) throws IOException {
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.height_ = JPa.N;
    }

    public boolean hasHeight() {
        eo_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static mO J() {
        return (mO)DEFAULT_INSTANCE.createBuilder();
    }

    public static eo f() {
        return DEFAULT_INSTANCE;
    }

    private void J(float f2) {
        float b2 = f2;
        eo_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.height_ = b2;
    }

    public static /* synthetic */ eo J() {
        return DEFAULT_INSTANCE;
    }

    public static eo f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private eo_1() {
        eo_1 a2;
    }

    public static eo J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static eo J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (eo_1)eo_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
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
        eo_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new eo_1();
            }
            case 2: {
                return new mO(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = lQa.Ka;
                objectArray[uqa.g] = fqa.i;
                d2 = objectArray;
                Object b2 = XSa.q;
                return eo_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = eo_1.class;
                synchronized (eo_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<eo>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(eo a2) {
        super.f();
    }

    public static /* synthetic */ void J(eo eo2, int n2) {
        int b2 = n2;
        eo a2 = eo2;
        super.J(b2);
    }

    public float getHeight() {
        eo_1 a2;
        return a2.height_;
    }

    public static mO J(eo a2) {
        return (mO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static eo J(byte[] a2) throws InvalidProtocolBufferException {
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        eo_1 a2 = this;
        a2.color_ = b2;
    }

    public static eo J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static eo J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static eo J(InputStream a2) throws IOException {
        return (eo_1)eo_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(eo a2) {
        super.J();
    }

    public static eo J(CodedInputStream a2) throws IOException {
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.color_ = uSa.E;
    }

    public static eo J(ByteString a2) throws InvalidProtocolBufferException {
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static eo J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (eo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public int getColor() {
        eo_1 a2;
        return a2.color_;
    }

    public static Parser<eo> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(eo eo2, float f2) {
        float b2 = f2;
        eo a2 = eo2;
        super.J(b2);
    }
}

