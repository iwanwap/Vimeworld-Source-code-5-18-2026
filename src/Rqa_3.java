/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Rqa
 *  fra
 *  nPa
 *  qta
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
public final class Rqa_3
extends GeneratedMessageLite<Rqa, fra>
implements Dd {
    private int requiredVersion_;
    public static final int REQUIRED_VERSION_FIELD_NUMBER = 1;
    private static final Rqa DEFAULT_INSTANCE;
    private static volatile Parser<Rqa> PARSER;

    private Rqa_3() {
        Rqa_3 a2;
    }

    @Override
    public int getRequiredVersion() {
        Rqa_3 a2;
        return a2.requiredVersion_;
    }

    public static Rqa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        Rqa_3 c2 = this;
        switch (nPa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Rqa_3();
            }
            case 2: {
                return new fra(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = qta.ca;
                d2 = objectArray;
                Object b2 = Cra.I;
                return Rqa_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Rqa_3.class;
                synchronized (Rqa_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Rqa>(DEFAULT_INSTANCE);
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

    public static Rqa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Rqa rqa, int n2) {
        int b2 = n2;
        Rqa a2 = rqa;
        super.J(b2);
    }

    public static Rqa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        Rqa_3 rqa_3 = new Rqa_3();
        DEFAULT_INSTANCE = rqa_3;
        GeneratedMessageLite.registerDefaultInstance(Rqa_3.class, rqa_3);
    }

    public static Rqa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(Rqa a2) {
        super.J();
    }

    private void J() {
        a.requiredVersion_ = uSa.E;
    }

    public static fra J() {
        return (fra)DEFAULT_INSTANCE.createBuilder();
    }

    public static Rqa J(ByteString a2) throws InvalidProtocolBufferException {
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rqa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rqa_3)Rqa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Rqa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rqa f() {
        return DEFAULT_INSTANCE;
    }

    public static Rqa J(byte[] a2) throws InvalidProtocolBufferException {
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        Rqa_3 a2 = this;
        a2.requiredVersion_ = b2;
    }

    public static Rqa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ Rqa J() {
        return DEFAULT_INSTANCE;
    }

    public static Rqa f(InputStream a2) throws IOException {
        return (Rqa_3)Rqa_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<Rqa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static fra J(Rqa a2) {
        return (fra)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Rqa J(CodedInputStream a2) throws IOException {
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rqa J(InputStream a2) throws IOException {
        return (Rqa_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

