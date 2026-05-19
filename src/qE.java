/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  XTa
 *  aPa
 *  ig
 *  vRa
 */
import javax.vecmath.Point2f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qE {
    private final ig k;
    private final float j;
    private final Point2f J;
    private final Point2f A;
    private final float I;

    public Point2f f() {
        qE a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public qE(float f2, float f3, String string, Point2f point2f, Point2f point2f2) {
        Point2f f4;
        void b2;
        void c2;
        void d2;
        void e2;
        qE a2;
        qE qE2 = point2f3;
        Point2f point2f3 = point2f2;
        qE qE3 = a2 = qE2;
        qE qE4 = a2;
        a2.I = e2;
        qE4.j = d2;
        qE4.k = qE.J((String)c2);
        qE3.A = b2;
        qE3.J = f4;
    }

    public static /* synthetic */ Point2f f(qE a2) {
        return a2.J;
    }

    public static qE J(String[] stringArray) {
        String[] stringArray2 = stringArray;
        if (stringArray2.length == Yqa.i) {
            float f2 = Float.parseFloat(stringArray2[AQa.P]);
            float f3 = Float.parseFloat(stringArray2[tTa.h]);
            float f4 = Float.parseFloat(stringArray2[uua.p]);
            float a2 = Float.parseFloat(stringArray2[XTa.W]);
            return new qE(Float.parseFloat(stringArray2[vRa.d]), Float.parseFloat(stringArray2[uqa.g]), stringArray2[yRa.d], new Point2f(f2, f3), new Point2f(f4, a2));
        }
        if (stringArray2.length == AQa.P) {
            return new qE(Float.parseFloat(stringArray2[vRa.d]), Float.parseFloat(stringArray2[uqa.g]), stringArray2[yRa.d]);
        }
        if (stringArray2.length == yRa.d) {
            return new qE(Float.parseFloat(stringArray2[vRa.d]), Float.parseFloat(stringArray2[uqa.g]));
        }
        return null;
    }

    public Point2f J() {
        qE a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public qE(float f2, float f3, String string) {
        void b2;
        void c2;
        String d2 = string;
        qE a2 = this;
        a2((float)c2, (float)b2, d2, null, null);
    }

    public float f() {
        qE a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public qE(float f2, float f3) {
        void b2;
        float c2 = f3;
        qE a2 = this;
        a2((float)b2, c2, gQa.l);
    }

    public ig J() {
        qE a2;
        return a2.k;
    }

    public static /* synthetic */ Point2f J(qE a2) {
        return a2.A;
    }

    public static /* synthetic */ float f(qE a2) {
        return a2.j;
    }

    public static ig J(String a2) {
        if (a2.equals(vqa.Ja)) {
            return ig.CONSTANT;
        }
        if (a2.equals(aPa.B)) {
            return ig.BEZIER;
        }
        return ig.LINEAR;
    }

    /*
     * WARNING - void declaration
     */
    public float J(float f2, qE qE2) {
        void b2;
        qE c2 = qE2;
        qE a2 = this;
        return a2.k.interpolate(a2, (float)b2, c2);
    }

    public static /* synthetic */ float J(qE a2) {
        return a2.I;
    }

    public float J() {
        qE a2;
        return a2.j;
    }
}

