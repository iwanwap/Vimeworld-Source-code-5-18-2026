/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  JPa
 *  NOa
 *  NQa
 *  Vo
 *  WSa
 *  bpa
 *  cRa
 *  em
 *  kpa
 *  lqa
 *  vRa
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
public final class em_2
extends GeneratedMessageLite<em, Vo>
implements za {
    private int offsetTop_;
    public static final int OFFSETTOP_FIELD_NUMBER = 3;
    private int offsetLeft_;
    public static final int OFFSETRIGHT_FIELD_NUMBER = 2;
    private static volatile Parser<em> PARSER;
    public static final int TEXTURESCALE_FIELD_NUMBER = 5;
    private static final em DEFAULT_INSTANCE;
    private int offsetRight_;
    public static final int OFFSETBOTTOM_FIELD_NUMBER = 4;
    private int bitField0_;
    private float textureScale_;
    private int offsetBottom_;
    public static final int OFFSETLEFT_FIELD_NUMBER = 1;

    public static /* synthetic */ void d(em a2) {
        super.d();
    }

    public static /* synthetic */ void C(em a2) {
        super.J();
    }

    public static em J(CodedInputStream a2) throws IOException {
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(em em2, int n2) {
        int b2 = n2;
        em a2 = em2;
        super.l(b2);
    }

    public static em J(ByteString a2) throws InvalidProtocolBufferException {
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C(int n2) {
        int b2 = n2;
        em_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.offsetRight_ = b2;
    }

    private void l(int n2) {
        int b2 = n2;
        em_2 a2 = this;
        a2.bitField0_ |= Yqa.i;
        a2.offsetBottom_ = b2;
    }

    public static em J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static em J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getOffsetTop() {
        em_2 a2;
        return a2.offsetTop_;
    }

    private void f(int n2) {
        int b2 = n2;
        em_2 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.offsetTop_ = b2;
    }

    public static em J(byte[] a2) throws InvalidProtocolBufferException {
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasOffsetTop() {
        em_2 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(float f2) {
        float b2 = f2;
        em_2 a2 = this;
        a2.bitField0_ |= ERa.C;
        a2.textureScale_ = b2;
    }

    public static /* synthetic */ void l(em a2) {
        super.l();
    }

    public static em f(InputStream a2) throws IOException {
        return (em_2)em_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Vo J() {
        return (Vo)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void f(em a2) {
        super.f();
    }

    public static /* synthetic */ void l(em em2, int n2) {
        int b2 = n2;
        em a2 = em2;
        super.C(b2);
    }

    public static em J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static em J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static em f() {
        return DEFAULT_INSTANCE;
    }

    public static em J(InputStream a2) throws IOException {
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasOffsetBottom() {
        em_2 a2;
        if ((a2.bitField0_ & Yqa.i) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasOffsetRight() {
        em_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ em J() {
        return DEFAULT_INSTANCE;
    }

    public static em J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static em f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (em_2)em_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public int getOffsetLeft() {
        em_2 a2;
        return a2.offsetLeft_;
    }

    private void d() {
        a.bitField0_ &= kpa.w;
        a.offsetTop_ = uSa.E;
    }

    public static /* synthetic */ void J(em em2, float f2) {
        float b2 = f2;
        em a2 = em2;
        super.J(b2);
    }

    public static /* synthetic */ void f(em em2, int n2) {
        int b2 = n2;
        em a2 = em2;
        super.J(b2);
    }

    private void C() {
        a.bitField0_ &= Jra.Fa;
        a.offsetBottom_ = uSa.E;
    }

    private em_2() {
        em_2 a2;
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.offsetLeft_ = uSa.E;
    }

    public static Parser<em> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override
    public float getTextureScale() {
        em_2 a2;
        return a2.textureScale_;
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.offsetRight_ = uSa.E;
    }

    private void J() {
        a.bitField0_ &= NQa.A;
        a.textureScale_ = JPa.N;
    }

    @Override
    public int getOffsetBottom() {
        em_2 a2;
        return a2.offsetBottom_;
    }

    private void J(int n2) {
        int b2 = n2;
        em_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.offsetLeft_ = b2;
    }

    public static /* synthetic */ void J(em a2) {
        super.C();
    }

    public static em J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (em_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasOffsetLeft() {
        em_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasTextureScale() {
        em_2 a2;
        if ((a2.bitField0_ & ERa.C) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    static {
        em_2 em_22 = new em_2();
        DEFAULT_INSTANCE = em_22;
        GeneratedMessageLite.registerDefaultInstance(em_2.class, em_22);
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
        em_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new em_2();
            }
            case 2: {
                return new Vo(null);
            }
            case 3: {
                Object[] objectArray = new Object[uua.p];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = WSa.j;
                objectArray[uqa.g] = Nra.q;
                objectArray[yRa.d] = cRa.O;
                objectArray[AQa.P] = KSa.p;
                objectArray[tTa.h] = NOa.Y;
                d2 = objectArray;
                Object b2 = bpa.w;
                return em_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = em_2.class;
                synchronized (em_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<em>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(em em2, int n2) {
        int b2 = n2;
        em a2 = em2;
        super.f(b2);
    }

    @Override
    public int getOffsetRight() {
        em_2 a2;
        return a2.offsetRight_;
    }

    public static Vo J(em a2) {
        return (Vo)DEFAULT_INSTANCE.createBuilder(a2);
    }
}

