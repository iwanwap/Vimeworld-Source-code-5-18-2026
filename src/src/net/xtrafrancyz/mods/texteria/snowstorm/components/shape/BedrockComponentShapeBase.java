/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Uk
 *  bk
 *  jsa
 *  tJ
 *  vRa
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.shape;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;

public abstract class BedrockComponentShapeBase
extends tJ
implements IComponentParticleInitialize {
    public bk direction;
    public boolean surface;
    public Ak[] offset;

    public BedrockComponentShapeBase() {
        BedrockComponentShapeBase a2;
        Ak[] akArray = new Ak[yRa.d];
        akArray[uSa.E] = Uk.J;
        akArray[vRa.d] = Uk.J;
        akArray[uqa.g] = Uk.J;
        a2.offset = akArray;
        BedrockComponentShapeBase bedrockComponentShapeBase = a2;
        bedrockComponentShapeBase.direction = bk.A;
        bedrockComponentShapeBase.surface = uSa.E;
    }

    public JsonElement J() {
        int n2;
        BedrockComponentShapeBase bedrockComponentShapeBase = this;
        JsonObject a2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Ak[] akArray = bedrockComponentShapeBase.offset;
        int n3 = bedrockComponentShapeBase.offset.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Ak ak = akArray[n2];
            jsonArray.add(ak.J());
            n4 = ++n2;
        }
        a2.add(Jsa.L, jsonArray);
        if (bedrockComponentShapeBase.direction != bk.A) {
            a2.add(pta.i, bedrockComponentShapeBase.direction.J());
        }
        if (bedrockComponentShapeBase.surface) {
            a2.addProperty(fta.n, vRa.d != 0);
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        JsonElement jsonElement2;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentShapeBase b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Jsa.L) && ((JsonArray)(jsonElement2 = ((JsonObject)c2).getAsJsonArray(Jsa.L))).size() >= yRa.d) {
            BedrockComponentShapeBase bedrockComponentShapeBase = b2;
            bedrockComponentShapeBase.offset[uSa.E] = a2.f(((JsonArray)jsonElement2).get(uSa.E));
            bedrockComponentShapeBase.offset[vRa.d] = a2.f(((JsonArray)jsonElement2).get(vRa.d));
            bedrockComponentShapeBase.offset[uqa.g] = a2.f(((JsonArray)jsonElement2).get(uqa.g));
        }
        if (((JsonObject)c2).has(pta.i)) {
            JsonArray jsonArray;
            jsonElement2 = ((JsonObject)c2).get(pta.i);
            if (jsonElement2.isJsonPrimitive()) {
                String string = jsonElement2.getAsString();
                b2.direction = string.equals(jsa.Ga) ? bk.I : bk.A;
            } else if (jsonElement2.isJsonArray() && (jsonArray = jsonElement2.getAsJsonArray()).size() >= yRa.d) {
                BedrockComponentShapeBase bedrockComponentShapeBase = b2;
                bedrockComponentShapeBase.direction = new Dl(a2.f(jsonArray.get(uSa.E)), a2.f(jsonArray.get(vRa.d)), a2.f(jsonArray.get(uqa.g)));
            }
        }
        if (((JsonObject)c2).has(fta.n)) {
            b2.surface = ((JsonObject)c2).get(fta.n).getAsBoolean();
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

