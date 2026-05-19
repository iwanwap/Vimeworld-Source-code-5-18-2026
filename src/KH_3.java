/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KH
 *  Lz
 *  aSa
 *  fI
 *  gi
 *  vRa
 *  yra
 */
import java.util.function.ToDoubleFunction;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KH_3 {
    public static final ToDoubleFunction<KH> M = fI.J();
    public final double k;
    public final double j;
    public final double J;
    public static final ToDoubleFunction<KH> A;
    public static final ToDoubleFunction<KH> I;

    public static /* synthetic */ double C(KH a2) {
        return a2.J;
    }

    public String toString() {
        KH_3 a2;
        return new StringBuilder().insert(5 >> 3, PRa.u).append(a2.j).append(yra.t).append(a2.J).append(yra.t).append(a2.k).append(XOa.D).toString();
    }

    static {
        I = gi.J();
        A = pi.J();
    }

    public KH C(double c2, double b2, double a2) {
        KH_3 d2;
        return new KH_3(d2.j - c2, d2.J - b2, d2.k - a2);
    }

    public KH l(double c2, double b2, double a2) {
        KH_3 d2;
        return new KH_3(d2.j + c2, d2.J + b2, d2.k + a2);
    }

    public boolean equals(Object object) {
        Object b2 = object;
        KH_3 a2 = this;
        if (b2 instanceof KH_3) {
            b2 = (KH_3)b2;
            if (((KH_3)b2).j == a2.j && ((KH_3)b2).J == a2.J && ((KH_3)b2).k == a2.k) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public KH clone() {
        KH_3 a2;
        return new KH_3(a2.j, a2.J, a2.k);
    }

    public KH M(double a2) {
        KH_3 b2;
        return new KH_3(a2, b2.J, b2.k);
    }

    public KH d(KH kH2) {
        KH_3 b2 = kH2;
        KH_3 a2 = this;
        return new KH_3(a2.j + b2.j, a2.J + b2.J, a2.k + b2.k);
    }

    public double f() {
        KH_3 a2;
        return Math.sqrt(a2.j * a2.j + a2.J * a2.J + a2.k * a2.k);
    }

    public KH C(KH kH2) {
        KH_3 b2 = kH2;
        KH_3 a2 = this;
        return new KH_3(a2.j / b2.j, a2.J / b2.J, a2.k / b2.k);
    }

    public KH e(double a2) {
        KH_3 b2;
        return new KH_3(b2.j / a2, b2.J / a2, b2.k / a2);
    }

    public KH d(double a2) {
        KH_3 b2;
        return new KH_3(b2.j + a2, b2.J + a2, b2.k + a2);
    }

    public KH l() {
        KH_3 a2;
        return new KH_3(Math.abs(a2.j), Math.abs(a2.J), Math.abs(a2.k));
    }

    public KH f(double c2, double b2, double a2) {
        KH_3 d2;
        return new KH_3(d2.j * c2, d2.J * b2, d2.k * a2);
    }

    public KH_3() {
        a2(aSa.V, aSa.V, aSa.V);
        KH_3 a2;
    }

    public KH l(KH kH2) {
        KH_3 b2 = kH2;
        KH_3 a2 = this;
        return new KH_3(a2.j * b2.j, a2.J * b2.J, a2.k * b2.k);
    }

    public int hashCode() {
        KH_3 kH_3;
        KH_3 kH_32 = kH_3 = this;
        long l2 = Double.doubleToLongBits(kH_32.j);
        int a2 = (int)(l2 ^ l2 >>> fPa.i);
        long l3 = l2 = Double.doubleToLongBits(kH_32.J);
        a2 = tua.U * a2 + (int)(l3 ^ l3 >>> fPa.i);
        long l4 = l2 = Double.doubleToLongBits(kH_32.k);
        a2 = tua.U * a2 + (int)(l4 ^ l4 >>> fPa.i);
        return a2;
    }

    public KH_3(double c2, double b2, double a2) {
        KH_3 d2;
        KH_3 kH_3 = d2;
        d2.j = c2;
        kH_3.J = b2;
        kH_3.k = a2;
    }

    public double J() {
        KH_3 a2;
        return a2.j * a2.j + a2.J * a2.J + a2.k * a2.k;
    }

    public KH_3(Lz lz2) {
        KH_3 b2 = lz2;
        KH_3 a2 = this;
        a2(((Lz)b2).A, ((Lz)b2).j, ((Lz)b2).J);
    }

    public KH C(double a2) {
        KH_3 b2;
        return new KH_3(b2.j * a2, b2.J * a2, b2.k * a2);
    }

    public KH f() {
        KH_3 a2;
        KH_3 kH_3 = a2;
        return kH_3.e(kH_3.f());
    }

    public KH l(double a2) {
        KH_3 b2;
        return new KH_3(b2.j, b2.J, a2);
    }

    public KH f(KH kH2) {
        KH_3 b2 = kH2;
        KH_3 a2 = this;
        return new KH_3(a2.j - b2.j, a2.J - b2.J, a2.k - b2.k);
    }

    public KH f(double a2) {
        KH_3 b2;
        return new KH_3(b2.j, a2, b2.k);
    }

    public static /* synthetic */ double l(KH a2) {
        return a2.k;
    }

    public static /* synthetic */ double f(KH a2) {
        return a2.j;
    }

    public KH J(double a2) {
        KH_3 b2;
        return new KH_3(b2.j - a2, b2.J - a2, b2.k - a2);
    }

    public double J(KH kH2) {
        KH_3 b2 = kH2;
        KH_3 a2 = this;
        return a2.j * b2.j + a2.J * b2.J + a2.k * b2.k;
    }

    public KH J(KH kH2) {
        KH_3 b2 = kH2;
        KH_3 a2 = this;
        return new KH_3(a2.J * b2.k - a2.k * b2.J, a2.k * b2.j - a2.j * b2.k, a2.j * b2.J - a2.J * b2.j);
    }

    public KH J() {
        KH_3 a2;
        return new KH_3(-a2.j, -a2.J, -a2.k);
    }

    public KH J(double c2, double b2, double a2) {
        KH_3 d2;
        return new KH_3(d2.j / c2, d2.J / b2, d2.k / a2);
    }
}

