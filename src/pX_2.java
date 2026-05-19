/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Hfa
 *  Vz
 *  cRa
 *  gEa
 *  ld
 *  pEa
 *  pY
 *  pua
 *  qy
 *  uQa
 *  vRa
 *  wPa
 *  wra
 *  xOa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public final class pX_2
implements JsonDeserializer<Vz>,
JsonSerializer<Vz> {
    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(Vz vz2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        void a2;
        pX_2 pX_22;
        pX_2 d2 = vz2;
        pX_2 c2 = this;
        if (d2.A()) {
            return null;
        }
        JsonObject b2 = new JsonObject();
        if (Vz.k((Vz)d2) != null) {
            b2.addProperty(ZSa.ga, Vz.k((Vz)d2));
        }
        if (Vz.D((Vz)d2) != null) {
            b2.addProperty(sra.W, Vz.D((Vz)d2));
        }
        if (Vz.A((Vz)d2) != null) {
            b2.addProperty(wra.E, Vz.A((Vz)d2));
        }
        if (Vz.G((Vz)d2) != null) {
            b2.addProperty(Asa.S, Vz.G((Vz)d2));
        }
        if (Vz.d((Vz)d2) != null) {
            b2.addProperty(Nta.y, Vz.d((Vz)d2));
        }
        if (Vz.J((Vz)d2) != null) {
            pX_22 = d2;
            b2.addProperty(Zra.L, new StringBuilder().insert(5 >> 3, uQa.Y).append(Vz.J((Vz)d2).J().substring(yRa.d, Yqa.i)).toString());
        } else {
            if (Vz.J((Vz)d2) != null) {
                b2.add(Zra.L, a2.serialize(Vz.J((Vz)d2)));
            }
            pX_22 = d2;
        }
        if (Vz.M((Vz)pX_22) != null) {
            b2.addProperty(wsa.Ka, Vz.M((Vz)d2));
        }
        if (Vz.F((Vz)d2) != null) {
            b2.addProperty(pua.Ea, Vz.F((Vz)d2));
        }
        if (Vz.i((Vz)d2) != null) {
            b2.addProperty(xqa.Ha, Vz.i((Vz)d2));
        }
        if (Vz.l((Vz)d2) != null) {
            b2.addProperty(Xpa.v, Vz.l((Vz)d2));
        }
        if (Vz.C((Vz)d2) != null) {
            b2.addProperty(cRa.M, Vz.C((Vz)d2));
        }
        if (Vz.e((Vz)d2) != null) {
            b2.addProperty(Yqa.e, Vz.e((Vz)d2));
        }
        if (Vz.f((Vz)d2) != null) {
            b2.addProperty(xOa.A, Vz.f((Vz)d2));
        }
        if (Vz.J((Vz)d2) != null) {
            b2.addProperty(ypa.H, Vz.J((Vz)d2));
        }
        if (Vz.J((Vz)d2) != null) {
            b2.addProperty(Jqa.a, Vz.J((Vz)d2));
        }
        if (Vz.f((Vz)d2) != null) {
            b2.add(uSa.ca, a2.serialize(Vz.f((Vz)d2)));
        }
        if (Vz.J((Vz)d2) != null) {
            JsonObject jsonObject2 = jsonObject = new JsonObject();
            jsonObject2.addProperty(Fsa.T, Vz.J((Vz)d2).J().getCanonicalName());
            jsonObject2.addProperty(wPa.O, Vz.J((Vz)d2).J());
            b2.add(hpa.h, jsonObject);
        }
        if (Vz.J((Vz)d2) != null) {
            JsonObject jsonObject3 = jsonObject = new JsonObject();
            jsonObject3.addProperty(Fsa.T, Vz.J((Vz)d2).J().getCanonicalName());
            jsonObject3.add(wPa.O, a2.serialize(Vz.J((Vz)d2).J()));
            b2.add(Xpa.z, jsonObject);
        }
        return b2;
    }

    public pX_2() {
        pX_2 a2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Vz deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonPrimitive jsonPrimitive;
        gEa gEa2;
        void a2;
        Object object;
        Object object2;
        Object d2 = jsonElement;
        pX_2 c2 = this;
        if (!((JsonElement)d2).isJsonObject()) {
            return null;
        }
        Vz b2 = new Vz();
        if ((d2 = ((JsonElement)d2).getAsJsonObject()) == null) {
            return null;
        }
        if (((JsonObject)d2).has(ZSa.ga)) {
            Vz.k((Vz)b2, (Boolean)((JsonObject)d2).get(ZSa.ga).getAsBoolean());
        }
        if (((JsonObject)d2).has(sra.W)) {
            Vz.A((Vz)b2, (Boolean)((JsonObject)d2).get(sra.W).getAsBoolean());
        }
        if (((JsonObject)d2).has(wra.E)) {
            Vz.J((Vz)b2, (Boolean)((JsonObject)d2).get(wra.E).getAsBoolean());
        }
        if (((JsonObject)d2).has(Asa.S)) {
            Vz.l((Vz)b2, (Boolean)((JsonObject)d2).get(Asa.S).getAsBoolean());
        }
        if (((JsonObject)d2).has(Nta.y)) {
            Vz.i((Vz)b2, (Boolean)((JsonObject)d2).get(Nta.y).getAsBoolean());
        }
        if (((JsonObject)d2).has(Zra.L)) {
            try {
                object2 = ((JsonObject)d2).get(Zra.L).getAsString();
                try {
                    if (((String)object2).startsWith(uQa.Y)) {
                        object = ((String)object2).substring(vRa.d);
                        Vz.J((Vz)b2, (qy)new qy(Integer.parseInt((String)object, ERa.C), ((String)object).length() / uqa.g));
                    }
                    Vz.J((Vz)b2, (pY)((pY)a2.deserialize(((JsonObject)d2).get(Zra.L), (Type)((Object)pY.class))));
                    if (Vz.J((Vz)b2) == null) {
                        Vz.J((Vz)b2, (pY)pY.WHITE);
                    }
                }
                catch (Exception exception) {
                    Vz.J((Vz)b2, (pY)pY.WHITE);
                }
            }
            catch (Exception exception) {
                Vz.J((Vz)b2, (pY)pY.WHITE);
            }
        }
        if (((JsonObject)d2).has(wsa.Ka)) {
            Vz.f((Vz)b2, (Boolean)((JsonObject)d2).get(wsa.Ka).getAsBoolean());
        }
        if (((JsonObject)d2).has(pua.Ea)) {
            Vz.d((Vz)b2, (Boolean)((JsonObject)d2).get(pua.Ea).getAsBoolean());
        }
        if (((JsonObject)d2).has(cRa.M)) {
            Vz.G((Vz)b2, (Boolean)((JsonObject)d2).get(cRa.M).getAsBoolean());
        }
        if (((JsonObject)d2).has(xqa.Ha)) {
            Vz.e((Vz)b2, (Boolean)((JsonObject)d2).get(xqa.Ha).getAsBoolean());
        }
        if (((JsonObject)d2).has(Yqa.e)) {
            Vz.M((Vz)b2, (Boolean)((JsonObject)d2).get(Yqa.e).getAsBoolean());
        }
        if (((JsonObject)d2).has(Xpa.v)) {
            Vz.F((Vz)b2, (Boolean)((JsonObject)d2).get(Xpa.v).getAsBoolean());
        }
        if (((JsonObject)d2).has(ypa.H)) {
            Vz.J((Vz)b2, (String)((JsonObject)d2).get(ypa.H).getAsString());
        }
        if (((JsonObject)d2).has(xOa.A)) {
            Vz.D((Vz)b2, (Boolean)((JsonObject)d2).get(xOa.A).getAsBoolean());
        }
        if (((JsonObject)d2).has(Jqa.a)) {
            Vz.C((Vz)b2, (Boolean)((JsonObject)d2).get(Jqa.a).getAsBoolean());
        }
        if (((JsonObject)d2).has(uSa.ca)) {
            Vz.f((Vz)b2, (String)((JsonObject)d2).get(uSa.ca).getAsString());
        }
        if (((JsonObject)d2).has(hpa.h) && (object2 = ((JsonObject)d2).getAsJsonObject(hpa.h)) != null) {
            String string;
            object = ((JsonObject)object2).getAsJsonPrimitive(Fsa.T);
            gEa2 = object == null ? null : gEa.getValueByCanonicalName((String)((JsonPrimitive)object).getAsString());
            jsonPrimitive = ((JsonObject)object2).getAsJsonPrimitive(wPa.O);
            String string2 = string = jsonPrimitive == null ? null : jsonPrimitive.getAsString();
            if (gEa2 != null && string != null && gEa2.shouldAllowInChat()) {
                Vz.J((Vz)b2, (PEa)new PEa(gEa2, string));
            }
        }
        if (((JsonObject)d2).has(Xpa.z) && (object2 = ((JsonObject)d2).getAsJsonObject(Xpa.z)) != null) {
            object = ((JsonObject)object2).getAsJsonPrimitive(Fsa.T);
            gEa2 = object == null ? null : Hfa.getValueByCanonicalName((String)((JsonPrimitive)object).getAsString());
            jsonPrimitive = (ld)a2.deserialize(((JsonObject)object2).get(wPa.O), (Type)((Object)ld.class));
            if (gEa2 != null && jsonPrimitive != null && gEa2.shouldAllowInChat()) {
                Vz.J((Vz)b2, (pEa)new pEa((Hfa)gEa2, (ld)jsonPrimitive));
            }
        }
        return b2;
    }
}

