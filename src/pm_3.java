/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  JSa
 *  NQa
 *  NTa
 *  SRa
 *  XTa
 *  Xo
 *  bpa
 *  iPa
 *  kpa
 *  lqa
 *  pPa
 *  pm
 *  pua
 *  uQa
 *  vRa
 *  ysa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pm_3
extends GeneratedMessageLite<pm, Xo>
implements BC {
    private static volatile Parser<pm> PARSER;
    private boolean affectOnlyPlayers_;
    public static final int IMPELZ_FIELD_NUMBER = 7;
    private float impelY_;
    public static final int IMPELTYPE_FIELD_NUMBER = 10;
    private boolean drag_;
    private int impelType_;
    private int bitField0_;
    private String id_;
    private static final pm DEFAULT_INSTANCE;
    public static final int IMPELX_FIELD_NUMBER = 5;
    public static final int DRAG_FIELD_NUMBER = 3;
    public static final int AFFECTONLYPLAYERS_FIELD_NUMBER = 4;
    public static final int IMPELYONTOP_FIELD_NUMBER = 8;
    private float impelX_;
    private boolean impelXZOnSides_;
    private Internal.FloatList coords_;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMPELXZONSIDES_FIELD_NUMBER = 9;
    private float impelZ_;
    private boolean impelYOnTop_;
    private int coordsMemoizedSerializedSize = pua.o;
    public static final int COORDS_FIELD_NUMBER = 2;
    public static final int IMPELY_FIELD_NUMBER = 6;

    private void J(Iterable<? extends Float> iterable) {
        pm_3 a2;
        Iterable<? extends Float> b2 = iterable;
        pm_3 pm_32 = a2 = this;
        pm_32.D();
        AbstractMessageLite.addAll(b2, pm_32.coords_);
    }

    @Override
    public ByteString getIdBytes() {
        pm_3 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    @Override
    public boolean hasImpelYOnTop() {
        pm_3 a2;
        if ((a2.bitField0_ & fPa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static pm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public float getImpelY() {
        pm_3 a2;
        return a2.impelY_;
    }

    public static pm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void G() {
        a.bitField0_ &= kpa.w;
        a.impelX_ = JPa.N;
    }

    public static /* synthetic */ void D(pm a2) {
        super.e();
    }

    public static pm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void C(boolean bl) {
        boolean b2 = bl;
        pm_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.drag_ = b2;
    }

    public static /* synthetic */ void C(pm pm2, boolean bl) {
        boolean b2 = bl;
        pm a2 = pm2;
        super.J(b2);
    }

    public static /* synthetic */ void A(pm a2) {
        super.C();
    }

    private void J(int n2) {
        int b2 = n2;
        pm_3 a2 = this;
        a2.bitField0_ |= XOa.h;
        a2.impelType_ = b2;
    }

    @Override
    public int getCoordsCount() {
        pm_3 a2;
        return a2.coords_.size();
    }

    public static /* synthetic */ void l(pm pm2, boolean bl) {
        boolean b2 = bl;
        pm a2 = pm2;
        super.f(b2);
    }

    public static /* synthetic */ void C(pm pm2, float f2) {
        float b2 = f2;
        pm a2 = pm2;
        super.J(b2);
    }

    private void D() {
        pm_3 pm_32 = this;
        Internal.FloatList a2 = pm_32.coords_;
        if (!a2.isModifiable()) {
            pm_32.coords_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    @Override
    public float getImpelX() {
        pm_3 a2;
        return a2.impelX_;
    }

    private void A() {
        a.bitField0_ &= Jra.Fa;
        a.impelY_ = JPa.N;
    }

    private void i() {
        a.bitField0_ &= VPa.A;
        a.impelXZOnSides_ = uSa.E;
    }

    @Override
    public boolean hasAffectOnlyPlayers() {
        pm_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(pm pm2, float f2) {
        float b2 = f2;
        pm a2 = pm2;
        super.C(b2);
    }

    public static /* synthetic */ void J(pm pm2, String string) {
        Object b2 = string;
        pm a2 = pm2;
        super.J((String)b2);
    }

    @Override
    public float getCoords(int n2) {
        int b2 = n2;
        pm_3 a2 = this;
        return a2.coords_.getFloat(b2);
    }

    private void M() {
        a.id_ = pm_3.J().getId();
    }

    public static /* synthetic */ void f(pm pm2, boolean bl) {
        boolean b2 = bl;
        pm a2 = pm2;
        super.l(b2);
    }

    public static /* synthetic */ pm f() {
        return DEFAULT_INSTANCE;
    }

    public static pm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void e() {
        a.bitField0_ &= ERa.Ka;
        a.affectOnlyPlayers_ = uSa.E;
    }

    public static Xo J(pm a2) {
        return (Xo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private pm_3() {
        pm_3 a2;
        a2.id_ = Mqa.y;
        a2.coords_ = pm_3.emptyFloatList();
    }

    public static /* synthetic */ void J(pm pm2, Iterable iterable) {
        Object b2 = iterable;
        pm a2 = pm2;
        super.J((Iterable<? extends Float>)b2);
    }

    private void C(float f2) {
        pm_3 a2;
        float b2 = f2;
        pm_3 pm_32 = a2 = this;
        pm_32.D();
        pm_32.coords_.addFloat(b2);
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
        pm_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new pm_3();
            }
            case 2: {
                return new Xo(null);
            }
            case 3: {
                Object[] objectArray = new Object[pPa.f];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = Psa.v;
                objectArray[yRa.d] = wta.e;
                objectArray[AQa.P] = JSa.s;
                objectArray[tTa.h] = SRa.T;
                objectArray[uua.p] = opa.e;
                objectArray[XTa.W] = UOa.a;
                objectArray[Yqa.i] = Jpa.Da;
                objectArray[WOa.fa] = bpa.F;
                objectArray[NTa.C] = Zqa.W;
                d2 = objectArray;
                Object b2 = iPa.W;
                return pm_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = pm_3.class;
                synchronized (pm_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<pm>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(pm pm2, ByteString byteString) {
        Object b2 = byteString;
        pm a2 = pm2;
        super.J((ByteString)b2);
    }

    public static /* synthetic */ void i(pm a2) {
        super.l();
    }

    public static /* synthetic */ void M(pm a2) {
        super.M();
    }

    public static Xo J() {
        return (Xo)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(String string) {
        String b2 = string;
        pm_3 a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    @Override
    public float getImpelZ() {
        pm_3 a2;
        return a2.impelZ_;
    }

    private void d() {
        a.bitField0_ &= Bta.u;
        a.impelType_ = uSa.E;
    }

    public static /* synthetic */ void J(pm pm2, boolean bl) {
        boolean b2 = bl;
        pm a2 = pm2;
        super.C(b2);
    }

    public static pm f(InputStream a2) throws IOException {
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void e(pm a2) {
        super.d();
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.drag_ = uSa.E;
    }

    private void l() {
        a.bitField0_ &= fta.fa;
        a.impelYOnTop_ = uSa.E;
    }

    public static pm J(ByteString a2) throws InvalidProtocolBufferException {
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static pm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        pm_3 a2;
        float c2 = f2;
        pm_3 pm_32 = a2 = this;
        pm_32.D();
        pm_32.coords_.setFloat((int)b2, c2);
    }

    @Override
    public List<Float> getCoordsList() {
        pm_3 a2;
        return a2.coords_;
    }

    private void f() {
        a.coords_ = pm_3.emptyFloatList();
    }

    private void l(boolean bl) {
        boolean b2 = bl;
        pm_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.affectOnlyPlayers_ = b2;
    }

    @Override
    public boolean getImpelYOnTop() {
        pm_3 a2;
        return a2.impelYOnTop_;
    }

    static {
        pm_3 pm_32 = new pm_3();
        DEFAULT_INSTANCE = pm_32;
        GeneratedMessageLite.registerDefaultInstance(pm_3.class, pm_32);
    }

    public static /* synthetic */ void d(pm a2) {
        super.G();
    }

    public static /* synthetic */ void C(pm a2) {
        super.i();
    }

    public static pm J(CodedInputStream a2) throws IOException {
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(pm pm2, float f2) {
        float b2 = f2;
        pm a2 = pm2;
        super.f(b2);
    }

    @Override
    public int getImpelTypeValue() {
        pm_3 a2;
        return a2.impelType_;
    }

    @Override
    public boolean getImpelXZOnSides() {
        pm_3 a2;
        return a2.impelXZOnSides_;
    }

    @Override
    public boolean hasDrag() {
        pm_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        pm_3 a2 = this;
        Object object = b2;
        pm_3.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    @Override
    public boolean hasImpelY() {
        pm_3 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static pm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasImpelX() {
        pm_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasImpelXZOnSides() {
        pm_3 a2;
        if ((a2.bitField0_ & ysa.s) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static pm J(byte[] a2) throws InvalidProtocolBufferException {
        return (pm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(boolean bl) {
        boolean b2 = bl;
        pm_3 a2 = this;
        a2.bitField0_ |= ysa.s;
        a2.impelXZOnSides_ = b2;
    }

    @Override
    public boolean getDrag() {
        pm_3 a2;
        return a2.drag_;
    }

    public static /* synthetic */ void l(pm a2) {
        super.f();
    }

    @Override
    public boolean getAffectOnlyPlayers() {
        pm_3 a2;
        return a2.affectOnlyPlayers_;
    }

    private void l(float f2) {
        float b2 = f2;
        pm_3 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.impelY_ = b2;
    }

    public static pm J() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<pm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f(float f2) {
        float b2 = f2;
        pm_3 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.impelX_ = b2;
    }

    private void J(float f2) {
        float b2 = f2;
        pm_3 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.impelZ_ = b2;
    }

    private void J(Un un2) {
        Un b2 = un2;
        pm_3 a2 = this;
        a2.impelType_ = b2.getNumber();
        a2.bitField0_ |= XOa.h;
    }

    public static pm J(InputStream a2) throws IOException {
        return (pm_3)pm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static pm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (pm_3)pm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasImpelZ() {
        pm_3 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J() {
        a.bitField0_ &= NQa.A;
        a.impelZ_ = JPa.N;
    }

    public static /* synthetic */ void f(pm a2) {
        super.A();
    }

    public static /* synthetic */ void J(pm pm2, Un un2) {
        Object b2 = un2;
        pm a2 = pm2;
        super.J((Un)b2);
    }

    @Override
    public String getId() {
        pm_3 a2;
        return a2.id_;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(pm pm2, int n2, float f2) {
        void b2;
        float c2 = f2;
        pm a2 = pm2;
        super.J((int)b2, c2);
    }

    @Override
    public boolean hasImpelType() {
        pm_3 a2;
        if ((a2.bitField0_ & XOa.h) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public Un getImpelType() {
        pm_3 pm_32 = this;
        Un a2 = Un.forNumber(pm_32.impelType_);
        if (a2 == null) {
            return Un.UNRECOGNIZED;
        }
        return a2;
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        pm_3 a2 = this;
        a2.bitField0_ |= fPa.i;
        a2.impelYOnTop_ = b2;
    }

    public static /* synthetic */ void J(pm a2) {
        super.J();
    }

    public static /* synthetic */ void J(pm pm2, int n2) {
        int b2 = n2;
        pm a2 = pm2;
        super.J(b2);
    }

    public static /* synthetic */ void J(pm pm2, float f2) {
        float b2 = f2;
        pm a2 = pm2;
        super.l(b2);
    }
}

