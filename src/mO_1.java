/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Pc
 *  eo
 *  mO
 */
import com.google.protobuf.GeneratedMessageLite;

public final class mO_1
extends GeneratedMessageLite.Builder<eo, mO>
implements Pc {
    public mO clearColor() {
        mO_1 a2;
        mO_1 mO_12 = a2;
        mO_12.copyOnWrite();
        eo.J((eo)((eo)mO_12.instance));
        return a2;
    }

    public int getColor() {
        mO_1 a2;
        return ((eo)a2.instance).getColor();
    }

    public boolean hasHeight() {
        mO_1 a2;
        return ((eo)a2.instance).hasHeight();
    }

    public mO clearHeight() {
        mO_1 a2;
        mO_1 mO_12 = a2;
        mO_12.copyOnWrite();
        eo.f((eo)((eo)mO_12.instance));
        return a2;
    }

    private mO_1() {
        super(eo.J());
        mO_1 a2;
    }

    public mO setColor(int n2) {
        mO_1 a2;
        int b2 = n2;
        mO_1 mO_12 = a2 = this;
        mO_12.copyOnWrite();
        eo.J((eo)((eo)mO_12.instance), (int)b2);
        return a2;
    }

    public float getHeight() {
        mO_1 a2;
        return ((eo)a2.instance).getHeight();
    }

    public mO setHeight(float f2) {
        mO_1 a2;
        float b2 = f2;
        mO_1 mO_12 = a2 = this;
        mO_12.copyOnWrite();
        eo.J((eo)((eo)mO_12.instance), (float)b2);
        return a2;
    }

    public /* synthetic */ mO_1(AN aN2) {
        mO_1 b2 = aN2;
        mO_1 a2 = this;
        a2();
    }
}

