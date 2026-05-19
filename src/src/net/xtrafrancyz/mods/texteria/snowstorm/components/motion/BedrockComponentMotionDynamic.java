/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Uk
 *  kqa
 *  nj
 *  tJ
 *  vRa
 *  vj
 *  yra
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.motion;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;

public final class BedrockComponentMotionDynamic
extends VL
implements IComponentParticleUpdate {
    public Ak rotationDrag;
    public Ak rotationAcceleration;
    public Ak motionDrag;
    public Ak[] motionAcceleration;

    public BedrockComponentMotionDynamic() {
        BedrockComponentMotionDynamic a2;
        Ak[] akArray = new Ak[yRa.d];
        akArray[uSa.E] = Uk.J;
        akArray[vRa.d] = Uk.J;
        akArray[uqa.g] = Uk.J;
        a2.motionAcceleration = akArray;
        BedrockComponentMotionDynamic bedrockComponentMotionDynamic = a2;
        bedrockComponentMotionDynamic.motionDrag = Uk.J;
        bedrockComponentMotionDynamic.rotationAcceleration = Uk.J;
        bedrockComponentMotionDynamic.rotationDrag = Uk.J;
    }

    public JsonElement J() {
        int n2;
        BedrockComponentMotionDynamic bedrockComponentMotionDynamic = this;
        JsonObject a2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Ak[] akArray = bedrockComponentMotionDynamic.motionAcceleration;
        int n3 = bedrockComponentMotionDynamic.motionAcceleration.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Ak ak = akArray[n2];
            jsonArray.add(ak.J());
            n4 = ++n2;
        }
        a2.add(yRa.I, jsonArray);
        if (!Ak.J((Ak)bedrockComponentMotionDynamic.motionDrag)) {
            a2.add(kqa.ja, bedrockComponentMotionDynamic.motionDrag.J());
        }
        if (!Ak.J((Ak)bedrockComponentMotionDynamic.rotationAcceleration)) {
            a2.add(AQa.D, bedrockComponentMotionDynamic.rotationAcceleration.J());
        }
        if (!Ak.J((Ak)bedrockComponentMotionDynamic.rotationDrag)) {
            a2.add(yra.ca, bedrockComponentMotionDynamic.rotationDrag.J());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        JsonArray jsonArray;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentMotionDynamic b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(yRa.I) && (jsonArray = ((JsonObject)c2).getAsJsonArray(yRa.I)).size() >= yRa.d) {
            BedrockComponentMotionDynamic bedrockComponentMotionDynamic = b2;
            bedrockComponentMotionDynamic.motionAcceleration[uSa.E] = a2.f(jsonArray.get(uSa.E));
            bedrockComponentMotionDynamic.motionAcceleration[vRa.d] = a2.f(jsonArray.get(vRa.d));
            bedrockComponentMotionDynamic.motionAcceleration[uqa.g] = a2.f(jsonArray.get(uqa.g));
        }
        if (((JsonObject)c2).has(kqa.ja)) {
            b2.motionDrag = a2.f(((JsonObject)c2).get(kqa.ja));
        }
        if (((JsonObject)c2).has(AQa.D)) {
            b2.rotationAcceleration = a2.f(((JsonObject)c2).get(AQa.D));
        }
        if (((JsonObject)c2).has(yra.ca)) {
            b2.rotationDrag = a2.f(((JsonObject)c2).get(yra.ca));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    @Override
    public void f(nj nj2, vj vj2) {
        BedrockComponentMotionDynamic c2 = vj2;
        BedrockComponentMotionDynamic a2 = this;
        BedrockComponentMotionDynamic bedrockComponentMotionDynamic = c2;
        ((vj)bedrockComponentMotionDynamic).u.x += (float)a2.motionAcceleration[uSa.E].J();
        ((vj)bedrockComponentMotionDynamic).u.y += (float)a2.motionAcceleration[vRa.d].J();
        BedrockComponentMotionDynamic bedrockComponentMotionDynamic2 = a2;
        ((vj)bedrockComponentMotionDynamic).u.z += (float)bedrockComponentMotionDynamic2.motionAcceleration[uqa.g].J();
        ((vj)c2).n = (float)bedrockComponentMotionDynamic2.motionDrag.J();
        ((vj)c2).x += (float)a2.rotationAcceleration.J() / eta.e;
        ((vj)c2).B = (float)a2.rotationDrag.J();
    }
}

