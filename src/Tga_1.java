/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aaa
 *  Hba
 *  Lz
 *  NTa
 *  OEa
 *  Oz
 *  XTa
 *  YSa
 *  Ypa
 *  Zta
 *  gFa
 *  jy
 *  vL
 *  vRa
 *  yCa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Tga_1
extends gFa {
    private jy M;
    private double k;
    private bga j;
    private yCa J;
    private boolean A;
    private List<jy> I;

    public boolean f() {
        Tga_1 tga_1;
        Tga_1 tga_12 = tga_1 = this;
        tga_12.C();
        if (tga_12.A && tga_1.j.j.e()) {
            return uSa.E != 0;
        }
        Tga_1 a2 = tga_1.j.j.J().J(new XF((vL)tga_1.j), uSa.E);
        if (a2 == null) {
            return uSa.E != 0;
        }
        Tga_1 tga_13 = tga_1;
        tga_13.M = tga_13.J((Aaa)a2);
        if (tga_13.M == null) {
            return uSa.E != 0;
        }
        Tga_1 tga_14 = a2 = (Hba)tga_1.j.J();
        boolean bl = tga_14.d();
        tga_14.d(uSa.E != 0);
        tga_1.J = a2.J(tga_1.M.f());
        a2.d(bl);
        if (tga_1.J != null) {
            return vRa.d != 0;
        }
        Lz lz2 = OEa.l((bga)tga_1.j, (int)NTa.C, (int)XTa.W, (Lz)new Lz((double)tga_1.M.f().getX(), (double)tga_1.M.f().getY(), (double)tga_1.M.f().getZ()));
        if (lz2 == null) {
            return uSa.E != 0;
        }
        a2.d(uSa.E != 0);
        tga_1.J = tga_1.j.J().J(lz2.A, lz2.j, lz2.J);
        a2.d(bl);
        if (tga_1.J != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        Tga_1 a2;
        Tga_1 tga_1 = a2;
        a2.j.J().J(tga_1.J, tga_1.k);
    }

    private jy J(Aaa aaa2) {
        Aaa b2 = aaa2;
        Tga_1 a2 = this;
        jy jy2 = null;
        int n2 = vqa.F;
        for (jy jy3 : b2.J()) {
            int n3 = jy3.J(Oz.f((double)a2.j.la), Oz.f((double)a2.j.Z), Oz.f((double)a2.j.A));
            if (n3 >= n2 || a2.J(jy3)) continue;
            jy2 = jy3;
            n2 = n3;
        }
        return jy2;
    }

    /*
     * WARNING - void declaration
     */
    public Tga_1(bga bga2, double d2, boolean bl) {
        void a2;
        void b2;
        Object d3 = bga2;
        Tga_1 c2 = this;
        c2.I = Lists.newArrayList();
        c2.j = d3;
        c2.k = b2;
        c2.A = a2;
        c2.J(vRa.d);
        if (!(d3.J() instanceof Hba)) {
            throw new IllegalArgumentException(kra.Ba);
        }
    }

    public void J() {
        block3: {
            Tga_1 a2;
            block2: {
                if (a2.j.J().f()) break block2;
                Tga_1 tga_1 = a2;
                if (!(tga_1.j.J(tga_1.M.f()) < Zta.ba)) break block3;
            }
            Tga_1 tga_1 = a2;
            tga_1.I.add(tga_1.M);
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(jy jy2) {
        Tga_1 tga_1 = this;
        for (jy jy3 : tga_1.I) {
            void a2;
            if (!a2.f().equals((Object)jy3.f())) continue;
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void C() {
        Tga_1 a2;
        if (a2.I.size() > Ypa.A) {
            a2.I.remove(uSa.E);
        }
    }

    public boolean l() {
        float a2;
        Tga_1 tga_1 = this;
        if (tga_1.j.J().f()) {
            return uSa.E != 0;
        }
        Tga_1 tga_12 = tga_1;
        float f2 = a2 = tga_12.j.F + YSa.G;
        if (tga_12.j.J(tga_1.M.f()) > (double)(f2 * f2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

