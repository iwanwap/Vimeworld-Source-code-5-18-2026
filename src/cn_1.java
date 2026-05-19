/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  JQa
 *  NTa
 *  Ppa
 *  Uqa
 *  XTa
 *  cn
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
public final class cn_1
extends GeneratedMessageLite<cn, fo>
implements Ca {
    public static final int SCREENHEIGHT_FIELD_NUMBER = 4;
    private int hoveredBlockFace_;
    private int hoveredBlockX_;
    public static final int HOVEREDBLOCKZ_FIELD_NUMBER = 7;
    private int hoveredEntityId_;
    private static volatile Parser<cn> PARSER;
    public static final int HOVEREDENTITYID_FIELD_NUMBER = 9;
    private int screenWidth_;
    private int hoveredBlockZ_;
    public static final int MOUSEBUTTON_FIELD_NUMBER = 10;
    private static final cn DEFAULT_INSTANCE;
    public static final int SCREENX_FIELD_NUMBER = 1;
    private int hoveredBlockY_;
    public static final int SCREENWIDTH_FIELD_NUMBER = 3;
    public static final int SCREENY_FIELD_NUMBER = 2;
    public static final int HOVEREDBLOCKFACE_FIELD_NUMBER = 8;
    public static final int HOVEREDBLOCKX_FIELD_NUMBER = 5;
    private int screenY_;
    private int screenHeight_;
    private int mouseButton_;
    private int screenX_;
    public static final int HOVEREDBLOCKY_FIELD_NUMBER = 6;

    private void D() {
        a.screenHeight_ = uSa.E;
    }

    public static /* synthetic */ void D(cn a2) {
        super.D();
    }

    @Override
    public int getHoveredBlockFace() {
        cn_1 a2;
        return a2.hoveredBlockFace_;
    }

    private void D(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.hoveredBlockFace_ = b2;
    }

    public static cn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static cn f(InputStream a2) throws IOException {
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getMouseButton() {
        cn_1 a2;
        return a2.mouseButton_;
    }

    private void A() {
        a.hoveredBlockY_ = uSa.E;
    }

    public static cn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static cn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static cn J(byte[] a2) throws InvalidProtocolBufferException {
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void A(cn a2) {
        super.e();
    }

    public static cn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void i() {
        a.hoveredEntityId_ = uSa.E;
    }

    public static /* synthetic */ void i(cn a2) {
        super.C();
    }

    @Override
    public int getScreenHeight() {
        cn_1 a2;
        return a2.screenHeight_;
    }

    @Override
    public int getHoveredEntityId() {
        cn_1 a2;
        return a2.hoveredEntityId_;
    }

    public static /* synthetic */ void M(cn a2) {
        super.M();
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
        cn_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new cn_1();
            }
            case 2: {
                return new fo(null);
            }
            case 3: {
                Object[] objectArray = new Object[NTa.C];
                objectArray[uSa.E] = Uqa.X;
                objectArray[vRa.d] = yra.D;
                objectArray[uqa.g] = Zra.r;
                objectArray[yRa.d] = Ppa.X;
                objectArray[AQa.P] = JQa.Ha;
                objectArray[tTa.h] = Asa.ca;
                objectArray[uua.p] = Eqa.q;
                objectArray[XTa.W] = vua.ia;
                objectArray[Yqa.i] = hpa.Aa;
                objectArray[WOa.fa] = ypa.n;
                d2 = objectArray;
                Object b2 = Hta.ja;
                return cn_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = cn_1.class;
                synchronized (cn_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<cn>(DEFAULT_INSTANCE);
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

    static {
        cn_1 cn_12 = new cn_1();
        DEFAULT_INSTANCE = cn_12;
        GeneratedMessageLite.registerDefaultInstance(cn_1.class, cn_12);
    }

    public static Parser<cn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void D(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.f(b2);
    }

    private void A(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.screenHeight_ = b2;
    }

    public static /* synthetic */ void A(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.C(b2);
    }

    @Override
    public int getHoveredBlockY() {
        cn_1 a2;
        return a2.hoveredBlockY_;
    }

    @Override
    public int getScreenWidth() {
        cn_1 a2;
        return a2.screenWidth_;
    }

    private void i(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.hoveredEntityId_ = b2;
    }

    public static cn J(InputStream a2) throws IOException {
        return (cn_1)cn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void M(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.screenY_ = b2;
    }

    private void e(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.hoveredBlockX_ = b2;
    }

    public static /* synthetic */ void e(cn a2) {
        super.f();
    }

    public static cn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ cn f() {
        return DEFAULT_INSTANCE;
    }

    public static fo J() {
        return (fo)DEFAULT_INSTANCE.createBuilder();
    }

    private void M() {
        a.screenX_ = uSa.E;
    }

    public static cn J(ByteString a2) throws InvalidProtocolBufferException {
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static cn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (cn_1)cn_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void e() {
        a.hoveredBlockFace_ = uSa.E;
    }

    private void d() {
        a.screenWidth_ = uSa.E;
    }

    public static /* synthetic */ void d(cn a2) {
        super.d();
    }

    public static /* synthetic */ void i(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.d(b2);
    }

    public static /* synthetic */ void C(cn a2) {
        super.A();
    }

    public static /* synthetic */ void M(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.M(b2);
    }

    private void C() {
        a.mouseButton_ = uSa.E;
    }

    public static /* synthetic */ void l(cn a2) {
        super.l();
    }

    private void l() {
        a.hoveredBlockX_ = uSa.E;
    }

    public static /* synthetic */ void e(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.A(b2);
    }

    public static /* synthetic */ void f(cn a2) {
        super.J();
    }

    public static cn J() {
        return DEFAULT_INSTANCE;
    }

    public static cn J(CodedInputStream a2) throws IOException {
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void d(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.J(b2);
    }

    private void f() {
        a.screenY_ = uSa.E;
    }

    public static /* synthetic */ void C(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.i(b2);
    }

    public static /* synthetic */ void l(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.D(b2);
    }

    public static fo J(cn a2) {
        return (fo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.l(b2);
    }

    public static /* synthetic */ void J(cn cn2, int n2) {
        int b2 = n2;
        cn a2 = cn2;
        super.e(b2);
    }

    @Override
    public int getHoveredBlockX() {
        cn_1 a2;
        return a2.hoveredBlockX_;
    }

    private void d(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.hoveredBlockY_ = b2;
    }

    public static cn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (cn_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public int getHoveredBlockZ() {
        cn_1 a2;
        return a2.hoveredBlockZ_;
    }

    public static /* synthetic */ void J(cn a2) {
        super.i();
    }

    @Override
    public int getScreenX() {
        cn_1 a2;
        return a2.screenX_;
    }

    private void C(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.mouseButton_ = b2;
    }

    @Override
    public int getScreenY() {
        cn_1 a2;
        return a2.screenY_;
    }

    private void l(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.screenX_ = b2;
    }

    private void f(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.hoveredBlockZ_ = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        cn_1 a2 = this;
        a2.screenWidth_ = b2;
    }

    private void J() {
        a.hoveredBlockZ_ = uSa.E;
    }

    private cn_1() {
        cn_1 a2;
    }
}

