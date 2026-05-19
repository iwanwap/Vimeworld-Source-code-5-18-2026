/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  EC
 *  Eoa
 *  FTa
 *  Moa
 *  RPa
 *  Rua
 *  ac
 *  kta
 *  l
 *  pY
 *  pua
 *  uKa
 *  vRa
 */
import java.io.IOException;
import java.util.Iterator;

public final class CMa_1
extends EC
implements l {
    private int J;
    private boolean I = uSa.E;

    public void l() {
        CMa_1 cMa_1;
        CMa_1 cMa_12 = cMa_1 = this;
        super.l();
        cMa_12.J += vRa.d;
        if (cMa_12.J == kTa.j) {
            Iterator a2 = cMa_1.E.iterator();
            Object object = a2;
            while (object.hasNext()) {
                ((ac)a2.next()).J = vRa.d;
                object = a2;
            }
        }
    }

    public void J(ac ac2) throws IOException {
        EC b2 = ac2;
        CMa_1 a2 = this;
        switch (b2.C) {
            case 0: {
                CMa_1 cMa_1 = a2;
                while (false) {
                }
                cMa_1.g.c.n();
                cMa_1.g.J((EC)null);
                return;
            }
            case 1: {
                if (a2.g.Ta.J().d()) {
                    a2.g.J((EC)new Moa());
                    return;
                }
                EC eC2 = b2 = new Vma(a2, oha.J(rua.a, new Object[uSa.E]), Mqa.y, oha.J(RPa.u, new Object[uSa.E]), oha.J(Hra.J, new Object[uSa.E]), uSa.E);
                a2.g.J(eC2);
                eC2.J(kTa.j);
            }
        }
    }

    public void A() {
        CMa_1 cMa_1;
        CMa_1 cMa_12;
        CMa_1 cMa_13 = cMa_12 = this;
        cMa_13.E.clear();
        if (cMa_13.g.Ta.J().d()) {
            if (cMa_12.g.d()) {
                cMa_12.E.add(new ac(vRa.d, cMa_12.A / uqa.g - ySa.T, cMa_12.I / AQa.P + zua.m, oha.J(Qra.q, new Object[uSa.E])));
                cMa_1 = cMa_12;
            } else {
                cMa_12.E.add(new ac(vRa.d, cMa_12.A / uqa.g - ySa.T, cMa_12.I / AQa.P + zua.m, oha.J(Rua.T, new Object[uSa.E])));
                cMa_1 = cMa_12;
            }
        } else {
            cMa_12.E.add(new ac(uSa.E, cMa_12.A / uqa.g - ySa.T, cMa_12.I / AQa.P + Eqa.Ka, oha.J(Hra.J, new Object[uSa.E])));
            cMa_12.E.add(new ac(vRa.d, cMa_12.A / uqa.g - ySa.T, cMa_12.I / AQa.P + zua.m, oha.J(RPa.u, new Object[uSa.E])));
            if (cMa_12.g.J() == null) {
                ((ac)cMa_12.E.get((int)vRa.d)).J = uSa.E;
            }
            cMa_1 = cMa_12;
        }
        Iterator a2 = cMa_1.E.iterator();
        Object object = a2;
        while (object.hasNext()) {
            ((ac)a2.next()).J = uSa.E;
            object = a2;
        }
    }

    public void J(char c2, int n2) throws IOException {
        int c3 = n2;
        CMa_1 cMa_1 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void a2;
        void b2;
        void c2;
        CMa_1 cMa_1;
        CMa_1 cMa_12 = cMa_1 = this;
        cMa_12.J(uSa.E, uSa.E, cMa_12.A, cMa_1.I ? 1 : 0, kra.F, Gta.Y);
        uKa.e();
        uKa.l((float)kta.v, (float)kta.v, (float)kta.v);
        boolean bl = cMa_12.g.Ta.J().d();
        Object d2 = bl ? oha.J(KPa.T, new Object[uSa.E]) : oha.J(cTa.T, new Object[uSa.E]);
        CMa_1.J((String)d2, (int)(cMa_1.A / uqa.g / uqa.g), (int)Fsa.d, (int)pua.o);
        uKa.D();
        if (bl) {
            CMa_1.J((String)oha.J(Bsa.X, new Object[uSa.E]), (int)(cMa_1.A / uqa.g), (int)FTa.A, (int)pua.o);
        }
        CMa_1.J((String)(oha.J(FRa.n, new Object[uSa.E]) + Xpa.E + pY.YELLOW + cMa_1.g.c.g()), (int)(cMa_1.A / uqa.g), (int)ySa.T, (int)pua.o);
        super.J((int)c2, (int)b2, (float)a2);
    }

    public CMa_1() {
        CMa_1 a2;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    public void J(boolean bl, int n2) {
        boolean c2 = bl;
        CMa_1 b2 = this;
        if (c2) {
            CMa_1 cMa_1 = b2;
            cMa_1.g.Ta.D();
            cMa_1.g.J((Eoa)null);
            b2.g.J((EC)new Moa());
            return;
        }
        CMa_1 cMa_1 = b2;
        cMa_1.g.c.n();
        cMa_1.g.J((EC)null);
    }
}

