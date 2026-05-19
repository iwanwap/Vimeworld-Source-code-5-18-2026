/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ro
 *  go
 *  nQa
 *  vRa
 *  vn
 *  wn
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
public final class wn_2
extends GeneratedMessageLite<wn, go>
implements ia {
    public static final int URL_FIELD_NUMBER = 2;
    private int action_;
    private static volatile Parser<wn> PARSER;
    private int dataCase_ = uSa.E;
    private Object data_;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private static final wn DEFAULT_INSTANCE;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int CALLBACK_FIELD_NUMBER = 4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        Object d2 = methodToInvoke;
        wn_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new wn_2();
            }
            case 2: {
                return new go(null);
            }
            case 3: {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = nQa.t;
                objectArray[vRa.d] = Qpa.Ka;
                objectArray[uqa.g] = Hta.m;
                d2 = objectArray;
                Object b2 = MTa.E;
                return wn_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = wn_2.class;
                synchronized (wn_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<wn>(DEFAULT_INSTANCE);
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

    private void d() {
        wn_2 a2;
        wn_2 wn_22 = a2;
        wn_22.dataCase_ = uSa.E;
        wn_22.data_ = null;
    }

    public static /* synthetic */ void f(wn wn2, String string) {
        Object b2 = string;
        wn a2 = wn2;
        super.J((String)b2);
    }

    public static /* synthetic */ void d(wn a2) {
        super.C();
    }

    @Override
    public String getUrl() {
        wn_2 wn_22 = this;
        Object a2 = Mqa.y;
        if (wn_22.dataCase_ == uqa.g) {
            a2 = (String)wn_22.data_;
        }
        return a2;
    }

    @Override
    public boolean hasCallback() {
        wn_2 a2;
        if (a2.dataCase_ == AQa.P) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static wn f(InputStream a2) throws IOException {
        return (wn_2)wn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(wn wn2, Ro ro2) {
        wn b2 = ro2;
        wn a2 = wn2;
        super.J((Ro)b2);
    }

    public static wn J(ByteString a2) throws InvalidProtocolBufferException {
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void C() {
        wn_2 a2;
        if (a2.dataCase_ == yRa.d) {
            wn_2 wn_22 = a2;
            wn_22.dataCase_ = uSa.E;
            wn_22.data_ = null;
        }
    }

    private void l(ByteString byteString) {
        ByteString b2 = byteString;
        wn_2 a2 = this;
        b2.getClass();
        wn_2 wn_22 = a2;
        wn_22.dataCase_ = AQa.P;
        wn_22.data_ = b2;
    }

    static {
        wn_2 wn_22 = new wn_2();
        DEFAULT_INSTANCE = wn_22;
        GeneratedMessageLite.registerDefaultInstance(wn_2.class, wn_22);
    }

    public static /* synthetic */ void J(wn wn2, int n2) {
        int b2 = n2;
        wn a2 = wn2;
        super.J(b2);
    }

    @Override
    public ByteString getCallback() {
        wn_2 a2;
        if (a2.dataCase_ == AQa.P) {
            return (ByteString)a2.data_;
        }
        return ByteString.EMPTY;
    }

    private void f(String string) {
        String b2 = string;
        wn_2 a2 = this;
        b2.getClass();
        wn_2 wn_22 = a2;
        wn_22.dataCase_ = uqa.g;
        wn_22.data_ = b2;
    }

    public static wn J(InputStream a2) throws IOException {
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(int n2) {
        int b2 = n2;
        wn_2 a2 = this;
        a2.action_ = b2;
    }

    public static wn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void C(wn a2) {
        super.l();
    }

    private wn_2() {
        wn_2 a2;
    }

    public static wn f() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ wn J() {
        return DEFAULT_INSTANCE;
    }

    private void l() {
        wn_2 a2;
        if (a2.dataCase_ == AQa.P) {
            wn_2 wn_22 = a2;
            wn_22.dataCase_ = uSa.E;
            wn_22.data_ = null;
        }
    }

    @Override
    public ByteString getMessageBytes() {
        wn_2 wn_22 = this;
        Object a2 = Mqa.y;
        if (wn_22.dataCase_ == yRa.d) {
            a2 = (String)wn_22.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    private void J(Ro ro2) {
        wn_2 b2 = ro2;
        wn_2 a2 = this;
        a2.action_ = b2.getNumber();
    }

    @Override
    public vn getDataCase() {
        wn_2 a2;
        return vn.forNumber((int)a2.dataCase_);
    }

    @Override
    public boolean hasMessage() {
        wn_2 a2;
        if (a2.dataCase_ == yRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static go J() {
        return (go)DEFAULT_INSTANCE.createBuilder();
    }

    public static wn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public boolean hasUrl() {
        wn_2 a2;
        if (a2.dataCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Parser<wn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static wn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public ByteString getUrlBytes() {
        wn_2 wn_22 = this;
        Object a2 = Mqa.y;
        if (wn_22.dataCase_ == uqa.g) {
            a2 = (String)wn_22.data_;
        }
        return ByteString.copyFromUtf8((String)a2);
    }

    @Override
    public Ro getAction() {
        wn_2 wn_22 = this;
        wn_2 a2 = Ro.forNumber((int)wn_22.action_);
        if (a2 == null) {
            return Ro.UNRECOGNIZED;
        }
        return a2;
    }

    public static /* synthetic */ void l(wn wn2, ByteString byteString) {
        Object b2 = byteString;
        wn a2 = wn2;
        super.l((ByteString)b2);
    }

    private void f(ByteString byteString) {
        wn_2 a2;
        ByteString b2 = byteString;
        wn_2 wn_22 = a2 = this;
        wn_2.checkByteStringIsUtf8(b2);
        wn_22.data_ = b2.toStringUtf8();
        wn_22.dataCase_ = yRa.d;
    }

    public static /* synthetic */ void J(wn wn2, String string) {
        Object b2 = string;
        wn a2 = wn2;
        super.f((String)b2);
    }

    public static wn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static go J(wn a2) {
        return (go)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(wn wn2, ByteString byteString) {
        Object b2 = byteString;
        wn a2 = wn2;
        super.f((ByteString)b2);
    }

    private void f() {
        wn_2 a2;
        if (a2.dataCase_ == uqa.g) {
            wn_2 wn_22 = a2;
            wn_22.dataCase_ = uSa.E;
            wn_22.data_ = null;
        }
    }

    public static wn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ void l(wn a2) {
        super.J();
    }

    public static /* synthetic */ void J(wn wn2, ByteString byteString) {
        Object b2 = byteString;
        wn a2 = wn2;
        super.J((ByteString)b2);
    }

    private void J(String string) {
        String b2 = string;
        wn_2 a2 = this;
        b2.getClass();
        wn_2 wn_22 = a2;
        wn_22.dataCase_ = yRa.d;
        wn_22.data_ = b2;
    }

    public static wn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public int getActionValue() {
        wn_2 a2;
        return a2.action_;
    }

    public static wn J(CodedInputStream a2) throws IOException {
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(ByteString byteString) {
        wn_2 a2;
        ByteString b2 = byteString;
        wn_2 wn_22 = a2 = this;
        wn_2.checkByteStringIsUtf8(b2);
        wn_22.data_ = b2.toStringUtf8();
        wn_22.dataCase_ = uqa.g;
    }

    public static wn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (wn_2)wn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static wn J(byte[] a2) throws InvalidProtocolBufferException {
        return (wn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J() {
        a.action_ = uSa.E;
    }

    @Override
    public String getMessage() {
        wn_2 wn_22 = this;
        Object a2 = Mqa.y;
        if (wn_22.dataCase_ == yRa.d) {
            a2 = (String)wn_22.data_;
        }
        return a2;
    }

    public static /* synthetic */ void f(wn a2) {
        super.f();
    }

    public static /* synthetic */ void J(wn a2) {
        super.d();
    }
}

