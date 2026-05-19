/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Sd
 *  nQa
 *  spa
 *  vRa
 *  vra
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
public final class Dra
extends GeneratedMessageLite<Dra, spa>
implements Sd {
    private ByteString data_;
    public static final int PLAYER_FIELD_NUMBER = 1;
    private static volatile Parser<Dra> PARSER;
    private long sequenceNumber_;
    public static final int DATA_FIELD_NUMBER = 4;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 3;
    public static final int AUDIO_SESSION_FIELD_NUMBER = 2;
    private String player_ = Mqa.y;
    private static final Dra DEFAULT_INSTANCE;
    private int audioSession_;

    private void J(String string) {
        String b2 = string;
        Dra a2 = this;
        b2.getClass();
        a2.player_ = b2;
    }

    public static Parser<Dra> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Dra J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Dra J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Dra dra;
        DEFAULT_INSTANCE = dra = new Dra();
        GeneratedMessageLite.registerDefaultInstance(Dra.class, dra);
    }

    public static Dra f(InputStream a2) throws IOException {
        return Dra.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Dra dra, ByteString byteString) {
        ByteString b2 = byteString;
        Dra a2 = dra;
        a2.J(b2);
    }

    private void C() {
        a.data_ = Dra.J().getData();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        Dra a2 = this;
        b2.getClass();
        a2.data_ = b2;
    }

    public static /* synthetic */ void J(Dra dra, String string) {
        String b2 = string;
        Dra a2 = dra;
        a2.J(b2);
    }

    public ByteString getPlayerBytes() {
        Dra a2;
        return ByteString.copyFromUtf8(a2.player_);
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
        Dra c2 = this;
        switch (vra.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Dra();
            }
            case 2: {
                return new spa(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = BRa.M;
                objectArray[vRa.d] = Nta.H;
                objectArray[uqa.g] = dua.F;
                objectArray[yRa.d] = nQa.t;
                d2 = objectArray;
                Object b2 = kra.f;
                return Dra.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Dra.class;
                synchronized (Dra.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Dra>(DEFAULT_INSTANCE);
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

    public ByteString getData() {
        Dra a2;
        return a2.data_;
    }

    private void l() {
        a.player_ = Dra.J().getPlayer();
    }

    private void J(long a2) {
        b.sequenceNumber_ = a2;
    }

    private void J(int n2) {
        int b2 = n2;
        Dra a2 = this;
        a2.audioSession_ = b2;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Dra a2 = this;
        Object object = b2;
        Dra.checkByteStringIsUtf8((ByteString)object);
        a2.player_ = ((ByteString)object).toStringUtf8();
    }

    public static spa J(Dra a2) {
        return (spa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Dra J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getAudioSession() {
        Dra a2;
        return a2.audioSession_;
    }

    public static Dra f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return Dra.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(Dra a2) {
        a2.f();
    }

    public static Dra J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static spa J() {
        return (spa)DEFAULT_INSTANCE.createBuilder();
    }

    public static Dra J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.audioSession_ = uSa.E;
    }

    public static Dra J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Dra J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Dra J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.sequenceNumber_ = nqa.i;
    }

    public long getSequenceNumber() {
        Dra a2;
        return a2.sequenceNumber_;
    }

    public static /* synthetic */ void J(Dra dra, int n2) {
        int b2 = n2;
        Dra a2 = dra;
        a2.J(b2);
    }

    public static Dra J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(Dra a2) {
        a2.l();
    }

    public static /* synthetic */ void J(Dra b2, long a2) {
        b2.J(a2);
    }

    public static /* synthetic */ void f(Dra a2) {
        a2.J();
    }

    public static /* synthetic */ void J(Dra a2) {
        a2.C();
    }

    public static /* synthetic */ Dra f() {
        return DEFAULT_INSTANCE;
    }

    public static Dra J() {
        return DEFAULT_INSTANCE;
    }

    public static Dra J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getPlayer() {
        Dra a2;
        return a2.player_;
    }

    public static /* synthetic */ void J(Dra dra, ByteString byteString) {
        ByteString b2 = byteString;
        Dra a2 = dra;
        a2.f(b2);
    }

    private Dra() {
        Dra a2;
        a2.data_ = ByteString.EMPTY;
    }
}

