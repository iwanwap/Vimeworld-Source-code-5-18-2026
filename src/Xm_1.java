/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Am
 *  Va
 *  Xm
 *  en
 *  rn
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Xm_1
extends GeneratedMessageLite.Builder<rn, Xm>
implements Va {
    public Xm mergeSound(en en2) {
        Xm_1 a2;
        Xm_1 b2 = en2;
        Xm_1 xm_1 = a2 = this;
        xm_1.copyOnWrite();
        rn.J((rn)((rn)xm_1.instance), (en)b2);
        return a2;
    }

    public Xm setSound(en en2) {
        Xm_1 a2;
        Xm_1 b2 = en2;
        Xm_1 xm_1 = a2 = this;
        xm_1.copyOnWrite();
        rn.f((rn)((rn)xm_1.instance), (en)b2);
        return a2;
    }

    private Xm_1() {
        super(rn.J());
        Xm_1 a2;
    }

    public en getSound() {
        Xm_1 a2;
        return ((rn)a2.instance).getSound();
    }

    public /* synthetic */ Xm_1(AN aN2) {
        Xm_1 b2 = aN2;
        Xm_1 a2 = this;
        a2();
    }

    public boolean hasSound() {
        Xm_1 a2;
        return ((rn)a2.instance).hasSound();
    }

    public Xm setSound(Am am) {
        Xm_1 a2;
        Xm_1 b2 = am;
        Xm_1 xm_1 = a2 = this;
        xm_1.copyOnWrite();
        rn.f((rn)((rn)xm_1.instance), (en)((en)b2.build()));
        return a2;
    }

    public Xm clearSound() {
        Xm_1 a2;
        Xm_1 xm_1 = a2;
        xm_1.copyOnWrite();
        rn.J((rn)((rn)xm_1.instance));
        return a2;
    }
}

