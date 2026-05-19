/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TPa
 *  Yaa
 *  bSa
 *  mca
 *  pY
 *  qca
 *  vRa
 *  xBa
 */
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class mca_3
extends Yaa {
    private xBa L;
    private final Set<String> E;
    private final qca m;
    private String C;
    private boolean i;
    private final String M;
    private xBa k;
    private String j;
    private String J;
    private pY A;
    private boolean I;

    public void f(boolean bl2) {
        boolean b2 = bl2;
        mca_3 a2 = this;
        a2.I = b2;
        a2.m.C((mca)a2);
    }

    public void J(pY pY2) {
        mca_3 b2 = pY2;
        mca_3 a2 = this;
        a2.A = b2;
    }

    public String J(String string) {
        Object b2 = string;
        mca_3 a2 = this;
        return new StringBuilder().insert(3 ^ 3, a2.l()).append((String)b2).append(a2.f()).toString();
    }

    public int J() {
        mca_3 mca_32 = this;
        int a2 = uSa.E;
        if (mca_32.f()) {
            a2 |= vRa.d;
        }
        if (mca_32.J()) {
            a2 |= uqa.g;
        }
        return a2;
    }

    public Collection<String> J() {
        mca_3 a2;
        return a2.E;
    }

    public void f(xBa xBa2) {
        mca_3 b2 = xBa2;
        mca_3 a2 = this;
        a2.k = b2;
        a2.m.C((mca)a2);
    }

    public String C() {
        mca_3 a2;
        return a2.C;
    }

    public void J(xBa xBa2) {
        mca_3 b2 = xBa2;
        mca_3 a2 = this;
        a2.L = b2;
        a2.m.C((mca)a2);
    }

    public void l(String string) {
        Object b2 = string;
        mca_3 a2 = this;
        if (b2 == null) {
            throw new IllegalArgumentException(bSa.k);
        }
        a2.J = b2;
        a2.m.C((mca)a2);
    }

    public void f(String string) {
        Object b2 = string;
        mca_3 a2 = this;
        if (b2 == null) {
            throw new IllegalArgumentException(TPa.x);
        }
        a2.C = b2;
        a2.m.C((mca)a2);
    }

    public void J(int n2) {
        int b2 = n2;
        mca_3 a2 = this;
        a2.J(((b2 & vRa.d) > 0 ? vRa.d : uSa.E) != 0);
        a2.f(((b2 & uqa.g) > 0 ? vRa.d : uSa.E) != 0);
    }

    public static String J(Yaa yaa2, String string) {
        Object b2 = string;
        Yaa a2 = yaa2;
        if (a2 == null) {
            return b2;
        }
        return a2.J((String)b2);
    }

    public xBa J() {
        mca_3 a2;
        return a2.L;
    }

    /*
     * WARNING - void declaration
     */
    public mca_3(qca qca2, String string) {
        void b2;
        mca_3 a2;
        Object c2 = string;
        mca_3 mca_32 = a2 = this;
        mca_3 mca_33 = a2;
        a2.E = Sets.newHashSet();
        a2.J = Mqa.y;
        a2.j = Mqa.y;
        a2.i = vRa.d;
        a2.I = vRa.d;
        a2.L = xBa.ALWAYS;
        mca_33.k = xBa.ALWAYS;
        mca_33.A = pY.RESET;
        mca_33.m = b2;
        mca_32.M = c2;
        mca_32.C = c2;
    }

    public boolean J() {
        mca_3 a2;
        return a2.I;
    }

    public xBa f() {
        mca_3 a2;
        return a2.k;
    }

    public String J() {
        mca_3 a2;
        return a2.M;
    }

    public pY J() {
        mca_3 a2;
        return a2.A;
    }

    public String l() {
        mca_3 a2;
        return a2.J;
    }

    public boolean f() {
        mca_3 a2;
        return a2.i;
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        mca_3 a2 = this;
        a2.i = b2;
        a2.m.C((mca)a2);
    }

    public void J(String string) {
        Object b2 = string;
        mca_3 a2 = this;
        a2.j = b2;
        a2.m.C((mca)a2);
    }

    public String f() {
        mca_3 a2;
        return a2.j;
    }
}

