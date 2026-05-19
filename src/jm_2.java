/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  IB
 *  TN
 *  cN
 *  jm
 *  lqa
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
public final class jm_2
extends GeneratedMessageLite<jm, TN>
implements IB {
    private static final jm DEFAULT_INSTANCE;
    private cN config_;
    private int bitField0_;
    public static final int CONFIG_FIELD_NUMBER = 1;
    private static volatile Parser<jm> PARSER;

    public static jm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private jm_2() {
        jm_2 a2;
    }

    public static /* synthetic */ void J(jm a2) {
        super.J();
    }

    public static jm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (jm_2)jm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<jm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static jm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static jm f(InputStream a2) throws IOException {
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(cN cN2) {
        jm_2 jm_22;
        jm_2 b2 = cN2;
        jm_2 a2 = this;
        b2.getClass();
        if (a2.config_ != null && a2.config_ != cN.J()) {
            a2.config_ = (cN)((Qm)cN.J((cN)a2.config_).mergeFrom(b2)).buildPartial();
            jm_22 = a2;
        } else {
            jm_22 = a2;
            a2.config_ = b2;
        }
        jm_22.bitField0_ |= vRa.d;
    }

    public static TN J(jm a2) {
        return (TN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        jm_2 jm_22 = new jm_2();
        DEFAULT_INSTANCE = jm_22;
        GeneratedMessageLite.registerDefaultInstance(jm_2.class, jm_22);
    }

    public boolean hasConfig() {
        jm_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static jm J(byte[] a2) throws InvalidProtocolBufferException {
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static jm J(InputStream a2) throws IOException {
        return (jm_2)jm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.config_ = null;
        a.bitField0_ &= rQa.p;
    }

    private void J(cN cN2) {
        jm_2 b2 = cN2;
        jm_2 a2 = this;
        b2.getClass();
        a2.config_ = b2;
        a2.bitField0_ |= vRa.d;
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
        jm_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new jm_2();
            }
            case 2: {
                return new TN(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = xSa.M;
                d2 = objectArray;
                Object b2 = bsa.h;
                return jm_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = jm_2.class;
                synchronized (jm_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<jm>(DEFAULT_INSTANCE);
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

    public cN getConfig() {
        jm_2 a2;
        if (a2.config_ == null) {
            return cN.J();
        }
        return a2.config_;
    }

    public static jm J(ByteString a2) throws InvalidProtocolBufferException {
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(jm jm2, cN cN2) {
        jm b2 = cN2;
        jm a2 = jm2;
        super.f((cN)b2);
    }

    public static /* synthetic */ void J(jm jm2, cN cN2) {
        jm b2 = cN2;
        jm a2 = jm2;
        super.J((cN)b2);
    }

    public static jm J(CodedInputStream a2) throws IOException {
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static jm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static jm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static jm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ jm f() {
        return DEFAULT_INSTANCE;
    }

    public static jm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (jm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static jm J() {
        return DEFAULT_INSTANCE;
    }

    public static TN J() {
        return (TN)DEFAULT_INSTANCE.createBuilder();
    }
}

