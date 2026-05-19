/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  SN
 *  YB
 *  lqa
 *  vRa
 *  vm
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
public final class vm_2
extends GeneratedMessageLite<vm, CN>
implements YB {
    private static final vm DEFAULT_INSTANCE;
    public static final int KEYBIND_FIELD_NUMBER = 1;
    private static volatile Parser<vm> PARSER;
    private SN keybind_;
    private int bitField0_;

    public static vm f() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasKeybind() {
        vm_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static vm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static vm J(byte[] a2) throws InvalidProtocolBufferException {
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    static {
        vm_2 vm_22 = new vm_2();
        DEFAULT_INSTANCE = vm_22;
        GeneratedMessageLite.registerDefaultInstance(vm_2.class, vm_22);
    }

    public static vm f(InputStream a2) throws IOException {
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private vm_2() {
        vm_2 a2;
    }

    public static CN J(vm a2) {
        return (CN)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ vm J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(vm a2) {
        super.J();
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
        vm_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new vm_2();
            }
            case 2: {
                return new CN(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = WPa.Da;
                d2 = objectArray;
                Object b2 = bsa.h;
                return vm_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = vm_2.class;
                synchronized (vm_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<vm>(DEFAULT_INSTANCE);
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

    public SN getKeybind() {
        vm_2 a2;
        if (a2.keybind_ == null) {
            return SN.f();
        }
        return a2.keybind_;
    }

    public static vm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static vm J(CodedInputStream a2) throws IOException {
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<vm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void f(vm vm2, SN sN2) {
        vm b2 = sN2;
        vm a2 = vm2;
        super.J((SN)b2);
    }

    public static /* synthetic */ void J(vm vm2, SN sN2) {
        vm b2 = sN2;
        vm a2 = vm2;
        super.f((SN)b2);
    }

    public static vm J(ByteString a2) throws InvalidProtocolBufferException {
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.keybind_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static CN J() {
        return (CN)DEFAULT_INSTANCE.createBuilder();
    }

    public static vm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static vm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static vm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (vm_2)vm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static vm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (vm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(SN sN2) {
        vm_2 vm_22;
        vm_2 b2 = sN2;
        vm_2 a2 = this;
        b2.getClass();
        if (a2.keybind_ != null && a2.keybind_ != SN.f()) {
            a2.keybind_ = (SN)((zm)SN.J((SN)a2.keybind_).mergeFrom(b2)).buildPartial();
            vm_22 = a2;
        } else {
            vm_22 = a2;
            a2.keybind_ = b2;
        }
        vm_22.bitField0_ |= vRa.d;
    }

    private void J(SN sN2) {
        vm_2 b2 = sN2;
        vm_2 a2 = this;
        b2.getClass();
        a2.keybind_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static vm J(InputStream a2) throws IOException {
        return (vm_2)vm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }
}

