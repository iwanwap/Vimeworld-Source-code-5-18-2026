/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  MQa
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  QFa
 *  QSa
 *  Qsa
 *  Tpa
 *  Waa
 *  ZOa
 *  aSa
 *  aX
 *  bRa
 *  dQa
 *  eAa
 *  gZ
 *  jFa
 *  kta
 *  pqa
 *  psa
 *  vL
 *  vRa
 *  wra
 *  ysa
 */
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jFa_2
extends vL {
    public float m;
    private int C;
    private String i;
    private String M;
    private int k;
    private int j;
    private static final Logger J = LogManager.getLogger();
    private int A;

    public void o() {
        a.C = rta.K;
    }

    public boolean l() {
        jFa_2 a2;
        if (a2.k > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void h() {
        a.k = BQa.h;
    }

    public void f(int n2) {
        jFa_2 a2;
        int b2 = n2;
        jFa_2 jFa_22 = a2 = this;
        super.f(b2);
        if (!jFa_22.j.e) {
            a2.E();
        }
    }

    public void f(Waa waa2) {
        jFa_2 b2 = waa2;
        jFa_2 a2 = this;
        jFa_2 jFa_22 = b2;
        jFa_22.J(XOa.C, (byte)a2.j);
        jFa_22.J(pqa.L, (short)a2.C);
        jFa_2 jFa_23 = a2;
        jFa_22.J(QSa.Ja, (short)jFa_23.k);
        if (jFa_23.f() != null) {
            b2.J(ysa.F, a2.i);
        }
        if (a2.l() != null) {
            b2.J(dQa.l, a2.M);
        }
        if (a2.J() != null) {
            b2.J(zOa.Ha, (NCa)a2.J().J(new Waa()));
        }
    }

    public void J(Mda mda2) {
        jFa_2 a2;
        jFa_2 b2 = mda2;
        jFa_2 jFa_22 = a2 = this;
        jFa_22.J().J(NTa.C, b2);
        jFa_22.J().J(NTa.C);
    }

    public String l() {
        jFa_2 a2;
        return a2.M;
    }

    public void M(int n2) {
        int b2 = n2;
        jFa_2 a2 = this;
        a2.k = b2;
    }

    public void l(String string) {
        Object b2 = string;
        jFa_2 a2 = this;
        a2.M = b2;
    }

    public void d() {
        int a22;
        jFa_2 jFa_22 = this;
        if (jFa_22.J() == null) {
            jFa_22.k();
            return;
        }
        jFa_2 jFa_23 = jFa_22;
        super.d();
        if (jFa_23.k > 0 && jFa_22.k != BQa.h) {
            jFa_22.k -= vRa.d;
        }
        jFa_2 jFa_24 = jFa_22;
        jFa_24.c = jFa_24.la;
        jFa_24.ba = jFa_24.Z;
        jFa_24.r = jFa_24.A;
        jFa_24.J(jFa_24.Ea - Tpa.fa);
        jFa_24.Ma = jFa_24.l(jFa_24.la, (jFa_22.J().j + jFa_22.J().M) / KPa.y, jFa_22.A);
        jFa_24.J((double)jFa_24.i, jFa_22.Ea, jFa_22.f);
        int n2 = a22 = (int)jFa_24.c != (int)jFa_22.la || (int)jFa_22.ba != (int)jFa_22.Z || (int)jFa_22.r != (int)jFa_22.A ? vRa.d : uSa.E;
        if (a22 != 0 || jFa_22.g % kTa.g == 0) {
            if (jFa_22.j.J(new XF(jFa_22)).J().J() == Material.lava) {
                jFa_2 jFa_25 = jFa_22;
                jFa_25.J(Bua.Ia);
                jFa_2 jFa_26 = jFa_22;
                jFa_26.f((jFa_25.R.nextFloat() - jFa_26.R.nextFloat()) * psa.N);
                jFa_25.l((jFa_25.R.nextFloat() - jFa_22.R.nextFloat()) * psa.N);
                jFa_25.J(bRa.T, Xpa.R, kta.v + jFa_22.R.nextFloat() * Xpa.R);
            }
            if (!jFa_22.j.e) {
                jFa_22.E();
            }
        }
        float a22 = MQa.d;
        if (jFa_22.ha) {
            a22 = jFa_22.j.J((XF)new XF((int)Oz.f((double)jFa_22.la), (int)(Oz.f((double)jFa_22.J().j) - vRa.d), (int)Oz.f((double)jFa_22.A))).J().slipperiness.J() * MQa.d;
        }
        jFa_2 jFa_27 = jFa_22;
        jFa_27.f((double)(jFa_27.i * (double)a22));
        jFa_27.J(jFa_27.Ea * uua.G);
        jFa_27.l(jFa_27.f * (double)a22);
        if (jFa_27.ha) {
            jFa_2 jFa_28 = jFa_22;
            jFa_28.J(jFa_28.Ea * KPa.I);
        }
        if (jFa_22.C != Bra.e) {
            jFa_22.C += vRa.d;
        }
        jFa_2 jFa_29 = jFa_22;
        jFa_29.d();
        if (!jFa_29.j.e && jFa_22.C >= MTa.g) {
            jFa_22.k();
        }
    }

    public String J() {
        jFa_2 a2;
        if (a2.J()) {
            return a2.e();
        }
        return Ey.f((String)new StringBuilder().insert(5 >> 3, zpa.a).append(a2.J().f()).toString());
    }

    public String f() {
        jFa_2 a2;
        return a2.i;
    }

    public int J() {
        jFa_2 a2;
        return a2.C;
    }

    public void m() {
        jFa_2 a2;
        a2.h();
        a2.C = Qsa.ia;
    }

    public boolean u() {
        return uSa.E != 0;
    }

    public void J() {
        jFa_2 a2;
        a2.J().J(NTa.C, tTa.h);
    }

    private void E() {
        jFa_2 jFa_22 = this;
        Iterator a2 = jFa_22.j.J(jFa_2.class, jFa_22.J().f(kTa.B, aSa.V, kTa.B)).iterator();
        Object object = a2;
        while (object.hasNext()) {
            jFa_2 jFa_23 = (jFa_2)((Object)a2.next());
            object = a2;
            jFa_22.J((jFa)jFa_23);
        }
    }

    public boolean d() {
        jFa_2 jFa_22;
        jFa_2 a2;
        jFa_2 jFa_23 = a2;
        if (jFa_23.A == jFa_23.g) {
            return a2.H;
        }
        jFa_2 jFa_24 = a2;
        jFa_24.A = jFa_24.g;
        if (jFa_24.j.J(a2.J(), Material.water, (vL)a2)) {
            if (!a2.H && !a2.ga) {
                a2.H();
            }
            jFa_22 = a2;
            a2.H = vRa.d;
        } else {
            jFa_22 = a2;
            a2.H = uSa.E;
        }
        return jFa_22.H;
    }

    public void C(int n2) {
        int b2 = n2;
        jFa_2 a2 = this;
        a2.J(gZ.j, b2);
    }

    public void C(Sx sx2) {
        Sx b2 = sx2;
        jFa_2 a2 = this;
        if (!a2.j.e) {
            jFa_2 jFa_22 = a2;
            Mda mda2 = jFa_22.J();
            int n2 = mda2.E;
            if (jFa_22.k == 0 && (a2.M == null || MTa.g - a2.C <= ZOa.x || a2.M.equals(b2.J())) && b2.K.f(mda2)) {
                Sx sx3;
                if (mda2.J() == eAa.J((Block)QFa.UA)) {
                    b2.J((aX)mY.v);
                }
                if (mda2.J() == eAa.J((Block)QFa.hf)) {
                    b2.J((aX)mY.v);
                }
                if (mda2.J() == eAa.J((Block)QFa.nE)) {
                    b2.J((aX)mY.v);
                }
                if (mda2.J() == Gea.Xb) {
                    b2.J((aX)mY.p);
                }
                if (mda2.J() == Gea.b) {
                    b2.J((aX)mY.D);
                }
                if (mda2.J() == Gea.q) {
                    b2.J((aX)mY.x);
                }
                if (mda2.J() == Gea.b && a2.f() != null && (sx3 = a2.j.J(a2.f())) != null && sx3 != b2) {
                    sx3.J((aX)mY.o);
                }
                if (!a2.c()) {
                    a2.j.J((vL)b2, FRa.ba, psa.N, ((a2.R.nextFloat() - a2.R.nextFloat()) * ZSa.q + pqa.r) * kta.v);
                }
                b2.f(a2, n2);
                if (mda2.E <= 0) {
                    a2.k();
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(jFa jFa2) {
        void a2;
        jFa_2 jFa_22 = this;
        if (a2 == jFa_22) {
            return uSa.E != 0;
        }
        if (a2.K() && jFa_22.K()) {
            jFa_2 jFa_23 = jFa_22;
            Mda mda2 = jFa_23.J();
            jFa_2 b2 = a2.J();
            if (jFa_23.k != BQa.h && a2.k != BQa.h) {
                if (jFa_22.C != Bra.e && a2.C != Bra.e) {
                    if (b2.J() != mda2.J()) {
                        return uSa.E != 0;
                    }
                    if (b2.M() ^ mda2.M()) {
                        return uSa.E != 0;
                    }
                    if (b2.M() && !b2.J().equals((Object)mda2.J())) {
                        return uSa.E != 0;
                    }
                    if (b2.J() == null) {
                        return uSa.E != 0;
                    }
                    if (b2.J().M() && b2.J() != mda2.J()) {
                        return uSa.E != 0;
                    }
                    if (((Mda)b2).E < mda2.E) {
                        return super.J((jFa)jFa_22);
                    }
                    if (((Mda)b2).E + mda2.E > b2.e()) {
                        return uSa.E != 0;
                    }
                    ((Mda)b2).E += mda2.E;
                    void v1 = a2;
                    a2.k = Math.max(a2.k, jFa_22.k);
                    v1.C = Math.min(v1.C, jFa_22.C);
                    v1.J((Mda)b2);
                    jFa_22.k();
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public void f(String string) {
        Object b2 = string;
        jFa_2 a2 = this;
        a2.i = b2;
    }

    /*
     * WARNING - void declaration
     */
    public jFa_2(Gg gg2, double d2, double d3, double d4, Mda mda2) {
        jFa_2 f2;
        void b2;
        void c2;
        void d5;
        void e2;
        jFa_2 a2;
        jFa_2 jFa_22 = jFa_23;
        jFa_2 jFa_23 = mda2;
        jFa_2 jFa_24 = a2 = jFa_22;
        jFa_24((Gg)e2, (double)d5, (double)c2, (double)b2);
        jFa_24.J((Mda)f2);
    }

    public void A() {
        a.C = IPa.x;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(gZ gZ2, float f2) {
        void a2;
        jFa_2 b2 = this;
        jFa_2 c2 = gZ2;
        if (b2.J((gZ)c2)) {
            return uSa.E != 0;
        }
        if (b2.J() != null && b2.J().J() == Gea.pA && c2.l()) {
            return uSa.E != 0;
        }
        jFa_2 jFa_22 = b2;
        jFa_22.i();
        jFa_22.j = (int)((float)jFa_22.j - a2);
        if (jFa_22.j <= 0) {
            b2.k();
        }
        return uSa.E != 0;
    }

    public void l() {
        a.k = NTa.C;
    }

    public jFa_2(Gg gg2) {
        jFa_2 a2;
        jFa_2 b2 = gg2;
        jFa_2 jFa_22 = a2 = this;
        super((Gg)b2);
        jFa_22.j = tTa.h;
        jFa_22.m = (float)(Math.random() * lQa.f * KPa.y);
        jFa_22.l(rta.o, rta.o);
        jFa_2 jFa_23 = a2;
        jFa_22.J(new Mda(QFa.HF, uSa.E));
    }

    public boolean I() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public jFa_2(Gg gg2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        jFa_2 d5;
        jFa_2 e2 = gg2;
        jFa_2 jFa_22 = d5 = this;
        jFa_2 jFa_23 = d5;
        super((Gg)e2);
        d5.j = tTa.h;
        d5.m = (float)(Math.random() * lQa.f * KPa.y);
        jFa_23.l(rta.o, rta.o);
        jFa_23.l((double)c2, (double)b2, (double)a2);
        jFa_22.X = (float)(Math.random() * ZOa.Ja);
        jFa_22.f((float)(Math.random() * Bua.Ia - Tqa.Ia));
        jFa_22.J(Bua.Ia);
        jFa_22.l((float)(Math.random() * Bua.Ia - Tqa.Ia));
    }

    public void f() {
        a.k = uSa.E;
    }

    public void J(Waa waa2) {
        jFa_2 b2 = waa2;
        jFa_2 a2 = this;
        jFa_2 jFa_22 = b2;
        a2.j = b2.J(XOa.C) & osa.Ja;
        a2.C = jFa_22.J(pqa.L);
        if (jFa_22.J(QSa.Ja)) {
            a2.k = b2.J(QSa.Ja);
        }
        if (b2.J(dQa.l)) {
            a2.M = b2.J(dQa.l);
        }
        if (b2.J(ysa.F)) {
            a2.i = b2.J(ysa.F);
        }
        b2 = b2.J(zOa.Ha);
        jFa_2 jFa_23 = a2;
        jFa_23.J(Mda.J((Waa)b2));
        if (jFa_23.J() == null) {
            a2.k();
        }
    }

    public Mda J() {
        jFa_2 jFa_22 = this;
        jFa_2 a2 = jFa_22.J().J(NTa.C);
        if (a2 == null) {
            if (jFa_22.j != null) {
                J.error(new StringBuilder().insert(3 & 4, wra.f).append(jFa_22.M()).append(rta.U).toString());
            }
            return new Mda(QFa.Gd);
        }
        return a2;
    }
}

