/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Qo
 *  Ya
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class fN
extends GeneratedMessageLite.Builder<Qo, fN>
implements Ya {
    public boolean hasHasMore() {
        fN a2;
        return ((Qo)a2.instance).hasHasMore();
    }

    public /* synthetic */ fN(AN aN2) {
        fN b2 = aN2;
        fN a2 = this;
        a2();
    }

    public fN clearRemote() {
        fN a2;
        fN fN2 = a2;
        fN2.copyOnWrite();
        Qo.C((Qo)((Qo)fN2.instance));
        return a2;
    }

    public boolean getRemote() {
        fN a2;
        return ((Qo)a2.instance).getRemote();
    }

    public boolean hasRemote() {
        fN a2;
        return ((Qo)a2.instance).hasRemote();
    }

    public fN clearId() {
        fN a2;
        fN fN2 = a2;
        fN2.copyOnWrite();
        Qo.l((Qo)((Qo)fN2.instance));
        return a2;
    }

    private fN() {
        super(Qo.J());
        fN a2;
    }

    public fN setHasMore(boolean bl) {
        fN a2;
        boolean b2 = bl;
        fN fN2 = a2 = this;
        fN2.copyOnWrite();
        Qo.J((Qo)((Qo)fN2.instance), (boolean)b2);
        return a2;
    }

    public boolean hasValue() {
        fN a2;
        return ((Qo)a2.instance).hasValue();
    }

    public fN setRemote(boolean bl) {
        fN a2;
        boolean b2 = bl;
        fN fN2 = a2 = this;
        fN2.copyOnWrite();
        Qo.f((Qo)((Qo)fN2.instance), (boolean)b2);
        return a2;
    }

    public fN clearValue() {
        fN a2;
        fN fN2 = a2;
        fN2.copyOnWrite();
        Qo.J((Qo)((Qo)fN2.instance));
        return a2;
    }

    public boolean getHasMore() {
        fN a2;
        return ((Qo)a2.instance).getHasMore();
    }

    public int getId() {
        fN a2;
        return ((Qo)a2.instance).getId();
    }

    public ByteString getValue() {
        fN a2;
        return ((Qo)a2.instance).getValue();
    }

    public fN clearHasMore() {
        fN a2;
        fN fN2 = a2;
        fN2.copyOnWrite();
        Qo.f((Qo)((Qo)fN2.instance));
        return a2;
    }

    public fN setValue(ByteString byteString) {
        fN a2;
        ByteString b2 = byteString;
        fN fN2 = a2 = this;
        fN2.copyOnWrite();
        Qo.J((Qo)((Qo)fN2.instance), (ByteString)b2);
        return a2;
    }

    public fN setId(int n2) {
        fN a2;
        int b2 = n2;
        fN fN2 = a2 = this;
        fN2.copyOnWrite();
        Qo.J((Qo)((Qo)fN2.instance), (int)b2);
        return a2;
    }
}

