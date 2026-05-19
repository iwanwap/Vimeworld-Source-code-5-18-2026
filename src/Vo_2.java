/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Vo
 *  em
 */
import com.google.protobuf.GeneratedMessageLite;

public final class Vo_2
extends GeneratedMessageLite.Builder<em, Vo>
implements za {
    public Vo setOffsetRight(int n2) {
        Vo_2 a2;
        int b2 = n2;
        Vo_2 vo_2 = a2 = this;
        vo_2.copyOnWrite();
        em.l((em)((em)vo_2.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasTextureScale() {
        Vo_2 a2;
        return ((em)a2.instance).hasTextureScale();
    }

    @Override
    public boolean hasOffsetLeft() {
        Vo_2 a2;
        return ((em)a2.instance).hasOffsetLeft();
    }

    public Vo setOffsetBottom(int n2) {
        Vo_2 a2;
        int b2 = n2;
        Vo_2 vo_2 = a2 = this;
        vo_2.copyOnWrite();
        em.C((em)((em)vo_2.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasOffsetBottom() {
        Vo_2 a2;
        return ((em)a2.instance).hasOffsetBottom();
    }

    @Override
    public float getTextureScale() {
        Vo_2 a2;
        return ((em)a2.instance).getTextureScale();
    }

    public Vo clearOffsetLeft() {
        Vo_2 a2;
        Vo_2 vo_2 = a2;
        vo_2.copyOnWrite();
        em.l((em)((em)vo_2.instance));
        return a2;
    }

    public Vo setTextureScale(float f2) {
        Vo_2 a2;
        float b2 = f2;
        Vo_2 vo_2 = a2 = this;
        vo_2.copyOnWrite();
        em.J((em)((em)vo_2.instance), (float)b2);
        return a2;
    }

    private Vo_2() {
        super(em.J());
        Vo_2 a2;
    }

    public /* synthetic */ Vo_2(AN aN2) {
        Vo_2 b2 = aN2;
        Vo_2 a2 = this;
        a2();
    }

    @Override
    public int getOffsetRight() {
        Vo_2 a2;
        return ((em)a2.instance).getOffsetRight();
    }

    public Vo clearTextureScale() {
        Vo_2 a2;
        Vo_2 vo_2 = a2;
        vo_2.copyOnWrite();
        em.C((em)((em)vo_2.instance));
        return a2;
    }

    public Vo clearOffsetBottom() {
        Vo_2 a2;
        Vo_2 vo_2 = a2;
        vo_2.copyOnWrite();
        em.J((em)((em)vo_2.instance));
        return a2;
    }

    @Override
    public int getOffsetLeft() {
        Vo_2 a2;
        return ((em)a2.instance).getOffsetLeft();
    }

    @Override
    public boolean hasOffsetRight() {
        Vo_2 a2;
        return ((em)a2.instance).hasOffsetRight();
    }

    @Override
    public int getOffsetBottom() {
        Vo_2 a2;
        return ((em)a2.instance).getOffsetBottom();
    }

    @Override
    public int getOffsetTop() {
        Vo_2 a2;
        return ((em)a2.instance).getOffsetTop();
    }

    public Vo clearOffsetTop() {
        Vo_2 a2;
        Vo_2 vo_2 = a2;
        vo_2.copyOnWrite();
        em.d((em)((em)vo_2.instance));
        return a2;
    }

    public Vo clearOffsetRight() {
        Vo_2 a2;
        Vo_2 vo_2 = a2;
        vo_2.copyOnWrite();
        em.f((em)((em)vo_2.instance));
        return a2;
    }

    public Vo setOffsetLeft(int n2) {
        Vo_2 a2;
        int b2 = n2;
        Vo_2 vo_2 = a2 = this;
        vo_2.copyOnWrite();
        em.f((em)((em)vo_2.instance), (int)b2);
        return a2;
    }

    public Vo setOffsetTop(int n2) {
        Vo_2 a2;
        int b2 = n2;
        Vo_2 vo_2 = a2 = this;
        vo_2.copyOnWrite();
        em.J((em)((em)vo_2.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasOffsetTop() {
        Vo_2 a2;
        return ((em)a2.instance).hasOffsetTop();
    }
}

