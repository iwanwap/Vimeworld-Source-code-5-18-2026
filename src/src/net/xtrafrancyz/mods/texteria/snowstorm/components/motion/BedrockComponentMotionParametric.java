/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  NQa
 *  NTa
 *  Ql
 *  SRa
 *  Uk
 *  nj
 *  tJ
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.motion;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.vecmath.Vector3f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentMotionParametric
extends VL
implements IComponentParticleInitialize,
IComponentParticleUpdate {
    public Ak[] position;
    public Ak rotation;

    public BedrockComponentMotionParametric() {
        BedrockComponentMotionParametric a2;
        Ak[] akArray = new Ak[yRa.d];
        akArray[uSa.E] = Uk.J;
        akArray[vRa.d] = Uk.J;
        akArray[uqa.g] = Uk.J;
        a2.position = akArray;
        a2.rotation = Uk.J;
    }

    public JsonElement J() {
        int n2;
        BedrockComponentMotionParametric bedrockComponentMotionParametric = this;
        JsonObject a2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Ak[] akArray = bedrockComponentMotionParametric.position;
        int n3 = bedrockComponentMotionParametric.position.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Ak ak = akArray[n2];
            jsonArray.add(ak.J());
            n4 = ++n2;
        }
        a2.add(SRa.o, jsonArray);
        if (!Ak.J((Ak)bedrockComponentMotionParametric.rotation)) {
            a2.add(NQa.ja, bedrockComponentMotionParametric.rotation.J());
        }
        return a2;
    }

    @Override
    public void J(nj nj2, vj vj2) {
        BedrockComponentMotionParametric c2 = vj2;
        BedrockComponentMotionParametric a2 = this;
        Vector3f b2 = new Vector3f((float)a2.position[uSa.E].J(), (float)a2.position[vRa.d].J(), (float)a2.position[uqa.g].J());
        BedrockComponentMotionParametric bedrockComponentMotionParametric = c2;
        ((vj)c2).b = vRa.d;
        BedrockComponentMotionParametric bedrockComponentMotionParametric2 = c2;
        ((vj)c2).P.set(((vj)bedrockComponentMotionParametric2).z);
        ((vj)bedrockComponentMotionParametric2).C.transform(b2);
        ((vj)c2).z.x = ((vj)c2).P.x + (double)b2.x;
        ((vj)bedrockComponentMotionParametric).z.y = ((vj)c2).P.y + (double)b2.y;
        ((vj)bedrockComponentMotionParametric).z.z = ((vj)c2).P.z + (double)b2.z;
        ((vj)bedrockComponentMotionParametric).c = (float)a2.rotation.J();
    }

    @Override
    public int J() {
        return NTa.C;
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentMotionParametric b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(SRa.o) && ((JsonObject)c2).get(SRa.o).isJsonArray()) {
            JsonArray jsonArray = ((JsonObject)c2).get(SRa.o).getAsJsonArray();
            BedrockComponentMotionParametric bedrockComponentMotionParametric = b2;
            bedrockComponentMotionParametric.position[uSa.E] = a2.f(jsonArray.get(uSa.E));
            bedrockComponentMotionParametric.position[vRa.d] = a2.f(jsonArray.get(vRa.d));
            bedrockComponentMotionParametric.position[uqa.g] = a2.f(jsonArray.get(uqa.g));
        }
        if (((JsonObject)c2).has(NQa.ja)) {
            b2.rotation = a2.f(((JsonObject)c2).get(NQa.ja));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    @Override
    public void f(nj nj2, vj vj2) {
        BedrockComponentMotionParametric c2 = vj2;
        BedrockComponentMotionParametric a2 = this;
        Vector3f b2 = new Vector3f((float)a2.position[uSa.E].J(), (float)a2.position[vRa.d].J(), (float)a2.position[uqa.g].J());
        BedrockComponentMotionParametric bedrockComponentMotionParametric = c2;
        ((vj)c2).C.transform(b2);
        ((vj)c2).z.x = ((vj)c2).P.x + (double)b2.x;
        ((vj)bedrockComponentMotionParametric).z.y = ((vj)c2).P.y + (double)b2.y;
        ((vj)bedrockComponentMotionParametric).z.z = ((vj)c2).P.z + (double)b2.z;
        ((vj)bedrockComponentMotionParametric).c = (float)a2.rotation.J();
    }
}

