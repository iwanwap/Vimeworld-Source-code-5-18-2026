/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  TC
 *  Xo
 *  kM
 *  lqa
 *  pm
 *  vRa
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
public final class JO
extends GeneratedMessageLite<JO, kM>
implements TC {
    private pm box_;
    public static final int BOX_FIELD_NUMBER = 1;
    private static volatile Parser<JO> PARSER;
    private static final JO DEFAULT_INSTANCE;
    private int bitField0_;

    private void J() {
        a.box_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static /* synthetic */ void f(JO jO2, pm pm2) {
        JO b2 = pm2;
        JO a2 = jO2;
        a2.f((pm)b2);
    }

    public static JO f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static JO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static JO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static JO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return JO.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(pm pm2) {
        JO b2 = pm2;
        JO a2 = this;
        b2.getClass();
        a2.box_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static JO J(InputStream a2) throws IOException {
        return JO.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static JO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static kM J() {
        return (kM)DEFAULT_INSTANCE.createBuilder();
    }

    public static kM J(JO a2) {
        return (kM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static JO J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public pm getBox() {
        JO a2;
        if (a2.box_ == null) {
            return pm.J();
        }
        return a2.box_;
    }

    public static JO J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        JO c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new JO();
            }
            case 2: {
                return new kM(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = WRa.p;
                d2 = objectArray;
                Object b2 = bsa.h;
                return JO.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = JO.class;
                synchronized (JO.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<JO>(DEFAULT_INSTANCE);
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

    private void J(pm pm2) {
        JO jO2;
        JO b2 = pm2;
        JO a2 = this;
        b2.getClass();
        if (a2.box_ != null && a2.box_ != pm.J()) {
            a2.box_ = (pm)((Xo)pm.J((pm)a2.box_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            jO2 = a2;
        } else {
            jO2 = a2;
            a2.box_ = b2;
        }
        jO2.bitField0_ |= vRa.d;
    }

    private JO() {
        JO a2;
    }

    public boolean hasBox() {
        JO a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(JO jO2, pm pm2) {
        JO b2 = pm2;
        JO a2 = jO2;
        a2.J((pm)b2);
    }

    public static /* synthetic */ JO f() {
        return DEFAULT_INSTANCE;
    }

    public static JO J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        JO jO2;
        DEFAULT_INSTANCE = jO2 = new JO();
        GeneratedMessageLite.registerDefaultInstance(JO.class, jO2);
    }

    public static Parser<JO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static JO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static JO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static JO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(JO a2) {
        a2.J();
    }

    public static JO J() {
        return DEFAULT_INSTANCE;
    }
}

