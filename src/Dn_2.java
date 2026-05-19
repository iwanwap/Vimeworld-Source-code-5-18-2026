/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Dn
 *  ERa
 *  MQa
 *  aPa
 *  lqa
 *  oO
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
public final class Dn_2
extends GeneratedMessageLite<Dn, oO>
implements MB {
    public static final int HOVERCOLOR_FIELD_NUMBER = 2;
    private String text_ = Mqa.y;
    private int textColor_;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private static volatile Parser<Dn> PARSER;
    private int hoverColor_;
    public static final int TEXTCOLOR_FIELD_NUMBER = 3;
    private static final Dn DEFAULT_INSTANCE;

    private void l() {
        a.bitField0_ &= rQa.p;
        a.hoverColor_ = uSa.E;
    }

    private void f(int n2) {
        int b2 = n2;
        Dn_2 a2 = this;
        a2.bitField0_ |= uqa.g;
        a2.textColor_ = b2;
    }

    @Override
    public int getHoverColor() {
        Dn_2 a2;
        return a2.hoverColor_;
    }

    @Override
    public String getText() {
        Dn_2 a2;
        return a2.text_;
    }

    private void J(int n2) {
        int b2 = n2;
        Dn_2 a2 = this;
        a2.bitField0_ |= vRa.d;
        a2.hoverColor_ = b2;
    }

    private Dn_2() {
        Dn_2 a2;
    }

    public static Dn J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Dn J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    public static Dn f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Dn J(CodedInputStream a2) throws IOException {
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(Dn dn2, ByteString byteString) {
        Object b2 = byteString;
        Dn a2 = dn2;
        super.J((ByteString)b2);
    }

    public static Dn J(ByteString a2) throws InvalidProtocolBufferException {
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void f() {
        a.text_ = Dn_2.J().getText();
    }

    @Override
    public int getTextColor() {
        Dn_2 a2;
        return a2.textColor_;
    }

    public static /* synthetic */ void l(Dn a2) {
        super.f();
    }

    public static /* synthetic */ void f(Dn a2) {
        super.J();
    }

    private void J() {
        a.bitField0_ &= ERa.Ka;
        a.textColor_ = uSa.E;
    }

    public static Dn J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static Parser<Dn> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void J(Dn a2) {
        super.l();
    }

    public static Dn J(byte[] a2) throws InvalidProtocolBufferException {
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void f(Dn dn2, int n2) {
        int b2 = n2;
        Dn a2 = dn2;
        super.f(b2);
    }

    public static Dn J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static /* synthetic */ Dn f() {
        return DEFAULT_INSTANCE;
    }

    public static Dn J() {
        return DEFAULT_INSTANCE;
    }

    public static oO J(Dn a2) {
        return (oO)DEFAULT_INSTANCE.createBuilder(a2);
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
        Dn_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new Dn_2();
            }
            case 2: {
                return new oO(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = lqa.E;
                objectArray[vRa.d] = aPa.O;
                objectArray[uqa.g] = AQa.Y;
                objectArray[yRa.d] = ERa.r;
                d2 = objectArray;
                Object b2 = MQa.Fa;
                return Dn_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = Dn_2.class;
                synchronized (Dn_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<Dn>(DEFAULT_INSTANCE);
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

    public static Dn J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static Dn f(InputStream a2) throws IOException {
        return (Dn_2)Dn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(String string) {
        String b2 = string;
        Dn_2 a2 = this;
        b2.getClass();
        a2.text_ = b2;
    }

    public static Dn J(InputStream a2) throws IOException {
        return (Dn_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    @Override
    public ByteString getTextBytes() {
        Dn_2 a2;
        return ByteString.copyFromUtf8(a2.text_);
    }

    static {
        Dn_2 dn_2 = new Dn_2();
        DEFAULT_INSTANCE = dn_2;
        GeneratedMessageLite.registerDefaultInstance(Dn_2.class, dn_2);
    }

    public static oO J() {
        return (oO)DEFAULT_INSTANCE.createBuilder();
    }

    public static /* synthetic */ void J(Dn dn2, int n2) {
        int b2 = n2;
        Dn a2 = dn2;
        super.J(b2);
    }

    private void J(ByteString byteString) {
        ByteString b2 = byteString;
        Dn_2 a2 = this;
        Object object = b2;
        Dn_2.checkByteStringIsUtf8((ByteString)object);
        a2.text_ = ((ByteString)object).toStringUtf8();
    }

    public static /* synthetic */ void J(Dn dn2, String string) {
        Object b2 = string;
        Dn a2 = dn2;
        super.J((String)b2);
    }

    @Override
    public boolean hasHoverColor() {
        Dn_2 a2;
        if ((a2.bitField0_ & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Dn J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (Dn_2)Dn_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public boolean hasTextColor() {
        Dn_2 a2;
        if ((a2.bitField0_ & uqa.g) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

