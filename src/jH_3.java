/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ANa
 *  BG
 *  BI
 *  FI
 *  Fr
 *  Gi
 *  Gl
 *  II
 *  JPa
 *  Ji
 *  KG
 *  KH
 *  Kpa
 *  Oz
 *  QM
 *  Ri
 *  Tg
 *  Uqa
 *  Vg
 *  XM
 *  XTa
 *  Zta
 *  aSa
 *  dN
 *  ej
 *  fO
 *  jH
 *  k
 *  kta
 *  oqa
 *  pqa
 *  sG
 *  tp
 *  uKa
 *  uL
 *  vL
 *  vRa
 *  xy
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.ToDoubleFunction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class jH_3
extends Tg
implements k {
    public FI c;
    private static final KH[] B;
    public float d;
    private boolean a;
    private final BG l;
    private static final KH e;
    public boolean G;
    public Vg f;
    public Vg F;
    public boolean g;
    public uL L;
    public boolean E;
    public qL m;
    public float C;
    public boolean i;
    public boolean M;
    public boolean j;
    private final Map<String, Bp> A;
    public final List<Bp> I;

    public List<Bp> J() {
        jH_3 a2;
        return a2.I;
    }

    public void J(RN rN2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object b2 = rN2;
        jH_3 a2 = this;
        Object object8 = b2;
        super.J((RN)object8);
        if (!((RN)object8).hasEWorldGroup()) {
            return;
        }
        if ((b2 = ((RN)b2).getEWorldGroup()).hasX()) {
            Object object9 = b2;
            object7 = object9;
            a2.F.I.J(object9.getX());
        } else {
            if (b2.hasXAnim()) {
                jH_3 jH_32 = a2;
                a2.F.I.J(b2.getXAnim(), jH_32.i ? 1 : 0, (K)jH_32.L);
            }
            object7 = b2;
        }
        if (object7.hasY()) {
            Object object10 = b2;
            object6 = object10;
            a2.F.J.J(object10.getY());
        } else {
            if (b2.hasYAnim()) {
                jH_3 jH_33 = a2;
                a2.F.J.J(b2.getYAnim(), jH_33.i ? 1 : 0, (K)jH_33.L);
            }
            object6 = b2;
        }
        if (object6.hasZ()) {
            Object object11 = b2;
            object5 = object11;
            a2.F.A.J(object11.getZ());
        } else {
            if (b2.hasZAnim()) {
                jH_3 jH_34 = a2;
                a2.F.A.J(b2.getZAnim(), jH_34.i ? 1 : 0, (K)jH_34.L);
            }
            object5 = b2;
        }
        if (object5.hasScale()) {
            jH_3 jH_35 = a2;
            jH_35.f.I.J(b2.getScale());
            Object object12 = b2;
            object4 = object12;
            jH_35.f.J.J(object12.getScale());
            jH_35.f.A.J(b2.getScale());
        } else if (b2.hasScaleAnim()) {
            jH_3 jH_36 = a2;
            jH_3 jH_37 = a2;
            jH_36.f.I.J(b2.getScale(), jH_37.i ? 1 : 0, (K)a2.L);
            Object object13 = b2;
            object4 = object13;
            jH_3 jH_38 = a2;
            jH_37.f.J.J(object13.getScale(), jH_38.i ? 1 : 0, (K)jH_38.L);
            jH_3 jH_39 = a2;
            jH_36.f.A.J(b2.getScale(), jH_39.i ? 1 : 0, (K)jH_39.L);
        } else {
            Object object14;
            Object object15;
            if (b2.hasScaleX()) {
                Object object16 = b2;
                object15 = object16;
                a2.f.I.J(object16.getScaleX());
            } else {
                if (b2.hasScaleXAnim()) {
                    jH_3 jH_310 = a2;
                    a2.f.I.J(b2.getScaleXAnim(), jH_310.i ? 1 : 0, (K)jH_310.L);
                }
                object15 = b2;
            }
            if (object15.hasScaleY()) {
                Object object17 = b2;
                object14 = object17;
                a2.f.J.J(object17.getScaleY());
            } else {
                if (b2.hasScaleYAnim()) {
                    jH_3 jH_311 = a2;
                    a2.f.J.J(b2.getScaleYAnim(), jH_311.i ? 1 : 0, (K)jH_311.L);
                }
                object14 = b2;
            }
            if (object14.hasScaleZ()) {
                Object object18 = b2;
                object4 = object18;
                a2.f.A.J(object18.getScaleZ());
            } else {
                if (b2.hasScaleZAnim()) {
                    jH_3 jH_312 = a2;
                    a2.f.A.J(b2.getScaleZAnim(), jH_312.i ? 1 : 0, (K)jH_312.L);
                }
                object4 = b2;
            }
        }
        if (object4.hasAngleX()) {
            Object object19 = b2;
            object3 = object19;
            a2.m.I.J(object19.getAngleX());
        } else if (b2.hasAngleXAnim()) {
            Object object20 = b2;
            object3 = object20;
            jH_3 jH_313 = a2;
            a2.m.I.J(object20.getAngleXAnim(), jH_313.i ? 1 : 0, (K)jH_313.L);
        } else {
            if (b2.hasAngleXAnimSmart()) {
                jH_3 jH_314 = a2;
                a2.m.I.f(b2.getAngleXAnimSmart(), jH_314.i ? 1 : 0, (K)jH_314.L);
            }
            object3 = b2;
        }
        if (object3.hasAngleY()) {
            Object object21 = b2;
            object2 = object21;
            a2.m.A.J(object21.getAngleY());
        } else if (b2.hasAngleYAnim()) {
            Object object22 = b2;
            object2 = object22;
            jH_3 jH_315 = a2;
            a2.m.A.J(object22.getAngleYAnim(), jH_315.i ? 1 : 0, (K)jH_315.L);
        } else {
            if (b2.hasAngleYAnimSmart()) {
                jH_3 jH_316 = a2;
                a2.m.A.f(b2.getAngleYAnimSmart(), jH_316.i ? 1 : 0, (K)jH_316.L);
            }
            object2 = b2;
        }
        if (object2.hasAngleZ()) {
            Object object23 = b2;
            object = object23;
            a2.m.J.J(object23.getAngleZ());
        } else if (b2.hasAngleZAnim()) {
            Object object24 = b2;
            object = object24;
            jH_3 jH_317 = a2;
            a2.m.J.J(object24.getAngleZAnim(), jH_317.i ? 1 : 0, (K)jH_317.L);
        } else {
            if (b2.hasAngleZAnimSmart()) {
                jH_3 jH_318 = a2;
                a2.m.J.f(b2.getAngleZAnimSmart(), jH_318.i ? 1 : 0, (K)jH_318.L);
            }
            object = b2;
        }
        for (CL cL2 : object.getActionsList()) {
            switch (kI.A[cL2.getKind().ordinal()]) {
                case 1: {
                    try {
                        while (false) {
                        }
                        a2.J(cL2.getAdd());
                    }
                    catch (Exception exception) {
                        OT.b.error(new StringBuilder().insert(3 >> 2, dua.ba).append((String)((Object)a2.I)).append(XTa.Z).toString(), (Throwable)exception);
                    }
                    break;
                }
                case 2: {
                    a2.J(cL2.getRemove());
                    break;
                }
                case 3: {
                    a2.J(cL2.getEdit());
                }
            }
        }
        a2.M();
    }

    public float J() {
        jH_3 jH_32 = this;
        if (jH_32.C == vqa.T) {
            Iterator<Bp> iterator;
            if (jH_32.j) {
                return JPa.N;
            }
            jH_32.j = vRa.d;
            float f2 = JPa.N;
            Iterator<Bp> iterator2 = iterator = jH_32.I.iterator();
            while (iterator2.hasNext()) {
                float f3;
                float f4;
                Bp a2 = iterator.next();
                if (a2.v != null) {
                    f4 = a2.J().I + a2.C();
                    f3 = f2;
                } else {
                    f4 = a2.d.f() + a2.C();
                    f3 = f2;
                }
                f2 = Math.max(f3, f4);
                iterator2 = iterator;
            }
            jH_3 jH_33 = jH_32;
            jH_33.C = f2;
            jH_33.j = uSa.E;
        }
        return jH_32.C;
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        Iterator<Bp> iterator;
        jH_3 b322;
        jH_3 jH_32;
        void a2;
        jH_3 jH_33 = this;
        if (!jH_33.J((long)a2)) {
            return;
        }
        jH_3 jH_34 = jH_33;
        jH_34.C((long)a2);
        if (jH_34.G) {
            uKa.h();
            jH_32 = jH_33;
        } else {
            uKa.m();
            jH_32 = jH_33;
        }
        uKa.J((boolean)jH_32.M);
        jH_3 jH_35 = jH_33;
        jH_35.C();
        uKa.e();
        jH_3 jH_36 = b322 = jH_35.J((long)a2);
        uKa.f((double)(((BG)b322).I.j - RKa.k), (double)(((BG)jH_36).I.J - RKa.C), (double)(((BG)b322).I.k - RKa.f));
        if (((BG)jH_36).A.k != aSa.V) {
            uKa.J((float)((float)((BG)b322).A.k), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
        uKa.J((float)(Hra.Ga + (float)((BG)b322).A.J), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        if (((BG)b322).A.j != aSa.V) {
            uKa.J((float)((float)((BG)b322).A.j), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
        float b322 = oqa.c;
        jH_3 jH_37 = jH_33;
        uKa.l((float)(-jH_33.f.I.f() * b322), (float)(-jH_33.f.J.f() * b322), (float)(-jH_37.f.A.f() * b322));
        if (jH_37.g) {
            uKa.J((float)(-jH_33.J() / kta.v), (float)(-jH_33.f() / kta.v), (float)JPa.N);
        }
        if (jH_33.i) {
            float f2;
            jH_3 jH_38 = jH_33;
            b322 = jH_38.J() / kta.v;
            float f3 = jH_38.f() / kta.v;
            uKa.J((float)b322, (float)f3, (float)JPa.N);
            int n2 = Kpa.J().z.ld != uqa.g ? vRa.d : uSa.E;
            uKa.J((float)(-jH_33.C.c + Hra.Ga), (float)JPa.N, (float)pqa.r, (float)JPa.N);
            jH_3 jH_39 = jH_33;
            if (n2 == 0) {
                uKa.J((float)(-jH_39.C.l), (float)pqa.r, (float)JPa.N, (float)JPa.N);
                f2 = b322;
            } else {
                uKa.J((float)jH_39.C.l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
                f2 = b322;
            }
            uKa.J((float)(-f2), (float)(-f3), (float)JPa.N);
        }
        Iterator<Bp> iterator2 = b322 = jH_33.I.iterator();
        while (iterator2.hasNext()) {
            Bp bp2 = b322.next();
            iterator2 = b322;
            bp2.e();
        }
        int b322 = jH_33.c != null || jH_33.F.J() + jH_33.m.J() + jH_33.f.J() != nqa.i ? vRa.d : uSa.E;
        Iterator<Bp> iterator3 = iterator = jH_33.I.iterator();
        while (iterator3.hasNext()) {
            Bp bp3 = iterator.next();
            if (bp3.i <= a2) {
                iterator3 = iterator;
                jH_33.A.remove(bp3.I, bp3);
                jH_33.I.remove(bp3);
                bp3.J();
                b322 = vRa.d;
                continue;
            }
            if (bp3.i > jH_33.M) {
                bp3.i = (long)jH_33.M;
            }
            if (!bp3.J(Kpa.J())) {
                iterator3 = iterator;
                continue;
            }
            bp3.f((long)a2);
            b322 |= bp3.o != nqa.i ? vRa.d : uSa.E;
            iterator3 = iterator;
        }
        if (b322 != 0 || jH_33.a) {
            jH_33.a = b322;
            jH_33.M();
        }
        uKa.D();
        jH_33.d();
    }

    /*
     * WARNING - void declaration
     */
    private BI J(KH kH2, KH kH3, KH kH4, KH kH5, KH kH6) {
        double d2;
        int n2;
        double d3;
        KH d4;
        KH a2;
        void c2;
        KH b2;
        jH_3 f2 = kH2;
        jH_3 e2 = this;
        b2 = b2.f((KH)c2);
        a2 = a2.f((KH)c2);
        KH kH7 = b2.J(a2);
        d4 = f2.f(d4);
        double d5 = kH7.J(d4);
        if (Math.abs(d3) < UOa.C) {
            return new BI((jH)e2, uSa.E != 0);
        }
        d5 = -kH7.J(f2.f((KH)c2)) / d5;
        f2 = f2.d(d4.C(d5));
        if (d5 > aSa.V) {
            return new BI((jH)e2, uSa.E != 0);
        }
        f2 = f2.f((KH)c2);
        KH kH8 = a2;
        d5 = f2.J(b2);
        double d6 = f2.J(kH8);
        double d7 = b2.J(b2);
        double d8 = kH8.J(a2);
        if (d5 >= aSa.V && d5 <= d7 && d6 >= aSa.V && d6 <= d8) {
            n2 = vRa.d;
            d2 = d5;
        } else {
            n2 = uSa.E;
            d2 = d5;
        }
        return new BI((jH)e2, n2 != 0, d2 / d7, d6 / d8);
    }

    public void f() {
        jH_3 a2;
        jH_3 jH_32 = a2;
        jH_32.I.forEach(II.J());
        jH_32.M();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Zk zk2) {
        Object c2 = zk2;
        jH_3 a2 = this;
        if (c2 != null) {
            void b2;
            long l2 = OT.e;
            if (((Zk)c2).m != JPa.N) {
                a2.F.I.J(((Zk)c2).m, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).k != JPa.N) {
                a2.F.J.J(((Zk)c2).k, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).C != JPa.N) {
                a2.F.A.J(((Zk)c2).C, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).A != JPa.N) {
                a2.m.I.J(((Zk)c2).A, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).I != JPa.N) {
                a2.m.A.J(((Zk)c2).I, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).J != JPa.N) {
                a2.m.J.J(((Zk)c2).J, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).i != JPa.N) {
                a2.f.I.J(((Zk)c2).i, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).M != JPa.N) {
                a2.f.J.J(((Zk)c2).M, (int)b2, sG.A, l2);
            }
            if (((Zk)c2).j != JPa.N) {
                a2.f.A.J(((Zk)c2).j, (int)b2, sG.A, l2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(fO fO2) {
        void a2;
        jH_3 jH_32 = this;
        Iterator b2 = tp.J((k)jH_32, (fO)a2).iterator();
        Object object = b2;
        while (object.hasNext()) {
            ((Bp)b2.next()).J((fO)a2);
            object = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void C(long l2) {
        float f2;
        float f3;
        float f4;
        int b2;
        jH_3 jH_32;
        KH[] kHArray;
        void a2;
        jH_3 jH_33 = this;
        if (!jH_33.b) {
            return;
        }
        jH_3 jH_34 = jH_33;
        if (jH_34.j > (float)jH_34.E) {
            if (jH_33.J) {
                jH_33.I.forEach(Gi.J((long)a2));
            }
            jH_33.J = uSa.E;
            return;
        }
        jH_3 jH_35 = jH_33;
        float f5 = jH_35.J() / KSa.z;
        float f6 = jH_35.f() / KSa.z;
        if (jH_35.g) {
            float f7 = f5 / kta.v;
            float f8 = f6 / kta.v;
            KH[] kHArray2 = new KH[yRa.d];
            kHArray2[uSa.E] = new KH((double)(-f7), (double)f8, aSa.V);
            kHArray2[vRa.d] = new KH((double)(f5 - f7), (double)f8, aSa.V);
            kHArray2[uqa.g] = new KH((double)(-f7), (double)(-f6 + f8), aSa.V);
            kHArray = kHArray2;
            jH_32 = jH_33;
        } else {
            KH[] kHArray3 = new KH[yRa.d];
            kHArray3[uSa.E] = new KH(aSa.V, aSa.V, aSa.V);
            kHArray3[vRa.d] = new KH((double)f5, aSa.V, aSa.V);
            kHArray3[uqa.g] = new KH(aSa.V, (double)(-f6), aSa.V);
            kHArray = kHArray3;
            jH_32 = jH_33;
        }
        BG bG2 = jH_32.J((long)a2);
        jH_3 jH_36 = jH_33;
        double d2 = jH_36.f.I.f();
        double d3 = jH_36.f.J.f();
        double d4 = jH_36.f.A.f();
        int n2 = b2 = uSa.E;
        while (n2 < yRa.d) {
            kHArray[++b2] = kHArray[b2].f(d2, d3, d4);
            n2 = b2;
        }
        if (bG2.A.j != aSa.V) {
            f4 = (float)Math.toRadians(-bG2.A.j);
            f3 = Oz.d((float)f4);
            f2 = Oz.C((float)f4);
            int n3 = b2 = uSa.E;
            while (n3 < yRa.d) {
                int n4 = b2;
                KH kH2 = jH_3.l(f3, f2, kHArray[b2]);
                kHArray[n4] = kH2;
                n3 = ++b2;
            }
        }
        if (bG2.A.J != aSa.V) {
            f4 = (float)Math.toRadians(-bG2.A.J);
            f3 = Oz.d((float)f4);
            f2 = Oz.C((float)f4);
            int n5 = b2 = uSa.E;
            while (n5 < yRa.d) {
                int n6 = b2;
                KH kH3 = jH_3.J(f3, f2, kHArray[b2]);
                kHArray[n6] = kH3;
                n5 = ++b2;
            }
        }
        if (bG2.A.k != aSa.V) {
            f4 = (float)Math.toRadians(bG2.A.k);
            f3 = Oz.d((float)f4);
            f2 = Oz.C((float)f4);
            int n7 = b2 = uSa.E;
            while (n7 < yRa.d) {
                int n8 = b2;
                KH kH4 = jH_3.f(f3, f2, kHArray[b2]);
                kHArray[n8] = kH4;
                n7 = ++b2;
            }
        }
        if (jH_33.i) {
            if (!jH_33.g) {
                int n9 = b2 = uSa.E;
                while (n9 < yRa.d) {
                    kHArray[++b2] = kHArray[b2].l((double)(-f5 / kta.v), (double)(f6 / kta.v), aSa.V);
                    n9 = b2;
                }
            }
            f4 = (float)Math.toRadians(-jH_33.C.l);
            f3 = Oz.d((float)f4);
            f2 = Oz.C((float)f4);
            int n10 = b2 = uSa.E;
            while (n10 < yRa.d) {
                int n11 = b2;
                KH kH5 = jH_3.l(f3, f2, kHArray[b2]);
                kHArray[n11] = kH5;
                n10 = ++b2;
            }
            f4 = (float)Math.toRadians(jH_33.C.c - Hra.Ga);
            f3 = Oz.d((float)f4);
            f2 = Oz.C((float)f4);
            int n12 = b2 = uSa.E;
            while (n12 < yRa.d) {
                int n13 = b2;
                KH kH6 = jH_3.J(f3, f2, kHArray[b2]);
                kHArray[n13] = kH6;
                n12 = ++b2;
            }
            if (!jH_33.g) {
                int n14 = b2 = uSa.E;
                while (n14 < yRa.d) {
                    kHArray[++b2] = kHArray[b2].l((double)(f5 / kta.v), (double)(-f6 / kta.v), aSa.V);
                    n14 = b2;
                }
            }
        }
        BG bG3 = bG2;
        d2 = bG3.I.j;
        d3 = bG3.I.J;
        d4 = bG3.I.k;
        int n15 = b2 = uSa.E;
        while (n15 < yRa.d) {
            kHArray[++b2] = kHArray[b2].l(d2, d3, d4);
            n15 = b2;
        }
        ANa aNa2 = Kpa.J().c;
        KH kH7 = new KH(aNa2.la, aNa2.Z + (double)aNa2.l(), aNa2.A);
        aNa2 = new KH(aNa2.f());
        jH_3 jH_37 = jH_33;
        KH kH8 = kH7;
        aNa2 = jH_37.J(kH8, kH8.d((KH)aNa2), kHArray[uSa.E], kHArray[vRa.d], kHArray[uqa.g]);
        jH_37.J = aNa2.A;
        if (jH_37.J) {
            for (Bp bp2 : jH_33.I) {
                if (!bp2.j) continue;
                Ri ri = bp2.J((long)a2);
                Bp bp3 = bp2;
                bp3.J((int)((aNa2.J - ri.I) / bp2.k.f()), (int)((aNa2.j - ri.A) / bp3.J.f()), (long)a2);
            }
        } else {
            for (Bp bp4 : jH_33.I) {
                if (!bp4.j) continue;
                bp4.J(rta.n, rta.n, (long)a2);
            }
        }
    }

    public void J() {
        jH_3 a2;
        a2.I.forEach(ej.J());
    }

    public void l() {
        jH_3 jH_32;
        jH_3 jH_33 = jH_32 = this;
        jH_3 a2 = jH_33.J(OT.e);
        jH_32.j = (float)(jH_3.J((double)(jH_33.C.A - ((BG)a2).I.j)) + jH_3.J((double)(jH_32.C.D - ((BG)a2).I.J)) + jH_3.J((double)(jH_32.C.g - ((BG)a2).I.k)));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(long l2) {
        void a22;
        jH_3 jH_32 = this;
        jH_32.C = vqa.T;
        jH_32.d = vqa.T;
        int b2 = jH_32.M - a22;
        int a22 = (int)(a22 - jH_32.f);
        if (a22 < 0) {
            return uSa.E != 0;
        }
        if (b2 <= jH_32.G) {
            jH_3 jH_33 = jH_32;
            jH_33.J(jH_33.G ? 1 : 0, jH_32.L.A);
            jH_32.L.A = null;
        } else if (a22 <= jH_32.l) {
            jH_3 jH_34 = jH_32;
            jH_34.J((int)jH_34.l, jH_32.L.I);
            jH_32.L.I = null;
        }
        return vRa.d != 0;
    }

    public static /* synthetic */ void J(long b2, Bp a2) {
        a2.J(uSa.E != 0, b2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2) {
        jH_3 jH_32;
        jH_3 jH_33 = jH_32 = this;
        ListIterator<Bp> b2 = jH_33.I.listIterator(jH_33.I.size());
        while (b2.hasPrevious()) {
            void a2;
            Bp bp2 = (Bp)b2.previous();
            if (!bp2.e || !bp2.J(uSa.E, uSa.E, (int)a2)) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string) {
        jH_3 jH_32 = this;
        for (Bp bp2 : jH_32.I) {
            void a2;
            if (!bp2.I.equals(a2)) continue;
            bp2.l();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2) {
        jH_3 jH_32;
        jH_3 jH_33 = jH_32 = this;
        ListIterator<Bp> b2 = jH_33.I.listIterator(jH_33.I.size());
        while (b2.hasPrevious()) {
            void a2;
            Bp bp2 = (Bp)b2.previous();
            if (!bp2.e || !bp2.J((int)a2)) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void M() {
        int n2;
        float f2;
        float f3;
        KH[] kHArray = this;
        if (kHArray.D) {
            kHArray.e = I;
            return;
        }
        kHArray.C = vqa.T;
        kHArray.d = vqa.T;
        float f4 = kHArray.J() / KSa.z;
        float f5 = kHArray.f() / KSa.z;
        BG bG2 = kHArray.J(OT.e);
        KH[] a2 = B;
        if (kHArray.g) {
            f3 = f4 / kta.v;
            f2 = f5 / kta.v;
            KH[] kHArray2 = a2;
            KH[] kHArray3 = a2;
            kHArray2[uSa.E] = new KH((double)(-f3), (double)f2, aSa.V);
            kHArray3[vRa.d] = new KH((double)(f4 - f3), (double)f2, aSa.V);
            kHArray2[uqa.g] = new KH((double)(-f3), (double)(-f5 + f2), aSa.V);
            kHArray3[yRa.d] = new KH((double)(f4 - f3), (double)(-f5 + f2), aSa.V);
            if (kHArray.i) {
                int n3;
                double d2 = Math.max(jH_3.J(a2, KH.M), jH_3.J(a2, KH.A));
                int n4 = n3 = uSa.E;
                while (n4 < uqa.g) {
                    double d3 = d2;
                    a2[n3++] = new KH(d3, a2[n3].J, d3);
                    n4 = n3;
                }
                int n5 = n3 = uqa.g;
                while (n5 < AQa.P) {
                    a2[n3++] = new KH(-d2, a2[n3].J, -d2);
                    n5 = n3;
                }
            }
        } else {
            KH[] kHArray4 = a2;
            KH[] kHArray5 = a2;
            kHArray4[uSa.E] = new KH(aSa.V, aSa.V, aSa.V);
            kHArray5[vRa.d] = new KH((double)f4, aSa.V, aSa.V);
            kHArray4[uqa.g] = new KH(aSa.V, (double)(-f5), aSa.V);
            kHArray5[yRa.d] = new KH((double)f4, (double)(-f5), aSa.V);
            if (kHArray.i) {
                double d4 = Math.max(jH_3.J(a2, KH.M), jH_3.J(a2, KH.A)) / KPa.y;
                a2[uSa.E] = a2[uSa.E].l(aSa.V, aSa.V, d4);
                a2[uqa.g] = a2[uqa.g].l(aSa.V, aSa.V, -d4);
            }
        }
        f3 = kHArray.f.I.f();
        f2 = kHArray.f.J.f();
        float f6 = kHArray.f.A.f();
        int n6 = n2 = uSa.E;
        while (n6 < AQa.P) {
            a2[++n2] = a2[n2].f((double)f3, (double)f2, (double)f6);
            n6 = n2;
        }
        if (bG2.A.j != aSa.V) {
            int n7;
            float f7 = (float)Math.toRadians(-bG2.A.j);
            float f8 = Oz.d((float)f7);
            f4 = Oz.C((float)f7);
            int n8 = n7 = uSa.E;
            while (n8 < AQa.P) {
                int n9 = n7;
                KH kH2 = jH_3.l(f8, f4, a2[n7]);
                a2[n9] = kH2;
                n8 = ++n7;
            }
        }
        if (bG2.A.J != aSa.V) {
            int n10;
            float f9 = (float)Math.toRadians(-bG2.A.J);
            float f10 = Oz.d((float)f9);
            f4 = Oz.C((float)f9);
            int n11 = n10 = uSa.E;
            while (n11 < AQa.P) {
                int n12 = n10;
                KH kH3 = jH_3.J(f10, f4, a2[n10]);
                a2[n12] = kH3;
                n11 = ++n10;
            }
        }
        if (bG2.A.k != aSa.V) {
            int n13;
            float f11 = (float)Math.toRadians(bG2.A.k);
            float f12 = Oz.d((float)f11);
            f4 = Oz.C((float)f11);
            int n14 = n13 = uSa.E;
            while (n14 < AQa.P) {
                int n15 = n13;
                KH kH4 = jH_3.f(f12, f4, a2[n13]);
                a2[n15] = kH4;
                n14 = ++n13;
            }
        }
        kHArray.e = new xy(jH_3.f(a2, KH.M), jH_3.f(a2, KH.I), jH_3.f(a2, KH.A), jH_3.J(a2, KH.M), jH_3.J(a2, KH.I), jH_3.J(a2, KH.A)).C(bG2.I.j, bG2.I.J, bG2.I.k);
    }

    public Bp J(String string) {
        Object b2 = string;
        jH_3 a2 = this;
        return a2.A.get(b2);
    }

    public float f() {
        jH_3 jH_32 = this;
        if (jH_32.d == vqa.T) {
            Iterator<Bp> iterator;
            if (jH_32.E) {
                return JPa.N;
            }
            jH_32.E = vRa.d;
            float f2 = JPa.N;
            Iterator<Bp> iterator2 = iterator = jH_32.I.iterator();
            while (iterator2.hasNext()) {
                float f3;
                float f4;
                Bp a2 = iterator.next();
                if (a2.v != null) {
                    f4 = a2.J().A + a2.l();
                    f3 = f2;
                } else {
                    f4 = a2.b.f() + a2.l();
                    f3 = f2;
                }
                f2 = Math.max(f3, f4);
                iterator2 = iterator;
            }
            jH_3 jH_33 = jH_32;
            jH_33.d = f2;
            jH_33.E = uSa.E;
        }
        return jH_32.d;
    }

    /*
     * WARNING - void declaration
     */
    public void f(long l2) {
        jH_3 jH_32 = this;
        if (jH_32.J) {
            jH_32.J = uSa.E;
            Iterator<Bp> b2 = jH_32.I.iterator();
            Object object = b2;
            while (object.hasNext()) {
                void a2;
                ((Bp)b2.next()).J(rta.n, rta.n, (long)a2);
                object = b2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static float J(float f2, float f3, float f4) {
        void a2;
        float c2 = f3;
        float b2 = f2;
        float f5 = c2 = c2 - b2;
        while (f5 < xua.V) {
            f5 = c2 + CRa.ja;
        }
        float f6 = c2;
        while (f6 >= Hra.Ga) {
            f6 = c2 - CRa.ja;
        }
        return b2 + a2 * c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(ALa aLa2) {
        void a2;
        jH_3 jH_32 = this;
        if (!super.J((ALa)a2)) {
            return uSa.E != 0;
        }
        if (jH_32.D && jH_32.c instanceof Ji) {
            jH_3 b2 = ((Ji)jH_32.c).J();
            if (b2 != null) {
                return a2.J(b2.J());
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static double f(KH[] kHArray, ToDoubleFunction<KH> toDoubleFunction) {
        int b2;
        void a2;
        KH[] kHArray2 = kHArray;
        double d2 = a2.applyAsDouble(kHArray2[uSa.E]);
        int n2 = b2 = vRa.d;
        while (n2 < kHArray2.length) {
            double d3;
            double d4 = a2.applyAsDouble(kHArray2[b2]);
            if (d3 < d2) {
                d2 = d4;
            }
            n2 = ++b2;
        }
        return d2;
    }

    public void l(long a2) {
        int n2;
        jH_3 b2;
        int n3 = a2 = b2.c != null || b2.F.J() + b2.m.J() + b2.f.J() != nqa.i ? vRa.d : uSa.E;
        if (a2 == 0) {
            Iterator<Bp> iterator = b2.I.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().o == nqa.i) continue;
                n2 = a2 = vRa.d;
                break;
            }
        } else {
            n2 = a2;
        }
        if (n2 != 0 || b2.a) {
            b2.a = a2;
            b2.M();
        }
    }

    public jH_3(dN dN2) {
        jH_3 jH_32;
        jH_3 a2;
        Object b2 = dN2;
        jH_3 jH_33 = a2 = this;
        jH_3 jH_34 = a2;
        super((dN)b2);
        jH_3 jH_35 = a2;
        a2.I = new CopyOnWriteArrayList<Bp>();
        jH_35.A = new HashMap<String, Bp>();
        jH_34.L = new uL();
        jH_33.c = null;
        jH_34.G = uSa.E;
        jH_33.i = uSa.E;
        jH_33.g = uSa.E;
        jH_33.M = uSa.E;
        jH_33.C = vqa.T;
        jH_33.d = vqa.T;
        jH_33.a = uSa.E;
        jH_33.l = new BG(null);
        b2 = b2.getEWorldGroup();
        if (b2.hasAnimation()) {
            a2.L.J(b2.getAnimation());
        }
        if (b2.hasAttachment()) {
            a2.c = FI.J((QM)b2.getAttachment());
        }
        jH_3 jH_36 = a2;
        jH_36.F = new Vg(b2.getX(), b2.getY(), b2.getZ());
        jH_36.m = new qL(b2.getAngleX(), b2.getAngleY(), b2.getAngleZ());
        if (b2.hasScale()) {
            jH_32 = b2;
            a2.f = new Vg(b2.getScale());
        } else {
            a2.f = new Vg(pqa.r);
            if (b2.hasScaleX()) {
                a2.f.I.J(b2.getScaleX());
            }
            if (b2.hasScaleY()) {
                a2.f.J.J(b2.getScaleY());
            }
            if (b2.hasScaleZ()) {
                a2.f.A.J(b2.getScaleZ());
            }
            jH_32 = b2;
        }
        if (jH_32.hasCulling()) {
            a2.G = b2.getCulling();
        }
        if (b2.hasAdjustableAngle()) {
            a2.i = b2.getAdjustableAngle();
        }
        if (b2.hasCentered()) {
            a2.g = b2.getCentered();
        }
        if (b2.hasDepthMask()) {
            a2.M = b2.getDepthMask();
        }
        for (XM xM2 : b2.getElementsList()) {
            try {
                a2.J(xM2);
            }
            catch (Exception exception) {
                OT.b.error(new StringBuilder().insert(3 & 4, dua.ba).append((String)((Object)a2.I)).append(XTa.Z).toString(), (Throwable)exception);
            }
        }
        if (a2.c instanceof Ji) {
            a2.D = vRa.d;
        }
        a2.M();
    }

    public String toString() {
        jH_3 a2;
        return new StringBuilder().insert(3 & 4, Fua.W).append((String)((Object)a2.I)).append(Zta.E).append(a2.I).append(XOa.D).toString();
    }

    /*
     * WARNING - void declaration
     */
    private static KH l(float f2, float f3, KH kH2) {
        void b2;
        KH c2 = kH2;
        float a2 = f2;
        return new KH(c2.j, c2.J * (double)b2 - c2.k * (double)a2, c2.k * (double)b2 + c2.J * (double)a2);
    }

    private void J(XM xM2) throws Exception {
        Object b2 = xM2;
        jH_3 a2 = this;
        jH_3 jH_32 = b2;
        b2 = Bp.J((XM)jH_32, a2);
        if (!jH_32.hasPosition()) {
            ((Bp)b2).c = null;
        }
        if (((Bp)b2).w == Fr.I) {
            ((Bp)b2).w = Fr.A;
        }
        a2.J((Bp)b2);
    }

    public void J(Bp bp2) {
        jH_3 a2;
        Bp b2 = bp2;
        jH_3 jH_32 = a2 = this;
        b2.d();
        jH_32.J((String)b2.I);
        jH_32.A.put((String)b2.I, b2);
        a2.I.add(b2);
    }

    /*
     * WARNING - void declaration
     */
    private static double J(KH[] kHArray, ToDoubleFunction<KH> toDoubleFunction) {
        int b2;
        void a2;
        KH[] kHArray2 = kHArray;
        double d2 = a2.applyAsDouble(kHArray2[uSa.E]);
        int n2 = b2 = vRa.d;
        while (n2 < kHArray2.length) {
            double d3;
            double d4 = a2.applyAsDouble(kHArray2[b2]);
            if (d3 > d2) {
                d2 = d4;
            }
            n2 = ++b2;
        }
        return d2;
    }

    static {
        e = new KH(aSa.V, vTa.x, aSa.V);
        B = new KH[AQa.P];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private BG J(long l2) {
        jH_3 jH_32;
        void a22;
        jH_3 jH_33 = this;
        if (jH_33.l.J != a22) {
            jH_33.l.J = a22;
            jH_33.l.A = new KH((double)jH_33.m.I.f(), (double)jH_33.m.A.f(), (double)jH_33.m.J.f());
            if (jH_33.c instanceof Ji) {
                Ji a22 = (Ji)jH_33.c;
                jH_33.l.I = a22.J();
                if (jH_33.l.I == null) {
                    jH_33.l.I = e;
                    if (OT.e - a22.I <= Uqa.o) return jH_33.l;
                    jH_33.e();
                    return jH_33.l;
                }
                jH_3 jH_34 = jH_33;
                float f2 = jH_34.F.I.f();
                float f3 = jH_34.F.J.f();
                float f4 = jH_34.F.A.f();
                if (a22.j != KG.NONE) {
                    float f5;
                    float f6 = JPa.N;
                    Kpa kpa2 = Kpa.J();
                    jH_3 b22 = kpa2.Ta.J(a22.J);
                    float f7 = kpa2.w.j.J();
                    switch (kI.I[a22.j.ordinal()]) {
                        case 1: {
                            if (b22 instanceof Gl) {
                                f5 = f6 = jH_3.J(((Gl)b22).Ma, ((Gl)b22).ba, f7);
                                break;
                            }
                            jH_3 jH_35 = b22;
                            f5 = f6 = ((vL)jH_35).s + (((vL)jH_35).X - ((vL)b22).s) * f7;
                            break;
                        }
                        case 2: {
                            if (b22 instanceof Gl) {
                                f6 = jH_3.J(((Gl)b22).ga, ((Gl)b22).t, f7);
                            }
                        }
                        default: {
                            f5 = f6;
                        }
                    }
                    if (f5 != JPa.N) {
                        jH_33.l.A = jH_33.l.A.l(aSa.V, (double)(-f6), aSa.V);
                        float f8 = (float)Math.toRadians(-f6);
                        f6 = Oz.C((float)f8);
                        f8 = Oz.d((float)f8);
                        float b22 = f2 * f6 + f4 * f8;
                        f8 = f2 * -f8 + f4 * f6;
                        f2 = b22;
                        f4 = f8;
                    }
                }
                jH_3 jH_36 = jH_33;
                jH_32 = jH_36;
                jH_36.l.I = jH_36.l.I.l((double)f2, (double)f3, (double)f4);
                return jH_32.l;
            }
            jH_33.l.I = new KH((double)jH_33.F.I.f(), (double)jH_33.F.J.f(), (double)jH_33.F.A.f());
        }
        jH_32 = jH_33;
        return jH_32.l;
    }

    /*
     * WARNING - void declaration
     */
    private static KH f(float f2, float f3, KH kH2) {
        void b2;
        KH c2 = kH2;
        float a2 = f2;
        return new KH(c2.j * (double)b2 - c2.J * (double)a2, c2.J * (double)b2 + c2.j * (double)a2, c2.k);
    }

    /*
     * WARNING - void declaration
     */
    private static KH J(float f2, float f3, KH kH2) {
        void b2;
        KH c2 = kH2;
        float a2 = f2;
        return new KH(c2.j * (double)b2 - c2.k * (double)a2, c2.J, c2.k * (double)b2 + c2.j * (double)a2);
    }
}

