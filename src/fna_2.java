/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  Gc
 *  JPa
 *  KA
 *  Kpa
 *  Woa
 *  Ypa
 *  aMa
 *  ac
 *  cNa
 *  hra
 *  koa
 *  mma
 *  pua
 *  toa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class fna_2
extends qMa {
    private final OX<KA> C;
    private KA i;
    private final List<Woa> M;
    private final List<aMa> k;
    private int j;
    private Gc A;
    private final toa[][] I;

    /*
     * WARNING - void declaration
     */
    public fna_2(Kpa kpa2, int n2, int n3, int n4, int n5, int n6, Gc gc2, toa[] ... toaArray) {
        toa[][] i2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        void h2;
        toa[][] toaArray2 = toaArray3;
        toa[][] toaArray3 = toaArray;
        toa[][] a2 = toaArray2;
        super((Kpa)h2, (int)g2, (int)f2, (int)e2, (int)d2, (int)c2);
        a2.k = Lists.newArrayList();
        toa[][] toaArray4 = a2;
        a2.C = new OX();
        a2.M = Lists.newArrayList();
        a2.A = b2;
        a2.I = i2;
        a2.b = uSa.E;
        super.d();
        super.C();
    }

    public void M() {
        fna_2 a2;
        fna_2 fna_22 = a2;
        if (fna_22.j < fna_22.I.length - vRa.d) {
            fna_2 fna_23 = a2;
            fna_23.l(fna_23.j + vRa.d);
        }
    }

    public aMa J(int n2) {
        int b2 = n2;
        fna_2 a2 = this;
        return a2.k.get(b2);
    }

    public int e() {
        fna_2 a2;
        return a2.k.size();
    }

    public KA J() {
        fna_2 a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     */
    private cNa J(int n2, int n3, koa koa2) {
        void b2;
        void c2;
        fna_2 d2 = koa2;
        fna_2 a2 = this;
        new cNa(a2.A, d2.J(), (int)c2, (int)b2, d2.J(), d2.J(), d2.f(), d2.l(), d2.J()).k = d2.J();
        return new cNa(a2.A, d2.J(), (int)c2, (int)b2, d2.J(), d2.J(), d2.f(), d2.l(), d2.J());
    }

    public void e() {
        fna_2 a2;
        if (a2.j > 0) {
            fna_2 fna_22 = a2;
            fna_22.l(fna_22.j - vRa.d);
        }
    }

    /*
     * WARNING - void declaration
     */
    private Lna J(int n2, int n3, gma gma2) {
        void b2;
        void c2;
        gma d2 = gma2;
        fna_2 a2 = this;
        new Lna(a2.A, d2.J(), (int)c2, (int)b2, d2.J(), d2.f()).k = d2.J();
        return new Lna(a2.A, d2.J(), (int)c2, (int)b2, d2.J(), d2.f());
    }

    public int A() {
        fna_2 a2;
        return a2.I.length;
    }

    /*
     * WARNING - void declaration
     */
    private void J(KA kA2, boolean bl) {
        void a2;
        fna_2 c2 = kA2;
        fna_2 b2 = this;
        if (c2 instanceof ac) {
            ((ac)c2).k = a2;
            return;
        }
        if (c2 instanceof Woa) {
            ((Woa)c2).f((boolean)a2);
            return;
        }
        if (c2 instanceof ona) {
            ((ona)((Object)c2)).M = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void l(boolean bl) {
        fna_2 fna_22 = this;
        for (aMa b2 : fna_22.k) {
            void a2;
            if (aMa.J((aMa)b2) instanceof ac) {
                ((ac)aMa.J((aMa)b2)).J = a2;
            }
            if (!(aMa.l((aMa)b2) instanceof ac)) continue;
            ((ac)aMa.l((aMa)b2)).J = a2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void J(char c2, int n2) {
        int n3;
        int b2;
        void a22;
        fna_2 fna_22 = this;
        if (!(fna_22.i instanceof Woa)) return;
        Woa woa2 = (Woa)fna_22.i;
        if (!EC.f((int)a22)) {
            if (a22 == Ypa.A) {
                fna_2 fna_23;
                woa2.l(uSa.E != 0);
                int c3 = fna_22.M.indexOf(fna_22.i);
                if (EC.l()) {
                    if (c3 == 0) {
                        fna_2 fna_24 = fna_22;
                        fna_23 = fna_24;
                        c3 = fna_24.M.size() - vRa.d;
                    } else {
                        --c3;
                        fna_23 = fna_22;
                    }
                } else if (c3 == fna_22.M.size() - vRa.d) {
                    c3 = uSa.E;
                    fna_23 = fna_22;
                } else {
                    ++c3;
                    fna_23 = fna_22;
                }
                fna_23.i = (KA)fna_22.M.get((int)c3);
                woa2 = (Woa)fna_22.i;
                woa2.l(vRa.d != 0);
                int n4 = woa2.D + fna_22.D;
                int n5 = woa2.D;
                if (n4 > fna_22.J) {
                    fna_22.i += (float)(n4 - fna_22.J);
                    return;
                }
                if (n5 >= fna_22.M) return;
                fna_22.i = (KA)((float)n5);
                return;
            }
            woa2.J((char)b2, (int)a22);
            return;
        }
        String c3 = EC.J();
        String[] stringArray = c3.split(rua.Aa);
        fna_2 fna_25 = fna_22;
        b2 = n3 = fna_25.M.indexOf(fna_25.i);
        String[] a22 = stringArray;
        int n6 = stringArray.length;
        int n7 = c3 = uSa.E;
        while (n7 < n6) {
            String string = a22[c3];
            fna_22.M.get(b2).f(string);
            if ((b2 == fna_22.M.size() - vRa.d ? uSa.E : ++b2) == n3) {
                return;
            }
            n7 = ++c3;
        }
    }

    public int i() {
        fna_2 a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2, int n3, int n4) {
        boolean a2;
        void b2;
        fna_2 c2;
        int d22 = n2;
        fna_2 fna_22 = c2 = this;
        a2 = super.J(d22, (int)b2, a2 ? 1 : 0);
        if ((d22 = fna_22.J(d22, (int)b2)) >= 0) {
            fna_2 fna_23 = c2;
            aMa d22 = fna_23.J(d22);
            if (fna_23.i != aMa.f((aMa)d22) && c2.i != null && c2.i instanceof Woa) {
                ((Woa)c2.i).l(uSa.E != 0);
            }
            c2.i = aMa.f((aMa)d22);
        }
        return a2;
    }

    private void d() {
        int n2;
        fna_2 fna_22 = this;
        toa[][] toaArray = fna_22.I;
        int n3 = fna_22.I.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            toa[] toaArray2 = toaArray[n2];
            int n5 = uSa.E;
            while (n5 < toaArray2.length) {
                int n6;
                fna_2 a2 = toaArray2[n6];
                toa toa2 = n6 < toaArray2.length - vRa.d ? toaArray2[n6 + vRa.d] : null;
                KA kA2 = fna_22.J((toa)a2, uSa.E, (toa2 == null ? vRa.d : uSa.E) != 0);
                KA kA3 = fna_22.J(toa2, rRa.f, (a2 == null ? vRa.d : uSa.E) != 0);
                aMa aMa2 = new aMa(kA2, kA3);
                fna_22.k.add(aMa2);
                if (a2 != null && kA2 != null) {
                    KA kA4 = kA2;
                    fna_22.C.J(a2.J(), kA4);
                    if (kA4 instanceof Woa) {
                        fna_22.M.add((Woa)kA2);
                    }
                }
                if (toa2 != null && kA3 != null) {
                    KA kA5 = kA3;
                    fna_22.C.J(toa2.J(), kA5);
                    if (kA5 instanceof Woa) {
                        fna_22.M.add((Woa)kA3);
                    }
                }
                n5 = n6 += 2;
            }
            n4 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private Woa J(int n2, int n3, yNa yNa2) {
        void b2;
        Woa c2;
        yNa d2 = yNa2;
        fna_2 a2 = this;
        Woa woa2 = c2 = new Woa(d2.J(), a2.B.Ea, (int)c2, (int)b2, Jpa.Ha, kTa.j);
        Woa woa3 = c2;
        woa3.f(d2.J());
        woa3.J(a2.A);
        woa2.f(d2.J());
        woa2.J(d2.J());
        return woa2;
    }

    public void l(int n2) {
        int b2 = n2;
        fna_2 a2 = this;
        if (b2 != a2.j) {
            fna_2 fna_22 = a2;
            int n3 = fna_22.j;
            fna_22.j = b2;
            fna_22.C();
            fna_22.C(n3, b2);
            fna_22.i = (KA)JPa.N;
        }
    }

    public int M() {
        fna_2 a2;
        return super.M() + fPa.i;
    }

    /*
     * WARNING - void declaration
     */
    private KA J(toa toa2, int n2, boolean bl) {
        void b2;
        fna_2 d2 = toa2;
        fna_2 c2 = this;
        if (d2 instanceof koa) {
            fna_2 fna_22 = c2;
            return fna_22.J(fna_22.E / uqa.g - BQa.Q + b2, uSa.E, (koa)d2);
        }
        if (d2 instanceof gma) {
            fna_2 fna_23 = c2;
            return fna_23.J(fna_23.E / uqa.g - BQa.Q + b2, uSa.E, (gma)((Object)d2));
        }
        if (d2 instanceof yNa) {
            fna_2 fna_24 = c2;
            return fna_24.J(fna_24.E / uqa.g - BQa.Q + b2, uSa.E, (yNa)((Object)d2));
        }
        if (d2 instanceof mma) {
            void a2;
            fna_2 fna_25 = c2;
            return fna_25.J(fna_25.E / uqa.g - BQa.Q + b2, uSa.E, (mma)d2, (boolean)a2);
        }
        return null;
    }

    public KA J(int n2) {
        int b2 = n2;
        fna_2 a2 = this;
        return a2.C.J(b2);
    }

    private void C() {
        int n2;
        fna_2 fna_22 = this;
        fna_22.k.clear();
        int n3 = n2 = uSa.E;
        while (true) {
            toa toa2;
            fna_2 fna_23 = fna_22;
            if (n3 >= fna_23.I[fna_23.j].length) break;
            fna_2 fna_24 = fna_22;
            fna_2 a2 = fna_24.I[fna_24.j][n2];
            fna_2 fna_25 = fna_22;
            if (n2 < fna_25.I[fna_25.j].length - vRa.d) {
                fna_2 fna_26 = fna_22;
                toa2 = fna_26.I[fna_26.j][n2 + vRa.d];
            } else {
                toa2 = null;
            }
            toa toa3 = toa2;
            a2 = fna_22.C.J(a2.J());
            KA kA2 = toa3 != null ? fna_22.C.J(toa3.J()) : null;
            a2 = new aMa((KA)a2, kA2);
            fna_22.k.add((aMa)a2);
            n3 = n2 += 2;
        }
    }

    public int l() {
        return hra.i;
    }

    /*
     * WARNING - void declaration
     */
    private void C(int n2, int n3) {
        void a2;
        toa toa2;
        int c2;
        void b22;
        fna_2 fna_22 = this;
        toa[] b22 = fna_22.I[b22];
        int n4 = b22.length;
        int n5 = c2 = uSa.E;
        while (n5 < n4) {
            toa2 = b22[c2];
            if (toa2 != null) {
                fna_2 fna_23 = fna_22;
                fna_23.J(fna_23.C.J(toa2.J()), uSa.E != 0);
            }
            n5 = ++c2;
        }
        b22 = fna_22.I[a2];
        n4 = b22.length;
        int n6 = c2 = uSa.E;
        while (n6 < n4) {
            toa2 = b22[c2];
            if (toa2 != null) {
                fna_2 fna_24 = fna_22;
                fna_24.J(fna_24.C.J(toa2.J()), vRa.d != 0);
            }
            n6 = ++c2;
        }
    }

    /*
     * WARNING - void declaration
     */
    private ona J(int n2, int n3, mma mma2, boolean bl) {
        ona ona2;
        void c2;
        void b2;
        void d2;
        void e2;
        boolean bl2 = bl;
        fna_2 a2 = this;
        if (e2 != false) {
            void v0 = d2;
            ona2 = e2 = new ona(a2.B.Ea, b2.J(), (int)v0, (int)c2, a2.E - v0 * uqa.g, kTa.j, pua.o);
        } else {
            ona2 = e2 = new ona(a2.B.Ea, b2.J(), (int)d2, (int)c2, Jpa.Ha, kTa.j, pua.o);
        }
        ona2.M = b2.J();
        ona ona3 = e2;
        ona3.J(b2.J());
        ona3.J();
        return ona3;
    }
}

