/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  JSa
 *  XTa
 *  ZRa
 *  bM
 *  cQa
 *  eO
 *  kpa
 *  lqa
 *  pn
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
public final class pn_1
extends GeneratedMessageLite<pn, eO>
implements ua {
    private boolean antiAlias_;
    public static final int BLUR_FIELD_NUMBER = 4;
    private boolean fractionalMetrics_;
    private int bitField0_;
    public static final int ANTIALIAS_FIELD_NUMBER = 5;
    private Object font_;
    private int fontCase_ = uSa.E;
    private boolean blur_;
    private static final pn DEFAULT_INSTANCE;
    public static final int SIZE_FIELD_NUMBER = 3;
    private static volatile Parser<pn> PARSER;
    public static final int RESOURCE_FIELD_NUMBER = 2;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int FRACTIONALMETRICS_FIELD_NUMBER = 6;
    private int size_;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        Object d2 = methodToInvoke;
        pn_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new pn_1();
            }
            case 2: {
                return new eO(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = JPa.V;
                objectArray[vRa.d] = ZRa.O;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = uQa.p;
                objectArray[AQa.P] = JSa.m;
                objectArray[tTa.h] = AQa.v;
                objectArray[uua.p] = Fua.S;
                d2 = objectArray;
                Object b2 = cQa.N;
                return pn_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = pn_1.class;
                synchronized (pn_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<pn>(DEFAULT_INSTANCE);
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
    public ByteString getPathBytes() {
        pn_1 pn_12 = this;
        Object a2 = Mqa.y;
        if (pn_12.fontCase_ == vRa.d) {
            a2 = (String)pn_12.font_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static pn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pn f(InputStream a2) throws IOException {
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public bM getFontCase() {
        pn_1 a2;
        return bM.forNumber((int)a2.fontCase_);
    }

    public static pn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pn_1)pn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private pn_1() {
        pn_1 a2;
    }

    public static eO J(pn a2) {
        return (eO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void M() {
        pn_1 a2;
        if (a2.fontCase_ == vRa.d) {
            pn_1 pn_12 = a2;
            pn_12.fontCase_ = uSa.E;
            pn_12.font_ = null;
        }
    }

    public static /* synthetic */ void M(pn a2) {
        super.e();
    }

    private void e() {
        a.bitField0_ &= Jra.Fa;
        a.fractionalMetrics_ = uSa.E;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        pn_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.blur_ = b2;
    }

    @Override
    public boolean hasPath() {
        pn_1 a2;
        if (a2.fontCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(pn a2) {
        super.J();
    }

    private void J(ByteString byteString) {
        pn_1 a2;
        ByteString b2 = byteString;
        pn_1 pn_12 = a2 = this;
        pn_1.checkByteStringIsUtf8(b2);
        pn_12.font_ = b2.toStringUtf8();
        pn_12.fontCase_ = vRa.d;
    }

    public static /* synthetic */ void d(pn a2) {
        super.M();
    }

    public static /* synthetic */ void J(pn pn2, String string) {
        Object b2 = string;
        pn a2 = pn2;
        super.J((String)b2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        pn_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.antiAlias_ = b2;
    }

    public static pn J(byte[] a2) throws InvalidProtocolBufferException {
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(pn a2) {
        super.C();
    }

    public static /* synthetic */ void l(pn a2) {
        super.d();
    }

    @Override
    public boolean getAntiAlias() {
        pn_1 a2;
        return a2.antiAlias_;
    }

    public static /* synthetic */ void f(pn a2) {
        super.l();
    }

    public static /* synthetic */ void l(pn pn2, boolean bl) {
        boolean b2 = bl;
        pn a2 = pn2;
        super.J(b2);
    }

    public static pn J(CodedInputStream a2) throws IOException {
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static pn J(ByteString a2) throws InvalidProtocolBufferException {
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(pn pn2, int n2) {
        int b2 = n2;
        pn a2 = pn2;
        super.J(b2);
    }

    private void J(String string) {
        String b2 = string;
        pn_1 a2 = this;
        b2.getClass();
        pn_1 pn_12 = a2;
        pn_12.fontCase_ = vRa.d;
        pn_12.font_ = b2;
    }

    public static /* synthetic */ void J(pn pn2, int n2) {
        int b2 = n2;
        pn a2 = pn2;
        super.f(b2);
    }

    private void d() {
        a.bitField0_ &= rQa.p;
        a.size_ = uSa.E;
    }

    public static /* synthetic */ void J(pn a2) {
        super.f();
    }

    private void C() {
        pn_1 a2;
        pn_1 pn_12 = a2;
        pn_12.fontCase_ = uSa.E;
        pn_12.font_ = null;
    }

    private void f(int n2) {
        int b2 = n2;
        pn_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.size_ = b2;
    }

    private void l() {
        a.bitField0_ &= kpa.w;
        a.antiAlias_ = uSa.E;
    }

    @Override
    public boolean hasResource() {
        pn_1 a2;
        if (a2.fontCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ pn f() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        pn_1 a2;
        if (a2.fontCase_ == uqa.g) {
            pn_1 pn_12 = a2;
            pn_12.fontCase_ = uSa.E;
            pn_12.font_ = null;
        }
    }

    @Override
    public boolean hasSize() {
        pn_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static eO J() {
        return (eO)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(pn pn2, ByteString byteString) {
        Object b2 = byteString;
        pn a2 = pn2;
        super.J((ByteString)b2);
    }

    public static pn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasAntiAlias() {
        pn_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean getFractionalMetrics() {
        pn_1 a2;
        return a2.fractionalMetrics_;
    }

    public static pn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.blur_ = uSa.E;
    }

    public static pn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public boolean hasBlur() {
        pn_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public int getSize() {
        pn_1 a2;
        return a2.size_;
    }

    private void J(int n2) {
        pn_1 a2;
        int b2 = n2;
        pn_1 pn_12 = a2 = this;
        pn_12.fontCase_ = uqa.g;
        pn_12.font_ = b2;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        pn_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.fractionalMetrics_ = b2;
    }

    public static pn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public String getPath() {
        pn_1 pn_12 = this;
        Object a2 = Mqa.y;
        if (pn_12.fontCase_ == vRa.d) {
            a2 = (String)pn_12.font_;
        }
        return a2;
    }

    public static /* synthetic */ void f(pn pn2, boolean bl) {
        boolean b2 = bl;
        pn a2 = pn2;
        super.l(b2);
    }

    public static Parser<pn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static {
        pn_1 pn_12 = new pn_1();
        DEFAULT_INSTANCE = pn_12;
        GeneratedMessageLite.registerDefaultInstance(pn_1.class, pn_12);
    }

    @Override
    public boolean getBlur() {
        pn_1 a2;
        return a2.blur_;
    }

    public static pn J(InputStream a2) throws IOException {
        return (pn_1)pn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(pn pn2, boolean bl) {
        boolean b2 = bl;
        pn a2 = pn2;
        super.f(b2);
    }

    public static pn J() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public int getResource() {
        pn_1 a2;
        if (a2.fontCase_ == uqa.g) {
            return (Integer)a2.font_;
        }
        return uSa.E;
    }

    @Override
    public boolean hasFractionalMetrics() {
        pn_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static pn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (pn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

