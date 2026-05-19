/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Lo
 *  bO
 *  cRa
 *  dC
 *  fTa
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
public final class vN
extends GeneratedMessageLite<vN, Lo>
implements dC {
    public static final int RESOURCE_FIELD_NUMBER = 2;
    public static final int PATH_FIELD_NUMBER = 1;
    private static volatile Parser<vN> PARSER;
    private static final vN DEFAULT_INSTANCE;
    private int archiveCase_ = uSa.E;
    private Object archive_;

    public static vN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static vN f(InputStream a2) throws IOException {
        return vN.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<vN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void l(vN a2) {
        a2.l();
    }

    public static vN J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static vN J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public boolean hasPath() {
        vN a2;
        if (a2.archiveCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(vN vN2, int n2) {
        int b2 = n2;
        vN a2 = vN2;
        a2.J(b2);
    }

    public int getResource() {
        vN a2;
        if (a2.archiveCase_ == uqa.g) {
            return (Integer)a2.archive_;
        }
        return uSa.E;
    }

    public static Lo J() {
        return (Lo)DEFAULT_INSTANCE.createBuilder();
    }

    public static vN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private vN() {
        vN a2;
    }

    private void l() {
        vN a2;
        if (a2.archiveCase_ == uqa.g) {
            vN vN2 = a2;
            vN2.archiveCase_ = uSa.E;
            vN2.archive_ = null;
        }
    }

    public static vN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vN f() {
        return DEFAULT_INSTANCE;
    }

    public static vN J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(vN vN2, String string) {
        String b2 = string;
        vN a2 = vN2;
        a2.J(b2);
    }

    private void J(int n2) {
        vN a2;
        int b2 = n2;
        vN vN2 = a2 = this;
        vN2.archiveCase_ = uqa.g;
        vN2.archive_ = b2;
    }

    public static /* synthetic */ void f(vN a2) {
        a2.J();
    }

    public bO getArchiveCase() {
        vN a2;
        return bO.forNumber((int)a2.archiveCase_);
    }

    static {
        vN vN2;
        DEFAULT_INSTANCE = vN2 = new vN();
        GeneratedMessageLite.registerDefaultInstance(vN.class, vN2);
    }

    public static vN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return vN.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ByteString getPathBytes() {
        vN vN2 = this;
        Object a2 = Mqa.y;
        if (vN2.archiveCase_ == vRa.d) {
            a2 = (String)vN2.archive_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    public static /* synthetic */ vN J() {
        return DEFAULT_INSTANCE;
    }

    public String getPath() {
        vN vN2 = this;
        Object a2 = Mqa.y;
        if (vN2.archiveCase_ == vRa.d) {
            a2 = (String)vN2.archive_;
        }
        return a2;
    }

    private void f() {
        vN a2;
        if (a2.archiveCase_ == vRa.d) {
            vN vN2 = a2;
            vN2.archiveCase_ = uSa.E;
            vN2.archive_ = null;
        }
    }

    public static vN J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(vN a2) {
        a2.f();
    }

    public static Lo J(vN a2) {
        return (Lo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(String string) {
        String b2 = string;
        vN a2 = this;
        b2.getClass();
        vN vN2 = a2;
        vN2.archiveCase_ = vRa.d;
        vN2.archive_ = b2;
    }

    private void J() {
        vN a2;
        vN vN2 = a2;
        vN2.archiveCase_ = uSa.E;
        vN2.archive_ = null;
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
        vN c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new vN();
            }
            case 2: {
                return new Lo(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = ppa.P;
                objectArray[vRa.d] = fTa.p;
                d2 = objectArray;
                Object b2 = cRa.Z;
                return vN.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = vN.class;
                synchronized (vN.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<vN>(DEFAULT_INSTANCE);
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

    public boolean hasResource() {
        vN a2;
        if (a2.archiveCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static vN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        vN a2;
        ByteString b2 = byteString;
        vN vN2 = a2 = this;
        vN.checkByteStringIsUtf8(b2);
        vN2.archive_ = b2.toStringUtf8();
        vN2.archiveCase_ = vRa.d;
    }

    public static /* synthetic */ void J(vN vN2, ByteString byteString) {
        ByteString b2 = byteString;
        vN a2 = vN2;
        a2.J(b2);
    }
}

