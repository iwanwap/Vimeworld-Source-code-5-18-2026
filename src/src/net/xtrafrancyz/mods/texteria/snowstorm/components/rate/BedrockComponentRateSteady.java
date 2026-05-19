/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  NTa
 *  Ql
 *  Uk
 *  ZRa
 *  aKa
 *  aSa
 *  dQa
 *  jj
 *  mra
 *  nj
 *  tJ
 *  vK
 *  vj
 *  wk
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.rate;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleMorphRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentRateSteady
extends jj
implements IComponentParticleRender,
IComponentParticleMorphRender {
    public Ak spawnRate = Uk.A;
    public static final Ak DEFAULT_PARTICLES = new vK(null, (t)new wk(ZRa.r));

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentRateSteady b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(dQa.Q)) {
            b2.spawnRate = a2.f(((JsonObject)c2).get(dQa.Q));
        }
        if (((JsonObject)c2).has(mra.B)) {
            b2.particles = a2.f(((JsonObject)c2).get(mra.B));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(nj nj2, float f2) {
        BedrockComponentRateSteady c2 = nj2;
        BedrockComponentRateSteady b2 = this;
        if (((nj)c2).Aa) {
            double d2;
            void a2;
            double d3 = Math.round(c2.J((float)a2) * b2.spawnRate.J() - ((nj)c2).fa);
            if (d2 > aSa.V) {
                c2.J((float)a2);
                double d4 = d3;
                int n2 = a2 = uSa.E;
                while ((double)n2 < d3) {
                    if ((double)((nj)c2).j.size() < b2.particles.J()) {
                        c2.C();
                    } else {
                        d4 -= oua.i;
                    }
                    n2 = ++a2;
                }
                ((nj)c2).fa += d4;
            }
        }
    }

    public BedrockComponentRateSteady() {
        BedrockComponentRateSteady a2;
        a2.particles = DEFAULT_PARTICLES;
    }

    @Override
    public void J(nj nj2, vj vj2, aKa aKa2, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f6;
        BedrockComponentRateSteady a2 = this;
    }

    @Override
    public int J() {
        return NTa.C;
    }

    public JsonElement J() {
        BedrockComponentRateSteady bedrockComponentRateSteady = this;
        JsonObject a2 = new JsonObject();
        if (!Ak.l((Ak)bedrockComponentRateSteady.spawnRate)) {
            a2.add(dQa.Q, bedrockComponentRateSteady.spawnRate.J());
        }
        if (!Ak.J((Ak)bedrockComponentRateSteady.particles, (double)ZRa.r)) {
            a2.add(mra.B, bedrockComponentRateSteady.particles.J());
        }
        return a2;
    }

    @Override
    public void J(vj vj2, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7;
        BedrockComponentRateSteady a2 = this;
    }

    @Override
    public void J(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentRateSteady bedrockComponentRateSteady = this;
    }
}

