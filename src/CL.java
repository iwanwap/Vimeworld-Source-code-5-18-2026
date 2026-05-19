/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DJ
 *  Jo
 *  Ul
 *  XM
 *  Zn
 *  aSa
 *  fO
 *  nQa
 *  rj
 *  vRa
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
public final class CL
extends GeneratedMessageLite<CL, rj>
implements R {
    private int kind_;
    public static final int KIND_FIELD_NUMBER = 1;
    private int dataCase_ = uSa.E;
    public static final int EDIT_FIELD_NUMBER = 4;
    public static final int REMOVE_FIELD_NUMBER = 3;
    private static volatile Parser<CL> PARSER;
    private static final CL DEFAULT_INSTANCE;
    public static final int ADD_FIELD_NUMBER = 2;
    private Object data_;

    @Override
    public ByteString getRemoveBytes() {
        CL cL = this;
        Object a2 = Mqa.y;
        if (cL.dataCase_ == yRa.d) {
            a2 = (String)cL.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    @Override
    public XM getAdd() {
        CL a2;
        if (a2.dataCase_ == uqa.g) {
            return (XM)a2.data_;
        }
        return XM.J();
    }

    public static CL f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(fO fO2) {
        CL cL;
        CL b2 = fO2;
        CL a2 = this;
        b2.getClass();
        if (a2.dataCase_ == AQa.P && a2.data_ != fO.f()) {
            a2.data_ = ((Zn)fO.J((fO)((fO)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            cL = a2;
        } else {
            cL = a2;
            a2.data_ = b2;
        }
        cL.dataCase_ = AQa.P;
    }

    public static /* synthetic */ void d(CL a2) {
        a2.l();
    }

    public static /* synthetic */ void C(CL a2) {
        a2.f();
    }

    public static /* synthetic */ void J(CL cL, ByteString byteString) {
        ByteString b2 = byteString;
        CL a2 = cL;
        a2.J(b2);
    }

    private void J(Ul ul2) {
        CL b2 = ul2;
        CL a2 = this;
        a2.kind_ = b2.getNumber();
    }

    public static Parser<CL> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f(XM xM) {
        CL cL;
        CL b2 = xM;
        CL a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uqa.g && a2.data_ != XM.J()) {
            a2.data_ = ((Jo)XM.J((XM)((XM)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            cL = a2;
        } else {
            cL = a2;
            a2.data_ = b2;
        }
        cL.dataCase_ = uqa.g;
    }

    public static CL f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasRemove() {
        CL a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(CL a2) {
        a2.d();
    }

    public static CL J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static CL J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public String getRemove() {
        CL cL = this;
        Object a2 = Mqa.y;
        if (cL.dataCase_ == yRa.d) {
            a2 = (String)cL.data_;
        }
        return a2;
    }

    public static /* synthetic */ void J(CL cL, String string) {
        String b2 = string;
        CL a2 = cL;
        a2.J(b2);
    }

    public static CL J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return CL.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static CL J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(fO fO2) {
        CL b2 = fO2;
        CL a2 = this;
        b2.getClass();
        CL cL = a2;
        cL.data_ = b2;
        cL.dataCase_ = AQa.P;
    }

    private void d() {
        a.kind_ = uSa.E;
    }

    public static CL J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static CL J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasAdd() {
        CL a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        CL a2;
        if (a2.dataCase_ == AQa.P) {
            CL cL = a2;
            cL.dataCase_ = uSa.E;
            cL.data_ = null;
        }
    }

    public static /* synthetic */ void f(CL cL, XM xM) {
        CL b2 = xM;
        CL a2 = cL;
        a2.J((XM)b2);
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
        CL c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new CL();
            }
            case 2: {
                return new rj(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = aSa.u;
                objectArray[yRa.d] = XM.class;
                objectArray[AQa.P] = fO.class;
                d2 = objectArray;
                Object b2 = Ura.h;
                return CL.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = CL.class;
                synchronized (CL.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<CL>(DEFAULT_INSTANCE);
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

    public static CL J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        CL a2 = this;
        a2.kind_ = b2;
    }

    public static rj J(CL a2) {
        return (rj)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public fO getEdit() {
        CL a2;
        if (a2.dataCase_ == AQa.P) {
            return (fO)a2.data_;
        }
        return fO.f();
    }

    public static /* synthetic */ void J(CL cL, XM xM) {
        CL b2 = xM;
        CL a2 = cL;
        a2.f((XM)b2);
    }

    @Override
    public boolean hasEdit() {
        CL a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static CL J(InputStream a2) throws IOException {
        return CL.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ CL f() {
        return DEFAULT_INSTANCE;
    }

    private CL() {
        CL a2;
    }

    private void J(String string) {
        String b2 = string;
        CL a2 = this;
        b2.getClass();
        CL cL = a2;
        cL.dataCase_ = yRa.d;
        cL.data_ = b2;
    }

    static {
        CL cL;
        DEFAULT_INSTANCE = cL = new CL();
        GeneratedMessageLite.registerDefaultInstance(CL.class, cL);
    }

    public static /* synthetic */ void J(CL cL, int n2) {
        int b2 = n2;
        CL a2 = cL;
        a2.J(b2);
    }

    private void l() {
        CL a2;
        if (a2.dataCase_ == uqa.g) {
            CL cL = a2;
            cL.dataCase_ = uSa.E;
            cL.data_ = null;
        }
    }

    public static CL J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public DJ getDataCase() {
        CL a2;
        return DJ.forNumber((int)a2.dataCase_);
    }

    public static CL J() {
        return DEFAULT_INSTANCE;
    }

    private void J(XM xM) {
        CL b2 = xM;
        CL a2 = this;
        b2.getClass();
        CL cL = a2;
        cL.data_ = b2;
        cL.dataCase_ = uqa.g;
    }

    private void J(ByteString byteString) {
        CL a2;
        ByteString b2 = byteString;
        CL cL = a2 = this;
        CL.checkByteStringIsUtf8(b2);
        cL.data_ = b2.toStringUtf8();
        cL.dataCase_ = yRa.d;
    }

    @Override
    public int getKindValue() {
        CL a2;
        return a2.kind_;
    }

    private void f() {
        CL a2;
        CL cL = a2;
        cL.dataCase_ = uSa.E;
        cL.data_ = null;
    }

    public static /* synthetic */ void f(CL a2) {
        a2.J();
    }

    public static /* synthetic */ void J(CL a2) {
        a2.C();
    }

    private void J() {
        CL a2;
        if (a2.dataCase_ == yRa.d) {
            CL cL = a2;
            cL.dataCase_ = uSa.E;
            cL.data_ = null;
        }
    }

    public static /* synthetic */ void f(CL cL, fO fO2) {
        CL b2 = fO2;
        CL a2 = cL;
        a2.f((fO)b2);
    }

    public static /* synthetic */ void J(CL cL, Ul ul2) {
        CL b2 = ul2;
        CL a2 = cL;
        a2.J((Ul)b2);
    }

    public static CL J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public Ul getKind() {
        CL cL = this;
        CL a2 = Ul.forNumber((int)cL.kind_);
        if (a2 == null) {
            return Ul.UNRECOGNIZED;
        }
        return a2;
    }

    public static rj J() {
        return (rj)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(CL cL, fO fO2) {
        CL b2 = fO2;
        CL a2 = cL;
        a2.J((fO)b2);
    }
}

