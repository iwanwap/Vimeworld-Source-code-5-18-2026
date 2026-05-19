/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ba
 *  ERa
 *  JPa
 *  kPa
 *  lqa
 *  qO
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
public final class qO_3
extends GeneratedMessageLite<qO, VM>
implements Ba {
    private int barColor_;
    private int bitField0_;
    private static final qO DEFAULT_INSTANCE;
    public static final int PROGRESS_FIELD_NUMBER = 1;
    private static volatile Parser<qO> PARSER;
    public static final int BORDERCOLOR_FIELD_NUMBER = 3;
    private int borderColor_;
    private float progress_;
    public static final int BARCOLOR_FIELD_NUMBER = 2;

    private void f(int n2) {
        int b2 = n2;
        qO_3 a2 = this;
        a2.barColor_ = b2;
    }

    public static qO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(qO qO2, float f2) {
        float b2 = f2;
        qO a2 = qO2;
        super.J(b2);
    }

    public static qO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static qO f() {
        return DEFAULT_INSTANCE;
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.progress_ = JPa.N;
    }

    public static qO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasBorderColor() {
        qO_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getProgress() {
        qO_3 a2;
        return a2.progress_;
    }

    public int getBarColor() {
        qO_3 a2;
        return a2.barColor_;
    }

    public static qO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void l(qO a2) {
        super.f();
    }

    public static /* synthetic */ void f(qO a2) {
        super.J();
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.borderColor_ = uSa.E;
    }

    public static qO J(ByteString a2) throws InvalidProtocolBufferException {
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static qO J(byte[] a2) throws InvalidProtocolBufferException {
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static qO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        qO_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.borderColor_ = b2;
    }

    public static /* synthetic */ qO J() {
        return DEFAULT_INSTANCE;
    }

    public static qO f(InputStream a2) throws IOException {
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<qO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasProgress() {
        qO_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(qO qO2, int n2) {
        int b2 = n2;
        qO a2 = qO2;
        super.J(b2);
    }

    public static qO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (qO_3)qO_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(float f2) {
        float b2 = f2;
        qO_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.progress_ = b2;
    }

    private void J() {
        a.barColor_ = uSa.E;
    }

    public static qO J(InputStream a2) throws IOException {
        return (qO_3)qO_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public int getBorderColor() {
        qO_3 a2;
        return a2.borderColor_;
    }

    private qO_3() {
        qO_3 a2;
    }

    public static VM J() {
        return (VM)DEFAULT_INSTANCE.createBuilder();
    }

    public static qO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        qO_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new qO_3();
            }
            case 2: {
                return new VM(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = kPa.f;
                objectArray[uqa.g] = KQa.R;
                objectArray[yRa.d] = SPa.f;
                d2 = objectArray;
                Object b2 = WOa.v;
                return qO_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = qO_3.class;
                synchronized (qO_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<qO>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(qO a2) {
        super.l();
    }

    public static VM J(qO a2) {
        return (VM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        qO_3 qO_32 = new qO_3();
        DEFAULT_INSTANCE = qO_32;
        GeneratedMessageLite.registerDefaultInstance(qO_3.class, qO_32);
    }

    public static qO J(CodedInputStream a2) throws IOException {
        return (qO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(qO qO2, int n2) {
        int b2 = n2;
        qO a2 = qO2;
        super.f(b2);
    }
}

