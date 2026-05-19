/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Jd
 *  kpa
 *  so
 *  vRa
 *  xn
 *  yra
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
public final class so_3
extends GeneratedMessageLite<so, xn>
implements Jd {
    public static final int PORT_FIELD_NUMBER = 4;
    public static final int HOST_FIELD_NUMBER = 3;
    private static volatile Parser<so> PARSER;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private static final so DEFAULT_INSTANCE;
    private ByteString token_ = ByteString.EMPTY;
    private int port_;
    private String host_;
    public static final int KEY_FIELD_NUMBER = 2;
    private ByteString key_ = ByteString.EMPTY;

    public static so f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (so_3)so_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C() {
        a.key_ = so_3.J().getKey();
    }

    public static so J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getHostBytes() {
        so_3 a2;
        return ByteString.copyFromUtf8(a2.host_);
    }

    private void l() {
        a.port_ = uSa.E;
    }

    public static /* synthetic */ so f() {
        return DEFAULT_INSTANCE;
    }

    public static so f(InputStream a2) throws IOException {
        return (so_3)so_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
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
        so_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new so_3();
            }
            case 2: {
                return new xn(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = kpa.N;
                objectArray[vRa.d] = rSa.C;
                objectArray[uqa.g] = eua.ja;
                objectArray[yRa.d] = GPa.z;
                d2 = objectArray;
                Object b2 = yra.K;
                return so_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = so_3.class;
                synchronized (so_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<so>(DEFAULT_INSTANCE);
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

    public ByteString getToken() {
        so_3 a2;
        return a2.token_;
    }

    public static so J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static so J() {
        return DEFAULT_INSTANCE;
    }

    public static so J(CodedInputStream a2) throws IOException {
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private so_3() {
        so_3 a2;
        a2.host_ = Mqa.y;
    }

    public static /* synthetic */ void C(so a2) {
        super.f();
    }

    public static /* synthetic */ void J(so so2, int n2) {
        int b2 = n2;
        so a2 = so2;
        super.J(b2);
    }

    public static xn J(so a2) {
        return (xn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void l(so so2, ByteString byteString) {
        Object b2 = byteString;
        so a2 = so2;
        super.f((ByteString)b2);
    }

    public static so J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(so a2) {
        super.l();
    }

    static {
        so_3 so_32 = new so_3();
        DEFAULT_INSTANCE = so_32;
        GeneratedMessageLite.registerDefaultInstance(so_3.class, so_32);
    }

    private void f() {
        a.token_ = so_3.J().getToken();
    }

    public static so J(ByteString a2) throws InvalidProtocolBufferException {
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        so_3 a2 = this;
        b2.getClass();
        a2.key_ = b2;
    }

    public int getPort() {
        so_3 a2;
        return a2.port_;
    }

    public static /* synthetic */ void f(so so2, ByteString byteString) {
        Object b2 = byteString;
        so a2 = so2;
        super.l((ByteString)b2);
    }

    public static /* synthetic */ void f(so a2) {
        super.C();
    }

    public static so J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(so so2, ByteString byteString) {
        Object b2 = byteString;
        so a2 = so2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void J(so a2) {
        super.J();
    }

    private void J() {
        a.host_ = so_3.J().getHost();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        so_3 a2 = this;
        b2.getClass();
        a2.token_ = b2;
    }

    public static xn J() {
        return (xn)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(int n2) {
        int b2 = n2;
        so_3 a2 = this;
        a2.port_ = b2;
    }

    private void J(String string) {
        String b2 = string;
        so_3 a2 = this;
        b2.getClass();
        a2.host_ = b2;
    }

    public ByteString getKey() {
        so_3 a2;
        return a2.key_;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        so_3 a2 = this;
        Object object = b2;
        so_3.checkByteStringIsUtf8((ByteString)object);
        a2.host_ = ((ByteString)object).toStringUtf8();
    }

    public static /* synthetic */ void J(so so2, String string) {
        Object b2 = string;
        so a2 = so2;
        super.J((String)b2);
    }

    public static so J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getHost() {
        so_3 a2;
        return a2.host_;
    }

    public static so J(InputStream a2) throws IOException {
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static so J(byte[] a2) throws InvalidProtocolBufferException {
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static so J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (so_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<so> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

