/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  ba
 *  hra
 *  lqa
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
public final class Bm
extends GeneratedMessageLite<Bm, tM>
implements ba {
    public static final int TIMERDURATION_FIELD_NUMBER = 2;
    private long timerDuration_;
    private static volatile Parser<Bm> PARSER;
    private boolean reverse_;
    public static final int REVERSE_FIELD_NUMBER = 1;
    private static final Bm DEFAULT_INSTANCE;
    private int bitField0_;

    public static Bm f() {
        return DEFAULT_INSTANCE;
    }

    public boolean getReverse() {
        Bm a2;
        return a2.reverse_;
    }

    public static Bm f(InputStream a2) throws IOException {
        return Bm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasTimerDuration() {
        Bm a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public long getTimerDuration() {
        Bm a2;
        return a2.timerDuration_;
    }

    public static Bm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.timerDuration_ = nqa.i;
    }

    public static tM J(Bm a2) {
        return (tM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(Bm a2) {
        a2.J();
    }

    public static Bm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private Bm() {
        Bm a2;
    }

    public static Bm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        Bm bm;
        DEFAULT_INSTANCE = bm = new Bm();
        GeneratedMessageLite.registerDefaultInstance(Bm.class, bm);
    }

    public boolean hasReverse() {
        Bm a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Bm J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Bm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J(long a2) {
        b.bitField0_ |= uqa.g;
        b.timerDuration_ = a2;
    }

    public static Bm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Bm b2, long a2) {
        b2.J(a2);
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
        Bm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Bm();
            }
            case 2: {
                return new tM(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = SPa.C;
                objectArray[uqa.g] = vsa.x;
                d2 = objectArray;
                Object b2 = hra.v;
                return Bm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Bm.class;
                synchronized (Bm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Bm>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(Bm a2) {
        a2.f();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        Bm a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.reverse_ = b2;
    }

    public static Bm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Bm bm, boolean bl) {
        boolean b2 = bl;
        Bm a2 = bm;
        a2.J(b2);
    }

    public static Bm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Bm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ Bm J() {
        return DEFAULT_INSTANCE;
    }

    public static Bm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<Bm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Bm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return Bm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static tM J() {
        return (tM)DEFAULT_INSTANCE.createBuilder();
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.reverse_ = uSa.E;
    }
}

