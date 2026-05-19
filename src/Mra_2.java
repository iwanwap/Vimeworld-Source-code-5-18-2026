/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Mra
 *  UQa
 *  YQa
 *  vRa
 *  wB
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
public final class Mra_2
extends GeneratedMessageLite<Mra, YQa>
implements wB {
    private static volatile Parser<Mra> PARSER;
    private String player_ = Mqa.y;
    private static final Mra DEFAULT_INSTANCE;
    private int audioSession_;
    public static final int AUDIO_SESSION_FIELD_NUMBER = 2;
    public static final int PLAYER_FIELD_NUMBER = 1;

    public static /* synthetic */ Mra f() {
        return DEFAULT_INSTANCE;
    }

    public static YQa J(Mra a2) {
        return (YQa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Mra_2 a2 = this;
        Object object = b2;
        Mra_2.checkByteStringIsUtf8((ByteString)object);
        a2.player_ = ((ByteString)object).toStringUtf8();
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
        Mra_2 c2 = this;
        switch (UQa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Mra_2();
            }
            case 2: {
                return new YQa(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = BRa.M;
                objectArray[vRa.d] = Nta.H;
                d2 = objectArray;
                Object b2 = Jqa.f;
                return Mra_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Mra_2.class;
                synchronized (Mra_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Mra>(DEFAULT_INSTANCE);
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

    public static Mra f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Mra_2)Mra_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Mra J(ByteString a2) throws InvalidProtocolBufferException {
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Mra J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(Mra mra2, String string) {
        Object b2 = string;
        Mra a2 = mra2;
        super.J((String)b2);
    }

    public static Mra f(InputStream a2) throws IOException {
        return (Mra_2)Mra_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Mra J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Mra J(byte[] a2) throws InvalidProtocolBufferException {
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Mra mra2, int n2) {
        int b2 = n2;
        Mra a2 = mra2;
        super.J(b2);
    }

    public static Parser<Mra> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private Mra_2() {
        Mra_2 a2;
    }

    public static /* synthetic */ void f(Mra a2) {
        super.J();
    }

    public static Mra J(InputStream a2) throws IOException {
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        Mra_2 a2 = this;
        a2.audioSession_ = b2;
    }

    public static /* synthetic */ void J(Mra a2) {
        super.f();
    }

    public ByteString getPlayerBytes() {
        Mra_2 a2;
        return ByteString.copyFromUtf8(a2.player_);
    }

    public static Mra J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Mra J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Mra J(CodedInputStream a2) throws IOException {
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getAudioSession() {
        Mra_2 a2;
        return a2.audioSession_;
    }

    public static Mra J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getPlayer() {
        Mra_2 a2;
        return a2.player_;
    }

    private void f() {
        a.player_ = Mra_2.J().getPlayer();
    }

    public static YQa J() {
        return (YQa)DEFAULT_INSTANCE.createBuilder();
    }

    static {
        Mra_2 mra_2 = new Mra_2();
        DEFAULT_INSTANCE = mra_2;
        GeneratedMessageLite.registerDefaultInstance(Mra_2.class, mra_2);
    }

    private void J() {
        a.audioSession_ = uSa.E;
    }

    public static Mra J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        Mra_2 a2 = this;
        b2.getClass();
        a2.player_ = b2;
    }

    public static /* synthetic */ void J(Mra mra2, ByteString byteString) {
        Object b2 = byteString;
        Mra a2 = mra2;
        super.J((ByteString)b2);
    }

    public static Mra J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Mra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

