/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Maa
 *  OLa
 *  XJa
 *  tJa
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class rka_3
implements JsonDeserializer<tJa> {
    public rka_3() {
        rka_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    public List<XJa> J(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Iterator<Map.Entry<String, JsonElement>> c2 = jsonObject;
        rka_3 a2 = this;
        c2 = Maa.J((JsonObject)((Object)c2), (String)Mqa.J);
        ArrayList<XJa> arrayList = Lists.newArrayList();
        Iterator<Map.Entry<String, JsonElement>> iterator = c2 = ((JsonObject)((Object)c2)).entrySet().iterator();
        while (iterator.hasNext()) {
            void b2;
            Map.Entry<String, JsonElement> entry = c2.next();
            iterator = c2;
            arrayList.add(a2.J((JsonDeserializationContext)b2, entry));
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        List<XJa> d2 = jsonElement;
        rka_3 c2 = this;
        d2 = ((JsonElement)((Object)d2)).getAsJsonObject();
        d2 = c2.J((JsonDeserializationContext)a2, (JsonObject)((Object)d2));
        return new tJa(d2);
    }

    /*
     * WARNING - void declaration
     */
    public XJa J(JsonDeserializationContext jsonDeserializationContext, Map.Entry<String, JsonElement> entry) {
        void b2;
        Object c2 = entry;
        rka_3 a2 = this;
        String string = (String)c2.getKey();
        ArrayList<OLa> arrayList = Lists.newArrayList();
        if (((JsonElement)(c2 = (JsonElement)c2.getValue())).isJsonArray()) {
            Iterator<JsonElement> iterator;
            Iterator<JsonElement> iterator2 = iterator = ((JsonElement)c2).getAsJsonArray().iterator();
            while (iterator2.hasNext()) {
                JsonElement jsonElement = iterator.next();
                arrayList.add((OLa)b2.deserialize(jsonElement, (Type)((Object)OLa.class)));
                iterator2 = iterator;
            }
        } else {
            arrayList.add((OLa)b2.deserialize((JsonElement)c2, (Type)((Object)OLa.class)));
        }
        return new XJa(string, arrayList);
    }
}

