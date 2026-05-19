/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EO
 *  Uta
 *  qN
 *  qd
 *  tO
 *  uQa
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
public final class EO_3
extends GeneratedMessageLite<EO, zo>
implements qd {
    public static final int STOPANIMATION_FIELD_NUMBER = 3;
    private int id_;
    public static final int PLAYANIMATION_FIELD_NUMBER = 2;
    private static volatile Parser<EO> PARSER;
    private int actionCase_ = uSa.E;
    public static final int ID_FIELD_NUMBER = 1;
    private static final EO DEFAULT_INSTANCE;
    private Object action_;

    public static /* synthetic */ void J(EO eO2, int n2) {
        int b2 = n2;
        EO a2 = eO2;
        super.J(b2);
    }

    private void C() {
        a.id_ = uSa.E;
    }

    private void l() {
        EO_3 a2;
        EO_3 eO_3 = a2;
        eO_3.actionCase_ = uSa.E;
        eO_3.action_ = null;
    }

    static {
        EO_3 eO_3 = new EO_3();
        DEFAULT_INSTANCE = eO_3;
        GeneratedMessageLite.registerDefaultInstance(EO_3.class, eO_3);
    }

    public int getId() {
        EO_3 a2;
        return a2.id_;
    }

    public static /* synthetic */ void f(EO eO2, tO tO2) {
        EO b2 = tO2;
        EO a2 = eO2;
        super.f((tO)b2);
    }

    public static /* synthetic */ void J(EO eO2, tO tO2) {
        EO b2 = tO2;
        EO a2 = eO2;
        super.J((tO)b2);
    }

    public static /* synthetic */ void J(EO eO2, boolean bl2) {
        boolean b2 = bl2;
        EO a2 = eO2;
        super.J(b2);
    }

    public static EO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(boolean bl2) {
        EO_3 a2;
        boolean b2 = bl2;
        EO_3 eO_3 = a2 = this;
        eO_3.actionCase_ = yRa.d;
        eO_3.action_ = b2;
    }

    public static EO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (EO_3)EO_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Parser<EO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasStopAnimation() {
        EO_3 a2;
        if (a2.actionCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static EO J(CodedInputStream a2) throws IOException {
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static EO J(byte[] a2) throws InvalidProtocolBufferException {
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(EO a2) {
        super.l();
    }

    public static EO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static EO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static zo J() {
        return (zo)DEFAULT_INSTANCE.createBuilder();
    }

    public static EO f(InputStream a2) throws IOException {
        return (EO_3)EO_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasPlayAnimation() {
        EO_3 a2;
        if (a2.actionCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ EO f() {
        return DEFAULT_INSTANCE;
    }

    private void f(tO tO2) {
        EO_3 eO_3;
        EO_3 b2 = tO2;
        EO_3 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == uqa.g && a2.action_ != tO.f()) {
            a2.action_ = ((qN)tO.J((tO)((tO)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            eO_3 = a2;
        } else {
            eO_3 = a2;
            a2.action_ = b2;
        }
        eO_3.actionCase_ = uqa.g;
    }

    public static zo J(EO a2) {
        return (zo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void l(EO a2) {
        super.f();
    }

    private void J(tO tO2) {
        EO_3 b2 = tO2;
        EO_3 a2 = this;
        b2.getClass();
        EO_3 eO_3 = a2;
        eO_3.action_ = b2;
        eO_3.actionCase_ = uqa.g;
    }

    public tO getPlayAnimation() {
        EO_3 a2;
        if (a2.actionCase_ == uqa.g) {
            return (tO)a2.action_;
        }
        return tO.f();
    }

    public static EO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        EO_3 a2;
        if (a2.actionCase_ == uqa.g) {
            EO_3 eO_3 = a2;
            eO_3.actionCase_ = uSa.E;
            eO_3.action_ = null;
        }
    }

    public aM getActionCase() {
        EO_3 a2;
        return aM.forNumber(a2.actionCase_);
    }

    public static /* synthetic */ void f(EO a2) {
        super.J();
    }

    public static EO J(InputStream a2) throws IOException {
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        EO_3 a2;
        if (a2.actionCase_ == yRa.d) {
            EO_3 eO_3 = a2;
            eO_3.actionCase_ = uSa.E;
            eO_3.action_ = null;
        }
    }

    private EO_3() {
        EO_3 a2;
    }

    public static EO J(ByteString a2) throws InvalidProtocolBufferException {
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        EO_3 a2 = this;
        a2.id_ = b2;
    }

    public static EO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(EO a2) {
        super.C();
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
        EO_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new EO_3();
            }
            case 2: {
                return new zo(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = Hta.m;
                objectArray[vRa.d] = Uta.J;
                objectArray[uqa.g] = uQa.Aa;
                objectArray[yRa.d] = tO.class;
                d2 = objectArray;
                Object b2 = Upa.Ga;
                return EO_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = EO_3.class;
                synchronized (EO_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<EO>(DEFAULT_INSTANCE);
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

    public static EO J() {
        return DEFAULT_INSTANCE;
    }

    public boolean getStopAnimation() {
        EO_3 a2;
        if (a2.actionCase_ == yRa.d) {
            return (Boolean)a2.action_;
        }
        return uSa.E != 0;
    }

    public static EO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (EO_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }
}

