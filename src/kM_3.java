/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  TC
 *  Xo
 *  kM
 *  pm
 */
import com.google.protobuf.GeneratedMessageLite;

public final class kM_3
extends GeneratedMessageLite.Builder<JO, kM>
implements TC {
    public kM mergeBox(pm pm2) {
        kM_3 a2;
        kM_3 b2 = pm2;
        kM_3 kM_32 = a2 = this;
        kM_32.copyOnWrite();
        JO.J((JO)kM_32.instance, (pm)b2);
        return a2;
    }

    public boolean hasBox() {
        kM_3 a2;
        return ((JO)a2.instance).hasBox();
    }

    public /* synthetic */ kM_3(AN aN2) {
        kM_3 b2 = aN2;
        kM_3 a2 = this;
        a2();
    }

    public kM setBox(pm pm2) {
        kM_3 a2;
        kM_3 b2 = pm2;
        kM_3 kM_32 = a2 = this;
        kM_32.copyOnWrite();
        JO.f((JO)kM_32.instance, (pm)b2);
        return a2;
    }

    public kM setBox(Xo xo2) {
        kM_3 a2;
        kM_3 b2 = xo2;
        kM_3 kM_32 = a2 = this;
        kM_32.copyOnWrite();
        JO.f((JO)kM_32.instance, (pm)b2.build());
        return a2;
    }

    private kM_3() {
        super(JO.f());
        kM_3 a2;
    }

    public kM clearBox() {
        kM_3 a2;
        kM_3 kM_32 = a2;
        kM_32.copyOnWrite();
        JO.J((JO)kM_32.instance);
        return a2;
    }

    public pm getBox() {
        kM_3 a2;
        return ((JO)a2.instance).getBox();
    }
}

