/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Aa
 *  Am
 *  DQa
 *  ERa
 *  FTa
 *  JPa
 *  LQa
 *  NQa
 *  NTa
 *  Ssa
 *  Um
 *  Uta
 *  XTa
 *  aqa
 *  cQa
 *  en
 *  fsa
 *  hra
 *  isa
 *  kpa
 *  lqa
 *  pPa
 *  psa
 *  uQa
 *  ura
 *  vRa
 *  ysa
 *  zTa
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
public final class en_1
extends GeneratedMessageLite<en, Am>
implements Aa {
    private int soundCase_ = uSa.E;
    public static final int RESOURCE_FIELD_NUMBER = 2;
    private String id_ = Mqa.y;
    private float z_;
    private int category_;
    private static final en DEFAULT_INSTANCE;
    public static final int CATEGORY_FIELD_NUMBER = 5;
    private float distance_;
    private float y_;
    private Object sound_;
    public static final int Y_FIELD_NUMBER = 12;
    public static final int REPEATDELAY_FIELD_NUMBER = 9;
    public static final int VOLUME_FIELD_NUMBER = 7;
    public static final int PITCH_FIELD_NUMBER = 6;
    private int repeatDelay_;
    private float volume_;
    private static volatile Parser<en> PARSER;
    public static final int X_FIELD_NUMBER = 11;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int STREAMING_FIELD_NUMBER = 4;
    public static final int PATH_FIELD_NUMBER = 1;
    private int bitField0_;
    private float pitch_;
    public static final int Z_FIELD_NUMBER = 13;
    private boolean repeat_;
    public static final int REPEAT_FIELD_NUMBER = 8;
    private float x_;
    private boolean streaming_;
    public static final int DISTANCE_FIELD_NUMBER = 10;

    public boolean hasPitch() {
        en_1 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasDistance() {
        en_1 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Am J() {
        return (Am)DEFAULT_INSTANCE.createBuilder();
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        en_1 a2 = this;
        en_1.checkByteStringIsUtf8(b2);
        a2.id_ = b2.toStringUtf8();
        a2.bitField0_ |= vRa.d;
    }

    public boolean hasY() {
        en_1 a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void j() {
        a.bitField0_ &= NQa.A;
        a.volume_ = JPa.N;
    }

    public static /* synthetic */ void f(en en2, boolean bl) {
        boolean b2 = bl;
        en a2 = en2;
        super.J(b2);
    }

    public static /* synthetic */ void j(en a2) {
        super.C();
    }

    public static /* synthetic */ void F(en a2) {
        super.i();
    }

    public boolean getRepeat() {
        en_1 a2;
        return a2.repeat_;
    }

    public float getX() {
        en_1 a2;
        return a2.x_;
    }

    private void f(String string) {
        String b2 = string;
        en_1 a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public float getZ() {
        en_1 a2;
        return a2.z_;
    }

    public tN getSoundCase() {
        en_1 a2;
        return tN.forNumber(a2.soundCase_);
    }

    public static /* synthetic */ void e(en en2, float f2) {
        float b2 = f2;
        en a2 = en2;
        super.e(b2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        en_1 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.repeat_ = b2;
    }

    public boolean hasRepeat() {
        en_1 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasCategory() {
        en_1 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static en f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(en en2, String string) {
        Object b2 = string;
        en a2 = en2;
        super.J((String)b2);
    }

    public static /* synthetic */ void k(en a2) {
        super.d();
    }

    private void F() {
        en_1 a2;
        if (a2.soundCase_ == uqa.g) {
            en_1 en_12 = a2;
            en_12.soundCase_ = uSa.E;
            en_12.sound_ = null;
        }
    }

    private void e(float f2) {
        float b2 = f2;
        en_1 a2 = this;
        a2.bitField0_ |= hra.Ja;
        a2.x_ = b2;
    }

    private void k() {
        a.bitField0_ &= Bta.u;
        a.distance_ = JPa.N;
    }

    private void d(float f2) {
        float b2 = f2;
        en_1 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.volume_ = b2;
    }

    public int getResource() {
        en_1 a2;
        if (a2.soundCase_ == uqa.g) {
            return (Integer)a2.sound_;
        }
        return uSa.E;
    }

    public boolean hasX() {
        en_1 a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void G(en a2) {
        super.j();
    }

    private void J(String string) {
        String b2 = string;
        en_1 a2 = this;
        b2.getClass();
        en_1 en_12 = a2;
        en_12.soundCase_ = vRa.d;
        en_12.sound_ = b2;
    }

    public static /* synthetic */ en f() {
        return DEFAULT_INSTANCE;
    }

    public Um getCategory() {
        en_1 en_12 = this;
        en_1 a2 = Um.forNumber((int)en_12.category_);
        if (a2 == null) {
            return Um.UNRECOGNIZED;
        }
        return a2;
    }

    private void G() {
        a.bitField0_ &= MTa.c;
        a.x_ = JPa.N;
    }

    public static /* synthetic */ void J(en en2, String string) {
        Object b2 = string;
        en a2 = en2;
        super.f((String)b2);
    }

    public static /* synthetic */ void J(en en2, Um um2) {
        en b2 = um2;
        en a2 = en2;
        super.J((Um)b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        en_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.streaming_ = b2;
    }

    public static Parser<en> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasStreaming() {
        en_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getIdBytes() {
        en_1 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    private void D() {
        a.bitField0_ &= Jra.Fa;
        a.pitch_ = JPa.N;
    }

    public static en J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void D(en a2) {
        super.e();
    }

    public static /* synthetic */ void A(en a2) {
        super.l();
    }

    public static /* synthetic */ void i(en a2) {
        super.A();
    }

    public static /* synthetic */ void l(en en2, int n2) {
        int b2 = n2;
        en a2 = en2;
        super.l(b2);
    }

    public boolean hasPath() {
        en_1 a2;
        if (a2.soundCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(int n2) {
        int b2 = n2;
        en_1 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.category_ = b2;
    }

    public static Am J(en a2) {
        return (Am)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public ByteString getPathBytes() {
        en_1 en_12 = this;
        Object a2 = Mqa.y;
        if (en_12.soundCase_ == vRa.d) {
            a2 = (String)en_12.sound_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static en J(ByteString a2) throws InvalidProtocolBufferException {
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getCategoryValue() {
        en_1 a2;
        return a2.category_;
    }

    public boolean getStreaming() {
        en_1 a2;
        return a2.streaming_;
    }

    public static en J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void M(en a2) {
        super.D();
    }

    public float getY() {
        en_1 a2;
        return a2.y_;
    }

    private void C(float f2) {
        float b2 = f2;
        en_1 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.distance_ = b2;
    }

    private void f(int n2) {
        en_1 a2;
        int b2 = n2;
        en_1 en_12 = a2 = this;
        en_12.soundCase_ = uqa.g;
        en_12.sound_ = b2;
    }

    public static /* synthetic */ void f(en en2, ByteString byteString) {
        Object b2 = byteString;
        en a2 = en2;
        super.f((ByteString)b2);
    }

    public static /* synthetic */ void d(en en2, float f2) {
        float b2 = f2;
        en a2 = en2;
        super.l(b2);
    }

    public static en J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void e(en a2) {
        super.f();
    }

    public boolean hasVolume() {
        en_1 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static en f(InputStream a2) throws IOException {
        return (en_1)en_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void A() {
        a.bitField0_ &= kpa.w;
        a.category_ = uSa.E;
    }

    public static /* synthetic */ void d(en a2) {
        super.k();
    }

    public static /* synthetic */ void C(en a2) {
        super.J();
    }

    public static en J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (en_1)en_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getDistance() {
        en_1 a2;
        return a2.distance_;
    }

    public static /* synthetic */ void C(en en2, float f2) {
        float b2 = f2;
        en a2 = en2;
        super.f(b2);
    }

    private void l(float f2) {
        float b2 = f2;
        en_1 a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.y_ = b2;
    }

    public static /* synthetic */ void l(en en2, float f2) {
        float b2 = f2;
        en a2 = en2;
        super.C(b2);
    }

    private void i() {
        a.bitField0_ &= ERa.Ka;
        a.streaming_ = uSa.E;
    }

    public static /* synthetic */ void f(en en2, int n2) {
        int b2 = n2;
        en a2 = en2;
        super.f(b2);
    }

    private void f(float f2) {
        float b2 = f2;
        en_1 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.pitch_ = b2;
    }

    public static /* synthetic */ void J(en en2, ByteString byteString) {
        Object b2 = byteString;
        en a2 = en2;
        super.J((ByteString)b2);
    }

    private void J(int n2) {
        int b2 = n2;
        en_1 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.repeatDelay_ = b2;
    }

    private void M() {
        a.bitField0_ &= fta.fa;
        a.repeat_ = uSa.E;
    }

    public static /* synthetic */ void l(en a2) {
        super.M();
    }

    private void J(ByteString byteString) {
        en_1 a2;
        ByteString b2 = byteString;
        en_1 en_12 = a2 = this;
        en_1.checkByteStringIsUtf8(b2);
        en_12.sound_ = b2.toStringUtf8();
        en_12.soundCase_ = vRa.d;
    }

    public int getRepeatDelay() {
        en_1 a2;
        return a2.repeatDelay_;
    }

    public static /* synthetic */ void f(en en2, float f2) {
        float b2 = f2;
        en a2 = en2;
        super.d(b2);
    }

    private void e() {
        en_1 a2;
        en_1 en_12 = a2;
        en_12.soundCase_ = uSa.E;
        en_12.sound_ = null;
    }

    private void d() {
        a.bitField0_ &= aqa.C;
        a.z_ = JPa.N;
    }

    private void C() {
        a.bitField0_ &= Uta.Z;
        a.y_ = JPa.N;
    }

    public boolean hasId() {
        en_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasZ() {
        en_1 a2;
        if ((a2.bitField0_ & ura.V) != 0) {
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
        en_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new en_1();
            }
            case 2: {
                return new Am(null);
            }
            case 3: {
                Object[] objectArray = new Object[hpa.Z];
                objectArray[uSa.E] = eta.E;
                objectArray[vRa.d] = fsa.i;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = uQa.Aa;
                objectArray[AQa.P] = psa.E;
                objectArray[tTa.h] = MTa.M;
                objectArray[uua.p] = Nra.u;
                objectArray[XTa.W] = zTa.l;
                objectArray[Yqa.i] = qsa.O;
                objectArray[WOa.fa] = hpa.W;
                objectArray[NTa.C] = FTa.ja;
                objectArray[pPa.f] = LQa.k;
                objectArray[lqa.s] = isa.I;
                objectArray[uua.s] = DQa.Z;
                d2 = objectArray;
                Object b2 = Ssa.C;
                return en_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = en_1.class;
                synchronized (en_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<en>(DEFAULT_INSTANCE);
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

    private void J(float f2) {
        float b2 = f2;
        en_1 a2 = this;
        a2.bitField0_ |= ura.V;
        a2.z_ = b2;
    }

    private en_1() {
        en_1 a2;
    }

    private void l() {
        en_1 a2;
        if (a2.soundCase_ == vRa.d) {
            en_1 en_12 = a2;
            en_12.soundCase_ = uSa.E;
            en_12.sound_ = null;
        }
    }

    public String getId() {
        en_1 a2;
        return a2.id_;
    }

    public float getVolume() {
        en_1 a2;
        return a2.volume_;
    }

    static {
        en_1 en_12 = new en_1();
        DEFAULT_INSTANCE = en_12;
        GeneratedMessageLite.registerDefaultInstance(en_1.class, en_12);
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.id_ = en_1.J().getId();
    }

    public static en J(byte[] a2) throws InvalidProtocolBufferException {
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static en J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static en J(CodedInputStream a2) throws IOException {
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(Um um2) {
        en_1 b2 = um2;
        en_1 a2 = this;
        a2.category_ = b2.getNumber();
        a2.bitField0_ |= AQa.P;
    }

    public String getPath() {
        en_1 en_12 = this;
        Object a2 = Mqa.y;
        if (en_12.soundCase_ == vRa.d) {
            a2 = (String)en_12.sound_;
        }
        return a2;
    }

    private void J() {
        a.bitField0_ &= VPa.A;
        a.repeatDelay_ = uSa.E;
    }

    public static /* synthetic */ void J(en en2, int n2) {
        int b2 = n2;
        en a2 = en2;
        super.J(b2);
    }

    public static /* synthetic */ void J(en en2, boolean bl) {
        boolean b2 = bl;
        en a2 = en2;
        super.f(b2);
    }

    public boolean hasResource() {
        en_1 a2;
        if (a2.soundCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float getPitch() {
        en_1 a2;
        return a2.pitch_;
    }

    public static en J() {
        return DEFAULT_INSTANCE;
    }

    public static en J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(en en2, float f2) {
        float b2 = f2;
        en a2 = en2;
        super.J(b2);
    }

    public static /* synthetic */ void f(en a2) {
        super.G();
    }

    public boolean hasRepeatDelay() {
        en_1 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(en a2) {
        super.F();
    }

    public static en J(InputStream a2) throws IOException {
        return (en_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

