/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HAa
 *  Maa
 *  QBa
 *  TQa
 *  kCa
 *  ld
 *  vpa
 *  zTa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class jBa_3
implements JsonDeserializer<kCa>,
JsonSerializer<kCa> {
    /*
     * WARNING - void declaration
     */
    @Override
    public kCa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        Object d2 = jsonElement;
        jBa_3 c2 = this;
        d2 = Maa.J((JsonElement)d2, (String)zTa.Ga);
        kCa b2 = new kCa();
        if (((JsonObject)d2).has(ITa.la)) {
            b2.J((ld)a2.deserialize(((JsonObject)d2).get(ITa.la), (Type)((Object)ld.class)));
        }
        if (((JsonObject)d2).has(TQa.Ka)) {
            b2.J((QBa)a2.deserialize(((JsonObject)d2).get(TQa.Ka), (Type)((Object)QBa.class)));
        }
        if (((JsonObject)d2).has(uSa.K)) {
            b2.J((HAa)a2.deserialize(((JsonObject)d2).get(uSa.K), (Type)((Object)HAa.class)));
        }
        if (((JsonObject)d2).has(vpa.T)) {
            b2.J(Maa.J((JsonObject)d2, (String)vpa.T));
        }
        return b2;
    }

    public jBa_3() {
        jBa_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(kCa kCa2, Type type, JsonSerializationContext jsonSerializationContext) {
        void a2;
        jBa_3 d2 = kCa2;
        jBa_3 c2 = this;
        JsonObject b2 = new JsonObject();
        if (d2.J() != null) {
            b2.add(ITa.la, a2.serialize(d2.J()));
        }
        if (d2.J() != null) {
            b2.add(TQa.Ka, a2.serialize(d2.J()));
        }
        if (d2.J() != null) {
            b2.add(uSa.K, a2.serialize(d2.J()));
        }
        if (d2.J() != null) {
            b2.addProperty(vpa.T, d2.J());
        }
        return b2;
    }
}

