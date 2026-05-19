/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Maa
 *  OLa
 *  uOa
 *  vRa
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Eja
implements JsonDeserializer<OLa> {
    private ResourceLocation J(String string) {
        Object b2 = string;
        Eja a2 = this;
        b2 = new ResourceLocation((String)b2);
        b2 = new ResourceLocation(((ResourceLocation)b2).f(), new StringBuilder().insert(3 ^ 3, dqa.P).append(((ResourceLocation)b2).J()).toString());
        return b2;
    }

    public Eja() {
        Eja a2;
    }

    private boolean J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Eja a2 = this;
        return Maa.J((JsonObject)b2, (String)Bpa.Y, uSa.E != 0);
    }

    public String J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Eja a2 = this;
        return Maa.J((JsonObject)b2, (String)Psa.b);
    }

    public int J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Eja a2 = this;
        return Maa.J((JsonObject)b2, (String)Pua.v, (int)vRa.d);
    }

    @Override
    public OLa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d22 = jsonElement;
        Eja c2 = this;
        d22 = ((JsonElement)d22).getAsJsonObject();
        Eja eja = c2;
        String b2 = eja.J((JsonObject)d22);
        AGa a2 = eja.J((JsonObject)d22);
        boolean bl = eja.J((JsonObject)d22);
        int d22 = eja.J((JsonObject)d22);
        return new OLa(c2.J(b2), a2, bl, d22);
    }

    public AGa J(JsonObject jsonObject) {
        int n2;
        JsonObject b22 = jsonObject;
        Eja a2 = this;
        Object object = b22;
        int b22 = Maa.J((JsonObject)object, (String)rRa.X, (int)uSa.E);
        AGa aGa = AGa.getModelRotation(b22, n2 = Maa.J((JsonObject)object, (String)uOa.Ja, (int)uSa.E));
        if (aGa == null) {
            throw new JsonParseException(new StringBuilder().insert(3 & 4, pta.Q).append(b22).append(Era.v).append(n2).toString());
        }
        return aGa;
    }
}

