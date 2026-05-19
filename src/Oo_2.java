/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bo
 *  EM
 *  Oo
 *  Qta
 *  Uta
 *  cn
 *  io
 *  rO
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
public final class Oo_2
extends GeneratedMessageLite<Oo, Bo>
implements ga {
    public static final int RESOURCEREQUEST_FIELD_NUMBER = 2;
    private static volatile Parser<Oo> PARSER;
    private static final Oo DEFAULT_INSTANCE;
    private Object action_;
    public static final int ISOMETRICMOUSEPOSITION_FIELD_NUMBER = 3;
    public static final int CALLBACK_FIELD_NUMBER = 1;
    private int actionCase_ = uSa.E;
    public static final int ISOMETRICCLICK_FIELD_NUMBER = 4;

    @Override
    public boolean hasResourceRequest() {
        Oo_2 a2;
        if (a2.actionCase_ == uqa.g) {
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
        Oo_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Oo_2();
            }
            case 2: {
                return new Bo(null);
            }
            case 3: {
                Object[] objectArray = new Object[tTa.h];
                objectArray[uSa.E] = Hta.m;
                objectArray[vRa.d] = Uta.J;
                objectArray[uqa.g] = fM.class;
                objectArray[yRa.d] = io.class;
                objectArray[AQa.P] = cn.class;
                d2 = objectArray;
                Object b2 = Qta.c;
                return Oo_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Oo_2.class;
                synchronized (Oo_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Oo>(DEFAULT_INSTANCE);
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

    private void f(fM fM2) {
        GeneratedMessageLite b2 = fM2;
        Oo_2 a2 = this;
        b2.getClass();
        Oo_2 oo_2 = a2;
        oo_2.action_ = b2;
        oo_2.actionCase_ = uqa.g;
    }

    public static /* synthetic */ void f(Oo oo2, fM fM2) {
        Object b2 = fM2;
        Oo a2 = oo2;
        super.f((fM)b2);
    }

    public static /* synthetic */ void J(Oo oo2, fM fM2) {
        Object b2 = fM2;
        Oo a2 = oo2;
        super.J((fM)b2);
    }

    public static Oo J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Oo J(byte[] a2) throws InvalidProtocolBufferException {
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Oo oo2, ByteString byteString) {
        Object b2 = byteString;
        Oo a2 = oo2;
        super.J((ByteString)b2);
    }

    private Oo_2() {
        Oo_2 a2;
    }

    public static Oo J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Oo f(InputStream a2) throws IOException {
        return (Oo_2)Oo_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public fM getResourceRequest() {
        Oo_2 a2;
        if (a2.actionCase_ == uqa.g) {
            return (fM)a2.action_;
        }
        return fM.J();
    }

    public static Bo J(Oo a2) {
        return (Bo)DEFAULT_INSTANCE.createBuilder(a2);
    }

    @Override
    public boolean hasCallback() {
        Oo_2 a2;
        if (a2.actionCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void d() {
        Oo_2 a2;
        if (a2.actionCase_ == vRa.d) {
            Oo_2 oo_2 = a2;
            oo_2.actionCase_ = uSa.E;
            oo_2.action_ = null;
        }
    }

    public static Parser<Oo> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static Oo J(CodedInputStream a2) throws IOException {
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f(io io2) {
        Oo_2 b2 = io2;
        Oo_2 a2 = this;
        b2.getClass();
        Oo_2 oo_2 = a2;
        oo_2.action_ = b2;
        oo_2.actionCase_ = yRa.d;
    }

    public static /* synthetic */ void d(Oo a2) {
        super.l();
    }

    public static Oo J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Oo_2 a2 = this;
        b2.getClass();
        Oo_2 oo_2 = a2;
        oo_2.actionCase_ = vRa.d;
        oo_2.action_ = b2;
    }

    public static /* synthetic */ void f(Oo oo2, cn cn2) {
        Oo b2 = cn2;
        Oo a2 = oo2;
        super.f((cn)b2);
    }

    @Override
    public boolean hasIsometricClick() {
        Oo_2 a2;
        if (a2.actionCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public boolean hasIsometricMousePosition() {
        Oo_2 a2;
        if (a2.actionCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    @Override
    public ByteString getCallback() {
        Oo_2 a2;
        if (a2.actionCase_ == vRa.d) {
            return (ByteString)a2.action_;
        }
        return ByteString.EMPTY;
    }

    public static /* synthetic */ void C(Oo a2) {
        super.C();
    }

    public static Oo J(ByteString a2) throws InvalidProtocolBufferException {
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C() {
        Oo_2 a2;
        if (a2.actionCase_ == yRa.d) {
            Oo_2 oo_2 = a2;
            oo_2.actionCase_ = uSa.E;
            oo_2.action_ = null;
        }
    }

    public static Oo J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(Oo a2) {
        super.f();
    }

    private void f(cn cn2) {
        Oo_2 oo_2;
        Oo_2 b2 = cn2;
        Oo_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == AQa.P && a2.action_ != cn.J()) {
            a2.action_ = ((fo)cn.J((cn)((cn)a2.action_)).mergeFrom(b2)).buildPartial();
            oo_2 = a2;
        } else {
            oo_2 = a2;
            a2.action_ = b2;
        }
        oo_2.actionCase_ = AQa.P;
    }

    private void l() {
        Oo_2 a2;
        Oo_2 oo_2 = a2;
        oo_2.actionCase_ = uSa.E;
        oo_2.action_ = null;
    }

    public static /* synthetic */ void J(Oo oo2, cn cn2) {
        Oo b2 = cn2;
        Oo a2 = oo2;
        super.J((cn)b2);
    }

    private void J(io io2) {
        Oo_2 oo_2;
        Oo_2 b2 = io2;
        Oo_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == yRa.d && a2.action_ != io.f()) {
            a2.action_ = ((EM)io.J((io)((io)a2.action_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            oo_2 = a2;
        } else {
            oo_2 = a2;
            a2.action_ = b2;
        }
        oo_2.actionCase_ = yRa.d;
    }

    static {
        Oo_2 oo_2 = new Oo_2();
        DEFAULT_INSTANCE = oo_2;
        GeneratedMessageLite.registerDefaultInstance(Oo_2.class, oo_2);
    }

    private void f() {
        Oo_2 a2;
        if (a2.actionCase_ == AQa.P) {
            Oo_2 oo_2 = a2;
            oo_2.actionCase_ = uSa.E;
            oo_2.action_ = null;
        }
    }

    public static Oo J(InputStream a2) throws IOException {
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Bo J() {
        return (Bo)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ Oo f() {
        return DEFAULT_INSTANCE;
    }

    public static Oo f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Oo_2)Oo_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(Oo a2) {
        super.J();
    }

    public static Oo J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Oo J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(Oo oo2, io io2) {
        Oo b2 = io2;
        Oo a2 = oo2;
        super.J((io)b2);
    }

    private void J(fM fM2) {
        Oo_2 oo_2;
        GeneratedMessageLite b2 = fM2;
        Oo_2 a2 = this;
        b2.getClass();
        if (a2.actionCase_ == uqa.g && a2.action_ != fM.J()) {
            a2.action_ = ((ro)fM.J((fM)a2.action_).mergeFrom(b2)).buildPartial();
            oo_2 = a2;
        } else {
            oo_2 = a2;
            a2.action_ = b2;
        }
        oo_2.actionCase_ = uqa.g;
    }

    public static /* synthetic */ void J(Oo oo2, io io2) {
        Oo b2 = io2;
        Oo a2 = oo2;
        super.f((io)b2);
    }

    private void J() {
        Oo_2 a2;
        if (a2.actionCase_ == uqa.g) {
            Oo_2 oo_2 = a2;
            oo_2.actionCase_ = uSa.E;
            oo_2.action_ = null;
        }
    }

    public static Oo J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Oo_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public io getIsometricMousePosition() {
        Oo_2 a2;
        if (a2.actionCase_ == yRa.d) {
            return (io)a2.action_;
        }
        return io.f();
    }

    public static /* synthetic */ void J(Oo a2) {
        super.d();
    }

    @Override
    public rO getActionCase() {
        Oo_2 a2;
        return rO.forNumber((int)a2.actionCase_);
    }

    @Override
    public cn getIsometricClick() {
        Oo_2 a2;
        if (a2.actionCase_ == AQa.P) {
            return (cn)a2.action_;
        }
        return cn.J();
    }

    private void J(cn cn2) {
        Oo_2 b2 = cn2;
        Oo_2 a2 = this;
        b2.getClass();
        Oo_2 oo_2 = a2;
        oo_2.action_ = b2;
        oo_2.actionCase_ = AQa.P;
    }
}

