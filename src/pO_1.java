/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EN
 *  Fn
 *  QM
 *  gn
 *  nA
 *  pO
 */
import com.google.protobuf.GeneratedMessageLite;

public final class pO_1
extends GeneratedMessageLite.Builder<QM, pO>
implements nA {
    public pO setKind(Fn fn2) {
        pO_1 a2;
        pO_1 b2 = fn2;
        pO_1 pO_12 = a2 = this;
        pO_12.copyOnWrite();
        QM.J((QM)((QM)pO_12.instance), (Fn)b2);
        return a2;
    }

    public pO setKindValue(int n2) {
        pO_1 a2;
        int b2 = n2;
        pO_1 pO_12 = a2 = this;
        pO_12.copyOnWrite();
        QM.J((QM)((QM)pO_12.instance), (int)b2);
        return a2;
    }

    public pO setEntity(gn gn2) {
        pO_1 a2;
        pO_1 b2 = gn2;
        pO_1 pO_12 = a2 = this;
        pO_12.copyOnWrite();
        QM.J((QM)((QM)pO_12.instance), (gn)b2);
        return a2;
    }

    public to getDataCase() {
        pO_1 a2;
        return ((QM)a2.instance).getDataCase();
    }

    public pO clearKind() {
        pO_1 a2;
        pO_1 pO_12 = a2;
        pO_12.copyOnWrite();
        QM.J((QM)((QM)pO_12.instance));
        return a2;
    }

    public pO mergeEntity(gn gn2) {
        pO_1 a2;
        pO_1 b2 = gn2;
        pO_1 pO_12 = a2 = this;
        pO_12.copyOnWrite();
        QM.f((QM)((QM)pO_12.instance), (gn)b2);
        return a2;
    }

    public Fn getKind() {
        pO_1 a2;
        return ((QM)a2.instance).getKind();
    }

    public gn getEntity() {
        pO_1 a2;
        return ((QM)a2.instance).getEntity();
    }

    public /* synthetic */ pO_1(AN aN2) {
        pO_1 b2 = aN2;
        pO_1 a2 = this;
        a2();
    }

    public boolean hasEntity() {
        pO_1 a2;
        return ((QM)a2.instance).hasEntity();
    }

    public pO clearData() {
        pO_1 a2;
        pO_1 pO_12 = a2;
        pO_12.copyOnWrite();
        QM.l((QM)((QM)pO_12.instance));
        return a2;
    }

    private pO_1() {
        super(QM.J());
        pO_1 a2;
    }

    public int getKindValue() {
        pO_1 a2;
        return ((QM)a2.instance).getKindValue();
    }

    public pO setEntity(EN eN2) {
        pO_1 a2;
        pO_1 b2 = eN2;
        pO_1 pO_12 = a2 = this;
        pO_12.copyOnWrite();
        QM.J((QM)((QM)pO_12.instance), (gn)((gn)b2.build()));
        return a2;
    }

    public pO clearEntity() {
        pO_1 a2;
        pO_1 pO_12 = a2;
        pO_12.copyOnWrite();
        QM.f((QM)((QM)pO_12.instance));
        return a2;
    }
}

