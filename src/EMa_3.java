/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Kna
 *  Kpa
 *  Mda
 *  PNa
 *  QSa
 *  Qsa
 *  Vua
 *  Wsa
 *  aX
 *  cRa
 *  cb
 *  eAa
 *  lX
 *  lqa
 *  pKa
 *  pqa
 *  pua
 *  vPa
 *  vRa
 *  wra
 *  ysa
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class EMa_3
extends cb {
    public int f;
    public Comparator<lX> m;
    public final /* synthetic */ cna C;
    public int i;
    public int j;
    public List<lX> I;

    public abstract String J(int var1);

    public final lX J(int n2) {
        int b2 = n2;
        EMa_3 a2 = this;
        return a2.I.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(lX lX2, int n2, int n3) {
        Object d2 = lX2;
        EMa_3 c2 = this;
        if (d2 != null) {
            d2 = d2.J();
            d2 = new Mda((eAa)d2).f();
            d2 = new StringBuilder().insert(2 & 5, Mqa.y).append(oha.J(new StringBuilder().insert(3 >> 2, (String)d2).append(tpa.N).toString(), new Object[uSa.E])).toString().trim();
            if (((String)d2).length() > 0) {
                void a2;
                void b2;
                EMa_3 eMa_3 = c2;
                int n4 = cna.e(eMa_3.C).J((String)d2);
                cna.f(eMa_3.C, (int)((b2 += lqa.s) - yRa.d), (int)((a2 -= lqa.s) - yRa.d), (int)(b2 + n4 + yRa.d), (int)(a2 + Yqa.i + yRa.d), Jsa.ca, Jsa.ca);
                cna.C(eMa_3.C).J((String)d2, (float)b2, (float)a2, pua.o);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3) {
        void a2;
        int c2 = n2;
        EMa_3 b2 = this;
        if (a2 >= b2.M && a2 <= b2.J) {
            EMa_3 eMa_3 = b2;
            int n4 = eMa_3.J(c2, (int)a2);
            int n5 = eMa_3.E / uqa.g - iSa.ca - ERa.C;
            if (n4 >= 0) {
                if (c2 < n5 + wra.P || c2 > n5 + wra.P + kTa.j) {
                    return;
                }
                EMa_3 eMa_32 = b2;
                lX lX2 = eMa_32.J(n4);
                eMa_32.J(lX2, c2, (int)a2);
                return;
            }
            String string = Mqa.y;
            if (c2 >= n5 + pta.ba - yOa.B && c2 <= n5 + pta.ba) {
                string = b2.J(uSa.E);
            } else if (c2 >= n5 + Yqa.o - yOa.B && c2 <= n5 + Yqa.o) {
                string = b2.J(vRa.d);
            } else {
                if (c2 < n5 + QSa.w - yOa.B || c2 > n5 + QSa.w) {
                    return;
                }
                string = b2.J(uqa.g);
            }
            string = new StringBuilder().insert(3 >> 2, Mqa.y).append(oha.J(string, new Object[uSa.E])).toString().trim();
            if (string.length() > 0) {
                EMa_3 eMa_33 = b2;
                n4 = cna.j(eMa_33.C).J(string);
                cna.J(eMa_33.C, (c2 += lqa.s) - yRa.d, (int)((a2 -= lqa.s) - yRa.d), c2 + n4 + yRa.d, (int)(a2 + Yqa.i + yRa.d), Jsa.ca, Jsa.ca);
                cna.g(eMa_33.C).J(string, (float)c2, (float)a2, pua.o);
            }
        }
    }

    public void J(int n2, int n3) {
        EMa_3 eMa_3;
        int c2 = n2;
        EMa_3 b2 = this;
        b2.j = pua.o;
        if (c2 >= vPa.Ka && c2 < pta.ba) {
            eMa_3 = b2;
            b2.j = uSa.E;
        } else if (c2 >= rpa.F && c2 < Yqa.o) {
            eMa_3 = b2;
            b2.j = vRa.d;
        } else {
            if (c2 >= Fsa.H && c2 < QSa.w) {
                b2.j = uqa.g;
            }
            eMa_3 = b2;
        }
        if (eMa_3.j >= 0) {
            EMa_3 eMa_32 = b2;
            eMa_32.l(eMa_32.j);
            eMa_32.B.J().J((X)PNa.J((ResourceLocation)new ResourceLocation(cRa.u), (float)pqa.r));
        }
    }

    public final int e() {
        EMa_3 a2;
        return a2.I.size();
    }

    public boolean f(int n2) {
        int b2 = n2;
        EMa_3 a2 = this;
        return uSa.E != 0;
    }

    public void l() {
        EMa_3 a2;
        a2.C.i();
    }

    public void J(int n2, boolean bl2, int n3, int n4) {
        int n5 = n4;
        EMa_3 a2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(aX aX2, int n2, int n3, boolean bl2) {
        void a2;
        void b2;
        void c2;
        Object e2;
        void d2;
        EMa_3 eMa_3 = this;
        if (d2 != null) {
            void v0 = d2;
            e2 = v0.J(cna.J(eMa_3.C).J((aX)v0));
            EMa_3 eMa_32 = eMa_3;
            cna cfr_ignored_0 = eMa_32.C;
            Object object = e2;
            cna.J((Kna)cna.k(eMa_32.C), (String)object, (int)(c2 - cna.A(eMa_3.C).J((String)object)), (int)(b2 + tTa.h), (int)(a2 != false ? Wsa.K : uqa.A));
            return;
        }
        e2 = Vua.m;
        EMa_3 eMa_33 = eMa_3;
        cna cfr_ignored_1 = eMa_33.C;
        Object object = e2;
        cna.J((Kna)cna.M(eMa_33.C), (String)object, (int)(c2 - cna.H(eMa_3.C).J((String)object)), (int)(b2 + tTa.h), (int)(a2 != false ? Wsa.K : uqa.A));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, pKa pKa2) {
        EMa_3 eMa_3;
        EMa_3 eMa_32;
        void c2;
        EMa_3 eMa_33;
        int d2 = n3;
        EMa_3 b2 = this;
        if (!Mouse.isButtonDown(uSa.E)) {
            b2.j = pua.o;
        }
        if (b2.j == 0) {
            EMa_3 eMa_34 = b2;
            eMa_33 = eMa_34;
            cna.J(eMa_34.C, (int)(c2 + pta.ba - yOa.B), d2 + vRa.d, uSa.E, uSa.E);
        } else {
            EMa_3 eMa_35 = b2;
            eMa_33 = eMa_35;
            cna.J(eMa_35.C, (int)(c2 + pta.ba - yOa.B), d2 + vRa.d, uSa.E, yOa.B);
        }
        if (eMa_33.j == vRa.d) {
            EMa_3 eMa_36 = b2;
            eMa_32 = eMa_36;
            cna.J(eMa_36.C, (int)(c2 + Yqa.o - yOa.B), d2 + vRa.d, uSa.E, uSa.E);
        } else {
            EMa_3 eMa_37 = b2;
            eMa_32 = eMa_37;
            cna.J(eMa_37.C, (int)(c2 + Yqa.o - yOa.B), d2 + vRa.d, uSa.E, yOa.B);
        }
        if (eMa_32.j == uqa.g) {
            EMa_3 eMa_38 = b2;
            eMa_3 = eMa_38;
            cna.J(eMa_38.C, (int)(c2 + QSa.w - yOa.B), d2 + vRa.d, uSa.E, uSa.E);
        } else {
            EMa_3 eMa_39 = b2;
            eMa_3 = eMa_39;
            cna.J(eMa_39.C, (int)(c2 + QSa.w - yOa.B), d2 + vRa.d, uSa.E, yOa.B);
        }
        if (eMa_3.f != pua.o) {
            EMa_3 eMa_310;
            int a2 = vPa.Ka;
            int n4 = yOa.B;
            if (b2.f == vRa.d) {
                a2 = rpa.F;
                eMa_310 = b2;
            } else {
                if (b2.f == uqa.g) {
                    a2 = Fsa.H;
                }
                eMa_310 = b2;
            }
            if (eMa_310.i == vRa.d) {
                n4 = Qsa.Ha;
            }
            cna.J(b2.C, (int)(c2 + a2), d2 + vRa.d, n4, uSa.E);
        }
    }

    /*
     * WARNING - void declaration
     */
    public EMa_3(cna cna2, Kpa kpa2) {
        void a2;
        EMa_3 b2;
        Object c2 = cna2;
        EMa_3 eMa_3 = b2 = this;
        b2.C = c2;
        super((Kpa)a2, (int)((cna)((Object)c2)).A, (int)((cna)((Object)c2)).I, fPa.i, (int)(((cna)((Object)c2)).I - ysa.s), kTa.j);
        eMa_3.j = pua.o;
        eMa_3.f = pua.o;
        eMa_3.f(uSa.E != 0);
        eMa_3.J(vRa.d != 0, kTa.j);
    }

    public void l(int n2) {
        EMa_3 eMa_3;
        int b2 = n2;
        EMa_3 a2 = this;
        if (b2 != a2.f) {
            eMa_3 = a2;
            a2.f = b2;
            a2.i = pua.o;
        } else if (a2.i == pua.o) {
            eMa_3 = a2;
            a2.i = vRa.d;
        } else {
            eMa_3 = a2;
            a2.f = pua.o;
            a2.i = uSa.E;
        }
        Collections.sort(eMa_3.I, a2.m);
    }
}

