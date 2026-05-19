/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JPa
 *  Mn
 *  YM
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
public final class YM_2
extends GeneratedMessageLite<YM, Mn>
implements Ja {
    private static volatile Parser<YM> PARSER;
    private float value_;
    private static final YM DEFAULT_INSTANCE;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int color_;
    public static final int COLOR_FIELD_NUMBER = 1;

    public static YM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
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
        YM_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new YM_2();
            }
            case 2: {
                return new Mn(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lQa.Ka;
                objectArray[vRa.d] = BQa.U;
                d2 = objectArray;
                Object b2 = vTa.c;
                return YM_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = YM_2.class;
                synchronized (YM_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<YM>(DEFAULT_INSTANCE);
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

    public static YM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.value_ = JPa.N;
    }

    public static YM J(ByteString a2) throws InvalidProtocolBufferException {
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        YM_2 a2 = this;
        a2.color_ = b2;
    }

    private void J() {
        a.color_ = uSa.E;
    }

    private void J(float f2) {
        float b2 = f2;
        YM_2 a2 = this;
        a2.value_ = b2;
    }

    public static Mn J(YM a2) {
        return (Mn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static YM f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(YM a2) {
        super.J();
    }

    public static YM J(CodedInputStream a2) throws IOException {
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(YM yM2, int n2) {
        int b2 = n2;
        YM a2 = yM2;
        super.J(b2);
    }

    public static /* synthetic */ void J(YM yM2, float f2) {
        float b2 = f2;
        YM a2 = yM2;
        super.J(b2);
    }

    public static YM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Mn J() {
        return (Mn)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ YM J() {
        return DEFAULT_INSTANCE;
    }

    private YM_2() {
        YM_2 a2;
    }

    public static YM f(InputStream a2) throws IOException {
        return (YM_2)YM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getColor() {
        YM_2 a2;
        return a2.color_;
    }

    public static /* synthetic */ void J(YM a2) {
        super.f();
    }

    public static YM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (YM_2)YM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static YM J(byte[] a2) throws InvalidProtocolBufferException {
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static YM J(InputStream a2) throws IOException {
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        YM_2 yM_2 = new YM_2();
        DEFAULT_INSTANCE = yM_2;
        GeneratedMessageLite.registerDefaultInstance(YM_2.class, yM_2);
    }

    public static YM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<YM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static YM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static YM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (YM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public float getValue() {
        YM_2 a2;
        return a2.value_;
    }
}

