/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Uk
 *  aSa
 *  vK
 *  vRa
 *  wk
 *  yk
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class Ak_2 {
    public Uk I;

    public static boolean l(Ak a2) {
        return Ak_2.J(a2, oua.i);
    }

    public static boolean f(Ak a2) {
        if (a2 instanceof vK) {
            return ((vK)a2).A instanceof wk;
        }
        return uSa.E != 0;
    }

    public Ak_2(Uk uk2) {
        Ak_2 b2 = uk2;
        Ak_2 a2 = this;
        a2.I = b2;
    }

    public JsonElement J() {
        Ak_2 a2;
        return new JsonPrimitive(a2.toString());
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Ak ak, double d2) {
        Ak ak2 = ak;
        if (ak2 instanceof vK) {
            void a2;
            Ak b2 = (vK)ak2;
            if (b2.A instanceof wk && yk.equals((double)b2.A.J().J(), (double)a2)) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public static boolean J(Ak a2) {
        return Ak_2.J(a2, aSa.V);
    }

    public abstract double J();
}

