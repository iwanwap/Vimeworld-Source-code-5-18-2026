/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CLa
 *  D
 *  Rja
 *  Yra
 *  vRa
 */
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

public final class GJa
implements D {
    public final boolean shade;
    public final Vector3f positionFrom;
    public final Vector3f positionTo;
    public final Map<DZ, Rja> mapFaces;
    public final CLa partRotation;

    private void J() {
        Iterator<Map.Entry<DZ, Rja>> iterator;
        GJa gJa = this;
        Iterator<Map.Entry<DZ, Rja>> iterator2 = iterator = gJa.mapFaces.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<DZ, Rja> a2 = iterator.next();
            float[] fArray = gJa.J((DZ)((Object)a2.getKey()));
            ((Rja)a2.getValue()).blockFaceUV.J(fArray);
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private float[] J(DZ dZ) {
        void var1_5;
        void b22 = var1_5;
        GJa a2 = this;
        switch (Oja.I[b22.ordinal()]) {
            case 1: 
            case 2: {
                float[] fArray = new float[AQa.P];
                fArray[uSa.E] = a2.positionFrom.x;
                fArray[vRa.d] = a2.positionFrom.z;
                fArray[uqa.g] = a2.positionTo.x;
                fArray[yRa.d] = a2.positionTo.z;
                float[] b22 = fArray;
                return fArray;
            }
            case 3: 
            case 4: {
                float[] fArray = new float[AQa.P];
                fArray[uSa.E] = a2.positionFrom.x;
                fArray[vRa.d] = Yra.i - a2.positionTo.y;
                fArray[uqa.g] = a2.positionTo.x;
                fArray[yRa.d] = Yra.i - a2.positionFrom.y;
                float[] b22 = fArray;
                return fArray;
            }
            case 5: 
            case 6: {
                float[] fArray = new float[AQa.P];
                fArray[uSa.E] = a2.positionFrom.z;
                fArray[vRa.d] = Yra.i - a2.positionTo.y;
                fArray[uqa.g] = a2.positionTo.z;
                fArray[yRa.d] = Yra.i - a2.positionFrom.y;
                float[] b22 = fArray;
                return fArray;
            }
        }
        throw new NullPointerException();
    }

    /*
     * WARNING - void declaration
     */
    public GJa(Vector3f vector3f, Vector3f vector3f2, Map<DZ, Rja> map, CLa cLa, boolean bl) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        GJa a2;
        boolean bl2 = bl;
        GJa gJa = a2 = this;
        a2.positionFrom = e2;
        gJa.positionTo = d2;
        gJa.mapFaces = c2;
        a2.partRotation = b2;
        a2.shade = f2;
        a2.J();
    }
}

