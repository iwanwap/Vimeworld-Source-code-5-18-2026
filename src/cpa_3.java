/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rua
 *  bPa
 *  cpa
 *  lA
 *  vRa
 *  xQa
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
public final class cpa_3
extends GeneratedMessageLite<cpa, xQa>
implements lA {
    private boolean microDisabled_;
    private static final cpa DEFAULT_INSTANCE;
    private boolean microExists_;
    public static final int MICRO_EXISTS_FIELD_NUMBER = 1;
    public static final int MICRO_DISABLED_FIELD_NUMBER = 2;
    private static volatile Parser<cpa> PARSER;

    public static cpa J(ByteString a2) throws InvalidProtocolBufferException {
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static cpa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cpa_3)cpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean getMicroExists() {
        cpa_3 a2;
        return a2.microExists_;
    }

    public static Parser<cpa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static cpa f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(cpa cpa2, boolean bl2) {
        boolean b2 = bl2;
        cpa a2 = cpa2;
        super.J(b2);
    }

    static {
        cpa_3 cpa_32 = new cpa_3();
        DEFAULT_INSTANCE = cpa_32;
        GeneratedMessageLite.registerDefaultInstance(cpa_3.class, cpa_32);
    }

    public boolean getMicroDisabled() {
        cpa_3 a2;
        return a2.microDisabled_;
    }

    public static cpa J(byte[] a2) throws InvalidProtocolBufferException {
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        cpa_3 c2 = this;
        switch (bPa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new cpa_3();
            }
            case 2: {
                return new xQa(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = Rua.M;
                objectArray[vRa.d] = KQa.e;
                d2 = objectArray;
                Object b2 = qQa.d;
                return cpa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = cpa_3.class;
                synchronized (cpa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<cpa>(DEFAULT_INSTANCE);
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

    public static xQa J() {
        return (xQa)DEFAULT_INSTANCE.createBuilder();
    }

    public static cpa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static cpa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static xQa J(cpa a2) {
        return (xQa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void f(boolean bl2) {
        boolean b2 = bl2;
        cpa_3 a2 = this;
        a2.microExists_ = b2;
    }

    public static cpa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.microDisabled_ = uSa.E;
    }

    private cpa_3() {
        cpa_3 a2;
    }

    public static cpa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(boolean bl2) {
        boolean b2 = bl2;
        cpa_3 a2 = this;
        a2.microDisabled_ = b2;
    }

    public static /* synthetic */ void f(cpa a2) {
        super.f();
    }

    public static cpa f(InputStream a2) throws IOException {
        return (cpa_3)cpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.microExists_ = uSa.E;
    }

    public static cpa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(cpa a2) {
        super.J();
    }

    public static cpa J(InputStream a2) throws IOException {
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static cpa J(CodedInputStream a2) throws IOException {
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(cpa cpa2, boolean bl2) {
        boolean b2 = bl2;
        cpa a2 = cpa2;
        super.f(b2);
    }

    public static /* synthetic */ cpa J() {
        return DEFAULT_INSTANCE;
    }

    public static cpa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (cpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

