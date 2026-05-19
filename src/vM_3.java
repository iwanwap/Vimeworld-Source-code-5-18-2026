/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
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
public final class vM_3
extends GeneratedMessageLite<vM, kN>
implements sc {
    private static volatile Parser<vM> PARSER;
    private static final vM DEFAULT_INSTANCE;
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int INFO_FIELD_NUMBER = 1;
    private String action_;
    private String info_ = Mqa.y;

    public static vM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public String getAction() {
        vM_3 a2;
        return a2.action_;
    }

    private vM_3() {
        vM_3 a2;
        a2.action_ = Mqa.y;
    }

    @Override
    public ByteString getInfoBytes() {
        vM_3 a2;
        return ByteString.copyFromUtf8(a2.info_);
    }

    public static kN J(vM a2) {
        return (kN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public ByteString getActionBytes() {
        vM_3 a2;
        return ByteString.copyFromUtf8(a2.action_);
    }

    private void f() {
        a.info_ = vM_3.J().getInfo();
    }

    @Override
    public String getInfo() {
        vM_3 a2;
        return a2.info_;
    }

    public static vM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static vM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<vM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ vM f() {
        return DEFAULT_INSTANCE;
    }

    public static vM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (vM_3)vM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static vM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(vM a2) {
        super.f();
    }

    public static vM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.action_ = vM_3.J().getAction();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        vM_3 a2 = this;
        Object object = b2;
        vM_3.checkByteStringIsUtf8((ByteString)object);
        a2.action_ = ((ByteString)object).toStringUtf8();
    }

    public static /* synthetic */ void f(vM vM2, ByteString byteString) {
        Object b2 = byteString;
        vM a2 = vM2;
        super.f((ByteString)b2);
    }

    public static /* synthetic */ void f(vM vM2, String string) {
        Object b2 = string;
        vM a2 = vM2;
        super.J((String)b2);
    }

    public static /* synthetic */ void J(vM vM2, ByteString byteString) {
        Object b2 = byteString;
        vM a2 = vM2;
        super.J((ByteString)b2);
    }

    public static vM J(ByteString a2) throws InvalidProtocolBufferException {
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vM f(InputStream a2) throws IOException {
        return (vM_3)vM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(vM a2) {
        super.J();
    }

    public static vM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        vM_3 vM_32 = new vM_3();
        DEFAULT_INSTANCE = vM_32;
        GeneratedMessageLite.registerDefaultInstance(vM_3.class, vM_32);
    }

    public static vM J(InputStream a2) throws IOException {
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(vM vM2, String string) {
        Object b2 = string;
        vM a2 = vM2;
        super.f((String)b2);
    }

    public static kN J() {
        return (kN)DEFAULT_INSTANCE.createBuilder();
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
        vM_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new vM_3();
            }
            case 2: {
                return new kN(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = ypa.T;
                objectArray[vRa.d] = Hta.m;
                d2 = objectArray;
                Object b2 = ITa.z;
                return vM_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = vM_3.class;
                synchronized (vM_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<vM>(DEFAULT_INSTANCE);
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

    public static vM J(byte[] a2) throws InvalidProtocolBufferException {
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vM J(CodedInputStream a2) throws IOException {
        return (vM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        vM_3 a2 = this;
        Object object = b2;
        vM_3.checkByteStringIsUtf8((ByteString)object);
        a2.info_ = ((ByteString)object).toStringUtf8();
    }

    private void f(String string) {
        String b2 = string;
        vM_3 a2 = this;
        b2.getClass();
        a2.info_ = b2;
    }

    private void J(String string) {
        String b2 = string;
        vM_3 a2 = this;
        b2.getClass();
        a2.action_ = b2;
    }

    public static vM J() {
        return DEFAULT_INSTANCE;
    }
}

