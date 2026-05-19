/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  JPa
 *  Maa
 *  NQa
 *  Oz
 *  Rua
 *  YSa
 *  iJa
 *  pqa
 *  vRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.lwjgl.util.vector.Vector3f;

public final class FKa_2
implements JsonDeserializer<iJa> {
    private static final Vector3f TRANSLATION_DEFAULT;
    private static final Vector3f ROTATION_DEFAULT;
    private static final Vector3f SCALE_DEFAULT;

    static {
        ROTATION_DEFAULT = new Vector3f(JPa.N, JPa.N, JPa.N);
        TRANSLATION_DEFAULT = new Vector3f(JPa.N, JPa.N, JPa.N);
        SCALE_DEFAULT = new Vector3f(pqa.r, pqa.r, pqa.r);
    }

    @Override
    public iJa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d2 = jsonElement;
        FKa_2 c2 = this;
        d2 = ((JsonElement)d2).getAsJsonObject();
        FKa_2 fKa_2 = c2;
        Vector3f b2 = fKa_2.J((JsonObject)d2, NQa.ja, ROTATION_DEFAULT);
        Vector3f a2 = fKa_2.J((JsonObject)d2, gua.B, TRANSLATION_DEFAULT);
        a2.scale(rRa.T);
        Vector3f vector3f = a2;
        vector3f.x = Oz.J((float)vector3f.x, (float)FRa.ca, (float)Ira.d);
        vector3f.y = Oz.J((float)vector3f.y, (float)FRa.ca, (float)Ira.d);
        vector3f.z = Oz.J((float)vector3f.z, (float)FRa.ca, (float)Ira.d);
        d2 = c2.J((JsonObject)d2, Rua.C, SCALE_DEFAULT);
        ((Vector3f)d2).x = Oz.J((float)((Vector3f)d2).x, (float)NQa.m, (float)YSa.G);
        ((Vector3f)d2).y = Oz.J((float)((Vector3f)d2).y, (float)NQa.m, (float)YSa.G);
        ((Vector3f)d2).z = Oz.J((float)((Vector3f)d2).z, (float)NQa.m, (float)YSa.G);
        return new iJa(b2, a2, (Vector3f)d2);
    }

    public FKa_2() {
        FKa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private Vector3f J(JsonObject jsonObject, String string, Vector3f vector3f) {
        int n2;
        void b2;
        JsonArray c2;
        Object d2 = vector3f;
        FKa_2 a2 = this;
        if (!((JsonObject)((Object)c2)).has((String)b2)) {
            return d2;
        }
        if ((c2 = Maa.J((JsonObject)((Object)c2), (String)b2)).size() != yRa.d) {
            throw new JsonParseException(new StringBuilder().insert(3 ^ 3, BRa.F).append((String)b2).append(TOa.X).append(c2.size()).toString());
        }
        d2 = new float[yRa.d];
        int n3 = n2 = uSa.E;
        while (n3 < ((Object)d2).length) {
            int n4 = n2;
            float f2 = Maa.J((JsonElement)c2.get(n2), (String)new StringBuilder().insert(5 >> 3, (String)b2).append(dqa.X).append(n4).append(XOa.D).toString());
            d2[n4] = f2;
            n3 = ++n2;
        }
        return new Vector3f((float)d2[uSa.E], (float)d2[vRa.d], (float)d2[uqa.g]);
    }
}

