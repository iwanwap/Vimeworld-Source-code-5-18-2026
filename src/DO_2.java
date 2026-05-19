/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Cn
 *  DO
 *  HM
 *  hO
 *  ln
 *  qa
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class DO_2
extends GeneratedMessageLite.Builder<hO, DO>
implements qa {
    public DO clearStopParticles() {
        DO_2 a2;
        DO_2 dO_2 = a2;
        dO_2.copyOnWrite();
        hO.l((hO)((hO)dO_2.instance));
        return a2;
    }

    public /* synthetic */ DO_2(AN aN2) {
        DO_2 b2 = aN2;
        DO_2 a2 = this;
        a2();
    }

    public DO mergePlayParticles(ln ln2) {
        DO_2 a2;
        DO_2 b2 = ln2;
        DO_2 dO_2 = a2 = this;
        dO_2.copyOnWrite();
        hO.f((hO)((hO)dO_2.instance), (ln)b2);
        return a2;
    }

    public DO setPlayParticles(ln ln2) {
        DO_2 a2;
        DO_2 b2 = ln2;
        DO_2 dO_2 = a2 = this;
        dO_2.copyOnWrite();
        hO.J((hO)((hO)dO_2.instance), (ln)b2);
        return a2;
    }

    private DO_2() {
        super(hO.f());
        DO_2 a2;
    }

    public boolean hasStopParticles() {
        DO_2 a2;
        return ((hO)a2.instance).hasStopParticles();
    }

    public DO clearPlayParticles() {
        DO_2 a2;
        DO_2 dO_2 = a2;
        dO_2.copyOnWrite();
        hO.f((hO)((hO)dO_2.instance));
        return a2;
    }

    public DO setStopParticles(no no2) {
        DO_2 a2;
        MessageLiteOrBuilder b2 = no2;
        DO_2 dO_2 = a2 = this;
        dO_2.copyOnWrite();
        hO.f((hO)((hO)dO_2.instance), (no)b2);
        return a2;
    }

    public DO clearAction() {
        DO_2 a2;
        DO_2 dO_2 = a2;
        dO_2.copyOnWrite();
        hO.J((hO)((hO)dO_2.instance));
        return a2;
    }

    public DO setStopParticles(BO bO2) {
        DO_2 a2;
        GeneratedMessageLite.Builder b2 = bO2;
        DO_2 dO_2 = a2 = this;
        dO_2.copyOnWrite();
        hO.f((hO)((hO)dO_2.instance), (no)((no)b2.build()));
        return a2;
    }

    public DO mergeStopParticles(no no2) {
        DO_2 a2;
        MessageLiteOrBuilder b2 = no2;
        DO_2 dO_2 = a2 = this;
        dO_2.copyOnWrite();
        hO.J((hO)((hO)dO_2.instance), (no)b2);
        return a2;
    }

    public DO setPlayParticles(Cn cn2) {
        DO_2 a2;
        DO_2 b2 = cn2;
        DO_2 dO_2 = a2 = this;
        dO_2.copyOnWrite();
        hO.J((hO)((hO)dO_2.instance), (ln)((ln)b2.build()));
        return a2;
    }

    public boolean hasPlayParticles() {
        DO_2 a2;
        return ((hO)a2.instance).hasPlayParticles();
    }

    public ln getPlayParticles() {
        DO_2 a2;
        return ((hO)a2.instance).getPlayParticles();
    }

    public no getStopParticles() {
        DO_2 a2;
        return ((hO)a2.instance).getStopParticles();
    }

    public HM getActionCase() {
        DO_2 a2;
        return ((hO)a2.instance).getActionCase();
    }
}

