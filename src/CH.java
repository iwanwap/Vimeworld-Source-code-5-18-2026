/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  IH
 *  JPa
 *  Kh
 *  Oz
 *  UG
 *  UI
 *  di
 *  g
 *  hG
 *  pua
 *  rr
 *  uKa
 *  ui
 *  vRa
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CH
extends UG {
    private g L;
    private final int E;
    private final int m;
    private int C;
    private final UI i;
    private final boolean M;
    private boolean k;
    private final di j;
    private final int J;
    private int A;
    private final IH[] I;

    public void J(rr rr2) {
        CH b2 = rr2;
        CH a2 = this;
        ui ui2 = a2.J(((rr)b2).k);
        uKa.C((int)ui2.I);
        if (((rr)b2).M.isRepeat()) {
            Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)((rr)b2).I.f());
            return;
        }
        ui ui3 = ui2;
        ui ui4 = ui2;
        Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)ui3.A, (float)ui3.j, (float)ui4.k, (float)ui4.J, (float)((rr)b2).I.f());
    }

    public ui J(PG pG) {
        Object object;
        block5: {
            Object b2;
            block4: {
                CH a2;
                block3: {
                    b2 = pG;
                    CH cH = a2 = this;
                    b2 = cH.J((PG)b2, OT.e);
                    if (cH.L == null || !a2.L.J()) break block3;
                    if (((IH)b2).A == a2.C) break block4;
                    a2.j.J(((IH)b2).j, a2.L.J(((IH)b2).A), (!a2.i.isRepeat() ? vRa.d : uSa.E) != 0);
                    CH cH2 = a2;
                    Object object2 = b2;
                    object = object2;
                    cH2.C = ((IH)object2).A;
                    cH2.k = vRa.d;
                    break block5;
                }
                if (!a2.k) {
                    int n2;
                    long l2 = OT.A ? System.nanoTime() : nqa.i;
                    int n3 = n2 = uSa.E;
                    while (n3 < a2.I.length - vRa.d) {
                        CH cH = a2;
                        cH.j.J(cH.I[n2].j, a2.L.J(n2), (!a2.i.isRepeat() ? vRa.d : uSa.E) != 0);
                        n3 = ++n2;
                    }
                    a2.k = vRa.d;
                    a2.L = null;
                    if (OT.A) {
                        Object[] objectArray = new Object[AQa.P];
                        objectArray[uSa.E] = a2.J;
                        objectArray[vRa.d] = a2.m;
                        objectArray[uqa.g] = a2.I.length - vRa.d;
                        objectArray[yRa.d] = Float.valueOf((float)Math.round((double)(System.nanoTime() - l2) / Eqa.w) / QTa.G);
                        OT.J(qsa.A, objectArray);
                    }
                }
            }
            object = b2;
        }
        return ((IH)object).j.J();
    }

    public int f() {
        CH a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    private IH J(PG pG, long l2) {
        void a2;
        Object c2 = pG;
        CH b2 = this;
        if (c2 == null) {
            return b2.I[uSa.E];
        }
        long l3 = a2 - ((PG)c2).A;
        if (b2.E == 0 || ((PG)c2).I < (long)b2.E) {
            l3 = (long)((double)l3 * ((PG)c2).j);
            if ((l3 -= ((PG)c2).I * (long)b2.A) > (long)b2.A) {
                Object object = c2;
                ((PG)object).I += l3 / (long)b2.A;
                ((PG)object).J = uSa.E;
                return b2.J((PG)object, (long)a2);
            }
            int n2 = a2 = ((PG)c2).J + vRa.d;
            while (n2 < b2.I.length) {
                if ((long)b2.I[a2].J > l3) {
                    ((PG)c2).J = Math.max(uSa.E, a2 - vRa.d);
                    break;
                }
                n2 = ++a2;
            }
        } else {
            ((PG)c2).J = b2.I.length - uqa.g;
        }
        return b2.I[((PG)c2).J];
    }

    public void J() {
        int a2;
        CH cH = this;
        if (!cH.k || !cH.M) {
            return;
        }
        int n2 = a2 = uSa.E;
        while (n2 < cH.I.length) {
            if (a2 == 0 || cH.I[a2 - vRa.d].j.M != cH.I[a2].j.M) {
                CH cH2 = cH;
                cH2.j.J(cH2.I[a2].j.M);
            }
            n2 = ++a2;
        }
    }

    public int l() {
        CH a2;
        return a2.I.length - vRa.d;
    }

    public int J() {
        CH a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(List<hG> list, int n2) {
        Iterator<hG> iterator;
        void a2;
        List<hG> list2 = list;
        int n3 = uSa.E;
        int n4 = uSa.E;
        int n5 = uSa.E;
        int n6 = uSa.E;
        Fi fi2 = new Fi(uSa.E, uSa.E, uSa.E != 0, (int)a2);
        Iterator<hG> iterator2 = iterator = list2.iterator();
        while (iterator2.hasNext()) {
            hG hG2;
            hG b2 = iterator.next();
            if (n3 + b2.k < di.E) {
                hG hG3 = b2;
                hG3.I = n3;
                hG3.j = n4;
                n5 = Math.max(n3 += b2.k, n5);
                hG hG4 = b2;
                hG2 = hG4;
                n6 = Math.max(n4 + hG4.J, n6);
            } else if (n4 + b2.J < di.E) {
                b2.j = n4 += b2.J;
                n3 = b2.k;
                hG hG5 = b2;
                hG2 = hG5;
                n6 = Math.max(n4 + hG5.J, n6);
            } else {
                fi2.M = Oz.C((int)n5);
                fi2.j = Oz.C((int)n6);
                fi2 = new Fi(uSa.E, uSa.E, uSa.E != 0, (int)a2);
                hG hG6 = b2;
                hG2 = hG6;
                n5 = hG6.k;
                n6 = hG6.J;
            }
            hG2.M = fi2;
            iterator2 = iterator;
        }
        fi2.M = Oz.C((int)n5);
        fi2.j = Oz.C((int)n6);
    }

    /*
     * WARNING - void declaration
     */
    public CH(di di2, g g2, boolean bl, UI uI2, boolean bl2) {
        Object f22;
        void b2;
        void c22;
        void d2;
        void e2;
        CH cH;
        CH cH2 = cH = this;
        cH.C = pua.o;
        cH.j = e2;
        cH2.L = d2;
        cH2.I = new IH[d2.l() + vRa.d];
        CH cH3 = cH;
        CH cH4 = cH;
        void v3 = d2;
        cH.E = v3.J();
        cH4.J = v3.f();
        cH4.m = d2.C();
        cH3.M = c22;
        cH3.i = b2;
        if (d2.J()) {
            int f22;
            hG hG2;
            if (c22 != false) {
                void v5;
                int n2;
                void a2;
                if (a2 != false) {
                    n2 = Oz.C((int)cH.J);
                    v5 = a2;
                } else {
                    n2 = cH.J;
                    v5 = a2;
                }
                f22 = new Fi(n2, v5 != false ? Oz.C((int)cH.m) : cH.m, uSa.E != 0, b2.getMipmapLevel());
                new Fi(n2, v5 != false ? Oz.C((int)cH.m) : cH.m, uSa.E != 0, b2.getMipmapLevel()).I = b2.getMipmapLevel();
                CH cH5 = cH;
                hG2 = new hG((Fi)f22, uSa.E, uSa.E, cH5.J, cH5.m);
            } else {
                CH cH6 = cH;
                hG2 = e2.J(cH6.J, cH6.m);
            }
            int n3 = f22 = uSa.E;
            while (n3 < cH.I.length - vRa.d) {
                CH cH7 = cH;
                int n4 = f22;
                int n5 = f22;
                cH7.I[n5] = new IH(n5, hG2, d2.J(f22), cH.A);
                IH iH = cH.I[f22];
                cH7.A += iH.I;
                n3 = ++f22;
            }
        } else if (c22 != false) {
            int f22;
            ArrayList<hG> arrayList = new ArrayList<hG>();
            int n6 = f22 = uSa.E;
            while (n6 < cH.I.length - vRa.d) {
                CH cH8 = cH;
                hG c22 = new hG(null, uSa.E, uSa.E, cH8.J, cH8.m);
                arrayList.add(c22);
                CH cH9 = cH;
                int n7 = f22;
                cH9.I[n7] = new IH(n7, c22, d2.J(f22), cH.A);
                IH iH = cH.I[f22];
                cH9.A += iH.I;
                n6 = ++f22;
            }
            if (b2.isRepeat()) {
                Iterator iterator = f22 = arrayList.iterator();
                while (iterator.hasNext()) {
                    hG c22 = (hG)f22.next();
                    iterator = f22;
                    c22.M = new Fi(c22.k, c22.J, uSa.E != 0, b2.getMipmapLevel());
                }
            } else {
                CH.J(arrayList, b2.getMipmapLevel());
            }
        } else {
            int n8;
            int n9 = n8 = uSa.E;
            while (n9 < cH.I.length - vRa.d) {
                CH cH10 = cH;
                f22 = e2.J(cH10.J, cH10.m);
                CH cH11 = cH;
                int n10 = n8;
                cH11.I[n10] = new IH(n10, (hG)f22, d2.J(n8), cH.A);
                IH iH = cH.I[n8];
                cH11.A += iH.I;
                n9 = ++n8;
            }
        }
        CH cH12 = cH;
        CH cH13 = cH;
        cH12.I[cH12.I.length - vRa.d] = new IH(cH.I.length - vRa.d, cH13.I[cH13.I.length - uqa.g].j, uSa.E, cH.A);
    }
}

