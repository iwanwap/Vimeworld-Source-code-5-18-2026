/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  LM
 *  ja
 *  jo
 *  nO
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class LM_3
extends GeneratedMessageLite.Builder<jo, LM>
implements ja {
    /*
     * WARNING - void declaration
     */
    public LM setPoints(int n2, float f2) {
        void b2;
        LM_3 a2;
        float c2 = f2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance), (int)b2, (float)c2);
        return a2;
    }

    public float getPoints(int n2) {
        int b2 = n2;
        LM_3 a2 = this;
        return ((jo)a2.instance).getPoints(b2);
    }

    public List<Integer> getColorPositionsList() {
        LM_3 a2;
        return Collections.unmodifiableList(((jo)a2.instance).getColorPositionsList());
    }

    public LM addColors(int n2) {
        LM_3 a2;
        int b2 = n2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.l((jo)((jo)lM_3.instance), (int)b2);
        return a2;
    }

    private LM_3() {
        super(jo.f());
        LM_3 a2;
    }

    public int getPointsCount() {
        LM_3 a2;
        return ((jo)a2.instance).getPointsCount();
    }

    public int getColorsCount() {
        LM_3 a2;
        return ((jo)a2.instance).getColorsCount();
    }

    public LM clearPoints() {
        LM_3 a2;
        LM_3 lM_3 = a2;
        lM_3.copyOnWrite();
        jo.l((jo)((jo)lM_3.instance));
        return a2;
    }

    public nO getDrawMode() {
        LM_3 a2;
        return ((jo)a2.instance).getDrawMode();
    }

    public List<Integer> getColorsList() {
        LM_3 a2;
        return Collections.unmodifiableList(((jo)a2.instance).getColorsList());
    }

    public LM addAllColorPositions(Iterable<? extends Integer> iterable) {
        LM_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance), (Iterable)b2);
        return a2;
    }

    public int getColorPositions(int n2) {
        int b2 = n2;
        LM_3 a2 = this;
        return ((jo)a2.instance).getColorPositions(b2);
    }

    public LM setDrawModeValue(int n2) {
        LM_3 a2;
        int b2 = n2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance), (int)b2);
        return a2;
    }

    public List<Float> getPointsList() {
        LM_3 a2;
        return Collections.unmodifiableList(((jo)a2.instance).getPointsList());
    }

    public LM addAllColors(Iterable<? extends Integer> iterable) {
        LM_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.l((jo)((jo)lM_3.instance), (Iterable)b2);
        return a2;
    }

    public int getColorPositionsCount() {
        LM_3 a2;
        return ((jo)a2.instance).getColorPositionsCount();
    }

    public LM clearDrawMode() {
        LM_3 a2;
        LM_3 lM_3 = a2;
        lM_3.copyOnWrite();
        jo.f((jo)((jo)lM_3.instance));
        return a2;
    }

    public boolean hasDrawMode() {
        LM_3 a2;
        return ((jo)a2.instance).hasDrawMode();
    }

    public LM setDrawMode(nO nO2) {
        LM_3 a2;
        LM_3 b2 = nO2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance), (nO)b2);
        return a2;
    }

    public LM clearColorPositions() {
        LM_3 a2;
        LM_3 lM_3 = a2;
        lM_3.copyOnWrite();
        jo.d((jo)((jo)lM_3.instance));
        return a2;
    }

    public int getDrawModeValue() {
        LM_3 a2;
        return ((jo)a2.instance).getDrawModeValue();
    }

    public LM clearColors() {
        LM_3 a2;
        LM_3 lM_3 = a2;
        lM_3.copyOnWrite();
        jo.C((jo)((jo)lM_3.instance));
        return a2;
    }

    public /* synthetic */ LM_3(AN aN2) {
        LM_3 b2 = aN2;
        LM_3 a2 = this;
        a2();
    }

    public LM addPoints(float f2) {
        LM_3 a2;
        float b2 = f2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance), (float)b2);
        return a2;
    }

    public boolean hasWidth() {
        LM_3 a2;
        return ((jo)a2.instance).hasWidth();
    }

    public LM addColorPositions(int n2) {
        LM_3 a2;
        int b2 = n2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.f((jo)((jo)lM_3.instance), (int)b2);
        return a2;
    }

    public LM addAllPoints(Iterable<? extends Float> iterable) {
        LM_3 a2;
        Iterable<? extends Float> b2 = iterable;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.f((jo)((jo)lM_3.instance), (Iterable)b2);
        return a2;
    }

    public LM setWidth(float f2) {
        LM_3 a2;
        float b2 = f2;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.f((jo)((jo)lM_3.instance), (float)b2);
        return a2;
    }

    public int getColors(int n2) {
        int b2 = n2;
        LM_3 a2 = this;
        return ((jo)a2.instance).getColors(b2);
    }

    public float getWidth() {
        LM_3 a2;
        return ((jo)a2.instance).getWidth();
    }

    /*
     * WARNING - void declaration
     */
    public LM setColorPositions(int n2, int n3) {
        void b2;
        LM_3 a2;
        int c2 = n3;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.f((jo)((jo)lM_3.instance), (int)b2, (int)c2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public LM setColors(int n2, int n3) {
        void b2;
        LM_3 a2;
        int c2 = n3;
        LM_3 lM_3 = a2 = this;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance), (int)b2, (int)c2);
        return a2;
    }

    public LM clearWidth() {
        LM_3 a2;
        LM_3 lM_3 = a2;
        lM_3.copyOnWrite();
        jo.J((jo)((jo)lM_3.instance));
        return a2;
    }
}

