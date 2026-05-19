/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  EQa
 *  ERa
 *  JPa
 *  Ql
 *  Qqa
 *  UL
 *  Uk
 *  Uta
 *  YSa
 *  ZOa
 *  aKa
 *  nj
 *  pj
 *  pua
 *  tJ
 *  vRa
 *  vj
 *  yQa
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.appearance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentAppearanceBillboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentCollisionAppearance
extends BedrockComponentAppearanceBillboard
implements IComponentParticleRender {
    public UL material = UL.OPAQUE;
    public Ak enabled = Uk.J;
    public boolean lit;
    public String textureId;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2, aKa aKa2, float f2, float f3, float f4, float f5, float f6) {
        void a22;
        void b322;
        void c22;
        float d322;
        void e22;
        void f7;
        void h2;
        BedrockComponentCollisionAppearance i2 = vj2;
        BedrockComponentCollisionAppearance g2 = this;
        int n2 = uSa.E;
        if (!i2.J((nj)h2)) {
            if (i2.f((nj)h2)) {
                void v0 = h2;
                n2 = v0.I ? 1 : 0;
                v0.I = g2.lit;
                v0.p.C(BedrockComponentAppearanceBillboard.class).J((nj)h2, (vj)i2, (aKa)f7, (float)e22, d322, (float)c22, (float)b322, (float)a22);
                h2.I = n2;
            }
            return;
        }
        if (!i2.f((nj)h2)) {
            n2 = g2.lit ? 1 : 0;
            g2.lit = h2.I;
        }
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance = g2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance2 = i2;
        g2.J((vj)bedrockComponentCollisionAppearance2, (float)e22, d322, (float)c22, (float)b322, (float)a22);
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance3 = i2;
        double d2 = pj.J((double)((vj)i2).s.x, (double)((vj)bedrockComponentCollisionAppearance3).z.x, (double)((double)e22));
        double d4 = pj.J((double)((vj)bedrockComponentCollisionAppearance3).s.y, (double)((vj)i2).z.y, (double)((double)e22));
        double d5 = pj.J((double)((vj)bedrockComponentCollisionAppearance2).s.z, (double)((vj)i2).z.z, (double)((double)e22));
        d322 = pj.C((float)((vj)bedrockComponentCollisionAppearance2).Y, (float)((vj)i2).c, (float)e22);
        Vector3d vector3d = bedrockComponentCollisionAppearance.J((nj)h2, (vj)i2, d2, d4, d5);
        d2 = vector3d.x;
        d4 = vector3d.y;
        d5 = vector3d.z;
        int c22 = bedrockComponentCollisionAppearance.lit ? YSa.L : h2.J((float)e22, d2, d4, d5);
        int e22 = c22 >> ERa.C & yQa.j;
        c22 &= yQa.j;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance4 = g2;
        bedrockComponentCollisionAppearance4.J((nj)h2, (vj)i2, d2, d4, d5);
        bedrockComponentCollisionAppearance4.rotation.rotZ(d322 / Hra.Ga * pua.j);
        bedrockComponentCollisionAppearance4.transform.mul(g2.rotation);
        bedrockComponentCollisionAppearance4.transform.setTranslation(new Vector3f((float)d2, (float)d4, (float)d5));
        Vector4f[] d322 = bedrockComponentCollisionAppearance4.vertices;
        int b322 = bedrockComponentCollisionAppearance4.vertices.length;
        int n3 = a22 = uSa.E;
        while (n3 < b322) {
            Vector4f vector4f = d322[a22];
            g2.transform.transform(vector4f);
            n3 = ++a22;
        }
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance5 = g2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance6 = g2;
        float d322 = bedrockComponentCollisionAppearance5.u1 / (float)bedrockComponentCollisionAppearance6.textureWidth;
        float b322 = bedrockComponentCollisionAppearance5.u2 / (float)g2.textureWidth;
        float a22 = bedrockComponentCollisionAppearance6.v1 / (float)g2.textureHeight;
        float f8 = bedrockComponentCollisionAppearance5.v2 / (float)g2.textureHeight;
        void v9 = f7;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance7 = g2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance8 = i2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance9 = i2;
        f7.J((double)g2.vertices[uSa.E].x, (double)g2.vertices[uSa.E].y, (double)g2.vertices[uSa.E].z).J((double)d322, (double)a22).J(e22, c22).J(((vj)bedrockComponentCollisionAppearance8).R, ((vj)bedrockComponentCollisionAppearance8).a, ((vj)bedrockComponentCollisionAppearance9).H, ((vj)bedrockComponentCollisionAppearance9).y).M();
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance10 = i2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance11 = i2;
        f7.J((double)bedrockComponentCollisionAppearance7.vertices[vRa.d].x, (double)g2.vertices[vRa.d].y, (double)g2.vertices[vRa.d].z).J((double)b322, (double)a22).J(e22, c22).J(((vj)bedrockComponentCollisionAppearance10).R, ((vj)bedrockComponentCollisionAppearance10).a, ((vj)bedrockComponentCollisionAppearance11).H, ((vj)bedrockComponentCollisionAppearance11).y).M();
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance12 = i2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance13 = i2;
        v9.J((double)bedrockComponentCollisionAppearance7.vertices[uqa.g].x, (double)g2.vertices[uqa.g].y, (double)g2.vertices[uqa.g].z).J((double)b322, (double)f8).J(e22, c22).J(((vj)bedrockComponentCollisionAppearance12).R, ((vj)bedrockComponentCollisionAppearance12).a, ((vj)bedrockComponentCollisionAppearance13).H, ((vj)bedrockComponentCollisionAppearance13).y).M();
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance14 = i2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance15 = i2;
        v9.J((double)g2.vertices[yRa.d].x, (double)g2.vertices[yRa.d].y, (double)g2.vertices[yRa.d].z).J((double)d322, (double)f8).J(e22, c22).J(((vj)bedrockComponentCollisionAppearance14).R, ((vj)bedrockComponentCollisionAppearance15).a, ((vj)bedrockComponentCollisionAppearance15).H, ((vj)i2).y).M();
        if (!bedrockComponentCollisionAppearance14.f((nj)h2)) {
            g2.lit = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vj vj2, float f2, float f3, float f4, float f5, float f6) {
        void b2;
        void d2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance2 = bedrockComponentCollisionAppearance = this;
        bedrockComponentCollisionAppearance2.w = (float)bedrockComponentCollisionAppearance2.sizeW.J() * Jra.S;
        bedrockComponentCollisionAppearance2.h = (float)bedrockComponentCollisionAppearance2.sizeH.J() * Jra.S;
        float c2 = (float)bedrockComponentCollisionAppearance2.uvX.J();
        float a2 = (float)bedrockComponentCollisionAppearance2.uvY.J();
        float f7 = (float)bedrockComponentCollisionAppearance2.uvW.J();
        float f8 = (float)bedrockComponentCollisionAppearance2.uvH.J();
        if (bedrockComponentCollisionAppearance2.flipbook) {
            void e2;
            void f9;
            BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance3 = bedrockComponentCollisionAppearance;
            int g2 = (int)(f9.J((float)e2) * (double)bedrockComponentCollisionAppearance3.fps);
            int n2 = (int)bedrockComponentCollisionAppearance.maxFrame.J();
            if (bedrockComponentCollisionAppearance3.stretchFPS) {
                float f10;
                float f11;
                if (f9.t <= 0) {
                    f11 = JPa.N;
                } else {
                    void v3 = f9;
                    f11 = f10 = ((float)f9.i + e2) / (float)(v3.t - v3.A);
                }
                if (f9.f() != pua.o) {
                    f10 = f9.t <= 0 ? JPa.N : ((float)f9.i + e2) / (float)f9.J();
                }
                g2 = (int)(f10 * (float)n2);
            }
            if (bedrockComponentCollisionAppearance.loop && n2 != 0) {
                g2 %= n2;
            }
            if (g2 > n2) {
                g2 = n2;
            }
            c2 += bedrockComponentCollisionAppearance.stepX * (float)g2;
            a2 += bedrockComponentCollisionAppearance.stepY * (float)g2;
        }
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance4 = bedrockComponentCollisionAppearance;
        bedrockComponentCollisionAppearance.u1 = d2 + c2;
        bedrockComponentCollisionAppearance4.v1 = b2 + a2;
        bedrockComponentCollisionAppearance4.u2 = c2 + f7;
        bedrockComponentCollisionAppearance.v2 = a2 + f8;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        String string;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentCollisionAppearance b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(Uta.p)) {
            b2.enabled = a2.f(((JsonObject)c2).get(Uta.p));
        }
        if (((JsonObject)c2).has(Qqa.m)) {
            b2.lit = ((JsonObject)c2).get(Qqa.m).getAsBoolean();
        }
        if (((JsonObject)c2).has(cPa.J)) {
            b2.material = UL.fromString((String)((JsonObject)c2).get(cPa.J).getAsString());
        }
        if (((JsonObject)c2).has(EQa.Ga) && !(string = ((JsonObject)c2).get(EQa.Ga).getAsString()).equals(Pua.Da)) {
            b2.textureId = string;
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    @Override
    public void J(vj vj2, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f7;
        BedrockComponentCollisionAppearance a2 = this;
    }

    @Override
    public JsonElement J() {
        Iterator<Map.Entry<String, JsonElement>> iterator;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance = this;
        JsonObject a2 = new JsonObject();
        a2.add(Uta.p, bedrockComponentCollisionAppearance.enabled.J());
        a2.addProperty(Qqa.m, bedrockComponentCollisionAppearance.lit);
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance2 = bedrockComponentCollisionAppearance;
        a2.addProperty(cPa.J, bedrockComponentCollisionAppearance2.material.id);
        if (bedrockComponentCollisionAppearance2.textureId != null && !bedrockComponentCollisionAppearance.textureId.equals(Pua.Da)) {
            a2.addProperty(EQa.Ga, bedrockComponentCollisionAppearance.textureId);
        }
        Iterator<Map.Entry<String, JsonElement>> iterator2 = iterator = ((JsonObject)super.J()).entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, JsonElement> entry = iterator.next();
            a2.add(entry.getKey(), entry.getValue());
            iterator2 = iterator;
        }
        return a2;
    }

    @Override
    public void J(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance = this;
    }

    public BedrockComponentCollisionAppearance() {
        BedrockComponentCollisionAppearance a2;
    }

    @Override
    public int J() {
        return ZOa.x;
    }

    @Override
    public void f(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentCollisionAppearance bedrockComponentCollisionAppearance = this;
    }
}

