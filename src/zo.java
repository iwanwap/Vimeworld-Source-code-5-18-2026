/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EO
 *  qN
 *  qd
 *  tO
 */
import com.google.protobuf.GeneratedMessageLite;

public final class zo
extends GeneratedMessageLite.Builder<EO, zo>
implements qd {
    public zo setPlayAnimation(tO tO2) {
        zo a2;
        zo b2 = tO2;
        zo zo2 = a2 = this;
        zo2.copyOnWrite();
        EO.J((EO)((EO)zo2.instance), (tO)b2);
        return a2;
    }

    public tO getPlayAnimation() {
        zo a2;
        return ((EO)a2.instance).getPlayAnimation();
    }

    public zo mergePlayAnimation(tO tO2) {
        zo a2;
        zo b2 = tO2;
        zo zo2 = a2 = this;
        zo2.copyOnWrite();
        EO.f((EO)((EO)zo2.instance), (tO)b2);
        return a2;
    }

    public boolean getStopAnimation() {
        zo a2;
        return ((EO)a2.instance).getStopAnimation();
    }

    public aM getActionCase() {
        zo a2;
        return ((EO)a2.instance).getActionCase();
    }

    public zo clearAction() {
        zo a2;
        zo zo2 = a2;
        zo2.copyOnWrite();
        EO.C((EO)((EO)zo2.instance));
        return a2;
    }

    public int getId() {
        zo a2;
        return ((EO)a2.instance).getId();
    }

    public zo setStopAnimation(boolean bl) {
        zo a2;
        boolean b2 = bl;
        zo zo2 = a2 = this;
        zo2.copyOnWrite();
        EO.J((EO)((EO)zo2.instance), (boolean)b2);
        return a2;
    }

    public zo setPlayAnimation(qN qN2) {
        zo a2;
        zo b2 = qN2;
        zo zo2 = a2 = this;
        zo2.copyOnWrite();
        EO.J((EO)((EO)zo2.instance), (tO)((tO)b2.build()));
        return a2;
    }

    private zo() {
        super(EO.f());
        zo a2;
    }

    public zo clearId() {
        zo a2;
        zo zo2 = a2;
        zo2.copyOnWrite();
        EO.J((EO)((EO)zo2.instance));
        return a2;
    }

    public boolean hasStopAnimation() {
        zo a2;
        return ((EO)a2.instance).hasStopAnimation();
    }

    public zo clearStopAnimation() {
        zo a2;
        zo zo2 = a2;
        zo2.copyOnWrite();
        EO.f((EO)((EO)zo2.instance));
        return a2;
    }

    public boolean hasPlayAnimation() {
        zo a2;
        return ((EO)a2.instance).hasPlayAnimation();
    }

    public zo clearPlayAnimation() {
        zo a2;
        zo zo2 = a2;
        zo2.copyOnWrite();
        EO.l((EO)((EO)zo2.instance));
        return a2;
    }

    public zo setId(int n2) {
        zo a2;
        int b2 = n2;
        zo zo2 = a2 = this;
        zo2.copyOnWrite();
        EO.J((EO)((EO)zo2.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ zo(AN aN2) {
        zo b2 = aN2;
        zo a2 = this;
        a2();
    }
}

