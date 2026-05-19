/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Qta
 *  Wl
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
public final class Wl_3
extends GeneratedMessageLite<Wl, lK>
implements W {
    private static volatile Parser<Wl> PARSER;
    private long duration_;
    private int bitField0_;
    private static final Wl DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 1;

    public static Wl J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Wl J(ByteString a2) throws InvalidProtocolBufferException {
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static lK J(Wl a2) {
        return (lK)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static lK J() {
        return (lK)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ Wl f() {
        return DEFAULT_INSTANCE;
    }

    public static Wl J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<Wl> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Wl J(byte[] a2) throws InvalidProtocolBufferException {
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        Wl_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Wl_3();
            }
            case 2: {
                return new lK(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = Xpa.e;
                d2 = objectArray;
                Object b2 = Qta.q;
                return Wl_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Wl_3.class;
                synchronized (Wl_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Wl>(DEFAULT_INSTANCE);
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

    @Override
    public long getDuration() {
        Wl_3 a2;
        return a2.duration_;
    }

    public static Wl f(InputStream a2) throws IOException {
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Wl J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private Wl_3() {
        Wl_3 a2;
    }

    public static Wl f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Wl J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Wl_3)Wl_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Wl J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(Wl b2, long a2) {
        super.J(a2);
    }

    private void J(long a2) {
        b.bitField0_ |= vRa.d;
        b.duration_ = a2;
    }

    static {
        Wl_3 wl_3 = new Wl_3();
        DEFAULT_INSTANCE = wl_3;
        GeneratedMessageLite.registerDefaultInstance(Wl_3.class, wl_3);
    }

    public static Wl J(InputStream a2) throws IOException {
        return (Wl_3)Wl_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasDuration() {
        Wl_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(Wl a2) {
        super.J();
    }

    public static Wl J(CodedInputStream a2) throws IOException {
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Wl J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Wl J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Wl_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.duration_ = nqa.i;
    }
}

