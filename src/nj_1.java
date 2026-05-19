/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Gl
 *  ISa
 *  JPa
 *  Kpa
 *  Oz
 *  RPa
 *  UG
 *  WK
 *  XTa
 *  YSa
 *  Ypa
 *  Zpa
 *  aKa
 *  aSa
 *  jpa
 *  kqa
 *  mka
 *  nQa
 *  nj
 *  pKa
 *  pj
 *  pqa
 *  pua
 *  uKa
 *  ui
 *  vL
 *  vQa
 *  vRa
 *  vj
 *  wPa
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix3f;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterInitialize;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentEmitterUpdate;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleMorphRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleRender;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentParticleUpdate;
import net.xtrafrancyz.mods.texteria.snowstorm.components.IComponentRenderBase;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentAppearanceBillboard;
import net.xtrafrancyz.mods.texteria.snowstorm.components.appearance.BedrockComponentCollisionAppearance;
import net.xtrafrancyz.mods.texteria.snowstorm.components.meta.BedrockComponentInitialization;
import net.xtrafrancyz.mods.texteria.snowstorm.components.rate.BedrockComponentRateSteady;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nj_1 {
    public double fa;
    public Vector3f Ka;
    public boolean Aa;
    public Matrix3f S;
    public boolean Z;
    private vj Y;
    public Vector3d r;
    private WK V;
    private WK z;
    public double X;
    private WK y;
    public float U;
    private WK P;
    public float u;
    private WK O;
    public Matrix3f t;
    private WK R;
    public double Q;
    private WK N;
    private WK T;
    public JJ p;
    private WK n;
    private WK s;
    public double[] w;
    private WK W;
    private WK q;
    private zz x;
    public float v;
    private WK o;
    public boolean h;
    private WK K;
    public float H;
    private WK c;
    public Map<String, t> B;
    public Map<String, Double> d;
    public Vector3d a;
    public double b;
    private WK l;
    public float e;
    private WK G;
    private WK D;
    public PG f;
    public int F;
    public int g;
    public List<vj> L;
    public int E;
    public Vector3d m;
    public float C;
    public int i;
    private WK M;
    private WK k;
    public List<vj> j;
    public int J;
    private WK A;
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public void J(JJ jJ2, Map<String, String> map) {
        void b2;
        Map<String, String> c2 = map;
        nj_1 a2 = this;
        a2.p = b2;
        if (a2.p == null) {
            return;
        }
        if (c2 != null) {
            a2.J(c2);
        }
        nj_1 nj_12 = a2;
        nj_12.I = vRa.d;
        nj_12.d();
        nj_12.i();
        nj_12.e();
        nj_12.J(JPa.N);
    }

    private void A() {
        nj_1 nj_12 = this;
        Iterator<vj> a2 = nj_12.j.iterator();
        while (a2.hasNext()) {
            vj vj2;
            vj vj3 = vj2 = (vj)a2.next();
            nj_12.J(vj3);
            if (!vj3.f) continue;
            a2.remove();
        }
        if (!nj_12.L.isEmpty()) {
            nj_1 nj_13 = nj_12;
            nj_13.j.addAll(nj_13.L);
            nj_12.L.clear();
        }
    }

    public void J(Map<String, String> map) {
        nj_1 a2;
        Iterator b2 = map;
        nj_1 nj_12 = a2 = this;
        nj_12.B = new HashMap<String, t>();
        Iterator iterator = b2 = b2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = b2.next();
            a2.J((String)entry.getKey(), (String)entry.getValue());
            iterator = b2;
        }
    }

    public double J(float f2) {
        float b2 = f2;
        nj_1 a2 = this;
        return (double)((float)a2.F + b2) / vQa.c;
    }

    public void i() {
        Object a2;
        nj_1 nj_12 = this;
        if (nj_12.Aa) {
            return;
        }
        nj_12.F = uSa.E;
        nj_12.fa = aSa.V;
        nj_12.Aa = vRa.d;
        Object object = a2 = nj_12.p.emitterInitializes.iterator();
        while (object.hasNext()) {
            ((IComponentEmitterInitialize)a2.next()).f((nj)nj_12);
            object = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void C(float f2) {
        nj_1 nj_12 = this;
        if (nj_12.J() != null) {
            void a2;
            nj_1 b2 = Kpa.J().J();
            nj_1 nj_13 = nj_12;
            nj_1 nj_14 = b2;
            nj_1 nj_15 = nj_12;
            nj_15.i = Kpa.J().z.ld;
            nj_1 nj_16 = b2;
            nj_15.e = Hra.Ga - pj.C((float)((vL)nj_16).s, (float)((vL)nj_16).X, (float)a2);
            nj_1 nj_17 = b2;
            nj_15.C = Hra.Ga - pj.C((float)((vL)nj_17).o, (float)((vL)nj_17).d, (float)a2);
            nj_12.b = pj.J((double)((vL)nj_14).c, (double)((vL)b2).la, (double)((double)a2));
            nj_13.Q = pj.J((double)((vL)nj_14).ba, (double)((vL)b2).Z, (double)((double)a2)) + (double)b2.l();
            nj_13.X = pj.J((double)((vL)b2).r, (double)((vL)b2).A, (double)((double)a2));
        }
    }

    private void M() {
        nj_1 a2;
        pKa.J().J().f(aSa.V, aSa.V, aSa.V);
        a2.p.material.endGL();
    }

    /*
     * WARNING - void declaration
     */
    private void J(vj vj2) {
        Object b2;
        void a2;
        nj_1 nj_12;
        nj_1 nj_13 = nj_12 = this;
        a2.f((nj)nj_13);
        nj_13.J((vj)a2, JPa.N);
        Object object = b2 = nj_13.p.particleUpdates.iterator();
        while (object.hasNext()) {
            ((IComponentParticleUpdate)b2.next()).f((nj)nj_12, (vj)a2);
            object = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        String c2 = string2;
        nj_1 a2 = this;
        try {
            void b2;
            a2.B.put((String)b2, a2.p.parser.J(c2));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void e() {
        nj_1 a2;
        nj_1 nj_12 = a2;
        nj_12.D = nj_12.p.parser.I.get(jpa.V);
        nj_12.n = nj_12.p.parser.I.get(Zpa.J);
        nj_12.k = nj_12.p.parser.I.get(kqa.j);
        nj_12.z = nj_12.p.parser.I.get(ySa.X);
        nj_12.A = nj_12.p.parser.I.get(rpa.s);
        nj_12.N = nj_12.p.parser.I.get(wPa.o);
        nj_12.W = nj_12.p.parser.I.get(nQa.Aa);
        nj_12.G = nj_12.p.parser.I.get(KQa.t);
        nj_12.c = nj_12.p.parser.I.get(wsa.m);
        nj_12.M = nj_12.p.parser.I.get(mPa.K);
        nj_12.T = nj_12.p.parser.I.get(mPa.k);
        nj_12.y = nj_12.p.parser.I.get(Wqa.C);
        nj_12.o = nj_12.p.parser.I.get(zpa.I);
        nj_12.s = nj_12.p.parser.I.get(Mqa.S);
        nj_12.V = nj_12.p.parser.I.get(FRa.M);
        nj_12.l = nj_12.p.parser.I.get(Ypa.fa);
        nj_12.R = nj_12.p.parser.I.get(RPa.m);
        nj_12.O = nj_12.p.parser.I.get(ISa.J);
        nj_12.q = nj_12.p.parser.I.get(Jra.F);
        nj_12.P = nj_12.p.parser.I.get(uSa.M);
        nj_12.K = nj_12.p.parser.I.get(xSa.w);
    }

    public void d() {
        nj_1 a2;
        if (!a2.Aa) {
            return;
        }
        nj_1 nj_12 = a2;
        nj_12.fa = aSa.V;
        nj_12.Aa = uSa.E;
        nj_12.u = (float)Math.random();
        nj_12.H = (float)Math.random();
        nj_12.v = (float)Math.random();
        nj_12.U = (float)Math.random();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ int J(nj nj2, vj vj2, vj vj3) {
        double d2;
        void b2;
        nj c2 = vj3;
        nj a2 = nj2;
        double d3 = b2.J(a2);
        if (d3 < (d2 = c2.J(a2))) {
            return vRa.d;
        }
        if (d3 > d2) {
            return pua.o;
        }
        return uSa.E;
    }

    public double f() {
        nj_1 a2;
        return a2.J(JPa.N);
    }

    public Gl J() {
        nj_1 nj_12 = this;
        nj_1 a2 = Kpa.J().Ta.J(nj_12.g);
        if (a2 == null) {
            return null;
        }
        return (Gl)a2;
    }

    public vj J(boolean bl) {
        Object object;
        boolean b22 = bl;
        nj_1 a2 = this;
        vj b22 = new vj();
        nj_1 nj_12 = a2;
        nj_12.J(b22, JPa.N);
        b22.J((nj)nj_12);
        Object object2 = object = nj_12.p.particleInitializes.iterator();
        while (object2.hasNext()) {
            object.next().J((nj)a2, b22);
            object2 = object;
        }
        if (b22.U && !b22.K) {
            object = new Vector3f(b22.z);
            b22.C.transform((Tuple3f)object);
            b22.z.x = ((Vector3f)object).x;
            b22.z.y = ((Vector3f)object).y;
            b22.z.z = ((Vector3f)object).z;
        }
        if (!b22.U || !b22.K) {
            vj vj2 = b22;
            vj2.z.add(a2.a);
            vj2.P.add(a2.a);
        }
        vj vj3 = b22;
        vj3.s.set(b22.z);
        b22.c = vj3.G;
        vj3.Y = vj3.c;
        return vj3;
    }

    public void J(JJ jJ2) {
        JJ b2 = jJ2;
        nj_1 a2 = this;
        a2.J(b2, null);
    }

    /*
     * WARNING - void declaration
     */
    private void l(float f2) {
        void a2;
        nj_1 nj_12 = this;
        nj_12.p.material.beginGL();
        nj_1 b2 = Kpa.J().J();
        double d2 = ((vL)b2).c + (((vL)b2).la - ((vL)b2).c) * (double)a2;
        nj_1 nj_13 = b2;
        double d3 = ((vL)b2).ba + (((vL)nj_13).Z - ((vL)b2).ba) * (double)a2;
        double d4 = ((vL)nj_13).r + (((vL)b2).A - ((vL)b2).r) * (double)a2;
        pKa.J().J().f(-d2, -d3, -d4);
        uKa.m();
        uKa.H();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        nj_1 nj_12 = this;
        if (nj_12.p == null) {
            return;
        }
        float d2 = Kpa.J().w.j.J();
        nj_1 nj_13 = nj_12;
        IComponentParticleRender iComponentParticleRender = nj_13.p.J(IComponentParticleRender.class);
        IComponentParticleMorphRender iComponentParticleMorphRender = nj_13.p.J(IComponentParticleMorphRender.class);
        Matrix3f matrix3f = nj_13.S;
        nj_1 nj_14 = nj_12;
        nj_13.S = new Matrix3f();
        if (!iComponentParticleRender.isEmpty() && !nj_12.f()) {
            Object object;
            nj_1 nj_15;
            float f3 = JPa.N;
            float f4 = JPa.N;
            float f5 = JPa.N;
            float f6 = JPa.N;
            if (nj_12.p.texture == null) {
                Kpa.J().J().J(JJ.DEFAULT_TEXTURE);
                nj_15 = nj_12;
            } else {
                nj_1 nj_16 = nj_12;
                nj_15 = nj_16;
                object = nj_16.p.texture.J(nj_12.f);
                f3 = ((ui)object).A;
                f4 = ((ui)object).k;
                f5 = ((ui)object).j;
                f6 = ((ui)object).J;
                uKa.C((int)((ui)object).I);
            }
            nj_15.p.material.beginGL();
            uKa.m();
            if (nj_12.Y == null || nj_12.Y.f) {
                nj_12.Y = nj_12.J(vRa.d != 0);
            }
            nj_1 nj_17 = nj_12;
            nj_1 nj_18 = nj_12;
            nj_12.S.setIdentity();
            nj_18.Y.f((nj)nj_12);
            nj_17.J(d2);
            nj_17.J(nj_18.Y, d2);
            object = iComponentParticleRender.iterator();
            Iterator iterator = object;
            while (iterator.hasNext()) {
                ((IComponentParticleRender)object.next()).J(nj_12.Y, (int)c2, (int)b2, (float)a2, d2, f3, f4, f5, f6);
                iterator = object;
            }
            nj_12.p.material.endGL();
            uKa.h();
        }
        if (!iComponentParticleMorphRender.isEmpty() && nj_12.f()) {
            Iterator iterator;
            if (nj_12.Y == null || nj_12.Y.f) {
                nj_12.Y = nj_12.J(vRa.d != 0);
            }
            nj_1 nj_19 = nj_12;
            nj_1 nj_110 = nj_12;
            nj_12.S.setIdentity();
            nj_110.Y.f((nj)nj_12);
            nj_19.J(d2);
            nj_19.J(nj_110.Y, d2);
            Iterator iterator2 = iterator = iComponentParticleMorphRender.iterator();
            while (iterator2.hasNext()) {
                IComponentParticleMorphRender iComponentParticleMorphRender2 = (IComponentParticleMorphRender)iterator.next();
                iterator2 = iterator;
                iComponentParticleMorphRender2.J(nj_12.Y, (int)c2, (int)b2, (float)a2, d2, JPa.N, JPa.N, JPa.N, JPa.N);
            }
        }
        nj_12.S = matrix3f;
    }

    public void J(int n2) {
        int b2 = n2;
        nj_1 a2 = this;
        a2.g = b2;
    }

    public boolean f() {
        return uSa.E != 0;
    }

    public void C() {
        nj_1 a2;
        if (!a2.Z) {
            return;
        }
        a2.j.add(a2.J(uSa.E != 0));
    }

    public double J() {
        nj_1 a2;
        nj_1 nj_12 = a2;
        nj_12.C(JPa.N);
        nj_1 nj_13 = a2;
        double d2 = nj_12.b - nj_13.a.x;
        double d3 = nj_13.Q - a2.a.y;
        double d4 = nj_12.X - a2.a.z;
        double d5 = d2;
        double d6 = d3;
        double d7 = d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public boolean J() {
        nj_1 a2;
        if (!a2.Z && a2.j.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(float f2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        nj_1 d5;
        float e22 = f2;
        nj_1 nj_12 = d5 = this;
        Gg e22 = nj_12.J();
        if (nj_12.I || e22 == null) {
            return YSa.L;
        }
        d5.x.func_181079_c(Oz.f((double)c2), Oz.f((double)b2), Oz.f((double)a2));
        if (e22.F((XF)d5.x)) {
            return e22.J((XF)d5.x, uSa.E);
        }
        return uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, float f2) {
        Object c2 = vj2;
        nj_1 b2 = this;
        if (b2.D != null) {
            void a2;
            b2.D.J(c2.J((float)a2));
        }
        if (b2.n != null) {
            b2.n.J((double)((vj)c2).t / vQa.c);
        }
        if (b2.k != null) {
            b2.k.J((double)((vj)c2).j);
        }
        if (b2.z != null) {
            b2.z.J((double)((vj)c2).g);
        }
        if (b2.A != null) {
            b2.A.J((double)((vj)c2).O);
        }
        if (b2.N != null) {
            b2.N.J((double)((vj)c2).e);
        }
        Vector3d a2 = new Vector3d(c2.J((nj)b2));
        nj_1 nj_12 = b2;
        a2.sub(nj_12.a);
        if (nj_12.s != null) {
            b2.s.J(a2.length());
        }
        if (b2.T != null) {
            b2.T.J(a2.x);
        }
        if (b2.y != null) {
            b2.y.J(a2.y);
        }
        if (b2.o != null) {
            b2.o.J(a2.z);
        }
        if (b2.W != null) {
            b2.W.J((double)((vj)c2).N.length());
        }
        if (b2.G != null) {
            b2.G.J((double)((vj)c2).N.x);
        }
        if (b2.c != null) {
            b2.c.J((double)((vj)c2).N.y);
        }
        if (b2.M != null) {
            b2.M.J((double)((vj)c2).N.z);
        }
        if (b2.V != null) {
            b2.V.J((double)((vj)c2).h);
        }
        nj_1 nj_13 = b2;
        nj_13.p.J();
        c2 = nj_13.p.C(BedrockComponentInitialization.class);
        if (c2 != null) {
            ((BedrockComponentInitialization)c2).particleUpdate.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(UG uG, List<? extends IComponentParticleRender> list, boolean bl, float f2) {
        Object e2;
        aKa aKa2;
        vj d2;
        nj_1 nj_12 = this;
        aKa aKa3 = pKa.J().J();
        float f3 = JPa.N;
        float f4 = JPa.N;
        float f5 = JPa.N;
        float f6 = JPa.N;
        if (d2 == null) {
            Kpa.J().J().J(JJ.DEFAULT_TEXTURE);
            aKa2 = aKa3;
        } else {
            e2 = d2.J(nj_12.f);
            aKa2 = aKa3;
            nj_1 nj_13 = e2;
            f3 = ((ui)nj_13).A;
            f4 = ((ui)nj_13).k;
            f5 = ((ui)nj_13).j;
            f6 = ((ui)nj_13).J;
            uKa.C((int)((ui)nj_13).I);
        }
        aKa2.J(XTa.W, mka.E);
        e2 = nj_12.j.iterator();
        block0: while (true) {
            Object object = e2;
            while (object.hasNext()) {
                void c2;
                void a2;
                void b2;
                int n2;
                d2 = (vj)e2.next();
                int n3 = n2 = d2.J((nj)nj_12) || d2.f((nj)nj_12) ? vRa.d : uSa.E;
                if (n2 != b2) {
                    object = e2;
                    continue;
                }
                void v4 = a2;
                nj_12.J((float)v4);
                nj_12.J(d2, (float)v4);
                Iterator iterator = c2.iterator();
                while (true) {
                    Iterator iterator2;
                    if (!iterator.hasNext()) continue block0;
                    IComponentRenderBase iComponentRenderBase = (IComponentRenderBase)iterator2.next();
                    if (n2 != 0 && iComponentRenderBase.getClass() == BedrockComponentAppearanceBillboard.class) {
                        iterator = iterator2;
                        continue;
                    }
                    iComponentRenderBase.J((nj)nj_12, d2, aKa3, (float)a2, f3, f4, f5, f6);
                    iterator = iterator2;
                }
            }
            break;
        }
        pKa.J().J();
    }

    private void l() {
    }

    public Gg J() {
        nj_1 nj_12 = this;
        nj_1 a2 = nj_12.J();
        if (a2 == null) {
            return null;
        }
        return ((Gl)a2).j;
    }

    public void f() {
        Object a2;
        nj_1 nj_12 = this;
        if (nj_12.p == null) {
            return;
        }
        nj_1 nj_13 = nj_12;
        nj_13.J(JPa.N);
        Object object = a2 = nj_13.p.emitterUpdates.iterator();
        while (object.hasNext()) {
            ((IComponentEmitterUpdate)a2.next()).J((nj)nj_12);
            object = a2;
        }
        nj_1 nj_14 = nj_12;
        nj_14.J(JPa.N);
        nj_14.A();
        nj_14.F += vRa.d;
        nj_14.E += vRa.d;
    }

    public nj_1() {
        nj_1 a2;
        nj_1 nj_12 = a2;
        a2.j = new ArrayList<vj>();
        nj_12.L = new ArrayList<vj>();
        a2.d = new HashMap<String, Double>();
        a2.f = new PG(OT.e);
        a2.Z = vRa.d;
        a2.a = new Vector3d();
        a2.m = new Vector3d();
        a2.S = new Matrix3f(pqa.r, JPa.N, JPa.N, JPa.N, pqa.r, JPa.N, JPa.N, JPa.N, pqa.r);
        a2.t = new Matrix3f(pqa.r, JPa.N, JPa.N, JPa.N, pqa.r, JPa.N, JPa.N, JPa.N, pqa.r);
        a2.Ka = new Vector3f();
        a2.r = new Vector3d();
        a2.Aa = vRa.d;
        a2.u = (float)Math.random();
        a2.H = (float)Math.random();
        a2.v = (float)Math.random();
        a2.U = (float)Math.random();
        a2.x = new zz();
        double[] dArray = new double[yRa.d];
        dArray[uSa.E] = oua.i;
        dArray[vRa.d] = oua.i;
        dArray[uqa.g] = oua.i;
        a2.w = dArray;
    }

    /*
     * WARNING - void declaration
     */
    public void f(float f2) {
        Object b2;
        int n2;
        void a2;
        nj_1 nj_12 = this;
        if (nj_12.p == null) {
            return;
        }
        nj_1 nj_13 = nj_12;
        nj_13.C((float)a2);
        List<IComponentParticleRender> list = nj_13.p.particleRender;
        List<IComponentParticleMorphRender> list2 = nj_13.p.particleMorphRender;
        boolean bl = nj_13.f();
        int n3 = n2 = !bl ? vRa.d : uSa.E;
        if (n2 != 0) {
            nj_12.l((float)a2);
            Object object = b2 = list.iterator();
            while (object.hasNext()) {
                IComponentParticleRender iComponentRenderBase2 = b2.next();
                object = b2;
                iComponentRenderBase2.J((nj)nj_12, (float)a2);
            }
            if (!nj_12.j.isEmpty()) {
                nj_1 nj_14 = nj_12;
                nj_14.l();
                nj_14.J(nj_14.p.texture, list, uSa.E != 0, (float)a2);
                b2 = nj_14.p.l(BedrockComponentCollisionAppearance.class);
                if (b2 != null && ((BedrockComponentCollisionAppearance)b2).textureId != null) {
                    nj_1 nj_15 = nj_12;
                    nj_15.J(nj_15.p.textures.get(((BedrockComponentCollisionAppearance)b2).textureId), list, vRa.d != 0, (float)a2);
                }
            }
            Object object2 = b2 = list.iterator();
            while (object2.hasNext()) {
                IComponentParticleRender iComponentParticleRender = (IComponentParticleRender)b2.next();
                object2 = b2;
                iComponentParticleRender.f((nj)nj_12, (float)a2);
            }
            nj_12.M();
        }
        if (bl) {
            Object object = b2 = list2.iterator();
            while (object.hasNext()) {
                IComponentParticleMorphRender iComponentParticleMorphRender = (IComponentParticleMorphRender)((Object)b2.next());
                object = b2;
                iComponentParticleMorphRender.J((nj)nj_12, (float)a2);
            }
            if (!nj_12.j.isEmpty()) {
                if (n2 == 0) {
                    nj_12.l();
                }
                nj_12.J(list2, uSa.E != 0, (float)a2);
            }
            for (IComponentParticleMorphRender iComponentParticleMorphRender : list2) {
                if (iComponentParticleMorphRender.getClass() == BedrockComponentRateSteady.class) {
                    if (n2 != 0) continue;
                    iComponentParticleMorphRender.f((nj)nj_12, (float)a2);
                    continue;
                }
                iComponentParticleMorphRender.f((nj)nj_12, (float)a2);
            }
        }
    }

    public void J() {
        nj_1 nj_12 = this;
        if (nj_12.B == null) {
            return;
        }
        for (Map.Entry<String, t> a2 : nj_12.B.entrySet()) {
            WK wK2 = nj_12.p.parser.I.get(a2.getKey());
            if (wK2 == null) continue;
            wK2.J(((t)a2.getValue()).J().J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        nj_1 nj_12 = this;
        for (Map.Entry<String, Double> b2 : nj_12.d.entrySet()) {
            WK wK2 = nj_12.p.parser.I.get(b2.getKey());
            if (wK2 == null) continue;
            wK2.J(((Double)b2.getValue()).doubleValue());
        }
        if (nj_12.l != null) {
            void a2;
            nj_12.l.J(nj_12.J((float)a2));
        }
        if (nj_12.R != null) {
            nj_1 nj_13 = nj_12;
            nj_13.R.J((double)nj_13.J / vQa.c);
        }
        if (nj_12.O != null) {
            nj_1 nj_14 = nj_12;
            nj_14.O.J((double)nj_14.u);
        }
        if (nj_12.q != null) {
            nj_1 nj_15 = nj_12;
            nj_15.q.J((double)nj_15.H);
        }
        if (nj_12.P != null) {
            nj_1 nj_16 = nj_12;
            nj_16.P.J((double)nj_16.v);
        }
        if (nj_12.K != null) {
            nj_1 nj_17 = nj_12;
            nj_17.K.J((double)nj_17.U);
        }
        nj_12.p.J();
    }

    /*
     * WARNING - void declaration
     */
    private void J(List<? extends IComponentParticleMorphRender> list, boolean bl, float f2) {
        nj_1 nj_12 = this;
        pKa.J().J();
        for (vj d2 : nj_12.j) {
            void c2;
            void a2;
            nj_1 nj_13 = nj_12;
            nj_13.J((float)a2);
            nj_13.J(d2, (float)a2);
            Iterator iterator = c2.iterator();
            while (iterator.hasNext()) {
                IComponentRenderBase cfr_ignored_0 = (IComponentRenderBase)d2.next();
                iterator = d2;
            }
        }
    }
}

