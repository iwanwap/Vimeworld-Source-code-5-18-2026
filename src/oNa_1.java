/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ina
 *  QMa
 *  vRa
 */
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

public final class oNa_1
extends SoundSystem {
    public final /* synthetic */ QMa I;

    private oNa_1(QMa qMa2) {
        oNa_1 b2 = qMa2;
        oNa_1 a2 = this;
        a2.I = b2;
    }

    public /* synthetic */ oNa_1(QMa qMa2, Ina ina) {
        oNa_1 c2 = qMa2;
        oNa_1 b2 = this;
        b2((QMa)c2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean playing(String string) {
        oNa_1 oNa_12 = this;
        Object b2 = SoundSystemConfig.THREAD_SYNC;
        synchronized (b2) {
            Object object;
            int n2;
            Source a2;
            if (oNa_12.soundLibrary == null) {
                return uSa.E != 0;
            }
            a2 = oNa_12.soundLibrary.getSources().get(a2);
            if (a2 == null) {
                n2 = uSa.E;
                object = b2;
            } else if (a2.playing() || a2.paused() || a2.preLoad) {
                n2 = vRa.d;
                object = b2;
            } else {
                n2 = uSa.E;
                object = b2;
            }
            // ** MonitorExit[v1] (shouldn't be in output)
            return n2 != 0;
        }
    }
}

