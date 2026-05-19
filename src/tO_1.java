/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  Qqa
 *  Zua
 *  kpa
 *  lqa
 *  mC
 *  qN
 *  tO
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
public final class tO_1
extends GeneratedMessageLite<tO, qN>
implements mC {
    public static final int LOOPED_FIELD_NUMBER = 2;
    public static final int ANIMATIONID_FIELD_NUMBER = 1;
    private static final tO DEFAULT_INSTANCE;
    private boolean looped_;
    private int bitField0_;
    private static volatile Parser<tO> PARSER;
    private String animationId_ = Mqa.y;
    public static final int FORCE_FIELD_NUMBER = 3;
    public static final int SPEED_FIELD_NUMBER = 4;
    private float speed_;
    private boolean force_;

    public static /* synthetic */ void f(tO tO2, boolean bl) {
        boolean b2 = bl;
        tO a2 = tO2;
        super.f(b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        tO_1 a2 = this;
        Object object = b2;
        tO_1.checkByteStringIsUtf8((ByteString)object);
        a2.animationId_ = ((ByteString)object).toStringUtf8();
    }

    public static /* synthetic */ void C(tO a2) {
        super.l();
    }

    public static tO f() {
        return DEFAULT_INSTANCE;
    }

    public static tO J(byte[] a2) throws InvalidProtocolBufferException {
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static tO J(ByteString a2) throws InvalidProtocolBufferException {
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        tO_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.force_ = b2;
    }

    public boolean getForce() {
        tO_1 a2;
        return a2.force_;
    }

    public static /* synthetic */ void l(tO a2) {
        super.J();
    }

    public static tO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasLooped() {
        tO_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private tO_1() {
        tO_1 a2;
    }

    public static tO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static tO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static tO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getSpeed() {
        tO_1 a2;
        return a2.speed_;
    }

    private void C() {
        a.animationId_ = tO_1.f().getAnimationId();
    }

    public boolean hasSpeed() {
        tO_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static qN J(tO a2) {
        return (qN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public ByteString getAnimationIdBytes() {
        tO_1 a2;
        return ByteString.copyFromUtf8(a2.animationId_);
    }

    private void l() {
        a.bitField0_ &= ERa.Ka;
        a.force_ = uSa.E;
    }

    public static /* synthetic */ void J(tO tO2, boolean bl) {
        boolean b2 = bl;
        tO a2 = tO2;
        super.J(b2);
    }

    public static qN J() {
        return (qN)DEFAULT_INSTANCE.createBuilder();
    }

    public String getAnimationId() {
        tO_1 a2;
        return a2.animationId_;
    }

    private void f() {
        a.bitField0_ &= kpa.w;
        a.speed_ = JPa.N;
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
        tO_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new tO_1();
            }
            case 2: {
                return new qN(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = Npa.b;
                objectArray[uqa.g] = Zua.u;
                objectArray[yRa.d] = CRa.S;
                objectArray[AQa.P] = aua.A;
                d2 = objectArray;
                Object b2 = Qqa.ba;
                return tO_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = tO_1.class;
                synchronized (tO_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<tO>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(tO a2) {
        super.C();
    }

    public static tO f(InputStream a2) throws IOException {
        return (tO_1)tO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ tO J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(tO a2) {
        super.f();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        tO_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.looped_ = b2;
    }

    public static tO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (tO_1)tO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(tO tO2, String string) {
        Object b2 = string;
        tO a2 = tO2;
        super.J((String)b2);
    }

    private void J(String string) {
        String b2 = string;
        tO_1 a2 = this;
        b2.getClass();
        a2.animationId_ = b2;
    }

    public static Parser<tO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void J(float f2) {
        float b2 = f2;
        tO_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.speed_ = b2;
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.looped_ = uSa.E;
    }

    public static /* synthetic */ void J(tO tO2, float f2) {
        float b2 = f2;
        tO a2 = tO2;
        super.J(b2);
    }

    public static tO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean getLooped() {
        tO_1 a2;
        return a2.looped_;
    }

    public static tO J(CodedInputStream a2) throws IOException {
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        tO_1 tO_12 = new tO_1();
        DEFAULT_INSTANCE = tO_12;
        GeneratedMessageLite.registerDefaultInstance(tO_1.class, tO_12);
    }

    public static tO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasForce() {
        tO_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static tO J(InputStream a2) throws IOException {
        return (tO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(tO tO2, ByteString byteString) {
        Object b2 = byteString;
        tO a2 = tO2;
        super.J((ByteString)b2);
    }
}

