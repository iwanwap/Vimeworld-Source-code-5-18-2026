/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Ez
 *  Gg
 *  Gl
 *  JPa
 *  NCa
 *  NTa
 *  PIa
 *  Qsa
 *  SOa
 *  SZ
 *  UZ
 *  Waa
 *  Yfa
 *  ZOa
 *  Zpa
 *  aSa
 *  dZ
 *  nQa
 *  oA
 *  pua
 *  vL
 *  vRa
 *  waa
 *  xOa
 *  xy
 *  zsa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class SZ_3 {
    private Jz F;
    private int g;
    private vL L;
    private double E;
    private int m;
    private int C = kTa.j;
    private int i;
    private final List<Jz> M;
    private String k = Zpa.B;
    private int j;
    private int J;
    private int A;
    private double I;

    private void f() {
        SZ_3 sZ_3;
        SZ_3 sZ_32;
        SZ_3 sZ_33 = sZ_32 = this;
        if (sZ_33.j <= sZ_33.i) {
            SZ_3 sZ_34 = sZ_32;
            sZ_3 = sZ_34;
            sZ_34.C = sZ_34.i;
        } else {
            SZ_3 sZ_35 = sZ_32;
            sZ_3 = sZ_35;
            int a2 = sZ_35.j - sZ_32.i;
            sZ_32.C = sZ_35.i + sZ_32.J().v.nextInt(a2);
        }
        if (sZ_3.M.size() > 0) {
            SZ_3 sZ_36 = sZ_32;
            sZ_36.J((Jz)dZ.J((Random)sZ_32.J().v, sZ_36.M));
        }
        sZ_32.J(vRa.d);
    }

    public abstract XF J();

    private boolean J() {
        SZ_3 sZ_3;
        SZ_3 sZ_32 = sZ_3 = this;
        Object a2 = sZ_32.J();
        return sZ_32.J().J((double)a2.getX() + kTa.B, (double)a2.getY() + kTa.B, (double)a2.getZ() + kTa.B, (double)sZ_3.m);
    }

    public void J() {
        SZ_3 sZ_3 = this;
        if (sZ_3.J()) {
            int n2;
            SZ_3 sZ_32 = sZ_3;
            Object a2 = sZ_32.J();
            if (sZ_32.J().e) {
                Object object = a2;
                double d2 = (float)object.getX() + sZ_3.J().v.nextFloat();
                SZ_3 sZ_33 = sZ_3;
                double d3 = (float)object.getY() + sZ_33.J().v.nextFloat();
                double d4 = (float)object.getZ() + sZ_3.J().v.nextFloat();
                SZ_3 sZ_34 = sZ_3;
                sZ_34.J().J(UZ.SMOKE_NORMAL, d2, d3, d4, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                sZ_34.J().J(UZ.FLAME, d2, d3, d4, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                if (sZ_33.C > 0) {
                    sZ_3.C -= vRa.d;
                }
                SZ_3 sZ_35 = sZ_3;
                sZ_35.E = sZ_35.I;
                sZ_35.I = (sZ_35.I + (double)(Jpa.r / ((float)sZ_3.C + Qsa.U))) % ZOa.Ja;
                return;
            }
            if (sZ_3.C == pua.o) {
                sZ_3.f();
            }
            if (sZ_3.C > 0) {
                sZ_3.C -= vRa.d;
                return;
            }
            int n3 = uSa.E;
            int n4 = n2 = uSa.E;
            while (n4 < sZ_3.J) {
                vL vL2 = PIa.J((String)sZ_3.J(), (Gg)sZ_3.J());
                if (vL2 == null) {
                    return;
                }
                if (sZ_3.J().J(vL2.getClass(), new xy((double)a2.getX(), (double)a2.getY(), (double)a2.getZ(), (double)(a2.getX() + vRa.d), (double)(a2.getY() + vRa.d), (double)(a2.getZ() + vRa.d)).f((double)sZ_3.g, (double)sZ_3.g, (double)sZ_3.g)).size() >= sZ_3.A) {
                    sZ_3.f();
                    return;
                }
                Object object = a2;
                double d5 = (double)object.getX() + (sZ_3.J().v.nextDouble() - sZ_3.J().v.nextDouble()) * (double)sZ_3.g + kTa.B;
                double d6 = object.getY() + sZ_3.J().v.nextInt(yRa.d) - vRa.d;
                double d7 = (double)object.getZ() + (sZ_3.J().v.nextDouble() - sZ_3.J().v.nextDouble()) * (double)sZ_3.g + kTa.B;
                Yfa yfa2 = vL2 instanceof Yfa ? (Yfa)vL2 : null;
                vL2.f(d5, d6, d7, sZ_3.J().v.nextFloat() * CRa.ja, JPa.N);
                if (yfa2 == null || yfa2.w() && yfa2.N()) {
                    sZ_3.J(vL2, vRa.d != 0);
                    sZ_3.J().f(Upa.W, (XF)((Object)a2), uSa.E);
                    if (yfa2 != null) {
                        yfa2.Q();
                    }
                    n3 = vRa.d;
                }
                n4 = ++n2;
            }
            if (n3 != 0) {
                sZ_3.f();
            }
        }
    }

    public void f(Waa waa2) {
        SZ_3 sZ_3;
        SZ_3 b2 = waa2;
        SZ_3 a2 = this;
        SZ_3 sZ_32 = b2;
        a2.k = b2.J(WPa.Y);
        a2.C = sZ_32.J(BQa.G);
        a2.M.clear();
        if (sZ_32.J(sOa.M, WOa.fa)) {
            int n2;
            waa waa3 = b2.J(sOa.M, NTa.C);
            int n3 = n2 = uSa.E;
            while (n3 < waa3.J()) {
                a2.M.add(new Jz((SZ)a2, waa3.J(n2++)));
                n3 = n2;
            }
        }
        if (b2.J(zsa.B, NTa.C)) {
            sZ_3 = b2;
            SZ_3 sZ_33 = a2;
            SZ_3 sZ_34 = a2;
            sZ_34.J(new Jz((SZ)sZ_34, b2.J(zsa.B), a2.k));
        } else {
            a2.J((Jz)null);
            sZ_3 = b2;
        }
        if (sZ_3.J(wsa.P, zOa.v)) {
            SZ_3 sZ_35 = a2;
            SZ_3 sZ_36 = b2;
            a2.i = sZ_36.J(wsa.P);
            sZ_35.j = sZ_36.J(ySa.r);
            sZ_35.J = b2.J(xOa.J);
        }
        if (b2.J(zsa.W, zOa.v)) {
            SZ_3 sZ_37 = a2;
            sZ_37.A = b2.J(zsa.W);
            sZ_37.m = b2.J(nQa.l);
        }
        if (b2.J(SPa.j, zOa.v)) {
            a2.g = b2.J(SPa.j);
        }
        if (a2.J() != null) {
            a2.L = null;
        }
    }

    public boolean J(int n2) {
        int b2 = n2;
        SZ_3 a2 = this;
        if (b2 == vRa.d && a2.J().e) {
            a2.C = a2.i;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double f() {
        SZ_3 a2;
        return a2.I;
    }

    public vL J(Gg gg2) {
        SZ_3 b2 = gg2;
        SZ_3 a2 = this;
        if (a2.L == null && (b2 = PIa.J((String)a2.J(), (Gg)b2)) != null) {
            b2 = a2.J((vL)b2, uSa.E != 0);
            a2.L = b2;
        }
        return a2.L;
    }

    public double J() {
        SZ_3 a2;
        return a2.E;
    }

    public abstract void J(int var1);

    public void J(Jz jz2) {
        Object b2 = jz2;
        SZ_3 a2 = this;
        a2.F = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        Object object = this;
        Object b2 = ((SZ_3)object).J();
        if (!Ez.J((String)b2)) {
            void a2;
            void v0 = a2;
            v0.J(WPa.Y, (String)b2);
            v0.J(BQa.G, (short)((SZ_3)object).C);
            v0.J(wsa.P, (short)((SZ_3)object).i);
            v0.J(ySa.r, (short)((SZ_3)object).j);
            v0.J(xOa.J, (short)((SZ_3)object).J);
            v0.J(zsa.W, (short)((SZ_3)object).A);
            v0.J(nQa.l, (short)((SZ_3)object).m);
            SZ_3 sZ_3 = object;
            v0.J(SPa.j, (short)sZ_3.g);
            if (sZ_3.J() != null) {
                a2.J(zsa.B, Jz.J(((SZ_3)object).J()).J());
            }
            if (((SZ_3)object).J() != null || ((SZ_3)object).M.size() > 0) {
                b2 = new waa();
                if (((SZ_3)object).M.size() > 0) {
                    Iterator<Jz> iterator;
                    Iterator<Jz> iterator2 = iterator = ((SZ_3)object).M.iterator();
                    while (iterator2.hasNext()) {
                        Jz jz2 = iterator.next();
                        iterator2 = iterator;
                        b2.J((NCa)jz2.J());
                    }
                } else {
                    b2.J((NCa)((SZ_3)object).J().J());
                }
                a2.J(sOa.M, (NCa)b2);
            }
        }
    }

    public SZ_3() {
        SZ_3 a2;
        a2.M = Lists.newArrayList();
        a2.i = ZOa.x;
        a2.j = Lsa.E;
        a2.J = AQa.P;
        a2.A = uua.p;
        a2.m = ERa.C;
        a2.g = AQa.P;
    }

    private Jz J() {
        SZ_3 a2;
        return a2.F;
    }

    public void J(String string) {
        String b2 = string;
        SZ_3 a2 = this;
        a2.k = b2;
    }

    public abstract Gg J();

    /*
     * WARNING - void declaration
     */
    private vL J(vL vL2, boolean bl2) {
        void a2;
        SZ_3 c2 = vL2;
        SZ_3 b2 = this;
        if (b2.J() != null) {
            NCa nCa2;
            Object object;
            Waa waa2 = new Waa();
            c2.J(waa2);
            Waa waa3 = Jz.J(b2.J()).J().iterator();
            Waa waa4 = waa3;
            while (waa4.hasNext()) {
                object = (String)waa3.next();
                nCa2 = Jz.J(b2.J()).J((String)object);
                waa4 = waa3;
                waa2.J((String)object, nCa2.J());
            }
            SZ_3 sZ_3 = c2;
            sZ_3.l(waa2);
            if (((vL)sZ_3).j != null && a2 != false) {
                ((vL)c2).j.f((vL)c2);
            }
            object = c2;
            Waa waa5 = waa2;
            while (waa5.J(SOa.Ga, NTa.C)) {
                waa3 = waa2.J(SOa.Ga);
                nCa2 = PIa.J((String)waa3.J(QTa.O), (Gg)((vL)c2).j);
                if (nCa2 != null) {
                    Waa waa6 = new Waa();
                    nCa2.J(waa6);
                    Iterator iterator = waa3.J().iterator();
                    Iterator iterator2 = iterator;
                    while (iterator2.hasNext()) {
                        String string = (String)iterator.next();
                        NCa nCa3 = waa3.J(string);
                        iterator2 = iterator;
                        waa6.J(string, nCa3.J());
                    }
                    nCa2.l(waa6);
                    Object object2 = object;
                    nCa2.f(((vL)object).la, ((vL)object).Z, ((vL)object).A, ((vL)object2).X, ((vL)object2).d);
                    if (((vL)c2).j != null && a2 != false) {
                        ((vL)c2).j.f((vL)nCa2);
                    }
                    object.l((vL)nCa2);
                }
                object = nCa2;
                waa5 = waa3;
            }
        } else if (c2 instanceof Gl && ((vL)c2).j != null && a2 != false) {
            if (c2 instanceof Yfa) {
                ((Yfa)c2).J(((vL)c2).j.J(new XF((vL)c2)), (oA)null);
            }
            ((vL)c2).j.f((vL)c2);
        }
        return c2;
    }

    private String J() {
        SZ_3 a2;
        if (a2.J() == null) {
            if (a2.k != null && a2.k.equals(zpa.P)) {
                a2.k = APa.q;
            }
            return a2.k;
        }
        return Jz.J(a2.J());
    }
}

