/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DQa
 *  JPa
 *  LQa
 *  Vn
 *  hTa
 *  isa
 *  vRa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class do
extends GeneratedMessageLite<do, Vn>
implements Oa {
    private static final do DEFAULT_INSTANCE;
    private float z_;
    private float x_;
    private static volatile Parser<do> PARSER;
    public static final int Y_FIELD_NUMBER = 2;
    private float y_;
    public static final int Z_FIELD_NUMBER = 3;
    public static final int X_FIELD_NUMBER = 1;

    public static do f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static do J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static do J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static do J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void l() {
        a.z_ = JPa.N;
    }

    private void l(float f2) {
        float b2 = f2;
        do a2 = this;
        a2.z_ = b2;
    }

    public static do J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static do f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static do f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void l(do a2) {
        a2.l();
    }

    private void f(float f2) {
        float b2 = f2;
        do a2 = this;
        a2.x_ = b2;
    }

    @Override
    public float getX() {
        do a2;
        return a2.x_;
    }

    public static /* synthetic */ void f(do a2) {
        a2.f();
    }

    @Override
    public float getY() {
        do a2;
        return a2.y_;
    }

    static {
        do do_;
        DEFAULT_INSTANCE = do_ = new do();
        GeneratedMessageLite.registerDefaultInstance(do.class, do_);
    }

    public static do J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.y_ = JPa.N;
    }

    @Override
    public float getZ() {
        do a2;
        return a2.z_;
    }

    private void J() {
        a.x_ = JPa.N;
    }

    public static do J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return do.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(do a2) {
        a2.J();
    }

    public static Vn J() {
        return (Vn)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void l(do do_, float f2) {
        float b2 = f2;
        do a2 = do_;
        a2.f(b2);
    }

    public static do J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static do J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Vn J(do a2) {
        return (Vn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(do do_, float f2) {
        float b2 = f2;
        do a2 = do_;
        a2.J(b2);
    }

    public static do J(InputStream a2) throws IOException {
        return do.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private do() {
        do a2;
    }

    public static Parser<do> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ do J() {
        return DEFAULT_INSTANCE;
    }

    private void J(float f2) {
        float b2 = f2;
        do a2 = this;
        a2.y_ = b2;
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
        do c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new do();
            }
            case 2: {
                return new Vn(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = LQa.k;
                objectArray[vRa.d] = isa.I;
                objectArray[uqa.g] = DQa.Z;
                d2 = objectArray;
                Object b2 = hTa.N;
                return do.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = do.class;
                synchronized (do.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<do>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(do do_, float f2) {
        float b2 = f2;
        do a2 = do_;
        a2.l(b2);
    }

    public static do J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

