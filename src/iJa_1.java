/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  D
 *  JPa
 *  iJa
 *  pqa
 *  uKa
 *  vRa
 */
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;

public final class iJa_1
implements D {
    public final Vector3f translation;
    public static final iJa DEFAULT = new iJa_1(new Vector3f(), new Vector3f(), new Vector3f(pqa.r, pqa.r, pqa.r));
    public final Vector3f rotation;
    public final Vector3f scale;

    /*
     * WARNING - void declaration
     */
    public iJa_1(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        void b2;
        void c2;
        Vector3f d2 = vector3f3;
        iJa_1 a2 = this;
        iJa_1 iJa_12 = a2;
        a2.rotation = new Vector3f((ReadableVector3f)c2);
        iJa_12.translation = new Vector3f((ReadableVector3f)b2);
        a2.scale = new Vector3f(d2);
    }

    public void J() {
        iJa_1 a2;
        iJa_1 iJa_12 = a2;
        iJa_1 iJa_13 = a2;
        uKa.J((float)iJa_12.translation.x, (float)iJa_13.translation.y, (float)a2.translation.z);
        uKa.J((float)iJa_12.rotation.x, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)iJa_13.rotation.y, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)iJa_12.rotation.z, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.l((float)iJa_12.scale.x, (float)a2.scale.y, (float)a2.scale.z);
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (iJa_1)b2;
        if (!((iJa_1)a2).rotation.equals(((iJa_1)b2).rotation)) {
            return uSa.E != 0;
        }
        if (!((iJa_1)a2).scale.equals(((iJa_1)b2).scale)) {
            return uSa.E != 0;
        }
        return ((iJa_1)a2).translation.equals(((iJa_1)b2).translation);
    }

    public int hashCode() {
        iJa_1 iJa_12 = this;
        int a2 = iJa_12.rotation.hashCode();
        a2 = tua.U * a2 + iJa_12.translation.hashCode();
        a2 = tua.U * a2 + iJa_12.scale.hashCode();
        return a2;
    }
}

