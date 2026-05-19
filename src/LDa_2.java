/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HA
 *  Mda
 *  QFa
 *  aX
 *  bAa
 *  eAa
 *  vCa
 *  vRa
 *  wda
 */
import net.minecraft.block.Block;

public final class LDa_2
extends sEa {
    private final Sx j;
    private int J;
    private final xFa I;

    @Override
    public boolean J(Mda mda2) {
        LDa_2 b2 = mda2;
        LDa_2 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public LDa_2(Sx sx2, xFa xFa2, HA hA2, int n2, int n3, int n4) {
        void e2;
        void f2;
        void g2;
        void b2;
        void c2;
        void d2;
        LDa_2 a2;
        int n5 = n4;
        LDa_2 lDa_2 = a2 = this;
        super((HA)d2, (int)c2, (int)b2, (int)g2);
        lDa_2.j = f2;
        lDa_2.I = e2;
    }

    @Override
    public Mda J(int n2) {
        int b2 = n2;
        LDa_2 a2 = this;
        if (a2.J()) {
            a2.J += Math.min(b2, a2.J().E);
        }
        return super.J(b2);
    }

    @Override
    public void J(Sx sx2, Mda mda2) {
        Mda[] b2;
        LDa_2 c2 = mda2;
        LDa_2 a2 = this;
        a2.f((Mda)c2);
        b2 = bAa.J().J(a2.I, (Gg)b2.j);
        int n2 = c2 = uSa.E;
        while (n2 < b2.length) {
            Mda mda3 = a2.I.J(c2);
            Mda mda4 = b2[c2];
            if (mda3 != null) {
                a2.I.J(c2, vRa.d);
            }
            if (mda4 != null) {
                if (a2.I.J(c2) == null) {
                    a2.I.J(c2, mda4);
                } else if (!a2.j.K.f(mda4)) {
                    a2.j.J(mda4, uSa.E != 0);
                }
            }
            n2 = ++c2;
        }
    }

    @Override
    public void f(Mda mda2) {
        LDa_2 b2 = mda2;
        LDa_2 a2 = this;
        if (a2.J > 0) {
            LDa_2 lDa_2 = a2;
            b2.J((Gg)a2.j.j, lDa_2.j, lDa_2.J);
        }
        a2.J = uSa.E;
        if (b2.J() == eAa.J((Block)QFa.IE)) {
            a2.j.J((aX)mY.b);
        }
        if (b2.J() instanceof vCa) {
            a2.j.J((aX)mY.B);
        }
        if (b2.J() == eAa.J((Block)QFa.Xb)) {
            a2.j.J((aX)mY.n);
        }
        if (b2.J() instanceof Hea) {
            a2.j.J((aX)mY.i);
        }
        if (b2.J() == Gea.Ra) {
            a2.j.J((aX)mY.w);
        }
        if (b2.J() == Gea.Da) {
            a2.j.J((aX)mY.R);
        }
        if (b2.J() instanceof vCa && ((vCa)b2.J()).J() != wda.WOOD) {
            a2.j.J((aX)mY.g);
        }
        if (b2.J() instanceof xCa) {
            a2.j.J((aX)mY.a);
        }
        if (b2.J() == eAa.J((Block)QFa.rC)) {
            a2.j.J((aX)mY.C);
        }
        if (b2.J() == eAa.J((Block)QFa.gA)) {
            a2.j.J((aX)mY.F);
        }
        if (b2.J() == Gea.pb && b2.J() == vRa.d) {
            a2.j.J((aX)mY.T);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Mda mda2, int n2) {
        void b2;
        LDa_2 a2;
        int c2 = n2;
        LDa_2 lDa_2 = a2 = this;
        lDa_2.J += c2;
        lDa_2.f((Mda)b2);
    }
}

