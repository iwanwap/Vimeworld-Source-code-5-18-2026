/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Maa
 *  hqa
 *  uRa
 *  xha
 *  yia
 *  zHa
 */
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;

public final class wia
extends zHa<xha> {
    public String J() {
        return uRa.Y;
    }

    public xha deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        wia c2 = this;
        d2 = ((JsonElement)d2).getAsJsonObject();
        HashSet<yia> b2 = Sets.newHashSet();
        for (Map.Entry a22 : ((JsonObject)d2).entrySet()) {
            String string = (String)a22.getKey();
            JsonObject jsonObject = Maa.J((JsonElement)((JsonElement)a22.getValue()), (String)uRa.Y);
            String a22 = Maa.J((JsonObject)jsonObject, (String)Fua.d);
            String string2 = Maa.J((JsonObject)jsonObject, (String)dua.T);
            boolean bl = Maa.J((JsonObject)jsonObject, (String)uSa.Q, uSa.E != 0);
            if (a22.isEmpty()) {
                throw new JsonParseException(new StringBuilder().insert(3 ^ 3, Hta.f).append(string).append(Ora.q).toString());
            }
            if (string2.isEmpty()) {
                throw new JsonParseException(new StringBuilder().insert(3 >> 2, Hta.f).append(string).append(dqa.o).toString());
            }
            if (b2.add(new yia(string, a22, string2, bl))) continue;
            throw new JsonParseException(new StringBuilder().insert(5 >> 3, AQa.e).append(string).append(hqa.y).toString());
        }
        return new xha(b2);
    }

    public wia() {
        wia a2;
    }
}

