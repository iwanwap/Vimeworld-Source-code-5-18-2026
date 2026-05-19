/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Am
 *  Va
 *  Xm
 *  en
 *  lqa
 *  rn
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
public final class rn_3
extends GeneratedMessageLite<rn, Xm>
implements Va {
    private static final rn DEFAULT_INSTANCE;
    private int bitField0_;
    private static volatile Parser<rn> PARSER;
    private en sound_;
    public static final int SOUND_FIELD_NUMBER = 1;

    private void f(en en2) {
        rn_3 b2 = en2;
        rn_3 a2 = this;
        b2.getClass();
        a2.sound_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static rn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        rn_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new rn_3();
            }
            case 2: {
                return new Xm(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = eta.E;
                d2 = objectArray;
                Object b2 = bsa.h;
                return rn_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = rn_3.class;
                synchronized (rn_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<rn>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(rn rn2, en en2) {
        rn b2 = en2;
        rn a2 = rn2;
        super.f((en)b2);
    }

    public static rn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static rn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        rn_3 rn_32 = new rn_3();
        DEFAULT_INSTANCE = rn_32;
        GeneratedMessageLite.registerDefaultInstance(rn_3.class, rn_32);
    }

    public static Xm J(rn a2) {
        return (Xm)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static rn f(InputStream a2) throws IOException {
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xm J() {
        return (Xm)DEFAULT_INSTANCE.createBuilder();
    }

    public static rn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static rn J(CodedInputStream a2) throws IOException {
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public en getSound() {
        rn_3 a2;
        if (a2.sound_ == null) {
            return en.J();
        }
        return a2.sound_;
    }

    public static rn J(byte[] a2) throws InvalidProtocolBufferException {
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static rn J(InputStream a2) throws IOException {
        return (rn_3)rn_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<rn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J() {
        a.sound_ = null;
        a.bitField0_ &= rQa.p;
    }

    private void J(en en2) {
        rn_3 rn_32;
        rn_3 b2 = en2;
        rn_3 a2 = this;
        b2.getClass();
        if (a2.sound_ != null && a2.sound_ != en.J()) {
            a2.sound_ = (en)((Am)en.J((en)a2.sound_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            rn_32 = a2;
        } else {
            rn_32 = a2;
            a2.sound_ = b2;
        }
        rn_32.bitField0_ |= vRa.d;
    }

    public static rn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(rn rn2, en en2) {
        rn b2 = en2;
        rn a2 = rn2;
        super.J((en)b2);
    }

    public boolean hasSound() {
        rn_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static rn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (rn_3)rn_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static rn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(rn a2) {
        super.J();
    }

    public static rn f() {
        return DEFAULT_INSTANCE;
    }

    private rn_3() {
        rn_3 a2;
    }

    public static /* synthetic */ rn J() {
        return DEFAULT_INSTANCE;
    }

    public static rn J(ByteString a2) throws InvalidProtocolBufferException {
        return (rn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

