/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  bRa
 *  pua
 *  sLa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hKa {
    private final List<gC> i;
    private final List<Integer> M;
    private int k;
    private int j;
    private int[] J;
    private int A;
    private static final Logger I = LogManager.getLogger();

    public int d() {
        hKa a2;
        return a2.j;
    }

    public int f(int n2) {
        int b2 = n2;
        hKa a2 = this;
        return a2.J[b2];
    }

    public boolean l() {
        hKa a2;
        if (a2.A >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int C() {
        hKa a2;
        return a2.k;
    }

    public hKa J(gC gC2) {
        gC b2 = gC2;
        hKa a2 = this;
        if (b2.J() && a2.J()) {
            I.warn(bRa.g);
            return a2;
        }
        a2.i.add(b2);
        hKa hKa2 = a2;
        hKa2.M.add(hKa2.k);
        switch (sLa.I[b2.J().ordinal()]) {
            case 1: {
                hKa hKa3 = a2;
                while (false) {
                }
                hKa hKa4 = hKa3;
                hKa3.A = hKa3.k;
                break;
            }
            case 2: {
                hKa hKa5 = a2;
                hKa hKa4 = hKa5;
                hKa5.j = hKa5.k;
                break;
            }
            case 3: {
                a2.J[b2.l()] = a2.k;
            }
            default: {
                hKa hKa4 = a2;
            }
        }
        hKa4.k += b2.f();
        return a2;
    }

    public boolean f() {
        hKa a2;
        if (a2.j >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public hKa() {
        hKa a2;
        a2.i = Lists.newArrayList();
        a2.M = Lists.newArrayList();
        a2.k = uSa.E;
        a2.j = pua.o;
        int[] nArray = new int[uqa.g];
        nArray[uSa.E] = pua.o;
        nArray[vRa.d] = pua.o;
        a2.J = nArray;
        a2.A = pua.o;
    }

    public int l() {
        hKa a2;
        return a2.i.size();
    }

    public String toString() {
        int n2;
        hKa hKa2 = this;
        Object a2 = new StringBuilder().insert(5 >> 3, rQa.m).append(hKa2.i.size()).append(CRa.W).toString();
        int n3 = n2 = uSa.E;
        while (n3 < hKa2.i.size()) {
            a2 = new StringBuilder().insert(3 ^ 3, (String)a2).append(hKa2.i.get(n2).toString()).toString();
            if (n2 != hKa2.i.size() - vRa.d) {
                a2 = new StringBuilder().insert(3 ^ 3, (String)a2).append(Tpa.E).toString();
            }
            n3 = ++n2;
        }
        return a2;
    }

    private boolean J() {
        hKa hKa2 = this;
        int a2 = uSa.E;
        int n2 = hKa2.i.size();
        int n3 = a2;
        while (n3 < n2) {
            if (hKa2.i.get(a2).J()) {
                return vRa.d != 0;
            }
            n3 = ++a2;
        }
        return uSa.E != 0;
    }

    public gC J(int n2) {
        int b2 = n2;
        hKa a2 = this;
        return a2.i.get(b2);
    }

    public int f() {
        hKa a2;
        return a2.C() / AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    public hKa(hKa hKa2) {
        void a2;
        int b2;
        hKa hKa3 = this;
        hKa3();
        int n2 = b2 = uSa.E;
        while (n2 < a2.l()) {
            hKa3.J(a2.J(b2++));
            n2 = b2;
        }
        hKa3.k = a2.C();
    }

    public boolean J(int n2) {
        int b2 = n2;
        hKa a2 = this;
        if (a2.J[b2] >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<gC> J() {
        hKa a2;
        return a2.i;
    }

    public int J() {
        hKa a2;
        return a2.A;
    }

    public int hashCode() {
        hKa hKa2 = this;
        int a2 = hKa2.i.hashCode();
        a2 = tua.U * a2 + hKa2.M.hashCode();
        a2 = tua.U * a2 + hKa2.k;
        return a2;
    }

    public int J(int n2) {
        int b2 = n2;
        hKa a2 = this;
        return a2.M.get(b2);
    }

    public void J() {
        hKa a2;
        hKa hKa2 = a2;
        hKa2.i.clear();
        hKa2.M.clear();
        hKa2.j = pua.o;
        Arrays.fill(hKa2.J, pua.o);
        hKa2.A = pua.o;
        hKa2.k = uSa.E;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 != null && a2.getClass() == b2.getClass()) {
            b2 = (hKa)b2;
            if (((hKa)a2).k != ((hKa)b2).k) {
                return uSa.E != 0;
            }
            if (!((hKa)a2).i.equals(((hKa)b2).i)) {
                return uSa.E != 0;
            }
            return ((hKa)a2).M.equals(((hKa)b2).M);
        }
        return uSa.E != 0;
    }
}

