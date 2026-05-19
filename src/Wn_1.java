/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JPa
 *  La
 *  TPa
 *  Wn
 *  kPa
 *  lqa
 *  uQa
 *  un
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
public final class Wn_1
extends GeneratedMessageLite<Wn, un>
implements La {
    public static final int SIZE_FIELD_NUMBER = 1;
    private int bitField0_;
    private float progress_;
    private int size_;
    public static final int PROGRESS_FIELD_NUMBER = 2;
    private static volatile Parser<Wn> PARSER;
    private static final Wn DEFAULT_INSTANCE;

    public static Wn J(ByteString a2) throws InvalidProtocolBufferException {
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        Wn_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Wn_1();
            }
            case 2: {
                return new un(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.p;
                objectArray[uqa.g] = kPa.f;
                d2 = objectArray;
                Object b2 = TPa.S;
                return Wn_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Wn_1.class;
                synchronized (Wn_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Wn>(DEFAULT_INSTANCE);
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

    public static Wn f(InputStream a2) throws IOException {
        return (Wn_1)Wn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Wn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Wn_1)Wn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getProgress() {
        Wn_1 a2;
        return a2.progress_;
    }

    public int getSize() {
        Wn_1 a2;
        return a2.size_;
    }

    public static /* synthetic */ void f(Wn a2) {
        super.J();
    }

    public static /* synthetic */ Wn f() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        a.size_ = uSa.E;
    }

    public boolean hasProgress() {
        Wn_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Wn J(byte[] a2) throws InvalidProtocolBufferException {
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private Wn_1() {
        Wn_1 a2;
    }

    public static Wn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(Wn a2) {
        super.f();
    }

    public static Wn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Wn wn2, int n2) {
        int b2 = n2;
        Wn a2 = wn2;
        super.J(b2);
    }

    public static un J(Wn a2) {
        return (un)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(int n2) {
        int b2 = n2;
        Wn_1 a2 = this;
        a2.size_ = b2;
    }

    public static Wn J() {
        return DEFAULT_INSTANCE;
    }

    public static Wn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Wn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<Wn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(float f2) {
        float b2 = f2;
        Wn_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.progress_ = b2;
    }

    public static un J() {
        return (un)DEFAULT_INSTANCE.createBuilder();
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.progress_ = JPa.N;
    }

    public static Wn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Wn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Wn wn2, float f2) {
        float b2 = f2;
        Wn a2 = wn2;
        super.J(b2);
    }

    public static Wn J(InputStream a2) throws IOException {
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        Wn_1 wn_1 = new Wn_1();
        DEFAULT_INSTANCE = wn_1;
        GeneratedMessageLite.registerDefaultInstance(Wn_1.class, wn_1);
    }

    public static Wn J(CodedInputStream a2) throws IOException {
        return (Wn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

