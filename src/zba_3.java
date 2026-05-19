/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Maa
 *  QBa
 *  QSa
 *  TQa
 *  fpa
 *  hra
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public final class zba_3
implements JsonDeserializer<QBa>,
JsonSerializer<QBa> {
    @Override
    public QBa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        zba_3 c2 = this;
        d2 = Maa.J((JsonElement)d2, (String)TQa.Ka);
        QBa b2 = new QBa(Maa.J((JsonObject)d2, (String)fpa.s), Maa.J((JsonObject)d2, (String)hra.X));
        if (Maa.C((JsonObject)d2, (String)Qpa.n) && ((JsonArray)(d2 = Maa.J((JsonObject)d2, (String)Qpa.n))).size() > 0) {
            int n2;
            GameProfile[] a2 = new GameProfile[((JsonArray)d2).size()];
            int n3 = n2 = uSa.E;
            while (n3 < a2.length) {
                JsonObject jsonObject = Maa.J((JsonElement)((JsonArray)d2).get(n2), (String)new StringBuilder().insert(3 ^ 3, QSa.P).append(n2).append(XOa.D).toString());
                String string = Maa.J((JsonObject)jsonObject, (String)QTa.O);
                a2[n2++] = new GameProfile(UUID.fromString(string), Maa.J((JsonObject)jsonObject, (String)dua.T));
                n3 = n2;
            }
            b2.J(a2);
        }
        return b2;
    }

    public zba_3() {
        zba_3 a2;
    }

    @Override
    public JsonElement serialize(QBa qBa2, Type type, JsonSerializationContext jsonSerializationContext) {
        zba_3 d2 = qBa2;
        zba_3 c2 = this;
        JsonObject b2 = new JsonObject();
        b2.addProperty(fpa.s, d2.J());
        zba_3 zba_32 = d2;
        b2.addProperty(hra.X, zba_32.f());
        if (zba_32.J() != null && d2.J().length > 0) {
            int n2;
            JsonArray a2 = new JsonArray();
            int n3 = n2 = uSa.E;
            while (n3 < d2.J().length) {
                JsonObject jsonObject = new JsonObject();
                UUID uUID = d2.J()[n2].getId();
                jsonObject.addProperty(QTa.O, uUID == null ? Mqa.y : uUID.toString());
                JsonObject jsonObject2 = jsonObject;
                GameProfile gameProfile = d2.J()[n2];
                jsonObject2.addProperty(dua.T, gameProfile.getName());
                a2.add(jsonObject2);
                n3 = ++n2;
            }
            b2.add(Qpa.n, a2);
        }
        return b2;
    }
}

