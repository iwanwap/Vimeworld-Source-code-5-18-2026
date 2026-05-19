/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Usa
 *  ZOa
 *  dpa
 *  fsa
 *  isa
 *  vRa
 *  xOa
 *  zsa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Maa_3 {
    public static boolean J(JsonElement a2) {
        if (!a2.isJsonPrimitive()) {
            return uSa.E != 0;
        }
        return a2.getAsJsonPrimitive().isString();
    }

    public static boolean e(JsonObject jsonObject, String string) {
        String b2 = string;
        JsonObject a2 = jsonObject;
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (a2.get(b2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static boolean d(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (a2.has(b2)) {
            return Maa_3.J(a2.get(b2), b2);
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 >> 2, wta.s).append(b2).append(dpa.M).toString());
    }

    public static boolean J(JsonElement jsonElement, String string) {
        String b2 = string;
        JsonElement a2 = jsonElement;
        if (a2.isJsonPrimitive()) {
            return a2.getAsBoolean();
        }
        throw new JsonSyntaxException(new StringBuilder().insert(5 >> 3, POa.f).append(b2).append(isa.Y).append(Maa_3.toString(a2)).toString());
    }

    public Maa_3() {
        Maa_3 a2;
    }

    public static int J(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (a2.has(b2)) {
            return Maa_3.J(a2.get(b2), b2);
        }
        throw new JsonSyntaxException(new StringBuilder().insert(2 & 5, wta.s).append(b2).append(xOa.Aa).toString());
    }

    public static String J(JsonElement jsonElement, String string) {
        String b2 = string;
        JsonElement a2 = jsonElement;
        if (a2.isJsonPrimitive()) {
            return a2.getAsString();
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 & 4, POa.f).append(b2).append(WOa.ca).append(Maa_3.toString(a2)).toString());
    }

    /*
     * WARNING - void declaration
     */
    public static JsonArray J(JsonObject jsonObject, String string, JsonArray jsonArray) {
        void a2;
        JsonObject b2 = jsonObject;
        String c2 = string;
        if (b2.has(c2)) {
            return Maa_3.J(b2.get(c2), c2);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(JsonObject jsonObject, String string, boolean bl) {
        void a2;
        JsonObject b2 = jsonObject;
        String c2 = string;
        if (b2.has(c2)) {
            return Maa_3.J(b2.get(c2), c2);
        }
        return (boolean)a2;
    }

    /*
     * WARNING - void declaration
     */
    public static JsonObject J(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        void a2;
        JsonObject b2 = jsonObject;
        String c2 = string;
        if (b2.has(c2)) {
            return Maa_3.J(b2.get(c2), c2);
        }
        return a2;
    }

    public static boolean C(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (!Maa_3.e(a2, b2)) {
            return uSa.E != 0;
        }
        return a2.get(b2).isJsonArray();
    }

    /*
     * WARNING - void declaration
     */
    public static String J(JsonObject jsonObject, String string, String string2) {
        void a2;
        JsonObject b2 = jsonObject;
        String c2 = string;
        if (b2.has(c2)) {
            return Maa_3.J(b2.get(c2), c2);
        }
        return a2;
    }

    public static JsonArray J(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (a2.has(b2)) {
            return Maa_3.J(a2.get(b2), b2);
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 ^ 3, wta.s).append(b2).append(opa.K).toString());
    }

    public static boolean l(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (!Maa_3.f(a2, b2)) {
            return uSa.E != 0;
        }
        return a2.getAsJsonPrimitive(b2).isString();
    }

    public static String J(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (a2.has(b2)) {
            return Maa_3.J(a2.get(b2), b2);
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 ^ 3, wta.s).append(b2).append(oQa.P).toString());
    }

    /*
     * WARNING - void declaration
     */
    public static int J(JsonObject jsonObject, String string, int n2) {
        void a2;
        JsonObject b2 = jsonObject;
        String c2 = string;
        if (b2.has(c2)) {
            return Maa_3.J(b2.get(c2), c2);
        }
        return (int)a2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(JsonObject jsonObject, String string, float f2) {
        void a2;
        JsonObject b2 = jsonObject;
        String c2 = string;
        if (b2.has(c2)) {
            return Maa_3.J(b2.get(c2), c2);
        }
        return (float)a2;
    }

    public static boolean f(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (!Maa_3.e(a2, b2)) {
            return uSa.E != 0;
        }
        return a2.get(b2).isJsonPrimitive();
    }

    public static float J(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (a2.has(b2)) {
            return Maa_3.J(a2.get(b2), b2);
        }
        throw new JsonSyntaxException(new StringBuilder().insert(2 & 5, wta.s).append(b2).append(ZOa.r).toString());
    }

    public static int J(JsonElement jsonElement, String string) {
        String b2 = string;
        JsonElement a2 = jsonElement;
        if (a2.isJsonPrimitive() && a2.getAsJsonPrimitive().isNumber()) {
            return a2.getAsInt();
        }
        throw new JsonSyntaxException(new StringBuilder().insert(5 >> 3, POa.f).append(b2).append(dqa.w).append(Maa_3.toString(a2)).toString());
    }

    public static JsonObject J(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (a2.has(b2)) {
            return Maa_3.J(a2.get(b2), b2);
        }
        throw new JsonSyntaxException(new StringBuilder().insert(2 & 5, wta.s).append(b2).append(PQa.H).toString());
    }

    public static JsonArray J(JsonElement jsonElement, String string) {
        String b2 = string;
        JsonElement a2 = jsonElement;
        if (a2.isJsonArray()) {
            return a2.getAsJsonArray();
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 >> 2, POa.f).append(b2).append(zsa.Ha).append(Maa_3.toString(a2)).toString());
    }

    public static boolean J(JsonObject jsonObject, String string) {
        JsonObject a2 = jsonObject;
        String b2 = string;
        if (!Maa_3.f(a2, b2)) {
            return uSa.E != 0;
        }
        return a2.getAsJsonPrimitive(b2).isBoolean();
    }

    public static float J(JsonElement jsonElement, String string) {
        String b2 = string;
        JsonElement a2 = jsonElement;
        if (a2.isJsonPrimitive() && a2.getAsJsonPrimitive().isNumber()) {
            return a2.getAsFloat();
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 >> 2, POa.f).append(b2).append(eua.D).append(Maa_3.toString(a2)).toString());
    }

    public static String toString(JsonElement jsonElement) {
        JsonElement jsonElement2;
        JsonElement jsonElement3 = jsonElement2 = jsonElement;
        String a2 = StringUtils.abbreviateMiddle(String.valueOf(jsonElement3), Usa.E, NTa.C);
        if (jsonElement3 == null) {
            return Pua.G;
        }
        if (jsonElement2.isJsonNull()) {
            return cTa.n;
        }
        if (jsonElement2.isJsonArray()) {
            return new StringBuilder().insert(3 >> 2, eua.T).append(a2).append(hpa.b).toString();
        }
        if (jsonElement2.isJsonObject()) {
            return new StringBuilder().insert(3 & 4, uSa.Y).append(a2).append(hpa.b).toString();
        }
        if (jsonElement2.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement2.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                return new StringBuilder().insert(3 ^ 3, fsa.f).append(a2).append(hpa.b).toString();
            }
            if (jsonPrimitive.isBoolean()) {
                return new StringBuilder().insert(3 & 4, Vra.ba).append(a2).append(hpa.b).toString();
            }
        }
        return a2;
    }

    public static JsonObject J(JsonElement jsonElement, String string) {
        String b2 = string;
        JsonElement a2 = jsonElement;
        if (a2.isJsonObject()) {
            return a2.getAsJsonObject();
        }
        throw new JsonSyntaxException(new StringBuilder().insert(3 >> 2, POa.f).append(b2).append(rRa.W).append(Maa_3.toString(a2)).toString());
    }
}

