/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EK
 *  FI
 *  JPa
 *  Ji
 *  KH
 *  NTa
 *  Oz
 *  QM
 *  Si
 *  Tg
 *  UG
 *  Uqa
 *  Vg
 *  Ypa
 *  aSa
 *  asa
 *  dN
 *  jO
 *  jh
 *  kta
 *  mka
 *  ni
 *  pKa
 *  pqa
 *  pua
 *  qh
 *  uKa
 *  ui
 *  vRa
 *  xy
 */
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ni_1
extends Tg {
    private UG a;
    private final EK b;
    private boolean l;
    private final qL e;
    private final kL G;
    private FI D;
    private int f;
    private long F;
    private final Vg g;
    private int L;
    private PG m;
    private long C;
    private static final KH i = new KH(aSa.V, vTa.x, aSa.V);
    private KH M;
    private final Vg k;
    private boolean j;
    private Vector3f A;
    private jh I;

    private void d(long a22) {
        ni_1 b2;
        ni_1 ni_12 = b2;
        KH a22 = ni_12.J(a22);
        float f2 = ni_12.G.f();
        ni_1 ni_13 = b2;
        ni_13.e = new xy(a22.j - (double)(f2 * b2.g.I.f()), a22.J - (double)(f2 * b2.g.J.f()), a22.k - (double)(f2 * b2.g.A.f()), a22.j + (double)(f2 * b2.g.I.f()), a22.J + (double)(f2 * b2.g.J.f()), a22.k + (double)(f2 * b2.g.A.f()));
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        ni_1 ni_12;
        ni_1 ni_13;
        KH kH2;
        void a22;
        ni_1 ni_14 = this;
        int n2 = (int)(ni_14.M - a22);
        int b22 = (int)(a22 - ni_14.f);
        if (b22 < 0) {
            return;
        }
        float f2 = pqa.r;
        if (b22 < ni_14.l) {
            f2 = (float)b22 / (float)ni_14.l;
        }
        if (n2 < ni_14.G) {
            f2 = (float)n2 / (float)ni_14.G;
        }
        if ((kH2 = ni_14.J((long)a22)) == i) {
            return;
        }
        ni_14.C((long)a22);
        ui b22 = null;
        if (ni_14.a != null) {
            if (ni_14.a.J()) {
                return;
            }
            ni_1 ni_15 = ni_14;
            ni_13 = ni_15;
            b22 = ni_15.a.J(ni_15.m);
            uKa.C((int)b22.I);
        } else {
            uKa.z();
            ni_13 = ni_14;
        }
        if (ni_13.j) {
            uKa.h();
        } else {
            uKa.m();
        }
        uKa.J(vRa.d != 0);
        ni_1 ni_16 = ni_14;
        ni_16.C();
        int a22 = ni_16.b.J();
        if (f2 != pqa.r) {
            int n3 = a22;
            a22 = ni_1.l((int)n3, (int)((int)((float)ni_1.J((int)n3) * f2)));
        }
        ni_1.J((int)a22);
        uKa.e();
        uKa.f((double)(kH2.j - RKa.k), (double)(kH2.J - RKa.C), (double)(kH2.k - RKa.f));
        if (ni_14.g.I.f() != pqa.r || ni_14.g.J.f() != pqa.r || ni_14.g.A.f() != pqa.r) {
            uKa.l((float)ni_14.g.I.f(), (float)ni_14.g.J.f(), (float)ni_14.g.A.f());
        }
        if (ni_14.e.J.f() != JPa.N) {
            uKa.J((float)ni_14.e.J.f(), (float)JPa.N, (float)JPa.N, (float)pqa.r);
        }
        if (ni_14.e.A.f() != JPa.N) {
            uKa.J((float)ni_14.e.A.f(), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        }
        if (ni_14.e.I.f() != JPa.N) {
            uKa.J((float)ni_14.e.I.f(), (float)pqa.r, (float)JPa.N, (float)JPa.N);
        }
        if (ni_14.I == jh.POINTS) {
            GL11.glPointSize(kta.v);
            ni_12 = ni_14;
        } else {
            if (ni_14.I == jh.LINES) {
                uKa.C((float)pqa.r);
            }
            ni_12 = ni_14;
        }
        ni_12.J(b22);
        uKa.D();
        ni_14.d();
        if (b22 == null) {
            uKa.H();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void C(long l2) {
        void a2;
        ni_1 ni_12 = this;
        if (ni_12.A == null || ni_12.C == a2) {
            return;
        }
        if (ni_12.C == nqa.i) {
            ni_12.C = a2;
            return;
        }
        float b2 = (float)((a2 - ni_12.C) % asa.fa) / Jpa.r;
        ni_1 ni_13 = ni_12;
        ni_12.e.I.f(ni_12.e.I.f() + ni_13.A.x * b2);
        ni_13.e.A.f(ni_12.e.A.f() + ni_12.A.y * b2);
        ni_12.e.J.f(ni_12.e.J.f() + ni_12.A.z * b2);
        ni_12.C = a2;
    }

    public void l() {
        ni_1 ni_12;
        ni_1 ni_13 = ni_12 = this;
        ni_1 a2 = ni_13.J(OT.e);
        ni_12.j = (float)(ni_1.J((double)(ni_13.C.A - ((KH)a2).j)) + ni_1.J((double)(ni_12.C.D - ((KH)a2).J)) + ni_1.J((double)(ni_12.C.g - ((KH)a2).k)));
        if (ni_13.D != null) {
            ni_12.d(OT.e);
        }
    }

    /*
     * WARNING - void declaration
     */
    private KH J(long l2) {
        void a22;
        ni_1 ni_12 = this;
        if (ni_12.M != null && ni_12.F == a22) {
            return ni_12.M;
        }
        ni_12.F = a22;
        KH a22 = new KH((double)ni_12.k.I.f(), (double)ni_12.k.J.f(), (double)ni_12.k.A.f());
        if (ni_12.D instanceof Ji) {
            Ji ji = (Ji)ni_12.D;
            ni_1 b2 = ji.J();
            if (b2 == null) {
                if (OT.e - ji.I > Uqa.o) {
                    ni_12.e();
                }
                ni_12.M = i;
                return ni_12.M;
            }
            a22 = a22.d((KH)b2);
        }
        ni_12.M = a22;
        return ni_12.M;
    }

    public void J(RN rN) {
        ni_1 ni_12;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object b2 = rN;
        ni_1 a2 = this;
        Object object5 = b2;
        super.J((RN)object5);
        if (!((RN)object5).hasESphere()) {
            return;
        }
        if ((b2 = ((RN)b2).getESphere()).hasRadius()) {
            Object object6 = b2;
            object4 = object6;
            a2.G.J(object6.getRadius());
        } else {
            if (b2.hasRadiusAnim()) {
                ni_1 ni_13 = a2;
                a2.G.J(b2.getRadiusAnim(), (int)ni_13.i, (K)ni_13.L);
            }
            object4 = b2;
        }
        if (object4.hasColor()) {
            Object object7 = b2;
            object3 = object7;
            a2.b.J(object7.getColor());
        } else {
            if (b2.hasColorAnim()) {
                ni_1 ni_14 = a2;
                a2.b.J(b2.getColorAnim(), (int)ni_14.i, (K)ni_14.L);
            }
            object3 = b2;
        }
        if (object3.getLocCount() == yRa.d) {
            ni_1 ni_15 = a2;
            ni_15.k.I.J(b2.getLoc(uSa.E));
            Object object8 = b2;
            object2 = object8;
            ni_15.k.J.J(object8.getLoc(vRa.d));
            ni_15.k.A.J(b2.getLoc(uqa.g));
        } else {
            if (b2.getLocAnimCount() == yRa.d) {
                ni_1 ni_16 = a2;
                ni_1 ni_17 = a2;
                ni_16.k.I.J(b2.getLocAnim(uSa.E), (int)ni_17.i, (K)ni_17.L);
                ni_1 ni_18 = a2;
                ni_16.k.J.J(b2.getLocAnim(vRa.d), (int)ni_18.i, (K)a2.L);
                ni_1 ni_19 = a2;
                ni_18.k.A.J(b2.getLocAnim(uqa.g), (int)ni_19.i, (K)ni_19.L);
            }
            object2 = b2;
        }
        if (object2.getScaleCount() == vRa.d) {
            ni_1 ni_110 = a2;
            ni_110.g.I.J(b2.getScale(uSa.E));
            Object object9 = b2;
            object = object9;
            ni_110.g.J.J(object9.getScale(uSa.E));
            ni_110.g.A.J(b2.getScale(uSa.E));
        } else if (b2.getScaleCount() == yRa.d) {
            ni_1 ni_111 = a2;
            ni_111.g.I.J(b2.getScale(uSa.E));
            Object object10 = b2;
            object = object10;
            ni_111.g.J.J(object10.getScale(vRa.d));
            ni_111.g.A.J(b2.getScale(uqa.g));
        } else if (b2.getScaleAnimCount() == vRa.d) {
            ni_1 ni_112 = a2;
            ni_1 ni_113 = a2;
            ni_112.g.I.J(b2.getScaleAnim(uSa.E), (int)ni_113.i, (K)a2.L);
            Object object11 = b2;
            object = object11;
            ni_1 ni_114 = a2;
            ni_113.g.J.J(object11.getScaleAnim(uSa.E), (int)ni_114.i, (K)ni_114.L);
            ni_1 ni_115 = a2;
            ni_112.g.A.J(b2.getScaleAnim(uSa.E), (int)ni_115.i, (K)ni_115.L);
        } else {
            if (b2.getScaleAnimCount() == yRa.d) {
                ni_1 ni_116 = a2;
                ni_1 ni_117 = a2;
                ni_116.g.I.J(b2.getScaleAnim(uSa.E), (int)ni_117.i, (K)ni_117.L);
                ni_1 ni_118 = a2;
                ni_116.g.J.J(b2.getScaleAnim(vRa.d), (int)ni_118.i, (K)a2.L);
                ni_1 ni_119 = a2;
                ni_118.g.A.J(b2.getScaleAnim(uqa.g), (int)ni_119.i, (K)ni_119.L);
            }
            object = b2;
        }
        if (object.getAngleCount() == vRa.d) {
            ni_1 ni_120 = a2;
            ni_12 = ni_120;
            ni_120.e.I.J(b2.getAngle(uSa.E));
            ni_120.e.A.J(b2.getAngle(uSa.E));
            ni_120.e.J.J(b2.getAngle(uSa.E));
        } else if (b2.getAngleCount() == yRa.d) {
            ni_1 ni_121 = a2;
            ni_12 = ni_121;
            ni_121.e.I.J(b2.getAngle(uSa.E));
            ni_121.e.A.J(b2.getAngle(vRa.d));
            ni_121.e.J.J(b2.getAngle(uqa.g));
        } else if (b2.getAngleAnimCount() == vRa.d) {
            ni_1 ni_122 = a2;
            ni_12 = ni_122;
            ni_1 ni_123 = a2;
            ni_122.e.I.J(b2.getAngleAnim(uSa.E), (int)ni_123.i, (K)ni_123.L);
            ni_1 ni_124 = a2;
            ni_122.e.A.J(b2.getAngleAnim(uSa.E), (int)ni_124.i, (K)a2.L);
            ni_1 ni_125 = a2;
            ni_124.e.J.J(b2.getAngleAnim(uSa.E), (int)ni_125.i, (K)ni_125.L);
        } else if (b2.getAngleAnimCount() == yRa.d) {
            ni_1 ni_126 = a2;
            ni_12 = ni_126;
            ni_1 ni_127 = a2;
            ni_126.e.I.J(b2.getAngleAnim(uSa.E), (int)ni_127.i, (K)ni_127.L);
            ni_1 ni_128 = a2;
            ni_126.e.A.J(b2.getAngleAnim(vRa.d), (int)ni_128.i, (K)a2.L);
            ni_1 ni_129 = a2;
            ni_128.e.J.J(b2.getAngleAnim(uqa.g), (int)ni_129.i, (K)ni_129.L);
        } else if (b2.getAngleAnimSmartCount() == vRa.d) {
            ni_1 ni_130 = a2;
            ni_12 = ni_130;
            ni_1 ni_131 = a2;
            ni_130.e.I.f(b2.getAngleAnimSmart(uSa.E), (int)ni_131.i, (K)ni_131.L);
            ni_1 ni_132 = a2;
            ni_130.e.A.f(b2.getAngleAnimSmart(uSa.E), (int)ni_132.i, (K)a2.L);
            ni_1 ni_133 = a2;
            ni_132.e.J.f(b2.getAngleAnimSmart(uSa.E), (int)ni_133.i, (K)ni_133.L);
        } else {
            if (b2.getAngleAnimSmartCount() == yRa.d) {
                ni_1 ni_134 = a2;
                ni_1 ni_135 = a2;
                ni_134.e.I.f(b2.getAngleAnimSmart(uSa.E), (int)ni_135.i, (K)ni_135.L);
                ni_1 ni_136 = a2;
                ni_134.e.A.f(b2.getAngleAnimSmart(vRa.d), (int)ni_136.i, (K)a2.L);
                ni_1 ni_137 = a2;
                ni_136.e.J.f(b2.getAngleAnimSmart(uqa.g), (int)ni_137.i, (K)ni_137.L);
            }
            ni_12 = a2;
        }
        ni_12.F = nqa.i;
        a2.d(OT.e);
    }

    public static /* synthetic */ String J(ni a2) {
        return new StringBuilder().insert(5 >> 3, Bra.l).append((String)a2.I).toString();
    }

    /*
     * WARNING - void declaration
     */
    private void J(ui ui2) {
        ni_1 ni_12;
        ni_1 ni_13 = ni_12 = this;
        float f2 = ni_13.G.f();
        float f3 = ni_13.l ? vqa.T : pqa.r;
        float f4 = pua.j / (float)ni_12.L;
        float f5 = Ypa.Ha / (float)ni_12.f;
        pKa pKa2 = pKa.J();
        ni_1 b2 = pKa2.J();
        if (ni_12.I == jh.FILL) {
            float f6;
            int n2;
            int n3;
            int n4;
            int n5;
            float f7;
            float f8;
            float f9;
            float f10;
            int n6;
            void a2;
            if (a2 == null) {
                ni_1 ni_14 = b2;
                ni_14.J(uua.p, mka.J);
                ni_14.J(aSa.V, aSa.V, f3 * f2).J(JPa.N, JPa.N, pqa.r).M();
                int n7 = n6 = uSa.E;
                while (n7 <= ni_12.f) {
                    f10 = n6 == ni_12.f ? JPa.N : (float)n6 * f5;
                    f9 = -Oz.d((float)f10) * Oz.d((float)f4);
                    f8 = Oz.C((float)f10) * Oz.d((float)f4);
                    f7 = f3 * Oz.C((float)f4);
                    b2.J(f9 * f2, f8 * f2, f7 * f2).J(f9 * f3, f8 * f3, f7 * f3).M();
                    n7 = ++n6;
                }
                pKa2.J();
            }
            float f11 = pqa.r / (float)ni_12.f;
            float f12 = pqa.r / (float)ni_12.L;
            float f13 = pqa.r;
            if (a2 != null) {
                n5 = uSa.E;
                n4 = ni_12.L;
                n3 = n5;
            } else {
                n5 = vRa.d;
                n4 = ni_12.L - vRa.d;
                n3 = n5;
            }
            int n8 = n2 = n3;
            while (n8 < n4) {
                f6 = (float)n2 * f4;
                ni_1 ni_15 = b2;
                if (a2 == null) {
                    ni_15.J(Yqa.i, mka.J);
                } else {
                    ni_15.J(Yqa.i, mka.g);
                }
                float f14 = JPa.N;
                int n9 = uSa.E;
                while (n9 <= ni_12.f) {
                    f10 = n6 == ni_12.f ? JPa.N : (float)n6 * f5;
                    f9 = -Oz.d((float)f10) * Oz.d((float)f6);
                    f8 = Oz.C((float)f10) * Oz.d((float)f6);
                    f7 = f3 * Oz.C((float)f6);
                    b2.J(f9 * f2, f8 * f2, f7 * f2);
                    if (a2 != null) {
                        void v7 = a2;
                        void v8 = a2;
                        b2.J(a2.A + f14 * (v7.k - v7.A), a2.j + f13 * (v8.J - v8.j));
                    }
                    b2.J(f9 * f3, f8 * f3, f7 * f3);
                    ni_1 ni_16 = b2;
                    ni_16.M();
                    f9 = -Oz.d((float)f10) * Oz.d((float)(f6 + f4));
                    f8 = Oz.C((float)f10) * Oz.d((float)(f6 + f4));
                    f7 = f3 * Oz.C((float)(f6 + f4));
                    ni_16.J(f9 * f2, f8 * f2, f7 * f2);
                    if (a2 != null) {
                        void v10 = a2;
                        void v11 = a2;
                        b2.J(a2.A + f14 * (v10.k - v10.A), a2.j + (f13 - f12) * (v11.J - v11.j));
                    }
                    b2.J(f9 * f3, f8 * f3, f7 * f3);
                    b2.M();
                    f14 += f11;
                    n9 = ++n6;
                }
                pKa2.J();
                f13 -= f12;
                n8 = ++n2;
            }
            if (a2 == null) {
                ni_1 ni_17 = b2;
                ni_17.J(uua.p, mka.J);
                ni_17.J(aSa.V, aSa.V, -f2 * f3);
                b2.J(JPa.N, JPa.N, vqa.T);
                b2.M();
                f6 = pua.j - f4;
                n6 = ni_12.f;
                int n10 = n6;
                while (n10 >= 0) {
                    f10 = n6 == ni_12.f ? JPa.N : (float)n6 * f5;
                    f9 = -Oz.d((float)f10) * Oz.d((float)f6);
                    f8 = Oz.C((float)f10) * Oz.d((float)f6);
                    f7 = f3 * Oz.C((float)f6);
                    b2.J(f9 * f2, f8 * f2, f7 * f2);
                    b2.J(f9 * f3, f8 * f3, f7 * f3);
                    b2.M();
                    n10 = --n6;
                }
                pKa2.J();
                return;
            }
        } else if (ni_12.I == jh.LINES) {
            float f15;
            float f16;
            float f17;
            float f18;
            int n11;
            float f19;
            int n12;
            int n13 = n12 = vRa.d;
            while (n13 < ni_12.L) {
                f19 = (float)n12 * f4;
                b2.J(uqa.g, mka.J);
                int n14 = uSa.E;
                while (n14 < ni_12.f) {
                    f18 = (float)n11 * f5;
                    f17 = Oz.C((float)f18) * Oz.d((float)f19);
                    f16 = Oz.d((float)f18) * Oz.d((float)f19);
                    f15 = Oz.C((float)f19);
                    b2.J(f17 * f2, f16 * f2, f15 * f2);
                    b2.J(f17 * f3, f16 * f3, f15 * f3);
                    b2.M();
                    n14 = ++n11;
                }
                pKa2.J();
                n13 = ++n12;
            }
            int n15 = n11 = uSa.E;
            while (n15 < ni_12.f) {
                f18 = (float)n11 * f5;
                b2.J(yRa.d, mka.J);
                int n16 = uSa.E;
                while (n16 <= ni_12.L) {
                    f19 = (float)n12 * f4;
                    f17 = Oz.C((float)f18) * Oz.d((float)f19);
                    f16 = Oz.d((float)f18) * Oz.d((float)f19);
                    f15 = Oz.C((float)f19);
                    b2.J(f17 * f2, f16 * f2, f15 * f2);
                    b2.J(f17 * f3, f16 * f3, f15 * f3);
                    b2.M();
                    n16 = ++n12;
                }
                pKa2.J();
                n15 = ++n11;
            }
        } else if (ni_12.I == jh.POINTS) {
            ni_1 ni_18 = b2;
            ni_18.J(uSa.E, mka.J);
            ni_18.J(aSa.V, aSa.V, f2);
            b2.J(JPa.N, JPa.N, f3);
            ni_1 ni_19 = b2;
            ni_19.M();
            ni_19.J(aSa.V, aSa.V, -f2);
            b2.J(JPa.N, JPa.N, -f3);
            b2.M();
            int n17 = vRa.d;
            int n18 = n17;
            while (n18 < ni_12.L - vRa.d) {
                float f20 = (float)n17 * f4;
                int n19 = uSa.E;
                while (n19 < ni_12.f) {
                    int n20;
                    float f21 = (float)n20 * f5;
                    float f22 = Oz.C((float)f21) * Oz.d((float)f20);
                    float f23 = Oz.d((float)f21) * Oz.d((float)f20);
                    float f24 = Oz.C((float)f20);
                    b2.J(f22 * f2, f23 * f2, f24 * f2);
                    b2.J(f22 * f3, f23 * f3, f24 * f3);
                    b2.M();
                    n19 = ++n20;
                }
                n18 = ++n17;
            }
            pKa2.J();
        }
    }

    public ni_1(dN dN2) {
        ni_1 ni_12;
        String string;
        ni_1 ni_13;
        ni_1 ni_14;
        ni_1 a2;
        ni_1 b2 = dN2;
        ni_1 ni_15 = a2 = this;
        ni_1 ni_16 = a2;
        super((dN)b2);
        ni_16.A = null;
        a2.l = uSa.E;
        ni_16.f = pua.o;
        ni_16.L = pua.o;
        ni_16.I = jh.FILL;
        ni_16.G = kL.f();
        ni_1 ni_17 = a2;
        ni_16.b = new EK(pua.o);
        ni_16.C = nqa.i;
        ni_15.j = uSa.E;
        ni_15.M = null;
        ni_15.F = nqa.i;
        b2 = b2.getESphere();
        if (b2.getLocCount() == 0) {
            ni_14 = b2;
            a2.k = new Vg(JPa.N);
        } else {
            a2.k = new Vg(b2.getLocList());
            ni_14 = b2;
        }
        if (ni_14.getScaleCount() == 0) {
            ni_13 = a2;
            a2.g = new Vg(pqa.r);
        } else {
            ni_13 = a2;
            a2.g = new Vg(b2.getScaleList());
        }
        ni_13.e = new qL(b2.getAngleX(), b2.getAngleY(), b2.getAngleZ());
        if (b2.hasRadius()) {
            a2.G.J(b2.getRadius());
        }
        if (b2.hasColor()) {
            a2.b.J(b2.getColor());
        }
        if (b2.hasStacks()) {
            a2.L = b2.getStacks();
        }
        if (b2.hasSlices()) {
            a2.f = b2.getSlices();
        }
        if (b2.hasStyle()) {
            a2.I = jh.fromProto((jO)b2.getStyle());
        }
        if (b2.hasAttachment()) {
            a2.D = FI.J((QM)b2.getAttachment());
        }
        if (b2.hasAngleRotationX() || b2.hasAngleRotationY() || b2.hasAngleRotationZ()) {
            a2.A = new Vector3f(b2.getAngleRotationX(), b2.getAngleRotationY(), b2.getAngleRotationZ());
        }
        if (b2.hasCulling()) {
            a2.j = b2.getCulling();
        }
        String string2 = null;
        if (b2.hasTextureResource()) {
            string = string2 = OT.i.C.J(b2.getTextureResource());
        } else {
            if (b2.hasTexturePath()) {
                string2 = b2.getTexturePath();
            }
            string = string2;
        }
        if (string != null) {
            a2.a = OT.i.g.J(new qh(string2), Si.J((ni)a2));
            a2.m = new PG(a2.f);
        }
        if (a2.L == pua.o && a2.f == pua.o) {
            ni_1 ni_18 = a2;
            ni_18.f = ni_18.L = NTa.C;
            ni_12 = a2;
        } else {
            if (a2.L == pua.o || a2.f == pua.o) {
                a2.f = a2.L = Math.max(a2.L, a2.f);
            }
            ni_12 = a2;
        }
        ni_12.d(OT.e);
    }

    public void l(long a2) {
        ni_1 b2;
        if (b2.D != null || b2.k.J() + b2.g.J() + b2.G.i != nqa.i) {
            b2.d(a2);
        }
    }
}

