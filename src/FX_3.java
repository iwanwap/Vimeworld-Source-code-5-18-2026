/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kb
 */
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;

public final class FX_3
extends ForwardingSet<String>
implements Kb {
    private final Set<String> underlyingSet = Sets.newHashSet();

    public JsonElement J() {
        Object a2;
        FX_3 fX_3 = this;
        JsonArray jsonArray = new JsonArray();
        Object object = a2 = fX_3.iterator();
        while (object.hasNext()) {
            String string = (String)a2.next();
            object = a2;
            jsonArray.add(new JsonPrimitive(string));
        }
        return jsonArray;
    }

    public FX_3() {
        FX_3 a2;
    }

    public void J(JsonElement jsonElement) {
        Iterator<JsonElement> b2 = jsonElement;
        FX_3 a2 = this;
        if (((JsonElement)((Object)b2)).isJsonArray()) {
            Iterator<JsonElement> iterator = b2 = ((JsonElement)((Object)b2)).getAsJsonArray().iterator();
            while (iterator.hasNext()) {
                JsonElement jsonElement2 = b2.next();
                iterator = b2;
                a2.add(jsonElement2.getAsString());
            }
        }
    }

    @Override
    public Set<String> delegate() {
        FX_3 a2;
        return a2.underlyingSet;
    }
}

