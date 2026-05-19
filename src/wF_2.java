/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Zta
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public final class wF_2
implements JsonDeserializer<CE> {
    public wF_2() {
        wF_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public CE deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void c2;
        Object d2 = jsonDeserializationContext;
        wF_2 a2 = this;
        CE b2 = new CE();
        if (c2.isJsonObject()) {
            d2 = (JsonObject)c2;
            if (((JsonObject)d2).has(dua.T)) {
                b2.J(((JsonObject)d2).get(dua.T).getAsString());
            }
            if (((JsonObject)d2).has(fqa.la)) {
                b2.J(((JsonObject)d2).get(fqa.la).getAsBoolean());
            }
            if (((JsonObject)d2).has(Zta.h)) {
                b2.f(((JsonObject)d2).get(Zta.h).getAsBoolean());
            }
            if (((JsonObject)d2).has(TOa.Ha)) {
                b2.J(((JsonObject)d2).get(TOa.Ha).getAsFloat());
            }
            if (((JsonObject)d2).has(MRa.T)) {
                b2.f(((JsonObject)d2).get(MRa.T).getAsInt());
            }
            if (((JsonObject)d2).has(ERa.la)) {
                b2.J(((JsonObject)d2).get(ERa.la).getAsInt());
            }
        } else if (c2.isJsonPrimitive()) {
            b2.J(c2.getAsString());
        }
        return b2;
    }
}

