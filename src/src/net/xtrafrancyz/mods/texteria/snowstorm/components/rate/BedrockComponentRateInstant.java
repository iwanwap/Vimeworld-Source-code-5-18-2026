/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  JPa
 *  Ql
 *  Uk
 *  aSa
 *  jj
 *  nj
 *  tJ
 *  vK
 *  wk
 *  yk
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.rate;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterUpdate;

public final class BedrockComponentRateInstant
extends jj
implements IComponentEmitterUpdate {
    public static final Ak DEFAULT_PARTICLES = new vK(null, (t)new wk(Wqa.m));

    public BedrockComponentRateInstant() {
        BedrockComponentRateInstant a2;
        a2.particles = DEFAULT_PARTICLES;
    }

    @Override
    public void J(nj nj2) {
        BedrockComponentRateInstant b2 = nj2;
        BedrockComponentRateInstant a2 = this;
        BedrockComponentRateInstant bedrockComponentRateInstant = b2;
        double d2 = bedrockComponentRateInstant.f();
        if (((nj)bedrockComponentRateInstant).Aa && yk.equals((double)d2, (double)aSa.V)) {
            b2.J(JPa.N);
            int n2 = uSa.E;
            int n3 = (int)a2.particles.J();
            int n4 = n2;
            while (n4 < n3) {
                b2.C();
                n4 = ++n2;
            }
        }
    }

    public JsonElement J() {
        BedrockComponentRateInstant bedrockComponentRateInstant = this;
        JsonObject a2 = new JsonObject();
        if (!Ak.J((Ak)bedrockComponentRateInstant.particles, (double)Wqa.m)) {
            a2.add(Jra.w, bedrockComponentRateInstant.particles.J());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentRateInstant b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Jra.w)) {
            b2.particles = a2.f(((JsonObject)c2).get(Jra.w));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

