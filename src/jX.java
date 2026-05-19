/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ega
 *  HA
 *  LQa
 *  Mda
 *  NCa
 *  NTa
 *  Oba
 *  Oz
 *  QFa
 *  QSa
 *  SDa
 *  Taa
 *  Uta
 *  Waa
 *  ZOa
 *  cRa
 *  eAa
 *  kea
 *  mb
 *  rd
 *  vRa
 *  vX
 *  vpa
 *  waa
 *  ysa
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jX
extends vX
implements rd,
mb {
    private int m;
    private int C;
    private String i;
    private static final int[] M;
    private int k;
    private Mda[] j = new Mda[yRa.d];
    private static final int[] J;
    private int A;
    private static final int[] I;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        jX a2 = this;
        switch (b2) {
            case 0: {
                a2.C = c2;
                return;
            }
            case 1: {
                a2.k = c2;
                return;
            }
            case 2: {
                a2.A = c2;
                return;
            }
            case 3: {
                a2.m = c2;
                return;
            }
        }
    }

    public void J(Sx object) {
        Object b2 = object;
        object = this;
    }

    public Mda J(int n2) {
        int b2 = n2;
        jX a2 = this;
        return a2.j[b2];
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, Mda mda2) {
        void b2;
        jX c2 = mda2;
        jX a2 = this;
        if (b2 == uqa.g) {
            return uSa.E != 0;
        }
        if (b2 != vRa.d) {
            return vRa.d != 0;
        }
        if (jX.J((Mda)c2) || lDa.f((Mda)c2)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(Sx sx) {
        jX a2;
        Object b2 = sx;
        jX jX2 = a2 = this;
        if (jX2.worldObj.J(jX2.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean M() {
        jX a2;
        if (a2.C > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        jX jX2 = this;
        void v0 = a2;
        super.J((Waa)v0);
        a2.J(wsa.ca, (short)jX2.C);
        v0.J(Npa.U, (short)jX2.A);
        v0.J(yRa.l, (short)jX2.m);
        waa waa3 = new waa();
        int n2 = b2 = uSa.E;
        while (n2 < jX2.j.length) {
            if (jX2.j[b2] != null) {
                Waa waa4 = new Waa();
                waa4.J(kua.E, (byte)b2);
                jX2.j[b2].J(waa4);
                waa3.J((NCa)waa4);
            }
            n2 = ++b2;
        }
        a2.J(rua.la, (NCa)waa3);
        if (jX2.J()) {
            a2.J(cRa.k, jX2.i);
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, Mda mda2, DZ dZ) {
        void b2;
        void a2;
        int d2 = n2;
        jX c2 = this;
        if (a2 == DZ.DOWN && d2 == vRa.d && (d2 = b2.J()) != Gea.Ba && d2 != Gea.Ca) {
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public int f() {
        jX a2;
        return a2.j.length;
    }

    public Ega J(kea kea2, Sx sx) {
        jX c2 = kea2;
        jX b2 = this;
        return new SDa((kea)c2, (HA)b2);
    }

    public Mda f(int n2) {
        int b2 = n2;
        jX a2 = this;
        if (a2.j[b2] != null) {
            jX jX2 = a2;
            Mda mda2 = jX2.j[b2];
            jX2.j[b2] = null;
            return mda2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        jX b2 = this;
        if (b2.j[c2] != null) {
            void a2;
            if (b2.j[c2].E <= a2) {
                jX jX2 = b2;
                Mda mda2 = jX2.j[c2];
                jX2.j[c2] = null;
                return mda2;
            }
            jX jX3 = b2;
            Mda mda3 = jX3.j[c2].J((int)a2);
            if (jX3.j[c2].E == 0) {
                b2.j[c2] = null;
            }
            return mda3;
        }
        return null;
    }

    public int l() {
        return ysa.s;
    }

    private boolean e() {
        jX jX2 = this;
        if (jX2.j[uSa.E] == null) {
            return uSa.E != 0;
        }
        jX a2 = Taa.J().J(jX2.j[uSa.E]);
        if (a2 == null) {
            return uSa.E != 0;
        }
        if (jX2.j[uqa.g] == null) {
            return vRa.d != 0;
        }
        if (!jX2.j[uqa.g].l((Mda)a2)) {
            return uSa.E != 0;
        }
        if (jX2.j[uqa.g].E < jX2.l() && jX2.j[uqa.g].E < jX2.j[uqa.g].e()) {
            return vRa.d != 0;
        }
        if (jX2.j[uqa.g].E < a2.e()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int J(int n2) {
        int b2 = n2;
        jX a2 = this;
        switch (b2) {
            case 0: {
                return a2.C;
            }
            case 1: {
                return a2.k;
            }
            case 2: {
                return a2.A;
            }
            case 3: {
                return a2.m;
            }
        }
        return uSa.E;
    }

    public String J() {
        jX a2;
        if (a2.J()) {
            return a2.i;
        }
        return Pua.B;
    }

    /*
     * WARNING - void declaration
     */
    public boolean f(int n2, Mda mda2, DZ dZ) {
        void c2;
        jX d2 = mda2;
        jX b2 = this;
        return b2.J((int)c2, (Mda)d2);
    }

    public int[] J(DZ dZ) {
        Object b2 = dZ;
        jX a2 = this;
        if (b2 == DZ.DOWN) {
            return I;
        }
        if (b2 == DZ.UP) {
            return J;
        }
        return M;
    }

    static {
        int[] nArray = new int[vRa.d];
        nArray[uSa.E] = uSa.E;
        J = nArray;
        int[] nArray2 = new int[uqa.g];
        nArray2[uSa.E] = uqa.g;
        nArray2[vRa.d] = vRa.d;
        I = nArray2;
        int[] nArray3 = new int[vRa.d];
        nArray3[uSa.E] = vRa.d;
        M = nArray3;
    }

    public void f(Waa waa2) {
        int n2;
        jX a2;
        jX b2 = waa2;
        jX jX2 = a2 = this;
        super.f((Waa)b2);
        waa waa3 = b2.J(rua.la, NTa.C);
        jX2.j = new Mda[jX2.f()];
        int n3 = n2 = uSa.E;
        while (n3 < waa3.J()) {
            Waa waa4 = waa3.J(n2);
            byte by = waa4.J(kua.E);
            if (by >= 0 && by < a2.j.length) {
                a2.j[by] = Mda.J((Waa)waa4);
            }
            n3 = ++n2;
        }
        jX jX3 = a2;
        jX jX4 = b2;
        a2.C = jX4.J(wsa.ca);
        a2.A = jX4.J(Npa.U);
        jX3.m = b2.J(yRa.l);
        jX3.k = jX.f(a2.j[vRa.d]);
        if (b2.J(cRa.k, Yqa.i)) {
            a2.i = b2.J(cRa.k);
        }
    }

    public String f() {
        return cPa.W;
    }

    public static boolean J(HA a2) {
        if (a2.J(uSa.E) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(String string) {
        Object b2 = string;
        jX a2 = this;
        a2.i = b2;
    }

    public int J() {
        return AQa.P;
    }

    public static int f(Mda mda2) {
        Mda mda3 = mda2;
        if (mda3 == null) {
            return uSa.E;
        }
        Mda a2 = mda3.J();
        if (a2 instanceof kda && Block.J((eAa)a2) != QFa.HF) {
            Block block = Block.J((eAa)a2);
            if (block == QFa.eb) {
                return Jpa.Ha;
            }
            if (block.J() == Material.wood) {
                return vpa.Ja;
            }
            if (block == QFa.Ea) {
                return LQa.t;
            }
        }
        if (a2 instanceof Oba && ((Oba)a2).f().equals(Yua.Q)) {
            return ZOa.x;
        }
        if (a2 instanceof xCa && ((xCa)a2).f().equals(Yua.Q)) {
            return ZOa.x;
        }
        if (a2 instanceof Hea && ((Hea)a2).f().equals(Yua.Q)) {
            return ZOa.x;
        }
        if (a2 == Gea.t) {
            return ySa.T;
        }
        if (a2 == Gea.qc) {
            return eta.p;
        }
        if (a2 == Gea.eb) {
            return QSa.ia;
        }
        if (a2 == eAa.J((Block)QFa.Y)) {
            return ySa.T;
        }
        if (a2 == Gea.q) {
            return Uta.F;
        }
        return uSa.E;
    }

    public void l() {
        int a2;
        jX jX2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < jX2.j.length) {
            jX2.j[a2++] = null;
            n2 = a2;
        }
    }

    public int J(Mda mda2) {
        jX b2 = mda2;
        jX a2 = this;
        return ZOa.x;
    }

    public jX() {
        jX a2;
    }

    public static boolean J(Mda a2) {
        if (jX.f(a2) > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        jX a2;
        if (a2.i != null && a2.i.length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, Mda mda2) {
        void b2;
        jX c2 = mda2;
        jX a2 = this;
        int n3 = c2 != null && c2.l(a2.j[b2]) && Mda.f((Mda)c2, (Mda)a2.j[b2]) ? vRa.d : uSa.E;
        a2.j[b2] = c2;
        if (a2.j[b2] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
        if (b2 == false && n3 == 0) {
            jX jX2 = a2;
            jX2.m = jX2.J((Mda)c2);
            jX2.A = uSa.E;
            jX2.f();
        }
    }

    public void f(Sx object) {
        Object b2 = object;
        object = this;
    }

    public void M() {
        jX jX2 = this;
        if (jX2.e()) {
            jX jX3;
            jX a2 = Taa.J().J(jX2.j[uSa.E]);
            if (jX2.j[uqa.g] == null) {
                jX jX4 = jX2;
                jX3 = jX4;
                jX4.j[uqa.g] = a2.J();
            } else {
                if (jX2.j[uqa.g].J() == a2.J()) {
                    jX2.j[uqa.g].E += vRa.d;
                }
                jX3 = jX2;
            }
            if (jX3.j[uSa.E].J() == eAa.J((Block)QFa.ba) && jX2.j[uSa.E].J() == vRa.d && jX2.j[vRa.d] != null && jX2.j[vRa.d].J() == Gea.Ca) {
                jX2.j[vRa.d] = new Mda(Gea.Ba);
            }
            jX jX5 = jX2;
            jX5.j[uSa.E].E -= vRa.d;
            if (jX5.j[uSa.E].E <= 0) {
                jX2.j[uSa.E] = null;
            }
        }
    }

    public void J() {
        int a2;
        jX jX2;
        block8: {
            boolean bl;
            block12: {
                boolean bl2;
                block11: {
                    block9: {
                        block10: {
                            jX jX3 = jX2 = this;
                            bl2 = jX3.M();
                            a2 = uSa.E;
                            if (jX3.M()) {
                                jX2.C -= vRa.d;
                            }
                            if (jX2.worldObj.e) break block8;
                            if (!jX2.M() && (jX2.j[vRa.d] == null || jX2.j[uSa.E] == null)) break block9;
                            if (!jX2.M() && jX2.e()) {
                                jX2.k = jX2.C = jX.f(jX2.j[vRa.d]);
                                if (jX2.M()) {
                                    a2 = vRa.d;
                                    if (jX2.j[vRa.d] != null) {
                                        jX jX4 = jX2;
                                        jX4.j[vRa.d].E -= vRa.d;
                                        if (jX4.j[vRa.d].E == 0) {
                                            jX jX5 = jX2;
                                            eAa eAa2 = jX5.j[vRa.d].J().f();
                                            Mda mda2 = jX5.j[vRa.d] = eAa2 != null ? new Mda(eAa2) : null;
                                        }
                                    }
                                }
                            }
                            if (!jX2.M() || !jX2.e()) break block10;
                            jX jX6 = jX2;
                            jX6.A += vRa.d;
                            if (jX6.A != jX2.m) break block11;
                            jX jX7 = jX2;
                            jX7.A = uSa.E;
                            jX7.m = jX7.J(jX7.j[uSa.E]);
                            jX7.M();
                            a2 = vRa.d;
                            bl = bl2;
                            break block12;
                        }
                        jX2.A = uSa.E;
                        bl = bl2;
                        break block12;
                    }
                    if (!jX2.M() && jX2.A > 0) {
                        jX2.A = Oz.f((int)(jX2.A - uqa.g), (int)uSa.E, (int)jX2.m);
                    }
                }
                bl = bl2;
            }
            if (bl != jX2.M()) {
                a2 = vRa.d;
                jX jX8 = jX2;
                BlockFurnace.J(jX2.M(), jX8.worldObj, jX8.pos);
            }
        }
        if (a2 != 0) {
            jX2.f();
        }
    }
}

