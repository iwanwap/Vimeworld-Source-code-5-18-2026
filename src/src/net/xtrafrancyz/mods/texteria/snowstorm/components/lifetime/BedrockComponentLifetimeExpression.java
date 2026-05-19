/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Qta
 *  Uk
 *  aSa
 *  nj
 *  tJ
 *  yk
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime.BedrockComponentLifetime;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentLifetimeExpression
extends BedrockComponentLifetime {
    public Ak expiration = Uk.J;

    @Override
    public void J(nj nj2) {
        BedrockComponentLifetimeExpression b2 = nj2;
        BedrockComponentLifetimeExpression a2 = this;
        if (!yk.equals((double)a2.activeTime.J(), (double)aSa.V)) {
            b2.i();
        }
        if (!yk.equals((double)a2.expiration.J(), (double)aSa.V)) {
            b2.d();
        }
    }

    @Override
    public String J() {
        return LPa.j;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentLifetimeExpression b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Qta.N)) {
            b2.expiration = a2.f(((JsonObject)c2).get(Qta.N));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    @Override
    public JsonElement J() {
        BedrockComponentLifetimeExpression bedrockComponentLifetimeExpression = this;
        JsonObject a2 = (JsonObject)super.J();
        if (!Ak.J((Ak)bedrockComponentLifetimeExpression.expiration)) {
            a2.add(Qta.N, bedrockComponentLifetimeExpression.expiration.J());
        }
        return a2;
    }

    public BedrockComponentLifetimeExpression() {
        BedrockComponentLifetimeExpression a2;
    }
}

