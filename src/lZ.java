/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  ERa
 *  Gg
 *  ISa
 *  JPa
 *  Lz
 *  NTa
 *  Oz
 *  kta
 *  nda
 *  pua
 *  vL
 *  vRa
 */
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lZ {
    private int m;
    private Gg C;
    private int i;
    private boolean M;
    private Aaa k;
    private int j;
    private int J;
    private int A;
    private int I;

    public lZ(Gg gg2) {
        lZ b2 = gg2;
        lZ a2 = this;
        a2.I = pua.o;
        a2.C = b2;
    }

    public void J() {
        lZ lZ2 = this;
        if (lZ2.C.e()) {
            lZ2.I = uSa.E;
            return;
        }
        if (lZ2.I != uqa.g) {
            if (lZ2.I == 0) {
                float a2 = lZ2.C.e(JPa.N);
                if ((double)a2 < kTa.B || (double)a2 > ISa.u) {
                    return;
                }
                lZ2.I = lZ2.C.v.nextInt(NTa.C) == 0 ? vRa.d : uqa.g;
                lZ2.M = uSa.E;
                if (lZ2.I == uqa.g) {
                    return;
                }
            }
            if (lZ2.I != pua.o) {
                if (!lZ2.M) {
                    if (!lZ2.f()) {
                        return;
                    }
                    lZ2.M = vRa.d;
                }
                if (lZ2.i > 0) {
                    lZ2.i -= vRa.d;
                    return;
                }
                lZ2.i = uqa.g;
                if (lZ2.A > 0) {
                    lZ2.J();
                    lZ2.A -= vRa.d;
                    return;
                }
                lZ2.I = uqa.g;
            }
        }
    }

    private boolean f() {
        lZ lZ2 = this;
        Iterator iterator = lZ2.C.w.iterator();
        while (true) {
            int n2;
            block7: {
                if (!iterator.hasNext()) {
                    return uSa.E != 0;
                }
                Object object = (Sx)((Object)iterator.next());
                if (object.t()) continue;
                lZ lZ3 = lZ2;
                lZ3.k = lZ3.C.J().J(new XF((vL)object), vRa.d);
                if (lZ3.k == null || lZ2.k.C() < NTa.C || lZ2.k.f() < kTa.j || lZ2.k.J() < kTa.j) continue;
                lZ lZ4 = lZ2;
                object = lZ4.k.J();
                float f2 = lZ4.k.l();
                int a2 = uSa.E;
                int n3 = uSa.E;
                while (n3 < NTa.C) {
                    int n4;
                    int n5;
                    block6: {
                        Object object2 = object;
                        float f3 = lZ2.C.v.nextFloat() * pua.j * kta.v;
                        lZ2.J = object2.getX() + (int)((double)(Oz.C((float)f3) * f2) * Tqa.ja);
                        lZ2.j = object2.getY();
                        lZ2.m = object.getZ() + (int)((double)(Oz.d((float)f3) * f2) * Tqa.ja);
                        a2 = uSa.E;
                        for (Aaa aaa2 : lZ2.C.J().J()) {
                            if (aaa2 == lZ2.k) continue;
                            lZ lZ5 = lZ2;
                            if (!aaa2.J(new XF(lZ5.J, lZ5.j, lZ2.m))) continue;
                            n5 = a2 = vRa.d;
                            break block6;
                        }
                        n5 = a2;
                    }
                    if (n5 == 0) {
                        n2 = a2;
                        break block7;
                    }
                    n3 = ++n4;
                }
                n2 = a2;
            }
            if (n2 != 0) {
                return uSa.E != 0;
            }
            lZ lZ6 = lZ2;
            Lz lz2 = lZ2.J(new XF(lZ6.J, lZ6.j, lZ2.m));
            if (lz2 != null) break;
        }
        lZ2.i = uSa.E;
        lZ2.A = kTa.j;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Lz J(XF xF) {
        int n2;
        lZ lZ2 = this;
        int n3 = n2 = uSa.E;
        while (n3 < NTa.C) {
            void a2;
            Object b2 = a2.add(lZ2.C.v.nextInt(ERa.C) - Yqa.i, lZ2.C.v.nextInt(uua.p) - yRa.d, lZ2.C.v.nextInt(ERa.C) - Yqa.i);
            if (lZ2.k.J((XF)((Object)b2)) && Qz.J(eIa.ON_GROUND, lZ2.C, (XF)((Object)b2))) {
                return new Lz((double)b2.getX(), (double)b2.getY(), (double)b2.getZ());
            }
            n3 = ++n2;
        }
        return null;
    }

    private boolean J() {
        lZ a2;
        lZ lZ2;
        lZ lZ3 = lZ2 = this;
        lZ lZ4 = lZ2;
        lZ lZ5 = lZ2;
        Lz lz2 = lZ4.J(new XF(lZ4.J, lZ5.j, lZ5.m));
        if (lz2 == null) {
            return uSa.E != 0;
        }
        try {
            a2 = new nda(lZ2.C);
            a2.J(lZ2.C.J(new XF((vL)a2)), null);
            a2.I(uSa.E != 0);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return uSa.E != 0;
        }
        a2.f(lz2.A, lz2.j, lz2.J, lZ2.C.v.nextFloat() * CRa.ja, JPa.N);
        lZ2.C.f((vL)a2);
        XF xF = lZ2.k.J();
        a2.J(xF, lZ2.k.l());
        return vRa.d != 0;
    }
}

