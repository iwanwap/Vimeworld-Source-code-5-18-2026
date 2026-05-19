/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Ql
 *  Uk
 *  kta
 *  lPa
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
import net.xtrafrancyz.mods.texteria.snowstorm.components.shape.BedrockComponentShapeBase;

public final class BedrockComponentShapeBox
extends BedrockComponentShapeBase {
    public Ak[] halfDimensions;

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(nj var1_1, vj var2_3) {
        c = var2_3;
        v0 = a = this;
        v1 = a;
        b = (float)v1.offset[uSa.E].J();
        var8_4 = (float)v1.offset[vRa.d].J();
        var4_5 = (float)v1.offset[uqa.g].J();
        var5_6 = (float)v1.halfDimensions[uSa.E].J();
        var6_7 = (float)v0.halfDimensions[vRa.d].J();
        var7_8 = (float)v0.halfDimensions[uqa.g].J();
        v2 = c;
        v2.z.x = b + ((float)Math.random() * kta.v - pqa.r) * var5_6;
        v2.z.y = var8_4 + ((float)Math.random() * kta.v - pqa.r) * var6_7;
        c.z.z = var4_5 + ((float)Math.random() * kta.v - pqa.r) * var7_8;
        if (!v0.surface) ** GOTO lbl38
        var3_9 = (int)(Math.random() * lPa.K * fqa.W) % uua.p;
        if (var3_9 == 0) {
            v3 = a;
            c.z.x = b + var5_6;
        } else if (var3_9 == vRa.d) {
            v3 = a;
            c.z.x = b - var5_6;
        } else if (var3_9 == uqa.g) {
            v3 = a;
            c.z.y = var8_4 + var6_7;
        } else if (var3_9 == yRa.d) {
            v3 = a;
            c.z.y = var8_4 - var6_7;
        } else if (var3_9 == AQa.P) {
            v3 = a;
            c.z.z = var4_5 + var7_8;
        } else {
            if (var3_9 == tTa.h) {
                c.z.z = var4_5 - var7_8;
            }
lbl38:
            // 4 sources

            v3 = a;
        }
        v3.direction.J((vj)c, (double)b, (double)var8_4, (double)var4_5);
    }

    public BedrockComponentShapeBox() {
        BedrockComponentShapeBox a2;
        Ak[] akArray = new Ak[yRa.d];
        akArray[uSa.E] = Uk.J;
        akArray[vRa.d] = Uk.J;
        akArray[uqa.g] = Uk.J;
        a2.halfDimensions = akArray;
    }

    @Override
    public JsonElement J() {
        int n2;
        BedrockComponentShapeBox bedrockComponentShapeBox = this;
        JsonObject jsonObject = (JsonObject)super.J();
        JsonArray a2 = new JsonArray();
        Ak[] akArray = bedrockComponentShapeBox.halfDimensions;
        int n3 = bedrockComponentShapeBox.halfDimensions.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            Ak ak = akArray[n2];
            a2.add(ak.J());
            n4 = ++n2;
        }
        JsonObject jsonObject2 = jsonObject;
        jsonObject2.add(ySa.R, a2);
        return jsonObject2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        JsonArray jsonArray;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentShapeBox b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(ySa.R) && (jsonArray = ((JsonObject)c2).getAsJsonArray(ySa.R)).size() >= yRa.d) {
            BedrockComponentShapeBox bedrockComponentShapeBox = b2;
            bedrockComponentShapeBox.halfDimensions[uSa.E] = a2.f(jsonArray.get(uSa.E));
            bedrockComponentShapeBox.halfDimensions[vRa.d] = a2.f(jsonArray.get(vRa.d));
            bedrockComponentShapeBox.halfDimensions[uqa.g] = a2.f(jsonArray.get(uqa.g));
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }
}

