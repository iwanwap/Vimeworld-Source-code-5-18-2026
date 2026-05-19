/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  JQa
 *  WSa
 *  XTa
 *  Zta
 *  bSa
 *  bpa
 *  hqa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.util.ResourceLocation;

public final class pf_2
implements JsonDeserializer<sf>,
JsonSerializer<sf> {
    public pf_2() {
        pf_2 a2;
    }

    @Override
    public JsonElement serialize(sf sf2, Type type, JsonSerializationContext jsonSerializationContext) {
        sf d2 = sf2;
        pf_2 c2 = this;
        JsonObject b2 = new JsonObject();
        if (d2.J() != null) {
            b2.addProperty(EQa.Ga, d2.J().J());
        }
        b2.addProperty(Zta.ga, d2.J() == rSa.z ? bSa.u : bpa.q);
        JsonObject jsonObject = b2;
        jsonObject.addProperty(JQa.R, d2.f());
        jsonObject.addProperty(WSa.l, d2.J());
        jsonObject.addProperty(eua.Z, d2.C());
        jsonObject.addProperty(XTa.Aa, d2.l());
        jsonObject.addProperty(Zra.L, d2.f());
        return jsonObject;
    }

    @Override
    public sf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        pf_2 c2 = this;
        if (!((JsonElement)d2).isJsonObject()) {
            return null;
        }
        d2 = ((JsonElement)d2).getAsJsonObject();
        sf b2 = new sf();
        if (((JsonObject)d2).has(EQa.Ga)) {
            b2.J(new ResourceLocation(((JsonObject)d2).get(EQa.Ga).getAsString()));
        }
        if (((JsonObject)d2).has(Zta.ga)) {
            b2.f(((JsonObject)d2).get(Zta.ga).getAsString().equalsIgnoreCase(bSa.u) ? rSa.z : hqa.s);
        }
        if (((JsonObject)d2).has(JQa.R)) {
            b2.l(((JsonObject)d2).get(JQa.R).getAsBoolean());
        }
        if (((JsonObject)d2).has(WSa.l)) {
            b2.C(((JsonObject)d2).get(WSa.l).getAsBoolean());
        }
        if (((JsonObject)d2).has(eua.Z)) {
            b2.J(((JsonObject)d2).get(eua.Z).getAsBoolean());
        }
        if (((JsonObject)d2).has(XTa.Aa)) {
            b2.f(((JsonObject)d2).get(XTa.Aa).getAsBoolean());
        }
        if (((JsonObject)d2).has(Zra.L)) {
            b2.J(((JsonObject)d2).get(Zra.L).getAsInt());
        }
        return b2;
    }
}

