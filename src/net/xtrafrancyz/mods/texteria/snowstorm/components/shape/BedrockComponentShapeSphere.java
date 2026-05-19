/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  JSa
 *  Ql
 *  Uk
 *  kta
 *  nj
 *  pqa
 *  tJ
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.shape;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.vecmath.Vector3f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeBase;

public class BedrockComponentShapeSphere
extends BedrockComponentShapeBase {
    public Ak radius = Uk.J;

    public BedrockComponentShapeSphere() {
        BedrockComponentShapeSphere a2;
    }

    @Override
    public JsonElement J() {
        BedrockComponentShapeSphere bedrockComponentShapeSphere = this;
        JsonObject a2 = (JsonObject)super.J();
        if (!Ak.J((Ak)bedrockComponentShapeSphere.radius)) {
            a2.add(JSa.w, bedrockComponentShapeSphere.radius.J());
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2) {
        void a2;
        BedrockComponentShapeSphere bedrockComponentShapeSphere;
        BedrockComponentShapeSphere bedrockComponentShapeSphere2 = bedrockComponentShapeSphere = this;
        float b2 = (float)bedrockComponentShapeSphere2.offset[uSa.E].J();
        float f2 = (float)bedrockComponentShapeSphere2.offset[vRa.d].J();
        float f3 = (float)bedrockComponentShapeSphere2.offset[uqa.g].J();
        float f4 = (float)bedrockComponentShapeSphere2.radius.J();
        Vector3f c2 = new Vector3f((float)Math.random() * kta.v - pqa.r, (float)Math.random() * kta.v - pqa.r, (float)Math.random() * kta.v - pqa.r);
        c2.normalize();
        if (!bedrockComponentShapeSphere2.surface) {
            f4 = (float)((double)f4 * Math.random());
        }
        c2.scale(f4);
        void v1 = a2;
        v1.z.x = b2 + c2.x;
        v1.z.y = f2 + c2.y;
        v1.z.z = f3 + c2.z;
        bedrockComponentShapeSphere.direction.J((vj)a2, (double)b2, (double)f2, (double)f3);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentShapeSphere b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(JSa.w)) {
            b2.radius = a2.f(((JsonObject)c2).get(JSa.w));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

