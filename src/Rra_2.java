/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Lpa
 *  NTa
 *  Rra
 *  aPa
 *  eqa
 *  lqa
 *  nQa
 *  rPa
 *  vOa
 *  vRa
 *  yA
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
public final class Rra_2
extends GeneratedMessageLite<Rra, vOa>
implements yA {
    private int roomState_;
    private static final Rra DEFAULT_INSTANCE;
    public static final int DATA_FIELD_NUMBER = 2;
    private eqa data_;
    public static final int ROOM_STATE_FIELD_NUMBER = 1;
    private static volatile Parser<Rra> PARSER;
    private int bitField0_;

    private Rra_2() {
        Rra_2 a2;
    }

    public static /* synthetic */ void f(Rra rra2, eqa eqa2) {
        Rra b2 = eqa2;
        Rra a2 = rra2;
        super.J((eqa)b2);
    }

    public static /* synthetic */ void J(Rra rra2, eqa eqa2) {
        Rra b2 = eqa2;
        Rra a2 = rra2;
        super.f((eqa)b2);
    }

    private void f() {
        a.data_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static Rra J(byte[] a2) throws InvalidProtocolBufferException {
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rra f() {
        return DEFAULT_INSTANCE;
    }

    static {
        Rra_2 rra_2 = new Rra_2();
        DEFAULT_INSTANCE = rra_2;
        GeneratedMessageLite.registerDefaultInstance(Rra_2.class, rra_2);
    }

    public static vOa J() {
        return (vOa)DEFAULT_INSTANCE.createBuilder();
    }

    private void f(eqa eqa2) {
        Rra_2 rra_2;
        Rra_2 b2 = eqa2;
        Rra_2 a2 = this;
        b2.getClass();
        if (a2.data_ != null && a2.data_ != eqa.f()) {
            a2.data_ = (eqa)((rPa)eqa.J((eqa)a2.data_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            rra_2 = a2;
        } else {
            rra_2 = a2;
            a2.data_ = b2;
        }
        rra_2.bitField0_ |= vRa.d;
    }

    public static Rra J(ByteString a2) throws InvalidProtocolBufferException {
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rra J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Rra J(CodedInputStream a2) throws IOException {
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rra J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(eqa eqa2) {
        Rra_2 b2 = eqa2;
        Rra_2 a2 = this;
        b2.getClass();
        a2.data_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public eqa getData() {
        Rra_2 a2;
        if (a2.data_ == null) {
            return eqa.f();
        }
        return a2.data_;
    }

    private void J(int n2) {
        int b2 = n2;
        Rra_2 a2 = this;
        a2.roomState_ = b2;
    }

    public static Rra f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rra_2)Rra_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
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
        Rra_2 c2 = this;
        switch (Lpa.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Rra_2();
            }
            case 2: {
                return new vOa(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = NTa.Fa;
                objectArray[uqa.g] = nQa.t;
                d2 = objectArray;
                Object b2 = aPa.ca;
                return Rra_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Rra_2.class;
                synchronized (Rra_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Rra>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ Rra J() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Rra> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Rra J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Rra f(InputStream a2) throws IOException {
        return (Rra_2)Rra_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Rra J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Rra J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getRoomState() {
        Rra_2 a2;
        return a2.roomState_;
    }

    private void J() {
        a.roomState_ = uSa.E;
    }

    public static Rra J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Rra a2) {
        super.f();
    }

    public static /* synthetic */ void J(Rra a2) {
        super.J();
    }

    public boolean hasData() {
        Rra_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Rra J(InputStream a2) throws IOException {
        return (Rra_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vOa J(Rra a2) {
        return (vOa)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void J(Rra rra2, int n2) {
        int b2 = n2;
        Rra a2 = rra2;
        super.J(b2);
    }
}

