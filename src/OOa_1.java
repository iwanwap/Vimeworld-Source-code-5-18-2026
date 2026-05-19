/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aqa
 *  DB
 *  Epa
 *  Kra
 *  OOa
 *  Rua
 *  kPa
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
public final class OOa_1
extends GeneratedMessageLite<OOa, Kra>
implements DB {
    private static volatile Parser<OOa> PARSER;
    private boolean microExists_;
    private int protocolVersion_;
    private static final OOa DEFAULT_INSTANCE;
    public static final int MICRO_DISABLED_FIELD_NUMBER = 3;
    private boolean microDisabled_;
    public static final int MICRO_EXISTS_FIELD_NUMBER = 2;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;

    public static /* synthetic */ void f(OOa oOa2, boolean bl) {
        boolean b2 = bl;
        OOa a2 = oOa2;
        super.f(b2);
    }

    private void l() {
        a.microDisabled_ = uSa.E;
    }

    private void f() {
        a.microExists_ = uSa.E;
    }

    public static OOa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ OOa f() {
        return DEFAULT_INSTANCE;
    }

    public boolean getMicroExists() {
        OOa_1 a2;
        return a2.microExists_;
    }

    public static /* synthetic */ void l(OOa a2) {
        super.J();
    }

    public boolean getMicroDisabled() {
        OOa_1 a2;
        return a2.microDisabled_;
    }

    public static OOa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OOa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(OOa a2) {
        super.f();
    }

    public static OOa J() {
        return DEFAULT_INSTANCE;
    }

    public static OOa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OOa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OOa J(byte[] a2) throws InvalidProtocolBufferException {
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OOa f(InputStream a2) throws IOException {
        return (OOa_1)OOa_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static OOa J(InputStream a2) throws IOException {
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(OOa oOa2, int n2) {
        int b2 = n2;
        OOa a2 = oOa2;
        super.J(b2);
    }

    public static Parser<OOa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static OOa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(OOa a2) {
        super.l();
    }

    public static Kra J() {
        return (Kra)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(OOa oOa2, boolean bl) {
        boolean b2 = bl;
        OOa a2 = oOa2;
        super.J(b2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        OOa_1 a2 = this;
        a2.microDisabled_ = b2;
    }

    public int getProtocolVersion() {
        OOa_1 a2;
        return a2.protocolVersion_;
    }

    public static Kra J(OOa a2) {
        return (Kra)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        OOa_1 oOa_1 = new OOa_1();
        DEFAULT_INSTANCE = oOa_1;
        GeneratedMessageLite.registerDefaultInstance(OOa_1.class, oOa_1);
    }

    private void J() {
        a.protocolVersion_ = uSa.E;
    }

    public static OOa J(ByteString a2) throws InvalidProtocolBufferException {
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OOa J(CodedInputStream a2) throws IOException {
        return (OOa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        OOa_1 a2 = this;
        a2.microExists_ = b2;
    }

    private OOa_1() {
        OOa_1 a2;
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
        OOa_1 c2 = this;
        switch (Aqa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new OOa_1();
            }
            case 2: {
                return new Kra(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = kPa.N;
                objectArray[vRa.d] = Rua.M;
                objectArray[uqa.g] = KQa.e;
                d2 = objectArray;
                Object b2 = Epa.n;
                return OOa_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = OOa_1.class;
                synchronized (OOa_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<OOa>(DEFAULT_INSTANCE);
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

    public static OOa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OOa_1)OOa_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        OOa_1 a2 = this;
        a2.protocolVersion_ = b2;
    }
}

