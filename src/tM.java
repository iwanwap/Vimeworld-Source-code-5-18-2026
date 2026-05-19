/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  ba
 */
import com.google.protobuf.GeneratedMessageLite;

public final class tM
extends GeneratedMessageLite.Builder<Bm, tM>
implements ba {
    public tM setReverse(boolean bl) {
        tM a2;
        boolean b2 = bl;
        tM tM2 = a2 = this;
        tM2.copyOnWrite();
        Bm.J((Bm)tM2.instance, b2);
        return a2;
    }

    public boolean getReverse() {
        tM a2;
        return ((Bm)a2.instance).getReverse();
    }

    public boolean hasTimerDuration() {
        tM a2;
        return ((Bm)a2.instance).hasTimerDuration();
    }

    public tM setTimerDuration(long a2) {
        tM b2;
        tM tM2 = b2;
        tM2.copyOnWrite();
        Bm.J((Bm)tM2.instance, a2);
        return b2;
    }

    public tM clearReverse() {
        tM a2;
        tM tM2 = a2;
        tM2.copyOnWrite();
        Bm.f((Bm)tM2.instance);
        return a2;
    }

    public boolean hasReverse() {
        tM a2;
        return ((Bm)a2.instance).hasReverse();
    }

    private tM() {
        super(Bm.J());
        tM a2;
    }

    public tM clearTimerDuration() {
        tM a2;
        tM tM2 = a2;
        tM2.copyOnWrite();
        Bm.J((Bm)tM2.instance);
        return a2;
    }

    public long getTimerDuration() {
        tM a2;
        return ((Bm)a2.instance).getTimerDuration();
    }

    public /* synthetic */ tM(AN aN2) {
        tM b2 = aN2;
        tM a2 = this;
        a2();
    }
}

