/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ara
 *  Fra
 *  Gpa
 *  IQa
 *  OQa
 *  Opa
 *  PPa
 *  XTa
 *  Xqa
 *  cpa
 *  cqa
 *  gRa
 *  mQa
 *  nQa
 *  pc
 *  qra
 *  vRa
 *  xOa
 *  xQa
 *  xpa
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
public final class Gra
extends GeneratedMessageLite<Gra, xpa>
implements pc {
    private static volatile Parser<Gra> PARSER;
    public static final int SEND_AUDIO_END_FIELD_NUMBER = 4;
    public static final int DISCONNECT_FIELD_NUMBER = 6;
    public static final int SEND_AUDIO_FIELD_NUMBER = 3;
    public static final int REQUEST_PLAYERS_DATA_FIELD_NUMBER = 5;
    private Object data_;
    public static final int PING_FIELD_NUMBER = 1;
    public static final int UPDATE_MICRO_FIELD_NUMBER = 2;
    private static final Gra DEFAULT_INSTANCE;
    private int dataCase_ = uSa.E;

    public static /* synthetic */ void f(Gra gra2, cpa cpa2) {
        Gra b2 = cpa2;
        Gra a2 = gra2;
        a2.J((cpa)b2);
    }

    public static /* synthetic */ void M(Gra a2) {
        a2.d();
    }

    public static Gra J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(qra qra2) {
        Gra gra2;
        Gra b2 = qra2;
        Gra a2 = this;
        b2.getClass();
        if (a2.dataCase_ == yRa.d && a2.data_ != qra.J()) {
            a2.data_ = ((IQa)qra.J((qra)((qra)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            gra2 = a2;
        } else {
            gra2 = a2;
            a2.data_ = b2;
        }
        gra2.dataCase_ = yRa.d;
    }

    public static Gra f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return Gra.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(Gra gra2, Fra fra2) {
        Gra b2 = fra2;
        Gra a2 = gra2;
        a2.f((Fra)b2);
    }

    public static /* synthetic */ void f(Gra gra2, OQa oQa2) {
        Gra b2 = oQa2;
        Gra a2 = gra2;
        a2.J((OQa)b2);
    }

    private void f(Opa opa2) {
        Gra gra2;
        Gra b2 = opa2;
        Gra a2 = this;
        b2.getClass();
        if (a2.dataCase_ == vRa.d && a2.data_ != Opa.J()) {
            a2.data_ = ((PPa)Opa.J((Opa)((Opa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            gra2 = a2;
        } else {
            gra2 = a2;
            a2.data_ = b2;
        }
        gra2.dataCase_ = vRa.d;
    }

    public static /* synthetic */ void f(Gra gra2, Xqa xqa2) {
        Gra b2 = xqa2;
        Gra a2 = gra2;
        a2.f((Xqa)b2);
    }

    public Fra getSendAudioEnd() {
        Gra a2;
        if (a2.dataCase_ == AQa.P) {
            return (Fra)a2.data_;
        }
        return Fra.J();
    }

    public boolean hasPing() {
        Gra a2;
        if (a2.dataCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Gra J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Gra J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Gra f(InputStream a2) throws IOException {
        return Gra.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ Gra f() {
        return DEFAULT_INSTANCE;
    }

    public static Gra J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Gra gra2, cpa cpa2) {
        Gra b2 = cpa2;
        Gra a2 = gra2;
        a2.f((cpa)b2);
    }

    private void J(Opa opa2) {
        Gra b2 = opa2;
        Gra a2 = this;
        b2.getClass();
        Gra gra2 = a2;
        gra2.data_ = b2;
        gra2.dataCase_ = vRa.d;
    }

    public static Gra J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private Gra() {
        Gra a2;
    }

    static {
        Gra gra2;
        DEFAULT_INSTANCE = gra2 = new Gra();
        GeneratedMessageLite.registerDefaultInstance(Gra.class, gra2);
    }

    private void f(cpa cpa2) {
        Gra b2 = cpa2;
        Gra a2 = this;
        b2.getClass();
        Gra gra2 = a2;
        gra2.data_ = b2;
        gra2.dataCase_ = uqa.g;
    }

    private void M() {
        Gra a2;
        if (a2.dataCase_ == uua.p) {
            Gra gra2 = a2;
            gra2.dataCase_ = uSa.E;
            gra2.data_ = null;
        }
    }

    public Xqa getRequestPlayersData() {
        Gra a2;
        if (a2.dataCase_ == tTa.h) {
            return (Xqa)a2.data_;
        }
        return Xqa.f();
    }

    public boolean hasUpdateMicro() {
        Gra a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void e(Gra a2) {
        a2.l();
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
        Gra c2 = this;
        switch (Gpa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Gra();
            }
            case 2: {
                return new xpa(null);
            }
            case 3: {
                Object[] objectArray = new Object[Yqa.i];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = Opa.class;
                objectArray[yRa.d] = cpa.class;
                objectArray[AQa.P] = qra.class;
                objectArray[tTa.h] = Fra.class;
                objectArray[uua.p] = Xqa.class;
                objectArray[XTa.W] = OQa.class;
                d2 = objectArray;
                Object b2 = xOa.y;
                return Gra.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Gra.class;
                synchronized (Gra.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Gra>(DEFAULT_INSTANCE);
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

    public static xpa J(Gra a2) {
        return (xpa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public Opa getPing() {
        Gra a2;
        if (a2.dataCase_ == vRa.d) {
            return (Opa)a2.data_;
        }
        return Opa.J();
    }

    public static /* synthetic */ void J(Gra gra2, Xqa xqa2) {
        Gra b2 = xqa2;
        Gra a2 = gra2;
        a2.J((Xqa)b2);
    }

    private void J(cpa cpa2) {
        Gra gra2;
        Gra b2 = cpa2;
        Gra a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uqa.g && a2.data_ != cpa.f()) {
            a2.data_ = ((xQa)cpa.J((cpa)((cpa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            gra2 = a2;
        } else {
            gra2 = a2;
            a2.data_ = b2;
        }
        gra2.dataCase_ = uqa.g;
    }

    public static /* synthetic */ void d(Gra a2) {
        a2.f();
    }

    public static /* synthetic */ void C(Gra a2) {
        a2.e();
    }

    public static /* synthetic */ void J(Gra gra2, OQa oQa2) {
        Gra b2 = oQa2;
        Gra a2 = gra2;
        a2.f((OQa)b2);
    }

    public cqa getDataCase() {
        Gra a2;
        return cqa.forNumber((int)a2.dataCase_);
    }

    public static Gra J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void e() {
        Gra a2;
        if (a2.dataCase_ == vRa.d) {
            Gra gra2 = a2;
            gra2.dataCase_ = uSa.E;
            gra2.data_ = null;
        }
    }

    private void f(Fra fra2) {
        Gra gra2;
        Gra b2 = fra2;
        Gra a2 = this;
        b2.getClass();
        if (a2.dataCase_ == AQa.P && a2.data_ != Fra.J()) {
            a2.data_ = ((mQa)Fra.J((Fra)((Fra)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            gra2 = a2;
        } else {
            gra2 = a2;
            a2.data_ = b2;
        }
        gra2.dataCase_ = AQa.P;
    }

    public boolean hasRequestPlayersData() {
        Gra a2;
        if (a2.dataCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Gra J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public boolean hasDisconnect() {
        Gra a2;
        if (a2.dataCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(qra qra2) {
        Gra b2 = qra2;
        Gra a2 = this;
        b2.getClass();
        Gra gra2 = a2;
        gra2.data_ = b2;
        gra2.dataCase_ = yRa.d;
    }

    private void J(Fra fra2) {
        Gra b2 = fra2;
        Gra a2 = this;
        b2.getClass();
        Gra gra2 = a2;
        gra2.data_ = b2;
        gra2.dataCase_ = AQa.P;
    }

    public static /* synthetic */ void l(Gra a2) {
        a2.M();
    }

    public static Gra J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(Gra gra2, Fra fra2) {
        Gra b2 = fra2;
        Gra a2 = gra2;
        a2.J((Fra)b2);
    }

    public static xpa J() {
        return (xpa)DEFAULT_INSTANCE.createBuilder();
    }

    private void f(OQa oQa2) {
        Gra b2 = oQa2;
        Gra a2 = this;
        b2.getClass();
        Gra gra2 = a2;
        gra2.data_ = b2;
        gra2.dataCase_ = uua.p;
    }

    public cpa getUpdateMicro() {
        Gra a2;
        if (a2.dataCase_ == uqa.g) {
            return (cpa)a2.data_;
        }
        return cpa.f();
    }

    public static /* synthetic */ void f(Gra a2) {
        a2.C();
    }

    public static Gra J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Gra gra2, Opa opa2) {
        Gra b2 = opa2;
        Gra a2 = gra2;
        a2.J((Opa)b2);
    }

    public static /* synthetic */ void J(Gra a2) {
        a2.J();
    }

    public static Gra J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public OQa getDisconnect() {
        Gra a2;
        if (a2.dataCase_ == uua.p) {
            return (OQa)a2.data_;
        }
        return OQa.f();
    }

    private void d() {
        Gra a2;
        if (a2.dataCase_ == tTa.h) {
            Gra gra2 = a2;
            gra2.dataCase_ = uSa.E;
            gra2.data_ = null;
        }
    }

    public boolean hasSendAudioEnd() {
        Gra a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(OQa oQa2) {
        Gra gra2;
        Gra b2 = oQa2;
        Gra a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uua.p && a2.data_ != OQa.f()) {
            a2.data_ = ((gRa)OQa.J((OQa)((OQa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            gra2 = a2;
        } else {
            gra2 = a2;
            a2.data_ = b2;
        }
        gra2.dataCase_ = uua.p;
    }

    private void C() {
        Gra a2;
        Gra gra2 = a2;
        gra2.dataCase_ = uSa.E;
        gra2.data_ = null;
    }

    private void f(Xqa xqa2) {
        Gra b2 = xqa2;
        Gra a2 = this;
        b2.getClass();
        Gra gra2 = a2;
        gra2.data_ = b2;
        gra2.dataCase_ = tTa.h;
    }

    private void l() {
        Gra a2;
        if (a2.dataCase_ == uqa.g) {
            Gra gra2 = a2;
            gra2.dataCase_ = uSa.E;
            gra2.data_ = null;
        }
    }

    public qra getSendAudio() {
        Gra a2;
        if (a2.dataCase_ == yRa.d) {
            return (qra)a2.data_;
        }
        return qra.J();
    }

    private void f() {
        Gra a2;
        if (a2.dataCase_ == yRa.d) {
            Gra gra2 = a2;
            gra2.dataCase_ = uSa.E;
            gra2.data_ = null;
        }
    }

    public boolean hasSendAudio() {
        Gra a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(Gra gra2, qra qra2) {
        Gra b2 = qra2;
        Gra a2 = gra2;
        a2.J((qra)b2);
    }

    private void J(Xqa xqa2) {
        Gra gra2;
        Gra b2 = xqa2;
        Gra a2 = this;
        b2.getClass();
        if (a2.dataCase_ == tTa.h && a2.data_ != Xqa.f()) {
            a2.data_ = ((Ara)Xqa.J((Xqa)((Xqa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            gra2 = a2;
        } else {
            gra2 = a2;
            a2.data_ = b2;
        }
        gra2.dataCase_ = tTa.h;
    }

    public static Gra J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Gra gra2, qra qra2) {
        Gra b2 = qra2;
        Gra a2 = gra2;
        a2.f((qra)b2);
    }

    public static /* synthetic */ void J(Gra gra2, Opa opa2) {
        Gra b2 = opa2;
        Gra a2 = gra2;
        a2.f((Opa)b2);
    }

    private void J() {
        Gra a2;
        if (a2.dataCase_ == AQa.P) {
            Gra gra2 = a2;
            gra2.dataCase_ = uSa.E;
            gra2.data_ = null;
        }
    }

    public static Parser<Gra> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

