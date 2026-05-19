/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GMa
 *  Ina
 *  QMa
 *  YNa
 *  oNa
 *  pqa
 *  vRa
 */
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public final class Ina_2
implements Runnable {
    public final /* synthetic */ QMa I;

    @Override
    public void run() {
        Ina_2 a2;
        SoundSystemConfig.setLogger((SoundSystemLogger)new GMa((Ina)a2));
        Ina_2 ina_2 = a2;
        Sg.J(YNa.J((Ina)ina_2));
        QMa.J((QMa)ina_2.I, vRa.d != 0);
        QMa.J((QMa)a2.I).setMasterVolume(pqa.r);
        QMa.J().info(QMa.J(), SPa.P);
    }

    public static /* synthetic */ void J(Ina a2) {
        QMa qMa2 = a2.I;
        QMa qMa3 = a2.I;
        qMa3.getClass();
        QMa.J((QMa)qMa2, (oNa)new oNa(qMa3, null));
    }

    public Ina_2(QMa qMa2) {
        Ina_2 b2 = qMa2;
        Ina_2 a2 = this;
        a2.I = b2;
    }
}

