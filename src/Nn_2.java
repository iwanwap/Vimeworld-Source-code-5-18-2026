/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DM
 *  JPa
 *  Nn
 *  SO
 *  Zua
 *  fa
 *  lqa
 *  pqa
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
public final class Nn_2
extends GeneratedMessageLite<Nn, SO>
implements fa {
    public static final int SIZEANIM_FIELD_NUMBER = 3;
    private float value_;
    private static final Nn DEFAULT_INSTANCE;
    public static final int SIZEEXPRANIM_FIELD_NUMBER = 5;
    public static final int SIZEEXPR_FIELD_NUMBER = 4;
    private static volatile Parser<Nn> PARSER;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    public static final int SIZE_FIELD_NUMBER = 2;
    private Object sizeval_;
    private int sizevalCase_ = uSa.E;

    public static Nn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public DM getSizevalCase() {
        Nn_2 a2;
        return DM.forNumber((int)a2.sizevalCase_);
    }

    public static Nn f(InputStream a2) throws IOException {
        return (Nn_2)Nn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasValue() {
        Nn_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(Nn a2) {
        super.d();
    }

    public boolean hasSize() {
        Nn_2 a2;
        if (a2.sizevalCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
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
        Nn_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Nn_2();
            }
            case 2: {
                return new SO(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = gQa.i;
                objectArray[vRa.d] = Zua.X;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = BQa.U;
                d2 = objectArray;
                Object b2 = pqa.Aa;
                return Nn_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Nn_2.class;
                synchronized (Nn_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Nn>(DEFAULT_INSTANCE);
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

    public String getSizeExpr() {
        Nn_2 nn_2 = this;
        Object a2 = Mqa.y;
        if (nn_2.sizevalCase_ == AQa.P) {
            a2 = (String)nn_2.sizeval_;
        }
        return a2;
    }

    public static /* synthetic */ void f(Nn nn2, String string) {
        Object b2 = string;
        Nn a2 = nn2;
        super.J((String)b2);
    }

    public static Nn J(CodedInputStream a2) throws IOException {
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void e() {
        Nn_2 a2;
        if (a2.sizevalCase_ == tTa.h) {
            Nn_2 nn_2 = a2;
            nn_2.sizevalCase_ = uSa.E;
            nn_2.sizeval_ = null;
        }
    }

    public float getSizeAnim() {
        Nn_2 a2;
        if (a2.sizevalCase_ == yRa.d) {
            return ((Float)a2.sizeval_).floatValue();
        }
        return JPa.N;
    }

    public static SO J(Nn a2) {
        return (SO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Nn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void d(Nn a2) {
        super.l();
    }

    private void d() {
        a.bitField0_ &= rQa.p;
        a.value_ = JPa.N;
    }

    public static /* synthetic */ void f(Nn nn2, ByteString byteString) {
        Object b2 = byteString;
        Nn a2 = nn2;
        super.f((ByteString)b2);
    }

    public boolean hasSizeExprAnim() {
        Nn_2 a2;
        if (a2.sizevalCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Nn f() {
        return DEFAULT_INSTANCE;
    }

    public static Nn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(ByteString byteString) {
        Nn_2 a2;
        ByteString b2 = byteString;
        Nn_2 nn_2 = a2 = this;
        Nn_2.checkByteStringIsUtf8(b2);
        nn_2.sizeval_ = b2.toStringUtf8();
        nn_2.sizevalCase_ = AQa.P;
    }

    private void l(float f2) {
        float b2 = f2;
        Nn_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.value_ = b2;
    }

    public static /* synthetic */ void l(Nn nn2, float f2) {
        float b2 = f2;
        Nn a2 = nn2;
        super.l(b2);
    }

    public static /* synthetic */ void J(Nn nn2, String string) {
        Object b2 = string;
        Nn a2 = nn2;
        super.f((String)b2);
    }

    public static Nn J(ByteString a2) throws InvalidProtocolBufferException {
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Nn J(byte[] a2) throws InvalidProtocolBufferException {
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(String string) {
        String b2 = string;
        Nn_2 a2 = this;
        b2.getClass();
        Nn_2 nn_2 = a2;
        nn_2.sizevalCase_ = AQa.P;
        nn_2.sizeval_ = b2;
    }

    public boolean hasSizeExpr() {
        Nn_2 a2;
        if (a2.sizevalCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Nn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Nn_2)Nn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(Nn a2) {
        super.f();
    }

    public static /* synthetic */ void l(Nn a2) {
        super.e();
    }

    private void f(float f2) {
        Nn_2 a2;
        float b2 = f2;
        Nn_2 nn_2 = a2 = this;
        nn_2.sizevalCase_ = uqa.g;
        nn_2.sizeval_ = Float.valueOf(b2);
    }

    public boolean hasSizeAnim() {
        Nn_2 a2;
        if (a2.sizevalCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Nn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static SO J() {
        return (SO)DEFAULT_INSTANCE.createBuilder();
    }

    static {
        Nn_2 nn_2 = new Nn_2();
        DEFAULT_INSTANCE = nn_2;
        GeneratedMessageLite.registerDefaultInstance(Nn_2.class, nn_2);
    }

    public ByteString getSizeExprBytes() {
        Nn_2 nn_2 = this;
        Object a2 = Mqa.y;
        if (nn_2.sizevalCase_ == AQa.P) {
            a2 = (String)nn_2.sizeval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static Nn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Nn J(InputStream a2) throws IOException {
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Nn nn2, float f2) {
        float b2 = f2;
        Nn a2 = nn2;
        super.f(b2);
    }

    public static Parser<Nn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(String string) {
        String b2 = string;
        Nn_2 a2 = this;
        b2.getClass();
        Nn_2 nn_2 = a2;
        nn_2.sizevalCase_ = tTa.h;
        nn_2.sizeval_ = b2;
    }

    public static /* synthetic */ void f(Nn a2) {
        super.J();
    }

    public static /* synthetic */ Nn J() {
        return DEFAULT_INSTANCE;
    }

    public float getValue() {
        Nn_2 a2;
        return a2.value_;
    }

    private void J(float f2) {
        Nn_2 a2;
        float b2 = f2;
        Nn_2 nn_2 = a2 = this;
        nn_2.sizevalCase_ = yRa.d;
        nn_2.sizeval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ void J(Nn nn2, ByteString byteString) {
        Object b2 = byteString;
        Nn a2 = nn2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void J(Nn a2) {
        super.C();
    }

    public ByteString getSizeExprAnimBytes() {
        Nn_2 nn_2 = this;
        Object a2 = Mqa.y;
        if (nn_2.sizevalCase_ == tTa.h) {
            a2 = (String)nn_2.sizeval_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void C() {
        Nn_2 a2;
        if (a2.sizevalCase_ == yRa.d) {
            Nn_2 nn_2 = a2;
            nn_2.sizevalCase_ = uSa.E;
            nn_2.sizeval_ = null;
        }
    }

    private void l() {
        Nn_2 a2;
        if (a2.sizevalCase_ == uqa.g) {
            Nn_2 nn_2 = a2;
            nn_2.sizevalCase_ = uSa.E;
            nn_2.sizeval_ = null;
        }
    }

    public static Nn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Nn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(Nn nn2, float f2) {
        float b2 = f2;
        Nn a2 = nn2;
        super.J(b2);
    }

    public String getSizeExprAnim() {
        Nn_2 nn_2 = this;
        Object a2 = Mqa.y;
        if (nn_2.sizevalCase_ == tTa.h) {
            a2 = (String)nn_2.sizeval_;
        }
        return a2;
    }

    private void f() {
        Nn_2 a2;
        Nn_2 nn_2 = a2;
        nn_2.sizevalCase_ = uSa.E;
        nn_2.sizeval_ = null;
    }

    private void J(ByteString byteString) {
        Nn_2 a2;
        ByteString b2 = byteString;
        Nn_2 nn_2 = a2 = this;
        Nn_2.checkByteStringIsUtf8(b2);
        nn_2.sizeval_ = b2.toStringUtf8();
        nn_2.sizevalCase_ = tTa.h;
    }

    public float getSize() {
        Nn_2 a2;
        if (a2.sizevalCase_ == uqa.g) {
            return ((Float)a2.sizeval_).floatValue();
        }
        return JPa.N;
    }

    private void J() {
        Nn_2 a2;
        if (a2.sizevalCase_ == AQa.P) {
            Nn_2 nn_2 = a2;
            nn_2.sizevalCase_ = uSa.E;
            nn_2.sizeval_ = null;
        }
    }

    private Nn_2() {
        Nn_2 a2;
    }
}

