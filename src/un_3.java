/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  La
 *  Wn
 *  un
 */
import com.google.protobuf.GeneratedMessageLite;

public final class un_3
extends GeneratedMessageLite.Builder<Wn, un>
implements La {
    public /* synthetic */ un_3(AN aN2) {
        un_3 b2 = aN2;
        un_3 a2 = this;
        a2();
    }

    public un clearSize() {
        un_3 a2;
        un_3 un_32 = a2;
        un_32.copyOnWrite();
        Wn.J((Wn)((Wn)un_32.instance));
        return a2;
    }

    private un_3() {
        super(Wn.f());
        un_3 a2;
    }

    public int getSize() {
        un_3 a2;
        return ((Wn)a2.instance).getSize();
    }

    public float getProgress() {
        un_3 a2;
        return ((Wn)a2.instance).getProgress();
    }

    public un setProgress(float f2) {
        un_3 a2;
        float b2 = f2;
        un_3 un_32 = a2 = this;
        un_32.copyOnWrite();
        Wn.J((Wn)((Wn)un_32.instance), (float)b2);
        return a2;
    }

    public un clearProgress() {
        un_3 a2;
        un_3 un_32 = a2;
        un_32.copyOnWrite();
        Wn.f((Wn)((Wn)un_32.instance));
        return a2;
    }

    public un setSize(int n2) {
        un_3 a2;
        int b2 = n2;
        un_3 un_32 = a2 = this;
        un_32.copyOnWrite();
        Wn.J((Wn)((Wn)un_32.instance), (int)b2);
        return a2;
    }

    public boolean hasProgress() {
        un_3 a2;
        return ((Wn)a2.instance).hasProgress();
    }
}

