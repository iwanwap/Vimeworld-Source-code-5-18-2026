/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  JPa
 *  Ql
 *  Uk
 *  Uta
 *  aKa
 *  kpa
 *  nj
 *  tJ
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.appearance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentAppearanceTinting;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentCollisionTinting
extends BedrockComponentAppearanceTinting
implements IComponentParticleRender {
    public Ak enabled = Uk.J;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2, aKa aKa2, float f2, float f3, float f4, float f5, float f6) {
        void h;
        BedrockComponentCollisionTinting i2 = vj2;
        BedrockComponentCollisionTinting g = this;
        if (i2.f((nj)h)) {
            void a2;
            void b2;
            void c2;
            void d2;
            g.J((vj)i2, uSa.E, uSa.E, JPa.N, JPa.N, (float)d2, (float)c2, (float)b2, (float)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentCollisionTinting b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Uta.p)) {
            b2.enabled = a2.f(((JsonObject)c2).get(Uta.p));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    @Override
    public int J() {
        return kpa.w;
    }

    public BedrockComponentCollisionTinting() {
        BedrockComponentCollisionTinting a2;
    }

    @Override
    public JsonElement J() {
        Iterator<Map.Entry<String, JsonElement>> iterator;
        BedrockComponentCollisionTinting bedrockComponentCollisionTinting = this;
        JsonObject jsonObject = new JsonObject();
        BedrockComponentCollisionTinting bedrockComponentCollisionTinting2 = bedrockComponentCollisionTinting;
        jsonObject.add(Uta.p, bedrockComponentCollisionTinting2.enabled.J());
        Iterator<Map.Entry<String, JsonElement>> iterator2 = iterator = ((JsonObject)super.J()).entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, JsonElement> a2 = iterator.next();
            jsonObject.add((String)a2.getKey(), (JsonElement)a2.getValue());
            iterator2 = iterator;
        }
        return jsonObject;
    }
}

