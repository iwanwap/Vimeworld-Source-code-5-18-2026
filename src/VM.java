/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ba
 *  qO
 */
import com.google.protobuf.GeneratedMessageLite;

public final class VM
extends GeneratedMessageLite.Builder<qO, VM>
implements Ba {
    public int getBorderColor() {
        VM a2;
        return ((qO)a2.instance).getBorderColor();
    }

    public VM clearBarColor() {
        VM a2;
        VM vM = a2;
        vM.copyOnWrite();
        qO.f((qO)((qO)vM.instance));
        return a2;
    }

    public float getProgress() {
        VM a2;
        return ((qO)a2.instance).getProgress();
    }

    public VM clearBorderColor() {
        VM a2;
        VM vM = a2;
        vM.copyOnWrite();
        qO.l((qO)((qO)vM.instance));
        return a2;
    }

    public int getBarColor() {
        VM a2;
        return ((qO)a2.instance).getBarColor();
    }

    public VM setBorderColor(int n2) {
        VM a2;
        int b2 = n2;
        VM vM = a2 = this;
        vM.copyOnWrite();
        qO.f((qO)((qO)vM.instance), (int)b2);
        return a2;
    }

    public boolean hasProgress() {
        VM a2;
        return ((qO)a2.instance).hasProgress();
    }

    public VM setProgress(float f2) {
        VM a2;
        float b2 = f2;
        VM vM = a2 = this;
        vM.copyOnWrite();
        qO.J((qO)((qO)vM.instance), (float)b2);
        return a2;
    }

    public /* synthetic */ VM(AN aN) {
        VM b2 = aN;
        VM a2 = this;
        a2();
    }

    public boolean hasBorderColor() {
        VM a2;
        return ((qO)a2.instance).hasBorderColor();
    }

    public VM clearProgress() {
        VM a2;
        VM vM = a2;
        vM.copyOnWrite();
        qO.J((qO)((qO)vM.instance));
        return a2;
    }

    private VM() {
        super(qO.J());
        VM a2;
    }

    public VM setBarColor(int n2) {
        VM a2;
        int b2 = n2;
        VM vM = a2 = this;
        vM.copyOnWrite();
        qO.J((qO)((qO)vM.instance), (int)b2);
        return a2;
    }
}

