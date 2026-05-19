/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CPa
 *  Fra
 *  Jb
 *  mQa
 */
import com.google.protobuf.GeneratedMessageLite;

public final class mQa_2
extends GeneratedMessageLite.Builder<Fra, mQa>
implements Jb {
    public /* synthetic */ mQa_2(CPa cPa2) {
        mQa_2 b2 = cPa2;
        mQa_2 a2 = this;
        a2();
    }

    public int getAudioSession() {
        mQa_2 a2;
        return ((Fra)a2.instance).getAudioSession();
    }

    public mQa setAudioSession(int n2) {
        mQa_2 a2;
        int b2 = n2;
        mQa_2 mQa_22 = a2 = this;
        mQa_22.copyOnWrite();
        Fra.J((Fra)((Fra)mQa_22.instance), (int)b2);
        return a2;
    }

    private mQa_2() {
        super(Fra.f());
        mQa_2 a2;
    }

    public mQa clearAudioSession() {
        mQa_2 a2;
        mQa_2 mQa_22 = a2;
        mQa_22.copyOnWrite();
        Fra.J((Fra)((Fra)mQa_22.instance));
        return a2;
    }
}

