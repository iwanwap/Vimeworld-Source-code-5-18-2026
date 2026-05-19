/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Cta
 *  Ql
 *  Ssa
 *  Uk
 *  Vl
 *  nj
 *  sk
 *  tJ
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.meta;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterInitialize;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterUpdate;

public final class BedrockComponentInitialization
extends tJ
implements IComponentEmitterInitialize,
IComponentEmitterUpdate {
    public Ak particleUpdate;
    public Ak creation = Uk.J;
    public Ak update = Uk.J;

    public BedrockComponentInitialization() {
        BedrockComponentInitialization a2;
        a2.particleUpdate = Uk.J;
    }

    @Override
    public void J(nj nj2) {
        BedrockComponentInitialization b2 = nj2;
        BedrockComponentInitialization a2 = this;
        a2.update.J();
        BedrockComponentInitialization bedrockComponentInitialization = a2;
        BedrockComponentInitialization bedrockComponentInitialization2 = b2;
        bedrockComponentInitialization.J(bedrockComponentInitialization.update, (nj)bedrockComponentInitialization2);
        bedrockComponentInitialization2.J();
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentInitialization b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Ssa.R)) {
            b2.creation = a2.J(((JsonObject)c2).get(Ssa.R));
        }
        if (((JsonObject)c2).has(QTa.p)) {
            b2.update = a2.J(((JsonObject)c2).get(QTa.p));
        }
        if (((JsonObject)c2).has(Cta.i)) {
            b2.particleUpdate = a2.J(((JsonObject)c2).get(Cta.i));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Vl vl2, nj nj2) {
        void a2;
        BedrockComponentInitialization c2 = vl2;
        BedrockComponentInitialization b2 = this;
        a2.d.put(((Vl)c2).A.f(), ((Vl)c2).A.J().J());
    }

    public JsonElement J() {
        BedrockComponentInitialization bedrockComponentInitialization = this;
        JsonObject a2 = new JsonObject();
        if (!Ak.J((Ak)bedrockComponentInitialization.creation)) {
            a2.add(Ssa.R, bedrockComponentInitialization.creation.J());
        }
        if (!Ak.J((Ak)bedrockComponentInitialization.update)) {
            a2.add(QTa.p, bedrockComponentInitialization.update.J());
        }
        if (!Ak.J((Ak)bedrockComponentInitialization.particleUpdate)) {
            a2.add(Cta.i, bedrockComponentInitialization.particleUpdate.J());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Ak ak, nj nj2) {
        void a2;
        BedrockComponentInitialization c2 = ak;
        BedrockComponentInitialization b2 = this;
        if (c2 instanceof sk) {
            for (Ak ak2 : ((sk)c2).I) {
                if (!(ak2 instanceof Vl)) continue;
                b2.J((Vl)ak2, (nj)a2);
            }
        } else if (c2 instanceof Vl) {
            b2.J((Vl)c2, (nj)a2);
        }
    }

    @Override
    public void f(nj nj2) {
        BedrockComponentInitialization b2 = nj2;
        BedrockComponentInitialization a2 = this;
        BedrockComponentInitialization bedrockComponentInitialization = b2;
        ((nj)bedrockComponentInitialization).d.clear();
        a2.creation.J();
        BedrockComponentInitialization bedrockComponentInitialization2 = a2;
        bedrockComponentInitialization2.J(bedrockComponentInitialization2.creation, (nj)b2);
        if (((nj)bedrockComponentInitialization).B != null) {
            Iterator iterator;
            Iterator iterator2 = iterator = ((nj)b2).B.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry entry = iterator.next();
                ((nj)b2).d.put(entry.getKey(), ((t)entry.getValue()).J().J());
                iterator2 = iterator;
            }
        }
    }
}

