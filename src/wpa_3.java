/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Wsa
 *  XA
 *  bra
 *  rOa
 *  vRa
 *  wpa
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
public final class wpa_3
extends GeneratedMessageLite<wpa, rOa>
implements XA {
    private boolean muted_;
    private int roomState_;
    private static volatile Parser<wpa> PARSER;
    private static final wpa DEFAULT_INSTANCE;
    public static final int ROOM_STATE_FIELD_NUMBER = 1;
    public static final int MUTED_FIELD_NUMBER = 2;

    public static Parser<wpa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void f(wpa a2) {
        super.f();
    }

    public static wpa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static rOa J() {
        return (rOa)DEFAULT_INSTANCE.createBuilder();
    }

    public static wpa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static wpa f(InputStream a2) throws IOException {
        return (wpa_3)wpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean getMuted() {
        wpa_3 a2;
        return a2.muted_;
    }

    public static wpa f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(wpa wpa2, int n2) {
        int b2 = n2;
        wpa a2 = wpa2;
        super.J(b2);
    }

    public static wpa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (wpa_3)wpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ wpa J() {
        return DEFAULT_INSTANCE;
    }

    static {
        wpa_3 wpa_32 = new wpa_3();
        DEFAULT_INSTANCE = wpa_32;
        GeneratedMessageLite.registerDefaultInstance(wpa_3.class, wpa_32);
    }

    private wpa_3() {
        wpa_3 a2;
    }

    public static wpa J(ByteString a2) throws InvalidProtocolBufferException {
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        wpa_3 c2 = this;
        switch (bra.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new wpa_3();
            }
            case 2: {
                return new rOa(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = NTa.Fa;
                objectArray[vRa.d] = Wsa.P;
                d2 = objectArray;
                Object b2 = rua.ga;
                return wpa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = wpa_3.class;
                synchronized (wpa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<wpa>(DEFAULT_INSTANCE);
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

    public static wpa J(InputStream a2) throws IOException {
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static wpa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.roomState_ = uSa.E;
    }

    private void J(int n2) {
        int b2 = n2;
        wpa_3 a2 = this;
        a2.roomState_ = b2;
    }

    public static /* synthetic */ void J(wpa wpa2, boolean bl) {
        boolean b2 = bl;
        wpa a2 = wpa2;
        super.J(b2);
    }

    public static wpa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.muted_ = uSa.E;
    }

    public static /* synthetic */ void J(wpa a2) {
        super.J();
    }

    public static wpa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static wpa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getRoomState() {
        wpa_3 a2;
        return a2.roomState_;
    }

    public static rOa J(wpa a2) {
        return (rOa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static wpa J(CodedInputStream a2) throws IOException {
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static wpa J(byte[] a2) throws InvalidProtocolBufferException {
        return (wpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        wpa_3 a2 = this;
        a2.muted_ = b2;
    }
}

