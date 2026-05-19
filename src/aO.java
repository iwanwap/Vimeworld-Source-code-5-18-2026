/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  RQa
 *  Tc
 *  VN
 *  gm
 *  lqa
 *  oN
 *  psa
 *  uQa
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
public final class aO
extends GeneratedMessageLite<aO, oN>
implements Tc {
    private int bitField0_;
    private static volatile Parser<aO> PARSER;
    private VN options_;
    private int id_;
    public static final int CLEAR_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private boolean clear_;
    private static final aO DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;

    public static aO f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static aO f() {
        return DEFAULT_INSTANCE;
    }

    public static aO J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(aO aO2, VN vN2) {
        aO b2 = vN2;
        aO a2 = aO2;
        a2.J((VN)b2);
    }

    public boolean hasClear() {
        aO a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean getClear() {
        aO a2;
        return a2.clear_;
    }

    public static aO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        aO a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.clear_ = b2;
    }

    private void l() {
        a.id_ = uSa.E;
    }

    private void f(VN vN2) {
        aO b2 = vN2;
        aO a2 = this;
        b2.getClass();
        a2.options_ = b2;
        a2.bitField0_ |= uqa.g;
    }

    public VN getOptions() {
        aO a2;
        if (a2.options_ == null) {
            return VN.f();
        }
        return a2.options_;
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.clear_ = uSa.E;
    }

    public static /* synthetic */ void J(aO aO2, boolean bl) {
        boolean b2 = bl;
        aO a2 = aO2;
        a2.J(b2);
    }

    public static /* synthetic */ aO J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void l(aO a2) {
        a2.f();
    }

    public static oN J() {
        return (oN)DEFAULT_INSTANCE.createBuilder();
    }

    private void J() {
        a.options_ = null;
        a.bitField0_ &= ERa.Ka;
    }

    public static /* synthetic */ void f(aO a2) {
        a2.l();
    }

    private void J(VN vN2) {
        aO aO2;
        aO b2 = vN2;
        aO a2 = this;
        b2.getClass();
        if (a2.options_ != null && a2.options_ != VN.f()) {
            a2.options_ = (VN)((gm)VN.J((VN)a2.options_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            aO2 = a2;
        } else {
            aO2 = a2;
            a2.options_ = b2;
        }
        aO2.bitField0_ |= uqa.g;
    }

    public static aO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static aO J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static aO J(InputStream a2) throws IOException {
        return aO.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static aO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        aO c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new aO();
            }
            case 2: {
                return new oN(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = psa.A;
                objectArray[yRa.d] = lqa.Ha;
                d2 = objectArray;
                Object b2 = RQa.f;
                return aO.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = aO.class;
                synchronized (aO.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<aO>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(aO a2) {
        a2.J();
    }

    public static aO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Parser<aO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasOptions() {
        aO a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static oN J(aO a2) {
        return (oN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static aO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(aO aO2, VN vN2) {
        aO b2 = vN2;
        aO a2 = aO2;
        a2.f((VN)b2);
    }

    private void J(int n2) {
        int b2 = n2;
        aO a2 = this;
        a2.id_ = b2;
    }

    public static /* synthetic */ void J(aO aO2, int n2) {
        int b2 = n2;
        aO a2 = aO2;
        a2.J(b2);
    }

    public int getId() {
        aO a2;
        return a2.id_;
    }

    public static aO J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        aO aO2;
        DEFAULT_INSTANCE = aO2 = new aO();
        GeneratedMessageLite.registerDefaultInstance(aO.class, aO2);
    }

    public static aO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private aO() {
        aO a2;
    }

    public static aO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return aO.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

