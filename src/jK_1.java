/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  aSa
 *  bk
 *  jsa
 *  vj
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import javax.vecmath.Tuple3d;
import javax.vecmath.Vector3d;

public final class jK_1
extends bk {
    private float I;

    public jK_1(float f2) {
        float b2 = f2;
        jK_1 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, double d2, double d3, double d4) {
        void v1;
        void a2;
        void b2;
        void c2;
        void d5;
        Object e2;
        jK_1 jK_12 = this;
        Object object = e2 = new Vector3d(d5.z);
        ((Tuple3d)object).sub(new Vector3d((double)c2, (double)b2, (double)a2));
        if (((Vector3d)object).length() <= aSa.V) {
            v1 = d5;
            ((Tuple3d)e2).set(aSa.V, aSa.V, aSa.V);
        } else {
            ((Vector3d)e2).normalize();
            ((Tuple3d)e2).scale(jK_12.I);
            v1 = d5;
        }
        v1.N.set((Tuple3d)e2);
    }

    public JsonElement J() {
        jK_1 a2;
        return new JsonPrimitive(a2.I < JPa.N ? jsa.Ga : uSa.P);
    }
}

