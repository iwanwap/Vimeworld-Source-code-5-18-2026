/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  MQa
 *  NQa
 *  NTa
 *  Uta
 *  XTa
 *  aqa
 *  asa
 *  bpa
 *  cQa
 *  da
 *  hTa
 *  hra
 *  kpa
 *  lqa
 *  pPa
 *  ura
 *  vRa
 *  ysa
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
public final class Hm
extends GeneratedMessageLite<Hm, Bn>
implements da {
    private int scale_;
    public static final int SCALE_FIELD_NUMBER = 2;
    public static final int LEGGINGS_FIELD_NUMBER = 8;
    private boolean followMouse_;
    private String itemInHand_;
    public static final int BOOTS_FIELD_NUMBER = 9;
    private int bitField0_;
    public static final int PITCH_FIELD_NUMBER = 4;
    private static final Hm DEFAULT_INSTANCE;
    private String boots_;
    private float pitch_;
    public static final int UUID_FIELD_NUMBER = 1;
    private String chestplate_;
    private static volatile Parser<Hm> PARSER;
    public static final int CHESTPLATE_FIELD_NUMBER = 7;
    private String helmet_;
    public static final int ITEMINHAND_FIELD_NUMBER = 5;
    private float yaw_;
    public static final int YAW_FIELD_NUMBER = 3;
    public static final int NICKNAME_FIELD_NUMBER = 11;
    public static final int HELMET_FIELD_NUMBER = 6;
    private ByteString uuid_ = ByteString.EMPTY;
    private String leggings_;
    private String nickname_;
    public static final int FOLLOWMOUSE_FIELD_NUMBER = 10;

    private void M(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        Hm.checkByteStringIsUtf8(b2);
        a2.boots_ = b2.toStringUtf8();
        a2.bitField0_ |= hra.Ja;
    }

    public static /* synthetic */ void G(Hm a2) {
        a2.D();
    }

    private void e(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        Hm.checkByteStringIsUtf8(b2);
        a2.chestplate_ = b2.toStringUtf8();
        a2.bitField0_ |= ysa.s;
    }

    public static Hm f() {
        return DEFAULT_INSTANCE;
    }

    private void e(String string) {
        String b2 = string;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= hra.Ja;
        a2.boots_ = b2;
    }

    private void G() {
        a.bitField0_ &= ERa.Ka;
        a.scale_ = uSa.E;
    }

    public static Hm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Hm hm, float f2) {
        float b2 = f2;
        Hm a2 = hm;
        a2.f(b2);
    }

    public static Hm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void e(Hm hm, String string) {
        String b2 = string;
        Hm a2 = hm;
        a2.e(b2);
    }

    public boolean hasBoots() {
        Hm a2;
        if ((a2.bitField0_ & hra.Ja) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getHelmet() {
        Hm a2;
        return a2.helmet_;
    }

    private void D() {
        a.bitField0_ &= Bta.u;
        a.leggings_ = Hm.f().getLeggings();
    }

    private void A() {
        a.bitField0_ &= Jra.Fa;
        a.pitch_ = JPa.N;
    }

    public boolean hasUuid() {
        Hm a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void M(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.M(b2);
    }

    private void f(float f2) {
        float b2 = f2;
        Hm a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.yaw_ = b2;
    }

    public static /* synthetic */ void D(Hm a2) {
        a2.G();
    }

    private void d(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        Hm.checkByteStringIsUtf8(b2);
        a2.leggings_ = b2.toStringUtf8();
        a2.bitField0_ |= XOa.h;
    }

    public static /* synthetic */ void J(Hm hm, float f2) {
        float b2 = f2;
        Hm a2 = hm;
        a2.J(b2);
    }

    public boolean hasScale() {
        Hm a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean hasHelmet() {
        Hm a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public String getNickname() {
        Hm a2;
        return a2.nickname_;
    }

    public ByteString getItemInHandBytes() {
        Hm a2;
        return ByteString.copyFromUtf8(a2.itemInHand_);
    }

    public static Bn J() {
        return (Bn)DEFAULT_INSTANCE.createBuilder();
    }

    public String getChestplate() {
        Hm a2;
        return a2.chestplate_;
    }

    public boolean hasChestplate() {
        Hm a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void i() {
        a.bitField0_ &= MTa.c;
        a.boots_ = Hm.f().getBoots();
    }

    private void M() {
        a.bitField0_ &= aqa.C;
        a.nickname_ = Hm.f().getNickname();
    }

    public float getPitch() {
        Hm a2;
        return a2.pitch_;
    }

    private Hm() {
        Hm a2;
        a2.itemInHand_ = Mqa.y;
        a2.helmet_ = Mqa.y;
        a2.chestplate_ = Mqa.y;
        a2.leggings_ = Mqa.y;
        a2.boots_ = Mqa.y;
        a2.nickname_ = Mqa.y;
    }

    private void C(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= vRa.d;
        a2.uuid_ = b2;
    }

    public static /* synthetic */ void A(Hm a2) {
        a2.f();
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
        Hm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Hm();
            }
            case 2: {
                return new Bn(null);
            }
            case 3: {
                Object[] objectArray = new Object[lqa.s];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = hTa.u;
                objectArray[uqa.g] = Ora.U;
                objectArray[yRa.d] = VPa.F;
                objectArray[AQa.P] = Nra.u;
                objectArray[tTa.h] = eta.W;
                objectArray[uua.p] = MQa.Ha;
                objectArray[XTa.W] = bpa.u;
                objectArray[Yqa.i] = oua.U;
                objectArray[WOa.fa] = ypa.l;
                objectArray[NTa.C] = Hra.ba;
                objectArray[pPa.f] = asa.M;
                d2 = objectArray;
                Object b2 = Bua.d;
                return Hm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Hm.class;
                synchronized (Hm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Hm>(DEFAULT_INSTANCE);
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

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        Hm.checkByteStringIsUtf8(b2);
        a2.itemInHand_ = b2.toStringUtf8();
        a2.bitField0_ |= ERa.C;
    }

    private void d(String string) {
        String b2 = string;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= ERa.C;
        a2.itemInHand_ = b2;
    }

    private void C(String string) {
        String b2 = string;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= ura.V;
        a2.nickname_ = b2;
    }

    public boolean hasYaw() {
        Hm a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(Hm hm, boolean bl) {
        boolean b2 = bl;
        Hm a2 = hm;
        a2.J(b2);
    }

    public boolean hasLeggings() {
        Hm a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Parser<Hm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public int getScale() {
        Hm a2;
        return a2.scale_;
    }

    public String getLeggings() {
        Hm a2;
        return a2.leggings_;
    }

    public boolean hasPitch() {
        Hm a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Hm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return Hm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasFollowMouse() {
        Hm a2;
        if ((a2.bitField0_ & cQa.z) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(String string) {
        String b2 = string;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= fPa.i;
        a2.helmet_ = b2;
    }

    public boolean hasNickname() {
        Hm a2;
        if ((a2.bitField0_ & ura.V) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public ByteString getUuid() {
        Hm a2;
        return a2.uuid_;
    }

    public static Hm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Hm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        Hm a2 = this;
        a2.bitField0_ |= cQa.z;
        a2.followMouse_ = b2;
    }

    public static Hm f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getYaw() {
        Hm a2;
        return a2.yaw_;
    }

    public static /* synthetic */ void e(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.l(b2);
    }

    public static /* synthetic */ void i(Hm a2) {
        a2.M();
    }

    private void e() {
        a.bitField0_ &= Uta.Z;
        a.followMouse_ = uSa.E;
    }

    public static /* synthetic */ Hm J() {
        return DEFAULT_INSTANCE;
    }

    public String getBoots() {
        Hm a2;
        return a2.boots_;
    }

    public static /* synthetic */ void M(Hm a2) {
        a2.i();
    }

    public static Hm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public String getItemInHand() {
        Hm a2;
        return a2.itemInHand_;
    }

    public static /* synthetic */ void d(Hm hm, String string) {
        String b2 = string;
        Hm a2 = hm;
        a2.C(b2);
    }

    public static /* synthetic */ void e(Hm a2) {
        a2.e();
    }

    private void d() {
        a.bitField0_ &= rQa.p;
        a.uuid_ = Hm.f().getUuid();
    }

    public static Hm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        Hm.checkByteStringIsUtf8(b2);
        a2.helmet_ = b2.toStringUtf8();
        a2.bitField0_ |= fPa.i;
    }

    public static Hm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(Hm hm, String string) {
        String b2 = string;
        Hm a2 = hm;
        a2.J(b2);
    }

    public static Hm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C() {
        a.bitField0_ &= NQa.A;
        a.itemInHand_ = Hm.f().getItemInHand();
    }

    public static /* synthetic */ void l(Hm hm, String string) {
        String b2 = string;
        Hm a2 = hm;
        a2.d(b2);
    }

    public static /* synthetic */ void d(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.C(b2);
    }

    public static Bn J(Hm a2) {
        return (Bn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public ByteString getNicknameBytes() {
        Hm a2;
        return ByteString.copyFromUtf8(a2.nickname_);
    }

    private void f(String string) {
        String b2 = string;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= ysa.s;
        a2.chestplate_ = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        Hm a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.scale_ = b2;
    }

    public static Hm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        Hm hm;
        DEFAULT_INSTANCE = hm = new Hm();
        GeneratedMessageLite.registerDefaultInstance(Hm.class, hm);
    }

    private void l() {
        a.bitField0_ &= kpa.w;
        a.yaw_ = JPa.N;
    }

    public static /* synthetic */ void d(Hm a2) {
        a2.C();
    }

    public static /* synthetic */ void C(Hm a2) {
        a2.A();
    }

    public ByteString getChestplateBytes() {
        Hm a2;
        return ByteString.copyFromUtf8(a2.chestplate_);
    }

    public static /* synthetic */ void l(Hm a2) {
        a2.l();
    }

    public ByteString getBootsBytes() {
        Hm a2;
        return ByteString.copyFromUtf8(a2.boots_);
    }

    public ByteString getLeggingsBytes() {
        Hm a2;
        return ByteString.copyFromUtf8(a2.leggings_);
    }

    public static /* synthetic */ void f(Hm a2) {
        a2.d();
    }

    public ByteString getHelmetBytes() {
        Hm a2;
        return ByteString.copyFromUtf8(a2.helmet_);
    }

    public static /* synthetic */ void C(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.J(b2);
    }

    private void J(float f2) {
        float b2 = f2;
        Hm a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.pitch_ = b2;
    }

    private void f() {
        a.bitField0_ &= fta.fa;
        a.helmet_ = Hm.f().getHelmet();
    }

    public static /* synthetic */ void J(Hm a2) {
        a2.J();
    }

    public static /* synthetic */ void J(Hm hm, int n2) {
        int b2 = n2;
        Hm a2 = hm;
        a2.J(b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = this;
        Hm.checkByteStringIsUtf8(b2);
        a2.nickname_ = b2.toStringUtf8();
        a2.bitField0_ |= ura.V;
    }

    public static /* synthetic */ void l(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.f(b2);
    }

    public boolean getFollowMouse() {
        Hm a2;
        return a2.followMouse_;
    }

    private void J() {
        a.bitField0_ &= VPa.A;
        a.chestplate_ = Hm.f().getChestplate();
    }

    private void J(String string) {
        String b2 = string;
        Hm a2 = this;
        b2.getClass();
        a2.bitField0_ |= XOa.h;
        a2.leggings_ = b2;
    }

    public static /* synthetic */ void f(Hm hm, String string) {
        String b2 = string;
        Hm a2 = hm;
        a2.l(b2);
    }

    public boolean hasItemInHand() {
        Hm a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.e(b2);
    }

    public static /* synthetic */ void J(Hm hm, ByteString byteString) {
        ByteString b2 = byteString;
        Hm a2 = hm;
        a2.d(b2);
    }

    public static Hm J(InputStream a2) throws IOException {
        return Hm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Hm hm, String string) {
        String b2 = string;
        Hm a2 = hm;
        a2.f(b2);
    }
}

