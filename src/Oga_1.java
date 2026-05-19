/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  Maa
 *  NPa
 *  NTa
 *  Spa
 *  dQa
 *  fIa
 *  fTa
 *  iIa
 *  pua
 *  vRa
 *  yra
 *  zHa
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public final class Oga_1
extends zHa<fIa>
implements JsonSerializer<fIa> {
    public Oga_1() {
        Oga_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    private iIa J(int n2, JsonElement jsonElement) {
        void b322;
        JsonElement c22 = jsonElement;
        Oga_1 a2 = this;
        if (c22.isJsonPrimitive()) {
            return new iIa(Maa.J((JsonElement)c22, (String)(gsa.v + (int)b322 + XOa.D)));
        }
        if (c22.isJsonObject()) {
            JsonObject b322 = Maa.J((JsonElement)c22, (String)new StringBuilder().insert(3 ^ 3, gsa.v).append((int)b322).append(XOa.D).toString());
            int c22 = Maa.J((JsonObject)b322, (String)vsa.G, (int)pua.o);
            if (b322.has(vsa.G)) {
                Validate.inclusiveBetween(dQa.Ga, Gua.R, c22, fTa.J);
            }
            int b322 = Maa.J((JsonObject)b322, (String)BPa.w);
            Validate.inclusiveBetween(nqa.i, Gua.R, b322, Ura.i);
            return new iIa(b322, c22);
        }
        return null;
    }

    @Override
    public JsonElement serialize(fIa fIa2, Type type, JsonSerializationContext jsonSerializationContext) {
        Oga_1 d2 = fIa2;
        Oga_1 c2 = this;
        JsonObject b2 = new JsonObject();
        Oga_1 oga_1 = d2;
        b2.addProperty(yra.B, oga_1.C());
        if (oga_1.f() != pua.o) {
            b2.addProperty(oQa.R, d2.f());
        }
        if (d2.J() != pua.o) {
            b2.addProperty(NTa.x, d2.J());
        }
        if (d2.l() > 0) {
            int n2;
            JsonArray a2 = new JsonArray();
            int n3 = n2 = uSa.E;
            while (n3 < d2.l()) {
                if (d2.J(n2)) {
                    JsonObject jsonObject;
                    JsonObject jsonObject2 = jsonObject = new JsonObject();
                    jsonObject2.addProperty(BPa.w, d2.J(n2));
                    jsonObject2.addProperty(vsa.G, d2.f(n2));
                    a2.add(jsonObject2);
                } else {
                    a2.add(new JsonPrimitive(d2.J(n2)));
                }
                n3 = ++n2;
            }
            b2.add(yRa.Fa, a2);
        }
        return b2;
    }

    public String J() {
        return Spa.e;
    }

    public fIa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int n2;
        JsonObject c2;
        Oga_1 oga_1 = this;
        ArrayList<iIa> b2 = Lists.newArrayList();
        int a2 = Maa.J((JsonObject)(c2 = Maa.J((JsonElement)c2, (String)NPa.A)), (String)yra.B, (int)vRa.d);
        if (a2 != vRa.d) {
            Validate.inclusiveBetween(dQa.Ga, Gua.R, a2, QTa.y);
        }
        if (c2.has(yRa.Fa)) {
            try {
                JsonArray d2 = Maa.J((JsonObject)c2, (String)yRa.Fa);
                for (n2 = uSa.E; n2 < d2.size(); ++n2) {
                    JsonElement jsonElement2 = d2.get(n2);
                    iIa iIa2 = oga_1.J(n2, jsonElement2);
                    if (iIa2 == null) continue;
                    b2.add(iIa2);
                }
            }
            catch (ClassCastException d2) {
                throw new JsonParseException(new StringBuilder().insert(3 ^ 3, rRa.O).append(c2.get(yRa.Fa)).toString(), d2);
            }
        }
        JsonObject jsonObject = c2;
        int d2 = Maa.J((JsonObject)jsonObject, (String)oQa.R, (int)pua.o);
        n2 = Maa.J((JsonObject)jsonObject, (String)NTa.x, (int)pua.o);
        if (d2 != pua.o) {
            Validate.inclusiveBetween(dQa.Ga, Gua.R, d2, Zqa.Y);
        }
        if (n2 != pua.o) {
            Validate.inclusiveBetween(dQa.Ga, Gua.R, n2, pua.L);
        }
        boolean bl = Maa.J((JsonObject)c2, (String)Psa.J, uSa.E != 0);
        return new fIa(b2, d2, n2, a2, bl);
    }
}

