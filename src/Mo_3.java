/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  IM
 *  JA
 *  Mo
 *  dM
 *  vM
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
public final class Mo_3
extends GeneratedMessageLite<Mo, IM>
implements JA {
    private Object result_;
    private static final Mo DEFAULT_INSTANCE;
    public static final int SUCCESS_FIELD_NUMBER = 3;
    public static final int PROMO_FIELD_NUMBER = 1;
    private static volatile Parser<Mo> PARSER;
    private int resultCase_ = uSa.E;
    public static final int ERRORTYPE_FIELD_NUMBER = 2;
    private String promo_ = Mqa.y;

    public static Mo J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(Mo a2) {
        super.f();
    }

    public boolean hasErrorType() {
        Mo_3 a2;
        if (a2.resultCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static IM J(Mo a2) {
        return (IM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void f(vM vM2) {
        Mo_3 b2 = vM2;
        Mo_3 a2 = this;
        b2.getClass();
        Mo_3 mo_3 = a2;
        mo_3.result_ = b2;
        mo_3.resultCase_ = yRa.d;
    }

    public static /* synthetic */ void l(Mo a2) {
        super.l();
    }

    private void C() {
        Mo_3 a2;
        if (a2.resultCase_ == uqa.g) {
            Mo_3 mo_3 = a2;
            mo_3.resultCase_ = uSa.E;
            mo_3.result_ = null;
        }
    }

    public static /* synthetic */ Mo f() {
        return DEFAULT_INSTANCE;
    }

    private void f(String string) {
        String b2 = string;
        Mo_3 a2 = this;
        b2.getClass();
        a2.promo_ = b2;
    }

    public static Mo f(InputStream a2) throws IOException {
        return (Mo_3)Mo_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Mo mo2, ByteString byteString) {
        Object b2 = byteString;
        Mo a2 = mo2;
        super.J((ByteString)b2);
    }

    private void f(ByteString byteString) {
        Mo_3 a2;
        ByteString b2 = byteString;
        Mo_3 mo_3 = a2 = this;
        Mo_3.checkByteStringIsUtf8(b2);
        mo_3.result_ = b2.toStringUtf8();
        mo_3.resultCase_ = uqa.g;
    }

    private void l() {
        a.promo_ = Mo_3.J().getPromo();
    }

    public dM getResultCase() {
        Mo_3 a2;
        return dM.forNumber((int)a2.resultCase_);
    }

    public static Mo J() {
        return DEFAULT_INSTANCE;
    }

    private void J(vM vM2) {
        Mo_3 mo_3;
        Mo_3 b2 = vM2;
        Mo_3 a2 = this;
        b2.getClass();
        if (a2.resultCase_ == yRa.d && a2.result_ != vM.J()) {
            a2.result_ = ((kN)vM.J((vM)((vM)a2.result_)).mergeFrom(b2)).buildPartial();
            mo_3 = a2;
        } else {
            mo_3 = a2;
            a2.result_ = b2;
        }
        mo_3.resultCase_ = yRa.d;
    }

    static {
        Mo_3 mo_3 = new Mo_3();
        DEFAULT_INSTANCE = mo_3;
        GeneratedMessageLite.registerDefaultInstance(Mo_3.class, mo_3);
    }

    public static Mo J(byte[] a2) throws InvalidProtocolBufferException {
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        Mo_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Mo_3();
            }
            case 2: {
                return new IM(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = rRa.h;
                objectArray[vRa.d] = FRa.Ha;
                objectArray[uqa.g] = Fua.p;
                objectArray[yRa.d] = vM.class;
                d2 = objectArray;
                Object b2 = Ura.ja;
                return Mo_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Mo_3.class;
                synchronized (Mo_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Mo>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(Mo a2) {
        super.C();
    }

    public static /* synthetic */ void J(Mo a2) {
        super.J();
    }

    public static Mo J(InputStream a2) throws IOException {
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasSuccess() {
        Mo_3 a2;
        if (a2.resultCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getPromo() {
        Mo_3 a2;
        return a2.promo_;
    }

    public ByteString getErrorTypeBytes() {
        Mo_3 mo_3 = this;
        Object a2 = Mqa.y;
        if (mo_3.resultCase_ == uqa.g) {
            a2 = (String)mo_3.result_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ void f(Mo mo2, vM vM2) {
        Mo b2 = vM2;
        Mo a2 = mo2;
        super.J((vM)b2);
    }

    public static Mo J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Mo_3 a2 = this;
        Object object = b2;
        Mo_3.checkByteStringIsUtf8((ByteString)object);
        a2.promo_ = ((ByteString)object).toStringUtf8();
    }

    public static Mo J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getErrorType() {
        Mo_3 mo_3 = this;
        Object a2 = Mqa.y;
        if (mo_3.resultCase_ == uqa.g) {
            a2 = (String)mo_3.result_;
        }
        return a2;
    }

    public static Mo f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Mo_3)Mo_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getPromoBytes() {
        Mo_3 a2;
        return ByteString.copyFromUtf8(a2.promo_);
    }

    private void f() {
        Mo_3 a2;
        Mo_3 mo_3 = a2;
        mo_3.resultCase_ = uSa.E;
        mo_3.result_ = null;
    }

    public static Mo J(ByteString a2) throws InvalidProtocolBufferException {
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Mo mo2, ByteString byteString) {
        Object b2 = byteString;
        Mo a2 = mo2;
        super.f((ByteString)b2);
    }

    public static Mo J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public vM getSuccess() {
        Mo_3 a2;
        if (a2.resultCase_ == yRa.d) {
            return (vM)a2.result_;
        }
        return vM.J();
    }

    private void J() {
        Mo_3 a2;
        if (a2.resultCase_ == yRa.d) {
            Mo_3 mo_3 = a2;
            mo_3.resultCase_ = uSa.E;
            mo_3.result_ = null;
        }
    }

    public static Parser<Mo> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Mo J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void f(Mo mo2, String string) {
        Object b2 = string;
        Mo a2 = mo2;
        super.f((String)b2);
    }

    public static Mo J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        Mo_3 a2 = this;
        b2.getClass();
        Mo_3 mo_3 = a2;
        mo_3.resultCase_ = uqa.g;
        mo_3.result_ = b2;
    }

    public static IM J() {
        return (IM)DEFAULT_INSTANCE.createBuilder();
    }

    public static Mo J(CodedInputStream a2) throws IOException {
        return (Mo_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private Mo_3() {
        Mo_3 a2;
    }

    public static /* synthetic */ void J(Mo mo2, vM vM2) {
        Mo b2 = vM2;
        Mo a2 = mo2;
        super.f((vM)b2);
    }

    public static /* synthetic */ void J(Mo mo2, String string) {
        Object b2 = string;
        Mo a2 = mo2;
        super.J((String)b2);
    }
}

