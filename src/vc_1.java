/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  WSa
 *  pqa
 *  vRa
 */
import java.io.Serializable;
import javax.vecmath.Point2f;
import javax.vecmath.Point3f;
import javax.vecmath.Tuple2f;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector2f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;

public final class vc_1 {
    private static final Vector3f[] A;
    private static final Vector2f[] I;

    /*
     * WARNING - void declaration
     */
    public static void J(Point3f[] point3fArray, Point2f[] point2fArray, Vector3f vector3f, Vector4f vector4f) {
        void a2;
        Vector3f vector3f2;
        void b2;
        float f2;
        Object d2 = point2fArray;
        Point3f[] c2 = point3fArray;
        Serializable serializable = c2[uSa.E];
        Serializable serializable2 = c2[vRa.d];
        Serializable serializable3 = c2[uqa.g];
        Vector3f vector3f3 = A[uSa.E];
        Vector3f vector3f4 = A[vRa.d];
        vector3f3.sub((Tuple3f)serializable2, (Tuple3f)serializable);
        vector3f4.sub((Tuple3f)serializable3, (Tuple3f)serializable);
        d2 = d2[uSa.E];
        serializable = d2[vRa.d];
        serializable2 = d2[uqa.g];
        serializable3 = I[uSa.E];
        Vector2f vector2f = I[vRa.d];
        Serializable serializable4 = serializable3;
        ((Tuple2f)serializable4).sub((Tuple2f)serializable, (Tuple2f)d2);
        vector2f.sub((Tuple2f)serializable2, (Tuple2f)d2);
        d2 = A[uqa.g];
        serializable = A[yRa.d];
        float f3 = ((Vector2f)serializable4).y * vector2f.x - ((Vector2f)serializable3).x * vector2f.y;
        if (Math.abs(f2) <= WSa.B) {
            f3 = pqa.r;
        }
        Object object = d2;
        ((Tuple3f)object).scale(((Vector2f)serializable3).y, vector3f4);
        ((Tuple3f)object).scaleAdd(-vector2f.y, vector3f3, (Tuple3f)d2);
        ((Tuple3f)object).scale(pqa.r / f3);
        Serializable serializable5 = serializable;
        ((Tuple3f)serializable5).scale(vector2f.x, vector3f3);
        ((Tuple3f)serializable).scaleAdd(-((Vector2f)serializable3).x, vector3f4, (Tuple3f)serializable);
        ((Tuple3f)serializable5).scale(pqa.r / f3);
        if (((Vector3f)d2).lengthSquared() > WSa.B) {
            ((Vector3f)d2).normalize();
        }
        if (((Vector3f)serializable).lengthSquared() > WSa.B) {
            ((Vector3f)serializable).normalize();
        }
        if (b2.lengthSquared() <= WSa.B) {
            b2.cross(vector3f3, vector3f4);
        }
        b2.normalize();
        Vector3f vector3f5 = vector3f2 = A[AQa.P];
        vector3f5.cross((Vector3f)b2, (Vector3f)d2);
        float f4 = vector3f5.dot((Vector3f)serializable) < JPa.N ? vqa.T : pqa.r;
        Object object2 = d2;
        ((Tuple3f)object2).scaleAdd(-b2.dot((Vector3f)object2), (Tuple3f)b2, (Tuple3f)d2);
        if (((Vector3f)object2).lengthSquared() > WSa.B) {
            ((Vector3f)d2).normalize();
        }
        Object object3 = d2;
        a2.set(((Vector3f)object3).x, ((Vector3f)object3).y, ((Vector3f)d2).z, f4);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, Vector4f vector4f) {
        void a2;
        void v19;
        void b2;
        void c2;
        void d2;
        float f20;
        void v5;
        void n2;
        void o2;
        void p;
        void m2;
        float f21;
        float e2;
        void f22;
        void i2;
        void g;
        float j2;
        float h;
        float s;
        void l2;
        float q;
        float r2;
        float f23 = f2;
        f2 = f10;
        float k2 = f23;
        p -= k2;
        o2 -= r2;
        n2 -= q;
        m2 -= k2;
        r2 = l2 - r2;
        q = s - q;
        l2 = h - j2;
        s = g - i2;
        j2 = f22 - j2;
        i2 = e2 - i2;
        h = s * j2 - l2 * i2;
        if (Math.abs(f21) <= WSa.B) {
            h = pqa.r;
        }
        g = (m2 * s + p * -i2) * h;
        f22 = (r2 * s + o2 * -i2) * h;
        s = (q * s + n2 * -i2) * h;
        void v2 = g;
        void v3 = f22;
        float f24 = s;
        i2 = v2 * v2 + v3 * v3 + f24 * f24;
        if (v5 > WSa.B) {
            e2 = (float)Math.sqrt((double)i2);
            g /= e2;
            f22 /= e2;
            s /= e2;
        }
        e2 = (p * j2 + m2 * -l2) * h;
        i2 = (o2 * j2 + r2 * -l2) * h;
        l2 = (n2 * j2 + q * -l2) * h;
        float f25 = e2;
        void v7 = i2;
        void v8 = l2;
        j2 = f25 * f25 + v7 * v7 + v8 * v8;
        if (f20 > WSa.B) {
            h = (float)Math.sqrt(j2);
            e2 /= h;
            i2 /= h;
            l2 /= h;
        }
        void v10 = d2;
        void v11 = c2;
        void v12 = b2;
        if (v10 * v10 + v11 * v11 + v12 * v12 <= WSa.B) {
            d2 = o2 * q - n2 * r2;
            c2 = n2 * m2 - p * q;
            b2 = p * r2 - o2 * m2;
        }
        void v13 = d2;
        void v14 = c2;
        void v15 = b2;
        h = (float)Math.sqrt((double)(v13 * v13 + v14 * v14 + v15 * v15));
        r2 = (c2 /= h) * s - (b2 /= h) * f22;
        r2 = r2 * e2 + (q = b2 * g - (d2 /= h) * s) * i2 + (p = d2 * f22 - c2 * g) * l2 < JPa.N ? vqa.T : pqa.r;
        q = -(d2 * g + c2 * f22 + b2 * s);
        void v16 = g += d2 * q;
        void v17 = f22 += c2 * q;
        float f26 = s += b2 * q;
        q = v16 * v16 + v17 * v17 + f26 * f26;
        if (v19 > WSa.B) {
            q = (float)Math.sqrt(q);
            g /= q;
            f22 /= q;
            s /= q;
        }
        a2.set((float)g, (float)f22, s, r2);
    }

    public vc_1() {
        vc_1 a2;
    }

    static {
        Vector2f[] vector2fArray = new Vector2f[uqa.g];
        vector2fArray[uSa.E] = new Vector2f();
        vector2fArray[vRa.d] = new Vector2f();
        I = vector2fArray;
        Vector3f[] vector3fArray = new Vector3f[tTa.h];
        vector3fArray[uSa.E] = new Vector3f();
        vector3fArray[vRa.d] = new Vector3f();
        vector3fArray[uqa.g] = new Vector3f();
        vector3fArray[yRa.d] = new Vector3f();
        vector3fArray[AQa.P] = new Vector3f();
        A = vector3fArray;
    }
}

