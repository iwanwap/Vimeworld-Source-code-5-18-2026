/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ea
 *  FN
 *  FTa
 *  JPa
 *  NOa
 *  Pn
 *  ca
 *  cra
 *  mN
 *  vRa
 */
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xn
extends GeneratedMessageLite<Xn, mN>
implements ca {
    private int widthvalCase_ = uSa.E;
    public static final int WIDTHANIM_FIELD_NUMBER = 3;
    private Object widthval_;
    private static volatile Parser<Xn> PARSER;
    private static final Xn DEFAULT_INSTANCE;
    private Internal.ProtobufList<Pn> actions_ = Xn.emptyProtobufList();
    public static final int ACTIONS_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;

    private void J(Iterable<? extends Pn> iterable) {
        Xn a2;
        Iterable<? extends Pn> b2 = iterable;
        Xn xn = a2 = this;
        xn.C();
        AbstractMessageLite.addAll(b2, xn.actions_);
    }

    public static /* synthetic */ void C(Xn a2) {
        a2.l();
    }

    private void d() {
        Xn a2;
        Xn xn = a2;
        xn.widthvalCase_ = uSa.E;
        xn.widthval_ = null;
    }

    public static /* synthetic */ void l(Xn a2) {
        a2.d();
    }

    public static Xn J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C() {
        Xn xn = this;
        Internal.ProtobufList<Pn> a2 = xn.actions_;
        if (!a2.isModifiable()) {
            xn.actions_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static Xn f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Xn xn, Pn pn) {
        Xn b2 = pn;
        Xn a2 = xn;
        a2.J((Pn)b2);
    }

    private void l() {
        a.actions_ = Xn.emptyProtobufList();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(Xn xn, int n2, Pn pn) {
        void b2;
        Xn c2 = pn;
        Xn a2 = xn;
        a2.f((int)b2, (Pn)c2);
    }

    private Xn() {
        Xn a2;
    }

    public static /* synthetic */ void J(Xn xn, int n2) {
        int b2 = n2;
        Xn a2 = xn;
        a2.J(b2);
    }

    static {
        Xn xn;
        DEFAULT_INSTANCE = xn = new Xn();
        GeneratedMessageLite.registerDefaultInstance(Xn.class, xn);
    }

    public static /* synthetic */ void J(Xn xn, Iterable iterable) {
        Iterable b2 = iterable;
        Xn a2 = xn;
        a2.J(b2);
    }

    public static /* synthetic */ void f(Xn xn, float f2) {
        float b2 = f2;
        Xn a2 = xn;
        a2.f(b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Xn xn, int n2, Pn pn) {
        void b2;
        Xn c2 = pn;
        Xn a2 = xn;
        a2.J((int)b2, (Pn)c2);
    }

    private void f(float f2) {
        Xn a2;
        float b2 = f2;
        Xn xn = a2 = this;
        xn.widthvalCase_ = yRa.d;
        xn.widthval_ = Float.valueOf(b2);
    }

    public float getWidthAnim() {
        Xn a2;
        if (a2.widthvalCase_ == yRa.d) {
            return ((Float)a2.widthval_).floatValue();
        }
        return JPa.N;
    }

    public static Xn J(InputStream a2) throws IOException {
        return Xn.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public FN getWidthvalCase() {
        Xn a2;
        return FN.forNumber((int)a2.widthvalCase_);
    }

    public float getWidth() {
        Xn a2;
        if (a2.widthvalCase_ == uqa.g) {
            return ((Float)a2.widthval_).floatValue();
        }
        return JPa.N;
    }

    public static /* synthetic */ void f(Xn a2) {
        a2.J();
    }

    public static Xn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public List<Pn> getActionsList() {
        Xn a2;
        return a2.actions_;
    }

    public static Parser<Xn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasWidthAnim() {
        Xn a2;
        if (a2.widthvalCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Xn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xn J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        Xn a2;
        if (a2.widthvalCase_ == uqa.g) {
            Xn xn = a2;
            xn.widthvalCase_ = uSa.E;
            xn.widthval_ = null;
        }
    }

    public static Xn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mN J() {
        return (mN)DEFAULT_INSTANCE.createBuilder();
    }

    public static Xn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, Pn pn) {
        void b2;
        Xn c2 = pn;
        Xn a2 = this;
        c2.getClass();
        Xn xn = a2;
        xn.C();
        xn.actions_.set((int)b2, (Pn)c2);
    }

    public boolean hasWidth() {
        Xn a2;
        if (a2.widthvalCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<? extends Ea> J() {
        Xn a2;
        return a2.actions_;
    }

    public int getActionsCount() {
        Xn a2;
        return a2.actions_.size();
    }

    public static /* synthetic */ void J(Xn xn, float f2) {
        float b2 = f2;
        Xn a2 = xn;
        a2.J(b2);
    }

    private void J() {
        Xn a2;
        if (a2.widthvalCase_ == yRa.d) {
            Xn xn = a2;
            xn.widthvalCase_ = uSa.E;
            xn.widthval_ = null;
        }
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
        Xn c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Xn();
            }
            case 2: {
                return new mN(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = Iqa.B;
                objectArray[vRa.d] = NOa.a;
                objectArray[uqa.g] = cra.m;
                objectArray[yRa.d] = Pn.class;
                d2 = objectArray;
                Object b2 = FTa.s;
                return Xn.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Xn.class;
                synchronized (Xn.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Xn>(DEFAULT_INSTANCE);
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

    private void J(int n2) {
        Xn a2;
        int b2 = n2;
        Xn xn = a2 = this;
        xn.C();
        xn.actions_.remove(b2);
    }

    public static Xn f() {
        return DEFAULT_INSTANCE;
    }

    public Ea J(int n2) {
        int b2 = n2;
        Xn a2 = this;
        return (Ea)a2.actions_.get(b2);
    }

    public static Xn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return Xn.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(Xn a2) {
        a2.f();
    }

    public Pn getActions(int n2) {
        int b2 = n2;
        Xn a2 = this;
        return (Pn)a2.actions_.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Pn pn) {
        void b2;
        Xn c2 = pn;
        Xn a2 = this;
        c2.getClass();
        Xn xn = a2;
        xn.C();
        xn.actions_.add((int)b2, (Pn)c2);
    }

    public static Xn J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Xn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(Pn pn) {
        Xn b2 = pn;
        Xn a2 = this;
        b2.getClass();
        Xn xn = a2;
        xn.C();
        xn.actions_.add((Pn)b2);
    }

    public static mN J(Xn a2) {
        return (mN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    private void J(float f2) {
        Xn a2;
        float b2 = f2;
        Xn xn = a2 = this;
        xn.widthvalCase_ = uqa.g;
        xn.widthval_ = Float.valueOf(b2);
    }

    public static /* synthetic */ Xn J() {
        return DEFAULT_INSTANCE;
    }

    public static Xn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

