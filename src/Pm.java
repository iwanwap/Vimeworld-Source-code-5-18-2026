/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ERa
 *  Ho
 *  NN
 *  URa
 *  XSa
 *  lqa
 *  qn
 *  qta
 *  rA
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
public final class Pm
extends GeneratedMessageLite<Pm, Ho>
implements rA {
    private static final Pm DEFAULT_INSTANCE;
    private static volatile Parser<Pm> PARSER;
    public static final int FINISH_FIELD_NUMBER = 2;
    private int bitField0_;
    private NN finish_;
    private NN start_;
    public static final int START_FIELD_NUMBER = 1;

    public static Pm f(InputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C(NN nN) {
        Pm pm2;
        Pm b2 = nN;
        Pm a2 = this;
        b2.getClass();
        if (a2.finish_ != null && a2.finish_ != NN.J()) {
            a2.finish_ = (NN)((qn)NN.J((NN)a2.finish_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            pm2 = a2;
        } else {
            pm2 = a2;
            a2.finish_ = b2;
        }
        pm2.bitField0_ |= uqa.g;
    }

    public static /* synthetic */ Pm f() {
        return DEFAULT_INSTANCE;
    }

    public static Ho J(Pm a2) {
        return (Ho)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public NN getStart() {
        Pm a2;
        if (a2.start_ == null) {
            return NN.J();
        }
        return a2.start_;
    }

    public static Pm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Parser<Pm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean hasStart() {
        Pm a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Pm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return Pm.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(Pm pm2, NN nN) {
        Pm b2 = nN;
        Pm a2 = pm2;
        a2.C((NN)b2);
    }

    public static Ho J() {
        return (Ho)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void l(Pm pm2, NN nN) {
        Pm b2 = nN;
        Pm a2 = pm2;
        a2.l((NN)b2);
    }

    private void l(NN nN) {
        Pm b2 = nN;
        Pm a2 = this;
        b2.getClass();
        a2.finish_ = b2;
        a2.bitField0_ |= uqa.g;
    }

    static {
        Pm pm2;
        DEFAULT_INSTANCE = pm2 = new Pm();
        GeneratedMessageLite.registerDefaultInstance(Pm.class, pm2);
    }

    public static /* synthetic */ void f(Pm a2) {
        a2.J();
    }

    private void f() {
        a.start_ = null;
        a.bitField0_ &= rQa.p;
    }

    public static Pm J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void f(Pm pm2, NN nN) {
        Pm b2 = nN;
        Pm a2 = pm2;
        a2.f((NN)b2);
    }

    private Pm() {
        Pm a2;
    }

    public static /* synthetic */ void J(Pm a2) {
        a2.f();
    }

    private void f(NN nN) {
        Pm b2 = nN;
        Pm a2 = this;
        b2.getClass();
        a2.start_ = b2;
        a2.bitField0_ |= vRa.d;
    }

    public static Pm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Pm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Pm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Pm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Pm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public NN getFinish() {
        Pm a2;
        if (a2.finish_ == null) {
            return NN.J();
        }
        return a2.finish_;
    }

    public static Pm J(ByteString a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
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
        Pm c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Pm();
            }
            case 2: {
                return new Ho(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = URa.G;
                objectArray[uqa.g] = XSa.M;
                d2 = objectArray;
                Object b2 = qta.Y;
                return Pm.newMessageInfo(DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Pm.class;
                synchronized (Pm.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Pm>(DEFAULT_INSTANCE);
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

    public static Pm J(InputStream a2) throws IOException {
        return Pm.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Pm J(byte[] a2) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Pm J(CodedInputStream a2) throws IOException {
        return GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.finish_ = null;
        a.bitField0_ &= ERa.Ka;
    }

    private void J(NN nN) {
        Pm pm2;
        Pm b2 = nN;
        Pm a2 = this;
        b2.getClass();
        if (a2.start_ != null && a2.start_ != NN.J()) {
            a2.start_ = (NN)((qn)NN.J((NN)a2.start_).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            pm2 = a2;
        } else {
            pm2 = a2;
            a2.start_ = b2;
        }
        pm2.bitField0_ |= vRa.d;
    }

    public static /* synthetic */ void J(Pm pm2, NN nN) {
        Pm b2 = nN;
        Pm a2 = pm2;
        a2.J((NN)b2);
    }

    public boolean hasFinish() {
        Pm a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

