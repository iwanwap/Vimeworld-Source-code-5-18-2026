/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  Cia
 *  Wc
 *  ac
 *  jRa
 *  pY
 *  pua
 *  qma
 *  vRa
 *  vpa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yMa
implements Wc {
    private final ac k;
    private final String j;
    private final mIa J;
    public final /* synthetic */ qma A;
    private final ac I;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ yMa(qma qma2, mIa mIa2, una una2) {
        void c2;
        mIa d2 = mIa2;
        yMa b2 = this;
        b2((qma)c2, d2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void e2;
        yMa d2;
        int g2 = n4;
        yMa yMa2 = d2 = this;
        if (yMa2.I.J(qma.J((qma)yMa2.A), (int)e2, g2)) {
            qma.J((qma)d2.A).M = d2.J;
            return vRa.d != 0;
        }
        yMa yMa3 = d2;
        if (yMa3.k.J(qma.J((qma)yMa3.A), (int)e2, g2)) {
            yMa yMa4 = d2;
            qma.J((qma)d2.A).z.J(yMa4.J, yMa4.J.getKeyCodeDefault());
            mIa.resetKeyBindingArrayAndHash();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(int n2, int n3, int n4) {
        int d2 = n4;
        yMa yMa2 = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        yMa yMa2;
        int n9;
        void b2;
        void c2;
        yMa g2;
        int i2;
        block6: {
            int d2;
            void f22;
            i2 = n3;
            g2 = this;
            int h2 = qma.J((qma)g2.A).M == g2.J ? vRa.d : uSa.E;
            qma.J((qma)g2.A).Ea.J(g2.j, i2 + Jsa.ha - qma.J((qma)g2.A), (int)(f22 + d2 / uqa.g - qma.J((qma)g2.A).Ea.u / uqa.g), pua.o);
            g2.k.m = i2 + Bpa.s;
            g2.k.I = f22;
            g2.k.J = g2.J.getKeyCode() != g2.J.getKeyCodeDefault() ? vRa.d : uSa.E;
            yMa yMa3 = g2;
            yMa3.k.J(qma.J((qma)g2.A), (int)c2, (int)b2);
            yMa3.I.m = i2 + xua.S;
            g2.I.I = f22;
            yMa3.I.i = Cia.J((int)g2.J.getKeyCode());
            i2 = uSa.E;
            if (yMa3.J.getKeyCode() != 0) {
                mIa[] f22 = qma.J((qma)g2.A).z.ja;
                int e2 = qma.J((qma)g2.A).z.ja.length;
                int n10 = d2 = uSa.E;
                while (n10 < e2) {
                    mIa a2 = f22[d2];
                    if (a2 != g2.J && a2.getKeyCode() == g2.J.getKeyCode()) {
                        i2 = vRa.d;
                        n9 = h2;
                        break block6;
                    }
                    n10 = ++d2;
                }
            }
            n9 = h2;
        }
        if (n9 != 0) {
            yMa yMa4 = g2;
            yMa2 = yMa4;
            g2.I.i = pY.WHITE + vTa.z + pY.YELLOW + yMa4.I.i + pY.WHITE + rpa.T;
        } else {
            if (i2 != 0) {
                g2.I.i = pY.RED + g2.I.i;
            }
            yMa2 = g2;
        }
        yMa2.I.J(qma.J((qma)g2.A), (int)c2, (int)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, int n5, int n6, int n7) {
        void e2;
        yMa d2;
        int g2 = n4;
        yMa yMa2 = d2 = this;
        yMa2.I.J((int)e2, g2);
        yMa2.k.J((int)e2, g2);
    }

    /*
     * WARNING - void declaration
     */
    private yMa(qma qma2, mIa mIa2) {
        void b2;
        yMa a2;
        mIa c2 = mIa2;
        yMa yMa2 = a2 = this;
        a2.A = b2;
        yMa2.J = c2;
        yMa2.j = oha.J(c2.getKeyDescription(), new Object[uSa.E]);
        yMa yMa3 = a2;
        yMa3.I = new ac(uSa.E, uSa.E, uSa.E, jRa.X, kTa.j, oha.J(c2.getKeyDescription(), new Object[uSa.E]));
        a2.k = new ac(uSa.E, uSa.E, uSa.E, vpa.o, kTa.j, oha.J(zOa.U, new Object[uSa.E]));
    }
}

