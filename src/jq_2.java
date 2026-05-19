/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AQ
 *  Qr
 *  ap
 *  mka
 *  oc
 *  rP
 *  vRa
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class jq_2
implements oc {
    private final List<Qr> I;

    /*
     * WARNING - void declaration
     */
    public void J(mr mr2, AQ aQ2) {
        int n2;
        rP b2;
        void a2;
        jq_2 jq_22 = this;
        a2.J(AQa.P, mka.g);
        b2 = b2.J();
        Matrix4f matrix4f = b2.J();
        Vector3f vector3f = new Vector3f();
        int n3 = jq_22.I.size() / yRa.d;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Object object = jq_22.I.get(n2 * yRa.d);
            Qr qr = jq_22.I.get(n2 * yRa.d + vRa.d);
            jq_2 c2 = jq_22.I.get(n2 * yRa.d + uqa.g);
            Object object2 = object = ap.J((Qr)object, (Qr)qr, (Qr)c2);
            object = b2.J((Vector3fc)object2, (Vector3f)object2);
            int n5 = uSa.E;
            while (n5 < yRa.d) {
                int n6;
                c2 = jq_22.I.get(n2 * yRa.d + n6);
                vector3f = matrix4f.transformPosition((float)((Qr)c2).I.A, (float)((Qr)c2).I.j, (float)((Qr)c2).I.J, vector3f);
                Object object3 = object;
                a2.J((double)vector3f.x, (double)vector3f.y, (double)vector3f.z).J((double)((Qr)c2).J, (double)((Qr)c2).A).J(object3.x, object3.y, object.z).M();
                n5 = ++n6;
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, float f5, float f6) {
        void f7;
        void b2;
        void c2;
        void d2;
        void e2;
        float f8 = f6;
        jq_2 a2 = this;
        a2.I.add(new Qr((float)e2, (float)d2, (float)c2, (float)b2, (float)f7));
    }

    public jq_2() {
        jq_2 a2;
        jq_2 jq_22 = a2;
        jq_22.I = new ArrayList<Qr>();
    }
}

