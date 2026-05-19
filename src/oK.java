/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  EQa
 *  JTa
 *  Lra
 *  NPa
 *  NQa
 *  Ql
 *  UL
 *  Usa
 *  Ysa
 *  aSa
 *  bqa
 *  cK
 *  dQa
 *  fsa
 *  iPa
 *  mra
 *  qta
 *  tJ
 *  uOa
 *  uRa
 *  vRa
 *  wOa
 *  yk
 *  zTa
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentAppearanceBillboard;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentAppearanceLighting;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentAppearanceTinting;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentCollisionAppearance;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentCollisionTinting;
import net.xtrafrancyz.mods.texteria.snowstorm.components.expiration.BedrockComponentExpireInBlocks;
import net.xtrafrancyz.mods.texteria.snowstorm.components.expiration.BedrockComponentExpireNotInBlocks;
import net.xtrafrancyz.mods.texteria.snowstorm.components.expiration.BedrockComponentKillPlane;
import net.xtrafrancyz.mods.texteria.snowstorm.components.expiration.BedrockComponentParticleLifetime;
import net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime.BedrockComponentLifetimeExpression;
import net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime.BedrockComponentLifetimeLooping;
import net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime.BedrockComponentLifetimeOnce;
import net.xtrafrancyz.mods.texteria.snowstorm.components.meta.BedrockComponentInitialization;
import net.xtrafrancyz.mods.texteria.snowstorm.components.meta.BedrockComponentLocalSpace;
import net.xtrafrancyz.mods.texteria.snowstorm.components.motion.BedrockComponentInitialSpeed;
import net.xtrafrancyz.mods.texteria.snowstorm.components.motion.BedrockComponentInitialSpin;
import net.xtrafrancyz.mods.texteria.snowstorm.components.motion.BedrockComponentMotionCollision;
import net.xtrafrancyz.mods.texteria.snowstorm.components.motion.BedrockComponentMotionDynamic;
import net.xtrafrancyz.mods.texteria.snowstorm.components.motion.BedrockComponentMotionParametric;
import net.xtrafrancyz.mods.texteria.snowstorm.components.rate.BedrockComponentRateInstant;
import net.xtrafrancyz.mods.texteria.snowstorm.components.rate.BedrockComponentRateSteady;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeBox;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeDisc;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeEntityAABB;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapePoint;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeSphere;

