/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  BN
 *  Dm
 *  Zm
 *  aSa
 *  nQa
 *  sn
 *  ta
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
public final class BN_2
extends GeneratedMessageLite<BN, Dm>
implements ta {
    private int kind_;
    private static volatile Parser<BN> PARSER;
    private Object data_;
    public static final int CALLBACK_FIELD_NUMBER = 2;
    private static final BN DEFAULT_INSTANCE;
    public static final int ELEMENTID2D_FIELD_NUMBER = 4;
    public static final int MESSAGE_FIELD_NUMBER = 5;
    private int dataCase_ = uSa.E;
    public static final int UNBIND_FIELD_NUMBER = 3;
    public static final int KIND_FIELD_NUMBER = 1;

    public boolean hasMessage() {
        BN_2 a2;
        if (a2.dataCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Dm J() {
        return (Dm)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(BN bN2, sn sn2) {
        BN b2 = sn2;
        BN a2 = bN2;
        super.J((sn)b2);
    }

    public static BN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void e(BN a2) {
        super.l();
    }

    public int getKindValue() {
        BN_2 a2;
        return a2.kind_;
    }

    private void f(Zm zm2) {
        BN_2 b2 = zm2;
        BN_2 a2 = this;
        b2.getClass();
        BN_2 bN_2 = a2;
        bN_2.data_ = b2;
        bN_2.dataCase_ = yRa.d;
    }

    private void e() {
        a.kind_ = uSa.E;
    }

    private void d() {
        BN_2 a2;
        if (a2.dataCase_ == uqa.g) {
            BN_2 bN_2 = a2;
            bN_2.dataCase_ = uSa.E;
            bN_2.data_ = null;
        }
    }

    public static Parser<BN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static BN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void l(ByteString byteString) {
        BN_2 a2;
        ByteString b2 = byteString;
        BN_2 bN_2 = a2 = this;
        BN_2.checkByteStringIsUtf8(b2);
        bN_2.data_ = b2.toStringUtf8();
        bN_2.dataCase_ = AQa.P;
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        BN_2 a2 = this;
        b2.getClass();
        BN_2 bN_2 = a2;
        bN_2.dataCase_ = uqa.g;
        bN_2.data_ = b2;
    }

    public static /* synthetic */ void l(BN bN2, ByteString byteString) {
        Object b2 = byteString;
        BN a2 = bN2;
        super.l((ByteString)b2);
    }

    private void C() {
        BN_2 a2;
        if (a2.dataCase_ == AQa.P) {
            BN_2 bN_2 = a2;
            bN_2.dataCase_ = uSa.E;
            bN_2.data_ = null;
        }
    }

    public static /* synthetic */ void f(BN bN2, Zm zm2) {
        BN b2 = zm2;
        BN a2 = bN2;
        super.f((Zm)b2);
    }

    public static /* synthetic */ void d(BN a2) {
        super.J();
    }

    public boolean hasElementId2D() {
        BN_2 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getCallback() {
        BN_2 a2;
        if (a2.dataCase_ == uqa.g) {
            return (ByteString)a2.data_;
        }
        return ByteString.EMPTY;
    }

    public static /* synthetic */ void C(BN a2) {
        super.f();
    }

    public ByteString getElementId2DBytes() {
        BN_2 bN_2 = this;
        Object a2 = Mqa.y;
        if (bN_2.dataCase_ == AQa.P) {
            a2 = (String)bN_2.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ void J(BN bN2, int n2) {
        int b2 = n2;
        BN a2 = bN2;
        super.J(b2);
    }

    static {
        BN_2 bN_2 = new BN_2();
        DEFAULT_INSTANCE = bN_2;
        GeneratedMessageLite.registerDefaultInstance(BN_2.class, bN_2);
    }

    public Zm getUnbind() {
        BN_2 a2;
        if (a2.dataCase_ == yRa.d) {
            return (Zm)a2.data_;
        }
        return Zm.J();
    }

    public static /* synthetic */ void l(BN a2) {
        super.C();
    }

    public String getElementId2D() {
        BN_2 bN_2 = this;
        Object a2 = Mqa.y;
        if (bN_2.dataCase_ == AQa.P) {
            a2 = (String)bN_2.data_;
        }
        return a2;
    }

    private void l() {
        BN_2 a2;
        BN_2 bN_2 = a2;
        bN_2.dataCase_ = uSa.E;
        bN_2.data_ = null;
    }

    private void J(ByteString byteString) {
        BN_2 a2;
        ByteString b2 = byteString;
        BN_2 bN_2 = a2 = this;
        BN_2.checkByteStringIsUtf8(b2);
        bN_2.data_ = b2.toStringUtf8();
        bN_2.dataCase_ = tTa.h;
    }

    public static /* synthetic */ void J(BN bN2, Zm zm2) {
        BN b2 = zm2;
        BN a2 = bN2;
        super.J((Zm)b2);
    }

    public static /* synthetic */ void f(BN a2) {
        super.e();
    }

    public static /* synthetic */ void f(BN bN2, ByteString byteString) {
        Object b2 = byteString;
        BN a2 = bN2;
        super.f((ByteString)b2);
    }

    public static BN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (BN_2)BN_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ BN f() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasCallback() {
        BN_2 a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static BN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        BN_2 a2 = this;
        a2.kind_ = b2;
    }

    public static BN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static BN J(byte[] a2) throws InvalidProtocolBufferException {
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(Zm zm2) {
        BN_2 bN_2;
        BN_2 b2 = zm2;
        BN_2 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == yRa.d && a2.data_ != Zm.J()) {
            a2.data_ = ((lm)Zm.J((Zm)((Zm)a2.data_)).mergeFrom(b2)).buildPartial();
            bN_2 = a2;
        } else {
            bN_2 = a2;
            a2.data_ = b2;
        }
        bN_2.dataCase_ = yRa.d;
    }

    public sn getKind() {
        BN_2 bN_2 = this;
        BN_2 a2 = sn.forNumber((int)bN_2.kind_);
        if (a2 == null) {
            return sn.UNRECOGNIZED;
        }
        return a2;
    }

    public static Dm J(BN a2) {
        return (Dm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static BN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(String string) {
        String b2 = string;
        BN_2 a2 = this;
        b2.getClass();
        BN_2 bN_2 = a2;
        bN_2.dataCase_ = AQa.P;
        bN_2.data_ = b2;
    }

    public static /* synthetic */ void f(BN bN2, String string) {
        Object b2 = string;
        BN a2 = bN2;
        super.J((String)b2);
    }

    private void f() {
        BN_2 a2;
        if (a2.dataCase_ == yRa.d) {
            BN_2 bN_2 = a2;
            bN_2.dataCase_ = uSa.E;
            bN_2.data_ = null;
        }
    }

    private void J(String string) {
        String b2 = string;
        BN_2 a2 = this;
        b2.getClass();
        BN_2 bN_2 = a2;
        bN_2.dataCase_ = tTa.h;
        bN_2.data_ = b2;
    }

    private void J(sn sn2) {
        BN_2 b2 = sn2;
        BN_2 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    public static BN J(CodedInputStream a2) throws IOException {
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasUnbind() {
        BN_2 a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public GM getDataCase() {
        BN_2 a2;
        return GM.forNumber(a2.dataCase_);
    }

    public static BN J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        BN_2 a2;
        if (a2.dataCase_ == tTa.h) {
            BN_2 bN_2 = a2;
            bN_2.dataCase_ = uSa.E;
            bN_2.data_ = null;
        }
    }

    public static /* synthetic */ void J(BN bN2, String string) {
        Object b2 = string;
        BN a2 = bN2;
        super.f((String)b2);
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
        BN_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new BN_2();
            }
            case 2: {
                return new Dm(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = aSa.u;
                objectArray[yRa.d] = Zm.class;
                d2 = objectArray;
                Object b2 = xua.D;
                return BN_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = BN_2.class;
                synchronized (BN_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<BN>(DEFAULT_INSTANCE);
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

    public ByteString getMessageBytes() {
        BN_2 bN_2 = this;
        Object a2 = Mqa.y;
        if (bN_2.dataCase_ == tTa.h) {
            a2 = (String)bN_2.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ void J(BN a2) {
        super.d();
    }

    public static /* synthetic */ void J(BN bN2, ByteString byteString) {
        Object b2 = byteString;
        BN a2 = bN2;
        super.J((ByteString)b2);
    }

    public static BN J(ByteString a2) throws InvalidProtocolBufferException {
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static BN f(InputStream a2) throws IOException {
        return (BN_2)BN_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static BN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getMessage() {
        BN_2 bN_2 = this;
        Object a2 = Mqa.y;
        if (bN_2.dataCase_ == tTa.h) {
            a2 = (String)bN_2.data_;
        }
        return a2;
    }

    public static BN J(InputStream a2) throws IOException {
        return (BN_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private BN_2() {
        BN_2 a2;
    }
}

