/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Io
 *  Lm
 *  MO
 *  OM
 *  aSa
 *  hqa
 *  lqa
 *  p
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
public final class Io_3
extends GeneratedMessageLite<Io, OM>
implements p {
    private int rowId_;
    private int bitField0_;
    private int kind_;
    private An row_;
    public static final int KIND_FIELD_NUMBER = 1;
    private static final Io DEFAULT_INSTANCE;
    private static volatile Parser<Io> PARSER;
    public static final int ROWID_FIELD_NUMBER = 2;
    public static final int ROW_FIELD_NUMBER = 3;

    private void f(int n2) {
        int b2 = n2;
        Io_3 a2 = this;
        a2.kind_ = b2;
    }

    public static Io J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Io J(ByteString a2) throws InvalidProtocolBufferException {
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        Io_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.rowId_ = b2;
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
        Io_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Io_3();
            }
            case 2: {
                return new OM(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aSa.u;
                objectArray[uqa.g] = EPa.F;
                objectArray[yRa.d] = opa.m;
                d2 = objectArray;
                Object b2 = hqa.ga;
                return Io_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Io_3.class;
                synchronized (Io_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Io>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void l(Io a2) {
        super.J();
    }

    public boolean hasRow() {
        Io_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Io f(InputStream a2) throws IOException {
        return (Io_3)Io_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ Io f() {
        return DEFAULT_INSTANCE;
    }

    public static Io J(byte[] a2) throws InvalidProtocolBufferException {
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(An an2) {
        GeneratedMessageLite b2 = an2;
        Io_3 a2 = this;
        b2.getClass();
        a2.row_ = b2;
        a2.bitField0_ |= uqa.g;
    }

    public static /* synthetic */ void f(Io io2, An an2) {
        Object b2 = an2;
        Io a2 = io2;
        super.J((An)b2);
    }

    public boolean hasRowId() {
        Io_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static OM J(Io a2) {
        return (OM)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static Parser<Io> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void f(Io a2) {
        super.f();
    }

    public static /* synthetic */ void f(Io io2, int n2) {
        int b2 = n2;
        Io a2 = io2;
        super.J(b2);
    }

    public int getKindValue() {
        Io_3 a2;
        return a2.kind_;
    }

    public static OM J() {
        return (OM)DEFAULT_INSTANCE.createBuilder();
    }

    public An getRow() {
        Io_3 a2;
        if (a2.row_ == null) {
            return An.J();
        }
        return a2.row_;
    }

    public MO getKind() {
        Io_3 io_3 = this;
        Io_3 a2 = MO.forNumber((int)io_3.kind_);
        if (a2 == null) {
            return MO.UNRECOGNIZED;
        }
        return a2;
    }

    public static Io J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Io J() {
        return DEFAULT_INSTANCE;
    }

    private void l() {
        a.bitField0_ &= rQa.p;
        a.rowId_ = uSa.E;
    }

    private void f() {
        a.row_ = null;
        a.bitField0_ &= ERa.Ka;
    }

    private void J() {
        a.kind_ = uSa.E;
    }

    public static /* synthetic */ void J(Io a2) {
        super.l();
    }

    private void J(MO mO2) {
        Io_3 b2 = mO2;
        Io_3 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    static {
        Io_3 io_3 = new Io_3();
        DEFAULT_INSTANCE = io_3;
        GeneratedMessageLite.registerDefaultInstance(Io_3.class, io_3);
    }

    public static /* synthetic */ void J(Io io2, An an2) {
        Object b2 = an2;
        Io a2 = io2;
        super.f((An)b2);
    }

    private void J(An an2) {
        Io_3 io_3;
        GeneratedMessageLite b2 = an2;
        Io_3 a2 = this;
        b2.getClass();
        if (a2.row_ != null && a2.row_ != An.J()) {
            a2.row_ = (An)((Lm)An.J(a2.row_).mergeFrom(b2)).buildPartial();
            io_3 = a2;
        } else {
            io_3 = a2;
            a2.row_ = b2;
        }
        io_3.bitField0_ |= uqa.g;
    }

    public static Io f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private Io_3() {
        Io_3 a2;
    }

    public static /* synthetic */ void J(Io io2, int n2) {
        int b2 = n2;
        Io a2 = io2;
        super.f(b2);
    }

    public static Io J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Io J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getRowId() {
        Io_3 a2;
        return a2.rowId_;
    }

    public static Io J(InputStream a2) throws IOException {
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Io io2, MO mO2) {
        Io b2 = mO2;
        Io a2 = io2;
        super.J((MO)b2);
    }

    public static Io J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Io_3)Io_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Io J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Io J(CodedInputStream a2) throws IOException {
        return (Io_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

