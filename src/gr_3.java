/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class gr_3 {
    public static boolean J(JsonObject jsonObject, String string) {
        String b2 = string;
        JsonObject a2 = jsonObject;
        return a2.get(b2).getAsBoolean();
    }

    public static float J(JsonObject jsonObject, String string) {
        String b2 = string;
        JsonObject a2 = jsonObject;
        return a2.get(b2).getAsFloat();
    }

    public static int J(JsonObject jsonObject, String string) {
        String b2 = string;
        JsonObject a2 = jsonObject;
        return a2.get(b2).getAsInt();
    }

    public static float[] J(JsonObject jsonObject, String string) {
        int n2;
        Object b2 = string;
        JsonObject a2 = jsonObject;
        if ((b2 = a2.getAsJsonArray((String)b2)) == null) {
            return null;
        }
        float[] fArray = new float[((JsonArray)b2).size()];
        int n3 = n2 = uSa.E;
        while (n3 < ((JsonArray)b2).size()) {
            JsonElement jsonElement = ((JsonArray)b2).get(n2);
            fArray[n2++] = jsonElement.getAsFloat();
            n3 = n2;
        }
        return fArray;
    }

    public static int[] J(JsonObject jsonObject, String string) {
        int b2;
        JsonArray a2;
        JsonObject jsonObject2 = jsonObject;
        a2 = jsonObject2.getAsJsonArray((String)((Object)a2));
        int[] nArray = new int[a2.size()];
        int n2 = b2 = uSa.E;
        while (n2 < a2.size()) {
            JsonElement jsonElement = a2.get(b2);
            nArray[b2++] = jsonElement.getAsInt();
            n2 = b2;
        }
        return nArray;
    }

    public gr_3() {
        gr_3 a2;
    }

    public static UUID J(JsonObject jsonObject, String string) {
        String b2 = string;
        JsonObject a2 = jsonObject;
        return UUID.fromString(a2.get(b2).getAsString());
    }

    public static String J(JsonObject jsonObject, String string) {
        Object b2 = string;
        JsonObject a2 = jsonObject;
        if ((b2 = a2.get((String)b2)) != null) {
            return ((JsonElement)b2).getAsString();
        }
        return Mqa.y;
    }
}

