/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Ea
 *  Pn
 *  aSa
 *  dn
 *  jsa
 *  lqa
 *  pua
 *  vRa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Pn_3
extends GeneratedMessageLite<Pn, DN>
implements Ea {
    private static final Pn DEFAULT_INSTANCE;
    private int index_;
    private int kind_;
    public static final int COLOR_FIELD_NUMBER = 4;
    public static final int INDEX_FIELD_NUMBER = 2;
    private int color_;
    public static final int POS_FIELD_NUMBER = 3;
    public static final int KIND_FIELD_NUMBER = 1;
    private Internal.FloatList pos_;
    private int posMemoizedSerializedSize = pua.o;
    private static volatile Parser<Pn> PARSER;
    private int bitField0_;

    public int getIndex() {
        Pn_3 a2;
        return a2.index_;
    }

    private void l(int n2) {
        int b2 = n2;
        Pn_3 a2 = this;
        a2.kind_ = b2;
    }

    public dn getKind() {
        Pn_3 pn_3 = this;
        Pn_3 a2 = dn.forNumber((int)pn_3.kind_);
        if (a2 == null) {
            return dn.UNRECOGNIZED;
        }
        return a2;
    }

    public static Pn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Pn pn2, dn dn2) {
        Pn b2 = dn2;
        Pn a2 = pn2;
        super.J((dn)b2);
    }

    public static Pn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Pn f(InputStream a2) throws IOException {
        return (Pn_3)Pn_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        Pn_3 pn_3 = new Pn_3();
        DEFAULT_INSTANCE = pn_3;
        GeneratedMessageLite.registerDefaultInstance(Pn_3.class, pn_3);
    }

    public boolean hasColor() {
        Pn_3 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Pn f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ Pn J() {
        return DEFAULT_INSTANCE;
    }

    public static DN J() {
        return (DN)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void l(Pn pn2, int n2) {
        int b2 = n2;
        Pn a2 = pn2;
        super.J(b2);
    }

    private void d() {
        a.kind_ = uSa.E;
    }

    public List<Float> getPosList() {
        Pn_3 a2;
        return a2.pos_;
    }

    private void C() {
        a.pos_ = Pn_3.emptyFloatList();
    }

    public static Parser<Pn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(Pn pn2, float f2) {
        float b2 = f2;
        Pn a2 = pn2;
        super.J(b2);
    }

    public static Pn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Pn pn2, int n2, float f2) {
        void b2;
        float c2 = f2;
        Pn a2 = pn2;
        super.J((int)b2, c2);
    }

    public boolean hasIndex() {
        Pn_3 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ void C(Pn a2) {
        super.C();
    }

    public static Pn J(InputStream a2) throws IOException {
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(Pn a2) {
        super.l();
    }

    public static Pn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public int getPosCount() {
        Pn_3 a2;
        return a2.pos_.size();
    }

    public float getPos(int n2) {
        int b2 = n2;
        Pn_3 a2 = this;
        return a2.pos_.getFloat(b2);
    }

    public static Pn J(ByteString a2) throws InvalidProtocolBufferException {
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, float f2) {
        void b2;
        Pn_3 a2;
        float c2 = f2;
        Pn_3 pn_3 = a2 = this;
        pn_3.f();
        pn_3.pos_.setFloat((int)b2, c2);
    }

    public static Pn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(int n2) {
        int b2 = n2;
        Pn_3 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.color_ = b2;
    }

    public static /* synthetic */ void f(Pn a2) {
        super.J();
    }

    private void l() {
        a.bitField0_ &= ERa.Ka;
        a.color_ = uSa.E;
    }

    private void J(Iterable<? extends Float> iterable) {
        Pn_3 a2;
        Iterable<? extends Float> b2 = iterable;
        Pn_3 pn_3 = a2 = this;
        pn_3.f();
        AbstractMessageLite.addAll(b2, pn_3.pos_);
    }

    public static Pn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Pn_3)Pn_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static DN J(Pn a2) {
        return (DN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public int getKindValue() {
        Pn_3 a2;
        return a2.kind_;
    }

    private void J(dn dn2) {
        Pn_3 b2 = dn2;
        Pn_3 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    private void f() {
        Pn_3 pn_3 = this;
        Internal.FloatList a2 = pn_3.pos_;
        if (!a2.isModifiable()) {
            pn_3.pos_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static /* synthetic */ void f(Pn pn2, int n2) {
        int b2 = n2;
        Pn a2 = pn2;
        super.f(b2);
    }

    public static /* synthetic */ void J(Pn pn2, Iterable iterable) {
        Object b2 = iterable;
        Pn a2 = pn2;
        super.J((Iterable<? extends Float>)b2);
    }

    public static Pn J(CodedInputStream a2) throws IOException {
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Pn J(byte[] a2) throws InvalidProtocolBufferException {
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Pn a2) {
        super.d();
    }

    private void J(float f2) {
        Pn_3 a2;
        float b2 = f2;
        Pn_3 pn_3 = a2 = this;
        pn_3.f();
        pn_3.pos_.addFloat(b2);
    }

    private void J() {
        a.bitField0_ &= rQa.p;
        a.index_ = uSa.E;
    }

    public static /* synthetic */ void J(Pn pn2, int n2) {
        int b2 = n2;
        Pn a2 = pn2;
        super.l(b2);
    }

    private Pn_3() {
        Pn_3 a2;
        a2.pos_ = Pn_3.emptyFloatList();
    }

    private void J(int n2) {
        int b2 = n2;
        Pn_3 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.index_ = b2;
    }

    public static Pn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Pn_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public int getColor() {
        Pn_3 a2;
        return a2.color_;
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
        Pn_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Pn_3();
            }
            case 2: {
                return new DN(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aSa.u;
                objectArray[uqa.g] = lTa.a;
                objectArray[yRa.d] = Pua.Ja;
                objectArray[AQa.P] = lQa.Ka;
                d2 = objectArray;
                Object b2 = jsa.H;
                return Pn_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Pn_3.class;
                synchronized (Pn_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Pn>(DEFAULT_INSTANCE);
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
}

