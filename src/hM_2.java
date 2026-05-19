/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Pa
 *  hM
 *  wM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class hM_2
extends GeneratedMessageLite.Builder<wM, hM>
implements Pa {
    public /* synthetic */ hM_2(AN aN2) {
        hM_2 b2 = aN2;
        hM_2 a2 = this;
        a2();
    }

    public ByteString getIdBytes() {
        hM_2 a2;
        return ((wM)a2.instance).getIdBytes();
    }

    public hM setId(String string) {
        hM_2 a2;
        String b2 = string;
        hM_2 hM_22 = a2 = this;
        hM_22.copyOnWrite();
        wM.J((wM)((wM)hM_22.instance), (String)b2);
        return a2;
    }

    public String getId() {
        hM_2 a2;
        return ((wM)a2.instance).getId();
    }

    public hM clearId() {
        hM_2 a2;
        hM_2 hM_22 = a2;
        hM_22.copyOnWrite();
        wM.J((wM)((wM)hM_22.instance));
        return a2;
    }

    private hM_2() {
        super(wM.J());
        hM_2 a2;
    }

    public hM setIdBytes(ByteString byteString) {
        hM_2 a2;
        ByteString b2 = byteString;
        hM_2 hM_22 = a2 = this;
        hM_22.copyOnWrite();
        wM.J((wM)((wM)hM_22.instance), (ByteString)b2);
        return a2;
    }
}

