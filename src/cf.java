/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  Cla
 *  Eoa
 *  Oz
 *  QFa
 *  WSa
 *  Ypa
 *  ZJa
 *  aSa
 *  cja
 *  hqa
 *  vL
 *  vRa
 *  vf
 *  zsa
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.block.Block;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cf {
    private long E;
    private vL m;
    private Set<XF> C;
    private double i;
    private double M;
    private double k;
    private boolean j;
    private int J;
    private double A;
    private zz I;

    /*
     * WARNING - void declaration
     */
    public void f(ZJa zJa) {
        Iterator<XF> iterator;
        cf cf2 = this;
        Iterator<XF> iterator2 = iterator = cf2.C.iterator();
        while (iterator2.hasNext()) {
            void a2;
            Object b2 = iterator.next();
            b2 = a2.J((XF)((Object)b2));
            cf2.J((Cla)b2, null, null);
            iterator2 = iterator;
        }
    }

    public double C() {
        cf a2;
        return a2.A;
    }

    public double l() {
        cf a2;
        return a2.i;
    }

    public double f() {
        cf a2;
        return a2.M;
    }

    public double J() {
        cf a2;
        return a2.k;
    }

    public int J() {
        cf a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(ZJa zJa) {
        cf cf2 = this;
        if (Config.G()) {
            long l2 = System.currentTimeMillis();
            if (l2 < cf2.E + zsa.R) {
                return;
            }
            cf2.E = l2;
        }
        cf cf3 = cf2;
        double d2 = cf3.m.la - kTa.B;
        cf cf4 = cf2;
        double d3 = cf3.m.Z - kTa.B + cf4.i;
        double d4 = cf4.m.A - kTa.B;
        int b22 = vf.J((vL)cf3.m);
        double d5 = d2 - cf2.k;
        double d6 = d3 - cf2.M;
        double d7 = d4 - cf2.A;
        double d8 = tpa.k;
        if (Math.abs(d5) > d8 || Math.abs(d6) > d8 || Math.abs(d7) > d8 || cf2.J != b22) {
            Object object;
            void a2;
            cf cf5 = cf2;
            cf cf6 = cf2;
            cf6.k = d2;
            cf6.M = d3;
            cf5.A = d4;
            cf5.J = b22;
            cf2.j = uSa.E;
            Eoa eoa = a2.J();
            if (eoa != null) {
                cf2.I.func_181079_c(Oz.f((double)d2), Oz.f((double)d3), Oz.f((double)d4));
                object = eoa.J((XF)cf2.I);
                Block block = object.J();
                cf2.j = block == QFa.sc ? vRa.d : uSa.E;
            }
            object = new HashSet<XF>();
            if (b22 > 0) {
                DZ dZ2 = (Oz.f((double)d2) & Ypa.A) >= Yqa.i ? DZ.EAST : DZ.WEST;
                DZ b22 = (Oz.f((double)d3) & Ypa.A) >= Yqa.i ? DZ.UP : DZ.DOWN;
                DZ dZ3 = (Oz.f((double)d4) & Ypa.A) >= Yqa.i ? DZ.SOUTH : DZ.NORTH;
                XF xF = new XF(d2, d3, d4);
                void v4 = a2;
                Cla cla2 = v4.J(xF);
                Cla cla3 = v4.J(cla2, dZ2);
                Cla cla4 = v4.J(cla2, dZ3);
                Cla cla5 = v4.J(cla3, dZ3);
                b22 = v4.J(cla2, b22);
                Cla cla6 = v4.J((Cla)b22, dZ2);
                Cla cla7 = v4.J((Cla)b22, dZ3);
                cf cf7 = cf2;
                cf cf8 = cf2;
                cf cf9 = cf2;
                cf cf10 = cf2;
                cf cf11 = cf2;
                cf11.J(cla2, cf2.C, (Set<XF>)object);
                cf11.J(cla3, cf11.C, (Set<XF>)object);
                cf10.J(cla4, cf10.C, (Set<XF>)object);
                cf9.J(cla5, cf10.C, (Set<XF>)object);
                cf9.J((Cla)b22, cf9.C, (Set<XF>)object);
                cf8.J(cla6, cf8.C, (Set<XF>)object);
                cf7.J(cla7, cf8.C, (Set<XF>)object);
                cf7.J(v4.J(cla6, dZ3), cf7.C, (Set<XF>)object);
            }
            cf2.f((ZJa)a2);
            cf2.C = object;
        }
    }

    public cf(vL vL2) {
        cf a2;
        cf b2 = vL2;
        cf cf2 = a2 = this;
        cf cf3 = a2;
        cf3.m = null;
        a2.i = aSa.V;
        cf3.k = Bsa.U;
        cf3.M = Bsa.U;
        cf3.A = Bsa.U;
        cf3.J = uSa.E;
        cf3.j = uSa.E;
        cf3.E = nqa.i;
        cf cf4 = a2;
        cf3.C = new HashSet<XF>();
        cf3.I = new zz();
        cf2.m = b2;
        cf2.i = b2.l();
    }

    public String toString() {
        cf a2;
        return new StringBuilder().insert(3 & 4, hqa.C).append(a2.m).append(WSa.Z).append(a2.i).toString();
    }

    public vL J() {
        cf a2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    private void J(Cla cla2, Set<XF> set, Set<XF> set2) {
        Object d2 = cla2;
        cf c2 = this;
        if (d2 != null) {
            void a2;
            void b2;
            cja cja2 = d2.J();
            if (cja2 != null && !cja2.J()) {
                d2.J(vRa.d != 0);
            }
            d2 = d2.J();
            if (b2 != null) {
                b2.remove(d2);
            }
            if (a2 != null) {
                a2.add(d2);
            }
        }
    }

    public boolean J() {
        cf a2;
        return a2.j;
    }
}

