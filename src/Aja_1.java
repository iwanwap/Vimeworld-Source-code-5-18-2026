/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Maa
 *  hqa
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Aja_1
implements JsonDeserializer<fKa> {
    public boolean J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Aja_1 a2 = this;
        return Maa.J((JsonObject)b2, (String)lTa.g, vRa.d != 0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public fKa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        Object d2 = jsonElement;
        Aja_1 c2 = this;
        d2 = ((JsonElement)d2).getAsJsonObject();
        Aja_1 aja_1 = c2;
        List<GJa> b2 = aja_1.J((JsonDeserializationContext)a2, (JsonObject)d2);
        String string = aja_1.J((JsonObject)d2);
        boolean bl = StringUtils.isEmpty(string);
        boolean bl2 = b2.isEmpty();
        if (bl2 && bl) {
            throw new JsonParseException(APa.W);
        }
        if (!bl && !bl2) {
            throw new JsonParseException(cPa.ga);
        }
        Aja_1 aja_12 = c2;
        Map<String, String> map = aja_12.J((JsonObject)d2);
        boolean bl3 = aja_12.J((JsonObject)d2);
        ItemCameraTransforms itemCameraTransforms = ItemCameraTransforms.DEFAULT;
        if (((JsonObject)d2).has(Jpa.q)) {
            d2 = Maa.J((JsonObject)d2, (String)Jpa.q);
            itemCameraTransforms = (ItemCameraTransforms)a2.deserialize((JsonElement)d2, (Type)((Object)ItemCameraTransforms.class));
        }
        if (bl2) {
            return new fKa(new ResourceLocation(string), map, bl3, vRa.d != 0, itemCameraTransforms);
        }
        return new fKa(b2, map, bl3, vRa.d != 0, itemCameraTransforms);
    }

    /*
     * WARNING - void declaration
     */
    public List<GJa> J(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Iterator<JsonElement> c2 = jsonObject;
        Aja_1 a2 = this;
        ArrayList<GJa> arrayList = Lists.newArrayList();
        if (((JsonObject)((Object)c2)).has(Zra.l)) {
            Iterator<JsonElement> iterator = c2 = Maa.J((JsonObject)((Object)c2), (String)Zra.l).iterator();
            while (iterator.hasNext()) {
                void b2;
                JsonElement jsonElement = c2.next();
                arrayList.add((GJa)b2.deserialize(jsonElement, (Type)((Object)GJa.class)));
                iterator = c2;
            }
        }
        return arrayList;
    }

    private Map<String, String> J(JsonObject jsonObject) {
        Iterator<Map.Entry<String, JsonElement>> b2 = jsonObject;
        Aja_1 a2 = this;
        HashMap<String, String> hashMap = Maps.newHashMap();
        if (((JsonObject)((Object)b2)).has(oua.D)) {
            Iterator<Map.Entry<String, JsonElement>> iterator = b2 = ((JsonObject)((Object)b2)).getAsJsonObject(oua.D).entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, JsonElement> entry = b2.next();
                hashMap.put(entry.getKey(), entry.getValue().getAsString());
                iterator = b2;
            }
        }
        return hashMap;
    }

    private String J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Aja_1 a2 = this;
        return Maa.J((JsonObject)b2, (String)hqa.L, (String)Mqa.y);
    }

    public Aja_1() {
        Aja_1 a2;
    }
}

