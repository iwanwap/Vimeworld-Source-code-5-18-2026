/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Om
 *  QA
 *  kn
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class kn_1
extends GeneratedMessageLite.Builder<sN, kn>
implements QA {
    public ByteString getIdBytes() {
        kn_1 a2;
        return ((sN)a2.instance).getIdBytes();
    }

    public kn clearEdit() {
        kn_1 a2;
        kn_1 kn_12 = a2;
        kn_12.copyOnWrite();
        sN.f((sN)kn_12.instance);
        return a2;
    }

    public kn setEdit(Om om2) {
        kn_1 a2;
        kn_1 b2 = om2;
        kn_1 kn_12 = a2 = this;
        kn_12.copyOnWrite();
        sN.J((sN)kn_12.instance, (RN)b2.build());
        return a2;
    }

    public kn setIdBytes(ByteString byteString) {
        kn_1 a2;
        ByteString b2 = byteString;
        kn_1 kn_12 = a2 = this;
        kn_12.copyOnWrite();
        sN.J((sN)kn_12.instance, b2);
        return a2;
    }

    public RN getEdit() {
        kn_1 a2;
        return ((sN)a2.instance).getEdit();
    }

    public kn mergeEdit(RN rN) {
        kn_1 a2;
        MessageLiteOrBuilder b2 = rN;
        kn_1 kn_12 = a2 = this;
        kn_12.copyOnWrite();
        sN.f((sN)kn_12.instance, (RN)b2);
        return a2;
    }

    public boolean hasEdit() {
        kn_1 a2;
        return ((sN)a2.instance).hasEdit();
    }

    public String getId() {
        kn_1 a2;
        return ((sN)a2.instance).getId();
    }

    public kn clearId() {
        kn_1 a2;
        kn_1 kn_12 = a2;
        kn_12.copyOnWrite();
        sN.J((sN)kn_12.instance);
        return a2;
    }

    public /* synthetic */ kn_1(AN aN2) {
        kn_1 b2 = aN2;
        kn_1 a2 = this;
        a2();
    }

    private kn_1() {
        super(sN.J());
        kn_1 a2;
    }

    public kn setEdit(RN rN) {
        kn_1 a2;
        MessageLiteOrBuilder b2 = rN;
        kn_1 kn_12 = a2 = this;
        kn_12.copyOnWrite();
        sN.J((sN)kn_12.instance, (RN)b2);
        return a2;
    }

    public kn setId(String string) {
        kn_1 a2;
        String b2 = string;
        kn_1 kn_12 = a2 = this;
        kn_12.copyOnWrite();
        sN.J((sN)kn_12.instance, b2);
        return a2;
    }
}

