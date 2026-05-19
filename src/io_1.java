/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EM
 *  JPa
 *  Ppa
 *  Uqa
 *  XTa
 *  io
 *  vRa
 *  yra
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
public final class io_1
extends GeneratedMessageLite<io, EM>
implements la {
    private float hoveredPositionY_;
    public static final int SCREENY_FIELD_NUMBER = 2;
    private int screenWidth_;
    public static final int HOVEREDENTITYID_FIELD_NUMBER = 9;
    public static final int HOVEREDPOSITIONX_FIELD_NUMBER = 5;
    private int screenHeight_;
    public static final int SCREENX_FIELD_NUMBER = 1;
    public static final int SCREENHEIGHT_FIELD_NUMBER = 4;
    public static final int HOVEREDBLOCKFACE_FIELD_NUMBER = 8;
    public static final int SCREENWIDTH_FIELD_NUMBER = 3;
    private static final io DEFAULT_INSTANCE;
    private static volatile Parser<io> PARSER;
    private int screenX_;
    private int screenY_;
    private int hoveredBlockFace_;
    private int hoveredEntityId_;
    public static final int HOVEREDPOSITIONZ_FIELD_NUMBER = 7;
    private float hoveredPositionX_;
    public static final int HOVEREDPOSITIONY_FIELD_NUMBER = 6;
    private float hoveredPositionZ_;

    private void e(int n2) {
        int b2 = n2;
        io_1 a2 = this;
        a2.screenY_ = b2;
    }

    public static /* synthetic */ void A(io a2) {
        super.M();
    }

    private io_1() {
        io_1 a2;
    }

    @Override
    public int getScreenY() {
        io_1 a2;
        return a2.screenY_;
    }

    private void A() {
        a.screenHeight_ = uSa.E;
    }

    @Override
    public int getScreenWidth() {
        io_1 a2;
        return a2.screenWidth_;
    }

    public static io J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void i() {
        a.hoveredPositionY_ = JPa.N;
    }

    public static io f(InputStream a2) throws IOException {
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static io J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void i(io a2) {
        super.f();
    }

    public static io J(CodedInputStream a2) throws IOException {
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static io J(byte[] a2) throws InvalidProtocolBufferException {
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void M() {
        a.screenWidth_ = uSa.E;
    }

    public static io f() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public int getScreenHeight() {
        io_1 a2;
        return a2.screenHeight_;
    }

    public static /* synthetic */ void M(io a2) {
        super.e();
    }

    private void d(int n2) {
        int b2 = n2;
        io_1 a2 = this;
        a2.screenWidth_ = b2;
    }

    private void e() {
        a.hoveredBlockFace_ = uSa.E;
    }

    public static io J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public float getHoveredPositionZ() {
        io_1 a2;
        return a2.hoveredPositionZ_;
    }

    private void l(float f2) {
        float b2 = f2;
        io_1 a2 = this;
        a2.hoveredPositionY_ = b2;
    }

    public static /* synthetic */ void e(io a2) {
        super.l();
    }

    public static /* synthetic */ void d(io a2) {
        super.A();
    }

    public static /* synthetic */ void l(io io2, float f2) {
        float b2 = f2;
        io a2 = io2;
        super.f(b2);
    }

    public static io J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void d() {
        a.hoveredPositionZ_ = JPa.N;
    }

    public static /* synthetic */ void e(io io2, int n2) {
        int b2 = n2;
        io a2 = io2;
        super.d(b2);
    }

    private void C(int n2) {
        int b2 = n2;
        io_1 a2 = this;
        a2.screenX_ = b2;
    }

    public static io J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void f(float f2) {
        float b2 = f2;
        io_1 a2 = this;
        a2.hoveredPositionX_ = b2;
    }

    private void l(int n2) {
        int b2 = n2;
        io_1 a2 = this;
        a2.hoveredBlockFace_ = b2;
    }

    public static /* synthetic */ void C(io a2) {
        super.i();
    }

    public static /* synthetic */ void l(io a2) {
        super.d();
    }

    public static Parser<io> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f(int n2) {
        int b2 = n2;
        io_1 a2 = this;
        a2.hoveredEntityId_ = b2;
    }

    private void C() {
        a.screenY_ = uSa.E;
    }

    public static /* synthetic */ void f(io a2) {
        super.C();
    }

    public static io J(ByteString a2) throws InvalidProtocolBufferException {
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static io f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (io_1)io_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ io J() {
        return DEFAULT_INSTANCE;
    }

    public static io J(InputStream a2) throws IOException {
        return (io_1)io_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void d(io io2, int n2) {
        int b2 = n2;
        io a2 = io2;
        super.C(b2);
    }

    public static /* synthetic */ void C(io io2, int n2) {
        int b2 = n2;
        io a2 = io2;
        super.f(b2);
    }

    static {
        io_1 io_12 = new io_1();
        DEFAULT_INSTANCE = io_12;
        GeneratedMessageLite.registerDefaultInstance(io_1.class, io_12);
    }

    @Override
    public int getHoveredEntityId() {
        io_1 a2;
        return a2.hoveredEntityId_;
    }

    private void l() {
        a.hoveredEntityId_ = uSa.E;
    }

    private void f() {
        a.hoveredPositionX_ = JPa.N;
    }

    public static /* synthetic */ void J(io a2) {
        super.J();
    }

    public static io J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (io_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(io io2, int n2) {
        int b2 = n2;
        io a2 = io2;
        super.l(b2);
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
        io_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new io_1();
            }
            case 2: {
                return new EM(null);
            }
            case 3: {
                Object[] objectArray = new Object[WOa.fa];
                objectArray[uSa.E] = Uqa.X;
                objectArray[vRa.d] = yra.D;
                objectArray[uqa.g] = Zra.r;
                objectArray[yRa.d] = Ppa.X;
                objectArray[AQa.P] = sra.y;
                objectArray[tTa.h] = osa.O;
                objectArray[uua.p] = zua.Ha;
                objectArray[XTa.W] = vua.ia;
                objectArray[Yqa.i] = hpa.Aa;
                d2 = objectArray;
                Object b2 = Yua.R;
                return io_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = io_1.class;
                synchronized (io_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<io>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(io io2, float f2) {
        float b2 = f2;
        io a2 = io2;
        super.l(b2);
    }

    @Override
    public float getHoveredPositionY() {
        io_1 a2;
        return a2.hoveredPositionY_;
    }

    public static /* synthetic */ void J(io io2, float f2) {
        float b2 = f2;
        io a2 = io2;
        super.J(b2);
    }

    @Override
    public int getScreenX() {
        io_1 a2;
        return a2.screenX_;
    }

    private void J() {
        a.screenX_ = uSa.E;
    }

    private void J(float f2) {
        float b2 = f2;
        io_1 a2 = this;
        a2.hoveredPositionZ_ = b2;
    }

    @Override
    public float getHoveredPositionX() {
        io_1 a2;
        return a2.hoveredPositionX_;
    }

    @Override
    public int getHoveredBlockFace() {
        io_1 a2;
        return a2.hoveredBlockFace_;
    }

    private void J(int n2) {
        int b2 = n2;
        io_1 a2 = this;
        a2.screenHeight_ = b2;
    }

    public static EM J() {
        return (EM)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void f(io io2, int n2) {
        int b2 = n2;
        io a2 = io2;
        super.J(b2);
    }

    public static EM J(io a2) {
        return (EM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(io io2, int n2) {
        int b2 = n2;
        io a2 = io2;
        super.e(b2);
    }
}

