/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  Oz
 *  pqa
 *  vRa
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class EK_2 {
    public int M;
    public K k;
    public int j;
    public int J;
    public int A;
    public long I;

    public static int J(double d2, int n2, int n3) {
        double c2;
        int b2 = n3;
        int a2 = n2;
        return EK_2.J((float)c2, a2, b2);
    }

    public static int f(int n2, int n3) {
        int b322 = n3;
        int a2 = n2;
        float f2 = (float)(b322 >> osa.c & osa.Ja) / NQa.Y;
        float f3 = (float)(b322 >> ERa.C & osa.Ja) / NQa.Y;
        float f4 = (float)(b322 >> Yqa.i & osa.Ja) / NQa.Y;
        float b322 = (float)(b322 & osa.Ja) / NQa.Y;
        int n4 = (int)((float)(a2 >> osa.c & osa.Ja) * f2);
        int n5 = (int)((float)(a2 >> ERa.C & osa.Ja) * f3);
        int n6 = (int)((float)(a2 >> Yqa.i & osa.Ja) * f4);
        int b322 = (int)((float)(a2 & osa.Ja) * b322);
        return n4 << osa.c | n5 << ERa.C | n6 << Yqa.i | b322;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int J() {
        EK_2 eK_2;
        EK_2 eK_22 = this;
        if (eK_22.I != nqa.i) {
            int a2 = (int)(OT.e - eK_22.I);
            if (a2 < eK_22.j) {
                EK_2 eK_23 = eK_22;
                eK_2 = eK_23;
                eK_22.J = EK_2.J(eK_22.k.J((float)a2 / (float)eK_22.j), eK_23.M, eK_22.A);
                return eK_2.J;
            }
            eK_22.I = nqa.i;
            eK_22.J = eK_22.M;
        }
        eK_2 = eK_22;
        return eK_2.J;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, K k2, long l2) {
        void a2;
        void d2;
        void c2;
        EK_2 b2;
        K e2 = k2;
        EK_2 eK_2 = b2 = this;
        b2.j = c2;
        b2.k = e2;
        b2.M = d2;
        eK_2.A = b2.J;
        eK_2.I = a2;
    }

    public void J(int n2) {
        EK_2 a2;
        int b2 = n2;
        EK_2 eK_2 = a2;
        eK_2.I = nqa.i;
        eK_2.M = (a2 = this).J = b2;
        (a2 = this).A = (a2 = this).J;
    }

    public static boolean J(int a2) {
        if ((a2 >> osa.c & osa.Ja) != osa.Ja) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, K k2) {
        void b2;
        void c2;
        K d2 = k2;
        EK_2 a2 = this;
        a2.J((int)c2, (int)b2, d2, OT.e);
    }

    public static int J(int n2, int n3) {
        int b322 = n3;
        int a2 = n2;
        float f2 = (float)(b322 >> ERa.C & osa.Ja) / NQa.Y;
        float f3 = (float)(b322 >> Yqa.i & osa.Ja) / NQa.Y;
        float b322 = (float)(b322 & osa.Ja) / NQa.Y;
        int n4 = (int)((float)(a2 >> ERa.C & osa.Ja) * f2);
        int n5 = (int)((float)(a2 >> Yqa.i & osa.Ja) * f3);
        int b322 = (int)((float)(a2 & osa.Ja) * b322);
        return gsa.X | n4 << ERa.C | n5 << Yqa.i | b322;
    }

    public EK_2(int n2) {
        int b2 = n2;
        EK_2 a2 = this;
        a2.M = a2.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static int J(float f2, int n2, int n3) {
        void b2;
        int c2 = n3;
        float a2 = f2;
        a2 = Oz.J((float)a2, (float)JPa.N, (float)pqa.r);
        int n4 = c2 >> osa.c & osa.Ja;
        int n5 = c2 >> ERa.C & osa.Ja;
        int n6 = c2 >> Yqa.i & osa.Ja;
        c2 &= osa.Ja;
        n4 = (int)((float)n4 + (float)((b2 >> osa.c & osa.Ja) - n4) * a2);
        n5 = (int)((float)n5 + (float)((b2 >> ERa.C & osa.Ja) - n5) * a2);
        n6 = (int)((float)n6 + (float)((b2 >> Yqa.i & osa.Ja) - n6) * a2);
        c2 = (int)((float)c2 + (float)((b2 & osa.Ja) - c2) * a2);
        return n4 << osa.c | n5 << ERa.C | n6 << Yqa.i | c2;
    }
}

