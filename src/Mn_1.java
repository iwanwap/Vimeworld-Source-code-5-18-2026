/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Mn
 *  YM
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Mn_1
extends GeneratedMessageLite.Builder<YM, Mn>
implements Ja {
    public Mn setColor(int n2) {
        Mn_1 a2;
        int b2 = n2;
        Mn_1 mn_1 = a2 = this;
        mn_1.copyOnWrite();
        YM.J((YM)((YM)mn_1.instance), (int)b2);
        return a2;
    }

    @Override
    public float getValue() {
        Mn_1 a2;
        return ((YM)a2.instance).getValue();
    }

    public /* synthetic */ Mn_1(AN aN2) {
        Mn_1 b2 = aN2;
        Mn_1 a2 = this;
        a2();
    }

    public Mn clearValue() {
        Mn_1 a2;
        Mn_1 mn_1 = a2;
        mn_1.copyOnWrite();
        YM.J((YM)((YM)mn_1.instance));
        return a2;
    }

    private Mn_1() {
        super(YM.J());
        Mn_1 a2;
    }

    public Mn clearColor() {
        Mn_1 a2;
        Mn_1 mn_1 = a2;
        mn_1.copyOnWrite();
        YM.f((YM)((YM)mn_1.instance));
        return a2;
    }

    public Mn setValue(float f2) {
        Mn_1 a2;
        float b2 = f2;
        Mn_1 mn_1 = a2 = this;
        mn_1.copyOnWrite();
        YM.J((YM)((YM)mn_1.instance), (float)b2);
        return a2;
    }

    @Override
    public int getColor() {
        Mn_1 a2;
        return ((YM)a2.instance).getColor();
    }
}

