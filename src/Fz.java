/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Ega
 *  HA
 *  JPa
 *  Lra
 *  MQa
 *  Mda
 *  NCa
 *  NTa
 *  Qea
 *  Waa
 *  ZOa
 *  Zua
 *  bZ
 *  cRa
 *  jEa
 *  kPa
 *  kea
 *  pqa
 *  pua
 *  rd
 *  vRa
 *  vX
 *  waa
 *  xy
 *  ysa
 */
import net.minecraft.block.BlockChest;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Fz
extends vX
implements rd,
HA {
    public float g;
    private Mda[] L;
    private int E;
    private String m;
    public boolean C;
    public Fz i;
    public Fz M;
    private int k;
    public Fz j;
    public float J;
    public Fz A;
    public int I;

    public void J(int n2, Mda mda2) {
        Fz c2 = mda2;
        Fz a2 = this;
        a2.L[b] = c2;
        if (a2.L[b] != null && ((Mda)c2).E > a2.l()) {
            ((Mda)c2).E = a2.l();
        }
        a2.f();
    }

    public void J(String string) {
        Object b2 = string;
        Fz a2 = this;
        a2.m = b2;
    }

    public Mda f(int n2) {
        int b2 = n2;
        Fz a2 = this;
        if (a2.L[b2] != null) {
            Fz fz2 = a2;
            Mda mda2 = fz2.L[b2];
            fz2.L[b2] = null;
            return mda2;
        }
        return null;
    }

    private boolean J(XF xF) {
        Object b2 = xF;
        Fz a2 = this;
        if (a2.worldObj == null) {
            return uSa.E != 0;
        }
        if ((b2 = a2.worldObj.J((XF)((Object)b2)).J()) instanceof BlockChest && ((BlockChest)b2).chestType == a2.d()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        Fz a2;
        if (a2.m != null && a2.m.length() > 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void M() {
        Fz a2;
        if (!a2.C) {
            Fz fz2 = a2;
            fz2.C = vRa.d;
            fz2.M = fz2.J(DZ.WEST);
            fz2.j = fz2.J(DZ.EAST);
            fz2.i = fz2.J(DZ.NORTH);
            fz2.A = fz2.J(DZ.SOUTH);
        }
    }

    public void J(Sx sx) {
        Sx b2 = sx;
        Fz a2 = this;
        if (!b2.t() && a2.J() instanceof BlockChest) {
            Fz fz2 = a2;
            fz2.I -= vRa.d;
            Fz fz3 = a2;
            fz2.worldObj.f(a2.pos, fz3.J(), vRa.d, a2.I);
            fz3.worldObj.f(a2.pos, a2.J());
            fz2.worldObj.f(a2.pos.down(), a2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public Mda J(int n2, int n3) {
        int c2 = n2;
        Fz b2 = this;
        if (b2.L[c2] != null) {
            void a2;
            if (b2.L[c2].E <= a2) {
                Fz fz2 = b2;
                Mda mda2 = fz2.L[c2];
                fz2.L[c2] = null;
                fz2.f();
                return mda2;
            }
            Fz fz3 = b2;
            Mda mda3 = fz3.L[c2].J((int)a2);
            if (fz3.L[c2].E == 0) {
                b2.L[c2] = null;
            }
            b2.f();
            return mda3;
        }
        return null;
    }

    public void f(Sx sx) {
        Sx b2 = sx;
        Fz a2 = this;
        if (!b2.t()) {
            if (a2.I < 0) {
                a2.I = uSa.E;
            }
            Fz fz2 = a2;
            fz2.I += vRa.d;
            Fz fz3 = a2;
            fz2.worldObj.f(a2.pos, fz3.J(), vRa.d, a2.I);
            fz3.worldObj.f(a2.pos, a2.J());
            fz2.worldObj.f(a2.pos.down(), a2.J());
        }
    }

    public void J(int n2, int n3) {
        int c2 = n3;
        Fz fz2 = this;
    }

    public int J(int n2) {
        int b2 = n2;
        Fz a2 = this;
        return uSa.E;
    }

    public void f(Waa waa2) {
        Fz a2;
        Fz b2 = waa2;
        Fz fz2 = a2 = this;
        super.f((Waa)b2);
        waa waa3 = b2.J(rua.la, NTa.C);
        fz2.L = new Mda[fz2.f()];
        if (b2.J(cRa.k, Yqa.i)) {
            a2.m = b2.J(cRa.k);
        }
        int n2 = b2 = uSa.E;
        while (n2 < waa3.J()) {
            Waa waa4 = waa3.J(b2);
            int n3 = waa4.J(kua.E) & osa.Ja;
            if (n3 >= 0 && n3 < a2.L.length) {
                a2.L[n3] = Mda.J((Waa)waa4);
            }
            n2 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void J(Fz fz2, DZ dZ) {
        void a2;
        Fz c2 = fz2;
        Fz b2 = this;
        if (c2.d()) {
            b2.C = uSa.E;
            return;
        }
        if (!b2.C) return;
        switch (bZ.I[a2.ordinal()]) {
            case 1: {
                if (b2.i == c2) return;
                b2.C = uSa.E;
                return;
            }
            case 2: {
                if (b2.A == c2) return;
                b2.C = uSa.E;
                return;
            }
            case 3: {
                if (b2.j == c2) return;
                b2.C = uSa.E;
                return;
            }
            case 4: {
                if (b2.M == c2) return;
                b2.C = uSa.E;
                return;
            }
        }
    }

    public int l() {
        return ysa.s;
    }

    public void l() {
        int a2;
        Fz fz2 = this;
        int n2 = a2 = uSa.E;
        while (n2 < fz2.L.length) {
            fz2.L[a2++] = null;
            n2 = a2;
        }
    }

    public String J() {
        Fz a2;
        if (a2.J()) {
            return a2.m;
        }
        return Zua.t;
    }

    public int f() {
        return Lra.e;
    }

    public boolean J(Sx sx) {
        Fz a2;
        Object b2 = sx;
        Fz fz2 = a2 = this;
        if (fz2.worldObj.J(fz2.pos) != a2) {
            return uSa.E != 0;
        }
        if (b2.f((double)a2.pos.getX() + kTa.B, (double)a2.pos.getY() + kTa.B, (double)a2.pos.getZ() + kTa.B) <= ypa.X) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Fz(int n2) {
        int b2 = n2;
        Fz a2 = this;
        a2.L = new Mda[Lra.e];
        a2.E = b2;
    }

    public Fz() {
        Fz a2;
        a2.L = new Mda[Lra.e];
        a2.E = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public Fz J(DZ dZ) {
        void a2;
        Fz fz2;
        Fz fz3 = fz2 = this;
        Object b2 = fz3.pos.offset((DZ)a2);
        if (fz3.J((XF)((Object)b2)) && (b2 = fz2.worldObj.J((XF)((Object)b2))) instanceof Fz) {
            Fz fz4 = b2;
            fz4.J(fz2, a2.getOpposite());
            return fz4;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        int b2;
        void a2;
        Fz fz2 = this;
        super.J((Waa)a2);
        waa waa3 = new waa();
        int n2 = b2 = uSa.E;
        while (n2 < fz2.L.length) {
            if (fz2.L[b2] != null) {
                Waa waa4 = new Waa();
                waa4.J(kua.E, (byte)b2);
                fz2.L[b2].J(waa4);
                waa3.J((NCa)waa4);
            }
            n2 = ++b2;
        }
        a2.J(rua.la, (NCa)waa3);
        if (fz2.J()) {
            a2.J(cRa.k, fz2.m);
        }
    }

    public boolean J(int n2, Mda mda2) {
        Fz c2 = mda2;
        Fz a2 = this;
        return vRa.d != 0;
    }

    public void e() {
        Fz a2;
        super.e();
        a2.C = uSa.E;
    }

    public Mda J(int n2) {
        int b2 = n2;
        Fz a2 = this;
        return a2.L[b2];
    }

    /*
     * WARNING - void declaration
     */
    public Ega J(kea kea2, Sx sx) {
        void b2;
        Object c2 = sx;
        Fz a2 = this;
        return new Qea((HA)b2, (HA)a2, (Sx)((Object)c2));
    }

    public String f() {
        return kPa.Ja;
    }

    public void J() {
        Fz fz2;
        Fz fz3 = fz2 = this;
        fz3.M();
        int n2 = fz3.pos.getX();
        int n3 = fz3.pos.getY();
        int n4 = fz3.pos.getZ();
        fz3.k += vRa.d;
        if (!fz3.worldObj.e && fz2.I != 0 && (fz2.k + n2 + n3 + n4) % ZOa.x == 0) {
            fz2.I = uSa.E;
            float a2 = eua.C;
            for (Sx sx : fz2.worldObj.J(Sx.class, new xy((double)((float)n2 - a2), (double)((float)n3 - a2), (double)((float)n4 - a2), (double)((float)(n2 + vRa.d) + a2), (double)((float)(n3 + vRa.d) + a2), (double)((float)(n4 + vRa.d) + a2)))) {
                HA hA2;
                if (!(sx.G instanceof Qea) || (hA2 = ((Qea)sx.G).J()) != fz2 && (!(hA2 instanceof jEa) || !((jEa)hA2).J((HA)fz2))) continue;
                fz2.I += vRa.d;
            }
        }
        Fz fz4 = fz2;
        fz4.g = fz4.J;
        float a2 = Nra.e;
        if (fz4.I > 0 && fz2.J == JPa.N && fz2.i == null && fz2.M == null) {
            double d2 = (double)n2 + kTa.B;
            double d3 = (double)n4 + kTa.B;
            if (fz2.A != null) {
                d3 += kTa.B;
            }
            if (fz2.j != null) {
                d2 += kTa.B;
            }
            fz2.worldObj.J(d2, (double)n3 + kTa.B, d3, Bpa.n, MQa.L, fz2.worldObj.v.nextFloat() * Nra.e + ATa.r);
        }
        if (fz2.I == 0 && fz2.J > JPa.N || fz2.I > 0 && fz2.J < pqa.r) {
            float f2;
            Fz fz5;
            Fz fz6 = fz2;
            float f3 = fz6.J;
            if (fz6.I > 0) {
                Fz fz7 = fz2;
                fz5 = fz7;
                fz7.J += a2;
            } else {
                Fz fz8 = fz2;
                fz5 = fz8;
                fz8.J -= a2;
            }
            if (fz5.J > pqa.r) {
                fz2.J = pqa.r;
            }
            if (fz2.J < (f2 = MQa.L) && f3 >= f2 && fz2.i == null && fz2.M == null) {
                double d4 = (double)n2 + kTa.B;
                double d5 = (double)n4 + kTa.B;
                if (fz2.A != null) {
                    d5 += kTa.B;
                }
                if (fz2.j != null) {
                    d4 += kTa.B;
                }
                fz2.worldObj.J(d4, (double)n3 + kTa.B, d5, Ura.P, MQa.L, fz2.worldObj.v.nextFloat() * Nra.e + ATa.r);
            }
            if (fz2.J < JPa.N) {
                fz2.J = JPa.N;
            }
        }
    }

    public void d() {
        Fz a2;
        Fz fz2 = a2;
        super.d();
        fz2.e();
        fz2.M();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Fz a2 = this;
        if (b2 == vRa.d) {
            a2.I = c2;
            return vRa.d != 0;
        }
        return super.J((int)b2, c2);
    }

    public int J() {
        return uSa.E;
    }

    public int d() {
        Fz a2;
        if (a2.E == pua.o) {
            if (a2.worldObj == null || !(a2.J() instanceof BlockChest)) {
                return uSa.E;
            }
            a2.E = ((BlockChest)a2.J()).chestType;
        }
        return a2.E;
    }
}

