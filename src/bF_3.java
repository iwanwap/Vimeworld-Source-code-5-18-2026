/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  aSa
 *  kpa
 *  pua
 *  uKa
 *  vL
 *  vRa
 *  xJa
 */
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bF_3 {
    private double E;
    private int m;
    public int C;
    private boolean i;
    public float M;
    private double k;
    private int j;
    private double J;
    private boolean A;
    private Kpa I;

    public void C() {
        a.i = uSa.E;
    }

    public bF_3(Kpa kpa2) {
        bF_3 a2;
        bF_3 b2 = kpa2;
        bF_3 bF_32 = a2 = this;
        a2.i = uSa.E;
        a2.A = uSa.E;
        a2.j = pua.o;
        a2.m = uSa.E;
        a2.E = aSa.V;
        a2.J = aSa.V;
        bF_32.k = aSa.V;
        bF_32.I = b2;
        bF_32.j = xJa.J((int)vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2, float f2) {
        void a2;
        void b2;
        boolean d2 = bl;
        bF_3 c2 = this;
        if (c2.A != d2) {
            c2.i = uSa.E;
        }
        bF_3 bF_32 = c2;
        bF_32.A = d2;
        bF_32.C = b2;
        c2.M = a2;
    }

    public boolean J() {
        bF_3 bF_32 = this;
        if (!bF_32.i) {
            return vRa.d != 0;
        }
        bF_3 bF_33 = bF_32;
        if (bF_33.C >= bF_33.m + kTa.j) {
            return vRa.d != 0;
        }
        bF_3 bF_34 = bF_32;
        bF_3 a2 = bF_34.I.J();
        int n2 = bF_34.J + (double)a2.l() < kpa.t + (double)(bF_32.I.z.Y * PRa.E) ? vRa.d : uSa.E;
        int n3 = a2 = ((vL)a2).ba + (double)a2.l() < kpa.t + (double)(bF_32.I.z.Y * PRa.E) ? vRa.d : uSa.E;
        if (a2 != n2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        bF_3 a2;
        GL11.glEndList();
        bF_3 bF_32 = a2;
        bF_32.m = bF_32.C;
        bF_32.E = bF_32.I.J().c;
        bF_32.J = bF_32.I.J().ba;
        bF_32.k = bF_32.I.J().r;
        bF_32.i = vRa.d;
        uKa.M();
    }

    public void f() {
        bF_3 bF_32;
        bF_3 bF_33;
        bF_3 bF_34 = bF_33 = this;
        bF_3 a22 = bF_34.I.J();
        double d2 = ((vL)a22).c + (((vL)a22).la - ((vL)a22).c) * (double)bF_33.M;
        bF_3 bF_35 = a22;
        double d3 = ((vL)a22).ba + (((vL)bF_35).Z - ((vL)a22).ba) * (double)bF_33.M;
        double d4 = ((vL)bF_35).r + (((vL)a22).A - ((vL)a22).r) * (double)bF_33.M;
        double d5 = (float)(bF_34.C - bF_33.m) + bF_33.M;
        bF_3 bF_36 = bF_33;
        float a22 = (float)(d2 - bF_36.E + d5 * mPa.ia);
        float f2 = (float)(d3 - bF_33.J);
        float f3 = (float)(d4 - bF_33.k);
        uKa.e();
        if (bF_36.A) {
            uKa.J((float)(-a22 / Fua.Y), (float)(-f2), (float)(-f3 / Fua.Y));
            bF_32 = bF_33;
        } else {
            uKa.J((float)(-a22), (float)(-f2), (float)(-f3));
            bF_32 = bF_33;
        }
        uKa.l((int)bF_32.j);
        uKa.D();
        uKa.M();
    }

    public void J() {
        bF_3 a2;
        GL11.glNewList(a2.j, Wqa.O);
    }
}

