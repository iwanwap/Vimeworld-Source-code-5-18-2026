/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ze_3 {
    public Ze_3() {
        Ze_3 a2;
    }

    public static int[] J(JsonElement jsonElement, int n2) {
        int b2 = n2;
        JsonElement a2 = jsonElement;
        return Ze_3.J(a2, b2, (int[])null);
    }

    /*
     * WARNING - void declaration
     */
    public static int[] J(JsonElement jsonElement, int n2, int[] nArray) {
        int n3;
        void b22;
        Object c2 = nArray;
        JsonElement a2 = jsonElement;
        if (a2 == null) {
            return c2;
        }
        c2 = a2.getAsJsonArray();
        if (((JsonArray)c2).size() != b22) {
            throw new JsonParseException(new StringBuilder().insert(3 ^ 3, CRa.Q).append(((JsonArray)c2).size()).append(BRa.y).append((int)b22).append(hQa.l).append(c2).toString());
        }
        int[] b22 = new int[((JsonArray)c2).size()];
        int n4 = n3 = uSa.E;
        while (n4 < b22.length) {
            int n5 = n3++;
            b22[n5] = ((JsonArray)c2).get(n5).getAsInt();
            n4 = n3;
        }
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(JsonObject jsonObject, String string, float f2) {
        Object c2 = string;
        JsonObject b2 = jsonObject;
        if ((c2 = b2.get((String)c2)) == null) {
            void a2;
            return (float)a2;
        }
        return ((JsonElement)c2).getAsFloat();
    }

    public static String J(JsonObject jsonObject, String string) {
        String b2 = string;
        JsonObject a2 = jsonObject;
        return Ze_3.J(a2, b2, (String)null);
    }

    /*
     * WARNING - void declaration
     */
    public static float[] J(JsonElement jsonElement, int n2, float[] fArray) {
        int n3;
        void b22;
        Object c2 = fArray;
        JsonElement a2 = jsonElement;
        if (a2 == null) {
            return c2;
        }
        c2 = a2.getAsJsonArray();
        if (((JsonArray)c2).size() != b22) {
            throw new JsonParseException(new StringBuilder().insert(3 ^ 3, CRa.Q).append(((JsonArray)c2).size()).append(BRa.y).append((int)b22).append(hQa.l).append(c2).toString());
        }
        float[] b22 = new float[((JsonArray)c2).size()];
        int n4 = n3 = uSa.E;
        while (n4 < b22.length) {
            int n5 = n3++;
            b22[n5] = ((JsonArray)c2).get(n5).getAsFloat();
            n4 = n3;
        }
        return b22;
    }

    /*
     * WARNING - void declaration
     */
    public static String J(JsonObject jsonObject, String string, String string2) {
        Object c2 = string;
        JsonObject b2 = jsonObject;
        if ((c2 = b2.get((String)c2)) == null) {
            void a2;
            return a2;
        }
        return ((JsonElement)c2).getAsString();
    }

    public static float[] J(JsonElement jsonElement, int n2) {
        int b2 = n2;
        JsonElement a2 = jsonElement;
        return Ze_3.J(a2, b2, (float[])null);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(JsonObject jsonObject, String string, boolean bl2) {
        Object c2 = string;
        JsonObject b2 = jsonObject;
        if ((c2 = b2.get((String)c2)) == null) {
            void a2;
            return (boolean)a2;
        }
        return ((JsonElement)c2).getAsBoolean();
    }
}

