/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  Bc
 *  F
 *  Kd
 *  Ke
 *  NPa
 *  QF
 *  Xt
 *  cI
 *  eS
 *  if
 *  nT
 *  pqa
 *  qta
 *  uKa
 *  vRa
 *  vd
 *  zU
 */
import java.awt.Color;
import java.util.Iterator;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xt_2
extends QF
implements F {
    private final XR k;
    private static final MDConfiguration j = ConfigurationService.J(MDConfiguration.class);
    private boolean J;
    private jU A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void a2;
        Xt_2 xt_2;
        int c22 = n2;
        Xt_2 b2 = this;
        if (b2.J + b2.j >= (double)((mx)b2.I).l()) {
            return;
        }
        if (b2.A != false) {
            b2.j = b2.J ? Bc.I : Bc.Ea;
            b2.I = (int)(b2.J ? Bc.sb : Bc.Ja);
            xt_2 = b2;
        } else {
            b2.j = b2.J ? Bc.Bb : Bc.c;
            b2.I = (int)(b2.J ? Bc.I : Bc.Ea);
            xt_2 = b2;
        }
        super.J(c22, (int)a2);
        cI.J((Runnable)nT.J((Xt)b2));
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        jU c22 = zU.M.J();
        Xt_2 xt_22 = b2;
        zU.M.J(xt_22.A);
        vb.J(ds.J((Xt)xt_22));
        zU.M.J(c22);
        cI.J();
    }

    public static /* synthetic */ void f(Xt a2) {
        vb.J(a2.I + a2.k / KPa.y, a2.J + a2.j * KPa.y, NPa.e, qta.D, APa.D);
    }

    public static /* synthetic */ void J(Xt a2) {
        if.J((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Color.WHITE, (Kd)Kd.S_X2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        boolean bl2 = bl;
        Xt_2 a2 = this;
        if (e2 == false) {
            return;
        }
        Xt_2 xt_2 = a2;
        xt_2.k.J(xt_2.I);
    }

    public int J() {
        Xt_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public Xt_2(int n2, Ke ke, XR xR2) {
        void c2;
        void b2;
        Xt_2 a2;
        XR d2 = xR2;
        Xt_2 xt_2 = a2 = this;
        Xt_2 xt_22 = a2;
        super(uSa.E, uSa.E, Fua.J, Fua.J, (Color)Bc.c, (Ke)b2, (Color)Bc.Ea);
        a2.J = uSa.E;
        xt_22.k = d2;
        xt_22.I = c2;
        Xt_2 xt_23 = a2;
        xt_22.A = new jU();
        xt_2.A.k = vRa.d;
        xt_2.J();
        xt_2.f((c2 == d2.J() ? vRa.d : uSa.E) != 0);
        if (a2.J) {
            Xt_2 xt_24 = a2;
            xt_24.A = new jU(zU.M.J());
            xt_24.A.k = vRa.d;
        }
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Xt_2 a2 = this;
        if (a2.J == b2) {
            return;
        }
        a2.J = b2;
        if (b2) {
            a2.A = zU.M.J();
            return;
        }
        a2.J();
    }

    private void J() {
        Iterator iterator;
        Xt_2 xt_2 = this;
        jU jU2 = new jU();
        new jU().k = vRa.d;
        Iterator iterator2 = iterator = j.J().get(xt_2.I).J().entrySet().iterator();
        while (iterator2.hasNext()) {
            Object a2 = iterator.next();
            vd vd2 = (vd)a2.getValue();
            MiniDotItem miniDotItem = (MiniDotItem)BS.ITEMS.get(vd2.J());
            if (miniDotItem == null) {
                iterator2 = iterator;
                continue;
            }
            if ((a2 = (eS)a2.getKey()) == null) {
                iterator2 = iterator;
                continue;
            }
            if (a2 == eS.PET) {
                a2 = jU2.J((eS)a2);
            }
            jU2.J((eS)a2, miniDotItem, vd2.J(), vRa.d != 0);
            iterator2 = iterator;
        }
        xt_2.A = jU2;
    }
}

