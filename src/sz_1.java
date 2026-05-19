/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TY
 *  Usa
 *  fZ
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

public final class sz_1
implements JsonDeserializer<aY>,
JsonSerializer<aY> {
    public final /* synthetic */ TY this$0;

    public /* synthetic */ sz_1(TY tY, fZ fZ2) {
        sz_1 c2 = tY;
        sz_1 b2 = this;
        b2((TY)c2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(aY aY2, Type type, JsonSerializationContext jsonSerializationContext) {
        void c2;
        JsonObject b2;
        Object d2 = jsonSerializationContext;
        sz_1 a2 = this;
        JsonObject jsonObject = b2 = new JsonObject();
        jsonObject.addProperty(dua.T, c2.J().getName());
        d2 = c2.J().getId();
        jsonObject.addProperty(Usa.w, d2 == null ? Mqa.y : ((UUID)d2).toString());
        JsonObject jsonObject2 = b2;
        jsonObject2.addProperty(oua.N, TY.dateFormat.format(c2.J()));
        return jsonObject2;
    }

    private sz_1(TY tY) {
        sz_1 b2 = tY;
        sz_1 a2 = this;
        a2.this$0 = b2;
    }

    @Override
    public aY deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        sz_1 c2 = this;
        if (((JsonElement)d2).isJsonObject()) {
            JsonObject jsonObject = ((JsonElement)d2).getAsJsonObject();
            d2 = jsonObject.get(dua.T);
            Object b2 = jsonObject.get(Usa.w);
            JsonElement a2 = jsonObject.get(oua.N);
            if (d2 != null && b2 != null) {
                Object object;
                Date date;
                block8: {
                    b2 = ((JsonElement)b2).getAsString();
                    d2 = ((JsonElement)d2).getAsString();
                    date = null;
                    if (a2 != null) {
                        try {
                            date = TY.dateFormat.parse(a2.getAsString());
                            object = d2;
                            break block8;
                        }
                        catch (ParseException parseException) {
                            date = null;
                        }
                    }
                    object = d2;
                }
                if (object != null && b2 != null) {
                    UUID uUID;
                    try {
                        uUID = UUID.fromString((String)b2);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    TY tY = c2.this$0;
                    tY.getClass();
                    return new aY(tY, new GameProfile(uUID, (String)d2), date, null);
                }
                return null;
            }
            return null;
        }
        return null;
    }
}

