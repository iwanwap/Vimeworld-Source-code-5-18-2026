/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  NQa
 *  Oz
 *  Wsa
 *  dQa
 *  pqa
 *  uKa
 *  vRa
 */
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class jI
implements L {
    public final UUID J;
    private static long A = nqa.i;
    public final String I;

    @Override
    public UUID J() {
        jI a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    public jI(String string, UUID uUID) {
        void a2;
        Object c2 = string;
        jI b2 = this;
        if (c2 == null) {
            long l2 = A;
            A = l2 + dQa.Ga;
            c2 = new StringBuilder().insert(2 & 5, oQa.U).append(l2).toString();
        }
        b2.I = c2;
        b2.J = a2;
    }

    public static int l(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        return (a2 & Wsa.K) + (b2 << osa.c);
    }

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, float f2) {
        void a2;
        int n3 = n2;
        float f3 = (float)(n3 >> osa.c & osa.Ja) / NQa.Y;
        float f4 = (float)(n3 >> ERa.C & osa.Ja) / NQa.Y;
        float f5 = (float)(n3 >> Yqa.i & osa.Ja) / NQa.Y;
        float b2 = (float)(n3 & osa.Ja) / NQa.Y;
        f3 = Oz.J((float)(f3 * a2), (float)JPa.N, (float)pqa.r);
        f4 = Oz.J((float)(f4 * a2), (float)JPa.N, (float)pqa.r);
        f5 = Oz.J((float)(f5 * a2), (float)JPa.N, (float)pqa.r);
        b2 = Oz.J((float)(b2 * a2), (float)JPa.N, (float)pqa.r);
        return ((int)(f3 * NQa.Y) << osa.c) + ((int)(f4 * NQa.Y) << ERa.C) + ((int)(f5 * NQa.Y) << Yqa.i) + (int)(b2 * NQa.Y);
    }

    public int hashCode() {
        jI a2;
        return a2.I.hashCode();
    }

    public static int J(int a2) {
        return a2 >> osa.c & osa.Ja;
    }

    public static void J(int n2) {
        int n3 = n2;
        float f2 = (float)(n3 >> osa.c & osa.Ja) / NQa.Y;
        float f3 = (float)(n3 >> ERa.C & osa.Ja) / NQa.Y;
        float f4 = (float)(n3 >> Yqa.i & osa.Ja) / NQa.Y;
        float a2 = (float)(n3 & osa.Ja) / NQa.Y;
        uKa.f((float)f3, (float)f4, (float)a2, (float)f2);
    }

    /*
     * WARNING - void declaration
     */
    public static int f(int n2, int n3) {
        void a2;
        int n4 = n2;
        int n5 = n4 >> ERa.C & osa.Ja;
        int n6 = n4 >> Yqa.i & osa.Ja;
        int b2 = n4 & osa.Ja;
        n5 = Math.min(osa.Ja, n5 + a2);
        n6 = Math.min(osa.Ja, n6 + a2);
        b2 = Math.min(osa.Ja, b2 + a2);
        return (n4 & gsa.X) + (n5 << ERa.C) + (n6 << Yqa.i) + b2;
    }

    public void f() {
    }

    public boolean J(long a2) {
        return vRa.d != 0;
    }

    public abstract void J(long var1);

    public static int J(int n2, int n3) {
        int b22 = n3;
        int a2 = n2;
        float f2 = (float)(a2 >> osa.c & osa.Ja) / NQa.Y;
        float f3 = (float)(a2 >> ERa.C & osa.Ja) / NQa.Y;
        float f4 = (float)(a2 >> Yqa.i & osa.Ja) / NQa.Y;
        float f5 = (float)(a2 & osa.Ja) / NQa.Y;
        float f6 = (float)(b22 >> osa.c & osa.Ja) / NQa.Y;
        float f7 = (float)(b22 >> ERa.C & osa.Ja) / NQa.Y;
        float f8 = (float)(b22 >> Yqa.i & osa.Ja) / NQa.Y;
        float b22 = (float)(b22 & osa.Ja) / NQa.Y;
        f2 = Oz.J((float)(f2 * f6), (float)JPa.N, (float)pqa.r);
        f3 = Oz.J((float)(f3 * f7), (float)JPa.N, (float)pqa.r);
        f4 = Oz.J((float)(f4 * f8), (float)JPa.N, (float)pqa.r);
        f5 = Oz.J((float)(f5 * b22), (float)JPa.N, (float)pqa.r);
        return ((int)(f2 * NQa.Y) << osa.c) + ((int)(f3 * NQa.Y) << ERa.C) + ((int)(f4 * NQa.Y) << Yqa.i) + (int)(f5 * NQa.Y);
    }

    public void J() {
    }
}

