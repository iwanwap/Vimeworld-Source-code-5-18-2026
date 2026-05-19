/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DQa
 *  ERa
 *  Kj
 *  LQa
 *  WQa
 *  XL
 *  isa
 *  lqa
 *  uQa
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
public final class Kj_3
extends GeneratedMessageLite<Kj, XL>
implements Y {
    private static final Kj DEFAULT_INSTANCE;
    private int id_;
    private static volatile Parser<Kj> PARSER;
    private int y_;
    private int meta_;
    private int bitField0_;
    public static final int Z_FIELD_NUMBER = 3;
    private int z_;
    public static final int META_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 4;
    private int x_;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;

    public static Kj J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Kj J(ByteString a2) throws InvalidProtocolBufferException {
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getY() {
        Kj_3 a2;
        return a2.y_;
    }

    private void d(int n2) {
        int b2 = n2;
        Kj_3 a2 = this;
        a2.y_ = b2;
    }

    public static /* synthetic */ void d(Kj a2) {
        super.f();
    }

    private void C(int n2) {
        int b2 = n2;
        Kj_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.meta_ = b2;
    }

    public static Kj J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void d(Kj kj2, int n2) {
        int b2 = n2;
        Kj a2 = kj2;
        super.C(b2);
    }

    @Override
    public int getMeta() {
        Kj_3 a2;
        return a2.meta_;
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
        Kj_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Kj_3();
            }
            case 2: {
                return new XL(null);
            }
            case 3: {
                Object[] objectArray = new Object[uua.p];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = LQa.k;
                objectArray[uqa.g] = isa.I;
                objectArray[yRa.d] = DQa.Z;
                objectArray[AQa.P] = uQa.Aa;
                objectArray[tTa.h] = WQa.Ga;
                d2 = objectArray;
                Object b2 = Bua.P;
                return Kj_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Kj_3.class;
                synchronized (Kj_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Kj>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void C(Kj a2) {
        super.J();
    }

    private void d() {
        a.bitField0_ &= rQa.p;
        a.id_ = uSa.E;
    }

    public static Kj J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C() {
        a.x_ = uSa.E;
    }

    @Override
    public boolean hasMeta() {
        Kj_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void l(Kj a2) {
        super.C();
    }

    @Override
    public int getX() {
        Kj_3 a2;
        return a2.x_;
    }

    public static XL J(Kj a2) {
        return (XL)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public int getZ() {
        Kj_3 a2;
        return a2.z_;
    }

    public static Kj f(InputStream a2) throws IOException {
        return (Kj_3)Kj_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Kj a2) {
        super.d();
    }

    public static Kj J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l(int n2) {
        int b2 = n2;
        Kj_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.id_ = b2;
    }

    public static Kj f() {
        return DEFAULT_INSTANCE;
    }

    static {
        Kj_3 kj_3 = new Kj_3();
        DEFAULT_INSTANCE = kj_3;
        GeneratedMessageLite.registerDefaultInstance(Kj_3.class, kj_3);
    }

    public static /* synthetic */ Kj J() {
        return DEFAULT_INSTANCE;
    }

    @Override
    public boolean hasId() {
        Kj_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(Kj kj2, int n2) {
        int b2 = n2;
        Kj a2 = kj2;
        super.l(b2);
    }

    public static /* synthetic */ void l(Kj kj2, int n2) {
        int b2 = n2;
        Kj a2 = kj2;
        super.d(b2);
    }

    public static Kj J(byte[] a2) throws InvalidProtocolBufferException {
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Kj a2) {
        super.l();
    }

    public static Kj J(CodedInputStream a2) throws IOException {
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getId() {
        Kj_3 a2;
        return a2.id_;
    }

    public static XL J() {
        return (XL)DEFAULT_INSTANCE.createBuilder();
    }

    public static Kj f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Kj_3)Kj_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Kj J(InputStream a2) throws IOException {
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Kj kj2, int n2) {
        int b2 = n2;
        Kj a2 = kj2;
        super.f(b2);
    }

    private void l() {
        a.z_ = uSa.E;
    }

    private void f(int n2) {
        int b2 = n2;
        Kj_3 a2 = this;
        a2.z_ = b2;
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.meta_ = uSa.E;
    }

    private void J() {
        a.y_ = uSa.E;
    }

    public static Kj J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        int b2 = n2;
        Kj_3 a2 = this;
        a2.x_ = b2;
    }

    public static Kj J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Kj_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private Kj_3() {
        Kj_3 a2;
    }

    public static /* synthetic */ void J(Kj kj2, int n2) {
        int b2 = n2;
        Kj a2 = kj2;
        super.J(b2);
    }

    public static Parser<Kj> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

