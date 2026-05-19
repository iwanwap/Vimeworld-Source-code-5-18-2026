/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FPa
 *  NEa
 *  TPa
 *  Zta
 *  pqa
 *  vL
 *  vRa
 *  vea
 */
import java.util.Collections;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FDa
extends NEa {
    private Sx j;
    private int J;
    private vea A;
    private int I;

    public boolean f() {
        double d2;
        FDa a2;
        FDa fDa = a2;
        double d3 = d2 = fDa.J();
        List list = ((bga)((Object)fDa.j)).j.J(Sx.class, a2.j.J().f(d3, FPa.T, d3), a2.k);
        Collections.sort(list, a2.I);
        if (list.isEmpty()) {
            return uSa.E != 0;
        }
        a2.j = (Sx)((Object)list.get(uSa.E));
        return vRa.d != 0;
    }

    /*
     * Unable to fully structure code
     */
    public void f() {
        block8: {
            block7: {
                if (a.j == null) break block7;
                if ((a.J -= vRa.d) <= 0) {
                    v0 = a;
                    a.A = a.j;
                    v0.j = null;
                    super.l();
                    v0.A.J(TPa.k, pqa.r, pqa.r);
                    v0.A.k((boolean)vRa.d);
                    v0.A.J(Kha.j).J(vea.J());
                    return;
                }
                break block8;
            }
            if (a.A == null) ** GOTO lbl32
            if (!(a.A instanceof Sx)) ** GOTO lbl-1000
            v1 = a;
            if (vea.J((vea)v1.A, (Sx)((Sx)v1.A))) {
                v2 = a;
                if (v2.A.J((vL)v2.A) < Zta.ba) {
                    a.A.v();
                }
                v3 = a;
                a.I = uSa.E;
            } else lbl-1000:
            // 2 sources

            {
                v4 = a;
                if (v4.A.J((vL)v4.A) > ZSa.o) {
                    v5 = a.I;
                    a.I = v5 + vRa.d;
                    if (v5 >= Fsa.d) {
                        v6 = a;
                        if (v6.A.d((vL)v6.A)) {
                            a.I = uSa.E;
                        }
                    }
                }
lbl32:
                // 8 sources

                v3 = a;
            }
            super.f();
        }
    }

    public FDa(vea vea2) {
        FDa b2 = vea2;
        FDa a2 = this;
        super((bga)((Object)b2), Sx.class, vRa.d != 0);
        a2.A = b2;
    }

    public void J() {
        FDa a2;
        FDa fDa = a2;
        fDa.j = null;
        fDa.A.k(uSa.E != 0);
        fDa.A.J(Kha.j).f(vea.J());
        super.J();
    }

    public boolean l() {
        FDa a2;
        if (a2.j != null) {
            FDa fDa = a2;
            if (!vea.J((vea)fDa.A, (Sx)fDa.j)) {
                return uSa.E != 0;
            }
            vea.J((vea)a2.A, vRa.d != 0);
            FDa fDa2 = a2;
            fDa2.A.J((vL)fDa2.j, FRa.Ga, FRa.Ga);
            return vRa.d != 0;
        }
        return super.l();
    }

    public void l() {
        FDa a2;
        FDa fDa = a2;
        fDa.J = tTa.h;
        fDa.I = uSa.E;
    }
}

