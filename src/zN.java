/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Sm
 *  VQa
 *  aPa
 *  asa
 *  lqa
 *  nc
 *  pQa
 *  vRa
 *  vpa
 *  zsa
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
public final class zN
extends GeneratedMessageLite<zN, QN>
implements nc {
    public static final int TEXTCOLOR_FIELD_NUMBER = 4;
    private int textColorValCase_;
    private static final zN DEFAULT_INSTANCE;
    private int bitField0_;
    public static final int HOVERCOLORANIM_FIELD_NUMBER = 3;
    public static final int TEXTCOLORANIM_FIELD_NUMBER = 5;
    private Object hoverColorVal_;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Object textColorVal_;
    public static final int HOVERCOLOR_FIELD_NUMBER = 2;
    private int hoverColorValCase_ = uSa.E;
    private static volatile Parser<zN> PARSER;
    private String text_;

    public static zN f() {
        return DEFAULT_INSTANCE;
    }

    public static QN J() {
        return (QN)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(zN zN2, String string) {
        String b2 = string;
        zN a2 = zN2;
        a2.J(b2);
    }

    public boolean hasTextColor() {
        zN a2;
        if (a2.textColorValCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(String string) {
        String b2 = string;
        zN a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.text_ = b2;
    }

    private void C(int n2) {
        zN a2;
        int b2 = n2;
        zN zN2 = a2 = this;
        zN2.hoverColorValCase_ = uqa.g;
        zN2.hoverColorVal_ = b2;
    }

    public String getText() {
        zN a2;
        return a2.text_;
    }

    public static /* synthetic */ void M(zN a2) {
        a2.C();
    }

    public static zN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasTextColorAnim() {
        zN a2;
        if (a2.textColorValCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasHoverColor() {
        zN a2;
        if (a2.hoverColorValCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getTextColor() {
        zN a2;
        if (a2.textColorValCase_ == AQa.P) {
            return (Integer)a2.textColorVal_;
        }
        return uSa.E;
    }

    public static /* synthetic */ void e(zN a2) {
        a2.l();
    }

    private void M() {
        zN a2;
        zN zN2 = a2;
        zN2.hoverColorValCase_ = uSa.E;
        zN2.hoverColorVal_ = null;
    }

    public wN getHoverColorValCase() {
        zN a2;
        return wN.forNumber(a2.hoverColorValCase_);
    }

    public static zN J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static zN J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public Sm getTextColorValCase() {
        zN a2;
        return Sm.forNumber((int)a2.textColorValCase_);
    }

    public static /* synthetic */ void C(zN zN2, int n2) {
        int b2 = n2;
        zN a2 = zN2;
        a2.l(b2);
    }

    public static /* synthetic */ void d(zN a2) {
        a2.e();
    }

    private void e() {
        zN a2;
        if (a2.hoverColorValCase_ == uqa.g) {
            zN zN2 = a2;
            zN2.hoverColorValCase_ = uSa.E;
            zN2.hoverColorVal_ = null;
        }
    }

    public static zN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void C(zN a2) {
        a2.M();
    }

    public int getTextColorAnim() {
        zN a2;
        if (a2.textColorValCase_ == tTa.h) {
            return (Integer)a2.textColorVal_;
        }
        return uSa.E;
    }

    public static zN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(zN a2) {
        a2.J();
    }

    public static zN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(zN a2) {
        a2.f();
    }

    static {
        zN zN2;
        DEFAULT_INSTANCE = zN2 = new zN();
        GeneratedMessageLite.registerDefaultInstance(zN.class, zN2);
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
        zN c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new zN();
            }
            case 2: {
                return new QN(null);
            }
            case 3: {
                Object[] objectArray = new Object[uua.p];
                objectArray[uSa.E] = pQa.k;
                objectArray[vRa.d] = asa.L;
                objectArray[uqa.g] = zsa.t;
                objectArray[yRa.d] = VQa.u;
                objectArray[AQa.P] = lqa.E;
                objectArray[tTa.h] = aPa.O;
                d2 = objectArray;
                Object b2 = vpa.u;
                return zN.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = zN.class;
                synchronized (zN.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<zN>(DEFAULT_INSTANCE);
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

    public static zN f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static zN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l(int n2) {
        zN a2;
        int b2 = n2;
        zN zN2 = a2 = this;
        zN2.textColorValCase_ = tTa.h;
        zN2.textColorVal_ = b2;
    }

    public int getHoverColor() {
        zN a2;
        if (a2.hoverColorValCase_ == uqa.g) {
            return (Integer)a2.hoverColorVal_;
        }
        return uSa.E;
    }

    public static zN J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getTextBytes() {
        zN a2;
        return ByteString.copyFromUtf8(a2.text_);
    }

    private zN() {
        zN a2;
        a2.textColorValCase_ = uSa.E;
        a2.text_ = Mqa.y;
    }

    public static /* synthetic */ void l(zN zN2, int n2) {
        int b2 = n2;
        zN a2 = zN2;
        a2.f(b2);
    }

    private void d() {
        zN a2;
        zN zN2 = a2;
        zN2.textColorValCase_ = uSa.E;
        zN2.textColorVal_ = null;
    }

    public int getHoverColorAnim() {
        zN a2;
        if (a2.hoverColorValCase_ == yRa.d) {
            return (Integer)a2.hoverColorVal_;
        }
        return uSa.E;
    }

    public static Parser<zN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(zN a2) {
        a2.d();
    }

    public boolean hasHoverColorAnim() {
        zN a2;
        if (a2.hoverColorValCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(int n2) {
        zN a2;
        int b2 = n2;
        zN zN2 = a2 = this;
        zN2.hoverColorValCase_ = yRa.d;
        zN2.hoverColorVal_ = b2;
    }

    public static /* synthetic */ zN J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(zN zN2, int n2) {
        int b2 = n2;
        zN a2 = zN2;
        a2.J(b2);
    }

    public static QN J(zN a2) {
        return (QN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static zN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(zN zN2, int n2) {
        int b2 = n2;
        zN a2 = zN2;
        a2.C(b2);
    }

    public boolean hasText() {
        zN a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.text_ = zN.f().getText();
    }

    private void l() {
        zN a2;
        if (a2.hoverColorValCase_ == yRa.d) {
            zN zN2 = a2;
            zN2.hoverColorValCase_ = uSa.E;
            zN2.hoverColorVal_ = null;
        }
    }

    public static zN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return zN.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        zN a2;
        if (a2.textColorValCase_ == AQa.P) {
            zN zN2 = a2;
            zN2.textColorValCase_ = uSa.E;
            zN2.textColorVal_ = null;
        }
    }

    private void J() {
        zN a2;
        if (a2.textColorValCase_ == tTa.h) {
            zN zN2 = a2;
            zN2.textColorValCase_ = uSa.E;
            zN2.textColorVal_ = null;
        }
    }

    public static /* synthetic */ void J(zN zN2, ByteString byteString) {
        ByteString b2 = byteString;
        zN a2 = zN2;
        a2.J(b2);
    }

    public static zN J(InputStream a2) throws IOException {
        return zN.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        zN a2;
        int b2 = n2;
        zN zN2 = a2 = this;
        zN2.textColorValCase_ = AQa.P;
        zN2.textColorVal_ = b2;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        zN a2 = this;
        zN.checkByteStringIsUtf8(b2);
        a2.text_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }
}

