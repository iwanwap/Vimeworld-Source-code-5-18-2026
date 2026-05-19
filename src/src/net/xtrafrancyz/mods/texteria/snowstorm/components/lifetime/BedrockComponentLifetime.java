/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Qqa
 *  Uk
 *  tJ
 *  vK
 *  wk
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.lifetime;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterUpdate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class BedrockComponentLifetime
extends tJ
implements IComponentEmitterUpdate {
    public static final Ak DEFAULT_ACTIVE = new vK(null, (t)new wk(Wqa.m));
    public Ak activeTime = DEFAULT_ACTIVE;

    public JsonElement J() {
        BedrockComponentLifetime bedrockComponentLifetime = this;
        JsonObject a2 = new JsonObject();
        if (!Ak.J((Ak)bedrockComponentLifetime.activeTime, (double)Wqa.m)) {
            a2.add(bedrockComponentLifetime.J(), bedrockComponentLifetime.activeTime.J());
        }
        return a2;
    }

    @Override
    public int J() {
        return ypa.y;
    }

    public BedrockComponentLifetime() {
        BedrockComponentLifetime a2;
    }

    public String J() {
        return Qqa.M;
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentLifetime b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(b2.J())) {
            b2.activeTime = a2.f(((JsonObject)c2).get(b2.J()));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

