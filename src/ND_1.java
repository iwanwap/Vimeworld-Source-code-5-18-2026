/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BS
 *  Bc
 *  Kd
 *  ND
 *  Oqa
 *  SE
 *  SQa
 *  Zta
 *  aSa
 *  ad
 *  cI
 *  ce
 *  eS
 *  hqa
 *  if
 *  kpa
 *  sB
 *  uKa
 *  uRa
 *  vRa
 *  zU
 */
import java.awt.Color;
import java.util.Iterator;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import org.lwjgl.input.Mouse;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ND_1
extends eF {
    private final Xe A;
    private final XD I;

    @Override
    public void d() {
        ND_1 a2;
        if.A((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja, (Kd)Kd.S_X2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        boolean bl2 = bl;
        ND_1 a2 = this;
        if (a2.I.f()) {
            a2.I.J((int)d2, (int)c2, (int)b2, (boolean)e2);
            return;
        }
        super.J((int)d2, (int)c2, (int)b2, (boolean)e2);
    }

    public ND_1(Xe xe) {
        Object b2 = xe;
        ND_1 a2 = this;
        super(Oqa.COLUMN, uqa.g, vRa.d != 0);
        a2.A = b2;
        a2.i = vRa.d;
        a2.g = vRa.d;
        ND_1 nD_1 = a2;
        a2.I = new XD((Xe)((Object)b2));
        a2.k = kpa.l;
        a2.j = SQa.S;
        a2.J(Bc.Ba);
    }

    @Override
    public void l() {
        ND_1 a2;
        if.C((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Qa, (Kd)Kd.S_X2);
    }

    public XD J() {
        ND_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void a2;
        void b2;
        ND_1 nD_1 = this;
        if (nD_1.A.l().l() <= fPa.ca) {
            return;
        }
        ND_1 nD_12 = nD_1;
        nD_1.I = (XD)(nD_12.A.J().f() + nD_1.A.J().l() + hqa.ha);
        nD_12.J = nD_12.A.J().J().C() + uRa.I + nD_1.I.J() + Zta.ba;
        uKa.e();
        uKa.f((double)(nD_12.I + nD_1.k / KPa.y), (double)(nD_1.J + nD_1.j / KPa.y), (double)aSa.V);
        uKa.J((double)JC.f(aSa.V, oQa.fa, nD_1.A.l().l()), (double)JC.f(aSa.V, oQa.fa, nD_1.A.l().l()), (double)oua.i);
        uKa.f((double)(-(nD_12.I + nD_1.k / KPa.y)), (double)(-(nD_1.J + nD_1.j / KPa.y)), (double)aSa.V);
        nD_12.D.J();
        if (nD_12.g && !nD_1.f().isEmpty()) {
            int n4;
            if (-nD_1.D.l() < (double)nD_1.E && nD_1.D.f()) {
                ND_1 nD_13 = nD_1;
                nD_13.D.e(nD_13.E);
                ND_1 nD_14 = nD_1;
                nD_14.D.C(nD_14.E);
                ND_1 nD_15 = nD_1;
                nD_15.D.J((double)nD_15.E);
            }
            if (nD_1.f() && (n4 = Mouse.getDWheel()) != 0) {
                double d2;
                double d3 = nD_1.D.d() + (n4 > 0 ? nD_1.F : -nD_1.F);
                if (-d2 > nD_1.j - (double)nD_1.k) {
                    d3 = -nD_1.j + (double)nD_1.k;
                }
                ND_1 nD_16 = nD_1;
                nD_16.D.f(Math.min((double)nD_16.E, d3), iSa.P, sB.x);
            }
        }
        ND_1 nD_17 = nD_1;
        nD_17.C();
        nD_17.f((int)b2, (int)a2);
        if (nD_1.i) {
            cI.J((Runnable)ce.J((ND)nD_1));
        }
        ND_1 nD_18 = nD_1;
        nD_18.J();
        double d4 = nD_18.J + nD_1.j;
        for (ND_1 c2 : nD_18.f) {
            ad ad2;
            if (!(ad2.C() < d4) || !(c2.C() + c2.J() > nD_1.J)) continue;
            c2.J((int)b2, (int)a2);
        }
        ND_1 nD_19 = nD_1;
        nD_19.d();
        if (nD_19.i) {
            cI.J();
        }
        ND_1 nD_110 = nD_1;
        ND_1 nD_111 = nD_1;
        nD_110.I.C((double)nD_111.I);
        nD_110.I.l(nD_1.J - nD_1.I.J() - Zta.ba);
        nD_111.I.J((int)b2, (int)a2);
        nD_110.f((int)(-nD_110.A + nD_1.j * KPa.y));
        uKa.D();
    }

    public void e() {
        Iterator iterator;
        ND_1 nD_1 = this;
        nD_1.f.clear();
        Iterator iterator2 = iterator = BS.ITEMS.values().iterator();
        while (iterator2.hasNext()) {
            Object a2 = (MiniDotItem)iterator.next();
            if (!(a2 instanceof MiniDotEmote)) {
                iterator2 = iterator;
                continue;
            }
            if (((MiniDotItem)a2).type != eS.EMOTE) {
                iterator2 = iterator;
                continue;
            }
            if (!zU.M.f((MiniDotItem)a2)) {
                iterator2 = iterator;
                continue;
            }
            a2 = (MiniDotEmote)a2;
            iterator2 = iterator;
            nD_1.f((ad)new SE((MiniDotEmote)a2, nD_1.A));
        }
        if (nD_1.f.isEmpty()) {
            nD_1.f.add(new Kf(nD_1));
        }
    }

    @Override
    public void J() {
        ND_1 a2;
        if.C((double)a2.I, (double)a2.J, (double)a2.k, (double)a2.j, (Color)Bc.Ja, (Kd)Kd.S_X2);
    }
}

