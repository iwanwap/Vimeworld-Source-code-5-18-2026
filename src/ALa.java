/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AA
 *  Vla
 *  eb
 *  xy
 */
public final class ALa
implements eb {
    private double j;
    private double J;
    private AA A;
    private double I;

    public ALa(AA aA2) {
        ALa b2 = aA2;
        ALa a2 = this;
        a2.A = b2;
    }

    public void J(double c2, double b2, double a2) {
        ALa d2;
        ALa aLa = d2;
        d2.j = c2;
        aLa.I = b2;
        aLa.J = a2;
    }

    public boolean J(xy xy2) {
        ALa b2 = xy2;
        ALa a2 = this;
        return a2.J(((xy)b2).J, ((xy)b2).j, ((xy)b2).I, ((xy)b2).A, ((xy)b2).M, ((xy)b2).k);
    }

    public ALa() {
        a2(Vla.J());
        ALa a2;
    }

    public boolean J(double f2, double e2, double d2, double c2, double b2, double a2) {
        ALa g;
        return g.A.J(f2 - g.j, e2 - g.I, d2 - g.J, c2 - g.j, b2 - g.I, a2 - g.J);
    }
}

