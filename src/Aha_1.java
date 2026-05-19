/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  Maa
 *  ld
 *  zHa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class Aha_1
extends zHa<QIa>
implements JsonSerializer<QIa> {
    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(QIa qIa, Type type, JsonSerializationContext jsonSerializationContext) {
        void a2;
        QIa d2 = qIa;
        Aha_1 c2 = this;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(qQa.i, d2.J());
        jsonObject.add(ITa.la, a2.serialize(d2.J()));
        return jsonObject;
    }

    /*
     * WARNING - void declaration
     */
    public QIa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        Object d22 = jsonElement;
        Aha_1 c2 = this;
        ld b2 = (ld)a2.deserialize(((JsonObject)(d22 = ((JsonElement)d22).getAsJsonObject())).get(ITa.la), (Type)((Object)ld.class));
        if (b2 == null) {
            throw new JsonParseException(Epa.e);
        }
        int d22 = Maa.J((JsonObject)d22, (String)qQa.i);
        return new QIa(b2, d22);
    }

    public Aha_1() {
        Aha_1 a2;
    }

    public String J() {
        return ROa.F;
    }
}

