/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  I
 *  Oz
 *  aAa
 *  pqa
 *  vL
 */
public abstract class Ex {
    public int k;
    public I j;
    public int J;
    public OX<aAa> A;
    public int I;

    /*
     * WARNING - void declaration
     */
    public void J(I i2, vL vL2) {
        void b2;
        Ex a2;
        Ex c2 = vL2;
        Ex ex = a2 = this;
        Ex ex2 = c2;
        a2.j = b2;
        a2.A.J();
        a2.k = Oz.J((float)(((vL)ex2).F + pqa.r));
        ex.J = Oz.J((float)(((vL)ex2).u + pqa.r));
        ex.I = Oz.J((float)(((vL)c2).F + pqa.r));
    }

    /*
     * WARNING - void declaration
     */
    public aAa J(int n2, int n3, int n4) {
        void a2;
        void b2;
        void c2;
        Ex ex = this;
        int n5 = aAa.J((int)c2, (int)b2, (int)a2);
        Ex d2 = ex.A.J(n5);
        if (d2 == null) {
            d2 = new aAa((int)c2, (int)b2, (int)a2);
            ex.A.J(n5, (aAa)d2);
        }
        return d2;
    }

    public abstract aAa J(vL var1, double var2, double var4, double var6);

    public Ex() {
        Ex a2;
        Ex ex = a2;
        ex.A = new OX();
    }

    public void J() {
    }

    public abstract int J(aAa[] var1, vL var2, aAa var3, aAa var4, float var5);

    public abstract aAa J(vL var1);
}

