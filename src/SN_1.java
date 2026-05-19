/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ia
 *  Im
 *  SN
 *  XTa
 *  Ym
 *  aSa
 *  bRa
 *  jN
 *  lqa
 *  nQa
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
public final class SN_1
extends GeneratedMessageLite<SN, zm>
implements Ia {
    private int dataCase_ = uSa.E;
    public static final int KEY_FIELD_NUMBER = 1;
    private int kind_;
    private int key_;
    public static final int KIND_FIELD_NUMBER = 3;
    private Object data_;
    private static volatile Parser<SN> PARSER;
    public static final int ID_FIELD_NUMBER = 2;
    private String id_ = Mqa.y;
    private static final SN DEFAULT_INSTANCE;
    private int bitField0_;
    public static final int ACTION_FIELD_NUMBER = 4;

    public static SN J(ByteString a2) throws InvalidProtocolBufferException {
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static SN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (SN_1)SN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public Ym getKind() {
        SN_1 sN_1 = this;
        SN_1 a2 = Ym.forNumber((int)sN_1.kind_);
        if (a2 == null) {
            return Ym.UNRECOGNIZED;
        }
        return a2;
    }

    public boolean hasId() {
        SN_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static SN J(CodedInputStream a2) throws IOException {
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void d() {
        a.kind_ = uSa.E;
    }

    public static /* synthetic */ void d(SN a2) {
        super.C();
    }

    public int getKindValue() {
        SN_1 a2;
        return a2.kind_;
    }

    public static /* synthetic */ void J(SN sN2, ByteString byteString) {
        Object b2 = byteString;
        SN a2 = sN2;
        super.J((ByteString)b2);
    }

    private SN_1() {
        SN_1 a2;
    }

    private void C() {
        SN_1 a2;
        SN_1 sN_1 = a2;
        sN_1.dataCase_ = uSa.E;
        sN_1.data_ = null;
    }

    public static SN f(InputStream a2) throws IOException {
        return (SN_1)SN_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(SN a2) {
        super.f();
    }

    public static /* synthetic */ void l(SN a2) {
        super.J();
    }

    public static /* synthetic */ void f(SN a2) {
        super.l();
    }

    public String getId() {
        SN_1 a2;
        return a2.id_;
    }

    static {
        SN_1 sN_1 = new SN_1();
        DEFAULT_INSTANCE = sN_1;
        GeneratedMessageLite.registerDefaultInstance(SN_1.class, sN_1);
    }

    public static SN J(InputStream a2) throws IOException {
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(SN sN2, MN mN2) {
        Object b2 = mN2;
        SN a2 = sN2;
        super.f((MN)b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        SN_1 a2 = this;
        SN_1.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public static SN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(MN mN2) {
        SN_1 sN_1;
        GeneratedMessageLite b2 = mN2;
        SN_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == AQa.P && a2.data_ != MN.J()) {
            a2.data_ = ((jN)MN.J((MN)a2.data_).mergeFrom(b2)).buildPartial();
            sN_1 = a2;
        } else {
            sN_1 = a2;
            a2.data_ = b2;
        }
        sN_1.dataCase_ = AQa.P;
    }

    public Im getDataCase() {
        SN_1 a2;
        return Im.forNumber((int)a2.dataCase_);
    }

    public static zm J() {
        return (zm)DEFAULT_INSTANCE.createBuilder();
    }

    public int getKey() {
        SN_1 a2;
        return a2.key_;
    }

    public static /* synthetic */ void f(SN sN2, int n2) {
        int b2 = n2;
        SN a2 = sN2;
        super.f(b2);
    }

    public static SN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasAction() {
        SN_1 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(int n2) {
        int b2 = n2;
        SN_1 a2 = this;
        a2.key_ = b2;
    }

    public MN getAction() {
        SN_1 a2;
        if (a2.dataCase_ == AQa.P) {
            return (MN)a2.data_;
        }
        return MN.J();
    }

    public static SN J(byte[] a2) throws InvalidProtocolBufferException {
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        SN_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public static SN f() {
        return DEFAULT_INSTANCE;
    }

    public static SN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(SN sN2, Ym ym2) {
        SN b2 = ym2;
        SN a2 = sN2;
        super.J((Ym)b2);
    }

    public static /* synthetic */ void J(SN a2) {
        super.d();
    }

    public static SN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J(Ym ym2) {
        SN_1 b2 = ym2;
        SN_1 a2 = this;
        a2.kind_ = b2.getNumber();
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
        SN_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new SN_1();
            }
            case 2: {
                return new zm(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = rSa.C;
                objectArray[AQa.P] = uQa.Aa;
                objectArray[tTa.h] = aSa.u;
                objectArray[uua.p] = MN.class;
                d2 = objectArray;
                Object b2 = bRa.Ka;
                return SN_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = SN_1.class;
                synchronized (SN_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<SN>(DEFAULT_INSTANCE);
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

    private void J(MN mN2) {
        GeneratedMessageLite b2 = mN2;
        SN_1 a2 = this;
        b2.getClass();
        SN_1 sN_1 = a2;
        sN_1.data_ = b2;
        sN_1.dataCase_ = AQa.P;
    }

    private void l() {
        a.key_ = uSa.E;
    }

    public ByteString getIdBytes() {
        SN_1 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    public static /* synthetic */ void J(SN sN2, MN mN2) {
        Object b2 = mN2;
        SN a2 = sN2;
        super.J((MN)b2);
    }

    public static /* synthetic */ void J(SN sN2, int n2) {
        int b2 = n2;
        SN a2 = sN2;
        super.J(b2);
    }

    private void f() {
        SN_1 a2;
        if (a2.dataCase_ == AQa.P) {
            SN_1 sN_1 = a2;
            sN_1.dataCase_ = uSa.E;
            sN_1.data_ = null;
        }
    }

    public static SN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ SN J() {
        return DEFAULT_INSTANCE;
    }

    private void J(int n2) {
        int b2 = n2;
        SN_1 a2 = this;
        a2.kind_ = b2;
    }

    public static /* synthetic */ void J(SN sN2, String string) {
        Object b2 = string;
        SN a2 = sN2;
        super.J((String)b2);
    }

    public static SN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (SN_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static zm J(SN a2) {
        return (zm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Parser<SN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.id_ = SN_1.f().getId();
    }
}

