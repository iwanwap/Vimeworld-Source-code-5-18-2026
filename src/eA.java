/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  ZRa
 *  pqa
 *  vRa
 */
import javax.vecmath.Matrix3f;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector3f;

public final class eA
extends Enum<eA> {
    public final int firstIndex;
    public static final /* enum */ eA ZXY;
    public final int thirdIndex;
    public final int secondIndex;
    public static final /* enum */ eA YXZ;
    private static final /* synthetic */ eA[] $VALUES;
    public static final /* enum */ eA XYZ;
    public static final /* enum */ eA ZYX;
    public static final /* enum */ eA XZY;
    public static final /* enum */ eA YZX;

    public static eA[] values() {
        return (eA[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public Float doTest(int n2, Matrix3f matrix3f) {
        void b2;
        void a22;
        Object c2;
        eA eA2 = this;
        float[] fArray = new float[yRa.d];
        float[] fArray2 = fArray;
        fArray[b2 == eA2.firstIndex ? eA2.secondIndex : eA2.firstIndex] = pqa.r;
        Vector3f vector3f = new Vector3f(fArray2);
        Object object = c2 = new Vector3f();
        a22.transform(vector3f, (Tuple3f)object);
        float[] fArray3 = fArray2;
        ((Tuple3f)c2).get(fArray3);
        fArray2[b2] = JPa.N;
        ((Tuple3f)object).set(fArray3);
        if ((double)((Vector3f)object).length() < qQa.P) {
            return null;
        }
        Object object2 = c2;
        Object object3 = c2;
        ((Vector3f)object3).normalize();
        Vector3f vector3f2 = vector3f;
        float a22 = vector3f2.dot((Vector3f)c2);
        ((Vector3f)object2).cross(vector3f2, (Vector3f)object3);
        ((Tuple3f)object2).get(fArray2);
        return Float.valueOf((float)Math.toDegrees(Math.atan2(((Vector3f)c2).length() * Math.signum(fArray2[b2]), a22)));
    }

    public static eA valueOf(String a2) {
        return Enum.valueOf(eA.class, a2);
    }

    private eA() {
        Object a2 = object;
        Object object2 = object = this;
        a2 = ((Enum)object2).name().toUpperCase();
        ((eA)((Object)object2)).firstIndex = ((String)a2).charAt(uSa.E) - ZRa.D;
        ((eA)((Object)object2)).secondIndex = ((String)a2).charAt(vRa.d) - ZRa.D;
        ((eA)((Object)object2)).thirdIndex = ((String)a2).charAt(uqa.g) - ZRa.D;
    }

    static {
        XYZ = new eA();
        XZY = new eA();
        YXZ = new eA();
        YZX = new eA();
        ZXY = new eA();
        ZYX = new eA();
        eA[] eAArray = new eA[uua.p];
        eAArray[uSa.E] = XYZ;
        eAArray[vRa.d] = XZY;
        eAArray[uqa.g] = YXZ;
        eAArray[yRa.d] = YZX;
        eAArray[AQa.P] = ZXY;
        eAArray[tTa.h] = ZYX;
        $VALUES = eAArray;
    }
}

