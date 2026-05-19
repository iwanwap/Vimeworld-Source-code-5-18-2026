/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  EQa
 *  ERa
 *  JQa
 *  NPa
 *  XTa
 *  Zpa
 *  eC
 *  uQa
 *  vRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zs_3
implements eC<String> {
    private Rt currentTexture;
    private final Map<String, Rt> textures;

    public String toString() {
        zs_3 a2;
        return new StringBuilder().insert(3 & 4, PQa.q).append(a2.currentTexture).append(tSa.I).append(a2.textures).append((char)ySa.Z).toString();
    }

    public String l() {
        zs_3 a2;
        if (a2.currentTexture == null) {
            if (a2.textures.isEmpty()) {
                return Mqa.y;
            }
            return a2.textures.values().toArray(new Rt[uSa.E])[uSa.E].getName();
        }
        return a2.currentTexture.getName();
    }

    public void J(String string) {
        Object b2 = string;
        zs_3 a2 = this;
        if ((b2 = a2.textures.get(b2)) == null && !a2.textures.isEmpty()) {
            a2.currentTexture = a2.textures.values().toArray(new Rt[uSa.E])[uSa.E];
            return;
        }
        a2.currentTexture = b2;
    }

    public Rt J() {
        zs_3 a2;
        return a2.currentTexture;
    }

    public String J() {
        return AQa.N;
    }

    public String f() {
        return EQa.Ga;
    }

    /*
     * WARNING - void declaration
     */
    public zs_3(String string, JsonArray jsonArray) {
        void b2;
        Iterator<JsonElement> a2;
        zs_3 zs_32 = this;
        LinkedHashMap<String, Rt> linkedHashMap = new LinkedHashMap<String, Rt>();
        if (!((JsonElement)((Object)a2)).isJsonArray()) {
            throw new IllegalArgumentException(NPa.g);
        }
        a2 = ((JsonArray)((Object)a2)).iterator();
        block0: while (true) {
            Iterator<JsonElement> iterator = a2;
            while (iterator.hasNext()) {
                JsonObject jsonObject;
                String string2;
                JsonObject c2 = a2.next().getAsJsonObject();
                if (!c2.has(dua.T) || !c2.has(EQa.Ga)) continue block0;
                if (!c2.has(Zra.L)) {
                    iterator = a2;
                    continue;
                }
                String string3 = null;
                if (c2.has(Zra.L) && !(string3 = c2.get(Zra.L).getAsString()).startsWith(uQa.Y)) {
                    string3 = new StringBuilder().insert(3 ^ 3, uQa.Y).append(string3).toString();
                }
                String string4 = c2.get(dua.T).getAsString();
                String string5 = c2.get(dua.T).getAsString();
                String string6 = c2.get(EQa.Ga).getAsString();
                if (c2.has(JQa.V)) {
                    string2 = c2.get(JQa.V).getAsString();
                    jsonObject = c2;
                } else {
                    string2 = null;
                    jsonObject = c2;
                }
                linkedHashMap.put(string4, new Rt(string5, string6, string2, jsonObject.has(Zra.L) && string3 != null ? zs_32.J(string3) : null));
                iterator = a2;
            }
            break;
        }
        zs_32.textures = linkedHashMap;
        zs_32.J((String)b2);
    }

    private Color J(String string) {
        String b22 = string;
        zs_3 a2 = this;
        if (b22 == null || !b22.matches(fqa.Aa)) {
            throw new IllegalArgumentException(Ata.H);
        }
        Object object = b22;
        int b22 = Integer.parseInt(((String)object).substring(vRa.d, yRa.d), ERa.C);
        int n2 = Integer.parseInt(((String)object).substring(yRa.d, tTa.h), ERa.C);
        int n3 = Integer.parseInt(((String)object).substring(tTa.h, XTa.W), ERa.C);
        return new Color(b22, n2, n3);
    }

    public eC<String> clone() {
        Iterator<Map.Entry<String, Rt>> iterator;
        zs_3 zs_32 = this;
        zs_3 zs_33 = new zs_3();
        zs_3 zs_34 = zs_32;
        new zs_3().currentTexture = zs_34.currentTexture.clone();
        Iterator<Map.Entry<String, Rt>> iterator2 = iterator = zs_34.textures.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Rt> a2 = iterator.next();
            zs_33.textures.put((String)a2.getKey(), ((Rt)a2.getValue()).clone());
            iterator2 = iterator;
        }
        return zs_33;
    }

    public Map<String, Rt> J() {
        zs_3 a2;
        return a2.textures;
    }

    public JsonElement serialize() {
        zs_3 a2;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(dua.T, EQa.Ga);
        jsonObject.addProperty(Zpa.x, tSa.e);
        jsonObject.addProperty(EQa.Ga, a2.currentTexture.getName());
        return jsonObject;
    }

    public zs_3() {
        zs_3 a2;
        zs_3 zs_32 = a2;
        zs_32.textures = new LinkedHashMap<String, Rt>();
    }
}

