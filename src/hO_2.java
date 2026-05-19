/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Cn
 *  DO
 *  HM
 *  Uta
 *  hO
 *  hqa
 *  ln
 *  qa
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
public final class hO_2
extends GeneratedMessageLite<hO, DO>
implements qa {
    private int actionCase_ = uSa.E;
    private Object action_;
    private static final hO DEFAULT_INSTANCE;
    public static final int STOPPARTICLES_FIELD_NUMBER = 2;
    public static final int PLAYPARTICLES_FIELD_NUMBER = 1;
    private static volatile Parser<hO> PARSER;

    public static /* synthetic */ hO f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void l(hO a2) {
        super.l();
    }

    public static hO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (hO_2)hO_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private hO_2() {
        hO_2 a2;
    }

    private void l() {
        hO_2 a2;
        if (a2.actionCase_ == uqa.g) {
            hO_2 hO_22 = a2;
            hO_22.actionCase_ = uSa.E;
            hO_22.action_ = null;
        }
    }

    public static Parser<hO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static hO J() {
        return DEFAULT_INSTANCE;
    }

    public static hO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        hO_2 a2;
        hO_2 hO_22 = a2;
        hO_22.actionCase_ = uSa.E;
        hO_22.action_ = null;
    }

    private void f(ln ln2) {
        hO_2 b2 = ln2;
        hO_2 a2 = this;
        b2.getClass();
        hO_2 hO_22 = a2;
        hO_22.action_ = b2;
        hO_22.actionCase_ = vRa.d;
    }

    public static hO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ln getPlayParticles() {
        hO_2 a2;
        if (a2.actionCase_ == vRa.d) {
            return (ln)a2.action_;
        }
        return ln.f();
    }

    public static hO J(CodedInputStream a2) throws IOException {
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(no no2) {
        GeneratedMessageLite b2 = no2;
        hO_2 a2 = this;
        b2.getClass();
        hO_2 hO_22 = a2;
        hO_22.action_ = b2;
        hO_22.actionCase_ = uqa.g;
    }

    public static hO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J() {
        hO_2 a2;
        if (a2.actionCase_ == vRa.d) {
            hO_2 hO_22 = a2;
            hO_22.actionCase_ = uSa.E;
            hO_22.action_ = null;
        }
    }

    public static hO J(ByteString a2) throws InvalidProtocolBufferException {
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static hO f(InputStream a2) throws IOException {
        return (hO_2)hO_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(hO a2) {
        super.J();
    }

    public boolean hasPlayParticles() {
        hO_2 a2;
        if (a2.actionCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ln ln2) {
        hO_2 hO_22;
        hO_2 b2 = ln2;
        hO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == vRa.d && a2.action_ != ln.f()) {
            a2.action_ = ((Cn)ln.J((ln)((ln)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            hO_22 = a2;
        } else {
            hO_22 = a2;
            a2.action_ = b2;
        }
        hO_22.actionCase_ = vRa.d;
    }

    public static hO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static hO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public HM getActionCase() {
        hO_2 a2;
        return HM.forNumber((int)a2.actionCase_);
    }

    public static hO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(hO hO2, ln ln2) {
        hO b2 = ln2;
        hO a2 = hO2;
        super.J((ln)b2);
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
        hO_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new hO_2();
            }
            case 2: {
                return new DO(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = Hta.m;
                objectArray[vRa.d] = Uta.J;
                objectArray[uqa.g] = ln.class;
                objectArray[yRa.d] = no.class;
                d2 = objectArray;
                Object b2 = hqa.O;
                return hO_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = hO_2.class;
                synchronized (hO_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<hO>(DEFAULT_INSTANCE);
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

    private void J(no no2) {
        hO_2 hO_22;
        GeneratedMessageLite b2 = no2;
        hO_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == uqa.g && a2.action_ != no.f()) {
            a2.action_ = ((BO)no.J((no)a2.action_).mergeFrom(b2)).buildPartial();
            hO_22 = a2;
        } else {
            hO_22 = a2;
            a2.action_ = b2;
        }
        hO_22.actionCase_ = uqa.g;
    }

    public static /* synthetic */ void f(hO hO2, no no2) {
        Object b2 = no2;
        hO a2 = hO2;
        super.f((no)b2);
    }

    public static hO J(byte[] a2) throws InvalidProtocolBufferException {
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public no getStopParticles() {
        hO_2 a2;
        if (a2.actionCase_ == uqa.g) {
            return (no)a2.action_;
        }
        return no.f();
    }

    public static DO J() {
        return (DO)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(hO hO2, ln ln2) {
        hO b2 = ln2;
        hO a2 = hO2;
        super.f((ln)b2);
    }

    public static /* synthetic */ void J(hO hO2, no no2) {
        Object b2 = no2;
        hO a2 = hO2;
        super.J((no)b2);
    }

    public static /* synthetic */ void J(hO a2) {
        super.f();
    }

    public boolean hasStopParticles() {
        hO_2 a2;
        if (a2.actionCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        hO_2 hO_22 = new hO_2();
        DEFAULT_INSTANCE = hO_22;
        GeneratedMessageLite.registerDefaultInstance(hO_2.class, hO_22);
    }

    public static DO J(hO a2) {
        return (DO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static hO J(InputStream a2) throws IOException {
        return (hO_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

