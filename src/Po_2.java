/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Po
 *  bpa
 *  vRa
 *  yo
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
public final class Po_2
extends GeneratedMessageLite<Po, yo>
implements qB {
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final Po DEFAULT_INSTANCE;
    private int shake_;
    public static final int SHAKE_FIELD_NUMBER = 3;
    private int fov_;
    private static volatile Parser<Po> PARSER;
    public static final int FOV_FIELD_NUMBER = 2;
    private int color_;

    public static Po J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public int getColor() {
        Po_2 a2;
        return a2.color_;
    }

    public static yo J(Po a2) {
        return (yo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Po f(InputStream a2) throws IOException {
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l(int n2) {
        int b2 = n2;
        Po_2 a2 = this;
        a2.fov_ = b2;
    }

    @Override
    public int getFov() {
        Po_2 a2;
        return a2.fov_;
    }

    public static Po J(byte[] a2) throws InvalidProtocolBufferException {
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        Po_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Po_2();
            }
            case 2: {
                return new yo(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lQa.Ka;
                objectArray[vRa.d] = bpa.d;
                objectArray[uqa.g] = csa.s;
                d2 = objectArray;
                Object b2 = xTa.c;
                return Po_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Po_2.class;
                synchronized (Po_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Po>(DEFAULT_INSTANCE);
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

    private void f(int n2) {
        int b2 = n2;
        Po_2 a2 = this;
        a2.color_ = b2;
    }

    private Po_2() {
        Po_2 a2;
    }

    public static /* synthetic */ void l(Po a2) {
        super.f();
    }

    private void l() {
        a.shake_ = uSa.E;
    }

    static {
        Po_2 po_2 = new Po_2();
        DEFAULT_INSTANCE = po_2;
        GeneratedMessageLite.registerDefaultInstance(Po_2.class, po_2);
    }

    public static Po J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Po J(InputStream a2) throws IOException {
        return (Po_2)Po_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.color_ = uSa.E;
    }

    @Override
    public int getShake() {
        Po_2 a2;
        return a2.shake_;
    }

    public static Po J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(Po po2, int n2) {
        int b2 = n2;
        Po a2 = po2;
        super.J(b2);
    }

    public static Po J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Po J(CodedInputStream a2) throws IOException {
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Po f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Po_2)Po_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Po f() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Po> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Po J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ Po J() {
        return DEFAULT_INSTANCE;
    }

    public static yo J() {
        return (yo)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(int n2) {
        int b2 = n2;
        Po_2 a2 = this;
        a2.shake_ = b2;
    }

    public static /* synthetic */ void f(Po a2) {
        super.l();
    }

    public static /* synthetic */ void f(Po po2, int n2) {
        int b2 = n2;
        Po a2 = po2;
        super.l(b2);
    }

    private void J() {
        a.fov_ = uSa.E;
    }

    public static /* synthetic */ void J(Po a2) {
        super.J();
    }

    public static Po J(ByteString a2) throws InvalidProtocolBufferException {
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Po po2, int n2) {
        int b2 = n2;
        Po a2 = po2;
        super.f(b2);
    }

    public static Po J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Po_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }
}

