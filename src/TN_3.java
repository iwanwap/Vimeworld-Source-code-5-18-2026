/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  IB
 *  TN
 *  cN
 *  jm
 */
import com.google.protobuf.GeneratedMessageLite;

public final class TN_3
extends GeneratedMessageLite.Builder<jm, TN>
implements IB {
    public TN clearConfig() {
        TN_3 a2;
        TN_3 tN_3 = a2;
        tN_3.copyOnWrite();
        jm.J((jm)((jm)tN_3.instance));
        return a2;
    }

    private TN_3() {
        super(jm.f());
        TN_3 a2;
    }

    public TN setConfig(cN cN2) {
        TN_3 a2;
        TN_3 b2 = cN2;
        TN_3 tN_3 = a2 = this;
        tN_3.copyOnWrite();
        jm.J((jm)((jm)tN_3.instance), (cN)b2);
        return a2;
    }

    public /* synthetic */ TN_3(AN aN2) {
        TN_3 b2 = aN2;
        TN_3 a2 = this;
        a2();
    }

    public TN setConfig(Qm qm) {
        TN_3 a2;
        GeneratedMessageLite.Builder b2 = qm;
        TN_3 tN_3 = a2 = this;
        tN_3.copyOnWrite();
        jm.J((jm)((jm)tN_3.instance), (cN)((cN)b2.build()));
        return a2;
    }

    public boolean hasConfig() {
        TN_3 a2;
        return ((jm)a2.instance).hasConfig();
    }

    public TN mergeConfig(cN cN2) {
        TN_3 a2;
        TN_3 b2 = cN2;
        TN_3 tN_3 = a2 = this;
        tN_3.copyOnWrite();
        jm.f((jm)((jm)tN_3.instance), (cN)b2);
        return a2;
    }

    public cN getConfig() {
        TN_3 a2;
        return ((jm)a2.instance).getConfig();
    }
}

