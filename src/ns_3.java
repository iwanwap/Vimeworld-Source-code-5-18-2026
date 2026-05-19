/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  fi
 *  ns
 *  vRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public final class ns_3 {
    private final b z;
    private final b x;
    private final b y;

    public ns_3(JsonArray jsonArray) {
        Object object;
        Object object2;
        Object b2 = jsonArray;
        ns_3 a2 = this;
        JsonPrimitive jsonPrimitive = ((JsonArray)b2).get(uSa.E).getAsJsonPrimitive();
        if (jsonPrimitive.isNumber()) {
            object2 = b2;
            a2.x = fi.J((float)jsonPrimitive.getAsFloat());
        } else {
            a2.x = ns_3.J(jsonPrimitive.getAsString());
            object2 = b2;
        }
        if (((JsonArray)object2).size() == vRa.d) {
            a2.z = a2.y = a2.x;
            return;
        }
        jsonPrimitive = ((JsonArray)b2).get(vRa.d).getAsJsonPrimitive();
        ns_3 ns_32 = a2;
        if (jsonPrimitive.isNumber()) {
            ns_32.y = fi.J((float)jsonPrimitive.getAsFloat());
            object = b2;
        } else {
            ns_32.y = ns_3.J(jsonPrimitive.getAsString());
            object = b2;
        }
        b2 = ((JsonArray)object).get(uqa.g).getAsJsonPrimitive();
        ns_3 ns_33 = a2;
        if (((JsonPrimitive)b2).isNumber()) {
            ns_33.z = fi.J((float)((JsonPrimitive)b2).getAsFloat());
            return;
        }
        ns_33.z = ns_3.J(((JsonPrimitive)b2).getAsString());
    }

    public static /* synthetic */ b l(ns a2) {
        return a2.x;
    }

    /*
     * WARNING - void declaration
     */
    public ns_3(float f2, float f3, float f4) {
        void b2;
        void c2;
        ns_3 a2;
        float d2 = f4;
        ns_3 ns_32 = a2 = this;
        a2.x = fi.J((float)c2);
        ns_32.y = fi.J((float)b2);
        ns_32.z = fi.J((float)d2);
    }

    public static /* synthetic */ b f(ns a2) {
        return a2.z;
    }

    private static float J(b b2, float f2) {
        float b3 = f2;
        b a2 = b2;
        try {
            return a2.J();
        }
        catch (Exception exception) {
            return b3;
        }
    }

    public static /* synthetic */ b J(ns a2) {
        return a2.y;
    }

    public float[] values(float f2) {
        float b2 = f2;
        ns_3 a2 = this;
        float[] fArray = new float[yRa.d];
        fArray[uSa.E] = ns_3.J(a2.x, b2);
        fArray[vRa.d] = ns_3.J(a2.y, b2);
        fArray[uqa.g] = ns_3.J(a2.z, b2);
        return fArray;
    }

    private static b J(String a2) {
        if ((a2 = a2.trim()).isEmpty()) {
            return fi.J((float)JPa.N);
        }
        return St.INSTANCE.J(a2);
    }
}

