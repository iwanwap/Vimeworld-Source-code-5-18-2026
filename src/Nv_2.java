/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hv
 *  Kpa
 *  QSa
 *  Yx
 *  ZOa
 *  aSa
 *  vRa
 */
import java.util.HashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Nv_2 {
    private final zz m;
    private int C;
    private int i;
    private int M;
    private Hv k;
    private int j;
    public boolean J;
    public boolean A;
    private final HashMap<XF, Hv> I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        Nv_2 nv_2 = this;
        if (nv_2.A) {
            nv_2.j += a2;
            return;
        }
        if (!nv_2.J) {
            return;
        }
        if (a2 > aSa.k) {
            if (nv_2.k == null) {
                Nv_2 nv_22 = nv_2;
                nv_2.I.put(new XF(nv_22.i, nv_22.M, nv_2.C), new Hv());
                return;
            }
            int b2 = Nv_2.J();
            if (b2 - Hv.J((Hv)nv_2.k) < ZOa.x) {
                Hv.f((Hv)nv_2.k);
                Hv.J((Hv)nv_2.k, (int)b2);
                b2 = AQa.P;
                if (a2 > QSa.ia) {
                    b2 = yRa.d;
                }
                if (Hv.l((Hv)nv_2.k) >= b2) {
                    Hv.J((Hv)nv_2.k, vRa.d != 0);
                }
            }
        }
    }

    public static /* synthetic */ int f() {
        return Nv_2.J();
    }

    public void f() {
        Nv_2 nv_2 = this;
        int a2 = Nv_2.J();
        if (a2 % Jpa.z == 0) {
            nv_2.I.values().removeIf(Yx.J((int)(a2 -= Jpa.z)));
        }
    }

    public void J() {
        Nv_2 a2;
        a2.A = uSa.E;
        if (a2.j >= QSa.ia) {
            Nv_2 nv_2 = a2;
            nv_2.J(nv_2.j);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4) {
        void a2;
        void b2;
        Nv_2 c2;
        void var1_3;
        void d32 = var1_3;
        Nv_2 nv_2 = c2 = this;
        nv_2.j = uSa.E;
        boolean d32 = nv_2.J(nv_2.m.func_181079_c((int)d32, (int)b2, (int)a2));
        if (d32) {
            c2.A = vRa.d;
        }
        return d32;
    }

    public Nv_2() {
        Nv_2 a2;
        Nv_2 nv_2 = a2;
        a2.I = new HashMap();
        nv_2.m = new zz();
    }

    public static /* synthetic */ boolean J(int n2, Hv hv2) {
        Hv b2 = hv2;
        int a2 = n2;
        if (Hv.J((Hv)b2) < a2) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private static int J() {
        return Kpa.J().N.f();
    }

    /*
     * Unable to fully structure code
     */
    public boolean J(XF var1_1) {
        var2_2 = this;
        if (!var2_2.J) {
            return (boolean)vRa.d;
        }
        if (var2_2.A) {
            return (boolean)vRa.d;
        }
        var2_2.k = null;
        b = var2_2.I.get(a);
        if (b == null) ** GOTO lbl22
        var4_3 = Nv_2.J();
        var3_4 = var4_3 - Hv.J((Hv)b);
        if (Hv.J((Hv)b) && var3_4 < Jpa.z) {
            Hv.J((Hv)b, (int)var4_3);
            return (boolean)uSa.E;
        }
        if (var3_4 > Jpa.z) {
            v0 = var2_2;
            v1 = v0;
            v0.I.remove(a);
        } else {
            var2_2.k = b;
lbl22:
            // 2 sources

            v1 = var2_2;
        }
        v1.i = a.getX();
        v2 = var2_2;
        v2.M = a.getY();
        v2.C = a.getZ();
        return (boolean)vRa.d;
    }
}

