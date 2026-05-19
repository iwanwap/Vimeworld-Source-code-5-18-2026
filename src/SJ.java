/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EQa
 *  ERa
 *  NQa
 *  T
 *  WJ
 *  Wsa
 *  XTa
 *  jpa
 *  kpa
 *  lqa
 *  vRa
 *  ysa
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
public final class SJ
extends GeneratedMessageLite<SJ, WJ>
implements T {
    private boolean password_;
    private static final SJ DEFAULT_INSTANCE;
    public static final int CHANGECALLBACK_FIELD_NUMBER = 2;
    public static final int PLACEHOLDER_FIELD_NUMBER = 4;
    private int maxLength_;
    private int placeholderColor_;
    private ByteString changeCallback_ = ByteString.EMPTY;
    public static final int ENTERCALLBACK_FIELD_NUMBER = 8;
    private ByteString enterCallback_;
    public static final int PLACEHOLDERCOLOR_FIELD_NUMBER = 5;
    private String placeholder_;
    public static final int MULTILINE_FIELD_NUMBER = 7;
    public static final int ALLOWREGEXP_FIELD_NUMBER = 3;
    private int bitField0_;
    public static final int MAXLENGTH_FIELD_NUMBER = 1;
    private String allowRegexp_ = Mqa.y;
    public static final int PASSWORD_FIELD_NUMBER = 6;
    private static volatile Parser<SJ> PARSER;
    private boolean multiline_;

    public static /* synthetic */ void i(SJ a2) {
        a2.f();
    }

    public static /* synthetic */ void M(SJ a2) {
        a2.C();
    }

    public static /* synthetic */ void e(SJ a2) {
        a2.e();
    }

    public static /* synthetic */ void d(SJ a2) {
        a2.l();
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        SJ a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.password_ = b2;
    }

    public static SJ J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(SJ sJ, ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = sJ;
        a2.J(b2);
    }

    public static SJ f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(SJ sJ, ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = sJ;
        a2.f(b2);
    }

    private void i() {
        a.bitField0_ &= fta.fa;
        a.password_ = uSa.E;
    }

    public static /* synthetic */ void C(SJ a2) {
        a2.J();
    }

    private void C(ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = this;
        b2.getClass();
        a2.bitField0_ |= uqa.g;
        a2.changeCallback_ = b2;
    }

    public static /* synthetic */ void f(SJ sJ, String string) {
        String b2 = string;
        SJ a2 = sJ;
        a2.f(b2);
    }

    public boolean hasPlaceholderColor() {
        SJ a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static SJ J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void M() {
        a.bitField0_ &= ERa.Ka;
        a.changeCallback_ = SJ.J().getChangeCallback();
    }

    public ByteString getEnterCallback() {
        SJ a2;
        return a2.enterCallback_;
    }

    public static /* synthetic */ SJ f() {
        return DEFAULT_INSTANCE;
    }

    public static SJ J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public int getPlaceholderColor() {
        SJ a2;
        return a2.placeholderColor_;
    }

    public boolean hasPlaceholder() {
        SJ a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        SJ sJ;
        DEFAULT_INSTANCE = sJ = new SJ();
        GeneratedMessageLite.registerDefaultInstance(SJ.class, sJ);
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = this;
        SJ.checkByteStringIsUtf8(b2);
        a2.allowRegexp_ = b2.toStringUtf8();
        a2.bitField0_ |= AQa.P;
    }

    private void e() {
        a.bitField0_ &= kpa.w;
        a.allowRegexp_ = SJ.J().getAllowRegexp();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = this;
        SJ.checkByteStringIsUtf8(b2);
        a2.placeholder_ = b2.toStringUtf8();
        a2.bitField0_ |= Yqa.i;
    }

    public ByteString getChangeCallback() {
        SJ a2;
        return a2.changeCallback_;
    }

    public static /* synthetic */ void J(SJ sJ, String string) {
        String b2 = string;
        SJ a2 = sJ;
        a2.J(b2);
    }

    public static /* synthetic */ void f(SJ sJ, boolean bl) {
        boolean b2 = bl;
        SJ a2 = sJ;
        a2.f(b2);
    }

    public String getAllowRegexp() {
        SJ a2;
        return a2.allowRegexp_;
    }

    public boolean hasAllowRegexp() {
        SJ a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getMaxLength() {
        SJ a2;
        return a2.maxLength_;
    }

    public ByteString getPlaceholderBytes() {
        SJ a2;
        return ByteString.copyFromUtf8(a2.placeholder_);
    }

    private SJ() {
        SJ a2;
        a2.placeholder_ = Mqa.y;
        a2.enterCallback_ = ByteString.EMPTY;
    }

    public static /* synthetic */ void f(SJ sJ, int n2) {
        int b2 = n2;
        SJ a2 = sJ;
        a2.J(b2);
    }

    public static /* synthetic */ void J(SJ sJ, int n2) {
        int b2 = n2;
        SJ a2 = sJ;
        a2.f(b2);
    }

    public static SJ f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getPlaceholder() {
        SJ a2;
        return a2.placeholder_;
    }

    private void d() {
        a.bitField0_ &= Bta.u;
        a.enterCallback_ = SJ.J().getEnterCallback();
    }

    public static WJ J(SJ a2) {
        return (WJ)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void f(int n2) {
        int b2 = n2;
        SJ a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.maxLength_ = b2;
    }

    public static WJ J() {
        return (WJ)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(int n2) {
        int b2 = n2;
        SJ a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.placeholderColor_ = b2;
    }

    public static SJ J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(SJ sJ, ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = sJ;
        a2.l(b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        SJ a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.multiline_ = b2;
    }

    public boolean hasPassword() {
        SJ a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(SJ a2) {
        a2.M();
    }

    public boolean hasChangeCallback() {
        SJ a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(SJ a2) {
        a2.i();
    }

    public boolean hasEnterCallback() {
        SJ a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(String string) {
        String b2 = string;
        SJ a2 = this;
        b2.getClass();
        a2.bitField0_ |= AQa.P;
        a2.allowRegexp_ = b2;
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.maxLength_ = uSa.E;
    }

    private void l() {
        a.bitField0_ &= Jra.Fa;
        a.placeholder_ = SJ.J().getPlaceholder();
    }

    public static /* synthetic */ void J(SJ sJ, boolean bl) {
        boolean b2 = bl;
        SJ a2 = sJ;
        a2.J(b2);
    }

    public static SJ J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasMultiline() {
        SJ a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(SJ a2) {
        a2.d();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = this;
        b2.getClass();
        a2.bitField0_ |= XOa.h;
        a2.enterCallback_ = b2;
    }

    public ByteString getAllowRegexpBytes() {
        SJ a2;
        return ByteString.copyFromUtf8(a2.allowRegexp_);
    }

    public static Parser<SJ> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(String string) {
        String b2 = string;
        SJ a2 = this;
        b2.getClass();
        a2.bitField0_ |= Yqa.i;
        a2.placeholder_ = b2;
    }

    public boolean getPassword() {
        SJ a2;
        return a2.password_;
    }

    public boolean getMultiline() {
        SJ a2;
        return a2.multiline_;
    }

    public static SJ J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.bitField0_ &= NQa.A;
        a.placeholderColor_ = uSa.E;
    }

    public boolean hasMaxLength() {
        SJ a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static SJ J() {
        return DEFAULT_INSTANCE;
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
        SJ c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new SJ();
            }
            case 2: {
                return new WJ(null);
            }
            case 3: {
                Object[] objectArray = new Object[WOa.fa];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = Fua.m;
                objectArray[uqa.g] = BQa.q;
                objectArray[yRa.d] = KSa.O;
                objectArray[AQa.P] = dua.D;
                objectArray[tTa.h] = Npa.V;
                objectArray[uua.p] = EQa.H;
                objectArray[XTa.W] = Wsa.W;
                objectArray[Yqa.i] = Eqa.h;
                d2 = objectArray;
                Object b2 = jpa.R;
                return SJ.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = SJ.class;
                synchronized (SJ.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<SJ>(DEFAULT_INSTANCE);
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

    public static SJ J(InputStream a2) throws IOException {
        return SJ.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.bitField0_ &= VPa.A;
        a.multiline_ = uSa.E;
    }

    public static SJ J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return SJ.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(SJ sJ, ByteString byteString) {
        ByteString b2 = byteString;
        SJ a2 = sJ;
        a2.C(b2);
    }

    public static SJ J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static SJ J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

