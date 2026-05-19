/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Em
 *  Qn
 *  SC
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Em_3
extends GeneratedMessageLite.Builder<Qn, Em>
implements SC {
    public Em clearId() {
        Em_3 a2;
        Em_3 em_3 = a2;
        em_3.copyOnWrite();
        Qn.J((Qn)((Qn)em_3.instance));
        return a2;
    }

    public /* synthetic */ Em_3(AN aN2) {
        Em_3 b2 = aN2;
        Em_3 a2 = this;
        a2();
    }

    private Em_3() {
        super(Qn.f());
        Em_3 a2;
    }

    public ByteString getIdBytes() {
        Em_3 a2;
        return ((Qn)a2.instance).getIdBytes();
    }

    public String getId() {
        Em_3 a2;
        return ((Qn)a2.instance).getId();
    }

    public Em setIdBytes(ByteString byteString) {
        Em_3 a2;
        ByteString b2 = byteString;
        Em_3 em_3 = a2 = this;
        em_3.copyOnWrite();
        Qn.J((Qn)((Qn)em_3.instance), (ByteString)b2);
        return a2;
    }

    public Em setId(String string) {
        Em_3 a2;
        String b2 = string;
        Em_3 em_3 = a2 = this;
        em_3.copyOnWrite();
        Qn.J((Qn)((Qn)em_3.instance), (String)b2);
        return a2;
    }
}

