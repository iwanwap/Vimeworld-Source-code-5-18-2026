/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bsa
 *  Uo
 *  dN
 *  dO
 *  nQa
 *  uc
 *  vRa
 *  ya
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
public final class dO_1
extends GeneratedMessageLite<dO, Uo>
implements uc {
    private static final dO DEFAULT_INSTANCE;
    private Internal.ProtobufList<dN> elements_ = dO_1.emptyProtobufList();
    public static final int ELEMENTS_FIELD_NUMBER = 1;
    private static volatile Parser<dO> PARSER;

    private void f() {
        a.elements_ = dO_1.emptyProtobufList();
    }

    public static dO f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(dO dO2, int n2, dN dN2) {
        void b2;
        dO c2 = dN2;
        dO a2 = dO2;
        super.f((int)b2, (dN)c2);
    }

    public static /* synthetic */ void J(dO a2) {
        super.f();
    }

    private dO_1() {
        dO_1 a2;
    }

    public static dO f(InputStream a2) throws IOException {
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        dO_1 dO_12 = new dO_1();
        DEFAULT_INSTANCE = dO_12;
        GeneratedMessageLite.registerDefaultInstance(dO_1.class, dO_12);
    }

    public static dO J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (dO_1)dO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public dN getElements(int n2) {
        int b2 = n2;
        dO_1 a2 = this;
        return (dN)a2.elements_.get(b2);
    }

    public static dO f() {
        return DEFAULT_INSTANCE;
    }

    public static dO J(ByteString a2) throws InvalidProtocolBufferException {
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static dO J(CodedInputStream a2) throws IOException {
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static dO J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(dO dO2, Iterable iterable) {
        Object b2 = iterable;
        dO a2 = dO2;
        super.J((Iterable<? extends dN>)b2);
    }

    public int getElementsCount() {
        dO_1 a2;
        return a2.elements_.size();
    }

    public ya J(int n2) {
        int b2 = n2;
        dO_1 a2 = this;
        return (ya)a2.elements_.get(b2);
    }

    private void J(dN dN2) {
        dO_1 b2 = dN2;
        dO_1 a2 = this;
        b2.getClass();
        dO_1 dO_12 = a2;
        dO_12.J();
        dO_12.elements_.add((dN)b2);
    }

    public static /* synthetic */ dO J() {
        return DEFAULT_INSTANCE;
    }

    public static dO J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        dO_1 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new dO_1();
            }
            case 2: {
                return new Uo(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = nQa.i;
                objectArray[vRa.d] = dN.class;
                d2 = objectArray;
                Object b2 = Bsa.D;
                return dO_1.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = dO_1.class;
                synchronized (dO_1.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<dO>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void J(dO dO2, dN dN2) {
        dO b2 = dN2;
        dO a2 = dO2;
        super.J((dN)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(dO dO2, int n2, dN dN2) {
        void b2;
        dO c2 = dN2;
        dO a2 = dO2;
        super.J((int)b2, (dN)c2);
    }

    public static dO J(byte[] a2) throws InvalidProtocolBufferException {
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        dO_1 dO_12 = this;
        Internal.ProtobufList<dN> a2 = dO_12.elements_;
        if (!a2.isModifiable()) {
            dO_12.elements_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    public static Parser<dO> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Uo J(dO a2) {
        return (Uo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, dN dN2) {
        void b2;
        dO_1 c2 = dN2;
        dO_1 a2 = this;
        c2.getClass();
        dO_1 dO_12 = a2;
        dO_12.J();
        dO_12.elements_.add((int)b2, (dN)c2);
    }

    public static Uo J() {
        return (Uo)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(Iterable<? extends dN> iterable) {
        dO_1 a2;
        Iterable<? extends dN> b2 = iterable;
        dO_1 dO_12 = a2 = this;
        dO_12.J();
        AbstractMessageLite.addAll(b2, dO_12.elements_);
    }

    private void J(int n2) {
        dO_1 a2;
        int b2 = n2;
        dO_1 dO_12 = a2 = this;
        dO_12.J();
        dO_12.elements_.remove(b2);
    }

    public List<dN> getElementsList() {
        dO_1 a2;
        return a2.elements_;
    }

    public static /* synthetic */ void J(dO dO2, int n2) {
        int b2 = n2;
        dO a2 = dO2;
        super.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, dN dN2) {
        void b2;
        dO_1 c2 = dN2;
        dO_1 a2 = this;
        c2.getClass();
        dO_1 dO_12 = a2;
        dO_12.J();
        dO_12.elements_.set((int)b2, (dN)c2);
    }

    public static dO J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static dO J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public List<? extends ya> J() {
        dO_1 a2;
        return a2.elements_;
    }

    public static dO J(InputStream a2) throws IOException {
        return (dO_1)dO_1.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static dO J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (dO_1)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }
}

