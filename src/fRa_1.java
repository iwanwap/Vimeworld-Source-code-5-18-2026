/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cpa
 *  Epa
 *  Ipa
 *  Mra
 *  NTa
 *  OPa
 *  Rqa
 *  Rra
 *  VOa
 *  Vpa
 *  XTa
 *  YQa
 *  apa
 *  bQa
 *  epa
 *  fRa
 *  fra
 *  lqa
 *  mpa
 *  nQa
 *  pOa
 *  pPa
 *  qOa
 *  qPa
 *  qqa
 *  rOa
 *  spa
 *  vOa
 *  vRa
 *  wpa
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
public final class fRa_1
extends GeneratedMessageLite<fRa, VOa>
implements yC {
    public static final int OUTDATED_CLIENT_FIELD_NUMBER = 2;
    public static final int DISCONNECT_PLAYER_FIELD_NUMBER = 8;
    private static final fRa DEFAULT_INSTANCE;
    private int dataCase_ = uSa.E;
    public static final int ONE_PLAYER_DATA_FIELD_NUMBER = 3;
    public static final int AUDIO_END_FIELD_NUMBER = 7;
    public static final int PLAYER_LIST_DATA_FIELD_NUMBER = 4;
    public static final int DISCONNECT_FIELD_NUMBER = 9;
    public static final int PONG_FIELD_NUMBER = 1;
    public static final int AUDIO_FIELD_NUMBER = 6;
    public static final int UPDATE_MUTED_FIELD_NUMBER = 5;
    private Object data_;
    public static final int AUDIO_DATA_BATCH_FIELD_NUMBER = 10;
    private static volatile Parser<fRa> PARSER;

    @Override
    public OPa getDisconnectPlayer() {
        fRa_1 a2;
        if (a2.dataCase_ == Yqa.i) {
            return (OPa)a2.data_;
        }
        return OPa.f();
    }

    private void G() {
        fRa_1 a2;
        if (a2.dataCase_ == Yqa.i) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    private void D() {
        fRa_1 a2;
        if (a2.dataCase_ == tTa.h) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    public static /* synthetic */ void f(fRa fRa2, pOa pOa2) {
        fRa b2 = pOa2;
        fRa a2 = fRa2;
        super.J((pOa)b2);
    }

    public static /* synthetic */ void G(fRa a2) {
        super.l();
    }

    @Override
    public mpa getDisconnect() {
        fRa_1 a2;
        if (a2.dataCase_ == WOa.fa) {
            return (mpa)a2.data_;
        }
        return mpa.J();
    }

    public static /* synthetic */ void f(fRa fRa2, Rra rra) {
        fRa b2 = rra;
        fRa a2 = fRa2;
        super.J((Rra)b2);
    }

    private void f(Mra mra2) {
        fRa_1 b2 = mra2;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = XTa.W;
    }

    private void f(Vpa vpa2) {
        fRa_1 fRa_12;
        fRa_1 b2 = vpa2;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == vRa.d && a2.data_ != Vpa.f()) {
            a2.data_ = ((qOa)Vpa.J((Vpa)((Vpa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = vRa.d;
    }

    @Override
    public boolean hasAudio() {
        fRa_1 a2;
        if (a2.dataCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasDisconnectPlayer() {
        fRa_1 a2;
        if (a2.dataCase_ == Yqa.i) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static fRa J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(fRa fRa2, mpa mpa2) {
        fRa b2 = mpa2;
        fRa a2 = fRa2;
        super.J((mpa)b2);
    }

    public static fRa J(CodedInputStream a2) throws IOException {
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fRa f() {
        return DEFAULT_INSTANCE;
    }

    private void J(Mra mra2) {
        fRa_1 fRa_12;
        fRa_1 b2 = mra2;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == XTa.W && a2.data_ != Mra.J()) {
            a2.data_ = ((YQa)Mra.J((Mra)((Mra)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = XTa.W;
    }

    private void f(Rqa rqa) {
        fRa_1 fRa_12;
        fRa_1 b2 = rqa;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uqa.g && a2.data_ != Rqa.f()) {
            a2.data_ = ((fra)Rqa.J((Rqa)((Rqa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = uqa.g;
    }

    public static /* synthetic */ void f(fRa fRa2, Rqa rqa) {
        fRa b2 = rqa;
        fRa a2 = fRa2;
        super.J((Rqa)b2);
    }

    @Override
    public boolean hasOnePlayerData() {
        fRa_1 a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(OPa oPa) {
        fRa_1 fRa_12;
        fRa_1 b2 = oPa;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == Yqa.i && a2.data_ != OPa.f()) {
            a2.data_ = ((epa)OPa.J((OPa)((OPa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = Yqa.i;
    }

    private void f(Dra dra) {
        fRa_1 fRa_12;
        GeneratedMessageLite b2 = dra;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uua.p && a2.data_ != Dra.J()) {
            a2.data_ = ((spa)Dra.J((Dra)a2.data_).mergeFrom(b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = uua.p;
    }

    public static /* synthetic */ void D(fRa a2) {
        super.M();
    }

    private void f(pOa pOa2) {
        fRa_1 b2 = pOa2;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = NTa.C;
    }

    @Override
    public Mra getAudioEnd() {
        fRa_1 a2;
        if (a2.dataCase_ == XTa.W) {
            return (Mra)a2.data_;
        }
        return Mra.J();
    }

    public static /* synthetic */ void f(fRa fRa2, bQa bQa2) {
        fRa b2 = bQa2;
        fRa a2 = fRa2;
        super.f((bQa)b2);
    }

    private void f(bQa bQa2) {
        fRa_1 b2 = bQa2;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = AQa.P;
    }

    private void f(Rra rra) {
        fRa_1 b2 = rra;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = yRa.d;
    }

    public static /* synthetic */ void f(fRa fRa2, Vpa vpa2) {
        fRa b2 = vpa2;
        fRa a2 = fRa2;
        super.f((Vpa)b2);
    }

    public static /* synthetic */ void J(fRa fRa2, Rqa rqa) {
        fRa b2 = rqa;
        fRa a2 = fRa2;
        super.f((Rqa)b2);
    }

    static {
        fRa_1 fRa_12 = new fRa_1();
        DEFAULT_INSTANCE = fRa_12;
        GeneratedMessageLite.registerDefaultInstance(fRa_1.class, fRa_12);
    }

    @Override
    public boolean hasUpdateMuted() {
        fRa_1 a2;
        if (a2.dataCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static fRa J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static fRa f(InputStream a2) throws IOException {
        return (fRa_1)fRa_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(OPa oPa) {
        fRa_1 b2 = oPa;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = Yqa.i;
    }

    public static VOa J() {
        return (VOa)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(fRa fRa2, mpa mpa2) {
        fRa b2 = mpa2;
        fRa a2 = fRa2;
        super.f((mpa)b2);
    }

    private void J(Rra rra) {
        fRa_1 fRa_12;
        fRa_1 b2 = rra;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == yRa.d && a2.data_ != Rra.f()) {
            a2.data_ = ((vOa)Rra.J((Rra)((Rra)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = yRa.d;
    }

    public static /* synthetic */ void A(fRa a2) {
        super.G();
    }

    public static fRa J(byte[] a2) throws InvalidProtocolBufferException {
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasOutdatedClient() {
        fRa_1 a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(wpa wpa2) {
        fRa_1 fRa_12;
        fRa_1 b2 = wpa2;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == tTa.h && a2.data_ != wpa.f()) {
            a2.data_ = ((rOa)wpa.J((wpa)((wpa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = tTa.h;
    }

    public static fRa f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void A() {
        fRa_1 a2;
        if (a2.dataCase_ == XTa.W) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    public static /* synthetic */ void f(fRa fRa2, OPa oPa) {
        fRa b2 = oPa;
        fRa a2 = fRa2;
        super.J((OPa)b2);
    }

    @Override
    public pOa getAudioDataBatch() {
        fRa_1 a2;
        if (a2.dataCase_ == NTa.C) {
            return (pOa)a2.data_;
        }
        return pOa.J();
    }

    public static /* synthetic */ void i(fRa a2) {
        super.i();
    }

    public static fRa J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (fRa_1)fRa_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public Rqa getOutdatedClient() {
        fRa_1 a2;
        if (a2.dataCase_ == uqa.g) {
            return (Rqa)a2.data_;
        }
        return Rqa.f();
    }

    private void J(Vpa vpa2) {
        fRa_1 b2 = vpa2;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = vRa.d;
    }

    @Override
    public boolean hasAudioEnd() {
        fRa_1 a2;
        if (a2.dataCase_ == XTa.W) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
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
        fRa_1 c2 = this;
        switch (Ipa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new fRa_1();
            }
            case 2: {
                return new VOa(null);
            }
            case 3: {
                Object[] objectArray = new Object[lqa.s];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = Vpa.class;
                objectArray[yRa.d] = Rqa.class;
                objectArray[AQa.P] = Rra.class;
                objectArray[tTa.h] = bQa.class;
                objectArray[uua.p] = wpa.class;
                objectArray[XTa.W] = Dra.class;
                objectArray[Yqa.i] = Mra.class;
                objectArray[WOa.fa] = OPa.class;
                objectArray[NTa.C] = mpa.class;
                objectArray[pPa.f] = pOa.class;
                d2 = objectArray;
                Object b2 = Epa.z;
                return fRa_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = fRa_1.class;
                synchronized (fRa_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<fRa>(DEFAULT_INSTANCE);
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

    private void J(pOa pOa2) {
        fRa_1 fRa_12;
        fRa_1 b2 = pOa2;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == NTa.C && a2.data_ != pOa.J()) {
            a2.data_ = ((qqa)pOa.J((pOa)((pOa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = NTa.C;
    }

    public static /* synthetic */ void M(fRa a2) {
        super.f();
    }

    public static VOa J(fRa a2) {
        return (VOa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public Vpa getPong() {
        fRa_1 a2;
        if (a2.dataCase_ == vRa.d) {
            return (Vpa)a2.data_;
        }
        return Vpa.f();
    }

    private void i() {
        fRa_1 a2;
        if (a2.dataCase_ == uqa.g) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    public static /* synthetic */ void J(fRa fRa2, pOa pOa2) {
        fRa b2 = pOa2;
        fRa a2 = fRa2;
        super.f((pOa)b2);
    }

    public static /* synthetic */ void f(fRa fRa2, Mra mra2) {
        fRa b2 = mra2;
        fRa a2 = fRa2;
        super.f((Mra)b2);
    }

    @Override
    public Rra getOnePlayerData() {
        fRa_1 a2;
        if (a2.dataCase_ == yRa.d) {
            return (Rra)a2.data_;
        }
        return Rra.f();
    }

    @Override
    public bQa getPlayerListData() {
        fRa_1 a2;
        if (a2.dataCase_ == AQa.P) {
            return (bQa)a2.data_;
        }
        return bQa.f();
    }

    public static /* synthetic */ void e(fRa a2) {
        super.J();
    }

    public static /* synthetic */ void d(fRa a2) {
        super.C();
    }

    private void M() {
        fRa_1 a2;
        if (a2.dataCase_ == yRa.d) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    public static /* synthetic */ void J(fRa fRa2, bQa bQa2) {
        fRa b2 = bQa2;
        fRa a2 = fRa2;
        super.J((bQa)b2);
    }

    public static fRa J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static fRa J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void e() {
        fRa_1 a2;
        if (a2.dataCase_ == vRa.d) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    public static /* synthetic */ void f(fRa fRa2, wpa wpa2) {
        fRa b2 = wpa2;
        fRa a2 = fRa2;
        super.J((wpa)b2);
    }

    public static /* synthetic */ void C(fRa a2) {
        super.A();
    }

    @Override
    public boolean hasDisconnect() {
        fRa_1 a2;
        if (a2.dataCase_ == WOa.fa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(fRa fRa2, Rra rra) {
        fRa b2 = rra;
        fRa a2 = fRa2;
        super.f((Rra)b2);
    }

    private void J(Dra dra) {
        GeneratedMessageLite b2 = dra;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = uua.p;
    }

    public static /* synthetic */ void l(fRa a2) {
        super.e();
    }

    public static fRa J(ByteString a2) throws InvalidProtocolBufferException {
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(fRa a2) {
        super.d();
    }

    public static /* synthetic */ void f(fRa fRa2, Dra dra) {
        Object b2 = dra;
        fRa a2 = fRa2;
        super.J((Dra)b2);
    }

    @Override
    public boolean hasPong() {
        fRa_1 a2;
        if (a2.dataCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(Rqa rqa) {
        fRa_1 b2 = rqa;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = uqa.g;
    }

    private void d() {
        fRa_1 a2;
        if (a2.dataCase_ == NTa.C) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    public static /* synthetic */ void J(fRa fRa2, wpa wpa2) {
        fRa b2 = wpa2;
        fRa a2 = fRa2;
        super.f((wpa)b2);
    }

    public static Parser<fRa> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static fRa J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasPlayerListData() {
        fRa_1 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(fRa fRa2, Vpa vpa2) {
        fRa b2 = vpa2;
        fRa a2 = fRa2;
        super.J((Vpa)b2);
    }

    public static /* synthetic */ fRa J() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public wpa getUpdateMuted() {
        fRa_1 a2;
        if (a2.dataCase_ == tTa.h) {
            return (wpa)a2.data_;
        }
        return wpa.f();
    }

    public static /* synthetic */ void J(fRa fRa2, Mra mra2) {
        fRa b2 = mra2;
        fRa a2 = fRa2;
        super.J((Mra)b2);
    }

    private void f(mpa mpa2) {
        fRa_1 b2 = mpa2;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = WOa.fa;
    }

    @Override
    public Dra getAudio() {
        fRa_1 a2;
        if (a2.dataCase_ == uua.p) {
            return (Dra)a2.data_;
        }
        return Dra.J();
    }

    private void C() {
        fRa_1 a2;
        fRa_1 fRa_12 = a2;
        fRa_12.dataCase_ = uSa.E;
        fRa_12.data_ = null;
    }

    private fRa_1() {
        fRa_1 a2;
    }

    public static /* synthetic */ void J(fRa fRa2, OPa oPa) {
        fRa b2 = oPa;
        fRa a2 = fRa2;
        super.f((OPa)b2);
    }

    public static /* synthetic */ void J(fRa fRa2, Dra dra) {
        Object b2 = dra;
        fRa a2 = fRa2;
        super.f((Dra)b2);
    }

    private void l() {
        fRa_1 a2;
        if (a2.dataCase_ == AQa.P) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    private void J(bQa bQa2) {
        fRa_1 fRa_12;
        fRa_1 b2 = bQa2;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == AQa.P && a2.data_ != bQa.f()) {
            a2.data_ = ((Cpa)bQa.J((bQa)((bQa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = AQa.P;
    }

    public static /* synthetic */ void J(fRa a2) {
        super.D();
    }

    private void f() {
        fRa_1 a2;
        if (a2.dataCase_ == WOa.fa) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    private void J(wpa wpa2) {
        fRa_1 b2 = wpa2;
        fRa_1 a2 = this;
        b2.getClass();
        fRa_1 fRa_12 = a2;
        fRa_12.data_ = b2;
        fRa_12.dataCase_ = tTa.h;
    }

    @Override
    public boolean hasAudioDataBatch() {
        fRa_1 a2;
        if (a2.dataCase_ == NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public qPa getDataCase() {
        fRa_1 a2;
        return qPa.forNumber((int)a2.dataCase_);
    }

    public static fRa J(InputStream a2) throws IOException {
        return (fRa_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        fRa_1 a2;
        if (a2.dataCase_ == uua.p) {
            fRa_1 fRa_12 = a2;
            fRa_12.dataCase_ = uSa.E;
            fRa_12.data_ = null;
        }
    }

    private void J(mpa mpa2) {
        fRa_1 fRa_12;
        fRa_1 b2 = mpa2;
        fRa_1 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == WOa.fa && a2.data_ != mpa.J()) {
            a2.data_ = ((apa)mpa.J((mpa)((mpa)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            fRa_12 = a2;
        } else {
            fRa_12 = a2;
            a2.data_ = b2;
        }
        fRa_12.dataCase_ = WOa.fa;
    }
}

