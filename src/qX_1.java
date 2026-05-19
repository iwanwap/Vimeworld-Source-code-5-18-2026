/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  Gg
 *  HA
 *  Mda
 *  NCa
 *  NTa
 *  Oz
 *  Sqa
 *  Waa
 *  bua
 *  cRa
 *  jC
 *  jFa
 *  kea
 *  mb
 *  mra
 *  pua
 *  rd
 *  sda
 *  vL
 *  vRa
 *  vX
 *  waa
 *  xy
 *  ysa
 */
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockHopper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class qX_1
extends vX
implements jC,
rd {
    private Mda[] J = new Mda[tTa.h];
    private String A;
    private int I = pua.o;

    /*
     * WARNING - void declaration
     */
    public static boolean J(HA hA2, jFa jFa2) {
        void a2;
        HA hA3 = hA2;
        boolean bl = uSa.E;
        if (a2 == null) {
            return uSa.E != 0;
        }
        HA b2 = a2.J().J();
        if ((b2 = qX_1.J(hA3, (Mda)b2, null)) != null && b2.E != 0) {
            a2.J((Mda)b2);
            return bl;
        }
        boolean bl2 = vRa.d;
        a2.k();
        return bl2;
    }

    public void l() {
        int a2;
        qX_1 qX_12 = this;
        int n2 = a2 = uSa.E;
        while (n2 < qX_12.J.length) {
            qX_12.J[a2++] = null;
            n2 = a2;
        }
    }

    public double l() {
        qX_1 a2;
        return (double)a2.pos.getX() + kTa.B;
    }

    public double f() {
        qX_1 a2;
        return (double)a2.pos.getY() + kTa.B;
    }

    /*
     * WARNING - void declaration
     */
    public static Mda J(HA hA2, Mda mda2, DZ dZ2) {
        void a2;
        HA c2 = mda2;
        HA b2 = hA2;
        if (b2 instanceof mb && a2 != null) {
            int n2;
            mb mb2 = (mb)b2;
            int[] nArray = mb2.J((DZ)a2);
            int n3 = n2 = uSa.E;
            while (n3 < nArray.length && c2 != null && c2.E > 0) {
                int n4 = nArray[n2];
                c2 = qX_1.J(b2, (Mda)c2, n4, (DZ)a2);
                n3 = ++n2;
            }
        } else {
            int n5;
            int n6 = b2.f();
            int n7 = n5 = uSa.E;
            while (n7 < n6 && c2 != null && c2.E > 0) {
                c2 = qX_1.J(b2, (Mda)c2, n5++, (DZ)a2);
                n7 = n5;
            }
        }
        if (c2 != null && c2.E == 0) {
            c2 = null;
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    public Ega J(kea kea2, Sx sx2) {
        void b2;
        Object c2 = sx2;
        qX_1 a2 = this;
        return new sda((kea)b2, (HA)a2, (Sx)((Object)c2));
    }

    public int J() {
        return uSa.E;
    }

    private static boolean J(Mda mda2, Mda mda3) {
        Mda b2 = mda3;
        Mda a2 = mda2;
        if (a2.J() != b2.J()) {
            return uSa.E != 0;
        }
        if (a2.J() != b2.J()) {
            return uSa.E != 0;
        }
        if (a2.E > a2.e()) {
            return uSa.E != 0;
        }
        return Mda.f((Mda)a2, (Mda)b2);
    }

    public static List<jFa> J(Gg d2, double c2, double b2, double a2) {
        return d2.J(jFa.class, new xy(c2 - kTa.B, b2 - kTa.B, a2 - kTa.B, c2 + kTa.B, b2 + kTa.B, a2 + kTa.B), Kaa.j);
    }

    public void J(int n2) {
        int b2 = n2;
        qX_1 a2 = this;
        a2.I = b2;
    }

    public Mda J(int n2) {
        int b2 = n2;
        qX_1 a2 = this;
        return a2.J[b2];
    }

    public int l() {
        return ysa.s;
    }

    public void J(int n2, Mda mda2) {
        qX_1 c2 = mda2;
        qX_1 a2 = this;
        a2.J[b] = c2;
        if (a2.J[b] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
    }

    public boolean J() {
        qX_1 a2;
        if (a2.A != null && a2.A.length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public boolean G() {
        qX_1 a2;
        if (a2.I <= vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private boolean D() {
        int a2;
        qX_1 qX_12 = this;
        Mda[] mdaArray = qX_12.J;
        int n2 = qX_12.J.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            if (mdaArray[a2] != null) {
                return uSa.E != 0;
            }
            n3 = ++a2;
        }
        return vRa.d != 0;
    }

    public static HA J(jC a2) {
        return qX_1.J(a2.f(), a2.l(), a2.f() + oua.i, a2.J());
    }

    public int f() {
        qX_1 a2;
        return a2.J.length;
    }

    public boolean J(Sx sx2) {
        qX_1 a2;
        Object b2 = sx2;
        qX_1 qX_12 = a2 = this;
        if (qX_12.worldObj.J(qX_12.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static Mda J(HA hA2, Mda mda2, int n2, DZ dZ2) {
        void a22;
        Object c2;
        HA b2;
        int d2 = n2;
        HA hA3 = b2 = hA2;
        Mda mda3 = hA3.J(d2);
        if (qX_1.J(hA3, c2, d2, (DZ)a22)) {
            int n3;
            int a22 = uSa.E;
            if (mda3 == null) {
                b2.J(d2, (Mda)c2);
                c2 = null;
                n3 = a22 = vRa.d;
            } else {
                if (qX_1.J(mda3, c2)) {
                    Object v2 = c2;
                    int n4 = v2.e() - mda3.E;
                    d2 = Math.min(v2.E, n4);
                    v2.E -= d2;
                    mda3.E += d2;
                    a22 = d2 > 0 ? vRa.d : uSa.E;
                }
                n3 = a22;
            }
            if (n3 != 0) {
                if (b2 instanceof qX_1) {
                    qX_1 qX_12 = (qX_1)b2;
                    if (qX_12.G()) {
                        qX_12.J(Yqa.i);
                    }
                    b2.f();
                }
                b2.f();
            }
        }
        return c2;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean f(HA hA2, Mda mda2, int n2, DZ dZ2) {
        void c2;
        void b2;
        Object d2 = dZ2;
        HA a2 = hA2;
        if (!(a2 instanceof mb) || ((mb)a2).J((int)b2, (Mda)c2, (DZ)((Object)d2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private boolean A() {
        int a2;
        qX_1 qX_12 = this;
        Mda[] mdaArray = qX_12.J;
        int n2 = qX_12.J.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Mda mda2 = mdaArray[a2];
            if (mda2 == null || mda2.E != mda2.e()) {
                return uSa.E != 0;
            }
            n3 = ++a2;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(jC jC2, HA hA2, int n2, DZ dZ2) {
        Mda a2;
        void b2;
        void c2;
        jC jC3 = jC2;
        jC d2 = c2.J((int)b2);
        if (d2 != null && qX_1.f((HA)c2, (Mda)d2, (int)b2, (DZ)a2)) {
            a2 = d2.J();
            d2 = qX_1.J((HA)jC3, c2.J((int)b2, vRa.d), null);
            if (d2 == null || d2.E == 0) {
                c2.f();
                return vRa.d != 0;
            }
            c2.J((int)b2, a2);
        }
        return uSa.E != 0;
    }

    public boolean J(int n2, Mda mda2) {
        qX_1 c2 = mda2;
        qX_1 a2 = this;
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        qX_1 qX_12 = this;
        super.J((Waa)a2);
        waa waa3 = new waa();
        int n2 = b2 = uSa.E;
        while (n2 < qX_12.J.length) {
            if (qX_12.J[b2] != null) {
                Waa waa4 = new Waa();
                waa4.J(kua.E, (byte)b2);
                qX_12.J[b2].J(waa4);
                waa3.J((NCa)waa4);
            }
            n2 = ++b2;
        }
        void v1 = a2;
        v1.J(rua.la, (NCa)waa3);
        v1.J(Sqa.F, qX_12.I);
        if (qX_12.J()) {
            a2.J(cRa.k, qX_12.A);
        }
    }

    public void f() {
        qX_1 a2;
        super.f();
    }

    public void f(Waa waa2) {
        qX_1 a2;
        qX_1 b2 = waa2;
        qX_1 qX_12 = a2 = this;
        super.f((Waa)b2);
        waa waa3 = b2.J(rua.la, NTa.C);
        qX_12.J = new Mda[qX_12.f()];
        if (b2.J(cRa.k, Yqa.i)) {
            a2.A = b2.J(cRa.k);
        }
        a2.I = b2.J(Sqa.F);
        int n2 = b2 = uSa.E;
        while (n2 < waa3.J()) {
            Waa waa4 = waa3.J(b2);
            byte by2 = waa4.J(kua.E);
            if (by2 >= 0 && by2 < a2.J.length) {
                a2.J[by2] = Mda.J((Waa)waa4);
            }
            n2 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static HA J(Gg gg2, double d2, double d3, double d4) {
        void a2;
        int d5;
        void b2;
        int n2;
        void c2;
        Gg gg3 = gg2;
        HA hA2 = null;
        int n3 = Oz.f((double)c2);
        XF xF2 = new XF(n3, n2 = Oz.f((double)b2), d5 = Oz.f((double)a2));
        Block block = gg3.J(xF2).J();
        if (block.a() && (d5 = gg3.J(xF2)) instanceof HA && (hA2 = (HA)d5) instanceof Fz && block instanceof BlockChest) {
            hA2 = ((BlockChest)block).J(gg3, xF2);
        }
        if (hA2 == null && (d5 = gg3.J((vL)null, new xy((double)(c2 - kTa.B), (double)(b2 - kTa.B), (double)(a2 - kTa.B), (double)(c2 + kTa.B), (double)(b2 + kTa.B), (double)(a2 + kTa.B)), Kaa.J)).size() > 0) {
            List list = d5;
            hA2 = (HA)list.get(gg3.v.nextInt(list.size()));
        }
        return hA2;
    }

    public boolean i() {
        qX_1 qX_12 = this;
        if (qX_12.worldObj != null && !qX_12.worldObj.e) {
            if (!qX_12.M() && BlockHopper.J(qX_12.C())) {
                int a2 = uSa.E;
                if (!qX_12.D()) {
                    a2 = qX_12.e() ? 1 : 0;
                }
                if (!qX_12.A()) {
                    int n2 = a2 = qX_1.J(qX_12) || a2 != 0 ? vRa.d : uSa.E;
                }
                if (a2 != 0) {
                    qX_1 qX_13 = qX_12;
                    qX_13.J(Yqa.i);
                    qX_13.f();
                    return vRa.d != 0;
                }
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public void J(String string) {
        Object b2 = string;
        qX_1 a2 = this;
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean f(HA hA2, DZ dZ2) {
        void b2;
        qX_1 qX_12 = this;
        if (b2 instanceof mb) {
            int n2;
            Mda a2;
            mb mb2 = (mb)b2;
            Object c2 = mb2.J((DZ)a2);
            int n3 = n2 = uSa.E;
            while (n3 < ((qX_1)c2).length) {
                a2 = mb2.J((int)c2[n2]);
                if (a2 == null || a2.E != a2.e()) {
                    return uSa.E != 0;
                }
                n3 = ++n2;
            }
        } else {
            int c2;
            int n4 = b2.f();
            int n5 = c2 = uSa.E;
            while (n5 < n4) {
                Mda mda2 = b2.J(c2);
                if (mda2 == null || mda2.E != mda2.e()) {
                    return uSa.E != 0;
                }
                n5 = ++c2;
            }
        }
        return vRa.d != 0;
    }

    public String f() {
        return mra.Q;
    }

    public Mda f(int n2) {
        int b2 = n2;
        qX_1 a2 = this;
        if (a2.J[b2] != null) {
            qX_1 qX_12 = a2;
            Mda mda2 = qX_12.J[b2];
            qX_12.J[b2] = null;
            return mda2;
        }
        return null;
    }

    public void J() {
        qX_1 a2;
        if (a2.worldObj != null && !a2.worldObj.e) {
            qX_1 qX_12 = a2;
            qX_12.I -= vRa.d;
            if (!qX_12.M()) {
                qX_1 qX_13 = a2;
                qX_13.J(uSa.E);
                qX_13.i();
            }
        }
    }

    public static boolean J(jC jC2) {
        jC jC3 = jC2;
        HA hA2 = qX_1.J(jC3);
        if (hA2 != null) {
            Object a2 = DZ.DOWN;
            if (qX_1.J(hA2, (DZ)((Object)a2))) {
                return uSa.E != 0;
            }
            if (hA2 instanceof mb) {
                int n2;
                mb mb2 = (mb)hA2;
                int[] nArray = mb2.J((DZ)((Object)a2));
                int n3 = n2 = uSa.E;
                while (n3 < nArray.length) {
                    if (qX_1.J(jC3, hA2, nArray[n2], (DZ)((Object)a2))) {
                        return vRa.d != 0;
                    }
                    n3 = ++n2;
                }
            } else {
                int n4;
                int n5 = hA2.f();
                int n6 = n4 = uSa.E;
                while (n6 < n5) {
                    if (qX_1.J(jC3, hA2, n4, (DZ)((Object)a2))) {
                        return vRa.d != 0;
                    }
                    n6 = ++n4;
                }
            }
        } else {
            for (jFa jFa2 : qX_1.J(jC3.f(), jC3.l(), jC3.f() + oua.i, jC3.J())) {
                if (!qX_1.J((HA)jC3, jFa2)) continue;
                return vRa.d != 0;
            }
        }
        return uSa.E != 0;
    }

    public String J() {
        qX_1 a2;
        if (a2.J()) {
            return a2.A;
        }
        return bua.p;
    }

    public boolean M() {
        qX_1 a2;
        if (a2.I > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public double J() {
        qX_1 a2;
        return (double)a2.pos.getZ() + kTa.B;
    }

    public qX_1() {
        qX_1 a2;
    }

    public int J(int n2) {
        int b2 = n2;
        qX_1 a2 = this;
        return uSa.E;
    }

    private boolean e() {
        int a2;
        qX_1 qX_12 = this;
        HA hA2 = qX_12.J();
        if (hA2 == null) {
            return uSa.E != 0;
        }
        qX_1 qX_13 = qX_12;
        DZ dZ2 = BlockHopper.J(qX_13.C()).getOpposite();
        if (qX_13.f(hA2, dZ2)) {
            return uSa.E != 0;
        }
        int n2 = a2 = uSa.E;
        while (n2 < qX_12.f()) {
            if (qX_12.J(a2) != null) {
                Mda mda2 = qX_12.J(a2).J();
                Mda mda3 = qX_1.J(hA2, qX_12.J(a2, vRa.d), dZ2);
                if (mda3 == null || mda3.E == 0) {
                    hA2.f();
                    return vRa.d != 0;
                }
                qX_12.J(a2, mda2);
            }
            n2 = ++a2;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(HA hA2, DZ dZ2) {
        HA hA3 = hA2;
        if (hA3 instanceof mb) {
            void a2;
            mb mb2 = (mb)hA3;
            Object b2 = mb2.J((DZ)a2);
            int n2 = a2 = uSa.E;
            while (n2 < ((HA)b2).length) {
                if (mb2.J((int)b2[a2]) != null) {
                    return uSa.E != 0;
                }
                n2 = ++a2;
            }
        } else {
            int b2;
            int n3 = hA3.f();
            int n4 = b2 = uSa.E;
            while (n4 < n3) {
                if (hA3.J(b2) != null) {
                    return uSa.E != 0;
                }
                n4 = ++b2;
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean J(HA hA2, Mda mda2, int n2, DZ dZ2) {
        void a2;
        void c2;
        HA b2 = hA2;
        int d2 = n2;
        if (!b2.J(d2, (Mda)c2)) {
            return uSa.E != 0;
        }
        if (!(b2 instanceof mb) || ((mb)b2).f(d2, (Mda)c2, (DZ)a2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    private HA J() {
        qX_1 qX_12;
        qX_1 qX_13 = qX_12 = this;
        DZ a2 = BlockHopper.J(qX_13.C());
        return qX_1.J(qX_13.f(), qX_12.pos.getX() + a2.getFrontOffsetX(), (double)(qX_12.pos.getY() + a2.getFrontOffsetY()), qX_12.pos.getZ() + a2.getFrontOffsetZ());
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        qX_1 b2 = this;
        if (b2.J[c2] != null) {
            void a2;
            if (b2.J[c2].E <= a2) {
                qX_1 qX_12 = b2;
                Mda mda2 = qX_12.J[c2];
                qX_12.J[c2] = null;
                return mda2;
            }
            qX_1 qX_13 = b2;
            Mda mda3 = qX_13.J[c2].J((int)a2);
            if (qX_13.J[c2].E == 0) {
                b2.J[c2] = null;
            }
            return mda3;
        }
        return null;
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        qX_1 qX_12 = this;
    }
}

