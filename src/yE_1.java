/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jE
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

public final class yE_1
implements JsonDeserializer<jE> {
    /*
     * WARNING - void declaration
     */
    @Override
    public jE deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Iterator<Map.Entry<String, JsonElement>> d2 = jsonElement;
        yE_1 c2 = this;
        if (!((JsonElement)((Object)d2)).isJsonObject()) {
            return null;
        }
        d2 = ((JsonElement)((Object)d2)).getAsJsonObject();
        jE b2 = new jE();
        Iterator<Map.Entry<String, JsonElement>> iterator = d2 = ((JsonObject)((Object)d2)).entrySet().iterator();
        while (iterator.hasNext()) {
            void a2;
            Object object = d2.next();
            JsonElement jsonElement2 = object.getValue();
            object = b2.J(object.getKey());
            if (jsonElement2.isJsonObject()) {
                ((JsonObject)jsonElement2).addProperty(dua.T, (String)object);
            }
            b2.actions.put(object, a2.deserialize(jsonElement2, (Type)((Object)CE.class)));
            iterator = d2;
        }
        return b2;
    }

    public yE_1() {
        yE_1 a2;
    }
}

