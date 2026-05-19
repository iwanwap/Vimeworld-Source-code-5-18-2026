/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  Maa
 *  Rja
 *  hJa
 *  pua
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dja_1
implements JsonDeserializer<Rja> {
    public Dja_1() {
        Dja_1 a2;
    }

    private DZ J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Dja_1 a2 = this;
        return DZ.byName(Maa.J((JsonObject)b2, (String)xua.w, (String)Mqa.y));
    }

    private String J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Dja_1 a2 = this;
        return Maa.J((JsonObject)b2, (String)EQa.Ga);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Rja deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        void a2;
        Object d2 = jsonElement;
        Dja_1 c2 = this;
        d2 = ((JsonElement)d2).getAsJsonObject();
        Dja_1 dja_1 = c2;
        DZ b2 = dja_1.J((JsonObject)d2);
        int n2 = dja_1.J((JsonObject)d2);
        String string = dja_1.J((JsonObject)d2);
        d2 = (hJa)a2.deserialize((JsonElement)d2, (Type)((Object)hJa.class));
        return new Rja(b2, n2, string, (hJa)d2);
    }

    public int J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Dja_1 a2 = this;
        return Maa.J((JsonObject)b2, (String)LPa.g, (int)pua.o);
    }
}

