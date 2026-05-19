/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HAa
 *  Maa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class aBa_1
implements JsonDeserializer<HAa>,
JsonSerializer<HAa> {
    @Override
    public HAa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        aBa_1 c2 = this;
        d2 = Maa.J((JsonElement)d2, (String)uSa.K);
        return new HAa(Maa.J((JsonObject)d2, (String)dua.T), Maa.J((JsonObject)d2, (String)Iqa.V));
    }

    @Override
    public JsonElement serialize(HAa hAa2, Type type, JsonSerializationContext jsonSerializationContext) {
        aBa_1 d2 = hAa2;
        aBa_1 c2 = this;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(dua.T, d2.J());
        jsonObject.addProperty(Iqa.V, d2.J());
        return jsonObject;
    }

    public aBa_1() {
        aBa_1 a2;
    }
}

