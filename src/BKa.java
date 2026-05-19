/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  BRa
 *  CLa
 *  JPa
 *  Maa
 *  NQa
 *  Oz
 *  RPa
 *  Rja
 *  WSa
 *  Ypa
 *  fsa
 *  uQa
 *  uRa
 *  vRa
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BKa
implements JsonDeserializer<GJa> {
    private RX J(JsonObject jsonObject) {
        Object b2 = jsonObject;
        BKa a2 = this;
        RX rX = RX.byName(((String)(b2 = Maa.J((JsonObject)b2, (String)Ypa.V))).toLowerCase());
        if (rX == null) {
            throw new JsonParseException(new StringBuilder().insert(5 >> 3, WSa.y).append((String)b2).toString());
        }
        return rX;
    }

    private float J(JsonObject jsonObject) {
        JsonObject b22 = jsonObject;
        BKa a2 = this;
        float b22 = Maa.J((JsonObject)b22, (String)wta.U);
        if (b22 != JPa.N && Oz.l((float)b22) != xTa.S && Oz.l((float)b22) != nua.E) {
            throw new JsonParseException(new StringBuilder().insert(3 & 4, Ata.Ka).append(b22).append(Fsa.i).toString());
        }
        return b22;
    }

    private CLa J(JsonObject jsonObject) {
        Object b22 = jsonObject;
        BKa a2 = this;
        CLa cLa = null;
        if (((JsonObject)b22).has(NQa.ja)) {
            b22 = Maa.J((JsonObject)b22, (String)NQa.ja);
            Vector3f vector3f = a2.J((JsonObject)b22, hQa.i);
            vector3f.scale(rRa.T);
            BKa bKa2 = a2;
            RX rX = bKa2.J((JsonObject)b22);
            float f2 = bKa2.J((JsonObject)b22);
            boolean b22 = Maa.J((JsonObject)b22, (String)Ura.Z, uSa.E != 0);
            cLa = new CLa(vector3f, rX, f2, b22);
        }
        return cLa;
    }

    /*
     * WARNING - void declaration
     */
    private Map<DZ, Rja> f(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Iterator<Map.Entry<String, JsonElement>> c2 = jsonObject;
        BKa a2 = this;
        EnumMap<DZ, Rja> enumMap = Maps.newEnumMap(DZ.class);
        Iterator<Map.Entry<String, JsonElement>> iterator = c2 = Maa.J((JsonObject)((Object)c2), (String)ITa.Z).entrySet().iterator();
        while (iterator.hasNext()) {
            void b2;
            Map.Entry<String, JsonElement> entry = c2.next();
            DZ dZ2 = a2.J(entry.getKey());
            enumMap.put(dZ2, (Rja)b2.deserialize(entry.getValue(), (Type)((Object)Rja.class)));
            iterator = c2;
        }
        return enumMap;
    }

    public BKa() {
        BKa a2;
    }

    /*
     * WARNING - void declaration
     */
    private Map<DZ, Rja> J(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        void a2;
        Map<DZ, Rja> c2 = jsonDeserializationContext;
        Map<DZ, Rja> b2 = this;
        if ((c2 = ((BKa)((Object)b2)).f((JsonDeserializationContext)((Object)c2), (JsonObject)a2)).isEmpty()) {
            throw new JsonParseException(SPa.n);
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private Vector3f J(JsonObject jsonObject, String string) {
        int n2;
        void a2;
        JsonArray b2;
        BKa bKa2 = this;
        if ((b2 = Maa.J((JsonObject)((Object)b2), (String)a2)).size() != yRa.d) {
            throw new JsonParseException(new StringBuilder().insert(2 & 5, BRa.F).append((String)a2).append(TOa.X).append(b2.size()).toString());
        }
        Object c2 = new float[yRa.d];
        int n3 = n2 = uSa.E;
        while (n3 < ((Object)c2).length) {
            int n4 = n2;
            float f2 = Maa.J((JsonElement)b2.get(n2), (String)new StringBuilder().insert(3 >> 2, (String)a2).append(dqa.X).append(n4).append(XOa.D).toString());
            c2[n4] = f2;
            n3 = ++n2;
        }
        return new Vector3f((float)c2[uSa.E], (float)c2[vRa.d], (float)c2[uqa.g]);
    }

    /*
     * WARNING - void declaration
     */
    private DZ J(String string) {
        void a2;
        BKa bKa2 = this;
        Object b2 = DZ.byName((String)a2);
        if (b2 == null) {
            throw new JsonParseException(new StringBuilder().insert(3 >> 2, uRa.B).append((String)a2).toString());
        }
        return b2;
    }

    @Override
    public GJa deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Map<DZ, Rja> a2;
        Object d22 = jsonElement;
        BKa c2 = this;
        d22 = ((JsonElement)d22).getAsJsonObject();
        BKa bKa2 = c2;
        Vector3f b2 = bKa2.J((JsonObject)d22);
        Vector3f vector3f = bKa2.f((JsonObject)d22);
        CLa cLa = bKa2.J((JsonObject)d22);
        a2 = bKa2.J((JsonDeserializationContext)((Object)a2), (JsonObject)d22);
        if (((JsonObject)d22).has(fsa.Ha) && !Maa.J((JsonObject)d22, (String)fsa.Ha)) {
            throw new JsonParseException(STa.x);
        }
        boolean d22 = Maa.J((JsonObject)d22, (String)fsa.Ha, vRa.d != 0);
        return new GJa(b2, vector3f, a2, cLa, d22);
    }

    private Vector3f f(JsonObject jsonObject) {
        Vector3f vector3f;
        Object b2 = jsonObject;
        BKa a2 = this;
        b2 = a2.J((JsonObject)b2, uQa.S);
        if (vector3f.x >= FRa.B && ((Vector3f)b2).y >= FRa.B && ((Vector3f)b2).z >= FRa.B && ((Vector3f)b2).x <= Ura.m && ((Vector3f)b2).y <= Ura.m && ((Vector3f)b2).z <= Ura.m) {
            return b2;
        }
        throw new JsonParseException(new StringBuilder().insert(3 & 4, xra.S).append(b2).toString());
    }

    private Vector3f J(JsonObject jsonObject) {
        Vector3f vector3f;
        Object b2 = jsonObject;
        BKa a2 = this;
        b2 = a2.J((JsonObject)b2, RPa.Y);
        if (vector3f.x >= FRa.B && ((Vector3f)b2).y >= FRa.B && ((Vector3f)b2).z >= FRa.B && ((Vector3f)b2).x <= Ura.m && ((Vector3f)b2).y <= Ura.m && ((Vector3f)b2).z <= Ura.m) {
            return b2;
        }
        throw new JsonParseException(new StringBuilder().insert(5 >> 3, GPa.Q).append(b2).toString());
    }
}

