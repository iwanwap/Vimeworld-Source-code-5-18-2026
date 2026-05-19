/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  LM
 *  cra
 *  ja
 *  jo
 *  lqa
 *  nO
 *  pua
 *  vRa
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
public final class jo_1
extends GeneratedMessageLite<jo, LM>
implements ja {
    private float width_;
    private Internal.IntList colors_;
    public static final int COLORPOSITIONS_FIELD_NUMBER = 3;
    private int colorPositionsMemoizedSerializedSize;
    public static final int COLORS_FIELD_NUMBER = 2;
    public static final int DRAWMODE_FIELD_NUMBER = 5;
    private Internal.IntList colorPositions_;
    public static final int POINTS_FIELD_NUMBER = 1;
    private int drawMode_;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int pointsMemoizedSerializedSize = pua.o;
    private static volatile Parser<jo> PARSER;
    private static final jo DEFAULT_INSTANCE;
    private Internal.FloatList points_;
    private int bitField0_;
    private int colorsMemoizedSerializedSize = pua.o;

    public static /* synthetic */ void l(jo jo2, Iterable iterable) {
        Object b2 = iterable;
        jo a2 = jo2;
        super.f((Iterable<? extends Integer>)b2);
    }

    private void i() {
        jo_1 jo_12 = this;
        Internal.IntList a2 = jo_12.colors_;
        if (!a2.isModifiable()) {
            jo_12.colors_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static jo J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void d(jo a2) {
        super.M();
    }

    public static jo J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l(int n2) {
        jo_1 a2;
        int b2 = n2;
        jo_1 jo_12 = a2 = this;
        jo_12.i();
        jo_12.colors_.addInt(b2);
    }

    public static /* synthetic */ void C(jo a2) {
        super.e();
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, int n3) {
        void b2;
        jo_1 a2;
        int c2 = n3;
        jo_1 jo_12 = a2 = this;
        jo_12.d();
        jo_12.colorPositions_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void l(jo jo2, int n2) {
        int b2 = n2;
        jo a2 = jo2;
        super.l(b2);
    }

    public float getPoints(int n2) {
        int b2 = n2;
        jo_1 a2 = this;
        return a2.points_.getFloat(b2);
    }

    public static jo J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public int getColorsCount() {
        jo_1 a2;
        return a2.colors_.size();
    }

    public List<Integer> getColorsList() {
        jo_1 a2;
        return a2.colors_;
    }

    private void f(int n2) {
        jo_1 a2;
        int b2 = n2;
        jo_1 jo_12 = a2 = this;
        jo_12.d();
        jo_12.colorPositions_.addInt(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        jo_1 a2;
        float c2 = f2;
        jo_1 jo_12 = a2 = this;
        jo_12.l();
        jo_12.points_.setFloat((int)b2, c2);
    }

    public static jo f(InputStream a2) throws IOException {
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        jo_1 jo_12 = new jo_1();
        DEFAULT_INSTANCE = jo_12;
        GeneratedMessageLite.registerDefaultInstance(jo_1.class, jo_12);
    }

    public static jo J(InputStream a2) throws IOException {
        return (jo_1)jo_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static jo f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(float f2) {
        jo_1 a2;
        float b2 = f2;
        jo_1 jo_12 = a2 = this;
        jo_12.l();
        jo_12.points_.addFloat(b2);
    }

    public float getWidth() {
        jo_1 a2;
        return a2.width_;
    }

    public static jo J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (jo_1)jo_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(float f2) {
        float b2 = f2;
        jo_1 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.width_ = b2;
    }

    private void l(Iterable<? extends Float> iterable) {
        jo_1 a2;
        Iterable<? extends Float> b2 = iterable;
        jo_1 jo_12 = a2 = this;
        jo_12.l();
        AbstractMessageLite.addAll(b2, jo_12.points_);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(jo jo2, int n2, float f2) {
        void b2;
        float c2 = f2;
        jo a2 = jo2;
        super.J((int)b2, c2);
    }

    private jo_1() {
        jo_1 a2;
        a2.colorPositionsMemoizedSerializedSize = pua.o;
        a2.points_ = jo_1.emptyFloatList();
        a2.colors_ = jo_1.emptyIntList();
        a2.colorPositions_ = jo_1.emptyIntList();
    }

    public static /* synthetic */ void f(jo jo2, int n2) {
        int b2 = n2;
        jo a2 = jo2;
        super.f(b2);
    }

    public static /* synthetic */ void f(jo jo2, Iterable iterable) {
        Object b2 = iterable;
        jo a2 = jo2;
        super.l((Iterable<? extends Float>)b2);
    }

    private void M() {
        a.colorPositions_ = jo_1.emptyIntList();
    }

    private void e() {
        a.colors_ = jo_1.emptyIntList();
    }

    public static jo J(byte[] a2) throws InvalidProtocolBufferException {
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getColorPositionsCount() {
        jo_1 a2;
        return a2.colorPositions_.size();
    }

    public static /* synthetic */ void J(jo jo2, nO nO2) {
        jo b2 = nO2;
        jo a2 = jo2;
        super.J((nO)b2);
    }

    public int getColorPositions(int n2) {
        int b2 = n2;
        jo_1 a2 = this;
        return a2.colorPositions_.getInt(b2);
    }

    private void d() {
        jo_1 jo_12 = this;
        Internal.IntList a2 = jo_12.colorPositions_;
        if (!a2.isModifiable()) {
            jo_12.colorPositions_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void f(Iterable<? extends Integer> iterable) {
        jo_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        jo_1 jo_12 = a2 = this;
        jo_12.i();
        AbstractMessageLite.addAll(b2, jo_12.colors_);
    }

    public List<Float> getPointsList() {
        jo_1 a2;
        return a2.points_;
    }

    public static LM J(jo a2) {
        return (LM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static jo J(CodedInputStream a2) throws IOException {
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        jo_1 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.drawMode_ = b2;
    }

    public boolean hasDrawMode() {
        jo_1 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Parser<jo> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ jo f() {
        return DEFAULT_INSTANCE;
    }

    public int getColors(int n2) {
        int b2 = n2;
        jo_1 a2 = this;
        return a2.colors_.getInt(b2);
    }

    public static /* synthetic */ void f(jo jo2, float f2) {
        float b2 = f2;
        jo a2 = jo2;
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        jo_1 a2;
        int c2 = n3;
        jo_1 jo_12 = a2 = this;
        jo_12.i();
        jo_12.colors_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void l(jo a2) {
        super.C();
    }

    private void J(Iterable<? extends Integer> iterable) {
        jo_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        jo_1 jo_12 = a2 = this;
        jo_12.d();
        AbstractMessageLite.addAll(b2, jo_12.colorPositions_);
    }

    public static /* synthetic */ void f(jo a2) {
        super.J();
    }

    private void C() {
        a.points_ = jo_1.emptyFloatList();
    }

    private void J(nO nO2) {
        jo_1 b2 = nO2;
        jo_1 a2 = this;
        a2.drawMode_ = b2.getNumber();
        a2.bitField0_ |= uqa.g;
    }

    public static /* synthetic */ void J(jo a2) {
        super.f();
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
        jo_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new jo_1();
            }
            case 2: {
                return new LM(null);
            }
            case 3: {
                Object[] objectArray = new Object[uua.p];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = cra.x;
                objectArray[uqa.g] = Yua.j;
                objectArray[yRa.d] = XOa.j;
                objectArray[AQa.P] = LPa.a;
                objectArray[tTa.h] = fPa.M;
                d2 = objectArray;
                Object b2 = FRa.O;
                return jo_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = jo_1.class;
                synchronized (jo_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<jo>(DEFAULT_INSTANCE);
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

    private void l() {
        jo_1 jo_12 = this;
        Internal.FloatList a2 = jo_12.points_;
        if (!a2.isModifiable()) {
            jo_12.points_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private void f() {
        a.bitField0_ &= rQa.p;
        a.width_ = JPa.N;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(jo jo2, int n2, int n3) {
        void b2;
        int c2 = n3;
        jo a2 = jo2;
        super.f((int)b2, c2);
    }

    public static LM J() {
        return (LM)DEFAULT_INSTANCE.createBuilder();
    }

    public List<Integer> getColorPositionsList() {
        jo_1 a2;
        return a2.colorPositions_;
    }

    public static jo J() {
        return DEFAULT_INSTANCE;
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.drawMode_ = uSa.E;
    }

    public int getDrawModeValue() {
        jo_1 a2;
        return a2.drawMode_;
    }

    public static jo J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static jo J(ByteString a2) throws InvalidProtocolBufferException {
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public nO getDrawMode() {
        jo_1 jo_12 = this;
        jo_1 a2 = nO.forNumber((int)jo_12.drawMode_);
        if (a2 == null) {
            return nO.UNRECOGNIZED;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(jo jo2, int n2, int n3) {
        void b2;
        int c2 = n3;
        jo a2 = jo2;
        super.J((int)b2, c2);
    }

    public int getPointsCount() {
        jo_1 a2;
        return a2.points_.size();
    }

    public boolean hasWidth() {
        jo_1 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(jo jo2, int n2) {
        int b2 = n2;
        jo a2 = jo2;
        super.J(b2);
    }

    public static /* synthetic */ void J(jo jo2, float f2) {
        float b2 = f2;
        jo a2 = jo2;
        super.f(b2);
    }

    public static /* synthetic */ void J(jo jo2, Iterable iterable) {
        Object b2 = iterable;
        jo a2 = jo2;
        super.J((Iterable<? extends Integer>)b2);
    }

    public static jo J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (jo_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

