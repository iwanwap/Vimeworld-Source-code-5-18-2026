/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bo
 *  EM
 *  Oo
 *  cn
 *  io
 *  rO
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class Bo_3
extends GeneratedMessageLite.Builder<Oo, Bo>
implements ga {
    @Override
    public ByteString getCallback() {
        Bo_3 a2;
        return ((Oo)a2.instance).getCallback();
    }

    @Override
    public boolean hasCallback() {
        Bo_3 a2;
        return ((Oo)a2.instance).hasCallback();
    }

    @Override
    public cn getIsometricClick() {
        Bo_3 a2;
        return ((Oo)a2.instance).getIsometricClick();
    }

    public Bo setIsometricClick(cn cn2) {
        Bo_3 a2;
        Bo_3 b2 = cn2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance), (cn)b2);
        return a2;
    }

    public Bo setResourceRequest(fM fM2) {
        Bo_3 a2;
        MessageLiteOrBuilder b2 = fM2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.f((Oo)((Oo)bo_3.instance), (fM)b2);
        return a2;
    }

    public Bo setIsometricMousePosition(EM eM2) {
        Bo_3 a2;
        Bo_3 b2 = eM2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance), (io)((io)b2.build()));
        return a2;
    }

    public Bo setCallback(ByteString byteString) {
        Bo_3 a2;
        ByteString b2 = byteString;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance), (ByteString)b2);
        return a2;
    }

    public Bo clearResourceRequest() {
        Bo_3 a2;
        Bo_3 bo_3 = a2;
        bo_3.copyOnWrite();
        Oo.f((Oo)((Oo)bo_3.instance));
        return a2;
    }

    @Override
    public boolean hasIsometricClick() {
        Bo_3 a2;
        return ((Oo)a2.instance).hasIsometricClick();
    }

    public Bo mergeResourceRequest(fM fM2) {
        Bo_3 a2;
        MessageLiteOrBuilder b2 = fM2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance), (fM)b2);
        return a2;
    }

    @Override
    public rO getActionCase() {
        Bo_3 a2;
        return ((Oo)a2.instance).getActionCase();
    }

    public Bo setResourceRequest(ro ro2) {
        Bo_3 a2;
        GeneratedMessageLite.Builder b2 = ro2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.f((Oo)((Oo)bo_3.instance), (fM)((fM)b2.build()));
        return a2;
    }

    public Bo mergeIsometricClick(cn cn2) {
        Bo_3 a2;
        Bo_3 b2 = cn2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.f((Oo)((Oo)bo_3.instance), (cn)b2);
        return a2;
    }

    public Bo clearIsometricMousePosition() {
        Bo_3 a2;
        Bo_3 bo_3 = a2;
        bo_3.copyOnWrite();
        Oo.C((Oo)((Oo)bo_3.instance));
        return a2;
    }

    public /* synthetic */ Bo_3(AN aN2) {
        Bo_3 b2 = aN2;
        Bo_3 a2 = this;
        a2();
    }

    @Override
    public io getIsometricMousePosition() {
        Bo_3 a2;
        return ((Oo)a2.instance).getIsometricMousePosition();
    }

    public Bo setIsometricMousePosition(io io2) {
        Bo_3 a2;
        Bo_3 b2 = io2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance), (io)b2);
        return a2;
    }

    public Bo mergeIsometricMousePosition(io io2) {
        Bo_3 a2;
        Bo_3 b2 = io2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.f((Oo)((Oo)bo_3.instance), (io)b2);
        return a2;
    }

    @Override
    public boolean hasIsometricMousePosition() {
        Bo_3 a2;
        return ((Oo)a2.instance).hasIsometricMousePosition();
    }

    public Bo clearIsometricClick() {
        Bo_3 a2;
        Bo_3 bo_3 = a2;
        bo_3.copyOnWrite();
        Oo.l((Oo)((Oo)bo_3.instance));
        return a2;
    }

    @Override
    public boolean hasResourceRequest() {
        Bo_3 a2;
        return ((Oo)a2.instance).hasResourceRequest();
    }

    public Bo clearCallback() {
        Bo_3 a2;
        Bo_3 bo_3 = a2;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance));
        return a2;
    }

    public Bo setIsometricClick(fo fo2) {
        Bo_3 a2;
        GeneratedMessageLite.Builder b2 = fo2;
        Bo_3 bo_3 = a2 = this;
        bo_3.copyOnWrite();
        Oo.J((Oo)((Oo)bo_3.instance), (cn)((cn)b2.build()));
        return a2;
    }

    private Bo_3() {
        super(Oo.f());
        Bo_3 a2;
    }

    public Bo clearAction() {
        Bo_3 a2;
        Bo_3 bo_3 = a2;
        bo_3.copyOnWrite();
        Oo.d((Oo)((Oo)bo_3.instance));
        return a2;
    }

    @Override
    public fM getResourceRequest() {
        Bo_3 a2;
        return ((Oo)a2.instance).getResourceRequest();
    }
}

