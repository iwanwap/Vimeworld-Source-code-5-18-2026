/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Uk
 *  nj
 *  tJ
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.motion;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentInitialSpeed
extends tJ
implements IComponentParticleInitialize {
    public Ak[] direction;
    public Ak speed = Uk.A;

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void b2;
        BedrockComponentInitialSpeed c2 = uk2;
        BedrockComponentInitialSpeed a2 = this;
        if (b2.isJsonArray()) {
            JsonArray jsonArray = b2.getAsJsonArray();
            if (jsonArray.size() >= yRa.d) {
                Ak[] akArray = new Ak[yRa.d];
                akArray[uSa.E] = c2.f(jsonArray.get(uSa.E));
                akArray[vRa.d] = c2.f(jsonArray.get(vRa.d));
                akArray[uqa.g] = c2.f(jsonArray.get(uqa.g));
                a2.direction = akArray;
            }
        } else if (b2.isJsonPrimitive()) {
            a2.speed = c2.f((JsonElement)b2);
        }
        return super.J((JsonElement)b2, (Uk)c2);
    }

    public JsonElement J() {
        BedrockComponentInitialSpeed bedrockComponentInitialSpeed = this;
        if (bedrockComponentInitialSpeed.direction != null) {
            int a2;
            JsonArray jsonArray = new JsonArray();
            Ak[] akArray = bedrockComponentInitialSpeed.direction;
            int n2 = bedrockComponentInitialSpeed.direction.length;
            int n3 = a2 = uSa.E;
            while (n3 < n2) {
                Ak ak = akArray[a2];
                jsonArray.add(ak.J());
                n3 = ++a2;
            }
            return jsonArray;
        }
        return bedrockComponentInitialSpeed.speed.J();
    }

    public boolean J() {
        return vRa.d != 0;
    }

    public BedrockComponentInitialSpeed() {
        BedrockComponentInitialSpeed a2;
    }

    @Override
    public void J(nj nj2, vj vj2) {
        BedrockComponentInitialSpeed c2 = vj2;
        BedrockComponentInitialSpeed a2 = this;
        if (a2.direction != null) {
            ((vj)c2).N.set((float)a2.direction[uSa.E].J(), (float)a2.direction[vRa.d].J(), (float)a2.direction[uqa.g].J());
            return;
        }
        float b2 = (float)a2.speed.J();
        ((vj)c2).N.scale(b2);
    }

    @Override
    public int J() {
        return tTa.h;
    }
}

