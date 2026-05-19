/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bsa
 *  Qo
 *  Ya
 *  fn
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
public final class sm
extends GeneratedMessageLite<sm, fn>
implements Ra {
    private static final sm DEFAULT_INSTANCE;
    public static final int RESOURCES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Qo> resources_ = sm.emptyProtobufList();
    private static volatile Parser<sm> PARSER;

    public static sm f(InputStream a2) throws IOException {
        return sm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public List<Qo> getResourcesList() {
        sm a2;
        return a2.resources_;
    }

    public static fn J(sm a2) {
        return (fn)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static sm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static sm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ sm f() {
        return DEFAULT_INSTANCE;
    }

    private sm() {
        sm a2;
    }

    public static /* synthetic */ void J(sm sm2, Qo qo2) {
        sm b2 = qo2;
        sm a2 = sm2;
        a2.J((Qo)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(sm sm2, int n2, Qo qo2) {
        void b2;
        sm c2 = qo2;
        sm a2 = sm2;
        a2.J((int)b2, (Qo)c2);
    }

    public List<? extends Ya> J() {
        sm a2;
        return a2.resources_;
    }

    public static sm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public Qo getResources(int n2) {
        int b2 = n2;
        sm a2 = this;
        return (Qo)a2.resources_.get(b2);
    }

    public static sm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return sm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f() {
        a.resources_ = sm.emptyProtobufList();
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
        sm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new sm();
            }
            case 2: {
                return new fn(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = WOa.E;
                objectArray[vRa.d] = Qo.class;
                d2 = objectArray;
                Object b2 = Bsa.D;
                return sm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = sm.class;
                synchronized (sm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<sm>(DEFAULT_INSTANCE);
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

    public static sm J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(sm a2) {
        a2.f();
    }

    public static /* synthetic */ void J(sm sm2, Iterable iterable) {
        Iterable b2 = iterable;
        sm a2 = sm2;
        a2.J(b2);
    }

    @Override
    public int getResourcesCount() {
        sm a2;
        return a2.resources_.size();
    }

    public static sm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        sm sm2;
        DEFAULT_INSTANCE = sm2 = new sm();
        GeneratedMessageLite.registerDefaultInstance(sm.class, sm2);
    }

    public static sm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(sm sm2, int n2, Qo qo2) {
        void b2;
        sm c2 = qo2;
        sm a2 = sm2;
        a2.f((int)b2, (Qo)c2);
    }

    private void J() {
        sm sm2 = this;
        Internal.ProtobufList<Qo> a2 = sm2.resources_;
        if (!a2.isModifiable()) {
            sm2.resources_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(int n2, Qo qo2) {
        void b2;
        sm c2 = qo2;
        sm a2 = this;
        c2.getClass();
        sm sm2 = a2;
        sm2.J();
        sm2.resources_.add((int)b2, (Qo)c2);
    }

    public static Parser<sm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static sm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(Qo qo2) {
        sm b2 = qo2;
        sm a2 = this;
        b2.getClass();
        sm sm2 = a2;
        sm2.J();
        sm2.resources_.add((Qo)b2);
    }

    public static sm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        sm a2;
        int b2 = n2;
        sm sm2 = a2 = this;
        sm2.J();
        sm2.resources_.remove(b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, Qo qo2) {
        void b2;
        sm c2 = qo2;
        sm a2 = this;
        c2.getClass();
        sm sm2 = a2;
        sm2.J();
        sm2.resources_.set((int)b2, (Qo)c2);
    }

    public static fn J() {
        return (fn)DEFAULT_INSTANCE.createBuilder();
    }

    public Ya J(int n2) {
        int b2 = n2;
        sm a2 = this;
        return (Ya)a2.resources_.get(b2);
    }

    public static sm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(Iterable<? extends Qo> iterable) {
        sm a2;
        Iterable<? extends Qo> b2 = iterable;
        sm sm2 = a2 = this;
        sm2.J();
        AbstractMessageLite.addAll(b2, sm2.resources_);
    }

    public static sm J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static sm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(sm sm2, int n2) {
        int b2 = n2;
        sm a2 = sm2;
        a2.J(b2);
    }
}

