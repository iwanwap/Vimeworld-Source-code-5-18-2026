/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Gg
 *  JPa
 *  Lra
 *  Oz
 *  Ql
 *  Tpa
 *  Uk
 *  Uta
 *  aSa
 *  gK
 *  iPa
 *  lqa
 *  nj
 *  pqa
 *  tJ
 *  uRa
 *  vL
 *  vRa
 *  vj
 *  vpa
 *  wOa
 *  xy
 *  yk
 *  zTa
 */
package net.xtrafrancyz.mods.texteria.snowstorm.components.motion;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.vecmath.Tuple3d;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BedrockComponentMotionCollision
extends tJ
implements IComponentParticleUpdate {
    private Vector3d previous;
    public boolean expireOnImpact;
    public float collisionDrag;
    public float rotationCollisionDrag;
    public boolean momentum;
    public boolean preserveEnergy;
    public Ak expirationDelay;
    private zz pos;
    public float bounciness;
    public int splitParticleCount;
    public boolean realisticCollision;
    private Vector3d current;
    public float randomBounciness;
    public float splitParticleSpeedThreshold;
    public Ak enabled = Uk.A;
    public float randomDamp;
    public boolean realisticCollisionDrag;
    public float radius;
    public float damp;
    public boolean entityCollision;

    /*
     * WARNING - void declaration
     */
    public static void J(Vector3d vector3d, RX rX, double d2) {
        void a2;
        RX c2 = rX;
        Vector3d b2 = vector3d;
        if (c2 == RX.X) {
            b2.x = a2;
            return;
        }
        if (c2 == RX.Y) {
            b2.y = a2;
            return;
        }
        b2.z = a2;
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(Vector3f vector3f, RX rX, float f2) {
        void c2;
        float a2;
        BedrockComponentMotionCollision bedrockComponentMotionCollision = this;
        if (a2 != JPa.N) {
            BedrockComponentMotionCollision bedrockComponentMotionCollision2;
            void b2;
            Vector3f d2 = new Vector3f((Vector3f)c2);
            float f3 = rta.o;
            void v0 = b2;
            float f4 = d2.length();
            float f5 = (float)Math.random() * (a2 *= Nra.e);
            float f6 = (float)((double)(a2 * f3) * (Math.random() * KPa.y - oua.i));
            a2 = (float)((double)(a2 * f3) * (Math.random() * KPa.y - oua.i));
            f3 = BedrockComponentMotionCollision.J(d2, (RX)v0);
            if (v0 == RX.X) {
                bedrockComponentMotionCollision2 = bedrockComponentMotionCollision;
                Object object = d2;
                ((Vector3f)object).y += f6;
                ((Vector3f)object).z += a2;
            } else if (b2 == RX.Y) {
                bedrockComponentMotionCollision2 = bedrockComponentMotionCollision;
                Object object = d2;
                ((Vector3f)object).x += f6;
                ((Vector3f)object).z += a2;
            } else {
                Object object = d2;
                ((Vector3f)object).y += f6;
                ((Vector3f)object).x += a2;
                bedrockComponentMotionCollision2 = bedrockComponentMotionCollision;
            }
            if (bedrockComponentMotionCollision2.bounciness != JPa.N) {
                float f7 = f3;
                BedrockComponentMotionCollision.J(d2, (RX)b2, f7 + (f7 < JPa.N ? -f5 : f5));
                Vector3f vector3f2 = d2;
                vector3f2.scale(f4 / vector3f2.length());
                return vector3f2;
            }
            if (d2.x != JPa.N || d2.y != JPa.N || d2.z != JPa.N) {
                if (bedrockComponentMotionCollision.preserveEnergy) {
                    BedrockComponentMotionCollision.J(d2, (RX)b2, JPa.N);
                }
                if (d2.x != JPa.N || d2.y != JPa.N || d2.z != JPa.N) {
                    d2.scale(f4 / d2.length());
                }
                Vector3f vector3f3 = d2;
                BedrockComponentMotionCollision.J(vector3f3, (RX)b2, f3);
                return vector3f3;
            }
            return c2;
        }
        return c2;
    }

    public static void J(Vector3f vector3f, RX rX) {
        Vector3f a2;
        RX b2 = rX;
        Vector3f vector3f2 = a2 = vector3f;
        BedrockComponentMotionCollision.J(vector3f2, b2, -BedrockComponentMotionCollision.J(vector3f2, b2));
    }

    public static void J(Vector3d vector3d, RX rX) {
        Vector3d a2;
        RX b2 = rX;
        Vector3d vector3d2 = a2 = vector3d;
        BedrockComponentMotionCollision.J(vector3d2, b2, -BedrockComponentMotionCollision.J(vector3d2, b2));
    }

    public static float J(Vector3f vector3f, RX rX) {
        RX b2 = rX;
        Vector3f a2 = vector3f;
        if (b2 == RX.X) {
            return a2.x;
        }
        if (b2 == RX.Y) {
            return a2.y;
        }
        return a2.z;
    }

    /*
     * WARNING - void declaration
     */
    public void f(vj vj2, nj nj2, RX rX, Vector3d vector3d, Vector3d vector3d2) {
        float f2;
        float f3;
        void c2;
        BedrockComponentMotionCollision e2;
        BedrockComponentMotionCollision f4;
        block8: {
            block7: {
                float f5;
                block5: {
                    block6: {
                        f4 = vj2;
                        e2 = this;
                        BedrockComponentMotionCollision bedrockComponentMotionCollision = f4;
                        f3 = BedrockComponentMotionCollision.J(((vj)bedrockComponentMotionCollision).d, (RX)c2);
                        float f6 = BedrockComponentMotionCollision.J(((vj)bedrockComponentMotionCollision).N, (RX)c2);
                        f5 = BedrockComponentMotionCollision.J(((vj)bedrockComponentMotionCollision).F, (RX)c2);
                        if (!e2.realisticCollision) break block5;
                        if (f3 == (float)(((vj)f4).i - vRa.d)) break block6;
                        if (e2.bounciness == JPa.N) break block7;
                        f2 = f3;
                        BedrockComponentMotionCollision.J(((vj)f4).N, (RX)c2, -f6 * e2.bounciness);
                        break block8;
                    }
                    if (f3 != (float)(((vj)f4).i - vRa.d)) break block7;
                    f2 = f3;
                    BedrockComponentMotionCollision.J(((vj)f4).N, (RX)c2, JPa.N);
                    break block8;
                }
                BedrockComponentMotionCollision.J(((vj)f4).F, (RX)c2, f5 * -e2.bounciness);
            }
            f2 = f3;
        }
        if (f2 != (float)(((vj)f4).i - vRa.d)) {
            if (e2.randomBounciness != JPa.N) {
                ((vj)f4).N = e2.J(((vj)f4).N, (RX)c2, e2.randomBounciness);
            }
            if (e2.splitParticleCount != 0) {
                void a2;
                void b2;
                void d2;
                e2.J((vj)f4, (nj)d2, (RX)c2, (Vector3d)b2, (Vector3d)a2);
            }
            if (e2.damp != JPa.N) {
                ((vj)f4).N = e2.J(((vj)f4).N);
            }
        }
        if (f3 != (float)(((vj)f4).i - vRa.d)) {
            ((vj)f4).h += vRa.d;
        }
        BedrockComponentMotionCollision.J(((vj)f4).d, (RX)c2, ((vj)f4).i);
    }

    /*
     * Unable to fully structure code
     */
    public void J(vj var1_1, nj var2_2, Vector3d var3_3) {
        d = var1_1;
        c = this;
        if (!c.expireOnImpact) ** GOTO lbl13
        var4_4 = c.expirationDelay.J();
        if (var4_4 != aSa.V && !d.I) {
            v0 = d;
            v1 = v0;
            v0.J(var4_4);
        } else {
            if (var4_4 == aSa.V && !d.I) {
                d.f = vRa.d;
                return;
            }
lbl13:
            // 3 sources

            v1 = d;
        }
        if (v1.U) {
            d.U = uSa.E;
            d.s.set((Tuple3d)a);
        }
        v2 = d;
        v2.X = c.rotationCollisionDrag;
        v2.I = vRa.d;
    }

    public BedrockComponentMotionCollision() {
        BedrockComponentMotionCollision a2;
        a2.preserveEnergy = uSa.E;
        a2.collisionDrag = JPa.N;
        a2.bounciness = pqa.r;
        a2.randomBounciness = JPa.N;
        a2.randomDamp = JPa.N;
        a2.damp = JPa.N;
        a2.radius = Jpa.B;
        a2.expirationDelay = Uk.J;
        BedrockComponentMotionCollision bedrockComponentMotionCollision = a2;
        a2.previous = new Vector3d();
        a2.current = new Vector3d();
        a2.pos = new zz();
    }

    public void J(vj vj2) {
        BedrockComponentMotionCollision b2 = vj2;
        BedrockComponentMotionCollision a2 = this;
        if (a2.randomBounciness == JPa.N && !a2.realisticCollision || Math.round(((vj)b2).N.x * Ura.v) != 0 || Math.round(((vj)b2).N.y * Ura.v) != 0 || Math.round(((vj)b2).N.z * Ura.v) != 0) {
            ((vj)b2).k = a2.collisionDrag;
        }
    }

    /*
     * WARNING - void declaration
     */
    public gK J(xy xy2, List<xy> list, double d2, double d3, double d4) {
        double a2;
        double c2;
        double b2;
        xy xy3;
        void d5;
        Iterator iterator;
        BedrockComponentMotionCollision f2 = xy2;
        BedrockComponentMotionCollision e2 = this;
        Iterator iterator2 = iterator = d5.iterator();
        while (iterator2.hasNext()) {
            xy3 = (xy)iterator.next();
            iterator2 = iterator;
            b2 = xy3.J((xy)f2, b2);
        }
        f2 = f2.C(aSa.V, b2, aSa.V);
        iterator = d5.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            xy3 = (xy)iterator.next();
            iterator3 = iterator;
            c2 = xy3.l((xy)f2, c2);
        }
        f2 = f2.C(c2, aSa.V, aSa.V);
        iterator = d5.iterator();
        Iterator iterator4 = iterator;
        while (iterator4.hasNext()) {
            xy3 = (xy)iterator.next();
            iterator4 = iterator;
            a2 = xy3.f((xy)f2, a2);
        }
        f2 = f2.C(aSa.V, aSa.V, a2);
        return new gK(e2, (xy)f2, c2, b2, a2);
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Vector3f vector3f, RX rX, float f2) {
        void b2;
        float c2 = f2;
        Vector3f a2 = vector3f;
        if (b2 == RX.X) {
            a2.x = c2;
            return;
        }
        if (b2 == RX.Y) {
            a2.y = c2;
            return;
        }
        a2.z = c2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, vL vL2) {
        void b2;
        BedrockComponentMotionCollision c2 = vL2;
        BedrockComponentMotionCollision a2 = this;
        void v0 = b2;
        v0.N.x = (float)((double)v0.N.x + KPa.y * (((vL)c2).la - ((vL)c2).c));
        v0.N.y = (float)((double)v0.N.y + KPa.y * (((vL)c2).Z - ((vL)c2).ba));
        v0.N.z = (float)((double)v0.N.z + KPa.y * (((vL)c2).A - ((vL)c2).r));
    }

    /*
     * WARNING - void declaration
     */
    public Vector3d J(Vector3f vector3f, Vector3d vector3d, xy xy2) {
        void b2;
        void a2;
        Vector3f d2 = vector3f;
        BedrockComponentMotionCollision c2 = this;
        void v0 = a2;
        double d3 = (v0.J - b2.x) / (double)d2.x;
        double d4 = (v0.A - b2.x) / (double)d2.x;
        if (d3 > d4) {
            double d5 = d3;
            d3 = d4;
            d4 = d5;
        }
        void v2 = a2;
        double d6 = (v2.j - b2.y) / (double)d2.y;
        double d7 = (v2.M - b2.y) / (double)d2.y;
        if (d6 > d7) {
            double d8 = d6;
            d6 = d7;
            d7 = d8;
        }
        if (d3 > d7 || d6 > d4) {
            return null;
        }
        if (d6 > d3) {
            d3 = d6;
        }
        if (d7 < d4) {
            d4 = d7;
        }
        void v4 = a2;
        d6 = (v4.I - b2.z) / (double)d2.z;
        d7 = (v4.k - b2.z) / (double)d2.z;
        if (d6 > d7) {
            double d9 = d6;
            d6 = d7;
            d7 = d9;
        }
        if (d3 > d7 || d6 > d4) {
            return null;
        }
        if (d7 < d4) {
            d4 = d7;
        }
        Vector3d vector3d2 = new Vector3d(d2);
        vector3d2.scale(d4);
        return vector3d2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, nj nj2, vL vL2, RX rX, Vector3d vector3d) {
        void v5;
        RX f2;
        void e2;
        block5: {
            block4: {
                Vector3f vector3f;
                block3: {
                    void a2;
                    void d2;
                    void c2;
                    BedrockComponentMotionCollision bedrockComponentMotionCollision = rX2;
                    RX rX2 = rX;
                    BedrockComponentMotionCollision b2 = bedrockComponentMotionCollision;
                    vector3f = new Vector3f((float)(c2.la - c2.c), (float)(c2.Z - c2.ba), (float)(c2.A - c2.r));
                    Vector3d vector3d2 = new Vector3d(c2.la, c2.Z, c2.A);
                    if (b2.momentum) {
                        b2.J((vj)e2, (vL)c2);
                    }
                    void v1 = e2;
                    float f3 = BedrockComponentMotionCollision.J(v1.d, f2);
                    double d3 = BedrockComponentMotionCollision.J(v1.z, f2) - BedrockComponentMotionCollision.J(vector3d2, f2);
                    Object object = f2;
                    BedrockComponentMotionCollision.J(v1.z, (RX)object, BedrockComponentMotionCollision.J(e2.z, (RX)object) + (double)(d3 > aSa.V ? b2.radius : -b2.radius));
                    void v3 = e2;
                    b2.f((vj)v3, (nj)d2, f2, e2.z, (Vector3d)a2);
                    BedrockComponentMotionCollision.J(v3.d, f2, f3);
                    if (d3 > aSa.V && f2 == RX.Y) {
                        b2.J((vj)e2, (vL)c2, null);
                    }
                    if (!(BedrockComponentMotionCollision.J(e2.N, f2) > JPa.N)) break block3;
                    if (!(BedrockComponentMotionCollision.J(vector3f, f2) < JPa.N)) break block4;
                    void v4 = e2;
                    v5 = v4;
                    BedrockComponentMotionCollision.J(v4.N, f2);
                    break block5;
                }
                if (BedrockComponentMotionCollision.J(e2.N, f2) < JPa.N && BedrockComponentMotionCollision.J(vector3f, f2) > JPa.N) {
                    BedrockComponentMotionCollision.J(e2.N, f2);
                }
            }
            v5 = e2;
        }
        RX rX3 = f2;
        BedrockComponentMotionCollision.J(v5.z, rX3, BedrockComponentMotionCollision.J(e2.z, rX3) + (double)(BedrockComponentMotionCollision.J(e2.N, f2) / eta.e));
    }

    @Override
    public int J() {
        return vpa.o;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(nj nj2, vj vj2) {
        void b2;
        BedrockComponentMotionCollision c2 = vj2;
        BedrockComponentMotionCollision a2 = this;
        ((vj)c2).M = a2.realisticCollisionDrag;
        Object object = b2.J();
        if (object == null) {
            return;
        }
        BedrockComponentMotionCollision bedrockComponentMotionCollision = a2;
        float f2 = bedrockComponentMotionCollision.radius;
        BedrockComponentMotionCollision bedrockComponentMotionCollision2 = c2;
        bedrockComponentMotionCollision.previous.set(bedrockComponentMotionCollision2.J((nj)b2, ((vj)bedrockComponentMotionCollision2).s));
        bedrockComponentMotionCollision.current.set(c2.J((nj)b2));
        Vector3d vector3d = bedrockComponentMotionCollision.previous;
        Vector3d vector3d2 = bedrockComponentMotionCollision.current;
        double d2 = vector3d2.x - vector3d.x;
        double d3 = vector3d2.y - vector3d.y;
        double d4 = vector3d2.z - vector3d.z;
        int n2 = Math.abs(d2) > Wqa.m || Math.abs(d3) > Wqa.m || Math.abs(d4) > Wqa.m ? vRa.d : uSa.E;
        a2.pos.func_181079_c(Oz.f((double)vector3d2.x), Oz.f((double)vector3d2.y), Oz.f((double)vector3d2.z));
        if (n2 != 0 || !object.F((XF)a2.pos)) {
            return;
        }
        xy xy2 = new xy(vector3d.x - (double)f2, vector3d.y - (double)f2, vector3d.z - (double)f2, vector3d.x + (double)f2, vector3d.y + (double)f2, vector3d.z + (double)f2);
        double d5 = d3;
        double d6 = d2;
        double d7 = d4;
        Gg gg2 = object;
        object = gg2.J(vL.class, xy2.f(d2, d3, d4));
        HashMap<Object, xy> hashMap = new HashMap<Object, xy>();
        HashMap<Object, gK> hashMap2 = new HashMap<Object, gK>();
        List list = gg2.J(xy2.f(d2, d3, d4));
        if ((!list.isEmpty() || !object.isEmpty() && a2.entityCollision) && !((vj)c2).T) {
            ((vj)c2).A = ((vj)c2).i;
            ((vj)c2).T = vRa.d;
        }
        if (!((vj)c2).b && !yk.equals((double)a2.enabled.J(), (double)aSa.V)) {
            HashMap<Object, xy> hashMap3;
            Vector3f vector3f;
            xy xy3;
            Object object3;
            gK gK2;
            if (a2.entityCollision) {
                gK2 = object.iterator();
                while (gK2.hasNext()) {
                    object3 = (vL)gK2.next();
                    xy xy4 = new xy(vector3d.x - (double)f2, vector3d.y - (double)f2, vector3d.z - (double)f2, vector3d.x + (double)f2, vector3d.y + (double)f2, vector3d.z + (double)f2);
                    xy3 = object3.J();
                    double d8 = d3;
                    double d9 = d2;
                    double d10 = d4;
                    xy xy5 = xy3;
                    d8 = xy5.J(xy4, d8);
                    xy xy6 = xy4.C(aSa.V, d8, aSa.V);
                    d9 = xy5.l(xy6, d9);
                    xy xy7 = xy6.C(d9, aSa.V, aSa.V);
                    d10 = xy5.f(xy7, d10);
                    xy object22 = xy7.C(aSa.V, aSa.V, d10);
                    if (d5 == d8 && d6 == d9 && d7 == d10) {
                        hashMap.put(object3, xy3);
                        continue;
                    }
                    list.add(xy3);
                    hashMap2.put(object3, new gK(a2, xy3, d9, d8, d10));
                    if (!a2.momentum || d5 != d8) continue;
                    a2.J((vj)c2, (vL)object3);
                }
            }
            gK2 = a2.J(xy2, list, d2, d3, d4);
            xy2 = gK2.I;
            d2 = gK2.A;
            d3 = gK2.k;
            d4 = gK2.j;
            if (d5 != d3 || d6 != d2 || d7 != d4) {
                a2.J((vj)c2, (nj)b2, vector3d);
                vector3d2.set(xy2.J + (double)f2, xy2.j + (double)f2, xy2.I + (double)f2);
                if (d5 != d3) {
                    Vector3d vector3d3;
                    Vector3d vector3d4 = vector3d2;
                    if (d5 < d3) {
                        vector3d4.y = xy2.j;
                        vector3d3 = vector3d2;
                    } else {
                        vector3d4.y = xy2.M;
                        vector3d3 = vector3d2;
                    }
                    float f3 = f2;
                    vector3d3.y = vector3d3.y + (d5 < d3 ? (double)f3 : (double)(-f3));
                    BedrockComponentMotionCollision bedrockComponentMotionCollision3 = c2;
                    a2.f((vj)bedrockComponentMotionCollision3, (nj)b2, RX.Y, vector3d2, vector3d);
                    ((vj)bedrockComponentMotionCollision3).p.keySet().retainAll(hashMap2.keySet());
                    object3 = hashMap2.entrySet().iterator();
                    while (object3.hasNext()) {
                        Map.Entry entry = (Map.Entry)object3.next();
                        xy3 = (gK)entry.getValue();
                        xy xy8 = xy3.I;
                        vector3f = (vL)entry.getKey();
                        if (d5 != xy3.k && d6 == xy3.A && d7 == xy3.j) {
                            a2.J((vj)c2, (vL)vector3f, vector3d2);
                        }
                        if (((vj)c2).p.containsKey(vector3f)) {
                            ((Vector3f)((vj)c2).p.get((Object)vector3f)).y = ((vj)c2).i;
                            continue;
                        }
                        ((vj)c2).p.put(entry.getKey(), new Vector3f(vqa.T, ((vj)c2).i, vqa.T));
                    }
                }
                if (d6 != d2) {
                    Vector3d vector3d5;
                    Vector3d vector3d6 = vector3d2;
                    if (d6 < d2) {
                        vector3d6.x = xy2.J;
                        vector3d5 = vector3d2;
                    } else {
                        vector3d6.x = xy2.A;
                        vector3d5 = vector3d2;
                    }
                    float f4 = f2;
                    vector3d5.x = vector3d5.x + (d6 < d2 ? (double)f4 : (double)(-f4));
                    a2.f((vj)c2, (nj)b2, RX.X, vector3d2, vector3d);
                }
                if (d7 != d4) {
                    Vector3d vector3d7;
                    Vector3d vector3d8 = vector3d2;
                    if (d7 < d4) {
                        vector3d8.z = xy2.I;
                        vector3d7 = vector3d2;
                    } else {
                        vector3d8.z = xy2.k;
                        vector3d7 = vector3d2;
                    }
                    float f5 = f2;
                    vector3d7.z = vector3d7.z + (d7 < d4 ? (double)f5 : (double)(-f5));
                    a2.f((vj)c2, (nj)b2, RX.Z, vector3d2, vector3d);
                }
                ((vj)c2).z.set(vector3d2);
                hashMap3 = hashMap;
                a2.J((vj)c2);
            } else if (hashMap.isEmpty() && a2.realisticCollisionDrag) {
                hashMap3 = hashMap;
                ((vj)c2).k = JPa.N;
            } else {
                ((vj)c2).X = JPa.N;
                hashMap3 = hashMap;
            }
            for (Map.Entry entry : hashMap3.entrySet()) {
                xy xy9;
                Vector3f vector3f2;
                Vector3d vector3d9;
                xy3 = (xy)entry.getValue();
                vL vL2 = (vL)entry.getKey();
                vector3f = new Vector3f((float)(vL2.la - vL2.c), (float)(vL2.Z - vL2.ba), (float)(vL2.A - vL2.r));
                if (vector3f.x == JPa.N && vector3f.y == JPa.N && vector3f.z == JPa.N || (vector3d9 = a2.J(vector3f2 = vector3f, c2.J((nj)b2), xy3)) == null) continue;
                ((vj)c2).z.add(vector3d9);
                xy xy10 = new xy(((vj)c2).z.x - (double)f2, ((vj)c2).z.y - (double)f2, ((vj)c2).z.z - (double)f2, ((vj)c2).z.x + (double)f2, ((vj)c2).z.y + (double)f2, ((vj)c2).z.z + (double)f2);
                a2.J((vj)c2, (nj)b2, vector3d);
                if (xy9.J < xy3.A && xy10.A > xy3.A || xy10.A > xy3.J && xy10.J < xy3.J) {
                    a2.J((vj)c2, (nj)b2, vL2, RX.X, vector3d);
                }
                if (xy10.j < xy3.M && xy10.M > xy3.M || xy10.M > xy3.j && xy10.j < xy3.j) {
                    a2.J((vj)c2, (nj)b2, vL2, RX.Y, vector3d);
                }
                if (!(xy10.I < xy3.k && xy10.k > xy3.k) && (!(xy10.k > xy3.I) || !(xy10.I < xy3.I))) continue;
                a2.J((vj)c2, (nj)b2, vL2, RX.Z, vector3d);
            }
            if (!hashMap.isEmpty()) {
                a2.J((vj)c2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, vL vL2, Vector3d vector3d) {
        void v1;
        void c2;
        BedrockComponentMotionCollision d2 = vL2;
        BedrockComponentMotionCollision b2 = this;
        if (b2.collisionDrag == JPa.N) {
            return;
        }
        Vector3d vector3d2 = new Vector3d(((vL)d2).la - ((vL)d2).c, ((vL)d2).Z - ((vL)d2).ba, ((vL)d2).A - ((vL)d2).r);
        BedrockComponentMotionCollision bedrockComponentMotionCollision = d2;
        double d3 = ((vL)bedrockComponentMotionCollision).c;
        double d4 = ((vL)bedrockComponentMotionCollision).ba;
        double d5 = ((vL)bedrockComponentMotionCollision).r;
        Vector3d vector3d3 = new Vector3d(((vL)d2).c - d3, ((vL)d2).ba - d4, ((vL)d2).r - d5);
        if (!c2.p.containsKey(d2)) {
            v1 = c2;
            vector3d3.scale(aSa.V);
        } else {
            void a2;
            void v2 = c2;
            v2.D.x = vector3d2.x;
            v2.D.z = vector3d2.z;
            if (a2 == null) {
                void v3 = c2;
                v1 = v3;
                v3.z.x += vector3d2.x;
                v3.z.z += vector3d2.z;
            } else {
                void v4 = a2;
                v4.x += vector3d2.x;
                v4.z += vector3d2.z;
                v1 = c2;
            }
        }
        v1.N.x = (float)((double)v1.N.x + (double)Math.round((vector3d3.x - vector3d2.x) * Tpa.M) / Lra.ja);
        void v5 = c2;
        v5.N.y = (float)((double)v5.N.y + (double)Math.round((vector3d3.y - vector3d2.y) * Tpa.M) / Lra.ja);
        v5.N.z = (float)((double)v5.N.z + (double)Math.round((vector3d3.z - vector3d2.z) * Tpa.M) / Lra.ja);
    }

    public static double J(Vector3d vector3d, RX rX) {
        RX b2 = rX;
        Vector3d a2 = vector3d;
        if (b2 == RX.X) {
            return a2.x;
        }
        if (b2 == RX.Y) {
            return a2.y;
        }
        return a2.z;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, nj nj2, RX rX, Vector3d vector3d, Vector3d vector3d2) {
        int n2;
        void c2;
        void e2;
        BedrockComponentMotionCollision bedrockComponentMotionCollision = this;
        if (!(Math.abs(BedrockComponentMotionCollision.J(e2.N, (RX)c2)) > Math.abs(bedrockComponentMotionCollision.splitParticleSpeedThreshold))) {
            return;
        }
        int n3 = n2 = uSa.E;
        while (n3 < bedrockComponentMotionCollision.splitParticleCount) {
            void a2;
            void b2;
            void d2;
            BedrockComponentMotionCollision f2 = d2.J(uSa.E != 0);
            e2.J((vj)f2);
            BedrockComponentMotionCollision bedrockComponentMotionCollision2 = f2;
            ((vj)bedrockComponentMotionCollision2).z.set((Tuple3d)b2);
            ((vj)bedrockComponentMotionCollision2).s.set((Tuple3d)a2);
            ((vj)bedrockComponentMotionCollision2).h = vRa.d;
            double d3 = BedrockComponentMotionCollision.J(((vj)bedrockComponentMotionCollision2).z, (RX)c2);
            BedrockComponentMotionCollision.J(((vj)bedrockComponentMotionCollision2).d, (RX)c2, e2.i);
            BedrockComponentMotionCollision.J(((vj)bedrockComponentMotionCollision2).z, (RX)c2, d3);
            BedrockComponentMotionCollision bedrockComponentMotionCollision3 = bedrockComponentMotionCollision;
            Vector3f vector3f = bedrockComponentMotionCollision3.J(e2.N, (RX)c2, bedrockComponentMotionCollision3.randomBounciness != JPa.N ? bedrockComponentMotionCollision.randomBounciness : FRa.Ga);
            vector3f.scale(pqa.r / (float)bedrockComponentMotionCollision.splitParticleCount);
            ((vj)f2).N.set(vector3f);
            if (bedrockComponentMotionCollision.damp != JPa.N) {
                ((vj)f2).N = bedrockComponentMotionCollision.J(((vj)f2).N);
            }
            d2.L.add(f2);
            n3 = ++n2;
        }
        e2.f = vRa.d;
    }

    public JsonElement J() {
        BedrockComponentMotionCollision bedrockComponentMotionCollision = this;
        JsonObject a2 = new JsonObject();
        if (!Ak.l((Ak)bedrockComponentMotionCollision.enabled)) {
            a2.add(Uta.p, bedrockComponentMotionCollision.enabled.J());
        }
        if (bedrockComponentMotionCollision.realisticCollision) {
            a2.addProperty(iPa.F, vRa.d != 0);
        }
        if (bedrockComponentMotionCollision.entityCollision) {
            a2.addProperty(aua.Ia, vRa.d != 0);
        }
        if (bedrockComponentMotionCollision.momentum) {
            a2.addProperty(uRa.fa, vRa.d != 0);
        }
        if (bedrockComponentMotionCollision.realisticCollisionDrag) {
            a2.addProperty(QTa.W, vRa.d != 0);
        }
        if (bedrockComponentMotionCollision.collisionDrag != JPa.N) {
            a2.addProperty(wOa.V, Float.valueOf(bedrockComponentMotionCollision.collisionDrag));
        }
        if (bedrockComponentMotionCollision.bounciness != pqa.r) {
            a2.addProperty(sqa.W, Float.valueOf(bedrockComponentMotionCollision.bounciness));
        }
        if (bedrockComponentMotionCollision.rotationCollisionDrag != JPa.N) {
            a2.addProperty(Era.P, Float.valueOf(bedrockComponentMotionCollision.rotationCollisionDrag));
        }
        if (bedrockComponentMotionCollision.randomBounciness != JPa.N) {
            a2.addProperty(ATa.Ga, Float.valueOf(bedrockComponentMotionCollision.randomBounciness));
        }
        if (bedrockComponentMotionCollision.preserveEnergy) {
            a2.addProperty(gsa.ga, bedrockComponentMotionCollision.preserveEnergy);
        }
        if (bedrockComponentMotionCollision.damp != JPa.N) {
            a2.addProperty(zTa.z, Float.valueOf(bedrockComponentMotionCollision.damp));
        }
        if (bedrockComponentMotionCollision.randomDamp != JPa.N) {
            a2.addProperty(fPa.f, Float.valueOf(bedrockComponentMotionCollision.randomDamp));
        }
        if (bedrockComponentMotionCollision.splitParticleCount != 0) {
            a2.addProperty(Hra.v, bedrockComponentMotionCollision.splitParticleCount);
        }
        if (bedrockComponentMotionCollision.splitParticleSpeedThreshold != JPa.N) {
            a2.addProperty(pta.m, Float.valueOf(bedrockComponentMotionCollision.splitParticleSpeedThreshold));
        }
        if (bedrockComponentMotionCollision.radius != Jpa.B) {
            a2.addProperty(bsa.H, Float.valueOf(bedrockComponentMotionCollision.radius));
        }
        if (bedrockComponentMotionCollision.expireOnImpact) {
            a2.addProperty(fPa.Ha, vRa.d != 0);
        }
        if (!Ak.J((Ak)bedrockComponentMotionCollision.expirationDelay)) {
            a2.add(lqa.t, bedrockComponentMotionCollision.expirationDelay.J());
        }
        return a2;
    }

    /*
     * Unable to fully structure code
     */
    public tJ J(JsonElement var1_1, Uk var2_2) throws Ql {
        c = var1_1;
        b = this;
        if (!c.isJsonObject()) {
            return super.J((JsonElement)c, (Uk)a);
        }
        if ((c = c.getAsJsonObject()).has(Uta.p)) {
            b.enabled = a.f(c.get(Uta.p));
        }
        if (c.has(aua.Ia)) {
            b.entityCollision = c.get(aua.Ia).getAsBoolean();
        }
        if (c.has(uRa.fa)) {
            b.momentum = c.get(uRa.fa).getAsBoolean();
        }
        if (c.has(QTa.W)) {
            b.realisticCollisionDrag = c.get(QTa.W).getAsBoolean();
        }
        if (c.has(wOa.V)) {
            b.collisionDrag = c.get(wOa.V).getAsFloat();
        }
        if (c.has(sqa.W)) {
            b.bounciness = c.get(sqa.W).getAsFloat();
        }
        if (c.has(ATa.Ga)) {
            b.randomBounciness = c.get(ATa.Ga).getAsFloat();
        }
        if (c.has(Era.P)) {
            b.rotationCollisionDrag = c.get(Era.P).getAsFloat();
        }
        if (!c.has(gsa.ga) || !c.get(gsa.ga).isJsonPrimitive()) ** GOTO lbl28
        var3_3 = c.get(gsa.ga).getAsJsonPrimitive();
        if (var3_3.isBoolean()) {
            v0 = c;
            b.preserveEnergy = var3_3.getAsBoolean();
        } else {
            b.preserveEnergy = Ak.l((Ak)a.f((JsonElement)var3_3));
lbl28:
            // 2 sources

            v0 = c;
        }
        if (v0.has(zTa.z)) {
            b.damp = c.get(zTa.z).getAsFloat();
        }
        if (c.has(fPa.f)) {
            b.randomDamp = c.get(fPa.f).getAsFloat();
        }
        if (c.has(Hra.v)) {
            b.splitParticleCount = c.get(Hra.v).getAsInt();
        }
        if (c.has(pta.m)) {
            b.splitParticleSpeedThreshold = c.get(pta.m).getAsFloat();
        }
        if (c.has(bsa.H)) {
            b.radius = c.get(bsa.H).getAsFloat();
        }
        if (c.has(fPa.Ha)) {
            b.expireOnImpact = c.get(fPa.Ha).getAsBoolean();
        }
        if (c.has(lqa.t)) {
            b.expirationDelay = a.f(c.get(lqa.t));
        }
        if (c.has(iPa.F)) {
            b.realisticCollision = c.get(iPa.F).getAsBoolean();
        }
        return super.J((JsonElement)c, (Uk)a);
    }

    /*
     * WARNING - void declaration
     */
    public Vector3f J(Vector3f vector3f) {
        void a2;
        BedrockComponentMotionCollision bedrockComponentMotionCollision = this;
        float b2 = (float)((double)bedrockComponentMotionCollision.randomDamp * (Math.random() * KPa.y - oua.i));
        b2 = Oz.J((float)(pqa.r - bedrockComponentMotionCollision.damp + b2), (float)JPa.N, (float)pqa.r);
        a2.scale(b2);
        return a2;
    }
}

