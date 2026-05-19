/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kh
 *  MQa
 *  Oz
 *  Pq
 *  XM
 *  aKa
 *  aSa
 *  cI
 *  cRa
 *  fO
 *  k
 *  mka
 *  pKa
 *  pqa
 *  pua
 *  qP
 *  uKa
 */
public class Pq_1
extends nP {
    private static final double M = 0.5;
    public int k;
    public int j;
    private static final double J = 0.25;
    public kL A;

    /*
     * WARNING - void declaration
     */
    public Pq_1(k k2, XM xM2) {
        void a2;
        Pq_1 c2 = k2;
        Pq_1 b2 = this;
        super((k)c2, (XM)a2);
        Pq_1 pq_1 = b2;
        b2.A = new kL(MQa.L);
        pq_1.j = pua.o;
        c2 = a2.getEProgressBar();
        if (c2.hasProgress()) {
            b2.A.J(Oz.J((float)c2.getProgress(), (float)JPa.N, (float)pqa.r));
        }
        b2.k = c2.getBarColor();
        if (c2.hasBorderColor()) {
            b2.j = c2.getBorderColor();
        }
    }

    @Override
    public void J(long l2) {
        Pq_1 pq_1;
        Pq_1 pq_12;
        Pq_1 pq_13 = pq_12 = this;
        float a2 = pq_13.J();
        float f2 = pq_13.f();
        Pq_1 pq_14 = pq_12;
        float b2 = a2 * Oz.J((float)pq_14.A.f(), (float)JPa.N, (float)pqa.r);
        if (pq_14.I.f() > JPa.N) {
            cI.J((Runnable)qP.J((Pq)pq_12, (float)a2, (float)f2));
        }
        Kh.J((double)aSa.V, (double)aSa.V, (double)b2, (double)f2, (int)pq_12.x.J);
        if (pq_12.C != null) {
            Pq_1 pq_15 = pq_12;
            pq_1 = pq_15;
            int n2 = pq_15.l(pq_15.C.J());
            int n3 = pq_15.l(pq_15.m.J());
            Kh.J((double)b2, (double)aSa.V, (double)(a2 - b2), (double)f2, (int)n2, (int)n3);
        } else {
            Pq_1 pq_16 = pq_12;
            Kh.J((double)b2, (double)aSa.V, (double)(a2 - b2), (double)f2, (int)pq_16.l(pq_16.k));
            pq_1 = pq_12;
        }
        if (pq_1.j != pua.o) {
            aKa aKa2;
            uKa.C((float)(MQa.L * (float)eq.A.l()));
            uKa.z();
            Pq_1 pq_17 = pq_12;
            Pq_1.J(pq_17.l(pq_17.j));
            pKa pKa2 = pKa.J();
            aKa aKa3 = aKa2 = pKa2.J();
            aKa aKa4 = aKa2;
            aKa4.J(uqa.g, mka.M);
            aKa4.J(Nta.a, Nta.a, aSa.V).M();
            aKa3.J((double)a2 + VPa.W, Nta.a, aSa.V).M();
            aKa3.J((double)a2 + VPa.W, (double)f2 + VPa.W, aSa.V).M();
            aKa3.J(Nta.a, (double)f2 + VPa.W, aSa.V).M();
            pKa2.J();
            uKa.H();
        }
        if (pq_12.I.f() > JPa.N) {
            cI.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Pq pq2, float f2, float f3) {
        void b2;
        float c2 = f3;
        Pq a2 = pq2;
        Kh.J((double)aSa.V, (double)aSa.V, (double)((double)b2), (double)c2, (int)cRa.r, (double)(a2.I.f() * a2.k.f()));
    }

    @Override
    public void J(fO fO2) {
        Object b2 = fO2;
        Pq_1 a2 = this;
        Pq_1 pq_1 = b2;
        super.J((fO)pq_1);
        if (!pq_1.hasEProgressBar()) {
            return;
        }
        if (((On)(b2 = b2.getEProgressBar())).hasProgress()) {
            a2.A.J(Oz.J((float)((On)b2).getProgress(), (float)JPa.N, (float)pqa.r), a2.L.C, a2.L.A);
        }
        if (((On)b2).hasBarColor()) {
            a2.k = ((On)b2).getBarColor();
        }
        if (((On)b2).hasBorderColor()) {
            a2.j = ((On)b2).getBorderColor();
        }
    }
}

