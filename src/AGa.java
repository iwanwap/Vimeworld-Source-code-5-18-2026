/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NTa
 *  Oz
 *  XTa
 *  Ypa
 *  Ysa
 *  aPa
 *  bpa
 *  cRa
 *  dQa
 *  hC
 *  lqa
 *  pPa
 *  pqa
 *  vRa
 *  zTa
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

public final class AGa
extends Enum<AGa>
implements hC {
    public static final /* enum */ AGa X180_Y0;
    public static final /* enum */ AGa X0_Y90;
    public static final /* enum */ AGa X180_Y180;
    private static final AGa[] $VALUES;
    public static final /* enum */ AGa X270_Y0;
    public static final /* enum */ AGa X180_Y90;
    public static final /* enum */ AGa X0_Y0;
    private final int quartersX;
    private static final /* synthetic */ AGa[] $VALUES$;
    public static final /* enum */ AGa X90_Y270;
    private static final String __OBFID = "CL_00002393";
    public static final /* enum */ AGa X270_Y270;
    private final int combinedXY;
    public static final /* enum */ AGa X270_Y90;
    private final Matrix4f matrix4d;
    public static final /* enum */ AGa X270_Y180;
    public static final /* enum */ AGa X0_Y270;
    private final int quartersY;
    public static final /* enum */ AGa X90_Y0;
    public static final /* enum */ AGa X180_Y270;
    public static final /* enum */ AGa X90_Y180;
    public static final /* enum */ AGa X0_Y180;
    public static final /* enum */ AGa X90_Y90;
    private static final Map mapRotations;

    /*
     * WARNING - void declaration
     */
    public int rotate(DZ dZ2, int n2) {
        void b2;
        int c2 = n2;
        AGa a2 = this;
        return a2.rotateVertex((DZ)b2, c2);
    }

    public static AGa[] values() {
        return (AGa[])$VALUES$.clone();
    }

    public DZ rotate(DZ dZ2) {
        Enum b2 = dZ2;
        AGa a2 = this;
        return a2.rotateFace((DZ)b2);
    }

    public Matrix4f getMatrix4d() {
        AGa a2;
        return a2.matrix4d;
    }

    static {
        int n2;
        X0_Y0 = new AGa(dQa.P, uSa.E, uSa.E, uSa.E);
        X0_Y90 = new AGa(ERa.x, vRa.d, uSa.E, Jsa.ha);
        X0_Y180 = new AGa(kua.C, uqa.g, uSa.E, cRa.n);
        X0_Y270 = new AGa(sOa.E, yRa.d, uSa.E, mSa.F);
        X90_Y0 = new AGa(GPa.H, AQa.P, Jsa.ha, uSa.E);
        X90_Y90 = new AGa(gQa.o, tTa.h, Jsa.ha, Jsa.ha);
        X90_Y180 = new AGa(Bra.p, uua.p, Jsa.ha, cRa.n);
        X90_Y270 = new AGa(yta.s, XTa.W, Jsa.ha, mSa.F);
        X180_Y0 = new AGa(xra.N, Yqa.i, cRa.n, uSa.E);
        X180_Y90 = new AGa(nOa.U, WOa.fa, cRa.n, Jsa.ha);
        X180_Y180 = new AGa(KSa.R, NTa.C, cRa.n, cRa.n);
        X180_Y270 = new AGa(bpa.Q, pPa.f, cRa.n, mSa.F);
        X270_Y0 = new AGa(Ysa.M, lqa.s, mSa.F, uSa.E);
        X270_Y90 = new AGa(zTa.r, uua.s, mSa.F, Jsa.ha);
        X270_Y180 = new AGa(sqa.v, hpa.Z, mSa.F, cRa.n);
        X270_Y270 = new AGa(MRa.v, Ypa.A, mSa.F, mSa.F);
        AGa[] aGaArray = new AGa[ERa.C];
        aGaArray[uSa.E] = X0_Y0;
        aGaArray[vRa.d] = X0_Y90;
        aGaArray[uqa.g] = X0_Y180;
        aGaArray[yRa.d] = X0_Y270;
        aGaArray[AQa.P] = X90_Y0;
        aGaArray[tTa.h] = X90_Y90;
        aGaArray[uua.p] = X90_Y180;
        aGaArray[XTa.W] = X90_Y270;
        aGaArray[Yqa.i] = X180_Y0;
        aGaArray[WOa.fa] = X180_Y90;
        aGaArray[NTa.C] = X180_Y180;
        aGaArray[pPa.f] = X180_Y270;
        aGaArray[lqa.s] = X270_Y0;
        aGaArray[uua.s] = X270_Y90;
        aGaArray[hpa.Z] = X270_Y180;
        aGaArray[Ypa.A] = X270_Y270;
        $VALUES$ = aGaArray;
        mapRotations = Maps.newHashMap();
        AGa[] aGaArray2 = new AGa[ERa.C];
        aGaArray2[uSa.E] = X0_Y0;
        aGaArray2[vRa.d] = X0_Y90;
        aGaArray2[uqa.g] = X0_Y180;
        aGaArray2[yRa.d] = X0_Y270;
        aGaArray2[AQa.P] = X90_Y0;
        aGaArray2[tTa.h] = X90_Y90;
        aGaArray2[uua.p] = X90_Y180;
        aGaArray2[XTa.W] = X90_Y270;
        aGaArray2[Yqa.i] = X180_Y0;
        aGaArray2[WOa.fa] = X180_Y90;
        aGaArray2[NTa.C] = X180_Y180;
        aGaArray2[pPa.f] = X180_Y270;
        aGaArray2[lqa.s] = X270_Y0;
        aGaArray2[uua.s] = X270_Y90;
        aGaArray2[hpa.Z] = X270_Y180;
        aGaArray2[Ypa.A] = X270_Y270;
        $VALUES = aGaArray2;
        AGa[] aGaArray3 = AGa.values();
        int n3 = aGaArray3.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            AGa aGa = aGaArray3[n2];
            mapRotations.put(aGa.combinedXY, aGa);
            n4 = ++n2;
        }
    }

    private static int combineXY(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return a2 * aPa.Y + b2;
    }

    public Matrix4f getMatrix() {
        return new Matrix4f();
    }

    public int rotateVertex(DZ dZ2, int n2) {
        int a2;
        Enum c2 = dZ2;
        AGa b2 = this;
        void var3_3 = a2;
        if (((DZ)c2).getAxis() == RX.X) {
            var3_3 = (a2 + b2.quartersX) % AQa.P;
        }
        int n3 = a2 = uSa.E;
        while (n3 < b2.quartersX) {
            c2 = ((DZ)c2).rotateAround(RX.X);
            n3 = ++a2;
        }
        if (((DZ)c2).getAxis() == RX.Y) {
            var3_3 = (var3_3 + b2.quartersY) % AQa.P;
        }
        return (int)var3_3;
    }

    public static AGa getModelRotation(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return (AGa)((Object)mapRotations.get(AGa.combineXY(Oz.C((int)a2, (int)aPa.Y), Oz.C((int)b2, (int)aPa.Y))));
    }

    /*
     * WARNING - void declaration
     */
    private AGa(String string, int n3, int n4, int n5) {
        void a2;
        void b2;
        int e22 = n2;
        AGa aGa = this;
        aGa.combinedXY = AGa.combineXY((int)b2, (int)a2);
        AGa aGa2 = aGa;
        aGa.matrix4d = new Matrix4f();
        object = new Matrix4f();
        ((Matrix4f)object).setIdentity();
        Object object2 = object;
        Matrix4f.rotate((float)(-b2) * Bua.ga, new Vector3f(pqa.r, JPa.N, JPa.N), (Matrix4f)object2, (Matrix4f)object2);
        aGa.quartersX = Oz.f((int)(b2 / Jsa.ha));
        Matrix4f e22 = new Matrix4f();
        e22.setIdentity();
        Matrix4f matrix4f = e22;
        Matrix4f.rotate((float)(-a2) * Bua.ga, new Vector3f(JPa.N, pqa.r, JPa.N), matrix4f, matrix4f);
        aGa.quartersY = Oz.f((int)(a2 / Jsa.ha));
        Matrix4f.mul(e22, (Matrix4f)object, aGa.matrix4d);
    }

    public static AGa valueOf(String a2) {
        return Enum.valueOf(AGa.class, a2);
    }

    public DZ rotateFace(DZ dZ2) {
        int n2;
        Enum b2 = dZ2;
        AGa a2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < a2.quartersX) {
            b2 = ((DZ)b2).rotateAround(RX.X);
            n3 = ++n2;
        }
        if (((DZ)b2).getAxis() != RX.Y) {
            int n4 = n2 = uSa.E;
            while (n4 < a2.quartersY) {
                b2 = ((DZ)b2).rotateAround(RX.Y);
                n4 = ++n2;
            }
        }
        return b2;
    }
}

