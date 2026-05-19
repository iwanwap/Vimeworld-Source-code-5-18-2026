/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Faa
 *  Gg
 *  I
 *  Jy
 *  Mz
 *  QFa
 *  Ypa
 *  hra
 *  oY
 *  uY
 *  vRa
 */
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Ila_2
implements I {
    public int k;
    public Faa[][] j;
    public Gg J;
    public int A;
    public boolean I;

    /*
     * WARNING - void declaration
     */
    public uY J(XF xF2) {
        void a2;
        Ila_2 ila_2 = this;
        void v0 = a2;
        Ila_2 ila_22 = ila_2;
        int n2 = (v0.getX() >> AQa.P) - ila_22.k;
        int b2 = (v0.getZ() >> AQa.P) - ila_2.A;
        return ila_22.j[n2][b2].J((XF)a2, oY.IMMEDIATE);
    }

    /*
     * WARNING - void declaration
     */
    public Ila_2(Gg gg2, XF xF2, XF xF3, int n2) {
        int n3;
        int a2;
        Faa d2;
        void c2;
        void b2;
        Ila_2 ila_2 = this;
        void v0 = b2;
        Ila_2 ila_22 = ila_2;
        void v2 = c2;
        ila_2.J = d2;
        ila_2.k = v2.getX() - a2 >> AQa.P;
        ila_22.A = v2.getZ() - a2 >> AQa.P;
        int n4 = v0.getX() + a2 >> AQa.P;
        a2 = v0.getZ() + a2 >> AQa.P;
        ila_22.j = new Faa[n4 - ila_2.k + vRa.d][a2 - ila_2.A + vRa.d];
        ila_2.I = vRa.d;
        int n5 = n3 = ila_2.k;
        while (n5 <= n4) {
            int n6 = ila_2.A;
            while (n6 <= a2) {
                int e2;
                int n7 = e2 - ila_2.A;
                Faa faa2 = d2.J(n3, e2);
                ila_2.j[n3 - ila_2.k][n7] = faa2;
                n6 = ++e2;
            }
            n5 = ++n3;
        }
        int n8 = n3 = c2.getX() >> AQa.P;
        while (n8 <= b2.getX() >> AQa.P) {
            int n9 = c2.getZ() >> AQa.P;
            while (n9 <= b2.getZ() >> AQa.P) {
                int e2;
                d2 = ila_2.j[n3 - ila_2.k][e2 - ila_2.A];
                if (d2 != null && !d2.f(c2.getY(), b2.getY())) {
                    ila_2.I = uSa.E;
                }
                n9 = ++e2;
            }
            n8 = ++n3;
        }
    }

    public boolean f() {
        Ila_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, int n2) {
        void a2;
        Ila_2 b2;
        Object c22 = xF2;
        Ila_2 ila_2 = b2 = this;
        int n3 = ila_2.f(Mz.SKY, (XF)((Object)c22));
        int c22 = ila_2.f(Mz.BLOCK, (XF)((Object)c22));
        if (c22 < a2) {
            c22 = a2;
        }
        return n3 << kTa.j | c22 << AQa.P;
    }

    public Fy J() {
        Ila_2 a2;
        return a2.J.J();
    }

    /*
     * WARNING - void declaration
     */
    private int f(Mz mz2, XF xF2) {
        void a2;
        void b2;
        Ila_2 ila_2 = this;
        if (b2 == Mz.SKY && ila_2.J.F.f()) {
            return uSa.E;
        }
        if (a2.getY() >= 0 && a2.getY() < hra.Ja) {
            if (ila_2.J((XF)a2).J().D()) {
                int n2;
                int c2 = uSa.E;
                DZ[] dZArray = DZ.VALUES;
                int n3 = DZ.VALUES.length;
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    DZ dZ2 = dZArray[n2];
                    int n5 = ila_2.J((Mz)b2, a2.offset(dZ2));
                    if (n5 > c2) {
                        c2 = n5;
                    }
                    if (c2 >= Ypa.A) {
                        return c2;
                    }
                    n4 = ++n2;
                }
                return c2;
            }
            void v1 = a2;
            int c2 = (v1.getX() >> AQa.P) - ila_2.k;
            int n6 = (v1.getZ() >> AQa.P) - ila_2.A;
            return ila_2.j[c2][n6].J((Mz)b2, (XF)a2);
        }
        return b2.defaultLightValue;
    }

    public Jy J(XF xF2) {
        Object b2 = xF2;
        Ila_2 a2 = this;
        return a2.J.J((XF)((Object)b2));
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mz mz2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Ila_2 a2 = this;
        if (c2.getY() >= 0 && c2.getY() < hra.Ja) {
            Object object = c2;
            Ila_2 ila_2 = a2;
            int n2 = (object.getX() >> AQa.P) - ila_2.k;
            int n3 = (object.getZ() >> AQa.P) - a2.A;
            return ila_2.j[n2][n3].J((Mz)b2, (XF)((Object)c2));
        }
        return b2.defaultLightValue;
    }

    /*
     * WARNING - void declaration
     */
    public int J(XF xF2, DZ dZ2) {
        void a2;
        void b2;
        Ila_2 ila_2 = this;
        IBlockState c2 = ila_2.J((XF)b2);
        return c2.J().f(ila_2, (XF)b2, c2, (DZ)a2);
    }

    public boolean J(XF xF2) {
        Ila_2 a2 = this;
        Object b2 = xF2;
        if (a2.J((XF)((Object)b2)).J().J() == Material.air) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public IBlockState J(XF xF2) {
        void a2;
        Ila_2 ila_2 = this;
        if (a2.getY() >= 0 && a2.getY() < hra.Ja) {
            void v0 = a2;
            int b2 = (v0.getX() >> AQa.P) - ila_2.k;
            int n2 = (v0.getZ() >> AQa.P) - ila_2.A;
            if (b2 >= 0 && b2 < ila_2.j.length && n2 >= 0 && n2 < ila_2.j[b2].length && (b2 = ila_2.j[b2][n2]) != null) {
                return b2.J((XF)a2);
            }
        }
        return QFa.HF.J();
    }
}

