/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Qsa
 *  Qta
 *  Uk
 *  aSa
 *  nj
 *  pua
 *  tJ
 *  vQa
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.expiration;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;

public final class BedrockComponentParticleLifetime
extends tJ
implements IComponentParticleInitialize,
IComponentParticleUpdate {
    public Ak expression = Uk.J;
    public boolean max;

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        BedrockComponentParticleLifetime bedrockComponentParticleLifetime;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentParticleLifetime b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        c2 = ((JsonElement)c2).getAsJsonObject();
        JsonElement jsonElement2 = null;
        if (((JsonObject)c2).has(Qta.N)) {
            jsonElement2 = ((JsonObject)c2).get(Qta.N);
            bedrockComponentParticleLifetime = b2;
            b2.max = uSa.E;
        } else if (((JsonObject)c2).has(Zqa.K)) {
            jsonElement2 = ((JsonObject)c2).get(Zqa.K);
            bedrockComponentParticleLifetime = b2;
            b2.max = vRa.d;
        } else {
            throw new JsonParseException(Qsa.r);
        }
        bedrockComponentParticleLifetime.expression = a2.f(jsonElement2);
        return super.J((JsonElement)c2, (Uk)a2);
    }

    public BedrockComponentParticleLifetime() {
        BedrockComponentParticleLifetime a2;
    }

    @Override
    public void J(nj nj2, vj vj2) {
        BedrockComponentParticleLifetime c2 = vj2;
        BedrockComponentParticleLifetime a2 = this;
        if (a2.max) {
            ((vj)c2).t = (int)(a2.expression.J() * vQa.c);
            return;
        }
        ((vj)c2).t = pua.o;
    }

    @Override
    public void f(nj nj2, vj vj2) {
        BedrockComponentParticleLifetime c2 = vj2;
        BedrockComponentParticleLifetime a2 = this;
        if (!a2.max && a2.expression.J() != aSa.V) {
            ((vj)c2).f = vRa.d;
        }
    }

    public JsonElement J() {
        BedrockComponentParticleLifetime bedrockComponentParticleLifetime;
        String string;
        BedrockComponentParticleLifetime bedrockComponentParticleLifetime2 = this;
        JsonObject a2 = new JsonObject();
        if (bedrockComponentParticleLifetime2.max) {
            string = Zqa.K;
            bedrockComponentParticleLifetime = bedrockComponentParticleLifetime2;
        } else {
            string = Qta.N;
            bedrockComponentParticleLifetime = bedrockComponentParticleLifetime2;
        }
        a2.add(string, bedrockComponentParticleLifetime.expression.J());
        return a2;
    }
}

