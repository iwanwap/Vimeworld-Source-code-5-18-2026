/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Vn
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Vn_2
extends GeneratedMessageLite.Builder<do, Vn>
implements Oa {
    public Vn clearX() {
        Vn_2 a2;
        Vn_2 vn_2 = a2;
        vn_2.copyOnWrite();
        do.J((do)vn_2.instance);
        return a2;
    }

    @Override
    public float getZ() {
        Vn_2 a2;
        return ((do)a2.instance).getZ();
    }

    public Vn setY(float f2) {
        Vn_2 a2;
        float b2 = f2;
        Vn_2 vn_2 = a2 = this;
        vn_2.copyOnWrite();
        do.f((do)vn_2.instance, b2);
        return a2;
    }

    @Override
    public float getY() {
        Vn_2 a2;
        return ((do)a2.instance).getY();
    }

    public Vn clearY() {
        Vn_2 a2;
        Vn_2 vn_2 = a2;
        vn_2.copyOnWrite();
        do.f((do)vn_2.instance);
        return a2;
    }

    private Vn_2() {
        super(do.J());
        Vn_2 a2;
    }

    public Vn setX(float f2) {
        Vn_2 a2;
        float b2 = f2;
        Vn_2 vn_2 = a2 = this;
        vn_2.copyOnWrite();
        do.l((do)vn_2.instance, b2);
        return a2;
    }

    public Vn clearZ() {
        Vn_2 a2;
        Vn_2 vn_2 = a2;
        vn_2.copyOnWrite();
        do.l((do)vn_2.instance);
        return a2;
    }

    @Override
    public float getX() {
        Vn_2 a2;
        return ((do)a2.instance).getX();
    }

    public Vn setZ(float f2) {
        Vn_2 a2;
        float b2 = f2;
        Vn_2 vn_2 = a2 = this;
        vn_2.copyOnWrite();
        do.J((do)vn_2.instance, b2);
        return a2;
    }

    public /* synthetic */ Vn_2(AN aN2) {
        Vn_2 b2 = aN2;
        Vn_2 a2 = this;
        a2();
    }
}

