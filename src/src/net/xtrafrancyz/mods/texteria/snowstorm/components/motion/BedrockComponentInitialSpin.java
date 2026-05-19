/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  NQa
 *  Ql
 *  Uk
 *  nj
 *  tJ
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.motion;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;

public final class BedrockComponentInitialSpin
extends tJ
implements IComponentParticleInitialize {
    public Ak rate;
    public Ak rotation = Uk.J;

    public JsonElement J() {
        BedrockComponentInitialSpin bedrockComponentInitialSpin = this;
        JsonObject a2 = new JsonObject();
        if (!Ak.J((Ak)bedrockComponentInitialSpin.rotation)) {
            a2.add(NQa.ja, bedrockComponentInitialSpin.rotation.J());
        }
        if (!Ak.J((Ak)bedrockComponentInitialSpin.rate)) {
            a2.add(Npa.G, bedrockComponentInitialSpin.rate.J());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentInitialSpin b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(NQa.ja)) {
            b2.rotation = a2.f(((JsonObject)c2).get(NQa.ja));
        }
        if (((JsonObject)c2).has(Npa.G)) {
            b2.rate = a2.f(((JsonObject)c2).get(Npa.G));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    public BedrockComponentInitialSpin() {
        BedrockComponentInitialSpin a2;
        a2.rate = Uk.J;
    }

    @Override
    public void J(nj nj2, vj vj2) {
        BedrockComponentInitialSpin c2 = vj2;
        BedrockComponentInitialSpin a2 = this;
        BedrockComponentInitialSpin bedrockComponentInitialSpin = c2;
        ((vj)bedrockComponentInitialSpin).G = (float)a2.rotation.J();
        ((vj)bedrockComponentInitialSpin).Q = (float)a2.rate.J() / eta.e;
    }
}

