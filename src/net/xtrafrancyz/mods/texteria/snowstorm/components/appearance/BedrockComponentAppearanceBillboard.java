/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  ERa
 *  FPa
 *  ISa
 *  JPa
 *  MQa
 *  Oz
 *  Ql
 *  RPa
 *  SQa
 *  Uk
 *  XTa
 *  ZOa
 *  aKa
 *  aPa
 *  aSa
 *  bqa
 *  dpa
 *  fpa
 *  hK
 *  kta
 *  mka
 *  nj
 *  pKa
 *  pj
 *  pqa
 *  psa
 *  pua
 *  tJ
 *  vRa
 *  vj
 *  vpa
 *  yQa
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.appearance;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BedrockComponentAppearanceBillboard
extends tJ
implements IComponentParticleRender {
    public int textureHeight;
    public float w;
    public float stepY;
    public boolean stretchFPS;
    public boolean customDirection;
    public Ak uvH;
    public Vector3f direction;
    public Vector3f vector;
    public Matrix4f rotation;
    public boolean loop;
    public float v1;
    public Ak maxFrame;
    public PL facing;
    public float h;
    public float directionSpeedThreshhold;
    public float u1;
    public Ak directionY;
    public Vector4f[] vertices;
    public Ak directionX;
    public Ak uvY;
    public float u2;
    public float stepX;
    public float fps;
    public Ak directionZ;
    public Ak sizeH;
    public Ak sizeW = Uk.J;
    public Ak uvX;
    public int textureWidth;
    public float v2;
    public Matrix4f transform;
    public Ak uvW;
    public boolean flipbook;

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        JsonArray jsonArray;
        void a2;
        Object c2 = jsonElement;
        BedrockComponentAppearanceBillboard b2 = this;
        if (!((JsonElement)c2).isJsonObject()) {
            return super.J((JsonElement)c2, (Uk)a2);
        }
        if (((JsonObject)(c2 = ((JsonElement)c2).getAsJsonObject())).has(sqa.b) && ((JsonObject)c2).get(sqa.b).isJsonArray() && (jsonArray = ((JsonObject)c2).getAsJsonArray(sqa.b)).size() >= uqa.g) {
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            bedrockComponentAppearanceBillboard.sizeW = a2.f(jsonArray.get(uSa.E));
            bedrockComponentAppearanceBillboard.sizeH = a2.f(jsonArray.get(vRa.d));
        }
        if (((JsonObject)c2).has(Iqa.n)) {
            b2.facing = PL.fromString(((JsonObject)c2).get(Iqa.n).getAsString());
        }
        if (b2.facing.isDirection && ((JsonObject)c2).has(pta.i)) {
            b2.J(((JsonObject)c2).get(pta.i).getAsJsonObject(), (Uk)a2);
        }
        if (((JsonObject)c2).has(Upa.T) && ((JsonObject)c2).get(Upa.T).isJsonObject()) {
            b2.f(((JsonObject)c2).get(Upa.T).getAsJsonObject(), (Uk)a2);
        }
        return super.J((JsonElement)c2, (Uk)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, float f2, float f3, float f4, float f5, float f6) {
        void b2;
        void a2;
        void d2;
        void c2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard2 = bedrockComponentAppearanceBillboard = this;
        bedrockComponentAppearanceBillboard2.w = (float)bedrockComponentAppearanceBillboard2.sizeW.J() * Jra.S;
        bedrockComponentAppearanceBillboard2.h = (float)bedrockComponentAppearanceBillboard2.sizeH.J() * Jra.S;
        float f7 = (float)bedrockComponentAppearanceBillboard2.uvX.J();
        float f8 = (float)bedrockComponentAppearanceBillboard2.uvY.J();
        float f9 = (float)bedrockComponentAppearanceBillboard2.uvW.J();
        float f10 = (float)bedrockComponentAppearanceBillboard2.uvH.J();
        if (bedrockComponentAppearanceBillboard2.flipbook) {
            void e2;
            void f11;
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard3 = bedrockComponentAppearanceBillboard;
            int g2 = (int)(f11.J((float)e2) * (double)bedrockComponentAppearanceBillboard3.fps);
            int n2 = (int)bedrockComponentAppearanceBillboard.maxFrame.J();
            if (bedrockComponentAppearanceBillboard3.stretchFPS) {
                float f12;
                float f13 = f12 = f11.t <= 0 ? JPa.N : ((float)f11.i + e2) / (float)f11.t;
                if (f11.f() != pua.o) {
                    f12 = f11.t <= 0 ? JPa.N : ((float)f11.i + e2) / (float)f11.J();
                }
                g2 = (int)(f12 * (float)n2);
            }
            if (bedrockComponentAppearanceBillboard.loop && n2 != 0) {
                g2 %= n2;
            }
            if (g2 > n2 - vRa.d) {
                g2 = n2 - vRa.d;
            }
            float f14 = f8 += (float)((int)bedrockComponentAppearanceBillboard.stepY * g2);
            bedrockComponentAppearanceBillboard.u1 = (f7 += (float)((int)bedrockComponentAppearanceBillboard.stepX * g2)) / (float)bedrockComponentAppearanceBillboard.textureWidth * (c2 - d2) + d2;
            bedrockComponentAppearanceBillboard.v1 = f14 / (float)bedrockComponentAppearanceBillboard.textureHeight * (a2 - b2) + b2;
            bedrockComponentAppearanceBillboard.u2 = (f7 + f9) / (float)bedrockComponentAppearanceBillboard.textureWidth * (c2 - d2) + d2;
            bedrockComponentAppearanceBillboard.v2 = (f14 + f10) / (float)bedrockComponentAppearanceBillboard.textureHeight * (a2 - b2) + b2;
            return;
        }
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard4 = bedrockComponentAppearanceBillboard;
        bedrockComponentAppearanceBillboard.u1 = d2;
        bedrockComponentAppearanceBillboard4.v1 = b2;
        bedrockComponentAppearanceBillboard4.u2 = c2;
        bedrockComponentAppearanceBillboard.v2 = a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vector3d J(nj nj2, vj vj2, double d2, double d3, double d4) {
        double a2;
        double b2;
        double c2;
        void d5;
        BedrockComponentAppearanceBillboard f2 = nj2;
        BedrockComponentAppearanceBillboard e2 = this;
        if (d5.U && d5.K) {
            e2.vector.set((float)c2, (float)b2, (float)a2);
            if (d5.o) {
                Vector3d vector3d = new Vector3d(c2, b2, a2);
                Matrix3d matrix3d = new Matrix3d(((nj)f2).w[uSa.E], aSa.V, aSa.V, aSa.V, ((nj)f2).w[vRa.d], aSa.V, aSa.V, aSa.V, ((nj)f2).w[uqa.g]);
                matrix3d.transform(vector3d);
                BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = e2;
                bedrockComponentAppearanceBillboard.vector.x = (float)vector3d.x;
                e2.vector.y = (float)vector3d.y;
                bedrockComponentAppearanceBillboard.vector.z = (float)vector3d.z;
            }
            ((nj)f2).S.transform(e2.vector);
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = e2;
            c2 = bedrockComponentAppearanceBillboard.vector.x;
            b2 = bedrockComponentAppearanceBillboard.vector.y;
            a2 = bedrockComponentAppearanceBillboard.vector.z;
            c2 += ((nj)f2).a.x;
            b2 += ((nj)f2).a.y;
            a2 += ((nj)f2).a.z;
        } else if (d5.o) {
            Vector3d vector3d = new Vector3d(c2, b2, a2);
            Matrix3d matrix3d = new Matrix3d(((nj)f2).w[uSa.E], aSa.V, aSa.V, aSa.V, ((nj)f2).w[vRa.d], aSa.V, aSa.V, aSa.V, ((nj)f2).w[uqa.g]);
            Vector3d vector3d2 = vector3d;
            Vector3d vector3d3 = vector3d;
            vector3d.sub(((nj)f2).a);
            matrix3d.transform(vector3d3);
            vector3d3.add(((nj)f2).a);
            c2 = vector3d2.x;
            b2 = vector3d2.y;
            a2 = vector3d2.z;
        }
        return new Vector3d(c2, b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public void l(JsonObject jsonObject, Uk uk2) throws Ql {
        void a2;
        JsonArray jsonArray;
        JsonObject c2 = jsonObject;
        BedrockComponentAppearanceBillboard b2 = this;
        if (c2.has(dsa.m) && c2.get(dsa.m).isJsonArray() && (jsonArray = c2.getAsJsonArray(dsa.m)).size() >= uqa.g) {
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            bedrockComponentAppearanceBillboard.uvX = a2.f(jsonArray.get(uSa.E));
            bedrockComponentAppearanceBillboard.uvY = a2.f(jsonArray.get(vRa.d));
        }
        if (c2.has(vqa.ca) && c2.get(vqa.ca).isJsonArray() && (jsonArray = c2.getAsJsonArray(vqa.ca)).size() >= uqa.g) {
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            bedrockComponentAppearanceBillboard.uvW = a2.f(jsonArray.get(uSa.E));
            bedrockComponentAppearanceBillboard.uvH = a2.f(jsonArray.get(vRa.d));
        }
        if (c2.has(lQa.L) && c2.get(lQa.L).isJsonArray() && (jsonArray = c2.getAsJsonArray(lQa.L)).size() >= uqa.g) {
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            bedrockComponentAppearanceBillboard.stepX = jsonArray.get(uSa.E).getAsFloat();
            bedrockComponentAppearanceBillboard.stepY = jsonArray.get(vRa.d).getAsFloat();
        }
        if (c2.has(SQa.D)) {
            b2.fps = c2.get(SQa.D).getAsFloat();
        }
        if (c2.has(pta.W)) {
            b2.maxFrame = a2.f(c2.get(pta.W));
        }
        if (c2.has(PRa.F)) {
            b2.stretchFPS = c2.get(PRa.F).getAsBoolean();
        }
        if (c2.has(vpa.Ga)) {
            b2.loop = c2.get(vpa.Ga).getAsBoolean();
        }
    }

    private float f() {
        BedrockComponentAppearanceBillboard a2;
        return (float)(-Math.toDegrees(Math.atan2(a2.direction.y, Math.sqrt(a2.direction.x * a2.direction.x + a2.direction.z * a2.direction.z))));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(nj nj2, vj vj2, aKa aKa2, float f2, float f3, float f4, float f5, float f6) {
        void f7;
        void h22;
        void a22;
        void b2;
        void c22;
        float d22;
        void e22;
        BedrockComponentAppearanceBillboard g2;
        BedrockComponentAppearanceBillboard i2 = vj2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = g2 = this;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard2 = i2;
        g2.J((vj)bedrockComponentAppearanceBillboard2, (float)e22, d22, (float)c22, (float)b2, (float)a22);
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard3 = i2;
        double d3 = pj.J((double)((vj)i2).s.x, (double)((vj)bedrockComponentAppearanceBillboard3).z.x, (double)((double)e22));
        double d4 = pj.J((double)((vj)bedrockComponentAppearanceBillboard3).s.y, (double)((vj)i2).z.y, (double)((double)e22));
        double d5 = pj.J((double)((vj)bedrockComponentAppearanceBillboard2).s.z, (double)((vj)i2).z.z, (double)((double)e22));
        d22 = pj.C((float)((vj)bedrockComponentAppearanceBillboard2).Y, (float)((vj)i2).c, (float)e22);
        Vector3d vector3d = bedrockComponentAppearanceBillboard.J((nj)h22, (vj)i2, d3, d4, d5);
        d3 = vector3d.x;
        d4 = vector3d.y;
        d5 = vector3d.z;
        void v4 = h22;
        int h22 = v4.J((float)e22, d3, d4, d5);
        int e22 = h22 >> ERa.C & yQa.j;
        h22 &= yQa.j;
        bedrockComponentAppearanceBillboard.J((nj)v4, (vj)i2, d3, d4, d5);
        bedrockComponentAppearanceBillboard.rotation.rotZ(d22 / Hra.Ga * pua.j);
        bedrockComponentAppearanceBillboard.transform.mul(g2.rotation);
        bedrockComponentAppearanceBillboard.transform.setTranslation(new Vector3f((float)d3, (float)d4, (float)d5));
        Vector4f[] d22 = bedrockComponentAppearanceBillboard.vertices;
        int c22 = bedrockComponentAppearanceBillboard.vertices.length;
        int n2 = b2 = uSa.E;
        while (n2 < c22) {
            Vector4f a22 = d22[b2];
            g2.transform.transform(a22);
            n2 = ++b2;
        }
        void v6 = f7;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard4 = g2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard5 = i2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard6 = i2;
        v6.J((double)g2.vertices[uSa.E].x, (double)g2.vertices[uSa.E].y, (double)g2.vertices[uSa.E].z).J((double)bedrockComponentAppearanceBillboard4.u1, (double)g2.v1).J(e22, h22).J(((vj)bedrockComponentAppearanceBillboard5).R, ((vj)bedrockComponentAppearanceBillboard5).a, ((vj)bedrockComponentAppearanceBillboard6).H, ((vj)bedrockComponentAppearanceBillboard6).y).M();
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard7 = g2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard8 = i2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard9 = i2;
        v6.J((double)bedrockComponentAppearanceBillboard4.vertices[vRa.d].x, (double)g2.vertices[vRa.d].y, (double)g2.vertices[vRa.d].z).J((double)bedrockComponentAppearanceBillboard7.u2, (double)g2.v1).J(e22, h22).J(((vj)bedrockComponentAppearanceBillboard8).R, ((vj)bedrockComponentAppearanceBillboard8).a, ((vj)bedrockComponentAppearanceBillboard9).H, ((vj)bedrockComponentAppearanceBillboard9).y).M();
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard10 = g2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard11 = i2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard12 = i2;
        v6.J((double)bedrockComponentAppearanceBillboard7.vertices[uqa.g].x, (double)g2.vertices[uqa.g].y, (double)g2.vertices[uqa.g].z).J((double)bedrockComponentAppearanceBillboard10.u2, (double)g2.v2).J(e22, h22).J(((vj)bedrockComponentAppearanceBillboard11).R, ((vj)bedrockComponentAppearanceBillboard11).a, ((vj)bedrockComponentAppearanceBillboard12).H, ((vj)bedrockComponentAppearanceBillboard12).y).M();
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard13 = i2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard14 = i2;
        v6.J((double)bedrockComponentAppearanceBillboard10.vertices[yRa.d].x, (double)g2.vertices[yRa.d].y, (double)g2.vertices[yRa.d].z).J((double)g2.u1, (double)g2.v2).J(e22, h22).J(((vj)bedrockComponentAppearanceBillboard13).R, ((vj)bedrockComponentAppearanceBillboard13).a, ((vj)bedrockComponentAppearanceBillboard14).H, ((vj)bedrockComponentAppearanceBillboard14).y).M();
    }

    public BedrockComponentAppearanceBillboard() {
        BedrockComponentAppearanceBillboard a2;
        a2.sizeH = Uk.J;
        a2.facing = PL.LOOKAT_XYZ;
        a2.customDirection = uSa.E;
        a2.directionSpeedThreshhold = Jpa.B;
        a2.directionX = Uk.J;
        a2.directionY = Uk.J;
        a2.directionZ = Uk.J;
        a2.textureWidth = XOa.h;
        a2.textureHeight = XOa.h;
        a2.uvX = Uk.J;
        a2.uvY = Uk.J;
        a2.uvW = Uk.J;
        a2.uvH = Uk.J;
        a2.flipbook = uSa.E;
        a2.maxFrame = Uk.J;
        a2.stretchFPS = uSa.E;
        a2.loop = uSa.E;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = a2;
        a2.transform = new Matrix4f();
        a2.rotation = new Matrix4f();
        Vector4f[] vector4fArray = new Vector4f[AQa.P];
        vector4fArray[uSa.E] = new Vector4f(JPa.N, JPa.N, JPa.N, pqa.r);
        vector4fArray[vRa.d] = new Vector4f(JPa.N, JPa.N, JPa.N, pqa.r);
        vector4fArray[uqa.g] = new Vector4f(JPa.N, JPa.N, JPa.N, pqa.r);
        vector4fArray[yRa.d] = new Vector4f(JPa.N, JPa.N, JPa.N, pqa.r);
        a2.vertices = vector4fArray;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard2 = a2;
        bedrockComponentAppearanceBillboard2.vector = new Vector3f();
        bedrockComponentAppearanceBillboard2.direction = new Vector3f();
    }

    private float J() {
        double d2;
        double d3;
        BedrockComponentAppearanceBillboard a2;
        double d4 = Math.atan2(-a2.direction.x, a2.direction.z);
        d4 = Math.toDegrees(d4);
        if (d3 < bqa.H) {
            d2 = d4 = d4 + ZOa.Ja;
        } else {
            if (d4 > kta.Da) {
                d4 -= ZOa.Ja;
            }
            d2 = d4;
        }
        return (float)(-d2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(JsonObject jsonObject, Uk uk2) throws Ql {
        void a2;
        JsonArray jsonArray;
        JsonObject c2 = jsonObject;
        BedrockComponentAppearanceBillboard b2 = this;
        if (c2.has(UOa.P)) {
            b2.textureWidth = c2.get(UOa.P).getAsInt();
        }
        if (c2.has(vsa.a)) {
            b2.textureHeight = c2.get(vsa.a).getAsInt();
        }
        if (c2.has(Upa.T) && c2.get(Upa.T).isJsonArray() && (jsonArray = c2.getAsJsonArray(Upa.T)).size() >= uqa.g) {
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            bedrockComponentAppearanceBillboard.uvX = a2.f(jsonArray.get(uSa.E));
            bedrockComponentAppearanceBillboard.uvY = a2.f(jsonArray.get(vRa.d));
        }
        if (c2.has(xqa.N) && c2.get(xqa.N).isJsonArray() && (jsonArray = c2.getAsJsonArray(xqa.N)).size() >= uqa.g) {
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            bedrockComponentAppearanceBillboard.uvW = a2.f(jsonArray.get(uSa.E));
            bedrockComponentAppearanceBillboard.uvH = a2.f(jsonArray.get(vRa.d));
        }
        if (c2.has(dpa.la) && c2.get(dpa.la).isJsonObject()) {
            b2.flipbook = vRa.d;
            b2.l(c2.get(dpa.la).getAsJsonObject(), (Uk)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(nj nj2, vj vj2) {
        BedrockComponentAppearanceBillboard a2;
        BedrockComponentAppearanceBillboard c22 = vj2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = a2 = this;
        bedrockComponentAppearanceBillboard.transform.setIdentity();
        float c22 = bedrockComponentAppearanceBillboard.w * MQa.L;
        float f2 = bedrockComponentAppearanceBillboard.h * MQa.L;
        if (((vj)c22).J) {
            void b2;
            c22 = (float)((double)c22 * b2.w[uSa.E]);
            f2 = (float)((double)f2 * b2.w[vRa.d]);
        }
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard2 = a2;
        bedrockComponentAppearanceBillboard2.vertices[uSa.E].set(-c22, -f2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.vertices[vRa.d].set(c22, -f2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.vertices[uqa.g].set(c22, f2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.vertices[yRa.d].set(-c22, f2, JPa.N, pqa.r);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(vj vj2, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        int g22;
        void h322;
        void f222;
        void a2;
        void b2;
        float c2;
        float j2;
        float e22;
        void i2;
        float f8 = f4;
        BedrockComponentAppearanceBillboard d2 = this;
        d2.J((vj)i2, e22, j2, c2, (float)b2, (float)a2);
        d2.w = d2.h = MQa.L;
        void v0 = i2;
        e22 = pj.C((float)v0.Y, (float)v0.c, (float)e22);
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = d2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard2 = d2;
        j2 = bedrockComponentAppearanceBillboard2.w * MQa.L;
        c2 = bedrockComponentAppearanceBillboard2.h * MQa.L;
        bedrockComponentAppearanceBillboard2.vertices[uSa.E].set(-j2, -c2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.vertices[vRa.d].set(j2, -c2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.vertices[uqa.g].set(j2, c2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.vertices[yRa.d].set(-j2, c2, JPa.N, pqa.r);
        bedrockComponentAppearanceBillboard2.transform.setIdentity();
        bedrockComponentAppearanceBillboard2.transform.setScale((float)(f222 * RPa.k));
        bedrockComponentAppearanceBillboard.transform.setTranslation(new Vector3f((float)h322, (float)g22 - f222 / kta.v, JPa.N));
        bedrockComponentAppearanceBillboard.rotation.rotZ(e22 / Hra.Ga * pua.j);
        bedrockComponentAppearanceBillboard.transform.mul(d2.rotation);
        Vector4f[] h322 = bedrockComponentAppearanceBillboard.vertices;
        g22 = bedrockComponentAppearanceBillboard.vertices.length;
        int n4 = f222 = uSa.E;
        while (n4 < g22) {
            Vector4f e22 = h322[f222];
            d2.transform.transform(e22);
            n4 = ++f222;
        }
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard3 = d2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard4 = d2;
        float h322 = bedrockComponentAppearanceBillboard3.u1 / (float)bedrockComponentAppearanceBillboard4.textureWidth;
        float g22 = bedrockComponentAppearanceBillboard3.u2 / (float)d2.textureWidth;
        float f222 = bedrockComponentAppearanceBillboard4.v1 / (float)d2.textureHeight;
        e22 = bedrockComponentAppearanceBillboard3.v2 / (float)d2.textureHeight;
        aKa aKa2 = j2 = pKa.J().J();
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard5 = d2;
        aKa aKa3 = j2;
        aKa3.J(XTa.W, mka.a);
        void v9 = i2;
        void v10 = i2;
        aKa3.J((double)d2.vertices[uSa.E].x, (double)d2.vertices[uSa.E].y, (double)d2.vertices[uSa.E].z).J((double)h322, (double)f222).J(v9.R, v9.a, v10.H, v10.y).M();
        void v11 = i2;
        void v12 = i2;
        j2.J((double)bedrockComponentAppearanceBillboard5.vertices[vRa.d].x, (double)d2.vertices[vRa.d].y, (double)d2.vertices[vRa.d].z).J((double)g22, (double)f222).J(v11.R, v11.a, v12.H, v12.y).M();
        void v13 = i2;
        void v14 = i2;
        aKa2.J((double)bedrockComponentAppearanceBillboard5.vertices[uqa.g].x, (double)d2.vertices[uqa.g].y, (double)d2.vertices[uqa.g].z).J((double)g22, (double)e22).J(v13.R, v13.a, v14.H, v14.y).M();
        void v15 = i2;
        void v16 = i2;
        aKa2.J((double)d2.vertices[yRa.d].x, (double)d2.vertices[yRa.d].y, (double)d2.vertices[yRa.d].z).J((double)h322, (double)e22).J(v15.R, v15.a, v16.H, v16.y).M();
        pKa.J().J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(JsonObject jsonObject, Uk uk2) throws Ql {
        JsonObject c2 = jsonObject;
        BedrockComponentAppearanceBillboard b2 = this;
        b2.customDirection = c2.has(Qpa.q) && c2.get(Qpa.q).getAsString().equals(psa.i) ? vRa.d : uSa.E;
        int n2 = b2.customDirection ? 1 : 0;
        if (b2.customDirection && c2.has(fqa.M)) {
            void a2;
            JsonArray jsonArray = c2.getAsJsonArray(fqa.M);
            BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = b2;
            void v2 = a2;
            b2.directionX = v2.f(jsonArray.get(uSa.E));
            bedrockComponentAppearanceBillboard.directionY = v2.f(jsonArray.get(vRa.d));
            bedrockComponentAppearanceBillboard.directionZ = a2.f(jsonArray.get(uqa.g));
            return;
        }
        if (!b2.customDirection && c2.has(FPa.la)) {
            b2.directionSpeedThreshhold = c2.get(FPa.la).getAsFloat();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J(nj var1_2, vj var2_3, double var3_4, double var5_5, double var7_6) {
        var9_7 = this;
        v0 = e;
        f = v0.e;
        var10_8 = v0.C;
        var11_9 = v0.b;
        var13_10 = v0.Q;
        var15_11 = v0.X;
        if (v0.i == uqa.g) {
            v1 = var9_7;
            v2 = v1;
            v1.w = -v1.w;
        } else {
            if (e.i == ySa.T && !var9_7.facing.isLookAt) {
                f = Hra.Ga - f;
                v3 = var9_7;
                v3.w = -v3.w;
                v3.h = -v3.h;
            }
            v2 = var9_7;
        }
        if (v2.facing.isLookAt && !var9_7.facing.isDirection) {
            var17_12 = var11_9 - c;
            var19_14 = var13_10 - b;
            var21_16 = var15_11 - a;
            v4 = var17_12;
            v5 = var21_16;
            var23_17 = Oz.J((double)(v4 * v4 + v5 * v5));
            f = Hra.Ga - (float)(Oz.f((double)var21_16, (double)var17_12) * ATa.Ia) - ISa.a;
            var10_8 = (float)(-(Oz.f((double)var19_14, (double)var23_17) * ATa.Ia)) + Hra.Ga;
        }
        if (!var9_7.facing.isDirection) ** GOTO lbl53
        if (var9_7.customDirection) {
            v6 = var9_7;
            var9_7.direction.x = (float)var9_7.directionX.J();
            var9_7.direction.y = (float)var9_7.directionY.J();
            var9_7.direction.z = (float)var9_7.directionZ.J();
        } else {
            v7 = var9_7;
            v8 = var9_7;
            if (d.N.lengthSquared() > v7.directionSpeedThreshhold * v7.directionSpeedThreshhold) {
                v8.direction.set(d.N);
                v9 = var9_7;
                v6 = v9;
                v9.direction.normalize();
            } else {
                v8.direction.set(pqa.r, JPa.N, JPa.N);
                v6 = var9_7;
            }
        }
        var17_12 = v6.direction.lengthSquared();
        if (v10 < oQa.Ka) {
            v11 = var9_7;
            v12 = v11;
            v11.direction.set(pqa.r, JPa.N, JPa.N);
        } else {
            if (Math.abs(var17_12 - oua.i) > oQa.Ka) {
                var9_7.direction.normalize();
            }
lbl53:
            // 4 sources

            v12 = var9_7;
        }
        v12.J((nj)e, (vj)d);
        switch (hK.I[var9_7.facing.ordinal()]) {
            case 1: 
            case 2: {
                v13 = var9_7;
                while (false) {
                }
                v13.rotation.rotY((float)Math.toRadians(f));
                v14 = var9_7;
                v13.transform.mul(v14.rotation);
                v14.rotation.rotX((float)Math.toRadians(var10_8));
                v13.transform.mul(var9_7.rotation);
                return;
            }
            case 3: 
            case 4: {
                v15 = var9_7;
                v15.rotation.rotY((float)Math.toRadians(f));
                v15.transform.mul(var9_7.rotation);
                return;
            }
            case 5: {
                v16 = var9_7;
                v16.rotation.rotZ((float)Math.toRadians(kta.Da));
                v17 = var9_7;
                v16.transform.mul(v17.rotation);
                v17.rotation.rotY((float)Math.toRadians(fpa.ba));
                v16.transform.mul(var9_7.rotation);
                return;
            }
            case 6: {
                v18 = var9_7;
                v18.rotation.rotX((float)Math.toRadians(fpa.ba));
                v18.transform.mul(var9_7.rotation);
                return;
            }
            case 7: {
                v19 = var9_7;
                v19.rotation.rotX((float)Math.toRadians(kta.Da));
                v19.transform.mul(var9_7.rotation);
                return;
            }
            case 8: {
                v20 = var9_7;
                v21 = var9_7;
                v20.rotation.rotY((float)Math.toRadians(v21.J()));
                v20.transform.mul(var9_7.rotation);
                v21.rotation.rotX((float)Math.toRadians(var9_7.f()));
                v20.transform.mul(var9_7.rotation);
                v20.rotation.rotY((float)Math.toRadians(fpa.ba));
                v20.transform.mul(var9_7.rotation);
                return;
            }
            case 9: {
                v22 = var9_7;
                v23 = var9_7;
                v22.rotation.rotY((float)Math.toRadians(v23.J()));
                v22.transform.mul(var9_7.rotation);
                v23.rotation.rotX((float)Math.toRadians(var9_7.f() + ISa.a));
                v22.transform.mul(var9_7.rotation);
                return;
            }
            case 10: {
                v24 = var9_7;
                v25 = var9_7;
                v24.rotation.rotY((float)Math.toRadians(v25.J()));
                v24.transform.mul(var9_7.rotation);
                v25.rotation.rotX((float)Math.toRadians(var9_7.f()));
                v24.transform.mul(var9_7.rotation);
                return;
            }
            case 11: {
                v26 = var9_7;
                v26.rotation.setIdentity();
                v27 = var9_7;
                v26.rotation.rotY((float)Math.toRadians(v27.J()));
                v27.transform.mul(var9_7.rotation);
                v26.rotation.rotX((float)Math.toRadians(var9_7.f() + ISa.a));
                v26.transform.mul(var9_7.rotation);
                var17_13 = new Vector3f((float)(var11_9 - c), (float)(var13_10 - b), (float)(var15_11 - a));
                var18_18 = new Vector3f(JPa.N, JPa.N, pqa.r);
                v26.transform.transform(var18_18);
                var19_15 = new Vector3f(var9_7.direction);
                v28 = var17_13;
                var19_15.scale(v28.dot(var9_7.direction));
                v28.sub(var19_15);
                if ((double)v28.lengthSquared() < aPa.m) {
                    return;
                }
                var17_13.normalize();
                var20_19 = new Vector3f();
                v29 = var9_7;
                var20_19.cross(var17_13, var18_18);
                v29.rotation.rotY(-Math.copySign(var17_13.angle(var18_18), var20_19.dot(var9_7.direction)));
                v29.transform.mul(var9_7.rotation);
                return;
            }
        }
    }

    @Override
    public void f(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = this;
    }

    /*
     * Unable to fully structure code
     */
    public JsonElement J() {
        var1_1 = this;
        var4_2 = new JsonObject();
        var5_3 = new JsonArray();
        var3_4 = new JsonObject();
        v0 = var5_3;
        v0.add(var1_1.sizeW.J());
        v0.add(var1_1.sizeH.J());
        var3_4.addProperty(UOa.P, var1_1.textureWidth);
        v1 = var1_1;
        var3_4.addProperty(vsa.a, v1.textureHeight);
        if (!v1.flipbook && !Ak.J((Ak)var1_1.uvX) || !Ak.J((Ak)var1_1.uvY)) {
            v2 = a = new JsonArray();
            v2.add(var1_1.uvX.J());
            v2.add(var1_1.uvY.J());
            var3_4.add(Upa.T, (JsonElement)a);
        }
        if (!var1_1.flipbook && !Ak.J((Ak)var1_1.uvW) || !Ak.J((Ak)var1_1.uvH)) {
            v3 = a = new JsonArray();
            v3.add(var1_1.uvW.J());
            v3.add(var1_1.uvH.J());
            var3_4.add(xqa.N, (JsonElement)a);
        }
        if (var1_1.flipbook) {
            a = new JsonObject();
            if (!Ak.J((Ak)var1_1.uvX) || !Ak.J((Ak)var1_1.uvY)) {
                v4 = var2_5 = new JsonArray();
                v4.add(var1_1.uvX.J());
                v4.add(var1_1.uvY.J());
                a.add(dsa.m, var2_5);
            }
            if (!Ak.J((Ak)var1_1.uvW) || !Ak.J((Ak)var1_1.uvH)) {
                v5 = var2_5 = new JsonArray();
                v5.add(var1_1.uvW.J());
                v5.add(var1_1.uvH.J());
                a.add(vqa.ca, var2_5);
            }
            if (var1_1.stepX != JPa.N || var1_1.stepY != JPa.N) {
                v6 = var2_5 = new JsonArray();
                v6.add(new JsonPrimitive(Float.valueOf(var1_1.stepX)));
                v6.add(new JsonPrimitive(Float.valueOf(var1_1.stepY)));
                a.add(lQa.L, var2_5);
            }
            if (var1_1.fps != JPa.N) {
                a.addProperty(SQa.D, Float.valueOf(var1_1.fps));
            }
            if (!Ak.J((Ak)var1_1.maxFrame)) {
                a.add(pta.W, var1_1.maxFrame.J());
            }
            if (var1_1.stretchFPS) {
                a.addProperty(PRa.F, (boolean)vRa.d);
            }
            if (var1_1.loop) {
                a.addProperty(vpa.Ga, (boolean)vRa.d);
            }
            var3_4.add(dpa.la, (JsonElement)a);
        }
        if (!var1_1.facing.isDirection) ** GOTO lbl69
        a = new JsonObject();
        if (var1_1.customDirection) {
            a.addProperty(Qpa.q, psa.i);
            if (var1_1.directionX != Uk.J || var1_1.directionY != Uk.J || var1_1.directionZ != Uk.J) {
                v7 = var2_5 = new JsonArray();
                v8 = var1_1;
                var2_5.add(v8.directionX.J());
                v7.add(v8.directionY.J());
                v7.add(var1_1.directionZ.J());
                a.add(fqa.M, var2_5);
            }
            v9 = var4_2;
            v10 = v9;
            v9.add(pta.i, (JsonElement)a);
        } else {
            if (var1_1.directionSpeedThreshhold != Jpa.B) {
                v11 = a;
                v11.addProperty(Qpa.q, Gta.m);
                v11.addProperty(FPa.la, Float.valueOf(var1_1.directionSpeedThreshhold));
                var4_2.add(pta.i, (JsonElement)a);
            }
lbl69:
            // 4 sources

            v10 = var4_2;
        }
        v10.add(sqa.b, var5_3);
        v12 = var4_2;
        v12.addProperty(Iqa.n, var1_1.facing.id);
        v12.add(Upa.T, var3_4);
        return v12;
    }

    @Override
    public void J(nj nj2, float f2) {
        float c2 = f2;
        BedrockComponentAppearanceBillboard bedrockComponentAppearanceBillboard = this;
    }
}

