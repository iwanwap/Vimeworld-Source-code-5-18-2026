/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  FM
 *  Gua
 *  an
 *  lqa
 *  vRa
 *  xOa
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
public final class jn
extends GeneratedMessageLite<jn, FM>
implements NB {
    private int bitField0_;
    public static final int LOCATION_FIELD_NUMBER = 2;
    private static final jn DEFAULT_INSTANCE;
    private int location_;
    private int orientation_;
    public static final int ORIENTATION_FIELD_NUMBER = 3;
    public static final int TARGET_FIELD_NUMBER = 1;
    private boolean removeWhenParentRemove_;
    private static volatile Parser<jn> PARSER;
    private String target_ = Mqa.y;
    public static final int REMOVEWHENPARENTREMOVE_FIELD_NUMBER = 4;

    public static jn J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(int n2) {
        int b2 = n2;
        jn a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.orientation_ = b2;
    }

    @Override
    public int getOrientationValue() {
        jn a2;
        return a2.orientation_;
    }

    private void C() {
        a.bitField0_ &= rQa.p;
        a.orientation_ = uSa.E;
    }

    private void l() {
        a.location_ = uSa.E;
    }

    public static jn f(InputStream a2) throws IOException {
        return jn.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void C(jn a2) {
        a2.C();
    }

    public static /* synthetic */ void l(jn a2) {
        a2.J();
    }

    private void J(boolean bl) {
        boolean b2 = bl;
        jn a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.removeWhenParentRemove_ = b2;
    }

    public static jn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return jn.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(jn a2) {
        a2.f();
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
        jn c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new jn();
            }
            case 2: {
                return new FM(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = yta.Q;
                objectArray[uqa.g] = xOa.W;
                objectArray[yRa.d] = xSa.G;
                objectArray[AQa.P] = kra.H;
                d2 = objectArray;
                Object b2 = Gua.b;
                return jn.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = jn.class;
                synchronized (jn.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<jn>(DEFAULT_INSTANCE);
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

    public static jn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean getRemoveWhenParentRemove() {
        jn a2;
        return a2.removeWhenParentRemove_;
    }

    public static FM J() {
        return (FM)DEFAULT_INSTANCE.createBuilder();
    }

    public static FM J(jn a2) {
        return (FM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void f(an an2) {
        jn b2 = an2;
        jn a2 = this;
        a2.orientation_ = b2.getNumber();
        a2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void J(jn jn2, ByteString byteString) {
        ByteString b2 = byteString;
        jn a2 = jn2;
        a2.J(b2);
    }

    public static /* synthetic */ void J(jn jn2, boolean bl) {
        boolean b2 = bl;
        jn a2 = jn2;
        a2.J(b2);
    }

    @Override
    public an getOrientation() {
        jn jn2 = this;
        jn a2 = an.forNumber((int)jn2.orientation_);
        if (a2 == null) {
            return an.UNRECOGNIZED;
        }
        return a2;
    }

    public static /* synthetic */ void f(jn jn2, int n2) {
        int b2 = n2;
        jn a2 = jn2;
        a2.J(b2);
    }

    public static /* synthetic */ void J(jn a2) {
        a2.l();
    }

    public static jn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static jn J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(jn jn2, int n2) {
        int b2 = n2;
        jn a2 = jn2;
        a2.f(b2);
    }

    private void J(an an2) {
        jn b2 = an2;
        jn a2 = this;
        a2.location_ = b2.getNumber();
    }

    public static /* synthetic */ void f(jn jn2, an an2) {
        jn b2 = an2;
        jn a2 = jn2;
        a2.J((an)b2);
    }

    public static jn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.target_ = jn.J().getTarget();
    }

    public static jn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        jn a2 = this;
        Object object = b2;
        jn.checkByteStringIsUtf8((ByteString)object);
        a2.target_ = ((ByteString)object).toStringUtf8();
    }

    public static jn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ jn f() {
        return DEFAULT_INSTANCE;
    }

    public static jn J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public String getTarget() {
        jn a2;
        return a2.target_;
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.removeWhenParentRemove_ = uSa.E;
    }

    @Override
    public an getLocation() {
        jn jn2 = this;
        jn a2 = an.forNumber((int)jn2.location_);
        if (a2 == null) {
            return an.UNRECOGNIZED;
        }
        return a2;
    }

    private jn() {
        jn a2;
    }

    public static /* synthetic */ void J(jn jn2, String string) {
        String b2 = string;
        jn a2 = jn2;
        a2.J(b2);
    }

    public static /* synthetic */ void J(jn jn2, an an2) {
        jn b2 = an2;
        jn a2 = jn2;
        a2.f((an)b2);
    }

    @Override
    public int getLocationValue() {
        jn a2;
        return a2.location_;
    }

    public static jn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        jn a2 = this;
        b2.getClass();
        a2.target_ = b2;
    }

    public static Parser<jn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override
    public boolean hasRemoveWhenParentRemove() {
        jn a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasOrientation() {
        jn a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public ByteString getTargetBytes() {
        jn a2;
        return ByteString.copyFromUtf8(a2.target_);
    }

    private void J(int n2) {
        int b2 = n2;
        jn a2 = this;
        a2.location_ = b2;
    }

    public static jn J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static jn J() {
        return DEFAULT_INSTANCE;
    }

    static {
        jn jn2;
        DEFAULT_INSTANCE = jn2 = new jn();
        GeneratedMessageLite.registerDefaultInstance(jn.class, jn2);
    }
}

