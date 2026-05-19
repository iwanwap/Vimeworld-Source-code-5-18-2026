/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bsa
 *  Io
 *  cra
 *  eN
 *  p
 *  po
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
public final class eN_3
extends GeneratedMessageLite<eN, po>
implements v {
    public static final int ACTIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Io> actions_ = eN_3.emptyProtobufList();
    private static volatile Parser<eN> PARSER;
    private static final eN DEFAULT_INSTANCE;

    public p J(int n2) {
        int b2 = n2;
        eN_3 a2 = this;
        return (p)a2.actions_.get(b2);
    }

    private void J(Iterable<? extends Io> iterable) {
        eN_3 a2;
        Iterable<? extends Io> b2 = iterable;
        eN_3 eN_32 = a2 = this;
        eN_32.J();
        AbstractMessageLite.addAll(b2, eN_32.actions_);
    }

    public static eN J(ByteString a2) throws InvalidProtocolBufferException {
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static eN f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public List<Io> getActionsList() {
        eN_3 a2;
        return a2.actions_;
    }

    public static /* synthetic */ void J(eN a2) {
        super.f();
    }

    public static /* synthetic */ void J(eN eN2, Io io2) {
        eN b2 = io2;
        eN a2 = eN2;
        super.J((Io)b2);
    }

    private void J(int n2) {
        eN_3 a2;
        int b2 = n2;
        eN_3 eN_32 = a2 = this;
        eN_32.J();
        eN_32.actions_.remove(b2);
    }

    public static eN J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public List<? extends p> J() {
        eN_3 a2;
        return a2.actions_;
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, Io io2) {
        void b2;
        eN_3 c2 = io2;
        eN_3 a2 = this;
        c2.getClass();
        eN_3 eN_32 = a2;
        eN_32.J();
        eN_32.actions_.set((int)b2, (Io)c2);
    }

    public static eN J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(eN eN2, int n2, Io io2) {
        void b2;
        eN c2 = io2;
        eN a2 = eN2;
        super.J((int)b2, (Io)c2);
    }

    public static eN J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        eN_3 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new eN_3();
            }
            case 2: {
                return new po(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = cra.m;
                objectArray[vRa.d] = Io.class;
                d2 = objectArray;
                Object b2 = Bsa.D;
                return eN_3.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = eN_3.class;
                synchronized (eN_3.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<eN>(DEFAULT_INSTANCE);
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

    public static eN J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static eN f(InputStream a2) throws IOException {
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ eN f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(eN eN2, Iterable iterable) {
        Object b2 = iterable;
        eN a2 = eN2;
        super.J((Iterable<? extends Io>)b2);
    }

    public static eN J(InputStream a2) throws IOException {
        return (eN_3)eN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static po J() {
        return (po)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(Io io2) {
        eN_3 b2 = io2;
        eN_3 a2 = this;
        b2.getClass();
        eN_3 eN_32 = a2;
        eN_32.J();
        eN_32.actions_.add((Io)b2);
    }

    public static Parser<eN> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static eN J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        eN_3 eN_32 = new eN_3();
        DEFAULT_INSTANCE = eN_32;
        GeneratedMessageLite.registerDefaultInstance(eN_3.class, eN_32);
    }

    @Override
    public Io getActions(int n2) {
        int b2 = n2;
        eN_3 a2 = this;
        return (Io)a2.actions_.get(b2);
    }

    public static eN J() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        a.actions_ = eN_3.emptyProtobufList();
    }

    public static eN J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (eN_3)eN_3.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        eN_3 eN_32 = this;
        Internal.ProtobufList<Io> a2 = eN_32.actions_;
        if (!a2.isModifiable()) {
            eN_32.actions_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    private eN_3() {
        eN_3 a2;
    }

    public static eN J(CodedInputStream a2) throws IOException {
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(eN eN2, int n2) {
        int b2 = n2;
        eN a2 = eN2;
        super.J(b2);
    }

    @Override
    public int getActionsCount() {
        eN_3 a2;
        return a2.actions_.size();
    }

    public static eN J(byte[] a2) throws InvalidProtocolBufferException {
        return (eN_3)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static po J(eN a2) {
        return (po)DEFAULT_INSTANCE.createBuilder(a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(eN eN2, int n2, Io io2) {
        void b2;
        eN c2 = io2;
        eN a2 = eN2;
        super.f((int)b2, (Io)c2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Io io2) {
        void b2;
        eN_3 c2 = io2;
        eN_3 a2 = this;
        c2.getClass();
        eN_3 eN_32 = a2;
        eN_32.J();
        eN_32.actions_.add((int)b2, (Io)c2);
    }
}

