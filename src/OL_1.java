/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  OL
 *  Qta
 *  lqa
 *  vRa
 *  w
 *  zk
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
public final class OL_1
extends GeneratedMessageLite<OL, zk>
implements w {
    public static final int DURATION_FIELD_NUMBER = 1;
    private static final OL DEFAULT_INSTANCE;
    private int bitField0_;
    private static volatile Parser<OL> PARSER;
    private long duration_;

    public static Parser<OL> J() {
        return DEFAULT_INSTANCE.getParserForType();
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
        OL_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new OL_1();
            }
            case 2: {
                return new zk(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = Xpa.e;
                d2 = objectArray;
                Object b2 = Qta.q;
                return OL_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = OL_1.class;
                synchronized (OL_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<OL>(DEFAULT_INSTANCE);
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

    public static OL f(InputStream a2) throws IOException {
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static OL J(byte[] a2) throws InvalidProtocolBufferException {
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(OL b2, long a2) {
        super.J(a2);
    }

    public static /* synthetic */ OL f() {
        return DEFAULT_INSTANCE;
    }

    public static OL J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(OL a2) {
        super.J();
    }

    public static OL f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OL_1)OL_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OL J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OL J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(long a2) {
        b.bitField0_ |= vRa.d;
        b.duration_ = a2;
    }

    public static OL J(CodedInputStream a2) throws IOException {
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static zk J(OL a2) {
        return (zk)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static OL J() {
        return DEFAULT_INSTANCE;
    }

    public static OL J(ByteString a2) throws InvalidProtocolBufferException {
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static zk J() {
        return (zk)DEFAULT_INSTANCE.createBuilder();
    }

    static {
        OL_1 oL_1 = new OL_1();
        DEFAULT_INSTANCE = oL_1;
        GeneratedMessageLite.registerDefaultInstance(OL_1.class, oL_1);
    }

    public long getDuration() {
        OL_1 a2;
        return a2.duration_;
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.duration_ = nqa.i;
    }

    public static OL J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static OL J(InputStream a2) throws IOException {
        return (OL_1)OL_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static OL J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private OL_1() {
        OL_1 a2;
    }

    public static OL J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (OL_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasDuration() {
        OL_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

