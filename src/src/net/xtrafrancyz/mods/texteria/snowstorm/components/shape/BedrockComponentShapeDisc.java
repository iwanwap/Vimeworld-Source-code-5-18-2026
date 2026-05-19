/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  JPa
 *  MQa
 *  Ql
 *  Uk
 *  nj
 *  pqa
 *  tJ
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.shape;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4f;
import javax.vecmath.Tuple4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeSphere;

public final class BedrockComponentShapeDisc
extends BedrockComponentShapeSphere {
    public Ak[] normal;

    public BedrockComponentShapeDisc() {
        BedrockComponentShapeDisc a2;
        Ak[] akArray = new Ak[yRa.d];
        akArray[uSa.E] = Uk.J;
        akArray[vRa.d] = Uk.A;
        akArray[uqa.g] = Uk.J;
        a2.normal = akArray;
    }

    @Override
    public JsonElement J() {
        int n2;
        BedrockComponentShapeDisc bedrockComponentShapeDisc = this;
        JsonObject jsonObject = (JsonObject)super.J();
        JsonArray a2 = new JsonArray();
        Ak[] akArray = bedrockComponentShapeDisc.normal;
        int n3 = bedrockComponentShapeDisc.normal.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Ak ak = akArray[n2];
            a2.add(ak.J());
            n4 = ++n2;
        }
        JsonObject jsonObject2 = jsonObject;
        jsonObject2.add(cPa.Z, a2);
        return jsonObject2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2) {
        void a2;
        BedrockComponentShapeDisc bedrockComponentShapeDisc;
        BedrockComponentShapeDisc bedrockComponentShapeDisc2 = bedrockComponentShapeDisc = this;
        float b2 = (float)bedrockComponentShapeDisc2.offset[uSa.E].J();
        float f2 = (float)bedrockComponentShapeDisc2.offset[vRa.d].J();
        float f3 = (float)bedrockComponentShapeDisc2.offset[uqa.g].J();
        Object c2 = new Vector3f((float)bedrockComponentShapeDisc.normal[uSa.E].J(), (float)bedrockComponentShapeDisc.normal[vRa.d].J(), (float)bedrockComponentShapeDisc.normal[uqa.g].J());
        ((Vector3f)c2).normalize();
        Object object = c2;
        c2 = new Quat4f(((Vector3f)object).x, ((Vector3f)object).y, ((Vector3f)c2).z, pqa.r);
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.set((Quat4f)c2);
        c2 = new Vector4f((float)Math.random() - MQa.L, JPa.N, (float)Math.random() - MQa.L, JPa.N);
        ((Vector4f)c2).normalize();
        matrix4f.transform((Tuple4f)c2);
        ((Tuple4f)c2).scale((float)(bedrockComponentShapeDisc.radius.J() * (bedrockComponentShapeDisc.surface ? oua.i : Math.random())));
        ((Tuple4f)c2).add(new Vector4f(b2, f2, f3, JPa.N));
        void v3 = a2;
        v3.z.x += (double)((Vector4f)c2).x;
        a2.z.y += (double)((Vector4f)c2).y;
        v3.z.z += (double)((Vector4f)c2).z;
        bedrockComponentShapeDisc.direction.J((vj)a2, (double)b2, (double)f2, (double)f3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentShapeDisc b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(cPa.Z)) {
            JsonElement jsonElement2 = ((JsonObject)c2).get(cPa.Z);
            if (jsonElement2.isJsonPrimitive()) {
                String string = jsonElement2.getAsString().toLowerCase();
                if (string.equals(rRa.X)) {
                    BedrockComponentShapeDisc bedrockComponentShapeDisc = b2;
                    bedrockComponentShapeDisc.normal[uSa.E] = Uk.A;
                    bedrockComponentShapeDisc.normal[vRa.d] = Uk.J;
                } else if (string.equals(oua.v)) {
                    BedrockComponentShapeDisc bedrockComponentShapeDisc = b2;
                    bedrockComponentShapeDisc.normal[vRa.d] = Uk.J;
                    bedrockComponentShapeDisc.normal[uqa.g] = Uk.A;
                }
            } else {
                JsonArray jsonArray = ((JsonObject)c2).getAsJsonArray(cPa.Z);
                if (jsonArray.size() >= yRa.d) {
                    BedrockComponentShapeDisc bedrockComponentShapeDisc = b2;
                    bedrockComponentShapeDisc.normal[uSa.E] = a2.f(jsonArray.get(uSa.E));
                    bedrockComponentShapeDisc.normal[vRa.d] = a2.f(jsonArray.get(vRa.d));
                    bedrockComponentShapeDisc.normal[uqa.g] = a2.f(jsonArray.get(uqa.g));
                }
            }
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

