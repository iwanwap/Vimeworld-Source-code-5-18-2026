/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  NTa
 *  Qqa
 *  cQa
 *  lqa
 *  vRa
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Ob_1
implements Iterator<XF> {
    private double F;
    private double g;
    private double L;
    private boolean E;
    private int m;
    private double C;
    private double i;
    private int M;
    private double k;
    private double j;
    private Cf J;
    private double A;
    private int I;

    @Override
    public boolean hasNext() {
        Ob_1 a2;
        return a2.E;
    }

    private void J() {
        Ob_1 a2;
        Ob_1 ob_1 = a2;
        ob_1.C += oua.i;
        if (ob_1.C >= a2.A) {
            Ob_1 ob_12 = a2;
            ob_12.C = ob_12.F;
            ob_12.j += oua.i;
            if (ob_12.j >= a2.L) {
                Ob_1 ob_13 = a2;
                ob_13.j = ob_13.k;
                ob_13.k += a2.g;
                ob_13.L += a2.g;
                ob_13.j = ob_13.k;
                ob_13.F += a2.i;
                ob_13.A += a2.i;
                ob_13.C = ob_13.F;
                ob_13.M += vRa.d;
                if (ob_13.M >= a2.m) {
                    // empty if block
                }
            }
        }
    }

    public XF J() {
        Ob_1 a2;
        if (!a2.E) {
            throw new NoSuchElementException();
        }
        Ob_1 ob_1 = a2;
        Ob_1 ob_12 = a2;
        ob_1.J.setXyz((double)ob_12.M, a2.j, a2.C);
        ob_1.J();
        ob_1.E = ob_12.M < a2.m && a2.j < a2.L && a2.C < a2.A ? vRa.d : uSa.E;
        return a2.J;
    }

    @Override
    public void remove() {
        throw new RuntimeException(ppa.Z);
    }

    public static void main(String[] stringArray) throws Exception {
        String[] stringArray2 = stringArray;
        Object a2 = new XF(rQa.p, NTa.C, kTa.j);
        XF xF2 = new XF(uqa.g, lqa.s, cQa.o);
        double d2 = KPa.I;
        double d3 = kTa.B;
        Ob_1 ob_1 = new Ob_1((XF)((Object)a2), xF2, d2, d3);
        System.out.println(new StringBuilder().insert(3 ^ 3, Qqa.Ha).append(a2).append(rQa.b).append((Object)xF2).append(NTa.N).append(d2).append(sSa.B).append(d3).toString());
        Ob_1 ob_12 = ob_1;
        while (ob_12.hasNext()) {
            Ob_1 ob_13 = ob_1;
            ob_12 = ob_13;
            a2 = ob_13.J();
            System.out.println(new StringBuilder().insert(3 & 4, Mqa.y).append(a2).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public Ob_1(XF xF2, XF xF3, double d2, double d3) {
        void d4;
        void a2;
        void b2;
        Ob_1 c2;
        Object e2 = xF3;
        Ob_1 ob_1 = c2 = this;
        Ob_1 ob_12 = c2;
        Ob_1 ob_13 = c2;
        Ob_1 ob_14 = c2;
        Ob_1 ob_15 = c2;
        c2.J = new Cf(uSa.E, uSa.E, uSa.E);
        ob_15.E = uSa.E;
        ob_14.g = b2;
        ob_14.i = a2;
        ob_13.I = d4.getX();
        ob_13.m = e2.getX();
        ob_12.k = d4.getY();
        ob_12.L = (double)e2.getY() - kTa.B;
        c2.F = d4.getZ();
        ob_1.A = (double)e2.getZ() - kTa.B;
        ob_1.M = c2.I;
        ob_1.j = ob_1.k;
        ob_1.C = ob_1.F;
        ob_1.E = ob_1.M < c2.m && c2.j < c2.L && c2.C < c2.A ? vRa.d : uSa.E;
    }
}

