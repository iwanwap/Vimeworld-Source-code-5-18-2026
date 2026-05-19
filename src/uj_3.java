/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  NQa
 *  Usa
 *  VJ
 *  XTa
 *  aPa
 *  kpa
 *  lqa
 *  uj
 *  vQa
 *  vRa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uj_3
extends GeneratedMessageLite<uj, VJ>
implements Q {
    public static final int SHADOW_FIELD_NUMBER = 5;
    public static final int BACKGROUND_FIELD_NUMBER = 3;
    public static final int WIDTHEXPR_FIELD_NUMBER = 6;
    private int width_;
    private static final uj DEFAULT_INSTANCE;
    private static volatile Parser<uj> PARSER;
    private boolean shadow_;
    private Internal.ProtobufList<String> text_ = GeneratedMessageLite.emptyProtobufList();
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int bitField0_;
    private String widthExpr_ = Mqa.y;
    private int hoverBackground_;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int HOVERBACKGROUND_FIELD_NUMBER = 4;
    private int background_;

    @Override
    public List<String> getTextList() {
        uj_3 a2;
        return a2.text_;
    }

    public static uj J(ByteString a2) throws InvalidProtocolBufferException {
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static uj J(CodedInputStream a2) throws IOException {
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public String getText(int n2) {
        int b2 = n2;
        uj_3 a2 = this;
        return (String)a2.text_.get(b2);
    }

    public static uj J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(uj uj2, Iterable iterable) {
        Object b2 = iterable;
        uj a2 = uj2;
        super.J((Iterable<String>)b2);
    }

    @Override
    public int getHoverBackground() {
        uj_3 a2;
        return a2.hoverBackground_;
    }

    public static /* synthetic */ void f(uj uj2, ByteString byteString) {
        Object b2 = byteString;
        uj a2 = uj2;
        super.J((ByteString)b2);
    }

    public static uj f(InputStream a2) throws IOException {
        return (uj_3)uj_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
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
        uj_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new uj_3();
            }
            case 2: {
                return new VJ(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aPa.O;
                objectArray[uqa.g] = LPa.a;
                objectArray[yRa.d] = Usa.y;
                objectArray[AQa.P] = vQa.t;
                objectArray[tTa.h] = dqa.D;
                objectArray[uua.p] = BPa.B;
                d2 = objectArray;
                Object b2 = MTa.ha;
                return uj_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = uj_3.class;
                synchronized (uj_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<uj>(DEFAULT_INSTANCE);
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

    public static uj J(InputStream a2) throws IOException {
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static uj f() {
        return DEFAULT_INSTANCE;
    }

    private void f(String string) {
        String b2 = string;
        uj_3 a2 = this;
        b2.getClass();
        a2.bitField0_ |= uqa.g;
        a2.widthExpr_ = b2;
    }

    public static /* synthetic */ void e(uj a2) {
        super.e();
    }

    private void M() {
        a.bitField0_ &= Jra.Fa;
        a.hoverBackground_ = uSa.E;
    }

    private void e() {
        a.text_ = GeneratedMessageLite.emptyProtobufList();
    }

    @Override
    public int getTextCount() {
        uj_3 a2;
        return a2.text_.size();
    }

    private void d() {
        uj_3 uj_32 = this;
        Internal.ProtobufList<String> a2 = uj_32.text_;
        if (!a2.isModifiable()) {
            uj_32.text_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void d(uj a2) {
        super.f();
    }

    @Override
    public ByteString getTextBytes(int n2) {
        int b2 = n2;
        uj_3 a2 = this;
        return ByteString.copyFromUtf8((String)a2.text_.get(b2));
    }

    private void C() {
        a.bitField0_ &= ERa.Ka;
        a.widthExpr_ = uj_3.f().getWidthExpr();
    }

    @Override
    public int getWidth() {
        uj_3 a2;
        return a2.width_;
    }

    private void l(int n2) {
        int b2 = n2;
        uj_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.width_ = b2;
    }

    public static /* synthetic */ void J(uj uj2, ByteString byteString) {
        Object b2 = byteString;
        uj a2 = uj2;
        super.f((ByteString)b2);
    }

    @Override
    public ByteString getWidthExprBytes() {
        uj_3 a2;
        return ByteString.copyFromUtf8(a2.widthExpr_);
    }

    public static uj f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (uj_3)uj_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        uj_3 a2 = this;
        b2.getClass();
        uj_3 uj_32 = a2;
        uj_32.d();
        uj_32.text_.add(b2);
    }

    private void f(int n2) {
        int b2 = n2;
        uj_3 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.background_ = b2;
    }

    public static /* synthetic */ void f(uj uj2, String string) {
        Object b2 = string;
        uj a2 = uj2;
        super.f((String)b2);
    }

    @Override
    public int getBackground() {
        uj_3 a2;
        return a2.background_;
    }

    public static uj J(byte[] a2) throws InvalidProtocolBufferException {
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        uj_3 uj_32 = new uj_3();
        DEFAULT_INSTANCE = uj_32;
        GeneratedMessageLite.registerDefaultInstance(uj_3.class, uj_32);
    }

    public static /* synthetic */ void l(uj uj2, int n2) {
        int b2 = n2;
        uj a2 = uj2;
        super.l(b2);
    }

    public static uj J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.width_ = uSa.E;
    }

    public static Parser<uj> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f() {
        a.bitField0_ &= NQa.A;
        a.shadow_ = uSa.E;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        uj_3 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.shadow_ = b2;
    }

    @Override
    public boolean hasHoverBackground() {
        uj_3 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static uj J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(uj a2) {
        super.J();
    }

    private uj_3() {
        uj_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(uj uj2, int n2, String string) {
        void b2;
        Object c2 = string;
        uj a2 = uj2;
        super.J((int)b2, (String)c2);
    }

    private void J() {
        a.bitField0_ &= kpa.w;
        a.background_ = uSa.E;
    }

    public static uj J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(uj uj2, int n2) {
        int b2 = n2;
        uj a2 = uj2;
        super.J(b2);
    }

    public static VJ J(uj a2) {
        return (VJ)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static VJ J() {
        return (VJ)DEFAULT_INSTANCE.createBuilder();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        uj_3 a2 = this;
        uj_3.checkByteStringIsUtf8(b2);
        a2.widthExpr_ = b2.toStringUtf8();
        a2.bitField0_ |= uqa.g;
    }

    public static /* synthetic */ void l(uj a2) {
        super.C();
    }

    @Override
    public boolean hasWidthExpr() {
        uj_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(uj uj2, boolean bl) {
        boolean b2 = bl;
        uj a2 = uj2;
        super.J(b2);
    }

    public static /* synthetic */ void f(uj a2) {
        super.l();
    }

    public static uj J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(uj uj2, String string) {
        Object b2 = string;
        uj a2 = uj2;
        super.J((String)b2);
    }

    public static /* synthetic */ void J(uj a2) {
        super.M();
    }

    @Override
    public boolean hasWidth() {
        uj_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, String string) {
        void b2;
        String c2 = string;
        uj_3 a2 = this;
        c2.getClass();
        uj_3 uj_32 = a2;
        uj_32.d();
        uj_32.text_.set((int)b2, c2);
    }

    @Override
    public boolean getShadow() {
        uj_3 a2;
        return a2.shadow_;
    }

    @Override
    public String getWidthExpr() {
        uj_3 a2;
        return a2.widthExpr_;
    }

    public static /* synthetic */ void J(uj uj2, int n2) {
        int b2 = n2;
        uj a2 = uj2;
        super.f(b2);
    }

    public static /* synthetic */ uj J() {
        return DEFAULT_INSTANCE;
    }

    public static uj J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (uj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        uj_3 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.hoverBackground_ = b2;
    }

    private void J(Iterable<String> iterable) {
        uj_3 a2;
        Iterable<String> b2 = iterable;
        uj_3 uj_32 = a2 = this;
        uj_32.d();
        AbstractMessageLite.addAll(b2, uj_32.text_);
    }

    @Override
    public boolean hasShadow() {
        uj_3 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasBackground() {
        uj_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ByteString byteString) {
        uj_3 a2;
        ByteString b2 = byteString;
        uj_3 uj_32 = a2 = this;
        uj_3.checkByteStringIsUtf8(b2);
        uj_32.d();
        uj_32.text_.add(b2.toStringUtf8());
    }
}

