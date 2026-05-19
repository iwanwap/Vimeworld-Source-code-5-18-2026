/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  KL
 *  Ql
 *  Uk
 *  aKa
 *  iJ
 *  nj
 *  pqa
 *  tJ
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.appearance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BedrockComponentAppearanceTinting
extends tJ
implements IComponentParticleRender {
    public iJ color;

    public JsonElement J() {
        BedrockComponentAppearanceTinting bedrockComponentAppearanceTinting = this;
        JsonObject a2 = new JsonObject();
        JsonElement jsonElement = bedrockComponentAppearanceTinting.color.J();
        if (!oK.J(jsonElement)) {
            a2.add(Zra.L, jsonElement);
        }
        return a2;
    }

    public BedrockComponentAppearanceTinting() {
        BedrockComponentAppearanceTinting a2;
        BedrockComponentAppearanceTinting bedrockComponentAppearanceTinting = a2;
        bedrockComponentAppearanceTinting.color = new KL();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        BedrockComponentAppearanceTinting bedrockComponentAppearanceTinting;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentAppearanceTinting b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Zra.L)) {
            JsonElement jsonElement2 = ((JsonObject)c2).get(Zra.L);
            if (jsonElement2.isJsonArray() || jsonElement2.isJsonPrimitive()) {
                bedrockComponentAppearanceTinting = b2;
                b2.color = iJ.J((JsonElement)jsonElement2, (Uk)a2);
                return super.J((JsonElement)c2, (Uk)a2);
            }
            if (jsonElement2.isJsonObject()) {
                b2.color = iJ.J((JsonObject)jsonElement2.getAsJsonObject(), (Uk)a2);
            }
        }
        bedrockComponentAppearanceTinting = b2;
        return super.J((JsonElement)c2, (Uk)a2);
    }

    @Override
    public void f(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentAppearanceTinting bedrockComponentAppearanceTinting = this;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2, aKa aKa2, float f2, float f3, float f4, float f5, float f6) {
        void i2;
        void b2;
        void c2;
        void d2;
        void g2;
        float f7 = f6;
        BedrockComponentAppearanceTinting a2 = this;
        a2.J((vj)g2, uSa.E, uSa.E, JPa.N, JPa.N, (float)d2, (float)c2, (float)b2, (float)i2);
    }

    @Override
    public void J(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentAppearanceTinting bedrockComponentAppearanceTinting = this;
    }

    @Override
    public int J() {
        return ypa.y;
    }

    @Override
    public void J(vj vj2, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        BedrockComponentAppearanceTinting j2 = vj2;
        BedrockComponentAppearanceTinting i2 = this;
        if (i2.color != null) {
            i2.color.J((vj)j2);
            return;
        }
        BedrockComponentAppearanceTinting bedrockComponentAppearanceTinting = j2;
        ((vj)bedrockComponentAppearanceTinting).H = ((vj)bedrockComponentAppearanceTinting).y = pqa.r;
        ((vj)bedrockComponentAppearanceTinting).a = ((vj)bedrockComponentAppearanceTinting).y;
        ((vj)bedrockComponentAppearanceTinting).R = ((vj)bedrockComponentAppearanceTinting).y;
    }
}

