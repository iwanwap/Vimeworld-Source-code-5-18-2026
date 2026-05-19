/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BA
 *  BRa
 *  ERa
 *  Rua
 *  Wsa
 *  eqa
 *  rPa
 *  tra
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
public final class eqa_2
extends GeneratedMessageLite<eqa, rPa>
implements BA {
    private static volatile Parser<eqa> PARSER;
    private boolean microDisabled_;
    public static final int MUTED_FIELD_NUMBER = 4;
    public static final int PLAYER_FIELD_NUMBER = 1;
    public static final int MICRO_EXISTS_FIELD_NUMBER = 2;
    private static final eqa DEFAULT_INSTANCE;
    public static final int MICRO_DISABLED_FIELD_NUMBER = 3;
    private String player_ = Mqa.y;
    private boolean muted_;
    private boolean microExists_;

    private void C() {
        a.muted_ = uSa.E;
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        eqa_2 a2 = this;
        a2.microDisabled_ = b2;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        eqa_2 a2 = this;
        Object object = b2;
        eqa_2.checkByteStringIsUtf8((ByteString)object);
        a2.player_ = ((ByteString)object).toStringUtf8();
    }

    public static Parser<eqa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean getMuted() {
        eqa_2 a2;
        return a2.muted_;
    }

    public static eqa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(eqa a2) {
        super.l();
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        eqa_2 a2 = this;
        a2.muted_ = b2;
    }

    public boolean getMicroExists() {
        eqa_2 a2;
        return a2.microExists_;
    }

    public ByteString getPlayerBytes() {
        eqa_2 a2;
        return ByteString.copyFromUtf8(a2.player_);
    }

    public static eqa f() {
        return DEFAULT_INSTANCE;
    }

    public String getPlayer() {
        eqa_2 a2;
        return a2.player_;
    }

    public static /* synthetic */ void J(eqa eqa2, String string) {
        Object b2 = string;
        eqa a2 = eqa2;
        super.J((String)b2);
    }

    private void l() {
        a.player_ = eqa_2.f().getPlayer();
    }

    public static eqa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (eqa_2)eqa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(eqa eqa2, boolean bl) {
        boolean b2 = bl;
        eqa a2 = eqa2;
        super.J(b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        eqa_2 a2 = this;
        a2.microExists_ = b2;
    }

    public static /* synthetic */ void J(eqa eqa2, ByteString byteString) {
        Object b2 = byteString;
        eqa a2 = eqa2;
        super.J((ByteString)b2);
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
        eqa_2 c2 = this;
        switch (tra.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new eqa_2();
            }
            case 2: {
                return new rPa(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = BRa.M;
                objectArray[vRa.d] = Rua.M;
                objectArray[uqa.g] = KQa.e;
                objectArray[yRa.d] = Wsa.P;
                d2 = objectArray;
                Object b2 = ERa.H;
                return eqa_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = eqa_2.class;
                synchronized (eqa_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<eqa>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void l(eqa a2) {
        super.f();
    }

    public boolean getMicroDisabled() {
        eqa_2 a2;
        return a2.microDisabled_;
    }

    public static /* synthetic */ void f(eqa eqa2, boolean bl) {
        boolean b2 = bl;
        eqa a2 = eqa2;
        super.f(b2);
    }

    public static eqa J(CodedInputStream a2) throws IOException {
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static rPa J(eqa a2) {
        return (rPa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static eqa f(InputStream a2) throws IOException {
        return (eqa_2)eqa_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static eqa J(byte[] a2) throws InvalidProtocolBufferException {
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static eqa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static eqa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ eqa J() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        a.microExists_ = uSa.E;
    }

    private void J() {
        a.microDisabled_ = uSa.E;
    }

    static {
        eqa_2 eqa_22 = new eqa_2();
        DEFAULT_INSTANCE = eqa_22;
        GeneratedMessageLite.registerDefaultInstance(eqa_2.class, eqa_22);
    }

    public static eqa J(ByteString a2) throws InvalidProtocolBufferException {
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static eqa J(InputStream a2) throws IOException {
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(eqa a2) {
        super.C();
    }

    private eqa_2() {
        eqa_2 a2;
    }

    public static eqa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(eqa a2) {
        super.J();
    }

    public static rPa J() {
        return (rPa)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(String string) {
        String b2 = string;
        eqa_2 a2 = this;
        b2.getClass();
        a2.player_ = b2;
    }

    public static eqa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(eqa eqa2, boolean bl) {
        boolean b2 = bl;
        eqa a2 = eqa2;
        super.l(b2);
    }

    public static eqa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (eqa_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }
}

