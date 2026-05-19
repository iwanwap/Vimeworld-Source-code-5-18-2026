/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Eoa
 *  Gl
 *  JPa
 *  Mda
 *  NTa
 *  QFa
 *  Sqa
 *  Ypa
 *  ZJa
 *  Zta
 *  aSa
 *  be
 *  cra
 *  ega
 *  jFa
 *  vL
 *  zfa
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.block.Block;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vf_3 {
    private static long L;
    private static Map<Integer, cf> E;
    private static final int m = 15;
    private static final int C = 13;
    private static final int i = 10;
    private static final int M = 8;
    private static final int k = 8;
    private static final double j = 7.5;
    private static final int J = 8;
    private static final double A = 56.25;
    private static final int I = 15;

    public vf_3() {
        vf_3 a2;
    }

    public static int J(XF xF2, int n2) {
        int b2 = n2;
        XF a2 = xF2;
        b2 = vf_3.J(vf_3.J(a2), b2);
        return b2;
    }

    private static void l(ZJa zJa2) {
        ZJa zJa3 = zJa2;
        Eoa eoa2 = zJa3.J();
        if (eoa2 != null) {
            for (vL vL2 : eoa2.J()) {
                cf cf2;
                Object a2;
                if (vf_3.J(vL2) > 0) {
                    a2 = be.valueOf((int)vL2.M());
                    cf2 = E.get(a2);
                    if (cf2 != null) continue;
                    cf2 = new cf(vL2);
                    E.put((Integer)a2, cf2);
                    continue;
                }
                a2 = be.valueOf((int)vL2.M());
                cf2 = E.remove(a2);
                if (cf2 == null) continue;
                cf2.f(zJa3);
            }
        }
    }

    public static int J(vL vL2, int n2) {
        int b2 = n2;
        vL a2 = vL2;
        b2 = vf_3.J(vf_3.J(a2), b2);
        return b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static void f(vL vL2, ZJa zJa2) {
        vL vL3 = vL2;
        Object b2 = E;
        synchronized (b2) {
            cf cf2 = E.remove(be.valueOf((int)vL3.M()));
            if (cf2 != null) {
                void a2;
                cf2.f((ZJa)a2);
            }
            return;
        }
    }

    public static int J(vL vL2) {
        vL vL3 = vL2;
        if (vL3 == Config.J().J() && !Config.N()) {
            return uSa.E;
        }
        if (vL3 instanceof Sx) {
            if (((Sx)vL3).t()) {
                return uSa.E;
            }
        }
        if (vL3.o()) {
            return Ypa.A;
        }
        if (vL3 instanceof oEa) {
            return Ypa.A;
        }
        if (vL3 instanceof vFa) {
            return Ypa.A;
        }
        if (vL3 instanceof Zfa) {
            if (((Zfa)vL3).v()) {
                return Ypa.A;
            }
            return NTa.C;
        }
        if (vL3 instanceof ega) {
            ega ega2 = (ega)vL3;
            if ((double)ega2.C > oQa.fa) {
                return uua.s;
            }
            return Yqa.i;
        }
        if (vL3 instanceof zfa) {
            zfa zfa2 = (zfa)vL3;
            if ((double)zfa2.l(JPa.N) > DPa.Ia) {
                return Ypa.A;
            }
        }
        if (vL3 instanceof Gl) {
            Gl gl2 = (Gl)vL3;
            int n2 = vf_3.J(gl2.J());
            int a2 = vf_3.J(gl2.f(AQa.P));
            return Math.max(n2, a2);
        }
        if (vL3 instanceof jFa) {
            return vf_3.J(vf_3.J((jFa)vL3));
        }
        return uSa.E;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void f(ZJa zJa2) {
        ZJa zJa3 = zJa2;
        long l2 = System.currentTimeMillis();
        if (l2 >= L + cra.f) {
            L = l2;
            Map<Integer, cf> map = E;
            synchronized (map) {
                block6: {
                    Iterator<cf> iterator;
                    vf_3.l(zJa3);
                    if (E.size() <= 0) break block6;
                    Iterator<cf> iterator2 = iterator = E.values().iterator();
                    while (iterator2.hasNext()) {
                        iterator.next().J(zJa3);
                        iterator2 = iterator;
                    }
                }
                return;
            }
        }
    }

    static {
        E = new HashMap<Integer, cf>();
        L = nqa.i;
    }

    public static Mda J(jFa a2) {
        return a2.J().J(NTa.C);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void J() {
        Map<Integer, cf> map = E;
        synchronized (map) {
            E.clear();
            return;
        }
    }

    public static int J(Mda mda2) {
        Block block;
        Mda mda3 = mda2;
        if (mda3 == null) {
            return uSa.E;
        }
        Mda a2 = mda3.J();
        if (a2 instanceof kda && (block = ((kda)a2).J()) != null) {
            return block.f();
        }
        if (a2 == Gea.eb) {
            return QFa.bb.f();
        }
        if (a2 != Gea.q && a2 != Gea.I) {
            if (a2 == Gea.Sa) {
                return Yqa.i;
            }
            if (a2 == Gea.QA) {
                return Yqa.i;
            }
            if (a2 == Gea.Xa) {
                return Yqa.i;
            }
            if (a2 == Gea.pA) {
                return QFa.jC.f() / uqa.g;
            }
            return uSa.E;
        }
        return NTa.C;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int J() {
        Map<Integer, cf> map = E;
        synchronized (map) {
            return E.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void J(ZJa zJa2) {
        ZJa zJa3 = zJa2;
        Map<Integer, cf> map = E;
        synchronized (map) {
            Object a2;
            Object object = a2 = E.values().iterator();
            while (object.hasNext()) {
                Object object2 = a2;
                object = object2;
                object2.remove();
                ((cf)a2.next()).f(zJa3);
            }
            return;
        }
    }

    public static int J(double d2, int n2) {
        int a2;
        int n3;
        double b2;
        int n4 = n2;
        if (b2 > aSa.V && (n3 = (int)(b2 * Zta.ba)) > (a2 = n4 & osa.Ja)) {
            n4 &= DQa.ja;
            n4 |= n3;
        }
        return n4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static double J(XF xF2) {
        XF xF3 = xF2;
        double d2 = aSa.V;
        Map<Integer, cf> map = E;
        synchronized (map) {
            for (cf cf2 : E.values()) {
                double d3;
                int a2 = cf2.J();
                if (a2 <= 0) continue;
                cf cf3 = cf2;
                double d4 = cf2.J();
                double d5 = cf3.f();
                double d6 = cf3.C();
                XF xF4 = xF3;
                d4 = (double)xF4.getX() - d4;
                d5 = (double)xF4.getY() - d5;
                d6 = (double)xF3.getZ() - d6;
                double d7 = d4;
                double d8 = d5;
                double d9 = d6;
                d4 = d7 * d7 + d8 * d8 + d9 * d9;
                if (cf3.J() && !Config.Da()) {
                    a2 = Config.J(a2 - uqa.g, uSa.E, Ypa.A);
                    d4 *= KPa.y;
                }
                if (!(d4 <= Hra.la)) continue;
                d4 = Math.sqrt(d4);
                d4 = (oua.i - d4 / Sqa.L) * (double)a2;
                if (!(d3 > d2)) continue;
                d2 = d4;
            }
            return Config.J(d2, aSa.V, zOa.X);
        }
    }

    public static void J(vL vL2, ZJa zJa2) {
        vL b2 = zJa2;
        zJa2 = vL2;
    }
}

