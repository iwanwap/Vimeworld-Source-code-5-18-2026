/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ay
 *  fz
 *  uy
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class iZ_1
implements JsonDeserializer<ay<K>>,
JsonSerializer<ay<K>> {
    public final /* synthetic */ fz this$0;

    public /* synthetic */ iZ_1(fz fz2, uy uy2) {
        iZ_1 c2 = fz2;
        iZ_1 b2 = this;
        b2((fz)c2);
    }

    @Override
    public ay<K> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        iZ_1 c2 = this;
        if (((JsonElement)d2).isJsonObject()) {
            d2 = ((JsonElement)d2).getAsJsonObject();
            return c2.this$0.J((JsonObject)d2);
        }
        return null;
    }

    private iZ_1(fz fz2) {
        iZ_1 b2 = fz2;
        iZ_1 a2 = this;
        a2.this$0 = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(ay<K> ay2, Type type, JsonSerializationContext jsonSerializationContext) {
        void c2;
        Object d2 = type;
        iZ_1 b2 = this;
        Object object = d2 = new JsonObject();
        c2.J((JsonObject)object);
        return object;
    }
}

