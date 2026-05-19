/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ln
 *  Rc
 *  ZN
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Ln_3
extends GeneratedMessageLite.Builder<ZN, Ln>
implements Rc {
    public Ln setHeightAnim(float f2) {
        Ln_3 a2;
        float b2 = f2;
        Ln_3 ln_3 = a2 = this;
        ln_3.copyOnWrite();
        ZN.f((ZN)((ZN)ln_3.instance), (float)b2);
        return a2;
    }

    private Ln_3() {
        super(ZN.f());
        Ln_3 a2;
    }

    public Ln clearColor() {
        Ln_3 a2;
        Ln_3 ln_3 = a2;
        ln_3.copyOnWrite();
        ZN.f((ZN)((ZN)ln_3.instance));
        return a2;
    }

    public Ln clearHeightAnim() {
        Ln_3 a2;
        Ln_3 ln_3 = a2;
        ln_3.copyOnWrite();
        ZN.C((ZN)((ZN)ln_3.instance));
        return a2;
    }

    public Ln setHeight(float f2) {
        Ln_3 a2;
        float b2 = f2;
        Ln_3 ln_3 = a2 = this;
        ln_3.copyOnWrite();
        ZN.J((ZN)((ZN)ln_3.instance), (float)b2);
        return a2;
    }

    public boolean hasHeightAnim() {
        Ln_3 a2;
        return ((ZN)a2.instance).hasHeightAnim();
    }

    public boolean hasColor() {
        Ln_3 a2;
        return ((ZN)a2.instance).hasColor();
    }

    public Ln clearHeightval() {
        Ln_3 a2;
        Ln_3 ln_3 = a2;
        ln_3.copyOnWrite();
        ZN.l((ZN)((ZN)ln_3.instance));
        return a2;
    }

    public gN getHeightvalCase() {
        Ln_3 a2;
        return ((ZN)a2.instance).getHeightvalCase();
    }

    public boolean hasHeight() {
        Ln_3 a2;
        return ((ZN)a2.instance).hasHeight();
    }

    public float getHeightAnim() {
        Ln_3 a2;
        return ((ZN)a2.instance).getHeightAnim();
    }

    public Ln setColor(int n2) {
        Ln_3 a2;
        int b2 = n2;
        Ln_3 ln_3 = a2 = this;
        ln_3.copyOnWrite();
        ZN.J((ZN)((ZN)ln_3.instance), (int)b2);
        return a2;
    }

    public int getColor() {
        Ln_3 a2;
        return ((ZN)a2.instance).getColor();
    }

    public /* synthetic */ Ln_3(AN aN2) {
        Ln_3 b2 = aN2;
        Ln_3 a2 = this;
        a2();
    }

    public Ln clearHeight() {
        Ln_3 a2;
        Ln_3 ln_3 = a2;
        ln_3.copyOnWrite();
        ZN.J((ZN)((ZN)ln_3.instance));
        return a2;
    }

    public float getHeight() {
        Ln_3 a2;
        return ((ZN)a2.instance).getHeight();
    }
}

