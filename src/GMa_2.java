/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ina
 *  QMa
 *  XTa
 */
import paulscode.sound.SoundSystemLogger;

public final class GMa_2
extends SoundSystemLogger {
    public final /* synthetic */ Ina I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void errorMessage(String string, String string2, int n2) {
        String d2 = string2;
        GMa_2 b2 = this;
        if (!d2.isEmpty()) {
            void c2;
            QMa.J().error(new StringBuilder().insert(3 & 4, Ira.Q).append((String)c2).append(XTa.Z).toString());
            QMa.J().error(d2);
        }
    }

    public GMa_2(Ina ina2) {
        GMa_2 b2 = ina2;
        GMa_2 a2 = this;
        a2.I = b2;
    }

    @Override
    public void importantMessage(String string, int n2) {
        String c2 = string;
        GMa_2 b2 = this;
        if (!c2.isEmpty()) {
            QMa.J().warn(c2);
        }
    }

    @Override
    public void message(String string, int n2) {
        String c2 = string;
        GMa_2 b2 = this;
        if (!c2.isEmpty()) {
            QMa.J().info(c2);
        }
    }
}

