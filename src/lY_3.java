/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Jy
 *  My
 *  Ypa
 *  hra
 */
public final class lY_3 {
    public Jy[] M;
    public float[] k;
    public int j;
    public long J;
    public final /* synthetic */ My A;
    public int I;

    /*
     * WARNING - void declaration
     */
    public lY_3(My my, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        lY_3 a2 = this;
        a2.A = c2;
        a2.k = new float[hra.Ja];
        a2.M = new Jy[hra.Ja];
        lY_3 lY_32 = a2;
        lY_32.j = b2;
        lY_32.I = d2;
        My.J((My)c2).J(a2.k, (int)(b2 << AQa.P), d2 << AQa.P, ERa.C, ERa.C);
        My.J((My)c2).J(a2.M, (int)(b2 << AQa.P), d2 << AQa.P, ERa.C, ERa.C, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public Jy J(int n2, int n3) {
        void b2;
        int c2 = n3;
        lY_3 a2 = this;
        return a2.M[b2 & Ypa.A | (c2 & Ypa.A) << AQa.P];
    }
}

