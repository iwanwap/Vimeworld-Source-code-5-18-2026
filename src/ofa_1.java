/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  ERa
 *  Ey
 *  Gg
 *  JPa
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  QFa
 *  Uqa
 *  VQa
 *  Waa
 *  Wsa
 *  Ypa
 *  Yra
 *  eAa
 *  iea
 *  tZ
 *  uY
 *  vRa
 *  waa
 */
import java.util.List;
import net.minecraft.block.BlockStandingSign;
import net.minecraft.block.BlockWallSign;

public final class ofa_1
extends kda {
    public String l(Mda mda2) {
        iea a2;
        ofa_1 ofa_12 = this;
        Object b2 = JPa.m;
        a2 = ofa_12.J((Mda)a2);
        b2 = new StringBuilder().insert(3 ^ 3, (String)b2).append(a2.getUnlocalizedName()).append(tpa.N).toString();
        return Ey.f((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    public int J(Mda mda2, int n2) {
        void b2;
        int c2 = n2;
        ofa_1 a2 = this;
        if (c2 == 0) {
            return Wsa.K;
        }
        return a2.J((Mda)b2).getMapColor().colorValue;
    }

    /*
     * WARNING - void declaration
     */
    private iea J(Mda mda2) {
        void a2;
        ofa_1 ofa_12 = this;
        ofa_1 b2 = a2.J(uua.M, uSa.E != 0);
        if (b2 != null && b2.J(Cra.g)) {
            return iea.byDyeDamage((int)b2.J(Cra.g));
        }
        return iea.byDyeDamage((int)a2.J());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void v1;
        void h2;
        void g2;
        Object i2;
        void f5;
        void d2;
        ofa_1 ofa_12 = object;
        Object object = xF2;
        ofa_1 e2 = ofa_12;
        if (d2 == DZ.DOWN) {
            return uSa.E != 0;
        }
        if (!f5.J((XF)((Object)i2)).J().J().i()) {
            return uSa.E != 0;
        }
        if (!g2.J((XF)((Object)(i2 = ((XF)((Object)i2)).offset((DZ)d2))), (DZ)d2, (Mda)h2)) {
            return uSa.E != 0;
        }
        if (!QFa.w.J((Gg)f5, (XF)((Object)i2))) {
            return uSa.E != 0;
        }
        if (f5.e) {
            return vRa.d != 0;
        }
        if (d2 == DZ.UP) {
            v1 = h2;
            int c2 = Oz.f((double)((double)((g2.X + Hra.Ga) * Yra.i / CRa.ja) + kTa.B)) & Ypa.A;
            f5.J((XF)((Object)i2), QFa.w.J().J(BlockStandingSign.ROTATION, c2), yRa.d);
        } else {
            f5.J((XF)((Object)i2), QFa.Sc.J().J(BlockWallSign.FACING, d2), yRa.d);
            v1 = h2;
        }
        v1.E -= vRa.d;
        uY c2 = f5.J((XF)((Object)i2));
        if (c2 instanceof tZ) {
            ((tZ)c2).J((Mda)h2);
        }
        return vRa.d != 0;
    }

    @Override
    public yGa J() {
        return yGa.a;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl2) {
        ofa_1 e2 = mda2;
        ofa_1 d2 = this;
        if ((e2 = e2.J(uua.M, uSa.E != 0)) != null && e2.J(wta.M)) {
            int c2;
            e2 = e2.J(wta.M, NTa.C);
            int n2 = c2 = uSa.E;
            while (n2 < e2.J() && c2 < uua.p) {
                Waa waa2 = e2.J(c2);
                iea a2 = iea.byDyeDamage((int)waa2.J(JPa.ca));
                Bz bz2 = Bz.getPatternByID(waa2.J(Uqa.y));
                if (bz2 != null) {
                    void b2;
                    b2.add(Ey.f((String)(JPa.m + bz2.getPatternName() + VQa.ja + a2.getUnlocalizedName())));
                }
                n2 = ++c2;
            }
        }
    }

    public ofa_1() {
        ofa_1 a2;
        ofa_1 ofa_12 = a2;
        super(QFa.w);
        ofa_12.i = ERa.C;
        ofa_12.J(yGa.a);
        a2.J(vRa.d != 0);
        a2.f(uSa.E);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(eAa eAa2, yGa yGa2, List<Mda> list) {
        int n2;
        ofa_1 ofa_12 = this;
        iea[] b2 = iea.values();
        int n3 = b2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            void a2;
            void c2;
            ofa_1 d2 = b2[n2];
            Waa waa2 = new Waa();
            tZ.J((Waa)waa2, (int)d2.getDyeDamage(), (waa)null);
            Waa waa3 = new Waa();
            waa3.J(uua.M, (NCa)waa2);
            ofa_1 ofa_13 = d2 = new Mda((eAa)c2, vRa.d, d2.getDyeDamage());
            ofa_13.J(waa3);
            a2.add(ofa_13);
            n4 = ++n2;
        }
    }
}

