/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  Cia
 *  Dla
 *  Gg
 *  JPa
 *  Kna
 *  Kpa
 *  Lra
 *  MQa
 *  Tsa
 *  VQa
 *  XTa
 *  YTa
 *  Yra
 *  ZJa
 *  Zsa
 *  aKa
 *  aSa
 *  ata
 *  fSa
 *  iTa
 *  ita
 *  kpa
 *  lSa
 *  ld
 *  mTa
 *  mka
 *  mta
 *  pKa
 *  pqa
 *  rTa
 *  tsa
 *  uKa
 *  uTa
 *  vL
 *  vPa
 *  vRa
 *  xta
 */
import org.lwjgl.opengl.GL11;

public final class WTa_1 {
    public static float m;
    public static vL C;
    public static boolean i;
    public static float M;
    public static final float k = 0.1f;
    public static Kpa j;
    public static final float J = 70.0f;
    public static final float A = 0.5f;
    public static long I;

    public WTa_1() {
        WTa_1 a2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void J(iTa iTa2, float f2) {
        float b2 = f2;
        iTa a2 = iTa2;
        if (!mTa.M.J()) {
            if (mTa.E == null) return;
            if (a2 == iTa.START) {
                mTa.E.J(b2);
                WTa_1.j.R.p = mTa.j;
                return;
            }
            I = System.nanoTime();
            if (m != WTa_1.j.z.LA) {
                m = M = WTa_1.j.z.LA;
            }
            WTa_1.j.z.LA = M;
            return;
        }
        if (WTa_1.j.c == null || WTa_1.j.Ta == null) return;
        if (a2 == iTa.START) {
            if (WTa_1.j.Ra) {
                if (mTa.E == null) {
                    if (Cia.J((mIa)Tsa.M)) {
                        m = WTa_1.j.c.q() ? (m -= pqa.r) : (m -= Nra.e);
                    }
                    if (Cia.J((mIa)Tsa.i)) {
                        m = WTa_1.j.c.q() ? (m += pqa.r) : (m += Nra.e);
                    }
                    if (Cia.J((mIa)Tsa.I)) {
                        m = M;
                    }
                    WTa_1.j.z.LA = m;
                    if (Cia.J((mIa)Tsa.m)) {
                        mTa.j -= MQa.L;
                    }
                    if (Cia.J((mIa)Tsa.j)) {
                        mTa.j += MQa.L;
                    }
                    if (Cia.J((mIa)Tsa.k)) {
                        mTa.j = JPa.N;
                    }
                    if (Tsa.J.isPressed()) {
                        mTa.k.add(new YTa());
                        xta.J((u)WTa_1.j.c, (String)new StringBuilder().insert(3 >> 2, PRa.Da).append(mTa.k.size()).append(LPa.H).toString());
                    }
                } else {
                    mTa.E.J(b2);
                }
                WTa_1.j.R.p = mTa.j;
                if (!Tsa.C.isPressed()) return;
                if (mTa.E != null) {
                    mTa.E.l();
                    mTa.E = null;
                    return;
                }
                mTa.e();
                return;
            }
            if (M != WTa_1.j.z.LA) {
                m = M = WTa_1.j.z.LA;
            }
            WTa_1.j.z.LA = m;
            return;
        }
        I = System.nanoTime();
        if (m != WTa_1.j.z.LA) {
            m = M = WTa_1.j.z.LA;
        }
        WTa_1.j.z.LA = M;
    }

    static {
        j = Kpa.J();
        i = uSa.E;
        M = UOa.d;
        m = UOa.d;
    }

    public static void J(Sx sx2, vL vL2) {
        Sx b2 = vL2;
        Sx a2 = sx2;
        if (!i) {
            return;
        }
        mTa.C = b2;
        a2.J((ld)new CY(new StringBuilder().insert(2 & 5, Yra.u).append(b2.J()).append(VQa.ja).toString()));
        i = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(double d2, double d3, double d4, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        void j2;
        void b2;
        void c2;
        void d5;
        void h2;
        void i2;
        void e2;
        void f12;
        void g2;
        void k2;
        void l2;
        double m2;
        float f13 = f2;
        f2 = f11;
        float a2 = f13;
        uKa.e();
        uKa.f((double)m2, (double)l2, (double)k2);
        uKa.o();
        uKa.J((float)g2, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.J((float)f12, (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)e2, (float)JPa.N, (float)JPa.N, (float)pqa.r);
        uKa.l((float)a2, (float)i2, (float)h2);
        uKa.f((float)d5, (float)c2, (float)b2, (float)j2);
        GL11.glBegin(WOa.fa);
        GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
        GL11.glVertex3f(vPa.b, MQa.L, MQa.L);
        GL11.glVertex3f(MQa.L, MQa.L, MQa.L);
        GL11.glVertex3f(MQa.L, MQa.L, vPa.b);
        GL11.glVertex3f(vPa.b, MQa.L, vPa.b);
        GL11.glEnd();
        GL11.glBegin(WOa.fa);
        GL11.glNormal3f(JPa.N, JPa.N, pqa.r);
        GL11.glVertex3f(MQa.L, vPa.b, MQa.L);
        GL11.glVertex3f(MQa.L, MQa.L, MQa.L);
        GL11.glVertex3f(vPa.b, MQa.L, MQa.L);
        GL11.glVertex3f(vPa.b, vPa.b, MQa.L);
        GL11.glEnd();
        GL11.glBegin(WOa.fa);
        GL11.glNormal3f(pqa.r, JPa.N, JPa.N);
        GL11.glVertex3f(MQa.L, MQa.L, vPa.b);
        GL11.glVertex3f(MQa.L, MQa.L, MQa.L);
        GL11.glVertex3f(MQa.L, vPa.b, MQa.L);
        GL11.glVertex3f(MQa.L, vPa.b, vPa.b);
        GL11.glEnd();
        GL11.glBegin(WOa.fa);
        GL11.glNormal3f(vqa.T, JPa.N, JPa.N);
        GL11.glVertex3f(vPa.b, vPa.b, MQa.L);
        GL11.glVertex3f(vPa.b, MQa.L, MQa.L);
        GL11.glVertex3f(vPa.b, MQa.L, vPa.b);
        GL11.glVertex3f(vPa.b, vPa.b, vPa.b);
        GL11.glEnd();
        GL11.glBegin(WOa.fa);
        GL11.glNormal3f(JPa.N, vqa.T, JPa.N);
        GL11.glVertex3f(MQa.L, vPa.b, MQa.L);
        GL11.glVertex3f(vPa.b, vPa.b, MQa.L);
        GL11.glVertex3f(vPa.b, vPa.b, vPa.b);
        GL11.glVertex3f(MQa.L, vPa.b, vPa.b);
        GL11.glEnd();
        GL11.glBegin(WOa.fa);
        GL11.glNormal3f(JPa.N, JPa.N, vqa.T);
        GL11.glVertex3f(MQa.L, MQa.L, vPa.b);
        GL11.glVertex3f(MQa.L, vPa.b, vPa.b);
        GL11.glVertex3f(vPa.b, vPa.b, vPa.b);
        GL11.glVertex3f(vPa.b, MQa.L, vPa.b);
        GL11.glEnd();
        uKa.D();
    }

    public static void f(Sx sx2, Dla dla2, float f2, double d2, double d3, double d4) {
        float f3 = f2;
        Sx d5 = sx2;
        if (mTa.E instanceof hsa) {
            C = WTa_1.j.u;
            WTa_1.j.u = WTa_1.j.c;
        }
    }

    public static void J(Sx sx2, Dla dla2, float f2, double d2, double d3, double d4) {
        float f3 = f2;
        Sx d5 = sx2;
        if (mTa.E instanceof hsa) {
            WTa_1.j.u = C;
        }
    }

    public static void J(mta<rTa> mta2, rTa rTa2) {
        rTa b2 = rTa2;
        mta<rTa> a2 = mta2;
        double d2 = kTa.j * (a2.A.size() - vRa.d);
        uKa.e();
        uKa.f((float)((float)b2.x), (float)((float)b2.y), (float)((float)b2.z));
        uKa.f((double)(-RKa.k), (double)(-RKa.C + (double)WTa_1.j.c.l() - tpa.k), (double)(-RKa.f));
        uKa.C((float)pqa.r);
        GL11.glBegin(yRa.d);
        int n2 = b2 = uSa.E;
        while ((double)n2 < d2) {
            double d3 = (double)b2 / d2;
            rTa rTa3 = (rTa)a2.J(d3);
            GL11.glVertex3d(rTa3.x, rTa3.y, rTa3.z);
            n2 = ++b2;
        }
        mta<rTa> mta3 = a2;
        b2 = (rTa)mta3.A.get(mta3.A.size() - vRa.d);
        GL11.glVertex3d(b2.x, b2.y, b2.z);
        GL11.glEnd();
        uKa.D();
    }

    public static void J(ZJa zJa2, float f2) {
        ZJa zJa3 = zJa2;
        if (!mTa.M.J()) {
            return;
        }
        int a2 = uSa.E;
        for (uTa uTa2 : uTa.M.values()) {
            if (!uTa2.I) continue;
            a2 = vRa.d;
            break;
        }
        if (mTa.E == null && a2 != 0 && mTa.k.size() > uqa.g) {
            int n2;
            uKa.B();
            uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
            uKa.z();
            uKa.J(uSa.E != 0);
            rTa[] b2 = new rTa[mTa.k.size()];
            int n3 = n2 = uSa.E;
            while (n3 < b2.length) {
                b2[n2] = new rTa(((YTa)mTa.k.get((int)n2)).x, ((YTa)mTa.k.get((int)n2)).y, ((YTa)mTa.k.get((int)n2)).z);
                uKa.e();
                uKa.f((double)(-RKa.k), (double)(-RKa.C + (double)WTa_1.j.c.l() - tpa.k), (double)(-RKa.f));
                WTa_1.J(((rTa)b2[n2]).x, ((rTa)b2[n2]).y, ((rTa)b2[n2]).z, Nra.e, Nra.e, Nra.e, JPa.N, JPa.N, JPa.N, pqa.r, pqa.r, pqa.r, pqa.r);
                float cfr_ignored_0 = RKa.E.i;
                float cfr_ignored_1 = RKa.E.F;
                WTa_1.J(n2 + vRa.d + Mqa.y, (float)((rTa)b2[n2]).x, (float)((rTa)b2[n2]).y + Xpa.R, (float)((rTa)b2[n2]).z, PRa.U);
                uKa.J(uSa.E != 0);
                uKa.z();
                uKa.D();
                n3 = ++n2;
            }
            if (uTa.A.I) {
                WTa_1.J((mta<rTa>)new ita((fSa[])b2), new rTa(oua.i, oua.i, oua.i));
            }
            if (uTa.k.I) {
                WTa_1.J((mta<rTa>)new tsa((fSa[])b2), new rTa(oua.i, aSa.V, aSa.V));
            }
            if (uTa.j.I) {
                WTa_1.J((mta<rTa>)new lSa((fSa[])b2), new rTa(aSa.V, oua.i, aSa.V));
            }
            if (uTa.J.I) {
                WTa_1.J((mta<rTa>)new Zsa((fSa[])b2), new rTa(aSa.V, aSa.V, oua.i));
            }
            uKa.J(vRa.d != 0);
            uKa.H();
            uKa.B();
            uKa.M();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(String string, double d2, double d3, double d4, int n2) {
        aKa aKa2;
        void b2;
        void c2;
        void d5;
        String string2 = string;
        Kna a2 = WTa_1.j.Ea;
        float e22 = ySa.Da;
        e22 = rta.D * e22;
        uKa.e();
        uKa.J((float)((float)d5 + JPa.N), (float)((float)c2), (float)((float)b2));
        GL11.glNormal3f(JPa.N, pqa.r, JPa.N);
        uKa.J((float)(-WTa_1.j.J().c), (float)JPa.N, (float)pqa.r, (float)JPa.N);
        uKa.J((float)WTa_1.j.J().l, (float)pqa.r, (float)JPa.N, (float)JPa.N);
        uKa.l((float)(-e22), (float)(-e22), (float)e22);
        uKa.L();
        uKa.J(uSa.E != 0);
        uKa.u();
        uKa.B();
        uKa.J((int)Lra.k, (int)kpa.J, (int)vRa.d, (int)uSa.E);
        int e22 = a2.J(string2) / uqa.g;
        pKa pKa2 = pKa.J();
        aKa aKa3 = aKa2 = pKa2.J();
        int n3 = e22;
        aKa aKa4 = aKa2;
        aKa4.J(XTa.W, mka.I);
        aKa4.J((double)(-e22 - vRa.d), pqa.q, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
        aKa2.J((double)(-n3 - vRa.d), Wqa.Z, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
        aKa3.J((double)(n3 + vRa.d), Wqa.Z, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
        aKa3.J((double)(e22 + vRa.d), pqa.q, aSa.V).J(JPa.N, JPa.N, JPa.N, rta.o).M();
        pKa2.J();
        uKa.H();
        uKa.J(vRa.d != 0);
        Kna kna2 = a2;
        kna2.J(string2, -kna2.J(string2) / uqa.g, uSa.E, kua.r);
        uKa.k();
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        uKa.D();
    }

    /*
     * WARNING - void declaration
     */
    public static void J(Sx sx2, cua cua2, Gg gg2, XF xF2, DZ dZ2) {
        void d2;
        Object e2 = xF2;
        Sx b2 = sx2;
        if (!i) {
            return;
        }
        if (d2 == cua.RIGHT_CLICK_BLOCK) {
            mTa.C = new ata(e2.getX(), e2.getY(), e2.getZ());
            b2.J((ld)new CY(new StringBuilder().insert(5 >> 3, Yra.u).append(mTa.C).append(VQa.ja).toString()));
            i = uSa.E;
        }
    }
}

