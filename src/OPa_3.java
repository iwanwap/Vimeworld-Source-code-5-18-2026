/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  DRa
 *  NTa
 *  OPa
 *  Xb
 *  epa
 *  pQa
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
public final class OPa_3
extends GeneratedMessageLite<OPa, epa>
implements Xb {
    private String player_ = Mqa.y;
    public static final int ROOM_STATE_FIELD_NUMBER = 1;
    private static final OPa DEFAULT_INSTANCE;
    public static final int PLAYER_FIELD_NUMBER = 2;
    private int roomState_;
    private static volatile Parser<OPa> PARSER;

    public static epa J(OPa a2) {
        return (epa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static OPa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(OPa oPa, int n2) {
        int b2 = n2;
        OPa a2 = oPa;
        super.J(b2);
    }

    private void J(String string) {
        String b2 = string;
        OPa_3 a2 = this;
        b2.getClass();
        a2.player_ = b2;
    }

    private void f() {
        a.roomState_ = uSa.E;
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
        OPa_3 c2 = this;
        switch (DRa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new OPa_3();
            }
            case 2: {
                return new epa(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = NTa.Fa;
                objectArray[vRa.d] = BRa.M;
                d2 = objectArray;
                Object b2 = pQa.y;
                return OPa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = OPa_3.class;
                synchronized (OPa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<OPa>(DEFAULT_INSTANCE);
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

    public static OPa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OPa_3)OPa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        OPa_3 oPa_3 = new OPa_3();
        DEFAULT_INSTANCE = oPa_3;
        GeneratedMessageLite.registerDefaultInstance(OPa_3.class, oPa_3);
    }

    public static OPa f() {
        return DEFAULT_INSTANCE;
    }

    public static epa J() {
        return (epa)DEFAULT_INSTANCE.createBuilder();
    }

    private OPa_3() {
        OPa_3 a2;
    }

    public static /* synthetic */ void J(OPa oPa, ByteString byteString) {
        Object b2 = byteString;
        OPa a2 = oPa;
        super.J((ByteString)b2);
    }

    public static OPa f(InputStream a2) throws IOException {
        return (OPa_3)OPa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        OPa_3 a2 = this;
        Object object = b2;
        OPa_3.checkByteStringIsUtf8((ByteString)object);
        a2.player_ = ((ByteString)object).toStringUtf8();
    }

    public static OPa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(OPa oPa, String string) {
        Object b2 = string;
        OPa a2 = oPa;
        super.J((String)b2);
    }

    public static /* synthetic */ void f(OPa a2) {
        super.f();
    }

    public String getPlayer() {
        OPa_3 a2;
        return a2.player_;
    }

    public static OPa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<OPa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static OPa J(InputStream a2) throws IOException {
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getRoomState() {
        OPa_3 a2;
        return a2.roomState_;
    }

    public static /* synthetic */ OPa J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        a.player_ = OPa_3.f().getPlayer();
    }

    public static /* synthetic */ void J(OPa a2) {
        super.J();
    }

    public static OPa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OPa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OPa J(CodedInputStream a2) throws IOException {
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public ByteString getPlayerBytes() {
        OPa_3 a2;
        return ByteString.copyFromUtf8(a2.player_);
    }

    public static OPa J(ByteString a2) throws InvalidProtocolBufferException {
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OPa J(byte[] a2) throws InvalidProtocolBufferException {
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        OPa_3 a2 = this;
        a2.roomState_ = b2;
    }

    public static OPa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (OPa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

