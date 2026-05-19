/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DQa
 *  EN
 *  ERa
 *  Wo
 *  fsa
 *  gn
 *  kpa
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
public final class gn_3
extends GeneratedMessageLite<gn, EN>
implements Ld {
    public static final int ALIGNMENT_FIELD_NUMBER = 2;
    private boolean persistent_;
    private static volatile Parser<gn> PARSER;
    private static final gn DEFAULT_INSTANCE;
    private int id_;
    private int rotation_;
    private int alignment_;
    public static final int PERSISTENT_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    private int bitField0_;
    public static final int ROTATION_FIELD_NUMBER = 3;

    public static gn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        gn_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new gn_3();
            }
            case 2: {
                return new EN(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = uQa.Aa;
                objectArray[uqa.g] = DQa.u;
                objectArray[yRa.d] = csa.U;
                objectArray[AQa.P] = rQa.u;
                d2 = objectArray;
                Object b2 = fsa.e;
                return gn_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = gn_3.class;
                synchronized (gn_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<gn>(DEFAULT_INSTANCE);
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

    @Override
    public boolean getPersistent() {
        gn_3 a2;
        return a2.persistent_;
    }

    public static /* synthetic */ void l(gn gn2, int n2) {
        int b2 = n2;
        gn a2 = gn2;
        super.J(b2);
    }

    @Override
    public int getRotationValue() {
        gn_3 a2;
        return a2.rotation_;
    }

    private void l(int n2) {
        int b2 = n2;
        gn_3 a2 = this;
        a2.id_ = b2;
    }

    private void C() {
        a.id_ = uSa.E;
    }

    public static gn J(byte[] a2) throws InvalidProtocolBufferException {
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ gn f() {
        return DEFAULT_INSTANCE;
    }

    private void l() {
        a.bitField0_ &= kpa.w;
        a.persistent_ = uSa.E;
    }

    @Override
    public boolean hasAlignment() {
        gn_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(gn a2) {
        super.J();
    }

    @Override
    public int getId() {
        gn_3 a2;
        return a2.id_;
    }

    @Override
    public int getAlignmentValue() {
        gn_3 a2;
        return a2.alignment_;
    }

    public static /* synthetic */ void J(gn gn2, Wo wo2) {
        gn b2 = wo2;
        gn a2 = gn2;
        super.J((Wo)b2);
    }

    public static /* synthetic */ void J(gn gn2, boolean bl2) {
        boolean b2 = bl2;
        gn a2 = gn2;
        super.J(b2);
    }

    public static /* synthetic */ void J(gn gn2, yM yM2) {
        Object b2 = yM2;
        gn a2 = gn2;
        super.J((yM)b2);
    }

    public static gn J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void l(gn a2) {
        super.C();
    }

    public static /* synthetic */ void f(gn gn2, int n2) {
        int b2 = n2;
        gn a2 = gn2;
        super.f(b2);
    }

    public static gn J(ByteString a2) throws InvalidProtocolBufferException {
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public boolean hasPersistent() {
        gn_3 a2;
        if ((a2.bitField0_ & AQa.P) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasRotation() {
        gn_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static gn f(InputStream a2) throws IOException {
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.bitField0_ &= ERa.Ka;
        a.rotation_ = uSa.E;
    }

    private void f(int n2) {
        int b2 = n2;
        gn_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.alignment_ = b2;
    }

    public static EN J() {
        return (EN)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void f(gn a2) {
        super.f();
    }

    private void J(Wo wo2) {
        gn_3 b2 = wo2;
        gn_3 a2 = this;
        a2.rotation_ = b2.getNumber();
        a2.bitField0_ |= uqa.g;
    }

    public static Parser<gn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static gn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(gn gn2, int n2) {
        int b2 = n2;
        gn a2 = gn2;
        super.l(b2);
    }

    static {
        gn_3 gn_32 = new gn_3();
        DEFAULT_INSTANCE = gn_32;
        GeneratedMessageLite.registerDefaultInstance(gn_3.class, gn_32);
    }

    public static /* synthetic */ void J(gn a2) {
        super.l();
    }

    public static gn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static gn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private gn_3() {
        gn_3 a2;
    }

    private void J(boolean bl2) {
        boolean b2 = bl2;
        gn_3 a2 = this;
        a2.bitField0_ |= AQa.P;
        a2.persistent_ = b2;
    }

    private void J(int n2) {
        int b2 = n2;
        gn_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.rotation_ = b2;
    }

    public static gn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (gn_3)gn_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public yM getAlignment() {
        gn_3 gn_32 = this;
        yM a2 = yM.forNumber(gn_32.alignment_);
        if (a2 == null) {
            return yM.UNRECOGNIZED;
        }
        return a2;
    }

    private void J(yM yM2) {
        yM b2 = yM2;
        gn_3 a2 = this;
        a2.alignment_ = b2.getNumber();
        a2.bitField0_ |= vRa.d;
    }

    public static gn J(InputStream a2) throws IOException {
        return (gn_3)gn_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.alignment_ = uSa.E;
    }

    public static gn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static EN J(gn a2) {
        return (EN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static gn J(CodedInputStream a2) throws IOException {
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static gn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (gn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public Wo getRotation() {
        gn_3 gn_32 = this;
        gn_3 a2 = Wo.forNumber((int)gn_32.rotation_);
        if (a2 == null) {
            return Wo.UNRECOGNIZED;
        }
        return a2;
    }
}

