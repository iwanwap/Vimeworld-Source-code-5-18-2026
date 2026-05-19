/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ica
 *  jba
 *  qca
 *  vRa
 *  yaa
 */
import java.util.Comparator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jba_1 {
    private final String i;
    private final qca M;
    private boolean k;
    public static final Comparator<jba> j = new yaa();
    private boolean J;
    private int A;
    private final ica I;

    public ica J() {
        jba_1 a2;
        return a2.I;
    }

    public void l(int n2) {
        int b2 = n2;
        jba_1 a2 = this;
        if (a2.I.J().J()) {
            throw new IllegalStateException(bsa.y);
        }
        jba_1 jba_12 = a2;
        jba_12.J(jba_12.J() - b2);
    }

    public String J() {
        jba_1 a2;
        return a2.i;
    }

    public int J() {
        jba_1 a2;
        return a2.A;
    }

    public qca J() {
        jba_1 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public jba_1(qca qca2, ica ica2, String string) {
        void b2;
        void c2;
        jba_1 a2;
        String d2 = string;
        jba_1 jba_12 = a2 = this;
        a2.M = c2;
        jba_12.I = b2;
        jba_12.i = d2;
        jba_12.J = vRa.d;
    }

    public void f(int n2) {
        int b2 = n2;
        jba_1 a2 = this;
        if (a2.I.J().J()) {
            throw new IllegalStateException(bsa.y);
        }
        jba_1 jba_12 = a2;
        jba_12.J(jba_12.J() + b2);
    }

    public void J(List<Sx> list) {
        jba_1 a2;
        List<Sx> b2 = list;
        jba_1 jba_12 = a2 = this;
        jba_12.J(jba_12.I.J().J(b2));
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        jba_1 a2 = this;
        a2.k = b2;
    }

    public boolean J() {
        jba_1 a2;
        return a2.k;
    }

    public void J() {
        jba_1 a2;
        if (a2.I.J().J()) {
            throw new IllegalStateException(bsa.y);
        }
        a2.f(vRa.d);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2) {
        void a2;
        jba_1 jba_12 = this;
        int b2 = jba_12.A;
        jba_12.A = a2;
        if (b2 != a2 || jba_12.J) {
            jba_12.J = uSa.E;
            jba_12.J().J((jba)jba_12);
        }
    }
}

