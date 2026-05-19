/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  DA
 *  qM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class qM_3
extends GeneratedMessageLite.Builder<nm, qM>
implements DA {
    public qM setId(String string) {
        qM_3 a2;
        String b2 = string;
        qM_3 qM_32 = a2 = this;
        qM_32.copyOnWrite();
        nm.J((nm)qM_32.instance, b2);
        return a2;
    }

    public qM clearId() {
        qM_3 a2;
        qM_3 qM_32 = a2;
        qM_32.copyOnWrite();
        nm.J((nm)qM_32.instance);
        return a2;
    }

    public String getId() {
        qM_3 a2;
        return ((nm)a2.instance).getId();
    }

    public ByteString getIdBytes() {
        qM_3 a2;
        return ((nm)a2.instance).getIdBytes();
    }

    public qM setIdBytes(ByteString byteString) {
        qM_3 a2;
        ByteString b2 = byteString;
        qM_3 qM_32 = a2 = this;
        qM_32.copyOnWrite();
        nm.J((nm)qM_32.instance, b2);
        return a2;
    }

    private qM_3() {
        super(nm.f());
        qM_3 a2;
    }

    public /* synthetic */ qM_3(AN aN2) {
        qM_3 b2 = aN2;
        qM_3 a2 = this;
        a2();
    }
}

