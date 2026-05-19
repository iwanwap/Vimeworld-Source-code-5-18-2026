/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Do
 *  Jm
 *  Jo
 *  XM
 *  Zn
 *  aSa
 *  bN
 *  fO
 *  nQa
 *  na
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
public final class bN_3
extends GeneratedMessageLite<bN, Jm>
implements na {
    private int kind_;
    private static final bN DEFAULT_INSTANCE;
    private Object data_;
    public static final int EDIT_FIELD_NUMBER = 4;
    public static final int ADD_FIELD_NUMBER = 2;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int REMOVEUUID_FIELD_NUMBER = 5;
    private int dataCase_ = uSa.E;
    public static final int REMOVE_FIELD_NUMBER = 3;
    private static volatile Parser<bN> PARSER;

    public static bN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static bN f(InputStream a2) throws IOException {
        return (bN_3)bN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public String getRemove() {
        bN_3 bN_32 = this;
        Object a2 = Mqa.y;
        if (bN_32.dataCase_ == yRa.d) {
            a2 = (String)bN_32.data_;
        }
        return a2;
    }

    static {
        bN_3 bN_32 = new bN_3();
        DEFAULT_INSTANCE = bN_32;
        GeneratedMessageLite.registerDefaultInstance(bN_3.class, bN_32);
    }

    private void J(int n2) {
        int b2 = n2;
        bN_3 a2 = this;
        a2.kind_ = b2;
    }

    private void f(fO fO2) {
        bN_3 b2 = fO2;
        bN_3 a2 = this;
        b2.getClass();
        bN_3 bN_32 = a2;
        bN_32.data_ = b2;
        bN_32.dataCase_ = AQa.P;
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
        bN_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new bN_3();
            }
            case 2: {
                return new Jm(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = aSa.u;
                objectArray[yRa.d] = XM.class;
                objectArray[AQa.P] = fO.class;
                d2 = objectArray;
                Object b2 = zpa.v;
                return bN_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = bN_3.class;
                synchronized (bN_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<bN>(DEFAULT_INSTANCE);
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

    public Do getKind() {
        bN_3 bN_32 = this;
        bN_3 a2 = Do.forNumber((int)bN_32.kind_);
        if (a2 == null) {
            return Do.UNRECOGNIZED;
        }
        return a2;
    }

    public XM getAdd() {
        bN_3 a2;
        if (a2.dataCase_ == uqa.g) {
            return (XM)a2.data_;
        }
        return XM.J();
    }

    public static bN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasRemoveUuid() {
        bN_3 a2;
        if (a2.dataCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasRemove() {
        bN_3 a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static bN J(byte[] a2) throws InvalidProtocolBufferException {
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ bN f() {
        return DEFAULT_INSTANCE;
    }

    public static Jm J() {
        return (Jm)DEFAULT_INSTANCE.createBuilder();
    }

    private bN_3() {
        bN_3 a2;
    }

    public static /* synthetic */ void e(bN a2) {
        super.e();
    }

    public static /* synthetic */ void f(bN bN2, fO fO2) {
        bN b2 = fO2;
        bN a2 = bN2;
        super.J((fO)b2);
    }

    public static /* synthetic */ void d(bN a2) {
        super.l();
    }

    public static /* synthetic */ void J(bN bN2, int n2) {
        int b2 = n2;
        bN a2 = bN2;
        super.J(b2);
    }

    public static /* synthetic */ void f(bN bN2, XM xM2) {
        bN b2 = xM2;
        bN a2 = bN2;
        super.J((XM)b2);
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        bN_3 a2 = this;
        b2.getClass();
        bN_3 bN_32 = a2;
        bN_32.dataCase_ = tTa.h;
        bN_32.data_ = b2;
    }

    public static bN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(XM xM2) {
        bN_3 bN_32;
        bN_3 b2 = xM2;
        bN_3 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uqa.g && a2.data_ != XM.J()) {
            a2.data_ = ((Jo)XM.J((XM)((XM)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            bN_32 = a2;
        } else {
            bN_32 = a2;
            a2.data_ = b2;
        }
        bN_32.dataCase_ = uqa.g;
    }

    public static /* synthetic */ void J(bN bN2, Do do_) {
        bN b2 = do_;
        bN a2 = bN2;
        super.J((Do)b2);
    }

    public ByteString getRemoveUuid() {
        bN_3 a2;
        if (a2.dataCase_ == tTa.h) {
            return (ByteString)a2.data_;
        }
        return ByteString.EMPTY;
    }

    private void J(ByteString byteString) {
        bN_3 a2;
        ByteString b2 = byteString;
        bN_3 bN_32 = a2 = this;
        bN_3.checkByteStringIsUtf8(b2);
        bN_32.data_ = b2.toStringUtf8();
        bN_32.dataCase_ = yRa.d;
    }

    public boolean hasEdit() {
        bN_3 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Jm J(bN a2) {
        return (Jm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(bN bN2, XM xM2) {
        bN b2 = xM2;
        bN a2 = bN2;
        super.f((XM)b2);
    }

    public fO getEdit() {
        bN_3 a2;
        if (a2.dataCase_ == AQa.P) {
            return (fO)a2.data_;
        }
        return fO.f();
    }

    public static /* synthetic */ void f(bN bN2, ByteString byteString) {
        Object b2 = byteString;
        bN a2 = bN2;
        super.f((ByteString)b2);
    }

    public static bN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        bN_3 a2 = this;
        b2.getClass();
        bN_3 bN_32 = a2;
        bN_32.dataCase_ = yRa.d;
        bN_32.data_ = b2;
    }

    private void J(Do do_) {
        bN_3 b2 = do_;
        bN_3 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    public static bN J(ByteString a2) throws InvalidProtocolBufferException {
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static bN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (bN_3)bN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getKindValue() {
        bN_3 a2;
        return a2.kind_;
    }

    private void e() {
        bN_3 a2;
        if (a2.dataCase_ == AQa.P) {
            bN_3 bN_32 = a2;
            bN_32.dataCase_ = uSa.E;
            bN_32.data_ = null;
        }
    }

    public static Parser<bN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void d() {
        a.kind_ = uSa.E;
    }

    private void J(XM xM2) {
        bN_3 b2 = xM2;
        bN_3 a2 = this;
        b2.getClass();
        bN_3 bN_32 = a2;
        bN_32.data_ = b2;
        bN_32.dataCase_ = uqa.g;
    }

    public static bN J() {
        return DEFAULT_INSTANCE;
    }

    public static bN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(bN bN2, ByteString byteString) {
        Object b2 = byteString;
        bN a2 = bN2;
        super.J((ByteString)b2);
    }

    private void C() {
        bN_3 a2;
        if (a2.dataCase_ == uqa.g) {
            bN_3 bN_32 = a2;
            bN_32.dataCase_ = uSa.E;
            bN_32.data_ = null;
        }
    }

    public ByteString getRemoveBytes() {
        bN_3 bN_32 = this;
        Object a2 = Mqa.y;
        if (bN_32.dataCase_ == yRa.d) {
            a2 = (String)bN_32.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public iM getDataCase() {
        bN_3 a2;
        return iM.forNumber(a2.dataCase_);
    }

    public static /* synthetic */ void C(bN a2) {
        super.d();
    }

    private void J(fO fO2) {
        bN_3 bN_32;
        bN_3 b2 = fO2;
        bN_3 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == AQa.P && a2.data_ != fO.f()) {
            a2.data_ = ((Zn)fO.J((fO)((fO)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            bN_32 = a2;
        } else {
            bN_32 = a2;
            a2.data_ = b2;
        }
        bN_32.dataCase_ = AQa.P;
    }

    private void l() {
        bN_3 a2;
        if (a2.dataCase_ == yRa.d) {
            bN_3 bN_32 = a2;
            bN_32.dataCase_ = uSa.E;
            bN_32.data_ = null;
        }
    }

    public static /* synthetic */ void l(bN a2) {
        super.J();
    }

    private void f() {
        bN_3 a2;
        if (a2.dataCase_ == tTa.h) {
            bN_3 bN_32 = a2;
            bN_32.dataCase_ = uSa.E;
            bN_32.data_ = null;
        }
    }

    public static /* synthetic */ void J(bN bN2, fO fO2) {
        bN b2 = fO2;
        bN a2 = bN2;
        super.f((fO)b2);
    }

    public static bN J(InputStream a2) throws IOException {
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasAdd() {
        bN_3 a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(bN a2) {
        super.f();
    }

    public static /* synthetic */ void J(bN bN2, String string) {
        Object b2 = string;
        bN a2 = bN2;
        super.J((String)b2);
    }

    private void J() {
        bN_3 a2;
        bN_3 bN_32 = a2;
        bN_32.dataCase_ = uSa.E;
        bN_32.data_ = null;
    }

    public static bN J(CodedInputStream a2) throws IOException {
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static bN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (bN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(bN a2) {
        super.C();
    }
}

