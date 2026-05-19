/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ac
 *  Gl
 *  NTa
 *  Oz
 *  Yaa
 *  Yfa
 *  Zta
 *  aAa
 *  fpa
 *  gFa
 *  vL
 *  vRa
 */
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class dFa_1
extends gFa {
    private boolean M;
    public boolean k;
    public final bga j;
    private int J;
    private int A;
    private int I;

    /*
     * WARNING - void declaration
     */
    public boolean J(Gl gl2, boolean bl) {
        void a2;
        dFa_1 c2 = gl2;
        dFa_1 b2 = this;
        if (!dFa_1.J(b2.j, (Gl)c2, (boolean)a2, b2.k)) {
            return uSa.E != 0;
        }
        if (!b2.j.J(new XF((vL)c2))) {
            return uSa.E != 0;
        }
        if (b2.M) {
            if ((b2.I -= vRa.d) <= 0) {
                b2.J = uSa.E;
            }
            if (b2.J == 0) {
                int n2 = b2.J = b2.J((Gl)c2) ? vRa.d : uqa.g;
            }
            if (b2.J == uqa.g) {
                return uSa.E != 0;
            }
        }
        return vRa.d != 0;
    }

    public void J() {
        dFa_1 a2;
        a2.j.C(null);
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Gl gl2) {
        void a22;
        dFa_1 dFa_12;
        dFa_1 dFa_13 = dFa_12 = this;
        dFa_13.I = NTa.C + dFa_13.j.J().nextInt(tTa.h);
        dFa_1 b22 = dFa_13.j.J().J((vL)a22);
        if (b22 == null) {
            return uSa.E != 0;
        }
        if ((b22 = b22.J()) == null) {
            return uSa.E != 0;
        }
        dFa_1 dFa_14 = b22;
        int b22 = ((aAa)dFa_14).I - Oz.f((double)a22.la);
        int a22 = ((aAa)dFa_14).k - Oz.f((double)a22.A);
        int n2 = b22;
        int n3 = a22;
        if ((double)(n2 * n2 + n3 * n3) <= fpa.o) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double J() {
        dFa_1 dFa_12 = this;
        bA a2 = dFa_12.j.J(Kha.I);
        if (a2 == null) {
            return Zta.ba;
        }
        return a2.f();
    }

    /*
     * WARNING - void declaration
     */
    public dFa_1(bga bga2, boolean bl) {
        void b2;
        boolean c2 = bl;
        dFa_1 a2 = this;
        a2((bga)b2, c2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean J(Yfa yfa, Gl gl2, boolean bl, boolean bl2) {
        void a2;
        void b2;
        Yfa d2 = gl2;
        Yfa c2 = yfa;
        if (d2 == null) {
            return uSa.E != 0;
        }
        if (d2 == c2) {
            return uSa.E != 0;
        }
        if (!d2.K()) {
            return uSa.E != 0;
        }
        if (!c2.J(d2.getClass())) {
            return uSa.E != 0;
        }
        Yaa yaa = c2.J();
        Yaa yaa2 = d2.J();
        if (yaa != null && yaa2 == yaa) {
            return uSa.E != 0;
        }
        if (c2 instanceof Ac && StringUtils.isNotEmpty(((Ac)c2).l())) {
            if (d2 instanceof Ac && ((Ac)c2).l().equals(((Ac)d2).l())) {
                return uSa.E != 0;
            }
            if (d2 == ((Ac)c2).f()) {
                return uSa.E != 0;
            }
        } else if (d2 instanceof Sx && b2 == false && ((Sx)d2).h.M) {
            return uSa.E != 0;
        }
        if (a2 == false || c2.J().J((vL)d2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public dFa_1(bga bga2, boolean bl, boolean bl2) {
        void b2;
        void c2;
        dFa_1 a2;
        boolean d2 = bl2;
        dFa_1 dFa_12 = a2 = this;
        a2.j = c2;
        dFa_12.k = b2;
        dFa_12.M = d2;
    }

    public void l() {
        dFa_1 a2;
        dFa_1 dFa_12 = a2;
        dFa_12.J = uSa.E;
        dFa_12.I = uSa.E;
        dFa_12.A = uSa.E;
    }

    /*
     * Unable to fully structure code
     */
    public boolean l() {
        var1_1 = this;
        a = var1_1.j.C();
        if (a == null) {
            return (boolean)uSa.E;
        }
        if (!a.K()) {
            return (boolean)uSa.E;
        }
        var2_2 = var1_1.j.J();
        var3_3 = a.J();
        if (var2_2 != null && var3_3 == var2_2) {
            return (boolean)uSa.E;
        }
        v0 = var1_1;
        v1 = var4_4 = v0.J();
        if (v0.j.J((vL)a) > v1 * v1) {
            return (boolean)uSa.E;
        }
        if (!var1_1.k) ** GOTO lbl22
        if (var1_1.j.J().J((vL)a)) {
            var1_1.A = uSa.E;
            v2 = a;
        } else {
            if ((var1_1.A += vRa.d) > Psa.M) {
                return (boolean)uSa.E;
            }
lbl22:
            // 3 sources

            v2 = a;
        }
        if (!(v2 instanceof Sx) || !((Sx)a).h.M) {
            return (boolean)vRa.d;
        }
        return (boolean)uSa.E;
    }
}

