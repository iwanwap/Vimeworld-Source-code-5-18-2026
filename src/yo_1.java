/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Po
 *  yo
 */
import com.google.protobuf.GeneratedMessageLite;

public final class yo_1
extends GeneratedMessageLite.Builder<Po, yo>
implements qB {
    public /* synthetic */ yo_1(AN aN2) {
        yo_1 b2 = aN2;
        yo_1 a2 = this;
        a2();
    }

    @Override
    public int getColor() {
        yo_1 a2;
        return ((Po)a2.instance).getColor();
    }

    @Override
    public int getShake() {
        yo_1 a2;
        return ((Po)a2.instance).getShake();
    }

    public yo setColor(int n2) {
        yo_1 a2;
        int b2 = n2;
        yo_1 yo_12 = a2 = this;
        yo_12.copyOnWrite();
        Po.J((Po)((Po)yo_12.instance), (int)b2);
        return a2;
    }

    public yo clearFov() {
        yo_1 a2;
        yo_1 yo_12 = a2;
        yo_12.copyOnWrite();
        Po.J((Po)((Po)yo_12.instance));
        return a2;
    }

    public yo clearColor() {
        yo_1 a2;
        yo_1 yo_12 = a2;
        yo_12.copyOnWrite();
        Po.l((Po)((Po)yo_12.instance));
        return a2;
    }

    @Override
    public int getFov() {
        yo_1 a2;
        return ((Po)a2.instance).getFov();
    }

    public yo setFov(int n2) {
        yo_1 a2;
        int b2 = n2;
        yo_1 yo_12 = a2 = this;
        yo_12.copyOnWrite();
        Po.f((Po)((Po)yo_12.instance), (int)b2);
        return a2;
    }

    public yo clearShake() {
        yo_1 a2;
        yo_1 yo_12 = a2;
        yo_12.copyOnWrite();
        Po.f((Po)((Po)yo_12.instance));
        return a2;
    }

    private yo_1() {
        super(Po.J());
        yo_1 a2;
    }

    public yo setShake(int n2) {
        yo_1 a2;
        int b2 = n2;
        yo_1 yo_12 = a2 = this;
        yo_12.copyOnWrite();
        Po.l((Po)((Po)yo_12.instance), (int)b2);
        return a2;
    }
}

