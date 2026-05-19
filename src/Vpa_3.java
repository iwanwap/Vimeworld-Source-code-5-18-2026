/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Vpa
 *  XQa
 *  Ypa
 *  jsa
 *  qOa
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
public final class Vpa_3
extends GeneratedMessageLite<Vpa, qOa>
implements OB {
    private static volatile Parser<Vpa> PARSER;
    private long serverTime_;
    public static final int ROOM_STATE_FIELD_NUMBER = 1;
    private int roomState_;
    public static final int TIME_FIELD_NUMBER = 2;
    private static final Vpa DEFAULT_INSTANCE;
    private long time_;
    public static final int SERVER_TIME_FIELD_NUMBER = 3;

    public static Vpa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public int getRoomState() {
        Vpa_3 a2;
        return a2.roomState_;
    }

    public static Parser<Vpa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Vpa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static qOa J() {
        return (qOa)DEFAULT_INSTANCE.createBuilder();
    }

    public static Vpa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Vpa f(InputStream a2) throws IOException {
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Vpa a2) {
        super.J();
    }

    public static Vpa f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(Vpa b2, long a2) {
        super.J(a2);
    }

    public static Vpa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public long getTime() {
        Vpa_3 a2;
        return a2.time_;
    }

    public static Vpa J(ByteString a2) throws InvalidProtocolBufferException {
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ Vpa J() {
        return DEFAULT_INSTANCE;
    }

    private void l() {
        a.serverTime_ = nqa.i;
    }

    public static Vpa J(byte[] a2) throws InvalidProtocolBufferException {
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Vpa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Vpa vpa2, int n2) {
        int b2 = n2;
        Vpa a2 = vpa2;
        super.J(b2);
    }

    private Vpa_3() {
        Vpa_3 a2;
    }

    private void f() {
        a.time_ = nqa.i;
    }

    private void J() {
        a.roomState_ = uSa.E;
    }

    public static /* synthetic */ void J(Vpa b2, long a2) {
        super.f(a2);
    }

    public static Vpa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        Vpa_3 a2 = this;
        a2.roomState_ = b2;
    }

    public static /* synthetic */ void f(Vpa a2) {
        super.l();
    }

    public static Vpa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Vpa_3)Vpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Vpa a2) {
        super.f();
    }

    private void f(long a2) {
        b.serverTime_ = a2;
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
        Vpa_3 c2 = this;
        switch (XQa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Vpa_3();
            }
            case 2: {
                return new qOa(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = NTa.Fa;
                objectArray[vRa.d] = Asa.T;
                objectArray[uqa.g] = jsa.B;
                d2 = objectArray;
                Object b2 = Ypa.T;
                return Vpa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Vpa_3.class;
                synchronized (Vpa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Vpa>(DEFAULT_INSTANCE);
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

    public static Vpa J(InputStream a2) throws IOException {
        return (Vpa_3)Vpa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Vpa J(CodedInputStream a2) throws IOException {
        return (Vpa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(long a2) {
        b.time_ = a2;
    }

    static {
        Vpa_3 vpa_3 = new Vpa_3();
        DEFAULT_INSTANCE = vpa_3;
        GeneratedMessageLite.registerDefaultInstance(Vpa_3.class, vpa_3);
    }

    public static qOa J(Vpa a2) {
        return (qOa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public long getServerTime() {
        Vpa_3 a2;
        return a2.serverTime_;
    }
}

