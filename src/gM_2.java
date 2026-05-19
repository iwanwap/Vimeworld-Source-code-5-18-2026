/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AM
 *  AN
 *  Mm
 *  PM
 *  ea
 *  gM
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class gM_2
extends GeneratedMessageLite.Builder<PM, gM>
implements ea {
    public int getColor() {
        gM_2 a2;
        return ((PM)a2.instance).getColor();
    }

    private gM_2() {
        super(PM.J());
        gM_2 a2;
    }

    public List<Float> getScaleList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getScaleList());
    }

    public gM clearLocAnim() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.C((PM)((PM)gM_22.instance));
        return a2;
    }

    public gM addScaleAnim(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.l((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gM setLoc(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.f((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }

    public gM clearAngleAnimSmart() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.e((PM)((PM)gM_22.instance));
        return a2;
    }

    public gM addAllLoc(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.J((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gM setAngle(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.d((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }

    public /* synthetic */ gM_2(AN aN2) {
        gM_2 b2 = aN2;
        gM_2 a2 = this;
        a2();
    }

    public int getLocCount() {
        gM_2 a2;
        return ((PM)a2.instance).getLocCount();
    }

    public int getAngleAnimSmartCount() {
        gM_2 a2;
        return ((PM)a2.instance).getAngleAnimSmartCount();
    }

    public AM getRadiusvalCase() {
        gM_2 a2;
        return ((PM)a2.instance).getRadiusvalCase();
    }

    public gM clearColor() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.G((PM)((PM)gM_22.instance));
        return a2;
    }

    public List<Float> getScaleAnimList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getScaleAnimList());
    }

    public boolean hasColorAnim() {
        gM_2 a2;
        return ((PM)a2.instance).hasColorAnim();
    }

    public int getScaleAnimCount() {
        gM_2 a2;
        return ((PM)a2.instance).getScaleAnimCount();
    }

    public List<Float> getAngleAnimList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getAngleAnimList());
    }

    public gM addAllAngleAnimSmart(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.f((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    public int getScaleCount() {
        gM_2 a2;
        return ((PM)a2.instance).getScaleCount();
    }

    public gM clearAngle() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.F((PM)((PM)gM_22.instance));
        return a2;
    }

    public gM addLocAnim(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.M((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public gM clearScaleAnim() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.M((PM)((PM)gM_22.instance));
        return a2;
    }

    public gM clearAngleAnim() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.A((PM)((PM)gM_22.instance));
        return a2;
    }

    public float getRadius() {
        gM_2 a2;
        return ((PM)a2.instance).getRadius();
    }

    public gM clearRadiusval() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.i((PM)((PM)gM_22.instance));
        return a2;
    }

    public gM clearScale() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.d((PM)((PM)gM_22.instance));
        return a2;
    }

    public Mm getColorvalCase() {
        gM_2 a2;
        return ((PM)a2.instance).getColorvalCase();
    }

    public gM addScale(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.C((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public gM addAllAngle(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.e((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    public gM clearLoc() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.k((PM)((PM)gM_22.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gM setAngleAnim(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.J((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }

    public gM addAllAngleAnim(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.d((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    public int getColorAnim() {
        gM_2 a2;
        return ((PM)a2.instance).getColorAnim();
    }

    public gM addAllScaleAnim(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.l((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    public float getLoc(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getLoc(b2);
    }

    public int getAngleCount() {
        gM_2 a2;
        return ((PM)a2.instance).getAngleCount();
    }

    public gM clearRadiusAnim() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.J((PM)((PM)gM_22.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gM setScaleAnim(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.M((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }

    public float getAngleAnimSmart(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getAngleAnimSmart(b2);
    }

    public gM setColorAnim(int n2) {
        gM_2 a2;
        int b2 = n2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.J((PM)((PM)gM_22.instance), (int)b2);
        return a2;
    }

    public float getAngleAnim(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getAngleAnim(b2);
    }

    public List<Float> getLocAnimList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getLocAnimList());
    }

    public boolean hasColor() {
        gM_2 a2;
        return ((PM)a2.instance).hasColor();
    }

    public int getAngleAnimCount() {
        gM_2 a2;
        return ((PM)a2.instance).getAngleAnimCount();
    }

    public gM addAllScale(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.C((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    public List<Float> getLocList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getLocList());
    }

    public gM addAngleAnimSmart(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.f((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public float getRadiusAnim() {
        gM_2 a2;
        return ((PM)a2.instance).getRadiusAnim();
    }

    public float getAngle(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getAngle(b2);
    }

    public gM addAngle(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.A((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public gM clearColorAnim() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.f((PM)((PM)gM_22.instance));
        return a2;
    }

    public int getLocAnimCount() {
        gM_2 a2;
        return ((PM)a2.instance).getLocAnimCount();
    }

    public gM addAngleAnim(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.d((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public gM addLoc(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.i((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public float getLocAnim(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getLocAnim(b2);
    }

    /*
     * WARNING - void declaration
     */
    public gM setAngleAnimSmart(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.e((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }

    public List<Float> getAngleList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getAngleList());
    }

    public float getScale(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getScale(b2);
    }

    public float getScaleAnim(int n2) {
        int b2 = n2;
        gM_2 a2 = this;
        return ((PM)a2.instance).getScaleAnim(b2);
    }

    public boolean hasRadius() {
        gM_2 a2;
        return ((PM)a2.instance).hasRadius();
    }

    public gM setRadiusAnim(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.e((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public gM setRadius(float f2) {
        gM_2 a2;
        float b2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.J((PM)((PM)gM_22.instance), (float)b2);
        return a2;
    }

    public boolean hasRadiusAnim() {
        gM_2 a2;
        return ((PM)a2.instance).hasRadiusAnim();
    }

    public List<Float> getAngleAnimSmartList() {
        gM_2 a2;
        return Collections.unmodifiableList(((PM)a2.instance).getAngleAnimSmartList());
    }

    public gM setColor(int n2) {
        gM_2 a2;
        int b2 = n2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.f((PM)((PM)gM_22.instance), (int)b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gM setLocAnim(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.l((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }

    public gM clearRadius() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.D((PM)((PM)gM_22.instance));
        return a2;
    }

    public gM addAllLocAnim(Iterable<? extends Float> iterable) {
        gM_2 a2;
        Iterable<? extends Float> b2 = iterable;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.M((PM)((PM)gM_22.instance), (Iterable)b2);
        return a2;
    }

    public gM clearColorval() {
        gM_2 a2;
        gM_2 gM_22 = a2;
        gM_22.copyOnWrite();
        PM.l((PM)((PM)gM_22.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public gM setScale(int n2, float f2) {
        void b2;
        gM_2 a2;
        float c2 = f2;
        gM_2 gM_22 = a2 = this;
        gM_22.copyOnWrite();
        PM.C((PM)((PM)gM_22.instance), (int)b2, (float)c2);
        return a2;
    }
}

