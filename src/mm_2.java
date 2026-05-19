/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Co
 *  Gn
 *  Po
 *  ZM
 *  hqa
 *  mm
 *  vRa
 *  yo
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
public final class mm_2
extends GeneratedMessageLite<mm, Co>
implements Nd {
    public static final int CAMERAPATH_FIELD_NUMBER = 2;
    private int animationCase_ = uSa.E;
    private static volatile Parser<mm> PARSER;
    private static final mm DEFAULT_INSTANCE;
    public static final int SCREENSHAKEANIMATION_FIELD_NUMBER = 1;
    private Object animation_;

    public static Co J(mm a2) {
        return (Co)DEFAULT_INSTANCE.createBuilder(a2);
    }

    public static /* synthetic */ void f(mm mm2, Po po) {
        mm b2 = po;
        mm a2 = mm2;
        super.f((Po)b2);
    }

    public static mm J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteString a2 = byteString;
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void l() {
        mm_2 a2;
        if (a2.animationCase_ == uqa.g) {
            mm_2 mm_22 = a2;
            mm_22.animationCase_ = uSa.E;
            mm_22.animation_ = null;
        }
    }

    public static mm f() {
        return DEFAULT_INSTANCE;
    }

    public static mm J(byte[] a2) throws InvalidProtocolBufferException {
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static mm J(ByteBuffer a2) throws InvalidProtocolBufferException {
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void l(mm a2) {
        super.J();
    }

    public static Parser<mm> J() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static /* synthetic */ void f(mm mm2, ZM zM) {
        mm b2 = zM;
        mm a2 = mm2;
        super.f((ZM)b2);
    }

    public static /* synthetic */ void f(mm a2) {
        super.f();
    }

    private void f() {
        mm_2 a2;
        mm_2 mm_22 = a2;
        mm_22.animationCase_ = uSa.E;
        mm_22.animation_ = null;
    }

    public static mm f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mm J(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        InputStream a2 = inputStream;
        return (mm_2)mm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2, b2);
    }

    public static mm J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        ByteBuffer a2 = byteBuffer;
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    private void f(Po po) {
        mm_2 mm_22;
        mm_2 b2 = po;
        mm_2 a2 = this;
        b2.getClass();
        if (a2.animationCase_ == vRa.d && a2.animation_ != Po.f()) {
            a2.animation_ = ((yo)Po.J((Po)((Po)a2.animation_)).mergeFrom((GeneratedMessageLite)b2)).buildPartial();
            mm_22 = a2;
        } else {
            mm_22 = a2;
            a2.animation_ = b2;
        }
        mm_22.animationCase_ = vRa.d;
    }

    public static mm J(ByteString a2) throws InvalidProtocolBufferException {
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private void J(Po po) {
        mm_2 b2 = po;
        mm_2 a2 = this;
        b2.getClass();
        mm_2 mm_22 = a2;
        mm_22.animation_ = b2;
        mm_22.animationCase_ = vRa.d;
    }

    public static mm J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        Object b2 = extensionRegistryLite;
        byte[] a2 = byArray;
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, (ExtensionRegistryLite)b2);
    }

    @Override
    public boolean hasCameraPath() {
        mm_2 a2;
        if (a2.animationCase_ == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static mm f(InputStream a2) throws IOException {
        return (mm_2)mm_2.parseDelimitedFrom(DEFAULT_INSTANCE, a2);
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
        mm_2 c2 = this;
        switch (AN.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[((Enum)d2).ordinal()]) {
            case 1: {
                return new mm_2();
            }
            case 2: {
                return new Co(null);
            }
            case 3: {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = STa.W;
                objectArray[vRa.d] = rRa.P;
                objectArray[uqa.g] = Po.class;
                objectArray[yRa.d] = ZM.class;
                d2 = objectArray;
                Object b2 = hqa.O;
                return mm_2.newMessageInfo((MessageLite)DEFAULT_INSTANCE, (String)b2, (Object[])d2);
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                d2 = PARSER;
                if (d2 != null) {
                    return d2;
                }
                Object b2 = mm_2.class;
                synchronized (mm_2.class) {
                    d2 = PARSER;
                    if (d2 == null) {
                        d2 = new GeneratedMessageLite.DefaultInstanceBasedParser<mm>(DEFAULT_INSTANCE);
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

    private void f(ZM zM) {
        mm_2 b2 = zM;
        mm_2 a2 = this;
        b2.getClass();
        mm_2 mm_22 = a2;
        mm_22.animation_ = b2;
        mm_22.animationCase_ = uqa.g;
    }

    static {
        mm_2 mm_22 = new mm_2();
        DEFAULT_INSTANCE = mm_22;
        GeneratedMessageLite.registerDefaultInstance(mm_2.class, mm_22);
    }

    public static Co J() {
        return (Co)DEFAULT_INSTANCE.createBuilder();
    }

    @Override
    public boolean hasScreenShakeAnimation() {
        mm_2 a2;
        if (a2.animationCase_ == vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(ZM zM) {
        mm_2 mm_22;
        mm_2 b2 = zM;
        mm_2 a2 = this;
        b2.getClass();
        if (a2.animationCase_ == uqa.g && a2.animation_ != ZM.f()) {
            a2.animation_ = ((dm)ZM.J((ZM)((ZM)a2.animation_)).mergeFrom(b2)).buildPartial();
            mm_22 = a2;
        } else {
            mm_22 = a2;
            a2.animation_ = b2;
        }
        mm_22.animationCase_ = uqa.g;
    }

    public static /* synthetic */ void J(mm mm2, ZM zM) {
        mm b2 = zM;
        mm a2 = mm2;
        super.J((ZM)b2);
    }

    private void J() {
        mm_2 a2;
        if (a2.animationCase_ == vRa.d) {
            mm_2 mm_22 = a2;
            mm_22.animationCase_ = uSa.E;
            mm_22.animation_ = null;
        }
    }

    public static /* synthetic */ void J(mm mm2, Po po) {
        mm b2 = po;
        mm a2 = mm2;
        super.J((Po)b2);
    }

    @Override
    public Gn getAnimationCase() {
        mm_2 a2;
        return Gn.forNumber((int)a2.animationCase_);
    }

    public static mm J(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        ExtensionRegistryLite b2 = extensionRegistryLite;
        CodedInputStream a2 = codedInputStream;
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2, b2);
    }

    @Override
    public ZM getCameraPath() {
        mm_2 a2;
        if (a2.animationCase_ == uqa.g) {
            return (ZM)a2.animation_;
        }
        return ZM.f();
    }

    public static mm J(InputStream a2) throws IOException {
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    public static /* synthetic */ void J(mm a2) {
        super.l();
    }

    @Override
    public Po getScreenShakeAnimation() {
        mm_2 a2;
        if (a2.animationCase_ == vRa.d) {
            return (Po)a2.animation_;
        }
        return Po.f();
    }

    public static /* synthetic */ mm J() {
        return DEFAULT_INSTANCE;
    }

    public static mm J(CodedInputStream a2) throws IOException {
        return (mm_2)GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, a2);
    }

    private mm_2() {
        mm_2 a2;
    }
}

