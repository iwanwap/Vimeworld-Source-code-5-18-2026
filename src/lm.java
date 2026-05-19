/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Zm
 *  oa
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class lm
extends GeneratedMessageLite.Builder<Zm, lm>
implements oa {
    public lm clearId() {
        lm a2;
        lm lm2 = a2;
        lm2.copyOnWrite();
        Zm.J((Zm)((Zm)lm2.instance));
        return a2;
    }

    public ByteString getIdBytes() {
        lm a2;
        return ((Zm)a2.instance).getIdBytes();
    }

    public lm setId(String string) {
        lm a2;
        String b2 = string;
        lm lm2 = a2 = this;
        lm2.copyOnWrite();
        Zm.J((Zm)((Zm)lm2.instance), (String)b2);
        return a2;
    }

    public boolean hasId() {
        lm a2;
        return ((Zm)a2.instance).hasId();
    }

    private lm() {
        super(Zm.f());
        lm a2;
    }

    public String getId() {
        lm a2;
        return ((Zm)a2.instance).getId();
    }

    public /* synthetic */ lm(AN aN2) {
        lm b2 = aN2;
        lm a2 = this;
        a2();
    }

    public lm setKey(int n2) {
        lm a2;
        int b2 = n2;
        lm lm2 = a2 = this;
        lm2.copyOnWrite();
        Zm.J((Zm)((Zm)lm2.instance), (int)b2);
        return a2;
    }

    public lm setIdBytes(ByteString byteString) {
        lm a2;
        ByteString b2 = byteString;
        lm lm2 = a2 = this;
        lm2.copyOnWrite();
        Zm.J((Zm)((Zm)lm2.instance), (ByteString)b2);
        return a2;
    }

    public int getKey() {
        lm a2;
        return ((Zm)a2.instance).getKey();
    }

    public lm clearKey() {
        lm a2;
        lm lm2 = a2;
        lm2.copyOnWrite();
        Zm.f((Zm)((Zm)lm2.instance));
        return a2;
    }
}

