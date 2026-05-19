/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  fm
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class xo
extends GeneratedMessageLite.Builder<fm, xo>
implements hA {
    public xo setImpelY(float f2) {
        xo a2;
        float b2 = f2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance), (float)b2);
        return a2;
    }

    @Override
    public boolean hasDrag() {
        xo a2;
        return ((fm)a2.instance).hasDrag();
    }

    public xo clearDrag() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance));
        return a2;
    }

    @Override
    public float getImpelX() {
        xo a2;
        return ((fm)a2.instance).getImpelX();
    }

    public xo setImpelXZOnSides(boolean bl) {
        xo a2;
        boolean b2 = bl;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.f((fm)((fm)xo2.instance), (boolean)b2);
        return a2;
    }

    @Override
    public int getAnimationTicks() {
        xo a2;
        return ((fm)a2.instance).getAnimationTicks();
    }

    @Override
    public Un getImpelType() {
        xo a2;
        return ((fm)a2.instance).getImpelType();
    }

    @Override
    public List<Float> getCoordsList() {
        xo a2;
        return Collections.unmodifiableList(((fm)a2.instance).getCoordsList());
    }

    public xo setAnimationTicks(int n2) {
        xo a2;
        int b2 = n2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.f((fm)((fm)xo2.instance), (int)b2);
        return a2;
    }

    public xo setImpelType(Un un) {
        xo a2;
        Un b2 = un;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance), (Un)b2);
        return a2;
    }

    public xo setImpelX(float f2) {
        xo a2;
        float b2 = f2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.f((fm)((fm)xo2.instance), (float)b2);
        return a2;
    }

    public xo addCoords(float f2) {
        xo a2;
        float b2 = f2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.l((fm)((fm)xo2.instance), (float)b2);
        return a2;
    }

    @Override
    public boolean hasImpelYOnTop() {
        xo a2;
        return ((fm)a2.instance).hasImpelYOnTop();
    }

    @Override
    public int getCoordsCount() {
        xo a2;
        return ((fm)a2.instance).getCoordsCount();
    }

    @Override
    public boolean hasImpelXZOnSides() {
        xo a2;
        return ((fm)a2.instance).hasImpelXZOnSides();
    }

    @Override
    public int getImpelTypeValue() {
        xo a2;
        return ((fm)a2.instance).getImpelTypeValue();
    }

    public xo clearCoords() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.M((fm)((fm)xo2.instance));
        return a2;
    }

    public /* synthetic */ xo(AN aN2) {
        xo b2 = aN2;
        xo a2 = this;
        a2();
    }

    @Override
    public float getImpelY() {
        xo a2;
        return ((fm)a2.instance).getImpelY();
    }

    public xo clearImpelX() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.f((fm)((fm)xo2.instance));
        return a2;
    }

    @Override
    public float getCoords(int n2) {
        int b2 = n2;
        xo a2 = this;
        return ((fm)a2.instance).getCoords(b2);
    }

    @Override
    public boolean hasImpelType() {
        xo a2;
        return ((fm)a2.instance).hasImpelType();
    }

    @Override
    public boolean hasImpelZ() {
        xo a2;
        return ((fm)a2.instance).hasImpelZ();
    }

    @Override
    public boolean hasAnimationTicks() {
        xo a2;
        return ((fm)a2.instance).hasAnimationTicks();
    }

    public xo clearImpelXZOnSides() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.l((fm)((fm)xo2.instance));
        return a2;
    }

    public xo addAllCoords(Iterable<? extends Float> iterable) {
        xo a2;
        Iterable<? extends Float> b2 = iterable;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance), (Iterable)b2);
        return a2;
    }

    public xo setImpelZ(float f2) {
        xo a2;
        float b2 = f2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.C((fm)((fm)xo2.instance), (float)b2);
        return a2;
    }

    @Override
    public boolean hasImpelX() {
        xo a2;
        return ((fm)a2.instance).hasImpelX();
    }

    public xo clearImpelY() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.A((fm)((fm)xo2.instance));
        return a2;
    }

    @Override
    public boolean getImpelXZOnSides() {
        xo a2;
        return ((fm)a2.instance).getImpelXZOnSides();
    }

    public xo clearImpelType() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.e((fm)((fm)xo2.instance));
        return a2;
    }

    @Override
    public boolean getImpelYOnTop() {
        xo a2;
        return ((fm)a2.instance).getImpelYOnTop();
    }

    @Override
    public float getImpelZ() {
        xo a2;
        return ((fm)a2.instance).getImpelZ();
    }

    public xo setImpelTypeValue(int n2) {
        xo a2;
        int b2 = n2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance), (int)b2);
        return a2;
    }

    public xo clearImpelYOnTop() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.d((fm)((fm)xo2.instance));
        return a2;
    }

    public xo setDrag(boolean bl) {
        xo a2;
        boolean b2 = bl;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance), (boolean)b2);
        return a2;
    }

    @Override
    public boolean getDrag() {
        xo a2;
        return ((fm)a2.instance).getDrag();
    }

    public xo clearAnimationTicks() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.i((fm)((fm)xo2.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public xo setCoords(int n2, float f2) {
        void b2;
        xo a2;
        float c2 = f2;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.J((fm)((fm)xo2.instance), (int)b2, (float)c2);
        return a2;
    }

    @Override
    public boolean hasImpelY() {
        xo a2;
        return ((fm)a2.instance).hasImpelY();
    }

    public xo clearImpelZ() {
        xo a2;
        xo xo2 = a2;
        xo2.copyOnWrite();
        fm.C((fm)((fm)xo2.instance));
        return a2;
    }

    public xo setImpelYOnTop(boolean bl) {
        xo a2;
        boolean b2 = bl;
        xo xo2 = a2 = this;
        xo2.copyOnWrite();
        fm.l((fm)((fm)xo2.instance), (boolean)b2);
        return a2;
    }

    private xo() {
        super(fm.J());
        xo a2;
    }
}

