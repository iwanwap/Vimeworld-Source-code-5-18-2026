/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JD
 *  RQa
 *  Rua
 *  Uf
 *  aD
 *  jE
 *  vpa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class KD
implements JsonDeserializer<aD> {
    /*
     * WARNING - void declaration
     */
    @Override
    public aD deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        Object d2 = jsonElement;
        KD c2 = this;
        if (!((JsonElement)d2).isJsonObject()) {
            return null;
        }
        d2 = ((JsonElement)d2).getAsJsonObject();
        aD b2 = new aD();
        if (((JsonObject)d2).has(dua.T)) {
            b2.J(((JsonObject)d2).get(dua.T).getAsString());
        }
        if (((JsonObject)d2).has(xqa.J)) {
            b2.f(((JsonObject)d2).get(xqa.J).getAsString());
        }
        if (((JsonObject)d2).has(Rua.C)) {
            b2.J(((JsonObject)d2).get(Rua.C).getAsFloat());
        }
        if (((JsonObject)d2).has(vpa.Q)) {
            b2.f(((JsonObject)d2).get(vpa.Q).getAsFloat());
        }
        if (((JsonObject)d2).has(uqa.K)) {
            b2.l(((JsonObject)d2).get(uqa.K).getAsFloat());
        }
        if (((JsonObject)d2).has(yRa.b)) {
            b2.J(((JsonObject)d2).get(yRa.b).getAsBoolean());
        }
        if (((JsonObject)d2).has(APa.f)) {
            c2.J(b2.J(), ((JsonObject)d2).get(APa.f), (JsonDeserializationContext)a2);
        }
        if (((JsonObject)d2).has(WRa.q)) {
            b2.l(((JsonObject)d2).get(WRa.q).getAsString());
        }
        if (((JsonObject)d2).has(Fua.k)) {
            b2.J((jE)a2.deserialize(((JsonObject)d2).get(Fua.k), (Type)((Object)jE.class)));
        }
        if (((JsonObject)d2).has(RQa.H)) {
            b2.J((Map)a2.deserialize(((JsonObject)d2).get(RQa.H), new JD(c2).getType()));
        }
        return b2;
    }

    public static String[] J(JsonArray jsonArray) {
        JsonArray jsonArray2 = jsonArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        int a2 = uSa.E;
        int n2 = jsonArray2.size();
        int n3 = a2;
        while (n3 < n2) {
            JsonElement jsonElement = jsonArray2.get(a2);
            if (jsonElement.isJsonPrimitive()) {
                arrayList.add(jsonElement.getAsString());
            }
            n3 = ++a2;
        }
        return arrayList.toArray(new String[uSa.E]);
    }

    public KD() {
        KD a2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Map<String, Uf> map, JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
        block3: {
            Iterator<Map.Entry<String, JsonElement>> iterator;
            void b2;
            void c2;
            block2: {
                int d2;
                KD kD = this;
                c2.clear();
                if (!b2.isJsonArray()) break block2;
                String[] stringArray = KD.J(b2.getAsJsonArray());
                int n2 = stringArray.length;
                int n3 = d2 = uSa.E;
                while (n3 < n2) {
                    String string;
                    String string2 = string = stringArray[d2];
                    String string3 = string;
                    c2.put(string3, new Uf(string3));
                    n3 = ++d2;
                }
                break block3;
            }
            if (!b2.isJsonObject()) break block3;
            Iterator<Map.Entry<String, JsonElement>> iterator2 = iterator = ((JsonObject)b2).entrySet().iterator();
            while (iterator2.hasNext()) {
                void a2;
                Map.Entry<String, JsonElement> entry = iterator.next();
                KD d2 = (Uf)a2.deserialize(entry.getValue(), (Type)((Object)Uf.class));
                d2.J(entry.getKey());
                iterator2 = iterator;
                c2.put(d2.J(), d2);
            }
        }
    }
}

