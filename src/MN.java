/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  BN
 *  ERa
 *  JQa
 *  NQa
 *  TPa
 *  Uta
 *  XSa
 *  XTa
 *  cra
 *  jN
 *  kpa
 *  lqa
 *  pua
 *  ta
 *  vRa
 *  xa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class MN
extends GeneratedMessageLite<MN, jN>
implements xa {
    public static final int MODIFIERS_FIELD_NUMBER = 5;
    public static final int TIMEOUT_FIELD_NUMBER = 6;
    private int timeout_;
    private static volatile Parser<MN> PARSER;
    public static final int DOUBLECLICK_FIELD_NUMBER = 4;
    public static final int KEYDOWN_FIELD_NUMBER = 2;
    private boolean keydown_;
    public static final int CANCEL_FIELD_NUMBER = 7;
    private int bitField0_;
    private boolean keyup_;
    private Internal.IntList modifiers_;
    private int modifiersMemoizedSerializedSize = pua.o;
    private Internal.ProtobufList<BN> actions_ = MN.emptyProtobufList();
    public static final int ACTIONS_FIELD_NUMBER = 1;
    private boolean cancel_;
    private boolean doubleClick_;
    public static final int KEYUP_FIELD_NUMBER = 3;
    private static final MN DEFAULT_INSTANCE;

    public static /* synthetic */ void l(MN mN2, int n2) {
        int b2 = n2;
        MN a2 = mN2;
        a2.J(b2);
    }

    public static /* synthetic */ void M(MN a2) {
        a2.J();
    }

    public static jN J() {
        return (jN)DEFAULT_INSTANCE.createBuilder();
    }

    private void A() {
        MN mN2 = this;
        Internal.IntList a2 = mN2.modifiers_;
        if (!a2.isModifiable()) {
            mN2.modifiers_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public ta J(int n2) {
        int b2 = n2;
        MN a2 = this;
        return (ta)a2.actions_.get(b2);
    }

    public List<Integer> getModifiersList() {
        MN a2;
        return a2.modifiers_;
    }

    private void f(Iterable<? extends BN> iterable) {
        MN a2;
        Iterable<? extends BN> b2 = iterable;
        MN mN2 = a2 = this;
        mN2.i();
        AbstractMessageLite.addAll(b2, mN2.actions_);
    }

    public static MN f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static MN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, BN bN2) {
        void b2;
        MN c2 = bN2;
        MN a2 = this;
        c2.getClass();
        MN mN2 = a2;
        mN2.i();
        mN2.actions_.add((int)b2, (BN)c2);
    }

    public static MN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void i() {
        MN mN2 = this;
        Internal.ProtobufList<BN> a2 = mN2.actions_;
        if (!a2.isModifiable()) {
            mN2.actions_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void e(MN a2) {
        a2.e();
    }

    public static /* synthetic */ void d(MN a2) {
        a2.d();
    }

    public static MN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean getCancel() {
        MN a2;
        return a2.cancel_;
    }

    public int getActionsCount() {
        MN a2;
        return a2.actions_.size();
    }

    private void M() {
        a.bitField0_ &= Jra.Fa;
        a.timeout_ = uSa.E;
    }

    public static MN J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        MN a2;
        int c2 = n3;
        MN mN2 = a2 = this;
        mN2.A();
        mN2.modifiers_.setInt((int)b2, c2);
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
        MN c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new MN();
            }
            case 2: {
                return new jN(null);
            }
            case 3: {
                Object[] objectArray = new Object[WOa.fa];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = cra.m;
                objectArray[uqa.g] = BN.class;
                objectArray[yRa.d] = TPa.t;
                objectArray[AQa.P] = Uta.j;
                objectArray[tTa.h] = fPa.ia;
                objectArray[uua.p] = Jsa.Ka;
                objectArray[XTa.W] = JQa.Q;
                objectArray[Yqa.i] = XSa.t;
                d2 = objectArray;
                Object b2 = vRa.L;
                return MN.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = MN.class;
                synchronized (MN.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<MN>(DEFAULT_INSTANCE);
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

    private void e() {
        a.bitField0_ &= rQa.p;
        a.keydown_ = uSa.E;
    }

    private void l(int n2) {
        int b2 = n2;
        MN a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.timeout_ = b2;
    }

    public static /* synthetic */ void C(MN a2) {
        a2.l();
    }

    public boolean hasKeydown() {
        MN a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<? extends ta> J() {
        MN a2;
        return a2.actions_;
    }

    private void d() {
        a.bitField0_ &= ERa.Ka;
        a.keyup_ = uSa.E;
    }

    public static /* synthetic */ void C(MN mN2, boolean bl) {
        boolean b2 = bl;
        MN a2 = mN2;
        a2.l(b2);
    }

    public static Parser<MN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean getKeydown() {
        MN a2;
        return a2.keydown_;
    }

    public boolean getDoubleClick() {
        MN a2;
        return a2.doubleClick_;
    }

    public boolean hasCancel() {
        MN a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C(boolean bl) {
        boolean b2 = bl;
        MN a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.cancel_ = b2;
    }

    public static /* synthetic */ void f(MN mN2, int n2) {
        int b2 = n2;
        MN a2 = mN2;
        a2.l(b2);
    }

    public static /* synthetic */ void l(MN a2) {
        a2.C();
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        MN a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.doubleClick_ = b2;
    }

    private void f(int n2) {
        MN a2;
        int b2 = n2;
        MN mN2 = a2 = this;
        mN2.A();
        mN2.modifiers_.addInt(b2);
    }

    public static MN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        MN a2;
        int b2 = n2;
        MN mN2 = a2 = this;
        mN2.i();
        mN2.actions_.remove(b2);
    }

    private void C() {
        a.bitField0_ &= NQa.A;
        a.cancel_ = uSa.E;
    }

    private void J(BN bN2) {
        MN b2 = bN2;
        MN a2 = this;
        b2.getClass();
        MN mN2 = a2;
        mN2.i();
        mN2.actions_.add((BN)b2);
    }

    static {
        MN mN2;
        DEFAULT_INSTANCE = mN2 = new MN();
        GeneratedMessageLite.registerDefaultInstance(MN.class, mN2);
    }

    public static /* synthetic */ void l(MN mN2, boolean bl) {
        boolean b2 = bl;
        MN a2 = mN2;
        a2.J(b2);
    }

    public int getTimeout() {
        MN a2;
        return a2.timeout_;
    }

    public static jN J(MN a2) {
        return (jN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ MN f() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasDoubleClick() {
        MN a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean getKeyup() {
        MN a2;
        return a2.keyup_;
    }

    public static MN J(InputStream a2) throws IOException {
        return MN.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasTimeout() {
        MN a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<BN> getActionsList() {
        MN a2;
        return a2.actions_;
    }

    public static /* synthetic */ void f(MN a2) {
        a2.M();
    }

    public static MN J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, BN bN2) {
        void b2;
        MN c2 = bN2;
        MN a2 = this;
        c2.getClass();
        MN mN2 = a2;
        mN2.i();
        mN2.actions_.set((int)b2, (BN)c2);
    }

    public static MN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return MN.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(MN mN2, Iterable iterable) {
        Iterable b2 = iterable;
        MN a2 = mN2;
        a2.J(b2);
    }

    public int getModifiers(int n2) {
        int b2 = n2;
        MN a2 = this;
        return a2.modifiers_.getInt(b2);
    }

    public static /* synthetic */ void J(MN mN2, BN bN2) {
        MN b2 = bN2;
        MN a2 = mN2;
        a2.J((BN)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(MN mN2, int n2, BN bN2) {
        void b2;
        MN c2 = bN2;
        MN a2 = mN2;
        a2.f((int)b2, (BN)c2);
    }

    public static /* synthetic */ void J(MN mN2, Iterable iterable) {
        Iterable b2 = iterable;
        MN a2 = mN2;
        a2.f(b2);
    }

    private void l() {
        a.modifiers_ = MN.emptyIntList();
    }

    public int getModifiersCount() {
        MN a2;
        return a2.modifiers_.size();
    }

    public static /* synthetic */ void f(MN mN2, boolean bl) {
        boolean b2 = bl;
        MN a2 = mN2;
        a2.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(MN mN2, int n2, BN bN2) {
        void b2;
        MN c2 = bN2;
        MN a2 = mN2;
        a2.J((int)b2, (BN)c2);
    }

    public BN getActions(int n2) {
        int b2 = n2;
        MN a2 = this;
        return (BN)a2.actions_.get(b2);
    }

    public static /* synthetic */ void J(MN mN2, int n2) {
        int b2 = n2;
        MN a2 = mN2;
        a2.f(b2);
    }

    public static MN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public boolean hasKeyup() {
        MN a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(MN a2) {
        a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(MN mN2, int n2, int n3) {
        void b2;
        int c2 = n3;
        MN a2 = mN2;
        a2.J((int)b2, c2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        MN a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.keydown_ = b2;
    }

    private MN() {
        MN a2;
        a2.modifiers_ = MN.emptyIntList();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        MN a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.keyup_ = b2;
    }

    private void f() {
        a.bitField0_ &= kpa.w;
        a.doubleClick_ = uSa.E;
    }

    private void J(Iterable<? extends Integer> iterable) {
        MN a2;
        Iterable<? extends Integer> b2 = iterable;
        MN mN2 = a2 = this;
        mN2.A();
        AbstractMessageLite.addAll(b2, mN2.modifiers_);
    }

    public static MN J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static MN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(MN mN2, boolean bl) {
        boolean b2 = bl;
        MN a2 = mN2;
        a2.C(b2);
    }

    public static MN J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        a.actions_ = MN.emptyProtobufList();
    }
}

