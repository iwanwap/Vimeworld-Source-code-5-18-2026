/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ql
 *  Uk
 *  aSa
 *  nj
 *  tJ
 *  vRa
 *  vj
 *  yk
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.expiration;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import javax.vecmath.Vector3d;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentKillPlane
extends tJ
implements IComponentParticleUpdate {
    public float c;
    public float d;
    public float a;
    public float b;

    public BedrockComponentKillPlane() {
        BedrockComponentKillPlane a2;
    }

    public JsonElement J() {
        BedrockComponentKillPlane bedrockComponentKillPlane = this;
        JsonArray a2 = new JsonArray();
        if (yk.equals((double)bedrockComponentKillPlane.a, (double)aSa.V) && yk.equals((double)bedrockComponentKillPlane.b, (double)aSa.V) && yk.equals((double)bedrockComponentKillPlane.c, (double)aSa.V) && yk.equals((double)bedrockComponentKillPlane.d, (double)aSa.V)) {
            return a2;
        }
        Object object = a2;
        ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(bedrockComponentKillPlane.a)));
        ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(bedrockComponentKillPlane.b)));
        a2.add(new JsonPrimitive(Float.valueOf(bedrockComponentKillPlane.c)));
        ((JsonArray)object).add(new JsonPrimitive(Float.valueOf(bedrockComponentKillPlane.d)));
        return object;
    }

    @Override
    public int J() {
        return ySa.T;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(nj nj2, vj vj2) {
        void a2;
        BedrockComponentKillPlane bedrockComponentKillPlane = this;
        if (a2.f) {
            return;
        }
        Vector3d vector3d = new Vector3d(a2.s);
        Vector3d c2 = new Vector3d(a2.z);
        if (!a2.U) {
            void b2;
            void v0 = b2;
            c2.sub(v0.a);
            vector3d.sub(v0.a);
        }
        BedrockComponentKillPlane bedrockComponentKillPlane2 = bedrockComponentKillPlane;
        double d2 = (double)bedrockComponentKillPlane2.a * vector3d.x + (double)bedrockComponentKillPlane.b * vector3d.y + (double)bedrockComponentKillPlane.c * vector3d.z + (double)bedrockComponentKillPlane.d;
        double d3 = (double)bedrockComponentKillPlane2.a * c2.x + (double)bedrockComponentKillPlane.b * c2.y + (double)bedrockComponentKillPlane.c * c2.z + (double)bedrockComponentKillPlane.d;
        if (d2 > aSa.V && d3 < aSa.V || d2 < aSa.V && d3 > aSa.V) {
            a2.f = vRa.d;
        }
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        void b2;
        BedrockComponentKillPlane bedrockComponentKillPlane = this;
        if (!b2.isJsonArray()) {
            return super.J((JsonElement)b2, (Uk)a2);
        }
        JsonArray c2 = b2.getAsJsonArray();
        if (c2.size() >= AQa.P) {
            BedrockComponentKillPlane bedrockComponentKillPlane2 = bedrockComponentKillPlane;
            JsonArray jsonArray = c2;
            bedrockComponentKillPlane.a = c2.get(uSa.E).getAsFloat();
            bedrockComponentKillPlane.b = jsonArray.get(vRa.d).getAsFloat();
            bedrockComponentKillPlane2.c = jsonArray.get(uqa.g).getAsFloat();
            bedrockComponentKillPlane2.d = c2.get(yRa.d).getAsFloat();
        }
        return super.J((JsonElement)b2, (Uk)a2);
    }
}

