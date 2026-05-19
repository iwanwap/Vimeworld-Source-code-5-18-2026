/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  BRa
 *  JPa
 *  XTa
 *  aB
 *  hn
 *  kpa
 *  vRa
 *  ym
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
public final class IO
extends GeneratedMessageLite<IO, ym>
implements aB {
    private String name_;
    public static final int BOOLVAL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private int valueCase_ = uSa.E;
    public static final int FLOATVAL_FIELD_NUMBER = 6;
    public static final int STRINGVAL_FIELD_NUMBER = 5;
    private static final IO DEFAULT_INSTANCE;
    private static volatile Parser<IO> PARSER;
    public static final int NULLVAL_FIELD_NUMBER = 7;
    public static final int LONGVAL_FIELD_NUMBER = 3;
    private Object value_;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        Object d2 = methodToInvoke;
        IO c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new IO();
            }
            case 2: {
                return new ym(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = BQa.U;
                objectArray[vRa.d] = Jsa.ba;
                objectArray[uqa.g] = kpa.K;
                d2 = objectArray;
                Object b2 = BRa.G;
                return IO.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = IO.class;
                synchronized (IO.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<IO>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void M(IO a2) {
        a2.d();
    }

    public static /* synthetic */ void J(IO b2, long a2) {
        b2.J(a2);
    }

    public ByteString getStringValBytes() {
        IO iO = this;
        Object a2 = Mqa.y;
        if (iO.valueCase_ == tTa.h) {
            a2 = (String)iO.value_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void M() {
        IO a2;
        if (a2.valueCase_ == tTa.h) {
            IO iO = a2;
            iO.valueCase_ = uSa.E;
            iO.value_ = null;
        }
    }

    public static /* synthetic */ void f(IO iO, boolean bl) {
        boolean b2 = bl;
        IO a2 = iO;
        a2.J(b2);
    }

    public boolean hasNullVal() {
        IO a2;
        if (a2.valueCase_ == XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static IO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(boolean bl) {
        IO a2;
        boolean b2 = bl;
        IO iO = a2 = this;
        iO.valueCase_ = XTa.W;
        iO.value_ = b2;
    }

    public static IO f(InputStream a2) throws IOException {
        return IO.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public String getStringVal() {
        IO iO = this;
        Object a2 = Mqa.y;
        if (iO.valueCase_ == tTa.h) {
            a2 = (String)iO.value_;
        }
        return a2;
    }

    public boolean hasBoolVal() {
        IO a2;
        if (a2.valueCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static IO f() {
        return DEFAULT_INSTANCE;
    }

    private void J(boolean bl) {
        IO a2;
        boolean b2 = bl;
        IO iO = a2 = this;
        iO.valueCase_ = AQa.P;
        iO.value_ = b2;
    }

    private void e() {
        IO a2;
        if (a2.valueCase_ == yRa.d) {
            IO iO = a2;
            iO.valueCase_ = uSa.E;
            iO.value_ = null;
        }
    }

    public static /* synthetic */ void e(IO a2) {
        a2.C();
    }

    public boolean hasLongVal() {
        IO a2;
        if (a2.valueCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ym J(IO a2) {
        return (ym)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public float getFloatVal() {
        IO a2;
        if (a2.valueCase_ == uua.p) {
            return ((Float)a2.value_).floatValue();
        }
        return JPa.N;
    }

    public static IO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(ByteString byteString) {
        IO a2;
        ByteString b2 = byteString;
        IO iO = a2 = this;
        IO.checkByteStringIsUtf8(b2);
        iO.value_ = b2.toStringUtf8();
        iO.valueCase_ = tTa.h;
    }

    public boolean hasStringVal() {
        IO a2;
        if (a2.valueCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getNameBytes() {
        IO a2;
        return ByteString.copyFromUtf8(a2.name_);
    }

    public static IO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static IO J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static IO J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(long a2) {
        IO b2;
        IO iO = b2;
        iO.valueCase_ = yRa.d;
        iO.value_ = a2;
    }

    public long getLongVal() {
        IO a2;
        if (a2.valueCase_ == yRa.d) {
            return (Long)a2.value_;
        }
        return nqa.i;
    }

    public static IO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(IO iO, float f2) {
        float b2 = f2;
        IO a2 = iO;
        a2.J(b2);
    }

    public static Parser<IO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean getNullVal() {
        IO a2;
        if (a2.valueCase_ == XTa.W) {
            return (Boolean)a2.value_;
        }
        return uSa.E != 0;
    }

    private IO() {
        IO a2;
        a2.name_ = Mqa.y;
    }

    public static /* synthetic */ void d(IO a2) {
        a2.l();
    }

    public static ym J() {
        return (ym)DEFAULT_INSTANCE.createBuilder();
    }

    private void d() {
        IO a2;
        IO iO = a2;
        iO.valueCase_ = uSa.E;
        iO.value_ = null;
    }

    public boolean hasFloatVal() {
        IO a2;
        if (a2.valueCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(IO iO, ByteString byteString) {
        ByteString b2 = byteString;
        IO a2 = iO;
        a2.J(b2);
    }

    public static /* synthetic */ IO J() {
        return DEFAULT_INSTANCE;
    }

    public String getName() {
        IO a2;
        return a2.name_;
    }

    public static /* synthetic */ void J(IO iO, boolean bl) {
        boolean b2 = bl;
        IO a2 = iO;
        a2.f(b2);
    }

    private void C() {
        a.name_ = IO.f().getName();
    }

    public static /* synthetic */ void C(IO a2) {
        a2.e();
    }

    private void l() {
        IO a2;
        if (a2.valueCase_ == XTa.W) {
            IO iO = a2;
            iO.valueCase_ = uSa.E;
            iO.value_ = null;
        }
    }

    public boolean getBoolVal() {
        IO a2;
        if (a2.valueCase_ == AQa.P) {
            return (Boolean)a2.value_;
        }
        return uSa.E != 0;
    }

    private void f(String string) {
        String b2 = string;
        IO a2 = this;
        b2.getClass();
        IO iO = a2;
        iO.valueCase_ = tTa.h;
        iO.value_ = b2;
    }

    public static IO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static IO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        IO a2 = this;
        Object object = b2;
        IO.checkByteStringIsUtf8((ByteString)object);
        a2.name_ = ((ByteString)object).toStringUtf8();
    }

    private void f() {
        IO a2;
        if (a2.valueCase_ == AQa.P) {
            IO iO = a2;
            iO.valueCase_ = uSa.E;
            iO.value_ = null;
        }
    }

    public static IO J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(IO iO, String string) {
        String b2 = string;
        IO a2 = iO;
        a2.J(b2);
    }

    public static /* synthetic */ void J(IO iO, String string) {
        String b2 = string;
        IO a2 = iO;
        a2.f(b2);
    }

    public static IO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return IO.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        IO a2 = this;
        b2.getClass();
        a2.name_ = b2;
    }

    static {
        IO iO;
        DEFAULT_INSTANCE = iO = new IO();
        GeneratedMessageLite.registerDefaultInstance(IO.class, iO);
    }

    private void J() {
        IO a2;
        if (a2.valueCase_ == uua.p) {
            IO iO = a2;
            iO.valueCase_ = uSa.E;
            iO.value_ = null;
        }
    }

    public static /* synthetic */ void J(IO iO, ByteString byteString) {
        ByteString b2 = byteString;
        IO a2 = iO;
        a2.f(b2);
    }

    public hn getValueCase() {
        IO a2;
        return hn.forNumber((int)a2.valueCase_);
    }

    public static IO J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(IO a2) {
        a2.f();
    }

    public static /* synthetic */ void f(IO a2) {
        a2.M();
    }

    public static /* synthetic */ void J(IO a2) {
        a2.J();
    }

    private void J(float f2) {
        IO a2;
        float b2 = f2;
        IO iO = a2 = this;
        iO.valueCase_ = uua.p;
        iO.value_ = Float.valueOf(b2);
    }
}

