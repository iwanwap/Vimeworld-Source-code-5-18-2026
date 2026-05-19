/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LQa
 *  Uf
 *  kPa
 *  uOa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public final class UF_1
implements JsonDeserializer<Uf> {
    @Override
    public Uf deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        UF_1 c2 = this;
        if (!((JsonElement)d2).isJsonObject()) {
            return null;
        }
        d2 = (JsonObject)d2;
        Uf b2 = new Uf(Mqa.y);
        if (((JsonObject)d2).has(rRa.X)) {
            b2.e(((JsonObject)d2).get(rRa.X).getAsFloat());
        }
        if (((JsonObject)d2).has(uOa.Ja)) {
            b2.C(((JsonObject)d2).get(uOa.Ja).getAsFloat());
        }
        if (((JsonObject)d2).has(oua.v)) {
            b2.f(((JsonObject)d2).get(oua.v).getAsFloat());
        }
        if (((JsonObject)d2).has(LQa.da)) {
            b2.J(((JsonObject)d2).get(LQa.da).getAsFloat());
        }
        if (((JsonObject)d2).has(LPa.ca)) {
            b2.d(((JsonObject)d2).get(LPa.ca).getAsFloat());
        }
        if (((JsonObject)d2).has(Npa.P)) {
            b2.A(((JsonObject)d2).get(Npa.P).getAsFloat());
        }
        if (((JsonObject)d2).has(kPa.Ka)) {
            b2.M(((JsonObject)d2).get(kPa.Ka).getAsFloat());
        }
        if (((JsonObject)d2).has(Lsa.ha)) {
            b2.l(((JsonObject)d2).get(Lsa.ha).getAsFloat());
        }
        if (((JsonObject)d2).has(xra.c)) {
            b2.i(((JsonObject)d2).get(xra.c).getAsFloat());
        }
        return b2;
    }

    public UF_1() {
        UF_1 a2;
    }
}

