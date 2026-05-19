/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  HJa
 *  JPa
 *  Mda
 *  NCa
 *  NTa
 *  Paa
 *  Pqa
 *  QFa
 *  Waa
 *  aSa
 *  fy
 *  kta
 *  pua
 *  rba
 *  tZ
 *  uKa
 *  uY
 *  vPa
 *  vRa
 */
import com.mojang.authlib.GameProfile;
import net.minecraft.block.Block;

public final class HJa_3 {
    private tZ M;
    private Paa k;
    private Fz j;
    private Fz J;
    private fy A;
    public static HJa I = new HJa_3();

    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2) {
        Object b2;
        void a2;
        HJa_3 hJa_3 = this;
        if (a2.J() == Gea.gC) {
            hJa_3.M.J((Mda)a2);
            RKa.E.J((uY)hJa_3.M, aSa.V, aSa.V, aSa.V, JPa.N);
            return;
        }
        if (a2.J() == Gea.GB) {
            b2 = null;
            if (a2.M()) {
                Waa waa2 = a2.J();
                if (waa2.J(Pqa.Aa, NTa.C)) {
                    b2 = rba.J((Waa)waa2.J(Pqa.Aa));
                } else if (waa2.J(Pqa.Aa, Yqa.i) && waa2.J(Pqa.Aa).length() > 0) {
                    b2 = new GameProfile(null, waa2.J(Pqa.Aa));
                    b2 = fy.J((GameProfile)b2);
                    Waa waa3 = waa2;
                    waa3.J(Pqa.Aa);
                    waa3.J(Pqa.Aa, (NCa)rba.J((Waa)new Waa(), (GameProfile)b2));
                }
            }
            if (Mka.A != null) {
                uKa.e();
                uKa.J((float)vPa.b, (float)JPa.N, (float)vPa.b);
                uKa.l((float)kta.v, (float)kta.v, (float)kta.v);
                uKa.m();
                Mka.A.J(JPa.N, JPa.N, JPa.N, DZ.UP, JPa.N, a2.J(), (GameProfile)b2, pua.o);
                uKa.h();
                uKa.D();
                return;
            }
        } else {
            b2 = Block.J(a2.J());
            if (b2 == QFa.ta) {
                RKa.E.J((uY)hJa_3.k, aSa.V, aSa.V, aSa.V, JPa.N);
                return;
            }
            if (b2 == QFa.TF) {
                RKa.E.J((uY)hJa_3.J, aSa.V, aSa.V, aSa.V, JPa.N);
                return;
            }
            RKa.E.J((uY)hJa_3.j, aSa.V, aSa.V, aSa.V, JPa.N);
        }
    }

    public HJa_3() {
        HJa_3 a2;
        HJa_3 hJa_3 = a2;
        a2.j = new Fz(uSa.E);
        hJa_3.J = new Fz(vRa.d);
        a2.k = new Paa();
        a2.M = new tZ();
        a2.A = new fy();
    }
}

