/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CPa
 *  Cra
 *  Fra
 *  Jb
 *  mQa
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
public final class Fra_3
extends GeneratedMessageLite<Fra, mQa>
implements Jb {
    private static final Fra DEFAULT_INSTANCE;
    private int audioSession_;
    public static final int AUDIO_SESSION_FIELD_NUMBER = 1;
    private static volatile Parser<Fra> PARSER;

    public static Parser<Fra> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Fra J(byte[] a2) throws InvalidProtocolBufferException {
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Fra J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mQa J(Fra a2) {
        return (mQa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Fra J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J() {
        a.audioSession_ = uSa.E;
    }

    public static /* synthetic */ Fra f() {
        return DEFAULT_INSTANCE;
    }

    public static Fra J(ByteString a2) throws InvalidProtocolBufferException {
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Fra f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Fra f(InputStream a2) throws IOException {
        return (Fra_3)Fra_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Fra J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Fra_3)Fra_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        Fra_3 a2 = this;
        a2.audioSession_ = b2;
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
        Fra_3 c2 = this;
        switch (CPa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Fra_3();
            }
            case 2: {
                return new mQa(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Nta.H;
                d2 = objectArray;
                Object b2 = Cra.I;
                return Fra_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Fra_3.class;
                synchronized (Fra_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Fra>(DEFAULT_INSTANCE);
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

    public static Fra J(CodedInputStream a2) throws IOException {
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Fra fra2, int n2) {
        int b2 = n2;
        Fra a2 = fra2;
        super.J(b2);
    }

    public static Fra J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mQa J() {
        return (mQa)DEFAULT_INSTANCE.createBuilder();
    }

    public static Fra J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(Fra a2) {
        super.J();
    }

    static {
        Fra_3 fra_3 = new Fra_3();
        DEFAULT_INSTANCE = fra_3;
        GeneratedMessageLite.registerDefaultInstance(Fra_3.class, fra_3);
    }

    public int getAudioSession() {
        Fra_3 a2;
        return a2.audioSession_;
    }

    public static Fra J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Fra J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Fra J(InputStream a2) throws IOException {
        return (Fra_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private Fra_3() {
        Fra_3 a2;
    }
}

