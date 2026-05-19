/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Kk
 *  NTa
 *  Qta
 *  XTa
 *  fK
 *  lqa
 *  nQa
 *  nk
 *  qta
 *  sL
 *  vRa
 *  y
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
public final class Kk_3
extends GeneratedMessageLite<Kk, oj>
implements y {
    private int type_;
    private int dataCase_ = uSa.E;
    public static final int ELEMENTID_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int INVENTORYNAME_FIELD_NUMBER = 6;
    private Object data_;
    public static final int CLASSNAME_FIELD_NUMBER = 9;
    private int bitField0_;
    public static final int GUITYPE_FIELD_NUMBER = 3;
    private boolean show_;
    private static final Kk DEFAULT_INSTANCE;
    public static final int SUB1_FIELD_NUMBER = 7;
    private yl sub2_;
    public static final int KEY_FIELD_NUMBER = 5;
    private static volatile Parser<Kk> PARSER;
    public static final int SHOW_FIELD_NUMBER = 2;
    public static final int SUB2_FIELD_NUMBER = 8;
    public static final int ENTITYTYPE_FIELD_NUMBER = 10;
    private yl sub1_;

    public ByteString getElementIdBytes() {
        Kk_3 kk_3 = this;
        Object a2 = Mqa.y;
        if (kk_3.dataCase_ == AQa.P) {
            a2 = (String)kk_3.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static Kk J(CodedInputStream a2) throws IOException {
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void G() {
        Kk_3 a2;
        if (a2.dataCase_ == tTa.h) {
            Kk_3 kk_3 = a2;
            kk_3.dataCase_ = uSa.E;
            kk_3.data_ = null;
        }
    }

    private void C(int n2) {
        Kk_3 a2;
        int b2 = n2;
        Kk_3 kk_3 = a2 = this;
        kk_3.dataCase_ = tTa.h;
        kk_3.data_ = b2;
    }

    public static /* synthetic */ void G(Kk a2) {
        super.J();
    }

    public static /* synthetic */ void C(Kk kk2, yl yl2) {
        Object b2 = yl2;
        Kk a2 = kk2;
        super.J((yl)b2);
    }

    public ByteString getInventoryNameBytes() {
        Kk_3 kk_3 = this;
        Object a2 = Mqa.y;
        if (kk_3.dataCase_ == uua.p) {
            a2 = (String)kk_3.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void D() {
        a.sub1_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static /* synthetic */ void D(Kk a2) {
        super.e();
    }

    public int getKey() {
        Kk_3 a2;
        if (a2.dataCase_ == tTa.h) {
            return (Integer)a2.data_;
        }
        return uSa.E;
    }

    public static /* synthetic */ void A(Kk a2) {
        super.G();
    }

    private void l(String string) {
        String b2 = string;
        Kk_3 a2 = this;
        b2.getClass();
        Kk_3 kk_3 = a2;
        kk_3.dataCase_ = AQa.P;
        kk_3.data_ = b2;
    }

    public static /* synthetic */ void l(Kk kk2, ByteString byteString) {
        Object b2 = byteString;
        Kk a2 = kk2;
        super.f((ByteString)b2);
    }

    public fK getDataCase() {
        Kk_3 a2;
        return fK.forNumber((int)a2.dataCase_);
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
        Kk_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Kk_3();
            }
            case 2: {
                return new oj(null);
            }
            case 3: {
                Object[] objectArray = new Object[XTa.W];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = lqa.E;
                objectArray[yRa.d] = qta.F;
                objectArray[AQa.P] = UTa.v;
                objectArray[tTa.h] = hQa.K;
                objectArray[uua.p] = Qta.w;
                d2 = objectArray;
                Object b2 = Eqa.B;
                return Kk_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Kk_3.class;
                synchronized (Kk_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Kk>(DEFAULT_INSTANCE);
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

    private void l(int n2) {
        int b2 = n2;
        Kk_3 a2 = this;
        a2.type_ = b2;
    }

    private void A() {
        Kk_3 a2;
        Kk_3 kk_3 = a2;
        kk_3.dataCase_ = uSa.E;
        kk_3.data_ = null;
    }

    public static /* synthetic */ Kk f() {
        return DEFAULT_INSTANCE;
    }

    public FK getEntityType() {
        Kk_3 kk_3 = this;
        if (kk_3.dataCase_ == NTa.C) {
            FK a2 = FK.forNumber((Integer)kk_3.data_);
            if (a2 == null) {
                return FK.UNRECOGNIZED;
            }
            return a2;
        }
        return FK.DROPPED_ITEM;
    }

    public static /* synthetic */ void l(Kk kk2, String string) {
        Object b2 = string;
        Kk a2 = kk2;
        super.l((String)b2);
    }

    public static Kk f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(sL sL2) {
        Kk_3 a2;
        Kk_3 b2 = sL2;
        Kk_3 kk_3 = a2 = this;
        kk_3.data_ = b2.getNumber();
        kk_3.dataCase_ = yRa.d;
    }

    private void J(FK fK2) {
        Kk_3 a2;
        FK b2 = fK2;
        Kk_3 kk_3 = a2 = this;
        kk_3.data_ = b2.getNumber();
        kk_3.dataCase_ = NTa.C;
    }

    public static /* synthetic */ void C(Kk kk2, int n2) {
        int b2 = n2;
        Kk a2 = kk2;
        super.l(b2);
    }

    public static Kk J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void i() {
        Kk_3 a2;
        if (a2.dataCase_ == WOa.fa) {
            Kk_3 kk_3 = a2;
            kk_3.dataCase_ = uSa.E;
            kk_3.data_ = null;
        }
    }

    public bJ getType() {
        Kk_3 kk_3 = this;
        bJ a2 = bJ.forNumber(kk_3.type_);
        if (a2 == null) {
            return bJ.UNRECOGNIZED;
        }
        return a2;
    }

    private void J(bJ bJ2) {
        bJ b2 = bJ2;
        Kk_3 a2 = this;
        a2.type_ = b2.getNumber();
    }

    public static Kk f(InputStream a2) throws IOException {
        return (Kk_3)Kk_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Kk kk2, int n2) {
        int b2 = n2;
        Kk a2 = kk2;
        super.J(b2);
    }

    public String getClassName() {
        Kk_3 kk_3 = this;
        Object a2 = Mqa.y;
        if (kk_3.dataCase_ == WOa.fa) {
            a2 = (String)kk_3.data_;
        }
        return a2;
    }

    public static /* synthetic */ void J(Kk kk2, FK fK2) {
        Object b2 = fK2;
        Kk a2 = kk2;
        super.J((FK)b2);
    }

    public static /* synthetic */ void J(Kk kk2, boolean bl2) {
        boolean b2 = bl2;
        Kk a2 = kk2;
        super.J(b2);
    }

    private void M() {
        Kk_3 a2;
        if (a2.dataCase_ == uua.p) {
            Kk_3 kk_3 = a2;
            kk_3.dataCase_ = uSa.E;
            kk_3.data_ = null;
        }
    }

    public static /* synthetic */ void f(Kk kk2, String string) {
        Object b2 = string;
        Kk a2 = kk2;
        super.J((String)b2);
    }

    public ByteString getClassNameBytes() {
        Kk_3 kk_3 = this;
        Object a2 = Mqa.y;
        if (kk_3.dataCase_ == WOa.fa) {
            a2 = (String)kk_3.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static oj J(Kk a2) {
        return (oj)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void e() {
        Kk_3 a2;
        if (a2.dataCase_ == yRa.d) {
            Kk_3 kk_3 = a2;
            kk_3.dataCase_ = uSa.E;
            kk_3.data_ = null;
        }
    }

    public static /* synthetic */ void f(Kk kk2, int n2) {
        int b2 = n2;
        Kk a2 = kk2;
        super.f(b2);
    }

    public boolean hasClassName() {
        Kk_3 a2;
        if (a2.dataCase_ == WOa.fa) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void l(ByteString byteString) {
        Kk_3 a2;
        ByteString b2 = byteString;
        Kk_3 kk_3 = a2 = this;
        Kk_3.checkByteStringIsUtf8(b2);
        kk_3.data_ = b2.toStringUtf8();
        kk_3.dataCase_ = uua.p;
    }

    private void C(yl yl2) {
        GeneratedMessageLite b2 = yl2;
        Kk_3 a2 = this;
        b2.getClass();
        a2.sub2_ = b2;
        a2.bitField0_ |= uqa.g;
    }

    private void l(yl yl2) {
        Kk_3 kk_3;
        GeneratedMessageLite b2 = yl2;
        Kk_3 a2 = this;
        b2.getClass();
        if (a2.sub2_ != null && a2.sub2_ != yl.J()) {
            a2.sub2_ = (yl)((nk)yl.J(a2.sub2_).mergeFrom(b2)).buildPartial();
            kk_3 = a2;
        } else {
            kk_3 = a2;
            a2.sub2_ = b2;
        }
        kk_3.bitField0_ |= uqa.g;
    }

    public static /* synthetic */ void i(Kk a2) {
        super.D();
    }

    public static Kk J(byte[] a2) throws InvalidProtocolBufferException {
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getEntityTypeValue() {
        Kk_3 a2;
        if (a2.dataCase_ == NTa.C) {
            return (Integer)a2.data_;
        }
        return uSa.E;
    }

    private void d() {
        Kk_3 a2;
        if (a2.dataCase_ == NTa.C) {
            Kk_3 kk_3 = a2;
            kk_3.dataCase_ = uSa.E;
            kk_3.data_ = null;
        }
    }

    public static /* synthetic */ void J(Kk kk2, String string) {
        Object b2 = string;
        Kk a2 = kk2;
        super.f((String)b2);
    }

    public boolean hasSub2() {
        Kk_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public sL getGuiType() {
        Kk_3 kk_3 = this;
        if (kk_3.dataCase_ == yRa.d) {
            Kk_3 a2 = sL.forNumber((int)((Integer)kk_3.data_));
            if (a2 == null) {
                return sL.UNRECOGNIZED;
            }
            return a2;
        }
        return sL.ENCHANTMENT;
    }

    public static /* synthetic */ void l(Kk kk2, yl yl2) {
        Object b2 = yl2;
        Kk a2 = kk2;
        super.l((yl)b2);
    }

    public static Parser<Kk> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Kk J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public yl getSub2() {
        Kk_3 a2;
        if (a2.sub2_ == null) {
            return yl.J();
        }
        return a2.sub2_;
    }

    public static /* synthetic */ void M(Kk a2) {
        super.A();
    }

    private void C() {
        a.show_ = uSa.E;
    }

    public boolean getShow() {
        Kk_3 a2;
        return a2.show_;
    }

    private void f(int n2) {
        Kk_3 a2;
        int b2 = n2;
        Kk_3 kk_3 = a2 = this;
        kk_3.dataCase_ = NTa.C;
        kk_3.data_ = b2;
    }

    public static /* synthetic */ void f(Kk kk2, yl yl2) {
        Object b2 = yl2;
        Kk a2 = kk2;
        super.C((yl)b2);
    }

    public static oj J() {
        return (oj)DEFAULT_INSTANCE.createBuilder();
    }

    static {
        Kk_3 kk_3 = new Kk_3();
        DEFAULT_INSTANCE = kk_3;
        GeneratedMessageLite.registerDefaultInstance(Kk_3.class, kk_3);
    }

    public boolean hasEntityType() {
        Kk_3 a2;
        if (a2.dataCase_ == NTa.C) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(yl yl2) {
        Kk_3 kk_3;
        GeneratedMessageLite b2 = yl2;
        Kk_3 a2 = this;
        b2.getClass();
        if (a2.sub1_ != null && a2.sub1_ != yl.J()) {
            a2.sub1_ = (yl)((nk)yl.J(a2.sub1_).mergeFrom(b2)).buildPartial();
            kk_3 = a2;
        } else {
            kk_3 = a2;
            a2.sub1_ = b2;
        }
        kk_3.bitField0_ |= vRa.d;
    }

    public static Kk J(ByteString a2) throws InvalidProtocolBufferException {
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l() {
        a.type_ = uSa.E;
    }

    private Kk_3() {
        Kk_3 a2;
    }

    public static Kk J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public String getInventoryName() {
        Kk_3 kk_3 = this;
        Object a2 = Mqa.y;
        if (kk_3.dataCase_ == uua.p) {
            a2 = (String)kk_3.data_;
        }
        return a2;
    }

    public static /* synthetic */ void J(Kk kk2, yl yl2) {
        Object b2 = yl2;
        Kk a2 = kk2;
        super.f((yl)b2);
    }

    private void f(String string) {
        String b2 = string;
        Kk_3 a2 = this;
        b2.getClass();
        Kk_3 kk_3 = a2;
        kk_3.dataCase_ = WOa.fa;
        kk_3.data_ = b2;
    }

    public static /* synthetic */ void e(Kk a2) {
        super.f();
    }

    private void J(String string) {
        String b2 = string;
        Kk_3 a2 = this;
        b2.getClass();
        Kk_3 kk_3 = a2;
        kk_3.dataCase_ = uua.p;
        kk_3.data_ = b2;
    }

    public static /* synthetic */ void f(Kk kk2, ByteString byteString) {
        Object b2 = byteString;
        Kk a2 = kk2;
        super.J((ByteString)b2);
    }

    public boolean hasKey() {
        Kk_3 a2;
        if (a2.dataCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getGuiTypeValue() {
        Kk_3 a2;
        if (a2.dataCase_ == yRa.d) {
            return (Integer)a2.data_;
        }
        return uSa.E;
    }

    private void J(int n2) {
        Kk_3 a2;
        int b2 = n2;
        Kk_3 kk_3 = a2 = this;
        kk_3.dataCase_ = yRa.d;
        kk_3.data_ = b2;
    }

    public boolean hasInventoryName() {
        Kk_3 a2;
        if (a2.dataCase_ == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void f(ByteString byteString) {
        Kk_3 a2;
        ByteString b2 = byteString;
        Kk_3 kk_3 = a2 = this;
        Kk_3.checkByteStringIsUtf8(b2);
        kk_3.data_ = b2.toStringUtf8();
        kk_3.dataCase_ = AQa.P;
    }

    public static /* synthetic */ void d(Kk a2) {
        super.d();
    }

    public static /* synthetic */ void J(Kk kk2, int n2) {
        int b2 = n2;
        Kk a2 = kk2;
        super.C(b2);
    }

    private void J(yl yl2) {
        GeneratedMessageLite b2 = yl2;
        Kk_3 a2 = this;
        b2.getClass();
        a2.sub1_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void J(Kk kk2, sL sL2) {
        Kk b2 = sL2;
        Kk a2 = kk2;
        super.J((sL)b2);
    }

    public static Kk J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(Kk kk2, ByteString byteString) {
        Object b2 = byteString;
        Kk a2 = kk2;
        super.l((ByteString)b2);
    }

    public static Kk J() {
        return DEFAULT_INSTANCE;
    }

    private void J(ByteString byteString) {
        Kk_3 a2;
        ByteString b2 = byteString;
        Kk_3 kk_3 = a2 = this;
        Kk_3.checkByteStringIsUtf8(b2);
        kk_3.data_ = b2.toStringUtf8();
        kk_3.dataCase_ = WOa.fa;
    }

    public boolean hasSub1() {
        Kk_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(boolean bl2) {
        boolean b2 = bl2;
        Kk_3 a2 = this;
        a2.show_ = b2;
    }

    public static /* synthetic */ void C(Kk a2) {
        super.l();
    }

    private void f() {
        Kk_3 a2;
        if (a2.dataCase_ == AQa.P) {
            Kk_3 kk_3 = a2;
            kk_3.dataCase_ = uSa.E;
            kk_3.data_ = null;
        }
    }

    public static Kk J(InputStream a2) throws IOException {
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public String getElementId() {
        Kk_3 kk_3 = this;
        Object a2 = Mqa.y;
        if (kk_3.dataCase_ == AQa.P) {
            a2 = (String)kk_3.data_;
        }
        return a2;
    }

    public static Kk J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Kk_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getTypeValue() {
        Kk_3 a2;
        return a2.type_;
    }

    public static Kk J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Kk_3)Kk_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Kk kk2, bJ bJ2) {
        Object b2 = bJ2;
        Kk a2 = kk2;
        super.J((bJ)b2);
    }

    public yl getSub1() {
        Kk_3 a2;
        if (a2.sub1_ == null) {
            return yl.J();
        }
        return a2.sub1_;
    }

    public boolean hasElementId() {
        Kk_3 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(Kk a2) {
        super.M();
    }

    public boolean hasGuiType() {
        Kk_3 a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void f(Kk a2) {
        super.i();
    }

    private void J() {
        a.sub2_ = null;
        a.bitField0_ &= ERa.Ka;
    }

    public static /* synthetic */ void J(Kk a2) {
        super.C();
    }
}