public final class oK
implements JsonDeserializer<JJ>,
JsonSerializer<JJ> {
    public BiMap<String, Class<? extends tJ>> components;

    public oK() {
        oK a2;
        oK oK2 = a2;
        oK2.components = HashBiMap.create();
        oK2.components.put(zua.V, BedrockComponentLocalSpace.class);
        a2.components.put(JTa.fa, BedrockComponentInitialization.class);
        a2.components.put(NQa.Ka, BedrockComponentRateInstant.class);
        a2.components.put(yta.N, BedrockComponentRateSteady.class);
        a2.components.put(zpa.k, BedrockComponentLifetimeLooping.class);
        a2.components.put(uOa.L, BedrockComponentLifetimeOnce.class);
        a2.components.put(fta.Da, BedrockComponentLifetimeExpression.class);
        a2.components.put(mra.b, BedrockComponentShapeDisc.class);
        a2.components.put(zTa.R, BedrockComponentShapeBox.class);
        a2.components.put(uRa.Ga, BedrockComponentShapeEntityAABB.class);
        a2.components.put(fsa.a, BedrockComponentShapePoint.class);
        a2.components.put(Zra.d, BedrockComponentShapeSphere.class);
        a2.components.put(ySa.q, BedrockComponentParticleLifetime.class);
        a2.components.put(mPa.j, BedrockComponentExpireInBlocks.class);
        a2.components.put(nqa.ca, BedrockComponentExpireNotInBlocks.class);
        a2.components.put(Ysa.a, BedrockComponentKillPlane.class);
        a2.components.put(Cta.T, BedrockComponentAppearanceBillboard.class);
        a2.components.put(dQa.v, BedrockComponentAppearanceLighting.class);
        a2.components.put(ROa.s, BedrockComponentAppearanceTinting.class);
        a2.components.put(iPa.Ga, BedrockComponentCollisionAppearance.class);
        a2.components.put(csa.j, BedrockComponentCollisionTinting.class);
        a2.components.put(qta.p, BedrockComponentInitialSpeed.class);
        a2.components.put(wOa.F, BedrockComponentInitialSpin.class);
        a2.components.put(ppa.e, BedrockComponentMotionCollision.class);
        a2.components.put(NPa.U, BedrockComponentMotionDynamic.class);
        a2.components.put(hQa.C, BedrockComponentMotionParametric.class);
    }

    /*
     * WARNING - void declaration
     */
    private void C(JJ jJ2, JsonObject jsonObject) throws Ql {
        Iterator<Map.Entry<String, JsonElement>> a2;
        oK oK2 = this;
        for (Map.Entry<String, JsonElement> entry : ((JsonObject)((Object)a2)).entrySet()) {
            void b2;
            oK oK3;
            String string = entry.getKey();
            if (!oK2.components.containsKey(string)) continue;
            oK c2 = null;
            try {
                oK3 = c2 = (tJ)((Class)oK2.components.get(string)).getConstructor(new Class[uSa.E]).newInstance(new Object[uSa.E]);
            }
            catch (Exception exception) {
                oK3 = c2;
            }
            if (oK3 != null) {
                c2.J(entry.getValue(), b2.parser);
                b2.components.add((tJ)c2);
                continue;
            }
            System.out.println(new StringBuilder().insert(3 >> 2, Usa.o).append(string).append(uOa.ja).append(b2.identifier).append(dqa.O).toString());
        }
    }

    @Override
    public JJ deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object d22 = jsonElement;
        oK c2 = this;
        JJ b2 = new JJ();
        if (!((JsonElement)d22).isJsonObject()) {
            throw new JsonParseException(FRa.E);
        }
        d22 = ((JsonElement)d22).getAsJsonObject();
        try {
            c2.J(b2, c2.J((JsonObject)d22, KPa.L, Lsa.w));
        }
        catch (Ql d22) {
            throw new JsonParseException(rpa.Ja, d22);
        }
        b2.f();
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private void l(JJ jJ2, JsonObject jsonObject) throws Ql {
        Iterator<Map.Entry<String, JsonElement>> c2 = jsonObject;
        oK a2 = this;
        for (Map.Entry<String, JsonElement> entry : ((JsonObject)((Object)c2)).entrySet()) {
            void b2;
            JsonElement jsonElement = entry.getValue();
            if (!jsonElement.isJsonObject()) continue;
            cK cK2 = new cK();
            void v0 = b2;
            cK2.J(jsonElement.getAsJsonObject(), v0.parser);
            v0.curves.put(entry.getKey(), cK2);
        }
    }

    private void l(JsonObject jsonObject, JJ jJ2) {
        tJ a2;
        Iterator<tJ> c2 = jsonObject;
        oK b2 = this;
        JsonObject jsonObject2 = new JsonObject();
        ((JsonObject)((Object)c2)).add(IPa.P, jsonObject2);
        Iterator<tJ> iterator = c2 = a2.components.iterator();
        while (iterator.hasNext()) {
            a2 = c2.next();
            JsonElement jsonElement = a2.J();
            if (b2.J(jsonElement) && !a2.J()) {
                iterator = c2;
                continue;
            }
            jsonObject2.add((String)b2.components.inverse().get(a2.getClass()), jsonElement);
            iterator = c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void f(JJ jJ2, JsonObject jsonObject) throws JsonParseException {
        Object c2 = jsonObject;
        oK a2 = this;
        if (((JsonObject)c2).has(yRa.q)) {
            b2.identifier = ((JsonObject)c2).get(yRa.q).getAsString();
        }
        if (((JsonObject)(c2 = a2.J((JsonObject)c2, qta.z, fPa.C))).has(cPa.J)) {
            b2.material = UL.fromString((String)((JsonObject)c2).get(cPa.J).getAsString());
        }
        if (((JsonObject)c2).has(EQa.Ga) && !((String)(c2 = ((JsonObject)c2).get(EQa.Ga).getAsString())).equals(Pua.Da)) {
            void b2;
            b2.textureId = c2;
            b2.texture = b2.textures.get(c2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public JsonElement serialize(JJ jJ2, Type type, JsonSerializationContext jsonSerializationContext) {
        void c2;
        Object d2 = jsonSerializationContext;
        oK a2 = this;
        JsonObject b2 = new JsonObject();
        d2 = new JsonObject();
        JsonObject jsonObject = b2;
        b2.addProperty(Iqa.U, yRa.k);
        jsonObject.add(KPa.L, (JsonElement)d2);
        void v1 = c2;
        a2.J((JsonObject)d2, (JJ)c2);
        a2.f((JsonObject)d2, (JJ)v1);
        a2.l((JsonObject)d2, (JJ)v1);
        return jsonObject;
    }

    /*
     * WARNING - void declaration
     */
    private void J(JJ jJ2, JsonObject jsonObject) throws JsonParseException, Ql {
        JsonElement jsonElement;
        void b2;
        oK a2;
        JsonObject c2 = jsonObject;
        oK oK2 = a2 = this;
        oK2.f((JJ)b2, oK2.J(c2, ITa.la, bqa.ga));
        if (c2.has(Lra.d) && (jsonElement = c2.get(Lra.d)).isJsonObject()) {
            a2.l((JJ)b2, jsonElement.getAsJsonObject());
        }
        a2.C((JJ)b2, a2.J(c2, IPa.P, Ura.K));
    }

    public static boolean J(JsonElement jsonElement) {
        JsonElement jsonElement2 = jsonElement;
        if (jsonElement2.isJsonArray()) {
            if (jsonElement2.getAsJsonArray().size() == 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (jsonElement2.isJsonObject()) {
            return jsonElement2.getAsJsonObject().entrySet().isEmpty();
        }
        if (jsonElement2.isJsonPrimitive()) {
            JsonElement a2 = jsonElement2.getAsJsonPrimitive();
            if (((JsonPrimitive)a2).isString()) {
                return ((JsonPrimitive)a2).getAsString().isEmpty();
            }
            if (((JsonPrimitive)a2).isNumber()) {
                return yk.equals((double)((JsonPrimitive)a2).getAsDouble(), (double)aSa.V);
            }
        }
        return jsonElement2.isJsonNull();
    }

    /*
     * WARNING - void declaration
     */
    private JsonObject J(JsonObject jsonObject, String string, String string2) throws JsonParseException {
        void c2;
        String d2 = string;
        oK b2 = this;
        if (!c2.has(d2) && !c2.get(d2).isJsonObject()) {
            void a2;
            throw new JsonParseException((String)a2);
        }
        return c2.get(d2).getAsJsonObject();
    }

    private void f(JsonObject jsonObject, JJ jJ2) {
        Iterator<Map.Entry<String, cK>> b2;
        Map.Entry<String, cK> c2 = jJ2;
        oK a2 = this;
        JsonObject jsonObject2 = new JsonObject();
        ((JsonObject)((Object)b2)).add(Lra.d, jsonObject2);
        Iterator<Map.Entry<String, cK>> iterator = b2 = ((JJ)((Object)c2)).curves.entrySet().iterator();
        while (iterator.hasNext()) {
            c2 = b2.next();
            jsonObject2.add(c2.getKey(), c2.getValue().J());
            iterator = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(JsonObject jsonObject, JJ jJ2) {
        void a2;
        void b2;
        oK oK2 = this;
        JsonObject jsonObject2 = new JsonObject();
        JsonObject c2 = new JsonObject();
        JsonObject jsonObject3 = jsonObject2;
        b2.add(ITa.la, jsonObject3);
        jsonObject3.addProperty(yRa.q, a2.identifier);
        JsonObject jsonObject4 = c2;
        jsonObject3.add(qta.z, jsonObject4);
        jsonObject4.addProperty(cPa.J, a2.material.id);
        c2.addProperty(EQa.Ga, Pua.Da);
        if (a2.texture != null) {
            c2.addProperty(EQa.Ga, a2.textureId);
        }
    }
}

