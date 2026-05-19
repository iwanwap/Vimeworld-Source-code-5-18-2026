/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EN
 *  Fn
 *  QM
 *  SOa
 *  aSa
 *  gn
 *  nA
 *  nQa
 *  pO
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
public final class QM_2
extends GeneratedMessageLite<QM, pO>
implements nA {
    public static final int ENTITY_FIELD_NUMBER = 2;
    private Object data_;
    private static final QM DEFAULT_INSTANCE;
    private int dataCase_ = uSa.E;
    public static final int KIND_FIELD_NUMBER = 1;
    private int kind_;
    private static volatile Parser<QM> PARSER;

    public static /* synthetic */ void J(QM qM, int n2) {
        int b2 = n2;
        QM a2 = qM;
        super.J(b2);
    }

    public Fn getKind() {
        QM_2 qM_2 = this;
        QM_2 a2 = Fn.forNumber((int)qM_2.kind_);
        if (a2 == null) {
            return Fn.UNRECOGNIZED;
        }
        return a2;
    }

    public static QM f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void l(QM a2) {
        super.J();
    }

    public static QM J(byte[] a2) throws InvalidProtocolBufferException {
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static QM f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ QM J() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void J(QM qM, Fn fn2) {
        QM b2 = fn2;
        QM a2 = qM;
        super.J((Fn)b2);
    }

    private void l() {
        QM_2 a2;
        if (a2.dataCase_ == uqa.g) {
            QM_2 qM_2 = a2;
            qM_2.dataCase_ = uSa.E;
            qM_2.data_ = null;
        }
    }

    public static /* synthetic */ void f(QM qM, gn gn2) {
        QM b2 = gn2;
        QM a2 = qM;
        super.J((gn)b2);
    }

    public static QM J(CodedInputStream a2) throws IOException {
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private QM_2() {
        QM_2 a2;
    }

    private void f(gn gn2) {
        QM_2 b2 = gn2;
        QM_2 a2 = this;
        b2.getClass();
        QM_2 qM_2 = a2;
        qM_2.data_ = b2;
        qM_2.dataCase_ = uqa.g;
    }

    public int getKindValue() {
        QM_2 a2;
        return a2.kind_;
    }

    public static /* synthetic */ void J(QM qM, gn gn2) {
        QM b2 = gn2;
        QM a2 = qM;
        super.f((gn)b2);
    }

    public static QM J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.kind_ = uSa.E;
    }

    public static QM J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (QM_2)QM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void f(QM a2) {
        super.l();
    }

    public static QM f(InputStream a2) throws IOException {
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    static {
        QM_2 qM_2 = new QM_2();
        DEFAULT_INSTANCE = qM_2;
        GeneratedMessageLite.registerDefaultInstance(QM_2.class, qM_2);
    }

    public static pO J(QM a2) {
        return (pO)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static QM J(InputStream a2) throws IOException {
        return (QM_2)QM_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<QM> J() {
        return DEFAULT_INSTANCE.getParserForType();
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
        QM_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new QM_2();
            }
            case 2: {
                return new pO(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = aSa.u;
                objectArray[yRa.d] = gn.class;
                d2 = objectArray;
                Object b2 = SOa.V;
                return QM_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = QM_2.class;
                synchronized (QM_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<QM>(DEFAULT_INSTANCE);
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

    public to getDataCase() {
        QM_2 a2;
        return to.forNumber(a2.dataCase_);
    }

    public boolean hasEntity() {
        QM_2 a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static QM J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static pO J() {
        return (pO)DEFAULT_INSTANCE.createBuilder();
    }

    private void J(int n2) {
        int b2 = n2;
        QM_2 a2 = this;
        a2.kind_ = b2;
    }

    public gn getEntity() {
        QM_2 a2;
        if (a2.dataCase_ == uqa.g) {
            return (gn)a2.data_;
        }
        return gn.J();
    }

    public static QM J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void J(QM a2) {
        super.f();
    }

    public static QM J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    private void J(gn gn2) {
        QM_2 qM_2;
        QM_2 b2 = gn2;
        QM_2 a2 = this;
        b2.getClass();
        if (a2.dataCase_ == uqa.g && a2.data_ != gn.J()) {
            a2.data_ = ((EN)gn.J((gn)((gn)a2.data_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            qM_2 = a2;
        } else {
            qM_2 = a2;
            a2.data_ = b2;
        }
        qM_2.dataCase_ = uqa.g;
    }

    private void J(Fn fn2) {
        QM_2 b2 = fn2;
        QM_2 a2 = this;
        a2.kind_ = b2.getNumber();
    }

    public static QM J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void J() {
        QM_2 a2;
        QM_2 qM_2 = a2;
        qM_2.dataCase_ = uSa.E;
        qM_2.data_ = null;
    }

    public static QM J(ByteString a2) throws InvalidProtocolBufferException {
        return (QM_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }
}

