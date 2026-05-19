/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  vRa
 */
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class bP_3 {
    public static boolean l(Matrix4fc a2) {
        return bP_3.f(a2, AQa.P);
    }

    public static boolean f(Matrix4fc a2) {
        return bP_3.f(a2, Yqa.i);
    }

    private bP_3() {
        bP_3 a2;
    }

    public static boolean f(Matrix4fc matrix4fc, int n2) {
        Matrix4fc a2 = matrix4fc;
        int b2 = n2;
        if (bP_3.J(a2, b2)) {
            return vRa.d != 0;
        }
        if (a2 instanceof Matrix4f) {
            ((Matrix4f)a2).determineProperties();
            return bP_3.J(a2, b2);
        }
        return uSa.E != 0;
    }

    private static boolean J(Matrix4fc matrix4fc, int n2) {
        int b2 = n2;
        Matrix4fc a2 = matrix4fc;
        if ((a2.properties() & b2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(Matrix4fc a2) {
        return bP_3.f(a2, ERa.C);
    }
}

