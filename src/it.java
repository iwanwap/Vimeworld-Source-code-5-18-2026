/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  JPa
 *  ZR
 *  fi
 *  vRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Locale;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class it {
    public b z;
    public b y;
    private static final it ZERO;
    public b x;
    private static final b ZERO_EXPR;

    static {
        ZERO_EXPR = fi.J((float)JPa.N);
        ZERO = new it(ZERO_EXPR);
    }

    private it(JsonElement jsonElement) {
        Object b2 = jsonElement;
        it a2 = this;
        if (((JsonElement)b2).isJsonPrimitive()) {
            a2.y = a2.z = it.J((JsonElement)b2);
            a2.x = a2.z;
            return;
        }
        if (((JsonElement)b2).isJsonArray()) {
            if (((JsonArray)(b2 = ((JsonElement)b2).getAsJsonArray())).size() == vRa.d) {
                a2.y = a2.z = it.J(((JsonArray)b2).get(uSa.E));
                a2.x = a2.z;
                return;
            }
            it it2 = a2;
            Object object = b2;
            a2.x = it.J(((JsonArray)b2).get(uSa.E));
            it2.y = it.J(((JsonArray)object).get(vRa.d));
            it2.z = it.J(((JsonArray)object).get(uqa.g));
        }
    }

    private it(b b2) {
        it a2;
        b b3 = b2;
        it it2 = a2 = this;
        a2.y = it2.z = b3;
        it2.x = it2.z;
    }

    public static it J(JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        it a2 = new it(jsonElement2);
        if (a2.x == ZERO_EXPR && a2.y == ZERO_EXPR && a2.z == ZERO_EXPR) {
            return ZERO;
        }
        return a2;
    }

    private static b J(JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        if (jsonElement2.isJsonPrimitive()) {
            JsonElement a2 = jsonElement2.getAsJsonPrimitive();
            if (((JsonPrimitive)a2).isNumber()) {
                return fi.J((float)((JsonPrimitive)a2).getAsFloat());
            }
            if (((JsonPrimitive)a2).isString()) {
                return ZR.INSTANCE.J(((JsonPrimitive)a2).getAsString().toLowerCase(Locale.ROOT));
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, Cra.Y).append(jsonElement2).toString());
    }
}

