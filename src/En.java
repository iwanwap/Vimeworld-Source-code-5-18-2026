/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Vm
 *  iC
 *  lqa
 *  uo
 *  vRa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class En
extends GeneratedMessageLite<En, uo>
implements iC {
    private int bitField0_;
    private static final En DEFAULT_INSTANCE;
    public static final int GUI_FIELD_NUMBER = 1;
    private static volatile Parser<En> PARSER;
    private ko gui_;

    public static En J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        En en;
        DEFAULT_INSTANCE = en = new En();
        GeneratedMessageLite.registerDefaultInstance(En.class, en);
    }

    private void f(ko ko2) {
        GeneratedMessageLite b2 = ko2;
        En a2 = this;
        b2.getClass();
        a2.gui_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static Parser<En> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static uo J() {
        return (uo)DEFAULT_INSTANCE.createBuilder();
    }

    public static uo J(En a2) {
        return (uo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public boolean hasGui() {
        En a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
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
        En c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new En();
            }
            case 2: {
                return new uo(null);
            }
            case 3: {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = kTa.L;
                d2 = objectArray;
                Object b2 = bsa.h;
                return En.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = En.class;
                synchronized (En.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<En>(DEFAULT_INSTANCE);
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

    public static /* synthetic */ void f(En en, ko ko2) {
        GeneratedMessageLite b2 = ko2;
        En a2 = en;
        a2.f((ko)b2);
    }

    private void J(ko ko2) {
        En en;
        GeneratedMessageLite b2 = ko2;
        En a2 = this;
        b2.getClass();
        if (a2.gui_ != null && a2.gui_ != ko.J()) {
            a2.gui_ = (ko)((Vm)ko.J(a2.gui_).mergeFrom(b2)).buildPartial();
            en = a2;
        } else {
            en = a2;
            a2.gui_ = b2;
        }
        en.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void J(En a2) {
        a2.J();
    }

    public static En J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static /* synthetic */ void J(En en, ko ko2) {
        GeneratedMessageLite b2 = ko2;
        En a2 = en;
        a2.J((ko)b2);
    }

    public static En f(InputStream a2) throws IOException {
        return En.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static En J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static En J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private En() {
        En a2;
    }

    public static En J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static En f() {
        return DEFAULT_INSTANCE;
    }

    public static En f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        a.gui_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static En J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static En J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public ko getGui() {
        En a2;
        if (a2.gui_ == null) {
            return ko.J();
        }
        return a2.gui_;
    }

    public static En J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ En J() {
        return DEFAULT_INSTANCE;
    }

    public static En J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return En.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static En J(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

