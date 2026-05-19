/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Db
 *  NM
 *  YSa
 *  fm
 *  lqa
 *  uQa
 *  vRa
 *  yn
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
public final class NM_3
extends GeneratedMessageLite<NM, yn>
implements Db {
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<NM> PARSER;
    private String id_ = Mqa.y;
    private fm edit_;
    private int bitField0_;
    public static final int EDIT_FIELD_NUMBER = 2;
    private static final NM DEFAULT_INSTANCE;

    public static yn J(NM a2) {
        return (yn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private NM_3() {
        NM_3 a2;
    }

    public static NM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(String string) {
        String b2 = string;
        NM_3 a2 = this;
        b2.getClass();
        a2.id_ = b2;
    }

    public boolean hasEdit() {
        NM_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Parser<NM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void f() {
        a.id_ = NM_3.J().getId();
    }

    public static NM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static NM J(byte[] a2) throws InvalidProtocolBufferException {
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(NM nM2, String string) {
        Object b2 = string;
        NM a2 = nM2;
        super.J((String)b2);
    }

    public static NM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NM f(InputStream a2) throws IOException {
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.edit_ = null;
        a.bitField0_ &= rQa.p;
    }

    private void f(fm fm2) {
        NM_3 b2 = fm2;
        NM_3 a2 = this;
        b2.getClass();
        a2.edit_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void f(NM nM2, fm fm2) {
        NM b2 = fm2;
        NM a2 = nM2;
        super.f((fm)b2);
    }

    public String getId() {
        NM_3 a2;
        return a2.id_;
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        NM_3 a2 = this;
        Object object = b2;
        NM_3.checkByteStringIsUtf8((ByteString)object);
        a2.id_ = ((ByteString)object).toStringUtf8();
    }

    private void J(fm fm2) {
        NM_3 nM_3;
        NM_3 b2 = fm2;
        NM_3 a2 = this;
        b2.getClass();
        if (a2.edit_ != null && a2.edit_ != fm.f()) {
            a2.edit_ = (fm)((xo)fm.J((fm)a2.edit_).mergeFrom(b2)).buildPartial();
            nM_3 = a2;
        } else {
            nM_3 = a2;
            a2.edit_ = b2;
        }
        nM_3.bitField0_ |= vRa.d;
    }

    public static yn J() {
        return (yn)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ NM f() {
        return DEFAULT_INSTANCE;
    }

    public fm getEdit() {
        NM_3 a2;
        if (a2.edit_ == null) {
            return fm.f();
        }
        return a2.edit_;
    }

    public static NM J(InputStream a2) throws IOException {
        return (NM_3)NM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static NM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static NM J() {
        return DEFAULT_INSTANCE;
    }

    public ByteString getIdBytes() {
        NM_3 a2;
        return ByteString.copyFromUtf8(a2.id_);
    }

    static {
        NM_3 nM_3 = new NM_3();
        DEFAULT_INSTANCE = nM_3;
        GeneratedMessageLite.registerDefaultInstance(NM_3.class, nM_3);
    }

    public static /* synthetic */ void J(NM nM2, fm fm2) {
        NM b2 = fm2;
        NM a2 = nM2;
        super.J((fm)b2);
    }

    public static /* synthetic */ void f(NM a2) {
        super.J();
    }

    public static /* synthetic */ void J(NM nM2, ByteString byteString) {
        Object b2 = byteString;
        NM a2 = nM2;
        super.J((ByteString)b2);
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
        NM_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new NM_3();
            }
            case 2: {
                return new yn(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = tTa.Ha;
                d2 = objectArray;
                Object b2 = YSa.ga;
                return NM_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = NM_3.class;
                synchronized (NM_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<NM>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(NM a2) {
        super.f();
    }

    public static NM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NM J(CodedInputStream a2) throws IOException {
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static NM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (NM_3)NM_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static NM J(ByteString a2) throws InvalidProtocolBufferException {
        return (NM_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

