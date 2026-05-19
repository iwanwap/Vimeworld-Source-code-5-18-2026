/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bl
 *  Kj
 *  XL
 *  ZK
 *  kpa
 *  lk
 *  nQa
 *  qta
 *  vRa
 *  z
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
public final class ZK_2
extends GeneratedMessageLite<ZK, ek>
implements z {
    private Object data_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final ZK DEFAULT_INSTANCE;
    private boolean show_;
    public static final int KEY_FIELD_NUMBER = 3;
    public static final int BLOCK_FIELD_NUMBER = 4;
    public static final int ENTITYTYPE_FIELD_NUMBER = 5;
    public static final int SHOW_FIELD_NUMBER = 2;
    private int type_;
    private int dataCase_ = uSa.E;
    private static volatile Parser<ZK> PARSER;

    private void J(boolean bl2) {
        boolean b2 = bl2;
        ZK_2 a2 = this;
        a2.show_ = b2;
    }

    private void e() {
        ZK_2 a2;
        ZK_2 zK_2 = a2;
        zK_2.dataCase_ = uSa.E;
        zK_2.data_ = null;
    }

    public static /* synthetic */ ZK f() {
        return DEFAULT_INSTANCE;
    }

    public int getEntityTypeValue() {
        ZK_2 a2;
        if (a2.dataCase_ == tTa.h) {
            return (Integer)a2.data_;
        }
        return uSa.E;
    }

    public static /* synthetic */ void l(ZK zK2, int n2) {
        int b2 = n2;
        ZK a2 = zK2;
        super.J(b2);
    }

    private void f(Kj kj2) {
        ZK_2 b2 = kj2;
        ZK_2 a2 = this;
        b2.getClass();
        ZK_2 zK_2 = a2;
        zK_2.data_ = b2;
        zK_2.dataCase_ = AQa.P;
    }

    private void J(Bl bl2) {
        ZK_2 b2 = bl2;
        ZK_2 a2 = this;
        a2.type_ = b2.getNumber();
    }

    public static /* synthetic */ void f(ZK zK2, int n2) {
        int b2 = n2;
        ZK a2 = zK2;
        super.l(b2);
    }

    public static Parser<ZK> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void d() {
        a.type_ = uSa.E;
    }

    public Bl getType() {
        ZK_2 zK_2 = this;
        ZK_2 a2 = Bl.forNumber((int)zK_2.type_);
        if (a2 == null) {
            return Bl.UNRECOGNIZED;
        }
        return a2;
    }

    public static ZK f(InputStream a2) throws IOException {
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(ZK zK2, int n2) {
        int b2 = n2;
        ZK a2 = zK2;
        super.f(b2);
    }

    private void J(FK fK2) {
        ZK_2 a2;
        FK b2 = fK2;
        ZK_2 zK_2 = a2 = this;
        zK_2.data_ = b2.getNumber();
        zK_2.dataCase_ = tTa.h;
    }

    public static ZK J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void e(ZK a2) {
        super.e();
    }

    public static /* synthetic */ void J(ZK zK2, Bl bl2) {
        ZK b2 = bl2;
        ZK a2 = zK2;
        super.J((Bl)b2);
    }

    private void J(Kj kj2) {
        ZK_2 zK_2;
        ZK_2 b2 = kj2;
        ZK_2 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == AQa.P && a2.data_ != Kj.f()) {
            a2.data_ = ((XL)Kj.J((Kj)((Kj)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            zK_2 = a2;
        } else {
            zK_2 = a2;
            a2.data_ = b2;
        }
        zK_2.dataCase_ = AQa.P;
    }

    public static ZK J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void C() {
        ZK_2 a2;
        if (a2.dataCase_ == yRa.d) {
            ZK_2 zK_2 = a2;
            zK_2.dataCase_ = uSa.E;
            zK_2.data_ = null;
        }
    }

    public boolean getShow() {
        ZK_2 a2;
        return a2.show_;
    }

    public static /* synthetic */ void d(ZK a2) {
        super.d();
    }

    private void l(int n2) {
        int b2 = n2;
        ZK_2 a2 = this;
        a2.type_ = b2;
    }

    public int getTypeValue() {
        ZK_2 a2;
        return a2.type_;
    }

    public FK getEntityType() {
        ZK_2 zK_2 = this;
        if (zK_2.dataCase_ == tTa.h) {
            FK a2 = FK.forNumber((Integer)zK_2.data_);
            if (a2 == null) {
                return FK.UNRECOGNIZED;
            }
            return a2;
        }
        return FK.DROPPED_ITEM;
    }

    public static /* synthetic */ void f(ZK zK2, Kj kj2) {
        ZK b2 = kj2;
        ZK a2 = zK2;
        super.J((Kj)b2);
    }

    private ZK_2() {
        ZK_2 a2;
    }

    public static /* synthetic */ void C(ZK a2) {
        super.f();
    }

    public static /* synthetic */ void l(ZK a2) {
        super.C();
    }

    public static ZK J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        ZK_2 zK_2 = new ZK_2();
        DEFAULT_INSTANCE = zK_2;
        GeneratedMessageLite.registerDefaultInstance(ZK_2.class, zK_2);
    }

    public static ZK J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static ZK J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void l() {
        ZK_2 a2;
        if (a2.dataCase_ == AQa.P) {
            ZK_2 zK_2 = a2;
            zK_2.dataCase_ = uSa.E;
            zK_2.data_ = null;
        }
    }

    public static ZK f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        ZK_2 a2;
        if (a2.dataCase_ == tTa.h) {
            ZK_2 zK_2 = a2;
            zK_2.dataCase_ = uSa.E;
            zK_2.data_ = null;
        }
    }

    public static /* synthetic */ void f(ZK a2) {
        super.J();
    }

    public boolean hasKey() {
        ZK_2 a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int getKey() {
        ZK_2 a2;
        if (a2.dataCase_ == yRa.d) {
            return (Integer)a2.data_;
        }
        return uSa.E;
    }

    public static ZK J(InputStream a2) throws IOException {
        return (ZK_2)ZK_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasEntityType() {
        ZK_2 a2;
        if (a2.dataCase_ == tTa.h) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(ZK a2) {
        super.l();
    }

    public static ek J(ZK a2) {
        return (ek)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static ZK J() {
        return DEFAULT_INSTANCE;
    }

    public Kj getBlock() {
        ZK_2 a2;
        if (a2.dataCase_ == AQa.P) {
            return (Kj)a2.data_;
        }
        return Kj.f();
    }

    private void f(int n2) {
        ZK_2 a2;
        int b2 = n2;
        ZK_2 zK_2 = a2 = this;
        zK_2.dataCase_ = tTa.h;
        zK_2.data_ = b2;
    }

    public static ZK J(byte[] a2) throws InvalidProtocolBufferException {
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static ZK J(ByteString a2) throws InvalidProtocolBufferException {
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(ZK zK2, Kj kj2) {
        ZK b2 = kj2;
        ZK a2 = zK2;
        super.f((Kj)b2);
    }

    public static ZK J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (ZK_2)ZK_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public lk getDataCase() {
        ZK_2 a2;
        return lk.forNumber((int)a2.dataCase_);
    }

    private void J(int n2) {
        ZK_2 a2;
        int b2 = n2;
        ZK_2 zK_2 = a2 = this;
        zK_2.dataCase_ = yRa.d;
        zK_2.data_ = b2;
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
        ZK_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new ZK_2();
            }
            case 2: {
                return new ek(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = qta.F;
                objectArray[yRa.d] = UTa.v;
                objectArray[AQa.P] = Kj.class;
                d2 = objectArray;
                Object b2 = kpa.m;
                return ZK_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = ZK_2.class;
                synchronized (ZK_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<ZK>(DEFAULT_INSTANCE);
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

    public boolean hasBlock() {
        ZK_2 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static ek J() {
        return (ek)DEFAULT_INSTANCE.createBuilder();
    }

    private void J() {
        a.show_ = uSa.E;
    }

    public static /* synthetic */ void J(ZK zK2, boolean bl2) {
        boolean b2 = bl2;
        ZK a2 = zK2;
        super.J(b2);
    }

    public static /* synthetic */ void J(ZK zK2, FK fK2) {
        Object b2 = fK2;
        ZK a2 = zK2;
        super.J((FK)b2);
    }

    public static ZK J(CodedInputStream a2) throws IOException {
        return (ZK_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

