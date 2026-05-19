/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Maa
 *  NQa
 *  hJa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Gka_3
implements JsonDeserializer<hJa> {
    @Override
    public hJa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d22 = jsonElement;
        Gka_3 c2 = this;
        d22 = ((JsonElement)d22).getAsJsonObject();
        Gka_3 gka_3 = c2;
        float[] b2 = gka_3.J((JsonObject)d22);
        int d22 = gka_3.J((JsonObject)d22);
        return new hJa(b2, d22);
    }

    public Gka_3() {
        Gka_3 a2;
    }

    public int J(JsonObject jsonObject) {
        JsonObject b22 = jsonObject;
        Gka_3 a2 = this;
        int b22 = Maa.J((JsonObject)b22, (String)NQa.ja, (int)uSa.E);
        if (b22 >= 0 && b22 % Jsa.ha == 0 && b22 / Jsa.ha <= yRa.d) {
            return b22;
        }
        throw new JsonParseException(new StringBuilder().insert(3 & 4, Ata.Ka).append(b22).append(Jra.Ma).toString());
    }

    private float[] J(JsonObject jsonObject) {
        int n2;
        Object b2 = jsonObject;
        Gka_3 a2 = this;
        if (!((JsonObject)b2).has(Upa.T)) {
            return null;
        }
        if (((JsonArray)(b2 = Maa.J((JsonObject)b2, (String)Upa.T))).size() != AQa.P) {
            throw new JsonParseException(new StringBuilder().insert(3 >> 2, STa.r).append(((JsonArray)b2).size()).toString());
        }
        float[] fArray = new float[AQa.P];
        int n3 = n2 = uSa.E;
        while (n3 < fArray.length) {
            int n4 = n2;
            float f2 = Maa.J((JsonElement)((JsonArray)b2).get(n2), (String)new StringBuilder().insert(2 & 5, POa.G).append(n4).append(XOa.D).toString());
            fArray[n4] = f2;
            n3 = ++n2;
        }
        return fArray;
    }
}

