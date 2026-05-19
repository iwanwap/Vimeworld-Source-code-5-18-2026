/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Fo
 *  nb
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Fo_3
extends GeneratedMessageLite.Builder<mo, Fo>
implements nb {
    public Fo clearKey() {
        Fo_3 a2;
        Fo_3 fo_3 = a2;
        fo_3.copyOnWrite();
        mo.J((mo)fo_3.instance);
        return a2;
    }

    public int getKey() {
        Fo_3 a2;
        return ((mo)a2.instance).getKey();
    }

    public /* synthetic */ Fo_3(AN aN2) {
        Fo_3 b2 = aN2;
        Fo_3 a2 = this;
        a2();
    }

    public Fo setKey(int n2) {
        Fo_3 a2;
        int b2 = n2;
        Fo_3 fo_3 = a2 = this;
        fo_3.copyOnWrite();
        mo.J((mo)fo_3.instance, b2);
        return a2;
    }

    private Fo_3() {
        super(mo.f());
        Fo_3 a2;
    }

    public String getId() {
        Fo_3 a2;
        return ((mo)a2.instance).getId();
    }

    public Fo setIdBytes(ByteString byteString) {
        Fo_3 a2;
        ByteString b2 = byteString;
        Fo_3 fo_3 = a2 = this;
        fo_3.copyOnWrite();
        mo.J((mo)fo_3.instance, b2);
        return a2;
    }

    public Fo clearId() {
        Fo_3 a2;
        Fo_3 fo_3 = a2;
        fo_3.copyOnWrite();
        mo.f((mo)fo_3.instance);
        return a2;
    }

    public boolean hasId() {
        Fo_3 a2;
        return ((mo)a2.instance).hasId();
    }

    public ByteString getIdBytes() {
        Fo_3 a2;
        return ((mo)a2.instance).getIdBytes();
    }

    public Fo setId(String string) {
        Fo_3 a2;
        String b2 = string;
        Fo_3 fo_3 = a2 = this;
        fo_3.copyOnWrite();
        mo.J((mo)fo_3.instance, b2);
        return a2;
    }
}

