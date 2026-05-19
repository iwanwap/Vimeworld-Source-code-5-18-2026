/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  IN
 *  WM
 *  hra
 *  kpa
 *  lqa
 *  vRa
 *  vpa
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
public final class WM_2
extends GeneratedMessageLite<WM, IN>
implements Z {
    private int width_;
    public static final int COLOR_FIELD_NUMBER = 3;
    private boolean center_;
    private static volatile Parser<WM> PARSER;
    public static final int CENTER_FIELD_NUMBER = 2;
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private static final WM DEFAULT_INSTANCE;
    private String name_ = Mqa.y;
    private int color_;

    static {
        WM_2 wM_2 = new WM_2();
        DEFAULT_INSTANCE = wM_2;
        GeneratedMessageLite.registerDefaultInstance(WM_2.class, wM_2);
    }

    public static WM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public ByteString getNameBytes() {
        WM_2 a2;
        return ByteString.copyFromUtf8(a2.name_);
    }

    public static WM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static WM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static IN J() {
        return (IN)DEFAULT_INSTANCE.createBuilder();
    }

    public static WM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C() {
        a.bitField0_ &= ERa.Ka;
        a.color_ = uSa.E;
    }

    @Override
    public boolean hasWidth() {
        WM_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int getColor() {
        WM_2 a2;
        return a2.color_;
    }

    @Override
    public boolean getCenter() {
        WM_2 a2;
        return a2.center_;
    }

    public static /* synthetic */ void C(WM a2) {
        super.f();
    }

    public static WM J(byte[] a2) throws InvalidProtocolBufferException {
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasColor() {
        WM_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(WM a2) {
        super.C();
    }

    public static WM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(WM a2) {
        super.l();
    }

    public static WM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (WM_2)WM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
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
        WM_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new WM_2();
            }
            case 2: {
                return new IN(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = kpa.K;
                objectArray[uqa.g] = hra.s;
                objectArray[yRa.d] = lQa.Ka;
                objectArray[AQa.P] = LPa.a;
                d2 = objectArray;
                Object b2 = vpa.I;
                return WM_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = WM_2.class;
                synchronized (WM_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<WM>(DEFAULT_INSTANCE);
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

    private void l() {
        a.name_ = WM_2.f().getName();
    }

    public static /* synthetic */ void J(WM wM, ByteString byteString) {
        Object b2 = byteString;
        WM a2 = wM;
        super.J((ByteString)b2);
    }

    private void f(int n2) {
        int b2 = n2;
        WM_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.color_ = b2;
    }

    public static IN J(WM a2) {
        return (IN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.center_ = uSa.E;
    }

    public static Parser<WM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override
    public boolean hasCenter() {
        WM_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(WM wM, int n2) {
        int b2 = n2;
        WM a2 = wM;
        super.J(b2);
    }

    private void J(String string) {
        String b2 = string;
        WM_2 a2 = this;
        b2.getClass();
        a2.name_ = b2;
    }

    @Override
    public int getWidth() {
        WM_2 a2;
        return a2.width_;
    }

    public static /* synthetic */ void J(WM wM, int n2) {
        int b2 = n2;
        WM a2 = wM;
        super.f(b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        WM_2 a2 = this;
        Object object = b2;
        WM_2.checkByteStringIsUtf8((ByteString)object);
        a2.name_ = ((ByteString)object).toStringUtf8();
    }

    public static /* synthetic */ void J(WM wM, boolean bl) {
        boolean b2 = bl;
        WM a2 = wM;
        super.J(b2);
    }

    public static WM f(InputStream a2) throws IOException {
        return (WM_2)WM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static WM f() {
        return DEFAULT_INSTANCE;
    }

    public static WM J(InputStream a2) throws IOException {
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static WM J(ByteString a2) throws InvalidProtocolBufferException {
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static WM J(CodedInputStream a2) throws IOException {
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static WM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (WM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public String getName() {
        WM_2 a2;
        return a2.name_;
    }

    private WM_2() {
        WM_2 a2;
    }

    public static /* synthetic */ void J(WM a2) {
        super.J();
    }

    public static /* synthetic */ WM J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.width_ = uSa.E;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        WM_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.center_ = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        WM_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.width_ = b2;
    }

    public static /* synthetic */ void J(WM wM, String string) {
        Object b2 = string;
        WM a2 = wM;
        super.J((String)b2);
    }
}

