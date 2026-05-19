/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Cra
 *  ERa
 *  JPa
 *  Km
 *  NQa
 *  NTa
 *  XTa
 *  aQa
 *  kpa
 *  lqa
 *  pa
 *  uN
 *  vRa
 *  xOa
 *  ysa
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
public final class Km_2
extends GeneratedMessageLite<Km, Wm>
implements pa {
    private int loadingColor_;
    public static final int GIFSTREAMING_FIELD_NUMBER = 7;
    public static final int RESOURCE_FIELD_NUMBER = 2;
    public static final int GIFSPEED_FIELD_NUMBER = 5;
    public static final int MEMCACHE_FIELD_NUMBER = 10;
    private int renderHint_;
    private float gifSpeed_;
    private Object image_;
    private int bitField0_;
    private int imageCase_ = uSa.E;
    public static final int RENDERHINT_FIELD_NUMBER = 6;
    public static final int IMAGEDATA_FIELD_NUMBER = 3;
    private boolean gifStreaming_;
    private static volatile Parser<Km> PARSER;
    private static final Km DEFAULT_INSTANCE;
    public static final int LOADINGCOLOR_FIELD_NUMBER = 4;
    public static final int HTTPCACHEDURATION_FIELD_NUMBER = 9;
    public static final int HTTPCACHE_FIELD_NUMBER = 8;
    private boolean memCache_;
    private boolean httpCache_;
    private int httpCacheDuration_;
    public static final int PATH_FIELD_NUMBER = 1;

    public boolean hasImageData() {
        Km_2 a2;
        if (a2.imageCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getGifSpeed() {
        Km_2 a2;
        return a2.gifSpeed_;
    }

    public boolean getMemCache() {
        Km_2 a2;
        return a2.memCache_;
    }

    public boolean hasGifStreaming() {
        Km_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void G() {
        a.bitField0_ &= kpa.w;
        a.renderHint_ = uSa.E;
    }

    private void f(ByteString byteString) {
        Km_2 a2;
        ByteString b2 = byteString;
        Km_2 km_2 = a2 = this;
        Km_2.checkByteStringIsUtf8(b2);
        km_2.image_ = b2.toStringUtf8();
        km_2.imageCase_ = vRa.d;
    }

    public static /* synthetic */ void G(Km a2) {
        super.f();
    }

    public boolean hasMemCache() {
        Km_2 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(Km km2, boolean bl) {
        boolean b2 = bl;
        Km a2 = km2;
        super.f(b2);
    }

    public static /* synthetic */ void J(Km km2, uN uN2) {
        Km b2 = uN2;
        Km a2 = km2;
        super.J((uN)b2);
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
        Km_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Km_2();
            }
            case 2: {
                return new Wm(null);
            }
            case 3: {
                Object[] objectArray = new Object[NTa.C];
                objectArray[uSa.E] = gQa.f;
                objectArray[vRa.d] = xOa.N;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = aQa.ca;
                objectArray[AQa.P] = JPa.C;
                objectArray[tTa.h] = hQa.O;
                objectArray[uua.p] = Cra.q;
                objectArray[XTa.W] = KSa.g;
                objectArray[Yqa.i] = uqa.z;
                objectArray[WOa.fa] = yta.j;
                d2 = objectArray;
                Object b2 = nOa.d;
                return Km_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Km_2.class;
                synchronized (Km_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Km>(DEFAULT_INSTANCE);
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

    public boolean getGifStreaming() {
        Km_2 a2;
        return a2.gifStreaming_;
    }

    public int getResource() {
        Km_2 a2;
        if (a2.imageCase_ == uqa.g) {
            return (Integer)a2.image_;
        }
        return uSa.E;
    }

    public ByteString getImageData() {
        Km_2 a2;
        if (a2.imageCase_ == yRa.d) {
            return (ByteString)a2.image_;
        }
        return ByteString.EMPTY;
    }

    private void C(int n2) {
        int b2 = n2;
        Km_2 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.httpCacheDuration_ = b2;
    }

    public static Km J(byte[] a2) throws InvalidProtocolBufferException {
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getPath() {
        Km_2 km_2 = this;
        Object a2 = Mqa.y;
        if (km_2.imageCase_ == vRa.d) {
            a2 = (String)km_2.image_;
        }
        return a2;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        Km_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.gifStreaming_ = b2;
    }

    public boolean hasGifSpeed() {
        Km_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public nn getImageCase() {
        Km_2 a2;
        return nn.forNumber(a2.imageCase_);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        Km_2 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.memCache_ = b2;
    }

    public static Wm J() {
        return (Wm)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void D(Km a2) {
        super.l();
    }

    private Km_2() {
        Km_2 a2;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Km_2 a2 = this;
        b2.getClass();
        Km_2 km_2 = a2;
        km_2.imageCase_ = yRa.d;
        km_2.image_ = b2;
    }

    public static Wm J(Km a2) {
        return (Wm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(Km km2, String string) {
        Object b2 = string;
        Km a2 = km2;
        super.J((String)b2);
    }

    public static /* synthetic */ void A(Km a2) {
        super.i();
    }

    private void D() {
        Km_2 a2;
        Km_2 km_2 = a2;
        km_2.imageCase_ = uSa.E;
        km_2.image_ = null;
    }

    private void J(String string) {
        String b2 = string;
        Km_2 a2 = this;
        b2.getClass();
        Km_2 km_2 = a2;
        km_2.imageCase_ = vRa.d;
        km_2.image_ = b2;
    }

    public static Km f(InputStream a2) throws IOException {
        return (Km_2)Km_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        Km_2 km_2 = new Km_2();
        DEFAULT_INSTANCE = km_2;
        GeneratedMessageLite.registerDefaultInstance(Km_2.class, km_2);
    }

    public static /* synthetic */ void i(Km a2) {
        super.J();
    }

    public boolean getHttpCache() {
        Km_2 a2;
        return a2.httpCache_;
    }

    public static Km J(ByteString a2) throws InvalidProtocolBufferException {
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getLoadingColor() {
        Km_2 a2;
        return a2.loadingColor_;
    }

    public static /* synthetic */ void M(Km a2) {
        super.d();
    }

    public static /* synthetic */ void e(Km a2) {
        super.G();
    }

    public static /* synthetic */ void d(Km a2) {
        super.e();
    }

    public static /* synthetic */ void C(Km km2, int n2) {
        int b2 = n2;
        Km a2 = km2;
        super.l(b2);
    }

    public int getHttpCacheDuration() {
        Km_2 a2;
        return a2.httpCacheDuration_;
    }

    public boolean hasPath() {
        Km_2 a2;
        if (a2.imageCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasResource() {
        Km_2 a2;
        if (a2.imageCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasHttpCache() {
        Km_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasRenderHint() {
        Km_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Km J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Km J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Km J(CodedInputStream a2) throws IOException {
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Km f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Km_2)Km_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(Km a2) {
        super.D();
    }

    public static Parser<Km> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(Km km2, float f2) {
        float b2 = f2;
        Km a2 = km2;
        super.J(b2);
    }

    private void J(uN uN2) {
        Km_2 b2 = uN2;
        Km_2 a2 = this;
        a2.renderHint_ = b2.getNumber();
        a2.bitField0_ |= AQa.P;
    }

    public int getRenderHintValue() {
        Km_2 a2;
        return a2.renderHint_;
    }

    private void l(int n2) {
        int b2 = n2;
        Km_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.renderHint_ = b2;
    }

    public static Km J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void f(Km km2, boolean bl) {
        boolean b2 = bl;
        Km a2 = km2;
        super.J(b2);
    }

    public static Km J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(float f2) {
        float b2 = f2;
        Km_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.gifSpeed_ = b2;
    }

    public ByteString getPathBytes() {
        Km_2 km_2 = this;
        Object a2 = Mqa.y;
        if (km_2.imageCase_ == vRa.d) {
            a2 = (String)km_2.image_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static Km J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void A() {
        a.bitField0_ &= fta.fa;
        a.httpCacheDuration_ = uSa.E;
    }

    public static /* synthetic */ void l(Km a2) {
        super.C();
    }

    private void f(int n2) {
        Km_2 a2;
        int b2 = n2;
        Km_2 km_2 = a2 = this;
        km_2.imageCase_ = uqa.g;
        km_2.image_ = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        Km_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.loadingColor_ = b2;
    }

    public boolean hasHttpCacheDuration() {
        Km_2 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(Km km2, int n2) {
        int b2 = n2;
        Km a2 = km2;
        super.C(b2);
    }

    public static /* synthetic */ void f(Km km2, int n2) {
        int b2 = n2;
        Km a2 = km2;
        super.f(b2);
    }

    private void i() {
        a.bitField0_ &= NQa.A;
        a.httpCache_ = uSa.E;
    }

    public static /* synthetic */ void f(Km km2, ByteString byteString) {
        Object b2 = byteString;
        Km a2 = km2;
        super.J((ByteString)b2);
    }

    private void M() {
        Km_2 a2;
        if (a2.imageCase_ == vRa.d) {
            Km_2 km_2 = a2;
            km_2.imageCase_ = uSa.E;
            km_2.image_ = null;
        }
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        Km_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.httpCache_ = b2;
    }

    public static /* synthetic */ void f(Km a2) {
        super.M();
    }

    public static /* synthetic */ void J(Km km2, int n2) {
        int b2 = n2;
        Km a2 = km2;
        super.J(b2);
    }

    private void e() {
        a.bitField0_ &= Jra.Fa;
        a.gifStreaming_ = uSa.E;
    }

    public static Km f() {
        return DEFAULT_INSTANCE;
    }

    private void d() {
        a.bitField0_ &= VPa.A;
        a.memCache_ = uSa.E;
    }

    public static Km J(InputStream a2) throws IOException {
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Km a2) {
        super.A();
    }

    private void C() {
        a.bitField0_ &= ERa.Ka;
        a.gifSpeed_ = JPa.N;
    }

    public uN getRenderHint() {
        Km_2 km_2 = this;
        Km_2 a2 = uN.forNumber((int)km_2.renderHint_);
        if (a2 == null) {
            return uN.UNRECOGNIZED;
        }
        return a2;
    }

    public static /* synthetic */ void J(Km km2, ByteString byteString) {
        Object b2 = byteString;
        Km a2 = km2;
        super.f((ByteString)b2);
    }

    public static Km J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Km_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.loadingColor_ = uSa.E;
    }

    public boolean hasLoadingColor() {
        Km_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(Km km2, boolean bl) {
        boolean b2 = bl;
        Km a2 = km2;
        super.l(b2);
    }

    private void f() {
        Km_2 a2;
        if (a2.imageCase_ == yRa.d) {
            Km_2 km_2 = a2;
            km_2.imageCase_ = uSa.E;
            km_2.image_ = null;
        }
    }

    public static /* synthetic */ Km J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        Km_2 a2;
        if (a2.imageCase_ == uqa.g) {
            Km_2 km_2 = a2;
            km_2.imageCase_ = uSa.E;
            km_2.image_ = null;
        }
    }
}

