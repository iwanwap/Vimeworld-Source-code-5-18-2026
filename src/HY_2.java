/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  D
 *  Fpa
 *  Gaa
 *  Gua
 *  Maa
 *  Ppa
 *  TQa
 *  Usa
 *  Uta
 *  Vz
 *  dy
 *  kPa
 *  ld
 *  pX
 *  wPa
 *  yX
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

public final class HY_2
implements JsonDeserializer<ld>,
JsonSerializer<ld>,
D {
    private static final Gson GSON;

    /*
     * WARNING - void declaration
     */
    private void J(Vz vz2, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        Map.Entry<String, JsonElement> a2;
        Iterator<Map.Entry<String, JsonElement>> d2 = vz2;
        HY_2 c2 = this;
        if (((JsonElement)((Object)(d2 = a2.serialize(d2)))).isJsonObject()) {
            Iterator<Map.Entry<String, JsonElement>> iterator = d2 = ((JsonObject)((Object)d2)).entrySet().iterator();
            while (iterator.hasNext()) {
                void b2;
                a2 = d2.next();
                b2.add(a2.getKey(), a2.getValue());
                iterator = d2;
            }
        }
    }

    public static String J(ld a2) {
        return GSON.toJson(a2);
    }

    public HY_2() {
        HY_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ld deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void b2;
        JsonObject jsonObject;
        CY cY2;
        void a2;
        Object d2;
        void c2;
        HY_2 hY_2 = this;
        if (c2.isJsonPrimitive()) {
            return new CY(c2.getAsString());
        }
        if (!c2.isJsonObject()) {
            if (c2.isJsonArray()) {
                JsonArray jsonArray = c2.getAsJsonArray();
                ld ld2 = null;
                d2 = jsonArray.iterator();
                while (d2.hasNext()) {
                    JsonElement jsonElement2;
                    JsonElement jsonElement3 = jsonElement2 = (JsonElement)d2.next();
                    ld ld3 = hY_2.deserialize(jsonElement3, jsonElement3.getClass(), (JsonDeserializationContext)a2);
                    if (ld2 == null) {
                        ld2 = ld3;
                        continue;
                    }
                    ld2.J(ld3);
                }
                return ld2;
            }
            throw new JsonParseException(new StringBuilder().insert(3 & 4, yOa.z).append(c2.toString()).append(Usa.Y).toString());
        }
        JsonObject jsonObject2 = c2.getAsJsonObject();
        if (jsonObject2.has(yRa.Da)) {
            cY2 = new CY(jsonObject2.get(yRa.Da).getAsString());
            jsonObject = jsonObject2;
        } else {
            if (jsonObject2.has(Gua.x)) {
                JsonObject jsonObject3 = jsonObject2;
                d2 = jsonObject3.get(Gua.x).getAsString();
                if (jsonObject3.has(Ppa.M)) {
                    int n2;
                    JsonArray jsonArray = jsonObject2.getAsJsonArray(Ppa.M);
                    Object[] objectArray = new Object[jsonArray.size()];
                    int n3 = n2 = uSa.E;
                    while (n3 < objectArray.length) {
                        CY cY3;
                        int n4 = n2;
                        objectArray[n4] = hY_2.deserialize(jsonArray.get(n4), (Type)b2, (JsonDeserializationContext)a2);
                        if (objectArray[n2] instanceof CY && (cY3 = (CY)objectArray[n2]).J().A() && cY3.J().isEmpty()) {
                            objectArray[n2] = cY3.C();
                        }
                        n3 = ++n2;
                    }
                    cY2 = new CZ((String)d2, objectArray);
                } else {
                    cY2 = new CZ((String)d2, new Object[uSa.E]);
                }
            } else if (jsonObject2.has(xSa.a)) {
                d2 = jsonObject2.getAsJsonObject(xSa.a);
                if (!((JsonObject)d2).has(dua.T) || !((JsonObject)d2).has(TQa.I)) {
                    throw new JsonParseException(Fpa.V);
                }
                cY2 = new yX(Maa.J((JsonObject)d2, (String)dua.T), Maa.J((JsonObject)d2, (String)TQa.I));
                if (((JsonObject)d2).has(wPa.O)) {
                    ((yX)cY2).J(Maa.J((JsonObject)d2, (String)wPa.O));
                }
            } else {
                if (!jsonObject2.has(KPa.B)) {
                    throw new JsonParseException(new StringBuilder().insert(3 ^ 3, yOa.z).append(c2.toString()).append(Usa.Y).toString());
                }
                cY2 = new Gaa(Maa.J((JsonObject)jsonObject2, (String)KPa.B));
            }
            jsonObject = jsonObject2;
        }
        if (jsonObject.has(kPa.g)) {
            int n5;
            d2 = jsonObject2.getAsJsonArray(kPa.g);
            if (((JsonArray)d2).size() <= 0) {
                throw new JsonParseException(xSa.Da);
            }
            int n6 = n5 = uSa.E;
            while (n6 < ((JsonArray)d2).size()) {
                JsonElement jsonElement4 = ((JsonArray)d2).get(n5);
                cY2.J(hY_2.deserialize(jsonElement4, (Type)b2, (JsonDeserializationContext)a2));
                n6 = ++n5;
            }
        }
        cY2.J((Vz)a2.deserialize((JsonElement)c2, (Type)((Object)Vz.class)));
        return cY2;
    }

    public static ld J(String a2) {
        return GSON.fromJson(a2, ld.class);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(ld.class, new HY_2());
        gsonBuilder.registerTypeHierarchyAdapter(Vz.class, new pX());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new dy());
        GSON = gsonBuilder.create();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(ld ld2, Type type, JsonSerializationContext jsonSerializationContext) {
        Object[] objectArray;
        Object object;
        JsonArray jsonArray;
        void a2;
        HY_2 d2 = ld2;
        HY_2 c2 = this;
        if (d2 instanceof CY && d2.J().A() && d2.J().isEmpty()) {
            return new JsonPrimitive(((CY)d2).C());
        }
        JsonObject b2 = new JsonObject();
        if (!d2.J().A()) {
            c2.J(d2.J(), b2, (JsonSerializationContext)a2);
        }
        if (!d2.J().isEmpty()) {
            jsonArray = new JsonArray();
            Object object2 = object = d2.J().iterator();
            while (object2.hasNext()) {
                objectArray = (Object[])object.next();
                object2 = object;
                jsonArray.add(c2.serialize((ld)objectArray, (Type)objectArray.getClass(), (JsonSerializationContext)a2));
            }
            b2.add(kPa.g, jsonArray);
        }
        if (d2 instanceof CY) {
            b2.addProperty(yRa.Da, ((CY)d2).C());
            return b2;
        }
        if (d2 instanceof CZ) {
            JsonArray jsonArray2 = jsonArray = (CZ)d2;
            b2.addProperty(Gua.x, jsonArray2.C());
            if (jsonArray2.J() != null && jsonArray.J().length > 0) {
                int n2;
                object = new JsonArray();
                objectArray = jsonArray.J();
                int n3 = objectArray.length;
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    Object object3 = objectArray[n2];
                    Object object4 = object;
                    if (object3 instanceof ld) {
                        ((JsonArray)object4).add(c2.serialize((ld)object3, (Type)object3.getClass(), (JsonSerializationContext)a2));
                    } else {
                        ((JsonArray)object4).add(new JsonPrimitive(String.valueOf(object3)));
                    }
                    n4 = ++n2;
                }
                b2.add(Ppa.M, (JsonElement)object);
            }
        } else {
            HY_2 hY_2 = d2;
            if (d2 instanceof yX) {
                jsonArray = (yX)hY_2;
                object = new JsonObject();
                JsonObject jsonObject = b2;
                Object object5 = object;
                ((JsonObject)object5).addProperty(dua.T, jsonArray.d());
                ((JsonObject)object5).addProperty(TQa.I, jsonArray.C());
                ((JsonObject)object5).addProperty(wPa.O, jsonArray.J());
                jsonObject.add(xSa.a, (JsonElement)object);
                return jsonObject;
            }
            if (!(hY_2 instanceof Gaa)) {
                throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, uSa.Ka).append(d2).append(Uta.z).toString());
            }
            jsonArray = (Gaa)d2;
            b2.addProperty(KPa.B, jsonArray.C());
        }
        return b2;
    }
}

