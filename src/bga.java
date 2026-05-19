/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Hba
 *  JPa
 *  MD
 *  Qia
 *  Qqa
 *  YSa
 *  Yfa
 *  gFa
 *  lqa
 *  vL
 *  vRa
 *  vfa
 */
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class bga
extends Yfa {
    public static final UUID i = UUID.fromString(hpa.C);
    private XF M;
    private gFa j;
    private float J;
    public static final CEa A = new CEa(i, Asa.Ka, KPa.y, uqa.g).J(uSa.E != 0);
    private boolean I;

    public void W() {
        a.J = vqa.T;
    }

    public boolean T() {
        bga a2;
        if (a2.J != vqa.T) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public bga(Gg gg2) {
        bga b2 = gg2;
        bga a2 = this;
        super((Gg)b2);
        a2.M = XF.ORIGIN;
        a2.J = vqa.T;
        bga bga2 = a2;
        a2.j = new Qia(a2, oua.i);
    }

    public float J(XF xF2) {
        Object b2 = xF2;
        bga a2 = this;
        return JPa.N;
    }

    public boolean X() {
        bga a2;
        if (!a2.e.f()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean V() {
        bga a2;
        bga bga2 = a2;
        bga bga3 = a2;
        return bga3.J(new XF((vL)bga3));
    }

    public void x() {
        bga bga2;
        bga bga3 = bga2 = this;
        super.x();
        if (bga3.S() && bga2.l() != null && bga2.l().j == bga2.j) {
            bga bga4 = bga2;
            vL vL2 = bga4.l();
            bga4.J(new XF((int)vL2.la, (int)vL2.Z, (int)vL2.A), tTa.h);
            float a2 = bga2.J(vL2);
            if (bga4 instanceof vfa && ((vfa)bga2).v()) {
                if (a2 > FRa.Ga) {
                    bga2.J(vRa.d != 0, vRa.d != 0);
                }
                return;
            }
            if (!bga2.I) {
                bga bga5 = bga2;
                bga2.D.J(uqa.g, bga5.j);
                if (bga5.J() instanceof Hba) {
                    ((Hba)bga2.J()).J(uSa.E != 0);
                }
                bga2.I = vRa.d;
            }
            bga2.D(a2);
            if (a2 > YSa.G) {
                bga2.J().J(vL2, oua.i);
            }
            if (a2 > lqa.ga) {
                vL vL3 = vL2;
                double d2 = (vL3.la - bga2.la) / (double)a2;
                double d3 = (vL3.Z - bga2.Z) / (double)a2;
                bga bga6 = bga2;
                double d4 = (vL3.A - bga6.A) / (double)a2;
                bga bga7 = bga2;
                double d5 = d2;
                bga7.f((double)(bga7.i + d5 * Math.abs(d5) * Qqa.b));
                double d6 = d3;
                bga7.J(bga7.Ea + d6 * Math.abs(d6) * Qqa.b);
                double d7 = d4;
                bga6.l(bga7.f + d7 * Math.abs(d7) * Qqa.b);
            }
            if (a2 > FRa.Ga) {
                bga2.J(vRa.d != 0, vRa.d != 0);
                return;
            }
        } else if (!bga2.S() && bga2.I) {
            bga2.I = uSa.E;
            bga bga8 = bga2;
            bga2.D.J(bga8.j);
            if (bga8.J() instanceof Hba) {
                ((Hba)bga2.J()).J(vRa.d != 0);
            }
            bga2.W();
        }
    }

    public boolean J(XF xF2) {
        Object b2 = xF2;
        bga a2 = this;
        if (a2.J == vqa.T) {
            return vRa.d != 0;
        }
        bga bga2 = a2;
        if (a2.M.distanceSq((MD)b2) < (double)(bga2.J * bga2.J)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float F() {
        bga a2;
        return a2.J;
    }

    public XF f() {
        bga a2;
        return a2.M;
    }

    public boolean w() {
        bga a2;
        if (super.w()) {
            bga bga2 = a2;
            bga bga3 = a2;
            XF xF2 = new XF(bga3.la, a2.J().j, (double)a2.A);
            if (bga3.J(xF2) >= JPa.N) {
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public void D(float f2) {
        float b2 = f2;
        bga bga2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, int n2) {
        void b2;
        bga a2;
        int c2 = n2;
        bga bga2 = a2 = this;
        bga2.M = b2;
        bga2.J = c2;
    }
}

