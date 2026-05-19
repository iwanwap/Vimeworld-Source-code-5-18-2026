/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ho
 *  NN
 *  qn
 *  rA
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Ho_1
extends GeneratedMessageLite.Builder<Pm, Ho>
implements rA {
    public boolean hasStart() {
        Ho_1 a2;
        return ((Pm)a2.instance).hasStart();
    }

    public Ho setFinish(NN nN) {
        Ho_1 a2;
        Ho_1 b2 = nN;
        Ho_1 ho_1 = a2 = this;
        ho_1.copyOnWrite();
        Pm.l((Pm)ho_1.instance, (NN)b2);
        return a2;
    }

    public boolean hasFinish() {
        Ho_1 a2;
        return ((Pm)a2.instance).hasFinish();
    }

    public Ho setStart(qn qn2) {
        Ho_1 a2;
        Ho_1 b2 = qn2;
        Ho_1 ho_1 = a2 = this;
        ho_1.copyOnWrite();
        Pm.f((Pm)ho_1.instance, (NN)b2.build());
        return a2;
    }

    public /* synthetic */ Ho_1(AN aN2) {
        Ho_1 b2 = aN2;
        Ho_1 a2 = this;
        a2();
    }

    public Ho setFinish(qn qn2) {
        Ho_1 a2;
        Ho_1 b2 = qn2;
        Ho_1 ho_1 = a2 = this;
        ho_1.copyOnWrite();
        Pm.l((Pm)ho_1.instance, (NN)b2.build());
        return a2;
    }

    public Ho mergeFinish(NN nN) {
        Ho_1 a2;
        Ho_1 b2 = nN;
        Ho_1 ho_1 = a2 = this;
        ho_1.copyOnWrite();
        Pm.C((Pm)ho_1.instance, (NN)b2);
        return a2;
    }

    public Ho clearFinish() {
        Ho_1 a2;
        Ho_1 ho_1 = a2;
        ho_1.copyOnWrite();
        Pm.f((Pm)ho_1.instance);
        return a2;
    }

    public NN getStart() {
        Ho_1 a2;
        return ((Pm)a2.instance).getStart();
    }

    private Ho_1() {
        super(Pm.f());
        Ho_1 a2;
    }

    public Ho setStart(NN nN) {
        Ho_1 a2;
        Ho_1 b2 = nN;
        Ho_1 ho_1 = a2 = this;
        ho_1.copyOnWrite();
        Pm.f((Pm)ho_1.instance, (NN)b2);
        return a2;
    }

    public Ho mergeStart(NN nN) {
        Ho_1 a2;
        Ho_1 b2 = nN;
        Ho_1 ho_1 = a2 = this;
        ho_1.copyOnWrite();
        Pm.J((Pm)ho_1.instance, (NN)b2);
        return a2;
    }

    public Ho clearStart() {
        Ho_1 a2;
        Ho_1 ho_1 = a2;
        ho_1.copyOnWrite();
        Pm.J((Pm)ho_1.instance);
        return a2;
    }

    public NN getFinish() {
        Ho_1 a2;
        return ((Pm)a2.instance).getFinish();
    }
}

