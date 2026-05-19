/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  OL
 *  w
 *  zk
 */
import com.google.protobuf.GeneratedMessageLite;

public final class zk_1
extends GeneratedMessageLite.Builder<OL, zk>
implements w {
    private zk_1() {
        super(OL.f());
        zk_1 a2;
    }

    public long getDuration() {
        zk_1 a2;
        return ((OL)a2.instance).getDuration();
    }

    public zk clearDuration() {
        zk_1 a2;
        zk_1 zk_12 = a2;
        zk_12.copyOnWrite();
        OL.J((OL)((OL)zk_12.instance));
        return a2;
    }

    public zk setDuration(long a2) {
        zk_1 b2;
        zk_1 zk_12 = b2;
        zk_12.copyOnWrite();
        OL.J((OL)((OL)zk_12.instance), (long)a2);
        return b2;
    }

    public boolean hasDuration() {
        zk_1 a2;
        return ((OL)a2.instance).hasDuration();
    }

    public /* synthetic */ zk_1(AN aN2) {
        zk_1 b2 = aN2;
        zk_1 a2 = this;
        a2();
    }
}

