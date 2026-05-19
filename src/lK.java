/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Wl
 */
import com.google.protobuf.GeneratedMessageLite;

public final class lK
extends GeneratedMessageLite.Builder<Wl, lK>
implements W {
    public /* synthetic */ lK(AN aN2) {
        lK b2 = aN2;
        lK a2 = this;
        a2();
    }

    @Override
    public long getDuration() {
        lK a2;
        return ((Wl)a2.instance).getDuration();
    }

    public lK setDuration(long a2) {
        lK b2;
        lK lK2 = b2;
        lK2.copyOnWrite();
        Wl.J((Wl)((Wl)lK2.instance), (long)a2);
        return b2;
    }

    @Override
    public boolean hasDuration() {
        lK a2;
        return ((Wl)a2.instance).hasDuration();
    }

    public lK clearDuration() {
        lK a2;
        lK lK2 = a2;
        lK2.copyOnWrite();
        Wl.J((Wl)((Wl)lK2.instance));
        return a2;
    }

    private lK() {
        super(Wl.f());
        lK a2;
    }
}

