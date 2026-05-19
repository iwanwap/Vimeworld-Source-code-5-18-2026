/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bc
 *  Ju
 *  Kd
 *  Oqa
 *  PR
 *  Zta
 *  aSa
 *  ad
 *  eS
 *  iS
 *  if
 *  rs
 *  vRa
 *  zU
 */
import java.awt.Color;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;

public final class Ju_3
extends eF {
    private final rs j;
    private final nu J;
    private final vC A;
    private final PR I;

    public void e() {
        Ju_3 ju_3 = this;
        Object a22 = nu.J(ju_3.J).J();
        jU jU2 = zU.M.J(iS.LOCAL).J(nu.J(ju_3.J).J()) ? zU.M.J(iS.LOCAL) : zU.M.J(iS.MINIDOT_GUI);
        int a22 = jU2.J((MiniDotItem)a22) == eS.PET_RIGHT ? vRa.d : uSa.E;
        double d2 = a22 != 0 ? (ju_3.J.l() - Zta.ba) / KPa.y : aSa.V;
        ju_3.A.J(d2, BRa.Y);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void a2;
        void b2;
        Ju_3 c2;
        Ju_3 ju_3;
        Ju_3 ju_32 = ju_3 = this;
        ju_3.A.J();
        if.J((double)ju_32.I, (double)ju_3.J, (double)ju_3.k, (double)ju_3.j, (Color)Bc.Ea, (Color)Bc.Ja, (Kd)Kd.S_X2);
        Object object = ju_32.I.f() ? ju_3.I : (c2 = ju_3.j.f() ? ju_3.j : null);
        if (c2 != null && zU.M.J().J(nu.J(ju_3.J).J())) {
            if.J((double)c2.f(), (double)c2.C(), (double)c2.l(), (double)c2.J(), (Color)Bc.Ja, (Color)Bc.Ga, (Kd)Kd.S_X2);
        }
        if.J((double)(ju_3.I + ju_3.A.l()), (double)ju_3.J, (double)((ju_3.J.l() - Zta.ba) / KPa.y), (double)ITa.a, (Color)Bc.sb, (Color)Bc.Da, (Kd)Kd.S_X2);
        super.J((int)b2, (int)a2);
    }

    public Ju_3(nu nu2) {
        Ju_3 a2;
        Object b2 = nu2;
        Ju_3 ju_3 = a2 = this;
        super(Oqa.COLUMN, uSa.E, uSa.E != 0);
        Ju_3 ju_32 = a2;
        a2.A = new vC();
        a2.J = b2;
        ju_3.e();
        a2.I = new PR((Ju)a2);
        ju_3.f((ad)a2.I);
        Ju_3 ju_33 = a2;
        ju_33.j = new rs((Ju)ju_33);
        ju_33.f((ad)ju_33.j);
    }

    public static /* synthetic */ nu J(Ju a2) {
        return a2.J;
    }
}

