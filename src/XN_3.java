/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  XN
 *  Zn
 *  fO
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
public final class XN_3
extends GeneratedMessageLite<XN, Eo>
implements gd {
    private fO edit_;
    private static final XN DEFAULT_INSTANCE;
    private static volatile Parser<XN> PARSER;
    public static final int EDIT_FIELD_NUMBER = 1;
    private int bitField0_;

    private void f(fO fO2) {
        XN_3 xN_3;
        XN_3 b2 = fO2;
        XN_3 a2 = this;
        b2.getClass();
        if (a2.edit_ != null && a2.edit_ != fO.f()) {
            a2.edit_ = (fO)((Zn)fO.J((fO)a2.edit_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            xN_3 = a2;
        } else {
            xN_3 = a2;
            a2.edit_ = b2;
        }
        xN_3.bitField0_ |= vRa.d;
    }

    @Override
    public boolean hasEdit() {
        XN_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void J(XN a2) {
        super.J();
    }

    public static XN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (XN_3)XN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
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
        XN_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new XN_3();
            }
            case 2: {
                return new Eo(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = tTa.Ha;
                d2 = objectArray;
                Object b2 = bsa.h;
                return XN_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = XN_3.class;
                synchronized (XN_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<XN>(DEFAULT_INSTANCE);
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

    public static XN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public fO getEdit() {
        XN_3 a2;
        if (a2.edit_ == null) {
            return fO.f();
        }
        return a2.edit_;
    }

    public static XN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static XN f() {
        return DEFAULT_INSTANCE;
    }

    public static XN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static XN f(InputStream a2) throws IOException {
        return (XN_3)XN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static XN J(CodedInputStream a2) throws IOException {
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(XN xN2, fO fO2) {
        XN b2 = fO2;
        XN a2 = xN2;
        super.J((fO)b2);
    }

    public static /* synthetic */ XN J() {
        return DEFAULT_INSTANCE;
    }

    private void J(fO fO2) {
        XN_3 b2 = fO2;
        XN_3 a2 = this;
        b2.getClass();
        a2.edit_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    private void J() {
        a.edit_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static Parser<XN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Eo J(XN a2) {
        return (Eo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    static {
        XN_3 xN_3 = new XN_3();
        DEFAULT_INSTANCE = xN_3;
        GeneratedMessageLite.registerDefaultInstance(XN_3.class, xN_3);
    }

    public static XN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(XN xN2, fO fO2) {
        XN b2 = fO2;
        XN a2 = xN2;
        super.f((fO)b2);
    }

    public static XN J(ByteString a2) throws InvalidProtocolBufferException {
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private XN_3() {
        XN_3 a2;
    }

    public static XN J(byte[] a2) throws InvalidProtocolBufferException {
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static XN J(InputStream a2) throws IOException {
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static XN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Eo J() {
        return (Eo)DEFAULT_INSTANCE.createBuilder();
    }

    public static XN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (XN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

