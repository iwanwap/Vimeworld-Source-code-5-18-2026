/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Qqa
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
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fM
extends GeneratedMessageLite<fM, ro>
implements ma {
    public static final int RESOURCES_FIELD_NUMBER = 2;
    private Internal.IntList resources_;
    private int resourcesMemoizedSerializedSize = pua.o;
    private static final fM DEFAULT_INSTANCE;
    private static volatile Parser<fM> PARSER;

    public static fM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static fM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static fM J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private fM() {
        fM a2;
        a2.resources_ = fM.emptyIntList();
    }

    public static fM f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fM J(InputStream a2) throws IOException {
        return fM.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static ro J() {
        return (ro)DEFAULT_INSTANCE.createBuilder();
    }

    public static fM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return fM.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ fM f() {
        return DEFAULT_INSTANCE;
    }

    private void f() {
        a.resources_ = fM.emptyIntList();
    }

    @Override
    public List<Integer> getResourcesList() {
        fM a2;
        return a2.resources_;
    }

    public static fM J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
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
        fM c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new fM();
            }
            case 2: {
                return new ro(null);
            }
            case 3: {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = WOa.E;
                d2 = objectArray;
                Object b2 = Qqa.g;
                return fM.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = fM.class;
                synchronized (fM.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<fM>(DEFAULT_INSTANCE);
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

    public static Parser<fM> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(fM fM2, int n2, int n3) {
        void b2;
        int c2 = n3;
        fM a2 = fM2;
        a2.J((int)b2, c2);
    }

    static {
        fM fM2;
        DEFAULT_INSTANCE = fM2 = new fM();
        GeneratedMessageLite.registerDefaultInstance(fM.class, fM2);
    }

    public static fM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static fM J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getResources(int n2) {
        int b2 = n2;
        fM a2 = this;
        return a2.resources_.getInt(b2);
    }

    public static fM J() {
        return DEFAULT_INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private void J(int n2, int n3) {
        void b2;
        fM a2;
        int c2 = n3;
        fM fM2 = a2 = this;
        fM2.J();
        fM2.resources_.setInt((int)b2, c2);
    }

    public static /* synthetic */ void J(fM fM2, int n2) {
        int b2 = n2;
        fM a2 = fM2;
        a2.J(b2);
    }

    public static /* synthetic */ void J(fM fM2, Iterable iterable) {
        Iterable b2 = iterable;
        fM a2 = fM2;
        a2.J(b2);
    }

    private void J(Iterable<? extends Integer> iterable) {
        fM a2;
        Iterable<? extends Integer> b2 = iterable;
        fM fM2 = a2 = this;
        fM2.J();
        AbstractMessageLite.addAll(b2, fM2.resources_);
    }

    public static fM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(int n2) {
        fM a2;
        int b2 = n2;
        fM fM2 = a2 = this;
        fM2.J();
        fM2.resources_.addInt(b2);
    }

    public static /* synthetic */ void J(fM a2) {
        a2.f();
    }

    public static ro J(fM a2) {
        return (ro)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public int getResourcesCount() {
        fM a2;
        return a2.resources_.size();
    }

    private void J() {
        fM fM2 = this;
        Internal.IntList a2 = fM2.resources_;
        if (!a2.isModifiable()) {
            fM2.resources_ = GeneratedMessageLite.mutableCopy(a2);
        }
    }
}

