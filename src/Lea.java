/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HFa
 *  JPa
 *  Oz
 *  gFa
 *  kta
 *  psa
 *  pua
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Lea
extends gFa {
    private HFa I;

    public void f() {
        Lea lea = this;
        if (lea.I.G() > ySa.T) {
            lea.I.f(JPa.N, JPa.N, JPa.N);
            return;
        }
        if (lea.I.J().nextInt(vpa.o) == 0 || !HFa.J((HFa)lea.I) || !lea.I.V()) {
            Lea lea2 = lea;
            float a2 = lea2.I.J().nextFloat() * pua.j * kta.v;
            float f2 = Oz.C((float)a2) * psa.N;
            float f3 = Qra.j + lea.I.J().nextFloat() * psa.N;
            a2 = Oz.d((float)a2) * psa.N;
            lea2.I.f(f2, f3, a2);
        }
    }

    public boolean f() {
        return vRa.d != 0;
    }

    public Lea(HFa hFa2) {
        Lea b2 = hFa2;
        Lea a2 = this;
        a2.I = b2;
    }
}

