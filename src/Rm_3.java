/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Epa
 *  JPa
 *  Rm
 *  Vua
 *  XTa
 *  jB
 *  pPa
 *  uRa
 *  vRa
 *  wra
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
public final class Rm_3
extends GeneratedMessageLite<Rm, km>
implements jB {
    public static final int MAXY_FIELD_NUMBER = 8;
    public static final int YAW_FIELD_NUMBER = 2;
    private float minX_;
    public static final int MAXZ_FIELD_NUMBER = 9;
    private float pitch_;
    private float zoom_;
    public static final int MINZ_FIELD_NUMBER = 6;
    public static final int MINY_FIELD_NUMBER = 5;
    private float maxY_;
    public static final int MINX_FIELD_NUMBER = 4;
    private static volatile Parser<Rm> PARSER;
    public static final int PITCH_FIELD_NUMBER = 1;
    public static final int MAXX_FIELD_NUMBER = 7;
    public static final int ZOOM_FIELD_NUMBER = 3;
    private float minZ_;
    private float minY_;
    private float yaw_;
    private float maxX_;
    private static final Rm DEFAULT_INSTANCE;
    private float maxZ_;

    public static /* synthetic */ void A(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.M(b2);
    }

    private void A() {
        a.minY_ = JPa.N;
    }

    private void A(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.minX_ = b2;
    }

    private void i() {
        a.minZ_ = JPa.N;
    }

    private void i(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.maxZ_ = b2;
    }

    public static /* synthetic */ void i(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.d(b2);
    }

    public static Parser<Rm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void M() {
        a.yaw_ = JPa.N;
    }

    public static /* synthetic */ void A(Rm a2) {
        super.M();
    }

    public static Rm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Rm J(ByteString a2) throws InvalidProtocolBufferException {
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void e() {
        a.maxZ_ = JPa.N;
    }

    public static /* synthetic */ Rm f() {
        return DEFAULT_INSTANCE;
    }

    public static km J(Rm a2) {
        return (km)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public float getPitch() {
        Rm_3 a2;
        return a2.pitch_;
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
        Rm_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Rm_3();
            }
            case 2: {
                return new km(null);
            }
            case 3: {
                Object[] objectArray = new Object[WOa.fa];
                objectArray[uSa.E] = Nra.u;
                objectArray[vRa.d] = VPa.F;
                objectArray[uqa.g] = uRa.i;
                objectArray[yRa.d] = pPa.Aa;
                objectArray[AQa.P] = Epa.la;
                objectArray[tTa.h] = WPa.t;
                objectArray[uua.p] = wra.D;
                objectArray[XTa.W] = Vua.Ha;
                objectArray[Yqa.i] = EPa.m;
                d2 = objectArray;
                Object b2 = fta.j;
                return Rm_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Rm_3.class;
                synchronized (Rm_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Rm>(DEFAULT_INSTANCE);
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

    public static Rm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void M(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.i(b2);
    }

    public static /* synthetic */ void i(Rm a2) {
        super.d();
    }

    private void M(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.pitch_ = b2;
    }

    private void e(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.minZ_ = b2;
    }

    public static /* synthetic */ void e(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.C(b2);
    }

    public static Rm J(byte[] a2) throws InvalidProtocolBufferException {
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void d(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.f(b2);
    }

    public static /* synthetic */ void C(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.l(b2);
    }

    private void d() {
        a.pitch_ = JPa.N;
    }

    private void d(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.zoom_ = b2;
    }

    public static /* synthetic */ void l(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.A(b2);
    }

    public static /* synthetic */ void M(Rm a2) {
        super.f();
    }

    public float getMinZ() {
        Rm_3 a2;
        return a2.minZ_;
    }

    private void C(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.maxX_ = b2;
    }

    public static /* synthetic */ void e(Rm a2) {
        super.e();
    }

    public static /* synthetic */ void d(Rm a2) {
        super.A();
    }

    public static Rm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void C() {
        a.zoom_ = JPa.N;
    }

    public float getMaxX() {
        Rm_3 a2;
        return a2.maxX_;
    }

    private void l(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.yaw_ = b2;
    }

    public static /* synthetic */ void C(Rm a2) {
        super.J();
    }

    public static Rm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public float getMinY() {
        Rm_3 a2;
        return a2.minY_;
    }

    public static km J() {
        return (km)DEFAULT_INSTANCE.createBuilder();
    }

    public float getMinX() {
        Rm_3 a2;
        return a2.minX_;
    }

    public float getYaw() {
        Rm_3 a2;
        return a2.yaw_;
    }

    public float getZoom() {
        Rm_3 a2;
        return a2.zoom_;
    }

    public static /* synthetic */ void f(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.e(b2);
    }

    private void l() {
        a.maxY_ = JPa.N;
    }

    public static /* synthetic */ void J(Rm rm2, float f2) {
        float b2 = f2;
        Rm a2 = rm2;
        super.J(b2);
    }

    public static Rm J() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        a.maxX_ = JPa.N;
    }

    public static Rm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(Rm a2) {
        super.C();
    }

    public static Rm f(InputStream a2) throws IOException {
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        Rm_3 rm_3 = new Rm_3();
        DEFAULT_INSTANCE = rm_3;
        GeneratedMessageLite.registerDefaultInstance(Rm_3.class, rm_3);
    }

    private void f(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.maxY_ = b2;
    }

    private void J() {
        a.minX_ = JPa.N;
    }

    public static Rm J(CodedInputStream a2) throws IOException {
        return (Rm_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public float getMaxY() {
        Rm_3 a2;
        return a2.maxY_;
    }

    public static /* synthetic */ void f(Rm a2) {
        super.i();
    }

    private void J(float f2) {
        float b2 = f2;
        Rm_3 a2 = this;
        a2.minY_ = b2;
    }

    public static Rm J(InputStream a2) throws IOException {
        return (Rm_3)Rm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private Rm_3() {
        Rm_3 a2;
    }

    public float getMaxZ() {
        Rm_3 a2;
        return a2.maxZ_;
    }

    public static /* synthetic */ void J(Rm a2) {
        super.l();
    }

    public static Rm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rm_3)Rm_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

