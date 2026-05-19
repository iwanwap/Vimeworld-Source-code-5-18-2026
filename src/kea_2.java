/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  CZ
 *  Dha
 *  Gg
 *  Gl
 *  HA
 *  Lqa
 *  MZ
 *  Mda
 *  NCa
 *  Pea
 *  Qsa
 *  RIa
 *  VEa
 *  Waa
 *  YSa
 *  ZRa
 *  bqa
 *  eAa
 *  kea
 *  ld
 *  pqa
 *  pua
 *  rba
 *  vL
 *  vRa
 *  wPa
 *  waa
 *  ysa
 */
import java.util.concurrent.Callable;
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kea_2
implements HA {
    public boolean M;
    public Sx k;
    public Mda[] j;
    public int J;
    public Mda[] A;
    private Mda I;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean f(Mda mda2) {
        block11: {
            kea_2 b2 = mda2;
            kea_2 a2 = this;
            if (b2 == null || ((Mda)b2).E == 0 || b2.J() == null) break block11;
            try {
                kea_2 kea_22;
                int n2;
                block12: {
                    block10: {
                        if (b2.A()) {
                            int n3 = a2.e();
                            if (n3 >= 0) {
                                a2.j[n3] = Mda.J((Mda)b2);
                                a2.j[n3].i = tTa.h;
                                ((Mda)b2).E = uSa.E;
                                return vRa.d != 0;
                            }
                            if (a2.k.h.f()) {
                                ((Mda)b2).E = uSa.E;
                                return vRa.d != 0;
                            }
                            return uSa.E != 0;
                        }
                        do {
                            n2 = ((Mda)b2).E;
                            ((Mda)b2).E = a2.f((Mda)b2);
                            if (((Mda)b2).E <= 0) break block10;
                        } while (((Mda)b2).E < n2);
                        kea_22 = b2;
                        break block12;
                    }
                    kea_22 = b2;
                }
                if (((Mda)kea_22).E == n2 && a2.k.h.f()) {
                    ((Mda)b2).E = uSa.E;
                    return vRa.d != 0;
                }
                if (((Mda)b2).E < n2) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            catch (Throwable throwable) {
                RIa rIa2 = RIa.J((Throwable)throwable, (String)pua.Aa);
                Dha dha = rIa2.J(ZRa.G);
                dha.J(Lqa.J, (Object)eAa.J((eAa)b2.J()));
                dha.J(Vra.Z, (Object)b2.J());
                dha.J(bqa.c, (Callable)new Pea((kea)a2, (Mda)b2));
                throw new MZ(rIa2);
            }
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private int f(Mda mda2) {
        void a22;
        kea_2 kea_22 = this;
        void v0 = a22;
        eAa eAa2 = v0.J();
        int n2 = v0.E;
        int b2 = kea_22.J((Mda)a22);
        if (b2 < 0) {
            b2 = kea_22.e();
        }
        if (b2 < 0) {
            return n2;
        }
        if (kea_22.j[b2] == null) {
            kea_22.j[b2] = new Mda(eAa2, uSa.E, a22.J());
            if (a22.M()) {
                kea_22.j[b2].J((Waa)a22.J().J());
            }
        }
        int a22 = n2;
        if (n2 > kea_22.j[b2].e() - kea_22.j[b2].E) {
            a22 = kea_22.j[b2].e() - kea_22.j[b2].E;
        }
        if (a22 > kea_22.l() - kea_22.j[b2].E) {
            a22 = kea_22.l() - kea_22.j[b2].E;
        }
        if (a22 == 0) {
            return n2;
        }
        kea_22.j[b2].E += a22;
        kea_22.j[b2].i = tTa.h;
        return n2 -= a22;
    }

    /*
     * WARNING - void declaration
     */
    public waa J(waa waa2) {
        void a2;
        Waa waa3;
        int b2;
        kea_2 kea_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < kea_22.j.length) {
            if (kea_22.j[b2] != null) {
                waa3 = new Waa();
                waa3.J(kua.E, (byte)b2);
                kea_22.j[b2].J(waa3);
                a2.J((NCa)waa3);
            }
            n2 = ++b2;
        }
        int n3 = b2 = uSa.E;
        while (n3 < kea_22.A.length) {
            if (kea_22.A[b2] != null) {
                waa3 = new Waa();
                waa3.J(kua.E, (byte)(b2 + ySa.T));
                kea_22.A[b2].J(waa3);
                a2.J((NCa)waa3);
            }
            n3 = ++b2;
        }
        return a2;
    }

    public boolean f(eAa eAa2) {
        kea_2 a2 = this;
        kea_2 b2 = eAa2;
        if (a2.J((eAa)b2) >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Mda f() {
        kea_2 a2;
        if (a2.J < WOa.fa && a2.J >= 0) {
            kea_2 kea_22 = a2;
            return kea_22.j[kea_22.J];
        }
        return null;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    private int J(eAa eAa2, int n2) {
        int c2;
        kea_2 kea_22 = this;
        int n3 = c2 = uSa.E;
        while (n3 < kea_22.j.length) {
            void a2;
            void b2;
            if (kea_22.j[c2] != null && kea_22.j[c2].J() == b2 && kea_22.j[c2].J() == a2) {
                return c2;
            }
            n3 = ++c2;
        }
        return pua.o;
    }

    public int J(int n2) {
        int b2 = n2;
        kea_2 a2 = this;
        return uSa.E;
    }

    public Mda J() {
        kea_2 a2;
        return a2.I;
    }

    public String J() {
        return wPa.Ja;
    }

    public void J(Mda mda2) {
        kea_2 b2 = mda2;
        kea_2 a2 = this;
        a2.I = b2;
    }

    public int e() {
        int a2;
        kea_2 kea_22 = this;
        int n2 = a2 = uSa.E;
        while (n2 < kea_22.j.length) {
            if (kea_22.j[a2] == null) {
                return a2;
            }
            n2 = ++a2;
        }
        return pua.o;
    }

    public ld J() {
        kea_2 a2;
        if (a2.J()) {
            return new CY(a2.J());
        }
        return new CZ(a2.J(), new Object[uSa.E]);
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        kea_2 kea_22 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(kea kea2) {
        void a2;
        int b2;
        kea_2 kea_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < kea_22.j.length) {
            int n3 = b2++;
            kea_22.j[n3] = Mda.J((Mda)a2.j[n3]);
            n2 = b2;
        }
        int n4 = b2 = uSa.E;
        while (n4 < kea_22.A.length) {
            int n5 = b2++;
            kea_22.A[n5] = Mda.J((Mda)a2.A[n5]);
            n4 = b2;
        }
        kea_22.J = a2.J;
    }

    public boolean J(Sx sx2) {
        Object b2 = sx2;
        kea_2 a2 = this;
        if (a2.k.J) {
            return uSa.E != 0;
        }
        if (b2.J((vL)a2.k) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        kea_2 b2 = this;
        Mda[] mdaArray = b2.j;
        if (c2 >= b2.j.length) {
            mdaArray = b2.A;
            c2 -= b2.j.length;
        }
        if (mdaArray[c2] != null) {
            void a2;
            if (mdaArray[c2].E <= a2) {
                Mda mda2 = mdaArray[c2];
                mdaArray[c2] = null;
                return mda2;
            }
            Mda mda3 = mdaArray[c2].J((int)a2);
            if (mdaArray[c2].E == 0) {
                mdaArray[c2] = null;
            }
            return mda3;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Block block) {
        void a2;
        kea_2 kea_22 = this;
        if (a2.J().M()) {
            return vRa.d != 0;
        }
        kea_2 kea_23 = kea_22;
        kea_2 b2 = kea_23.J(kea_23.J);
        if (b2 != null) {
            return b2.l((Block)a2);
        }
        return uSa.E != 0;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(int n2) {
        void a2;
        Mda mda2 = this;
        Mda b2 = mda2.j;
        if (a2 >= mda2.j.length) {
            b2 = mda2.A;
            a2 -= mda2.j.length;
        }
        if (b2[a2] != null) {
            Mda mda3 = b2;
            b2 = mda3[a2];
            mda3[a2] = null;
            return b2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public float J(Block block) {
        kea_2 kea_22 = this;
        float b2 = pqa.r;
        kea_2 kea_23 = kea_22;
        if (kea_23.j[kea_23.J] != null) {
            void a2;
            kea_2 kea_24 = kea_22;
            b2 *= kea_24.j[kea_24.J].J((Block)a2);
        }
        return b2;
    }

    public int f() {
        kea_2 a2;
        return a2.j.length + AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    private int J(Mda mda2) {
        int b2;
        kea_2 kea_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < kea_22.j.length) {
            void a2;
            if (kea_22.j[b2] != null && kea_22.j[b2].J() == a2.J() && kea_22.j[b2].D() && kea_22.j[b2].E < kea_22.j[b2].e() && kea_22.j[b2].E < kea_22.l() && (!kea_22.j[b2].i() || kea_22.j[b2].J() == a2.J()) && Mda.f((Mda)kea_22.j[b2], (Mda)a2)) {
                return b2;
            }
            n2 = ++b2;
        }
        return pua.o;
    }

    public int l() {
        return ysa.s;
    }

    public kea_2(Sx sx2) {
        Object b2 = sx2;
        kea_2 a2 = this;
        a2.j = new Mda[Qsa.Ha];
        a2.A = new Mda[AQa.P];
        a2.k = b2;
    }

    public int d() {
        int a2;
        kea_2 kea_22 = this;
        int n2 = uSa.E;
        int n3 = a2 = uSa.E;
        while (n3 < kea_22.A.length) {
            if (kea_22.A[a2] != null && kea_22.A[a2].J() instanceof VEa) {
                int n4 = ((VEa)kea_22.A[a2].J()).M;
                n2 += n4;
            }
            n3 = ++a2;
        }
        return n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2) {
        void a2;
        int b2;
        kea_2 kea_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < kea_22.A.length) {
            if (kea_22.A[b2] != null && kea_22.A[b2].l((Mda)a2)) {
                return vRa.d != 0;
            }
            n2 = ++b2;
        }
        int n3 = b2 = uSa.E;
        while (n3 < kea_22.j.length) {
            if (kea_22.j[b2] != null && kea_22.j[b2].l((Mda)a2)) {
                return vRa.d != 0;
            }
            n3 = ++b2;
        }
        return uSa.E != 0;
    }

    public void C() {
        int a2;
        kea_2 kea_22 = this;
        int n2 = a2 = uSa.E;
        while (n2 < kea_22.j.length) {
            if (kea_22.j[a2] != null) {
                kea_2 kea_23 = kea_22;
                int n3 = a2;
                kea_22.j[a2].J((Gg)kea_22.k.j, (vL)kea_23.k, n3, (kea_23.J == n3 ? vRa.d : uSa.E) != 0);
            }
            n2 = ++a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        void a2;
        void b2;
        Mda[] mdaArray = this;
        Mda[] c2 = mdaArray.j;
        if (b2 >= c2.length) {
            b2 -= c2.length;
            c2 = mdaArray.A;
        }
        c2[b2] = a2;
    }

    public void l() {
        int a2;
        kea_2 kea_22 = this;
        int n2 = a2 = uSa.E;
        while (n2 < kea_22.j.length) {
            kea_22.j[a2++] = null;
            n2 = a2;
        }
        int n3 = a2 = uSa.E;
        while (n3 < kea_22.A.length) {
            kea_22.A[a2++] = null;
            n3 = a2;
        }
    }

    public boolean J(eAa eAa2) {
        kea_2 a2 = this;
        kea_2 b22 = eAa2;
        int b22 = a2.J((eAa)b22);
        if (b22 < 0) {
            return uSa.E != 0;
        }
        if ((a2.j[b22].E -= vRa.d) <= 0) {
            a2.j[b22] = null;
        }
        return vRa.d != 0;
    }

    public static int C() {
        return WOa.fa;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2) {
        void a2;
        Mda[] mdaArray = this;
        Mda[] b2 = mdaArray.j;
        if (a2 >= b2.length) {
            a2 -= b2.length;
            b2 = mdaArray.A;
        }
        return b2[a2];
    }

    public boolean J(int n2, Mda mda2) {
        kea_2 c2 = mda2;
        kea_2 a2 = this;
        return vRa.d != 0;
    }

    public int J() {
        return uSa.E;
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(waa waa2) {
        void a2;
        int n2;
        kea_2 kea_22 = this;
        kea_22.j = new Mda[Qsa.Ha];
        kea_22.A = new Mda[AQa.P];
        int n3 = n2 = uSa.E;
        while (n3 < a2.J()) {
            Waa waa3 = a2.J(n2);
            int b2 = waa3.J(kua.E) & osa.Ja;
            Mda mda2 = Mda.J((Waa)waa3);
            if (mda2 != null) {
                if (b2 >= 0 && b2 < kea_22.j.length) {
                    kea_22.j[b2] = mda2;
                }
                if (b2 >= ySa.T && b2 < kea_22.A.length + ySa.T) {
                    kea_22.A[b2 - ySa.T] = mda2;
                }
            }
            n3 = ++n2;
        }
    }

    public void f() {
        a.M = vRa.d;
    }

    public void J(int n2) {
        int b2 = n2;
        kea_2 a2 = this;
        if (b2 > 0) {
            b2 = vRa.d;
        }
        if (b2 < 0) {
            b2 = pua.o;
        }
        kea_2 kea_22 = a2;
        kea_2 kea_23 = kea_22;
        kea_22.J -= b2;
        while (kea_23.J < 0) {
            kea_2 kea_24 = a2;
            kea_23 = kea_24;
            kea_24.J += WOa.fa;
        }
        kea_2 kea_25 = a2;
        while (kea_25.J >= WOa.fa) {
            kea_2 kea_26 = a2;
            kea_25 = kea_26;
            kea_26.J -= WOa.fa;
        }
    }

    /*
     * WARNING - void declaration
     */
    private int J(eAa eAa2) {
        int b2;
        kea_2 kea_22 = this;
        int n2 = b2 = uSa.E;
        while (n2 < kea_22.j.length) {
            void a2;
            if (kea_22.j[b2] != null && kea_22.j[b2].J() == a2) {
                return b2;
            }
            n2 = ++b2;
        }
        return pua.o;
    }

    public void J() {
        int a2;
        kea_2 kea_22 = this;
        int n2 = a2 = uSa.E;
        while (n2 < kea_22.j.length) {
            if (kea_22.j[a2] != null) {
                kea_2 kea_23 = kea_22;
                kea_23.k.J(kea_23.j[a2], vRa.d != 0, uSa.E != 0);
                kea_22.j[a2] = null;
            }
            n2 = ++a2;
        }
        int n3 = a2 = uSa.E;
        while (n3 < kea_22.A.length) {
            if (kea_22.A[a2] != null) {
                kea_2 kea_24 = kea_22;
                kea_24.k.J(kea_24.A[a2], vRa.d != 0, uSa.E != 0);
                kea_22.A[a2] = null;
            }
            n3 = ++a2;
        }
    }

    public Mda l(int n2) {
        int b2 = n2;
        kea_2 a2 = this;
        return a2.A[b2];
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        int b2;
        float a2;
        void v0;
        kea_2 kea_22 = this;
        a2 /= YSa.G;
        if (v0 < pqa.r) {
            a2 = pqa.r;
        }
        int n2 = b2 = uSa.E;
        while (n2 < kea_22.A.length) {
            if (kea_22.A[b2] != null && kea_22.A[b2].J() instanceof VEa) {
                kea_2 kea_23 = kea_22;
                kea_22.A[b2].J((int)a2, (Gl)kea_23.k);
                if (kea_23.A[b2].E == 0) {
                    kea_22.A[b2] = null;
                }
            }
            n2 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(eAa eAa2, int n2, boolean n3, boolean bl) {
        int a2;
        void c2;
        void d2;
        int e2 = n3;
        kea_2 b2 = this;
        Mda mda2 = b2.f();
        int n4 = e2 = e2 != 0 ? b2.J((eAa)d2, (int)c2) : b2.J((eAa)d2);
        if (e2 >= 0 && e2 < WOa.fa) {
            b2.J = e2;
            return;
        }
        if (a2 != 0 && d2 != null) {
            e2 = b2.e();
            if (e2 >= 0 && e2 < WOa.fa) {
                b2.J = e2;
            }
            if (mda2 == null || !mda2.G() || b2.J(mda2.J(), mda2.f()) != b2.J) {
                kea_2 kea_22;
                e2 = b2.J((eAa)d2, (int)c2);
                if (e2 >= 0) {
                    kea_2 kea_23 = b2;
                    a2 = kea_23.j[e2].E;
                    kea_2 kea_24 = b2;
                    kea_22 = kea_24;
                    kea_23.j[e2] = kea_24.j[b2.J];
                } else {
                    a2 = vRa.d;
                    kea_22 = b2;
                }
                kea_22.j[b2.J] = new Mda((eAa)d2, a2, (int)c2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public int J(eAa eAa2, int n2, int n3, Waa waa2) {
        int n4;
        void b2;
        void a2;
        void c2;
        void d2;
        Mda mda2;
        int n5;
        kea_2 kea_22 = this;
        int e2 = uSa.E;
        int n6 = n5 = uSa.E;
        while (n6 < kea_22.j.length) {
            mda2 = kea_22.j[n5];
            if (!(mda2 == null || d2 != null && mda2.J() != d2 || c2 > pua.o && mda2.J() != c2 || a2 != null && !rba.J((NCa)a2, (NCa)mda2.J(), vRa.d != 0))) {
                n4 = b2 <= 0 ? mda2.E : Math.min((int)(b2 - e2), mda2.E);
                e2 += n4;
                if (b2 != false) {
                    kea_2 kea_23 = kea_22;
                    kea_23.j[n5].E -= n4;
                    if (kea_23.j[n5].E == 0) {
                        kea_22.j[n5] = null;
                    }
                    if (b2 > 0 && e2 >= b2) {
                        return e2;
                    }
                }
            }
            n6 = ++n5;
        }
        int n7 = n5 = uSa.E;
        while (n7 < kea_22.A.length) {
            mda2 = kea_22.A[n5];
            if (!(mda2 == null || d2 != null && mda2.J() != d2 || c2 > pua.o && mda2.J() != c2 || a2 != null && !rba.J((NCa)a2, (NCa)mda2.J(), uSa.E != 0))) {
                n4 = b2 <= 0 ? mda2.E : Math.min((int)(b2 - e2), mda2.E);
                e2 += n4;
                if (b2 != false) {
                    kea_2 kea_24 = kea_22;
                    kea_24.A[n5].E -= n4;
                    if (kea_24.A[n5].E == 0) {
                        kea_22.A[n5] = null;
                    }
                    if (b2 > 0 && e2 >= b2) {
                        return e2;
                    }
                }
            }
            n7 = ++n5;
        }
        if (kea_22.I != null) {
            if (d2 != null && kea_22.I.J() != d2) {
                return e2;
            }
            if (c2 > pua.o && kea_22.I.J() != c2) {
                return e2;
            }
            if (a2 != null && !rba.J((NCa)a2, (NCa)kea_22.I.J(), uSa.E != 0)) {
                return e2;
            }
            n5 = b2 <= 0 ? kea_22.I.E : Math.min((int)(b2 - e2), kea_22.I.E);
            e2 += n5;
            if (b2 != false) {
                kea_2 kea_25 = kea_22;
                kea_25.I.E -= n5;
                if (kea_25.I.E == 0) {
                    kea_22.I = null;
                }
                if (b2 > 0 && e2 >= b2) {
                    return e2;
                }
            }
        }
        return e2;
    }
}

