/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  JPa
 *  NQa
 *  Ql
 *  Rua
 *  Uk
 *  nj
 *  tJ
 *  vRa
 *  vj
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.meta;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleInitialize;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentLocalSpace
extends tJ
implements IComponentParticleInitialize {
    public boolean direction;
    public float linearVelocity;
    public float angularVelocity;
    public boolean position;
    public boolean acceleration;
    public boolean scaleBillboard;
    public boolean rotation;
    public boolean scale;
    public boolean gravity;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2) {
        void b2;
        BedrockComponentLocalSpace a2;
        BedrockComponentLocalSpace c2 = vj2;
        BedrockComponentLocalSpace bedrockComponentLocalSpace = a2 = this;
        BedrockComponentLocalSpace bedrockComponentLocalSpace2 = c2;
        BedrockComponentLocalSpace bedrockComponentLocalSpace3 = a2;
        BedrockComponentLocalSpace bedrockComponentLocalSpace4 = c2;
        BedrockComponentLocalSpace bedrockComponentLocalSpace5 = a2;
        ((vj)c2).U = a2.position;
        ((vj)c2).K = bedrockComponentLocalSpace5.rotation;
        ((vj)bedrockComponentLocalSpace4).o = bedrockComponentLocalSpace5.scale;
        ((vj)bedrockComponentLocalSpace4).J = a2.scaleBillboard;
        ((vj)c2).q = bedrockComponentLocalSpace3.direction;
        ((vj)bedrockComponentLocalSpace2).r = bedrockComponentLocalSpace3.acceleration;
        ((vj)bedrockComponentLocalSpace2).L = a2.gravity;
        ((vj)c2).l = bedrockComponentLocalSpace.linearVelocity;
        ((vj)c2).V = bedrockComponentLocalSpace.angularVelocity;
        c2.J((nj)b2);
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonElement;
        BedrockComponentLocalSpace b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(aua.r)) {
            b2.position = ((JsonObject)c2).get(aua.r).getAsBoolean();
        }
        if (((JsonObject)c2).has(NQa.ja)) {
            b2.rotation = ((JsonObject)c2).get(NQa.ja).getAsBoolean();
        }
        if (((JsonObject)c2).has(Rua.C)) {
            b2.scale = ((JsonObject)c2).get(Rua.C).getAsBoolean();
        }
        if (((JsonObject)c2).has(XOa.m)) {
            b2.scaleBillboard = ((JsonObject)c2).get(XOa.m).getAsBoolean();
        }
        if (((JsonObject)c2).has(pta.i)) {
            b2.direction = ((JsonObject)c2).get(pta.i).getAsBoolean();
        }
        if (((JsonObject)c2).has(Qpa.S)) {
            b2.acceleration = ((JsonObject)c2).get(Qpa.S).getAsBoolean();
        }
        if (((JsonObject)c2).has(KQa.i)) {
            b2.gravity = ((JsonObject)c2).get(KQa.i).getAsBoolean();
        }
        if (((JsonObject)c2).has(ROa.Ha)) {
            b2.linearVelocity = ((JsonObject)c2).get(ROa.Ha).getAsFloat();
        }
        if (((JsonObject)c2).has(Cta.Ja)) {
            b2.angularVelocity = ((JsonObject)c2).get(Cta.Ja).getAsFloat();
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    public JsonElement J() {
        BedrockComponentLocalSpace bedrockComponentLocalSpace = this;
        JsonObject a2 = new JsonObject();
        if (bedrockComponentLocalSpace.position) {
            a2.addProperty(aua.r, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.rotation) {
            a2.addProperty(NQa.ja, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.scale) {
            a2.addProperty(Rua.C, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.scaleBillboard) {
            a2.addProperty(XOa.m, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.direction) {
            a2.addProperty(pta.i, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.acceleration) {
            a2.addProperty(Qpa.S, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.gravity) {
            a2.addProperty(KQa.i, vRa.d != 0);
        }
        if (bedrockComponentLocalSpace.linearVelocity != JPa.N) {
            a2.addProperty(ROa.Ha, Float.valueOf(bedrockComponentLocalSpace.linearVelocity));
        }
        if (bedrockComponentLocalSpace.angularVelocity != JPa.N) {
            a2.addProperty(Cta.Ja, Float.valueOf(bedrockComponentLocalSpace.angularVelocity));
        }
        return a2;
    }

    public BedrockComponentLocalSpace() {
        BedrockComponentLocalSpace a2;
    }

    @Override
    public int J() {
        return uua.p;
    }
}

