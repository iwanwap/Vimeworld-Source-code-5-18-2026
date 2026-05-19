/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Gg
 *  Gl
 *  JPa
 *  Kpa
 *  MQa
 *  Oz
 *  aSa
 *  jc
 *  lPa
 *  nj
 *  pqa
 *  pua
 *  vL
 *  vQa
 *  vRa
 *  vj
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.vecmath.Matrix3f;
import javax.vecmath.SingularMatrixException;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentCollisionAppearance;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentCollisionTinting;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vj_1 {
    public float Y;
    public boolean r;
    public float V;
    public Vector3d z;
    public float X;
    public float y;
    public boolean U;
    public Vector3d P;
    public Vector3f u;
    public float O;
    public int t;
    public float R;
    public float Q;
    public Vector3f N;
    public boolean T;
    public HashMap<vL, Vector3f> p;
    public float n;
    public Vector3d s;
    private Gk w;
    private int W;
    public boolean q;
    public float x;
    private boolean v;
    public boolean o;
    public int h;
    public boolean K;
    public float H;
    public float c;
    public float B;
    public Vector3f d;
    public float a;
    public boolean b;
    public float l;
    public float e;
    public float G;
    public Vector3d D;
    public boolean f;
    public Vector3f F;
    public float g;
    public boolean L;
    private int E;
    private Vector3d m;
    public Matrix3f C;
    public int i;
    public boolean M;
    public float k;
    public float j;
    public boolean J;
    public int A;
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public void f(nj nj2) {
        vj_1 vj_12;
        block20: {
            block21: {
                void a2;
                vj_1 vj_13 = vj_12 = this;
                vj_12.Y = vj_12.c;
                vj_13.s.set(vj_12.z);
                vj_13.J((nj)a2);
                if (!vj_13.b) {
                    vj_1 vj_14;
                    vj_1 vj_15;
                    block19: {
                        vj_1 vj_16;
                        if (vj_12.p.isEmpty()) {
                            vj_1 vj_17 = vj_12;
                            vj_16 = vj_17;
                            vj_17.J();
                        } else {
                            for (Map.Entry entry : vj_12.p.entrySet()) {
                                if (((Vector3f)entry.getValue()).y == (float)vj_12.i) continue;
                                vj_12.J();
                            }
                            vj_16 = vj_12;
                        }
                        float b222 = (vj_16.B + vj_12.X) * vj_12.Q;
                        vj_1 vj_18 = vj_12;
                        float f2 = vj_18.x / eta.e;
                        vj_12.Q = Oz.J((float)(vj_18.Q - b222 / eta.e), (float)Math.min(vj_12.Q, JPa.N), (float)Math.max(vj_12.Q, JPa.N));
                        vj_18.Q += f2 / eta.e;
                        vj_18.c += vj_12.Q;
                        if (vj_18.i == 0) {
                            if (vj_12.q) {
                                a2.S.transform(vj_12.N);
                            }
                            if (vj_12.l != JPa.N) {
                                Vector3f vector3f = b222 = new Vector3f(a2.a);
                                vector3f.x = (float)((double)vector3f.x - a2.m.x);
                                vector3f.y = (float)((double)vector3f.y - a2.m.y);
                                vector3f.z = (float)((double)vector3f.z - a2.m.z);
                                vj_1 vj_19 = vj_12;
                                vj_19.N.x += b222.x * vj_12.l;
                                vj_12.N.y += b222.y * vj_12.l;
                                vj_19.N.z += b222.z * vj_12.l;
                            }
                            if (vj_12.V != JPa.N) {
                                Matrix3f b222 = new Matrix3f(a2.S);
                                Matrix3f matrix3f = new Matrix3f();
                                matrix3f.setIdentity();
                                try {
                                    Matrix3f matrix3f2 = new Matrix3f(a2.t);
                                    Matrix3f matrix3f3 = b222;
                                    matrix3f2.invert();
                                    matrix3f3.mul(matrix3f2);
                                    Vector3f vector3f = jc.J((Matrix3f)matrix3f3);
                                    Vector3f vector3f2 = new Vector3f(a2.r);
                                    vector3f2.x = (float)((double)vector3f2.x + (vj_12.z.x - a2.a.x));
                                    vector3f2.y = (float)((double)vector3f2.y + (vj_12.z.y - a2.a.y));
                                    vector3f2.z = (float)((double)vector3f2.z + (vj_12.z.z - a2.a.z));
                                    Vector3f vector3f3 = new Vector3f();
                                    vector3f3.cross(vector3f, vector3f2);
                                    vj_1 vj_110 = vj_12;
                                    vj_110.N.x += vector3f3.x * vj_12.V;
                                    vj_12.N.y += vector3f3.y * vj_12.V;
                                    vj_110.N.z += vector3f3.z * vj_12.V;
                                    vj_15 = vj_12;
                                    break block19;
                                }
                                catch (SingularMatrixException singularMatrixException) {
                                    // empty catch block
                                }
                            }
                        }
                        vj_15 = vj_12;
                    }
                    if (vj_15.r) {
                        a2.S.transform(vj_12.u);
                    }
                    if (vj_12.L) {
                        vj_12.u.y = (float)((double)vj_12.u.y - Jta.P);
                    }
                    Vector3f b222 = new Vector3f(vj_12.N);
                    vj_1 vj_111 = vj_12;
                    b222.scale(-(vj_111.n + vj_12.k));
                    b222.scale(Yqa.C);
                    vj_1 vj_112 = vj_12;
                    if (vj_111.N.length() - b222.length() <= JPa.N) {
                        vj_112.N.scale(JPa.N);
                        vj_14 = vj_12;
                    } else {
                        vj_112.N.add(b222);
                        vj_14 = vj_12;
                    }
                    vj_14.u.scale(Yqa.C);
                    vj_1 vj_113 = vj_12;
                    vj_113.N.add(vj_113.u);
                    vj_1 vj_114 = vj_12;
                    Vector3f vector3f = new Vector3f(vj_114.N);
                    vector3f.x *= vj_12.F.x;
                    vector3f.y *= vj_12.F.y;
                    vector3f.z *= vj_12.F.z;
                    if (vj_114.U || vj_12.K) {
                        vj_12.C.transform(vector3f);
                    }
                    vj_1 vj_115 = vj_12;
                    vj_115.z.x += (double)(vector3f.x / eta.e);
                    vj_115.z.y += (double)(vector3f.y / eta.e);
                    vj_115.z.z += (double)(vector3f.z / eta.e);
                }
                if (vj_12.t < 0) break block20;
                vj_1 vj_116 = vj_12;
                if (vj_116.i >= vj_116.t) break block21;
                vj_1 vj_117 = vj_12;
                if (vj_117.i < vj_117.E || vj_12.E == pua.o) break block20;
            }
            vj_12.f = vRa.d;
        }
        vj_1 vj_118 = vj_12;
        vj_118.i += vRa.d;
        vj_118.u.set(JPa.N, JPa.N, JPa.N);
    }

    public Vector3d J(nj nj2) {
        vj_1 a2;
        vj_1 b2 = nj2;
        vj_1 vj_12 = a2 = this;
        return vj_12.J((nj)b2, vj_12.z);
    }

    public vj J(vj vj2) {
        Iterator<Map.Entry<vL, Vector3f>> iterator;
        vj_1 a2;
        vj_1 b2 = vj2;
        vj_1 vj_12 = a2 = this;
        vj_1 vj_13 = b2;
        vj_1 vj_14 = a2;
        b2.i = a2.i;
        b2.E = vj_14.E;
        vj_13.W = vj_14.W;
        vj_13.M = vj_12.M;
        vj_1 vj_15 = b2;
        b2.d = new Vector3f(a2.d);
        vj_15.p = new HashMap();
        Iterator<Map.Entry<vL, Vector3f>> iterator2 = iterator = vj_12.p.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<vL, Vector3f> entry = iterator.next();
            b2.p.put(entry.getKey(), new Vector3f(entry.getValue()));
            iterator2 = iterator;
        }
        vj_1 vj_16 = b2;
        vj_1 vj_17 = b2;
        vj_1 vj_18 = b2;
        vj_1 vj_19 = b2;
        vj_1 vj_110 = b2;
        vj_110.h = a2.h;
        vj_19.A = a2.A;
        vj_110.D = new Vector3d(a2.D);
        vj_19.z = new Vector3d(a2.z);
        vj_19.P = new Vector3d(a2.P);
        vj_19.s = new Vector3d(a2.s);
        vj_18.C = new Matrix3f(a2.C);
        vj_17.v = a2.v;
        vj_18.N = new Vector3f(a2.N);
        vj_17.u = new Vector3f(a2.u);
        vj_16.F = new Vector3f(a2.F);
        b2.k = a2.k;
        vj_16.m = new Vector3d(a2.m);
        return b2;
    }

    public Gl J(nj nj2) {
        Object b2 = nj2;
        vj_1 a2 = this;
        if (a2.w == null) {
            vj_1 vj_12 = a2;
            vj_12.w = new Gk((Gg)Kpa.J().Ta);
        }
        vj_1 vj_13 = a2;
        b2 = vj_13.J((nj)b2);
        vj_13.w.l(((Vector3d)b2).x, ((Vector3d)b2).y, ((Vector3d)b2).z);
        vj_13.w.c = a2.w.la;
        vj_13.w.ba = a2.w.Z;
        vj_13.w.r = (double)a2.w.A;
        vj_13.w.V = a2.w.la;
        vj_13.w.Ga = a2.w.Z;
        vj_13.w.Ca = (double)a2.w.A;
        vj_13.w.X = a2.w.s = JPa.N;
        vj_1 vj_14 = a2;
        vj_14.w.d = vj_14.w.o = JPa.N;
        vj_1 vj_15 = a2;
        vj_15.w.t = vj_15.w.ga = JPa.N;
        vj_1 vj_16 = a2;
        vj_16.w.ba = vj_16.w.Ma = JPa.N;
        return a2.w;
    }

    public double J(float f2) {
        float b2 = f2;
        vj_1 a2 = this;
        return (double)((float)a2.i + b2) / vQa.c;
    }

    public vj_1() {
        vj_1 a2;
        vj_1 vj_12 = a2;
        vj_12.j = (float)Math.random();
        vj_12.g = (float)Math.random();
        vj_12.O = (float)Math.random();
        vj_12.e = (float)Math.random();
        vj_12.E = pua.o;
        vj_12.W = pua.o;
        vj_1 vj_13 = a2;
        vj_12.d = new Vector3f(dua.ca, dua.ca, dua.ca);
        vj_12.p = new HashMap();
        vj_12.X = JPa.N;
        vj_12.A = pua.o;
        vj_12.D = new Vector3d();
        vj_12.z = new Vector3d();
        vj_12.P = new Vector3d();
        vj_12.s = new Vector3d();
        vj_12.C = new Matrix3f();
        vj_12.N = new Vector3f();
        vj_12.u = new Vector3f();
        vj_12.F = new Vector3f(pqa.r, pqa.r, pqa.r);
        vj_12.n = JPa.N;
        vj_12.k = JPa.N;
        vj_12.R = pqa.r;
        vj_12.a = pqa.r;
        vj_12.H = pqa.r;
        vj_12.y = pqa.r;
        vj_12.m = new Vector3d();
        vj_12.N.set((float)Math.random() - MQa.L, (float)Math.random() - MQa.L, (float)Math.random() - MQa.L);
        vj_12.N.normalize();
        vj_12.C.setIdentity();
    }

    public int f() {
        vj_1 a2;
        return a2.E;
    }

    public boolean f(nj nj2) {
        vj_1 b2 = nj2;
        vj_1 a2 = this;
        if (Ak.l((Ak)((nj)b2).p.l(BedrockComponentCollisionTinting.class).enabled) && a2.T) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int J() {
        vj_1 a2;
        return a2.W;
    }

    public boolean J(nj nj2) {
        vj_1 b2 = nj2;
        vj_1 a2 = this;
        if (Ak.l((Ak)((nj)b2).p.l(BedrockComponentCollisionAppearance.class).enabled) && a2.T) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        vj_1 a2;
        vj_1 vj_12 = a2;
        vj_12.D.scale(lPa.K);
        vj_12.N.x = (float)((double)vj_12.N.x + a2.D.x);
        vj_12.N.y = (float)((double)vj_12.N.y + a2.D.y);
        vj_12.N.z = (float)((double)vj_12.N.z + a2.D.z);
        vj_12.D.scale(aSa.V);
    }

    public void J(double a22) {
        vj_1 b2;
        int a22 = (int)a22;
        if (b2.i + a22 < b2.E || b2.E == pua.o) {
            b2.W = Math.abs(a22);
            b2.E = b2.i + b2.W;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Vector3d J(nj nj2, Vector3d vector3d) {
        Object c2 = vector3d;
        vj_1 a2 = this;
        Object object = c2;
        double d2 = ((Vector3d)object).x;
        double d3 = ((Vector3d)object).y;
        double d4 = ((Vector3d)object).z;
        if (a2.U && a2.K) {
            void b2;
            Object object2 = c2 = new Vector3f((float)d2, (float)d3, (float)d4);
            b2.S.transform((Tuple3f)object2);
            d2 = ((Vector3f)c2).x;
            d3 = ((Vector3f)object2).y;
            d4 = ((Vector3f)object2).z;
            d2 += b2.a.x;
            d3 += b2.a.y;
            d4 += b2.a.z;
        }
        vj_1 vj_12 = a2;
        vj_12.m.set(d2, d3, d4);
        return vj_12.m;
    }

    /*
     * WARNING - void declaration
     */
    public double J(nj nj2) {
        void a2;
        vj_1 vj_12 = this;
        Vector3d b2 = vj_12.J((nj)a2);
        void v0 = a2;
        double d2 = v0.b - b2.x;
        double d3 = v0.Q - b2.y;
        double d4 = v0.X - b2.z;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public void J(nj nj2) {
        vj_1 b2 = nj2;
        vj_1 a2 = this;
        if (a2.U) {
            if (a2.K) {
                a2.C.setIdentity();
                return;
            }
            if (!a2.v) {
                a2.C.set(((nj)b2).S);
                a2.v = vRa.d;
                return;
            }
        } else if (a2.K) {
            a2.C.set(((nj)b2).S);
        }
    }
}

