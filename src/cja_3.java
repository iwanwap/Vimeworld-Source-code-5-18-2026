/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KKa
 *  Qja
 *  cja
 *  ez
 *  pka
 *  uY
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cja_3 {
    private final boolean[] i = new boolean[ez.values().length];
    private final boolean[] M = new boolean[ez.values().length];
    private KKa k;
    private boolean j;
    public static final cja J = new pka();
    private final List<uY> A;
    private Qja I;

    public void J(Qja qja2) {
        cja_3 b2 = qja2;
        cja_3 a2 = this;
        a2.I = b2;
    }

    public boolean J() {
        cja_3 a2;
        return a2.j;
    }

    public void J(uY uY2) {
        cja_3 b2 = uY2;
        cja_3 a2 = this;
        a2.A.add((uY)b2);
    }

    public cja_3() {
        cja_3 a2;
        cja_3 cja_32 = a2;
        cja_32.j = vRa.d;
        cja_32.A = Lists.newArrayList();
        cja_3 cja_33 = a2;
        cja_33.k = new KKa();
    }

    public Qja J() {
        cja_3 a2;
        return a2.I;
    }

    public boolean f(ez ez2) {
        cja_3 b2 = ez2;
        cja_3 a2 = this;
        return a2.M[b2.ordinal()];
    }

    public void f(ez ez2) {
        cja_3 b2 = ez2;
        cja_3 a2 = this;
        a2.j = uSa.E;
        a2.i[b2.ordinal()] = vRa.d;
    }

    public void J(ez ez2) {
        cja_3 b2 = ez2;
        cja_3 a2 = this;
        a2.M[b2.ordinal()] = vRa.d;
    }

    public boolean J(ez ez2) {
        cja_3 b2 = ez2;
        cja_3 a2 = this;
        if (!a2.i[b2.ordinal()]) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public List<uY> J() {
        cja_3 a2;
        return a2.A;
    }

    public void J(KKa kKa2) {
        cja_3 b2 = kKa2;
        cja_3 a2 = this;
        a2.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(DZ dZ2, DZ dZ3) {
        void b2;
        Object c2 = dZ3;
        cja_3 a2 = this;
        return a2.k.J((DZ)b2, (DZ)((Object)c2));
    }
}

