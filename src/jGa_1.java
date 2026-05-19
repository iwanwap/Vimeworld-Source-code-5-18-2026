/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  CDa
 *  Dfa
 *  Dha
 *  Faa
 *  HFa
 *  LA
 *  MZ
 *  NTa
 *  Nga
 *  Oea
 *  RIa
 *  Sqa
 *  Ssa
 *  Tf
 *  WEa
 *  Wda
 *  YDa
 *  Yea
 *  aga
 *  bFa
 *  cQa
 *  gea
 *  hra
 *  jFa
 *  jGa
 *  jRa
 *  jea
 *  kDa
 *  mEa
 *  pDa
 *  sFa
 *  tDa
 *  vL
 *  vRa
 *  ysa
 *  zEa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class jGa_1 {
    private static final Logger k = LogManager.getLogger();
    private int j;
    private OX<Nga> J;
    private Set<Nga> A;
    private final Tf I;

    public jGa_1(Tf tf) {
        jGa_1 a2;
        jGa_1 b2 = tf;
        jGa_1 jGa_12 = a2 = this;
        a2.A = Sets.newHashSet();
        jGa_1 jGa_13 = a2;
        jGa_13.J = new OX();
        jGa_12.I = b2;
        jGa_12.j = b2.J().J().l();
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2, KC kC2) {
        jGa_1 c2 = vL2;
        jGa_1 b2 = this;
        if ((c2 = b2.J.J(c2.M())) != null) {
            void a2;
            c2.J((KC)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(bFa bFa2, Faa faa2) {
        jGa_1 jGa_12 = this;
        for (Nga c2 : jGa_12.A) {
            void a2;
            void b2;
            if (c2.d == b2 || c2.d.N != a2.I || c2.d.L != a2.G) continue;
            c2.f((bFa)b2);
        }
    }

    public void J() {
        int n2;
        jGa_1 jGa_12 = this;
        ArrayList<bFa> arrayList = Lists.newArrayList();
        for (Nga a2 : jGa_12.A) {
            a2.J(jGa_12.I.w);
            if (!a2.k || !(a2.d instanceof bFa)) continue;
            arrayList.add((bFa)a2.d);
        }
        int n3 = n2 = uSa.E;
        while (n3 < arrayList.size()) {
            bFa a2 = (bFa)arrayList.get(n2);
            for (Nga nga2 : jGa_12.A) {
                if (nga2.d == a2) continue;
                nga2.f(a2);
            }
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2) {
        jGa_1 b2;
        void a2;
        jGa_1 jGa_12 = this;
        if (a2 instanceof bFa) {
            Iterator<Nga> iterator;
            b2 = (bFa)a2;
            Iterator<Nga> iterator2 = iterator = jGa_12.A.iterator();
            while (iterator2.hasNext()) {
                iterator.next().l((bFa)b2);
                iterator2 = iterator;
            }
        }
        if ((b2 = jGa_12.J.f(a2.M())) != null) {
            jGa_12.A.remove(b2);
            b2.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, KC kC2) {
        jGa_1 c2 = vL2;
        jGa_1 b2 = this;
        if ((c2 = b2.J.J(c2.M())) != null) {
            void a2;
            c2.f((KC)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(bFa bFa2) {
        jGa_1 jGa_12 = this;
        for (Nga b2 : jGa_12.A) {
            void a2;
            if (b2.d == a2) {
                b2.f(jGa_12.I.w);
                continue;
            }
            b2.f((bFa)a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        jGa_1 a2 = this;
        a2.J((vL)c2, (int)b2, d2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, int n2, int n3, boolean bl) {
        void b2;
        void d22;
        int c22;
        boolean bl2 = bl;
        jGa_1 a2 = this;
        if (c22 > a2.j) {
            c22 = a2.j;
        }
        try {
            void e222;
            if (a2.J.J(d22.M())) {
                throw new IllegalStateException(jRa.N);
            }
            Nga e222 = new Nga((vL)d22, c22, (int)b2, (boolean)e222);
            jGa_1 jGa_12 = a2;
            Nga nga2 = e222;
            jGa_12.A.add(nga2);
            a2.J.J(d22.M(), e222);
            nga2.f(jGa_12.I.w);
            return;
        }
        catch (Throwable e222) {
            Dha dha;
            RIa e222 = RIa.J((Throwable)e222, (String)Bsa.O);
            Dha dha2 = dha = e222.J(nOa.e);
            dha2.J(Yua.h, (Object)(c22 + Jta.Z));
            dha2.J(Ssa.ja, (Callable)new nga((jGa)a2, (int)b2));
            d22.J(dha2);
            Dha c22 = e222.J(Wqa.b);
            a2.J.J((int)d22.M()).d.J(c22);
            try {
                throw new MZ(e222);
            }
            catch (MZ d22) {
                k.error(Sqa.Da, (Throwable)d22);
                return;
            }
        }
    }

    public void J(vL vL2) {
        jGa_1 b2 = vL2;
        jGa_1 a2 = this;
        if (b2 instanceof bFa) {
            jGa_1 jGa_12 = b2;
            a2.J((vL)jGa_12, cQa.z, uqa.g);
            bFa bFa2 = (bFa)jGa_12;
            for (Nga nga2 : a2.A) {
                if (nga2.d == bFa2) continue;
                nga2.f(bFa2);
            }
        } else {
            if (b2 instanceof Fga) {
                a2.J((vL)b2, ysa.s, tTa.h, vRa.d != 0);
                return;
            }
            if (b2 instanceof jea) {
                a2.J((vL)b2, ysa.s, kTa.j, uSa.E != 0);
                return;
            }
            if (b2 instanceof ZDa) {
                a2.J((vL)b2, ysa.s, NTa.C, uSa.E != 0);
                return;
            }
            if (b2 instanceof oEa) {
                a2.J((vL)b2, ysa.s, NTa.C, uSa.E != 0);
                return;
            }
            if (b2 instanceof Pda) {
                a2.J((vL)b2, ysa.s, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof Dfa) {
                a2.J((vL)b2, ysa.s, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof tDa) {
                a2.J((vL)b2, ysa.s, AQa.P, vRa.d != 0);
                return;
            }
            if (b2 instanceof WEa) {
                a2.J((vL)b2, ysa.s, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof kDa) {
                a2.J((vL)b2, ysa.s, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof CDa) {
                a2.J((vL)b2, ysa.s, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof gea) {
                a2.J((vL)b2, ysa.s, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof jFa) {
                a2.J((vL)b2, ysa.s, kTa.j, vRa.d != 0);
                return;
            }
            if (b2 instanceof Yea) {
                a2.J((vL)b2, Fua.J, yRa.d, vRa.d != 0);
                return;
            }
            if (b2 instanceof Wda) {
                a2.J((vL)b2, Fua.J, yRa.d, vRa.d != 0);
                return;
            }
            if (b2 instanceof HFa) {
                a2.J((vL)b2, ysa.s, yRa.d, vRa.d != 0);
                return;
            }
            if (b2 instanceof IDa) {
                a2.J((vL)b2, Fua.J, yRa.d, uSa.E != 0);
                return;
            }
            if (b2 instanceof mEa) {
                a2.J((vL)b2, Fua.J, yRa.d, uSa.E != 0);
                return;
            }
            if (b2 instanceof pDa) {
                a2.J((vL)b2, rRa.f, yRa.d, vRa.d != 0);
                return;
            }
            if (b2 instanceof LA) {
                a2.J((vL)b2, Fua.J, yRa.d, vRa.d != 0);
                return;
            }
            if (b2 instanceof vFa) {
                a2.J((vL)b2, rRa.f, NTa.C, vRa.d != 0);
                return;
            }
            if (b2 instanceof aga) {
                a2.J((vL)b2, rRa.f, kTa.j, vRa.d != 0);
                return;
            }
            if (b2 instanceof YDa) {
                a2.J((vL)b2, rRa.f, vqa.F, uSa.E != 0);
                return;
            }
            if (b2 instanceof Oea) {
                a2.J((vL)b2, rRa.f, yRa.d, vRa.d != 0);
                return;
            }
            if (b2 instanceof zEa) {
                a2.J((vL)b2, rRa.f, kTa.j, vRa.d != 0);
                return;
            }
            if (b2 instanceof sFa) {
                a2.J((vL)b2, hra.Ja, vqa.F, uSa.E != 0);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(bFa bFa2) {
        Object b2;
        jGa_1 jGa_12 = this;
        Object object = b2 = jGa_12.A.iterator();
        while (object.hasNext()) {
            void a2;
            ((Nga)b2.next()).J((bFa)a2);
            object = b2;
        }
    }
}

