/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  RQa
 *  Yn
 *  kPa
 *  kpa
 *  lqa
 *  vRa
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
public final class On
extends GeneratedMessageLite<On, Yn>
implements Da {
    private float progress_;
    private int barColor_;
    public static final int BARCOLOR_FIELD_NUMBER = 2;
    private int bitField0_;
    private static volatile Parser<On> PARSER;
    public static final int BORDERCOLOR_FIELD_NUMBER = 3;
    private static final On DEFAULT_INSTANCE;
    private int borderColor_;
    public static final int PROGRESS_FIELD_NUMBER = 1;

    public static On J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(On on, float f2) {
        float b2 = f2;
        On a2 = on;
        a2.J(b2);
    }

    public static Parser<On> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static On J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Yn J(On a2) {
        return (Yn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public boolean hasBorderColor() {
        On a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(int n2) {
        int b2 = n2;
        On a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.borderColor_ = b2;
    }

    private void l() {
        a.bitField0_ &= ERa.Ka;
        a.barColor_ = uSa.E;
    }

    static {
        On on;
        DEFAULT_INSTANCE = on = new On();
        GeneratedMessageLite.registerDefaultInstance(On.class, on);
    }

    public static /* synthetic */ void l(On a2) {
        a2.J();
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.progress_ = JPa.N;
    }

    public static On f() {
        return DEFAULT_INSTANCE;
    }

    public static On J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getBarColor() {
        On a2;
        return a2.barColor_;
    }

    public static /* synthetic */ void f(On on, int n2) {
        int b2 = n2;
        On a2 = on;
        a2.J(b2);
    }

    public static /* synthetic */ void f(On a2) {
        a2.l();
    }

    public static On J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasProgress() {
        On a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private On() {
        On a2;
    }

    @Override
    public boolean hasBarColor() {
        On a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Yn J() {
        return (Yn)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ On J() {
        return DEFAULT_INSTANCE;
    }

    public static On J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static On J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static On J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        On a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.barColor_ = b2;
    }

    private void J(float f2) {
        float b2 = f2;
        On a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.progress_ = b2;
    }

    @Override
    public int getBorderColor() {
        On a2;
        return a2.borderColor_;
    }

    public static On J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static On f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.borderColor_ = uSa.E;
    }

    public static On f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static On J(InputStream a2) throws IOException {
        return On.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
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
        On c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new On();
            }
            case 2: {
                return new Yn(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = kPa.f;
                objectArray[uqa.g] = KQa.R;
                objectArray[yRa.d] = SPa.f;
                d2 = objectArray;
                Object b2 = RQa.V;
                return On.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = On.class;
                synchronized (On.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<On>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(On on, int n2) {
        int b2 = n2;
        On a2 = on;
        a2.f(b2);
    }

    public static On J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return On.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public float getProgress() {
        On a2;
        return a2.progress_;
    }

    public static /* synthetic */ void J(On a2) {
        a2.f();
    }
}

