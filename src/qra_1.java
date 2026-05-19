/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IQa
 *  Lc
 *  Qqa
 *  nQa
 *  qra
 *  vRa
 *  zqa
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
public final class qra_1
extends GeneratedMessageLite<qra, IQa>
implements Lc {
    private static final qra DEFAULT_INSTANCE;
    public static final int AUDIO_SESSION_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    private static volatile Parser<qra> PARSER;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    private int audioSession_;
    private long sequenceNumber_;
    private ByteString data_ = ByteString.EMPTY;

    public static IQa J() {
        return (IQa)DEFAULT_INSTANCE.createBuilder();
    }

    public int getAudioSession() {
        qra_1 a2;
        return a2.audioSession_;
    }

    public static /* synthetic */ void l(qra a2) {
        super.l();
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        qra_1 a2 = this;
        b2.getClass();
        a2.data_ = b2;
    }

    public static qra J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(qra qra2, ByteString byteString) {
        Object b2 = byteString;
        qra a2 = qra2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void f(qra a2) {
        super.f();
    }

    public static /* synthetic */ void J(qra b2, long a2) {
        super.J(a2);
    }

    public static /* synthetic */ qra f() {
        return DEFAULT_INSTANCE;
    }

    private void J(long a2) {
        b.sequenceNumber_ = a2;
    }

    public static qra J() {
        return DEFAULT_INSTANCE;
    }

    public static qra J(ByteString a2) throws InvalidProtocolBufferException {
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static IQa J(qra a2) {
        return (IQa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static qra f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (qra_1)qra_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l() {
        a.data_ = qra_1.J().getData();
    }

    public static /* synthetic */ void J(qra a2) {
        super.J();
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
        qra_1 c2 = this;
        switch (zqa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new qra_1();
            }
            case 2: {
                return new IQa(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = Nta.H;
                objectArray[vRa.d] = dua.F;
                objectArray[uqa.g] = nQa.t;
                d2 = objectArray;
                Object b2 = Qqa.j;
                return qra_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = qra_1.class;
                synchronized (qra_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<qra>(DEFAULT_INSTANCE);
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

    public static qra J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static qra J(CodedInputStream a2) throws IOException {
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private qra_1() {
        qra_1 a2;
    }

    public ByteString getData() {
        qra_1 a2;
        return a2.data_;
    }

    public static qra J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(qra qra2, int n2) {
        int b2 = n2;
        qra a2 = qra2;
        super.J(b2);
    }

    public static qra J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.audioSession_ = uSa.E;
    }

    private void J() {
        a.sequenceNumber_ = nqa.i;
    }

    public static qra J(byte[] a2) throws InvalidProtocolBufferException {
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static qra J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        qra_1 a2 = this;
        a2.audioSession_ = b2;
    }

    public static Parser<qra> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static qra J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static qra f(InputStream a2) throws IOException {
        return (qra_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public long getSequenceNumber() {
        qra_1 a2;
        return a2.sequenceNumber_;
    }

    static {
        qra_1 qra_12 = new qra_1();
        DEFAULT_INSTANCE = qra_12;
        GeneratedMessageLite.registerDefaultInstance(qra_1.class, qra_12);
    }

    public static qra J(InputStream a2) throws IOException {
        return (qra_1)qra_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }
}

