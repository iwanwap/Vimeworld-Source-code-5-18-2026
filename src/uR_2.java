/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Cra
 *  Kd
 *  Kpa
 *  QF
 *  QSa
 *  Zpa
 *  cI
 *  iS
 *  if
 *  kPa
 *  rt
 *  uR
 *  vRa
 *  zU
 *  zs
 */
import java.awt.Color;
import net.minecraft.util.ResourceLocation;

public final class uR_2
extends QF {
    private final Rt j;
    private final ResourceLocation J;
    private final zs A;
    private final nu I;

    public static /* synthetic */ void J(uR b2, double a2) {
        double d2 = a2;
        if.C((double)(b2.I + b2.k / KPa.y - a2 / KPa.y), (double)(b2.J + b2.j / KPa.y - a2 / KPa.y), (double)d2, (double)d2, (Color)Color.WHITE, (Kd)Kd.XXS_X2);
    }

    /*
     * WARNING - void declaration
     */
    public uR_2(Rt rt2, nu nu2) {
        void a2;
        uR_2 b2;
        Rt c2 = rt2;
        uR_2 uR_22 = b2 = this;
        super(uSa.E, uSa.E, Yqa.D, Yqa.D, (Color)Bc.Ja, null, (Color)Bc.Ga);
        b2.I = a2;
        uR_22.j = c2;
        uR_22.A = nu.J((nu)a2).J().J();
        if (c2.getIcon() != null) {
            uR_2 uR_23 = b2;
            uR_23.J = new ResourceLocation(Cra.V, c2.getIcon());
            return;
        }
        b2.J = null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void a2;
        int e22 = n3;
        uR_2 c2 = this;
        if (a2 == false) {
            return;
        }
        jU d2 = zU.M.J();
        cw e22 = d2.J(nu.J(c2.I).J());
        if (e22 == null) {
            d2 = zU.M.J(iS.MINIDOT_GUI);
            e22 = d2.J(nu.J(c2.I).J());
        }
        if (e22 == null) {
            return;
        }
        System.out.println(lQa.o);
        System.out.println(new StringBuilder().insert(3 & 4, Yqa.R).append(nu.J(c2.I).J()).toString());
        System.out.println(new StringBuilder().insert(3 ^ 3, rQa.la).append(e22.A).toString());
        uR_2 uR_22 = c2;
        uR_22.A.J(uR_22.j.getName());
        rt b2 = e22.A;
        b2.J().J(c2.j.getName());
        d2.J(e22.J, e22.I, b2, vRa.d != 0);
        System.out.println(QSa.v);
        System.out.println(new StringBuilder().insert(3 & 4, Yqa.R).append(nu.J(c2.I).J()).toString());
        System.out.println(new StringBuilder().insert(3 ^ 3, rQa.la).append(e22.A).toString());
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        void b2;
        uR_2 uR_22;
        uR_2 uR_23;
        uR_2 uR_24 = this;
        if (nu.J(uR_24.I).l() != kPa.r) {
            uR_23 = uR_24;
            uR_24.k = Zpa.e;
            uR_24.j = (Rt)Zpa.e;
        } else {
            uR_23 = uR_24;
            uR_24.k = WPa.P;
            uR_24.j = (Rt)WPa.P;
        }
        int c2 = uR_23.A != false && zU.M.J().J(nu.J(uR_24.I).J()) ? vRa.d : uSa.E;
        uR_24.j = c2 != 0 ? Bc.Ga : Bc.Ja;
        uR_2 uR_25 = uR_24;
        if (uR_24.j.getName().equals(uR_24.A.l())) {
            uR_25.I = Bc.Ba;
            uR_22 = uR_24;
        } else {
            uR_25.I = c2 != 0 ? Bc.Za : Bc.Ga;
            uR_22 = uR_24;
        }
        super.J((int)b2, (int)a2);
        uR_2 uR_26 = uR_24;
        double d2 = uR_26.k - hQa.x;
        uR_2 uR_27 = uR_24;
        if (uR_26.j.getIcon() != null) {
            cI.J((Runnable)bu.J((uR)uR_27, d2));
            Kpa.J().J().J(uR_24.J);
            double d3 = d2;
            if.J((double)(uR_24.I + uR_24.k / KPa.y - d2 / KPa.y), (double)(uR_24.J + uR_24.j / KPa.y - d2 / KPa.y), (double)d3, (double)d3);
            cI.J();
            return;
        }
        double d4 = d2;
        if.C((double)(uR_27.I + uR_24.k / KPa.y - d2 / KPa.y), (double)(uR_24.J + uR_24.j / KPa.y - d2 / KPa.y), (double)d4, (double)d4, (Color)uR_24.j.getColor(), (Kd)Kd.XXS_X2);
    }
}

