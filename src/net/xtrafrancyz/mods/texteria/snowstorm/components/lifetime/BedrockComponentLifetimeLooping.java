/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Uk
 *  fsa
 *  nj
 *  tJ
 *  vQa
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime.BedrockComponentLifetime;

public final class BedrockComponentLifetimeLooping
extends BedrockComponentLifetime {
    public Ak sleepTime = Uk.J;

    @Override
    public JsonElement J() {
        BedrockComponentLifetimeLooping bedrockComponentLifetimeLooping = this;
        JsonObject a2 = (JsonObject)super.J();
        if (!Ak.J((Ak)bedrockComponentLifetimeLooping.sleepTime)) {
            a2.add(fsa.ja, bedrockComponentLifetimeLooping.sleepTime.J());
        }
        return a2;
    }

    @Override
    public void J(nj nj2) {
        BedrockComponentLifetimeLooping a2;
        BedrockComponentLifetimeLooping b2 = nj2;
        BedrockComponentLifetimeLooping bedrockComponentLifetimeLooping = a2 = this;
        double d2 = bedrockComponentLifetimeLooping.activeTime.J();
        double d3 = bedrockComponentLifetimeLooping.sleepTime.J();
        double d4 = b2.f();
        ((nj)b2).J = (int)(d2 * vQa.c);
        if (d4 >= d2 && ((nj)b2).Aa) {
            b2.d();
        }
        if (d4 >= d3 && !((nj)b2).Aa) {
            b2.i();
        }
    }

    public BedrockComponentLifetimeLooping() {
        BedrockComponentLifetimeLooping a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentLifetimeLooping b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(fsa.ja)) {
            b2.sleepTime = a2.f(((JsonObject)c2).get(fsa.ja));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

